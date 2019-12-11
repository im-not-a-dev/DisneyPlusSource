package com.bamtech.sdk4.content.search;

import com.bamtech.sdk4.content.ContentExtension;
import com.bamtech.sdk4.internal.service.ServiceTransaction;
import com.bamtech.shadow.dagger.p048a.C2111c;
import javax.inject.Provider;

public final class DefaultSearchApi_Factory implements C2111c<DefaultSearchApi> {
    private final Provider<ContentExtension> extensionProvider;
    private final Provider<ServiceTransaction> transactionProvider;

    public DefaultSearchApi_Factory(Provider<ServiceTransaction> provider, Provider<ContentExtension> provider2) {
        this.transactionProvider = provider;
        this.extensionProvider = provider2;
    }

    public static DefaultSearchApi_Factory create(Provider<ServiceTransaction> provider, Provider<ContentExtension> provider2) {
        return new DefaultSearchApi_Factory(provider, provider2);
    }

    public DefaultSearchApi get() {
        return new DefaultSearchApi(this.transactionProvider, (ContentExtension) this.extensionProvider.get());
    }
}
