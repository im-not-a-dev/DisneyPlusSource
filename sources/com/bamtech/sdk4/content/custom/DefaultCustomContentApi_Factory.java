package com.bamtech.sdk4.content.custom;

import com.bamtech.sdk4.content.ContentExtension;
import com.bamtech.sdk4.internal.service.ServiceTransaction;
import com.bamtech.shadow.dagger.p048a.C2111c;
import javax.inject.Provider;

public final class DefaultCustomContentApi_Factory implements C2111c<DefaultCustomContentApi> {
    private final Provider<ContentExtension> extensionProvider;
    private final Provider<ServiceTransaction> transactionProvider;

    public DefaultCustomContentApi_Factory(Provider<ServiceTransaction> provider, Provider<ContentExtension> provider2) {
        this.transactionProvider = provider;
        this.extensionProvider = provider2;
    }

    public static DefaultCustomContentApi_Factory create(Provider<ServiceTransaction> provider, Provider<ContentExtension> provider2) {
        return new DefaultCustomContentApi_Factory(provider, provider2);
    }

    public DefaultCustomContentApi get() {
        return new DefaultCustomContentApi(this.transactionProvider, (ContentExtension) this.extensionProvider.get());
    }
}
