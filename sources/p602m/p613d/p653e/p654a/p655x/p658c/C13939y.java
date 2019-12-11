package p602m.p613d.p653e.p654a.p655x.p658c;

import java.math.BigInteger;
import p602m.p613d.p653e.p654a.C13812e;
import p602m.p613d.p653e.p661c.C13958b;
import p602m.p613d.p653e.p661c.C13962f;
import p602m.p613d.p683g.C14079a;

/* renamed from: m.d.e.a.x.c.y */
/* compiled from: SecP224K1FieldElement */
public class C13939y extends C13812e {

    /* renamed from: h */
    public static final BigInteger f30820h = C13933w.f30813j;

    /* renamed from: i */
    private static final int[] f30821i = {868209154, -587542221, 579297866, -1014948952, -1470801668, 514782679, -1897982644};

    /* renamed from: g */
    protected int[] f30822g;

    public C13939y(BigInteger bigInteger) {
        if (bigInteger == null || bigInteger.signum() < 0 || bigInteger.compareTo(f30820h) >= 0) {
            throw new IllegalArgumentException("x value invalid for SecP224K1FieldElement");
        }
        this.f30822g = C13936x.m43720a(bigInteger);
    }

    /* renamed from: a */
    public C13812e mo35100a(C13812e eVar) {
        int[] a = C13962f.m43918a();
        C13936x.m43719a(this.f30822g, ((C13939y) eVar).f30822g, a);
        return new C13939y(a);
    }

    /* renamed from: b */
    public C13812e mo35104b(C13812e eVar) {
        int[] a = C13962f.m43918a();
        C13958b.m43830a(C13936x.f30817a, ((C13939y) eVar).f30822g, a);
        C13936x.m43722b(a, this.f30822g, a);
        return new C13939y(a);
    }

    /* renamed from: c */
    public C13812e mo35106c(C13812e eVar) {
        int[] a = C13962f.m43918a();
        C13936x.m43722b(this.f30822g, ((C13939y) eVar).f30822g, a);
        return new C13939y(a);
    }

    /* renamed from: d */
    public int mo35108d() {
        return f30820h.bitLength();
    }

    /* renamed from: e */
    public C13812e mo35110e() {
        int[] a = C13962f.m43918a();
        C13958b.m43830a(C13936x.f30817a, this.f30822g, a);
        return new C13939y(a);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C13939y)) {
            return false;
        }
        return C13962f.m43922b(this.f30822g, ((C13939y) obj).f30822g);
    }

    /* renamed from: f */
    public boolean mo35111f() {
        return C13962f.m43917a(this.f30822g);
    }

    /* renamed from: g */
    public boolean mo35112g() {
        return C13962f.m43921b(this.f30822g);
    }

    /* renamed from: h */
    public C13812e mo35113h() {
        int[] a = C13962f.m43918a();
        C13936x.m43721b(this.f30822g, a);
        return new C13939y(a);
    }

    public int hashCode() {
        return f30820h.hashCode() ^ C14079a.m44459b(this.f30822g, 0, 7);
    }

    /* renamed from: i */
    public C13812e mo35114i() {
        int[] iArr = this.f30822g;
        if (C13962f.m43921b(iArr) || C13962f.m43917a(iArr)) {
            return this;
        }
        int[] a = C13962f.m43918a();
        C13936x.m43725d(iArr, a);
        C13936x.m43722b(a, iArr, a);
        C13936x.m43725d(a, a);
        C13936x.m43722b(a, iArr, a);
        int[] a2 = C13962f.m43918a();
        C13936x.m43725d(a, a2);
        C13936x.m43722b(a2, iArr, a2);
        int[] a3 = C13962f.m43918a();
        C13936x.m43717a(a2, 4, a3);
        C13936x.m43722b(a3, a2, a3);
        int[] a4 = C13962f.m43918a();
        C13936x.m43717a(a3, 3, a4);
        C13936x.m43722b(a4, a, a4);
        C13936x.m43717a(a4, 8, a4);
        C13936x.m43722b(a4, a3, a4);
        C13936x.m43717a(a4, 4, a3);
        C13936x.m43722b(a3, a2, a3);
        C13936x.m43717a(a3, 19, a2);
        C13936x.m43722b(a2, a4, a2);
        int[] a5 = C13962f.m43918a();
        C13936x.m43717a(a2, 42, a5);
        C13936x.m43722b(a5, a2, a5);
        C13936x.m43717a(a5, 23, a2);
        C13936x.m43722b(a2, a3, a2);
        C13936x.m43717a(a2, 84, a3);
        C13936x.m43722b(a3, a5, a3);
        C13936x.m43717a(a3, 20, a3);
        C13936x.m43722b(a3, a4, a3);
        C13936x.m43717a(a3, 3, a3);
        C13936x.m43722b(a3, iArr, a3);
        C13936x.m43717a(a3, 2, a3);
        C13936x.m43722b(a3, iArr, a3);
        C13936x.m43717a(a3, 4, a3);
        C13936x.m43722b(a3, a, a3);
        C13936x.m43725d(a3, a3);
        C13936x.m43725d(a3, a5);
        if (C13962f.m43922b(iArr, a5)) {
            return new C13939y(a3);
        }
        C13936x.m43722b(a3, f30821i, a3);
        C13936x.m43725d(a3, a5);
        if (C13962f.m43922b(iArr, a5)) {
            return new C13939y(a3);
        }
        return null;
    }

    /* renamed from: j */
    public C13812e mo35115j() {
        int[] a = C13962f.m43918a();
        C13936x.m43725d(this.f30822g, a);
        return new C13939y(a);
    }

    /* renamed from: k */
    public boolean mo35116k() {
        return C13962f.m43913a(this.f30822g, 0) == 1;
    }

    /* renamed from: l */
    public BigInteger mo35117l() {
        return C13962f.m43924c(this.f30822g);
    }

    /* renamed from: d */
    public C13812e mo35109d(C13812e eVar) {
        int[] a = C13962f.m43918a();
        C13936x.m43726d(this.f30822g, ((C13939y) eVar).f30822g, a);
        return new C13939y(a);
    }

    /* renamed from: a */
    public C13812e mo35098a() {
        int[] a = C13962f.m43918a();
        C13936x.m43718a(this.f30822g, a);
        return new C13939y(a);
    }

    public C13939y() {
        this.f30822g = C13962f.m43918a();
    }

    protected C13939y(int[] iArr) {
        this.f30822g = iArr;
    }
}
