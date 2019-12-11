package com.google.android.gms.measurement.internal;

import android.os.Bundle;

/* renamed from: com.google.android.gms.measurement.internal.m5 */
public final class C10123m5 {
    /* renamed from: a */
    public static void m31569a(Bundle bundle, Object obj) {
        String str = "value";
        if (obj instanceof Double) {
            bundle.putDouble(str, ((Double) obj).doubleValue());
        } else if (obj instanceof Long) {
            bundle.putLong(str, ((Long) obj).longValue());
        } else {
            bundle.putString(str, obj.toString());
        }
    }

    /* renamed from: a */
    public static <T> T m31568a(Bundle bundle, String str, Class<T> cls, T t) {
        T t2 = bundle.get(str);
        if (t2 == null) {
            return t;
        }
        if (cls.isAssignableFrom(t2.getClass())) {
            return t2;
        }
        throw new IllegalStateException(String.format("Invalid conditional user property field type. '%s' expected [%s] but was [%s]", new Object[]{str, cls.getCanonicalName(), t2.getClass().getCanonicalName()}));
    }
}
