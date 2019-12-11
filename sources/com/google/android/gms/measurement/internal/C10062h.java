package com.google.android.gms.measurement.internal;

import java.util.Iterator;

/* renamed from: com.google.android.gms.measurement.internal.h */
final class C10062h implements Iterator<String> {

    /* renamed from: U */
    private final /* synthetic */ C10073i f23505U;

    /* renamed from: c */
    private Iterator<String> f23506c = this.f23505U.f23527c.keySet().iterator();

    C10062h(C10073i iVar) {
        this.f23505U = iVar;
    }

    public final boolean hasNext() {
        return this.f23506c.hasNext();
    }

    public final /* synthetic */ Object next() {
        return (String) this.f23506c.next();
    }

    public final void remove() {
        throw new UnsupportedOperationException("Remove not supported");
    }
}
