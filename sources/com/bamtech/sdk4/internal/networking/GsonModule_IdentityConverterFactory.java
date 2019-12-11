package com.bamtech.sdk4.internal.networking;

import com.bamtech.core.networking.converters.Converter;
import com.bamtech.shadow.dagger.p048a.C2111c;
import com.bamtech.shadow.dagger.p048a.C2113e;

public final class GsonModule_IdentityConverterFactory implements C2111c<Converter> {
    private final GsonModule module;

    public GsonModule_IdentityConverterFactory(GsonModule gsonModule) {
        this.module = gsonModule;
    }

    public static GsonModule_IdentityConverterFactory create(GsonModule gsonModule) {
        return new GsonModule_IdentityConverterFactory(gsonModule);
    }

    public Converter get() {
        Converter identityConverter = this.module.identityConverter();
        C2113e.m8178a(identityConverter, "Cannot return null from a non-@Nullable @Provides method");
        return identityConverter;
    }
}
