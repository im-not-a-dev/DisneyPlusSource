package com.bumptech.glide.load.p341p.p347h;

import java.util.ArrayList;
import java.util.List;

/* renamed from: com.bumptech.glide.load.p.h.f */
/* compiled from: TranscoderRegistry */
public class C8430f {

    /* renamed from: a */
    private final List<C8431a<?, ?>> f17960a = new ArrayList();

    /* renamed from: com.bumptech.glide.load.p.h.f$a */
    /* compiled from: TranscoderRegistry */
    private static final class C8431a<Z, R> {

        /* renamed from: a */
        private final Class<Z> f17961a;

        /* renamed from: b */
        private final Class<R> f17962b;

        /* renamed from: c */
        final C8429e<Z, R> f17963c;

        C8431a(Class<Z> cls, Class<R> cls2, C8429e<Z, R> eVar) {
            this.f17961a = cls;
            this.f17962b = cls2;
            this.f17963c = eVar;
        }

        /* renamed from: a */
        public boolean mo21644a(Class<?> cls, Class<?> cls2) {
            return this.f17961a.isAssignableFrom(cls) && cls2.isAssignableFrom(this.f17962b);
        }
    }

    /* renamed from: a */
    public synchronized <Z, R> void mo21642a(Class<Z> cls, Class<R> cls2, C8429e<Z, R> eVar) {
        this.f17960a.add(new C8431a(cls, cls2, eVar));
    }

    /* renamed from: b */
    public synchronized <Z, R> List<Class<R>> mo21643b(Class<Z> cls, Class<R> cls2) {
        ArrayList arrayList = new ArrayList();
        if (cls2.isAssignableFrom(cls)) {
            arrayList.add(cls2);
            return arrayList;
        }
        for (C8431a a : this.f17960a) {
            if (a.mo21644a(cls, cls2)) {
                arrayList.add(cls2);
            }
        }
        return arrayList;
    }

    /* renamed from: a */
    public synchronized <Z, R> C8429e<Z, R> mo21641a(Class<Z> cls, Class<R> cls2) {
        if (cls2.isAssignableFrom(cls)) {
            return C8432g.m24527a();
        }
        for (C8431a aVar : this.f17960a) {
            if (aVar.mo21644a(cls, cls2)) {
                return aVar.f17963c;
            }
        }
        StringBuilder sb = new StringBuilder();
        sb.append("No transcoder registered to transcode from ");
        sb.append(cls);
        sb.append(" to ");
        sb.append(cls2);
        throw new IllegalArgumentException(sb.toString());
    }
}
