package p163g.p503n.p504a;

import java.util.concurrent.atomic.AtomicReference;
import p520io.reactivex.p530x.C11998a;

/* renamed from: g.n.a.w */
/* compiled from: ExceptionHelper */
final class C11840w {

    /* renamed from: a */
    private static final Throwable f27494a = new C11841a();

    /* renamed from: g.n.a.w$a */
    /* compiled from: ExceptionHelper */
    static final class C11841a extends Throwable {
        C11841a() {
            super("No further exceptions");
        }

        public synchronized Throwable fillInStackTrace() {
            return this;
        }
    }

    /* renamed from: a */
    static boolean m37985a(AtomicReference<Throwable> atomicReference, Throwable th) {
        Throwable th2;
        Throwable th3;
        do {
            th2 = (Throwable) atomicReference.get();
            if (th2 == f27494a) {
                return false;
            }
            if (th2 == null) {
                th3 = th;
            } else {
                th3 = new C11998a(th2, th);
            }
        } while (!atomicReference.compareAndSet(th2, th3));
        return true;
    }

    /* renamed from: a */
    static Throwable m37984a(AtomicReference<Throwable> atomicReference) {
        Throwable th = (Throwable) atomicReference.get();
        Throwable th2 = f27494a;
        return th != th2 ? (Throwable) atomicReference.getAndSet(th2) : th;
    }
}
