package com.bamtech.sdk4.internal.plugin;

import com.bamtech.sdk4.internal.service.ServiceTransaction;
import com.bamtech.sdk4.plugin.PluginRegistry;
import com.bamtech.shadow.dagger.p048a.C2111c;
import com.bamtech.shadow.dagger.p048a.C2113e;
import javax.inject.Provider;

public final class DefaultExtensionModule_ServiceTransactionFactory implements C2111c<ServiceTransaction> {
    private final DefaultExtensionModule module;
    private final Provider<PluginRegistry> registryProvider;

    public DefaultExtensionModule_ServiceTransactionFactory(DefaultExtensionModule defaultExtensionModule, Provider<PluginRegistry> provider) {
        this.module = defaultExtensionModule;
        this.registryProvider = provider;
    }

    public static DefaultExtensionModule_ServiceTransactionFactory create(DefaultExtensionModule defaultExtensionModule, Provider<PluginRegistry> provider) {
        return new DefaultExtensionModule_ServiceTransactionFactory(defaultExtensionModule, provider);
    }

    public ServiceTransaction get() {
        ServiceTransaction serviceTransaction = this.module.serviceTransaction((PluginRegistry) this.registryProvider.get());
        C2113e.m8178a(serviceTransaction, "Cannot return null from a non-@Nullable @Provides method");
        return serviceTransaction;
    }
}
