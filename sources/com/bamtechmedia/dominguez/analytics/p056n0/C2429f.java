package com.bamtechmedia.dominguez.analytics.p056n0;

import com.bamtech.sdk4.useractivity.UserActivityApi;
import javax.inject.Provider;
import p512h.p515d.C11895c;

/* renamed from: com.bamtechmedia.dominguez.analytics.n0.f */
/* compiled from: GlimpseWrapper_Factory */
public final class C2429f implements C11895c<C2428e> {

    /* renamed from: a */
    private final Provider<UserActivityApi> f6692a;

    public C2429f(Provider<UserActivityApi> provider) {
        this.f6692a = provider;
    }

    /* renamed from: a */
    public static C2429f m8989a(Provider<UserActivityApi> provider) {
        return new C2429f(provider);
    }

    public C2428e get() {
        return new C2428e((UserActivityApi) this.f6692a.get());
    }
}
