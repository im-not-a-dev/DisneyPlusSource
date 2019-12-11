package p163g.p441i.p442a.p443a.p448u;

import java.lang.ref.ReferenceQueue;
import java.lang.ref.SoftReference;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: g.i.a.a.u.g */
/* compiled from: ThreadLocalBufferManager */
class C10940g {

    /* renamed from: a */
    private final Map<SoftReference<C10934a>, Boolean> f25991a = new ConcurrentHashMap();

    /* renamed from: b */
    private final ReferenceQueue<C10934a> f25992b = new ReferenceQueue<>();

    /* renamed from: g.i.a.a.u.g$a */
    /* compiled from: ThreadLocalBufferManager */
    private static final class C10941a {

        /* renamed from: a */
        static final C10940g f25993a = new C10940g();
    }

    C10940g() {
    }

    /* renamed from: a */
    public static C10940g m34632a() {
        return C10941a.f25993a;
    }

    /* renamed from: b */
    private void m34633b() {
        while (true) {
            SoftReference softReference = (SoftReference) this.f25992b.poll();
            if (softReference != null) {
                this.f25991a.remove(softReference);
            } else {
                return;
            }
        }
    }

    /* renamed from: a */
    public SoftReference<C10934a> mo28190a(C10934a aVar) {
        SoftReference<C10934a> softReference = new SoftReference<>(aVar, this.f25992b);
        this.f25991a.put(softReference, Boolean.valueOf(true));
        m34633b();
        return softReference;
    }
}
