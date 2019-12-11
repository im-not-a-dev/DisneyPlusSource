package com.bamtech.sdk4.bookmarks;

import com.bamtech.sdk4.bookmarks.storage.LocalBookmarkStore;
import com.bamtech.sdk4.content.ContentExtension;
import com.bamtech.sdk4.internal.event.LogoutMode;
import com.bamtech.sdk4.internal.event.UserProfileEvent;
import com.bamtech.sdk4.internal.service.ServiceTransaction;
import com.bamtech.sdk4.session.SessionInfoExtension;
import com.bamtech.shadow.dagger.p048a.C2111c;
import javax.inject.Provider;
import p520io.reactivex.subjects.PublishSubject;

public final class DefaultBookmarkApi_Factory implements C2111c<DefaultBookmarkApi> {
    private final Provider<ContentExtension> extensionProvider;
    private final Provider<LocalBookmarkStore> localBookmarkStoreProvider;
    private final Provider<PublishSubject<LogoutMode>> logoutNotifierProvider;
    private final Provider<PublishSubject<UserProfileEvent>> profileEventNotifierProvider;
    private final Provider<SessionInfoExtension> sessionManagerProvider;
    private final Provider<ServiceTransaction> transactionProvider;

    public DefaultBookmarkApi_Factory(Provider<ServiceTransaction> provider, Provider<ContentExtension> provider2, Provider<LocalBookmarkStore> provider3, Provider<PublishSubject<LogoutMode>> provider4, Provider<PublishSubject<UserProfileEvent>> provider5, Provider<SessionInfoExtension> provider6) {
        this.transactionProvider = provider;
        this.extensionProvider = provider2;
        this.localBookmarkStoreProvider = provider3;
        this.logoutNotifierProvider = provider4;
        this.profileEventNotifierProvider = provider5;
        this.sessionManagerProvider = provider6;
    }

    public static DefaultBookmarkApi_Factory create(Provider<ServiceTransaction> provider, Provider<ContentExtension> provider2, Provider<LocalBookmarkStore> provider3, Provider<PublishSubject<LogoutMode>> provider4, Provider<PublishSubject<UserProfileEvent>> provider5, Provider<SessionInfoExtension> provider6) {
        DefaultBookmarkApi_Factory defaultBookmarkApi_Factory = new DefaultBookmarkApi_Factory(provider, provider2, provider3, provider4, provider5, provider6);
        return defaultBookmarkApi_Factory;
    }

    public DefaultBookmarkApi get() {
        DefaultBookmarkApi defaultBookmarkApi = new DefaultBookmarkApi(this.transactionProvider, (ContentExtension) this.extensionProvider.get(), (LocalBookmarkStore) this.localBookmarkStoreProvider.get(), (PublishSubject) this.logoutNotifierProvider.get(), (PublishSubject) this.profileEventNotifierProvider.get(), this.sessionManagerProvider);
        return defaultBookmarkApi;
    }
}
