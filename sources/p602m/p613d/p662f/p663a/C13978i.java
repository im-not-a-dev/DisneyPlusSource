package p602m.p613d.p662f.p663a;

import p602m.p613d.p614a.C13501f;
import p602m.p613d.p614a.C13503f1;
import p602m.p613d.p614a.C13508g;
import p602m.p613d.p614a.C13565l;
import p602m.p613d.p614a.C13589n;
import p602m.p613d.p614a.C13643t;
import p602m.p613d.p614a.C13646u;
import p602m.p613d.p614a.p625m2.C13587a;

/* renamed from: m.d.f.a.i */
/* compiled from: XMSSKeyParams */
public class C13978i extends C13589n {

    /* renamed from: U */
    private final int f30885U;

    /* renamed from: V */
    private final C13587a f30886V;

    /* renamed from: c */
    private final C13565l f30887c;

    public C13978i(int i, C13587a aVar) {
        this.f30887c = new C13565l(0);
        this.f30885U = i;
        this.f30886V = aVar;
    }

    /* renamed from: a */
    public static C13978i m44081a(Object obj) {
        if (obj instanceof C13978i) {
            return (C13978i) obj;
        }
        if (obj != null) {
            return new C13978i(C13646u.m41915a(obj));
        }
        return null;
    }

    /* renamed from: e */
    public int mo35325e() {
        return this.f30885U;
    }

    /* renamed from: f */
    public C13587a mo35326f() {
        return this.f30886V;
    }

    /* renamed from: a */
    public C13643t mo34785a() {
        C13508g gVar = new C13508g();
        gVar.mo34796a((C13501f) this.f30887c);
        gVar.mo34796a((C13501f) new C13565l((long) this.f30885U));
        gVar.mo34796a((C13501f) this.f30886V);
        return new C13503f1(gVar);
    }

    private C13978i(C13646u uVar) {
        this.f30887c = C13565l.m41715a((Object) uVar.mo34870a(0));
        this.f30885U = C13565l.m41715a((Object) uVar.mo34870a(1)).mo34814i().intValue();
        this.f30886V = C13587a.m41760a(uVar.mo34870a(2));
    }
}
