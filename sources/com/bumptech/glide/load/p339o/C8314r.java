package com.bumptech.glide.load.p339o;

import com.bumptech.glide.load.C8115i;
import com.bumptech.glide.load.p339o.C8306n.C8307a;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import p096e.p121h.p134r.C4114f;
import p163g.p413f.p414a.C10659l.C10662c;
import p163g.p413f.p414a.p424w.C10774j;

/* renamed from: com.bumptech.glide.load.o.r */
/* compiled from: MultiModelLoaderFactory */
public class C8314r {

    /* renamed from: e */
    private static final C8317c f17788e = new C8317c();

    /* renamed from: f */
    private static final C8306n<Object, Object> f17789f = new C8315a();

    /* renamed from: a */
    private final List<C8316b<?, ?>> f17790a;

    /* renamed from: b */
    private final C8317c f17791b;

    /* renamed from: c */
    private final Set<C8316b<?, ?>> f17792c;

    /* renamed from: d */
    private final C4114f<List<Throwable>> f17793d;

    /* renamed from: com.bumptech.glide.load.o.r$a */
    /* compiled from: MultiModelLoaderFactory */
    private static class C8315a implements C8306n<Object, Object> {
        C8315a() {
        }

        /* renamed from: a */
        public C8307a<Object> mo19951a(Object obj, int i, int i2, C8115i iVar) {
            return null;
        }

        /* renamed from: a */
        public boolean mo19953a(Object obj) {
            return false;
        }
    }

    /* renamed from: com.bumptech.glide.load.o.r$b */
    /* compiled from: MultiModelLoaderFactory */
    private static class C8316b<Model, Data> {

        /* renamed from: a */
        private final Class<Model> f17794a;

        /* renamed from: b */
        final Class<Data> f17795b;

        /* renamed from: c */
        final C8308o<? extends Model, ? extends Data> f17796c;

        public C8316b(Class<Model> cls, Class<Data> cls2, C8308o<? extends Model, ? extends Data> oVar) {
            this.f17794a = cls;
            this.f17795b = cls2;
            this.f17796c = oVar;
        }

        /* renamed from: a */
        public boolean mo21500a(Class<?> cls, Class<?> cls2) {
            return mo21499a(cls) && this.f17795b.isAssignableFrom(cls2);
        }

        /* renamed from: a */
        public boolean mo21499a(Class<?> cls) {
            return this.f17794a.isAssignableFrom(cls);
        }
    }

    /* renamed from: com.bumptech.glide.load.o.r$c */
    /* compiled from: MultiModelLoaderFactory */
    static class C8317c {
        C8317c() {
        }

        /* renamed from: a */
        public <Model, Data> C8312q<Model, Data> mo21501a(List<C8306n<Model, Data>> list, C4114f<List<Throwable>> fVar) {
            return new C8312q<>(list, fVar);
        }
    }

    public C8314r(C4114f<List<Throwable>> fVar) {
        this(fVar, f17788e);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public synchronized <Model, Data> void mo21495a(Class<Model> cls, Class<Data> cls2, C8308o<? extends Model, ? extends Data> oVar) {
        m24152a(cls, cls2, oVar, true);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public synchronized <Model, Data> List<C8308o<? extends Model, ? extends Data>> mo21498b(Class<Model> cls, Class<Data> cls2, C8308o<? extends Model, ? extends Data> oVar) {
        List<C8308o<? extends Model, ? extends Data>> b;
        b = mo21497b(cls, cls2);
        mo21495a(cls, cls2, oVar);
        return b;
    }

    C8314r(C4114f<List<Throwable>> fVar, C8317c cVar) {
        this.f17790a = new ArrayList();
        this.f17792c = new HashSet();
        this.f17793d = fVar;
        this.f17791b = cVar;
    }

    /* renamed from: a */
    private <Model, Data> void m24152a(Class<Model> cls, Class<Data> cls2, C8308o<? extends Model, ? extends Data> oVar, boolean z) {
        C8316b bVar = new C8316b(cls, cls2, oVar);
        List<C8316b<?, ?>> list = this.f17790a;
        list.add(z ? list.size() : 0, bVar);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public synchronized <Model, Data> List<C8308o<? extends Model, ? extends Data>> mo21497b(Class<Model> cls, Class<Data> cls2) {
        ArrayList arrayList;
        arrayList = new ArrayList();
        Iterator it = this.f17790a.iterator();
        while (it.hasNext()) {
            C8316b bVar = (C8316b) it.next();
            if (bVar.mo21500a(cls, cls2)) {
                it.remove();
                arrayList.add(m24153b(bVar));
            }
        }
        return arrayList;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public synchronized <Model> List<C8306n<Model, ?>> mo21494a(Class<Model> cls) {
        ArrayList arrayList;
        try {
            arrayList = new ArrayList();
            for (C8316b bVar : this.f17790a) {
                if (!this.f17792c.contains(bVar)) {
                    if (bVar.mo21499a(cls)) {
                        this.f17792c.add(bVar);
                        arrayList.add(m24151a(bVar));
                        this.f17792c.remove(bVar);
                    }
                }
            }
        } catch (Throwable th) {
            this.f17792c.clear();
            throw th;
        }
        return arrayList;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public synchronized List<Class<?>> mo21496b(Class<?> cls) {
        ArrayList arrayList;
        arrayList = new ArrayList();
        for (C8316b bVar : this.f17790a) {
            if (!arrayList.contains(bVar.f17795b) && bVar.mo21499a(cls)) {
                arrayList.add(bVar.f17795b);
            }
        }
        return arrayList;
    }

    /* renamed from: a */
    public synchronized <Model, Data> C8306n<Model, Data> mo21493a(Class<Model> cls, Class<Data> cls2) {
        try {
            ArrayList arrayList = new ArrayList();
            boolean z = false;
            for (C8316b bVar : this.f17790a) {
                if (this.f17792c.contains(bVar)) {
                    z = true;
                } else if (bVar.mo21500a(cls, cls2)) {
                    this.f17792c.add(bVar);
                    arrayList.add(m24151a(bVar));
                    this.f17792c.remove(bVar);
                }
            }
            if (arrayList.size() > 1) {
                return this.f17791b.mo21501a(arrayList, this.f17793d);
            } else if (arrayList.size() == 1) {
                return (C8306n) arrayList.get(0);
            } else if (z) {
                return m24150a();
            } else {
                throw new C10662c(cls, cls2);
            }
        } catch (Throwable th) {
            this.f17792c.clear();
            throw th;
        }
    }

    /* renamed from: b */
    private <Model, Data> C8308o<Model, Data> m24153b(C8316b<?, ?> bVar) {
        return bVar.f17796c;
    }

    /* renamed from: a */
    private <Model, Data> C8306n<Model, Data> m24151a(C8316b<?, ?> bVar) {
        C8306n<Model, Data> a = bVar.f17796c.mo19954a(this);
        C10774j.m34012a(a);
        return a;
    }

    /* renamed from: a */
    private static <Model, Data> C8306n<Model, Data> m24150a() {
        return f17789f;
    }
}
