package com.bamtech.sdk4.purchase.bamnet;

import com.bamtech.sdk4.purchase.PurchaseExtension;
import com.bamtech.shadow.dagger.p048a.C2111c;
import javax.inject.Provider;

public final class DefaultBamnetPurchaseApi_Factory implements C2111c<DefaultBamnetPurchaseApi> {
    private final Provider<PurchaseExtension> extensionProvider;

    public DefaultBamnetPurchaseApi_Factory(Provider<PurchaseExtension> provider) {
        this.extensionProvider = provider;
    }

    public static DefaultBamnetPurchaseApi_Factory create(Provider<PurchaseExtension> provider) {
        return new DefaultBamnetPurchaseApi_Factory(provider);
    }

    public DefaultBamnetPurchaseApi get() {
        return new DefaultBamnetPurchaseApi((PurchaseExtension) this.extensionProvider.get());
    }
}
