package kotlin.p590y;

import java.util.Iterator;
import kotlin.jvm.internal.p589f0.C12872a;

/* renamed from: kotlin.y.d0 */
/* compiled from: Iterators.kt */
public final class C13160d0<T> implements Iterator<C13152b0<? extends T>>, C12872a {

    /* renamed from: U */
    private final Iterator<T> f29605U;

    /* renamed from: c */
    private int f29606c;

    public C13160d0(Iterator<? extends T> it) {
        this.f29605U = it;
    }

    public final boolean hasNext() {
        return this.f29605U.hasNext();
    }

    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final C13152b0<T> next() {
        int i = this.f29606c;
        this.f29606c = i + 1;
        if (i >= 0) {
            return new C13152b0<>(i, this.f29605U.next());
        }
        C13180m.m40455c();
        throw null;
    }
}
