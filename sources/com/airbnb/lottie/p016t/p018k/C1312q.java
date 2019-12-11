package com.airbnb.lottie.p016t.p018k;

import com.airbnb.lottie.C1191f;
import com.airbnb.lottie.p012r.p013b.C1227c;
import com.airbnb.lottie.p012r.p013b.C1246t;
import com.airbnb.lottie.p016t.p017j.C1277b;
import com.airbnb.lottie.p016t.p019l.C1314a;

/* renamed from: com.airbnb.lottie.t.k.q */
/* compiled from: ShapeTrimPath */
public class C1312q implements C1291b {

    /* renamed from: a */
    private final String f4910a;

    /* renamed from: b */
    private final C1313a f4911b;

    /* renamed from: c */
    private final C1277b f4912c;

    /* renamed from: d */
    private final C1277b f4913d;

    /* renamed from: e */
    private final C1277b f4914e;

    /* renamed from: f */
    private final boolean f4915f;

    /* renamed from: com.airbnb.lottie.t.k.q$a */
    /* compiled from: ShapeTrimPath */
    public enum C1313a {
        SIMULTANEOUSLY,
        INDIVIDUALLY;

        /* renamed from: a */
        public static C1313a m6501a(int i) {
            if (i == 1) {
                return SIMULTANEOUSLY;
            }
            if (i == 2) {
                return INDIVIDUALLY;
            }
            StringBuilder sb = new StringBuilder();
            sb.append("Unknown trim path type ");
            sb.append(i);
            throw new IllegalArgumentException(sb.toString());
        }
    }

    public C1312q(String str, C1313a aVar, C1277b bVar, C1277b bVar2, C1277b bVar3, boolean z) {
        this.f4910a = str;
        this.f4911b = aVar;
        this.f4912c = bVar;
        this.f4913d = bVar2;
        this.f4914e = bVar3;
        this.f4915f = z;
    }

    /* renamed from: a */
    public C1277b mo6328a() {
        return this.f4913d;
    }

    /* renamed from: b */
    public String mo6329b() {
        return this.f4910a;
    }

    /* renamed from: c */
    public C1277b mo6330c() {
        return this.f4914e;
    }

    /* renamed from: d */
    public C1277b mo6331d() {
        return this.f4912c;
    }

    /* renamed from: e */
    public C1313a mo6332e() {
        return this.f4911b;
    }

    /* renamed from: f */
    public boolean mo6333f() {
        return this.f4915f;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Trim Path: {start: ");
        sb.append(this.f4912c);
        sb.append(", end: ");
        sb.append(this.f4913d);
        sb.append(", offset: ");
        sb.append(this.f4914e);
        sb.append("}");
        return sb.toString();
    }

    /* renamed from: a */
    public C1227c mo6226a(C1191f fVar, C1314a aVar) {
        return new C1246t(aVar, this);
    }
}
