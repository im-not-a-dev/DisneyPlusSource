package p602m.p613d.p614a.p626n2;

import p602m.p613d.p614a.C13496e;
import p602m.p613d.p614a.C13584m;
import p602m.p613d.p614a.C13589n;
import p602m.p613d.p614a.C13626o;
import p602m.p613d.p614a.C13643t;

/* renamed from: m.d.a.n2.c */
/* compiled from: X962Parameters */
public class C13617c extends C13589n implements C13496e {

    /* renamed from: c */
    private C13643t f30273c = null;

    public C13617c(C13619e eVar) {
        this.f30273c = eVar.mo34785a();
    }

    /* renamed from: a */
    public static C13617c m41808a(Object obj) {
        if (obj == null || (obj instanceof C13617c)) {
            return (C13617c) obj;
        }
        if (obj instanceof C13643t) {
            return new C13617c((C13643t) obj);
        }
        if (obj instanceof byte[]) {
            try {
                return new C13617c(C13643t.m41897a((byte[]) obj));
            } catch (Exception e) {
                StringBuilder sb = new StringBuilder();
                sb.append("unable to parse encoded data: ");
                sb.append(e.getMessage());
                throw new IllegalArgumentException(sb.toString());
            }
        } else {
            throw new IllegalArgumentException("unknown object in getInstance()");
        }
    }

    /* renamed from: e */
    public C13643t mo34830e() {
        return this.f30273c;
    }

    /* renamed from: f */
    public boolean mo34831f() {
        return this.f30273c instanceof C13584m;
    }

    /* renamed from: g */
    public boolean mo34832g() {
        return this.f30273c instanceof C13626o;
    }

    public C13617c(C13626o oVar) {
        this.f30273c = oVar;
    }

    public C13617c(C13584m mVar) {
        this.f30273c = mVar;
    }

    /* renamed from: a */
    public C13643t mo34785a() {
        return this.f30273c;
    }

    public C13617c(C13643t tVar) {
        this.f30273c = tVar;
    }
}
