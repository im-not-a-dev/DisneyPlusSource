package com.google.common.collect;

import com.google.common.base.C10374f;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

public abstract class ImmutableList<E> extends C10385g<E> implements List<E>, RandomAccess {

    /* renamed from: U */
    private static final C10411w<Object> f24680U = new C10377a(C10400p.f24704X, 0);

    /* renamed from: com.google.common.collect.ImmutableList$a */
    static class C10377a<E> extends C10379a<E> {

        /* renamed from: V */
        private final ImmutableList<E> f24681V;

        C10377a(ImmutableList<E> immutableList, int i) {
            super(immutableList.size(), i);
            this.f24681V = immutableList;
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public E mo27132a(int i) {
            return this.f24681V.get(i);
        }
    }

    /* renamed from: com.google.common.collect.ImmutableList$b */
    class C10378b extends ImmutableList<E> {

        /* renamed from: V */
        final transient int f24682V;

        /* renamed from: W */
        final transient int f24683W;

        C10378b(int i, int i2) {
            this.f24682V = i;
            this.f24683W = i2;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public Object[] mo27133b() {
            return ImmutableList.this.mo27133b();
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: c */
        public int mo27134c() {
            return ImmutableList.this.mo27135d() + this.f24682V + this.f24683W;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: d */
        public int mo27135d() {
            return ImmutableList.this.mo27135d() + this.f24682V;
        }

        public E get(int i) {
            C10374f.m32808a(i, this.f24683W);
            return ImmutableList.this.get(i + this.f24682V);
        }

        public /* bridge */ /* synthetic */ Iterator iterator() {
            return ImmutableList.super.iterator();
        }

        public /* bridge */ /* synthetic */ ListIterator listIterator() {
            return ImmutableList.super.listIterator();
        }

        public int size() {
            return this.f24683W;
        }

        public /* bridge */ /* synthetic */ ListIterator listIterator(int i) {
            return ImmutableList.super.listIterator(i);
        }

        public ImmutableList<E> subList(int i, int i2) {
            C10374f.m32817b(i, i2, this.f24683W);
            ImmutableList immutableList = ImmutableList.this;
            int i3 = this.f24682V;
            return immutableList.subList(i + i3, i2 + i3);
        }
    }

    ImmutableList() {
    }

    /* renamed from: a */
    public static <E> ImmutableList<E> m32826a(E e) {
        return m32828b(e);
    }

    /* renamed from: b */
    private static <E> ImmutableList<E> m32828b(Object... objArr) {
        C10397m.m32884a(objArr);
        return m32827a(objArr);
    }

    /* renamed from: e */
    public static <E> ImmutableList<E> m32830e() {
        return C10400p.f24704X;
    }

    @Deprecated
    public final void add(int i, E e) {
        throw new UnsupportedOperationException();
    }

    @Deprecated
    public final boolean addAll(int i, Collection<? extends E> collection) {
        throw new UnsupportedOperationException();
    }

    public boolean contains(Object obj) {
        return indexOf(obj) >= 0;
    }

    public boolean equals(Object obj) {
        return C10391j.m32873a(this, obj);
    }

    public int hashCode() {
        int size = size();
        int i = 1;
        for (int i2 = 0; i2 < size; i2++) {
            i = ~(~((i * 31) + get(i2).hashCode()));
        }
        return i;
    }

    public int indexOf(Object obj) {
        if (obj == null) {
            return -1;
        }
        return C10391j.m32874b(this, obj);
    }

    public int lastIndexOf(Object obj) {
        if (obj == null) {
            return -1;
        }
        return C10391j.m32876d(this, obj);
    }

    @Deprecated
    public final E remove(int i) {
        throw new UnsupportedOperationException();
    }

    @Deprecated
    public final E set(int i, E e) {
        throw new UnsupportedOperationException();
    }

    /* renamed from: a */
    static <E> ImmutableList<E> m32827a(Object[] objArr) {
        return m32829b(objArr, objArr.length);
    }

    /* renamed from: b */
    static <E> ImmutableList<E> m32829b(Object[] objArr, int i) {
        if (i == 0) {
            return m32830e();
        }
        return new C10400p(objArr, i);
    }

    public C10410v<E> iterator() {
        return listIterator();
    }

    public ImmutableList<E> subList(int i, int i2) {
        C10374f.m32817b(i, i2, size());
        int i3 = i2 - i;
        if (i3 == size()) {
            return this;
        }
        if (i3 == 0) {
            return m32830e();
        }
        return mo27118a(i, i2);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public ImmutableList<E> mo27118a(int i, int i2) {
        return new C10378b(i, i2 - i);
    }

    public C10411w<E> listIterator() {
        return listIterator(0);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public int mo27117a(Object[] objArr, int i) {
        int size = size();
        for (int i2 = 0; i2 < size; i2++) {
            objArr[i + i2] = get(i2);
        }
        return i + size;
    }

    public C10411w<E> listIterator(int i) {
        C10374f.m32815b(i, size());
        if (isEmpty()) {
            return f24680U;
        }
        return new C10377a(this, i);
    }
}
