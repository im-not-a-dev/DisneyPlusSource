package com.google.common.collect;

import com.google.common.base.C10373e;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: com.google.common.collect.i */
/* compiled from: Iterators */
public final class C10389i {

    /* renamed from: com.google.common.collect.i$a */
    /* compiled from: Iterators */
    static class C10390a extends C10410v<T> {

        /* renamed from: U */
        final /* synthetic */ Object f24699U;

        /* renamed from: c */
        boolean f24700c;

        C10390a(Object obj) {
            this.f24699U = obj;
        }

        public boolean hasNext() {
            return !this.f24700c;
        }

        public T next() {
            if (!this.f24700c) {
                this.f24700c = true;
                return this.f24699U;
            }
            throw new NoSuchElementException();
        }
    }

    /* renamed from: a */
    public static boolean m32872a(Iterator<?> it, Iterator<?> it2) {
        while (it.hasNext()) {
            if (!it2.hasNext()) {
                return false;
            }
            if (!C10373e.m32807a(it.next(), it2.next())) {
                return false;
            }
        }
        return !it2.hasNext();
    }

    /* renamed from: a */
    public static <T> C10410v<T> m32871a(T t) {
        return new C10390a(t);
    }
}
