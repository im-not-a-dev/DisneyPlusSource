package com.bamtech.sdk4.internal.session;

import com.bamtech.sdk4.internal.plugin.AuthenticationExpiredCallbackExtension;
import com.bamtech.sdk4.internal.service.ServiceTransaction;
import com.bamtech.sdk4.internal.token.AccessContextUpdater;
import com.bamtech.sdk4.session.ReauthorizationHandlerRegistry;
import com.bamtech.shadow.dagger.p048a.C2111c;
import javax.inject.Provider;

public final class DefaultRenewSessionTransformers_Factory implements C2111c<DefaultRenewSessionTransformers> {
    private final Provider<ReauthorizationHandlerRegistry> reauthorizationHandlerRegistryProvider;
    private final Provider<AuthenticationExpiredCallbackExtension> renewSessionExtensionProvider;
    private final Provider<ServiceTransaction> serviceTransactionProvider;
    private final Provider<AccessContextUpdater> sessionProvider;

    public DefaultRenewSessionTransformers_Factory(Provider<AccessContextUpdater> provider, Provider<AuthenticationExpiredCallbackExtension> provider2, Provider<ServiceTransaction> provider3, Provider<ReauthorizationHandlerRegistry> provider4) {
        this.sessionProvider = provider;
        this.renewSessionExtensionProvider = provider2;
        this.serviceTransactionProvider = provider3;
        this.reauthorizationHandlerRegistryProvider = provider4;
    }

    public static DefaultRenewSessionTransformers_Factory create(Provider<AccessContextUpdater> provider, Provider<AuthenticationExpiredCallbackExtension> provider2, Provider<ServiceTransaction> provider3, Provider<ReauthorizationHandlerRegistry> provider4) {
        return new DefaultRenewSessionTransformers_Factory(provider, provider2, provider3, provider4);
    }

    public DefaultRenewSessionTransformers get() {
        return new DefaultRenewSessionTransformers((AccessContextUpdater) this.sessionProvider.get(), this.renewSessionExtensionProvider, this.serviceTransactionProvider, (ReauthorizationHandlerRegistry) this.reauthorizationHandlerRegistryProvider.get());
    }
}
