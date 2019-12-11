package kotlin.p590y;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.NoSuchElementException;
import java.util.RandomAccess;
import kotlin.Metadata;
import kotlin.jvm.internal.C12880j;
import kotlin.jvm.internal.p589f0.C12872a;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u00008\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\b\n\u0002\u0010(\n\u0002\b\u0002\n\u0002\u0010*\n\u0002\b\b\b'\u0018\u0000 \u001c*\u0006\b\u0000\u0010\u0001 \u00012\b\u0012\u0004\u0012\u0002H\u00010\u00022\b\u0012\u0004\u0012\u0002H\u00010\u0003:\u0004\u001c\u001d\u001e\u001fB\u0007\b\u0004¢\u0006\u0002\u0010\u0004J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u0002J\u0016\u0010\r\u001a\u00028\u00002\u0006\u0010\u000e\u001a\u00020\u0006H¦\u0002¢\u0006\u0002\u0010\u000fJ\b\u0010\u0010\u001a\u00020\u0006H\u0016J\u0015\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00028\u0000H\u0016¢\u0006\u0002\u0010\u0013J\u000f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00028\u00000\u0015H\u0002J\u0015\u0010\u0016\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00028\u0000H\u0016¢\u0006\u0002\u0010\u0013J\u000e\u0010\u0017\u001a\b\u0012\u0004\u0012\u00028\u00000\u0018H\u0016J\u0016\u0010\u0017\u001a\b\u0012\u0004\u0012\u00028\u00000\u00182\u0006\u0010\u000e\u001a\u00020\u0006H\u0016J\u001e\u0010\u0019\u001a\b\u0012\u0004\u0012\u00028\u00000\u00032\u0006\u0010\u001a\u001a\u00020\u00062\u0006\u0010\u001b\u001a\u00020\u0006H\u0016R\u0012\u0010\u0005\u001a\u00020\u0006X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006 "}, mo31007d2 = {"Lkotlin/collections/AbstractList;", "E", "Lkotlin/collections/AbstractCollection;", "", "()V", "size", "", "getSize", "()I", "equals", "", "other", "", "get", "index", "(I)Ljava/lang/Object;", "hashCode", "indexOf", "element", "(Ljava/lang/Object;)I", "iterator", "", "lastIndexOf", "listIterator", "", "subList", "fromIndex", "toIndex", "Companion", "IteratorImpl", "ListIteratorImpl", "SubList", "kotlin-stdlib"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* renamed from: kotlin.y.d */
/* compiled from: AbstractList.kt */
public abstract class C13155d<E> extends C13148a<E> implements List<E>, C12872a {

    /* renamed from: c */
    public static final C13156a f29598c = new C13156a(null);

    /* renamed from: kotlin.y.d$a */
    /* compiled from: AbstractList.kt */
    public static final class C13156a {
        private C13156a() {
        }

        /* renamed from: a */
        public final void mo34219a(int i, int i2) {
            if (i < 0 || i >= i2) {
                StringBuilder sb = new StringBuilder();
                sb.append("index: ");
                sb.append(i);
                sb.append(", size: ");
                sb.append(i2);
                throw new IndexOutOfBoundsException(sb.toString());
            }
        }

        /* renamed from: b */
        public final void mo34222b(int i, int i2) {
            if (i < 0 || i > i2) {
                StringBuilder sb = new StringBuilder();
                sb.append("index: ");
                sb.append(i);
                sb.append(", size: ");
                sb.append(i2);
                throw new IndexOutOfBoundsException(sb.toString());
            }
        }

        public /* synthetic */ C13156a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final void mo34220a(int i, int i2, int i3) {
            String str = "fromIndex: ";
            if (i < 0 || i2 > i3) {
                StringBuilder sb = new StringBuilder();
                sb.append(str);
                sb.append(i);
                sb.append(", toIndex: ");
                sb.append(i2);
                sb.append(", size: ");
                sb.append(i3);
                throw new IndexOutOfBoundsException(sb.toString());
            } else if (i > i2) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(str);
                sb2.append(i);
                sb2.append(" > toIndex: ");
                sb2.append(i2);
                throw new IllegalArgumentException(sb2.toString());
            }
        }

        /* renamed from: a */
        public final int mo34218a(Collection<?> collection) {
            int i = 1;
            for (Object next : collection) {
                i = (i * 31) + (next != null ? next.hashCode() : 0);
            }
            return i;
        }

        /* renamed from: a */
        public final boolean mo34221a(Collection<?> collection, Collection<?> collection2) {
            if (collection.size() != collection2.size()) {
                return false;
            }
            Iterator it = collection2.iterator();
            for (Object a : collection) {
                if (!C12880j.m40224a(a, it.next())) {
                    return false;
                }
            }
            return true;
        }
    }

    /* renamed from: kotlin.y.d$b */
    /* compiled from: AbstractList.kt */
    private class C13157b implements Iterator<E>, C12872a {

        /* renamed from: c */
        private int f29600c;

        public C13157b() {
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public final void mo34223a(int i) {
            this.f29600c = i;
        }

        /* access modifiers changed from: protected */
        /* renamed from: b */
        public final int mo34224b() {
            return this.f29600c;
        }

        public boolean hasNext() {
            return this.f29600c < C13155d.this.size();
        }

        public E next() {
            if (hasNext()) {
                C13155d dVar = C13155d.this;
                int i = this.f29600c;
                this.f29600c = i + 1;
                return dVar.get(i);
            }
            throw new NoSuchElementException();
        }

        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    /* renamed from: kotlin.y.d$c */
    /* compiled from: AbstractList.kt */
    private class C13158c extends C13157b implements ListIterator<E>, C12872a {
        public C13158c(int i) {
            super();
            C13155d.f29598c.mo34222b(i, C13155d.this.size());
            mo34223a(i);
        }

        public void add(E e) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        public boolean hasPrevious() {
            return mo34224b() > 0;
        }

        public int nextIndex() {
            return mo34224b();
        }

        public E previous() {
            if (hasPrevious()) {
                C13155d dVar = C13155d.this;
                mo34223a(mo34224b() - 1);
                return dVar.get(mo34224b());
            }
            throw new NoSuchElementException();
        }

        public int previousIndex() {
            return mo34224b() - 1;
        }

        public void set(E e) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    /* renamed from: kotlin.y.d$d */
    /* compiled from: AbstractList.kt */
    private static final class C13159d<E> extends C13155d<E> implements RandomAccess {

        /* renamed from: U */
        private int f29602U;

        /* renamed from: V */
        private final C13155d<E> f29603V;

        /* renamed from: W */
        private final int f29604W;

        public C13159d(C13155d<? extends E> dVar, int i, int i2) {
            this.f29603V = dVar;
            this.f29604W = i;
            C13155d.f29598c.mo34220a(this.f29604W, i2, this.f29603V.size());
            this.f29602U = i2 - this.f29604W;
        }

        /* renamed from: b */
        public int mo31124b() {
            return this.f29602U;
        }

        public E get(int i) {
            C13155d.f29598c.mo34219a(i, this.f29602U);
            return this.f29603V.get(this.f29604W + i);
        }
    }

    protected C13155d() {
    }

    public void add(int i, E e) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean addAll(int i, Collection<? extends E> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof List)) {
            return false;
        }
        return f29598c.mo34221a((Collection<?>) this, (Collection) obj);
    }

    public abstract E get(int i);

    public int hashCode() {
        return f29598c.mo34218a(this);
    }

    public int indexOf(Object obj) {
        int i = 0;
        for (Object a : this) {
            if (C12880j.m40224a(a, obj)) {
                return i;
            }
            i++;
        }
        return -1;
    }

    public Iterator<E> iterator() {
        return new C13157b();
    }

    public int lastIndexOf(Object obj) {
        ListIterator listIterator = listIterator(size());
        while (listIterator.hasPrevious()) {
            if (C12880j.m40224a(listIterator.previous(), obj)) {
                return listIterator.nextIndex();
            }
        }
        return -1;
    }

    public ListIterator<E> listIterator() {
        return new C13158c(0);
    }

    public E remove(int i) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public E set(int i, E e) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public List<E> subList(int i, int i2) {
        return new C13159d(this, i, i2);
    }

    public ListIterator<E> listIterator(int i) {
        return new C13158c(i);
    }
}
