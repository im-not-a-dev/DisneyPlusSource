package com.bamtechmedia.dominguez.legal;

import android.content.Context;
import javax.inject.Provider;
import p512h.p515d.C11895c;
import p512h.p515d.C11897e;

public final class FeatureLegalModule_ProvideLegalApiConfigFactory implements C11895c<LegalApiConfig> {
    private final Provider<Context> contextProvider;

    public FeatureLegalModule_ProvideLegalApiConfigFactory(Provider<Context> provider) {
        this.contextProvider = provider;
    }

    public static FeatureLegalModule_ProvideLegalApiConfigFactory create(Provider<Context> provider) {
        return new FeatureLegalModule_ProvideLegalApiConfigFactory(provider);
    }

    public static LegalApiConfig provideLegalApiConfig(Context context) {
        LegalApiConfig provideLegalApiConfig = FeatureLegalModule.provideLegalApiConfig(context);
        C11897e.m38130a(provideLegalApiConfig, "Cannot return null from a non-@Nullable @Provides method");
        return provideLegalApiConfig;
    }

    public LegalApiConfig get() {
        return provideLegalApiConfig((Context) this.contextProvider.get());
    }
}
