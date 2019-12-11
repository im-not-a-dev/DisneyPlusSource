package com.bamtechmedia.dominguez.auth;

import com.bamtech.sdk4.session.SessionState;
import com.bamtechmedia.dominguez.auth.p061o0.C2740b;
import com.bamtechmedia.dominguez.auth.p064p0.C2763b;
import com.bamtechmedia.dominguez.auth.p065q0.C2783b;
import javax.inject.Provider;
import p512h.p515d.C11895c;
import p520io.reactivex.Single;

/* renamed from: com.bamtechmedia.dominguez.auth.b0 */
/* compiled from: LoadAuthStateActionImpl_Factory */
public final class C2703b0 implements C11895c<C2693a0> {

    /* renamed from: a */
    private final Provider<Single<SessionState>> f7457a;

    /* renamed from: b */
    private final Provider<C2783b> f7458b;

    /* renamed from: c */
    private final Provider<C2740b> f7459c;

    /* renamed from: d */
    private final Provider<C2763b> f7460d;

    public C2703b0(Provider<Single<SessionState>> provider, Provider<C2783b> provider2, Provider<C2740b> provider3, Provider<C2763b> provider4) {
        this.f7457a = provider;
        this.f7458b = provider2;
        this.f7459c = provider3;
        this.f7460d = provider4;
    }

    /* renamed from: a */
    public static C2703b0 m10336a(Provider<Single<SessionState>> provider, Provider<C2783b> provider2, Provider<C2740b> provider3, Provider<C2763b> provider4) {
        return new C2703b0(provider, provider2, provider3, provider4);
    }

    public C2693a0 get() {
        return new C2693a0((Single) this.f7457a.get(), (C2783b) this.f7458b.get(), (C2740b) this.f7459c.get(), (C2763b) this.f7460d.get());
    }
}
