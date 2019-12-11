package com.bamtechmedia.dominguez.analytics.p055m0;

import com.bamtechmedia.dominguez.analytics.p059q0.C2452d;
import com.bamtechmedia.dominguez.analytics.p059q0.C2467o;
import javax.inject.Provider;
import p512h.p515d.C11895c;
import p520io.reactivex.C11969r;

/* renamed from: com.bamtechmedia.dominguez.analytics.m0.l */
/* compiled from: LoginStatusContributor_Factory */
public final class C2398l implements C11895c<C2396k> {

    /* renamed from: a */
    private final Provider<C2452d> f6638a;

    /* renamed from: b */
    private final Provider<C2467o> f6639b;

    /* renamed from: c */
    private final Provider<C11969r> f6640c;

    public C2398l(Provider<C2452d> provider, Provider<C2467o> provider2, Provider<C11969r> provider3) {
        this.f6638a = provider;
        this.f6639b = provider2;
        this.f6640c = provider3;
    }

    /* renamed from: a */
    public static C2398l m8942a(Provider<C2452d> provider, Provider<C2467o> provider2, Provider<C11969r> provider3) {
        return new C2398l(provider, provider2, provider3);
    }

    public C2396k get() {
        return new C2396k((C2452d) this.f6638a.get(), (C2467o) this.f6639b.get(), (C11969r) this.f6640c.get());
    }
}
