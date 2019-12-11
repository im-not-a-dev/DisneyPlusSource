package p520io.reactivex.p531y.p546i;

import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import org.reactivestreams.C14314c;
import p520io.reactivex.p523c0.C11915a;
import p520io.reactivex.p530x.C12006e;
import p520io.reactivex.p531y.p533b.C12036b;
import p520io.reactivex.p531y.p547j.C12544d;

/* renamed from: io.reactivex.y.i.g */
/* compiled from: SubscriptionHelper */
public enum C12539g implements C14314c {
    CANCELLED;

    /* renamed from: a */
    public static boolean m39329a(C14314c cVar, C14314c cVar2) {
        if (cVar2 == null) {
            C11915a.m38466b((Throwable) new NullPointerException("next is null"));
            return false;
        } else if (cVar == null) {
            return true;
        } else {
            cVar2.cancel();
            m39323a();
            return false;
        }
    }

    /* renamed from: c */
    public static boolean m39330c(long j) {
        if (j > 0) {
            return true;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("n > 0 required but it was ");
        sb.append(j);
        C11915a.m38466b((Throwable) new IllegalArgumentException(sb.toString()));
        return false;
    }

    /* renamed from: b */
    public void mo29946b(long j) {
    }

    public void cancel() {
    }

    /* renamed from: a */
    public static void m39323a() {
        C11915a.m38466b((Throwable) new C12006e("Subscription already set!"));
    }

    /* renamed from: a */
    public static void m39324a(long j) {
        StringBuilder sb = new StringBuilder();
        sb.append("More produced than requested: ");
        sb.append(j);
        C11915a.m38466b((Throwable) new C12006e(sb.toString()));
    }

    /* renamed from: a */
    public static boolean m39328a(AtomicReference<C14314c> atomicReference, C14314c cVar) {
        C12036b.m38663a(cVar, "s is null");
        if (atomicReference.compareAndSet(null, cVar)) {
            return true;
        }
        cVar.cancel();
        if (atomicReference.get() != CANCELLED) {
            m39323a();
        }
        return false;
    }

    /* renamed from: a */
    public static boolean m39326a(AtomicReference<C14314c> atomicReference) {
        C14314c cVar = (C14314c) atomicReference.get();
        C12539g gVar = CANCELLED;
        if (cVar != gVar) {
            C14314c cVar2 = (C14314c) atomicReference.getAndSet(gVar);
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
    public static boolean m39327a(AtomicReference<C14314c> atomicReference, AtomicLong atomicLong, C14314c cVar) {
        if (!m39328a(atomicReference, cVar)) {
            return false;
        }
        long andSet = atomicLong.getAndSet(0);
        if (andSet != 0) {
            cVar.mo29946b(andSet);
        }
        return true;
    }

    /* renamed from: a */
    public static void m39325a(AtomicReference<C14314c> atomicReference, AtomicLong atomicLong, long j) {
        C14314c cVar = (C14314c) atomicReference.get();
        if (cVar != null) {
            cVar.mo29946b(j);
        } else if (m39330c(j)) {
            C12544d.m39341a(atomicLong, j);
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
