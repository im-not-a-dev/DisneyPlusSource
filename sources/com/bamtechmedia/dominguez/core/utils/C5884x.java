package com.bamtechmedia.dominguez.core.utils;

import kotlin.jvm.functions.C12853n;
import kotlin.jvm.functions.Function2;

/* renamed from: com.bamtechmedia.dominguez.core.utils.x */
/* compiled from: Preconditions.kt */
public final class C5884x {
    /* renamed from: a */
    public static /* synthetic */ Object m18951a(Object obj, String str, int i, Object obj2) {
        if ((i & 1) != 0) {
            str = "Unexpected null reference.";
        }
        m18950a(obj, str);
        return obj;
    }

    /* renamed from: a */
    public static final <T> T m18950a(T t, String str) {
        if (t != null) {
            return t;
        }
        throw new AssertionError(str);
    }

    /* renamed from: a */
    public static final <T1, T2, R> R m18949a(T1 t1, T2 t2, Function2<? super T1, ? super T2, ? extends R> function2) {
        if (t1 == null || t2 == null) {
            return null;
        }
        return function2.invoke(t1, t2);
    }

    /* renamed from: a */
    public static final <T1, T2, T3, R> R m18948a(T1 t1, T2 t2, T3 t3, C12853n<? super T1, ? super T2, ? super T3, ? extends R> nVar) {
        if (t1 == null || t2 == null || t3 == null) {
            return null;
        }
        return nVar.invoke(t1, t2, t3);
    }
}
