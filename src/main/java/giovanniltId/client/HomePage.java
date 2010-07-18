package giovanniltId.client;

import com.extjs.gxt.ui.client.Style;
import com.extjs.gxt.ui.client.util.Margins;
import com.extjs.gxt.ui.client.widget.ContentPanel;
import com.extjs.gxt.ui.client.widget.HorizontalPanel;
import com.extjs.gxt.ui.client.widget.LayoutContainer;
import com.extjs.gxt.ui.client.widget.Text;
import com.extjs.gxt.ui.client.widget.layout.*;

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
        title.setStyleAttribute("backgroundColor", "#0099cc");
        title.setStyleAttribute("text-align", "right");
        title.setBorders(true);
        title.setHeight(50);
        title.setSize(800,50);

        add(title, new FlowData(15));

        ContentPanel panelCentre = new ContentPanel();
        panelCentre.setLayout(new BorderLayout());
        panelCentre.setHeaderVisible(false);
       
        panelCentre.setSize(800, 600);
        panelCentre.setFrame(true);
        panelCentre.setCollapsible(false);


        Text label1 = new Text("Test Label 1");
        label1.addStyleName("pad-text");
        label1.setStyleAttribute("backgroundColor", "white");

        ContentPanel panelInBox = new ContentPanel();
        panelInBox.setLayout(new AbsoluteLayout());
        panelInBox.setHeaderVisible(false);

        ContentPanel panelInCurricula = new ContentPanel();
        panelInCurricula.setLayout(new AbsoluteLayout());
        panelInCurricula.setHeaderVisible(false);
        panelInCurricula.setStyleAttribute("backgroundColor", "white");


        BorderLayoutData centerData = new BorderLayoutData(Style.LayoutRegion.CENTER);
        centerData.setMargins(new Margins(5, 0, 5, 0));

        BorderLayoutData eastData = new BorderLayoutData(Style.LayoutRegion.EAST);
        eastData.setMargins(new Margins(5, 0, 5, 15));

        BorderLayoutData bottomData = new BorderLayoutData(Style.LayoutRegion.SOUTH);
        bottomData.setMargins(new Margins(5, 0, 5, 0));


        panelCentre.add(label1, eastData);
        panelCentre.add(panelInBox, centerData);
        panelCentre.add(panelInCurricula, bottomData);


        add(panelCentre, new FlowData(15));

        ContentPanel panelBottom = new ContentPanel();
        panelBottom.setHeading("Giovanni La Torre giovannilt@gmail.com");
        panelBottom.setSize(830,25);

        add(panelBottom, new FlowData(2));

    }

}
