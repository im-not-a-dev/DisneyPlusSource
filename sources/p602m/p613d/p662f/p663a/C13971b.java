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
import p602m.p613d.p614a.p625m2.C13587a;
import p602m.p613d.p662f.p681d.p682a.C14068a;

/* renamed from: m.d.f.a.b */
/* compiled from: McElieceCCA2PublicKey */
public class C13971b extends C13589n {

    /* renamed from: U */
    private final int f30847U;

    /* renamed from: V */
    private final C14068a f30848V;

    /* renamed from: W */
    private final C13587a f30849W;

    /* renamed from: c */
    private final int f30850c;

    public C13971b(int i, int i2, C14068a aVar, C13587a aVar2) {
        this.f30850c = i;
        this.f30847U = i2;
        this.f30848V = new C14068a(aVar.mo35618c());
        this.f30849W = aVar2;
    }

    /* renamed from: a */
    public C13643t mo34785a() {
        C13508g gVar = new C13508g();
        gVar.mo34796a((C13501f) new C13565l((long) this.f30850c));
        gVar.mo34796a((C13501f) new C13565l((long) this.f30847U));
        gVar.mo34796a((C13501f) new C13484b1(this.f30848V.mo35618c()));
        gVar.mo34796a((C13501f) this.f30849W);
        return new C13503f1(gVar);
    }

    /* renamed from: e */
    public C13587a mo35300e() {
        return this.f30849W;
    }

    /* renamed from: f */
    public C14068a mo35301f() {
        return this.f30848V;
    }

    /* renamed from: g */
    public int mo35302g() {
        return this.f30850c;
    }

    /* renamed from: h */
    public int mo35303h() {
        return this.f30847U;
    }

    private C13971b(C13646u uVar) {
        this.f30850c = ((C13565l) uVar.mo34870a(0)).mo34814i().intValue();
        this.f30847U = ((C13565l) uVar.mo34870a(1)).mo34814i().intValue();
        this.f30848V = new C14068a(((C13630p) uVar.mo34870a(2)).mo34797i());
        this.f30849W = C13587a.m41760a(uVar.mo34870a(3));
    }

    /* renamed from: a */
    public static C13971b m44044a(Object obj) {
        if (obj instanceof C13971b) {
            return (C13971b) obj;
        }
        if (obj != null) {
            return new C13971b(C13646u.m41915a(obj));
        }
        return null;
    }
}
