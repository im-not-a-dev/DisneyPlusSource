package kotlin.p582e0;

/* renamed from: kotlin.e0.d */
/* compiled from: MathJVM.kt */
class C12737d extends C12736c {
    /* renamed from: a */
    public static double m39874a(double d) {
        return Math.log(d) / C12734a.f29407a;
    }

    /* renamed from: b */
    public static int m39876b(float f) {
        if (!Float.isNaN(f)) {
            return Math.round(f);
        }
        throw new IllegalArgumentException("Cannot round NaN value.");
    }

    /* renamed from: a */
    public static float m39875a(float f) {
        return (float) (Math.log((double) f) / C12734a.f29407a);
    }
}
