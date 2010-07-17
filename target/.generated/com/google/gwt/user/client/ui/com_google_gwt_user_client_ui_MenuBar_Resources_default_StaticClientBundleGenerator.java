package com.google.gwt.user.client.ui;

import com.google.gwt.resources.client.ResourcePrototype;
import com.google.gwt.core.client.GWT;

public class com_google_gwt_user_client_ui_MenuBar_Resources_default_StaticClientBundleGenerator implements com.google.gwt.user.client.ui.MenuBar.Resources {
  public com.google.gwt.resources.client.ImageResource menuBarSubMenuIcon() {
    if (menuBarSubMenuIcon == null) {
      menuBarSubMenuIcon = new com.google.gwt.resources.client.impl.ImageResourcePrototype(
        "menuBarSubMenuIcon",
        com.google.gwt.i18n.client.LocaleInfo.getCurrentLocale().isRTL() ?internedUrl1 : internedUrl0,
        0, 0, 5, 9, false, false
      );
    }
    return menuBarSubMenuIcon;
  }
  private static final java.lang.String internedUrl0 = GWT.getModuleBaseURL() + "DF7764EEC1903CD03C9545B354D8D8E4.cache.png";
  private static final java.lang.String internedUrl1 = GWT.getModuleBaseURL() + "396F806CD63ABD414BFBB9D57429F05B.cache.png";
  private static com.google.gwt.resources.client.ImageResource menuBarSubMenuIcon;
  
  public ResourcePrototype[] getResources() {
    return new ResourcePrototype[] {
      menuBarSubMenuIcon(), 
    };
  }
  public native ResourcePrototype getResource(String name) /*-{
    switch (name) {
      case 'menuBarSubMenuIcon': return this.@com.google.gwt.user.client.ui.MenuBar.Resources::menuBarSubMenuIcon()();
    }
    return null;
  }-*/;
}
