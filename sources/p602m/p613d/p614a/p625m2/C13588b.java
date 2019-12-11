package p602m.p613d.p614a.p625m2;

import java.io.IOException;
import java.util.Enumeration;
import p602m.p613d.p614a.C13501f;
import p602m.p613d.p614a.C13503f1;
import p602m.p613d.p614a.C13508g;
import p602m.p613d.p614a.C13526k;
import p602m.p613d.p614a.C13589n;
import p602m.p613d.p614a.C13641s0;
import p602m.p613d.p614a.C13643t;
import p602m.p613d.p614a.C13646u;

/* renamed from: m.d.a.m2.b */
/* compiled from: SubjectPublicKeyInfo */
public class C13588b extends C13589n {

    /* renamed from: U */
    private C13641s0 f30241U;

    /* renamed from: c */
    private C13587a f30242c;

    public C13588b(C13587a aVar, C13501f fVar) throws IOException {
        this.f30241U = new C13641s0(fVar);
        this.f30242c = aVar;
    }

    /* renamed from: a */
    public static C13588b m41764a(Object obj) {
        if (obj instanceof C13588b) {
            return (C13588b) obj;
        }
        if (obj != null) {
            return new C13588b(C13646u.m41915a(obj));
        }
        return null;
    }

    /* renamed from: e */
    public C13587a mo34824e() {
        return this.f30242c;
    }

    /* renamed from: f */
    public C13641s0 mo34825f() {
        return this.f30241U;
    }

    /* renamed from: g */
    public C13643t mo34826g() throws IOException {
        return new C13526k(this.f30241U.mo34780j()).mo34811d();
    }

    public C13588b(C13587a aVar, byte[] bArr) {
        this.f30241U = new C13641s0(bArr);
        this.f30242c = aVar;
    }

    /* renamed from: a */
    public C13643t mo34785a() {
        C13508g gVar = new C13508g();
        gVar.mo34796a((C13501f) this.f30242c);
        gVar.mo34796a((C13501f) this.f30241U);
        return new C13503f1(gVar);
    }

    public C13588b(C13646u uVar) {
        if (uVar.mo34873j() == 2) {
            Enumeration i = uVar.mo34871i();
            this.f30242c = C13587a.m41760a(i.nextElement());
            this.f30241U = C13641s0.m41890a(i.nextElement());
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Bad sequence size: ");
        sb.append(uVar.mo34873j());
        throw new IllegalArgumentException(sb.toString());
    }
}
