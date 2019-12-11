package com.bamtech.sdk4.subscription;

import com.bamtech.shadow.dagger.p048a.C2111c;
import javax.inject.Provider;

public final class DefaultSubscriptionApi_Factory implements C2111c<DefaultSubscriptionApi> {
    private final Provider<SubscriptionExtension> extensionProvider;

    public DefaultSubscriptionApi_Factory(Provider<SubscriptionExtension> provider) {
        this.extensionProvider = provider;
    }

    public static DefaultSubscriptionApi_Factory create(Provider<SubscriptionExtension> provider) {
        return new DefaultSubscriptionApi_Factory(provider);
    }

    public DefaultSubscriptionApi get() {
        return new DefaultSubscriptionApi((SubscriptionExtension) this.extensionProvider.get());
    }
}
