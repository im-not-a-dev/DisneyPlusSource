package com.google.android.gms.common.util;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* renamed from: com.google.android.gms.common.util.f */
public final class C9942f {
    @Deprecated
    /* renamed from: a */
    public static <T> List<T> m30972a() {
        return Collections.emptyList();
    }

    @Deprecated
    /* renamed from: a */
    public static <T> List<T> m30973a(T t) {
        return Collections.singletonList(t);
    }

    @Deprecated
    /* renamed from: a */
    public static <T> List<T> m30974a(T... tArr) {
        int length = tArr.length;
        if (length == 0) {
            return m30972a();
        }
        if (length != 1) {
            return Collections.unmodifiableList(Arrays.asList(tArr));
        }
        return m30973a(tArr[0]);
    }
}
