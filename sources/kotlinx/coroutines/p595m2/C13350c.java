package kotlinx.coroutines.p595m2;

import kotlinx.coroutines.C13418z;
import kotlinx.coroutines.internal.C13280r;

/* renamed from: kotlinx.coroutines.m2.c */
/* compiled from: Dispatcher.kt */
public final class C13350c extends C13351d {

    /* renamed from: Y */
    private static final C13418z f29819Y;

    /* renamed from: Z */
    public static final C13350c f29820Z;

    static {
        C13350c cVar = new C13350c();
        f29820Z = cVar;
        f29819Y = cVar.mo34544b(C13282t.m40831a("kotlinx.coroutines.io.parallelism", C12762h.m39913a(64, C13280r.m40821a()), 0, 0, 12, (Object) null));
    }

    private C13350c() {
        super(0, 0, null, 7, null);
    }

    public void close() {
        throw new UnsupportedOperationException("DefaultDispatcher cannot be closed");
    }

    /* renamed from: g */
    public final C13418z mo34542g() {
        return f29819Y;
    }

    public String toString() {
        return "DefaultDispatcher";
    }
}
