package p602m.p613d.p662f.p663a;

import p602m.p613d.p614a.C13501f;
import p602m.p613d.p614a.C13503f1;
import p602m.p613d.p614a.C13508g;
import p602m.p613d.p614a.C13565l;
import p602m.p613d.p614a.C13589n;
import p602m.p613d.p614a.C13643t;
import p602m.p613d.p614a.C13646u;
import p602m.p613d.p614a.p625m2.C13587a;

/* renamed from: m.d.f.a.j */
/* compiled from: XMSSMTKeyParams */
public class C13979j extends C13589n {

    /* renamed from: U */
    private final int f30888U;

    /* renamed from: V */
    private final int f30889V;

    /* renamed from: W */
    private final C13587a f30890W;

    /* renamed from: c */
    private final C13565l f30891c;

    public C13979j(int i, int i2, C13587a aVar) {
        this.f30891c = new C13565l(0);
        this.f30888U = i;
        this.f30889V = i2;
        this.f30890W = aVar;
    }

    /* renamed from: a */
    public static C13979j m44085a(Object obj) {
        if (obj instanceof C13979j) {
            return (C13979j) obj;
        }
        if (obj != null) {
            return new C13979j(C13646u.m41915a(obj));
        }
        return null;
    }

    /* renamed from: e */
    public int mo35327e() {
        return this.f30888U;
    }

    /* renamed from: f */
    public int mo35328f() {
        return this.f30889V;
    }

    /* renamed from: g */
    public C13587a mo35329g() {
        return this.f30890W;
    }

    /* renamed from: a */
    public C13643t mo34785a() {
        C13508g gVar = new C13508g();
        gVar.mo34796a((C13501f) this.f30891c);
        gVar.mo34796a((C13501f) new C13565l((long) this.f30888U));
        gVar.mo34796a((C13501f) new C13565l((long) this.f30889V));
        gVar.mo34796a((C13501f) this.f30890W);
        return new C13503f1(gVar);
    }

    private C13979j(C13646u uVar) {
        this.f30891c = C13565l.m41715a((Object) uVar.mo34870a(0));
        this.f30888U = C13565l.m41715a((Object) uVar.mo34870a(1)).mo34814i().intValue();
        this.f30889V = C13565l.m41715a((Object) uVar.mo34870a(2)).mo34814i().intValue();
        this.f30890W = C13587a.m41760a(uVar.mo34870a(3));
    }
}
