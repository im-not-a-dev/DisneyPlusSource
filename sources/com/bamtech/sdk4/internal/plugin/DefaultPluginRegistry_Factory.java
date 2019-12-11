package com.bamtech.sdk4.internal.plugin;

import com.bamtech.shadow.dagger.p048a.C2111c;

public final class DefaultPluginRegistry_Factory implements C2111c<DefaultPluginRegistry> {
    private static final DefaultPluginRegistry_Factory INSTANCE = new DefaultPluginRegistry_Factory();

    public static DefaultPluginRegistry_Factory create() {
        return INSTANCE;
    }

    public DefaultPluginRegistry get() {
        return new DefaultPluginRegistry();
    }
}
