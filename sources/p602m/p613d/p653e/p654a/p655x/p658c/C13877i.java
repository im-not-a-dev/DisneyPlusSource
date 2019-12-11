package p602m.p613d.p653e.p654a.p655x.p658c;

import java.math.BigInteger;
import p602m.p613d.p653e.p654a.C13812e;
import p602m.p613d.p653e.p661c.C13958b;
import p602m.p613d.p653e.p661c.C13960d;
import p602m.p613d.p683g.C14079a;

/* renamed from: m.d.e.a.x.c.i */
/* compiled from: SecP160R1FieldElement */
public class C13877i extends C13812e {

    /* renamed from: h */
    public static final BigInteger f30754h = C13869g.f30744j;

    /* renamed from: g */
    protected int[] f30755g;

    public C13877i(BigInteger bigInteger) {
        if (bigInteger == null || bigInteger.signum() < 0 || bigInteger.compareTo(f30754h) >= 0) {
            throw new IllegalArgumentException("x value invalid for SecP160R1FieldElement");
        }
        this.f30755g = C13873h.m43057a(bigInteger);
    }

    /* renamed from: a */
    public C13812e mo35100a(C13812e eVar) {
        int[] a = C13960d.m43863a();
        C13873h.m43056a(this.f30755g, ((C13877i) eVar).f30755g, a);
        return new C13877i(a);
    }

    /* renamed from: b */
    public C13812e mo35104b(C13812e eVar) {
        int[] a = C13960d.m43863a();
        C13958b.m43830a(C13873h.f30750a, ((C13877i) eVar).f30755g, a);
        C13873h.m43059b(a, this.f30755g, a);
        return new C13877i(a);
    }

    /* renamed from: c */
    public C13812e mo35106c(C13812e eVar) {
        int[] a = C13960d.m43863a();
        C13873h.m43059b(this.f30755g, ((C13877i) eVar).f30755g, a);
        return new C13877i(a);
    }

    /* renamed from: d */
    public int mo35108d() {
        return f30754h.bitLength();
    }

    /* renamed from: e */
    public C13812e mo35110e() {
        int[] a = C13960d.m43863a();
        C13958b.m43830a(C13873h.f30750a, this.f30755g, a);
        return new C13877i(a);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C13877i)) {
            return false;
        }
        return C13960d.m43862a(this.f30755g, ((C13877i) obj).f30755g);
    }

    /* renamed from: f */
    public boolean mo35111f() {
        return C13960d.m43861a(this.f30755g);
    }

    /* renamed from: g */
    public boolean mo35112g() {
        return C13960d.m43867b(this.f30755g);
    }

    /* renamed from: h */
    public C13812e mo35113h() {
        int[] a = C13960d.m43863a();
        C13873h.m43058b(this.f30755g, a);
        return new C13877i(a);
    }

    public int hashCode() {
        return f30754h.hashCode() ^ C14079a.m44459b(this.f30755g, 0, 5);
    }

    /* renamed from: i */
    public C13812e mo35114i() {
        int[] iArr = this.f30755g;
        if (C13960d.m43867b(iArr) || C13960d.m43861a(iArr)) {
            return this;
        }
        int[] a = C13960d.m43863a();
        C13873h.m43062d(iArr, a);
        C13873h.m43059b(a, iArr, a);
        int[] a2 = C13960d.m43863a();
        C13873h.m43054a(a, 2, a2);
        C13873h.m43059b(a2, a, a2);
        C13873h.m43054a(a2, 4, a);
        C13873h.m43059b(a, a2, a);
        C13873h.m43054a(a, 8, a2);
        C13873h.m43059b(a2, a, a2);
        C13873h.m43054a(a2, 16, a);
        C13873h.m43059b(a, a2, a);
        C13873h.m43054a(a, 32, a2);
        C13873h.m43059b(a2, a, a2);
        C13873h.m43054a(a2, 64, a);
        C13873h.m43059b(a, a2, a);
        C13873h.m43062d(a, a2);
        C13873h.m43059b(a2, iArr, a2);
        C13873h.m43054a(a2, 29, a2);
        C13873h.m43062d(a2, a);
        return C13960d.m43862a(iArr, a) ? new C13877i(a2) : null;
    }

    /* renamed from: j */
    public C13812e mo35115j() {
        int[] a = C13960d.m43863a();
        C13873h.m43062d(this.f30755g, a);
        return new C13877i(a);
    }

    /* renamed from: k */
    public boolean mo35116k() {
        return C13960d.m43858a(this.f30755g, 0) == 1;
    }

    /* renamed from: l */
    public BigInteger mo35117l() {
        return C13960d.m43870c(this.f30755g);
    }

    /* renamed from: d */
    public C13812e mo35109d(C13812e eVar) {
        int[] a = C13960d.m43863a();
        C13873h.m43063d(this.f30755g, ((C13877i) eVar).f30755g, a);
        return new C13877i(a);
    }

    /* renamed from: a */
    public C13812e mo35098a() {
        int[] a = C13960d.m43863a();
        C13873h.m43055a(this.f30755g, a);
        return new C13877i(a);
    }

    public C13877i() {
        this.f30755g = C13960d.m43863a();
    }

    protected C13877i(int[] iArr) {
        this.f30755g = iArr;
    }
}
