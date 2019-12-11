package com.airbnb.lottie.p016t.p018k;

import com.airbnb.lottie.C1191f;
import com.airbnb.lottie.p012r.p013b.C1227c;
import com.airbnb.lottie.p012r.p013b.C1244r;
import com.airbnb.lottie.p016t.p017j.C1283h;
import com.airbnb.lottie.p016t.p019l.C1314a;

/* renamed from: com.airbnb.lottie.t.k.o */
/* compiled from: ShapePath */
public class C1307o implements C1291b {

    /* renamed from: a */
    private final String f4886a;

    /* renamed from: b */
    private final int f4887b;

    /* renamed from: c */
    private final C1283h f4888c;

    /* renamed from: d */
    private final boolean f4889d;

    public C1307o(String str, int i, C1283h hVar, boolean z) {
        this.f4886a = str;
        this.f4887b = i;
        this.f4888c = hVar;
        this.f4889d = z;
    }

    /* renamed from: a */
    public String mo6312a() {
        return this.f4886a;
    }

    /* renamed from: b */
    public C1283h mo6313b() {
        return this.f4888c;
    }

    /* renamed from: c */
    public boolean mo6314c() {
        return this.f4889d;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("ShapePath{name=");
        sb.append(this.f4886a);
        sb.append(", index=");
        sb.append(this.f4887b);
        sb.append('}');
        return sb.toString();
    }

    /* renamed from: a */
    public C1227c mo6226a(C1191f fVar, C1314a aVar) {
        return new C1244r(fVar, aVar, this);
    }
}
