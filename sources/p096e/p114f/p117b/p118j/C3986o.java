package p096e.p114f.p117b.p118j;

import p096e.p114f.p117b.C3957e;
import p096e.p114f.p117b.C3959f;
import p096e.p114f.p117b.C3962i;
import p096e.p114f.p117b.p118j.C3968e.C3972d;

/* renamed from: e.f.b.j.o */
/* compiled from: ResolutionAnchor */
public class C3986o extends C3988q {

    /* renamed from: c */
    C3968e f10127c;

    /* renamed from: d */
    C3986o f10128d;

    /* renamed from: e */
    float f10129e;

    /* renamed from: f */
    C3986o f10130f;

    /* renamed from: g */
    float f10131g;

    /* renamed from: h */
    int f10132h = 0;

    /* renamed from: i */
    private C3986o f10133i;

    /* renamed from: j */
    private C3987p f10134j = null;

    /* renamed from: k */
    private int f10135k = 1;

    /* renamed from: l */
    private C3987p f10136l = null;

    /* renamed from: m */
    private int f10137m = 1;

    public C3986o(C3968e eVar) {
        this.f10127c = eVar;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public String mo14467a(int i) {
        return i == 1 ? "DIRECT" : i == 2 ? "CENTER" : i == 3 ? "MATCH" : i == 4 ? "CHAIN" : i == 5 ? "BARRIER" : "UNCONNECTED";
    }

    /* renamed from: a */
    public void mo14470a(C3986o oVar, float f) {
        if (this.f10140b == 0 || !(this.f10130f == oVar || this.f10131g == f)) {
            this.f10130f = oVar;
            this.f10131g = f;
            if (this.f10140b == 1) {
                mo14482b();
            }
            mo14480a();
        }
    }

    /* renamed from: b */
    public void mo14473b(int i) {
        this.f10132h = i;
    }

    /* renamed from: c */
    public void mo14476c() {
        super.mo14476c();
        this.f10128d = null;
        this.f10129e = 0.0f;
        this.f10134j = null;
        this.f10135k = 1;
        this.f10136l = null;
        this.f10137m = 1;
        this.f10130f = null;
        this.f10131g = 0.0f;
        this.f10133i = null;
        this.f10132h = 0;
    }

    /* renamed from: d */
    public void mo14477d() {
        float f;
        float f2;
        float f3;
        float f4;
        boolean z = true;
        if (this.f10140b != 1 && this.f10132h != 4) {
            C3987p pVar = this.f10134j;
            if (pVar != null) {
                if (pVar.f10140b == 1) {
                    this.f10129e = ((float) this.f10135k) * pVar.f10138c;
                } else {
                    return;
                }
            }
            C3987p pVar2 = this.f10136l;
            if (pVar2 != null) {
                if (pVar2.f10140b == 1) {
                    float f5 = pVar2.f10138c;
                } else {
                    return;
                }
            }
            if (this.f10132h == 1) {
                C3986o oVar = this.f10128d;
                if (oVar == null || oVar.f10140b == 1) {
                    C3986o oVar2 = this.f10128d;
                    if (oVar2 == null) {
                        this.f10130f = this;
                        this.f10131g = this.f10129e;
                    } else {
                        this.f10130f = oVar2.f10130f;
                        this.f10131g = oVar2.f10131g + this.f10129e;
                    }
                    mo14480a();
                }
            }
            if (this.f10132h == 2) {
                C3986o oVar3 = this.f10128d;
                if (oVar3 != null && oVar3.f10140b == 1) {
                    C3986o oVar4 = this.f10133i;
                    if (oVar4 != null) {
                        C3986o oVar5 = oVar4.f10128d;
                        if (oVar5 != null && oVar5.f10140b == 1) {
                            if (C3957e.m13372h() != null) {
                                C3959f h = C3957e.m13372h();
                                h.f9890w++;
                            }
                            this.f10130f = this.f10128d.f10130f;
                            C3986o oVar6 = this.f10133i;
                            oVar6.f10130f = oVar6.f10128d.f10130f;
                            C3972d dVar = this.f10127c.f9940c;
                            int i = 0;
                            if (!(dVar == C3972d.RIGHT || dVar == C3972d.BOTTOM)) {
                                z = false;
                            }
                            if (z) {
                                f2 = this.f10128d.f10131g;
                                f = this.f10133i.f10128d.f10131g;
                            } else {
                                f2 = this.f10133i.f10128d.f10131g;
                                f = this.f10128d.f10131g;
                            }
                            float f6 = f2 - f;
                            C3968e eVar = this.f10127c;
                            C3972d dVar2 = eVar.f9940c;
                            if (dVar2 == C3972d.LEFT || dVar2 == C3972d.RIGHT) {
                                f4 = f6 - ((float) this.f10127c.f9939b.mo14316B());
                                f3 = this.f10127c.f9939b.f10013g0;
                            } else {
                                f4 = f6 - ((float) eVar.f9939b.mo14381l());
                                f3 = this.f10127c.f9939b.f10015h0;
                            }
                            int b = this.f10127c.mo14304b();
                            int b2 = this.f10133i.f10127c.mo14304b();
                            if (this.f10127c.mo14310h() == this.f10133i.f10127c.mo14310h()) {
                                f3 = 0.5f;
                                b2 = 0;
                            } else {
                                i = b;
                            }
                            float f7 = (float) i;
                            float f8 = (float) b2;
                            float f9 = (f4 - f7) - f8;
                            if (z) {
                                C3986o oVar7 = this.f10133i;
                                oVar7.f10131g = oVar7.f10128d.f10131g + f8 + (f9 * f3);
                                this.f10131g = (this.f10128d.f10131g - f7) - (f9 * (1.0f - f3));
                            } else {
                                this.f10131g = this.f10128d.f10131g + f7 + (f9 * f3);
                                C3986o oVar8 = this.f10133i;
                                oVar8.f10131g = (oVar8.f10128d.f10131g - f8) - (f9 * (1.0f - f3));
                            }
                            mo14480a();
                            this.f10133i.mo14480a();
                        }
                    }
                }
            }
            if (this.f10132h == 3) {
                C3986o oVar9 = this.f10128d;
                if (oVar9 != null && oVar9.f10140b == 1) {
                    C3986o oVar10 = this.f10133i;
                    if (oVar10 != null) {
                        C3986o oVar11 = oVar10.f10128d;
                        if (oVar11 != null && oVar11.f10140b == 1) {
                            if (C3957e.m13372h() != null) {
                                C3959f h2 = C3957e.m13372h();
                                h2.f9891x++;
                            }
                            C3986o oVar12 = this.f10128d;
                            this.f10130f = oVar12.f10130f;
                            C3986o oVar13 = this.f10133i;
                            C3986o oVar14 = oVar13.f10128d;
                            oVar13.f10130f = oVar14.f10130f;
                            this.f10131g = oVar12.f10131g + this.f10129e;
                            oVar13.f10131g = oVar14.f10131g + oVar13.f10129e;
                            mo14480a();
                            this.f10133i.mo14480a();
                        }
                    }
                }
            }
            if (this.f10132h == 5) {
                this.f10127c.f9939b.mo14285N();
            }
        }
    }

    /* renamed from: e */
    public void mo14478e() {
        C3968e h = this.f10127c.mo14310h();
        if (h != null) {
            if (h.mo14310h() == this.f10127c) {
                this.f10132h = 4;
                h.mo14307e().f10132h = 4;
            }
            int b = this.f10127c.mo14304b();
            C3972d dVar = this.f10127c.f9940c;
            if (dVar == C3972d.RIGHT || dVar == C3972d.BOTTOM) {
                b = -b;
            }
            mo14471a(h.mo14307e(), b);
        }
    }

    public String toString() {
        if (this.f10140b == 1) {
            String str = ", RESOLVED: ";
            String str2 = "[";
            if (this.f10130f == this) {
                StringBuilder sb = new StringBuilder();
                sb.append(str2);
                sb.append(this.f10127c);
                sb.append(str);
                sb.append(this.f10131g);
                sb.append("]  type: ");
                sb.append(mo14467a(this.f10132h));
                return sb.toString();
            }
            StringBuilder sb2 = new StringBuilder();
            sb2.append(str2);
            sb2.append(this.f10127c);
            sb2.append(str);
            sb2.append(this.f10130f);
            sb2.append(":");
            sb2.append(this.f10131g);
            sb2.append("] type: ");
            sb2.append(mo14467a(this.f10132h));
            return sb2.toString();
        }
        StringBuilder sb3 = new StringBuilder();
        sb3.append("{ ");
        sb3.append(this.f10127c);
        sb3.append(" UNRESOLVED} type: ");
        sb3.append(mo14467a(this.f10132h));
        return sb3.toString();
    }

    /* renamed from: b */
    public void mo14474b(C3986o oVar, float f) {
        this.f10133i = oVar;
    }

    /* renamed from: b */
    public void mo14475b(C3986o oVar, int i, C3987p pVar) {
        this.f10133i = oVar;
        this.f10136l = pVar;
        this.f10137m = i;
    }

    /* renamed from: a */
    public void mo14468a(int i, C3986o oVar, int i2) {
        this.f10132h = i;
        this.f10128d = oVar;
        this.f10129e = (float) i2;
        this.f10128d.mo14481a(this);
    }

    /* renamed from: a */
    public void mo14471a(C3986o oVar, int i) {
        this.f10128d = oVar;
        this.f10129e = (float) i;
        this.f10128d.mo14481a(this);
    }

    /* renamed from: a */
    public void mo14472a(C3986o oVar, int i, C3987p pVar) {
        this.f10128d = oVar;
        this.f10128d.mo14481a(this);
        this.f10134j = pVar;
        this.f10135k = i;
        this.f10134j.mo14481a(this);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo14469a(C3957e eVar) {
        C3962i f = this.f10127c.mo14308f();
        C3986o oVar = this.f10130f;
        if (oVar == null) {
            eVar.mo14260a(f, (int) (this.f10131g + 0.5f));
        } else {
            eVar.mo14253a(f, eVar.mo14256a((Object) oVar.f10127c), (int) (this.f10131g + 0.5f), 6);
        }
    }
}
