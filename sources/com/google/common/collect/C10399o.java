package com.google.common.collect;

import java.lang.reflect.Array;
import java.util.Arrays;

/* renamed from: com.google.common.collect.o */
/* compiled from: Platform */
final class C10399o {
    /* renamed from: a */
    static <T> T[] m32889a(T[] tArr, int i) {
        return (Object[]) Array.newInstance(tArr.getClass().getComponentType(), i);
    }

    /* renamed from: a */
    static <T> T[] m32890a(Object[] objArr, int i, int i2, T[] tArr) {
        return Arrays.copyOfRange(objArr, i, i2, tArr.getClass());
    }
}
