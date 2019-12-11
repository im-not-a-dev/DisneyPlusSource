package com.bamtechmedia.dominguez.main.p235x;

import com.bamtechmedia.dominguez.auth.p061o0.C2740b;
import com.bamtechmedia.dominguez.core.p087h.C3828d;
import com.bamtechmedia.dominguez.main.p235x.C6219d.C6224e;
import com.bamtechmedia.dominguez.main.p235x.C6219d.C6225f;
import com.bamtechmedia.dominguez.main.p235x.C6219d.C6227h;
import com.bamtechmedia.dominguez.main.p235x.C6219d.C6232m;
import com.bamtechmedia.dominguez.main.p235x.C6219d.C6233n;
import com.bamtechmedia.dominguez.profiles.C6626c0;
import com.bamtechmedia.dominguez.profiles.C6722l1;
import com.bamtechmedia.dominguez.profiles.C6766q1;
import com.bamtechmedia.dominguez.profiles.C7022z0;
import p163g.p201e.p203b.p319v.C7884n;

/* renamed from: com.bamtechmedia.dominguez.main.x.b */
/* compiled from: AccountStateUpdater.kt */
public final class C6217b implements C2740b, C7884n, C7022z0, C3828d {

    /* renamed from: a */
    private final C6234e f14250a;

    /* renamed from: b */
    private final C6766q1 f14251b;

    /* renamed from: c */
    private final C6722l1 f14252c;

    public C6217b(C6234e eVar, C6766q1 q1Var, C6722l1 l1Var) {
        this.f14250a = eVar;
        this.f14251b = q1Var;
        this.f14252c = l1Var;
    }

    /* renamed from: a */
    public void mo11753a() {
        this.f14250a.mo18829a(C6225f.f14262a);
    }

    /* renamed from: b */
    public void mo13751b() {
        if (this.f14250a.mo18827a() instanceof C6232m) {
            C6216a.m19703a(this.f14250a, C6233n.f14270a);
        }
    }

    /* renamed from: c */
    public void mo18811c() {
        C6216a.m19703a(this.f14250a, C6233n.f14270a);
    }

    /* renamed from: a */
    public void mo11752a(boolean z) {
        C6722l1 l1Var = this.f14252c;
        if (z) {
            l1Var.mo19270d();
        } else {
            l1Var.mo19264a();
        }
        C6216a.m19703a(this.f14250a, z ? C6227h.f14264a : C6224e.f14261a);
    }

    /* renamed from: a */
    public void mo18810a(C6626c0 c0Var) {
        this.f14251b.mo19265a(c0Var.getProfileId());
        C6216a.m19703a(this.f14250a, new C6232m(c0Var));
    }
}
