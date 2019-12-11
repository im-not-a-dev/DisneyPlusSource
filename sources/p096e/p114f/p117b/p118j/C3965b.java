package p096e.p114f.p117b.p118j;

import java.util.ArrayList;
import java.util.HashMap;
import p096e.p114f.p117b.C3957e;
import p096e.p114f.p117b.C3959f;

/* renamed from: e.f.b.j.b */
/* compiled from: Barrier */
public class C3965b extends C3983l {

    /* renamed from: L0 */
    private int f9913L0 = 0;

    /* renamed from: M0 */
    private ArrayList<C3986o> f9914M0 = new ArrayList<>(4);

    /* renamed from: N0 */
    private boolean f9915N0 = true;

    /* renamed from: O0 */
    private int f9916O0 = 0;

    /* renamed from: A */
    public void mo14283A(int i) {
        this.f9916O0 = i;
    }

    /* renamed from: M */
    public void mo14284M() {
        super.mo14284M();
        this.f9914M0.clear();
    }

    /* renamed from: N */
    public void mo14285N() {
        C3986o oVar;
        float f;
        C3986o oVar2;
        int i = this.f9913L0;
        float f2 = Float.MAX_VALUE;
        if (i != 0) {
            if (i == 1) {
                oVar = this.f9972D.mo14307e();
            } else if (i == 2) {
                oVar = this.f9970C.mo14307e();
            } else if (i == 3) {
                oVar = this.f9974E.mo14307e();
            } else {
                return;
            }
            f2 = 0.0f;
        } else {
            oVar = this.f9968B.mo14307e();
        }
        int size = this.f9914M0.size();
        C3986o oVar3 = null;
        int i2 = 0;
        while (i2 < size) {
            C3986o oVar4 = (C3986o) this.f9914M0.get(i2);
            if (oVar4.f10140b == 1) {
                int i3 = this.f9913L0;
                if (i3 == 0 || i3 == 2) {
                    f = oVar4.f10131g;
                    if (f < f2) {
                        oVar2 = oVar4.f10130f;
                    } else {
                        i2++;
                    }
                } else {
                    f = oVar4.f10131g;
                    if (f > f2) {
                        oVar2 = oVar4.f10130f;
                    } else {
                        i2++;
                    }
                }
                oVar3 = oVar2;
                f2 = f;
                i2++;
            } else {
                return;
            }
        }
        float f3 = f2 + ((float) this.f9916O0);
        if (C3957e.m13372h() != null) {
            C3959f h = C3957e.m13372h();
            h.f9893z++;
        }
        oVar.f10130f = oVar3;
        oVar.f10131g = f3;
        oVar.mo14480a();
        int i4 = this.f9913L0;
        if (i4 == 0) {
            this.f9972D.mo14307e().mo14470a(oVar3, f3);
        } else if (i4 == 1) {
            this.f9968B.mo14307e().mo14470a(oVar3, f3);
        } else if (i4 == 2) {
            this.f9974E.mo14307e().mo14470a(oVar3, f3);
        } else if (i4 == 3) {
            this.f9970C.mo14307e().mo14470a(oVar3, f3);
        }
    }

    /* renamed from: R */
    public boolean mo14286R() {
        return this.f9915N0;
    }

    /* renamed from: S */
    public int mo14287S() {
        return this.f9913L0;
    }

    /* renamed from: T */
    public int mo14288T() {
        return this.f9916O0;
    }

    /* renamed from: a */
    public void mo14289a(int i) {
        C3986o oVar;
        C3988q qVar;
        C3973f fVar = this.f9986M;
        if (fVar != null && ((C3976g) fVar).mo14294z(2)) {
            int i2 = this.f9913L0;
            if (i2 == 0) {
                oVar = this.f9968B.mo14307e();
            } else if (i2 == 1) {
                oVar = this.f9972D.mo14307e();
            } else if (i2 == 2) {
                oVar = this.f9970C.mo14307e();
            } else if (i2 == 3) {
                oVar = this.f9974E.mo14307e();
            } else {
                return;
            }
            oVar.mo14473b(5);
            int i3 = this.f9913L0;
            if (i3 == 0 || i3 == 1) {
                this.f9970C.mo14307e().mo14470a((C3986o) null, 0.0f);
                this.f9974E.mo14307e().mo14470a((C3986o) null, 0.0f);
            } else {
                this.f9968B.mo14307e().mo14470a((C3986o) null, 0.0f);
                this.f9972D.mo14307e().mo14470a((C3986o) null, 0.0f);
            }
            this.f9914M0.clear();
            for (int i4 = 0; i4 < this.f10125K0; i4++) {
                C3973f fVar2 = this.f10124J0[i4];
                if (this.f9915N0 || fVar2.mo14292b()) {
                    int i5 = this.f9913L0;
                    if (i5 == 0) {
                        qVar = fVar2.f9968B.mo14307e();
                    } else if (i5 == 1) {
                        qVar = fVar2.f9972D.mo14307e();
                    } else if (i5 == 2) {
                        qVar = fVar2.f9970C.mo14307e();
                    } else if (i5 != 3) {
                        qVar = null;
                    } else {
                        qVar = fVar2.f9974E.mo14307e();
                    }
                    if (qVar != null) {
                        this.f9914M0.add(qVar);
                        qVar.mo14481a(oVar);
                    }
                }
            }
        }
    }

    /* renamed from: b */
    public boolean mo14292b() {
        return true;
    }

    /* renamed from: d */
    public void mo14293d(boolean z) {
        this.f9915N0 = z;
    }

    /* renamed from: z */
    public void mo14294z(int i) {
        this.f9913L0 = i;
    }

    /* renamed from: a */
    public void mo14291a(C3973f fVar, HashMap<C3973f, C3973f> hashMap) {
        super.mo14291a(fVar, hashMap);
        C3965b bVar = (C3965b) fVar;
        this.f9913L0 = bVar.f9913L0;
        this.f9915N0 = bVar.f9915N0;
        this.f9916O0 = bVar.f9916O0;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0054, code lost:
        r1 = true;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo14290a(p096e.p114f.p117b.C3957e r11) {
        /*
            r10 = this;
            e.f.b.j.e[] r0 = r10.f9983J
            e.f.b.j.e r1 = r10.f9968B
            r2 = 0
            r0[r2] = r1
            e.f.b.j.e r1 = r10.f9970C
            r3 = 2
            r0[r3] = r1
            e.f.b.j.e r1 = r10.f9972D
            r4 = 1
            r0[r4] = r1
            e.f.b.j.e r1 = r10.f9974E
            r5 = 3
            r0[r5] = r1
            r0 = 0
        L_0x0017:
            e.f.b.j.e[] r1 = r10.f9983J
            int r6 = r1.length
            if (r0 >= r6) goto L_0x0029
            r6 = r1[r0]
            r1 = r1[r0]
            e.f.b.i r1 = r11.mo14256a(r1)
            r6.f9946i = r1
            int r0 = r0 + 1
            goto L_0x0017
        L_0x0029:
            int r0 = r10.f9913L0
            if (r0 < 0) goto L_0x013e
            r6 = 4
            if (r0 >= r6) goto L_0x013e
            r0 = r1[r0]
            r1 = 0
        L_0x0033:
            int r6 = r10.f10125K0
            if (r1 >= r6) goto L_0x0068
            e.f.b.j.f[] r6 = r10.f10124J0
            r6 = r6[r1]
            boolean r7 = r10.f9915N0
            if (r7 != 0) goto L_0x0046
            boolean r7 = r6.mo14292b()
            if (r7 != 0) goto L_0x0046
            goto L_0x0065
        L_0x0046:
            int r7 = r10.f9913L0
            if (r7 == 0) goto L_0x004c
            if (r7 != r4) goto L_0x0056
        L_0x004c:
            e.f.b.j.f$b r7 = r6.mo14387o()
            e.f.b.j.f$b r8 = p096e.p114f.p117b.p118j.C3973f.C3975b.MATCH_CONSTRAINT
            if (r7 != r8) goto L_0x0056
        L_0x0054:
            r1 = 1
            goto L_0x0069
        L_0x0056:
            int r7 = r10.f9913L0
            if (r7 == r3) goto L_0x005c
            if (r7 != r5) goto L_0x0065
        L_0x005c:
            e.f.b.j.f$b r6 = r6.mo14410z()
            e.f.b.j.f$b r7 = p096e.p114f.p117b.p118j.C3973f.C3975b.MATCH_CONSTRAINT
            if (r6 != r7) goto L_0x0065
            goto L_0x0054
        L_0x0065:
            int r1 = r1 + 1
            goto L_0x0033
        L_0x0068:
            r1 = 0
        L_0x0069:
            int r6 = r10.f9913L0
            if (r6 == 0) goto L_0x007d
            if (r6 != r4) goto L_0x0070
            goto L_0x007d
        L_0x0070:
            e.f.b.j.f r6 = r10.mo14393r()
            e.f.b.j.f$b r6 = r6.mo14410z()
            e.f.b.j.f$b r7 = p096e.p114f.p117b.p118j.C3973f.C3975b.WRAP_CONTENT
            if (r6 != r7) goto L_0x008a
            goto L_0x0089
        L_0x007d:
            e.f.b.j.f r6 = r10.mo14393r()
            e.f.b.j.f$b r6 = r6.mo14387o()
            e.f.b.j.f$b r7 = p096e.p114f.p117b.p118j.C3973f.C3975b.WRAP_CONTENT
            if (r6 != r7) goto L_0x008a
        L_0x0089:
            r1 = 0
        L_0x008a:
            r6 = 0
        L_0x008b:
            int r7 = r10.f10125K0
            if (r6 >= r7) goto L_0x00c7
            e.f.b.j.f[] r7 = r10.f10124J0
            r7 = r7[r6]
            boolean r8 = r10.f9915N0
            if (r8 != 0) goto L_0x009e
            boolean r8 = r7.mo14292b()
            if (r8 != 0) goto L_0x009e
            goto L_0x00c4
        L_0x009e:
            e.f.b.j.e[] r8 = r7.f9983J
            int r9 = r10.f9913L0
            r8 = r8[r9]
            e.f.b.i r8 = r11.mo14256a(r8)
            e.f.b.j.e[] r7 = r7.f9983J
            int r9 = r10.f9913L0
            r7 = r7[r9]
            r7.f9946i = r8
            if (r9 == 0) goto L_0x00bd
            if (r9 != r3) goto L_0x00b5
            goto L_0x00bd
        L_0x00b5:
            e.f.b.i r7 = r0.f9946i
            int r9 = r10.f9916O0
            r11.mo14262a(r7, r8, r9, r1)
            goto L_0x00c4
        L_0x00bd:
            e.f.b.i r7 = r0.f9946i
            int r9 = r10.f9916O0
            r11.mo14268b(r7, r8, r9, r1)
        L_0x00c4:
            int r6 = r6 + 1
            goto L_0x008b
        L_0x00c7:
            int r0 = r10.f9913L0
            r6 = 5
            r7 = 6
            if (r0 != 0) goto L_0x00e8
            e.f.b.j.e r0 = r10.f9972D
            e.f.b.i r0 = r0.f9946i
            e.f.b.j.e r3 = r10.f9968B
            e.f.b.i r3 = r3.f9946i
            r11.mo14253a(r0, r3, r2, r7)
            if (r1 != 0) goto L_0x013e
            e.f.b.j.e r0 = r10.f9968B
            e.f.b.i r0 = r0.f9946i
            e.f.b.j.f r1 = r10.f9986M
            e.f.b.j.e r1 = r1.f9972D
            e.f.b.i r1 = r1.f9946i
            r11.mo14253a(r0, r1, r2, r6)
            goto L_0x013e
        L_0x00e8:
            if (r0 != r4) goto L_0x0105
            e.f.b.j.e r0 = r10.f9968B
            e.f.b.i r0 = r0.f9946i
            e.f.b.j.e r3 = r10.f9972D
            e.f.b.i r3 = r3.f9946i
            r11.mo14253a(r0, r3, r2, r7)
            if (r1 != 0) goto L_0x013e
            e.f.b.j.e r0 = r10.f9968B
            e.f.b.i r0 = r0.f9946i
            e.f.b.j.f r1 = r10.f9986M
            e.f.b.j.e r1 = r1.f9968B
            e.f.b.i r1 = r1.f9946i
            r11.mo14253a(r0, r1, r2, r6)
            goto L_0x013e
        L_0x0105:
            if (r0 != r3) goto L_0x0122
            e.f.b.j.e r0 = r10.f9974E
            e.f.b.i r0 = r0.f9946i
            e.f.b.j.e r3 = r10.f9970C
            e.f.b.i r3 = r3.f9946i
            r11.mo14253a(r0, r3, r2, r7)
            if (r1 != 0) goto L_0x013e
            e.f.b.j.e r0 = r10.f9970C
            e.f.b.i r0 = r0.f9946i
            e.f.b.j.f r1 = r10.f9986M
            e.f.b.j.e r1 = r1.f9974E
            e.f.b.i r1 = r1.f9946i
            r11.mo14253a(r0, r1, r2, r6)
            goto L_0x013e
        L_0x0122:
            if (r0 != r5) goto L_0x013e
            e.f.b.j.e r0 = r10.f9970C
            e.f.b.i r0 = r0.f9946i
            e.f.b.j.e r3 = r10.f9974E
            e.f.b.i r3 = r3.f9946i
            r11.mo14253a(r0, r3, r2, r7)
            if (r1 != 0) goto L_0x013e
            e.f.b.j.e r0 = r10.f9970C
            e.f.b.i r0 = r0.f9946i
            e.f.b.j.f r1 = r10.f9986M
            e.f.b.j.e r1 = r1.f9970C
            e.f.b.i r1 = r1.f9946i
            r11.mo14253a(r0, r1, r2, r6)
        L_0x013e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p096e.p114f.p117b.p118j.C3965b.mo14290a(e.f.b.e):void");
    }
}
