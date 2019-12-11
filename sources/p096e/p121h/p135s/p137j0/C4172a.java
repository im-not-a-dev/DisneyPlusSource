package p096e.p121h.p135s.p137j0;

import android.graphics.Path;
import android.graphics.PathMeasure;
import android.view.animation.Interpolator;

/* renamed from: e.h.s.j0.a */
/* compiled from: PathInterpolatorApi14 */
class C4172a implements Interpolator {

    /* renamed from: a */
    private final float[] f10468a;

    /* renamed from: b */
    private final float[] f10469b;

    C4172a(Path path) {
        PathMeasure pathMeasure = new PathMeasure(path, false);
        float length = pathMeasure.getLength();
        int i = ((int) (length / 0.002f)) + 1;
        this.f10468a = new float[i];
        this.f10469b = new float[i];
        float[] fArr = new float[2];
        for (int i2 = 0; i2 < i; i2++) {
            pathMeasure.getPosTan((((float) i2) * length) / ((float) (i - 1)), fArr, null);
            this.f10468a[i2] = fArr[0];
            this.f10469b[i2] = fArr[1];
        }
    }

    /* renamed from: a */
    private static Path m14299a(float f, float f2, float f3, float f4) {
        Path path = new Path();
        path.moveTo(0.0f, 0.0f);
        path.cubicTo(f, f2, f3, f4, 1.0f, 1.0f);
        return path;
    }

    public float getInterpolation(float f) {
        if (f <= 0.0f) {
            return 0.0f;
        }
        if (f >= 1.0f) {
            return 1.0f;
        }
        int i = 0;
        int length = this.f10468a.length - 1;
        while (length - i > 1) {
            int i2 = (i + length) / 2;
            if (f < this.f10468a[i2]) {
                length = i2;
            } else {
                i = i2;
            }
        }
        float[] fArr = this.f10468a;
        float f2 = fArr[length] - fArr[i];
        if (f2 == 0.0f) {
            return this.f10469b[i];
        }
        float f3 = (f - fArr[i]) / f2;
        float[] fArr2 = this.f10469b;
        float f4 = fArr2[i];
        return f4 + (f3 * (fArr2[length] - f4));
    }

    C4172a(float f, float f2, float f3, float f4) {
        this(m14299a(f, f2, f3, f4));
    }
}
