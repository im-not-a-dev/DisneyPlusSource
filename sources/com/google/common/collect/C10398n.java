package com.google.common.collect;

import com.google.common.base.C10368c;
import java.util.Comparator;

/* renamed from: com.google.common.collect.n */
/* compiled from: Ordering */
public abstract class C10398n<T> implements Comparator<T> {
    protected C10398n() {
    }

    /* renamed from: a */
    public static <T> C10398n<T> m32887a(Comparator<T> comparator) {
        return comparator instanceof C10398n ? (C10398n) comparator : new C10383e(comparator);
    }

    public abstract int compare(T t, T t2);

    /* renamed from: a */
    public <F> C10398n<F> mo27189a(C10368c<F, ? extends T> cVar) {
        return new C10380b(cVar, this);
    }
}
