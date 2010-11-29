package giovannilt.client;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.user.client.ui.RootPanel;


/**
 * Entry point classes define <code>onModuleLoad()</code>.
 */
public class Application implements EntryPoint {


    public void onModuleLoad() {
        HomePage hello = new HomePage();

     
        RootPanel.get().add(hello);
    }
}
