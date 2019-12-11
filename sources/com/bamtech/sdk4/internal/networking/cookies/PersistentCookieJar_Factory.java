package com.bamtech.sdk4.internal.networking.cookies;

import com.bamtech.shadow.dagger.p048a.C2111c;
import javax.inject.Provider;

public final class PersistentCookieJar_Factory implements C2111c<PersistentCookieJar> {
    private final Provider<CookieCache> cacheProvider;
    private final Provider<CookiePersistor> persistorProvider;

    public PersistentCookieJar_Factory(Provider<CookieCache> provider, Provider<CookiePersistor> provider2) {
        this.cacheProvider = provider;
        this.persistorProvider = provider2;
    }

    public static PersistentCookieJar_Factory create(Provider<CookieCache> provider, Provider<CookiePersistor> provider2) {
        return new PersistentCookieJar_Factory(provider, provider2);
    }

    public PersistentCookieJar get() {
        return new PersistentCookieJar((CookieCache) this.cacheProvider.get(), (CookiePersistor) this.persistorProvider.get());
    }
}
