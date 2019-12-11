package com.bamtechmedia.dominguez.analytics.p055m0;

import com.bamtech.sdk4.session.SessionInfo;
import javax.inject.Provider;
import p512h.p515d.C11895c;
import p520io.reactivex.C11969r;
import p520io.reactivex.Single;

/* renamed from: com.bamtechmedia.dominguez.analytics.m0.s */
/* compiled from: SdkContributor_Factory */
public final class C2412s implements C11895c<C2407r> {

    /* renamed from: a */
    private final Provider<Single<SessionInfo>> f6662a;

    /* renamed from: b */
    private final Provider<C11969r> f6663b;

    public C2412s(Provider<Single<SessionInfo>> provider, Provider<C11969r> provider2) {
        this.f6662a = provider;
        this.f6663b = provider2;
    }

    /* renamed from: a */
    public static C2412s m8959a(Provider<Single<SessionInfo>> provider, Provider<C11969r> provider2) {
        return new C2412s(provider, provider2);
    }

    public C2407r get() {
        return new C2407r((Single) this.f6662a.get(), (C11969r) this.f6663b.get());
    }
}
