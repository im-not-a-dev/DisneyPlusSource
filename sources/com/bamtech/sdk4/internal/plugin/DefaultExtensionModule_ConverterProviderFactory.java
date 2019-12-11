package com.bamtech.sdk4.internal.plugin;

import com.bamtech.sdk4.internal.networking.ConverterProvider;
import com.bamtech.sdk4.plugin.PluginRegistry;
import com.bamtech.shadow.dagger.p048a.C2111c;
import com.bamtech.shadow.dagger.p048a.C2113e;
import javax.inject.Provider;

public final class DefaultExtensionModule_ConverterProviderFactory implements C2111c<ConverterProvider> {
    private final DefaultExtensionModule module;
    private final Provider<PluginRegistry> registryProvider;

    public DefaultExtensionModule_ConverterProviderFactory(DefaultExtensionModule defaultExtensionModule, Provider<PluginRegistry> provider) {
        this.module = defaultExtensionModule;
        this.registryProvider = provider;
    }

    public static DefaultExtensionModule_ConverterProviderFactory create(DefaultExtensionModule defaultExtensionModule, Provider<PluginRegistry> provider) {
        return new DefaultExtensionModule_ConverterProviderFactory(defaultExtensionModule, provider);
    }

    public ConverterProvider get() {
        ConverterProvider converterProvider = this.module.converterProvider((PluginRegistry) this.registryProvider.get());
        C2113e.m8178a(converterProvider, "Cannot return null from a non-@Nullable @Provides method");
        return converterProvider;
    }
}
