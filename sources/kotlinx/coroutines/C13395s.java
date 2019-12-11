package kotlinx.coroutines;

import kotlin.C12900n;
import kotlin.C12903o;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: kotlinx.coroutines.s */
/* compiled from: CompletedExceptionally.kt */
public final class C13395s {
    /* renamed from: a */
    public static final <T> Object m41218a(Object obj) {
        if (C12900n.m40239d(obj)) {
            C12903o.m40241a(obj);
            return obj;
        }
        Throwable b = C12900n.m40237b(obj);
        if (b != null) {
            return new C13389r(b, false, 2, null);
        }
        Intrinsics.throwNpe();
        throw null;
    }
}
