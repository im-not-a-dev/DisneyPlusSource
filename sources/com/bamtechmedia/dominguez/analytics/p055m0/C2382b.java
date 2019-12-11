package com.bamtechmedia.dominguez.analytics.p055m0;

import com.bamtechmedia.dominguez.analytics.p059q0.C2449a;
import javax.inject.Provider;
import p512h.p515d.C11895c;
import p520io.reactivex.C11969r;

/* renamed from: com.bamtechmedia.dominguez.analytics.m0.b */
/* compiled from: AcquisitionContributor_Factory */
public final class C2382b implements C11895c<C2380a> {

    /* renamed from: a */
    private final Provider<C2449a> f6607a;

    /* renamed from: b */
    private final Provider<C11969r> f6608b;

    public C2382b(Provider<C2449a> provider, Provider<C11969r> provider2) {
        this.f6607a = provider;
        this.f6608b = provider2;
    }

    /* renamed from: a */
    public static C2382b m8918a(Provider<C2449a> provider, Provider<C11969r> provider2) {
        return new C2382b(provider, provider2);
    }

    public C2380a get() {
        return new C2380a((C2449a) this.f6607a.get(), (C11969r) this.f6608b.get());
    }
}
