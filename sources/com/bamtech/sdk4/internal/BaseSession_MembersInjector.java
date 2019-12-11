package com.bamtech.sdk4.internal;

import com.bamtech.sdk4.customerservice.CustomerServiceApi;
import com.bamtech.sdk4.edge.EdgeManager;
import com.bamtech.sdk4.internal.service.ServiceTransaction;
import com.bamtech.sdk4.media.MediaApi;
import com.bamtech.sdk4.plugin.ExtensionRegistry;
import com.bamtech.sdk4.plugin.PluginRegistry;
import com.bamtech.sdk4.session.SessionApi;
import com.bamtech.shadow.dagger.Lazy;
import com.bamtech.shadow.dagger.MembersInjector;
import javax.inject.Provider;

public final class BaseSession_MembersInjector implements MembersInjector<BaseSession> {
    public static void injectCustomerServiceApiProvider(BaseSession baseSession, Lazy<CustomerServiceApi> lazy) {
        baseSession.customerServiceApiProvider = lazy;
    }

    public static void injectEdge(BaseSession baseSession, EdgeManager edgeManager) {
        baseSession.edge = edgeManager;
    }

    public static void injectExtensionRegistryProvider(BaseSession baseSession, Lazy<ExtensionRegistry> lazy) {
        baseSession.extensionRegistryProvider = lazy;
    }

    public static void injectMediaProvider(BaseSession baseSession, Lazy<MediaApi> lazy) {
        baseSession.mediaProvider = lazy;
    }

    public static void injectPluginRegistryProvider(BaseSession baseSession, Lazy<PluginRegistry> lazy) {
        baseSession.pluginRegistryProvider = lazy;
    }

    public static void injectSessionApiProvider(BaseSession baseSession, Lazy<SessionApi> lazy) {
        baseSession.sessionApiProvider = lazy;
    }

    public static void injectTransactionProvider(BaseSession baseSession, Provider<ServiceTransaction> provider) {
        baseSession.transactionProvider = provider;
    }
}
