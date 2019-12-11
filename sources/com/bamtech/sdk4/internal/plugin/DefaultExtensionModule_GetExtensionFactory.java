package com.bamtech.sdk4.internal.plugin;

import com.bamtech.sdk4.internal.telemetry.dust.DustClientConstants;
import com.bamtech.sdk4.plugin.PluginRegistry;
import com.bamtech.shadow.dagger.p048a.C2111c;
import com.bamtech.shadow.dagger.p048a.C2113e;
import javax.inject.Provider;

public final class DefaultExtensionModule_GetExtensionFactory implements C2111c<DustClientConstants> {
    private final DefaultExtensionModule module;
    private final Provider<PluginRegistry> registryProvider;

    public DefaultExtensionModule_GetExtensionFactory(DefaultExtensionModule defaultExtensionModule, Provider<PluginRegistry> provider) {
        this.module = defaultExtensionModule;
        this.registryProvider = provider;
    }

    public static DefaultExtensionModule_GetExtensionFactory create(DefaultExtensionModule defaultExtensionModule, Provider<PluginRegistry> provider) {
        return new DefaultExtensionModule_GetExtensionFactory(defaultExtensionModule, provider);
    }

    public DustClientConstants get() {
        DustClientConstants extension = this.module.getExtension((PluginRegistry) this.registryProvider.get());
        C2113e.m8178a(extension, "Cannot return null from a non-@Nullable @Provides method");
        return extension;
    }
}
