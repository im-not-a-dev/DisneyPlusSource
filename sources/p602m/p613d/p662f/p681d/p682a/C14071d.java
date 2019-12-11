package p602m.p613d.p662f.p681d.p682a;

/* renamed from: m.d.f.d.a.d */
/* compiled from: IntUtils */
public final class C14071d {
    /* renamed from: a */
    public static boolean m44401a(int[] iArr, int[] iArr2) {
        if (iArr.length != iArr2.length) {
            return false;
        }
        boolean z = true;
        for (int length = iArr.length - 1; length >= 0; length--) {
            z &= iArr[length] == iArr2[length];
        }
        return z;
    }

    /* renamed from: a */
    public static int[] m44402a(int[] iArr) {
        int[] iArr2 = new int[iArr.length];
        System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
        return iArr2;
    }
}
