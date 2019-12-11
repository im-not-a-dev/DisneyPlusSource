package com.airbnb.lottie.p016t.p018k;

import android.graphics.PointF;
import com.airbnb.lottie.C1191f;
import com.airbnb.lottie.p012r.p013b.C1227c;
import com.airbnb.lottie.p012r.p013b.C1242p;
import com.airbnb.lottie.p016t.p017j.C1277b;
import com.airbnb.lottie.p016t.p017j.C1281f;
import com.airbnb.lottie.p016t.p017j.C1288m;
import com.airbnb.lottie.p016t.p019l.C1314a;

/* renamed from: com.airbnb.lottie.t.k.j */
/* compiled from: RectangleShape */
public class C1302j implements C1291b {

    /* renamed from: a */
    private final String f4864a;

    /* renamed from: b */
    private final C1288m<PointF, PointF> f4865b;

    /* renamed from: c */
    private final C1281f f4866c;

    /* renamed from: d */
    private final C1277b f4867d;

    /* renamed from: e */
    private final boolean f4868e;

    public C1302j(String str, C1288m<PointF, PointF> mVar, C1281f fVar, C1277b bVar, boolean z) {
        this.f4864a = str;
        this.f4865b = mVar;
        this.f4866c = fVar;
        this.f4867d = bVar;
        this.f4868e = z;
    }

    /* renamed from: a */
    public C1277b mo6286a() {
        return this.f4867d;
    }

    /* renamed from: b */
    public String mo6287b() {
        return this.f4864a;
    }

    /* renamed from: c */
    public C1288m<PointF, PointF> mo6288c() {
        return this.f4865b;
    }

    /* renamed from: d */
    public C1281f mo6289d() {
        return this.f4866c;
    }

    /* renamed from: e */
    public boolean mo6290e() {
        return this.f4868e;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("RectangleShape{position=");
        sb.append(this.f4865b);
        sb.append(", size=");
        sb.append(this.f4866c);
        sb.append('}');
        return sb.toString();
    }

    /* renamed from: a */
    public C1227c mo6226a(C1191f fVar, C1314a aVar) {
        return new C1242p(fVar, aVar, this);
    }
}
