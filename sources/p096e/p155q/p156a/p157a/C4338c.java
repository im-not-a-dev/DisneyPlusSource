package p096e.p155q.p156a.p157a;

import java.util.Arrays;

/* renamed from: e.q.a.a.c */
/* compiled from: CollectionUtils */
public class C4338c {
    /* renamed from: a */
    public static <T> T[] m14968a(T[] tArr, T[]... tArr2) {
        int length = tArr.length;
        for (T[] length2 : tArr2) {
            length += length2.length;
        }
        T[] copyOf = Arrays.copyOf(tArr, length);
        int length3 = tArr.length;
        int i = length3;
        for (T[] tArr3 : tArr2) {
            System.arraycopy(tArr3, 0, copyOf, i, tArr3.length);
            i += tArr3.length;
        }
        return copyOf;
    }
}
