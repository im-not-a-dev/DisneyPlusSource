package com.google.common.base;

import java.util.Arrays;

/* renamed from: com.google.common.base.e */
/* compiled from: Objects */
public final class C10373e extends C10367b {
    /* renamed from: a */
    public static boolean m32807a(Object obj, Object obj2) {
        return obj == obj2 || (obj != null && obj.equals(obj2));
    }

    /* renamed from: a */
    public static int m32806a(Object... objArr) {
        return Arrays.hashCode(objArr);
    }
}
