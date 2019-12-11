package kotlin.p590y;

import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import kotlin.jvm.internal.C12871f;
import kotlin.jvm.internal.p589f0.C12872a;

/* renamed from: kotlin.y.a0 */
/* compiled from: Sets.kt */
public final class C13150a0 implements Set, Serializable, C12872a {

    /* renamed from: c */
    public static final C13150a0 f29592c = new C13150a0();

    private C13150a0() {
    }

    /* renamed from: a */
    public boolean mo34176a(Void voidR) {
        return false;
    }

    public /* synthetic */ boolean add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean addAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    /* renamed from: b */
    public int mo34179b() {
        return 0;
    }

    public void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof Void) {
            return mo34176a((Void) obj);
        }
        return false;
    }

    public boolean containsAll(Collection collection) {
        return collection.isEmpty();
    }

    public boolean equals(Object obj) {
        return (obj instanceof Set) && ((Set) obj).isEmpty();
    }

    public int hashCode() {
        return 0;
    }

    public boolean isEmpty() {
        return true;
    }

    public Iterator iterator() {
        return C13202x.f29640c;
    }

    public boolean remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean removeAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean retainAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final /* bridge */ int size() {
        return mo34179b();
    }

    public Object[] toArray() {
        return C12871f.m40215a(this);
    }

    public <T> T[] toArray(T[] tArr) {
        return C12871f.m40216a(this, tArr);
    }

    public String toString() {
        return "[]";
    }
}
