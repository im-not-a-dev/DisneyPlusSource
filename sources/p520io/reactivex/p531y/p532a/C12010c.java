package p520io.reactivex.p531y.p532a;

import java.util.concurrent.atomic.AtomicReference;
import p520io.reactivex.disposables.Disposable;
import p520io.reactivex.p523c0.C11915a;
import p520io.reactivex.p530x.C12006e;
import p520io.reactivex.p531y.p533b.C12036b;

/* renamed from: io.reactivex.y.a.c */
/* compiled from: DisposableHelper */
public enum C12010c implements Disposable {
    DISPOSED;

    /* renamed from: a */
    public static boolean m38619a(Disposable disposable) {
        return disposable == DISPOSED;
    }

    /* renamed from: b */
    public static boolean m38623b(AtomicReference<Disposable> atomicReference, Disposable disposable) {
        Disposable disposable2;
        do {
            disposable2 = (Disposable) atomicReference.get();
            if (disposable2 == DISPOSED) {
                if (disposable != null) {
                    disposable.dispose();
                }
                return false;
            }
        } while (!atomicReference.compareAndSet(disposable2, disposable));
        if (disposable2 != null) {
            disposable2.dispose();
        }
        return true;
    }

    /* renamed from: c */
    public static boolean m38624c(AtomicReference<Disposable> atomicReference, Disposable disposable) {
        C12036b.m38663a(disposable, "d is null");
        if (atomicReference.compareAndSet(null, disposable)) {
            return true;
        }
        disposable.dispose();
        if (atomicReference.get() != DISPOSED) {
            m38618a();
        }
        return false;
    }

    /* renamed from: d */
    public static boolean m38625d(AtomicReference<Disposable> atomicReference, Disposable disposable) {
        if (atomicReference.compareAndSet(null, disposable)) {
            return true;
        }
        if (atomicReference.get() == DISPOSED) {
            disposable.dispose();
        }
        return false;
    }

    public void dispose() {
    }

    public boolean isDisposed() {
        return true;
    }

    /* renamed from: a */
    public static boolean m38622a(AtomicReference<Disposable> atomicReference, Disposable disposable) {
        Disposable disposable2;
        do {
            disposable2 = (Disposable) atomicReference.get();
            if (disposable2 == DISPOSED) {
                if (disposable != null) {
                    disposable.dispose();
                }
                return false;
            }
        } while (!atomicReference.compareAndSet(disposable2, disposable));
        return true;
    }

    /* renamed from: a */
    public static boolean m38621a(AtomicReference<Disposable> atomicReference) {
        Disposable disposable = (Disposable) atomicReference.get();
        C12010c cVar = DISPOSED;
        if (disposable != cVar) {
            Disposable disposable2 = (Disposable) atomicReference.getAndSet(cVar);
            if (disposable2 != cVar) {
                if (disposable2 != null) {
                    disposable2.dispose();
                }
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    public static boolean m38620a(Disposable disposable, Disposable disposable2) {
        if (disposable2 == null) {
            C11915a.m38466b((Throwable) new NullPointerException("next is null"));
            return false;
        } else if (disposable == null) {
            return true;
        } else {
            disposable2.dispose();
            m38618a();
            return false;
        }
    }

    /* renamed from: a */
    public static void m38618a() {
        C11915a.m38466b((Throwable) new C12006e("Disposable already set!"));
    }
}
