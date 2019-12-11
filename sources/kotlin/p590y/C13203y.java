package kotlin.p590y;

import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
import kotlin.jvm.internal.C12871f;
import kotlin.jvm.internal.p589f0.C12872a;

/* renamed from: kotlin.y.y */
/* compiled from: Collections.kt */
public final class C13203y implements List, Serializable, RandomAccess, C12872a {

    /* renamed from: c */
    public static final C13203y f29641c = new C13203y();

    private C13203y() {
    }

    /* renamed from: a */
    public boolean mo34277a(Void voidR) {
        return false;
    }

    public /* synthetic */ void add(int i, Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public /* synthetic */ boolean add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean addAll(int i, Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean addAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    /* renamed from: b */
    public int mo34282b() {
        return 0;
    }

    /* renamed from: b */
    public int mo34283b(Void voidR) {
        return -1;
    }

    /* renamed from: c */
    public int mo34284c(Void voidR) {
        return -1;
    }

    public void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof Void) {
            return mo34277a((Void) obj);
        }
        return false;
    }

    public boolean containsAll(Collection collection) {
        return collection.isEmpty();
    }

    public boolean equals(Object obj) {
        return (obj instanceof List) && ((List) obj).isEmpty();
    }

    public int hashCode() {
        return 1;
    }

    public final /* bridge */ int indexOf(Object obj) {
        if (obj instanceof Void) {
            return mo34283b((Void) obj);
        }
        return -1;
    }

    public boolean isEmpty() {
        return true;
    }

    public Iterator iterator() {
        return C13202x.f29640c;
    }

    public final /* bridge */ int lastIndexOf(Object obj) {
        if (obj instanceof Void) {
            return mo34284c((Void) obj);
        }
        return -1;
    }

    public ListIterator listIterator() {
        return C13202x.f29640c;
    }

    public /* synthetic */ Object remove(int i) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
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

    public /* synthetic */ Object set(int i, Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final /* bridge */ int size() {
        return mo34282b();
    }

    public List subList(int i, int i2) {
        if (i == 0 && i2 == 0) {
            return this;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("fromIndex: ");
        sb.append(i);
        sb.append(", toIndex: ");
        sb.append(i2);
        throw new IndexOutOfBoundsException(sb.toString());
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

    public Void get(int i) {
        StringBuilder sb = new StringBuilder();
        sb.append("Empty list doesn't contain element at index ");
        sb.append(i);
        sb.append('.');
        throw new IndexOutOfBoundsException(sb.toString());
    }

    public ListIterator listIterator(int i) {
        if (i == 0) {
            return C13202x.f29640c;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Index: ");
        sb.append(i);
        throw new IndexOutOfBoundsException(sb.toString());
    }
}
