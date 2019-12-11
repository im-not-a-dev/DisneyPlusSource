package p602m.p613d.p653e.p654a.p655x.p658c;

import p602m.p613d.p653e.p654a.C13805c;
import p602m.p613d.p653e.p654a.C13806d;
import p602m.p613d.p653e.p654a.C13812e;
import p602m.p613d.p653e.p654a.C13816g;
import p602m.p613d.p653e.p654a.C13816g.C13817a;

/* renamed from: m.d.e.a.x.c.z0 */
/* compiled from: SecT113R2Point */
public class C13943z0 extends C13817a {
    public C13943z0(C13806d dVar, C13812e eVar, C13812e eVar2) {
        this(dVar, eVar, eVar2, false);
    }

    /* renamed from: a */
    public C13816g mo35134a(C13816g gVar) {
        C13812e eVar;
        C13812e eVar2;
        C13812e eVar3;
        C13812e eVar4;
        C13812e eVar5;
        C13812e eVar6;
        if (mo35157n()) {
            return gVar;
        }
        if (gVar.mo35157n()) {
            return this;
        }
        C13806d f = mo35148f();
        C13812e eVar7 = this.f30669b;
        C13812e i = gVar.mo35152i();
        if (!eVar7.mo35112g()) {
            C13812e eVar8 = this.f30670c;
            C13812e eVar9 = this.f30671d[0];
            C13812e j = gVar.mo35153j();
            C13812e a = gVar.mo35130a(0);
            boolean f2 = eVar9.mo35111f();
            if (!f2) {
                eVar2 = i.mo35106c(eVar9);
                eVar = j.mo35106c(eVar9);
            } else {
                eVar2 = i;
                eVar = j;
            }
            boolean f3 = a.mo35111f();
            if (!f3) {
                eVar7 = eVar7.mo35106c(a);
                eVar3 = eVar8.mo35106c(a);
            } else {
                eVar3 = eVar8;
            }
            C13812e a2 = eVar3.mo35100a(eVar);
            C13812e a3 = eVar7.mo35100a(eVar2);
            if (!a3.mo35112g()) {
                if (i.mo35112g()) {
                    C13816g r = mo35161r();
                    C13812e l = r.mo35155l();
                    C13812e m = r.mo35156m();
                    C13812e b = m.mo35100a(j).mo35104b(l);
                    eVar6 = b.mo35115j().mo35100a(b).mo35100a(l).mo35100a(f.mo35082d());
                    if (eVar6.mo35112g()) {
                        return new C13943z0(f, eVar6, f.mo35083e().mo35114i(), this.f30672e);
                    }
                    eVar5 = b.mo35106c(l.mo35100a(eVar6)).mo35100a(eVar6).mo35100a(m).mo35104b(eVar6).mo35100a(eVar6);
                    eVar4 = f.mo35061a(C13805c.f30634b);
                } else {
                    C13812e j2 = a3.mo35115j();
                    C13812e c = a2.mo35106c(eVar7);
                    C13812e c2 = a2.mo35106c(eVar2);
                    C13812e c3 = c.mo35106c(c2);
                    if (c3.mo35112g()) {
                        return new C13943z0(f, c3, f.mo35083e().mo35114i(), this.f30672e);
                    }
                    C13812e c4 = a2.mo35106c(j2);
                    eVar4 = !f3 ? c4.mo35106c(a) : c4;
                    C13812e a4 = c2.mo35100a(j2).mo35101a(eVar4, eVar8.mo35100a(eVar9));
                    if (!f2) {
                        eVar4 = eVar4.mo35106c(eVar9);
                    }
                    eVar6 = c3;
                    eVar5 = a4;
                }
                C13943z0 z0Var = new C13943z0(f, eVar6, eVar5, new C13812e[]{eVar4}, this.f30672e);
                return z0Var;
            } else if (a2.mo35112g()) {
                return mo35166v();
            } else {
                return f.mo35091k();
            }
        } else if (i.mo35112g()) {
            return f.mo35091k();
        } else {
            return gVar.mo35134a((C13816g) this);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public C13816g mo35137b() {
        return new C13943z0(null, mo35141c(), mo35144d());
    }

    /* renamed from: d */
    public C13816g mo35145d(C13816g gVar) {
        if (mo35157n()) {
            return gVar;
        }
        if (gVar.mo35157n()) {
            return mo35166v();
        }
        C13806d f = mo35148f();
        C13812e eVar = this.f30669b;
        if (eVar.mo35112g()) {
            return gVar;
        }
        C13812e i = gVar.mo35152i();
        C13812e a = gVar.mo35130a(0);
        if (i.mo35112g() || !a.mo35111f()) {
            return mo35166v().mo35134a(gVar);
        }
        C13812e eVar2 = this.f30670c;
        C13812e eVar3 = this.f30671d[0];
        C13812e j = gVar.mo35153j();
        C13812e j2 = eVar.mo35115j();
        C13812e j3 = eVar2.mo35115j();
        C13812e j4 = eVar3.mo35115j();
        C13812e a2 = f.mo35082d().mo35106c(j4).mo35100a(j3).mo35100a(eVar2.mo35106c(eVar3));
        C13812e a3 = j.mo35098a();
        C13812e b = f.mo35082d().mo35100a(a3).mo35106c(j4).mo35100a(j3).mo35105b(a2, j2, j4);
        C13812e c = i.mo35106c(j4);
        C13812e j5 = c.mo35100a(a2).mo35115j();
        if (j5.mo35112g()) {
            if (b.mo35112g()) {
                return gVar.mo35166v();
            }
            return f.mo35091k();
        } else if (b.mo35112g()) {
            return new C13943z0(f, b, f.mo35083e().mo35114i(), this.f30672e);
        } else {
            C13812e c2 = b.mo35115j().mo35106c(c);
            C13812e c3 = b.mo35106c(j5).mo35106c(j4);
            C13943z0 z0Var = new C13943z0(f, c2, b.mo35100a(j5).mo35115j().mo35105b(a2, a3, c3), new C13812e[]{c3}, this.f30672e);
            return z0Var;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public boolean mo35146e() {
        C13812e i = mo35152i();
        boolean z = false;
        if (i.mo35112g()) {
            return false;
        }
        if (mo35153j().mo35116k() != i.mo35116k()) {
            z = true;
        }
        return z;
    }

    /* renamed from: m */
    public C13812e mo35156m() {
        C13812e eVar = this.f30669b;
        C13812e eVar2 = this.f30670c;
        if (mo35157n() || eVar.mo35112g()) {
            return eVar2;
        }
        C13812e c = eVar2.mo35100a(eVar).mo35106c(eVar);
        C13812e eVar3 = this.f30671d[0];
        if (!eVar3.mo35111f()) {
            c = c.mo35104b(eVar3);
        }
        return c;
    }

    /* renamed from: q */
    public C13816g mo35160q() {
        if (mo35157n()) {
            return this;
        }
        C13812e eVar = this.f30669b;
        if (eVar.mo35112g()) {
            return this;
        }
        C13812e eVar2 = this.f30670c;
        C13812e eVar3 = this.f30671d[0];
        C13806d dVar = this.f30668a;
        C13806d dVar2 = dVar;
        C13812e a = eVar2.mo35100a(eVar3);
        C13943z0 z0Var = new C13943z0(dVar2, eVar, a, new C13812e[]{eVar3}, this.f30672e);
        return z0Var;
    }

    /* renamed from: v */
    public C13816g mo35166v() {
        C13812e eVar;
        C13812e eVar2;
        C13812e eVar3;
        if (mo35157n()) {
            return this;
        }
        C13806d f = mo35148f();
        C13812e eVar4 = this.f30669b;
        if (eVar4.mo35112g()) {
            return f.mo35091k();
        }
        C13812e eVar5 = this.f30670c;
        C13812e eVar6 = this.f30671d[0];
        boolean f2 = eVar6.mo35111f();
        if (f2) {
            eVar = eVar5;
        } else {
            eVar = eVar5.mo35106c(eVar6);
        }
        if (f2) {
            eVar2 = eVar6;
        } else {
            eVar2 = eVar6.mo35115j();
        }
        C13812e d = f.mo35082d();
        if (!f2) {
            d = d.mo35106c(eVar2);
        }
        C13812e a = eVar5.mo35115j().mo35100a(eVar).mo35100a(d);
        if (a.mo35112g()) {
            return new C13943z0(f, a, f.mo35083e().mo35114i(), this.f30672e);
        }
        C13812e j = a.mo35115j();
        if (f2) {
            eVar3 = a;
        } else {
            eVar3 = a.mo35106c(eVar2);
        }
        if (!f2) {
            eVar4 = eVar4.mo35106c(eVar6);
        }
        C13812e eVar7 = j;
        C13812e a2 = eVar4.mo35101a(a, eVar).mo35100a(j).mo35100a(eVar3);
        C13943z0 z0Var = new C13943z0(f, eVar7, a2, new C13812e[]{eVar3}, this.f30672e);
        return z0Var;
    }

    public C13943z0(C13806d dVar, C13812e eVar, C13812e eVar2, boolean z) {
        super(dVar, eVar, eVar2);
        boolean z2 = true;
        boolean z3 = eVar == null;
        if (eVar2 != null) {
            z2 = false;
        }
        if (z3 == z2) {
            this.f30672e = z;
            return;
        }
        throw new IllegalArgumentException("Exactly one of the field elements is null");
    }

    C13943z0(C13806d dVar, C13812e eVar, C13812e eVar2, C13812e[] eVarArr, boolean z) {
        super(dVar, eVar, eVar2, eVarArr);
        this.f30672e = z;
    }
}
