package com.bamtech.sdk4.internal.identity.bam;

import com.bamtech.core.networking.converters.Converter;
import com.bamtech.shadow.dagger.p048a.C2111c;
import com.bamtech.shadow.dagger.p048a.C2113e;
import com.bamtech.shadow.gson.GsonBuilder;
import javax.inject.Provider;

public final class AuthenticationFlowConverterModule_IdentityConverterFactory implements C2111c<Converter> {
    private final Provider<GsonBuilder> gsonBuilderProvider;
    private final AuthenticationFlowConverterModule module;

    public AuthenticationFlowConverterModule_IdentityConverterFactory(AuthenticationFlowConverterModule authenticationFlowConverterModule, Provider<GsonBuilder> provider) {
        this.module = authenticationFlowConverterModule;
        this.gsonBuilderProvider = provider;
    }

    public static AuthenticationFlowConverterModule_IdentityConverterFactory create(AuthenticationFlowConverterModule authenticationFlowConverterModule, Provider<GsonBuilder> provider) {
        return new AuthenticationFlowConverterModule_IdentityConverterFactory(authenticationFlowConverterModule, provider);
    }

    public Converter get() {
        Converter identityConverter = this.module.identityConverter((GsonBuilder) this.gsonBuilderProvider.get());
        C2113e.m8178a(identityConverter, "Cannot return null from a non-@Nullable @Provides method");
        return identityConverter;
    }
}
