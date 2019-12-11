package com.airbnb.lottie;

import android.graphics.Rect;
import android.util.Log;
import com.airbnb.lottie.p016t.C1269c;
import com.airbnb.lottie.p016t.C1270d;
import com.airbnb.lottie.p016t.C1274h;
import com.airbnb.lottie.p016t.p019l.C1320d;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import p096e.p113e.C3933f;
import p096e.p113e.C3942j;

/* renamed from: com.airbnb.lottie.d */
/* compiled from: LottieComposition */
public class C1182d {

    /* renamed from: a */
    private final C1215m f4443a = new C1215m();

    /* renamed from: b */
    private final HashSet<String> f4444b = new HashSet<>();

    /* renamed from: c */
    private Map<String, List<C1320d>> f4445c;

    /* renamed from: d */
    private Map<String, C1207g> f4446d;

    /* renamed from: e */
    private Map<String, C1269c> f4447e;

    /* renamed from: f */
    private List<C1274h> f4448f;

    /* renamed from: g */
    private C3942j<C1270d> f4449g;

    /* renamed from: h */
    private C3933f<C1320d> f4450h;

    /* renamed from: i */
    private List<C1320d> f4451i;

    /* renamed from: j */
    private Rect f4452j;

    /* renamed from: k */
    private float f4453k;

    /* renamed from: l */
    private float f4454l;

    /* renamed from: m */
    private float f4455m;

    /* renamed from: n */
    private boolean f4456n;

    /* renamed from: o */
    private int f4457o = 0;

    /* renamed from: a */
    public void mo6029a(Rect rect, float f, float f2, float f3, List<C1320d> list, C3933f<C1320d> fVar, Map<String, List<C1320d>> map, Map<String, C1207g> map2, C3942j<C1270d> jVar, Map<String, C1269c> map3, List<C1274h> list2) {
        this.f4452j = rect;
        this.f4453k = f;
        this.f4454l = f2;
        this.f4455m = f3;
        this.f4451i = list;
        this.f4450h = fVar;
        this.f4445c = map;
        this.f4446d = map2;
        this.f4449g = jVar;
        this.f4447e = map3;
        this.f4448f = list2;
    }

    /* renamed from: b */
    public void mo6034b(boolean z) {
        this.f4443a.mo6135a(z);
    }

    /* renamed from: c */
    public float mo6035c() {
        return (float) ((long) ((mo6037d() / this.f4455m) * 1000.0f));
    }

    /* renamed from: d */
    public float mo6037d() {
        return this.f4454l - this.f4453k;
    }

    /* renamed from: e */
    public float mo6038e() {
        return this.f4454l;
    }

    /* renamed from: f */
    public Map<String, C1269c> mo6039f() {
        return this.f4447e;
    }

    /* renamed from: g */
    public float mo6040g() {
        return this.f4455m;
    }

    /* renamed from: h */
    public Map<String, C1207g> mo6041h() {
        return this.f4446d;
    }

    /* renamed from: i */
    public List<C1320d> mo6042i() {
        return this.f4451i;
    }

    /* renamed from: j */
    public int mo6043j() {
        return this.f4457o;
    }

    /* renamed from: k */
    public C1215m mo6044k() {
        return this.f4443a;
    }

    /* renamed from: l */
    public float mo6045l() {
        return this.f4453k;
    }

    /* renamed from: m */
    public boolean mo6046m() {
        return this.f4456n;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("LottieComposition:\n");
        for (C1320d a : this.f4451i) {
            sb.append(a.mo6346a("\t"));
        }
        return sb.toString();
    }

    /* renamed from: b */
    public C3942j<C1270d> mo6033b() {
        return this.f4449g;
    }

    /* renamed from: c */
    public List<C1320d> mo6036c(String str) {
        return (List) this.f4445c.get(str);
    }

    /* renamed from: b */
    public C1274h mo6032b(String str) {
        this.f4448f.size();
        for (int i = 0; i < this.f4448f.size(); i++) {
            C1274h hVar = (C1274h) this.f4448f.get(i);
            if (hVar.mo6218a(str)) {
                return hVar;
            }
        }
        return null;
    }

    /* renamed from: a */
    public void mo6030a(String str) {
        Log.w("LOTTIE", str);
        this.f4444b.add(str);
    }

    /* renamed from: a */
    public void mo6031a(boolean z) {
        this.f4456n = z;
    }

    /* renamed from: a */
    public void mo6028a(int i) {
        this.f4457o += i;
    }

    /* renamed from: a */
    public C1320d mo6027a(long j) {
        return (C1320d) this.f4450h.mo14066c(j);
    }

    /* renamed from: a */
    public Rect mo6026a() {
        return this.f4452j;
    }
}
