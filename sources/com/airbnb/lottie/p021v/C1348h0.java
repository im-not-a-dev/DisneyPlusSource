package com.airbnb.lottie.p021v;

/* renamed from: com.airbnb.lottie.v.h0 */
/* compiled from: ShapeStrokeParser */
class C1348h0 {
    /* JADX WARNING: Removed duplicated region for block: B:104:0x016d  */
    /* JADX WARNING: Removed duplicated region for block: B:105:0x0176  */
    /* JADX WARNING: Removed duplicated region for block: B:106:0x0180  */
    /* JADX WARNING: Removed duplicated region for block: B:107:0x0191  */
    /* JADX WARNING: Removed duplicated region for block: B:108:0x01a2  */
    /* JADX WARNING: Removed duplicated region for block: B:109:0x01ab  */
    /* JADX WARNING: Removed duplicated region for block: B:110:0x01b4  */
    /* JADX WARNING: Removed duplicated region for block: B:111:0x01bd  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x00a3  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x00ab  */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x00e9  */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x00f6  */
    /* JADX WARNING: Removed duplicated region for block: B:92:0x0135  */
    /* JADX WARNING: Removed duplicated region for block: B:97:0x0147  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static com.airbnb.lottie.p016t.p018k.C1308p m6642a(android.util.JsonReader r18, com.airbnb.lottie.C1182d r19) throws java.io.IOException {
        /*
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            r2 = 0
            r2 = 0
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 0
        L_0x000f:
            boolean r12 = r18.hasNext()
            if (r12 == 0) goto L_0x01c6
            java.lang.String r12 = r18.nextName()
            int r13 = r12.hashCode()
            r14 = 99
            java.lang.String r15 = "o"
            java.lang.String r1 = "d"
            r16 = -1
            if (r13 == r14) goto L_0x0095
            r14 = 100
            if (r13 == r14) goto L_0x008c
            r14 = 111(0x6f, float:1.56E-43)
            if (r13 == r14) goto L_0x0084
            r14 = 119(0x77, float:1.67E-43)
            if (r13 == r14) goto L_0x007a
            r14 = 3324(0xcfc, float:4.658E-42)
            if (r13 == r14) goto L_0x0070
            r14 = 3447(0xd77, float:4.83E-42)
            if (r13 == r14) goto L_0x0066
            r14 = 3454(0xd7e, float:4.84E-42)
            if (r13 == r14) goto L_0x005c
            r14 = 3487(0xd9f, float:4.886E-42)
            if (r13 == r14) goto L_0x0052
            r14 = 3519(0xdbf, float:4.931E-42)
            if (r13 == r14) goto L_0x0048
            goto L_0x009f
        L_0x0048:
            java.lang.String r13 = "nm"
            boolean r12 = r12.equals(r13)
            if (r12 == 0) goto L_0x009f
            r12 = 0
            goto L_0x00a0
        L_0x0052:
            java.lang.String r13 = "ml"
            boolean r12 = r12.equals(r13)
            if (r12 == 0) goto L_0x009f
            r12 = 6
            goto L_0x00a0
        L_0x005c:
            java.lang.String r13 = "lj"
            boolean r12 = r12.equals(r13)
            if (r12 == 0) goto L_0x009f
            r12 = 5
            goto L_0x00a0
        L_0x0066:
            java.lang.String r13 = "lc"
            boolean r12 = r12.equals(r13)
            if (r12 == 0) goto L_0x009f
            r12 = 4
            goto L_0x00a0
        L_0x0070:
            java.lang.String r13 = "hd"
            boolean r12 = r12.equals(r13)
            if (r12 == 0) goto L_0x009f
            r12 = 7
            goto L_0x00a0
        L_0x007a:
            java.lang.String r13 = "w"
            boolean r12 = r12.equals(r13)
            if (r12 == 0) goto L_0x009f
            r12 = 2
            goto L_0x00a0
        L_0x0084:
            boolean r12 = r12.equals(r15)
            if (r12 == 0) goto L_0x009f
            r12 = 3
            goto L_0x00a0
        L_0x008c:
            boolean r12 = r12.equals(r1)
            if (r12 == 0) goto L_0x009f
            r12 = 8
            goto L_0x00a0
        L_0x0095:
            java.lang.String r13 = "c"
            boolean r12 = r12.equals(r13)
            if (r12 == 0) goto L_0x009f
            r12 = 1
            goto L_0x00a0
        L_0x009f:
            r12 = -1
        L_0x00a0:
            switch(r12) {
                case 0: goto L_0x01bd;
                case 1: goto L_0x01b4;
                case 2: goto L_0x01ab;
                case 3: goto L_0x01a2;
                case 4: goto L_0x0191;
                case 5: goto L_0x0180;
                case 6: goto L_0x0176;
                case 7: goto L_0x016d;
                case 8: goto L_0x00ab;
                default: goto L_0x00a3;
            }
        L_0x00a3:
            r0 = r19
            r1 = 0
            r18.skipValue()
            goto L_0x000f
        L_0x00ab:
            r18.beginArray()
        L_0x00ae:
            boolean r12 = r18.hasNext()
            if (r12 == 0) goto L_0x0151
            r18.beginObject()
            r12 = 0
            r13 = 0
        L_0x00b9:
            boolean r14 = r18.hasNext()
            if (r14 == 0) goto L_0x00fe
            java.lang.String r14 = r18.nextName()
            int r0 = r14.hashCode()
            r17 = r4
            r4 = 110(0x6e, float:1.54E-43)
            if (r0 == r4) goto L_0x00dc
            r4 = 118(0x76, float:1.65E-43)
            if (r0 == r4) goto L_0x00d2
            goto L_0x00e6
        L_0x00d2:
            java.lang.String r0 = "v"
            boolean r0 = r14.equals(r0)
            if (r0 == 0) goto L_0x00e6
            r0 = 1
            goto L_0x00e7
        L_0x00dc:
            java.lang.String r0 = "n"
            boolean r0 = r14.equals(r0)
            if (r0 == 0) goto L_0x00e6
            r0 = 0
            goto L_0x00e7
        L_0x00e6:
            r0 = -1
        L_0x00e7:
            if (r0 == 0) goto L_0x00f6
            r4 = 1
            if (r0 == r4) goto L_0x00f0
            r18.skipValue()
            goto L_0x00fb
        L_0x00f0:
            com.airbnb.lottie.t.j.b r0 = com.airbnb.lottie.p021v.C1339d.m6626c(r18, r19)
            r13 = r0
            goto L_0x00fb
        L_0x00f6:
            java.lang.String r0 = r18.nextString()
            r12 = r0
        L_0x00fb:
            r4 = r17
            goto L_0x00b9
        L_0x00fe:
            r17 = r4
            r18.endObject()
            int r0 = r12.hashCode()
            r4 = 100
            if (r0 == r4) goto L_0x0128
            r14 = 103(0x67, float:1.44E-43)
            if (r0 == r14) goto L_0x011c
            r14 = 111(0x6f, float:1.56E-43)
            if (r0 == r14) goto L_0x0114
            goto L_0x0132
        L_0x0114:
            boolean r0 = r12.equals(r15)
            if (r0 == 0) goto L_0x0132
            r0 = 0
            goto L_0x0133
        L_0x011c:
            r14 = 111(0x6f, float:1.56E-43)
            java.lang.String r0 = "g"
            boolean r0 = r12.equals(r0)
            if (r0 == 0) goto L_0x0132
            r0 = 2
            goto L_0x0133
        L_0x0128:
            r14 = 111(0x6f, float:1.56E-43)
            boolean r0 = r12.equals(r1)
            if (r0 == 0) goto L_0x0132
            r0 = 1
            goto L_0x0133
        L_0x0132:
            r0 = -1
        L_0x0133:
            if (r0 == 0) goto L_0x0147
            r12 = 1
            r4 = 2
            if (r0 == r12) goto L_0x013e
            if (r0 == r4) goto L_0x013e
            r0 = r19
            goto L_0x014d
        L_0x013e:
            r0 = r19
            r0.mo6031a(r12)
            r3.add(r13)
            goto L_0x014d
        L_0x0147:
            r0 = r19
            r4 = 2
            r12 = 1
            r17 = r13
        L_0x014d:
            r4 = r17
            goto L_0x00ae
        L_0x0151:
            r0 = r19
            r17 = r4
            r12 = 1
            r18.endArray()
            int r1 = r3.size()
            if (r1 != r12) goto L_0x0168
            r1 = 0
            java.lang.Object r4 = r3.get(r1)
            r3.add(r4)
            goto L_0x0169
        L_0x0168:
            r1 = 0
        L_0x0169:
            r4 = r17
            goto L_0x000f
        L_0x016d:
            r0 = r19
            r1 = 0
            boolean r11 = r18.nextBoolean()
            goto L_0x000f
        L_0x0176:
            r0 = r19
            r1 = 0
            double r12 = r18.nextDouble()
            float r10 = (float) r12
            goto L_0x000f
        L_0x0180:
            r0 = r19
            r1 = 0
            com.airbnb.lottie.t.k.p$c[] r9 = com.airbnb.lottie.p016t.p018k.C1308p.C1311c.values()
            int r12 = r18.nextInt()
            r13 = 1
            int r12 = r12 - r13
            r9 = r9[r12]
            goto L_0x000f
        L_0x0191:
            r0 = r19
            r1 = 0
            r13 = 1
            com.airbnb.lottie.t.k.p$b[] r8 = com.airbnb.lottie.p016t.p018k.C1308p.C1310b.values()
            int r12 = r18.nextInt()
            int r12 = r12 - r13
            r8 = r8[r12]
            goto L_0x000f
        L_0x01a2:
            r0 = r19
            r1 = 0
            com.airbnb.lottie.t.j.d r6 = com.airbnb.lottie.p021v.C1339d.m6627d(r18, r19)
            goto L_0x000f
        L_0x01ab:
            r0 = r19
            r1 = 0
            com.airbnb.lottie.t.j.b r7 = com.airbnb.lottie.p021v.C1339d.m6626c(r18, r19)
            goto L_0x000f
        L_0x01b4:
            r0 = r19
            r1 = 0
            com.airbnb.lottie.t.j.a r5 = com.airbnb.lottie.p021v.C1339d.m6620a(r18, r19)
            goto L_0x000f
        L_0x01bd:
            r0 = r19
            r1 = 0
            java.lang.String r2 = r18.nextString()
            goto L_0x000f
        L_0x01c6:
            com.airbnb.lottie.t.k.p r12 = new com.airbnb.lottie.t.k.p
            r0 = r12
            r1 = r2
            r2 = r4
            r4 = r5
            r5 = r6
            r6 = r7
            r7 = r8
            r8 = r9
            r9 = r10
            r10 = r11
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.airbnb.lottie.p021v.C1348h0.m6642a(android.util.JsonReader, com.airbnb.lottie.d):com.airbnb.lottie.t.k.p");
    }
}
