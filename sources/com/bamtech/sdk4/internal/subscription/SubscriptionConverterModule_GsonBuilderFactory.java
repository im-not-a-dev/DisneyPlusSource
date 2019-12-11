package com.bamtech.sdk4.internal.subscription;

import com.bamtech.shadow.dagger.p048a.C2111c;
import com.bamtech.shadow.dagger.p048a.C2113e;
import com.bamtech.shadow.gson.GsonBuilder;

public final class SubscriptionConverterModule_GsonBuilderFactory implements C2111c<GsonBuilder> {
    private final SubscriptionConverterModule module;

    public SubscriptionConverterModule_GsonBuilderFactory(SubscriptionConverterModule subscriptionConverterModule) {
        this.module = subscriptionConverterModule;
    }

    public static SubscriptionConverterModule_GsonBuilderFactory create(SubscriptionConverterModule subscriptionConverterModule) {
        return new SubscriptionConverterModule_GsonBuilderFactory(subscriptionConverterModule);
    }

    public GsonBuilder get() {
        GsonBuilder gsonBuilder = this.module.gsonBuilder();
        C2113e.m8178a(gsonBuilder, "Cannot return null from a non-@Nullable @Provides method");
        return gsonBuilder;
    }
}
