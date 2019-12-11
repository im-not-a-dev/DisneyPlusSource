package com.bamtech.sdk4.android;

import com.bamtech.sdk4.customerservice.CustomerServiceApi;
import com.bamtech.sdk4.edge.EdgeManager;
import com.bamtech.sdk4.internal.BaseSession_MembersInjector;
import com.bamtech.sdk4.internal.service.ServiceTransaction;
import com.bamtech.sdk4.media.MediaApi;
import com.bamtech.sdk4.plugin.ExtensionRegistry;
import com.bamtech.sdk4.plugin.PluginRegistry;
import com.bamtech.sdk4.session.SessionApi;
import com.bamtech.shadow.dagger.p048a.C2110b;
import com.bamtech.shadow.dagger.p048a.C2111c;
import javax.inject.Provider;

public final class SdkSession_Factory implements C2111c<SdkSession> {
    private final Provider<CustomerServiceApi> customerServiceApiProvider;
    private final Provider<EdgeManager> edgeProvider;
    private final Provider<ExtensionRegistry> extensionRegistryProvider;
    private final Provider<MediaApi> mediaProvider;
    private final Provider<PluginRegistry> pluginRegistryProvider;
    private final Provider<SessionApi> sessionApiProvider;
    private final Provider<ServiceTransaction> transactionProvider;

    public SdkSession_Factory(Provider<EdgeManager> provider, Provider<ServiceTransaction> provider2, Provider<SessionApi> provider3, Provider<MediaApi> provider4, Provider<PluginRegistry> provider5, Provider<ExtensionRegistry> provider6, Provider<CustomerServiceApi> provider7) {
        this.edgeProvider = provider;
        this.transactionProvider = provider2;
        this.sessionApiProvider = provider3;
        this.mediaProvider = provider4;
        this.pluginRegistryProvider = provider5;
        this.extensionRegistryProvider = provider6;
        this.customerServiceApiProvider = provider7;
    }

    public static SdkSession_Factory create(Provider<EdgeManager> provider, Provider<ServiceTransaction> provider2, Provider<SessionApi> provider3, Provider<MediaApi> provider4, Provider<PluginRegistry> provider5, Provider<ExtensionRegistry> provider6, Provider<CustomerServiceApi> provider7) {
        SdkSession_Factory sdkSession_Factory = new SdkSession_Factory(provider, provider2, provider3, provider4, provider5, provider6, provider7);
        return sdkSession_Factory;
    }

    public SdkSession get() {
        SdkSession sdkSession = new SdkSession();
        BaseSession_MembersInjector.injectEdge(sdkSession, (EdgeManager) this.edgeProvider.get());
        BaseSession_MembersInjector.injectTransactionProvider(sdkSession, this.transactionProvider);
        BaseSession_MembersInjector.injectSessionApiProvider(sdkSession, C2110b.m8172a(this.sessionApiProvider));
        BaseSession_MembersInjector.injectMediaProvider(sdkSession, C2110b.m8172a(this.mediaProvider));
        BaseSession_MembersInjector.injectPluginRegistryProvider(sdkSession, C2110b.m8172a(this.pluginRegistryProvider));
        BaseSession_MembersInjector.injectExtensionRegistryProvider(sdkSession, C2110b.m8172a(this.extensionRegistryProvider));
        BaseSession_MembersInjector.injectCustomerServiceApiProvider(sdkSession, C2110b.m8172a(this.customerServiceApiProvider));
        return sdkSession;
    }
}
