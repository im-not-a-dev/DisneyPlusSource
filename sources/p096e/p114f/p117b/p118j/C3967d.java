package p096e.p114f.p117b.p118j;

import java.util.ArrayList;
import p096e.p114f.p117b.p118j.C3973f.C3975b;

/* renamed from: e.f.b.j.d */
/* compiled from: ChainHead */
public class C3967d {

    /* renamed from: a */
    protected C3973f f9917a;

    /* renamed from: b */
    protected C3973f f9918b;

    /* renamed from: c */
    protected C3973f f9919c;

    /* renamed from: d */
    protected C3973f f9920d;

    /* renamed from: e */
    protected C3973f f9921e;

    /* renamed from: f */
    protected C3973f f9922f;

    /* renamed from: g */
    protected C3973f f9923g;

    /* renamed from: h */
    protected ArrayList<C3973f> f9924h;

    /* renamed from: i */
    protected int f9925i;

    /* renamed from: j */
    protected int f9926j;

    /* renamed from: k */
    protected float f9927k = 0.0f;

    /* renamed from: l */
    int f9928l;

    /* renamed from: m */
    int f9929m;

    /* renamed from: n */
    int f9930n;

    /* renamed from: o */
    boolean f9931o;

    /* renamed from: p */
    private int f9932p;

    /* renamed from: q */
    private boolean f9933q = false;

    /* renamed from: r */
    protected boolean f9934r;

    /* renamed from: s */
    protected boolean f9935s;

    /* renamed from: t */
    protected boolean f9936t;

    /* renamed from: u */
    private boolean f9937u;

    public C3967d(C3973f fVar, int i, boolean z) {
        this.f9917a = fVar;
        this.f9932p = i;
        this.f9933q = z;
    }

    /* renamed from: a */
    private static boolean m13426a(C3973f fVar, int i) {
        if (fVar.mo14315A() != 8 && fVar.f9985L[i] == C3975b.MATCH_CONSTRAINT) {
            int[] iArr = fVar.f10024m;
            if (iArr[i] == 0 || iArr[i] == 3) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: b */
    private void m13427b() {
        int i = this.f9932p * 2;
        C3973f fVar = this.f9917a;
        boolean z = true;
        this.f9931o = true;
        C3973f fVar2 = fVar;
        C3973f fVar3 = fVar2;
        boolean z2 = false;
        while (!z2) {
            this.f9925i++;
            C3973f[] fVarArr = fVar2.f9977F0;
            int i2 = this.f9932p;
            C3973f fVar4 = null;
            fVarArr[i2] = null;
            fVar2.f9975E0[i2] = null;
            if (fVar2.mo14315A() != 8) {
                this.f9928l++;
                if (fVar2.mo14356c(this.f9932p) != C3975b.MATCH_CONSTRAINT) {
                    this.f9929m += fVar2.mo14364d(this.f9932p);
                }
                this.f9929m += fVar2.f9983J[i].mo14304b();
                int i3 = i + 1;
                this.f9929m += fVar2.f9983J[i3].mo14304b();
                this.f9930n += fVar2.f9983J[i].mo14304b();
                this.f9930n += fVar2.f9983J[i3].mo14304b();
                if (this.f9918b == null) {
                    this.f9918b = fVar2;
                }
                this.f9920d = fVar2;
                C3975b[] bVarArr = fVar2.f9985L;
                int i4 = this.f9932p;
                if (bVarArr[i4] == C3975b.MATCH_CONSTRAINT) {
                    int[] iArr = fVar2.f10024m;
                    if (iArr[i4] == 0 || iArr[i4] == 3 || iArr[i4] == 2) {
                        this.f9926j++;
                        float[] fArr = fVar2.f9973D0;
                        int i5 = this.f9932p;
                        float f = fArr[i5];
                        if (f > 0.0f) {
                            this.f9927k += fArr[i5];
                        }
                        if (m13426a(fVar2, this.f9932p)) {
                            if (f < 0.0f) {
                                this.f9934r = true;
                            } else {
                                this.f9935s = true;
                            }
                            if (this.f9924h == null) {
                                this.f9924h = new ArrayList<>();
                            }
                            this.f9924h.add(fVar2);
                        }
                        if (this.f9922f == null) {
                            this.f9922f = fVar2;
                        }
                        C3973f fVar5 = this.f9923g;
                        if (fVar5 != null) {
                            fVar5.f9975E0[this.f9932p] = fVar2;
                        }
                        this.f9923g = fVar2;
                    }
                    if (this.f9932p == 0) {
                        if (fVar2.f10020k != 0) {
                            this.f9931o = false;
                        } else if (!(fVar2.f10026n == 0 && fVar2.f10028o == 0)) {
                            this.f9931o = false;
                        }
                    } else if (fVar2.f10022l != 0) {
                        this.f9931o = false;
                    } else if (!(fVar2.f10032q == 0 && fVar2.f10034r == 0)) {
                        this.f9931o = false;
                    }
                    if (fVar2.f9989P != 0.0f) {
                        this.f9931o = false;
                    }
                }
            }
            if (fVar3 != fVar2) {
                fVar3.f9977F0[this.f9932p] = fVar2;
            }
            C3968e eVar = fVar2.f9983J[i + 1].f9941d;
            if (eVar != null) {
                C3973f fVar6 = eVar.f9939b;
                C3968e[] eVarArr = fVar6.f9983J;
                if (eVarArr[i].f9941d != null && eVarArr[i].f9941d.f9939b == fVar2) {
                    fVar4 = fVar6;
                }
            }
            if (fVar4 == null) {
                fVar4 = fVar2;
                z2 = true;
            }
            fVar3 = fVar2;
            fVar2 = fVar4;
        }
        C3973f fVar7 = this.f9918b;
        if (fVar7 != null) {
            this.f9929m -= fVar7.f9983J[i].mo14304b();
        }
        C3973f fVar8 = this.f9920d;
        if (fVar8 != null) {
            this.f9929m -= fVar8.f9983J[i + 1].mo14304b();
        }
        this.f9919c = fVar2;
        if (this.f9932p != 0 || !this.f9933q) {
            this.f9921e = this.f9917a;
        } else {
            this.f9921e = this.f9919c;
        }
        if (!this.f9935s || !this.f9934r) {
            z = false;
        }
        this.f9936t = z;
    }

    /* renamed from: a */
    public void mo14295a() {
        if (!this.f9937u) {
            m13427b();
        }
        this.f9937u = true;
    }
}
