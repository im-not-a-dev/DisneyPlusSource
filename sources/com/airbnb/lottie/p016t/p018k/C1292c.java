package com.airbnb.lottie.p016t.p018k;

import com.airbnb.lottie.p022w.C1371b;
import com.airbnb.lottie.p022w.C1374e;

/* renamed from: com.airbnb.lottie.t.k.c */
/* compiled from: GradientColor */
public class C1292c {

    /* renamed from: a */
    private final float[] f4807a;

    /* renamed from: b */
    private final int[] f4808b;

    public C1292c(float[] fArr, int[] iArr) {
        this.f4807a = fArr;
        this.f4808b = iArr;
    }

    /* renamed from: a */
    public int[] mo6244a() {
        return this.f4808b;
    }

    /* renamed from: b */
    public float[] mo6245b() {
        return this.f4807a;
    }

    /* renamed from: c */
    public int mo6246c() {
        return this.f4808b.length;
    }

    /* renamed from: a */
    public void mo6243a(C1292c cVar, C1292c cVar2, float f) {
        if (cVar.f4808b.length == cVar2.f4808b.length) {
            for (int i = 0; i < cVar.f4808b.length; i++) {
                this.f4807a[i] = C1374e.m6731c(cVar.f4807a[i], cVar2.f4807a[i], f);
                this.f4808b[i] = C1371b.m6694a(f, cVar.f4808b[i], cVar2.f4808b[i]);
            }
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Cannot interpolate between gradients. Lengths vary (");
        sb.append(cVar.f4808b.length);
        sb.append(" vs ");
        sb.append(cVar2.f4808b.length);
        sb.append(")");
        throw new IllegalArgumentException(sb.toString());
    }
}
