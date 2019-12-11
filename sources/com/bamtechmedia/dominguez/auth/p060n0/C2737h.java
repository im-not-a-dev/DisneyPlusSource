package com.bamtechmedia.dominguez.auth.p060n0;

import com.bamtechmedia.dominguez.auth.C2721j0;
import com.bamtechmedia.dominguez.auth.p061o0.p063i.C2752a;
import com.bamtechmedia.dominguez.core.p218n.C5792f;
import p163g.p201e.p203b.p299m.C7547h;
import p163g.p201e.p203b.p299m.p300y.C7576g;

/* renamed from: com.bamtechmedia.dominguez.auth.n0.h */
/* compiled from: AccountUpdateRouterImpl.kt */
public final class C2737h implements C2752a {

    /* renamed from: a */
    private final C5792f f7490a;

    /* renamed from: b */
    private final C7547h f7491b;

    public C2737h(C5792f fVar, C7547h hVar) {
        this.f7490a = fVar;
        this.f7491b = hVar;
    }

    /* renamed from: a */
    public void mo11748a() {
        this.f7490a.mo17682a();
        mo11749a(C2721j0.account_verified_flash_message);
    }

    /* renamed from: b */
    public void mo11750b() {
        this.f7490a.mo17682a();
        mo11749a(C2721j0.account_notify_password_updated);
    }

    /* renamed from: c */
    public void mo11751c() {
        mo11749a(C2721j0.account_notify_email);
    }

    /* renamed from: a */
    public final void mo11749a(int i) {
        this.f7491b.mo20489a(C7576g.SUCCESS, i);
    }
}
