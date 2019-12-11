package p602m.p613d.p614a.p623k2;

import java.math.BigInteger;
import java.util.Enumeration;
import p602m.p613d.p614a.C13479a0;
import p602m.p613d.p614a.C13484b1;
import p602m.p613d.p614a.C13501f;
import p602m.p613d.p614a.C13503f1;
import p602m.p613d.p614a.C13508g;
import p602m.p613d.p614a.C13528k1;
import p602m.p613d.p614a.C13565l;
import p602m.p613d.p614a.C13589n;
import p602m.p613d.p614a.C13630p;
import p602m.p613d.p614a.C13641s0;
import p602m.p613d.p614a.C13643t;
import p602m.p613d.p614a.C13646u;
import p602m.p613d.p683g.C14081b;

/* renamed from: m.d.a.k2.a */
/* compiled from: ECPrivateKey */
public class C13529a extends C13589n {

    /* renamed from: c */
    private C13646u f30125c;

    private C13529a(C13646u uVar) {
        this.f30125c = uVar;
    }

    /* renamed from: a */
    public static C13529a m41666a(Object obj) {
        if (obj instanceof C13529a) {
            return (C13529a) obj;
        }
        if (obj != null) {
            return new C13529a(C13646u.m41915a(obj));
        }
        return null;
    }

    /* renamed from: e */
    public BigInteger mo34812e() {
        return new BigInteger(1, ((C13630p) this.f30125c.mo34870a(1)).mo34797i());
    }

    /* renamed from: f */
    public C13641s0 mo34813f() {
        return (C13641s0) m41667a(1);
    }

    public C13529a(int i, BigInteger bigInteger, C13501f fVar) {
        this(i, bigInteger, null, fVar);
    }

    public C13529a(int i, BigInteger bigInteger, C13641s0 s0Var, C13501f fVar) {
        byte[] a = C14081b.m44465a((i + 7) / 8, bigInteger);
        C13508g gVar = new C13508g();
        gVar.mo34796a((C13501f) new C13565l(1));
        gVar.mo34796a((C13501f) new C13484b1(a));
        if (fVar != null) {
            gVar.mo34796a((C13501f) new C13528k1(true, 0, fVar));
        }
        if (s0Var != null) {
            gVar.mo34796a((C13501f) new C13528k1(true, 1, s0Var));
        }
        this.f30125c = new C13503f1(gVar);
    }

    /* renamed from: a */
    private C13643t m41667a(int i) {
        Enumeration i2 = this.f30125c.mo34871i();
        while (i2.hasMoreElements()) {
            C13501f fVar = (C13501f) i2.nextElement();
            if (fVar instanceof C13479a0) {
                C13479a0 a0Var = (C13479a0) fVar;
                if (a0Var.mo34772j() == i) {
                    C13643t i3 = a0Var.mo34771i();
                    i3.mo34785a();
                    return i3;
                }
            }
        }
        return null;
    }

    /* renamed from: a */
    public C13643t mo34785a() {
        return this.f30125c;
    }
}
