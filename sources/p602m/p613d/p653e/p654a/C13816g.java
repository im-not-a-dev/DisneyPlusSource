package p602m.p613d.p653e.p654a;

import java.math.BigInteger;
import java.util.Hashtable;
import p602m.p613d.p653e.p654a.C13812e.C13813a;

/* renamed from: m.d.e.a.g */
/* compiled from: ECPoint */
public abstract class C13816g {

    /* renamed from: g */
    protected static C13812e[] f30667g = new C13812e[0];

    /* renamed from: a */
    protected C13806d f30668a;

    /* renamed from: b */
    protected C13812e f30669b;

    /* renamed from: c */
    protected C13812e f30670c;

    /* renamed from: d */
    protected C13812e[] f30671d;

    /* renamed from: e */
    protected boolean f30672e;

    /* renamed from: f */
    protected Hashtable f30673f;

    /* renamed from: m.d.e.a.g$a */
    /* compiled from: ECPoint */
    public static abstract class C13817a extends C13816g {
        protected C13817a(C13806d dVar, C13812e eVar, C13812e eVar2) {
            super(dVar, eVar, eVar2);
        }

        /* renamed from: b */
        public C13816g mo35139b(C13812e eVar) {
            if (mo35157n()) {
                return this;
            }
            int g = mo35149g();
            if (g == 5) {
                C13812e i = mo35152i();
                C13812e j = mo35153j();
                return mo35148f().mo35066a(i, j.mo35100a(i).mo35104b(eVar).mo35100a(i.mo35106c(eVar)), mo35154k(), this.f30672e);
            } else if (g != 6) {
                return C13816g.super.mo35139b(eVar);
            } else {
                C13812e i2 = mo35152i();
                C13812e j2 = mo35153j();
                C13812e eVar2 = mo35154k()[0];
                C13812e c = i2.mo35106c(eVar.mo35115j());
                C13812e a = j2.mo35100a(i2).mo35100a(c);
                C13812e c2 = eVar2.mo35106c(eVar);
                return mo35148f().mo35066a(c, a, new C13812e[]{c2}, this.f30672e);
            }
        }

        /* renamed from: c */
        public C13816g mo35142c(C13812e eVar) {
            if (mo35157n()) {
                return this;
            }
            int g = mo35149g();
            if (g != 5 && g != 6) {
                return C13816g.super.mo35142c(eVar);
            }
            C13812e i = mo35152i();
            return mo35148f().mo35066a(i, mo35153j().mo35100a(i).mo35106c(eVar).mo35100a(i), mo35154k(), this.f30672e);
        }

        /* access modifiers changed from: protected */
        /* renamed from: t */
        public boolean mo35163t() {
            C13812e eVar;
            C13812e eVar2;
            C13806d f = mo35148f();
            C13812e eVar3 = this.f30669b;
            C13812e d = f.mo35082d();
            C13812e e = f.mo35083e();
            int g = f.mo35086g();
            if (g == 6) {
                C13812e eVar4 = this.f30671d[0];
                boolean f2 = eVar4.mo35111f();
                if (eVar3.mo35112g()) {
                    C13812e j = this.f30670c.mo35115j();
                    if (!f2) {
                        e = e.mo35106c(eVar4.mo35115j());
                    }
                    return j.equals(e);
                }
                C13812e eVar5 = this.f30670c;
                C13812e j2 = eVar3.mo35115j();
                if (f2) {
                    eVar2 = eVar5.mo35115j().mo35100a(eVar5).mo35100a(d);
                    eVar = j2.mo35115j().mo35100a(e);
                } else {
                    C13812e j3 = eVar4.mo35115j();
                    C13812e j4 = j3.mo35115j();
                    eVar2 = eVar5.mo35100a(eVar4).mo35105b(eVar5, d, j3);
                    eVar = j2.mo35101a(e, j4);
                }
                return eVar2.mo35106c(j2).equals(eVar);
            }
            C13812e eVar6 = this.f30670c;
            C13812e c = eVar6.mo35100a(eVar3).mo35106c(eVar6);
            if (g != 0) {
                if (g == 1) {
                    C13812e eVar7 = this.f30671d[0];
                    if (!eVar7.mo35111f()) {
                        C13812e c2 = eVar7.mo35106c(eVar7.mo35115j());
                        c = c.mo35106c(eVar7);
                        d = d.mo35106c(eVar7);
                        e = e.mo35106c(c2);
                    }
                } else {
                    throw new IllegalStateException("unsupported coordinate system");
                }
            }
            return c.equals(eVar3.mo35100a(d).mo35106c(eVar3.mo35115j()).mo35100a(e));
        }

        protected C13817a(C13806d dVar, C13812e eVar, C13812e eVar2, C13812e[] eVarArr) {
            super(dVar, eVar, eVar2, eVarArr);
        }

        /* renamed from: c */
        public C13816g mo35143c(C13816g gVar) {
            if (gVar.mo35157n()) {
                return this;
            }
            return mo35134a(gVar.mo35160q());
        }

        /* renamed from: c */
        public C13817a mo35167c(int i) {
            if (mo35157n()) {
                return this;
            }
            C13806d f = mo35148f();
            int g = f.mo35086g();
            C13812e eVar = this.f30669b;
            if (g != 0) {
                if (g != 1) {
                    if (g != 5) {
                        if (g != 6) {
                            throw new IllegalStateException("unsupported coordinate system");
                        }
                    }
                }
                C13812e eVar2 = this.f30670c;
                C13812e eVar3 = this.f30671d[0];
                return (C13817a) f.mo35066a(eVar.mo35099a(i), eVar2.mo35099a(i), new C13812e[]{eVar3.mo35099a(i)}, this.f30672e);
            }
            return (C13817a) f.mo35065a(eVar.mo35099a(i), this.f30670c.mo35099a(i), this.f30672e);
        }
    }

    /* renamed from: m.d.e.a.g$b */
    /* compiled from: ECPoint */
    public static abstract class C13818b extends C13816g {
        protected C13818b(C13806d dVar, C13812e eVar, C13812e eVar2) {
            super(dVar, eVar, eVar2);
        }

        /* renamed from: c */
        public C13816g mo35143c(C13816g gVar) {
            if (gVar.mo35157n()) {
                return this;
            }
            return mo35134a(gVar.mo35160q());
        }

        /* access modifiers changed from: protected */
        /* renamed from: e */
        public boolean mo35146e() {
            return mo35144d().mo35116k();
        }

        /* access modifiers changed from: protected */
        /* renamed from: t */
        public boolean mo35163t() {
            C13812e eVar = this.f30669b;
            C13812e eVar2 = this.f30670c;
            C13812e d = this.f30668a.mo35082d();
            C13812e e = this.f30668a.mo35083e();
            C13812e j = eVar2.mo35115j();
            int g = mo35149g();
            if (g != 0) {
                if (g == 1) {
                    C13812e eVar3 = this.f30671d[0];
                    if (!eVar3.mo35111f()) {
                        C13812e j2 = eVar3.mo35115j();
                        C13812e c = eVar3.mo35106c(j2);
                        j = j.mo35106c(eVar3);
                        d = d.mo35106c(j2);
                        e = e.mo35106c(c);
                    }
                } else if (g == 2 || g == 3 || g == 4) {
                    C13812e eVar4 = this.f30671d[0];
                    if (!eVar4.mo35111f()) {
                        C13812e j3 = eVar4.mo35115j();
                        C13812e j4 = j3.mo35115j();
                        C13812e c2 = j3.mo35106c(j4);
                        d = d.mo35106c(j4);
                        e = e.mo35106c(c2);
                    }
                } else {
                    throw new IllegalStateException("unsupported coordinate system");
                }
            }
            return j.equals(eVar.mo35115j().mo35100a(d).mo35106c(eVar).mo35100a(e));
        }

        protected C13818b(C13806d dVar, C13812e eVar, C13812e eVar2, C13812e[] eVarArr) {
            super(dVar, eVar, eVar2, eVarArr);
        }
    }

    /* renamed from: m.d.e.a.g$c */
    /* compiled from: ECPoint */
    public static class C13819c extends C13817a {
        public C13819c(C13806d dVar, C13812e eVar, C13812e eVar2) {
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
            C13812e eVar7;
            C13812e eVar8;
            C13816g gVar2 = gVar;
            if (mo35157n()) {
                return gVar2;
            }
            if (gVar.mo35157n()) {
                return this;
            }
            C13806d f = mo35148f();
            int g = f.mo35086g();
            C13812e eVar9 = this.f30669b;
            C13812e eVar10 = gVar2.f30669b;
            if (g == 0) {
                C13812e eVar11 = this.f30670c;
                C13812e eVar12 = gVar2.f30670c;
                C13812e a = eVar9.mo35100a(eVar10);
                C13812e a2 = eVar11.mo35100a(eVar12);
                if (!a.mo35112g()) {
                    C13812e b = a2.mo35104b(a);
                    C13812e a3 = b.mo35115j().mo35100a(b).mo35100a(a).mo35100a(f.mo35082d());
                    return new C13819c(f, a3, b.mo35106c(eVar9.mo35100a(a3)).mo35100a(a3).mo35100a(eVar11), this.f30672e);
                } else if (a2.mo35112g()) {
                    return mo35166v();
                } else {
                    return f.mo35091k();
                }
            } else if (g == 1) {
                C13812e eVar13 = this.f30670c;
                C13812e eVar14 = this.f30671d[0];
                C13812e eVar15 = gVar2.f30670c;
                C13812e eVar16 = gVar2.f30671d[0];
                boolean f2 = eVar16.mo35111f();
                C13812e c = eVar14.mo35106c(eVar15);
                if (f2) {
                    eVar = eVar13;
                } else {
                    eVar = eVar13.mo35106c(eVar16);
                }
                C13812e a4 = c.mo35100a(eVar);
                C13812e c2 = eVar14.mo35106c(eVar10);
                if (f2) {
                    eVar2 = eVar9;
                } else {
                    eVar2 = eVar9.mo35106c(eVar16);
                }
                C13812e a5 = c2.mo35100a(eVar2);
                if (!a5.mo35112g()) {
                    C13812e j = a5.mo35115j();
                    C13812e c3 = j.mo35106c(a5);
                    if (!f2) {
                        eVar14 = eVar14.mo35106c(eVar16);
                    }
                    C13812e a6 = a4.mo35100a(a5);
                    C13812e a7 = a6.mo35105b(a4, j, f.mo35082d()).mo35106c(eVar14).mo35100a(c3);
                    C13812e c4 = a5.mo35106c(a7);
                    if (!f2) {
                        j = j.mo35106c(eVar16);
                    }
                    C13819c cVar = new C13819c(f, c4, a4.mo35105b(eVar9, a5, eVar13).mo35105b(j, a6, a7), new C13812e[]{c3.mo35106c(eVar14)}, this.f30672e);
                    return cVar;
                } else if (a4.mo35112g()) {
                    return mo35166v();
                } else {
                    return f.mo35091k();
                }
            } else if (g != 6) {
                throw new IllegalStateException("unsupported coordinate system");
            } else if (!eVar9.mo35112g()) {
                C13812e eVar17 = this.f30670c;
                C13812e eVar18 = this.f30671d[0];
                C13812e eVar19 = gVar2.f30670c;
                C13812e eVar20 = gVar2.f30671d[0];
                boolean f3 = eVar18.mo35111f();
                if (!f3) {
                    eVar4 = eVar10.mo35106c(eVar18);
                    eVar3 = eVar19.mo35106c(eVar18);
                } else {
                    eVar4 = eVar10;
                    eVar3 = eVar19;
                }
                boolean f4 = eVar20.mo35111f();
                if (!f4) {
                    eVar9 = eVar9.mo35106c(eVar20);
                    eVar5 = eVar17.mo35106c(eVar20);
                } else {
                    eVar5 = eVar17;
                }
                C13812e a8 = eVar5.mo35100a(eVar3);
                C13812e a9 = eVar9.mo35100a(eVar4);
                if (!a9.mo35112g()) {
                    if (eVar10.mo35112g()) {
                        C13816g r = mo35161r();
                        C13812e l = r.mo35155l();
                        C13812e m = r.mo35156m();
                        C13812e b2 = m.mo35100a(eVar19).mo35104b(l);
                        eVar6 = b2.mo35115j().mo35100a(b2).mo35100a(l).mo35100a(f.mo35082d());
                        if (eVar6.mo35112g()) {
                            return new C13819c(f, eVar6, f.mo35083e().mo35114i(), this.f30672e);
                        }
                        eVar7 = b2.mo35106c(l.mo35100a(eVar6)).mo35100a(eVar6).mo35100a(m).mo35104b(eVar6).mo35100a(eVar6);
                        eVar8 = f.mo35061a(C13805c.f30634b);
                    } else {
                        C13812e j2 = a9.mo35115j();
                        C13812e c5 = a8.mo35106c(eVar9);
                        C13812e c6 = a8.mo35106c(eVar4);
                        C13812e c7 = c5.mo35106c(c6);
                        if (c7.mo35112g()) {
                            return new C13819c(f, c7, f.mo35083e().mo35114i(), this.f30672e);
                        }
                        C13812e c8 = a8.mo35106c(j2);
                        eVar8 = !f4 ? c8.mo35106c(eVar20) : c8;
                        eVar7 = c6.mo35100a(j2).mo35101a(eVar8, eVar17.mo35100a(eVar18));
                        if (!f3) {
                            eVar8 = eVar8.mo35106c(eVar18);
                        }
                        eVar6 = c7;
                    }
                    C13819c cVar2 = new C13819c(f, eVar6, eVar7, new C13812e[]{eVar8}, this.f30672e);
                    return cVar2;
                } else if (a8.mo35112g()) {
                    return mo35166v();
                } else {
                    return f.mo35091k();
                }
            } else if (eVar10.mo35112g()) {
                return f.mo35091k();
            } else {
                return gVar2.mo35134a((C13816g) this);
            }
        }

        /* access modifiers changed from: protected */
        /* renamed from: b */
        public C13816g mo35137b() {
            return new C13819c(null, mo35141c(), mo35144d());
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
            if (f.mo35086g() != 6) {
                return mo35166v().mo35134a(gVar);
            }
            C13812e eVar2 = gVar.f30669b;
            C13812e eVar3 = gVar.f30671d[0];
            if (eVar2.mo35112g() || !eVar3.mo35111f()) {
                return mo35166v().mo35134a(gVar);
            }
            C13812e eVar4 = this.f30670c;
            C13812e eVar5 = this.f30671d[0];
            C13812e eVar6 = gVar.f30670c;
            C13812e j = eVar.mo35115j();
            C13812e j2 = eVar4.mo35115j();
            C13812e j3 = eVar5.mo35115j();
            C13812e a = f.mo35082d().mo35106c(j3).mo35100a(j2).mo35100a(eVar4.mo35106c(eVar5));
            C13812e a2 = eVar6.mo35098a();
            C13812e b = f.mo35082d().mo35100a(a2).mo35106c(j3).mo35100a(j2).mo35105b(a, j, j3);
            C13812e c = eVar2.mo35106c(j3);
            C13812e j4 = c.mo35100a(a).mo35115j();
            if (j4.mo35112g()) {
                if (b.mo35112g()) {
                    return gVar.mo35166v();
                }
                return f.mo35091k();
            } else if (b.mo35112g()) {
                return new C13819c(f, b, f.mo35083e().mo35114i(), this.f30672e);
            } else {
                C13812e c2 = b.mo35115j().mo35106c(c);
                C13812e c3 = b.mo35106c(j4).mo35106c(j3);
                C13819c cVar = new C13819c(f, c2, b.mo35100a(j4).mo35115j().mo35105b(a, a2, c3), new C13812e[]{c3}, this.f30672e);
                return cVar;
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
            C13812e j = mo35153j();
            int g = mo35149g();
            if (g != 5 && g != 6) {
                return j.mo35104b(i).mo35116k();
            }
            if (j.mo35116k() != i.mo35116k()) {
                z = true;
            }
            return z;
        }

        /* renamed from: m */
        public C13812e mo35156m() {
            int g = mo35149g();
            if (g != 5 && g != 6) {
                return this.f30670c;
            }
            C13812e eVar = this.f30669b;
            C13812e eVar2 = this.f30670c;
            if (mo35157n() || eVar.mo35112g()) {
                return eVar2;
            }
            C13812e c = eVar2.mo35100a(eVar).mo35106c(eVar);
            if (6 == g) {
                C13812e eVar3 = this.f30671d[0];
                if (!eVar3.mo35111f()) {
                    c = c.mo35104b(eVar3);
                }
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
            int g = mo35149g();
            if (g == 0) {
                return new C13819c(this.f30668a, eVar, this.f30670c.mo35100a(eVar), this.f30672e);
            } else if (g == 1) {
                C13812e eVar2 = this.f30670c;
                C13812e eVar3 = this.f30671d[0];
                C13819c cVar = new C13819c(this.f30668a, eVar, eVar2.mo35100a(eVar), new C13812e[]{eVar3}, this.f30672e);
                return cVar;
            } else if (g == 5) {
                return new C13819c(this.f30668a, eVar, this.f30670c.mo35098a(), this.f30672e);
            } else if (g == 6) {
                C13812e eVar4 = this.f30670c;
                C13812e eVar5 = this.f30671d[0];
                C13819c cVar2 = new C13819c(this.f30668a, eVar, eVar4.mo35100a(eVar5), new C13812e[]{eVar5}, this.f30672e);
                return cVar2;
            } else {
                throw new IllegalStateException("unsupported coordinate system");
            }
        }

        /* renamed from: v */
        public C13816g mo35166v() {
            C13812e eVar;
            C13812e eVar2;
            C13812e eVar3;
            C13812e eVar4;
            C13812e eVar5;
            C13812e eVar6;
            C13812e eVar7;
            if (mo35157n()) {
                return this;
            }
            C13806d f = mo35148f();
            C13812e eVar8 = this.f30669b;
            if (eVar8.mo35112g()) {
                return f.mo35091k();
            }
            int g = f.mo35086g();
            if (g == 0) {
                C13806d dVar = f;
                C13812e a = this.f30670c.mo35104b(eVar8).mo35100a(eVar8);
                C13812e a2 = a.mo35115j().mo35100a(a).mo35100a(dVar.mo35082d());
                return new C13819c(dVar, a2, eVar8.mo35101a(a2, a.mo35098a()), this.f30672e);
            } else if (g == 1) {
                C13806d dVar2 = f;
                C13812e eVar9 = this.f30670c;
                C13812e eVar10 = this.f30671d[0];
                boolean f2 = eVar10.mo35111f();
                if (f2) {
                    eVar = eVar8;
                } else {
                    eVar = eVar8.mo35106c(eVar10);
                }
                if (!f2) {
                    eVar9 = eVar9.mo35106c(eVar10);
                }
                C13812e j = eVar8.mo35115j();
                C13812e a3 = j.mo35100a(eVar9);
                C13812e j2 = eVar.mo35115j();
                C13812e a4 = a3.mo35100a(eVar);
                C13812e b = a4.mo35105b(a3, j2, dVar2.mo35082d());
                C13819c cVar = new C13819c(dVar2, eVar.mo35106c(b), j.mo35115j().mo35105b(eVar, b, a4), new C13812e[]{eVar.mo35106c(j2)}, this.f30672e);
                return cVar;
            } else if (g == 6) {
                C13812e eVar11 = this.f30670c;
                C13812e eVar12 = this.f30671d[0];
                boolean f3 = eVar12.mo35111f();
                if (f3) {
                    eVar2 = eVar11;
                } else {
                    eVar2 = eVar11.mo35106c(eVar12);
                }
                if (f3) {
                    eVar3 = eVar12;
                } else {
                    eVar3 = eVar12.mo35115j();
                }
                C13812e d = f.mo35082d();
                if (f3) {
                    eVar4 = d;
                } else {
                    eVar4 = d.mo35106c(eVar3);
                }
                C13812e a5 = eVar11.mo35115j().mo35100a(eVar2).mo35100a(eVar4);
                if (a5.mo35112g()) {
                    return new C13819c(f, a5, f.mo35083e().mo35114i(), this.f30672e);
                }
                C13812e j3 = a5.mo35115j();
                if (f3) {
                    eVar5 = a5;
                } else {
                    eVar5 = a5.mo35106c(eVar3);
                }
                C13812e e = f.mo35083e();
                C13806d dVar3 = f;
                if (e.mo35103b() < (f.mo35090j() >> 1)) {
                    C13812e j4 = eVar11.mo35100a(eVar8).mo35115j();
                    if (e.mo35111f()) {
                        eVar7 = eVar4.mo35100a(eVar3).mo35115j();
                    } else {
                        eVar7 = eVar4.mo35101a(e, eVar3.mo35115j());
                    }
                    eVar6 = j4.mo35100a(a5).mo35100a(eVar3).mo35106c(j4).mo35100a(eVar7).mo35100a(j3);
                    if (d.mo35112g()) {
                        eVar6 = eVar6.mo35100a(eVar5);
                    } else if (!d.mo35111f()) {
                        eVar6 = eVar6.mo35100a(d.mo35098a().mo35106c(eVar5));
                    }
                } else {
                    if (!f3) {
                        eVar8 = eVar8.mo35106c(eVar12);
                    }
                    eVar6 = eVar8.mo35101a(a5, eVar2).mo35100a(j3).mo35100a(eVar5);
                }
                C13806d dVar4 = dVar3;
                C13812e eVar13 = j3;
                C13812e eVar14 = eVar6;
                C13819c cVar2 = new C13819c(dVar4, eVar13, eVar14, new C13812e[]{eVar5}, this.f30672e);
                return cVar2;
            } else {
                throw new IllegalStateException("unsupported coordinate system");
            }
        }

        public C13819c(C13806d dVar, C13812e eVar, C13812e eVar2, boolean z) {
            super(dVar, eVar, eVar2);
            boolean z2 = true;
            boolean z3 = eVar == null;
            if (eVar2 != null) {
                z2 = false;
            }
            if (z3 == z2) {
                if (eVar != null) {
                    C13813a.m42434b(this.f30669b, this.f30670c);
                    if (dVar != null) {
                        C13813a.m42434b(this.f30669b, this.f30668a.mo35082d());
                    }
                }
                this.f30672e = z;
                return;
            }
            throw new IllegalArgumentException("Exactly one of the field elements is null");
        }

        C13819c(C13806d dVar, C13812e eVar, C13812e eVar2, C13812e[] eVarArr, boolean z) {
            super(dVar, eVar, eVar2, eVarArr);
            this.f30672e = z;
        }
    }

    /* renamed from: m.d.e.a.g$d */
    /* compiled from: ECPoint */
    public static class C13820d extends C13818b {
        public C13820d(C13806d dVar, C13812e eVar, C13812e eVar2) {
            this(dVar, eVar, eVar2, false);
        }

        /* renamed from: a */
        public C13812e mo35130a(int i) {
            if (i == 1 && 4 == mo35149g()) {
                return mo35174w();
            }
            return C13816g.super.mo35130a(i);
        }

        /* access modifiers changed from: protected */
        /* renamed from: b */
        public C13816g mo35137b() {
            return new C13820d(null, mo35141c(), mo35144d());
        }

        /* renamed from: d */
        public C13816g mo35145d(C13816g gVar) {
            if (this == gVar) {
                return mo35165u();
            }
            if (mo35157n()) {
                return gVar;
            }
            if (gVar.mo35157n()) {
                return mo35166v();
            }
            C13812e eVar = this.f30670c;
            if (eVar.mo35112g()) {
                return gVar;
            }
            C13806d f = mo35148f();
            int g = f.mo35086g();
            if (g == 0) {
                C13812e eVar2 = this.f30669b;
                C13812e eVar3 = gVar.f30669b;
                C13812e eVar4 = gVar.f30670c;
                C13812e d = eVar3.mo35109d(eVar2);
                C13812e d2 = eVar4.mo35109d(eVar);
                if (d.mo35112g()) {
                    return d2.mo35112g() ? mo35165u() : this;
                }
                C13812e j = d.mo35115j();
                C13812e d3 = j.mo35106c(mo35173g(eVar2).mo35100a(eVar3)).mo35109d(d2.mo35115j());
                if (d3.mo35112g()) {
                    return f.mo35091k();
                }
                C13812e e = d3.mo35106c(d).mo35110e();
                C13812e c = d3.mo35106c(e).mo35106c(d2);
                C13812e d4 = mo35173g(eVar).mo35106c(j).mo35106c(d).mo35106c(e).mo35109d(c);
                C13812e a = d4.mo35109d(c).mo35106c(c.mo35100a(d4)).mo35100a(eVar3);
                return new C13820d(f, a, eVar2.mo35109d(a).mo35106c(d4).mo35109d(eVar), this.f30672e);
            } else if (g != 4) {
                return mo35166v().mo35134a(gVar);
            } else {
                return mo35169b(false).mo35134a(gVar);
            }
        }

        /* access modifiers changed from: protected */
        /* renamed from: e */
        public C13812e mo35171e(C13812e eVar) {
            return mo35173g(mo35173g(eVar));
        }

        /* access modifiers changed from: protected */
        /* renamed from: f */
        public C13812e mo35172f(C13812e eVar) {
            return mo35173g(eVar).mo35100a(eVar);
        }

        /* access modifiers changed from: protected */
        /* renamed from: g */
        public C13812e mo35173g(C13812e eVar) {
            return eVar.mo35100a(eVar);
        }

        /* renamed from: q */
        public C13816g mo35160q() {
            if (mo35157n()) {
                return this;
            }
            C13806d f = mo35148f();
            if (f.mo35086g() == 0) {
                return new C13820d(f, this.f30669b, this.f30670c.mo35113h(), this.f30672e);
            }
            C13820d dVar = new C13820d(f, this.f30669b, this.f30670c.mo35113h(), this.f30671d, this.f30672e);
            return dVar;
        }

        /* renamed from: u */
        public C13816g mo35165u() {
            if (mo35157n()) {
                return this;
            }
            C13812e eVar = this.f30670c;
            if (eVar.mo35112g()) {
                return this;
            }
            C13806d f = mo35148f();
            int g = f.mo35086g();
            if (g == 0) {
                C13812e eVar2 = this.f30669b;
                C13812e g2 = mo35173g(eVar);
                C13812e j = g2.mo35115j();
                C13812e a = mo35172f(eVar2.mo35115j()).mo35100a(mo35148f().mo35082d());
                C13812e d = mo35172f(eVar2).mo35106c(j).mo35109d(a.mo35115j());
                if (d.mo35112g()) {
                    return mo35148f().mo35091k();
                }
                C13812e e = d.mo35106c(g2).mo35110e();
                C13812e c = d.mo35106c(e).mo35106c(a);
                C13812e d2 = j.mo35115j().mo35106c(e).mo35109d(c);
                C13812e a2 = d2.mo35109d(c).mo35106c(c.mo35100a(d2)).mo35100a(eVar2);
                return new C13820d(f, a2, eVar2.mo35109d(a2).mo35106c(d2).mo35109d(eVar), this.f30672e);
            } else if (g != 4) {
                return mo35166v().mo35134a((C13816g) this);
            } else {
                return mo35169b(false).mo35134a((C13816g) this);
            }
        }

        /* renamed from: v */
        public C13816g mo35166v() {
            C13812e eVar;
            C13812e eVar2;
            C13812e eVar3;
            C13812e eVar4;
            if (mo35157n()) {
                return this;
            }
            C13806d f = mo35148f();
            C13812e eVar5 = this.f30670c;
            if (eVar5.mo35112g()) {
                return f.mo35091k();
            }
            int g = f.mo35086g();
            C13812e eVar6 = this.f30669b;
            if (g == 0) {
                C13812e b = mo35172f(eVar6.mo35115j()).mo35100a(mo35148f().mo35082d()).mo35104b(mo35173g(eVar5));
                C13812e d = b.mo35115j().mo35109d(mo35173g(eVar6));
                return new C13820d(f, d, b.mo35106c(eVar6.mo35109d(d)).mo35109d(eVar5), this.f30672e);
            } else if (g == 1) {
                C13812e eVar7 = this.f30671d[0];
                boolean f2 = eVar7.mo35111f();
                C13812e d2 = f.mo35082d();
                if (!d2.mo35112g() && !f2) {
                    d2 = d2.mo35106c(eVar7.mo35115j());
                }
                C13812e a = d2.mo35100a(mo35172f(eVar6.mo35115j()));
                if (f2) {
                    eVar = eVar5;
                } else {
                    eVar = eVar5.mo35106c(eVar7);
                }
                C13812e j = f2 ? eVar5.mo35115j() : eVar.mo35106c(eVar5);
                C13812e e = mo35171e(eVar6.mo35106c(j));
                C13812e d3 = a.mo35115j().mo35109d(mo35173g(e));
                C13812e g2 = mo35173g(eVar);
                C13812e c = d3.mo35106c(g2);
                C13812e g3 = mo35173g(j);
                C13820d dVar = new C13820d(f, c, e.mo35109d(d3).mo35106c(a).mo35109d(mo35173g(g3.mo35115j())), new C13812e[]{mo35173g(f2 ? mo35173g(g3) : g2.mo35115j()).mo35106c(eVar)}, this.f30672e);
                return dVar;
            } else if (g == 2) {
                C13812e eVar8 = this.f30671d[0];
                boolean f3 = eVar8.mo35111f();
                C13812e j2 = eVar5.mo35115j();
                C13812e j3 = j2.mo35115j();
                C13812e d4 = f.mo35082d();
                C13812e h = d4.mo35113h();
                if (h.mo35117l().equals(BigInteger.valueOf(3))) {
                    if (f3) {
                        eVar4 = eVar8;
                    } else {
                        eVar4 = eVar8.mo35115j();
                    }
                    eVar2 = mo35172f(eVar6.mo35100a(eVar4).mo35106c(eVar6.mo35109d(eVar4)));
                    eVar3 = mo35171e(j2.mo35106c(eVar6));
                } else {
                    C13812e f4 = mo35172f(eVar6.mo35115j());
                    if (f3) {
                        eVar2 = f4.mo35100a(d4);
                    } else if (!d4.mo35112g()) {
                        C13812e j4 = eVar8.mo35115j().mo35115j();
                        eVar2 = h.mo35103b() < d4.mo35103b() ? f4.mo35109d(j4.mo35106c(h)) : f4.mo35100a(j4.mo35106c(d4));
                    } else {
                        eVar2 = f4;
                    }
                    eVar3 = mo35171e(eVar6.mo35106c(j2));
                }
                C13812e d5 = eVar2.mo35115j().mo35109d(mo35173g(eVar3));
                C13812e d6 = eVar3.mo35109d(d5).mo35106c(eVar2).mo35109d(mo35170d(j3));
                C13812e g4 = mo35173g(eVar5);
                if (!f3) {
                    g4 = g4.mo35106c(eVar8);
                }
                C13820d dVar2 = new C13820d(f, d5, d6, new C13812e[]{g4}, this.f30672e);
                return dVar2;
            } else if (g == 4) {
                return mo35169b(true);
            } else {
                throw new IllegalStateException("unsupported coordinate system");
            }
        }

        /* access modifiers changed from: protected */
        /* renamed from: w */
        public C13812e mo35174w() {
            C13812e[] eVarArr = this.f30671d;
            C13812e eVar = eVarArr[1];
            if (eVar != null) {
                return eVar;
            }
            C13812e b = mo35168b(eVarArr[0], null);
            eVarArr[1] = b;
            return b;
        }

        public C13820d(C13806d dVar, C13812e eVar, C13812e eVar2, boolean z) {
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

        /* renamed from: b */
        public C13816g mo35138b(int i) {
            int i2 = i;
            if (i2 < 0) {
                throw new IllegalArgumentException("'e' cannot be negative");
            } else if (i2 == 0 || mo35157n()) {
                return this;
            } else {
                if (i2 == 1) {
                    return mo35166v();
                }
                C13806d f = mo35148f();
                C13812e eVar = this.f30670c;
                if (eVar.mo35112g()) {
                    return f.mo35091k();
                }
                int g = f.mo35086g();
                C13812e d = f.mo35082d();
                C13812e eVar2 = this.f30669b;
                C13812e[] eVarArr = this.f30671d;
                C13812e a = eVarArr.length < 1 ? f.mo35061a(C13805c.f30634b) : eVarArr[0];
                String str = "unsupported coordinate system";
                if (!a.mo35111f() && g != 0) {
                    if (g == 1) {
                        C13812e j = a.mo35115j();
                        eVar2 = eVar2.mo35106c(a);
                        eVar = eVar.mo35106c(j);
                        d = mo35168b(a, j);
                    } else if (g == 2) {
                        d = mo35168b(a, null);
                    } else if (g == 4) {
                        d = mo35174w();
                    } else {
                        throw new IllegalStateException(str);
                    }
                }
                C13812e eVar3 = d;
                C13812e eVar4 = eVar;
                int i3 = 0;
                while (i3 < i2) {
                    if (eVar4.mo35112g()) {
                        return f.mo35091k();
                    }
                    C13812e f2 = mo35172f(eVar2.mo35115j());
                    C13812e g2 = mo35173g(eVar4);
                    C13812e c = g2.mo35106c(eVar4);
                    C13812e g3 = mo35173g(eVar2.mo35106c(c));
                    C13812e g4 = mo35173g(c.mo35115j());
                    if (!eVar3.mo35112g()) {
                        f2 = f2.mo35100a(eVar3);
                        eVar3 = mo35173g(g4.mo35106c(eVar3));
                    }
                    C13812e d2 = f2.mo35115j().mo35109d(mo35173g(g3));
                    eVar4 = f2.mo35106c(g3.mo35109d(d2)).mo35109d(g4);
                    a = a.mo35111f() ? g2 : g2.mo35106c(a);
                    i3++;
                    eVar2 = d2;
                }
                if (g == 0) {
                    C13812e e = a.mo35110e();
                    C13812e j2 = e.mo35115j();
                    return new C13820d(f, eVar2.mo35106c(j2), eVar4.mo35106c(j2.mo35106c(e)), this.f30672e);
                } else if (g == 1) {
                    C13820d dVar = new C13820d(f, eVar2.mo35106c(a), eVar4, new C13812e[]{a.mo35106c(a.mo35115j())}, this.f30672e);
                    return dVar;
                } else if (g == 2) {
                    C13820d dVar2 = new C13820d(f, eVar2, eVar4, new C13812e[]{a}, this.f30672e);
                    return dVar2;
                } else if (g == 4) {
                    C13820d dVar3 = new C13820d(f, eVar2, eVar4, new C13812e[]{a, eVar3}, this.f30672e);
                    return dVar3;
                } else {
                    throw new IllegalStateException(str);
                }
            }
        }

        /* JADX WARNING: Code restructure failed: missing block: B:53:0x0123, code lost:
            if (r1 == r6) goto L_0x0125;
         */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public p602m.p613d.p653e.p654a.C13816g mo35134a(p602m.p613d.p653e.p654a.C13816g r17) {
            /*
                r16 = this;
                r0 = r16
                r1 = r17
                boolean r2 = r16.mo35157n()
                if (r2 == 0) goto L_0x000b
                return r1
            L_0x000b:
                boolean r2 = r17.mo35157n()
                if (r2 == 0) goto L_0x0012
                return r0
            L_0x0012:
                if (r0 != r1) goto L_0x0019
                m.d.e.a.g r1 = r16.mo35166v()
                return r1
            L_0x0019:
                m.d.e.a.d r3 = r16.mo35148f()
                int r2 = r3.mo35086g()
                m.d.e.a.e r4 = r0.f30669b
                m.d.e.a.e r5 = r0.f30670c
                m.d.e.a.e r6 = r1.f30669b
                m.d.e.a.e r7 = r1.f30670c
                if (r2 == 0) goto L_0x01dd
                r8 = 1
                r9 = 0
                if (r2 == r8) goto L_0x0145
                r10 = 4
                r11 = 2
                if (r2 == r11) goto L_0x003e
                if (r2 != r10) goto L_0x0036
                goto L_0x003e
            L_0x0036:
                java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
                java.lang.String r2 = "unsupported coordinate system"
                r1.<init>(r2)
                throw r1
            L_0x003e:
                m.d.e.a.e[] r12 = r0.f30671d
                r12 = r12[r9]
                m.d.e.a.e[] r1 = r1.f30671d
                r1 = r1[r9]
                boolean r13 = r12.mo35111f()
                if (r13 != 0) goto L_0x00a5
                boolean r15 = r12.equals(r1)
                if (r15 == 0) goto L_0x00a5
                m.d.e.a.e r1 = r4.mo35109d(r6)
                m.d.e.a.e r7 = r5.mo35109d(r7)
                boolean r13 = r1.mo35112g()
                if (r13 == 0) goto L_0x0070
                boolean r1 = r7.mo35112g()
                if (r1 == 0) goto L_0x006b
                m.d.e.a.g r1 = r16.mo35166v()
                return r1
            L_0x006b:
                m.d.e.a.g r1 = r3.mo35091k()
                return r1
            L_0x0070:
                m.d.e.a.e r13 = r1.mo35115j()
                m.d.e.a.e r4 = r4.mo35106c(r13)
                m.d.e.a.e r6 = r6.mo35106c(r13)
                m.d.e.a.e r13 = r4.mo35109d(r6)
                m.d.e.a.e r5 = r13.mo35106c(r5)
                m.d.e.a.e r13 = r7.mo35115j()
                m.d.e.a.e r13 = r13.mo35109d(r4)
                m.d.e.a.e r6 = r13.mo35109d(r6)
                m.d.e.a.e r4 = r4.mo35109d(r6)
                m.d.e.a.e r4 = r4.mo35106c(r7)
                m.d.e.a.e r4 = r4.mo35109d(r5)
                m.d.e.a.e r1 = r1.mo35106c(r12)
                r5 = r4
                r4 = r6
            L_0x00a2:
                r14 = 0
                goto L_0x0125
            L_0x00a5:
                if (r13 == 0) goto L_0x00a8
                goto L_0x00b8
            L_0x00a8:
                m.d.e.a.e r15 = r12.mo35115j()
                m.d.e.a.e r6 = r15.mo35106c(r6)
                m.d.e.a.e r15 = r15.mo35106c(r12)
                m.d.e.a.e r7 = r15.mo35106c(r7)
            L_0x00b8:
                boolean r15 = r1.mo35111f()
                if (r15 == 0) goto L_0x00bf
                goto L_0x00cf
            L_0x00bf:
                m.d.e.a.e r14 = r1.mo35115j()
                m.d.e.a.e r4 = r14.mo35106c(r4)
                m.d.e.a.e r14 = r14.mo35106c(r1)
                m.d.e.a.e r5 = r14.mo35106c(r5)
            L_0x00cf:
                m.d.e.a.e r6 = r4.mo35109d(r6)
                m.d.e.a.e r7 = r5.mo35109d(r7)
                boolean r14 = r6.mo35112g()
                if (r14 == 0) goto L_0x00ed
                boolean r1 = r7.mo35112g()
                if (r1 == 0) goto L_0x00e8
                m.d.e.a.g r1 = r16.mo35166v()
                return r1
            L_0x00e8:
                m.d.e.a.g r1 = r3.mo35091k()
                return r1
            L_0x00ed:
                m.d.e.a.e r14 = r6.mo35115j()
                m.d.e.a.e r8 = r14.mo35106c(r6)
                m.d.e.a.e r4 = r14.mo35106c(r4)
                m.d.e.a.e r9 = r7.mo35115j()
                m.d.e.a.e r9 = r9.mo35100a(r8)
                m.d.e.a.e r11 = r0.mo35173g(r4)
                m.d.e.a.e r9 = r9.mo35109d(r11)
                m.d.e.a.e r4 = r4.mo35109d(r9)
                m.d.e.a.e r4 = r4.mo35102a(r7, r8, r5)
                if (r13 != 0) goto L_0x0118
                m.d.e.a.e r5 = r6.mo35106c(r12)
                goto L_0x0119
            L_0x0118:
                r5 = r6
            L_0x0119:
                if (r15 != 0) goto L_0x0120
                m.d.e.a.e r1 = r5.mo35106c(r1)
                goto L_0x0121
            L_0x0120:
                r1 = r5
            L_0x0121:
                r5 = r4
                r4 = r9
                if (r1 != r6) goto L_0x00a2
            L_0x0125:
                if (r2 != r10) goto L_0x0135
                m.d.e.a.e r2 = r0.mo35168b(r1, r14)
                r6 = 2
                m.d.e.a.e[] r6 = new p602m.p613d.p653e.p654a.C13812e[r6]
                r7 = 0
                r6[r7] = r1
                r8 = 1
                r6[r8] = r2
                goto L_0x013c
            L_0x0135:
                r7 = 0
                r8 = 1
                m.d.e.a.e[] r2 = new p602m.p613d.p653e.p654a.C13812e[r8]
                r2[r7] = r1
                r6 = r2
            L_0x013c:
                m.d.e.a.g$d r1 = new m.d.e.a.g$d
                boolean r7 = r0.f30672e
                r2 = r1
                r2.<init>(r3, r4, r5, r6, r7)
                return r1
            L_0x0145:
                m.d.e.a.e[] r2 = r0.f30671d
                r8 = 0
                r2 = r2[r8]
                m.d.e.a.e[] r1 = r1.f30671d
                r1 = r1[r8]
                boolean r8 = r2.mo35111f()
                boolean r9 = r1.mo35111f()
                if (r8 == 0) goto L_0x0159
                goto L_0x015d
            L_0x0159:
                m.d.e.a.e r7 = r7.mo35106c(r2)
            L_0x015d:
                if (r9 == 0) goto L_0x0160
                goto L_0x0164
            L_0x0160:
                m.d.e.a.e r5 = r5.mo35106c(r1)
            L_0x0164:
                m.d.e.a.e r7 = r7.mo35109d(r5)
                if (r8 == 0) goto L_0x016b
                goto L_0x016f
            L_0x016b:
                m.d.e.a.e r6 = r6.mo35106c(r2)
            L_0x016f:
                if (r9 == 0) goto L_0x0172
                goto L_0x0176
            L_0x0172:
                m.d.e.a.e r4 = r4.mo35106c(r1)
            L_0x0176:
                m.d.e.a.e r6 = r6.mo35109d(r4)
                boolean r10 = r6.mo35112g()
                if (r10 == 0) goto L_0x0190
                boolean r1 = r7.mo35112g()
                if (r1 == 0) goto L_0x018b
                m.d.e.a.g r1 = r16.mo35166v()
                return r1
            L_0x018b:
                m.d.e.a.g r1 = r3.mo35091k()
                return r1
            L_0x0190:
                if (r8 == 0) goto L_0x0194
                r2 = r1
                goto L_0x019b
            L_0x0194:
                if (r9 == 0) goto L_0x0197
                goto L_0x019b
            L_0x0197:
                m.d.e.a.e r2 = r2.mo35106c(r1)
            L_0x019b:
                m.d.e.a.e r1 = r6.mo35115j()
                m.d.e.a.e r8 = r1.mo35106c(r6)
                m.d.e.a.e r1 = r1.mo35106c(r4)
                m.d.e.a.e r4 = r7.mo35115j()
                m.d.e.a.e r4 = r4.mo35106c(r2)
                m.d.e.a.e r4 = r4.mo35109d(r8)
                m.d.e.a.e r9 = r0.mo35173g(r1)
                m.d.e.a.e r4 = r4.mo35109d(r9)
                m.d.e.a.e r6 = r6.mo35106c(r4)
                m.d.e.a.e r1 = r1.mo35109d(r4)
                m.d.e.a.e r5 = r1.mo35102a(r7, r5, r8)
                m.d.e.a.e r1 = r8.mo35106c(r2)
                m.d.e.a.g$d r8 = new m.d.e.a.g$d
                r2 = 1
                m.d.e.a.e[] r7 = new p602m.p613d.p653e.p654a.C13812e[r2]
                r2 = 0
                r7[r2] = r1
                boolean r1 = r0.f30672e
                r2 = r8
                r4 = r6
                r6 = r7
                r7 = r1
                r2.<init>(r3, r4, r5, r6, r7)
                return r8
            L_0x01dd:
                m.d.e.a.e r1 = r6.mo35109d(r4)
                m.d.e.a.e r2 = r7.mo35109d(r5)
                boolean r7 = r1.mo35112g()
                if (r7 == 0) goto L_0x01fb
                boolean r1 = r2.mo35112g()
                if (r1 == 0) goto L_0x01f6
                m.d.e.a.g r1 = r16.mo35166v()
                return r1
            L_0x01f6:
                m.d.e.a.g r1 = r3.mo35091k()
                return r1
            L_0x01fb:
                m.d.e.a.e r1 = r2.mo35104b(r1)
                m.d.e.a.e r2 = r1.mo35115j()
                m.d.e.a.e r2 = r2.mo35109d(r4)
                m.d.e.a.e r2 = r2.mo35109d(r6)
                m.d.e.a.e r4 = r4.mo35109d(r2)
                m.d.e.a.e r1 = r1.mo35106c(r4)
                m.d.e.a.e r1 = r1.mo35109d(r5)
                m.d.e.a.g$d r4 = new m.d.e.a.g$d
                boolean r5 = r0.f30672e
                r4.<init>(r3, r2, r1, r5)
                return r4
            */
            throw new UnsupportedOperationException("Method not decompiled: p602m.p613d.p653e.p654a.C13816g.C13820d.mo35134a(m.d.e.a.g):m.d.e.a.g");
        }

        C13820d(C13806d dVar, C13812e eVar, C13812e eVar2, C13812e[] eVarArr, boolean z) {
            super(dVar, eVar, eVar2, eVarArr);
            this.f30672e = z;
        }

        /* access modifiers changed from: protected */
        /* renamed from: d */
        public C13812e mo35170d(C13812e eVar) {
            return mo35171e(mo35173g(eVar));
        }

        /* access modifiers changed from: protected */
        /* renamed from: b */
        public C13812e mo35168b(C13812e eVar, C13812e eVar2) {
            C13812e eVar3;
            C13812e d = mo35148f().mo35082d();
            if (d.mo35112g() || eVar.mo35111f()) {
                return d;
            }
            if (eVar2 == null) {
                eVar2 = eVar.mo35115j();
            }
            C13812e j = eVar2.mo35115j();
            C13812e h = d.mo35113h();
            if (h.mo35103b() < d.mo35103b()) {
                eVar3 = j.mo35106c(h).mo35113h();
            } else {
                eVar3 = j.mo35106c(d);
            }
            return eVar3;
        }

        /* access modifiers changed from: protected */
        /* renamed from: b */
        public C13820d mo35169b(boolean z) {
            C13812e eVar = this.f30669b;
            C13812e eVar2 = this.f30670c;
            C13812e eVar3 = this.f30671d[0];
            C13812e w = mo35174w();
            C13812e a = mo35172f(eVar.mo35115j()).mo35100a(w);
            C13812e g = mo35173g(eVar2);
            C13812e c = g.mo35106c(eVar2);
            C13812e g2 = mo35173g(eVar.mo35106c(c));
            C13812e d = a.mo35115j().mo35109d(mo35173g(g2));
            C13812e g3 = mo35173g(c.mo35115j());
            C13812e d2 = a.mo35106c(g2.mo35109d(d)).mo35109d(g3);
            C13812e g4 = z ? mo35173g(g3.mo35106c(w)) : null;
            if (!eVar3.mo35111f()) {
                g = g.mo35106c(eVar3);
            }
            C13820d dVar = new C13820d(mo35148f(), d, d2, new C13812e[]{g, g4}, this.f30672e);
            return dVar;
        }
    }

    protected C13816g(C13806d dVar, C13812e eVar, C13812e eVar2) {
        this(dVar, eVar, eVar2, m42479a(dVar));
    }

    /* renamed from: a */
    protected static C13812e[] m42479a(C13806d dVar) {
        int g = dVar == null ? 0 : dVar.mo35086g();
        if (g == 0 || g == 5) {
            return f30667g;
        }
        C13812e a = dVar.mo35061a(C13805c.f30634b);
        if (!(g == 1 || g == 2)) {
            if (g == 3) {
                return new C13812e[]{a, a, a};
            } else if (g == 4) {
                return new C13812e[]{a, dVar.mo35082d()};
            } else if (g != 6) {
                throw new IllegalArgumentException("unknown coordinate system");
            }
        }
        return new C13812e[]{a};
    }

    /* renamed from: a */
    public abstract C13816g mo35134a(C13816g gVar);

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract C13816g mo35137b();

    /* renamed from: b */
    public C13816g mo35139b(C13812e eVar) {
        if (mo35157n()) {
            return this;
        }
        return mo35148f().mo35066a(mo35152i().mo35106c(eVar), mo35153j(), mo35154k(), this.f30672e);
    }

    /* renamed from: c */
    public C13812e mo35141c() {
        mo35135a();
        return mo35155l();
    }

    /* renamed from: c */
    public abstract C13816g mo35143c(C13816g gVar);

    /* renamed from: d */
    public C13812e mo35144d() {
        mo35135a();
        return mo35156m();
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public abstract boolean mo35146e();

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C13816g)) {
            return false;
        }
        return mo35140b((C13816g) obj);
    }

    /* renamed from: f */
    public C13806d mo35148f() {
        return this.f30668a;
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public int mo35149g() {
        C13806d dVar = this.f30668a;
        if (dVar == null) {
            return 0;
        }
        return dVar.mo35086g();
    }

    /* renamed from: h */
    public final C13816g mo35150h() {
        return mo35161r().mo35137b();
    }

    public int hashCode() {
        int i;
        C13806d f = mo35148f();
        if (f == null) {
            i = 0;
        } else {
            i = ~f.hashCode();
        }
        if (mo35157n()) {
            return i;
        }
        C13816g r = mo35161r();
        return (i ^ (r.mo35155l().hashCode() * 17)) ^ (r.mo35156m().hashCode() * 257);
    }

    /* renamed from: i */
    public final C13812e mo35152i() {
        return this.f30669b;
    }

    /* renamed from: j */
    public final C13812e mo35153j() {
        return this.f30670c;
    }

    /* access modifiers changed from: protected */
    /* renamed from: k */
    public final C13812e[] mo35154k() {
        return this.f30671d;
    }

    /* renamed from: l */
    public C13812e mo35155l() {
        return this.f30669b;
    }

    /* renamed from: m */
    public C13812e mo35156m() {
        return this.f30670c;
    }

    /* renamed from: n */
    public boolean mo35157n() {
        if (!(this.f30669b == null || this.f30670c == null)) {
            C13812e[] eVarArr = this.f30671d;
            if (eVarArr.length <= 0 || !eVarArr[0].mo35112g()) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: o */
    public boolean mo35158o() {
        int g = mo35149g();
        if (g == 0 || g == 5 || mo35157n() || this.f30671d[0].mo35111f()) {
            return true;
        }
        return false;
    }

    /* renamed from: p */
    public boolean mo35159p() {
        if (!mo35157n() && mo35148f() != null && (!mo35163t() || !mo35162s())) {
            return false;
        }
        return true;
    }

    /* renamed from: q */
    public abstract C13816g mo35160q();

    /* renamed from: r */
    public C13816g mo35161r() {
        if (mo35157n()) {
            return this;
        }
        int g = mo35149g();
        if (g == 0 || g == 5) {
            return this;
        }
        C13812e a = mo35130a(0);
        if (a.mo35111f()) {
            return this;
        }
        return mo35132a(a.mo35110e());
    }

    /* access modifiers changed from: protected */
    /* renamed from: s */
    public boolean mo35162s() {
        BigInteger f = this.f30668a.mo35085f();
        return f == null || f.equals(C13805c.f30634b) || !C13804b.m42341a(this, f).mo35157n();
    }

    /* access modifiers changed from: protected */
    /* renamed from: t */
    public abstract boolean mo35163t();

    public String toString() {
        if (mo35157n()) {
            return "INF";
        }
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append('(');
        stringBuffer.append(mo35152i());
        stringBuffer.append(',');
        stringBuffer.append(mo35153j());
        for (C13812e append : this.f30671d) {
            stringBuffer.append(',');
            stringBuffer.append(append);
        }
        stringBuffer.append(')');
        return stringBuffer.toString();
    }

    /* renamed from: u */
    public C13816g mo35165u() {
        return mo35145d(this);
    }

    /* renamed from: v */
    public abstract C13816g mo35166v();

    protected C13816g(C13806d dVar, C13812e eVar, C13812e eVar2, C13812e[] eVarArr) {
        this.f30673f = null;
        this.f30668a = dVar;
        this.f30669b = eVar;
        this.f30670c = eVar2;
        this.f30671d = eVarArr;
    }

    /* renamed from: b */
    public boolean mo35140b(C13816g gVar) {
        C13816g gVar2;
        C13816g gVar3;
        boolean z = false;
        if (gVar == null) {
            return false;
        }
        C13806d f = mo35148f();
        C13806d f2 = gVar.mo35148f();
        boolean z2 = f == null;
        boolean z3 = f2 == null;
        boolean n = mo35157n();
        boolean n2 = gVar.mo35157n();
        if (n || n2) {
            if (n && n2 && (z2 || z3 || f.mo35075a(f2))) {
                z = true;
            }
            return z;
        }
        if (!z2 || !z3) {
            if (z2) {
                gVar = gVar.mo35161r();
            } else {
                if (z3) {
                    gVar3 = gVar;
                    gVar2 = mo35161r();
                } else if (!f.mo35075a(f2)) {
                    return false;
                } else {
                    C13816g[] gVarArr = {this, f.mo35079b(gVar)};
                    f.mo35071a(gVarArr);
                    gVar2 = gVarArr[0];
                    gVar3 = gVarArr[1];
                }
                if (gVar2.mo35155l().equals(gVar3.mo35155l()) && gVar2.mo35156m().equals(gVar3.mo35156m())) {
                    z = true;
                }
                return z;
            }
        }
        gVar3 = gVar;
        gVar2 = this;
        z = true;
        return z;
    }

    /* renamed from: c */
    public C13816g mo35142c(C13812e eVar) {
        if (mo35157n()) {
            return this;
        }
        return mo35148f().mo35066a(mo35152i(), mo35153j().mo35106c(eVar), mo35154k(), this.f30672e);
    }

    /* renamed from: d */
    public C13816g mo35145d(C13816g gVar) {
        return mo35166v().mo35134a(gVar);
    }

    /* renamed from: a */
    public C13812e mo35130a(int i) {
        if (i >= 0) {
            C13812e[] eVarArr = this.f30671d;
            if (i < eVarArr.length) {
                return eVarArr[i];
            }
        }
        return null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo35135a() {
        if (!mo35158o()) {
            throw new IllegalStateException("point not in normal form");
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public C13816g mo35132a(C13812e eVar) {
        int g = mo35149g();
        if (g != 1) {
            if (g == 2 || g == 3 || g == 4) {
                C13812e j = eVar.mo35115j();
                return mo35133a(j, j.mo35106c(eVar));
            } else if (g != 6) {
                throw new IllegalStateException("not a projective coordinate system");
            }
        }
        return mo35133a(eVar, eVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public C13816g mo35133a(C13812e eVar, C13812e eVar2) {
        return mo35148f().mo35065a(mo35152i().mo35106c(eVar), mo35153j().mo35106c(eVar2), this.f30672e);
    }

    /* renamed from: b */
    public C13816g mo35138b(int i) {
        if (i >= 0) {
            C13816g gVar = this;
            while (true) {
                i--;
                if (i < 0) {
                    return gVar;
                }
                gVar = gVar.mo35166v();
            }
        } else {
            throw new IllegalArgumentException("'e' cannot be negative");
        }
    }

    /* renamed from: a */
    public byte[] mo35136a(boolean z) {
        if (mo35157n()) {
            return new byte[1];
        }
        C13816g r = mo35161r();
        byte[] c = r.mo35155l().mo35107c();
        if (z) {
            byte[] bArr = new byte[(c.length + 1)];
            bArr[0] = (byte) (r.mo35146e() ? 3 : 2);
            System.arraycopy(c, 0, bArr, 1, c.length);
            return bArr;
        }
        byte[] c2 = r.mo35156m().mo35107c();
        byte[] bArr2 = new byte[(c.length + c2.length + 1)];
        bArr2[0] = 4;
        System.arraycopy(c, 0, bArr2, 1, c.length);
        System.arraycopy(c2, 0, bArr2, c.length + 1, c2.length);
        return bArr2;
    }

    /* renamed from: a */
    public C13816g mo35131a(BigInteger bigInteger) {
        return mo35148f().mo35092l().mo35058a(this, bigInteger);
    }
}
