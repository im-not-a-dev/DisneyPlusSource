package com.bamtech.sdk4.internal.networking;

import com.bamtech.core.networking.converters.Converter;
import com.bamtech.shadow.dagger.p048a.C2111c;
import com.bamtech.shadow.dagger.p048a.C2113e;

public final class GsonModule_IdentityConverterForStorageFactory implements C2111c<Converter> {
    private final GsonModule module;

    public GsonModule_IdentityConverterForStorageFactory(GsonModule gsonModule) {
        this.module = gsonModule;
    }

    public static GsonModule_IdentityConverterForStorageFactory create(GsonModule gsonModule) {
        return new GsonModule_IdentityConverterForStorageFactory(gsonModule);
    }

    public Converter get() {
        Converter identityConverterForStorage = this.module.identityConverterForStorage();
        C2113e.m8178a(identityConverterForStorage, "Cannot return null from a non-@Nullable @Provides method");
        return identityConverterForStorage;
    }
}
