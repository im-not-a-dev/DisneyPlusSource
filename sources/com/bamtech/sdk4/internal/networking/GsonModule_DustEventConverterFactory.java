package com.bamtech.sdk4.internal.networking;

import com.bamtech.core.networking.converters.Converter;
import com.bamtech.shadow.dagger.p048a.C2111c;
import com.bamtech.shadow.dagger.p048a.C2113e;

public final class GsonModule_DustEventConverterFactory implements C2111c<Converter> {
    private final GsonModule module;

    public GsonModule_DustEventConverterFactory(GsonModule gsonModule) {
        this.module = gsonModule;
    }

    public static GsonModule_DustEventConverterFactory create(GsonModule gsonModule) {
        return new GsonModule_DustEventConverterFactory(gsonModule);
    }

    public Converter get() {
        Converter dustEventConverter = this.module.dustEventConverter();
        C2113e.m8178a(dustEventConverter, "Cannot return null from a non-@Nullable @Provides method");
        return dustEventConverter;
    }
}
