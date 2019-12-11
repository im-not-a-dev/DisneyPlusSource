package p163g.p413f.p414a.p419t;

import com.bumptech.glide.load.C8116j;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: g.f.a.t.e */
/* compiled from: ResourceDecoderRegistry */
public class C10719e {

    /* renamed from: a */
    private final List<String> f25337a = new ArrayList();

    /* renamed from: b */
    private final Map<String, List<C10720a<?, ?>>> f25338b = new HashMap();

    /* renamed from: g.f.a.t.e$a */
    /* compiled from: ResourceDecoderRegistry */
    private static class C10720a<T, R> {

        /* renamed from: a */
        private final Class<T> f25339a;

        /* renamed from: b */
        final Class<R> f25340b;

        /* renamed from: c */
        final C8116j<T, R> f25341c;

        public C10720a(Class<T> cls, Class<R> cls2, C8116j<T, R> jVar) {
            this.f25339a = cls;
            this.f25340b = cls2;
            this.f25341c = jVar;
        }

        /* renamed from: a */
        public boolean mo27682a(Class<?> cls, Class<?> cls2) {
            return this.f25339a.isAssignableFrom(cls) && cls2.isAssignableFrom(this.f25340b);
        }
    }

    /* renamed from: a */
    public synchronized void mo27680a(List<String> list) {
        ArrayList<String> arrayList = new ArrayList<>(this.f25337a);
        this.f25337a.clear();
        this.f25337a.addAll(list);
        for (String str : arrayList) {
            if (!list.contains(str)) {
                this.f25337a.add(str);
            }
        }
    }

    /* renamed from: b */
    public synchronized <T, R> List<Class<R>> mo27681b(Class<T> cls, Class<R> cls2) {
        ArrayList arrayList;
        arrayList = new ArrayList();
        for (String str : this.f25337a) {
            List<C10720a> list = (List) this.f25338b.get(str);
            if (list != null) {
                for (C10720a aVar : list) {
                    if (aVar.mo27682a(cls, cls2) && !arrayList.contains(aVar.f25340b)) {
                        arrayList.add(aVar.f25340b);
                    }
                }
            }
        }
        return arrayList;
    }

    /* renamed from: a */
    public synchronized <T, R> List<C8116j<T, R>> mo27678a(Class<T> cls, Class<R> cls2) {
        ArrayList arrayList;
        arrayList = new ArrayList();
        for (String str : this.f25337a) {
            List<C10720a> list = (List) this.f25338b.get(str);
            if (list != null) {
                for (C10720a aVar : list) {
                    if (aVar.mo27682a(cls, cls2)) {
                        arrayList.add(aVar.f25341c);
                    }
                }
            }
        }
        return arrayList;
    }

    /* renamed from: a */
    public synchronized <T, R> void mo27679a(String str, C8116j<T, R> jVar, Class<T> cls, Class<R> cls2) {
        m33715a(str).add(new C10720a(cls, cls2, jVar));
    }

    /* renamed from: a */
    private synchronized List<C10720a<?, ?>> m33715a(String str) {
        List<C10720a<?, ?>> list;
        if (!this.f25337a.contains(str)) {
            this.f25337a.add(str);
        }
        list = (List) this.f25338b.get(str);
        if (list == null) {
            list = new ArrayList<>();
            this.f25338b.put(str, list);
        }
        return list;
    }
}
