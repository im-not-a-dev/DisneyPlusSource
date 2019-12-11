package com.bamtech.sdk4.internal.media;

import android.content.Context;
import com.bamtech.shadow.dagger.p048a.C2111c;
import javax.inject.Provider;

public final class CacheProvider_Factory implements C2111c<CacheProvider> {
    private final Provider<Context> contextProvider;

    public CacheProvider_Factory(Provider<Context> provider) {
        this.contextProvider = provider;
    }

    public static CacheProvider_Factory create(Provider<Context> provider) {
        return new CacheProvider_Factory(provider);
    }

    public CacheProvider get() {
        return new CacheProvider((Context) this.contextProvider.get());
    }
}
