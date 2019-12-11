package com.bumptech.glide.load.p339o;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import p096e.p121h.p134r.C4114f;

/* renamed from: com.bumptech.glide.load.o.p */
/* compiled from: ModelLoaderRegistry */
public class C8309p {

    /* renamed from: a */
    private final C8314r f17775a;

    /* renamed from: b */
    private final C8310a f17776b;

    /* renamed from: com.bumptech.glide.load.o.p$a */
    /* compiled from: ModelLoaderRegistry */
    private static class C8310a {

        /* renamed from: a */
        private final Map<Class<?>, C8311a<?>> f17777a = new HashMap();

        /* renamed from: com.bumptech.glide.load.o.p$a$a */
        /* compiled from: ModelLoaderRegistry */
        private static class C8311a<Model> {

            /* renamed from: a */
            final List<C8306n<Model, ?>> f17778a;

            public C8311a(List<C8306n<Model, ?>> list) {
                this.f17778a = list;
            }
        }

        C8310a() {
        }

        /* renamed from: a */
        public void mo21490a() {
            this.f17777a.clear();
        }

        /* renamed from: a */
        public <Model> void mo21491a(Class<Model> cls, List<C8306n<Model, ?>> list) {
            if (((C8311a) this.f17777a.put(cls, new C8311a(list))) != null) {
                StringBuilder sb = new StringBuilder();
                sb.append("Already cached loaders for model: ");
                sb.append(cls);
                throw new IllegalStateException(sb.toString());
            }
        }

        /* renamed from: a */
        public <Model> List<C8306n<Model, ?>> mo21489a(Class<Model> cls) {
            C8311a aVar = (C8311a) this.f17777a.get(cls);
            if (aVar == null) {
                return null;
            }
            return aVar.f17778a;
        }
    }

    public C8309p(C4114f<List<Throwable>> fVar) {
        this(new C8314r(fVar));
    }

    /* renamed from: a */
    public synchronized <Model, Data> void mo21487a(Class<Model> cls, Class<Data> cls2, C8308o<? extends Model, ? extends Data> oVar) {
        this.f17775a.mo21495a(cls, cls2, oVar);
        this.f17776b.mo21490a();
    }

    /* renamed from: b */
    public synchronized <Model, Data> void mo21488b(Class<Model> cls, Class<Data> cls2, C8308o<? extends Model, ? extends Data> oVar) {
        m24132a(this.f17775a.mo21498b(cls, cls2, oVar));
        this.f17776b.mo21490a();
    }

    private C8309p(C8314r rVar) {
        this.f17776b = new C8310a();
        this.f17775a = rVar;
    }

    /* renamed from: a */
    private <Model, Data> void m24132a(List<C8308o<? extends Model, ? extends Data>> list) {
        for (C8308o a : list) {
            a.mo19955a();
        }
    }

    /* renamed from: b */
    private synchronized <A> List<C8306n<A, ?>> m24134b(Class<A> cls) {
        List<C8306n<A, ?>> a;
        a = this.f17776b.mo21489a(cls);
        if (a == null) {
            a = Collections.unmodifiableList(this.f17775a.mo21494a(cls));
            this.f17776b.mo21491a(cls, a);
        }
        return a;
    }

    /* renamed from: a */
    public <A> List<C8306n<A, ?>> mo21486a(A a) {
        List b = m24134b(m24133b(a));
        int size = b.size();
        List emptyList = Collections.emptyList();
        boolean z = true;
        for (int i = 0; i < size; i++) {
            C8306n nVar = (C8306n) b.get(i);
            if (nVar.mo19953a(a)) {
                if (z) {
                    emptyList = new ArrayList(size - i);
                    z = false;
                }
                emptyList.add(nVar);
            }
        }
        return emptyList;
    }

    /* renamed from: b */
    private static <A> Class<A> m24133b(A a) {
        return a.getClass();
    }

    /* renamed from: a */
    public synchronized List<Class<?>> mo21485a(Class<?> cls) {
        return this.f17775a.mo21496b(cls);
    }
}
