package p602m.p613d.p662f.p663a;

import p602m.p613d.p614a.C13484b1;
import p602m.p613d.p614a.C13501f;
import p602m.p613d.p614a.C13503f1;
import p602m.p613d.p614a.C13508g;
import p602m.p613d.p614a.C13565l;
import p602m.p613d.p614a.C13589n;
import p602m.p613d.p614a.C13630p;
import p602m.p613d.p614a.C13643t;
import p602m.p613d.p614a.C13646u;
import p602m.p613d.p662f.p681d.p682a.C14068a;

/* renamed from: m.d.f.a.d */
/* compiled from: McEliecePublicKey */
public class C13973d extends C13589n {

    /* renamed from: U */
    private final int f30858U;

    /* renamed from: V */
    private final C14068a f30859V;

    /* renamed from: c */
    private final int f30860c;

    public C13973d(int i, int i2, C14068a aVar) {
        this.f30860c = i;
        this.f30858U = i2;
        this.f30859V = new C14068a(aVar);
    }

    /* renamed from: a */
    public C13643t mo34785a() {
        C13508g gVar = new C13508g();
        gVar.mo34796a((C13501f) new C13565l((long) this.f30860c));
        gVar.mo34796a((C13501f) new C13565l((long) this.f30858U));
        gVar.mo34796a((C13501f) new C13484b1(this.f30859V.mo35618c()));
        return new C13503f1(gVar);
    }

    /* renamed from: e */
    public C14068a mo35311e() {
        return new C14068a(this.f30859V);
    }

    /* renamed from: f */
    public int mo35312f() {
        return this.f30860c;
    }

    /* renamed from: g */
    public int mo35313g() {
        return this.f30858U;
    }

    private C13973d(C13646u uVar) {
        this.f30860c = ((C13565l) uVar.mo34870a(0)).mo34814i().intValue();
        this.f30858U = ((C13565l) uVar.mo34870a(1)).mo34814i().intValue();
        this.f30859V = new C14068a(((C13630p) uVar.mo34870a(2)).mo34797i());
    }

    /* renamed from: a */
    public static C13973d m44059a(Object obj) {
        if (obj instanceof C13973d) {
            return (C13973d) obj;
        }
        if (obj != null) {
            return new C13973d(C13646u.m41915a(obj));
        }
        return null;
    }
}
