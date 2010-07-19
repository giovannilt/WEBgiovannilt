package giovanniltId.client.components;


import com.extjs.gxt.ui.client.Style.LayoutRegion;
import com.extjs.gxt.ui.client.Style.Scroll;
import com.extjs.gxt.ui.client.data.*;
import com.extjs.gxt.ui.client.dnd.DND.Feedback;
import com.extjs.gxt.ui.client.dnd.DND.Operation;
import com.extjs.gxt.ui.client.dnd.ListViewDragSource;
import com.extjs.gxt.ui.client.dnd.TreePanelDropTarget;
import com.extjs.gxt.ui.client.event.*;
import com.extjs.gxt.ui.client.store.ListStore;
import com.extjs.gxt.ui.client.store.TreeStore;
import com.extjs.gxt.ui.client.util.Format;
import com.extjs.gxt.ui.client.util.IconHelper;
import com.extjs.gxt.ui.client.util.Margins;
import com.extjs.gxt.ui.client.widget.*;
import com.extjs.gxt.ui.client.widget.button.Button;
import com.extjs.gxt.ui.client.widget.layout.BorderLayout;
import com.extjs.gxt.ui.client.widget.layout.BorderLayoutData;
import com.extjs.gxt.ui.client.widget.toolbar.ToolBar;
import com.extjs.gxt.ui.client.widget.treepanel.TreePanel;
import com.extjs.gxt.ui.client.widget.treepanel.TreePanel.TreeNode;
import com.google.gwt.core.client.GWT;
import com.google.gwt.i18n.client.DateTimeFormat;
import com.google.gwt.i18n.client.NumberFormat;
import com.google.gwt.user.client.Element;
import com.google.gwt.user.client.rpc.AsyncCallback;
import com.google.gwt.user.client.rpc.ServiceDefTarget;

import java.util.List;


/**
 * Created by IntelliJ IDEA.
 * User: giovannilt
 * Date: Jul 19, 2010
 * Time: 11:08:19 PM
 * To change this template use File | Settings | File Templates.
 */
public class ImageOrganizer extends LayoutContainer {


  private TreePanel<ModelData> tree;

  @Override
  protected void onRender(Element parent, int index) {
    super.onRender(parent, index);

    LayoutContainer container = new LayoutContainer();
    container.setStyleAttribute("margin", "20px");
    container.setSize(650, 300);
    container.setBorders(true);
    container.setLayout(new BorderLayout());

    ContentPanel west = new ContentPanel();
    west.setHeading("My Albums");

    ToolBar toolBar = new ToolBar();
    Button newAlbum = new Button("New Album");
   // newAlbum.setIcon(Resources.ICONS.album());
    newAlbum.addSelectionListener(new SelectionListener<ButtonEvent>() {
      @Override
      public void componentSelected(ButtonEvent ce) {
        MessageBox.prompt("New Album", "Enter the new album name:",
            new Listener<MessageBoxEvent>() {
              public void handleEvent(MessageBoxEvent be) {
                if (be.getButtonClicked().getItemId().equals(Dialog.OK)
                    && be.getValue() != null) {
                  tree.getStore().add(createAlbum(be.getValue()), false);
                  tree.setLeaf(tree.getStore().getRootItems().get(
                      tree.getStore().getRootItems().size() - 1), false);
                }
              }
            });
      }
    });
    toolBar.add(newAlbum);
    west.setTopComponent(toolBar);

    TreeStore<ModelData> treeStore = new TreeStore<ModelData>();

    tree = new TreePanel<ModelData>(treeStore);
    tree.setDisplayProperty("name");

    tree.getStyle().setLeafIcon(IconHelper.create("user"));
    tree.getStyle().setNodeCloseIcon(IconHelper.create("icon-album"));
    tree.getStyle().setNodeOpenIcon(IconHelper.create("icon-album"));
    west.add(tree);

    treeStore.add(createAlbum("Album 1"), false);
    tree.setLeaf(treeStore.getRootItems().get(0), false);

    BorderLayoutData westData = new BorderLayoutData(LayoutRegion.WEST, 200, 100, 300);
    westData.setMargins(new Margins(5, 0, 5, 5));
    westData.setSplit(true);
    container.add(west, westData);

    ContentPanel center = new ContentPanel();
    center.setHeading("My Images");
    center.setScrollMode(Scroll.AUTO);

    BorderLayoutData centerData = new BorderLayoutData(LayoutRegion.CENTER);
    centerData.setMargins(new Margins(5));
    container.add(center, centerData);

    final ExampleServiceAsync service = (ExampleServiceAsync) GWT.create(ExampleService.class);
    ServiceDefTarget endpoint = (ServiceDefTarget) service;
    String moduleRelativeURL = GWT.getModuleBaseURL() + "service";
    endpoint.setServiceEntryPoint(moduleRelativeURL);

    RpcProxy<List<Photo>> proxy = new RpcProxy<List<Photo>>() {
      @Override
      protected void load(Object loadConfig, AsyncCallback<List<Photo>> callback) {
        service.getPhotos(callback);
      }
    };

    ListLoader<ListLoadResult<BeanModel>> loader = new BaseListLoader<ListLoadResult<BeanModel>>(
        proxy, new BeanModelReader());
    ListStore<BeanModel> store = new ListStore<BeanModel>(loader);
    loader.load();

    ListView<BeanModel> view = new ListView<BeanModel>() {
      @Override
      protected BeanModel prepareData(BeanModel model) {
        Photo photo = model.getBean();
        long size = photo.getSize() / 1000;
        model.set("shortName", Format.ellipse(photo.getName(), 15));
        model.set("sizeString", NumberFormat.getFormat("#0").format(size) + "k");
        model.set("dateString", DateTimeFormat.getMediumDateTimeFormat().format(
            photo.getDate()));
        return model;
      }
    };
    view.setId("img-chooser-view");
    view.setTemplate(getTemplate());
    view.setBorders(false);
    view.setStore(store);
    view.setItemSelector("div.thumb-wrap");

    center.add(view);

    new ListViewDragSource(view);

    TreePanelDropTarget target = new TreePanelDropTarget(tree) {
      @SuppressWarnings("unchecked")
      @Override
      protected void handleAppendDrop(DNDEvent event, TreeNode item) {
        List<BeanModel> sel = event.getData();
        for (BeanModel bean : sel) {
          ModelData m = new BaseModelData();
          for (String s : bean.getPropertyNames()) {
            m.set(s, bean.get(s));
          }
          tree.getStore().add(item.getModel(), m, false);
        }
      }

    };
    target.setOperation(Operation.COPY);
    target.setFeedback(Feedback.APPEND);

    add(container);
  }

  private native String getTemplate() /*-{
    return ['<tpl for=".">',
    '<div class="thumb-wrap" id="{name}" style="border: 1px solid white">',
    '<div class="thumb"><img src="{path}" title="{name}"></div>',
    '<span>{shortName}</span></div>',
    '</tpl>'].join("");
  }-*/;

  private ModelData createAlbum(String name) {
    ModelData m = new BaseModelData();
    m.set("name", name);
    return m;
  }
}