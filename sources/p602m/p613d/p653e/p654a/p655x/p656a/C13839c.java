package p602m.p613d.p653e.p654a.p655x.p656a;

import java.math.BigInteger;
import p602m.p613d.p653e.p654a.C13812e;
import p602m.p613d.p653e.p661c.C13958b;
import p602m.p613d.p653e.p661c.C13963g;
import p602m.p613d.p683g.C14079a;

/* renamed from: m.d.e.a.x.a.c */
/* compiled from: Curve25519FieldElement */
public class C13839c extends C13812e {

    /* renamed from: h */
    public static final BigInteger f30706h = C13837a.f30702j;

    /* renamed from: i */
    private static final int[] f30707i = {1242472624, -991028441, -1389370248, 792926214, 1039914919, 726466713, 1338105611, 730014848};

    /* renamed from: g */
    protected int[] f30708g;

    public C13839c(BigInteger bigInteger) {
        if (bigInteger == null || bigInteger.signum() < 0 || bigInteger.compareTo(f30706h) >= 0) {
            throw new IllegalArgumentException("x value invalid for Curve25519FieldElement");
        }
        this.f30708g = C13838b.m42659a(bigInteger);
    }

    /* renamed from: a */
    public C13812e mo35100a(C13812e eVar) {
        int[] a = C13963g.m43945a();
        C13838b.m42658a(this.f30708g, ((C13839c) eVar).f30708g, a);
        return new C13839c(a);
    }

    /* renamed from: b */
    public C13812e mo35104b(C13812e eVar) {
        int[] a = C13963g.m43945a();
        C13958b.m43830a(C13838b.f30704a, ((C13839c) eVar).f30708g, a);
        C13838b.m42662b(a, this.f30708g, a);
        return new C13839c(a);
    }

    /* renamed from: c */
    public C13812e mo35106c(C13812e eVar) {
        int[] a = C13963g.m43945a();
        C13838b.m42662b(this.f30708g, ((C13839c) eVar).f30708g, a);
        return new C13839c(a);
    }

    /* renamed from: d */
    public int mo35108d() {
        return f30706h.bitLength();
    }

    /* renamed from: e */
    public C13812e mo35110e() {
        int[] a = C13963g.m43945a();
        C13958b.m43830a(C13838b.f30704a, this.f30708g, a);
        return new C13839c(a);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C13839c)) {
            return false;
        }
        return C13963g.m43951b(this.f30708g, ((C13839c) obj).f30708g);
    }

    /* renamed from: f */
    public boolean mo35111f() {
        return C13963g.m43941a(this.f30708g);
    }

    /* renamed from: g */
    public boolean mo35112g() {
        return C13963g.m43949b(this.f30708g);
    }

    /* renamed from: h */
    public C13812e mo35113h() {
        int[] a = C13963g.m43945a();
        C13838b.m42661b(this.f30708g, a);
        return new C13839c(a);
    }

    public int hashCode() {
        return f30706h.hashCode() ^ C14079a.m44459b(this.f30708g, 0, 8);
    }

    /* renamed from: i */
    public C13812e mo35114i() {
        int[] iArr = this.f30708g;
        if (C13963g.m43949b(iArr) || C13963g.m43941a(iArr)) {
            return this;
        }
        int[] a = C13963g.m43945a();
        C13838b.m42666d(iArr, a);
        C13838b.m42662b(a, iArr, a);
        C13838b.m42666d(a, a);
        C13838b.m42662b(a, iArr, a);
        int[] a2 = C13963g.m43945a();
        C13838b.m42666d(a, a2);
        C13838b.m42662b(a2, iArr, a2);
        int[] a3 = C13963g.m43945a();
        C13838b.m42656a(a2, 3, a3);
        C13838b.m42662b(a3, a, a3);
        C13838b.m42656a(a3, 4, a);
        C13838b.m42662b(a, a2, a);
        C13838b.m42656a(a, 4, a3);
        C13838b.m42662b(a3, a2, a3);
        C13838b.m42656a(a3, 15, a2);
        C13838b.m42662b(a2, a3, a2);
        C13838b.m42656a(a2, 30, a3);
        C13838b.m42662b(a3, a2, a3);
        C13838b.m42656a(a3, 60, a2);
        C13838b.m42662b(a2, a3, a2);
        C13838b.m42656a(a2, 11, a3);
        C13838b.m42662b(a3, a, a3);
        C13838b.m42656a(a3, 120, a);
        C13838b.m42662b(a, a2, a);
        C13838b.m42666d(a, a);
        C13838b.m42666d(a, a2);
        if (C13963g.m43951b(iArr, a2)) {
            return new C13839c(a);
        }
        C13838b.m42662b(a, f30707i, a);
        C13838b.m42666d(a, a2);
        if (C13963g.m43951b(iArr, a2)) {
            return new C13839c(a);
        }
        return null;
    }

    /* renamed from: j */
    public C13812e mo35115j() {
        int[] a = C13963g.m43945a();
        C13838b.m42666d(this.f30708g, a);
        return new C13839c(a);
    }

    /* renamed from: k */
    public boolean mo35116k() {
        return C13963g.m43935a(this.f30708g, 0) == 1;
    }

    /* renamed from: l */
    public BigInteger mo35117l() {
        return C13963g.m43956c(this.f30708g);
    }

    /* renamed from: d */
    public C13812e mo35109d(C13812e eVar) {
        int[] a = C13963g.m43945a();
        C13838b.m42667d(this.f30708g, ((C13839c) eVar).f30708g, a);
        return new C13839c(a);
    }

    /* renamed from: a */
    public C13812e mo35098a() {
        int[] a = C13963g.m43945a();
        C13838b.m42657a(this.f30708g, a);
        return new C13839c(a);
    }

    public C13839c() {
        this.f30708g = C13963g.m43945a();
    }

    protected C13839c(int[] iArr) {
        this.f30708g = iArr;
    }
}
