package giovannilt.client.components;

import com.extjs.gxt.ui.client.widget.ContentPanel;
import com.extjs.gxt.ui.client.widget.LayoutContainer;
import com.extjs.gxt.ui.client.widget.layout.ColumnData;
import com.extjs.gxt.ui.client.widget.layout.ColumnLayout;

/**
 * Created by IntelliJ IDEA.
 * User: giovannilt
 * Date: Jul 19, 2010
 * Time: 9:41:22 PM
 * To change this template use File | Settings | File Templates.
 */
public class BottomBox extends LayoutContainer {

    public BottomBox(){
        setLayout(new ColumnLayout());
        setStyleAttribute("backgroundColor", "transparent");

        ColumnData left= new ColumnData();
        left.setWidth(260);

        ColumnData centre= new ColumnData();
        left.setWidth(260);

        ColumnData right= new ColumnData();
        left.setWidth(260);

        ContentPanel panel1 = new ContentPanel();
        panel1.setHeaderVisible(false);
        panel1.setFooter(true);
        panel1.setSize(260, 200);
        panel1.setStyleAttribute("backgroundColor", "#1F6525");

       // panel1.add(new SlideShowButton());

        this.add(panel1,left);

        ContentPanel panel2 = new ContentPanel();
        panel2.setHeaderVisible(false);
        panel2.setFooter(true);
        panel2.setSize(260, 200);
        panel2.setStyleAttribute("backgroundColor", "#2B3E65");
                
        this.add(panel2,centre);

        ContentPanel panel3 = new ContentPanel();
        panel3.setHeaderVisible(false);
        panel3.setFooter(true);
        panel3.setSize(260, 200);

        panel3.setStyleAttribute("backgroundColor", "#2BD065");
        this.add(panel3,right);


    }
}
