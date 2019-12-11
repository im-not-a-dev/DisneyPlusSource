package com.bamtechmedia.dominguez.profiles.p259s1;

import androidx.fragment.app.Fragment;
import com.bamtechmedia.dominguez.config.C3572r0;
import com.bamtechmedia.dominguez.core.utils.C5856o0;
import com.bamtechmedia.dominguez.dictionaries.C6090n;
import com.bamtechmedia.dominguez.profiles.C6628d;
import com.bamtechmedia.dominguez.profiles.C6667g1;
import com.bamtechmedia.dominguez.profiles.C6671h0;
import com.bamtechmedia.dominguez.profiles.C6675i;
import com.bamtechmedia.dominguez.profiles.C6725m1;
import com.bamtechmedia.dominguez.profiles.C6761p0;
import com.bamtechmedia.dominguez.profiles.C6969y0;
import com.bamtechmedia.dominguez.profiles.p259s1.p260l.C6830a;
import com.bamtechmedia.dominguez.profiles.p259s1.p261m.C6836a;
import com.bamtechmedia.dominguez.profiles.p263u1.p264d.C6864d;
import javax.inject.Provider;
import p163g.p201e.p203b.p307o.C7614e;

/* renamed from: com.bamtechmedia.dominguez.profiles.s1.c */
/* compiled from: AddProfileBindingModule */
abstract class C6786c {
    /* renamed from: a */
    static C6808i m20887a(C6791g gVar, C6671h0 h0Var, C6761p0 p0Var, C6667g1 g1Var, C6675i iVar, C6725m1 m1Var, C6969y0 y0Var, C6090n nVar, C6864d dVar, C6628d dVar2, C7614e eVar, C3572r0 r0Var) {
        C6784a aVar = new C6784a(h0Var, p0Var, gVar, g1Var, iVar, m1Var, y0Var, nVar, dVar, dVar2, eVar, r0Var);
        C6791g gVar2 = gVar;
        return (C6808i) C5856o0.m18893a((Fragment) gVar, C6808i.class, (Provider<T>) aVar);
    }

    /* renamed from: a */
    static /* synthetic */ C6808i m20886a(C6671h0 h0Var, C6761p0 p0Var, C6791g gVar, C6667g1 g1Var, C6675i iVar, C6725m1 m1Var, C6969y0 y0Var, C6090n nVar, C6864d dVar, C6628d dVar2, C7614e eVar, C3572r0 r0Var) {
        C6808i iVar2 = new C6808i(h0Var, p0Var, gVar.mo19532q(), gVar.mo19533r(), g1Var, iVar, m1Var, y0Var, nVar, dVar, dVar2, eVar, r0Var);
        return iVar2;
    }

    /* renamed from: a */
    static C6829k m20888a(boolean z) {
        return z ? new C6836a() : new C6830a();
    }
}
