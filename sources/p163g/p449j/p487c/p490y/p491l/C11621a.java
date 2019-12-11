package p163g.p449j.p487c.p490y.p491l;

import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Type;
import java.util.ArrayList;
import p163g.p449j.p487c.C11547f;
import p163g.p449j.p487c.C11571v;
import p163g.p449j.p487c.C11573w;
import p163g.p449j.p487c.p488a0.C11533a;
import p163g.p449j.p487c.p488a0.C11535b;
import p163g.p449j.p487c.p488a0.C11536c;
import p163g.p449j.p487c.p490y.C11580b;
import p163g.p449j.p487c.p493z.C11689a;

/* renamed from: g.j.c.y.l.a */
/* compiled from: ArrayTypeAdapter */
public final class C11621a<E> extends C11571v<Object> {

    /* renamed from: c */
    public static final C11573w f27093c = new C11622a();

    /* renamed from: a */
    private final Class<E> f27094a;

    /* renamed from: b */
    private final C11571v<E> f27095b;

    /* renamed from: g.j.c.y.l.a$a */
    /* compiled from: ArrayTypeAdapter */
    static class C11622a implements C11573w {
        C11622a() {
        }

        /* renamed from: a */
        public <T> C11571v<T> mo16202a(C11547f fVar, C11689a<T> aVar) {
            Type b = aVar.mo29702b();
            if (!(b instanceof GenericArrayType) && (!(b instanceof Class) || !((Class) b).isArray())) {
                return null;
            }
            Type d = C11580b.m37347d(b);
            return new C11621a(fVar, fVar.mo29510a(C11689a.m37637a(d)), C11580b.m37348e(d));
        }
    }

    public C11621a(C11547f fVar, C11571v<E> vVar, Class<E> cls) {
        this.f27095b = new C11648m(fVar, vVar, cls);
        this.f27094a = cls;
    }

    /* renamed from: a */
    public Object mo29458a(C11533a aVar) throws IOException {
        if (aVar.peek() == C11535b.NULL) {
            aVar.mo29478n();
            return null;
        }
        ArrayList arrayList = new ArrayList();
        aVar.mo29462a();
        while (aVar.mo29469f()) {
            arrayList.add(this.f27095b.mo29458a(aVar));
        }
        aVar.mo29467d();
        int size = arrayList.size();
        Object newInstance = Array.newInstance(this.f27094a, size);
        for (int i = 0; i < size; i++) {
            Array.set(newInstance, i, arrayList.get(i));
        }
        return newInstance;
    }

    /* renamed from: a */
    public void mo29459a(C11536c cVar, Object obj) throws IOException {
        if (obj == null) {
            cVar.mo29503h();
            return;
        }
        cVar.mo29484a();
        int length = Array.getLength(obj);
        for (int i = 0; i < length; i++) {
            this.f27095b.mo29459a(cVar, Array.get(obj, i));
        }
        cVar.mo29491c();
    }
}
