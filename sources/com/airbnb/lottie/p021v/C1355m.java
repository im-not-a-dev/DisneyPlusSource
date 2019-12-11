package com.airbnb.lottie.p021v;

/* renamed from: com.airbnb.lottie.v.m */
/* compiled from: GradientFillParser */
class C1355m {
    /* JADX WARNING: Removed duplicated region for block: B:40:0x0088  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x0090  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x009a  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x00ab  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x00b5  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x00bf  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x00d0  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x00da  */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x010c  */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x011d  */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x012d  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static com.airbnb.lottie.p016t.p018k.C1293d m6653a(android.util.JsonReader r15, com.airbnb.lottie.C1182d r16) throws java.io.IOException {
        /*
            android.graphics.Path$FillType r0 = android.graphics.Path.FillType.WINDING
            r1 = 0
            r2 = 0
            r6 = r0
            r4 = r2
            r5 = r4
            r7 = r5
            r8 = r7
            r9 = r8
            r10 = r9
            r13 = 0
        L_0x000c:
            boolean r0 = r15.hasNext()
            if (r0 == 0) goto L_0x0137
            java.lang.String r0 = r15.nextName()
            int r2 = r0.hashCode()
            r3 = 101(0x65, float:1.42E-43)
            r11 = -1
            r12 = 1
            if (r2 == r3) goto L_0x007a
            r3 = 103(0x67, float:1.44E-43)
            if (r2 == r3) goto L_0x0070
            r3 = 111(0x6f, float:1.56E-43)
            if (r2 == r3) goto L_0x0066
            r3 = 3324(0xcfc, float:4.658E-42)
            if (r2 == r3) goto L_0x005c
            r3 = 3519(0xdbf, float:4.931E-42)
            if (r2 == r3) goto L_0x0052
            switch(r2) {
                case 114: goto L_0x0048;
                case 115: goto L_0x003e;
                case 116: goto L_0x0034;
                default: goto L_0x0033;
            }
        L_0x0033:
            goto L_0x0084
        L_0x0034:
            java.lang.String r2 = "t"
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L_0x0084
            r0 = 3
            goto L_0x0085
        L_0x003e:
            java.lang.String r2 = "s"
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L_0x0084
            r0 = 4
            goto L_0x0085
        L_0x0048:
            java.lang.String r2 = "r"
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L_0x0084
            r0 = 6
            goto L_0x0085
        L_0x0052:
            java.lang.String r2 = "nm"
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L_0x0084
            r0 = 0
            goto L_0x0085
        L_0x005c:
            java.lang.String r2 = "hd"
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L_0x0084
            r0 = 7
            goto L_0x0085
        L_0x0066:
            java.lang.String r2 = "o"
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L_0x0084
            r0 = 2
            goto L_0x0085
        L_0x0070:
            java.lang.String r2 = "g"
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L_0x0084
            r0 = 1
            goto L_0x0085
        L_0x007a:
            java.lang.String r2 = "e"
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L_0x0084
            r0 = 5
            goto L_0x0085
        L_0x0084:
            r0 = -1
        L_0x0085:
            switch(r0) {
                case 0: goto L_0x012d;
                case 1: goto L_0x00da;
                case 2: goto L_0x00d0;
                case 3: goto L_0x00bf;
                case 4: goto L_0x00b5;
                case 5: goto L_0x00ab;
                case 6: goto L_0x009a;
                case 7: goto L_0x0090;
                default: goto L_0x0088;
            }
        L_0x0088:
            r2 = r15
            r3 = r16
            r15.skipValue()
            goto L_0x000c
        L_0x0090:
            boolean r0 = r15.nextBoolean()
            r2 = r15
            r3 = r16
            r13 = r0
            goto L_0x000c
        L_0x009a:
            int r0 = r15.nextInt()
            if (r0 != r12) goto L_0x00a3
            android.graphics.Path$FillType r0 = android.graphics.Path.FillType.WINDING
            goto L_0x00a5
        L_0x00a3:
            android.graphics.Path$FillType r0 = android.graphics.Path.FillType.EVEN_ODD
        L_0x00a5:
            r2 = r15
            r3 = r16
            r6 = r0
            goto L_0x000c
        L_0x00ab:
            com.airbnb.lottie.t.j.f r0 = com.airbnb.lottie.p021v.C1339d.m6628e(r15, r16)
            r2 = r15
            r3 = r16
            r10 = r0
            goto L_0x000c
        L_0x00b5:
            com.airbnb.lottie.t.j.f r0 = com.airbnb.lottie.p021v.C1339d.m6628e(r15, r16)
            r2 = r15
            r3 = r16
            r9 = r0
            goto L_0x000c
        L_0x00bf:
            int r0 = r15.nextInt()
            if (r0 != r12) goto L_0x00c8
            com.airbnb.lottie.t.k.f r0 = com.airbnb.lottie.p016t.p018k.C1295f.LINEAR
            goto L_0x00ca
        L_0x00c8:
            com.airbnb.lottie.t.k.f r0 = com.airbnb.lottie.p016t.p018k.C1295f.RADIAL
        L_0x00ca:
            r2 = r15
            r3 = r16
            r5 = r0
            goto L_0x000c
        L_0x00d0:
            com.airbnb.lottie.t.j.d r0 = com.airbnb.lottie.p021v.C1339d.m6627d(r15, r16)
            r2 = r15
            r3 = r16
            r8 = r0
            goto L_0x000c
        L_0x00da:
            r15.beginObject()
            r0 = -1
        L_0x00de:
            boolean r2 = r15.hasNext()
            if (r2 == 0) goto L_0x0125
            java.lang.String r2 = r15.nextName()
            int r3 = r2.hashCode()
            r14 = 107(0x6b, float:1.5E-43)
            if (r3 == r14) goto L_0x00ff
            r14 = 112(0x70, float:1.57E-43)
            if (r3 == r14) goto L_0x00f5
            goto L_0x0109
        L_0x00f5:
            java.lang.String r3 = "p"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x0109
            r2 = 0
            goto L_0x010a
        L_0x00ff:
            java.lang.String r3 = "k"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x0109
            r2 = 1
            goto L_0x010a
        L_0x0109:
            r2 = -1
        L_0x010a:
            if (r2 == 0) goto L_0x011d
            if (r2 == r12) goto L_0x0115
            r15.skipValue()
            r2 = r15
            r3 = r16
            goto L_0x00de
        L_0x0115:
            r2 = r15
            r3 = r16
            com.airbnb.lottie.t.j.c r7 = com.airbnb.lottie.p021v.C1339d.m6622a(r15, r3, r0)
            goto L_0x00de
        L_0x011d:
            r2 = r15
            r3 = r16
            int r0 = r15.nextInt()
            goto L_0x00de
        L_0x0125:
            r2 = r15
            r3 = r16
            r15.endObject()
            goto L_0x000c
        L_0x012d:
            r2 = r15
            r3 = r16
            java.lang.String r0 = r15.nextString()
            r4 = r0
            goto L_0x000c
        L_0x0137:
            com.airbnb.lottie.t.k.d r0 = new com.airbnb.lottie.t.k.d
            r11 = 0
            r12 = 0
            r3 = r0
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.airbnb.lottie.p021v.C1355m.m6653a(android.util.JsonReader, com.airbnb.lottie.d):com.airbnb.lottie.t.k.d");
    }
}
