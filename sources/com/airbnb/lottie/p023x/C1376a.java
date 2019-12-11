package com.airbnb.lottie.p023x;

import android.graphics.PointF;
import android.view.animation.Interpolator;
import com.airbnb.lottie.C1182d;

/* renamed from: com.airbnb.lottie.x.a */
/* compiled from: Keyframe */
public class C1376a<T> {

    /* renamed from: a */
    private final C1182d f5052a;

    /* renamed from: b */
    public final T f5053b;

    /* renamed from: c */
    public T f5054c;

    /* renamed from: d */
    public final Interpolator f5055d;

    /* renamed from: e */
    public final float f5056e;

    /* renamed from: f */
    public Float f5057f;

    /* renamed from: g */
    private float f5058g;

    /* renamed from: h */
    private float f5059h;

    /* renamed from: i */
    private int f5060i;

    /* renamed from: j */
    private int f5061j;

    /* renamed from: k */
    private float f5062k;

    /* renamed from: l */
    private float f5063l;

    /* renamed from: m */
    public PointF f5064m;

    /* renamed from: n */
    public PointF f5065n;

    public C1376a(C1182d dVar, T t, T t2, Interpolator interpolator, float f, Float f2) {
        this.f5058g = -3987645.8f;
        this.f5059h = -3987645.8f;
        this.f5060i = 784923401;
        this.f5061j = 784923401;
        this.f5062k = Float.MIN_VALUE;
        this.f5063l = Float.MIN_VALUE;
        this.f5064m = null;
        this.f5065n = null;
        this.f5052a = dVar;
        this.f5053b = t;
        this.f5054c = t2;
        this.f5055d = interpolator;
        this.f5056e = f;
        this.f5057f = f2;
    }

    /* renamed from: a */
    public float mo6419a() {
        if (this.f5052a == null) {
            return 1.0f;
        }
        if (this.f5063l == Float.MIN_VALUE) {
            if (this.f5057f == null) {
                this.f5063l = 1.0f;
            } else {
                this.f5063l = mo6423d() + ((this.f5057f.floatValue() - this.f5056e) / this.f5052a.mo6037d());
            }
        }
        return this.f5063l;
    }

    /* renamed from: b */
    public float mo6421b() {
        if (this.f5059h == -3987645.8f) {
            this.f5059h = ((Float) this.f5054c).floatValue();
        }
        return this.f5059h;
    }

    /* renamed from: c */
    public int mo6422c() {
        if (this.f5061j == 784923401) {
            this.f5061j = ((Integer) this.f5054c).intValue();
        }
        return this.f5061j;
    }

    /* renamed from: d */
    public float mo6423d() {
        C1182d dVar = this.f5052a;
        if (dVar == null) {
            return 0.0f;
        }
        if (this.f5062k == Float.MIN_VALUE) {
            this.f5062k = (this.f5056e - dVar.mo6045l()) / this.f5052a.mo6037d();
        }
        return this.f5062k;
    }

    /* renamed from: e */
    public float mo6424e() {
        if (this.f5058g == -3987645.8f) {
            this.f5058g = ((Float) this.f5053b).floatValue();
        }
        return this.f5058g;
    }

    /* renamed from: f */
    public int mo6425f() {
        if (this.f5060i == 784923401) {
            this.f5060i = ((Integer) this.f5053b).intValue();
        }
        return this.f5060i;
    }

    /* renamed from: g */
    public boolean mo6426g() {
        return this.f5055d == null;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Keyframe{startValue=");
        sb.append(this.f5053b);
        sb.append(", endValue=");
        sb.append(this.f5054c);
        sb.append(", startFrame=");
        sb.append(this.f5056e);
        sb.append(", endFrame=");
        sb.append(this.f5057f);
        sb.append(", interpolator=");
        sb.append(this.f5055d);
        sb.append('}');
        return sb.toString();
    }

    /* renamed from: a */
    public boolean mo6420a(float f) {
        return f >= mo6423d() && f < mo6419a();
    }

    public C1376a(T t) {
        this.f5058g = -3987645.8f;
        this.f5059h = -3987645.8f;
        this.f5060i = 784923401;
        this.f5061j = 784923401;
        this.f5062k = Float.MIN_VALUE;
        this.f5063l = Float.MIN_VALUE;
        this.f5064m = null;
        this.f5065n = null;
        this.f5052a = null;
        this.f5053b = t;
        this.f5054c = t;
        this.f5055d = null;
        this.f5056e = Float.MIN_VALUE;
        this.f5057f = Float.valueOf(Float.MAX_VALUE);
    }
}
