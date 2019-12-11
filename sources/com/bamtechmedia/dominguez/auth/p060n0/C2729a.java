package com.bamtechmedia.dominguez.auth.p060n0;

import com.bamtech.sdk4.account.AccountApi;
import com.bamtechmedia.dominguez.auth.C3140w;
import com.bamtechmedia.dominguez.auth.p061o0.p062h.C2750c;
import com.bamtechmedia.dominguez.auth.p067s0.C2887n;
import com.bamtechmedia.dominguez.auth.p069u0.C2997f;
import com.google.common.base.Optional;
import javax.inject.Provider;
import p163g.p201e.p203b.p307o.p308p.C7626a;

/* renamed from: com.bamtechmedia.dominguez.auth.n0.a */
/* compiled from: lambda */
public final /* synthetic */ class C2729a implements Provider {

    /* renamed from: a */
    private final /* synthetic */ C2750c f7481a;

    /* renamed from: b */
    private final /* synthetic */ C2997f f7482b;

    /* renamed from: c */
    private final /* synthetic */ C3140w f7483c;

    /* renamed from: d */
    private final /* synthetic */ AccountApi f7484d;

    /* renamed from: e */
    private final /* synthetic */ Optional f7485e;

    /* renamed from: f */
    private final /* synthetic */ C7626a f7486f;

    /* renamed from: g */
    private final /* synthetic */ C2887n f7487g;

    public /* synthetic */ C2729a(C2750c cVar, C2997f fVar, C3140w wVar, AccountApi accountApi, Optional optional, C7626a aVar, C2887n nVar) {
        this.f7481a = cVar;
        this.f7482b = fVar;
        this.f7483c = wVar;
        this.f7484d = accountApi;
        this.f7485e = optional;
        this.f7486f = aVar;
        this.f7487g = nVar;
    }

    public final Object get() {
        return C2730b.m10365a(this.f7481a, this.f7482b, this.f7483c, this.f7484d, this.f7485e, this.f7486f, this.f7487g);
    }
}
