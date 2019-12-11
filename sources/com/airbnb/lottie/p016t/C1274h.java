package com.airbnb.lottie.p016t;

/* renamed from: com.airbnb.lottie.t.h */
/* compiled from: Marker */
public class C1274h {

    /* renamed from: d */
    private static String f4779d = "\r";

    /* renamed from: a */
    private final String f4780a;

    /* renamed from: b */
    public final float f4781b;

    /* renamed from: c */
    public final float f4782c;

    public C1274h(String str, float f, float f2) {
        this.f4780a = str;
        this.f4782c = f2;
        this.f4781b = f;
    }

    /* renamed from: a */
    public boolean mo6218a(String str) {
        if (this.f4780a.equalsIgnoreCase(str)) {
            return true;
        }
        if (this.f4780a.endsWith(f4779d)) {
            String str2 = this.f4780a;
            if (str2.substring(0, str2.length() - 1).equalsIgnoreCase(str)) {
                return true;
            }
        }
        return false;
    }
}
