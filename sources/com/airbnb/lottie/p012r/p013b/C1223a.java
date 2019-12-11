package com.airbnb.lottie.p012r.p013b;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.DashPathEffect;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Paint.Cap;
import android.graphics.Paint.Join;
import android.graphics.Paint.Style;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.RectF;
import com.airbnb.lottie.C1181c;
import com.airbnb.lottie.C1191f;
import com.airbnb.lottie.C1210j;
import com.airbnb.lottie.p012r.C1222a;
import com.airbnb.lottie.p012r.p014c.C1247a;
import com.airbnb.lottie.p012r.p014c.C1247a.C1248a;
import com.airbnb.lottie.p012r.p014c.C1250c;
import com.airbnb.lottie.p012r.p014c.C1252e;
import com.airbnb.lottie.p012r.p014c.C1263p;
import com.airbnb.lottie.p016t.C1271e;
import com.airbnb.lottie.p016t.p017j.C1277b;
import com.airbnb.lottie.p016t.p017j.C1279d;
import com.airbnb.lottie.p016t.p018k.C1312q.C1313a;
import com.airbnb.lottie.p016t.p019l.C1314a;
import com.airbnb.lottie.p022w.C1374e;
import com.airbnb.lottie.p022w.C1375f;
import com.airbnb.lottie.p023x.C1378c;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.airbnb.lottie.r.b.a */
/* compiled from: BaseStrokeContent */
public abstract class C1223a implements C1248a, C1235k, C1229e {

    /* renamed from: a */
    private final PathMeasure f4563a = new PathMeasure();

    /* renamed from: b */
    private final Path f4564b = new Path();

    /* renamed from: c */
    private final Path f4565c = new Path();

    /* renamed from: d */
    private final RectF f4566d = new RectF();

    /* renamed from: e */
    private final C1191f f4567e;

    /* renamed from: f */
    protected final C1314a f4568f;

    /* renamed from: g */
    private final List<C1225b> f4569g = new ArrayList();

    /* renamed from: h */
    private final float[] f4570h;

    /* renamed from: i */
    final Paint f4571i = new C1222a(1);

    /* renamed from: j */
    private final C1247a<?, Float> f4572j;

    /* renamed from: k */
    private final C1247a<?, Integer> f4573k;

    /* renamed from: l */
    private final List<C1247a<?, Float>> f4574l;

    /* renamed from: m */
    private final C1247a<?, Float> f4575m;

    /* renamed from: n */
    private C1247a<ColorFilter, ColorFilter> f4576n;

    /* renamed from: com.airbnb.lottie.r.b.a$b */
    /* compiled from: BaseStrokeContent */
    private static final class C1225b {
        /* access modifiers changed from: private */

        /* renamed from: a */
        public final List<C1239n> f4577a;
        /* access modifiers changed from: private */

        /* renamed from: b */
        public final C1246t f4578b;

        private C1225b(C1246t tVar) {
            this.f4577a = new ArrayList();
            this.f4578b = tVar;
        }
    }

    C1223a(C1191f fVar, C1314a aVar, Cap cap, Join join, float f, C1279d dVar, C1277b bVar, List<C1277b> list, C1277b bVar2) {
        this.f4567e = fVar;
        this.f4568f = aVar;
        this.f4571i.setStyle(Style.STROKE);
        this.f4571i.setStrokeCap(cap);
        this.f4571i.setStrokeJoin(join);
        this.f4571i.setStrokeMiter(f);
        this.f4573k = dVar.mo6223a();
        this.f4572j = bVar.mo6223a();
        if (bVar2 == null) {
            this.f4575m = null;
        } else {
            this.f4575m = bVar2.mo6223a();
        }
        this.f4574l = new ArrayList(list.size());
        this.f4570h = new float[list.size()];
        for (int i = 0; i < list.size(); i++) {
            this.f4574l.add(((C1277b) list.get(i)).mo6223a());
        }
        aVar.mo6336a(this.f4573k);
        aVar.mo6336a(this.f4572j);
        for (int i2 = 0; i2 < this.f4574l.size(); i2++) {
            aVar.mo6336a((C1247a) this.f4574l.get(i2));
        }
        C1247a<?, Float> aVar2 = this.f4575m;
        if (aVar2 != null) {
            aVar.mo6336a(aVar2);
        }
        this.f4573k.mo6163a((C1248a) this);
        this.f4572j.mo6163a((C1248a) this);
        for (int i3 = 0; i3 < list.size(); i3++) {
            ((C1247a) this.f4574l.get(i3)).mo6163a((C1248a) this);
        }
        C1247a<?, Float> aVar3 = this.f4575m;
        if (aVar3 != null) {
            aVar3.mo6163a((C1248a) this);
        }
    }

    /* renamed from: a */
    public void mo6141a() {
        this.f4567e.invalidateSelf();
    }

    /* renamed from: a */
    public void mo6146a(List<C1227c> list, List<C1227c> list2) {
        C1246t tVar = null;
        for (int size = list.size() - 1; size >= 0; size--) {
            C1227c cVar = (C1227c) list.get(size);
            if (cVar instanceof C1246t) {
                C1246t tVar2 = (C1246t) cVar;
                if (tVar2.mo6158e() == C1313a.INDIVIDUALLY) {
                    tVar = tVar2;
                }
            }
        }
        if (tVar != null) {
            tVar.mo6154a(this);
        }
        C1225b bVar = null;
        for (int size2 = list2.size() - 1; size2 >= 0; size2--) {
            C1227c cVar2 = (C1227c) list2.get(size2);
            if (cVar2 instanceof C1246t) {
                C1246t tVar3 = (C1246t) cVar2;
                if (tVar3.mo6158e() == C1313a.INDIVIDUALLY) {
                    if (bVar != null) {
                        this.f4569g.add(bVar);
                    }
                    bVar = new C1225b(tVar3);
                    tVar3.mo6154a(this);
                }
            }
            if (cVar2 instanceof C1239n) {
                if (bVar == null) {
                    bVar = new C1225b(tVar);
                }
                bVar.f4577a.add((C1239n) cVar2);
            }
        }
        if (bVar != null) {
            this.f4569g.add(bVar);
        }
    }

    /* renamed from: a */
    public void mo6142a(Canvas canvas, Matrix matrix, int i) {
        String str = "StrokeContent#draw";
        C1181c.m6032a(str);
        if (C1375f.m6740b(matrix)) {
            C1181c.m6034c(str);
            return;
        }
        this.f4571i.setAlpha(C1374e.m6725a((int) ((((((float) i) / 255.0f) * ((float) ((C1252e) this.f4573k).mo6173i())) / 100.0f) * 255.0f), 0, 255));
        this.f4571i.setStrokeWidth(((C1250c) this.f4572j).mo6173i() * C1375f.m6733a(matrix));
        if (this.f4571i.getStrokeWidth() <= 0.0f) {
            C1181c.m6034c(str);
            return;
        }
        m6173a(matrix);
        C1247a<ColorFilter, ColorFilter> aVar = this.f4576n;
        if (aVar != null) {
            this.f4571i.setColorFilter((ColorFilter) aVar.mo6169f());
        }
        for (int i2 = 0; i2 < this.f4569g.size(); i2++) {
            C1225b bVar = (C1225b) this.f4569g.get(i2);
            if (bVar.f4578b != null) {
                m6172a(canvas, bVar, matrix);
            } else {
                String str2 = "StrokeContent#buildPath";
                C1181c.m6032a(str2);
                this.f4564b.reset();
                for (int size = bVar.f4577a.size() - 1; size >= 0; size--) {
                    this.f4564b.addPath(((C1239n) bVar.f4577a.get(size)).mo6152j0(), matrix);
                }
                C1181c.m6034c(str2);
                String str3 = "StrokeContent#drawPath";
                C1181c.m6032a(str3);
                canvas.drawPath(this.f4564b, this.f4571i);
                C1181c.m6034c(str3);
            }
        }
        C1181c.m6034c(str);
    }

    /* renamed from: a */
    private void m6172a(Canvas canvas, C1225b bVar, Matrix matrix) {
        String str = "StrokeContent#applyTrimPath";
        C1181c.m6032a(str);
        if (bVar.f4578b == null) {
            C1181c.m6034c(str);
            return;
        }
        this.f4564b.reset();
        for (int size = bVar.f4577a.size() - 1; size >= 0; size--) {
            this.f4564b.addPath(((C1239n) bVar.f4577a.get(size)).mo6152j0(), matrix);
        }
        this.f4563a.setPath(this.f4564b, false);
        float length = this.f4563a.getLength();
        while (this.f4563a.nextContour()) {
            length += this.f4563a.getLength();
        }
        float floatValue = (((Float) bVar.f4578b.mo6156c().mo6169f()).floatValue() * length) / 360.0f;
        float floatValue2 = ((((Float) bVar.f4578b.mo6157d().mo6169f()).floatValue() * length) / 100.0f) + floatValue;
        float floatValue3 = ((((Float) bVar.f4578b.mo6155b().mo6169f()).floatValue() * length) / 100.0f) + floatValue;
        float f = 0.0f;
        for (int size2 = bVar.f4577a.size() - 1; size2 >= 0; size2--) {
            this.f4565c.set(((C1239n) bVar.f4577a.get(size2)).mo6152j0());
            this.f4565c.transform(matrix);
            this.f4563a.setPath(this.f4565c, false);
            float length2 = this.f4563a.getLength();
            float f2 = 1.0f;
            if (floatValue3 > length) {
                float f3 = floatValue3 - length;
                if (f3 < f + length2 && f < f3) {
                    C1375f.m6736a(this.f4565c, floatValue2 > length ? (floatValue2 - length) / length2 : 0.0f, Math.min(f3 / length2, 1.0f), 0.0f);
                    canvas.drawPath(this.f4565c, this.f4571i);
                    f += length2;
                }
            }
            float f4 = f + length2;
            if (f4 >= floatValue2 && f <= floatValue3) {
                if (f4 > floatValue3 || floatValue2 >= f) {
                    float f5 = floatValue2 < f ? 0.0f : (floatValue2 - f) / length2;
                    if (floatValue3 <= f4) {
                        f2 = (floatValue3 - f) / length2;
                    }
                    C1375f.m6736a(this.f4565c, f5, f2, 0.0f);
                    canvas.drawPath(this.f4565c, this.f4571i);
                } else {
                    canvas.drawPath(this.f4565c, this.f4571i);
                }
            }
            f += length2;
        }
        C1181c.m6034c(str);
    }

    /* renamed from: a */
    public void mo6143a(RectF rectF, Matrix matrix, boolean z) {
        String str = "StrokeContent#getBounds";
        C1181c.m6032a(str);
        this.f4564b.reset();
        for (int i = 0; i < this.f4569g.size(); i++) {
            C1225b bVar = (C1225b) this.f4569g.get(i);
            for (int i2 = 0; i2 < bVar.f4577a.size(); i2++) {
                this.f4564b.addPath(((C1239n) bVar.f4577a.get(i2)).mo6152j0(), matrix);
            }
        }
        this.f4564b.computeBounds(this.f4566d, false);
        float i3 = ((C1250c) this.f4572j).mo6173i();
        RectF rectF2 = this.f4566d;
        float f = i3 / 2.0f;
        rectF2.set(rectF2.left - f, rectF2.top - f, rectF2.right + f, rectF2.bottom + f);
        rectF.set(this.f4566d);
        rectF.set(rectF.left - 1.0f, rectF.top - 1.0f, rectF.right + 1.0f, rectF.bottom + 1.0f);
        C1181c.m6034c(str);
    }

    /* renamed from: a */
    private void m6173a(Matrix matrix) {
        String str = "StrokeContent#applyDashPattern";
        C1181c.m6032a(str);
        if (this.f4574l.isEmpty()) {
            C1181c.m6034c(str);
            return;
        }
        float a = C1375f.m6733a(matrix);
        for (int i = 0; i < this.f4574l.size(); i++) {
            this.f4570h[i] = ((Float) ((C1247a) this.f4574l.get(i)).mo6169f()).floatValue();
            if (i % 2 == 0) {
                float[] fArr = this.f4570h;
                if (fArr[i] < 1.0f) {
                    fArr[i] = 1.0f;
                }
            } else {
                float[] fArr2 = this.f4570h;
                if (fArr2[i] < 0.1f) {
                    fArr2[i] = 0.1f;
                }
            }
            float[] fArr3 = this.f4570h;
            fArr3[i] = fArr3[i] * a;
        }
        C1247a<?, Float> aVar = this.f4575m;
        this.f4571i.setPathEffect(new DashPathEffect(this.f4570h, aVar == null ? 0.0f : ((Float) aVar.mo6169f()).floatValue()));
        C1181c.m6034c(str);
    }

    /* renamed from: a */
    public void mo6144a(C1271e eVar, int i, List<C1271e> list, C1271e eVar2) {
        C1374e.m6727a(eVar, i, list, eVar2, this);
    }

    /* renamed from: a */
    public <T> void mo6145a(T t, C1378c<T> cVar) {
        if (t == C1210j.f4524d) {
            this.f4573k.mo6164a(cVar);
        } else if (t == C1210j.f4535o) {
            this.f4572j.mo6164a(cVar);
        } else if (t != C1210j.f4519B) {
        } else {
            if (cVar == null) {
                this.f4576n = null;
                return;
            }
            this.f4576n = new C1263p(cVar);
            this.f4576n.mo6163a((C1248a) this);
            this.f4568f.mo6336a(this.f4576n);
        }
    }
}
