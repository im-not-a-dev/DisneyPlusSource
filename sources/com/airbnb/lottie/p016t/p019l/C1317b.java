package com.airbnb.lottie.p016t.p019l;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.RectF;
import com.airbnb.lottie.C1181c;
import com.airbnb.lottie.C1182d;
import com.airbnb.lottie.C1191f;
import com.airbnb.lottie.C1210j;
import com.airbnb.lottie.p012r.p014c.C1247a;
import com.airbnb.lottie.p012r.p014c.C1247a.C1248a;
import com.airbnb.lottie.p012r.p014c.C1263p;
import com.airbnb.lottie.p016t.C1271e;
import com.airbnb.lottie.p016t.p017j.C1277b;
import com.airbnb.lottie.p016t.p019l.C1320d.C1322b;
import com.airbnb.lottie.p023x.C1378c;
import java.util.ArrayList;
import java.util.List;
import p096e.p113e.C3933f;

/* renamed from: com.airbnb.lottie.t.l.b */
/* compiled from: CompositionLayer */
public class C1317b extends C1314a {

    /* renamed from: w */
    private C1247a<Float, Float> f4945w;

    /* renamed from: x */
    private final List<C1314a> f4946x = new ArrayList();

    /* renamed from: y */
    private final RectF f4947y = new RectF();

    /* renamed from: z */
    private final RectF f4948z = new RectF();

    /* renamed from: com.airbnb.lottie.t.l.b$a */
    /* compiled from: CompositionLayer */
    static /* synthetic */ class C1318a {

        /* renamed from: a */
        static final /* synthetic */ int[] f4949a = new int[C1322b.values().length];

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|6) */
        /* JADX WARNING: Code restructure failed: missing block: B:7:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0014 */
        static {
            /*
                com.airbnb.lottie.t.l.d$b[] r0 = com.airbnb.lottie.p016t.p019l.C1320d.C1322b.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f4949a = r0
                int[] r0 = f4949a     // Catch:{ NoSuchFieldError -> 0x0014 }
                com.airbnb.lottie.t.l.d$b r1 = com.airbnb.lottie.p016t.p019l.C1320d.C1322b.ADD     // Catch:{ NoSuchFieldError -> 0x0014 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0014 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0014 }
            L_0x0014:
                int[] r0 = f4949a     // Catch:{ NoSuchFieldError -> 0x001f }
                com.airbnb.lottie.t.l.d$b r1 = com.airbnb.lottie.p016t.p019l.C1320d.C1322b.INVERT     // Catch:{ NoSuchFieldError -> 0x001f }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001f }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001f }
            L_0x001f:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.airbnb.lottie.p016t.p019l.C1317b.C1318a.<clinit>():void");
        }
    }

    public C1317b(C1191f fVar, C1320d dVar, List<C1320d> list, C1182d dVar2) {
        int i;
        super(fVar, dVar);
        C1277b s = dVar.mo6364s();
        if (s != null) {
            this.f4945w = s.mo6223a();
            mo6336a(this.f4945w);
            this.f4945w.mo6163a((C1248a) this);
        } else {
            this.f4945w = null;
        }
        C3933f fVar2 = new C3933f(dVar2.mo6042i().size());
        int size = list.size() - 1;
        C1314a aVar = null;
        while (true) {
            if (size < 0) {
                break;
            }
            C1320d dVar3 = (C1320d) list.get(size);
            C1314a a = C1314a.m6502a(dVar3, fVar, dVar2);
            if (a != null) {
                fVar2.mo14067c(a.mo6338b().mo6347b(), a);
                if (aVar != null) {
                    aVar.mo6337a(a);
                    aVar = null;
                } else {
                    this.f4946x.add(0, a);
                    int i2 = C1318a.f4949a[dVar3.mo6351f().ordinal()];
                    if (i2 == 1 || i2 == 2) {
                        aVar = a;
                    }
                }
            }
            size--;
        }
        for (i = 0; i < fVar2.mo14061b(); i++) {
            C1314a aVar2 = (C1314a) fVar2.mo14066c(fVar2.mo14057a(i));
            if (aVar2 != null) {
                C1314a aVar3 = (C1314a) fVar2.mo14066c(aVar2.mo6338b().mo6353h());
                if (aVar3 != null) {
                    aVar2.mo6342b(aVar3);
                }
            }
        }
    }

    /* renamed from: a */
    public void mo6143a(RectF rectF, Matrix matrix, boolean z) {
        super.mo6143a(rectF, matrix, z);
        for (int size = this.f4946x.size() - 1; size >= 0; size--) {
            this.f4947y.set(0.0f, 0.0f, 0.0f, 0.0f);
            ((C1314a) this.f4946x.get(size)).mo6143a(this.f4947y, this.f4931m, true);
            rectF.union(this.f4947y);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public void mo6339b(Canvas canvas, Matrix matrix, int i) {
        String str = "CompositionLayer#draw";
        C1181c.m6032a(str);
        canvas.save();
        this.f4948z.set(0.0f, 0.0f, (float) this.f4933o.mo6355j(), (float) this.f4933o.mo6354i());
        matrix.mapRect(this.f4948z);
        for (int size = this.f4946x.size() - 1; size >= 0; size--) {
            if (!this.f4948z.isEmpty() ? canvas.clipRect(this.f4948z) : true) {
                ((C1314a) this.f4946x.get(size)).mo6142a(canvas, matrix, i);
            }
        }
        canvas.restore();
        C1181c.m6034c(str);
    }

    /* renamed from: a */
    public void mo6335a(float f) {
        super.mo6335a(f);
        if (this.f4945w != null) {
            f = ((float) ((long) (((Float) this.f4945w.mo6169f()).floatValue() * 1000.0f))) / this.f4932n.mo6084e().mo6035c();
        }
        if (this.f4933o.mo6365t() != 0.0f) {
            f /= this.f4933o.mo6365t();
        }
        float p = f - this.f4933o.mo6361p();
        for (int size = this.f4946x.size() - 1; size >= 0; size--) {
            ((C1314a) this.f4946x.get(size)).mo6335a(p);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo6341b(C1271e eVar, int i, List<C1271e> list, C1271e eVar2) {
        for (int i2 = 0; i2 < this.f4946x.size(); i2++) {
            ((C1314a) this.f4946x.get(i2)).mo6144a(eVar, i, list, eVar2);
        }
    }

    /* renamed from: a */
    public <T> void mo6145a(T t, C1378c<T> cVar) {
        super.mo6145a(t, cVar);
        if (t != C1210j.f4518A) {
            return;
        }
        if (cVar == null) {
            this.f4945w = null;
            return;
        }
        this.f4945w = new C1263p(cVar);
        mo6336a(this.f4945w);
    }
}
