package com.bamtech.sdk4.internal.account;

import com.bamtech.shadow.dagger.p048a.C2111c;
import javax.inject.Provider;

public final class DefaultAccountClient_Factory implements C2111c<DefaultAccountClient> {
    private final Provider<DefaultCreateAccountClient> createAccountClientProvider;
    private final Provider<DefaultCreateAccountGrantClient> createAccountGrantClientProvider;
    private final Provider<DefaultGetAccountClient> getAccountClientProvider;
    private final Provider<DefaultUpdateAccountClient> updateAccountAttributesClientProvider;

    public DefaultAccountClient_Factory(Provider<DefaultCreateAccountClient> provider, Provider<DefaultCreateAccountGrantClient> provider2, Provider<DefaultGetAccountClient> provider3, Provider<DefaultUpdateAccountClient> provider4) {
        this.createAccountClientProvider = provider;
        this.createAccountGrantClientProvider = provider2;
        this.getAccountClientProvider = provider3;
        this.updateAccountAttributesClientProvider = provider4;
    }

    public static DefaultAccountClient_Factory create(Provider<DefaultCreateAccountClient> provider, Provider<DefaultCreateAccountGrantClient> provider2, Provider<DefaultGetAccountClient> provider3, Provider<DefaultUpdateAccountClient> provider4) {
        return new DefaultAccountClient_Factory(provider, provider2, provider3, provider4);
    }

    public DefaultAccountClient get() {
        return new DefaultAccountClient((DefaultCreateAccountClient) this.createAccountClientProvider.get(), (DefaultCreateAccountGrantClient) this.createAccountGrantClientProvider.get(), (DefaultGetAccountClient) this.getAccountClientProvider.get(), (DefaultUpdateAccountClient) this.updateAccountAttributesClientProvider.get());
    }
}
