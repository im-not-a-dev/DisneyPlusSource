package p602m.p613d.p653e.p654a.p655x.p658c;

import java.math.BigInteger;
import p602m.p613d.p653e.p654a.C13812e;
import p602m.p613d.p653e.p661c.C13958b;
import p602m.p613d.p653e.p661c.C13963g;
import p602m.p613d.p683g.C14079a;

/* renamed from: m.d.e.a.x.c.k0 */
/* compiled from: SecP256R1FieldElement */
public class C13886k0 extends C13812e {

    /* renamed from: h */
    public static final BigInteger f30764h = C13878i0.f30756j;

    /* renamed from: g */
    protected int[] f30765g;

    public C13886k0(BigInteger bigInteger) {
        if (bigInteger == null || bigInteger.signum() < 0 || bigInteger.compareTo(f30764h) >= 0) {
            throw new IllegalArgumentException("x value invalid for SecP256R1FieldElement");
        }
        this.f30765g = C13882j0.m43145a(bigInteger);
    }

    /* renamed from: a */
    public C13812e mo35100a(C13812e eVar) {
        int[] a = C13963g.m43945a();
        C13882j0.m43144a(this.f30765g, ((C13886k0) eVar).f30765g, a);
        return new C13886k0(a);
    }

    /* renamed from: b */
    public C13812e mo35104b(C13812e eVar) {
        int[] a = C13963g.m43945a();
        C13958b.m43830a(C13882j0.f30760a, ((C13886k0) eVar).f30765g, a);
        C13882j0.m43148b(a, this.f30765g, a);
        return new C13886k0(a);
    }

    /* renamed from: c */
    public C13812e mo35106c(C13812e eVar) {
        int[] a = C13963g.m43945a();
        C13882j0.m43148b(this.f30765g, ((C13886k0) eVar).f30765g, a);
        return new C13886k0(a);
    }

    /* renamed from: d */
    public int mo35108d() {
        return f30764h.bitLength();
    }

    /* renamed from: e */
    public C13812e mo35110e() {
        int[] a = C13963g.m43945a();
        C13958b.m43830a(C13882j0.f30760a, this.f30765g, a);
        return new C13886k0(a);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C13886k0)) {
            return false;
        }
        return C13963g.m43951b(this.f30765g, ((C13886k0) obj).f30765g);
    }

    /* renamed from: f */
    public boolean mo35111f() {
        return C13963g.m43941a(this.f30765g);
    }

    /* renamed from: g */
    public boolean mo35112g() {
        return C13963g.m43949b(this.f30765g);
    }

    /* renamed from: h */
    public C13812e mo35113h() {
        int[] a = C13963g.m43945a();
        C13882j0.m43147b(this.f30765g, a);
        return new C13886k0(a);
    }

    public int hashCode() {
        return f30764h.hashCode() ^ C14079a.m44459b(this.f30765g, 0, 8);
    }

    /* renamed from: i */
    public C13812e mo35114i() {
        int[] iArr = this.f30765g;
        if (C13963g.m43949b(iArr) || C13963g.m43941a(iArr)) {
            return this;
        }
        int[] a = C13963g.m43945a();
        int[] a2 = C13963g.m43945a();
        C13882j0.m43151d(iArr, a);
        C13882j0.m43148b(a, iArr, a);
        C13882j0.m43142a(a, 2, a2);
        C13882j0.m43148b(a2, a, a2);
        C13882j0.m43142a(a2, 4, a);
        C13882j0.m43148b(a, a2, a);
        C13882j0.m43142a(a, 8, a2);
        C13882j0.m43148b(a2, a, a2);
        C13882j0.m43142a(a2, 16, a);
        C13882j0.m43148b(a, a2, a);
        C13882j0.m43142a(a, 32, a);
        C13882j0.m43148b(a, iArr, a);
        C13882j0.m43142a(a, 96, a);
        C13882j0.m43148b(a, iArr, a);
        C13882j0.m43142a(a, 94, a);
        C13882j0.m43151d(a, a2);
        return C13963g.m43951b(iArr, a2) ? new C13886k0(a) : null;
    }

    /* renamed from: j */
    public C13812e mo35115j() {
        int[] a = C13963g.m43945a();
        C13882j0.m43151d(this.f30765g, a);
        return new C13886k0(a);
    }

    /* renamed from: k */
    public boolean mo35116k() {
        return C13963g.m43935a(this.f30765g, 0) == 1;
    }

    /* renamed from: l */
    public BigInteger mo35117l() {
        return C13963g.m43956c(this.f30765g);
    }

    /* renamed from: d */
    public C13812e mo35109d(C13812e eVar) {
        int[] a = C13963g.m43945a();
        C13882j0.m43152d(this.f30765g, ((C13886k0) eVar).f30765g, a);
        return new C13886k0(a);
    }

    /* renamed from: a */
    public C13812e mo35098a() {
        int[] a = C13963g.m43945a();
        C13882j0.m43143a(this.f30765g, a);
        return new C13886k0(a);
    }

    public C13886k0() {
        this.f30765g = C13963g.m43945a();
    }

    protected C13886k0(int[] iArr) {
        this.f30765g = iArr;
    }
}
