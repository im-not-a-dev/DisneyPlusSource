package p602m.p613d.p653e.p654a.p655x.p658c;

import java.math.BigInteger;
import p602m.p613d.p653e.p654a.C13812e;
import p602m.p613d.p653e.p661c.C13958b;
import p602m.p613d.p653e.p661c.C13963g;
import p602m.p613d.p683g.C14079a;

/* renamed from: m.d.e.a.x.c.g0 */
/* compiled from: SecP256K1FieldElement */
public class C13870g0 extends C13812e {

    /* renamed from: h */
    public static final BigInteger f30746h = C13862e0.f30736j;

    /* renamed from: g */
    protected int[] f30747g;

    public C13870g0(BigInteger bigInteger) {
        if (bigInteger == null || bigInteger.signum() < 0 || bigInteger.compareTo(f30746h) >= 0) {
            throw new IllegalArgumentException("x value invalid for SecP256K1FieldElement");
        }
        this.f30747g = C13866f0.m42973a(bigInteger);
    }

    /* renamed from: a */
    public C13812e mo35100a(C13812e eVar) {
        int[] a = C13963g.m43945a();
        C13866f0.m42972a(this.f30747g, ((C13870g0) eVar).f30747g, a);
        return new C13870g0(a);
    }

    /* renamed from: b */
    public C13812e mo35104b(C13812e eVar) {
        int[] a = C13963g.m43945a();
        C13958b.m43830a(C13866f0.f30740a, ((C13870g0) eVar).f30747g, a);
        C13866f0.m42975b(a, this.f30747g, a);
        return new C13870g0(a);
    }

    /* renamed from: c */
    public C13812e mo35106c(C13812e eVar) {
        int[] a = C13963g.m43945a();
        C13866f0.m42975b(this.f30747g, ((C13870g0) eVar).f30747g, a);
        return new C13870g0(a);
    }

    /* renamed from: d */
    public int mo35108d() {
        return f30746h.bitLength();
    }

    /* renamed from: e */
    public C13812e mo35110e() {
        int[] a = C13963g.m43945a();
        C13958b.m43830a(C13866f0.f30740a, this.f30747g, a);
        return new C13870g0(a);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C13870g0)) {
            return false;
        }
        return C13963g.m43951b(this.f30747g, ((C13870g0) obj).f30747g);
    }

    /* renamed from: f */
    public boolean mo35111f() {
        return C13963g.m43941a(this.f30747g);
    }

    /* renamed from: g */
    public boolean mo35112g() {
        return C13963g.m43949b(this.f30747g);
    }

    /* renamed from: h */
    public C13812e mo35113h() {
        int[] a = C13963g.m43945a();
        C13866f0.m42974b(this.f30747g, a);
        return new C13870g0(a);
    }

    public int hashCode() {
        return f30746h.hashCode() ^ C14079a.m44459b(this.f30747g, 0, 8);
    }

    /* renamed from: i */
    public C13812e mo35114i() {
        int[] iArr = this.f30747g;
        if (C13963g.m43949b(iArr) || C13963g.m43941a(iArr)) {
            return this;
        }
        int[] a = C13963g.m43945a();
        C13866f0.m42978d(iArr, a);
        C13866f0.m42975b(a, iArr, a);
        int[] a2 = C13963g.m43945a();
        C13866f0.m42978d(a, a2);
        C13866f0.m42975b(a2, iArr, a2);
        int[] a3 = C13963g.m43945a();
        C13866f0.m42970a(a2, 3, a3);
        C13866f0.m42975b(a3, a2, a3);
        C13866f0.m42970a(a3, 3, a3);
        C13866f0.m42975b(a3, a2, a3);
        C13866f0.m42970a(a3, 2, a3);
        C13866f0.m42975b(a3, a, a3);
        int[] a4 = C13963g.m43945a();
        C13866f0.m42970a(a3, 11, a4);
        C13866f0.m42975b(a4, a3, a4);
        C13866f0.m42970a(a4, 22, a3);
        C13866f0.m42975b(a3, a4, a3);
        int[] a5 = C13963g.m43945a();
        C13866f0.m42970a(a3, 44, a5);
        C13866f0.m42975b(a5, a3, a5);
        int[] a6 = C13963g.m43945a();
        C13866f0.m42970a(a5, 88, a6);
        C13866f0.m42975b(a6, a5, a6);
        C13866f0.m42970a(a6, 44, a5);
        C13866f0.m42975b(a5, a3, a5);
        C13866f0.m42970a(a5, 3, a3);
        C13866f0.m42975b(a3, a2, a3);
        C13866f0.m42970a(a3, 23, a3);
        C13866f0.m42975b(a3, a4, a3);
        C13866f0.m42970a(a3, 6, a3);
        C13866f0.m42975b(a3, a, a3);
        C13866f0.m42970a(a3, 2, a3);
        C13866f0.m42978d(a3, a);
        return C13963g.m43951b(iArr, a) ? new C13870g0(a3) : null;
    }

    /* renamed from: j */
    public C13812e mo35115j() {
        int[] a = C13963g.m43945a();
        C13866f0.m42978d(this.f30747g, a);
        return new C13870g0(a);
    }

    /* renamed from: k */
    public boolean mo35116k() {
        return C13963g.m43935a(this.f30747g, 0) == 1;
    }

    /* renamed from: l */
    public BigInteger mo35117l() {
        return C13963g.m43956c(this.f30747g);
    }

    /* renamed from: d */
    public C13812e mo35109d(C13812e eVar) {
        int[] a = C13963g.m43945a();
        C13866f0.m42979d(this.f30747g, ((C13870g0) eVar).f30747g, a);
        return new C13870g0(a);
    }

    /* renamed from: a */
    public C13812e mo35098a() {
        int[] a = C13963g.m43945a();
        C13866f0.m42971a(this.f30747g, a);
        return new C13870g0(a);
    }

    public C13870g0() {
        this.f30747g = C13963g.m43945a();
    }

    protected C13870g0(int[] iArr) {
        this.f30747g = iArr;
    }
}
