package p602m.p613d.p653e.p654a.p655x.p658c;

import java.math.BigInteger;
import p602m.p613d.p653e.p654a.C13812e;
import p602m.p613d.p653e.p661c.C13958b;
import p602m.p613d.p653e.p661c.C13960d;
import p602m.p613d.p683g.C14079a;

/* renamed from: m.d.e.a.x.c.m */
/* compiled from: SecP160R2FieldElement */
public class C13893m extends C13812e {

    /* renamed from: h */
    public static final BigInteger f30771h = C13885k.f30762j;

    /* renamed from: g */
    protected int[] f30772g;

    public C13893m(BigInteger bigInteger) {
        if (bigInteger == null || bigInteger.signum() < 0 || bigInteger.compareTo(f30771h) >= 0) {
            throw new IllegalArgumentException("x value invalid for SecP160R2FieldElement");
        }
        this.f30772g = C13889l.m43219a(bigInteger);
    }

    /* renamed from: a */
    public C13812e mo35100a(C13812e eVar) {
        int[] a = C13960d.m43863a();
        C13889l.m43218a(this.f30772g, ((C13893m) eVar).f30772g, a);
        return new C13893m(a);
    }

    /* renamed from: b */
    public C13812e mo35104b(C13812e eVar) {
        int[] a = C13960d.m43863a();
        C13958b.m43830a(C13889l.f30767a, ((C13893m) eVar).f30772g, a);
        C13889l.m43221b(a, this.f30772g, a);
        return new C13893m(a);
    }

    /* renamed from: c */
    public C13812e mo35106c(C13812e eVar) {
        int[] a = C13960d.m43863a();
        C13889l.m43221b(this.f30772g, ((C13893m) eVar).f30772g, a);
        return new C13893m(a);
    }

    /* renamed from: d */
    public int mo35108d() {
        return f30771h.bitLength();
    }

    /* renamed from: e */
    public C13812e mo35110e() {
        int[] a = C13960d.m43863a();
        C13958b.m43830a(C13889l.f30767a, this.f30772g, a);
        return new C13893m(a);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C13893m)) {
            return false;
        }
        return C13960d.m43862a(this.f30772g, ((C13893m) obj).f30772g);
    }

    /* renamed from: f */
    public boolean mo35111f() {
        return C13960d.m43861a(this.f30772g);
    }

    /* renamed from: g */
    public boolean mo35112g() {
        return C13960d.m43867b(this.f30772g);
    }

    /* renamed from: h */
    public C13812e mo35113h() {
        int[] a = C13960d.m43863a();
        C13889l.m43220b(this.f30772g, a);
        return new C13893m(a);
    }

    public int hashCode() {
        return f30771h.hashCode() ^ C14079a.m44459b(this.f30772g, 0, 5);
    }

    /* renamed from: i */
    public C13812e mo35114i() {
        int[] iArr = this.f30772g;
        if (C13960d.m43867b(iArr) || C13960d.m43861a(iArr)) {
            return this;
        }
        int[] a = C13960d.m43863a();
        C13889l.m43224d(iArr, a);
        C13889l.m43221b(a, iArr, a);
        int[] a2 = C13960d.m43863a();
        C13889l.m43224d(a, a2);
        C13889l.m43221b(a2, iArr, a2);
        int[] a3 = C13960d.m43863a();
        C13889l.m43224d(a2, a3);
        C13889l.m43221b(a3, iArr, a3);
        int[] a4 = C13960d.m43863a();
        C13889l.m43216a(a3, 3, a4);
        C13889l.m43221b(a4, a2, a4);
        C13889l.m43216a(a4, 7, a3);
        C13889l.m43221b(a3, a4, a3);
        C13889l.m43216a(a3, 3, a4);
        C13889l.m43221b(a4, a2, a4);
        int[] a5 = C13960d.m43863a();
        C13889l.m43216a(a4, 14, a5);
        C13889l.m43221b(a5, a3, a5);
        C13889l.m43216a(a5, 31, a3);
        C13889l.m43221b(a3, a5, a3);
        C13889l.m43216a(a3, 62, a5);
        C13889l.m43221b(a5, a3, a5);
        C13889l.m43216a(a5, 3, a3);
        C13889l.m43221b(a3, a2, a3);
        C13889l.m43216a(a3, 18, a3);
        C13889l.m43221b(a3, a4, a3);
        C13889l.m43216a(a3, 2, a3);
        C13889l.m43221b(a3, iArr, a3);
        C13889l.m43216a(a3, 3, a3);
        C13889l.m43221b(a3, a, a3);
        C13889l.m43216a(a3, 6, a3);
        C13889l.m43221b(a3, a2, a3);
        C13889l.m43216a(a3, 2, a3);
        C13889l.m43221b(a3, iArr, a3);
        C13889l.m43224d(a3, a);
        return C13960d.m43862a(iArr, a) ? new C13893m(a3) : null;
    }

    /* renamed from: j */
    public C13812e mo35115j() {
        int[] a = C13960d.m43863a();
        C13889l.m43224d(this.f30772g, a);
        return new C13893m(a);
    }

    /* renamed from: k */
    public boolean mo35116k() {
        return C13960d.m43858a(this.f30772g, 0) == 1;
    }

    /* renamed from: l */
    public BigInteger mo35117l() {
        return C13960d.m43870c(this.f30772g);
    }

    /* renamed from: d */
    public C13812e mo35109d(C13812e eVar) {
        int[] a = C13960d.m43863a();
        C13889l.m43225d(this.f30772g, ((C13893m) eVar).f30772g, a);
        return new C13893m(a);
    }

    /* renamed from: a */
    public C13812e mo35098a() {
        int[] a = C13960d.m43863a();
        C13889l.m43217a(this.f30772g, a);
        return new C13893m(a);
    }

    public C13893m() {
        this.f30772g = C13960d.m43863a();
    }

    protected C13893m(int[] iArr) {
        this.f30772g = iArr;
    }
}
