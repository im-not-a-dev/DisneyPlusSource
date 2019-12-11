package p096e.p114f.p117b.p118j;

import java.util.ArrayList;
import java.util.HashMap;
import p096e.p114f.p117b.C3957e;
import p096e.p114f.p117b.p118j.C3973f.C3975b;

/* renamed from: e.f.b.j.i */
/* compiled from: Flow */
public class C3978i extends C3991s {
    /* access modifiers changed from: private */

    /* renamed from: T0 */
    public int f10082T0 = -1;
    /* access modifiers changed from: private */

    /* renamed from: U0 */
    public int f10083U0 = -1;
    /* access modifiers changed from: private */

    /* renamed from: V0 */
    public int f10084V0 = -1;
    /* access modifiers changed from: private */

    /* renamed from: W0 */
    public int f10085W0 = -1;
    /* access modifiers changed from: private */

    /* renamed from: X0 */
    public float f10086X0 = 0.5f;
    /* access modifiers changed from: private */

    /* renamed from: Y0 */
    public float f10087Y0 = 0.5f;
    /* access modifiers changed from: private */

    /* renamed from: Z0 */
    public float f10088Z0 = 0.5f;
    /* access modifiers changed from: private */

    /* renamed from: a1 */
    public float f10089a1 = 0.5f;
    /* access modifiers changed from: private */

    /* renamed from: b1 */
    public int f10090b1 = 0;
    /* access modifiers changed from: private */

    /* renamed from: c1 */
    public int f10091c1 = 0;
    /* access modifiers changed from: private */

    /* renamed from: d1 */
    public int f10092d1 = 2;
    /* access modifiers changed from: private */

    /* renamed from: e1 */
    public int f10093e1 = 2;

    /* renamed from: f1 */
    private int f10094f1 = 0;

    /* renamed from: g1 */
    private int f10095g1 = -1;

    /* renamed from: h1 */
    private int f10096h1 = 0;

    /* renamed from: i1 */
    private ArrayList<C3979a> f10097i1 = new ArrayList<>();

    /* renamed from: j1 */
    private C3973f[] f10098j1 = null;

    /* renamed from: k1 */
    private C3973f[] f10099k1 = null;

    /* renamed from: l1 */
    private int[] f10100l1 = null;

    /* renamed from: e.f.b.j.i$a */
    /* compiled from: Flow */
    private class C3979a {

        /* renamed from: a */
        private int f10101a = 0;
        /* access modifiers changed from: private */

        /* renamed from: b */
        public C3973f f10102b = null;

        /* renamed from: c */
        int f10103c = 0;

        /* renamed from: d */
        private C3968e f10104d;

        /* renamed from: e */
        private C3968e f10105e;

        /* renamed from: f */
        private C3968e f10106f;

        /* renamed from: g */
        private C3968e f10107g;

        /* renamed from: h */
        private int f10108h = 0;

        /* renamed from: i */
        private int f10109i = 0;

        /* renamed from: j */
        private int f10110j = 0;

        /* renamed from: k */
        private int f10111k = 0;

        /* renamed from: l */
        private int f10112l = 0;

        /* renamed from: m */
        private int f10113m = 0;

        /* renamed from: n */
        private int f10114n = 0;

        /* renamed from: o */
        private int f10115o = 0;

        public C3979a(int i, C3968e eVar, C3968e eVar2, C3968e eVar3, C3968e eVar4) {
            this.f10101a = i;
            this.f10104d = eVar;
            this.f10105e = eVar2;
            this.f10106f = eVar3;
            this.f10107g = eVar4;
            this.f10108h = C3978i.this.mo14494V();
            this.f10109i = C3978i.this.mo14496X();
            this.f10110j = C3978i.this.mo14495W();
            this.f10111k = C3978i.this.mo14493U();
        }

        /* renamed from: b */
        public int mo14456b() {
            if (this.f10101a == 1) {
                return this.f10113m - C3978i.this.f10091c1;
            }
            return this.f10113m;
        }

        /* renamed from: c */
        public int mo14457c() {
            if (this.f10101a == 0) {
                return this.f10112l - C3978i.this.f10090b1;
            }
            return this.f10112l;
        }

        /* renamed from: a */
        public void mo14453a(int i, C3968e eVar, C3968e eVar2, C3968e eVar3, C3968e eVar4, int i2, int i3, int i4, int i5) {
            this.f10101a = i;
            this.f10104d = eVar;
            this.f10105e = eVar2;
            this.f10106f = eVar3;
            this.f10107g = eVar4;
            this.f10108h = i2;
            this.f10109i = i3;
            this.f10110j = i4;
            this.f10111k = i5;
        }

        /* renamed from: a */
        public void mo14451a() {
            this.f10103c = 0;
            this.f10102b = null;
            this.f10112l = 0;
            this.f10113m = 0;
            this.f10114n = 0;
            this.f10115o = 0;
        }

        /* renamed from: a */
        public void mo14452a(int i) {
            this.f10114n = i;
        }

        /* renamed from: a */
        public void mo14454a(C3973f fVar) {
            int i = 0;
            if (this.f10101a == 0) {
                int a = C3978i.this.m13595e(fVar);
                int a2 = C3978i.this.f10090b1;
                if (fVar.mo14315A() != 8) {
                    i = a2;
                }
                this.f10112l += a + i;
                int b = C3978i.this.m13592d(fVar);
                if (this.f10102b == null || this.f10103c < b) {
                    this.f10102b = fVar;
                    this.f10103c = b;
                    this.f10113m = b;
                }
            } else {
                int a3 = C3978i.this.m13595e(fVar);
                int b2 = C3978i.this.m13592d(fVar);
                int b3 = C3978i.this.f10091c1;
                if (fVar.mo14315A() != 8) {
                    i = b3;
                }
                this.f10113m += b2 + i;
                if (this.f10102b == null || this.f10103c < a3) {
                    this.f10102b = fVar;
                    this.f10103c = a3;
                    this.f10112l = a3;
                }
            }
            this.f10115o++;
        }

        /* renamed from: a */
        public void mo14455a(boolean z, int i, boolean z2) {
            int i2 = this.f10115o;
            for (int i3 = 0; i3 < i2; i3++) {
                C3978i.this.f10124J0[this.f10114n + i3].mo14326L();
            }
            if (i2 != 0 && this.f10102b != null) {
                boolean z3 = z2 && i == 0;
                int i4 = 0;
                int i5 = -1;
                int i6 = -1;
                while (i4 < i2) {
                    if (C3978i.this.f10124J0[this.f10114n + (z ? (i2 - 1) - i4 : i4)].mo14315A() == 0) {
                        if (i5 == -1) {
                            i5 = i4;
                        }
                        i6 = i4;
                    }
                    i4++;
                }
                C3973f fVar = null;
                if (this.f10101a == 0) {
                    C3973f fVar2 = this.f10102b;
                    fVar2.mo14396s(C3978i.this.f10083U0);
                    int i7 = this.f10109i;
                    if (i > 0) {
                        i7 += C3978i.this.f10091c1;
                    }
                    fVar2.f9970C.mo14300a(this.f10105e, i7);
                    if (z2) {
                        fVar2.f9974E.mo14300a(this.f10107g, this.f10111k);
                    }
                    if (i > 0) {
                        this.f10105e.f9939b.f9974E.mo14300a(fVar2.f9970C, 0);
                    }
                    int i8 = 0;
                    while (i8 < i2) {
                        C3973f fVar3 = C3978i.this.f10124J0[this.f10114n + (z ? (i2 - 1) - i8 : i8)];
                        if (i8 == 0) {
                            fVar3.mo14338a(fVar3.f9968B, this.f10104d, this.f10108h);
                            int h = C3978i.this.f10082T0;
                            float i9 = C3978i.this.f10086X0;
                            if (this.f10114n == 0 && C3978i.this.f10084V0 != -1) {
                                h = C3978i.this.f10084V0;
                                i9 = C3978i.this.f10088Z0;
                            }
                            fVar3.mo14386n(h);
                            fVar3.mo14331a(i9);
                        }
                        if (i8 == i2 - 1) {
                            fVar3.mo14338a(fVar3.f9972D, this.f10106f, this.f10110j);
                        }
                        if (fVar != null) {
                            fVar3.f9968B.mo14300a(fVar.f9972D, C3978i.this.f10090b1);
                            if (i8 == i5) {
                                fVar3.f9968B.mo14297a(this.f10108h);
                            }
                            fVar.f9972D.mo14300a(fVar3.f9968B, 0);
                            if (i8 == i6 + 1) {
                                fVar.f9972D.mo14297a(this.f10110j);
                            }
                        }
                        if (fVar3 != fVar2) {
                            if (C3978i.this.f10093e1 != 3 || !fVar2.mo14321G() || !fVar3.mo14321G()) {
                                int l = C3978i.this.f10093e1;
                                if (l == 0) {
                                    fVar3.f9970C.mo14300a(fVar2.f9970C, 0);
                                } else if (l == 1) {
                                    fVar3.f9974E.mo14300a(fVar2.f9974E, 0);
                                } else if (z3) {
                                    fVar3.f9970C.mo14300a(this.f10105e, this.f10109i);
                                    fVar3.f9974E.mo14300a(this.f10107g, this.f10111k);
                                } else {
                                    fVar3.f9970C.mo14300a(fVar2.f9970C, 0);
                                    fVar3.f9974E.mo14300a(fVar2.f9974E, 0);
                                }
                            } else {
                                fVar3.f9976F.mo14300a(fVar2.f9976F, 0);
                            }
                        }
                        i8++;
                        fVar = fVar3;
                    }
                    return;
                }
                C3973f fVar4 = this.f10102b;
                fVar4.mo14386n(C3978i.this.f10083U0);
                int i10 = this.f10108h;
                if (i > 0) {
                    i10 += C3978i.this.f10090b1;
                }
                if (z) {
                    fVar4.f9972D.mo14300a(this.f10106f, i10);
                    if (z2) {
                        fVar4.f9968B.mo14300a(this.f10104d, this.f10110j);
                    }
                    if (i > 0) {
                        this.f10106f.f9939b.f9968B.mo14300a(fVar4.f9972D, 0);
                    }
                } else {
                    fVar4.f9968B.mo14300a(this.f10104d, i10);
                    if (z2) {
                        fVar4.f9972D.mo14300a(this.f10106f, this.f10110j);
                    }
                    if (i > 0) {
                        this.f10104d.f9939b.f9972D.mo14300a(fVar4.f9968B, 0);
                    }
                }
                int i11 = 0;
                while (i11 < i2) {
                    C3973f fVar5 = C3978i.this.f10124J0[this.f10114n + i11];
                    if (i11 == 0) {
                        fVar5.mo14338a(fVar5.f9970C, this.f10105e, this.f10109i);
                        int g = C3978i.this.f10083U0;
                        float c = C3978i.this.f10087Y0;
                        if (this.f10114n == 0 && C3978i.this.f10085W0 != -1) {
                            g = C3978i.this.f10085W0;
                            c = C3978i.this.f10089a1;
                        }
                        fVar5.mo14396s(g);
                        fVar5.mo14358c(c);
                    }
                    if (i11 == i2 - 1) {
                        fVar5.mo14338a(fVar5.f9974E, this.f10107g, this.f10111k);
                    }
                    if (fVar != null) {
                        fVar5.f9970C.mo14300a(fVar.f9974E, C3978i.this.f10091c1);
                        if (i11 == i5) {
                            fVar5.f9970C.mo14297a(this.f10109i);
                        }
                        fVar.f9974E.mo14300a(fVar5.f9970C, 0);
                        if (i11 == i6 + 1) {
                            fVar.f9974E.mo14297a(this.f10111k);
                        }
                    }
                    if (fVar5 != fVar4) {
                        if (z) {
                            int f = C3978i.this.f10092d1;
                            if (f == 0) {
                                fVar5.f9972D.mo14300a(fVar4.f9972D, 0);
                            } else if (f == 1) {
                                fVar5.f9968B.mo14300a(fVar4.f9968B, 0);
                            } else if (f == 2) {
                                fVar5.f9968B.mo14300a(fVar4.f9968B, 0);
                                fVar5.f9972D.mo14300a(fVar4.f9972D, 0);
                            }
                        } else {
                            int f2 = C3978i.this.f10092d1;
                            if (f2 == 0) {
                                fVar5.f9968B.mo14300a(fVar4.f9968B, 0);
                            } else if (f2 == 1) {
                                fVar5.f9972D.mo14300a(fVar4.f9972D, 0);
                            } else if (f2 == 2) {
                                if (z3) {
                                    fVar5.f9968B.mo14300a(this.f10104d, this.f10108h);
                                    fVar5.f9972D.mo14300a(this.f10106f, this.f10110j);
                                } else {
                                    fVar5.f9968B.mo14300a(fVar4.f9968B, 0);
                                    fVar5.f9972D.mo14300a(fVar4.f9972D, 0);
                                }
                            }
                        }
                    }
                    i11++;
                    fVar = fVar5;
                }
            }
        }
    }

    /* renamed from: E */
    public void mo14435E(int i) {
        this.f10084V0 = i;
    }

    /* renamed from: F */
    public void mo14436F(int i) {
        this.f10085W0 = i;
    }

    /* renamed from: G */
    public void mo14437G(int i) {
        this.f10092d1 = i;
    }

    /* renamed from: H */
    public void mo14438H(int i) {
        this.f10090b1 = i;
    }

    /* renamed from: I */
    public void mo14439I(int i) {
        this.f10082T0 = i;
    }

    /* renamed from: J */
    public void mo14440J(int i) {
        this.f10095g1 = i;
    }

    /* renamed from: K */
    public void mo14441K(int i) {
        this.f10096h1 = i;
    }

    /* renamed from: L */
    public void mo14442L(int i) {
        this.f10093e1 = i;
    }

    /* renamed from: M */
    public void mo14443M(int i) {
        this.f10091c1 = i;
    }

    /* renamed from: N */
    public void mo14444N(int i) {
        this.f10083U0 = i;
    }

    /* renamed from: O */
    public void mo14445O(int i) {
        this.f10094f1 = i;
    }

    /* renamed from: c */
    private void m13591c(C3973f[] fVarArr, int i, int i2, int[] iArr) {
        C3979a aVar;
        int i3 = this.f10125K0;
        if (i3 != 0) {
            if (this.f10097i1.size() == 0) {
                C3979a aVar2 = new C3979a(i, this.f9968B, this.f9970C, this.f9972D, this.f9974E);
                this.f10097i1.add(aVar2);
                aVar = aVar2;
            } else {
                aVar = (C3979a) this.f10097i1.get(0);
                aVar.mo14451a();
                aVar.mo14453a(i, this.f9968B, this.f9970C, this.f9972D, this.f9974E, mo14494V(), mo14496X(), mo14495W(), mo14493U());
            }
            for (int i4 = 0; i4 < i3; i4++) {
                aVar.mo14454a(fVarArr[i4]);
            }
            iArr[0] = aVar.mo14457c();
            iArr[1] = aVar.mo14456b();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public final int m13592d(C3973f fVar) {
        if (fVar == null) {
            return 0;
        }
        if (fVar.mo14410z() == C3975b.MATCH_CONSTRAINT && fVar.f10022l == 0) {
            return 0;
        }
        return fVar.mo14381l();
    }

    /* renamed from: e */
    public void mo14447e(float f) {
        this.f10088Z0 = f;
    }

    /* renamed from: f */
    public void mo14448f(float f) {
        this.f10089a1 = f;
    }

    /* renamed from: g */
    public void mo14449g(float f) {
        this.f10086X0 = f;
    }

    /* renamed from: h */
    public void mo14450h(float f) {
        this.f10087Y0 = f;
    }

    /* access modifiers changed from: private */
    /* renamed from: e */
    public final int m13595e(C3973f fVar) {
        if (fVar == null) {
            return 0;
        }
        if (fVar.mo14387o() == C3975b.MATCH_CONSTRAINT && fVar.f10020k == 0) {
            return 0;
        }
        return fVar.mo14316B();
    }

    /* renamed from: a */
    public void mo14291a(C3973f fVar, HashMap<C3973f, C3973f> hashMap) {
        super.mo14291a(fVar, hashMap);
        C3978i iVar = (C3978i) fVar;
        this.f10082T0 = iVar.f10082T0;
        this.f10083U0 = iVar.f10083U0;
        this.f10084V0 = iVar.f10084V0;
        this.f10085W0 = iVar.f10085W0;
        this.f10086X0 = iVar.f10086X0;
        this.f10087Y0 = iVar.f10087Y0;
        this.f10088Z0 = iVar.f10088Z0;
        this.f10089a1 = iVar.f10089a1;
        this.f10090b1 = iVar.f10090b1;
        this.f10091c1 = iVar.f10091c1;
        this.f10092d1 = iVar.f10092d1;
        this.f10093e1 = iVar.f10093e1;
        this.f10094f1 = iVar.f10094f1;
        this.f10095g1 = iVar.f10095g1;
        this.f10096h1 = iVar.f10096h1;
    }

    /* renamed from: b */
    public void mo14446b(int i, int i2, int i3, int i4) {
        boolean z = false;
        if (this.f10125K0 <= 0 || mo14497Y()) {
            int V = mo14494V();
            int W = mo14495W();
            int X = mo14496X();
            int U = mo14493U();
            int[] iArr = new int[2];
            int i5 = (i2 - V) - W;
            if (this.f10096h1 == 1) {
                i5 = (i4 - X) - U;
            }
            if (this.f10096h1 == 0) {
                if (this.f10082T0 == -1) {
                    this.f10082T0 = 0;
                }
                if (this.f10083U0 == -1) {
                    this.f10083U0 = 0;
                }
            } else {
                if (this.f10082T0 == -1) {
                    this.f10082T0 = 0;
                }
                if (this.f10083U0 == -1) {
                    this.f10083U0 = 0;
                }
            }
            int i6 = this.f10094f1;
            if (i6 == 0) {
                m13591c(this.f10124J0, this.f10096h1, i5, iArr);
            } else if (i6 == 1) {
                m13589b(this.f10124J0, this.f10096h1, i5, iArr);
            } else if (i6 == 2) {
                m13586a(this.f10124J0, this.f10096h1, i5, iArr);
            }
            int i7 = iArr[0] + V + W;
            int i8 = iArr[1] + X + U;
            if (i != 1073741824) {
                i2 = i == Integer.MIN_VALUE ? Math.min(i7, i2) : i == 0 ? i7 : 0;
            }
            if (i3 != 1073741824) {
                i4 = i3 == Integer.MIN_VALUE ? Math.min(i8, i4) : i3 == 0 ? i8 : 0;
            }
            mo14500e(i2, i4);
            if (this.f10125K0 > 0) {
                z = true;
            }
            mo14499d(z);
            return;
        }
        mo14500e(0, 0);
        mo14499d(false);
    }

    /* renamed from: e */
    private void m13596e(boolean z) {
        if (this.f10100l1 != null && this.f10099k1 != null && this.f10098j1 != null) {
            for (int i = 0; i < this.f10125K0; i++) {
                this.f10124J0[i].mo14326L();
            }
            int[] iArr = this.f10100l1;
            int i2 = iArr[0];
            int i3 = iArr[1];
            C3973f fVar = null;
            for (int i4 = 0; i4 < i2; i4++) {
                C3973f fVar2 = this.f10099k1[z ? (i2 - i4) - 1 : i4];
                if (fVar2 != null) {
                    if (i4 == 0) {
                        fVar2.mo14338a(fVar2.f9968B, this.f9968B, mo14494V());
                        fVar2.mo14386n(this.f10082T0);
                        fVar2.mo14331a(this.f10086X0);
                    }
                    if (i4 == i2 - 1) {
                        fVar2.mo14338a(fVar2.f9972D, this.f9972D, mo14495W());
                    }
                    if (i4 > 0) {
                        fVar2.mo14338a(fVar2.f9968B, fVar.f9972D, this.f10090b1);
                        fVar.mo14338a(fVar.f9972D, fVar2.f9968B, 0);
                    }
                    fVar = fVar2;
                }
            }
            for (int i5 = 0; i5 < i3; i5++) {
                C3973f fVar3 = this.f10098j1[i5];
                if (fVar3 != null) {
                    if (i5 == 0) {
                        fVar3.mo14338a(fVar3.f9970C, this.f9970C, mo14496X());
                        fVar3.mo14396s(this.f10083U0);
                        fVar3.mo14358c(this.f10087Y0);
                    }
                    if (i5 == i3 - 1) {
                        fVar3.mo14338a(fVar3.f9974E, this.f9974E, mo14493U());
                    }
                    if (i5 > 0) {
                        fVar3.mo14338a(fVar3.f9970C, fVar.f9974E, this.f10091c1);
                        fVar.mo14338a(fVar.f9974E, fVar3.f9970C, 0);
                    }
                    fVar = fVar3;
                }
            }
            for (int i6 = 0; i6 < i2; i6++) {
                for (int i7 = 0; i7 < i3; i7++) {
                    int i8 = (i7 * i2) + i6;
                    if (this.f10096h1 == 1) {
                        i8 = (i6 * i3) + i7;
                    }
                    C3973f[] fVarArr = this.f10124J0;
                    if (i8 < fVarArr.length) {
                        C3973f fVar4 = fVarArr[i8];
                        if (fVar4 != null) {
                            C3973f fVar5 = this.f10099k1[i6];
                            C3973f fVar6 = this.f10098j1[i7];
                            if (fVar4 != fVar5) {
                                fVar4.mo14338a(fVar4.f9968B, fVar5.f9968B, 0);
                                fVar4.mo14338a(fVar4.f9972D, fVar5.f9972D, 0);
                            }
                            if (fVar4 != fVar6) {
                                fVar4.mo14338a(fVar4.f9970C, fVar6.f9970C, 0);
                                fVar4.mo14338a(fVar4.f9974E, fVar6.f9974E, 0);
                            }
                        }
                    }
                }
            }
        }
    }

    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Regions count limit reached
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:89)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:27)
        	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$1(DepthTraversal.java:14)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
        	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
        	at jadx.core.ProcessClass.process(ProcessClass.java:30)
        	at jadx.core.ProcessClass.lambda$processDependencies$0(ProcessClass.java:49)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
        	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:49)
        	at jadx.core.ProcessClass.process(ProcessClass.java:35)
        	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:311)
        	at jadx.api.JavaClass.decompile(JavaClass.java:62)
        	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:217)
        */
    /* JADX WARNING: Removed duplicated region for block: B:121:0x012c A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x0065  */
    /* renamed from: a */
    private void m13586a(p096e.p114f.p117b.p118j.C3973f[] r12, int r13, int r14, int[] r15) {
        /*
            r11 = this;
            r0 = 0
            if (r13 != 0) goto L_0x0028
            int r1 = r11.f10095g1
            if (r1 > 0) goto L_0x0025
            r1 = 0
            r2 = 0
            r3 = 0
        L_0x000a:
            int r4 = r11.f10125K0
            if (r1 >= r4) goto L_0x0026
            if (r1 <= 0) goto L_0x0013
            int r4 = r11.f10090b1
            int r2 = r2 + r4
        L_0x0013:
            r4 = r12[r1]
            if (r4 != 0) goto L_0x0018
            goto L_0x0022
        L_0x0018:
            int r4 = r11.m13595e(r4)
            int r2 = r2 + r4
            if (r2 <= r14) goto L_0x0020
            goto L_0x0026
        L_0x0020:
            int r3 = r3 + 1
        L_0x0022:
            int r1 = r1 + 1
            goto L_0x000a
        L_0x0025:
            r3 = r1
        L_0x0026:
            r1 = 0
            goto L_0x004c
        L_0x0028:
            int r1 = r11.f10095g1
            if (r1 > 0) goto L_0x004b
            r1 = 0
            r2 = 0
            r3 = 0
        L_0x002f:
            int r4 = r11.f10125K0
            if (r1 >= r4) goto L_0x004a
            if (r1 <= 0) goto L_0x0038
            int r4 = r11.f10091c1
            int r2 = r2 + r4
        L_0x0038:
            r4 = r12[r1]
            if (r4 != 0) goto L_0x003d
            goto L_0x0047
        L_0x003d:
            int r4 = r11.m13592d(r4)
            int r2 = r2 + r4
            if (r2 <= r14) goto L_0x0045
            goto L_0x004a
        L_0x0045:
            int r3 = r3 + 1
        L_0x0047:
            int r1 = r1 + 1
            goto L_0x002f
        L_0x004a:
            r1 = r3
        L_0x004b:
            r3 = 0
        L_0x004c:
            int[] r2 = r11.f10100l1
            if (r2 != 0) goto L_0x0055
            r2 = 2
            int[] r2 = new int[r2]
            r11.f10100l1 = r2
        L_0x0055:
            r2 = 1
            if (r1 != 0) goto L_0x005a
            if (r13 == r2) goto L_0x005e
        L_0x005a:
            if (r3 != 0) goto L_0x0061
            if (r13 != 0) goto L_0x0061
        L_0x005e:
            r4 = r1
        L_0x005f:
            r1 = 1
            goto L_0x0063
        L_0x0061:
            r4 = r1
            r1 = 0
        L_0x0063:
            if (r1 != 0) goto L_0x012c
            if (r13 != 0) goto L_0x0073
            int r4 = r11.f10125K0
            float r4 = (float) r4
            float r5 = (float) r3
            float r4 = r4 / r5
            double r4 = (double) r4
            double r4 = java.lang.Math.ceil(r4)
            int r4 = (int) r4
            goto L_0x007e
        L_0x0073:
            int r3 = r11.f10125K0
            float r3 = (float) r3
            float r5 = (float) r4
            float r3 = r3 / r5
            double r5 = (double) r3
            double r5 = java.lang.Math.ceil(r5)
            int r3 = (int) r5
        L_0x007e:
            e.f.b.j.f[] r5 = r11.f10099k1
            r6 = 0
            if (r5 == 0) goto L_0x008b
            int r7 = r5.length
            if (r7 >= r3) goto L_0x0087
            goto L_0x008b
        L_0x0087:
            java.util.Arrays.fill(r5, r6)
            goto L_0x008f
        L_0x008b:
            e.f.b.j.f[] r5 = new p096e.p114f.p117b.p118j.C3973f[r3]
            r11.f10099k1 = r5
        L_0x008f:
            e.f.b.j.f[] r5 = r11.f10098j1
            if (r5 == 0) goto L_0x009b
            int r7 = r5.length
            if (r7 >= r4) goto L_0x0097
            goto L_0x009b
        L_0x0097:
            java.util.Arrays.fill(r5, r6)
            goto L_0x009f
        L_0x009b:
            e.f.b.j.f[] r5 = new p096e.p114f.p117b.p118j.C3973f[r4]
            r11.f10098j1 = r5
        L_0x009f:
            r5 = 0
        L_0x00a0:
            if (r5 >= r3) goto L_0x00e8
            r6 = 0
        L_0x00a3:
            if (r6 >= r4) goto L_0x00e5
            int r7 = r6 * r3
            int r7 = r7 + r5
            if (r13 != r2) goto L_0x00ad
            int r7 = r5 * r4
            int r7 = r7 + r6
        L_0x00ad:
            int r8 = r12.length
            if (r7 < r8) goto L_0x00b1
            goto L_0x00e2
        L_0x00b1:
            r7 = r12[r7]
            if (r7 != 0) goto L_0x00b6
            goto L_0x00e2
        L_0x00b6:
            int r8 = r11.m13595e(r7)
            e.f.b.j.f[] r9 = r11.f10099k1
            r10 = r9[r5]
            if (r10 == 0) goto L_0x00c8
            r9 = r9[r5]
            int r9 = r9.mo14316B()
            if (r9 >= r8) goto L_0x00cc
        L_0x00c8:
            e.f.b.j.f[] r8 = r11.f10099k1
            r8[r5] = r7
        L_0x00cc:
            int r8 = r11.m13592d(r7)
            e.f.b.j.f[] r9 = r11.f10098j1
            r10 = r9[r6]
            if (r10 == 0) goto L_0x00de
            r9 = r9[r6]
            int r9 = r9.mo14381l()
            if (r9 >= r8) goto L_0x00e2
        L_0x00de:
            e.f.b.j.f[] r8 = r11.f10098j1
            r8[r6] = r7
        L_0x00e2:
            int r6 = r6 + 1
            goto L_0x00a3
        L_0x00e5:
            int r5 = r5 + 1
            goto L_0x00a0
        L_0x00e8:
            r5 = 0
            r6 = 0
        L_0x00ea:
            if (r5 >= r3) goto L_0x00ff
            e.f.b.j.f[] r7 = r11.f10099k1
            r7 = r7[r5]
            if (r7 == 0) goto L_0x00fc
            if (r5 <= 0) goto L_0x00f7
            int r8 = r11.f10090b1
            int r6 = r6 + r8
        L_0x00f7:
            int r7 = r11.m13595e(r7)
            int r6 = r6 + r7
        L_0x00fc:
            int r5 = r5 + 1
            goto L_0x00ea
        L_0x00ff:
            r5 = 0
            r7 = 0
        L_0x0101:
            if (r5 >= r4) goto L_0x0116
            e.f.b.j.f[] r8 = r11.f10098j1
            r8 = r8[r5]
            if (r8 == 0) goto L_0x0113
            if (r5 <= 0) goto L_0x010e
            int r9 = r11.f10091c1
            int r7 = r7 + r9
        L_0x010e:
            int r8 = r11.m13592d(r8)
            int r7 = r7 + r8
        L_0x0113:
            int r5 = r5 + 1
            goto L_0x0101
        L_0x0116:
            r15[r0] = r6
            r15[r2] = r7
            if (r13 != 0) goto L_0x0124
            if (r6 <= r14) goto L_0x005f
            if (r3 <= r2) goto L_0x005f
            int r3 = r3 + -1
            goto L_0x0063
        L_0x0124:
            if (r7 <= r14) goto L_0x005f
            if (r4 <= r2) goto L_0x005f
            int r4 = r4 + -1
            goto L_0x0063
        L_0x012c:
            int[] r12 = r11.f10100l1
            r12[r0] = r3
            r12[r2] = r4
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p096e.p114f.p117b.p118j.C3978i.m13586a(e.f.b.j.f[], int, int, int[]):void");
    }

    /* renamed from: b */
    private void m13589b(C3973f[] fVarArr, int i, int i2, int[] iArr) {
        int i3;
        int i4;
        int i5 = i2;
        int i6 = this.f10125K0;
        if (i6 != 0) {
            this.f10097i1.clear();
            C3979a aVar = new C3979a(i, this.f9968B, this.f9970C, this.f9972D, this.f9974E);
            this.f10097i1.add(aVar);
            if (i == 0) {
                int i7 = this.f10090b1 * 2;
                C3979a aVar2 = aVar;
                for (int i8 = 0; i8 < i6; i8++) {
                    C3973f fVar = fVarArr[i8];
                    int e = m13595e(fVar);
                    boolean z = (i7 + e) + this.f10090b1 > i5 && aVar2.f10102b != null;
                    if (!z && i8 > 0) {
                        int i9 = this.f10095g1;
                        if (i9 > 0 && i8 % i9 == 0) {
                            z = true;
                        }
                    }
                    if (z) {
                        i4 = this.f10090b1 * 2;
                        C3979a aVar3 = new C3979a(i, this.f9968B, this.f9970C, this.f9972D, this.f9974E);
                        aVar3.mo14452a(i8);
                        this.f10097i1.add(aVar3);
                        aVar2 = aVar3;
                    } else {
                        i4 = i7;
                    }
                    i7 = i4 + e + this.f10090b1;
                    aVar2.mo14454a(fVar);
                }
            } else {
                int i10 = this.f10091c1 * 2;
                C3979a aVar4 = aVar;
                for (int i11 = 0; i11 < i6; i11++) {
                    C3973f fVar2 = fVarArr[i11];
                    int d = m13592d(fVar2);
                    boolean z2 = (i10 + d) + this.f10091c1 > i5 && aVar4.f10102b != null;
                    if (!z2 && i11 > 0) {
                        int i12 = this.f10095g1;
                        if (i12 > 0 && i11 % i12 == 0) {
                            z2 = true;
                        }
                    }
                    if (z2) {
                        i3 = this.f10091c1 * 2;
                        C3979a aVar5 = new C3979a(i, this.f9968B, this.f9970C, this.f9972D, this.f9974E);
                        aVar5.mo14452a(i11);
                        this.f10097i1.add(aVar5);
                        aVar4 = aVar5;
                    } else {
                        i3 = i10;
                    }
                    i10 = i3 + d;
                    aVar4.mo14454a(fVar2);
                }
            }
            int size = this.f10097i1.size();
            C3968e eVar = this.f9968B;
            C3968e eVar2 = this.f9970C;
            C3968e eVar3 = this.f9972D;
            C3968e eVar4 = this.f9974E;
            C3968e eVar5 = eVar3;
            int V = mo14494V();
            int X = mo14496X();
            int W = mo14495W();
            int U = mo14493U();
            int i13 = 0;
            C3968e eVar6 = eVar2;
            C3968e eVar7 = eVar4;
            int i14 = 0;
            C3968e eVar8 = eVar;
            for (int i15 = 0; i15 < size; i15++) {
                C3979a aVar6 = (C3979a) this.f10097i1.get(i15);
                if (i == 0) {
                    if (i15 < size - 1) {
                        eVar7 = ((C3979a) this.f10097i1.get(i15 + 1)).f10102b.f9970C;
                        U = 0;
                    } else {
                        eVar7 = this.f9974E;
                        U = mo14493U();
                    }
                    eVar6 = aVar6.f10102b.f9974E;
                    aVar6.mo14453a(i, eVar8, eVar6, eVar5, eVar7, V, X, W, U);
                    i14 = Math.max(i14, aVar6.mo14457c());
                    i13 += aVar6.mo14456b();
                    if (i15 > 0) {
                        i13 += this.f10091c1;
                    }
                    X = 0;
                } else {
                    if (i15 < size - 1) {
                        eVar5 = ((C3979a) this.f10097i1.get(i15 + 1)).f10102b.f9968B;
                        W = 0;
                    } else {
                        eVar5 = this.f9972D;
                        W = mo14495W();
                    }
                    eVar8 = aVar6.f10102b.f9972D;
                    aVar6.mo14453a(i, eVar8, eVar6, eVar5, eVar7, V, X, W, U);
                    i14 += aVar6.mo14457c();
                    i13 = Math.max(i13, aVar6.mo14456b());
                    if (i15 > 0) {
                        i14 += this.f10090b1;
                    }
                    V = 0;
                }
            }
            iArr[0] = i14;
            iArr[1] = i13;
        }
    }

    /* renamed from: a */
    public void mo14290a(C3957e eVar) {
        super.mo14290a(eVar);
        boolean a0 = mo14393r() != null ? ((C3976g) mo14393r()).mo14423a0() : false;
        int i = this.f10094f1;
        if (i != 0) {
            if (i == 1) {
                int size = this.f10097i1.size();
                int i2 = 0;
                while (i2 < size) {
                    ((C3979a) this.f10097i1.get(i2)).mo14455a(a0, i2, i2 == size + -1);
                    i2++;
                }
            } else if (i == 2) {
                m13596e(a0);
            }
        } else if (this.f10097i1.size() > 0) {
            ((C3979a) this.f10097i1.get(0)).mo14455a(a0, 0, true);
        }
        mo14499d(false);
    }
}
