package com.airbnb.lottie.p022w;

import android.content.res.Resources;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PointF;
import com.airbnb.lottie.C1181c;
import com.airbnb.lottie.p012r.p013b.C1246t;
import com.airbnb.lottie.p012r.p014c.C1250c;
import java.io.Closeable;

/* renamed from: com.airbnb.lottie.w.f */
/* compiled from: Utils */
public final class C1375f {

    /* renamed from: a */
    private static final PathMeasure f5046a = new PathMeasure();

    /* renamed from: b */
    private static final Path f5047b = new Path();

    /* renamed from: c */
    private static final Path f5048c = new Path();

    /* renamed from: d */
    private static final float[] f5049d = new float[4];

    /* renamed from: e */
    private static final float f5050e = ((float) Math.sqrt(2.0d));

    /* renamed from: f */
    private static float f5051f = -1.0f;

    /* renamed from: a */
    public static int m6734a(float f, float f2, float f3, float f4) {
        int i = f != 0.0f ? (int) (((float) 527) * f) : 17;
        if (f2 != 0.0f) {
            i = (int) (((float) (i * 31)) * f2);
        }
        if (f3 != 0.0f) {
            i = (int) (((float) (i * 31)) * f3);
        }
        return f4 != 0.0f ? (int) (((float) (i * 31)) * f4) : i;
    }

    /* renamed from: a */
    public static Path m6735a(PointF pointF, PointF pointF2, PointF pointF3, PointF pointF4) {
        Path path = new Path();
        path.moveTo(pointF.x, pointF.y);
        if (pointF3 == null || pointF4 == null || (pointF3.length() == 0.0f && pointF4.length() == 0.0f)) {
            path.lineTo(pointF2.x, pointF2.y);
        } else {
            float f = pointF3.x + pointF.x;
            float f2 = pointF.y + pointF3.y;
            float f3 = pointF2.x;
            float f4 = f3 + pointF4.x;
            float f5 = pointF2.y;
            path.cubicTo(f, f2, f4, f5 + pointF4.y, f3, f5);
        }
        return path;
    }

    /* renamed from: a */
    public static boolean m6739a(int i, int i2, int i3, int i4, int i5, int i6) {
        boolean z = false;
        if (i < i4) {
            return false;
        }
        if (i > i4) {
            return true;
        }
        if (i2 < i5) {
            return false;
        }
        if (i2 > i5) {
            return true;
        }
        if (i3 >= i6) {
            z = true;
        }
        return z;
    }

    /* renamed from: b */
    public static boolean m6740b(Matrix matrix) {
        float[] fArr = f5049d;
        fArr[0] = 0.0f;
        fArr[1] = 0.0f;
        fArr[2] = 37394.73f;
        fArr[3] = 39575.234f;
        matrix.mapPoints(fArr);
        float[] fArr2 = f5049d;
        return fArr2[0] == fArr2[2] || fArr2[1] == fArr2[3];
    }

    /* renamed from: a */
    public static void m6738a(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (RuntimeException e) {
                throw e;
            } catch (Exception unused) {
            }
        }
    }

    /* renamed from: a */
    public static float m6733a(Matrix matrix) {
        float[] fArr = f5049d;
        fArr[0] = 0.0f;
        fArr[1] = 0.0f;
        float f = f5050e;
        fArr[2] = f;
        fArr[3] = f;
        matrix.mapPoints(fArr);
        float[] fArr2 = f5049d;
        return ((float) Math.hypot((double) (fArr2[2] - fArr2[0]), (double) (fArr2[3] - fArr2[1]))) / 2.0f;
    }

    /* renamed from: a */
    public static void m6737a(Path path, C1246t tVar) {
        if (tVar != null && !tVar.mo6159f()) {
            m6736a(path, ((C1250c) tVar.mo6157d()).mo6173i() / 100.0f, ((C1250c) tVar.mo6155b()).mo6173i() / 100.0f, ((C1250c) tVar.mo6156c()).mo6173i() / 360.0f);
        }
    }

    /* renamed from: a */
    public static void m6736a(Path path, float f, float f2, float f3) {
        String str = "applyTrimPathIfNeeded";
        C1181c.m6032a(str);
        f5046a.setPath(path, false);
        float length = f5046a.getLength();
        if (f == 1.0f && f2 == 0.0f) {
            C1181c.m6034c(str);
        } else if (length < 1.0f || ((double) Math.abs((f2 - f) - 1.0f)) < 0.01d) {
            C1181c.m6034c(str);
        } else {
            float f4 = f * length;
            float f5 = f2 * length;
            float f6 = f3 * length;
            float min = Math.min(f4, f5) + f6;
            float max = Math.max(f4, f5) + f6;
            if (min >= length && max >= length) {
                min = (float) C1374e.m6722a(min, length);
                max = (float) C1374e.m6722a(max, length);
            }
            if (min < 0.0f) {
                min = (float) C1374e.m6722a(min, length);
            }
            if (max < 0.0f) {
                max = (float) C1374e.m6722a(max, length);
            }
            int i = (min > max ? 1 : (min == max ? 0 : -1));
            if (i == 0) {
                path.reset();
                C1181c.m6034c(str);
                return;
            }
            if (i >= 0) {
                min -= length;
            }
            f5047b.reset();
            f5046a.getSegment(min, max, f5047b, true);
            if (max > length) {
                f5048c.reset();
                f5046a.getSegment(0.0f, max % length, f5048c, true);
                f5047b.addPath(f5048c);
            } else if (min < 0.0f) {
                f5048c.reset();
                f5046a.getSegment(min + length, length, f5048c, true);
                f5047b.addPath(f5048c);
            }
            path.set(f5047b);
            C1181c.m6034c(str);
        }
    }

    /* renamed from: a */
    public static float m6732a() {
        if (f5051f == -1.0f) {
            f5051f = Resources.getSystem().getDisplayMetrics().density;
        }
        return f5051f;
    }
}
