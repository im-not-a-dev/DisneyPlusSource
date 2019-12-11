package p163g.p449j.p450a.p468b.p476r;

/* renamed from: g.j.a.b.r.a */
/* compiled from: MathUtils */
public final class C11498a {
    /* renamed from: a */
    public static float m37082a(float f, float f2, float f3) {
        return ((1.0f - f3) * f) + (f3 * f2);
    }

    /* renamed from: a */
    public static float m37083a(float f, float f2, float f3, float f4) {
        return (float) Math.hypot((double) (f3 - f), (double) (f4 - f2));
    }

    /* renamed from: b */
    private static float m37085b(float f, float f2, float f3, float f4) {
        return (f <= f2 || f <= f3 || f <= f4) ? (f2 <= f3 || f2 <= f4) ? f3 > f4 ? f3 : f4 : f2 : f;
    }

    /* renamed from: a */
    public static float m37084a(float f, float f2, float f3, float f4, float f5, float f6) {
        return m37085b(m37083a(f, f2, f3, f4), m37083a(f, f2, f5, f4), m37083a(f, f2, f5, f6), m37083a(f, f2, f3, f6));
    }
}
