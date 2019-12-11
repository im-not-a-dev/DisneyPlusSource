package p163g.p449j.p450a.p451a.p457d.p463f;

import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.util.List;
import java.util.Vector;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: g.j.a.a.d.f.o */
/* compiled from: com.google.firebase:firebase-iid@@19.0.1 */
final class C11017o {

    /* renamed from: a */
    private final ConcurrentHashMap<C11016n, List<Throwable>> f26037a = new ConcurrentHashMap<>(16, 0.75f, 10);

    /* renamed from: b */
    private final ReferenceQueue<Throwable> f26038b = new ReferenceQueue<>();

    C11017o() {
    }

    /* renamed from: a */
    public final List<Throwable> mo28247a(Throwable th, boolean z) {
        Reference poll = this.f26038b.poll();
        while (poll != null) {
            this.f26037a.remove(poll);
            poll = this.f26038b.poll();
        }
        List<Throwable> list = (List) this.f26037a.get(new C11016n(th, null));
        if (list != null) {
            return list;
        }
        Vector vector = new Vector(2);
        List<Throwable> list2 = (List) this.f26037a.putIfAbsent(new C11016n(th, this.f26038b), vector);
        return list2 == null ? vector : list2;
    }
}
