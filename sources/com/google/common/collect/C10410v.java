package com.google.common.collect;

import java.util.Iterator;

/* renamed from: com.google.common.collect.v */
/* compiled from: UnmodifiableIterator */
public abstract class C10410v<E> implements Iterator<E> {
    protected C10410v() {
    }

    @Deprecated
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
