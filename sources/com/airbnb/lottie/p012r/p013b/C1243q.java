package com.airbnb.lottie.p012r.p013b;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.RectF;
import com.airbnb.lottie.C1191f;
import com.airbnb.lottie.C1210j;
import com.airbnb.lottie.p012r.p014c.C1247a;
import com.airbnb.lottie.p012r.p014c.C1247a.C1248a;
import com.airbnb.lottie.p012r.p014c.C1262o;
import com.airbnb.lottie.p016t.C1271e;
import com.airbnb.lottie.p016t.p018k.C1303k;
import com.airbnb.lottie.p016t.p019l.C1314a;
import com.airbnb.lottie.p022w.C1374e;
import com.airbnb.lottie.p023x.C1378c;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;

/* renamed from: com.airbnb.lottie.r.b.q */
/* compiled from: RepeaterContent */
public class C1243q implements C1229e, C1239n, C1234j, C1248a, C1235k {

    /* renamed from: a */
    private final Matrix f4668a = new Matrix();

    /* renamed from: b */
    private final Path f4669b = new Path();

    /* renamed from: c */
    private final C1191f f4670c;

    /* renamed from: d */
    private final C1314a f4671d;

    /* renamed from: e */
    private final String f4672e;

    /* renamed from: f */
    private final boolean f4673f;

    /* renamed from: g */
    private final C1247a<Float, Float> f4674g;

    /* renamed from: h */
    private final C1247a<Float, Float> f4675h;

    /* renamed from: i */
    private final C1262o f4676i;

    /* renamed from: j */
    private C1228d f4677j;

    public C1243q(C1191f fVar, C1314a aVar, C1303k kVar) {
        this.f4670c = fVar;
        this.f4671d = aVar;
        this.f4672e = kVar.mo6293b();
        this.f4673f = kVar.mo6296e();
        this.f4674g = kVar.mo6292a().mo6223a();
        aVar.mo6336a(this.f4674g);
        this.f4674g.mo6163a((C1248a) this);
        this.f4675h = kVar.mo6294c().mo6223a();
        aVar.mo6336a(this.f4675h);
        this.f4675h.mo6163a((C1248a) this);
        this.f4676i = kVar.mo6295d().mo6227a();
        this.f4676i.mo6184a(aVar);
        this.f4676i.mo6183a((C1248a) this);
    }

    /* renamed from: a */
    public void mo6153a(ListIterator<C1227c> listIterator) {
        if (this.f4677j == null) {
            while (listIterator.hasPrevious()) {
                if (listIterator.previous() == this) {
                    break;
                }
            }
            ArrayList arrayList = new ArrayList();
            while (listIterator.hasPrevious()) {
                arrayList.add(listIterator.previous());
                listIterator.remove();
            }
            Collections.reverse(arrayList);
            C1228d dVar = new C1228d(this.f4670c, this.f4671d, "Repeater", this.f4673f, arrayList, null);
            this.f4677j = dVar;
        }
    }

    public String getName() {
        return this.f4672e;
    }

    /* renamed from: j0 */
    public Path mo6152j0() {
        Path j0 = this.f4677j.mo6152j0();
        this.f4669b.reset();
        float floatValue = ((Float) this.f4674g.mo6169f()).floatValue();
        float floatValue2 = ((Float) this.f4675h.mo6169f()).floatValue();
        for (int i = ((int) floatValue) - 1; i >= 0; i--) {
            this.f4668a.set(this.f4676i.mo6181a(((float) i) + floatValue2));
            this.f4669b.addPath(j0, this.f4668a);
        }
        return this.f4669b;
    }

    /* renamed from: a */
    public void mo6146a(List<C1227c> list, List<C1227c> list2) {
        this.f4677j.mo6146a(list, list2);
    }

    /* renamed from: a */
    public void mo6142a(Canvas canvas, Matrix matrix, int i) {
        float floatValue = ((Float) this.f4674g.mo6169f()).floatValue();
        float floatValue2 = ((Float) this.f4675h.mo6169f()).floatValue();
        float floatValue3 = ((Float) this.f4676i.mo6189d().mo6169f()).floatValue() / 100.0f;
        float floatValue4 = ((Float) this.f4676i.mo6182a().mo6169f()).floatValue() / 100.0f;
        for (int i2 = ((int) floatValue) - 1; i2 >= 0; i2--) {
            this.f4668a.set(matrix);
            float f = (float) i2;
            this.f4668a.preConcat(this.f4676i.mo6181a(f + floatValue2));
            this.f4677j.mo6142a(canvas, this.f4668a, (int) (((float) i) * C1374e.m6731c(floatValue3, floatValue4, f / floatValue)));
        }
    }

    /* renamed from: a */
    public void mo6143a(RectF rectF, Matrix matrix, boolean z) {
        this.f4677j.mo6143a(rectF, matrix, z);
    }

    /* renamed from: a */
    public void mo6141a() {
        this.f4670c.invalidateSelf();
    }

    /* renamed from: a */
    public void mo6144a(C1271e eVar, int i, List<C1271e> list, C1271e eVar2) {
        C1374e.m6727a(eVar, i, list, eVar2, this);
    }

    /* renamed from: a */
    public <T> void mo6145a(T t, C1378c<T> cVar) {
        if (!this.f4676i.mo6185a(t, cVar)) {
            if (t == C1210j.f4537q) {
                this.f4674g.mo6164a(cVar);
            } else if (t == C1210j.f4538r) {
                this.f4675h.mo6164a(cVar);
            }
        }
    }
}
