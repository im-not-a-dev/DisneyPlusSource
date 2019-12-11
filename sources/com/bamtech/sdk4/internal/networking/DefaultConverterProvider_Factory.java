package com.bamtech.sdk4.internal.networking;

import com.bamtech.core.networking.converters.Converter;
import com.bamtech.shadow.dagger.p048a.C2111c;
import javax.inject.Provider;

public final class DefaultConverterProvider_Factory implements C2111c<DefaultConverterProvider> {
    private final Provider<Converter> dustEventConverterProvider;
    private final Provider<Converter> identityConverterWithNullsProvider;
    private final Provider<Converter> identityForStorageProvider;
    private final Provider<Converter> identityProvider;
    private final Provider<Converter> p3_1519748Provider;
    private final Provider<Converter> snakeProvider;
    private final Provider<Converter> stringProvider;

    public DefaultConverterProvider_Factory(Provider<Converter> provider, Provider<Converter> provider2, Provider<Converter> provider3, Provider<Converter> provider4, Provider<Converter> provider5, Provider<Converter> provider6, Provider<Converter> provider7) {
        this.identityProvider = provider;
        this.snakeProvider = provider2;
        this.stringProvider = provider3;
        this.p3_1519748Provider = provider4;
        this.identityConverterWithNullsProvider = provider5;
        this.identityForStorageProvider = provider6;
        this.dustEventConverterProvider = provider7;
    }

    public static DefaultConverterProvider_Factory create(Provider<Converter> provider, Provider<Converter> provider2, Provider<Converter> provider3, Provider<Converter> provider4, Provider<Converter> provider5, Provider<Converter> provider6, Provider<Converter> provider7) {
        DefaultConverterProvider_Factory defaultConverterProvider_Factory = new DefaultConverterProvider_Factory(provider, provider2, provider3, provider4, provider5, provider6, provider7);
        return defaultConverterProvider_Factory;
    }

    public DefaultConverterProvider get() {
        DefaultConverterProvider defaultConverterProvider = new DefaultConverterProvider((Converter) this.identityProvider.get(), (Converter) this.snakeProvider.get(), (Converter) this.stringProvider.get(), (Converter) this.p3_1519748Provider.get(), (Converter) this.identityConverterWithNullsProvider.get(), (Converter) this.identityForStorageProvider.get(), (Converter) this.dustEventConverterProvider.get());
        return defaultConverterProvider;
    }
}
