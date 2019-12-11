package com.google.common.collect;

/* renamed from: com.google.common.collect.m */
/* compiled from: ObjectArrays */
public final class C10397m {
    /* renamed from: a */
    static Object[] m32884a(Object... objArr) {
        m32885a(objArr, objArr.length);
        return objArr;
    }

    /* renamed from: b */
    public static <T> T[] m32886b(T[] tArr, int i) {
        return C10399o.m32889a(tArr, i);
    }

    /* renamed from: a */
    static Object[] m32885a(Object[] objArr, int i) {
        for (int i2 = 0; i2 < i; i2++) {
            m32883a(objArr[i2], i2);
        }
        return objArr;
    }

    /* renamed from: a */
    static Object m32883a(Object obj, int i) {
        if (obj != null) {
            return obj;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("at index ");
        sb.append(i);
        throw new NullPointerException(sb.toString());
    }
}
