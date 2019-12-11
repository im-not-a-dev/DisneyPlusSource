package p096e.p158r.p159a.p160a;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.Resources.Theme;
import android.content.res.TypedArray;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.util.AttributeSet;
import android.view.InflateException;
import android.view.animation.Interpolator;
import org.xmlpull.v1.XmlPullParser;
import p096e.p121h.p122j.p124d.C4044h;
import p096e.p121h.p125k.C4046b;

/* renamed from: e.r.a.a.g */
/* compiled from: PathInterpolatorCompat */
public class C4367g implements Interpolator {

    /* renamed from: a */
    private float[] f10835a;

    /* renamed from: b */
    private float[] f10836b;

    public C4367g(Context context, AttributeSet attributeSet, XmlPullParser xmlPullParser) {
        this(context.getResources(), context.getTheme(), attributeSet, xmlPullParser);
    }

    /* renamed from: a */
    private void m15058a(TypedArray typedArray, XmlPullParser xmlPullParser) {
        String str = "pathData";
        if (C4044h.m13871a(xmlPullParser, str)) {
            String a = C4044h.m13868a(typedArray, xmlPullParser, str, 4);
            Path b = C4046b.m13890b(a);
            if (b != null) {
                m15059a(b);
                return;
            }
            StringBuilder sb = new StringBuilder();
            sb.append("The path is null, which is created from ");
            sb.append(a);
            throw new InflateException(sb.toString());
        }
        String str2 = "controlX1";
        if (C4044h.m13871a(xmlPullParser, str2)) {
            String str3 = "controlY1";
            if (C4044h.m13871a(xmlPullParser, str3)) {
                float a2 = C4044h.m13859a(typedArray, xmlPullParser, str2, 0, 0.0f);
                float a3 = C4044h.m13859a(typedArray, xmlPullParser, str3, 1, 0.0f);
                String str4 = "controlX2";
                boolean a4 = C4044h.m13871a(xmlPullParser, str4);
                String str5 = "controlY2";
                if (a4 != C4044h.m13871a(xmlPullParser, str5)) {
                    throw new InflateException("pathInterpolator requires both controlX2 and controlY2 for cubic Beziers.");
                } else if (!a4) {
                    m15056a(a2, a3);
                } else {
                    m15057a(a2, a3, C4044h.m13859a(typedArray, xmlPullParser, str4, 2, 0.0f), C4044h.m13859a(typedArray, xmlPullParser, str5, 3, 0.0f));
                }
            } else {
                throw new InflateException("pathInterpolator requires the controlY1 attribute");
            }
        } else {
            throw new InflateException("pathInterpolator requires the controlX1 attribute");
        }
    }

    public float getInterpolation(float f) {
        if (f <= 0.0f) {
            return 0.0f;
        }
        if (f >= 1.0f) {
            return 1.0f;
        }
        int i = 0;
        int length = this.f10835a.length - 1;
        while (length - i > 1) {
            int i2 = (i + length) / 2;
            if (f < this.f10835a[i2]) {
                length = i2;
            } else {
                i = i2;
            }
        }
        float[] fArr = this.f10835a;
        float f2 = fArr[length] - fArr[i];
        if (f2 == 0.0f) {
            return this.f10836b[i];
        }
        float f3 = (f - fArr[i]) / f2;
        float[] fArr2 = this.f10836b;
        float f4 = fArr2[i];
        return f4 + (f3 * (fArr2[length] - f4));
    }

    public C4367g(Resources resources, Theme theme, AttributeSet attributeSet, XmlPullParser xmlPullParser) {
        TypedArray a = C4044h.m13865a(resources, theme, attributeSet, C4356a.f10819l);
        m15058a(a, xmlPullParser);
        a.recycle();
    }

    /* renamed from: a */
    private void m15056a(float f, float f2) {
        Path path = new Path();
        path.moveTo(0.0f, 0.0f);
        path.quadTo(f, f2, 1.0f, 1.0f);
        m15059a(path);
    }

    /* renamed from: a */
    private void m15057a(float f, float f2, float f3, float f4) {
        Path path = new Path();
        path.moveTo(0.0f, 0.0f);
        path.cubicTo(f, f2, f3, f4, 1.0f, 1.0f);
        m15059a(path);
    }

    /* renamed from: a */
    private void m15059a(Path path) {
        int i = 0;
        PathMeasure pathMeasure = new PathMeasure(path, false);
        float length = pathMeasure.getLength();
        int min = Math.min(3000, ((int) (length / 0.002f)) + 1);
        if (min > 0) {
            this.f10835a = new float[min];
            this.f10836b = new float[min];
            float[] fArr = new float[2];
            for (int i2 = 0; i2 < min; i2++) {
                pathMeasure.getPosTan((((float) i2) * length) / ((float) (min - 1)), fArr, null);
                this.f10835a[i2] = fArr[0];
                this.f10836b[i2] = fArr[1];
            }
            if (((double) Math.abs(this.f10835a[0])) <= 1.0E-5d && ((double) Math.abs(this.f10836b[0])) <= 1.0E-5d) {
                int i3 = min - 1;
                if (((double) Math.abs(this.f10835a[i3] - 1.0f)) <= 1.0E-5d && ((double) Math.abs(this.f10836b[i3] - 1.0f)) <= 1.0E-5d) {
                    int i4 = 0;
                    float f = 0.0f;
                    while (i < min) {
                        float[] fArr2 = this.f10835a;
                        int i5 = i4 + 1;
                        float f2 = fArr2[i4];
                        if (f2 >= f) {
                            fArr2[i] = f2;
                            i++;
                            f = f2;
                            i4 = i5;
                        } else {
                            StringBuilder sb = new StringBuilder();
                            sb.append("The Path cannot loop back on itself, x :");
                            sb.append(f2);
                            throw new IllegalArgumentException(sb.toString());
                        }
                    }
                    if (pathMeasure.nextContour()) {
                        throw new IllegalArgumentException("The Path should be continuous, can't have 2+ contours");
                    }
                    return;
                }
            }
            StringBuilder sb2 = new StringBuilder();
            sb2.append("The Path must start at (0,0) and end at (1,1) start: ");
            sb2.append(this.f10835a[0]);
            String str = ",";
            sb2.append(str);
            sb2.append(this.f10836b[0]);
            sb2.append(" end:");
            int i6 = min - 1;
            sb2.append(this.f10835a[i6]);
            sb2.append(str);
            sb2.append(this.f10836b[i6]);
            throw new IllegalArgumentException(sb2.toString());
        }
        StringBuilder sb3 = new StringBuilder();
        sb3.append("The Path has a invalid length ");
        sb3.append(length);
        throw new IllegalArgumentException(sb3.toString());
    }
}
