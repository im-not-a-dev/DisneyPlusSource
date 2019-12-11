package p602m.p613d.p614a.p626n2;

import java.math.BigInteger;
import p602m.p613d.p614a.C13501f;
import p602m.p613d.p614a.C13503f1;
import p602m.p613d.p614a.C13508g;
import p602m.p613d.p614a.C13565l;
import p602m.p613d.p614a.C13589n;
import p602m.p613d.p614a.C13626o;
import p602m.p613d.p614a.C13630p;
import p602m.p613d.p614a.C13641s0;
import p602m.p613d.p614a.C13643t;
import p602m.p613d.p614a.C13646u;
import p602m.p613d.p653e.p654a.C13804b;
import p602m.p613d.p653e.p654a.C13806d;
import p602m.p613d.p653e.p654a.C13806d.C13810d;
import p602m.p613d.p653e.p654a.C13806d.C13811e;

/* renamed from: m.d.a.n2.d */
/* compiled from: X9Curve */
public class C13618d extends C13589n implements C13625k {

    /* renamed from: U */
    private byte[] f30274U;

    /* renamed from: V */
    private C13626o f30275V = null;

    /* renamed from: c */
    private C13806d f30276c;

    public C13618d(C13806d dVar, byte[] bArr) {
        this.f30276c = dVar;
        this.f30274U = bArr;
        m41813g();
    }

    /* renamed from: g */
    private void m41813g() {
        if (C13804b.m42353b(this.f30276c)) {
            this.f30275V = C13625k.f30314h;
        } else if (C13804b.m42350a(this.f30276c)) {
            this.f30275V = C13625k.f30315i;
        } else {
            throw new IllegalArgumentException("This type of ECCurve is not implemented");
        }
    }

    /* renamed from: a */
    public C13643t mo34785a() {
        C13508g gVar = new C13508g();
        if (this.f30275V.equals(C13625k.f30314h)) {
            gVar.mo34796a((C13501f) new C13622h(this.f30276c.mo35082d()).mo34785a());
            gVar.mo34796a((C13501f) new C13622h(this.f30276c.mo35083e()).mo34785a());
        } else if (this.f30275V.equals(C13625k.f30315i)) {
            gVar.mo34796a((C13501f) new C13622h(this.f30276c.mo35082d()).mo34785a());
            gVar.mo34796a((C13501f) new C13622h(this.f30276c.mo35083e()).mo34785a());
        }
        byte[] bArr = this.f30274U;
        if (bArr != null) {
            gVar.mo34796a((C13501f) new C13641s0(bArr));
        }
        return new C13503f1(gVar);
    }

    /* renamed from: e */
    public C13806d mo34833e() {
        return this.f30276c;
    }

    /* renamed from: f */
    public byte[] mo34834f() {
        return this.f30274U;
    }

    public C13618d(C13623i iVar, C13646u uVar) {
        int i;
        int i2;
        int i3;
        this.f30275V = iVar.mo34843e();
        if (this.f30275V.equals(C13625k.f30314h)) {
            BigInteger i4 = ((C13565l) iVar.mo34844f()).mo34814i();
            this.f30276c = new C13811e(i4, new C13622h(i4, (C13630p) uVar.mo34870a(0)).mo34842e().mo35117l(), new C13622h(i4, (C13630p) uVar.mo34870a(1)).mo34842e().mo35117l());
        } else if (this.f30275V.equals(C13625k.f30315i)) {
            C13646u a = C13646u.m41915a((Object) iVar.mo34844f());
            int intValue = ((C13565l) a.mo34870a(0)).mo34814i().intValue();
            C13626o oVar = (C13626o) a.mo34870a(1);
            if (oVar.equals(C13625k.f30316j)) {
                i = C13565l.m41715a((Object) a.mo34870a(2)).mo34814i().intValue();
                i3 = 0;
                i2 = 0;
            } else if (oVar.equals(C13625k.f30317k)) {
                C13646u a2 = C13646u.m41915a((Object) a.mo34870a(2));
                int intValue2 = C13565l.m41715a((Object) a2.mo34870a(0)).mo34814i().intValue();
                int intValue3 = C13565l.m41715a((Object) a2.mo34870a(1)).mo34814i().intValue();
                i2 = C13565l.m41715a((Object) a2.mo34870a(2)).mo34814i().intValue();
                i = intValue2;
                i3 = intValue3;
            } else {
                throw new IllegalArgumentException("This type of EC basis is not implemented");
            }
            int i5 = intValue;
            int i6 = i;
            int i7 = i3;
            int i8 = i2;
            C13622h hVar = new C13622h(i5, i6, i7, i8, (C13630p) uVar.mo34870a(0));
            C13622h hVar2 = new C13622h(i5, i6, i7, i8, (C13630p) uVar.mo34870a(1));
            C13810d dVar = new C13810d(i5, i6, i7, i8, hVar.mo34842e().mo35117l(), hVar2.mo34842e().mo35117l());
            this.f30276c = dVar;
        } else {
            throw new IllegalArgumentException("This type of ECCurve is not implemented");
        }
        if (uVar.mo34873j() == 3) {
            this.f30274U = ((C13641s0) uVar.mo34870a(2)).mo34779i();
        }
    }
}
