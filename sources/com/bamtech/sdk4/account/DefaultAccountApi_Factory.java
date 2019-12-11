package com.bamtech.sdk4.account;

import com.bamtech.sdk4.extension.account.AccountExtension;
import com.bamtech.sdk4.internal.service.ServiceTransaction;
import com.bamtech.shadow.dagger.p048a.C2111c;
import javax.inject.Provider;

public final class DefaultAccountApi_Factory implements C2111c<DefaultAccountApi> {
    private final Provider<AccountExtension> accountExtensionProvider;
    private final Provider<ServiceTransaction> transactionProvider;

    public DefaultAccountApi_Factory(Provider<ServiceTransaction> provider, Provider<AccountExtension> provider2) {
        this.transactionProvider = provider;
        this.accountExtensionProvider = provider2;
    }

    public static DefaultAccountApi_Factory create(Provider<ServiceTransaction> provider, Provider<AccountExtension> provider2) {
        return new DefaultAccountApi_Factory(provider, provider2);
    }

    public DefaultAccountApi get() {
        return new DefaultAccountApi(this.transactionProvider, (AccountExtension) this.accountExtensionProvider.get());
    }
}
