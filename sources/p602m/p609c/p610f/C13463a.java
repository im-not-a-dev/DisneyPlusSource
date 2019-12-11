package p602m.p609c.p610f;

import java.util.Queue;
import p602m.p609c.C13459b;
import p602m.p609c.C13462e;
import p602m.p609c.p611g.C13472f;

/* renamed from: m.c.f.a */
/* compiled from: EventRecodingLogger */
public class C13463a implements C13459b {

    /* renamed from: U */
    C13472f f29987U;

    /* renamed from: V */
    Queue<C13466d> f29988V;

    /* renamed from: c */
    String f29989c;

    public C13463a(C13472f fVar, Queue<C13466d> queue) {
        this.f29987U = fVar;
        this.f29989c = fVar.getName();
        this.f29988V = queue;
    }

    /* renamed from: a */
    private void m41439a(C13464b bVar, String str, Object[] objArr, Throwable th) {
        m41440a(bVar, null, str, objArr, th);
    }

    /* renamed from: b */
    public void mo34725b(String str, Object obj) {
        m41439a(C13464b.f29994Y, str, new Object[]{obj}, null);
    }

    /* renamed from: c */
    public void mo34728c(String str) {
        m41439a(C13464b.f29994Y, str, null, null);
    }

    /* renamed from: d */
    public void mo34732d(String str, Object obj) {
        m41439a(C13464b.f29990U, str, new Object[]{obj}, null);
    }

    public String getName() {
        return this.f29989c;
    }

    /* renamed from: a */
    private void m41440a(C13464b bVar, C13462e eVar, String str, Object[] objArr, Throwable th) {
        C13466d dVar = new C13466d();
        dVar.mo34736a(System.currentTimeMillis());
        dVar.mo34740a(bVar);
        dVar.mo34741a(this.f29987U);
        dVar.mo34737a(this.f29989c);
        dVar.mo34739a(eVar);
        dVar.mo34743b(str);
        dVar.mo34742a(objArr);
        dVar.mo34738a(th);
        dVar.mo34744c(Thread.currentThread().getName());
        this.f29988V.add(dVar);
    }

    /* renamed from: b */
    public void mo34724b(String str) {
        m41439a(C13464b.f29991V, str, null, null);
    }

    /* renamed from: c */
    public void mo34729c(String str, Object obj) {
        m41439a(C13464b.f29993X, str, new Object[]{obj}, null);
    }

    /* renamed from: b */
    public void mo34726b(String str, Object obj, Object obj2) {
        m41439a(C13464b.f29991V, str, new Object[]{obj, obj2}, null);
    }

    /* renamed from: c */
    public void mo34731c(String str, Throwable th) {
        m41439a(C13464b.f29993X, str, null, th);
    }

    /* renamed from: b */
    public void mo34727b(String str, Throwable th) {
        m41439a(C13464b.f29991V, str, null, th);
    }

    /* renamed from: c */
    public void mo34730c(String str, Object obj, Object obj2) {
        m41439a(C13464b.f29990U, str, new Object[]{obj, obj2}, null);
    }

    /* renamed from: a */
    public void mo34720a(String str) {
        m41439a(C13464b.f29994Y, str, null, null);
    }

    /* renamed from: a */
    public void mo34722a(String str, Object obj, Object obj2) {
        m41439a(C13464b.f29993X, str, new Object[]{obj, obj2}, null);
    }

    /* renamed from: a */
    public void mo34721a(String str, Object obj) {
        m41439a(C13464b.f29991V, str, new Object[]{obj}, null);
    }

    /* renamed from: a */
    public void mo34723a(String str, Throwable th) {
        m41439a(C13464b.f29990U, str, null, th);
    }
}
