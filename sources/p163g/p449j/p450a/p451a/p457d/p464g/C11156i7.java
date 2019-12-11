package p163g.p449j.p450a.p451a.p457d.p464g;

/* renamed from: g.j.a.a.d.g.i7 */
final class C11156i7 {
    /* access modifiers changed from: private */
    /* renamed from: a */
    public static void m35330a(byte b, char[] cArr, int i) {
        cArr[i] = (char) b;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static boolean m35331a(byte b) {
        return b >= 0;
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static boolean m35336b(byte b) {
        return b < -32;
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public static boolean m35337c(byte b) {
        return b < -16;
    }

    /* renamed from: d */
    private static boolean m35338d(byte b) {
        return b > -65;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static void m35329a(byte b, byte b2, char[] cArr, int i) throws C11258p4 {
        if (b < -62 || m35338d(b2)) {
            throw C11258p4.m35938i();
        }
        cArr[i] = (char) (((b & 31) << 6) | (b2 & 63));
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static void m35328a(byte b, byte b2, byte b3, char[] cArr, int i) throws C11258p4 {
        if (m35338d(b2) || ((b == -32 && b2 < -96) || ((b == -19 && b2 >= -96) || m35338d(b3)))) {
            throw C11258p4.m35938i();
        }
        cArr[i] = (char) (((b & 15) << 12) | ((b2 & 63) << 6) | (b3 & 63));
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static void m35327a(byte b, byte b2, byte b3, byte b4, char[] cArr, int i) throws C11258p4 {
        if (m35338d(b2) || (((b << 28) + (b2 + 112)) >> 30) != 0 || m35338d(b3) || m35338d(b4)) {
            throw C11258p4.m35938i();
        }
        byte b5 = ((b & 7) << 18) | ((b2 & 63) << 12) | ((b3 & 63) << 6) | (b4 & 63);
        cArr[i] = (char) ((b5 >>> 10) + 55232);
        cArr[i + 1] = (char) ((b5 & 1023) + 56320);
    }
}
