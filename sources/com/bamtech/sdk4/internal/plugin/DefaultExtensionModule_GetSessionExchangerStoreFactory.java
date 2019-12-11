package com.bamtech.sdk4.internal.plugin;

import com.bamtech.sdk4.plugin.PluginRegistry;
import com.bamtech.sdk4.session.ReauthorizationHandlerRegistry;
import com.bamtech.shadow.dagger.p048a.C2111c;
import com.bamtech.shadow.dagger.p048a.C2113e;
import javax.inject.Provider;

public final class DefaultExtensionModule_GetSessionExchangerStoreFactory implements C2111c<ReauthorizationHandlerRegistry> {
    private final DefaultExtensionModule module;
    private final Provider<PluginRegistry> registryProvider;

    public DefaultExtensionModule_GetSessionExchangerStoreFactory(DefaultExtensionModule defaultExtensionModule, Provider<PluginRegistry> provider) {
        this.module = defaultExtensionModule;
        this.registryProvider = provider;
    }

    public static DefaultExtensionModule_GetSessionExchangerStoreFactory create(DefaultExtensionModule defaultExtensionModule, Provider<PluginRegistry> provider) {
        return new DefaultExtensionModule_GetSessionExchangerStoreFactory(defaultExtensionModule, provider);
    }

    public ReauthorizationHandlerRegistry get() {
        ReauthorizationHandlerRegistry sessionExchangerStore = this.module.getSessionExchangerStore((PluginRegistry) this.registryProvider.get());
        C2113e.m8178a(sessionExchangerStore, "Cannot return null from a non-@Nullable @Provides method");
        return sessionExchangerStore;
    }
}
