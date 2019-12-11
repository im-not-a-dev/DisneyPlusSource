package com.bamtech.sdk4.content;

import com.bamtech.sdk4.internal.networking.ConverterProvider;
import com.bamtech.shadow.dagger.p048a.C2111c;
import javax.inject.Provider;

public final class GraphQlConverterProvider_Factory implements C2111c<GraphQlConverterProvider> {
    private final Provider<ConverterProvider> convertersProvider;

    public GraphQlConverterProvider_Factory(Provider<ConverterProvider> provider) {
        this.convertersProvider = provider;
    }

    public static GraphQlConverterProvider_Factory create(Provider<ConverterProvider> provider) {
        return new GraphQlConverterProvider_Factory(provider);
    }

    public GraphQlConverterProvider get() {
        return new GraphQlConverterProvider((ConverterProvider) this.convertersProvider.get());
    }
}
