package com.airbnb.lottie.p012r.p013b;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import com.airbnb.lottie.C1181c;
import com.airbnb.lottie.C1191f;
import com.airbnb.lottie.C1210j;
import com.airbnb.lottie.p012r.C1222a;
import com.airbnb.lottie.p012r.p014c.C1247a;
import com.airbnb.lottie.p012r.p014c.C1247a.C1248a;
import com.airbnb.lottie.p012r.p014c.C1249b;
import com.airbnb.lottie.p012r.p014c.C1263p;
import com.airbnb.lottie.p016t.C1271e;
import com.airbnb.lottie.p016t.p018k.C1305m;
import com.airbnb.lottie.p016t.p019l.C1314a;
import com.airbnb.lottie.p022w.C1374e;
import com.airbnb.lottie.p023x.C1378c;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.airbnb.lottie.r.b.g */
/* compiled from: FillContent */
public class C1231g implements C1229e, C1248a, C1235k {

    /* renamed from: a */
    private final Path f4597a = new Path();

    /* renamed from: b */
    private final Paint f4598b = new C1222a(1);

    /* renamed from: c */
    private final C1314a f4599c;

    /* renamed from: d */
    private final String f4600d;

    /* renamed from: e */
    private final boolean f4601e;

    /* renamed from: f */
    private final List<C1239n> f4602f = new ArrayList();

    /* renamed from: g */
    private final C1247a<Integer, Integer> f4603g;

    /* renamed from: h */
    private final C1247a<Integer, Integer> f4604h;

    /* renamed from: i */
    private C1247a<ColorFilter, ColorFilter> f4605i;

    /* renamed from: j */
    private final C1191f f4606j;

    public C1231g(C1191f fVar, C1314a aVar, C1305m mVar) {
        this.f4599c = aVar;
        this.f4600d = mVar.mo6304c();
        this.f4601e = mVar.mo6306e();
        this.f4606j = fVar;
        if (mVar.mo6302a() == null || mVar.mo6305d() == null) {
            this.f4603g = null;
            this.f4604h = null;
            return;
        }
        this.f4597a.setFillType(mVar.mo6303b());
        this.f4603g = mVar.mo6302a().mo6223a();
        this.f4603g.mo6163a((C1248a) this);
        aVar.mo6336a(this.f4603g);
        this.f4604h = mVar.mo6305d().mo6223a();
        this.f4604h.mo6163a((C1248a) this);
        aVar.mo6336a(this.f4604h);
    }

    /* renamed from: a */
    public void mo6141a() {
        this.f4606j.invalidateSelf();
    }

    public String getName() {
        return this.f4600d;
    }

    /* renamed from: a */
    public void mo6146a(List<C1227c> list, List<C1227c> list2) {
        for (int i = 0; i < list2.size(); i++) {
            C1227c cVar = (C1227c) list2.get(i);
            if (cVar instanceof C1239n) {
                this.f4602f.add((C1239n) cVar);
            }
        }
    }

    /* renamed from: a */
    public void mo6142a(Canvas canvas, Matrix matrix, int i) {
        if (!this.f4601e) {
            String str = "FillContent#draw";
            C1181c.m6032a(str);
            this.f4598b.setColor(((C1249b) this.f4603g).mo6173i());
            this.f4598b.setAlpha(C1374e.m6725a((int) ((((((float) i) / 255.0f) * ((float) ((Integer) this.f4604h.mo6169f()).intValue())) / 100.0f) * 255.0f), 0, 255));
            C1247a<ColorFilter, ColorFilter> aVar = this.f4605i;
            if (aVar != null) {
                this.f4598b.setColorFilter((ColorFilter) aVar.mo6169f());
            }
            this.f4597a.reset();
            for (int i2 = 0; i2 < this.f4602f.size(); i2++) {
                this.f4597a.addPath(((C1239n) this.f4602f.get(i2)).mo6152j0(), matrix);
            }
            canvas.drawPath(this.f4597a, this.f4598b);
            C1181c.m6034c(str);
        }
    }

    /* renamed from: a */
    public void mo6143a(RectF rectF, Matrix matrix, boolean z) {
        this.f4597a.reset();
        for (int i = 0; i < this.f4602f.size(); i++) {
            this.f4597a.addPath(((C1239n) this.f4602f.get(i)).mo6152j0(), matrix);
        }
        this.f4597a.computeBounds(rectF, false);
        rectF.set(rectF.left - 1.0f, rectF.top - 1.0f, rectF.right + 1.0f, rectF.bottom + 1.0f);
    }

    /* renamed from: a */
    public void mo6144a(C1271e eVar, int i, List<C1271e> list, C1271e eVar2) {
        C1374e.m6727a(eVar, i, list, eVar2, this);
    }

    /* renamed from: a */
    public <T> void mo6145a(T t, C1378c<T> cVar) {
        if (t == C1210j.f4521a) {
            this.f4603g.mo6164a(cVar);
        } else if (t == C1210j.f4524d) {
            this.f4604h.mo6164a(cVar);
        } else if (t != C1210j.f4519B) {
        } else {
            if (cVar == null) {
                this.f4605i = null;
                return;
            }
            this.f4605i = new C1263p(cVar);
            this.f4605i.mo6163a((C1248a) this);
            this.f4599c.mo6336a(this.f4605i);
        }
    }
}
