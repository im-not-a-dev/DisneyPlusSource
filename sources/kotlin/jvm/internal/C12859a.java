package kotlin.jvm.internal;

import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.p589f0.C12872a;

/* renamed from: kotlin.jvm.internal.a */
/* compiled from: ArrayIterator.kt */
final class C12859a<T> implements Iterator<T>, C12872a {

    /* renamed from: U */
    private final T[] f29512U;

    /* renamed from: c */
    private int f29513c;

    public C12859a(T[] tArr) {
        this.f29512U = tArr;
    }

    public boolean hasNext() {
        return this.f29513c < this.f29512U.length;
    }

    public T next() {
        try {
            T[] tArr = this.f29512U;
            int i = this.f29513c;
            this.f29513c = i + 1;
            return tArr[i];
        } catch (ArrayIndexOutOfBoundsException e) {
            this.f29513c--;
            throw new NoSuchElementException(e.getMessage());
        }
    }

    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
