package p163g.p413f.p414a.p419t;

import com.bumptech.glide.load.p334n.C8225i;
import com.bumptech.glide.load.p334n.C8255t;
import com.bumptech.glide.load.p341p.p347h.C8432g;
import java.util.Collections;
import java.util.concurrent.atomic.AtomicReference;
import p096e.p113e.C3926a;
import p163g.p413f.p414a.p424w.C10773i;

/* renamed from: g.f.a.t.c */
/* compiled from: LoadPathCache */
public class C10717c {

    /* renamed from: c */
    private static final C8255t<?, ?, ?> f25332c;

    /* renamed from: a */
    private final C3926a<C10773i, C8255t<?, ?, ?>> f25333a = new C3926a<>();

    /* renamed from: b */
    private final AtomicReference<C10773i> f25334b = new AtomicReference<>();

    static {
        C8225i iVar = new C8225i(Object.class, Object.class, Object.class, Collections.emptyList(), new C8432g(), null);
        C8255t tVar = new C8255t(Object.class, Object.class, Object.class, Collections.singletonList(iVar), null);
        f25332c = tVar;
    }

    /* renamed from: b */
    private C10773i m33709b(Class<?> cls, Class<?> cls2, Class<?> cls3) {
        C10773i iVar = (C10773i) this.f25334b.getAndSet(null);
        if (iVar == null) {
            iVar = new C10773i();
        }
        iVar.mo27815a(cls, cls2, cls3);
        return iVar;
    }

    /* renamed from: a */
    public boolean mo27675a(C8255t<?, ?, ?> tVar) {
        return f25332c.equals(tVar);
    }

    /* renamed from: a */
    public <Data, TResource, Transcode> C8255t<Data, TResource, Transcode> mo27673a(Class<Data> cls, Class<TResource> cls2, Class<Transcode> cls3) {
        C8255t<Data, TResource, Transcode> tVar;
        C10773i b = m33709b(cls, cls2, cls3);
        synchronized (this.f25333a) {
            tVar = (C8255t) this.f25333a.get(b);
        }
        this.f25334b.set(b);
        return tVar;
    }

    /* renamed from: a */
    public void mo27674a(Class<?> cls, Class<?> cls2, Class<?> cls3, C8255t<?, ?, ?> tVar) {
        synchronized (this.f25333a) {
            C3926a<C10773i, C8255t<?, ?, ?>> aVar = this.f25333a;
            C10773i iVar = new C10773i(cls, cls2, cls3);
            if (tVar == null) {
                tVar = f25332c;
            }
            aVar.put(iVar, tVar);
        }
    }
}
