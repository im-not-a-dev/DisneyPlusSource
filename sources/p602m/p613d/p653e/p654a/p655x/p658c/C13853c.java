package p602m.p613d.p653e.p654a.p655x.p658c;

import java.math.BigInteger;
import p602m.p613d.p653e.p654a.C13812e;
import p602m.p613d.p653e.p661c.C13958b;
import p602m.p613d.p653e.p661c.C13959c;
import p602m.p613d.p683g.C14079a;

/* renamed from: m.d.e.a.x.c.c */
/* compiled from: SecP128R1FieldElement */
public class C13853c extends C13812e {

    /* renamed from: h */
    public static final BigInteger f30728h = C13845a.f30715j;

    /* renamed from: g */
    protected int[] f30729g;

    public C13853c(BigInteger bigInteger) {
        if (bigInteger == null || bigInteger.signum() < 0 || bigInteger.compareTo(f30728h) >= 0) {
            throw new IllegalArgumentException("x value invalid for SecP128R1FieldElement");
        }
        this.f30729g = C13849b.m42788a(bigInteger);
    }

    /* renamed from: a */
    public C13812e mo35100a(C13812e eVar) {
        int[] a = C13959c.m43838a();
        C13849b.m42787a(this.f30729g, ((C13853c) eVar).f30729g, a);
        return new C13853c(a);
    }

    /* renamed from: b */
    public C13812e mo35104b(C13812e eVar) {
        int[] a = C13959c.m43838a();
        C13958b.m43830a(C13849b.f30720a, ((C13853c) eVar).f30729g, a);
        C13849b.m42791b(a, this.f30729g, a);
        return new C13853c(a);
    }

    /* renamed from: c */
    public C13812e mo35106c(C13812e eVar) {
        int[] a = C13959c.m43838a();
        C13849b.m42791b(this.f30729g, ((C13853c) eVar).f30729g, a);
        return new C13853c(a);
    }

    /* renamed from: d */
    public int mo35108d() {
        return f30728h.bitLength();
    }

    /* renamed from: e */
    public C13812e mo35110e() {
        int[] a = C13959c.m43838a();
        C13958b.m43830a(C13849b.f30720a, this.f30729g, a);
        return new C13853c(a);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C13853c)) {
            return false;
        }
        return C13959c.m43835a(this.f30729g, ((C13853c) obj).f30729g);
    }

    /* renamed from: f */
    public boolean mo35111f() {
        return C13959c.m43834a(this.f30729g);
    }

    /* renamed from: g */
    public boolean mo35112g() {
        return C13959c.m43841b(this.f30729g);
    }

    /* renamed from: h */
    public C13812e mo35113h() {
        int[] a = C13959c.m43838a();
        C13849b.m42790b(this.f30729g, a);
        return new C13853c(a);
    }

    public int hashCode() {
        return f30728h.hashCode() ^ C14079a.m44459b(this.f30729g, 0, 4);
    }

    /* renamed from: i */
    public C13812e mo35114i() {
        int[] iArr = this.f30729g;
        if (C13959c.m43841b(iArr) || C13959c.m43834a(iArr)) {
            return this;
        }
        int[] a = C13959c.m43838a();
        C13849b.m42794d(iArr, a);
        C13849b.m42791b(a, iArr, a);
        int[] a2 = C13959c.m43838a();
        C13849b.m42785a(a, 2, a2);
        C13849b.m42791b(a2, a, a2);
        int[] a3 = C13959c.m43838a();
        C13849b.m42785a(a2, 4, a3);
        C13849b.m42791b(a3, a2, a3);
        C13849b.m42785a(a3, 2, a2);
        C13849b.m42791b(a2, a, a2);
        C13849b.m42785a(a2, 10, a);
        C13849b.m42791b(a, a2, a);
        C13849b.m42785a(a, 10, a3);
        C13849b.m42791b(a3, a2, a3);
        C13849b.m42794d(a3, a2);
        C13849b.m42791b(a2, iArr, a2);
        C13849b.m42785a(a2, 95, a2);
        C13849b.m42794d(a2, a3);
        return C13959c.m43835a(iArr, a3) ? new C13853c(a2) : null;
    }

    /* renamed from: j */
    public C13812e mo35115j() {
        int[] a = C13959c.m43838a();
        C13849b.m42794d(this.f30729g, a);
        return new C13853c(a);
    }

    /* renamed from: k */
    public boolean mo35116k() {
        return C13959c.m43832a(this.f30729g, 0) == 1;
    }

    /* renamed from: l */
    public BigInteger mo35117l() {
        return C13959c.m43846c(this.f30729g);
    }

    /* renamed from: d */
    public C13812e mo35109d(C13812e eVar) {
        int[] a = C13959c.m43838a();
        C13849b.m42795d(this.f30729g, ((C13853c) eVar).f30729g, a);
        return new C13853c(a);
    }

    /* renamed from: a */
    public C13812e mo35098a() {
        int[] a = C13959c.m43838a();
        C13849b.m42786a(this.f30729g, a);
        return new C13853c(a);
    }

    public C13853c() {
        this.f30729g = C13959c.m43838a();
    }

    protected C13853c(int[] iArr) {
        this.f30729g = iArr;
    }
}
