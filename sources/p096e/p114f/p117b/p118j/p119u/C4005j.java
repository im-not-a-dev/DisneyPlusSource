package p096e.p114f.p117b.p118j.p119u;

import p096e.p114f.p117b.p118j.C3968e;
import p096e.p114f.p117b.p118j.C3968e.C3972d;
import p096e.p114f.p117b.p118j.C3973f;
import p096e.p114f.p117b.p118j.C3973f.C3975b;
import p096e.p114f.p117b.p118j.C3982k;

/* renamed from: e.f.b.j.u.j */
/* compiled from: HorizontalWidgetRun */
public class C4005j extends C4010m {

    /* renamed from: k */
    private static int[] f10199k = new int[2];

    /* renamed from: e.f.b.j.u.j$a */
    /* compiled from: HorizontalWidgetRun */
    static /* synthetic */ class C4006a {

        /* renamed from: a */
        static final /* synthetic */ int[] f10200a = new int[C4012b.values().length];

        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|8) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0014 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001f */
        static {
            /*
                e.f.b.j.u.m$b[] r0 = p096e.p114f.p117b.p118j.p119u.C4010m.C4012b.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f10200a = r0
                int[] r0 = f10200a     // Catch:{ NoSuchFieldError -> 0x0014 }
                e.f.b.j.u.m$b r1 = p096e.p114f.p117b.p118j.p119u.C4010m.C4012b.START     // Catch:{ NoSuchFieldError -> 0x0014 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0014 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0014 }
            L_0x0014:
                int[] r0 = f10200a     // Catch:{ NoSuchFieldError -> 0x001f }
                e.f.b.j.u.m$b r1 = p096e.p114f.p117b.p118j.p119u.C4010m.C4012b.END     // Catch:{ NoSuchFieldError -> 0x001f }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001f }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001f }
            L_0x001f:
                int[] r0 = f10200a     // Catch:{ NoSuchFieldError -> 0x002a }
                e.f.b.j.u.m$b r1 = p096e.p114f.p117b.p118j.p119u.C4010m.C4012b.CENTER     // Catch:{ NoSuchFieldError -> 0x002a }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x002a }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x002a }
            L_0x002a:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p096e.p114f.p117b.p118j.p119u.C4005j.C4006a.<clinit>():void");
        }
    }

    public C4005j(C3973f fVar) {
        super(fVar);
        this.f10215h.f10181e = C4001a.LEFT;
        this.f10216i.f10181e = C4001a.RIGHT;
        this.f10213f = 0;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo14507a() {
        C3973f fVar = this.f10209b;
        if (fVar.f10000a) {
            this.f10212e.mo14523a(fVar.mo14316B());
        }
        if (!this.f10212e.f10186j) {
            this.f10211d = this.f10209b.mo14387o();
            C3975b bVar = this.f10211d;
            if (bVar != C3975b.MATCH_CONSTRAINT) {
                if (bVar == C3975b.MATCH_PARENT) {
                    C3973f r = this.f10209b.mo14393r();
                    if ((r != null && r.mo14387o() == C3975b.FIXED) || r.mo14387o() == C3975b.MATCH_PARENT) {
                        int B = (r.mo14316B() - this.f10209b.f9968B.mo14304b()) - this.f10209b.f9972D.mo14304b();
                        mo14536a(this.f10215h, r.f10006d.f10215h, this.f10209b.f9968B.mo14304b());
                        mo14536a(this.f10216i, r.f10006d.f10216i, -this.f10209b.f9972D.mo14304b());
                        this.f10212e.mo14523a(B);
                        return;
                    }
                }
                if (this.f10211d == C3975b.FIXED) {
                    this.f10212e.mo14523a(this.f10209b.mo14316B());
                }
            }
        } else if (this.f10211d == C3975b.MATCH_PARENT) {
            C3973f r2 = this.f10209b.mo14393r();
            if ((r2 != null && r2.mo14387o() == C3975b.FIXED) || r2.mo14387o() == C3975b.MATCH_PARENT) {
                mo14536a(this.f10215h, r2.f10006d.f10215h, this.f10209b.f9968B.mo14304b());
                mo14536a(this.f10216i, r2.f10006d.f10216i, -this.f10209b.f9972D.mo14304b());
                return;
            }
        }
        if (this.f10212e.f10186j) {
            C3973f fVar2 = this.f10209b;
            if (fVar2.f10000a) {
                C3968e[] eVarArr = fVar2.f9983J;
                if (eVarArr[0].f9941d == null || eVarArr[1].f9941d == null) {
                    C3973f fVar3 = this.f10209b;
                    C3968e[] eVarArr2 = fVar3.f9983J;
                    if (eVarArr2[0].f9941d != null) {
                        C4000f a = mo14533a(eVarArr2[0]);
                        if (a != null) {
                            mo14536a(this.f10215h, a, this.f10209b.f9983J[0].mo14304b());
                            mo14536a(this.f10216i, this.f10215h, this.f10212e.f10183g);
                        }
                    } else if (eVarArr2[1].f9941d != null) {
                        C4000f a2 = mo14533a(eVarArr2[1]);
                        if (a2 != null) {
                            mo14536a(this.f10216i, a2, -this.f10209b.f9983J[1].mo14304b());
                            mo14536a(this.f10215h, this.f10216i, -this.f10212e.f10183g);
                        }
                    } else if (!(fVar3 instanceof C3982k) && fVar3.mo14393r() != null && this.f10209b.mo14330a(C3972d.CENTER).f9941d == null) {
                        mo14536a(this.f10215h, this.f10209b.mo14393r().f10006d.f10215h, 0);
                        mo14536a(this.f10216i, this.f10215h, this.f10212e.f10183g);
                    }
                }
                if (fVar2.mo14323I()) {
                    this.f10215h.f10182f = this.f10209b.f9983J[0].mo14304b();
                    this.f10216i.f10182f = -this.f10209b.f9983J[1].mo14304b();
                } else {
                    C4000f a3 = mo14533a(this.f10209b.f9983J[0]);
                    if (a3 != null) {
                        mo14536a(this.f10215h, a3, this.f10209b.f9983J[0].mo14304b());
                    }
                    C4000f a4 = mo14533a(this.f10209b.f9983J[1]);
                    if (a4 != null) {
                        mo14536a(this.f10216i, a4, -this.f10209b.f9983J[1].mo14304b());
                    }
                    this.f10215h.f10178b = true;
                    this.f10216i.f10178b = true;
                }
            }
        }
        if (this.f10211d == C3975b.MATCH_CONSTRAINT) {
            C3973f fVar4 = this.f10209b;
            int i = fVar4.f10020k;
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
            } else if (i == 3) {
                if (fVar4.f10022l == 3) {
                    this.f10215h.f10177a = this;
                    this.f10216i.f10177a = this;
                    C4008l lVar = fVar4.f10008e;
                    lVar.f10215h.f10177a = this;
                    lVar.f10216i.f10177a = this;
                    this.f10212e.f10177a = this;
                    if (fVar4.mo14324J()) {
                        this.f10212e.f10188l.add(this.f10209b.f10008e.f10212e);
                        this.f10209b.f10008e.f10212e.f10187k.add(this.f10212e);
                        C4008l lVar2 = this.f10209b.f10008e;
                        lVar2.f10212e.f10177a = this;
                        this.f10212e.f10188l.add(lVar2.f10215h);
                        this.f10212e.f10188l.add(this.f10209b.f10008e.f10216i);
                        this.f10209b.f10008e.f10215h.f10187k.add(this.f10212e);
                        this.f10209b.f10008e.f10216i.f10187k.add(this.f10212e);
                    } else if (this.f10209b.mo14323I()) {
                        this.f10209b.f10008e.f10212e.f10188l.add(this.f10212e);
                        this.f10212e.f10187k.add(this.f10209b.f10008e.f10212e);
                    } else {
                        this.f10209b.f10008e.f10212e.f10188l.add(this.f10212e);
                    }
                } else {
                    C4002g gVar3 = fVar4.f10008e.f10212e;
                    this.f10212e.f10188l.add(gVar3);
                    gVar3.f10187k.add(this.f10212e);
                    this.f10209b.f10008e.f10215h.f10187k.add(this.f10212e);
                    this.f10209b.f10008e.f10216i.f10187k.add(this.f10212e);
                    C4002g gVar4 = this.f10212e;
                    gVar4.f10178b = true;
                    gVar4.f10187k.add(this.f10215h);
                    this.f10212e.f10187k.add(this.f10216i);
                    this.f10215h.f10188l.add(this.f10212e);
                    this.f10216i.f10188l.add(this.f10212e);
                }
            }
        }
        C3973f fVar5 = this.f10209b;
        C3968e[] eVarArr3 = fVar5.f9983J;
        if (eVarArr3[0].f9941d == null || eVarArr3[1].f9941d == null) {
            C3973f fVar6 = this.f10209b;
            C3968e[] eVarArr4 = fVar6.f9983J;
            if (eVarArr4[0].f9941d != null) {
                C4000f a5 = mo14533a(eVarArr4[0]);
                if (a5 != null) {
                    mo14536a(this.f10215h, a5, this.f10209b.f9983J[0].mo14304b());
                    mo14537a(this.f10216i, this.f10215h, 1, this.f10212e);
                }
            } else if (eVarArr4[1].f9941d != null) {
                C4000f a6 = mo14533a(eVarArr4[1]);
                if (a6 != null) {
                    mo14536a(this.f10216i, a6, -this.f10209b.f9983J[1].mo14304b());
                    mo14537a(this.f10215h, this.f10216i, -1, this.f10212e);
                }
            } else if (!(fVar6 instanceof C3982k) && fVar6.mo14393r() != null) {
                mo14536a(this.f10215h, this.f10209b.mo14393r().f10006d.f10215h, 0);
                mo14537a(this.f10216i, this.f10215h, 1, this.f10212e);
            }
        }
        if (fVar5.mo14323I()) {
            this.f10215h.f10182f = this.f10209b.f9983J[0].mo14304b();
            this.f10216i.f10182f = -this.f10209b.f9983J[1].mo14304b();
        } else {
            C4000f a7 = mo14533a(this.f10209b.f9983J[0]);
            C4000f a8 = mo14533a(this.f10209b.f9983J[1]);
            a7.mo14524b(this);
            a8.mo14524b(this);
            this.f10217j = C4012b.CENTER;
        }
    }

    /* renamed from: b */
    public void mo14509b() {
        this.f10209b.mo14380k(this.f10215h.f10183g);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public void mo14510c() {
        this.f10210c = null;
        this.f10215h.mo14522a();
        this.f10216i.mo14522a();
        this.f10212e.mo14522a();
        this.f10214g = false;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: e */
    public boolean mo14512e() {
        if (this.f10211d != C3975b.MATCH_CONSTRAINT || this.f10209b.f10020k == 0) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: f */
    public void mo14526f() {
        this.f10214g = false;
        this.f10215h.f10186j = false;
        this.f10216i.f10186j = false;
        this.f10212e.f10186j = false;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("HorizontalRun ");
        sb.append(this.f10209b.mo14372g());
        return sb.toString();
    }

    /* renamed from: a */
    private void m13756a(int[] iArr, int i, int i2, int i3, int i4, float f, int i5) {
        int i6 = i2 - i;
        int i7 = i4 - i3;
        if (i5 == -1) {
            int i8 = (int) ((((float) i7) * f) + 0.5f);
            int i9 = (int) ((((float) i6) / f) + 0.5f);
            if (i8 <= i6 && i7 <= i7) {
                iArr[0] = i8;
                iArr[1] = i7;
            } else if (i6 <= i6 && i9 <= i7) {
                iArr[0] = i6;
                iArr[1] = i9;
            }
        } else if (i5 == 0) {
            iArr[0] = (int) ((((float) i7) * f) + 0.5f);
            iArr[1] = i7;
        } else if (i5 == 1) {
            int i10 = (int) ((((float) i6) * f) + 0.5f);
            iArr[0] = i6;
            iArr[1] = i10;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:108:0x02c6, code lost:
        if (r14 != 1) goto L_0x032e;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo14508a(p096e.p114f.p117b.p118j.p119u.C3998d r17) {
        /*
            r16 = this;
            r8 = r16
            int[] r0 = p096e.p114f.p117b.p118j.p119u.C4005j.C4006a.f10200a
            e.f.b.j.u.m$b r1 = r8.f10217j
            int r1 = r1.ordinal()
            r0 = r0[r1]
            r1 = 2
            r2 = 3
            r9 = 1
            r10 = 0
            if (r0 == r9) goto L_0x0029
            if (r0 == r1) goto L_0x0023
            if (r0 == r2) goto L_0x0017
            goto L_0x002e
        L_0x0017:
            e.f.b.j.f r0 = r8.f10209b
            e.f.b.j.e r1 = r0.f9968B
            e.f.b.j.e r0 = r0.f9972D
            r3 = r17
            r8.mo14535a(r3, r1, r0, r10)
            return
        L_0x0023:
            r3 = r17
            r16.mo14538b(r17)
            goto L_0x002e
        L_0x0029:
            r3 = r17
            r16.mo14539c(r17)
        L_0x002e:
            e.f.b.j.u.g r0 = r8.f10212e
            boolean r0 = r0.f10186j
            r11 = 1056964608(0x3f000000, float:0.5)
            if (r0 != 0) goto L_0x032e
            e.f.b.j.f$b r0 = r8.f10211d
            e.f.b.j.f$b r3 = p096e.p114f.p117b.p118j.C3973f.C3975b.MATCH_CONSTRAINT
            if (r0 != r3) goto L_0x032e
            e.f.b.j.f r0 = r8.f10209b
            int r3 = r0.f10020k
            if (r3 == r1) goto L_0x0310
            if (r3 == r2) goto L_0x0046
            goto L_0x032e
        L_0x0046:
            int r1 = r0.f10022l
            r3 = -1
            if (r1 == 0) goto L_0x008f
            if (r1 != r2) goto L_0x004e
            goto L_0x008f
        L_0x004e:
            int r0 = r0.mo14375i()
            if (r0 == r3) goto L_0x0077
            if (r0 == 0) goto L_0x0068
            if (r0 == r9) goto L_0x005a
            r0 = 0
            goto L_0x0088
        L_0x005a:
            e.f.b.j.f r0 = r8.f10209b
            e.f.b.j.u.l r1 = r0.f10008e
            e.f.b.j.u.g r1 = r1.f10212e
            int r1 = r1.f10183g
            float r1 = (float) r1
            float r0 = r0.mo14373h()
            goto L_0x0084
        L_0x0068:
            e.f.b.j.f r0 = r8.f10209b
            e.f.b.j.u.l r1 = r0.f10008e
            e.f.b.j.u.g r1 = r1.f10212e
            int r1 = r1.f10183g
            float r1 = (float) r1
            float r0 = r0.mo14373h()
            float r1 = r1 / r0
            goto L_0x0086
        L_0x0077:
            e.f.b.j.f r0 = r8.f10209b
            e.f.b.j.u.l r1 = r0.f10008e
            e.f.b.j.u.g r1 = r1.f10212e
            int r1 = r1.f10183g
            float r1 = (float) r1
            float r0 = r0.mo14373h()
        L_0x0084:
            float r1 = r1 * r0
        L_0x0086:
            float r1 = r1 + r11
            int r0 = (int) r1
        L_0x0088:
            e.f.b.j.u.g r1 = r8.f10212e
            r1.mo14523a(r0)
            goto L_0x032e
        L_0x008f:
            e.f.b.j.f r0 = r8.f10209b
            e.f.b.j.u.l r1 = r0.f10008e
            e.f.b.j.u.f r12 = r1.f10215h
            e.f.b.j.u.f r13 = r1.f10216i
            e.f.b.j.e r0 = r0.f9968B
            e.f.b.j.e r0 = r0.f9941d
            if (r0 == 0) goto L_0x009f
            r0 = 1
            goto L_0x00a0
        L_0x009f:
            r0 = 0
        L_0x00a0:
            e.f.b.j.f r1 = r8.f10209b
            e.f.b.j.e r1 = r1.f9970C
            e.f.b.j.e r1 = r1.f9941d
            if (r1 == 0) goto L_0x00aa
            r1 = 1
            goto L_0x00ab
        L_0x00aa:
            r1 = 0
        L_0x00ab:
            e.f.b.j.f r2 = r8.f10209b
            e.f.b.j.e r2 = r2.f9972D
            e.f.b.j.e r2 = r2.f9941d
            if (r2 == 0) goto L_0x00b5
            r2 = 1
            goto L_0x00b6
        L_0x00b5:
            r2 = 0
        L_0x00b6:
            e.f.b.j.f r4 = r8.f10209b
            e.f.b.j.e r4 = r4.f9974E
            e.f.b.j.e r4 = r4.f9941d
            if (r4 == 0) goto L_0x00c0
            r4 = 1
            goto L_0x00c1
        L_0x00c0:
            r4 = 0
        L_0x00c1:
            e.f.b.j.f r5 = r8.f10209b
            int r14 = r5.mo14375i()
            if (r0 == 0) goto L_0x020a
            if (r1 == 0) goto L_0x020a
            if (r2 == 0) goto L_0x020a
            if (r4 == 0) goto L_0x020a
            e.f.b.j.f r0 = r8.f10209b
            float r15 = r0.mo14373h()
            boolean r0 = r12.f10186j
            if (r0 == 0) goto L_0x0138
            boolean r0 = r13.f10186j
            if (r0 == 0) goto L_0x0138
            e.f.b.j.u.f r0 = r8.f10215h
            boolean r1 = r0.f10179c
            if (r1 == 0) goto L_0x0137
            e.f.b.j.u.f r1 = r8.f10216i
            boolean r1 = r1.f10179c
            if (r1 != 0) goto L_0x00ea
            goto L_0x0137
        L_0x00ea:
            java.util.List<e.f.b.j.u.f> r0 = r0.f10188l
            java.lang.Object r0 = r0.get(r10)
            e.f.b.j.u.f r0 = (p096e.p114f.p117b.p118j.p119u.C4000f) r0
            int r0 = r0.f10183g
            e.f.b.j.u.f r1 = r8.f10215h
            int r1 = r1.f10182f
            int r2 = r0 + r1
            e.f.b.j.u.f r0 = r8.f10216i
            java.util.List<e.f.b.j.u.f> r0 = r0.f10188l
            java.lang.Object r0 = r0.get(r10)
            e.f.b.j.u.f r0 = (p096e.p114f.p117b.p118j.p119u.C4000f) r0
            int r0 = r0.f10183g
            e.f.b.j.u.f r1 = r8.f10216i
            int r1 = r1.f10182f
            int r3 = r0 - r1
            int r0 = r12.f10183g
            int r1 = r12.f10182f
            int r4 = r0 + r1
            int r0 = r13.f10183g
            int r1 = r13.f10182f
            int r5 = r0 - r1
            int[] r1 = f10199k
            r0 = r16
            r6 = r15
            r7 = r14
            r0.m13756a(r1, r2, r3, r4, r5, r6, r7)
            e.f.b.j.u.g r0 = r8.f10212e
            int[] r1 = f10199k
            r1 = r1[r10]
            r0.mo14523a(r1)
            e.f.b.j.f r0 = r8.f10209b
            e.f.b.j.u.l r0 = r0.f10008e
            e.f.b.j.u.g r0 = r0.f10212e
            int[] r1 = f10199k
            r1 = r1[r9]
            r0.mo14523a(r1)
        L_0x0137:
            return
        L_0x0138:
            e.f.b.j.u.f r0 = r8.f10215h
            boolean r1 = r0.f10186j
            if (r1 == 0) goto L_0x0195
            e.f.b.j.u.f r1 = r8.f10216i
            boolean r2 = r1.f10186j
            if (r2 == 0) goto L_0x0195
            boolean r2 = r12.f10179c
            if (r2 == 0) goto L_0x0194
            boolean r2 = r13.f10179c
            if (r2 != 0) goto L_0x014d
            goto L_0x0194
        L_0x014d:
            int r2 = r0.f10183g
            int r0 = r0.f10182f
            int r2 = r2 + r0
            int r0 = r1.f10183g
            int r1 = r1.f10182f
            int r3 = r0 - r1
            java.util.List<e.f.b.j.u.f> r0 = r12.f10188l
            java.lang.Object r0 = r0.get(r10)
            e.f.b.j.u.f r0 = (p096e.p114f.p117b.p118j.p119u.C4000f) r0
            int r0 = r0.f10183g
            int r1 = r12.f10182f
            int r4 = r0 + r1
            java.util.List<e.f.b.j.u.f> r0 = r13.f10188l
            java.lang.Object r0 = r0.get(r10)
            e.f.b.j.u.f r0 = (p096e.p114f.p117b.p118j.p119u.C4000f) r0
            int r0 = r0.f10183g
            int r1 = r13.f10182f
            int r5 = r0 - r1
            int[] r1 = f10199k
            r0 = r16
            r6 = r15
            r7 = r14
            r0.m13756a(r1, r2, r3, r4, r5, r6, r7)
            e.f.b.j.u.g r0 = r8.f10212e
            int[] r1 = f10199k
            r1 = r1[r10]
            r0.mo14523a(r1)
            e.f.b.j.f r0 = r8.f10209b
            e.f.b.j.u.l r0 = r0.f10008e
            e.f.b.j.u.g r0 = r0.f10212e
            int[] r1 = f10199k
            r1 = r1[r9]
            r0.mo14523a(r1)
            goto L_0x0195
        L_0x0194:
            return
        L_0x0195:
            e.f.b.j.u.f r0 = r8.f10215h
            boolean r1 = r0.f10179c
            if (r1 == 0) goto L_0x0209
            e.f.b.j.u.f r1 = r8.f10216i
            boolean r1 = r1.f10179c
            if (r1 == 0) goto L_0x0209
            boolean r1 = r12.f10179c
            if (r1 == 0) goto L_0x0209
            boolean r1 = r13.f10179c
            if (r1 != 0) goto L_0x01aa
            goto L_0x0209
        L_0x01aa:
            java.util.List<e.f.b.j.u.f> r0 = r0.f10188l
            java.lang.Object r0 = r0.get(r10)
            e.f.b.j.u.f r0 = (p096e.p114f.p117b.p118j.p119u.C4000f) r0
            int r0 = r0.f10183g
            e.f.b.j.u.f r1 = r8.f10215h
            int r1 = r1.f10182f
            int r2 = r0 + r1
            e.f.b.j.u.f r0 = r8.f10216i
            java.util.List<e.f.b.j.u.f> r0 = r0.f10188l
            java.lang.Object r0 = r0.get(r10)
            e.f.b.j.u.f r0 = (p096e.p114f.p117b.p118j.p119u.C4000f) r0
            int r0 = r0.f10183g
            e.f.b.j.u.f r1 = r8.f10216i
            int r1 = r1.f10182f
            int r3 = r0 - r1
            java.util.List<e.f.b.j.u.f> r0 = r12.f10188l
            java.lang.Object r0 = r0.get(r10)
            e.f.b.j.u.f r0 = (p096e.p114f.p117b.p118j.p119u.C4000f) r0
            int r0 = r0.f10183g
            int r1 = r12.f10182f
            int r4 = r0 + r1
            java.util.List<e.f.b.j.u.f> r0 = r13.f10188l
            java.lang.Object r0 = r0.get(r10)
            e.f.b.j.u.f r0 = (p096e.p114f.p117b.p118j.p119u.C4000f) r0
            int r0 = r0.f10183g
            int r1 = r13.f10182f
            int r5 = r0 - r1
            int[] r1 = f10199k
            r0 = r16
            r6 = r15
            r7 = r14
            r0.m13756a(r1, r2, r3, r4, r5, r6, r7)
            e.f.b.j.u.g r0 = r8.f10212e
            int[] r1 = f10199k
            r1 = r1[r10]
            r0.mo14523a(r1)
            e.f.b.j.f r0 = r8.f10209b
            e.f.b.j.u.l r0 = r0.f10008e
            e.f.b.j.u.g r0 = r0.f10212e
            int[] r1 = f10199k
            r1 = r1[r9]
            r0.mo14523a(r1)
            goto L_0x032e
        L_0x0209:
            return
        L_0x020a:
            if (r0 == 0) goto L_0x0295
            if (r2 == 0) goto L_0x0295
            e.f.b.j.u.f r0 = r8.f10215h
            boolean r0 = r0.f10179c
            if (r0 == 0) goto L_0x0294
            e.f.b.j.u.f r0 = r8.f10216i
            boolean r0 = r0.f10179c
            if (r0 != 0) goto L_0x021c
            goto L_0x0294
        L_0x021c:
            e.f.b.j.f r0 = r8.f10209b
            float r0 = r0.mo14373h()
            e.f.b.j.u.f r1 = r8.f10215h
            java.util.List<e.f.b.j.u.f> r1 = r1.f10188l
            java.lang.Object r1 = r1.get(r10)
            e.f.b.j.u.f r1 = (p096e.p114f.p117b.p118j.p119u.C4000f) r1
            int r1 = r1.f10183g
            e.f.b.j.u.f r2 = r8.f10215h
            int r2 = r2.f10182f
            int r1 = r1 + r2
            e.f.b.j.u.f r2 = r8.f10216i
            java.util.List<e.f.b.j.u.f> r2 = r2.f10188l
            java.lang.Object r2 = r2.get(r10)
            e.f.b.j.u.f r2 = (p096e.p114f.p117b.p118j.p119u.C4000f) r2
            int r2 = r2.f10183g
            e.f.b.j.u.f r4 = r8.f10216i
            int r4 = r4.f10182f
            int r2 = r2 - r4
            if (r14 == r3) goto L_0x0270
            if (r14 == 0) goto L_0x0270
            if (r14 == r9) goto L_0x024c
            goto L_0x032e
        L_0x024c:
            int r2 = r2 - r1
            int r1 = r8.mo14532a(r2, r10)
            float r2 = (float) r1
            float r2 = r2 / r0
            float r2 = r2 + r11
            int r2 = (int) r2
            int r3 = r8.mo14532a(r2, r9)
            if (r2 == r3) goto L_0x0260
            float r1 = (float) r3
            float r1 = r1 * r0
            float r1 = r1 + r11
            int r1 = (int) r1
        L_0x0260:
            e.f.b.j.u.g r0 = r8.f10212e
            r0.mo14523a(r1)
            e.f.b.j.f r0 = r8.f10209b
            e.f.b.j.u.l r0 = r0.f10008e
            e.f.b.j.u.g r0 = r0.f10212e
            r0.mo14523a(r3)
            goto L_0x032e
        L_0x0270:
            int r2 = r2 - r1
            int r1 = r8.mo14532a(r2, r10)
            float r2 = (float) r1
            float r2 = r2 * r0
            float r2 = r2 + r11
            int r2 = (int) r2
            int r3 = r8.mo14532a(r2, r9)
            if (r2 == r3) goto L_0x0284
            float r1 = (float) r3
            float r1 = r1 / r0
            float r1 = r1 + r11
            int r1 = (int) r1
        L_0x0284:
            e.f.b.j.u.g r0 = r8.f10212e
            r0.mo14523a(r1)
            e.f.b.j.f r0 = r8.f10209b
            e.f.b.j.u.l r0 = r0.f10008e
            e.f.b.j.u.g r0 = r0.f10212e
            r0.mo14523a(r3)
            goto L_0x032e
        L_0x0294:
            return
        L_0x0295:
            if (r1 == 0) goto L_0x032e
            if (r4 == 0) goto L_0x032e
            boolean r0 = r12.f10179c
            if (r0 == 0) goto L_0x030f
            boolean r0 = r13.f10179c
            if (r0 != 0) goto L_0x02a2
            goto L_0x030f
        L_0x02a2:
            e.f.b.j.f r0 = r8.f10209b
            float r0 = r0.mo14373h()
            java.util.List<e.f.b.j.u.f> r1 = r12.f10188l
            java.lang.Object r1 = r1.get(r10)
            e.f.b.j.u.f r1 = (p096e.p114f.p117b.p118j.p119u.C4000f) r1
            int r1 = r1.f10183g
            int r2 = r12.f10182f
            int r1 = r1 + r2
            java.util.List<e.f.b.j.u.f> r2 = r13.f10188l
            java.lang.Object r2 = r2.get(r10)
            e.f.b.j.u.f r2 = (p096e.p114f.p117b.p118j.p119u.C4000f) r2
            int r2 = r2.f10183g
            int r4 = r13.f10182f
            int r2 = r2 - r4
            if (r14 == r3) goto L_0x02ec
            if (r14 == 0) goto L_0x02c9
            if (r14 == r9) goto L_0x02ec
            goto L_0x032e
        L_0x02c9:
            int r2 = r2 - r1
            int r1 = r8.mo14532a(r2, r9)
            float r2 = (float) r1
            float r2 = r2 * r0
            float r2 = r2 + r11
            int r2 = (int) r2
            int r3 = r8.mo14532a(r2, r10)
            if (r2 == r3) goto L_0x02dd
            float r1 = (float) r3
            float r1 = r1 / r0
            float r1 = r1 + r11
            int r1 = (int) r1
        L_0x02dd:
            e.f.b.j.u.g r0 = r8.f10212e
            r0.mo14523a(r3)
            e.f.b.j.f r0 = r8.f10209b
            e.f.b.j.u.l r0 = r0.f10008e
            e.f.b.j.u.g r0 = r0.f10212e
            r0.mo14523a(r1)
            goto L_0x032e
        L_0x02ec:
            int r2 = r2 - r1
            int r1 = r8.mo14532a(r2, r9)
            float r2 = (float) r1
            float r2 = r2 / r0
            float r2 = r2 + r11
            int r2 = (int) r2
            int r3 = r8.mo14532a(r2, r10)
            if (r2 == r3) goto L_0x0300
            float r1 = (float) r3
            float r1 = r1 * r0
            float r1 = r1 + r11
            int r1 = (int) r1
        L_0x0300:
            e.f.b.j.u.g r0 = r8.f10212e
            r0.mo14523a(r3)
            e.f.b.j.f r0 = r8.f10209b
            e.f.b.j.u.l r0 = r0.f10008e
            e.f.b.j.u.g r0 = r0.f10212e
            r0.mo14523a(r1)
            goto L_0x032e
        L_0x030f:
            return
        L_0x0310:
            e.f.b.j.f r0 = r0.mo14393r()
            if (r0 == 0) goto L_0x032e
            e.f.b.j.u.j r0 = r0.f10006d
            e.f.b.j.u.g r0 = r0.f10212e
            boolean r1 = r0.f10186j
            if (r1 == 0) goto L_0x032e
            e.f.b.j.f r1 = r8.f10209b
            float r1 = r1.f10030p
            int r0 = r0.f10183g
            float r0 = (float) r0
            float r0 = r0 * r1
            float r0 = r0 + r11
            int r0 = (int) r0
            e.f.b.j.u.g r1 = r8.f10212e
            r1.mo14523a(r0)
        L_0x032e:
            e.f.b.j.u.f r0 = r8.f10215h
            boolean r1 = r0.f10179c
            if (r1 == 0) goto L_0x0450
            e.f.b.j.u.f r1 = r8.f10216i
            boolean r2 = r1.f10179c
            if (r2 != 0) goto L_0x033c
            goto L_0x0450
        L_0x033c:
            boolean r0 = r0.f10186j
            if (r0 == 0) goto L_0x034b
            boolean r0 = r1.f10186j
            if (r0 == 0) goto L_0x034b
            e.f.b.j.u.g r0 = r8.f10212e
            boolean r0 = r0.f10186j
            if (r0 == 0) goto L_0x034b
            return
        L_0x034b:
            e.f.b.j.u.g r0 = r8.f10212e
            boolean r0 = r0.f10186j
            if (r0 != 0) goto L_0x0395
            e.f.b.j.f$b r0 = r8.f10211d
            e.f.b.j.f$b r1 = p096e.p114f.p117b.p118j.C3973f.C3975b.MATCH_CONSTRAINT
            if (r0 != r1) goto L_0x0395
            e.f.b.j.f r0 = r8.f10209b
            int r1 = r0.f10020k
            if (r1 != 0) goto L_0x0395
            boolean r0 = r0.mo14323I()
            if (r0 != 0) goto L_0x0395
            e.f.b.j.u.f r0 = r8.f10215h
            java.util.List<e.f.b.j.u.f> r0 = r0.f10188l
            java.lang.Object r0 = r0.get(r10)
            e.f.b.j.u.f r0 = (p096e.p114f.p117b.p118j.p119u.C4000f) r0
            e.f.b.j.u.f r1 = r8.f10216i
            java.util.List<e.f.b.j.u.f> r1 = r1.f10188l
            java.lang.Object r1 = r1.get(r10)
            e.f.b.j.u.f r1 = (p096e.p114f.p117b.p118j.p119u.C4000f) r1
            int r0 = r0.f10183g
            e.f.b.j.u.f r2 = r8.f10215h
            int r3 = r2.f10182f
            int r0 = r0 + r3
            int r1 = r1.f10183g
            e.f.b.j.u.f r3 = r8.f10216i
            int r3 = r3.f10182f
            int r1 = r1 + r3
            int r3 = r1 - r0
            r2.mo14523a(r0)
            e.f.b.j.u.f r0 = r8.f10216i
            r0.mo14523a(r1)
            e.f.b.j.u.g r0 = r8.f10212e
            r0.mo14523a(r3)
            return
        L_0x0395:
            e.f.b.j.u.g r0 = r8.f10212e
            boolean r0 = r0.f10186j
            if (r0 != 0) goto L_0x03f9
            e.f.b.j.f$b r0 = r8.f10211d
            e.f.b.j.f$b r1 = p096e.p114f.p117b.p118j.C3973f.C3975b.MATCH_CONSTRAINT
            if (r0 != r1) goto L_0x03f9
            int r0 = r8.f10208a
            if (r0 != r9) goto L_0x03f9
            e.f.b.j.u.f r0 = r8.f10215h
            java.util.List<e.f.b.j.u.f> r0 = r0.f10188l
            int r0 = r0.size()
            if (r0 <= 0) goto L_0x03f9
            e.f.b.j.u.f r0 = r8.f10216i
            java.util.List<e.f.b.j.u.f> r0 = r0.f10188l
            int r0 = r0.size()
            if (r0 <= 0) goto L_0x03f9
            e.f.b.j.u.f r0 = r8.f10215h
            java.util.List<e.f.b.j.u.f> r0 = r0.f10188l
            java.lang.Object r0 = r0.get(r10)
            e.f.b.j.u.f r0 = (p096e.p114f.p117b.p118j.p119u.C4000f) r0
            e.f.b.j.u.f r1 = r8.f10216i
            java.util.List<e.f.b.j.u.f> r1 = r1.f10188l
            java.lang.Object r1 = r1.get(r10)
            e.f.b.j.u.f r1 = (p096e.p114f.p117b.p118j.p119u.C4000f) r1
            int r0 = r0.f10183g
            e.f.b.j.u.f r2 = r8.f10215h
            int r2 = r2.f10182f
            int r0 = r0 + r2
            int r1 = r1.f10183g
            e.f.b.j.u.f r2 = r8.f10216i
            int r2 = r2.f10182f
            int r1 = r1 + r2
            int r1 = r1 - r0
            e.f.b.j.u.g r0 = r8.f10212e
            int r0 = r0.f10198m
            int r0 = java.lang.Math.min(r1, r0)
            e.f.b.j.f r1 = r8.f10209b
            int r2 = r1.f10028o
            int r1 = r1.f10026n
            int r0 = java.lang.Math.max(r1, r0)
            if (r2 <= 0) goto L_0x03f4
            int r0 = java.lang.Math.min(r2, r0)
        L_0x03f4:
            e.f.b.j.u.g r1 = r8.f10212e
            r1.mo14523a(r0)
        L_0x03f9:
            e.f.b.j.u.g r0 = r8.f10212e
            boolean r0 = r0.f10186j
            if (r0 != 0) goto L_0x0400
            return
        L_0x0400:
            e.f.b.j.u.f r0 = r8.f10215h
            java.util.List<e.f.b.j.u.f> r0 = r0.f10188l
            java.lang.Object r0 = r0.get(r10)
            e.f.b.j.u.f r0 = (p096e.p114f.p117b.p118j.p119u.C4000f) r0
            e.f.b.j.u.f r1 = r8.f10216i
            java.util.List<e.f.b.j.u.f> r1 = r1.f10188l
            java.lang.Object r1 = r1.get(r10)
            e.f.b.j.u.f r1 = (p096e.p114f.p117b.p118j.p119u.C4000f) r1
            int r2 = r0.f10183g
            e.f.b.j.u.f r3 = r8.f10215h
            int r3 = r3.f10182f
            int r2 = r2 + r3
            int r3 = r1.f10183g
            e.f.b.j.u.f r4 = r8.f10216i
            int r4 = r4.f10182f
            int r3 = r3 + r4
            e.f.b.j.f r4 = r8.f10209b
            float r4 = r4.mo14383m()
            if (r0 != r1) goto L_0x0430
            int r2 = r0.f10183g
            int r3 = r1.f10183g
            r4 = 1056964608(0x3f000000, float:0.5)
        L_0x0430:
            int r3 = r3 - r2
            e.f.b.j.u.g r0 = r8.f10212e
            int r0 = r0.f10183g
            int r3 = r3 - r0
            e.f.b.j.u.f r0 = r8.f10215h
            float r1 = (float) r2
            float r1 = r1 + r11
            float r2 = (float) r3
            float r2 = r2 * r4
            float r1 = r1 + r2
            int r1 = (int) r1
            r0.mo14523a(r1)
            e.f.b.j.u.f r0 = r8.f10216i
            e.f.b.j.u.f r1 = r8.f10215h
            int r1 = r1.f10183g
            e.f.b.j.u.g r2 = r8.f10212e
            int r2 = r2.f10183g
            int r1 = r1 + r2
            r0.mo14523a(r1)
        L_0x0450:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p096e.p114f.p117b.p118j.p119u.C4005j.mo14508a(e.f.b.j.u.d):void");
    }
}
