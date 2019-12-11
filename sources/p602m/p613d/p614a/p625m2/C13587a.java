package p602m.p613d.p614a.p625m2;

import p602m.p613d.p614a.C13501f;
import p602m.p613d.p614a.C13503f1;
import p602m.p613d.p614a.C13508g;
import p602m.p613d.p614a.C13589n;
import p602m.p613d.p614a.C13626o;
import p602m.p613d.p614a.C13643t;
import p602m.p613d.p614a.C13646u;

/* renamed from: m.d.a.m2.a */
/* compiled from: AlgorithmIdentifier */
public class C13587a extends C13589n {

    /* renamed from: U */
    private C13501f f30239U;

    /* renamed from: c */
    private C13626o f30240c;

    public C13587a(C13626o oVar) {
        this.f30240c = oVar;
    }

    /* renamed from: a */
    public static C13587a m41760a(Object obj) {
        if (obj instanceof C13587a) {
            return (C13587a) obj;
        }
        if (obj != null) {
            return new C13587a(C13646u.m41915a(obj));
        }
        return null;
    }

    /* renamed from: e */
    public C13626o mo34822e() {
        return this.f30240c;
    }

    /* renamed from: f */
    public C13501f mo34823f() {
        return this.f30239U;
    }

    public C13587a(C13626o oVar, C13501f fVar) {
        this.f30240c = oVar;
        this.f30239U = fVar;
    }

    /* renamed from: a */
    public C13643t mo34785a() {
        C13508g gVar = new C13508g();
        gVar.mo34796a((C13501f) this.f30240c);
        C13501f fVar = this.f30239U;
        if (fVar != null) {
            gVar.mo34796a(fVar);
        }
        return new C13503f1(gVar);
    }

    private C13587a(C13646u uVar) {
        if (uVar.mo34873j() < 1 || uVar.mo34873j() > 2) {
            StringBuilder sb = new StringBuilder();
            sb.append("Bad sequence size: ");
            sb.append(uVar.mo34873j());
            throw new IllegalArgumentException(sb.toString());
        }
        this.f30240c = C13626o.m41837a((Object) uVar.mo34870a(0));
        if (uVar.mo34873j() == 2) {
            this.f30239U = uVar.mo34870a(1);
        } else {
            this.f30239U = null;
        }
    }
}
