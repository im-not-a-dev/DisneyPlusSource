package com.bamtech.sdk4.internal.networking;

import com.bamtech.core.networking.converters.Converter;
import com.bamtech.shadow.dagger.p048a.C2111c;
import com.bamtech.shadow.dagger.p048a.C2113e;

public final class NetworkModule_StringConverterFactory implements C2111c<Converter> {
    private final NetworkModule module;

    public NetworkModule_StringConverterFactory(NetworkModule networkModule) {
        this.module = networkModule;
    }

    public static NetworkModule_StringConverterFactory create(NetworkModule networkModule) {
        return new NetworkModule_StringConverterFactory(networkModule);
    }

    public Converter get() {
        Converter stringConverter = this.module.stringConverter();
        C2113e.m8178a(stringConverter, "Cannot return null from a non-@Nullable @Provides method");
        return stringConverter;
    }
}
