package com.google.gwt.user.client.ui;

import com.google.gwt.resources.client.ResourcePrototype;
import com.google.gwt.core.client.GWT;

public class com_google_gwt_user_client_ui_DisclosurePanel_DefaultImages_default_StaticClientBundleGenerator implements com.google.gwt.user.client.ui.DisclosurePanel.DefaultImages {
  public com.google.gwt.resources.client.ImageResource disclosurePanelClosed() {
    if (disclosurePanelClosed == null) {
      disclosurePanelClosed = new com.google.gwt.resources.client.impl.ImageResourcePrototype(
        "disclosurePanelClosed",
        com.google.gwt.i18n.client.LocaleInfo.getCurrentLocale().isRTL() ?internedUrl1 : internedUrl0,
        16, 0, 16, 16, false, false
      );
    }
    return disclosurePanelClosed;
  }
  public com.google.gwt.resources.client.ImageResource disclosurePanelOpen() {
    if (disclosurePanelOpen == null) {
      disclosurePanelOpen = new com.google.gwt.resources.client.impl.ImageResourcePrototype(
        "disclosurePanelOpen",
        com.google.gwt.i18n.client.LocaleInfo.getCurrentLocale().isRTL() ?internedUrl1 : internedUrl0,
        0, 0, 16, 16, false, false
      );
    }
    return disclosurePanelOpen;
  }
  private static final java.lang.String internedUrl0 = GWT.getModuleBaseURL() + "E44767377485D18D6B6864F65BA8EF73.cache.png";
  private static final java.lang.String internedUrl1 = GWT.getModuleBaseURL() + "0A9476898799A150D840F0B1C3672921.cache.png";
  private static com.google.gwt.resources.client.ImageResource disclosurePanelClosed;
  private static com.google.gwt.resources.client.ImageResource disclosurePanelOpen;
  
  public ResourcePrototype[] getResources() {
    return new ResourcePrototype[] {
      disclosurePanelClosed(), 
      disclosurePanelOpen(), 
    };
  }
  public native ResourcePrototype getResource(String name) /*-{
    switch (name) {
      case 'disclosurePanelClosed': return this.@com.google.gwt.user.client.ui.DisclosurePanel.DefaultImages::disclosurePanelClosed()();
      case 'disclosurePanelOpen': return this.@com.google.gwt.user.client.ui.DisclosurePanel.DefaultImages::disclosurePanelOpen()();
    }
    return null;
  }-*/;
}
