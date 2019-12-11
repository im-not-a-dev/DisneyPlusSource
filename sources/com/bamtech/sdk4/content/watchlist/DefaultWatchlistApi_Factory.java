package com.bamtech.sdk4.content.watchlist;

import com.bamtech.sdk4.content.ContentExtension;
import com.bamtech.sdk4.internal.service.ServiceTransaction;
import com.bamtech.shadow.dagger.p048a.C2111c;
import javax.inject.Provider;

public final class DefaultWatchlistApi_Factory implements C2111c<DefaultWatchlistApi> {
    private final Provider<ContentExtension> extensionProvider;
    private final Provider<ServiceTransaction> transactionProvider;

    public DefaultWatchlistApi_Factory(Provider<ServiceTransaction> provider, Provider<ContentExtension> provider2) {
        this.transactionProvider = provider;
        this.extensionProvider = provider2;
    }

    public static DefaultWatchlistApi_Factory create(Provider<ServiceTransaction> provider, Provider<ContentExtension> provider2) {
        return new DefaultWatchlistApi_Factory(provider, provider2);
    }

    public DefaultWatchlistApi get() {
        return new DefaultWatchlistApi(this.transactionProvider, (ContentExtension) this.extensionProvider.get());
    }
}
