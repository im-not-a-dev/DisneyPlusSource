package com.airbnb.lottie.p012r.p013b;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.RectF;
import com.airbnb.lottie.C1191f;
import com.airbnb.lottie.p012r.p014c.C1247a.C1248a;
import com.airbnb.lottie.p012r.p014c.C1262o;
import com.airbnb.lottie.p016t.C1271e;
import com.airbnb.lottie.p016t.C1272f;
import com.airbnb.lottie.p016t.p017j.C1287l;
import com.airbnb.lottie.p016t.p018k.C1291b;
import com.airbnb.lottie.p016t.p018k.C1306n;
import com.airbnb.lottie.p016t.p019l.C1314a;
import com.airbnb.lottie.p023x.C1378c;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.airbnb.lottie.r.b.d */
/* compiled from: ContentGroup */
public class C1228d implements C1229e, C1239n, C1248a, C1272f {

    /* renamed from: a */
    private final Matrix f4580a;

    /* renamed from: b */
    private final Path f4581b;

    /* renamed from: c */
    private final RectF f4582c;

    /* renamed from: d */
    private final String f4583d;

    /* renamed from: e */
    private final boolean f4584e;

    /* renamed from: f */
    private final List<C1227c> f4585f;

    /* renamed from: g */
    private final C1191f f4586g;

    /* renamed from: h */
    private List<C1239n> f4587h;

    /* renamed from: i */
    private C1262o f4588i;

    public C1228d(C1191f fVar, C1314a aVar, C1306n nVar) {
        this(fVar, aVar, nVar.mo6309b(), nVar.mo6310c(), m6186a(fVar, aVar, nVar.mo6308a()), m6185a(nVar.mo6308a()));
    }

    /* renamed from: a */
    private static List<C1227c> m6186a(C1191f fVar, C1314a aVar, List<C1291b> list) {
        ArrayList arrayList = new ArrayList(list.size());
        for (int i = 0; i < list.size(); i++) {
            C1227c a = ((C1291b) list.get(i)).mo6226a(fVar, aVar);
            if (a != null) {
                arrayList.add(a);
            }
        }
        return arrayList;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public List<C1239n> mo6150b() {
        if (this.f4587h == null) {
            this.f4587h = new ArrayList();
            for (int i = 0; i < this.f4585f.size(); i++) {
                C1227c cVar = (C1227c) this.f4585f.get(i);
                if (cVar instanceof C1239n) {
                    this.f4587h.add((C1239n) cVar);
                }
            }
        }
        return this.f4587h;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public Matrix mo6151c() {
        C1262o oVar = this.f4588i;
        if (oVar != null) {
            return oVar.mo6186b();
        }
        this.f4580a.reset();
        return this.f4580a;
    }

    public String getName() {
        return this.f4583d;
    }

    /* renamed from: j0 */
    public Path mo6152j0() {
        this.f4580a.reset();
        C1262o oVar = this.f4588i;
        if (oVar != null) {
            this.f4580a.set(oVar.mo6186b());
        }
        this.f4581b.reset();
        if (this.f4584e) {
            return this.f4581b;
        }
        for (int size = this.f4585f.size() - 1; size >= 0; size--) {
            C1227c cVar = (C1227c) this.f4585f.get(size);
            if (cVar instanceof C1239n) {
                this.f4581b.addPath(((C1239n) cVar).mo6152j0(), this.f4580a);
            }
        }
        return this.f4581b;
    }

    C1228d(C1191f fVar, C1314a aVar, String str, boolean z, List<C1227c> list, C1287l lVar) {
        this.f4580a = new Matrix();
        this.f4581b = new Path();
        this.f4582c = new RectF();
        this.f4583d = str;
        this.f4586g = fVar;
        this.f4584e = z;
        this.f4585f = list;
        if (lVar != null) {
            this.f4588i = lVar.mo6227a();
            this.f4588i.mo6184a(aVar);
            this.f4588i.mo6183a((C1248a) this);
        }
        ArrayList arrayList = new ArrayList();
        for (int size = list.size() - 1; size >= 0; size--) {
            C1227c cVar = (C1227c) list.get(size);
            if (cVar instanceof C1234j) {
                arrayList.add((C1234j) cVar);
            }
        }
        for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
            ((C1234j) arrayList.get(size2)).mo6153a(list.listIterator(list.size()));
        }
    }

    /* renamed from: a */
    static C1287l m6185a(List<C1291b> list) {
        for (int i = 0; i < list.size(); i++) {
            C1291b bVar = (C1291b) list.get(i);
            if (bVar instanceof C1287l) {
                return (C1287l) bVar;
            }
        }
        return null;
    }

    /* renamed from: a */
    public void mo6141a() {
        this.f4586g.invalidateSelf();
    }

    /* renamed from: a */
    public void mo6146a(List<C1227c> list, List<C1227c> list2) {
        ArrayList arrayList = new ArrayList(list.size() + this.f4585f.size());
        arrayList.addAll(list);
        for (int size = this.f4585f.size() - 1; size >= 0; size--) {
            C1227c cVar = (C1227c) this.f4585f.get(size);
            cVar.mo6146a(arrayList, this.f4585f.subList(0, size));
            arrayList.add(cVar);
        }
    }

    /* renamed from: a */
    public void mo6142a(Canvas canvas, Matrix matrix, int i) {
        if (!this.f4584e) {
            this.f4580a.set(matrix);
            C1262o oVar = this.f4588i;
            if (oVar != null) {
                this.f4580a.preConcat(oVar.mo6186b());
                i = (int) ((((((float) (this.f4588i.mo6188c() == null ? 100 : ((Integer) this.f4588i.mo6188c().mo6169f()).intValue())) / 100.0f) * ((float) i)) / 255.0f) * 255.0f);
            }
            for (int size = this.f4585f.size() - 1; size >= 0; size--) {
                Object obj = this.f4585f.get(size);
                if (obj instanceof C1229e) {
                    ((C1229e) obj).mo6142a(canvas, this.f4580a, i);
                }
            }
        }
    }

    /* renamed from: a */
    public void mo6143a(RectF rectF, Matrix matrix, boolean z) {
        this.f4580a.set(matrix);
        C1262o oVar = this.f4588i;
        if (oVar != null) {
            this.f4580a.preConcat(oVar.mo6186b());
        }
        this.f4582c.set(0.0f, 0.0f, 0.0f, 0.0f);
        for (int size = this.f4585f.size() - 1; size >= 0; size--) {
            C1227c cVar = (C1227c) this.f4585f.get(size);
            if (cVar instanceof C1229e) {
                ((C1229e) cVar).mo6143a(this.f4582c, this.f4580a, z);
                rectF.union(this.f4582c);
            }
        }
    }

    /* renamed from: a */
    public void mo6144a(C1271e eVar, int i, List<C1271e> list, C1271e eVar2) {
        if (eVar.mo6213c(getName(), i)) {
            if (!"__container".equals(getName())) {
                eVar2 = eVar2.mo6209a(getName());
                if (eVar.mo6211a(getName(), i)) {
                    list.add(eVar2.mo6208a((C1272f) this));
                }
            }
            if (eVar.mo6214d(getName(), i)) {
                int b = i + eVar.mo6212b(getName(), i);
                for (int i2 = 0; i2 < this.f4585f.size(); i2++) {
                    C1227c cVar = (C1227c) this.f4585f.get(i2);
                    if (cVar instanceof C1272f) {
                        ((C1272f) cVar).mo6144a(eVar, b, list, eVar2);
                    }
                }
            }
        }
    }

    /* renamed from: a */
    public <T> void mo6145a(T t, C1378c<T> cVar) {
        C1262o oVar = this.f4588i;
        if (oVar != null) {
            oVar.mo6185a(t, cVar);
        }
    }
}
