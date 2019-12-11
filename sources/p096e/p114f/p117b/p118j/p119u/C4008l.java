package p096e.p114f.p117b.p118j.p119u;

import p096e.p114f.p117b.p118j.C3968e;
import p096e.p114f.p117b.p118j.C3968e.C3972d;
import p096e.p114f.p117b.p118j.C3973f;
import p096e.p114f.p117b.p118j.C3973f.C3975b;
import p096e.p114f.p117b.p118j.C3982k;

/* renamed from: e.f.b.j.u.l */
/* compiled from: VerticalWidgetRun */
public class C4008l extends C4010m {

    /* renamed from: k */
    public C4000f f10205k;

    /* renamed from: l */
    C4002g f10206l;

    /* renamed from: e.f.b.j.u.l$a */
    /* compiled from: VerticalWidgetRun */
    static /* synthetic */ class C4009a {

        /* renamed from: a */
        static final /* synthetic */ int[] f10207a = new int[C4012b.values().length];

        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|8) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0014 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001f */
        static {
            /*
                e.f.b.j.u.m$b[] r0 = p096e.p114f.p117b.p118j.p119u.C4010m.C4012b.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f10207a = r0
                int[] r0 = f10207a     // Catch:{ NoSuchFieldError -> 0x0014 }
                e.f.b.j.u.m$b r1 = p096e.p114f.p117b.p118j.p119u.C4010m.C4012b.START     // Catch:{ NoSuchFieldError -> 0x0014 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0014 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0014 }
            L_0x0014:
                int[] r0 = f10207a     // Catch:{ NoSuchFieldError -> 0x001f }
                e.f.b.j.u.m$b r1 = p096e.p114f.p117b.p118j.p119u.C4010m.C4012b.END     // Catch:{ NoSuchFieldError -> 0x001f }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001f }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001f }
            L_0x001f:
                int[] r0 = f10207a     // Catch:{ NoSuchFieldError -> 0x002a }
                e.f.b.j.u.m$b r1 = p096e.p114f.p117b.p118j.p119u.C4010m.C4012b.CENTER     // Catch:{ NoSuchFieldError -> 0x002a }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x002a }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x002a }
            L_0x002a:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p096e.p114f.p117b.p118j.p119u.C4008l.C4009a.<clinit>():void");
        }
    }

    public C4008l(C3973f fVar) {
        super(fVar);
        this.f10205k = new C4000f(this);
        this.f10206l = null;
        this.f10215h.f10181e = C4001a.TOP;
        this.f10216i.f10181e = C4001a.BOTTOM;
        this.f10205k.f10181e = C4001a.BASELINE;
        this.f10213f = 1;
    }

    /* renamed from: a */
    public void mo14508a(C3998d dVar) {
        int i;
        float f;
        float f2;
        float f3;
        int i2 = C4009a.f10207a[this.f10217j.ordinal()];
        if (i2 == 1) {
            mo14539c(dVar);
        } else if (i2 == 2) {
            mo14538b(dVar);
        } else if (i2 == 3) {
            C3973f fVar = this.f10209b;
            mo14535a(dVar, fVar.f9970C, fVar.f9974E, 1);
            return;
        }
        C4002g gVar = this.f10212e;
        if (gVar.f10179c && !gVar.f10186j && this.f10211d == C3975b.MATCH_CONSTRAINT) {
            C3973f fVar2 = this.f10209b;
            int i3 = fVar2.f10022l;
            if (i3 == 2) {
                C3973f r = fVar2.mo14393r();
                if (r != null) {
                    C4002g gVar2 = r.f10008e.f10212e;
                    if (gVar2.f10186j) {
                        this.f10212e.mo14523a((int) ((((float) gVar2.f10183g) * this.f10209b.f10036s) + 0.5f));
                    }
                }
            } else if (i3 == 3 && fVar2.f10006d.f10212e.f10186j) {
                int i4 = fVar2.mo14375i();
                if (i4 == -1) {
                    C3973f fVar3 = this.f10209b;
                    f3 = (float) fVar3.f10006d.f10212e.f10183g;
                    f2 = fVar3.mo14373h();
                } else if (i4 == 0) {
                    C3973f fVar4 = this.f10209b;
                    f = ((float) fVar4.f10006d.f10212e.f10183g) * fVar4.mo14373h();
                    i = (int) (f + 0.5f);
                    this.f10212e.mo14523a(i);
                } else if (i4 != 1) {
                    i = 0;
                    this.f10212e.mo14523a(i);
                } else {
                    C3973f fVar5 = this.f10209b;
                    f3 = (float) fVar5.f10006d.f10212e.f10183g;
                    f2 = fVar5.mo14373h();
                }
                f = f3 / f2;
                i = (int) (f + 0.5f);
                this.f10212e.mo14523a(i);
            }
        }
        C4000f fVar6 = this.f10215h;
        if (fVar6.f10179c) {
            C4000f fVar7 = this.f10216i;
            if (fVar7.f10179c && (!fVar6.f10186j || !fVar7.f10186j || !this.f10212e.f10186j)) {
                if (!this.f10212e.f10186j && this.f10211d == C3975b.MATCH_CONSTRAINT) {
                    C3973f fVar8 = this.f10209b;
                    if (fVar8.f10020k == 0 && !fVar8.mo14324J()) {
                        C4000f fVar9 = (C4000f) this.f10216i.f10188l.get(0);
                        int i5 = ((C4000f) this.f10215h.f10188l.get(0)).f10183g;
                        C4000f fVar10 = this.f10215h;
                        int i6 = i5 + fVar10.f10182f;
                        int i7 = fVar9.f10183g + this.f10216i.f10182f;
                        int i8 = i7 - i6;
                        fVar10.mo14523a(i6);
                        this.f10216i.mo14523a(i7);
                        this.f10212e.mo14523a(i8);
                        return;
                    }
                }
                if (!this.f10212e.f10186j && this.f10211d == C3975b.MATCH_CONSTRAINT && this.f10208a == 1 && this.f10215h.f10188l.size() > 0 && this.f10216i.f10188l.size() > 0) {
                    int i9 = ((C4000f) this.f10215h.f10188l.get(0)).f10183g + this.f10215h.f10182f;
                    int i10 = (((C4000f) this.f10216i.f10188l.get(0)).f10183g + this.f10216i.f10182f) - i9;
                    C4002g gVar3 = this.f10212e;
                    int i11 = gVar3.f10198m;
                    if (i10 < i11) {
                        gVar3.mo14523a(i10);
                    } else {
                        gVar3.mo14523a(i11);
                    }
                }
                if (this.f10212e.f10186j && this.f10215h.f10188l.size() > 0 && this.f10216i.f10188l.size() > 0) {
                    C4000f fVar11 = (C4000f) this.f10215h.f10188l.get(0);
                    C4000f fVar12 = (C4000f) this.f10216i.f10188l.get(0);
                    int i12 = fVar11.f10183g + this.f10215h.f10182f;
                    int i13 = fVar12.f10183g + this.f10216i.f10182f;
                    float x = this.f10209b.mo14406x();
                    if (fVar11 == fVar12) {
                        i12 = fVar11.f10183g;
                        i13 = fVar12.f10183g;
                        x = 0.5f;
                    }
                    this.f10215h.mo14523a((int) (((float) i12) + 0.5f + (((float) ((i13 - i12) - this.f10212e.f10183g)) * x)));
                    this.f10216i.mo14523a(this.f10215h.f10183g + this.f10212e.f10183g);
                }
            }
        }
    }

    /* renamed from: b */
    public void mo14509b() {
        this.f10209b.mo14382l(this.f10215h.f10183g);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public void mo14510c() {
        this.f10210c = null;
        this.f10215h.mo14522a();
        this.f10216i.mo14522a();
        this.f10205k.mo14522a();
        this.f10212e.mo14522a();
        this.f10214g = false;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: e */
    public boolean mo14512e() {
        if (this.f10211d != C3975b.MATCH_CONSTRAINT || this.f10209b.f10022l == 0) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: f */
    public void mo14530f() {
        this.f10214g = false;
        this.f10215h.f10186j = false;
        this.f10216i.f10186j = false;
        this.f10205k.f10186j = false;
        this.f10212e.f10186j = false;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("VerticalRun ");
        sb.append(this.f10209b.mo14372g());
        return sb.toString();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo14507a() {
        C3973f fVar = this.f10209b;
        if (fVar.f10000a) {
            this.f10212e.mo14523a(fVar.mo14381l());
        }
        if (!this.f10212e.f10186j) {
            this.f10211d = this.f10209b.mo14410z();
            if (this.f10209b.mo14321G()) {
                this.f10206l = new C3993a(this);
            }
            C3975b bVar = this.f10211d;
            if (bVar != C3975b.MATCH_CONSTRAINT) {
                if (bVar == C3975b.MATCH_PARENT) {
                    C3973f r = this.f10209b.mo14393r();
                    if (r != null && r.mo14410z() == C3975b.FIXED) {
                        int l = (r.mo14381l() - this.f10209b.f9970C.mo14304b()) - this.f10209b.f9974E.mo14304b();
                        mo14536a(this.f10215h, r.f10008e.f10215h, this.f10209b.f9970C.mo14304b());
                        mo14536a(this.f10216i, r.f10008e.f10216i, -this.f10209b.f9974E.mo14304b());
                        this.f10212e.mo14523a(l);
                        return;
                    }
                }
                if (this.f10211d == C3975b.FIXED) {
                    this.f10212e.mo14523a(this.f10209b.mo14381l());
                }
            }
        } else if (this.f10211d == C3975b.MATCH_PARENT) {
            C3973f r2 = this.f10209b.mo14393r();
            if (r2 != null && r2.mo14410z() == C3975b.FIXED) {
                mo14536a(this.f10215h, r2.f10008e.f10215h, this.f10209b.f9970C.mo14304b());
                mo14536a(this.f10216i, r2.f10008e.f10216i, -this.f10209b.f9974E.mo14304b());
                return;
            }
        }
        if (this.f10212e.f10186j) {
            C3973f fVar2 = this.f10209b;
            if (fVar2.f10000a) {
                C3968e[] eVarArr = fVar2.f9983J;
                if (eVarArr[2].f9941d == null || eVarArr[3].f9941d == null) {
                    C3973f fVar3 = this.f10209b;
                    C3968e[] eVarArr2 = fVar3.f9983J;
                    if (eVarArr2[2].f9941d != null) {
                        C4000f a = mo14533a(eVarArr2[2]);
                        if (a != null) {
                            mo14536a(this.f10215h, a, this.f10209b.f9983J[2].mo14304b());
                            mo14536a(this.f10216i, this.f10215h, this.f10212e.f10183g);
                            if (this.f10209b.mo14321G()) {
                                mo14536a(this.f10205k, this.f10215h, this.f10209b.mo14363d());
                            }
                        }
                    } else if (eVarArr2[3].f9941d != null) {
                        C4000f a2 = mo14533a(eVarArr2[3]);
                        if (a2 != null) {
                            mo14536a(this.f10216i, a2, -this.f10209b.f9983J[3].mo14304b());
                            mo14536a(this.f10215h, this.f10216i, -this.f10212e.f10183g);
                        }
                        if (this.f10209b.mo14321G()) {
                            mo14536a(this.f10205k, this.f10215h, this.f10209b.mo14363d());
                        }
                    } else if (eVarArr2[4].f9941d != null) {
                        C4000f a3 = mo14533a(eVarArr2[4]);
                        if (a3 != null) {
                            mo14536a(this.f10205k, a3, 0);
                            mo14536a(this.f10215h, this.f10205k, -this.f10209b.mo14363d());
                            mo14536a(this.f10216i, this.f10215h, this.f10212e.f10183g);
                        }
                    } else if (!(fVar3 instanceof C3982k) && fVar3.mo14393r() != null && this.f10209b.mo14330a(C3972d.CENTER).f9941d == null) {
                        mo14536a(this.f10215h, this.f10209b.mo14393r().f10008e.f10215h, 0);
                        mo14536a(this.f10216i, this.f10215h, this.f10212e.f10183g);
                        if (this.f10209b.mo14321G()) {
                            mo14536a(this.f10205k, this.f10215h, this.f10209b.mo14363d());
                        }
                    }
                }
                if (fVar2.mo14324J()) {
                    this.f10215h.f10182f = this.f10209b.f9983J[2].mo14304b();
                    this.f10216i.f10182f = -this.f10209b.f9983J[3].mo14304b();
                } else {
                    C4000f a4 = mo14533a(this.f10209b.f9983J[2]);
                    if (a4 != null) {
                        mo14536a(this.f10215h, a4, this.f10209b.f9983J[2].mo14304b());
                    }
                    C4000f a5 = mo14533a(this.f10209b.f9983J[3]);
                    if (a5 != null) {
                        mo14536a(this.f10216i, a5, -this.f10209b.f9983J[3].mo14304b());
                    }
                    this.f10215h.f10178b = true;
                    this.f10216i.f10178b = true;
                }
                if (this.f10209b.mo14321G()) {
                    mo14536a(this.f10205k, this.f10215h, this.f10209b.mo14363d());
                }
            }
        }
        if (this.f10212e.f10186j || this.f10211d != C3975b.MATCH_CONSTRAINT) {
            this.f10212e.mo14524b(this);
        } else {
            C3973f fVar4 = this.f10209b;
            int i = fVar4.f10022l;
            if (i == 2) {
                C3973f r3 = fVar4.mo14393r();
                if (r3 != null) {
                    C4002g gVar = r3.f10008e.f10212e;
                    this.f10212e.f10188l.add(gVar);
                    gVar.f10187k.add(this.f10212e);
                    C4002g gVar2 = this.f10212e;
                    gVar2.f10178b = true;
                    gVar2.f10187k.add(this.f10215h);
                    this.f10212e.f10187k.add(this.f10216i);
                }
            } else if (i == 3 && !fVar4.mo14324J()) {
                C3973f fVar5 = this.f10209b;
                if (fVar5.f10020k != 3) {
                    C4002g gVar3 = fVar5.f10006d.f10212e;
                    this.f10212e.f10188l.add(gVar3);
                    gVar3.f10187k.add(this.f10212e);
                    C4002g gVar4 = this.f10212e;
                    gVar4.f10178b = true;
                    gVar4.f10187k.add(this.f10215h);
                    this.f10212e.f10187k.add(this.f10216i);
                }
            }
        }
        C3973f fVar6 = this.f10209b;
        C3968e[] eVarArr3 = fVar6.f9983J;
        if (eVarArr3[2].f9941d == null || eVarArr3[3].f9941d == null) {
            C3973f fVar7 = this.f10209b;
            C3968e[] eVarArr4 = fVar7.f9983J;
            if (eVarArr4[2].f9941d != null) {
                C4000f a6 = mo14533a(eVarArr4[2]);
                if (a6 != null) {
                    mo14536a(this.f10215h, a6, this.f10209b.f9983J[2].mo14304b());
                    mo14537a(this.f10216i, this.f10215h, 1, this.f10212e);
                    if (this.f10209b.mo14321G()) {
                        mo14537a(this.f10205k, this.f10215h, 1, this.f10206l);
                    }
                    if (this.f10211d == C3975b.MATCH_CONSTRAINT && this.f10209b.mo14373h() > 0.0f) {
                        C4005j jVar = this.f10209b.f10006d;
                        if (jVar.f10211d == C3975b.MATCH_CONSTRAINT) {
                            jVar.f10212e.f10187k.add(this.f10212e);
                            this.f10212e.f10188l.add(this.f10209b.f10006d.f10212e);
                            this.f10212e.f10177a = this;
                        }
                    }
                }
            } else if (eVarArr4[3].f9941d != null) {
                C4000f a7 = mo14533a(eVarArr4[3]);
                if (a7 != null) {
                    mo14536a(this.f10216i, a7, -this.f10209b.f9983J[3].mo14304b());
                    mo14537a(this.f10215h, this.f10216i, -1, this.f10212e);
                    if (this.f10209b.mo14321G()) {
                        mo14537a(this.f10205k, this.f10215h, 1, this.f10206l);
                    }
                }
            } else if (eVarArr4[4].f9941d != null) {
                C4000f a8 = mo14533a(eVarArr4[4]);
                if (a8 != null) {
                    mo14536a(this.f10205k, a8, 0);
                    mo14537a(this.f10215h, this.f10205k, -1, this.f10206l);
                    mo14537a(this.f10216i, this.f10215h, 1, this.f10212e);
                }
            } else if (!(fVar7 instanceof C3982k) && fVar7.mo14393r() != null) {
                mo14536a(this.f10215h, this.f10209b.mo14393r().f10008e.f10215h, 0);
                mo14537a(this.f10216i, this.f10215h, 1, this.f10212e);
                if (this.f10209b.mo14321G()) {
                    mo14537a(this.f10205k, this.f10215h, 1, this.f10206l);
                }
                if (this.f10211d == C3975b.MATCH_CONSTRAINT && this.f10209b.mo14373h() > 0.0f) {
                    C4005j jVar2 = this.f10209b.f10006d;
                    if (jVar2.f10211d == C3975b.MATCH_CONSTRAINT) {
                        jVar2.f10212e.f10187k.add(this.f10212e);
                        this.f10212e.f10188l.add(this.f10209b.f10006d.f10212e);
                        this.f10212e.f10177a = this;
                    }
                }
            }
        } else {
            if (fVar6.mo14324J()) {
                this.f10215h.f10182f = this.f10209b.f9983J[2].mo14304b();
                this.f10216i.f10182f = -this.f10209b.f9983J[3].mo14304b();
            } else {
                C4000f a9 = mo14533a(this.f10209b.f9983J[2]);
                C4000f a10 = mo14533a(this.f10209b.f9983J[3]);
                a9.mo14524b(this);
                a10.mo14524b(this);
                this.f10217j = C4012b.CENTER;
            }
            if (this.f10209b.mo14321G()) {
                mo14537a(this.f10205k, this.f10215h, 1, this.f10206l);
            }
        }
        if (this.f10212e.f10188l.size() == 0) {
            this.f10212e.f10179c = true;
        }
    }
}
