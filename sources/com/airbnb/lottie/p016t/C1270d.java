package com.airbnb.lottie.p016t;

import com.airbnb.lottie.p016t.p018k.C1306n;
import java.util.List;

/* renamed from: com.airbnb.lottie.t.d */
/* compiled from: FontCharacter */
public class C1270d {

    /* renamed from: a */
    private final List<C1306n> f4770a;

    /* renamed from: b */
    private final char f4771b;

    /* renamed from: c */
    private final double f4772c;

    /* renamed from: d */
    private final String f4773d;

    /* renamed from: e */
    private final String f4774e;

    public C1270d(List<C1306n> list, char c, double d, double d2, String str, String str2) {
        this.f4770a = list;
        this.f4771b = c;
        this.f4772c = d2;
        this.f4773d = str;
        this.f4774e = str2;
    }

    /* renamed from: a */
    public static int m6348a(char c, String str, String str2) {
        return ((((0 + c) * 31) + str.hashCode()) * 31) + str2.hashCode();
    }

    /* renamed from: b */
    public double mo6206b() {
        return this.f4772c;
    }

    public int hashCode() {
        return m6348a(this.f4771b, this.f4774e, this.f4773d);
    }

    /* renamed from: a */
    public List<C1306n> mo6205a() {
        return this.f4770a;
    }
}
