package p163g.p449j.p450a.p468b.p469l;

import android.animation.TypeEvaluator;
import android.graphics.Matrix;

/* renamed from: g.j.a.b.l.g */
/* compiled from: MatrixEvaluator */
public class C11474g implements TypeEvaluator<Matrix> {

    /* renamed from: a */
    private final float[] f26825a = new float[9];

    /* renamed from: b */
    private final float[] f26826b = new float[9];

    /* renamed from: c */
    private final Matrix f26827c = new Matrix();

    /* renamed from: a */
    public Matrix evaluate(float f, Matrix matrix, Matrix matrix2) {
        matrix.getValues(this.f26825a);
        matrix2.getValues(this.f26826b);
        for (int i = 0; i < 9; i++) {
            float[] fArr = this.f26826b;
            float f2 = fArr[i];
            float[] fArr2 = this.f26825a;
            fArr[i] = fArr2[i] + ((f2 - fArr2[i]) * f);
        }
        this.f26827c.setValues(this.f26826b);
        return this.f26827c;
    }
}
