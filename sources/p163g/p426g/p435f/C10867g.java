package p163g.p426g.p435f;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import p163g.p426g.p427a.C10790b;
import p163g.p426g.p427a.C10811c;
import p163g.p426g.p427a.C10812d;
import p163g.p426g.p427a.C10816g;
import p163g.p426g.p436g.C10872c;
import p163g.p426g.p436g.C10880i;
import p163g.p426g.p436g.C10883k;

/* renamed from: g.g.f.g */
/* compiled from: SessionFactory */
public class C10867g {

    /* renamed from: a */
    private C10790b f25744a;

    /* renamed from: b */
    private C10811c f25745b;

    /* renamed from: c */
    private C10872c f25746c;

    /* renamed from: d */
    private C10816g f25747d;

    /* renamed from: e */
    private C10880i f25748e;

    /* renamed from: f */
    private int f25749f = 0;

    /* renamed from: g */
    private Map<Integer, C10863f> f25750g = null;

    /* renamed from: h */
    private Map<Integer, Integer> f25751h = null;

    /* renamed from: g.g.f.g$a */
    /* compiled from: SessionFactory */
    public enum C10868a {
        AD,
        VIDEO,
        GLOBAL
    }

    public C10867g(C10790b bVar, C10811c cVar, C10872c cVar2, C10816g gVar) {
        this.f25744a = bVar;
        this.f25745b = cVar;
        this.f25746c = cVar2;
        this.f25747d = gVar;
        this.f25748e = this.f25747d.mo27862f();
        this.f25748e.mo27989b("SessionFactory");
        this.f25749f = 0;
        this.f25750g = new HashMap();
        this.f25751h = new HashMap();
    }

    /* renamed from: c */
    private C10856c m34286c() {
        return new C10856c();
    }

    /* renamed from: d */
    private int m34287d() {
        int i = this.f25749f;
        this.f25749f = i + 1;
        return i;
    }

    /* renamed from: a */
    public void mo27973a() {
        Map<Integer, C10863f> map = this.f25750g;
        if (map != null) {
            Iterator it = map.entrySet().iterator();
            while (it.hasNext()) {
                mo27974a(((Integer) ((Entry) it.next()).getKey()).intValue(), false);
                it.remove();
            }
        }
        this.f25750g = null;
        this.f25751h = null;
        this.f25749f = 0;
        this.f25748e = null;
    }

    /* renamed from: b */
    public int mo27975b() {
        return C10883k.m34337a();
    }

    /* renamed from: a */
    public int mo27971a(C10812d dVar) {
        return m34281a(dVar, C10868a.VIDEO);
    }

    /* renamed from: a */
    private C10863f m34283a(int i, C10856c cVar, C10812d dVar, C10858e eVar, C10868a aVar) {
        C10863f fVar = new C10863f(i, cVar, dVar, eVar, this.f25744a, this.f25745b, this.f25746c, this.f25747d, aVar);
        return fVar;
    }

    /* renamed from: a */
    private C10858e m34282a(int i, C10856c cVar, C10812d dVar) {
        return new C10858e(i, cVar, dVar, this.f25747d);
    }

    /* renamed from: a */
    private int m34281a(C10812d dVar, C10868a aVar) {
        C10863f fVar;
        int b = mo27975b();
        C10856c c = m34286c();
        if (C10868a.AD.equals(aVar)) {
            fVar = m34283a(b, c, dVar, m34282a(b, c, dVar), aVar);
        } else {
            C10812d dVar2 = new C10812d(dVar);
            boolean z = dVar.f25560h;
            if (z) {
                dVar2.f25554b.put("c3.video.offlinePlayback", String.valueOf(z));
            }
            if (C10868a.GLOBAL.equals(aVar)) {
                fVar = m34283a(b, c, dVar2, null, aVar);
            } else {
                fVar = m34283a(b, c, dVar2, m34282a(b, c, dVar2), aVar);
            }
        }
        int d = m34287d();
        m34285a(d, fVar);
        m34284a(d, b);
        fVar.mo27968i();
        return d;
    }

    /* renamed from: a */
    public C10863f mo27972a(int i) {
        C10863f fVar = (C10863f) this.f25750g.get(Integer.valueOf(i));
        if (fVar != null && !fVar.mo27965f()) {
            return fVar;
        }
        this.f25748e.mo27988a("Client: invalid sessionId. Did you cleanup that session previously?");
        return null;
    }

    /* renamed from: a */
    private void m34285a(int i, C10863f fVar) {
        this.f25750g.put(Integer.valueOf(i), fVar);
    }

    /* renamed from: a */
    private void m34284a(int i, int i2) {
        this.f25751h.put(Integer.valueOf(i), Integer.valueOf(i2));
    }

    /* renamed from: a */
    public void mo27974a(int i, boolean z) {
        C10863f fVar = (C10863f) this.f25750g.get(Integer.valueOf(i));
        if (fVar != null) {
            if (z) {
                this.f25750g.remove(Integer.valueOf(i));
                this.f25751h.remove(Integer.valueOf(i));
            }
            C10880i iVar = this.f25748e;
            StringBuilder sb = new StringBuilder();
            sb.append("session id(");
            sb.append(i);
            sb.append(") is cleaned up and removed from sessionFactory");
            iVar.mo27993d(sb.toString());
            fVar.mo27961b();
        }
    }
}
