package com.airbnb.lottie.p022w;

/* renamed from: com.airbnb.lottie.w.b */
/* compiled from: GammaEvaluator */
public class C1371b {
    /* renamed from: a */
    private static float m6693a(float f) {
        return f <= 0.04045f ? f / 12.92f : (float) Math.pow((double) ((f + 0.055f) / 1.055f), 2.4000000953674316d);
    }

    /* renamed from: b */
    private static float m6695b(float f) {
        return f <= 0.0031308f ? f * 12.92f : (float) ((Math.pow((double) f, 0.4166666567325592d) * 1.0549999475479126d) - 0.054999999701976776d);
    }

    /* renamed from: a */
    public static int m6694a(float f, int i, int i2) {
        float f2 = ((float) ((i >> 24) & 255)) / 255.0f;
        float f3 = ((float) ((i >> 8) & 255)) / 255.0f;
        float f4 = ((float) (i & 255)) / 255.0f;
        float f5 = ((float) ((i2 >> 24) & 255)) / 255.0f;
        float f6 = ((float) ((i2 >> 16) & 255)) / 255.0f;
        float f7 = ((float) ((i2 >> 8) & 255)) / 255.0f;
        float f8 = ((float) (i2 & 255)) / 255.0f;
        float a = m6693a(((float) ((i >> 16) & 255)) / 255.0f);
        float a2 = m6693a(f3);
        float a3 = m6693a(f4);
        float a4 = m6693a(f6);
        float a5 = a2 + ((m6693a(f7) - a2) * f);
        float a6 = a3 + (f * (m6693a(f8) - a3));
        float f9 = (f2 + ((f5 - f2) * f)) * 255.0f;
        return (Math.round(m6695b(a + ((a4 - a) * f)) * 255.0f) << 16) | (Math.round(f9) << 24) | (Math.round(m6695b(a5) * 255.0f) << 8) | Math.round(m6695b(a6) * 255.0f);
    }
}
