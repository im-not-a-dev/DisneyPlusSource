package kotlin.p590y;

import java.util.Collection;
import java.util.Iterator;
import kotlin.jvm.internal.C12861b;
import kotlin.jvm.internal.C12871f;
import kotlin.jvm.internal.p589f0.C12872a;

/* renamed from: kotlin.y.f */
/* compiled from: Collections.kt */
final class C13163f<T> implements Collection<T>, C12872a {

    /* renamed from: U */
    private final boolean f29607U;

    /* renamed from: c */
    private final T[] f29608c;

    public C13163f(T[] tArr, boolean z) {
        this.f29608c = tArr;
        this.f29607U = z;
    }

    public boolean add(T t) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean addAll(Collection<? extends T> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    /* renamed from: b */
    public int mo34245b() {
        return this.f29608c.length;
    }

    public void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean contains(Object obj) {
        return C13174k.m40393b((Object[]) this.f29608c, obj);
    }

    public boolean containsAll(Collection<? extends Object> collection) {
        if (collection.isEmpty()) {
            return true;
        }
        for (Object contains : collection) {
            if (!contains(contains)) {
                return false;
            }
        }
        return true;
    }

    public boolean isEmpty() {
        return this.f29608c.length == 0;
    }

    public Iterator<T> iterator() {
        return C12861b.m40194a(this.f29608c);
    }

    public boolean remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean removeAll(Collection<? extends Object> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean retainAll(Collection<? extends Object> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final /* bridge */ int size() {
        return mo34245b();
    }

    public final Object[] toArray() {
        return C13183n.m40499a(this.f29608c, this.f29607U);
    }

    public <T> T[] toArray(T[] tArr) {
        return C12871f.m40216a(this, tArr);
    }
}
