package com.airbnb.lottie.p016t.p018k;

import android.graphics.Path.FillType;
import com.airbnb.lottie.C1191f;
import com.airbnb.lottie.p012r.p013b.C1227c;
import com.airbnb.lottie.p012r.p013b.C1231g;
import com.airbnb.lottie.p016t.p017j.C1276a;
import com.airbnb.lottie.p016t.p017j.C1279d;
import com.airbnb.lottie.p016t.p019l.C1314a;

/* renamed from: com.airbnb.lottie.t.k.m */
/* compiled from: ShapeFill */
public class C1305m implements C1291b {

    /* renamed from: a */
    private final boolean f4877a;

    /* renamed from: b */
    private final FillType f4878b;

    /* renamed from: c */
    private final String f4879c;

    /* renamed from: d */
    private final C1276a f4880d;

    /* renamed from: e */
    private final C1279d f4881e;

    /* renamed from: f */
    private final boolean f4882f;

    public C1305m(String str, boolean z, FillType fillType, C1276a aVar, C1279d dVar, boolean z2) {
        this.f4879c = str;
        this.f4877a = z;
        this.f4878b = fillType;
        this.f4880d = aVar;
        this.f4881e = dVar;
        this.f4882f = z2;
    }

    /* renamed from: a */
    public C1276a mo6302a() {
        return this.f4880d;
    }

    /* renamed from: b */
    public FillType mo6303b() {
        return this.f4878b;
    }

    /* renamed from: c */
    public String mo6304c() {
        return this.f4879c;
    }

    /* renamed from: d */
    public C1279d mo6305d() {
        return this.f4881e;
    }

    /* renamed from: e */
    public boolean mo6306e() {
        return this.f4882f;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("ShapeFill{color=, fillEnabled=");
        sb.append(this.f4877a);
        sb.append('}');
        return sb.toString();
    }

    /* renamed from: a */
    public C1227c mo6226a(C1191f fVar, C1314a aVar) {
        return new C1231g(fVar, aVar, this);
    }
}
