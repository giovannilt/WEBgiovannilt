package giovanniltId.client;

import com.extjs.gxt.ui.client.Style;
import com.extjs.gxt.ui.client.util.Margins;
import com.extjs.gxt.ui.client.widget.ContentPanel;
import com.extjs.gxt.ui.client.widget.LayoutContainer;
import com.extjs.gxt.ui.client.widget.Text;
import com.extjs.gxt.ui.client.widget.layout.FlowData;
import com.extjs.gxt.ui.client.widget.layout.RowData;
import com.extjs.gxt.ui.client.widget.layout.RowLayout;

/**
 * Created by IntelliJ IDEA.
 * User: giovannilt
 * Date: Jul 17, 2010
 * Time: 4:46:53 PM
 * To change this template use File | Settings | File Templates.
 */
public class HomePage extends LayoutContainer {

    public HomePage() {
        setScrollMode(Style.Scroll.AUTOY);

        Text title = new Text("Giovanni La Torre");
        title.addStyleName("pad-text");
        title.setStyleAttribute("font-size", "50px");
        title.setStyleAttribute("backgroundColor", "#FFCC00");
        title.setStyleAttribute("text-align", "right");
        title.setBorders(true);

        add(title, new FlowData(5));

        ContentPanel panelCentre = new ContentPanel();
        panelCentre.setLayout(new RowLayout(Style.Orientation.VERTICAL));
        panelCentre.setSize(800, 600);
        panelCentre.setFrame(true);
        panelCentre.setCollapsible(false);

        Text label1 = new Text("Test Label 1");
        label1.addStyleName("pad-text");
        label1.setStyleAttribute("backgroundColor", "white");
        label1.setBorders(true);

        Text label2 = new Text("Test Label 2");
        label2.addStyleName("pad-text");
        label2.setStyleAttribute("backgroundColor", "white");
        label2.setBorders(true);

        Text label3 = new Text("Test Label 3");
        label3.addStyleName("pad-text");
        label3.setStyleAttribute("backgroundColor", "white");
        label3.setBorders(true);

        panelCentre.add(label1, new RowData(1, -1, new Margins(4)));
        panelCentre.add(label2, new RowData(1, 1, new Margins(0, 4, 0, 4)));
        panelCentre.add(label3, new RowData(1, -1, new Margins(4)));

        add(panelCentre, new FlowData(5));

        ContentPanel panelButton = new ContentPanel();
        panelButton.setHeading("RowLayout: Orientation set to horizontal");
        panelButton.setLayout(new RowLayout(Style.Orientation.HORIZONTAL));
        panelButton.setSize(400, 300);
        panelButton.setFrame(true);
        panelButton.setCollapsible(true);

        label1 = new Text("Test Label 1");
        label1.addStyleName("pad-text");
        label1.setStyleAttribute("backgroundColor", "white");
        label1.setBorders(true);

        label2 = new Text("Test Label 2");
        label2.addStyleName("pad-text");
        label2.setStyleAttribute("backgroundColor", "white");
        label2.setBorders(true);

        label3 = new Text("Test Label 3");
        label3.addStyleName("pad-text");
        label3.setStyleAttribute("backgroundColor", "white");
        label3.setBorders(true);

        panelButton.add(label1, new RowData(-1, 1, new Margins(4)));
        panelButton.add(label2, new RowData(1, 1, new Margins(4, 0, 4, 0)));
        panelButton.add(label3, new RowData(-1, 1, new Margins(4)));

        add(panelButton, new FlowData(2));

    }

}
