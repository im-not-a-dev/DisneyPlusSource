package p096e.p121h.p122j.p124d;

import java.lang.reflect.Array;

/* renamed from: e.h.j.d.e */
/* compiled from: GrowingArrayUtils */
final class C4038e {
    /* renamed from: a */
    public static int m13844a(int i) {
        if (i <= 4) {
            return 8;
        }
        return i * 2;
    }

    /* renamed from: a */
    public static <T> T[] m13846a(T[] tArr, int i, T t) {
        if (i + 1 > tArr.length) {
            T[] tArr2 = (Object[]) Array.newInstance(tArr.getClass().getComponentType(), m13844a(i));
            System.arraycopy(tArr, 0, tArr2, 0, i);
            tArr = tArr2;
        }
        tArr[i] = t;
        return tArr;
    }

    /* renamed from: a */
    public static int[] m13845a(int[] iArr, int i, int i2) {
        if (i + 1 > iArr.length) {
            int[] iArr2 = new int[m13844a(i)];
            System.arraycopy(iArr, 0, iArr2, 0, i);
            iArr = iArr2;
        }
        iArr[i] = i2;
        return iArr;
    }
}
