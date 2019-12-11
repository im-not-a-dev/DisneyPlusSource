package com.bamtechmedia.dominguez.core.p084g.p086d;

import android.graphics.PointF;
import android.view.animation.Interpolator;
import kotlin.Metadata;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\u0018\u0000 \u00182\u00020\u0001:\u0001\u0018B'\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0002\u0010\u0007B'\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\b\u0012\u0006\u0010\u0004\u001a\u00020\b\u0012\u0006\u0010\u0005\u001a\u00020\b\u0012\u0006\u0010\u0006\u001a\u00020\b¢\u0006\u0002\u0010\tB\u0015\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0002\u0010\rJ\u0010\u0010\u0011\u001a\u00020\u00032\u0006\u0010\u0012\u001a\u00020\u0003H\u0002J\u0010\u0010\u0013\u001a\u00020\u00032\u0006\u0010\u0012\u001a\u00020\u0003H\u0002J\u0010\u0010\u0014\u001a\u00020\u00032\u0006\u0010\u0012\u001a\u00020\u0003H\u0016J\u0010\u0010\u0015\u001a\u00020\u00032\u0006\u0010\u0016\u001a\u00020\u0003H\u0002J\u0010\u0010\u0017\u001a\u00020\u00032\u0006\u0010\u0012\u001a\u00020\u0003H\u0002R\u000e\u0010\u000e\u001a\u00020\u000bX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u000bX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u000bX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u000bX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u000e¢\u0006\u0002\n\u0000¨\u0006\u0019"}, mo31007d2 = {"Lcom/bamtechmedia/dominguez/core/animation/interpolators/CubicBezierInterpolator;", "Landroid/view/animation/Interpolator;", "startX", "", "startY", "endX", "endY", "(FFFF)V", "", "(DDDD)V", "start", "Landroid/graphics/PointF;", "end", "(Landroid/graphics/PointF;Landroid/graphics/PointF;)V", "a", "b", "c", "getBezierCoordinateX", "time", "getBezierCoordinateY", "getInterpolation", "getXDerivate", "t", "getXForTime", "Companion", "core-utils_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* renamed from: com.bamtechmedia.dominguez.core.g.d.a */
/* compiled from: CubicBezierInterpolator.kt */
public final class C3822a implements Interpolator {
    /* access modifiers changed from: private */

    /* renamed from: f */
    public static final C3822a f9504f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public static final C3822a f9505g;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public static final C3822a f9506h;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public static final C3822a f9507i;
    /* access modifiers changed from: private */

    /* renamed from: j */
    public static final C3822a f9508j;

    /* renamed from: k */
    public static final C3823a f9509k = new C3823a(null);

    /* renamed from: a */
    private PointF f9510a;

    /* renamed from: b */
    private PointF f9511b;

    /* renamed from: c */
    private PointF f9512c;

    /* renamed from: d */
    private PointF f9513d;

    /* renamed from: e */
    private PointF f9514e;

    /* renamed from: com.bamtechmedia.dominguez.core.g.d.a$a */
    /* compiled from: CubicBezierInterpolator.kt */
    public static final class C3823a {
        private C3823a() {
        }

        /* renamed from: a */
        public final C3822a mo13746a() {
            return C3822a.f9505g;
        }

        /* renamed from: b */
        public final C3822a mo13747b() {
            return C3822a.f9504f;
        }

        /* renamed from: c */
        public final C3822a mo13748c() {
            return C3822a.f9506h;
        }

        /* renamed from: d */
        public final C3822a mo13749d() {
            return C3822a.f9508j;
        }

        /* renamed from: e */
        public final C3822a mo13750e() {
            return C3822a.f9507i;
        }

        public /* synthetic */ C3823a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    static {
        C3822a aVar = new C3822a(0.0d, 0.0d, 0.58d, 1.0d);
        f9504f = aVar;
        C3822a aVar2 = new C3822a(0.42d, 0.0d, 1.0d, 1.0d);
        f9505g = aVar2;
        C3822a aVar3 = new C3822a(0.215d, 0.61d, 0.355d, 1.0d);
        f9506h = aVar3;
        C3822a aVar4 = new C3822a(0.165d, 0.84d, 0.44d, 1.0d);
        f9507i = aVar4;
        C3822a aVar5 = new C3822a(0.25d, 0.46d, 0.45d, 0.94d);
        f9508j = aVar5;
    }

    public C3822a(PointF pointF, PointF pointF2) {
        this.f9513d = pointF;
        this.f9514e = pointF2;
        this.f9510a = new PointF();
        this.f9511b = new PointF();
        this.f9512c = new PointF();
        float f = this.f9513d.x;
        float f2 = (float) 0;
        if (f >= f2) {
            float f3 = (float) 1;
            if (f <= f3) {
                float f4 = this.f9514e.x;
                if (f4 < f2 || f4 > f3) {
                    throw new IllegalArgumentException("endX value must be in the range [0, 1]");
                }
                return;
            }
        }
        throw new IllegalArgumentException("startX value must be in the range [0, 1]");
    }

    public float getInterpolation(float f) {
        return m12899b(m12903d(f));
    }

    /* renamed from: a */
    private final float m12897a(float f) {
        PointF pointF = this.f9512c;
        float f2 = (float) 3;
        PointF pointF2 = this.f9513d;
        pointF.x = pointF2.x * f2;
        PointF pointF3 = this.f9511b;
        pointF3.x = (f2 * (this.f9514e.x - pointF2.x)) - pointF.x;
        PointF pointF4 = this.f9510a;
        pointF4.x = (1.0f - pointF.x) - pointF3.x;
        return f * (pointF.x + ((pointF3.x + (pointF4.x * f)) * f));
    }

    /* renamed from: b */
    private final float m12899b(float f) {
        PointF pointF = this.f9512c;
        float f2 = (float) 3;
        PointF pointF2 = this.f9513d;
        pointF.y = pointF2.y * f2;
        PointF pointF3 = this.f9511b;
        pointF3.y = (f2 * (this.f9514e.y - pointF2.y)) - pointF.y;
        PointF pointF4 = this.f9510a;
        pointF4.y = (1.0f - pointF.y) - pointF3.y;
        return f * (pointF.y + ((pointF3.y + (pointF4.y * f)) * f));
    }

    /* renamed from: c */
    private final float m12901c(float f) {
        return this.f9512c.x + (f * ((((float) 2) * this.f9511b.x) + (this.f9510a.x * 3.0f * f)));
    }

    /* renamed from: d */
    private final float m12903d(float f) {
        float f2 = f;
        for (int i = 1; i <= 13; i++) {
            float a = m12897a(f2) - f;
            if (((double) Math.abs(a)) < 0.001d) {
                break;
            }
            f2 -= a / m12901c(f2);
        }
        return f2;
    }

    public C3822a(float f, float f2, float f3, float f4) {
        this(new PointF(f, f2), new PointF(f3, f4));
    }

    public C3822a(double d, double d2, double d3, double d4) {
        this((float) d, (float) d2, (float) d3, (float) d4);
    }
}
