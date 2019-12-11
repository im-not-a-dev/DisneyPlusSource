package com.bamtech.sdk4.content.bookmark;

import com.bamtech.sdk4.content.ContentExtension;
import com.bamtech.sdk4.internal.service.ServiceTransaction;
import com.bamtech.shadow.dagger.p048a.C2111c;
import javax.inject.Provider;

public final class DefaultBookmarkApi_Factory implements C2111c<DefaultBookmarkApi> {
    private final Provider<ContentExtension> extensionProvider;
    private final Provider<ServiceTransaction> transactionProvider;

    public DefaultBookmarkApi_Factory(Provider<ServiceTransaction> provider, Provider<ContentExtension> provider2) {
        this.transactionProvider = provider;
        this.extensionProvider = provider2;
    }

    public static DefaultBookmarkApi_Factory create(Provider<ServiceTransaction> provider, Provider<ContentExtension> provider2) {
        return new DefaultBookmarkApi_Factory(provider, provider2);
    }

    public DefaultBookmarkApi get() {
        return new DefaultBookmarkApi(this.transactionProvider, (ContentExtension) this.extensionProvider.get());
    }
}
