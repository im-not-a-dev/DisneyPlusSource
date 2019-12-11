package kotlin.p590y;

import java.util.ListIterator;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.p589f0.C12872a;

/* renamed from: kotlin.y.x */
/* compiled from: Collections.kt */
public final class C13202x implements ListIterator, C12872a {

    /* renamed from: c */
    public static final C13202x f29640c = new C13202x();

    private C13202x() {
    }

    public /* synthetic */ void add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean hasNext() {
        return false;
    }

    public boolean hasPrevious() {
        return false;
    }

    public int nextIndex() {
        return 0;
    }

    public int previousIndex() {
        return -1;
    }

    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public /* synthetic */ void set(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public Void next() {
        throw new NoSuchElementException();
    }

    public Void previous() {
        throw new NoSuchElementException();
    }
}
