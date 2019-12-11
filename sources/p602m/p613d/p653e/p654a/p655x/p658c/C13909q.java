package p602m.p613d.p653e.p654a.p655x.p658c;

import java.math.BigInteger;
import p602m.p613d.p653e.p654a.C13812e;
import p602m.p613d.p653e.p661c.C13958b;
import p602m.p613d.p653e.p661c.C13961e;
import p602m.p613d.p683g.C14079a;

/* renamed from: m.d.e.a.x.c.q */
/* compiled from: SecP192K1FieldElement */
public class C13909q extends C13812e {

    /* renamed from: h */
    public static final BigInteger f30789h = C13901o.f30780j;

    /* renamed from: g */
    protected int[] f30790g;

    public C13909q(BigInteger bigInteger) {
        if (bigInteger == null || bigInteger.signum() < 0 || bigInteger.compareTo(f30789h) >= 0) {
            throw new IllegalArgumentException("x value invalid for SecP192K1FieldElement");
        }
        this.f30790g = C13905p.m43381a(bigInteger);
    }

    /* renamed from: a */
    public C13812e mo35100a(C13812e eVar) {
        int[] a = C13961e.m43889a();
        C13905p.m43380a(this.f30790g, ((C13909q) eVar).f30790g, a);
        return new C13909q(a);
    }

    /* renamed from: b */
    public C13812e mo35104b(C13812e eVar) {
        int[] a = C13961e.m43889a();
        C13958b.m43830a(C13905p.f30785a, ((C13909q) eVar).f30790g, a);
        C13905p.m43383b(a, this.f30790g, a);
        return new C13909q(a);
    }

    /* renamed from: c */
    public C13812e mo35106c(C13812e eVar) {
        int[] a = C13961e.m43889a();
        C13905p.m43383b(this.f30790g, ((C13909q) eVar).f30790g, a);
        return new C13909q(a);
    }

    /* renamed from: d */
    public int mo35108d() {
        return f30789h.bitLength();
    }

    /* renamed from: e */
    public C13812e mo35110e() {
        int[] a = C13961e.m43889a();
        C13958b.m43830a(C13905p.f30785a, this.f30790g, a);
        return new C13909q(a);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C13909q)) {
            return false;
        }
        return C13961e.m43886a(this.f30790g, ((C13909q) obj).f30790g);
    }

    /* renamed from: f */
    public boolean mo35111f() {
        return C13961e.m43884a(this.f30790g);
    }

    /* renamed from: g */
    public boolean mo35112g() {
        return C13961e.m43893b(this.f30790g);
    }

    /* renamed from: h */
    public C13812e mo35113h() {
        int[] a = C13961e.m43889a();
        C13905p.m43382b(this.f30790g, a);
        return new C13909q(a);
    }

    public int hashCode() {
        return f30789h.hashCode() ^ C14079a.m44459b(this.f30790g, 0, 6);
    }

    /* renamed from: i */
    public C13812e mo35114i() {
        int[] iArr = this.f30790g;
        if (C13961e.m43893b(iArr) || C13961e.m43884a(iArr)) {
            return this;
        }
        int[] a = C13961e.m43889a();
        C13905p.m43386d(iArr, a);
        C13905p.m43383b(a, iArr, a);
        int[] a2 = C13961e.m43889a();
        C13905p.m43386d(a, a2);
        C13905p.m43383b(a2, iArr, a2);
        int[] a3 = C13961e.m43889a();
        C13905p.m43378a(a2, 3, a3);
        C13905p.m43383b(a3, a2, a3);
        C13905p.m43378a(a3, 2, a3);
        C13905p.m43383b(a3, a, a3);
        C13905p.m43378a(a3, 8, a);
        C13905p.m43383b(a, a3, a);
        C13905p.m43378a(a, 3, a3);
        C13905p.m43383b(a3, a2, a3);
        int[] a4 = C13961e.m43889a();
        C13905p.m43378a(a3, 16, a4);
        C13905p.m43383b(a4, a, a4);
        C13905p.m43378a(a4, 35, a);
        C13905p.m43383b(a, a4, a);
        C13905p.m43378a(a, 70, a4);
        C13905p.m43383b(a4, a, a4);
        C13905p.m43378a(a4, 19, a);
        C13905p.m43383b(a, a3, a);
        C13905p.m43378a(a, 20, a);
        C13905p.m43383b(a, a3, a);
        C13905p.m43378a(a, 4, a);
        C13905p.m43383b(a, a2, a);
        C13905p.m43378a(a, 6, a);
        C13905p.m43383b(a, a2, a);
        C13905p.m43386d(a, a);
        C13905p.m43386d(a, a2);
        return C13961e.m43886a(iArr, a2) ? new C13909q(a) : null;
    }

    /* renamed from: j */
    public C13812e mo35115j() {
        int[] a = C13961e.m43889a();
        C13905p.m43386d(this.f30790g, a);
        return new C13909q(a);
    }

    /* renamed from: k */
    public boolean mo35116k() {
        return C13961e.m43879a(this.f30790g, 0) == 1;
    }

    /* renamed from: l */
    public BigInteger mo35117l() {
        return C13961e.m43900c(this.f30790g);
    }

    /* renamed from: d */
    public C13812e mo35109d(C13812e eVar) {
        int[] a = C13961e.m43889a();
        C13905p.m43387d(this.f30790g, ((C13909q) eVar).f30790g, a);
        return new C13909q(a);
    }

    /* renamed from: a */
    public C13812e mo35098a() {
        int[] a = C13961e.m43889a();
        C13905p.m43379a(this.f30790g, a);
        return new C13909q(a);
    }

    public C13909q() {
        this.f30790g = C13961e.m43889a();
    }

    protected C13909q(int[] iArr) {
        this.f30790g = iArr;
    }
}
