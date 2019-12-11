package p602m.p613d.p653e.p654a.p655x.p658c;

import java.math.BigInteger;
import p602m.p613d.p653e.p654a.C13812e;
import p602m.p613d.p653e.p661c.C13958b;
import p602m.p613d.p653e.p661c.C13961e;
import p602m.p613d.p683g.C14079a;

/* renamed from: m.d.e.a.x.c.u */
/* compiled from: SecP192R1FieldElement */
public class C13925u extends C13812e {

    /* renamed from: h */
    public static final BigInteger f30806h = C13917s.f30797j;

    /* renamed from: g */
    protected int[] f30807g;

    public C13925u(BigInteger bigInteger) {
        if (bigInteger == null || bigInteger.signum() < 0 || bigInteger.compareTo(f30806h) >= 0) {
            throw new IllegalArgumentException("x value invalid for SecP192R1FieldElement");
        }
        this.f30807g = C13921t.m43558a(bigInteger);
    }

    /* renamed from: a */
    public C13812e mo35100a(C13812e eVar) {
        int[] a = C13961e.m43889a();
        C13921t.m43557a(this.f30807g, ((C13925u) eVar).f30807g, a);
        return new C13925u(a);
    }

    /* renamed from: b */
    public C13812e mo35104b(C13812e eVar) {
        int[] a = C13961e.m43889a();
        C13958b.m43830a(C13921t.f30803a, ((C13925u) eVar).f30807g, a);
        C13921t.m43561b(a, this.f30807g, a);
        return new C13925u(a);
    }

    /* renamed from: c */
    public C13812e mo35106c(C13812e eVar) {
        int[] a = C13961e.m43889a();
        C13921t.m43561b(this.f30807g, ((C13925u) eVar).f30807g, a);
        return new C13925u(a);
    }

    /* renamed from: d */
    public int mo35108d() {
        return f30806h.bitLength();
    }

    /* renamed from: e */
    public C13812e mo35110e() {
        int[] a = C13961e.m43889a();
        C13958b.m43830a(C13921t.f30803a, this.f30807g, a);
        return new C13925u(a);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C13925u)) {
            return false;
        }
        return C13961e.m43886a(this.f30807g, ((C13925u) obj).f30807g);
    }

    /* renamed from: f */
    public boolean mo35111f() {
        return C13961e.m43884a(this.f30807g);
    }

    /* renamed from: g */
    public boolean mo35112g() {
        return C13961e.m43893b(this.f30807g);
    }

    /* renamed from: h */
    public C13812e mo35113h() {
        int[] a = C13961e.m43889a();
        C13921t.m43560b(this.f30807g, a);
        return new C13925u(a);
    }

    public int hashCode() {
        return f30806h.hashCode() ^ C14079a.m44459b(this.f30807g, 0, 6);
    }

    /* renamed from: i */
    public C13812e mo35114i() {
        int[] iArr = this.f30807g;
        if (C13961e.m43893b(iArr) || C13961e.m43884a(iArr)) {
            return this;
        }
        int[] a = C13961e.m43889a();
        int[] a2 = C13961e.m43889a();
        C13921t.m43564d(iArr, a);
        C13921t.m43561b(a, iArr, a);
        C13921t.m43555a(a, 2, a2);
        C13921t.m43561b(a2, a, a2);
        C13921t.m43555a(a2, 4, a);
        C13921t.m43561b(a, a2, a);
        C13921t.m43555a(a, 8, a2);
        C13921t.m43561b(a2, a, a2);
        C13921t.m43555a(a2, 16, a);
        C13921t.m43561b(a, a2, a);
        C13921t.m43555a(a, 32, a2);
        C13921t.m43561b(a2, a, a2);
        C13921t.m43555a(a2, 64, a);
        C13921t.m43561b(a, a2, a);
        C13921t.m43555a(a, 62, a);
        C13921t.m43564d(a, a2);
        return C13961e.m43886a(iArr, a2) ? new C13925u(a) : null;
    }

    /* renamed from: j */
    public C13812e mo35115j() {
        int[] a = C13961e.m43889a();
        C13921t.m43564d(this.f30807g, a);
        return new C13925u(a);
    }

    /* renamed from: k */
    public boolean mo35116k() {
        return C13961e.m43879a(this.f30807g, 0) == 1;
    }

    /* renamed from: l */
    public BigInteger mo35117l() {
        return C13961e.m43900c(this.f30807g);
    }

    /* renamed from: d */
    public C13812e mo35109d(C13812e eVar) {
        int[] a = C13961e.m43889a();
        C13921t.m43565d(this.f30807g, ((C13925u) eVar).f30807g, a);
        return new C13925u(a);
    }

    /* renamed from: a */
    public C13812e mo35098a() {
        int[] a = C13961e.m43889a();
        C13921t.m43556a(this.f30807g, a);
        return new C13925u(a);
    }

    public C13925u() {
        this.f30807g = C13961e.m43889a();
    }

    protected C13925u(int[] iArr) {
        this.f30807g = iArr;
    }
}
