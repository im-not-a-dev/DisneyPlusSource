package p163g.p503n.p504a;

import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import org.reactivestreams.C14314c;
import p520io.reactivex.p523c0.C11915a;

/* renamed from: g.n.a.u */
/* compiled from: AutoSubscriptionHelper */
enum C11838u implements C14314c {
    CANCELLED;

    /* renamed from: a */
    static void m37976a() {
        C11915a.m38466b((Throwable) new IllegalStateException("Subscription already set!"));
    }

    /* renamed from: b */
    public void mo29946b(long j) {
    }

    public void cancel() {
    }

    /* renamed from: a */
    static boolean m37978a(long j) {
        if (j > 0) {
            return true;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("n > 0 required but it was ");
        sb.append(j);
        C11915a.m38466b((Throwable) new IllegalArgumentException(sb.toString()));
        return false;
    }

    /* renamed from: a */
    static boolean m37981a(AtomicReference<C14314c> atomicReference, C14314c cVar) {
        C11827o.m37973a(cVar, "s is null");
        if (atomicReference.compareAndSet(null, cVar)) {
            return true;
        }
        cVar.cancel();
        if (atomicReference.get() != CANCELLED) {
            m37976a();
        }
        return false;
    }

    /* renamed from: a */
    static boolean m37979a(AtomicReference<C14314c> atomicReference) {
        C14314c cVar = (C14314c) atomicReference.get();
        C11838u uVar = CANCELLED;
        if (cVar != uVar) {
            C14314c cVar2 = (C14314c) atomicReference.getAndSet(uVar);
            if (cVar2 != CANCELLED) {
                if (cVar2 != null) {
                    cVar2.cancel();
                }
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    static boolean m37980a(AtomicReference<C14314c> atomicReference, AtomicLong atomicLong, C14314c cVar) {
        if (!m37981a(atomicReference, cVar)) {
            return false;
        }
        long andSet = atomicLong.getAndSet(0);
        if (andSet != 0) {
            cVar.mo29946b(andSet);
        }
        return true;
    }

    /* renamed from: a */
    static void m37977a(AtomicReference<C14314c> atomicReference, AtomicLong atomicLong, long j) {
        C14314c cVar = (C14314c) atomicReference.get();
        if (cVar != null) {
            cVar.mo29946b(j);
        } else if (m37978a(j)) {
            C11805f.m37952a(atomicLong, j);
            C14314c cVar2 = (C14314c) atomicReference.get();
            if (cVar2 != null) {
                long andSet = atomicLong.getAndSet(0);
                if (andSet != 0) {
                    cVar2.mo29946b(andSet);
                }
            }
        }
    }
}
