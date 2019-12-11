package com.bamtechmedia.dominguez.portability.availability;

import androidx.lifecycle.C0722m;
import com.bamtech.sdk4.Session;
import javax.inject.Provider;
import p512h.p515d.C11895c;
import p520io.reactivex.Single;

/* renamed from: com.bamtechmedia.dominguez.portability.availability.c */
/* compiled from: ServiceAvailabilityStateImpl_Factory */
public final class C6604c implements C11895c<ServiceAvailabilityStateImpl> {

    /* renamed from: a */
    private final Provider<Single<Session>> f14901a;

    /* renamed from: b */
    private final Provider<C6602a> f14902b;

    /* renamed from: c */
    private final Provider<C0722m> f14903c;

    public C6604c(Provider<Single<Session>> provider, Provider<C6602a> provider2, Provider<C0722m> provider3) {
        this.f14901a = provider;
        this.f14902b = provider2;
        this.f14903c = provider3;
    }

    /* renamed from: a */
    public static C6604c m20518a(Provider<Single<Session>> provider, Provider<C6602a> provider2, Provider<C0722m> provider3) {
        return new C6604c(provider, provider2, provider3);
    }

    public ServiceAvailabilityStateImpl get() {
        return new ServiceAvailabilityStateImpl((Single) this.f14901a.get(), (C6602a) this.f14902b.get(), (C0722m) this.f14903c.get());
    }
}
