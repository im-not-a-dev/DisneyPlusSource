package com.bamtech.sdk4.internal.networking;

import com.bamtech.core.networking.converters.Converter;
import com.bamtech.shadow.dagger.p048a.C2111c;
import com.bamtech.shadow.dagger.p048a.C2113e;

public final class GsonModule_SnakeConverterFactory implements C2111c<Converter> {
    private final GsonModule module;

    public GsonModule_SnakeConverterFactory(GsonModule gsonModule) {
        this.module = gsonModule;
    }

    public static GsonModule_SnakeConverterFactory create(GsonModule gsonModule) {
        return new GsonModule_SnakeConverterFactory(gsonModule);
    }

    public Converter get() {
        Converter snakeConverter = this.module.snakeConverter();
        C2113e.m8178a(snakeConverter, "Cannot return null from a non-@Nullable @Provides method");
        return snakeConverter;
    }
}
