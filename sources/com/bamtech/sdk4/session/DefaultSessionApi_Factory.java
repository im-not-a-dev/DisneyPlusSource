package com.bamtech.sdk4.session;

import com.bamtech.sdk4.internal.core.Storage;
import com.bamtech.sdk4.internal.event.LogoutMode;
import com.bamtech.sdk4.internal.service.ServiceTransaction;
import com.bamtech.sdk4.internal.session.InternalSessionStateProvider;
import com.bamtech.sdk4.internal.token.AccessContextUpdater;
import com.bamtech.shadow.dagger.p048a.C2111c;
import javax.inject.Provider;
import p520io.reactivex.subjects.PublishSubject;

public final class DefaultSessionApi_Factory implements C2111c<DefaultSessionApi> {
    private final Provider<AccessContextUpdater> contextUpdaterProvider;
    private final Provider<SessionExtension> extensionProvider;
    private final Provider<InternalSessionStateProvider> internalSessionStateProvider;
    private final Provider<SessionInfoExtension> managerProvider;
    private final Provider<PublishSubject<LogoutMode>> notifierProvider;
    private final Provider<SessionInfoStorage> sessionStorageProvider;
    private final Provider<Storage> storageProvider;
    private final Provider<ServiceTransaction> transactionProvider;

    public DefaultSessionApi_Factory(Provider<ServiceTransaction> provider, Provider<Storage> provider2, Provider<SessionInfoStorage> provider3, Provider<AccessContextUpdater> provider4, Provider<SessionInfoExtension> provider5, Provider<InternalSessionStateProvider> provider6, Provider<SessionExtension> provider7, Provider<PublishSubject<LogoutMode>> provider8) {
        this.transactionProvider = provider;
        this.storageProvider = provider2;
        this.sessionStorageProvider = provider3;
        this.contextUpdaterProvider = provider4;
        this.managerProvider = provider5;
        this.internalSessionStateProvider = provider6;
        this.extensionProvider = provider7;
        this.notifierProvider = provider8;
    }

    public static DefaultSessionApi_Factory create(Provider<ServiceTransaction> provider, Provider<Storage> provider2, Provider<SessionInfoStorage> provider3, Provider<AccessContextUpdater> provider4, Provider<SessionInfoExtension> provider5, Provider<InternalSessionStateProvider> provider6, Provider<SessionExtension> provider7, Provider<PublishSubject<LogoutMode>> provider8) {
        DefaultSessionApi_Factory defaultSessionApi_Factory = new DefaultSessionApi_Factory(provider, provider2, provider3, provider4, provider5, provider6, provider7, provider8);
        return defaultSessionApi_Factory;
    }

    public DefaultSessionApi get() {
        DefaultSessionApi defaultSessionApi = new DefaultSessionApi(this.transactionProvider, (Storage) this.storageProvider.get(), (SessionInfoStorage) this.sessionStorageProvider.get(), (AccessContextUpdater) this.contextUpdaterProvider.get(), (SessionInfoExtension) this.managerProvider.get(), (InternalSessionStateProvider) this.internalSessionStateProvider.get(), (SessionExtension) this.extensionProvider.get(), (PublishSubject) this.notifierProvider.get());
        return defaultSessionApi;
    }
}
