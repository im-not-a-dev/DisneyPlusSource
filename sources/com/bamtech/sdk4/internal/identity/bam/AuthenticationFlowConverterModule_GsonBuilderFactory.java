package com.bamtech.sdk4.internal.identity.bam;

import com.bamtech.shadow.dagger.p048a.C2111c;
import com.bamtech.shadow.dagger.p048a.C2113e;
import com.bamtech.shadow.gson.GsonBuilder;

public final class AuthenticationFlowConverterModule_GsonBuilderFactory implements C2111c<GsonBuilder> {
    private final AuthenticationFlowConverterModule module;

    public AuthenticationFlowConverterModule_GsonBuilderFactory(AuthenticationFlowConverterModule authenticationFlowConverterModule) {
        this.module = authenticationFlowConverterModule;
    }

    public static AuthenticationFlowConverterModule_GsonBuilderFactory create(AuthenticationFlowConverterModule authenticationFlowConverterModule) {
        return new AuthenticationFlowConverterModule_GsonBuilderFactory(authenticationFlowConverterModule);
    }

    public GsonBuilder get() {
        GsonBuilder gsonBuilder = this.module.gsonBuilder();
        C2113e.m8178a(gsonBuilder, "Cannot return null from a non-@Nullable @Provides method");
        return gsonBuilder;
    }
}
