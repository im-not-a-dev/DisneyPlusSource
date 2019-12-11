package com.google.common.collect;

import com.google.common.base.C10374f;
import java.io.Serializable;
import java.util.Comparator;

/* renamed from: com.google.common.collect.e */
/* compiled from: ComparatorOrdering */
final class C10383e<T> extends C10398n<T> implements Serializable {

    /* renamed from: c */
    final Comparator<T> f24690c;

    C10383e(Comparator<T> comparator) {
        C10374f.m32809a(comparator);
        this.f24690c = comparator;
    }

    public int compare(T t, T t2) {
        return this.f24690c.compare(t, t2);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C10383e)) {
            return false;
        }
        return this.f24690c.equals(((C10383e) obj).f24690c);
    }

    public int hashCode() {
        return this.f24690c.hashCode();
    }

    public String toString() {
        return this.f24690c.toString();
    }
}
