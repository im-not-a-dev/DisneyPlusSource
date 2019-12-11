package p163g.p503n.p504a;

import java.util.concurrent.atomic.AtomicLong;

/* renamed from: g.n.a.f */
/* compiled from: AutoDisposeBackpressureHelper */
final class C11805f {
    /* renamed from: a */
    private static long m37951a(long j, long j2) {
        long j3 = j + j2;
        if (j3 < 0) {
            return Long.MAX_VALUE;
        }
        return j3;
    }

    /* renamed from: a */
    static long m37952a(AtomicLong atomicLong, long j) {
        long j2;
        do {
            j2 = atomicLong.get();
            if (j2 == Long.MAX_VALUE) {
                return Long.MAX_VALUE;
            }
        } while (!atomicLong.compareAndSet(j2, m37951a(j2, j)));
        return j2;
    }
}
