package com.airbnb.lottie.p016t.p018k;

import com.airbnb.lottie.C1191f;
import com.airbnb.lottie.p012r.p013b.C1227c;
import com.airbnb.lottie.p012r.p013b.C1228d;
import com.airbnb.lottie.p016t.p019l.C1314a;
import java.util.Arrays;
import java.util.List;

/* renamed from: com.airbnb.lottie.t.k.n */
/* compiled from: ShapeGroup */
public class C1306n implements C1291b {

    /* renamed from: a */
    private final String f4883a;

    /* renamed from: b */
    private final List<C1291b> f4884b;

    /* renamed from: c */
    private final boolean f4885c;

    public C1306n(String str, List<C1291b> list, boolean z) {
        this.f4883a = str;
        this.f4884b = list;
        this.f4885c = z;
    }

    /* renamed from: a */
    public List<C1291b> mo6308a() {
        return this.f4884b;
    }

    /* renamed from: b */
    public String mo6309b() {
        return this.f4883a;
    }

    /* renamed from: c */
    public boolean mo6310c() {
        return this.f4885c;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("ShapeGroup{name='");
        sb.append(this.f4883a);
        sb.append("' Shapes: ");
        sb.append(Arrays.toString(this.f4884b.toArray()));
        sb.append('}');
        return sb.toString();
    }

    /* renamed from: a */
    public C1227c mo6226a(C1191f fVar, C1314a aVar) {
        return new C1228d(fVar, aVar, this);
    }
}
