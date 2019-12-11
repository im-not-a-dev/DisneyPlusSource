package com.airbnb.lottie.p016t;

/* renamed from: com.airbnb.lottie.t.b */
/* compiled from: DocumentData */
public class C1267b {

    /* renamed from: a */
    public final String f4752a;

    /* renamed from: b */
    public final String f4753b;

    /* renamed from: c */
    public final double f4754c;

    /* renamed from: d */
    public final C1268a f4755d;

    /* renamed from: e */
    public final int f4756e;

    /* renamed from: f */
    public final double f4757f;

    /* renamed from: g */
    public final double f4758g;

    /* renamed from: h */
    public final int f4759h;

    /* renamed from: i */
    public final int f4760i;

    /* renamed from: j */
    public final double f4761j;

    /* renamed from: k */
    public final boolean f4762k;

    /* renamed from: com.airbnb.lottie.t.b$a */
    /* compiled from: DocumentData */
    public enum C1268a {
        LEFT_ALIGN,
        RIGHT_ALIGN,
        CENTER
    }

    public C1267b(String str, String str2, double d, C1268a aVar, int i, double d2, double d3, int i2, int i3, double d4, boolean z) {
        this.f4752a = str;
        this.f4753b = str2;
        this.f4754c = d;
        this.f4755d = aVar;
        this.f4756e = i;
        this.f4757f = d2;
        this.f4758g = d3;
        this.f4759h = i2;
        this.f4760i = i3;
        this.f4761j = d4;
        this.f4762k = z;
    }

    public int hashCode() {
        int hashCode = (((((int) (((double) (((this.f4752a.hashCode() * 31) + this.f4753b.hashCode()) * 31)) + this.f4754c)) * 31) + this.f4755d.ordinal()) * 31) + this.f4756e;
        long doubleToLongBits = Double.doubleToLongBits(this.f4757f);
        return (((hashCode * 31) + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)))) * 31) + this.f4759h;
    }
}
