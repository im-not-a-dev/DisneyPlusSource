package com.bamtechmedia.dominguez.profiles.p262t1;

import com.bamtechmedia.dominguez.profiles.C6667g1;
import com.bamtechmedia.dominguez.profiles.p263u1.C6859b;
import javax.inject.Provider;
import p512h.p515d.C11895c;
import p520io.reactivex.C11969r;

/* renamed from: com.bamtechmedia.dominguez.profiles.t1.c */
/* compiled from: ProfilesAnalyticsContributor_Factory */
public final class C6854c implements C11895c<C6848b> {

    /* renamed from: a */
    private final Provider<C6667g1> f15298a;

    /* renamed from: b */
    private final Provider<C11969r> f15299b;

    /* renamed from: c */
    private final Provider<C6859b> f15300c;

    public C6854c(Provider<C6667g1> provider, Provider<C11969r> provider2, Provider<C6859b> provider3) {
        this.f15298a = provider;
        this.f15299b = provider2;
        this.f15300c = provider3;
    }

    /* renamed from: a */
    public static C6854c m21016a(Provider<C6667g1> provider, Provider<C11969r> provider2, Provider<C6859b> provider3) {
        return new C6854c(provider, provider2, provider3);
    }

    public C6848b get() {
        return new C6848b((C6667g1) this.f15298a.get(), (C11969r) this.f15299b.get(), (C6859b) this.f15300c.get());
    }
}
