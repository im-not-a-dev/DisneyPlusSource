package com.google.common.collect;

import java.util.ListIterator;

/* renamed from: com.google.common.collect.w */
/* compiled from: UnmodifiableListIterator */
public abstract class C10411w<E> extends C10410v<E> implements ListIterator<E> {
    protected C10411w() {
    }

    @Deprecated
    public final void add(E e) {
        throw new UnsupportedOperationException();
    }

    @Deprecated
    public final void set(E e) {
        throw new UnsupportedOperationException();
    }
}
