package com.bamtech.sdk4.internal.plugin;

import com.bamtech.sdk4.plugin.ExtensionInstanceProvider;
import com.bamtech.sdk4.plugin.PluginRegistry;
import com.bamtech.shadow.dagger.p048a.C2111c;
import com.bamtech.shadow.dagger.p048a.C2113e;
import javax.inject.Provider;

public final class ExtensionProviderModule_InstanceProviderFactory implements C2111c<ExtensionInstanceProvider> {
    private final ExtensionProviderModule module;
    private final Provider<PluginRegistry> registryProvider;

    public ExtensionProviderModule_InstanceProviderFactory(ExtensionProviderModule extensionProviderModule, Provider<PluginRegistry> provider) {
        this.module = extensionProviderModule;
        this.registryProvider = provider;
    }

    public static ExtensionProviderModule_InstanceProviderFactory create(ExtensionProviderModule extensionProviderModule, Provider<PluginRegistry> provider) {
        return new ExtensionProviderModule_InstanceProviderFactory(extensionProviderModule, provider);
    }

    public ExtensionInstanceProvider get() {
        ExtensionInstanceProvider instanceProvider = this.module.instanceProvider((PluginRegistry) this.registryProvider.get());
        C2113e.m8178a(instanceProvider, "Cannot return null from a non-@Nullable @Provides method");
        return instanceProvider;
    }
}
