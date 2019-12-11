package com.bamtech.sdk4.internal.plugin;

import com.bamtech.sdk4.internal.configuration.ConfigurationProvider;
import com.bamtech.sdk4.plugin.PluginRegistry;
import com.bamtech.shadow.dagger.p048a.C2111c;
import com.bamtech.shadow.dagger.p048a.C2113e;
import javax.inject.Provider;

public final class DefaultExtensionModule_ConfigurationFactory implements C2111c<ConfigurationProvider> {
    private final DefaultExtensionModule module;
    private final Provider<PluginRegistry> registryProvider;

    public DefaultExtensionModule_ConfigurationFactory(DefaultExtensionModule defaultExtensionModule, Provider<PluginRegistry> provider) {
        this.module = defaultExtensionModule;
        this.registryProvider = provider;
    }

    public static DefaultExtensionModule_ConfigurationFactory create(DefaultExtensionModule defaultExtensionModule, Provider<PluginRegistry> provider) {
        return new DefaultExtensionModule_ConfigurationFactory(defaultExtensionModule, provider);
    }

    public ConfigurationProvider get() {
        ConfigurationProvider configuration = this.module.configuration((PluginRegistry) this.registryProvider.get());
        C2113e.m8178a(configuration, "Cannot return null from a non-@Nullable @Provides method");
        return configuration;
    }
}
