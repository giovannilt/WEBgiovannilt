package com.google.gwt.user.client.ui;

import com.google.gwt.resources.client.ResourcePrototype;
import com.google.gwt.core.client.GWT;

public class com_google_gwt_user_client_ui_Tree_Resources_default_StaticClientBundleGenerator implements com.google.gwt.user.client.ui.Tree.Resources {
  public com.google.gwt.resources.client.ImageResource treeClosed() {
    if (treeClosed == null) {
      treeClosed = new com.google.gwt.resources.client.impl.ImageResourcePrototype(
        "treeClosed",
        internedUrl0,
        32, 0, 16, 16, false, false
      );
    }
    return treeClosed;
  }
  public com.google.gwt.resources.client.ImageResource treeLeaf() {
    if (treeLeaf == null) {
      treeLeaf = new com.google.gwt.resources.client.impl.ImageResourcePrototype(
        "treeLeaf",
        internedUrl0,
        16, 0, 16, 16, false, false
      );
    }
    return treeLeaf;
  }
  public com.google.gwt.resources.client.ImageResource treeOpen() {
    if (treeOpen == null) {
      treeOpen = new com.google.gwt.resources.client.impl.ImageResourcePrototype(
        "treeOpen",
        internedUrl0,
        0, 0, 16, 16, false, false
      );
    }
    return treeOpen;
  }
  private static final java.lang.String internedUrl0 = GWT.getModuleBaseURL() + "EDC7827FEEA59EE44AD790B1C6430C45.cache.png";
  private static com.google.gwt.resources.client.ImageResource treeClosed;
  private static com.google.gwt.resources.client.ImageResource treeLeaf;
  private static com.google.gwt.resources.client.ImageResource treeOpen;
  
  public ResourcePrototype[] getResources() {
    return new ResourcePrototype[] {
      treeClosed(), 
      treeLeaf(), 
      treeOpen(), 
    };
  }
  public native ResourcePrototype getResource(String name) /*-{
    switch (name) {
      case 'treeClosed': return this.@com.google.gwt.user.client.ui.Tree.Resources::treeClosed()();
      case 'treeLeaf': return this.@com.google.gwt.user.client.ui.Tree.Resources::treeLeaf()();
      case 'treeOpen': return this.@com.google.gwt.user.client.ui.Tree.Resources::treeOpen()();
    }
    return null;
  }-*/;
}
