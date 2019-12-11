package com.bamtechmedia.dominguez.auth;

import androidx.fragment.app.Fragment;
import com.bamtechmedia.dominguez.auth.p061o0.p063i.C2754c;
import com.bamtechmedia.dominguez.auth.p068t0.C2957f;
import com.bamtechmedia.dominguez.auth.p070v0.p071g.C3064g;
import com.bamtechmedia.dominguez.auth.p070v0.p072h.C3114l;
import com.bamtechmedia.dominguez.auth.register.C2833f;
import com.bamtechmedia.dominguez.core.p218n.C5791e;
import com.bamtechmedia.dominguez.core.p218n.C5792f;
import com.bamtechmedia.dominguez.core.p218n.C5798g;
import p163g.p201e.p203b.p307o.p309q.C7631a;
import p163g.p201e.p203b.p411h0.C10629k;

/* renamed from: com.bamtechmedia.dominguez.auth.z */
/* compiled from: AuthTvHostRouterImpl.kt */
public final class C3145z implements C2754c {

    /* renamed from: a */
    private final C5792f f8066a;

    /* renamed from: b */
    private final C2727m0 f8067b;

    public C3145z(C5792f fVar, C2727m0 m0Var) {
        this.f8066a = fVar;
        this.f8067b = m0Var;
    }

    /* renamed from: a */
    public void mo11774a(boolean z, boolean z2, boolean z3) {
        Fragment fragment;
        if (!z) {
            fragment = C3064g.f7939g0.mo12094a(z2);
        } else if (!this.f8067b.mo11744a()) {
            fragment = new C3114l();
        } else {
            return;
        }
        C5798g gVar = C5798g.f13582d;
        m11003a(fragment, z3, z3 ? gVar.mo17705c() : gVar.mo17703a());
    }

    /* renamed from: b */
    public void mo11765b() {
        m11003a((Fragment) new C2957f(), false, C5798g.f13582d.mo17703a());
    }

    /* renamed from: c */
    public void mo11767c() {
        this.f8066a.mo17696a((Fragment) new C10629k());
    }

    /* renamed from: d */
    public void mo11766d() {
        m11003a((Fragment) new C2833f(), false, C5798g.f13582d.mo17703a());
    }

    /* renamed from: e */
    public void mo11768e() {
        this.f8066a.mo17696a((Fragment) new C3064g());
    }

    /* renamed from: a */
    public void mo11764a() {
        m11004a(this, new C7631a(), false, null, 6, null);
    }

    /* renamed from: a */
    static /* synthetic */ void m11004a(C3145z zVar, Fragment fragment, boolean z, C5791e eVar, int i, Object obj) {
        if ((i & 2) != 0) {
            z = true;
        }
        if ((i & 4) != 0) {
            eVar = null;
        }
        zVar.m11003a(fragment, z, eVar);
    }

    /* renamed from: a */
    private final void m11003a(Fragment fragment, boolean z, C5791e eVar) {
        C5792f.m18757a(this.f8066a, fragment, z, eVar, null, null, 24, null);
    }
}
