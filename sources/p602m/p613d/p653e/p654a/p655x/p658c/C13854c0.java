package p602m.p613d.p653e.p654a.p655x.p658c;

import java.math.BigInteger;
import p602m.p613d.p653e.p654a.C13812e;
import p602m.p613d.p653e.p661c.C13958b;
import p602m.p613d.p653e.p661c.C13962f;
import p602m.p613d.p653e.p661c.C13969m;
import p602m.p613d.p683g.C14079a;

/* renamed from: m.d.e.a.x.c.c0 */
/* compiled from: SecP224R1FieldElement */
public class C13854c0 extends C13812e {

    /* renamed from: h */
    public static final BigInteger f30730h = C13846a0.f30717j;

    /* renamed from: g */
    protected int[] f30731g;

    public C13854c0(BigInteger bigInteger) {
        if (bigInteger == null || bigInteger.signum() < 0 || bigInteger.compareTo(f30730h) >= 0) {
            throw new IllegalArgumentException("x value invalid for SecP224R1FieldElement");
        }
        this.f30731g = C13850b0.m42802a(bigInteger);
    }

    /* renamed from: a */
    public C13812e mo35100a(C13812e eVar) {
        int[] a = C13962f.m43918a();
        C13850b0.m42801a(this.f30731g, ((C13854c0) eVar).f30731g, a);
        return new C13854c0(a);
    }

    /* renamed from: b */
    public C13812e mo35104b(C13812e eVar) {
        int[] a = C13962f.m43918a();
        C13958b.m43830a(C13850b0.f30723a, ((C13854c0) eVar).f30731g, a);
        C13850b0.m42805b(a, this.f30731g, a);
        return new C13854c0(a);
    }

    /* renamed from: c */
    public C13812e mo35106c(C13812e eVar) {
        int[] a = C13962f.m43918a();
        C13850b0.m42805b(this.f30731g, ((C13854c0) eVar).f30731g, a);
        return new C13854c0(a);
    }

    /* renamed from: d */
    public int mo35108d() {
        return f30730h.bitLength();
    }

    /* renamed from: e */
    public C13812e mo35110e() {
        int[] a = C13962f.m43918a();
        C13958b.m43830a(C13850b0.f30723a, this.f30731g, a);
        return new C13854c0(a);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C13854c0)) {
            return false;
        }
        return C13962f.m43922b(this.f30731g, ((C13854c0) obj).f30731g);
    }

    /* renamed from: f */
    public boolean mo35111f() {
        return C13962f.m43917a(this.f30731g);
    }

    /* renamed from: g */
    public boolean mo35112g() {
        return C13962f.m43921b(this.f30731g);
    }

    /* renamed from: h */
    public C13812e mo35113h() {
        int[] a = C13962f.m43918a();
        C13850b0.m42804b(this.f30731g, a);
        return new C13854c0(a);
    }

    public int hashCode() {
        return f30730h.hashCode() ^ C14079a.m44459b(this.f30731g, 0, 7);
    }

    /* renamed from: i */
    public C13812e mo35114i() {
        int[] iArr = this.f30731g;
        if (C13962f.m43921b(iArr) || C13962f.m43917a(iArr)) {
            return this;
        }
        int[] a = C13962f.m43918a();
        C13850b0.m42804b(iArr, a);
        int[] a2 = C13958b.m43831a(C13850b0.f30723a);
        int[] a3 = C13962f.m43918a();
        C13854c0 c0Var = null;
        if (!m42864a(iArr)) {
            return null;
        }
        while (!m42865a(a, a2, a3)) {
            C13850b0.m42800a(a2, a2);
        }
        C13850b0.m42808d(a3, a2);
        if (C13962f.m43922b(iArr, a2)) {
            c0Var = new C13854c0(a3);
        }
        return c0Var;
    }

    /* renamed from: j */
    public C13812e mo35115j() {
        int[] a = C13962f.m43918a();
        C13850b0.m42808d(this.f30731g, a);
        return new C13854c0(a);
    }

    /* renamed from: k */
    public boolean mo35116k() {
        return C13962f.m43913a(this.f30731g, 0) == 1;
    }

    /* renamed from: l */
    public BigInteger mo35117l() {
        return C13962f.m43924c(this.f30731g);
    }

    /* renamed from: d */
    public C13812e mo35109d(C13812e eVar) {
        int[] a = C13962f.m43918a();
        C13850b0.m42809d(this.f30731g, ((C13854c0) eVar).f30731g, a);
        return new C13854c0(a);
    }

    /* renamed from: a */
    public C13812e mo35098a() {
        int[] a = C13962f.m43918a();
        C13850b0.m42800a(this.f30731g, a);
        return new C13854c0(a);
    }

    public C13854c0() {
        this.f30731g = C13962f.m43918a();
    }

    protected C13854c0(int[] iArr) {
        this.f30731g = iArr;
    }

    /* renamed from: a */
    private static boolean m42864a(int[] iArr) {
        int[] a = C13962f.m43918a();
        int[] a2 = C13962f.m43918a();
        C13962f.m43916a(iArr, a);
        for (int i = 0; i < 7; i++) {
            C13962f.m43916a(a, a2);
            C13850b0.m42799a(a, 1 << i, a);
            C13850b0.m42805b(a, a2, a);
        }
        C13850b0.m42799a(a, 95, a);
        return C13962f.m43917a(a);
    }

    /* renamed from: a */
    private static void m42863a(int[] iArr, int[] iArr2, int[] iArr3, int[] iArr4, int[] iArr5, int[] iArr6, int[] iArr7) {
        C13850b0.m42805b(iArr5, iArr3, iArr7);
        C13850b0.m42805b(iArr7, iArr, iArr7);
        C13850b0.m42805b(iArr4, iArr2, iArr6);
        C13850b0.m42801a(iArr6, iArr7, iArr6);
        C13850b0.m42805b(iArr4, iArr3, iArr7);
        C13962f.m43916a(iArr6, iArr4);
        C13850b0.m42805b(iArr5, iArr2, iArr5);
        C13850b0.m42801a(iArr5, iArr7, iArr5);
        C13850b0.m42808d(iArr5, iArr6);
        C13850b0.m42805b(iArr6, iArr, iArr6);
    }

    /* renamed from: a */
    private static void m42862a(int[] iArr, int[] iArr2, int[] iArr3, int[] iArr4, int[] iArr5) {
        C13962f.m43916a(iArr, iArr4);
        int[] a = C13962f.m43918a();
        int[] a2 = C13962f.m43918a();
        for (int i = 0; i < 7; i++) {
            C13962f.m43916a(iArr2, a);
            C13962f.m43916a(iArr3, a2);
            int i2 = 1 << i;
            while (true) {
                i2--;
                if (i2 < 0) {
                    break;
                }
                m42861a(iArr2, iArr3, iArr4, iArr5);
            }
            m42863a(iArr, a, a2, iArr2, iArr3, iArr4, iArr5);
        }
    }

    /* renamed from: a */
    private static void m42861a(int[] iArr, int[] iArr2, int[] iArr3, int[] iArr4) {
        C13850b0.m42805b(iArr2, iArr, iArr2);
        C13850b0.m42810e(iArr2, iArr2);
        C13850b0.m42808d(iArr, iArr4);
        C13850b0.m42801a(iArr3, iArr4, iArr);
        C13850b0.m42805b(iArr3, iArr4, iArr3);
        C13850b0.m42797a(C13969m.m44025c(7, iArr3, 2, 0), iArr3);
    }

    /* renamed from: a */
    private static boolean m42865a(int[] iArr, int[] iArr2, int[] iArr3) {
        int[] a = C13962f.m43918a();
        C13962f.m43916a(iArr2, a);
        int[] a2 = C13962f.m43918a();
        a2[0] = 1;
        int[] a3 = C13962f.m43918a();
        m42862a(iArr, a, a2, a3, iArr3);
        int[] a4 = C13962f.m43918a();
        int[] a5 = C13962f.m43918a();
        for (int i = 1; i < 96; i++) {
            C13962f.m43916a(a, a4);
            C13962f.m43916a(a2, a5);
            m42861a(a, a2, a3, iArr3);
            if (C13962f.m43921b(a)) {
                C13958b.m43830a(C13850b0.f30723a, a5, iArr3);
                C13850b0.m42805b(iArr3, a4, iArr3);
                return true;
            }
        }
        return false;
    }
}
