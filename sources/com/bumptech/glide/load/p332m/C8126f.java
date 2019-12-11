package com.bumptech.glide.load.p332m;

import com.bumptech.glide.load.p332m.C8124e.C8125a;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import p163g.p413f.p414a.p424w.C10774j;

/* renamed from: com.bumptech.glide.load.m.f */
/* compiled from: DataRewinderRegistry */
public class C8126f {

    /* renamed from: b */
    private static final C8125a<?> f17384b = new C8127a();

    /* renamed from: a */
    private final Map<Class<?>, C8125a<?>> f17385a = new HashMap();

    /* renamed from: com.bumptech.glide.load.m.f$a */
    /* compiled from: DataRewinderRegistry */
    class C8127a implements C8125a<Object> {
        C8127a() {
        }

        /* renamed from: a */
        public C8124e<Object> mo21183a(Object obj) {
            return new C8128b(obj);
        }

        /* renamed from: a */
        public Class<Object> mo21184a() {
            throw new UnsupportedOperationException("Not implemented");
        }
    }

    /* renamed from: com.bumptech.glide.load.m.f$b */
    /* compiled from: DataRewinderRegistry */
    private static final class C8128b implements C8124e<Object> {

        /* renamed from: a */
        private final Object f17386a;

        C8128b(Object obj) {
            this.f17386a = obj;
        }

        /* renamed from: a */
        public Object mo21181a() {
            return this.f17386a;
        }

        public void cleanup() {
        }
    }

    /* renamed from: a */
    public synchronized void mo21186a(C8125a<?> aVar) {
        this.f17385a.put(aVar.mo21184a(), aVar);
    }

    /* renamed from: a */
    public synchronized <T> C8124e<T> mo21185a(T t) {
        C8125a aVar;
        C10774j.m34012a(t);
        aVar = (C8125a) this.f17385a.get(t.getClass());
        if (aVar == null) {
            Iterator it = this.f17385a.values().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                C8125a aVar2 = (C8125a) it.next();
                if (aVar2.mo21184a().isAssignableFrom(t.getClass())) {
                    aVar = aVar2;
                    break;
                }
            }
        }
        if (aVar == null) {
            aVar = f17384b;
        }
        return aVar.mo21183a(t);
    }
}
