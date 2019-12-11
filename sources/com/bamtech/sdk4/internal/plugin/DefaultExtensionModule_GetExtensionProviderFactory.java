package com.bamtech.sdk4.internal.plugin;

import com.bamtech.sdk4.plugin.ExtensionInstanceProvider;
import com.bamtech.sdk4.plugin.PluginRegistry;
import com.bamtech.shadow.dagger.p048a.C2111c;
import com.bamtech.shadow.dagger.p048a.C2113e;
import javax.inject.Provider;

public final class DefaultExtensionModule_GetExtensionProviderFactory implements C2111c<ExtensionInstanceProvider> {
    private final DefaultExtensionModule module;
    private final Provider<PluginRegistry> registryProvider;

    public DefaultExtensionModule_GetExtensionProviderFactory(DefaultExtensionModule defaultExtensionModule, Provider<PluginRegistry> provider) {
        this.module = defaultExtensionModule;
        this.registryProvider = provider;
    }

    public static DefaultExtensionModule_GetExtensionProviderFactory create(DefaultExtensionModule defaultExtensionModule, Provider<PluginRegistry> provider) {
        return new DefaultExtensionModule_GetExtensionProviderFactory(defaultExtensionModule, provider);
    }

    public ExtensionInstanceProvider get() {
        ExtensionInstanceProvider extensionProvider = this.module.getExtensionProvider((PluginRegistry) this.registryProvider.get());
        C2113e.m8178a(extensionProvider, "Cannot return null from a non-@Nullable @Provides method");
        return extensionProvider;
    }
}
