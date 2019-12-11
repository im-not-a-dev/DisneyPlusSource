package com.airbnb.lottie.p022w;

/* renamed from: com.airbnb.lottie.w.d */
/* compiled from: MeanCalculator */
public class C1373d {

    /* renamed from: a */
    private float f5043a;

    /* renamed from: b */
    private int f5044b;

    /* renamed from: a */
    public void mo6418a(float f) {
        this.f5043a += f;
        this.f5044b++;
        int i = this.f5044b;
        if (i == Integer.MAX_VALUE) {
            this.f5043a /= 2.0f;
            this.f5044b = i / 2;
        }
    }
}
