package com.google.android.exoplayer2.p391ui.p392r;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.opengl.Matrix;
import android.view.Display;
import com.google.android.exoplayer2.p394w0.p395s.C9607c;

/* renamed from: com.google.android.exoplayer2.ui.r.d */
/* compiled from: OrientationListener */
final class C9424d implements SensorEventListener {

    /* renamed from: a */
    private final float[] f21870a = new float[16];

    /* renamed from: b */
    private final float[] f21871b = new float[16];

    /* renamed from: c */
    private final float[] f21872c = new float[16];

    /* renamed from: d */
    private final float[] f21873d = new float[3];

    /* renamed from: e */
    private final Display f21874e;

    /* renamed from: f */
    private final C9425a[] f21875f;

    /* renamed from: g */
    private boolean f21876g;

    /* renamed from: com.google.android.exoplayer2.ui.r.d$a */
    /* compiled from: OrientationListener */
    public interface C9425a {
        /* renamed from: a */
        void mo24416a(float[] fArr, float f);
    }

    public C9424d(Display display, C9425a... aVarArr) {
        this.f21874e = display;
        this.f21875f = aVarArr;
    }

    /* renamed from: a */
    private void m28904a(float[] fArr, float f) {
        for (C9425a a : this.f21875f) {
            a.mo24416a(fArr, f);
        }
    }

    /* renamed from: b */
    private void m28906b(float[] fArr) {
        if (!this.f21876g) {
            C9607c.m29737a(this.f21872c, fArr);
            this.f21876g = true;
        }
        float[] fArr2 = this.f21871b;
        System.arraycopy(fArr, 0, fArr2, 0, fArr2.length);
        Matrix.multiplyMM(fArr, 0, this.f21871b, 0, this.f21872c, 0);
    }

    /* renamed from: c */
    private static void m28907c(float[] fArr) {
        Matrix.rotateM(fArr, 0, 90.0f, 1.0f, 0.0f, 0.0f);
    }

    public void onAccuracyChanged(Sensor sensor, int i) {
    }

    public void onSensorChanged(SensorEvent sensorEvent) {
        SensorManager.getRotationMatrixFromVector(this.f21870a, sensorEvent.values);
        m28905a(this.f21870a, this.f21874e.getRotation());
        float a = m28903a(this.f21870a);
        m28907c(this.f21870a);
        m28906b(this.f21870a);
        m28904a(this.f21870a, a);
    }

    /* renamed from: a */
    private float m28903a(float[] fArr) {
        SensorManager.remapCoordinateSystem(fArr, 1, 131, this.f21871b);
        SensorManager.getOrientation(this.f21871b, this.f21873d);
        return this.f21873d[2];
    }

    /* renamed from: a */
    private void m28905a(float[] fArr, int i) {
        if (i != 0) {
            int i2 = 130;
            int i3 = 129;
            if (i == 1) {
                i2 = 2;
            } else if (i == 2) {
                i2 = 129;
                i3 = 130;
            } else if (i == 3) {
                i3 = 1;
            } else {
                throw new IllegalStateException();
            }
            float[] fArr2 = this.f21871b;
            System.arraycopy(fArr, 0, fArr2, 0, fArr2.length);
            SensorManager.remapCoordinateSystem(this.f21871b, i2, i3, fArr);
        }
    }
}
