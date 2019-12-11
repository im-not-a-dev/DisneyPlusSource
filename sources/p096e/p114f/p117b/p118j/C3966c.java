package p096e.p114f.p117b.p118j;

import p096e.p114f.p117b.C3957e;

/* renamed from: e.f.b.j.c */
/* compiled from: Chain */
class C3966c {
    /* renamed from: a */
    static void m13424a(C3976g gVar, C3957e eVar, int i) {
        int i2;
        C3967d[] dVarArr;
        int i3;
        if (i == 0) {
            int i4 = gVar.f10069U0;
            dVarArr = gVar.f10072X0;
            i2 = i4;
            i3 = 0;
        } else {
            i3 = 2;
            int i5 = gVar.f10070V0;
            i2 = i5;
            dVarArr = gVar.f10071W0;
        }
        for (int i6 = 0; i6 < i2; i6++) {
            C3967d dVar = dVarArr[i6];
            dVar.mo14295a();
            if (!gVar.mo14294z(4)) {
                m13425a(gVar, eVar, i, i3, dVar);
            } else if (!C3984m.m13657a(gVar, eVar, i, i3, dVar)) {
                m13425a(gVar, eVar, i, i3, dVar);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0035, code lost:
        if (r2.f10051z0 == 2) goto L_0x004a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0048, code lost:
        if (r2.f9967A0 == 2) goto L_0x004a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x004c, code lost:
        r5 = false;
     */
    /* JADX WARNING: Removed duplicated region for block: B:189:0x036b  */
    /* JADX WARNING: Removed duplicated region for block: B:292:0x036c A[SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static void m13425a(p096e.p114f.p117b.p118j.C3976g r36, p096e.p114f.p117b.C3957e r37, int r38, int r39, p096e.p114f.p117b.p118j.C3967d r40) {
        /*
            r0 = r36
            r9 = r37
            r1 = r40
            e.f.b.j.f r10 = r1.f9917a
            e.f.b.j.f r11 = r1.f9919c
            e.f.b.j.f r12 = r1.f9918b
            e.f.b.j.f r13 = r1.f9920d
            e.f.b.j.f r2 = r1.f9921e
            float r3 = r1.f9927k
            e.f.b.j.f r4 = r1.f9922f
            e.f.b.j.f r4 = r1.f9923g
            e.f.b.j.f$b[] r4 = r0.f9985L
            r4 = r4[r38]
            e.f.b.j.f$b r5 = p096e.p114f.p117b.p118j.C3973f.C3975b.WRAP_CONTENT
            r7 = 1
            if (r4 != r5) goto L_0x0021
            r4 = 1
            goto L_0x0022
        L_0x0021:
            r4 = 0
        L_0x0022:
            r5 = 2
            if (r38 != 0) goto L_0x0038
            int r8 = r2.f10051z0
            if (r8 != 0) goto L_0x002b
            r8 = 1
            goto L_0x002c
        L_0x002b:
            r8 = 0
        L_0x002c:
            int r14 = r2.f10051z0
            if (r14 != r7) goto L_0x0032
            r14 = 1
            goto L_0x0033
        L_0x0032:
            r14 = 0
        L_0x0033:
            int r15 = r2.f10051z0
            if (r15 != r5) goto L_0x004c
            goto L_0x004a
        L_0x0038:
            int r8 = r2.f9967A0
            if (r8 != 0) goto L_0x003e
            r8 = 1
            goto L_0x003f
        L_0x003e:
            r8 = 0
        L_0x003f:
            int r14 = r2.f9967A0
            if (r14 != r7) goto L_0x0045
            r14 = 1
            goto L_0x0046
        L_0x0045:
            r14 = 0
        L_0x0046:
            int r15 = r2.f9967A0
            if (r15 != r5) goto L_0x004c
        L_0x004a:
            r5 = 1
            goto L_0x004d
        L_0x004c:
            r5 = 0
        L_0x004d:
            r15 = r8
            r8 = r10
            r16 = r14
            r14 = r5
            r5 = 0
        L_0x0053:
            r21 = 0
            if (r5 != 0) goto L_0x0124
            e.f.b.j.e[] r6 = r8.f9983J
            r6 = r6[r39]
            if (r4 != 0) goto L_0x0063
            if (r14 == 0) goto L_0x0060
            goto L_0x0063
        L_0x0060:
            r23 = 4
            goto L_0x0065
        L_0x0063:
            r23 = 1
        L_0x0065:
            int r24 = r6.mo14304b()
            e.f.b.j.e r7 = r6.f9941d
            if (r7 == 0) goto L_0x0075
            if (r8 == r10) goto L_0x0075
            int r7 = r7.mo14304b()
            int r24 = r24 + r7
        L_0x0075:
            r7 = r24
            if (r14 == 0) goto L_0x0083
            if (r8 == r10) goto L_0x0083
            if (r8 == r12) goto L_0x0083
            r24 = r3
            r23 = r5
            r3 = 6
            goto L_0x0093
        L_0x0083:
            if (r15 == 0) goto L_0x008d
            if (r4 == 0) goto L_0x008d
            r24 = r3
            r23 = r5
            r3 = 4
            goto L_0x0093
        L_0x008d:
            r24 = r3
            r3 = r23
            r23 = r5
        L_0x0093:
            e.f.b.j.e r5 = r6.f9941d
            if (r5 == 0) goto L_0x00bc
            if (r8 != r12) goto L_0x00a6
            r25 = r15
            e.f.b.i r15 = r6.f9946i
            e.f.b.i r5 = r5.f9946i
            r26 = r2
            r2 = 5
            r9.mo14267b(r15, r5, r7, r2)
            goto L_0x00b2
        L_0x00a6:
            r26 = r2
            r25 = r15
            e.f.b.i r2 = r6.f9946i
            e.f.b.i r5 = r5.f9946i
            r15 = 6
            r9.mo14267b(r2, r5, r7, r15)
        L_0x00b2:
            e.f.b.i r2 = r6.f9946i
            e.f.b.j.e r5 = r6.f9941d
            e.f.b.i r5 = r5.f9946i
            r9.mo14253a(r2, r5, r7, r3)
            goto L_0x00c0
        L_0x00bc:
            r26 = r2
            r25 = r15
        L_0x00c0:
            if (r4 == 0) goto L_0x00f5
            int r2 = r8.mo14315A()
            r3 = 8
            if (r2 == r3) goto L_0x00e4
            e.f.b.j.f$b[] r2 = r8.f9985L
            r2 = r2[r38]
            e.f.b.j.f$b r3 = p096e.p114f.p117b.p118j.C3973f.C3975b.MATCH_CONSTRAINT
            if (r2 != r3) goto L_0x00e4
            e.f.b.j.e[] r2 = r8.f9983J
            int r3 = r39 + 1
            r3 = r2[r3]
            e.f.b.i r3 = r3.f9946i
            r2 = r2[r39]
            e.f.b.i r2 = r2.f9946i
            r5 = 5
            r6 = 0
            r9.mo14267b(r3, r2, r6, r5)
            goto L_0x00e5
        L_0x00e4:
            r6 = 0
        L_0x00e5:
            e.f.b.j.e[] r2 = r8.f9983J
            r2 = r2[r39]
            e.f.b.i r2 = r2.f9946i
            e.f.b.j.e[] r3 = r0.f9983J
            r3 = r3[r39]
            e.f.b.i r3 = r3.f9946i
            r5 = 6
            r9.mo14267b(r2, r3, r6, r5)
        L_0x00f5:
            e.f.b.j.e[] r2 = r8.f9983J
            int r3 = r39 + 1
            r2 = r2[r3]
            e.f.b.j.e r2 = r2.f9941d
            if (r2 == 0) goto L_0x0114
            e.f.b.j.f r2 = r2.f9939b
            e.f.b.j.e[] r3 = r2.f9983J
            r5 = r3[r39]
            e.f.b.j.e r5 = r5.f9941d
            if (r5 == 0) goto L_0x0114
            r3 = r3[r39]
            e.f.b.j.e r3 = r3.f9941d
            e.f.b.j.f r3 = r3.f9939b
            if (r3 == r8) goto L_0x0112
            goto L_0x0114
        L_0x0112:
            r21 = r2
        L_0x0114:
            if (r21 == 0) goto L_0x011b
            r8 = r21
            r5 = r23
            goto L_0x011c
        L_0x011b:
            r5 = 1
        L_0x011c:
            r3 = r24
            r15 = r25
            r2 = r26
            goto L_0x0053
        L_0x0124:
            r26 = r2
            r24 = r3
            r25 = r15
            if (r13 == 0) goto L_0x014b
            e.f.b.j.e[] r2 = r11.f9983J
            int r3 = r39 + 1
            r5 = r2[r3]
            e.f.b.j.e r5 = r5.f9941d
            if (r5 == 0) goto L_0x014b
            e.f.b.j.e[] r5 = r13.f9983J
            r5 = r5[r3]
            e.f.b.i r6 = r5.f9946i
            r2 = r2[r3]
            e.f.b.j.e r2 = r2.f9941d
            e.f.b.i r2 = r2.f9946i
            int r3 = r5.mo14304b()
            int r3 = -r3
            r5 = 5
            r9.mo14270c(r6, r2, r3, r5)
        L_0x014b:
            if (r4 == 0) goto L_0x0165
            e.f.b.j.e[] r0 = r0.f9983J
            int r2 = r39 + 1
            r0 = r0[r2]
            e.f.b.i r0 = r0.f9946i
            e.f.b.j.e[] r3 = r11.f9983J
            r4 = r3[r2]
            e.f.b.i r4 = r4.f9946i
            r2 = r3[r2]
            int r2 = r2.mo14304b()
            r3 = 6
            r9.mo14267b(r0, r4, r2, r3)
        L_0x0165:
            java.util.ArrayList<e.f.b.j.f> r0 = r1.f9924h
            if (r0 == 0) goto L_0x0216
            int r2 = r0.size()
            r3 = 1
            if (r2 <= r3) goto L_0x0216
            boolean r4 = r1.f9934r
            if (r4 == 0) goto L_0x017c
            boolean r4 = r1.f9936t
            if (r4 != 0) goto L_0x017c
            int r4 = r1.f9926j
            float r4 = (float) r4
            goto L_0x017e
        L_0x017c:
            r4 = r24
        L_0x017e:
            r5 = 0
            r7 = r21
            r6 = 0
            r28 = 0
        L_0x0184:
            if (r6 >= r2) goto L_0x0216
            java.lang.Object r8 = r0.get(r6)
            e.f.b.j.f r8 = (p096e.p114f.p117b.p118j.C3973f) r8
            float[] r15 = r8.f9973D0
            r15 = r15[r38]
            int r17 = (r15 > r5 ? 1 : (r15 == r5 ? 0 : -1))
            if (r17 >= 0) goto L_0x01b2
            boolean r15 = r1.f9936t
            if (r15 == 0) goto L_0x01ab
            e.f.b.j.e[] r8 = r8.f9983J
            int r15 = r39 + 1
            r15 = r8[r15]
            e.f.b.i r15 = r15.f9946i
            r8 = r8[r39]
            e.f.b.i r8 = r8.f9946i
            r3 = 0
            r5 = 4
            r9.mo14253a(r15, r8, r3, r5)
            r5 = 6
            goto L_0x01c9
        L_0x01ab:
            r5 = 4
            r3 = 1065353216(0x3f800000, float:1.0)
            r3 = 0
            r15 = 1065353216(0x3f800000, float:1.0)
            goto L_0x01b4
        L_0x01b2:
            r5 = 4
            r3 = 0
        L_0x01b4:
            int r22 = (r15 > r3 ? 1 : (r15 == r3 ? 0 : -1))
            if (r22 != 0) goto L_0x01ce
            e.f.b.j.e[] r8 = r8.f9983J
            int r15 = r39 + 1
            r15 = r8[r15]
            e.f.b.i r15 = r15.f9946i
            r8 = r8[r39]
            e.f.b.i r8 = r8.f9946i
            r3 = 0
            r5 = 6
            r9.mo14253a(r15, r8, r3, r5)
        L_0x01c9:
            r24 = r0
            r20 = r2
            goto L_0x020c
        L_0x01ce:
            r3 = 0
            r5 = 6
            if (r7 == 0) goto L_0x0205
            e.f.b.j.e[] r7 = r7.f9983J
            r3 = r7[r39]
            e.f.b.i r3 = r3.f9946i
            int r20 = r39 + 1
            r7 = r7[r20]
            e.f.b.i r7 = r7.f9946i
            e.f.b.j.e[] r5 = r8.f9983J
            r24 = r0
            r0 = r5[r39]
            e.f.b.i r0 = r0.f9946i
            r5 = r5[r20]
            e.f.b.i r5 = r5.f9946i
            r20 = r2
            e.f.b.b r2 = r37.mo14266b()
            r27 = r2
            r29 = r4
            r30 = r15
            r31 = r3
            r32 = r7
            r33 = r0
            r34 = r5
            r27.mo14226a(r28, r29, r30, r31, r32, r33, r34)
            r9.mo14257a(r2)
            goto L_0x0209
        L_0x0205:
            r24 = r0
            r20 = r2
        L_0x0209:
            r7 = r8
            r28 = r15
        L_0x020c:
            int r6 = r6 + 1
            r2 = r20
            r0 = r24
            r3 = 1
            r5 = 0
            goto L_0x0184
        L_0x0216:
            if (r12 == 0) goto L_0x0278
            if (r12 == r13) goto L_0x021c
            if (r14 == 0) goto L_0x0278
        L_0x021c:
            e.f.b.j.e[] r0 = r10.f9983J
            r1 = r0[r39]
            e.f.b.j.e[] r2 = r11.f9983J
            int r3 = r39 + 1
            r2 = r2[r3]
            r4 = r0[r39]
            e.f.b.j.e r4 = r4.f9941d
            if (r4 == 0) goto L_0x0234
            r0 = r0[r39]
            e.f.b.j.e r0 = r0.f9941d
            e.f.b.i r0 = r0.f9946i
            r4 = r0
            goto L_0x0236
        L_0x0234:
            r4 = r21
        L_0x0236:
            e.f.b.j.e[] r0 = r11.f9983J
            r5 = r0[r3]
            e.f.b.j.e r5 = r5.f9941d
            if (r5 == 0) goto L_0x0246
            r0 = r0[r3]
            e.f.b.j.e r0 = r0.f9941d
            e.f.b.i r0 = r0.f9946i
            r5 = r0
            goto L_0x0248
        L_0x0246:
            r5 = r21
        L_0x0248:
            if (r12 != r13) goto L_0x0250
            e.f.b.j.e[] r0 = r12.f9983J
            r1 = r0[r39]
            r2 = r0[r3]
        L_0x0250:
            if (r4 == 0) goto L_0x049d
            if (r5 == 0) goto L_0x049d
            if (r38 != 0) goto L_0x025b
            r0 = r26
            float r0 = r0.f10013g0
            goto L_0x025f
        L_0x025b:
            r0 = r26
            float r0 = r0.f10015h0
        L_0x025f:
            r6 = r0
            int r3 = r1.mo14304b()
            int r7 = r2.mo14304b()
            e.f.b.i r1 = r1.f9946i
            e.f.b.i r8 = r2.f9946i
            r10 = 5
            r0 = r37
            r2 = r4
            r4 = r6
            r6 = r8
            r8 = r10
            r0.mo14261a(r1, r2, r3, r4, r5, r6, r7, r8)
            goto L_0x049d
        L_0x0278:
            if (r25 == 0) goto L_0x0370
            if (r12 == 0) goto L_0x0370
            int r0 = r1.f9926j
            if (r0 <= 0) goto L_0x0287
            int r1 = r1.f9925i
            if (r1 != r0) goto L_0x0287
            r17 = 1
            goto L_0x0289
        L_0x0287:
            r17 = 0
        L_0x0289:
            r14 = r12
            r15 = r14
        L_0x028b:
            if (r14 == 0) goto L_0x049d
            e.f.b.j.f[] r0 = r14.f9977F0
            r0 = r0[r38]
            r8 = r0
        L_0x0292:
            if (r8 == 0) goto L_0x02a1
            int r0 = r8.mo14315A()
            r6 = 8
            if (r0 != r6) goto L_0x02a3
            e.f.b.j.f[] r0 = r8.f9977F0
            r8 = r0[r38]
            goto L_0x0292
        L_0x02a1:
            r6 = 8
        L_0x02a3:
            if (r8 != 0) goto L_0x02ae
            if (r14 != r13) goto L_0x02a8
            goto L_0x02ae
        L_0x02a8:
            r18 = r8
            r19 = 6
            goto L_0x0363
        L_0x02ae:
            e.f.b.j.e[] r0 = r14.f9983J
            r0 = r0[r39]
            e.f.b.i r1 = r0.f9946i
            e.f.b.j.e r2 = r0.f9941d
            if (r2 == 0) goto L_0x02bb
            e.f.b.i r2 = r2.f9946i
            goto L_0x02bd
        L_0x02bb:
            r2 = r21
        L_0x02bd:
            if (r15 == r14) goto L_0x02c8
            e.f.b.j.e[] r2 = r15.f9983J
            int r3 = r39 + 1
            r2 = r2[r3]
            e.f.b.i r2 = r2.f9946i
            goto L_0x02dd
        L_0x02c8:
            if (r14 != r12) goto L_0x02dd
            if (r15 != r14) goto L_0x02dd
            e.f.b.j.e[] r2 = r10.f9983J
            r3 = r2[r39]
            e.f.b.j.e r3 = r3.f9941d
            if (r3 == 0) goto L_0x02db
            r2 = r2[r39]
            e.f.b.j.e r2 = r2.f9941d
            e.f.b.i r2 = r2.f9946i
            goto L_0x02dd
        L_0x02db:
            r2 = r21
        L_0x02dd:
            int r0 = r0.mo14304b()
            e.f.b.j.e[] r3 = r14.f9983J
            int r4 = r39 + 1
            r3 = r3[r4]
            int r3 = r3.mo14304b()
            if (r8 == 0) goto L_0x02ff
            e.f.b.j.e[] r5 = r8.f9983J
            r5 = r5[r39]
            e.f.b.i r7 = r5.f9946i
            e.f.b.j.e[] r6 = r14.f9983J
            r6 = r6[r4]
            e.f.b.i r6 = r6.f9946i
            r35 = r7
            r7 = r6
            r6 = r35
            goto L_0x0312
        L_0x02ff:
            e.f.b.j.e[] r5 = r11.f9983J
            r5 = r5[r4]
            e.f.b.j.e r5 = r5.f9941d
            if (r5 == 0) goto L_0x030a
            e.f.b.i r6 = r5.f9946i
            goto L_0x030c
        L_0x030a:
            r6 = r21
        L_0x030c:
            e.f.b.j.e[] r7 = r14.f9983J
            r7 = r7[r4]
            e.f.b.i r7 = r7.f9946i
        L_0x0312:
            if (r5 == 0) goto L_0x0319
            int r5 = r5.mo14304b()
            int r3 = r3 + r5
        L_0x0319:
            if (r15 == 0) goto L_0x0324
            e.f.b.j.e[] r5 = r15.f9983J
            r5 = r5[r4]
            int r5 = r5.mo14304b()
            int r0 = r0 + r5
        L_0x0324:
            if (r1 == 0) goto L_0x02a8
            if (r2 == 0) goto L_0x02a8
            if (r6 == 0) goto L_0x02a8
            if (r7 == 0) goto L_0x02a8
            if (r14 != r12) goto L_0x0336
            e.f.b.j.e[] r0 = r12.f9983J
            r0 = r0[r39]
            int r0 = r0.mo14304b()
        L_0x0336:
            r5 = r0
            if (r14 != r13) goto L_0x0344
            e.f.b.j.e[] r0 = r13.f9983J
            r0 = r0[r4]
            int r0 = r0.mo14304b()
            r18 = r0
            goto L_0x0346
        L_0x0344:
            r18 = r3
        L_0x0346:
            if (r17 == 0) goto L_0x034b
            r20 = 6
            goto L_0x034d
        L_0x034b:
            r20 = 4
        L_0x034d:
            r4 = 1056964608(0x3f000000, float:0.5)
            r0 = r37
            r3 = r5
            r22 = 6
            r23 = 4
            r5 = r6
            r19 = 6
            r6 = r7
            r7 = r18
            r18 = r8
            r8 = r20
            r0.mo14261a(r1, r2, r3, r4, r5, r6, r7, r8)
        L_0x0363:
            int r0 = r14.mo14315A()
            r8 = 8
            if (r0 == r8) goto L_0x036c
            r15 = r14
        L_0x036c:
            r14 = r18
            goto L_0x028b
        L_0x0370:
            r8 = 8
            r19 = 6
            if (r16 == 0) goto L_0x049d
            if (r12 == 0) goto L_0x049d
            int r0 = r1.f9926j
            if (r0 <= 0) goto L_0x0383
            int r1 = r1.f9925i
            if (r1 != r0) goto L_0x0383
            r17 = 1
            goto L_0x0385
        L_0x0383:
            r17 = 0
        L_0x0385:
            r14 = r12
            r15 = r14
        L_0x0387:
            if (r14 == 0) goto L_0x043f
            e.f.b.j.f[] r0 = r14.f9977F0
            r0 = r0[r38]
        L_0x038d:
            if (r0 == 0) goto L_0x039a
            int r1 = r0.mo14315A()
            if (r1 != r8) goto L_0x039a
            e.f.b.j.f[] r0 = r0.f9977F0
            r0 = r0[r38]
            goto L_0x038d
        L_0x039a:
            if (r14 == r12) goto L_0x042c
            if (r14 == r13) goto L_0x042c
            if (r0 == 0) goto L_0x042c
            if (r0 != r13) goto L_0x03a5
            r7 = r21
            goto L_0x03a6
        L_0x03a5:
            r7 = r0
        L_0x03a6:
            e.f.b.j.e[] r0 = r14.f9983J
            r0 = r0[r39]
            e.f.b.i r1 = r0.f9946i
            e.f.b.j.e r2 = r0.f9941d
            if (r2 == 0) goto L_0x03b2
            e.f.b.i r2 = r2.f9946i
        L_0x03b2:
            e.f.b.j.e[] r2 = r15.f9983J
            int r3 = r39 + 1
            r2 = r2[r3]
            e.f.b.i r2 = r2.f9946i
            int r0 = r0.mo14304b()
            e.f.b.j.e[] r4 = r14.f9983J
            r4 = r4[r3]
            int r4 = r4.mo14304b()
            if (r7 == 0) goto L_0x03d8
            e.f.b.j.e[] r5 = r7.f9983J
            r5 = r5[r39]
            e.f.b.i r6 = r5.f9946i
            e.f.b.j.e r8 = r5.f9941d
            if (r8 == 0) goto L_0x03d5
            e.f.b.i r8 = r8.f9946i
            goto L_0x03eb
        L_0x03d5:
            r8 = r21
            goto L_0x03eb
        L_0x03d8:
            e.f.b.j.e[] r5 = r14.f9983J
            r5 = r5[r3]
            e.f.b.j.e r5 = r5.f9941d
            if (r5 == 0) goto L_0x03e3
            e.f.b.i r6 = r5.f9946i
            goto L_0x03e5
        L_0x03e3:
            r6 = r21
        L_0x03e5:
            e.f.b.j.e[] r8 = r14.f9983J
            r8 = r8[r3]
            e.f.b.i r8 = r8.f9946i
        L_0x03eb:
            if (r5 == 0) goto L_0x03f2
            int r5 = r5.mo14304b()
            int r4 = r4 + r5
        L_0x03f2:
            r18 = r4
            if (r15 == 0) goto L_0x03ff
            e.f.b.j.e[] r4 = r15.f9983J
            r3 = r4[r3]
            int r3 = r3.mo14304b()
            int r0 = r0 + r3
        L_0x03ff:
            r3 = r0
            if (r17 == 0) goto L_0x0405
            r20 = 6
            goto L_0x0407
        L_0x0405:
            r20 = 4
        L_0x0407:
            if (r1 == 0) goto L_0x0423
            if (r2 == 0) goto L_0x0423
            if (r6 == 0) goto L_0x0423
            if (r8 == 0) goto L_0x0423
            r4 = 1056964608(0x3f000000, float:0.5)
            r0 = r37
            r5 = r6
            r6 = r8
            r22 = r7
            r7 = r18
            r18 = r15
            r15 = 8
            r8 = r20
            r0.mo14261a(r1, r2, r3, r4, r5, r6, r7, r8)
            goto L_0x0429
        L_0x0423:
            r22 = r7
            r18 = r15
            r15 = 8
        L_0x0429:
            r0 = r22
            goto L_0x0430
        L_0x042c:
            r18 = r15
            r15 = 8
        L_0x0430:
            int r1 = r14.mo14315A()
            if (r1 == r15) goto L_0x0437
            goto L_0x0439
        L_0x0437:
            r14 = r18
        L_0x0439:
            r15 = r14
            r8 = 8
            r14 = r0
            goto L_0x0387
        L_0x043f:
            e.f.b.j.e[] r0 = r12.f9983J
            r0 = r0[r39]
            e.f.b.j.e[] r1 = r10.f9983J
            r1 = r1[r39]
            e.f.b.j.e r1 = r1.f9941d
            e.f.b.j.e[] r2 = r13.f9983J
            int r3 = r39 + 1
            r10 = r2[r3]
            e.f.b.j.e[] r2 = r11.f9983J
            r2 = r2[r3]
            e.f.b.j.e r14 = r2.f9941d
            if (r1 == 0) goto L_0x048c
            if (r12 == r13) goto L_0x0466
            e.f.b.i r2 = r0.f9946i
            e.f.b.i r1 = r1.f9946i
            int r0 = r0.mo14304b()
            r15 = 4
            r9.mo14253a(r2, r1, r0, r15)
            goto L_0x048d
        L_0x0466:
            r15 = 4
            if (r14 == 0) goto L_0x048d
            e.f.b.i r2 = r0.f9946i
            e.f.b.i r3 = r1.f9946i
            int r4 = r0.mo14304b()
            r5 = 1056964608(0x3f000000, float:0.5)
            e.f.b.i r6 = r10.f9946i
            e.f.b.i r7 = r14.f9946i
            int r8 = r10.mo14304b()
            r17 = 4
            r0 = r37
            r1 = r2
            r2 = r3
            r3 = r4
            r4 = r5
            r5 = r6
            r6 = r7
            r7 = r8
            r8 = r17
            r0.mo14261a(r1, r2, r3, r4, r5, r6, r7, r8)
            goto L_0x048d
        L_0x048c:
            r15 = 4
        L_0x048d:
            if (r14 == 0) goto L_0x049d
            if (r12 == r13) goto L_0x049d
            e.f.b.i r0 = r10.f9946i
            e.f.b.i r1 = r14.f9946i
            int r2 = r10.mo14304b()
            int r2 = -r2
            r9.mo14253a(r0, r1, r2, r15)
        L_0x049d:
            if (r25 != 0) goto L_0x04a1
            if (r16 == 0) goto L_0x0501
        L_0x04a1:
            if (r12 == 0) goto L_0x0501
            e.f.b.j.e[] r0 = r12.f9983J
            r0 = r0[r39]
            e.f.b.j.e[] r1 = r13.f9983J
            int r2 = r39 + 1
            r1 = r1[r2]
            e.f.b.j.e r3 = r0.f9941d
            if (r3 == 0) goto L_0x04b4
            e.f.b.i r3 = r3.f9946i
            goto L_0x04b6
        L_0x04b4:
            r3 = r21
        L_0x04b6:
            e.f.b.j.e r4 = r1.f9941d
            if (r4 == 0) goto L_0x04bd
            e.f.b.i r4 = r4.f9946i
            goto L_0x04bf
        L_0x04bd:
            r4 = r21
        L_0x04bf:
            if (r11 == r13) goto L_0x04ce
            e.f.b.j.e[] r4 = r11.f9983J
            r4 = r4[r2]
            e.f.b.j.e r4 = r4.f9941d
            if (r4 == 0) goto L_0x04cc
            e.f.b.i r4 = r4.f9946i
            goto L_0x04ce
        L_0x04cc:
            r4 = r21
        L_0x04ce:
            r5 = r4
            if (r12 != r13) goto L_0x04dc
            e.f.b.j.e[] r0 = r12.f9983J
            r1 = r0[r39]
            r0 = r0[r2]
            r35 = r1
            r1 = r0
            r0 = r35
        L_0x04dc:
            if (r3 == 0) goto L_0x0501
            if (r5 == 0) goto L_0x0501
            r4 = 1056964608(0x3f000000, float:0.5)
            int r6 = r0.mo14304b()
            if (r13 != 0) goto L_0x04e9
            goto L_0x04ea
        L_0x04e9:
            r11 = r13
        L_0x04ea:
            e.f.b.j.e[] r7 = r11.f9983J
            r2 = r7[r2]
            int r7 = r2.mo14304b()
            e.f.b.i r2 = r0.f9946i
            e.f.b.i r8 = r1.f9946i
            r10 = 5
            r0 = r37
            r1 = r2
            r2 = r3
            r3 = r6
            r6 = r8
            r8 = r10
            r0.mo14261a(r1, r2, r3, r4, r5, r6, r7, r8)
        L_0x0501:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p096e.p114f.p117b.p118j.C3966c.m13425a(e.f.b.j.g, e.f.b.e, int, int, e.f.b.j.d):void");
    }
}
