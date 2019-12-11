package kotlin.p588j0;

/* renamed from: kotlin.j0.v */
/* compiled from: StringNumberConversions.kt */
class C12831v extends C12830u {
    /* renamed from: a */
    public static Byte m40107a(String str, int i) {
        Integer b = m40108b(str, i);
        if (b != null) {
            int intValue = b.intValue();
            if (intValue >= -128 && intValue <= 127) {
                return Byte.valueOf((byte) intValue);
            }
        }
        return null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x0032 A[LOOP:0: B:18:0x0032->B:28:0x004a, LOOP_START, PHI: r2 r3 
      PHI: (r2v2 int) = (r2v0 int), (r2v4 int) binds: [B:17:0x0030, B:28:0x004a] A[DONT_GENERATE, DONT_INLINE]
      PHI: (r3v2 int) = (r3v1 int), (r3v3 int) binds: [B:17:0x0030, B:28:0x004a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x004f  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x0054  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.Integer m40108b(java.lang.String r9, int r10) {
        /*
            kotlin.p588j0.C12798a.m40011a(r10)
            int r0 = r9.length()
            r1 = 0
            if (r0 != 0) goto L_0x000b
            return r1
        L_0x000b:
            r2 = 0
            char r3 = r9.charAt(r2)
            r4 = 48
            r5 = -2147483647(0xffffffff80000001, float:-1.4E-45)
            r6 = 1
            if (r3 >= r4) goto L_0x002b
            if (r0 != r6) goto L_0x001b
            return r1
        L_0x001b:
            r4 = 45
            if (r3 != r4) goto L_0x0024
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = 1
            r4 = 1
            goto L_0x002d
        L_0x0024:
            r4 = 43
            if (r3 != r4) goto L_0x002a
            r3 = 1
            goto L_0x002c
        L_0x002a:
            return r1
        L_0x002b:
            r3 = 0
        L_0x002c:
            r4 = 0
        L_0x002d:
            int r7 = r5 / r10
            int r0 = r0 - r6
            if (r3 > r0) goto L_0x004d
        L_0x0032:
            char r6 = r9.charAt(r3)
            int r6 = kotlin.p588j0.C12798a.m40010a(r6, r10)
            if (r6 >= 0) goto L_0x003d
            return r1
        L_0x003d:
            if (r2 >= r7) goto L_0x0040
            return r1
        L_0x0040:
            int r2 = r2 * r10
            int r8 = r5 + r6
            if (r2 >= r8) goto L_0x0047
            return r1
        L_0x0047:
            int r2 = r2 - r6
            if (r3 == r0) goto L_0x004d
            int r3 = r3 + 1
            goto L_0x0032
        L_0x004d:
            if (r4 == 0) goto L_0x0054
            java.lang.Integer r9 = java.lang.Integer.valueOf(r2)
            goto L_0x0059
        L_0x0054:
            int r9 = -r2
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)
        L_0x0059:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.p588j0.C12831v.m40108b(java.lang.String, int):java.lang.Integer");
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x003a A[LOOP:0: B:17:0x003a->B:29:0x005d, LOOP_START, PHI: r3 r4 r14 
      PHI: (r3v1 java.lang.Long) = (r3v0 java.lang.Long), (r3v3 java.lang.Long) binds: [B:16:0x0038, B:29:0x005d] A[DONT_GENERATE, DONT_INLINE]
      PHI: (r4v2 int) = (r4v1 int), (r4v4 int) binds: [B:16:0x0038, B:29:0x005d] A[DONT_GENERATE, DONT_INLINE]
      PHI: (r14v2 long) = (r14v0 long), (r14v4 long) binds: [B:16:0x0038, B:29:0x005d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x0063  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0068  */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.Long m40109c(java.lang.String r19, int r20) {
        /*
            r0 = r19
            r1 = r20
            kotlin.p588j0.C12798a.m40011a(r20)
            int r2 = r19.length()
            r3 = 0
            if (r2 != 0) goto L_0x000f
            return r3
        L_0x000f:
            r4 = 0
            char r5 = r0.charAt(r4)
            r6 = 48
            r7 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r9 = 1
            if (r5 >= r6) goto L_0x0031
            if (r2 != r9) goto L_0x0021
            return r3
        L_0x0021:
            r6 = 45
            if (r5 != r6) goto L_0x002a
            r7 = -9223372036854775808
            r4 = 1
            r5 = 1
            goto L_0x0032
        L_0x002a:
            r6 = 43
            if (r5 != r6) goto L_0x0030
            r4 = 1
            goto L_0x0031
        L_0x0030:
            return r3
        L_0x0031:
            r5 = 0
        L_0x0032:
            long r10 = (long) r1
            long r12 = r7 / r10
            r14 = 0
            int r2 = r2 - r9
            if (r4 > r2) goto L_0x0061
        L_0x003a:
            char r6 = r0.charAt(r4)
            int r6 = kotlin.p588j0.C12798a.m40010a(r6, r1)
            if (r6 >= 0) goto L_0x0045
            return r3
        L_0x0045:
            int r9 = (r14 > r12 ? 1 : (r14 == r12 ? 0 : -1))
            if (r9 >= 0) goto L_0x004a
            return r3
        L_0x004a:
            long r14 = r14 * r10
            r16 = r4
            long r3 = (long) r6
            long r17 = r7 + r3
            int r6 = (r14 > r17 ? 1 : (r14 == r17 ? 0 : -1))
            if (r6 >= 0) goto L_0x0057
            r6 = 0
            return r6
        L_0x0057:
            r6 = 0
            long r14 = r14 - r3
            r4 = r16
            if (r4 == r2) goto L_0x0061
            int r4 = r4 + 1
            r3 = r6
            goto L_0x003a
        L_0x0061:
            if (r5 == 0) goto L_0x0068
            java.lang.Long r0 = java.lang.Long.valueOf(r14)
            goto L_0x006d
        L_0x0068:
            long r0 = -r14
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
        L_0x006d:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.p588j0.C12831v.m40109c(java.lang.String, int):java.lang.Long");
    }

    /* renamed from: d */
    public static Short m40111d(String str, int i) {
        Integer b = m40108b(str, i);
        if (b != null) {
            int intValue = b.intValue();
            if (intValue >= -32768 && intValue <= 32767) {
                return Short.valueOf((short) intValue);
            }
        }
        return null;
    }

    /* renamed from: e */
    public static Long m40112e(String str) {
        return m40109c(str, 10);
    }

    /* renamed from: d */
    public static Integer m40110d(String str) {
        return m40108b(str, 10);
    }
}
