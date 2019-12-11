package kotlin.p590y;

import java.util.Iterator;
import kotlin.jvm.internal.p589f0.C12872a;

/* renamed from: kotlin.y.e0 */
/* compiled from: Iterators.kt */
public abstract class C13162e0 implements Iterator<Integer>, C12872a {
    /* renamed from: b */
    public abstract int mo31079b();

    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final Integer next() {
        return Integer.valueOf(mo31079b());
    }
}
