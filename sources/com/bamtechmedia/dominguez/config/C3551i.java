package com.bamtechmedia.dominguez.config;

import com.bamtechmedia.dominguez.config.C3532h.C3533a;
import com.bamtechmedia.dominguez.core.p214j.C5756a;
import javax.inject.Provider;
import okhttp3.OkHttpClient;
import p163g.p500m.p501a.C11760v;
import p512h.p515d.C11895c;

/* renamed from: com.bamtechmedia.dominguez.config.i */
/* compiled from: ConfigLoader_Factory_Factory */
public final class C3551i implements C11895c<C3533a> {

    /* renamed from: a */
    private final Provider<OkHttpClient> f8872a;

    /* renamed from: b */
    private final Provider<C11760v> f8873b;

    /* renamed from: c */
    private final Provider<C5756a> f8874c;

    /* renamed from: d */
    private final Provider<C3561m0> f8875d;

    public C3551i(Provider<OkHttpClient> provider, Provider<C11760v> provider2, Provider<C5756a> provider3, Provider<C3561m0> provider4) {
        this.f8872a = provider;
        this.f8873b = provider2;
        this.f8874c = provider3;
        this.f8875d = provider4;
    }

    /* renamed from: a */
    public static C3551i m11979a(Provider<OkHttpClient> provider, Provider<C11760v> provider2, Provider<C5756a> provider3, Provider<C3561m0> provider4) {
        return new C3551i(provider, provider2, provider3, provider4);
    }

    public C3533a get() {
        return new C3533a(this.f8872a, this.f8873b, this.f8874c, this.f8875d);
    }
}
