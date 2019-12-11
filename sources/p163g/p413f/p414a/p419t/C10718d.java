package p163g.p413f.p414a.p419t;

import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
import p096e.p113e.C3926a;
import p163g.p413f.p414a.p424w.C10773i;

/* renamed from: g.f.a.t.d */
/* compiled from: ModelToResourceClassCache */
public class C10718d {

    /* renamed from: a */
    private final AtomicReference<C10773i> f25335a = new AtomicReference<>();

    /* renamed from: b */
    private final C3926a<C10773i, List<Class<?>>> f25336b = new C3926a<>();

    /* renamed from: a */
    public List<Class<?>> mo27676a(Class<?> cls, Class<?> cls2, Class<?> cls3) {
        List<Class<?>> list;
        C10773i iVar = (C10773i) this.f25335a.getAndSet(null);
        if (iVar == null) {
            iVar = new C10773i(cls, cls2, cls3);
        } else {
            iVar.mo27815a(cls, cls2, cls3);
        }
        synchronized (this.f25336b) {
            list = (List) this.f25336b.get(iVar);
        }
        this.f25335a.set(iVar);
        return list;
    }

    /* renamed from: a */
    public void mo27677a(Class<?> cls, Class<?> cls2, Class<?> cls3, List<Class<?>> list) {
        synchronized (this.f25336b) {
            this.f25336b.put(new C10773i(cls, cls2, cls3), list);
        }
    }
}
