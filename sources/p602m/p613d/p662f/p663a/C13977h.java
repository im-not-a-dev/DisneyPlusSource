package p602m.p613d.p662f.p663a;

import p602m.p613d.p614a.C13501f;
import p602m.p613d.p614a.C13503f1;
import p602m.p613d.p614a.C13508g;
import p602m.p613d.p614a.C13565l;
import p602m.p613d.p614a.C13589n;
import p602m.p613d.p614a.C13643t;
import p602m.p613d.p614a.C13646u;
import p602m.p613d.p614a.p625m2.C13587a;

/* renamed from: m.d.f.a.h */
/* compiled from: SPHINCS256KeyParams */
public class C13977h extends C13589n {

    /* renamed from: U */
    private final C13587a f30883U;

    /* renamed from: c */
    private final C13565l f30884c;

    public C13977h(C13587a aVar) {
        this.f30884c = new C13565l(0);
        this.f30883U = aVar;
    }

    /* renamed from: a */
    public static final C13977h m44078a(Object obj) {
        if (obj instanceof C13977h) {
            return (C13977h) obj;
        }
        if (obj != null) {
            return new C13977h(C13646u.m41915a(obj));
        }
        return null;
    }

    /* renamed from: e */
    public C13587a mo35324e() {
        return this.f30883U;
    }

    private C13977h(C13646u uVar) {
        this.f30884c = C13565l.m41715a((Object) uVar.mo34870a(0));
        this.f30883U = C13587a.m41760a(uVar.mo34870a(1));
    }

    /* renamed from: a */
    public C13643t mo34785a() {
        C13508g gVar = new C13508g();
        gVar.mo34796a((C13501f) this.f30884c);
        gVar.mo34796a((C13501f) this.f30883U);
        return new C13503f1(gVar);
    }
}
