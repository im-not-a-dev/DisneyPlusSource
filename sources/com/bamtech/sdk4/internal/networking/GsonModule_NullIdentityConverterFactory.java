package com.bamtech.sdk4.internal.networking;

import com.bamtech.core.networking.converters.Converter;
import com.bamtech.shadow.dagger.p048a.C2111c;
import com.bamtech.shadow.dagger.p048a.C2113e;

public final class GsonModule_NullIdentityConverterFactory implements C2111c<Converter> {
    private final GsonModule module;

    public GsonModule_NullIdentityConverterFactory(GsonModule gsonModule) {
        this.module = gsonModule;
    }

    public static GsonModule_NullIdentityConverterFactory create(GsonModule gsonModule) {
        return new GsonModule_NullIdentityConverterFactory(gsonModule);
    }

    public Converter get() {
        Converter nullIdentityConverter = this.module.nullIdentityConverter();
        C2113e.m8178a(nullIdentityConverter, "Cannot return null from a non-@Nullable @Provides method");
        return nullIdentityConverter;
    }
}
