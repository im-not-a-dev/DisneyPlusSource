package p096e.p121h.p122j.p124d;

import android.content.res.TypedArray;

/* renamed from: e.h.j.d.g */
/* compiled from: TypedArray.kt */
public final class C4043g {
    /* renamed from: a */
    private static final void m13857a(TypedArray typedArray, int i) {
        if (!typedArray.hasValue(i)) {
            throw new IllegalArgumentException("Attribute not defined in set.");
        }
    }

    /* renamed from: b */
    public static final int m13858b(TypedArray typedArray, int i) {
        m13857a(typedArray, i);
        return typedArray.getResourceId(i, 0);
    }
}
