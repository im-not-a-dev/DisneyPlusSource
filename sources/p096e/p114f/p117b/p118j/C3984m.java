package p096e.p114f.p117b.p118j;

import p096e.p114f.p117b.C3957e;
import p096e.p114f.p117b.p118j.C3973f.C3975b;

/* renamed from: e.f.b.j.m */
/* compiled from: Optimizer */
public class C3984m {

    /* renamed from: a */
    static boolean[] f10126a = new boolean[3];

    /* renamed from: a */
    static void m13653a(C3976g gVar, C3957e eVar, C3973f fVar) {
        fVar.f10012g = -1;
        fVar.f10014h = -1;
        if (gVar.f9985L[0] != C3975b.WRAP_CONTENT && fVar.f9985L[0] == C3975b.MATCH_PARENT) {
            int i = fVar.f9968B.f9942e;
            int B = gVar.mo14316B() - fVar.f9972D.f9942e;
            C3968e eVar2 = fVar.f9968B;
            eVar2.f9946i = eVar.mo14256a((Object) eVar2);
            C3968e eVar3 = fVar.f9972D;
            eVar3.f9946i = eVar.mo14256a((Object) eVar3);
            eVar.mo14260a(fVar.f9968B.f9946i, i);
            eVar.mo14260a(fVar.f9972D.f9946i, B);
            fVar.f10012g = 2;
            fVar.mo14332a(i, B);
        }
        if (gVar.f9985L[1] != C3975b.WRAP_CONTENT && fVar.f9985L[1] == C3975b.MATCH_PARENT) {
            int i2 = fVar.f9970C.f9942e;
            int l = gVar.mo14381l() - fVar.f9974E.f9942e;
            C3968e eVar4 = fVar.f9970C;
            eVar4.f9946i = eVar.mo14256a((Object) eVar4);
            C3968e eVar5 = fVar.f9974E;
            eVar5.f9946i = eVar.mo14256a((Object) eVar5);
            eVar.mo14260a(fVar.f9970C.f9946i, i2);
            eVar.mo14260a(fVar.f9974E.f9946i, l);
            if (fVar.f10003b0 > 0 || fVar.mo14315A() == 8) {
                C3968e eVar6 = fVar.f9976F;
                eVar6.f9946i = eVar.mo14256a((Object) eVar6);
                eVar.mo14260a(fVar.f9976F.f9946i, fVar.f10003b0 + i2);
            }
            fVar.f10014h = 2;
            fVar.mo14366d(i2, l);
        }
    }

    /* renamed from: a */
    public static final boolean m13654a(int i, int i2) {
        return (i & i2) == i2;
    }

    /* renamed from: b */
    static void m13658b(C3973f fVar, int i, int i2) {
        int i3 = i * 2;
        int i4 = i3 + 1;
        fVar.f9983J[i3].mo14307e().f10130f = fVar.mo14393r().f9983J[i3].mo14307e();
        fVar.f9983J[i3].mo14307e().f10131g = (float) i2;
        fVar.f9983J[i3].mo14307e().f10140b = 1;
        fVar.f9983J[i4].mo14307e().f10130f = fVar.mo14393r().f9983J[i3].mo14307e();
        fVar.f9983J[i4].mo14307e().f10131g = (float) (fVar.mo14364d(i) + i2);
        fVar.f9983J[i4].mo14307e().f10140b = 1;
    }

    /* renamed from: a */
    private static boolean m13655a(C3973f fVar, int i) {
        if (fVar.f9985L[i] != C3975b.MATCH_CONSTRAINT) {
            return false;
        }
        if (i == 0) {
            if (!(fVar.f10020k == 0 && fVar.f10026n == 0 && fVar.f10028o == 0)) {
                return false;
            }
        } else if (!(fVar.f10022l == 0 && fVar.f10032q == 0 && fVar.f10034r == 0)) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    private static boolean m13656a(C3973f fVar, int i, int i2) {
        if (fVar.f9989P != 0.0f) {
            if (fVar.f9985L[i == 0 ? (char) 1 : 0] != C3975b.MATCH_CONSTRAINT && (i2 & 16) == 16) {
                return true;
            }
            return false;
        }
        return true;
    }

    /* renamed from: a */
    static void m13652a(int i, C3973f fVar) {
        int i2 = i;
        C3973f fVar2 = fVar;
        fVar.mo14329Q();
        C3986o e = fVar2.f9968B.mo14307e();
        C3986o e2 = fVar2.f9970C.mo14307e();
        C3986o e3 = fVar2.f9972D.mo14307e();
        C3986o e4 = fVar2.f9974E.mo14307e();
        boolean z = false;
        boolean z2 = (i2 & 8) == 8;
        boolean z3 = fVar2.f9985L[0] == C3975b.MATCH_CONSTRAINT && m13655a(fVar2, 0);
        if (!(e.f10132h == 4 || e3.f10132h == 4)) {
            if (fVar2.f9985L[0] == C3975b.FIXED || (z3 && fVar.mo14315A() == 8)) {
                if (fVar2.f9968B.f9941d == null && fVar2.f9972D.f9941d == null) {
                    e.mo14473b(1);
                    e3.mo14473b(1);
                    if (z2) {
                        e3.mo14472a(e, 1, fVar.mo14397t());
                    } else {
                        e3.mo14471a(e, fVar.mo14316B());
                    }
                } else if (fVar2.f9968B.f9941d != null && fVar2.f9972D.f9941d == null) {
                    e.mo14473b(1);
                    e3.mo14473b(1);
                    if (z2) {
                        e3.mo14472a(e, 1, fVar.mo14397t());
                    } else {
                        e3.mo14471a(e, fVar.mo14316B());
                    }
                } else if (fVar2.f9968B.f9941d == null && fVar2.f9972D.f9941d != null) {
                    e.mo14473b(1);
                    e3.mo14473b(1);
                    e.mo14471a(e3, -fVar.mo14316B());
                    if (z2) {
                        e.mo14472a(e3, -1, fVar.mo14397t());
                    } else {
                        e.mo14471a(e3, -fVar.mo14316B());
                    }
                } else if (!(fVar2.f9968B.f9941d == null || fVar2.f9972D.f9941d == null)) {
                    e.mo14473b(2);
                    e3.mo14473b(2);
                    if (z2) {
                        fVar.mo14397t().mo14481a(e);
                        fVar.mo14397t().mo14481a(e3);
                        e.mo14475b(e3, -1, fVar.mo14397t());
                        e3.mo14475b(e, 1, fVar.mo14397t());
                    } else {
                        e.mo14474b(e3, (float) (-fVar.mo14316B()));
                        e3.mo14474b(e, (float) fVar.mo14316B());
                    }
                }
            } else if (z3 && m13656a(fVar2, 0, i2)) {
                C3964a.m13411a(fVar);
                int B = fVar.mo14316B();
                e.mo14473b(1);
                e3.mo14473b(1);
                if (fVar2.f9968B.f9941d == null && fVar2.f9972D.f9941d == null) {
                    if (z2) {
                        e3.mo14472a(e, 1, fVar.mo14397t());
                    } else {
                        e3.mo14471a(e, B);
                    }
                } else if (fVar2.f9968B.f9941d == null || fVar2.f9972D.f9941d != null) {
                    if (fVar2.f9968B.f9941d != null || fVar2.f9972D.f9941d == null) {
                        if (!(fVar2.f9968B.f9941d == null || fVar2.f9972D.f9941d == null)) {
                            if (z2) {
                                fVar.mo14397t().mo14481a(e);
                                fVar.mo14397t().mo14481a(e3);
                            }
                            if (fVar2.f9989P == 0.0f) {
                                e.mo14473b(3);
                                e3.mo14473b(3);
                                e.mo14474b(e3, 0.0f);
                                e3.mo14474b(e, 0.0f);
                            } else {
                                e.mo14473b(2);
                                e3.mo14473b(2);
                                e.mo14474b(e3, (float) (-B));
                                e3.mo14474b(e, (float) B);
                                fVar2.mo14401u(B);
                            }
                        }
                    } else if (z2) {
                        e.mo14472a(e3, -1, fVar.mo14397t());
                    } else {
                        e.mo14471a(e3, -B);
                    }
                } else if (z2) {
                    e3.mo14472a(e, 1, fVar.mo14397t());
                } else {
                    e3.mo14471a(e, B);
                }
            }
        }
        if (fVar2.f9985L[1] == C3975b.MATCH_CONSTRAINT && m13655a(fVar2, 1)) {
            z = true;
        }
        if (e2.f10132h != 4 && e4.f10132h != 4) {
            if (fVar2.f9985L[1] == C3975b.FIXED || (z && fVar.mo14315A() == 8)) {
                if (fVar2.f9970C.f9941d == null && fVar2.f9974E.f9941d == null) {
                    e2.mo14473b(1);
                    e4.mo14473b(1);
                    if (z2) {
                        e4.mo14472a(e2, 1, fVar.mo14395s());
                    } else {
                        e4.mo14471a(e2, fVar.mo14381l());
                    }
                    C3968e eVar = fVar2.f9976F;
                    if (eVar.f9941d != null) {
                        eVar.mo14307e().mo14473b(1);
                        e2.mo14468a(1, fVar2.f9976F.mo14307e(), -fVar2.f10003b0);
                    }
                } else if (fVar2.f9970C.f9941d != null && fVar2.f9974E.f9941d == null) {
                    e2.mo14473b(1);
                    e4.mo14473b(1);
                    if (z2) {
                        e4.mo14472a(e2, 1, fVar.mo14395s());
                    } else {
                        e4.mo14471a(e2, fVar.mo14381l());
                    }
                    if (fVar2.f10003b0 > 0) {
                        fVar2.f9976F.mo14307e().mo14468a(1, e2, fVar2.f10003b0);
                    }
                } else if (fVar2.f9970C.f9941d == null && fVar2.f9974E.f9941d != null) {
                    e2.mo14473b(1);
                    e4.mo14473b(1);
                    if (z2) {
                        e2.mo14472a(e4, -1, fVar.mo14395s());
                    } else {
                        e2.mo14471a(e4, -fVar.mo14381l());
                    }
                    if (fVar2.f10003b0 > 0) {
                        fVar2.f9976F.mo14307e().mo14468a(1, e2, fVar2.f10003b0);
                    }
                } else if (fVar2.f9970C.f9941d != null && fVar2.f9974E.f9941d != null) {
                    e2.mo14473b(2);
                    e4.mo14473b(2);
                    if (z2) {
                        e2.mo14475b(e4, -1, fVar.mo14395s());
                        e4.mo14475b(e2, 1, fVar.mo14395s());
                        fVar.mo14395s().mo14481a(e2);
                        fVar.mo14397t().mo14481a(e4);
                    } else {
                        e2.mo14474b(e4, (float) (-fVar.mo14381l()));
                        e4.mo14474b(e2, (float) fVar.mo14381l());
                    }
                    if (fVar2.f10003b0 > 0) {
                        fVar2.f9976F.mo14307e().mo14468a(1, e2, fVar2.f10003b0);
                    }
                }
            } else if (z && m13656a(fVar2, 1, i2)) {
                C3964a.m13411a(fVar);
                int l = fVar.mo14381l();
                e2.mo14473b(1);
                e4.mo14473b(1);
                if (fVar2.f9970C.f9941d == null && fVar2.f9974E.f9941d == null) {
                    if (z2) {
                        e4.mo14472a(e2, 1, fVar.mo14395s());
                    } else {
                        e4.mo14471a(e2, l);
                    }
                } else if (fVar2.f9970C.f9941d == null || fVar2.f9974E.f9941d != null) {
                    if (fVar2.f9970C.f9941d != null || fVar2.f9974E.f9941d == null) {
                        if (fVar2.f9970C.f9941d != null && fVar2.f9974E.f9941d != null) {
                            if (z2) {
                                fVar.mo14395s().mo14481a(e2);
                                fVar.mo14397t().mo14481a(e4);
                            }
                            if (fVar2.f9989P == 0.0f) {
                                e2.mo14473b(3);
                                e4.mo14473b(3);
                                e2.mo14474b(e4, 0.0f);
                                e4.mo14474b(e2, 0.0f);
                                return;
                            }
                            e2.mo14473b(2);
                            e4.mo14473b(2);
                            e2.mo14474b(e4, (float) (-l));
                            e4.mo14474b(e2, (float) l);
                            fVar2.mo14384m(l);
                            if (fVar2.f10003b0 > 0) {
                                fVar2.f9976F.mo14307e().mo14468a(1, e2, fVar2.f10003b0);
                            }
                        }
                    } else if (z2) {
                        e2.mo14472a(e4, -1, fVar.mo14395s());
                    } else {
                        e2.mo14471a(e4, -l);
                    }
                } else if (z2) {
                    e4.mo14472a(e2, 1, fVar.mo14395s());
                } else {
                    e4.mo14471a(e2, l);
                }
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0041, code lost:
        if (r7.f10051z0 == 2) goto L_0x0043;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0045, code lost:
        r2 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0057, code lost:
        if (r7.f9967A0 == 2) goto L_0x0043;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static boolean m13657a(p096e.p114f.p117b.p118j.C3976g r20, p096e.p114f.p117b.C3957e r21, int r22, int r23, p096e.p114f.p117b.p118j.C3967d r24) {
        /*
            r0 = r21
            r1 = r22
            r2 = r24
            e.f.b.j.f r3 = r2.f9917a
            e.f.b.j.f r4 = r2.f9919c
            e.f.b.j.f r5 = r2.f9918b
            e.f.b.j.f r6 = r2.f9920d
            e.f.b.j.f r7 = r2.f9921e
            int r8 = r2.f9926j
            float r9 = r2.f9927k
            e.f.b.j.f r10 = r2.f9922f
            e.f.b.j.f r10 = r2.f9923g
            r11 = r20
            e.f.b.j.f$b[] r10 = r11.f9985L
            r10 = r10[r1]
            e.f.b.j.f$b r11 = p096e.p114f.p117b.p118j.C3973f.C3975b.WRAP_CONTENT
            int r10 = r2.f9929m
            float r10 = (float) r10
            int r11 = r2.f9930n
            int r11 = r2.f9928l
            boolean r2 = r2.f9931o
            r12 = 0
            if (r2 != 0) goto L_0x002d
            return r12
        L_0x002d:
            r2 = 2
            r13 = 1
            if (r1 != 0) goto L_0x0047
            int r14 = r7.f10051z0
            if (r14 != 0) goto L_0x0037
            r14 = 1
            goto L_0x0038
        L_0x0037:
            r14 = 0
        L_0x0038:
            int r15 = r7.f10051z0
            if (r15 != r13) goto L_0x003e
            r15 = 1
            goto L_0x003f
        L_0x003e:
            r15 = 0
        L_0x003f:
            int r7 = r7.f10051z0
            if (r7 != r2) goto L_0x0045
        L_0x0043:
            r2 = 1
            goto L_0x005a
        L_0x0045:
            r2 = 0
            goto L_0x005a
        L_0x0047:
            int r14 = r7.f9967A0
            if (r14 != 0) goto L_0x004d
            r14 = 1
            goto L_0x004e
        L_0x004d:
            r14 = 0
        L_0x004e:
            int r15 = r7.f9967A0
            if (r15 != r13) goto L_0x0054
            r15 = 1
            goto L_0x0055
        L_0x0054:
            r15 = 0
        L_0x0055:
            int r7 = r7.f9967A0
            if (r7 != r2) goto L_0x0045
            goto L_0x0043
        L_0x005a:
            e.f.b.j.e[] r7 = r3.f9983J
            r7 = r7[r23]
            e.f.b.j.o r7 = r7.mo14307e()
            e.f.b.j.e[] r12 = r4.f9983J
            int r16 = r23 + 1
            r12 = r12[r16]
            e.f.b.j.o r12 = r12.mo14307e()
            e.f.b.j.o r13 = r7.f10128d
            if (r13 == 0) goto L_0x02db
            r17 = r11
            e.f.b.j.o r11 = r12.f10128d
            if (r11 != 0) goto L_0x0078
            goto L_0x02db
        L_0x0078:
            int r13 = r13.f10140b
            r0 = 1
            if (r13 != r0) goto L_0x02d9
            int r11 = r11.f10140b
            if (r11 == r0) goto L_0x0083
            goto L_0x02d9
        L_0x0083:
            r0 = 0
            if (r2 != 0) goto L_0x008d
            if (r14 != 0) goto L_0x008d
            if (r15 == 0) goto L_0x008b
            goto L_0x008d
        L_0x008b:
            r11 = 0
            goto L_0x00a6
        L_0x008d:
            if (r5 == 0) goto L_0x0099
            e.f.b.j.e[] r11 = r5.f9983J
            r11 = r11[r23]
            int r11 = r11.mo14304b()
            float r11 = (float) r11
            goto L_0x009a
        L_0x0099:
            r11 = 0
        L_0x009a:
            if (r6 == 0) goto L_0x00a6
            e.f.b.j.e[] r13 = r6.f9983J
            r13 = r13[r16]
            int r13 = r13.mo14304b()
            float r13 = (float) r13
            float r11 = r11 + r13
        L_0x00a6:
            e.f.b.j.o r13 = r7.f10128d
            float r13 = r13.f10131g
            e.f.b.j.o r12 = r12.f10128d
            float r12 = r12.f10131g
            int r18 = (r13 > r12 ? 1 : (r13 == r12 ? 0 : -1))
            if (r18 >= 0) goto L_0x00b4
            float r12 = r12 - r13
            goto L_0x00b6
        L_0x00b4:
            float r12 = r13 - r12
        L_0x00b6:
            float r12 = r12 - r10
            r10 = 8
            r18 = 1
            if (r8 <= 0) goto L_0x0187
            e.f.b.j.f r2 = r3.mo14393r()
            if (r2 == 0) goto L_0x00d1
            e.f.b.j.f r2 = r3.mo14393r()
            e.f.b.j.f$b[] r2 = r2.f9985L
            r2 = r2[r1]
            e.f.b.j.f$b r11 = p096e.p114f.p117b.p118j.C3973f.C3975b.WRAP_CONTENT
            if (r2 != r11) goto L_0x00d1
            r2 = 0
            return r2
        L_0x00d1:
            if (r5 == 0) goto L_0x00dd
            e.f.b.j.e[] r2 = r5.f9983J
            r2 = r2[r23]
            int r2 = r2.mo14304b()
            float r2 = (float) r2
            float r12 = r12 - r2
        L_0x00dd:
            if (r6 == 0) goto L_0x00e9
            e.f.b.j.e[] r2 = r6.f9983J
            r2 = r2[r16]
            int r2 = r2.mo14304b()
            float r2 = (float) r2
            float r12 = r12 - r2
        L_0x00e9:
            if (r3 == 0) goto L_0x0185
            e.f.b.f r2 = p096e.p114f.p117b.C3957e.f9848r
            if (r2 == 0) goto L_0x0101
            long r5 = r2.f9865A
            long r5 = r5 - r18
            r2.f9865A = r5
            long r5 = r2.f9886s
            long r5 = r5 + r18
            r2.f9886s = r5
            long r5 = r2.f9892y
            long r5 = r5 + r18
            r2.f9892y = r5
        L_0x0101:
            e.f.b.j.f[] r2 = r3.f9977F0
            r2 = r2[r1]
            if (r2 != 0) goto L_0x010e
            if (r3 != r4) goto L_0x010a
            goto L_0x010e
        L_0x010a:
            r6 = r21
            goto L_0x0182
        L_0x010e:
            e.f.b.j.f$b r5 = r3.mo14356c(r1)
            e.f.b.j.f$b r6 = p096e.p114f.p117b.p118j.C3973f.C3975b.MATCH_CONSTRAINT
            if (r5 != r6) goto L_0x0136
            float r5 = (float) r8
            float r5 = r12 / r5
            int r6 = (r9 > r0 ? 1 : (r9 == r0 ? 0 : -1))
            if (r6 <= 0) goto L_0x012e
            float[] r5 = r3.f9973D0
            r6 = r5[r1]
            r11 = -1082130432(0xffffffffbf800000, float:-1.0)
            int r6 = (r6 > r11 ? 1 : (r6 == r11 ? 0 : -1))
            if (r6 != 0) goto L_0x0129
            r5 = 0
            goto L_0x012e
        L_0x0129:
            r5 = r5[r1]
            float r5 = r5 * r12
            float r5 = r5 / r9
        L_0x012e:
            int r6 = r3.mo14315A()
            if (r6 != r10) goto L_0x013b
            r5 = 0
            goto L_0x013b
        L_0x0136:
            int r5 = r3.mo14364d(r1)
            float r5 = (float) r5
        L_0x013b:
            e.f.b.j.e[] r6 = r3.f9983J
            r6 = r6[r23]
            int r6 = r6.mo14304b()
            float r6 = (float) r6
            float r13 = r13 + r6
            e.f.b.j.e[] r6 = r3.f9983J
            r6 = r6[r23]
            e.f.b.j.o r6 = r6.mo14307e()
            e.f.b.j.o r11 = r7.f10130f
            r6.mo14470a(r11, r13)
            e.f.b.j.e[] r6 = r3.f9983J
            r6 = r6[r16]
            e.f.b.j.o r6 = r6.mo14307e()
            e.f.b.j.o r11 = r7.f10130f
            float r13 = r13 + r5
            r6.mo14470a(r11, r13)
            e.f.b.j.e[] r5 = r3.f9983J
            r5 = r5[r23]
            e.f.b.j.o r5 = r5.mo14307e()
            r6 = r21
            r5.mo14469a(r6)
            e.f.b.j.e[] r5 = r3.f9983J
            r5 = r5[r16]
            e.f.b.j.o r5 = r5.mo14307e()
            r5.mo14469a(r6)
            e.f.b.j.e[] r3 = r3.f9983J
            r3 = r3[r16]
            int r3 = r3.mo14304b()
            float r3 = (float) r3
            float r13 = r13 + r3
        L_0x0182:
            r3 = r2
            goto L_0x00e9
        L_0x0185:
            r2 = 1
            return r2
        L_0x0187:
            r6 = r21
            int r0 = (r12 > r0 ? 1 : (r12 == r0 ? 0 : -1))
            if (r0 >= 0) goto L_0x0190
            r2 = 1
            r14 = 0
            r15 = 0
        L_0x0190:
            if (r2 == 0) goto L_0x020d
            float r12 = r12 - r11
            float r0 = r3.mo14347b(r1)
            float r12 = r12 * r0
            float r13 = r13 + r12
        L_0x019a:
            if (r3 == 0) goto L_0x0212
            e.f.b.f r0 = p096e.p114f.p117b.C3957e.f9848r
            if (r0 == 0) goto L_0x01b2
            long r8 = r0.f9865A
            long r8 = r8 - r18
            r0.f9865A = r8
            long r8 = r0.f9886s
            long r8 = r8 + r18
            r0.f9886s = r8
            long r8 = r0.f9892y
            long r8 = r8 + r18
            r0.f9892y = r8
        L_0x01b2:
            e.f.b.j.f[] r0 = r3.f9977F0
            r0 = r0[r1]
            if (r0 != 0) goto L_0x01ba
            if (r3 != r4) goto L_0x020b
        L_0x01ba:
            if (r1 != 0) goto L_0x01c1
            int r2 = r3.mo14316B()
            goto L_0x01c5
        L_0x01c1:
            int r2 = r3.mo14381l()
        L_0x01c5:
            float r2 = (float) r2
            e.f.b.j.e[] r5 = r3.f9983J
            r5 = r5[r23]
            int r5 = r5.mo14304b()
            float r5 = (float) r5
            float r13 = r13 + r5
            e.f.b.j.e[] r5 = r3.f9983J
            r5 = r5[r23]
            e.f.b.j.o r5 = r5.mo14307e()
            e.f.b.j.o r8 = r7.f10130f
            r5.mo14470a(r8, r13)
            e.f.b.j.e[] r5 = r3.f9983J
            r5 = r5[r16]
            e.f.b.j.o r5 = r5.mo14307e()
            e.f.b.j.o r8 = r7.f10130f
            float r13 = r13 + r2
            r5.mo14470a(r8, r13)
            e.f.b.j.e[] r2 = r3.f9983J
            r2 = r2[r23]
            e.f.b.j.o r2 = r2.mo14307e()
            r2.mo14469a(r6)
            e.f.b.j.e[] r2 = r3.f9983J
            r2 = r2[r16]
            e.f.b.j.o r2 = r2.mo14307e()
            r2.mo14469a(r6)
            e.f.b.j.e[] r2 = r3.f9983J
            r2 = r2[r16]
            int r2 = r2.mo14304b()
            float r2 = (float) r2
            float r13 = r13 + r2
        L_0x020b:
            r3 = r0
            goto L_0x019a
        L_0x020d:
            if (r14 != 0) goto L_0x0215
            if (r15 == 0) goto L_0x0212
            goto L_0x0215
        L_0x0212:
            r0 = 1
            goto L_0x02d8
        L_0x0215:
            if (r14 == 0) goto L_0x0219
        L_0x0217:
            float r12 = r12 - r11
            goto L_0x021c
        L_0x0219:
            if (r15 == 0) goto L_0x021c
            goto L_0x0217
        L_0x021c:
            int r11 = r17 + 1
            float r0 = (float) r11
            float r0 = r12 / r0
            r2 = r17
            if (r15 == 0) goto L_0x0230
            r8 = 1
            if (r2 <= r8) goto L_0x022c
            int r11 = r2 + -1
            float r0 = (float) r11
            goto L_0x022e
        L_0x022c:
            r0 = 1073741824(0x40000000, float:2.0)
        L_0x022e:
            float r0 = r12 / r0
        L_0x0230:
            int r8 = r3.mo14315A()
            if (r8 == r10) goto L_0x0239
            float r8 = r13 + r0
            goto L_0x023a
        L_0x0239:
            r8 = r13
        L_0x023a:
            if (r15 == 0) goto L_0x024a
            r9 = 1
            if (r2 <= r9) goto L_0x024a
            e.f.b.j.e[] r2 = r5.f9983J
            r2 = r2[r23]
            int r2 = r2.mo14304b()
            float r2 = (float) r2
            float r8 = r13 + r2
        L_0x024a:
            if (r14 == 0) goto L_0x0258
            if (r5 == 0) goto L_0x0258
            e.f.b.j.e[] r2 = r5.f9983J
            r2 = r2[r23]
            int r2 = r2.mo14304b()
            float r2 = (float) r2
            float r8 = r8 + r2
        L_0x0258:
            if (r3 == 0) goto L_0x0212
            e.f.b.f r2 = p096e.p114f.p117b.C3957e.f9848r
            if (r2 == 0) goto L_0x0270
            long r11 = r2.f9865A
            long r11 = r11 - r18
            r2.f9865A = r11
            long r11 = r2.f9886s
            long r11 = r11 + r18
            r2.f9886s = r11
            long r11 = r2.f9892y
            long r11 = r11 + r18
            r2.f9892y = r11
        L_0x0270:
            e.f.b.j.f[] r2 = r3.f9977F0
            r2 = r2[r1]
            if (r2 != 0) goto L_0x0278
            if (r3 != r4) goto L_0x02d6
        L_0x0278:
            if (r1 != 0) goto L_0x027f
            int r9 = r3.mo14316B()
            goto L_0x0283
        L_0x027f:
            int r9 = r3.mo14381l()
        L_0x0283:
            float r9 = (float) r9
            if (r3 == r5) goto L_0x0290
            e.f.b.j.e[] r11 = r3.f9983J
            r11 = r11[r23]
            int r11 = r11.mo14304b()
            float r11 = (float) r11
            float r8 = r8 + r11
        L_0x0290:
            e.f.b.j.e[] r11 = r3.f9983J
            r11 = r11[r23]
            e.f.b.j.o r11 = r11.mo14307e()
            e.f.b.j.o r12 = r7.f10130f
            r11.mo14470a(r12, r8)
            e.f.b.j.e[] r11 = r3.f9983J
            r11 = r11[r16]
            e.f.b.j.o r11 = r11.mo14307e()
            e.f.b.j.o r12 = r7.f10130f
            float r13 = r8 + r9
            r11.mo14470a(r12, r13)
            e.f.b.j.e[] r11 = r3.f9983J
            r11 = r11[r23]
            e.f.b.j.o r11 = r11.mo14307e()
            r11.mo14469a(r6)
            e.f.b.j.e[] r11 = r3.f9983J
            r11 = r11[r16]
            e.f.b.j.o r11 = r11.mo14307e()
            r11.mo14469a(r6)
            e.f.b.j.e[] r3 = r3.f9983J
            r3 = r3[r16]
            int r3 = r3.mo14304b()
            float r3 = (float) r3
            float r9 = r9 + r3
            float r8 = r8 + r9
            if (r2 == 0) goto L_0x02d6
            int r3 = r2.mo14315A()
            if (r3 == r10) goto L_0x02d6
            float r8 = r8 + r0
        L_0x02d6:
            r3 = r2
            goto L_0x0258
        L_0x02d8:
            return r0
        L_0x02d9:
            r0 = 0
            return r0
        L_0x02db:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p096e.p114f.p117b.p118j.C3984m.m13657a(e.f.b.j.g, e.f.b.e, int, int, e.f.b.j.d):boolean");
    }
}
