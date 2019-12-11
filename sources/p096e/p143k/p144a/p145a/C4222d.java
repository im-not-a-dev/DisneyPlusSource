package p096e.p143k.p144a.p145a;

import android.view.animation.Interpolator;

/* renamed from: e.k.a.a.d */
/* compiled from: LookupTableInterpolator */
abstract class C4222d implements Interpolator {

    /* renamed from: a */
    private final float[] f10561a;

    /* renamed from: b */
    private final float f10562b = (1.0f / ((float) (this.f10561a.length - 1)));

    protected C4222d(float[] fArr) {
        this.f10561a = fArr;
    }

    public float getInterpolation(float f) {
        if (f >= 1.0f) {
            return 1.0f;
        }
        if (f <= 0.0f) {
            return 0.0f;
        }
        float[] fArr = this.f10561a;
        int min = Math.min((int) (((float) (fArr.length - 1)) * f), fArr.length - 2);
        float f2 = (float) min;
        float f3 = this.f10562b;
        float f4 = (f - (f2 * f3)) / f3;
        float[] fArr2 = this.f10561a;
        return fArr2[min] + (f4 * (fArr2[min + 1] - fArr2[min]));
    }
}
