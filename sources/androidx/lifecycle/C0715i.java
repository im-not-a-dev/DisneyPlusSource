package androidx.lifecycle;

import java.util.concurrent.atomic.AtomicReference;

/* renamed from: androidx.lifecycle.i */
/* compiled from: Lifecycle */
public abstract class C0715i {

    /* renamed from: androidx.lifecycle.i$a */
    /* compiled from: Lifecycle */
    public enum C0716a {
        ON_CREATE,
        ON_START,
        ON_RESUME,
        ON_PAUSE,
        ON_STOP,
        ON_DESTROY,
        ON_ANY
    }

    /* renamed from: androidx.lifecycle.i$b */
    /* compiled from: Lifecycle */
    public enum C0717b {
        DESTROYED,
        INITIALIZED,
        CREATED,
        STARTED,
        RESUMED;

        /* renamed from: a */
        public boolean mo4136a(C0717b bVar) {
            return compareTo(bVar) >= 0;
        }
    }

    public C0715i() {
        new AtomicReference();
    }

    /* renamed from: a */
    public abstract C0717b mo4133a();

    /* renamed from: a */
    public abstract void mo4134a(C0721l lVar);

    /* renamed from: b */
    public abstract void mo4135b(C0721l lVar);
}
