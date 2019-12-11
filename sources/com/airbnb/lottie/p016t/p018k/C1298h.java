package com.airbnb.lottie.p016t.p018k;

import com.airbnb.lottie.C1181c;
import com.airbnb.lottie.C1191f;
import com.airbnb.lottie.p012r.p013b.C1227c;
import com.airbnb.lottie.p012r.p013b.C1236l;
import com.airbnb.lottie.p016t.p019l.C1314a;

/* renamed from: com.airbnb.lottie.t.k.h */
/* compiled from: MergePaths */
public class C1298h implements C1291b {

    /* renamed from: a */
    private final String f4841a;

    /* renamed from: b */
    private final C1299a f4842b;

    /* renamed from: c */
    private final boolean f4843c;

    /* renamed from: com.airbnb.lottie.t.k.h$a */
    /* compiled from: MergePaths */
    public enum C1299a {
        MERGE,
        ADD,
        SUBTRACT,
        INTERSECT,
        EXCLUDE_INTERSECTIONS;

        /* renamed from: a */
        public static C1299a m6437a(int i) {
            if (i == 1) {
                return MERGE;
            }
            if (i == 2) {
                return ADD;
            }
            if (i == 3) {
                return SUBTRACT;
            }
            if (i == 4) {
                return INTERSECT;
            }
            if (i != 5) {
                return MERGE;
            }
            return EXCLUDE_INTERSECTIONS;
        }
    }

    public C1298h(String str, C1299a aVar, boolean z) {
        this.f4841a = str;
        this.f4842b = aVar;
        this.f4843c = z;
    }

    /* renamed from: a */
    public C1299a mo6272a() {
        return this.f4842b;
    }

    /* renamed from: b */
    public String mo6273b() {
        return this.f4841a;
    }

    /* renamed from: c */
    public boolean mo6274c() {
        return this.f4843c;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("MergePaths{mode=");
        sb.append(this.f4842b);
        sb.append('}');
        return sb.toString();
    }

    /* renamed from: a */
    public C1227c mo6226a(C1191f fVar, C1314a aVar) {
        if (fVar.mo6078c()) {
            return new C1236l(this);
        }
        C1181c.m6035d("Animation contains merge paths but they are disabled.");
        return null;
    }
}
