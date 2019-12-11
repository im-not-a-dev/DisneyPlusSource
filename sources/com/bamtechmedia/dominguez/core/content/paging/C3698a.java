package com.bamtechmedia.dominguez.core.content.paging;

import java.util.ListIterator;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.p589f0.C12872a;

/* renamed from: com.bamtechmedia.dominguez.core.content.paging.a */
/* compiled from: PagedList.kt */
public final class C3698a implements ListIterator, C12872a {

    /* renamed from: c */
    public static final C3698a f9256c = new C3698a();

    private C3698a() {
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
