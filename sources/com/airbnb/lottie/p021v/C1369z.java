package com.airbnb.lottie.p021v;

/* renamed from: com.airbnb.lottie.v.z */
/* compiled from: PolystarShapeParser */
class C1369z {
    /* JADX WARNING: Removed duplicated region for block: B:55:0x00b2  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x00b7  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x00be  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x00c5  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x00cc  */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x00d3  */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x00da  */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x00e1  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x00e8  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x00ef  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x00fa  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static com.airbnb.lottie.p016t.p018k.C1300i m6687a(android.util.JsonReader r16, com.airbnb.lottie.C1182d r17) throws java.io.IOException {
        /*
            r0 = r16
            r1 = r17
            r2 = 0
            r3 = 0
            r5 = r3
            r6 = r5
            r7 = r6
            r8 = r7
            r9 = r8
            r10 = r9
            r11 = r10
            r12 = r11
            r13 = r12
            r14 = 0
        L_0x0010:
            boolean r3 = r16.hasNext()
            if (r3 == 0) goto L_0x0101
            java.lang.String r3 = r16.nextName()
            int r15 = r3.hashCode()
            r4 = 112(0x70, float:1.57E-43)
            if (r15 == r4) goto L_0x00a4
            r4 = 114(0x72, float:1.6E-43)
            if (r15 == r4) goto L_0x009a
            r4 = 3324(0xcfc, float:4.658E-42)
            if (r15 == r4) goto L_0x008f
            r4 = 3519(0xdbf, float:4.931E-42)
            if (r15 == r4) goto L_0x0085
            r4 = 3588(0xe04, float:5.028E-42)
            if (r15 == r4) goto L_0x007b
            r4 = 3686(0xe66, float:5.165E-42)
            if (r15 == r4) goto L_0x0071
            r4 = 3369(0xd29, float:4.721E-42)
            if (r15 == r4) goto L_0x0067
            r4 = 3370(0xd2a, float:4.722E-42)
            if (r15 == r4) goto L_0x005c
            r4 = 3555(0xde3, float:4.982E-42)
            if (r15 == r4) goto L_0x0052
            r4 = 3556(0xde4, float:4.983E-42)
            if (r15 == r4) goto L_0x0048
            goto L_0x00ae
        L_0x0048:
            java.lang.String r4 = "os"
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L_0x00ae
            r3 = 6
            goto L_0x00af
        L_0x0052:
            java.lang.String r4 = "or"
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L_0x00ae
            r3 = 5
            goto L_0x00af
        L_0x005c:
            java.lang.String r4 = "is"
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L_0x00ae
            r3 = 8
            goto L_0x00af
        L_0x0067:
            java.lang.String r4 = "ir"
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L_0x00ae
            r3 = 7
            goto L_0x00af
        L_0x0071:
            java.lang.String r4 = "sy"
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L_0x00ae
            r3 = 1
            goto L_0x00af
        L_0x007b:
            java.lang.String r4 = "pt"
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L_0x00ae
            r3 = 2
            goto L_0x00af
        L_0x0085:
            java.lang.String r4 = "nm"
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L_0x00ae
            r3 = 0
            goto L_0x00af
        L_0x008f:
            java.lang.String r4 = "hd"
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L_0x00ae
            r3 = 9
            goto L_0x00af
        L_0x009a:
            java.lang.String r4 = "r"
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L_0x00ae
            r3 = 4
            goto L_0x00af
        L_0x00a4:
            java.lang.String r4 = "p"
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L_0x00ae
            r3 = 3
            goto L_0x00af
        L_0x00ae:
            r3 = -1
        L_0x00af:
            switch(r3) {
                case 0: goto L_0x00fa;
                case 1: goto L_0x00ef;
                case 2: goto L_0x00e8;
                case 3: goto L_0x00e1;
                case 4: goto L_0x00da;
                case 5: goto L_0x00d3;
                case 6: goto L_0x00cc;
                case 7: goto L_0x00c5;
                case 8: goto L_0x00be;
                case 9: goto L_0x00b7;
                default: goto L_0x00b2;
            }
        L_0x00b2:
            r16.skipValue()
            goto L_0x0010
        L_0x00b7:
            boolean r3 = r16.nextBoolean()
            r14 = r3
            goto L_0x0010
        L_0x00be:
            com.airbnb.lottie.t.j.b r3 = com.airbnb.lottie.p021v.C1339d.m6621a(r0, r1, r2)
            r12 = r3
            goto L_0x0010
        L_0x00c5:
            com.airbnb.lottie.t.j.b r3 = com.airbnb.lottie.p021v.C1339d.m6626c(r16, r17)
            r10 = r3
            goto L_0x0010
        L_0x00cc:
            com.airbnb.lottie.t.j.b r3 = com.airbnb.lottie.p021v.C1339d.m6621a(r0, r1, r2)
            r13 = r3
            goto L_0x0010
        L_0x00d3:
            com.airbnb.lottie.t.j.b r3 = com.airbnb.lottie.p021v.C1339d.m6626c(r16, r17)
            r11 = r3
            goto L_0x0010
        L_0x00da:
            com.airbnb.lottie.t.j.b r3 = com.airbnb.lottie.p021v.C1339d.m6621a(r0, r1, r2)
            r9 = r3
            goto L_0x0010
        L_0x00e1:
            com.airbnb.lottie.t.j.m r3 = com.airbnb.lottie.p021v.C1333a.m6606b(r16, r17)
            r8 = r3
            goto L_0x0010
        L_0x00e8:
            com.airbnb.lottie.t.j.b r3 = com.airbnb.lottie.p021v.C1339d.m6621a(r0, r1, r2)
            r7 = r3
            goto L_0x0010
        L_0x00ef:
            int r3 = r16.nextInt()
            com.airbnb.lottie.t.k.i$a r3 = com.airbnb.lottie.p016t.p018k.C1300i.C1301a.m6449a(r3)
            r6 = r3
            goto L_0x0010
        L_0x00fa:
            java.lang.String r3 = r16.nextString()
            r5 = r3
            goto L_0x0010
        L_0x0101:
            com.airbnb.lottie.t.k.i r0 = new com.airbnb.lottie.t.k.i
            r4 = r0
            r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.airbnb.lottie.p021v.C1369z.m6687a(android.util.JsonReader, com.airbnb.lottie.d):com.airbnb.lottie.t.k.i");
    }
}
