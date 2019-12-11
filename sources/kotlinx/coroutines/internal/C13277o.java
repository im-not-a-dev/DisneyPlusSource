package kotlinx.coroutines.internal;

import kotlin.p573a0.C12683c;
import kotlinx.coroutines.C13210a;

/* renamed from: kotlinx.coroutines.internal.o */
/* compiled from: Scopes.kt */
public final class C13277o {
    /* renamed from: a */
    public static final Throwable m40807a(C13210a<?> aVar, Throwable th) {
        if (!(aVar instanceof C13276n)) {
            aVar = null;
        }
        C13276n nVar = (C13276n) aVar;
        if (nVar != null) {
            C12683c<T> cVar = nVar.f29710W;
            if (cVar != null) {
                return C13278p.m40811a(th, cVar);
            }
        }
        return th;
    }
}
