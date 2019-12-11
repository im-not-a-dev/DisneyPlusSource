package com.bamtech.sdk4.internal.networking;

import com.bamtech.core.networking.converters.Converter;
import com.bamtech.shadow.dagger.p048a.C2111c;
import com.bamtech.shadow.dagger.p048a.C2113e;

public final class NetworkModule_RawBytesConverterFactory implements C2111c<Converter> {
    private final NetworkModule module;

    public NetworkModule_RawBytesConverterFactory(NetworkModule networkModule) {
        this.module = networkModule;
    }

    public static NetworkModule_RawBytesConverterFactory create(NetworkModule networkModule) {
        return new NetworkModule_RawBytesConverterFactory(networkModule);
    }

    public Converter get() {
        Converter rawBytesConverter = this.module.rawBytesConverter();
        C2113e.m8178a(rawBytesConverter, "Cannot return null from a non-@Nullable @Provides method");
        return rawBytesConverter;
    }
}
