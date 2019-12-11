package com.bamtech.sdk4.internal.plugin;

import com.bamtech.sdk4.plugin.PluginRegistry;
import com.bamtech.shadow.dagger.p048a.C2111c;
import com.bamtech.shadow.dagger.p048a.C2113e;
import javax.inject.Provider;

public final class DefaultExtensionModule_UserAgentFactory implements C2111c<String> {
    private final DefaultExtensionModule module;
    private final Provider<PluginRegistry> registryProvider;

    public DefaultExtensionModule_UserAgentFactory(DefaultExtensionModule defaultExtensionModule, Provider<PluginRegistry> provider) {
        this.module = defaultExtensionModule;
        this.registryProvider = provider;
    }

    public static DefaultExtensionModule_UserAgentFactory create(DefaultExtensionModule defaultExtensionModule, Provider<PluginRegistry> provider) {
        return new DefaultExtensionModule_UserAgentFactory(defaultExtensionModule, provider);
    }

    public static String proxyUserAgent(DefaultExtensionModule defaultExtensionModule, PluginRegistry pluginRegistry) {
        String userAgent = defaultExtensionModule.userAgent(pluginRegistry);
        C2113e.m8178a(userAgent, "Cannot return null from a non-@Nullable @Provides method");
        return userAgent;
    }

    public String get() {
        String userAgent = this.module.userAgent((PluginRegistry) this.registryProvider.get());
        C2113e.m8178a(userAgent, "Cannot return null from a non-@Nullable @Provides method");
        return userAgent;
    }
}
