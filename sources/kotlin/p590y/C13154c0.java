package kotlin.p590y;

import java.util.Iterator;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.p589f0.C12872a;

/* renamed from: kotlin.y.c0 */
/* compiled from: Iterables.kt */
public final class C13154c0<T> implements Iterable<C13152b0<? extends T>>, C12872a {

    /* renamed from: c */
    private final Function0<Iterator<T>> f29597c;

    public C13154c0(Function0<? extends Iterator<? extends T>> function0) {
        this.f29597c = function0;
    }

    public Iterator<C13152b0<T>> iterator() {
        return new C13160d0((Iterator) this.f29597c.invoke());
    }
}
