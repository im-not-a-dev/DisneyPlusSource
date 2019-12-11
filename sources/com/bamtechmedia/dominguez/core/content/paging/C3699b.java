package com.bamtechmedia.dominguez.core.content.paging;

import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.function.UnaryOperator;
import kotlin.jvm.internal.C12871f;

/* renamed from: com.bamtechmedia.dominguez.core.content.paging.b */
/* compiled from: PagedList.kt */
public final class C3699b implements C3700c {

    /* renamed from: U */
    private static final C3703f f9257U = new DefaultPagingMetaData(0, 0, 0);

    /* renamed from: V */
    public static final C3699b f9258V = new C3699b();

    /* renamed from: c */
    private static final int f9259c = 0;

    private C3699b() {
    }

    /* renamed from: a */
    public boolean mo13446a(Void voidR) {
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
    public int mo13451b() {
        return f9259c;
    }

    /* renamed from: b */
    public int mo13452b(Void voidR) {
        return -1;
    }

    /* renamed from: c */
    public int mo13453c(Void voidR) {
        return -1;
    }

    public void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof Void) {
            return mo13446a((Void) obj);
        }
        return false;
    }

    public boolean containsAll(Collection collection) {
        return collection.isEmpty();
    }

    /* renamed from: f0 */
    public C3703f mo13457f0() {
        return f9257U;
    }

    public final /* bridge */ int indexOf(Object obj) {
        if (obj instanceof Void) {
            return mo13452b((Void) obj);
        }
        return -1;
    }

    public boolean isEmpty() {
        return true;
    }

    public Iterator iterator() {
        return C3698a.f9256c;
    }

    public final /* bridge */ int lastIndexOf(Object obj) {
        if (obj instanceof Void) {
            return mo13453c((Void) obj);
        }
        return -1;
    }

    public ListIterator listIterator() {
        return C3698a.f9256c;
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

    public void replaceAll(UnaryOperator unaryOperator) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean retainAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public /* synthetic */ Object set(int i, Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final /* bridge */ int size() {
        return mo13451b();
    }

    public void sort(Comparator comparator) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
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

    public Void get(int i) {
        StringBuilder sb = new StringBuilder();
        sb.append("Empty list doesn't contain element at index ");
        sb.append(i);
        sb.append('.');
        throw new IndexOutOfBoundsException(sb.toString());
    }

    public ListIterator listIterator(int i) {
        if (i == 0) {
            return C3698a.f9256c;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Index: ");
        sb.append(i);
        throw new IndexOutOfBoundsException(sb.toString());
    }
}
