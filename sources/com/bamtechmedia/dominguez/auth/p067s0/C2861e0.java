package com.bamtechmedia.dominguez.auth.p067s0;

import androidx.fragment.app.Fragment;
import com.bamtechmedia.dominguez.analytics.C2378m;
import com.bamtechmedia.dominguez.auth.p061o0.p063i.C2755d;
import com.bamtechmedia.dominguez.core.p218n.C5792f;
import com.bamtechmedia.dominguez.core.p218n.C5798g;

/* renamed from: com.bamtechmedia.dominguez.auth.s0.e0 */
/* compiled from: OtpRouterImpl.kt */
public final class C2861e0 implements C2755d {

    /* renamed from: a */
    private final C5792f f7670a;

    /* renamed from: b */
    private final C2378m f7671b;

    public C2861e0(C5792f fVar, C2378m mVar) {
        this.f7670a = fVar;
        this.f7671b = mVar;
    }

    /* renamed from: a */
    public void mo11769a() {
        m10570a((Fragment) C2889o.f7691f0.mo11893a(this.f7671b), false);
    }

    /* renamed from: b */
    public void mo11771b() {
        m10571a(this, C2889o.f7691f0.mo11895a(), false, 2, null);
    }

    /* renamed from: a */
    public void mo11770a(String str, boolean z) {
        m10570a((Fragment) C2889o.f7691f0.mo11894a(str), z);
    }

    /* renamed from: a */
    static /* synthetic */ void m10571a(C2861e0 e0Var, Fragment fragment, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = true;
        }
        e0Var.m10570a(fragment, z);
    }

    /* renamed from: a */
    private final void m10570a(Fragment fragment, boolean z) {
        C5792f.m18757a(this.f7670a, fragment, z, C5798g.f13582d.mo17703a(), null, null, 24, null);
    }
}
