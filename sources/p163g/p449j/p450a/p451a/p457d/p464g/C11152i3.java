package p163g.p449j.p450a.p451a.p457d.p464g;

import java.io.IOException;

/* renamed from: g.j.a.a.d.g.i3 */
public abstract class C11152i3 {

    /* renamed from: a */
    int f26247a;

    /* renamed from: b */
    int f26248b;

    /* renamed from: c */
    C11166j3 f26249c;

    private C11152i3() {
        this.f26248b = 100;
    }

    /* renamed from: a */
    public static long m35287a(long j) {
        return (-(j & 1)) ^ (j >>> 1);
    }

    /* renamed from: a */
    public static C11152i3 m35288a(byte[] bArr, int i, int i2) {
        return m35289a(bArr, i, i2, false);
    }

    /* renamed from: g */
    public static int m35290g(int i) {
        return (-(i & 1)) ^ (i >>> 1);
    }

    /* renamed from: a */
    public abstract double mo28548a() throws IOException;

    /* renamed from: a */
    public abstract <T extends C11259p5> T mo28549a(C11373x5<T> x5Var, C11285r3 r3Var) throws IOException;

    /* renamed from: a */
    public abstract void mo28550a(int i) throws C11258p4;

    /* renamed from: b */
    public abstract float mo28551b() throws IOException;

    /* renamed from: b */
    public abstract boolean mo28552b(int i) throws IOException;

    /* renamed from: c */
    public final int mo28553c(int i) {
        if (i >= 0) {
            int i2 = this.f26248b;
            this.f26248b = i;
            return i2;
        }
        StringBuilder sb = new StringBuilder(47);
        sb.append("Recursion limit cannot be negative: ");
        sb.append(i);
        throw new IllegalArgumentException(sb.toString());
    }

    /* renamed from: c */
    public abstract String mo28554c() throws IOException;

    /* renamed from: d */
    public abstract int mo28555d() throws IOException;

    /* renamed from: d */
    public abstract int mo28556d(int i) throws C11258p4;

    /* renamed from: e */
    public abstract long mo28557e() throws IOException;

    /* renamed from: e */
    public abstract void mo28558e(int i);

    /* renamed from: f */
    public abstract long mo28559f() throws IOException;

    /* renamed from: f */
    public abstract void mo28560f(int i) throws IOException;

    /* renamed from: g */
    public abstract int mo28561g() throws IOException;

    /* renamed from: h */
    public abstract long mo28562h() throws IOException;

    /* renamed from: i */
    public abstract int mo28563i() throws IOException;

    /* renamed from: j */
    public abstract boolean mo28564j() throws IOException;

    /* renamed from: k */
    public abstract String mo28565k() throws IOException;

    /* renamed from: l */
    public abstract C11342v2 mo28566l() throws IOException;

    /* renamed from: m */
    public abstract int mo28567m() throws IOException;

    /* renamed from: n */
    public abstract int mo28568n() throws IOException;

    /* renamed from: o */
    public abstract int mo28569o() throws IOException;

    /* renamed from: p */
    public abstract long mo28570p() throws IOException;

    /* renamed from: q */
    public abstract int mo28571q() throws IOException;

    /* renamed from: r */
    public abstract long mo28572r() throws IOException;

    /* renamed from: s */
    public abstract boolean mo28573s() throws IOException;

    /* renamed from: t */
    public abstract int mo28574t();

    /* renamed from: a */
    static C11152i3 m35289a(byte[] bArr, int i, int i2, boolean z) {
        C11180k3 k3Var = new C11180k3(bArr, i, i2, false);
        try {
            k3Var.mo28556d(i2);
            return k3Var;
        } catch (C11258p4 e) {
            throw new IllegalArgumentException(e);
        }
    }
}
