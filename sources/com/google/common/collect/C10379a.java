package com.google.common.collect;

import com.google.common.base.C10374f;
import java.util.NoSuchElementException;

/* renamed from: com.google.common.collect.a */
/* compiled from: AbstractIndexedListIterator */
abstract class C10379a<E> extends C10411w<E> {

    /* renamed from: U */
    private int f24686U;

    /* renamed from: c */
    private final int f24687c;

    protected C10379a(int i, int i2) {
        C10374f.m32815b(i2, i);
        this.f24687c = i;
        this.f24686U = i2;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract E mo27132a(int i);

    public final boolean hasNext() {
        return this.f24686U < this.f24687c;
    }

    public final boolean hasPrevious() {
        return this.f24686U > 0;
    }

    public final E next() {
        if (hasNext()) {
            int i = this.f24686U;
            this.f24686U = i + 1;
            return mo27132a(i);
        }
        throw new NoSuchElementException();
    }

    public final int nextIndex() {
        return this.f24686U;
    }

    public final E previous() {
        if (hasPrevious()) {
            int i = this.f24686U - 1;
            this.f24686U = i;
            return mo27132a(i);
        }
        throw new NoSuchElementException();
    }

    public final int previousIndex() {
        return this.f24686U - 1;
    }
}
