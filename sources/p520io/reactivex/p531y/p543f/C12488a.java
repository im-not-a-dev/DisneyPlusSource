package p520io.reactivex.p531y.p543f;

import java.util.concurrent.atomic.AtomicReference;
import p520io.reactivex.p531y.p534c.C12050m;

/* renamed from: io.reactivex.y.f.a */
/* compiled from: MpscLinkedQueue */
public final class C12488a<T> implements C12050m<T> {

    /* renamed from: U */
    private final AtomicReference<C12489a<T>> f28914U = new AtomicReference<>();

    /* renamed from: c */
    private final AtomicReference<C12489a<T>> f28915c = new AtomicReference<>();

    /* renamed from: io.reactivex.y.f.a$a */
    /* compiled from: MpscLinkedQueue */
    static final class C12489a<E> extends AtomicReference<C12489a<E>> {

        /* renamed from: c */
        private E f28916c;

        C12489a() {
        }

        /* renamed from: a */
        public E mo30589a() {
            E b = mo30592b();
            mo30591a((E) null);
            return b;
        }

        /* renamed from: b */
        public E mo30592b() {
            return this.f28916c;
        }

        /* renamed from: c */
        public C12489a<E> mo30593c() {
            return (C12489a) get();
        }

        C12489a(E e) {
            mo30591a(e);
        }

        /* renamed from: a */
        public void mo30591a(E e) {
            this.f28916c = e;
        }

        /* renamed from: a */
        public void mo30590a(C12489a<E> aVar) {
            lazySet(aVar);
        }
    }

    public C12488a() {
        C12489a aVar = new C12489a();
        mo30585a(aVar);
        mo30587b(aVar);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public C12489a<T> mo30584a() {
        return (C12489a) this.f28914U.get();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public C12489a<T> mo30587b(C12489a<T> aVar) {
        return (C12489a) this.f28915c.getAndSet(aVar);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public C12489a<T> mo30588c() {
        return (C12489a) this.f28915c.get();
    }

    public void clear() {
        while (poll() != null) {
            if (isEmpty()) {
                return;
            }
        }
    }

    public boolean isEmpty() {
        return mo30586b() == mo30588c();
    }

    public boolean offer(T t) {
        if (t != null) {
            C12489a aVar = new C12489a(t);
            mo30587b(aVar).mo30590a(aVar);
            return true;
        }
        throw new NullPointerException("Null is not a valid element");
    }

    public T poll() {
        C12489a c;
        C12489a a = mo30584a();
        C12489a c2 = a.mo30593c();
        if (c2 != null) {
            T a2 = c2.mo30589a();
            mo30585a(c2);
            return a2;
        } else if (a == mo30588c()) {
            return null;
        } else {
            do {
                c = a.mo30593c();
            } while (c == null);
            T a3 = c.mo30589a();
            mo30585a(c);
            return a3;
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo30585a(C12489a<T> aVar) {
        this.f28914U.lazySet(aVar);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public C12489a<T> mo30586b() {
        return (C12489a) this.f28914U.get();
    }
}
