package kotlin.p587i0;

import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: kotlin.i0.a */
/* compiled from: SequencesJVM.kt */
public final class C12764a<T> implements C12775h<T> {

    /* renamed from: a */
    private final AtomicReference<C12775h<T>> f29426a;

    public C12764a(C12775h<? extends T> hVar) {
        this.f29426a = new AtomicReference<>(hVar);
    }

    public Iterator<T> iterator() {
        C12775h hVar = (C12775h) this.f29426a.getAndSet(null);
        if (hVar != null) {
            return hVar.iterator();
        }
        throw new IllegalStateException("This sequence can be consumed only once.");
    }
}
