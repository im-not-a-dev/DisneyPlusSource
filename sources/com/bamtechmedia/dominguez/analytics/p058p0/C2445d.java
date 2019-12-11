package com.bamtechmedia.dominguez.analytics.p058p0;

import com.bamtechmedia.dominguez.analytics.p059q0.C2452d;
import javax.inject.Provider;
import p512h.p515d.C11895c;
import p520io.reactivex.C11969r;

/* renamed from: com.bamtechmedia.dominguez.analytics.p0.d */
/* compiled from: AnalyticsLogoutAction_Factory */
public final class C2445d implements C11895c<C2442c> {

    /* renamed from: a */
    private final Provider<C2452d> f6736a;

    /* renamed from: b */
    private final Provider<C11969r> f6737b;

    public C2445d(Provider<C2452d> provider, Provider<C11969r> provider2) {
        this.f6736a = provider;
        this.f6737b = provider2;
    }

    /* renamed from: a */
    public static C2445d m9007a(Provider<C2452d> provider, Provider<C11969r> provider2) {
        return new C2445d(provider, provider2);
    }

    public C2442c get() {
        return new C2442c((C2452d) this.f6736a.get(), (C11969r) this.f6737b.get());
    }
}
