package p163g.p449j.p487c.p490y.p491l;

import java.io.IOException;
import p163g.p449j.p487c.C11547f;
import p163g.p449j.p487c.C11557j;
import p163g.p449j.p487c.C11558k;
import p163g.p449j.p487c.C11559l;
import p163g.p449j.p487c.C11565r;
import p163g.p449j.p487c.C11566s;
import p163g.p449j.p487c.C11571v;
import p163g.p449j.p487c.C11573w;
import p163g.p449j.p487c.p488a0.C11533a;
import p163g.p449j.p487c.p488a0.C11536c;
import p163g.p449j.p487c.p490y.C11613j;
import p163g.p449j.p487c.p493z.C11689a;

/* renamed from: g.j.c.y.l.l */
/* compiled from: TreeTypeAdapter */
public final class C11645l<T> extends C11571v<T> {

    /* renamed from: a */
    private final C11566s<T> f27141a;

    /* renamed from: b */
    private final C11558k<T> f27142b;

    /* renamed from: c */
    final C11547f f27143c;

    /* renamed from: d */
    private final C11689a<T> f27144d;

    /* renamed from: e */
    private final C11573w f27145e;

    /* renamed from: f */
    private final C11647b f27146f = new C11647b<>();

    /* renamed from: g */
    private C11571v<T> f27147g;

    /* renamed from: g.j.c.y.l.l$b */
    /* compiled from: TreeTypeAdapter */
    private final class C11647b implements C11565r, C11557j {
        private C11647b(C11645l lVar) {
        }
    }

    public C11645l(C11566s<T> sVar, C11558k<T> kVar, C11547f fVar, C11689a<T> aVar, C11573w wVar) {
        this.f27141a = sVar;
        this.f27142b = kVar;
        this.f27143c = fVar;
        this.f27144d = aVar;
        this.f27145e = wVar;
    }

    /* renamed from: b */
    private C11571v<T> m37494b() {
        C11571v<T> vVar = this.f27147g;
        if (vVar != null) {
            return vVar;
        }
        C11571v<T> a = this.f27143c.mo29509a(this.f27145e, this.f27144d);
        this.f27147g = a;
        return a;
    }

    /* renamed from: a */
    public T mo29458a(C11533a aVar) throws IOException {
        if (this.f27142b == null) {
            return m37494b().mo29458a(aVar);
        }
        C11559l a = C11613j.m37401a(aVar);
        if (a.mo29542f()) {
            return null;
        }
        return this.f27142b.mo29537a(a, this.f27144d.mo29702b(), this.f27146f);
    }

    /* renamed from: a */
    public void mo29459a(C11536c cVar, T t) throws IOException {
        C11566s<T> sVar = this.f27141a;
        if (sVar == null) {
            m37494b().mo29459a(cVar, t);
        } else if (t == null) {
            cVar.mo29503h();
        } else {
            C11613j.m37403a(sVar.mo29565a(t, this.f27144d.mo29702b(), this.f27146f), cVar);
        }
    }
}
