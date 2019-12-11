package p520io.reactivex.p531y.p544g;

import java.util.concurrent.ThreadFactory;
import p520io.reactivex.C11969r;
import p520io.reactivex.C11969r.C11972c;

/* renamed from: io.reactivex.y.g.g */
/* compiled from: NewThreadScheduler */
public final class C12510g extends C11969r {

    /* renamed from: c */
    private static final C12513j f28997c = new C12513j("RxNewThreadScheduler", Math.max(1, Math.min(10, Integer.getInteger("rx2.newthread-priority", 5).intValue())));

    /* renamed from: b */
    final ThreadFactory f28998b;

    public C12510g() {
        this(f28997c);
    }

    /* renamed from: a */
    public C11972c mo30292a() {
        return new C12511h(this.f28998b);
    }

    public C12510g(ThreadFactory threadFactory) {
        this.f28998b = threadFactory;
    }
}
