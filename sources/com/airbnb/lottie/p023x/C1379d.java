package com.airbnb.lottie.p023x;

/* renamed from: com.airbnb.lottie.x.d */
/* compiled from: ScaleXY */
public class C1379d {

    /* renamed from: a */
    private float f5068a;

    /* renamed from: b */
    private float f5069b;

    public C1379d(float f, float f2) {
        this.f5068a = f;
        this.f5069b = f2;
    }

    /* renamed from: a */
    public float mo6432a() {
        return this.f5068a;
    }

    /* renamed from: b */
    public float mo6434b() {
        return this.f5069b;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(mo6432a());
        sb.append("x");
        sb.append(mo6434b());
        return sb.toString();
    }

    /* renamed from: a */
    public boolean mo6433a(float f, float f2) {
        return this.f5068a == f && this.f5069b == f2;
    }

    /* renamed from: b */
    public void mo6435b(float f, float f2) {
        this.f5068a = f;
        this.f5069b = f2;
    }

    public C1379d() {
        this(1.0f, 1.0f);
    }
}
