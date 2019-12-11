package com.bamtechmedia.dominguez.analytics.p058p0;

import com.bamtechmedia.dominguez.analytics.p059q0.C2452d;
import javax.inject.Provider;
import p512h.p515d.C11895c;
import p520io.reactivex.C11969r;

/* renamed from: com.bamtechmedia.dominguez.analytics.p0.b */
/* compiled from: AnalyticsLoginAction_Factory */
public final class C2441b implements C11895c<C2438a> {

    /* renamed from: a */
    private final Provider<C2452d> f6730a;

    /* renamed from: b */
    private final Provider<C11969r> f6731b;

    public C2441b(Provider<C2452d> provider, Provider<C11969r> provider2) {
        this.f6730a = provider;
        this.f6731b = provider2;
    }

    /* renamed from: a */
    public static C2441b m9002a(Provider<C2452d> provider, Provider<C11969r> provider2) {
        return new C2441b(provider, provider2);
    }

    public C2438a get() {
        return new C2438a((C2452d) this.f6730a.get(), (C11969r) this.f6731b.get());
    }
}
