package giovannilt.client;

import com.extjs.gxt.ui.client.Style;
import com.extjs.gxt.ui.client.util.Margins;
import com.extjs.gxt.ui.client.widget.ContentPanel;
import com.extjs.gxt.ui.client.widget.LayoutContainer;
import com.extjs.gxt.ui.client.widget.Text;
import com.extjs.gxt.ui.client.widget.layout.*;
import giovannilt.client.components.BottomBox;
import giovannilt.client.components.MyForm;
//import org.intellij.lang.annotations.Language;

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

        ContentPanel panelTop = new ContentPanel();
        panelTop.setLayout(new BorderLayout());
        panelTop.setHeaderVisible(false);
        panelTop.setSize(830, 75);

        BorderLayoutData centerData = new BorderLayoutData(Style.LayoutRegion.CENTER);
        centerData.setMargins(new Margins(15, 25, 15, 25));

        Text title = new Text("Giovanni La Torre");

        title.setStyleAttribute("font-size", "40px");
        title.setStyleAttribute("font-family", "tahoma");
        title.setStyleAttribute("color", "#D38131");
        title.setStyleAttribute("backgroundColor", "transparent");

        title.setStyleAttribute("text-align", "right");
        title.setBorders(false);
        title.setHeight(50);
        title.setSize(800, 50);

        panelTop.add(title, centerData);

        add(panelTop, new FlowData(2));

        ContentPanel panelCentre = new ContentPanel();
        panelCentre.setLayout(new BorderLayout());
        panelCentre.setHeaderVisible(false);

        panelCentre.setSize(800, 600);
        panelCentre.setFrame(true);
        panelCentre.setCollapsible(false);


        Text frase = new Text();
        /*@Language("HTML")*/ String monicelli="<PRE>    </PRE>Monicelli: 'La speranza di cui si parla e' una trappola e' una brutta parola non si deve usare.</br>" +
                "<PRE>    </PRE> La speranza e' una trappola inventata dai padroni</br>" +
                "<PRE>    </PRE> La speranza e' di quelli che dicono in nome di Dio 'state boni state zitti pregate, avrete il vostro riscatto la ricompensa nell'aldila' state boni, state boni tornate a casa, ma tanto tra due tre mesi vi riassumiamo ...'</br> \n" +
                "<PRE>    </PRE> La speranza e' una trappola, mai avere la speranza, e' una cosa infame e' una trappola.";
        frase.setText(monicelli);
        frase.setStyleAttribute("backgroundColor", "transparent");
        frase.setStyleAttribute("font-family", "tahoma");
        frase.setStyleAttribute("font-size", "14px");
        frase.setStyleAttribute("color", "#A46525");
         //frase.addStyleName("pad-text");     TODO: capire come aggiungere un style


        ContentPanel panelInBox = new ContentPanel();
        panelInBox.setLayout(new AbsoluteLayout());
        panelInBox.setStyleAttribute("backgroundColor", "#1F6525");
        panelInBox.setHeaderVisible(false);


        centerData = new BorderLayoutData(Style.LayoutRegion.CENTER);
        centerData.setMargins(new Margins(5, 0, 5, 0));

        BorderLayoutData eastData = new BorderLayoutData(Style.LayoutRegion.EAST);
        eastData.setMargins(new Margins(5, 0, 5, 15));

        BorderLayoutData bottomData = new BorderLayoutData(Style.LayoutRegion.SOUTH);
        bottomData.setMargins(new Margins(5, 0, 5, 0));

        panelCentre.add(frase, eastData);
        panelCentre.add(panelInBox, centerData);
        panelCentre.add(new MyForm(), centerData);
        panelCentre.add(new BottomBox(), bottomData);


        add(panelCentre, new FlowData(15));

        ContentPanel panelBottom = new ContentPanel();
        panelBottom.setHeading("Giovanni La Torre giovannilt@gmail.com");
        panelBottom.setSize(830, 25);

        add(panelBottom, new FlowData(2));

    }

}
