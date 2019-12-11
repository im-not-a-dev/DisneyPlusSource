package com.google.android.exoplayer2.p394w0.p395s;

import android.opengl.Matrix;
import com.google.android.exoplayer2.p393v0.C9543g0;

/* renamed from: com.google.android.exoplayer2.w0.s.c */
/* compiled from: FrameRotationQueue */
public final class C9607c {

    /* renamed from: a */
    private final float[] f22466a = new float[16];

    /* renamed from: b */
    private final float[] f22467b = new float[16];

    /* renamed from: c */
    private final C9543g0<float[]> f22468c = new C9543g0<>();

    /* renamed from: d */
    private boolean f22469d;

    /* renamed from: b */
    private static void m29738b(float[] fArr, float[] fArr2) {
        float f = fArr2[0];
        float f2 = -fArr2[1];
        float f3 = -fArr2[2];
        float length = Matrix.length(f, f2, f3);
        if (length != 0.0f) {
            Matrix.setRotateM(fArr, 0, (float) Math.toDegrees((double) length), f / length, f2 / length, f3 / length);
            return;
        }
        Matrix.setIdentityM(fArr, 0);
    }

    /* renamed from: a */
    public void mo24794a(long j, float[] fArr) {
        this.f22468c.mo24627a(j, fArr);
    }

    /* renamed from: a */
    public void mo24793a() {
        this.f22468c.mo24626a();
        this.f22469d = false;
    }

    /* renamed from: a */
    public boolean mo24795a(float[] fArr, long j) {
        float[] fArr2 = (float[]) this.f22468c.mo24628b(j);
        if (fArr2 == null) {
            return false;
        }
        m29738b(this.f22467b, fArr2);
        if (!this.f22469d) {
            m29737a(this.f22466a, this.f22467b);
            this.f22469d = true;
        }
        Matrix.multiplyMM(fArr, 0, this.f22466a, 0, this.f22467b, 0);
        return true;
    }

    /* renamed from: a */
    public static void m29737a(float[] fArr, float[] fArr2) {
        Matrix.setIdentityM(fArr, 0);
        float sqrt = (float) Math.sqrt((double) ((fArr2[10] * fArr2[10]) + (fArr2[8] * fArr2[8])));
        fArr[0] = fArr2[10] / sqrt;
        fArr[2] = fArr2[8] / sqrt;
        fArr[8] = (-fArr2[8]) / sqrt;
        fArr[10] = fArr2[10] / sqrt;
    }
}
