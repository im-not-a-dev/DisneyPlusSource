package com.bamtech.sdk4.session;

import com.bamtech.sdk4.internal.token.ExternalGrantExchange;
import com.bamtech.shadow.dagger.p048a.C2111c;
import javax.inject.Provider;

public final class DefaultSessionExtension_Factory implements C2111c<DefaultSessionExtension> {
    private final Provider<ExternalGrantExchange> grantExchangeProvider;

    public DefaultSessionExtension_Factory(Provider<ExternalGrantExchange> provider) {
        this.grantExchangeProvider = provider;
    }

    public static DefaultSessionExtension_Factory create(Provider<ExternalGrantExchange> provider) {
        return new DefaultSessionExtension_Factory(provider);
    }

    public DefaultSessionExtension get() {
        return new DefaultSessionExtension((ExternalGrantExchange) this.grantExchangeProvider.get());
    }
}
