package p163g.p503n.p504a;

import java.util.concurrent.atomic.AtomicReference;
import org.reactivestreams.C14314c;
import p520io.reactivex.disposables.Disposable;
import p520io.reactivex.p523c0.C11915a;
import p520io.reactivex.p530x.C12006e;

/* renamed from: g.n.a.i */
/* compiled from: AutoDisposeEndConsumerHelper */
final class C11821i {
    /* renamed from: a */
    public static boolean m37965a(AtomicReference<Disposable> atomicReference, Disposable disposable, Class<?> cls) {
        C11827o.m37973a(disposable, "next is null");
        if (atomicReference.compareAndSet(null, disposable)) {
            return true;
        }
        disposable.dispose();
        if (atomicReference.get() != C11791d.DISPOSED) {
            m37964a(cls);
        }
        return false;
    }

    /* renamed from: a */
    public static boolean m37966a(AtomicReference<C14314c> atomicReference, C14314c cVar, Class<?> cls) {
        C11827o.m37973a(cVar, "next is null");
        if (atomicReference.compareAndSet(null, cVar)) {
            return true;
        }
        cVar.cancel();
        if (atomicReference.get() != C11838u.CANCELLED) {
            m37964a(cls);
        }
        return false;
    }

    /* renamed from: a */
    public static String m37963a(String str) {
        StringBuilder sb = new StringBuilder();
        sb.append("It is not allowed to subscribe with a(n) ");
        sb.append(str);
        sb.append(" multiple times. Please create a fresh instance of ");
        sb.append(str);
        sb.append(" and subscribe that to the target source instead.");
        return sb.toString();
    }

    /* renamed from: a */
    public static void m37964a(Class<?> cls) {
        C11915a.m38466b((Throwable) new C12006e(m37963a(cls.getName())));
    }
}
