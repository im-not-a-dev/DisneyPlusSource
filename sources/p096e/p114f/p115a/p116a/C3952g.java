package p096e.p114f.p115a.p116a;

import androidx.constraintlayout.motion.widget.C0356q;

/* renamed from: e.f.a.a.g */
/* compiled from: StopLogic */
public class C3952g extends C0356q {

    /* renamed from: a */
    private float f9815a;

    /* renamed from: b */
    private float f9816b;

    /* renamed from: c */
    private float f9817c;

    /* renamed from: d */
    private float f9818d;

    /* renamed from: e */
    private float f9819e;

    /* renamed from: f */
    private float f9820f;

    /* renamed from: g */
    private float f9821g;

    /* renamed from: h */
    private float f9822h;

    /* renamed from: i */
    private float f9823i;

    /* renamed from: j */
    private int f9824j;

    /* renamed from: k */
    private boolean f9825k = false;

    /* renamed from: l */
    private float f9826l;

    /* renamed from: m */
    private float f9827m;

    /* renamed from: b */
    private float m13320b(float f) {
        float f2 = this.f9818d;
        if (f <= f2) {
            float f3 = this.f9815a;
            return (f3 * f) + ((((this.f9816b - f3) * f) * f) / (f2 * 2.0f));
        }
        int i = this.f9824j;
        if (i == 1) {
            return this.f9821g;
        }
        float f4 = f - f2;
        float f5 = this.f9819e;
        if (f4 < f5) {
            float f6 = this.f9821g;
            float f7 = this.f9816b;
            return f6 + (f7 * f4) + ((((this.f9817c - f7) * f4) * f4) / (f5 * 2.0f));
        } else if (i == 2) {
            return this.f9822h;
        } else {
            float f8 = f4 - f5;
            float f9 = this.f9820f;
            if (f8 >= f9) {
                return this.f9823i;
            }
            float f10 = this.f9822h;
            float f11 = this.f9817c;
            return (f10 + (f11 * f8)) - (((f11 * f8) * f8) / (f9 * 2.0f));
        }
    }

    /* renamed from: a */
    public float mo14208a(float f) {
        float f2 = this.f9818d;
        if (f <= f2) {
            float f3 = this.f9815a;
            return f3 + (((this.f9816b - f3) * f) / f2);
        }
        int i = this.f9824j;
        if (i == 1) {
            return 0.0f;
        }
        float f4 = f - f2;
        float f5 = this.f9819e;
        if (f4 < f5) {
            float f6 = this.f9816b;
            return f6 + (((this.f9817c - f6) * f4) / f5);
        } else if (i == 2) {
            return this.f9822h;
        } else {
            float f7 = f4 - f5;
            float f8 = this.f9820f;
            if (f7 >= f8) {
                return this.f9823i;
            }
            float f9 = this.f9817c;
            return f9 - ((f7 * f9) / f8);
        }
    }

    public float getInterpolation(float f) {
        float b = m13320b(f);
        this.f9827m = f;
        return this.f9825k ? this.f9826l - b : this.f9826l + b;
    }

    /* renamed from: a */
    public void mo14209a(float f, float f2, float f3, float f4, float f5, float f6) {
        this.f9826l = f;
        this.f9825k = f > f2;
        if (this.f9825k) {
            m13319a(-f3, f - f2, f5, f6, f4);
        } else {
            m13319a(f3, f2 - f, f5, f6, f4);
        }
    }

    /* renamed from: a */
    public float mo2173a() {
        return mo14208a(this.f9827m);
    }

    /* renamed from: a */
    private void m13319a(float f, float f2, float f3, float f4, float f5) {
        if (f == 0.0f) {
            f = 1.0E-4f;
        }
        this.f9815a = f;
        float f6 = f / f3;
        float f7 = (f6 * f) / 2.0f;
        if (f < 0.0f) {
            float sqrt = (float) Math.sqrt((double) ((f2 - ((((-f) / f3) * f) / 2.0f)) * f3));
            if (sqrt < f4) {
                this.f9824j = 2;
                this.f9815a = f;
                this.f9816b = sqrt;
                this.f9817c = 0.0f;
                this.f9818d = (sqrt - f) / f3;
                this.f9819e = sqrt / f3;
                this.f9821g = ((f + sqrt) * this.f9818d) / 2.0f;
                this.f9822h = f2;
                this.f9823i = f2;
                return;
            }
            this.f9824j = 3;
            this.f9815a = f;
            this.f9816b = f4;
            this.f9817c = f4;
            this.f9818d = (f4 - f) / f3;
            this.f9820f = f4 / f3;
            float f8 = ((f + f4) * this.f9818d) / 2.0f;
            float f9 = (this.f9820f * f4) / 2.0f;
            this.f9819e = ((f2 - f8) - f9) / f4;
            this.f9821g = f8;
            this.f9822h = f2 - f9;
            this.f9823i = f2;
        } else if (f7 >= f2) {
            float f10 = (2.0f * f2) / f;
            this.f9824j = 1;
            this.f9815a = f;
            this.f9816b = 0.0f;
            this.f9821g = f2;
            this.f9818d = f10;
        } else {
            float f11 = f2 - f7;
            float f12 = f11 / f;
            if (f12 + f6 < f5) {
                this.f9824j = 2;
                this.f9815a = f;
                this.f9816b = f;
                this.f9817c = 0.0f;
                this.f9821g = f11;
                this.f9822h = f2;
                this.f9818d = f12;
                this.f9819e = f6;
                return;
            }
            float sqrt2 = (float) Math.sqrt((double) ((f3 * f2) + ((f * f) / 2.0f)));
            float f13 = (sqrt2 - f) / f3;
            this.f9818d = f13;
            float f14 = sqrt2 / f3;
            this.f9819e = f14;
            if (sqrt2 < f4) {
                this.f9824j = 2;
                this.f9815a = f;
                this.f9816b = sqrt2;
                this.f9817c = 0.0f;
                this.f9818d = f13;
                this.f9819e = f14;
                this.f9821g = ((f + sqrt2) * this.f9818d) / 2.0f;
                this.f9822h = f2;
                return;
            }
            this.f9824j = 3;
            this.f9815a = f;
            this.f9816b = f4;
            this.f9817c = f4;
            this.f9818d = (f4 - f) / f3;
            this.f9820f = f4 / f3;
            float f15 = ((f + f4) * this.f9818d) / 2.0f;
            float f16 = (this.f9820f * f4) / 2.0f;
            this.f9819e = ((f2 - f15) - f16) / f4;
            this.f9821g = f15;
            this.f9822h = f2 - f16;
            this.f9823i = f2;
        }
    }
}
