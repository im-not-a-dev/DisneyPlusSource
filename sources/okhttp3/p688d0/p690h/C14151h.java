package okhttp3.p688d0.p690h;

import java.util.LinkedHashSet;
import java.util.Set;
import okhttp3.C14266z;

/* renamed from: okhttp3.d0.h.h */
/* compiled from: RouteDatabase */
final class C14151h {

    /* renamed from: a */
    private final Set<C14266z> f31455a = new LinkedHashSet();

    C14151h() {
    }

    /* renamed from: a */
    public synchronized void mo35976a(C14266z zVar) {
        this.f31455a.remove(zVar);
    }

    /* renamed from: b */
    public synchronized void mo35977b(C14266z zVar) {
        this.f31455a.add(zVar);
    }

    /* renamed from: c */
    public synchronized boolean mo35978c(C14266z zVar) {
        return this.f31455a.contains(zVar);
    }
}
