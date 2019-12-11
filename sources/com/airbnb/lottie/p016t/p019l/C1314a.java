package com.airbnb.lottie.p016t.p019l;

import android.annotation.SuppressLint;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff.Mode;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.os.Build.VERSION;
import com.airbnb.lottie.C1181c;
import com.airbnb.lottie.C1182d;
import com.airbnb.lottie.C1191f;
import com.airbnb.lottie.p012r.C1222a;
import com.airbnb.lottie.p012r.p013b.C1227c;
import com.airbnb.lottie.p012r.p013b.C1229e;
import com.airbnb.lottie.p012r.p014c.C1247a;
import com.airbnb.lottie.p012r.p014c.C1247a.C1248a;
import com.airbnb.lottie.p012r.p014c.C1250c;
import com.airbnb.lottie.p012r.p014c.C1254g;
import com.airbnb.lottie.p012r.p014c.C1262o;
import com.airbnb.lottie.p016t.C1271e;
import com.airbnb.lottie.p016t.C1272f;
import com.airbnb.lottie.p016t.p018k.C1296g;
import com.airbnb.lottie.p016t.p018k.C1296g.C1297a;
import com.airbnb.lottie.p016t.p018k.C1304l;
import com.airbnb.lottie.p016t.p019l.C1320d.C1321a;
import com.airbnb.lottie.p016t.p019l.C1320d.C1322b;
import com.airbnb.lottie.p023x.C1378c;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: com.airbnb.lottie.t.l.a */
/* compiled from: BaseLayer */
public abstract class C1314a implements C1229e, C1248a, C1272f {

    /* renamed from: a */
    private final Path f4919a = new Path();

    /* renamed from: b */
    private final Matrix f4920b = new Matrix();

    /* renamed from: c */
    private final Paint f4921c = new C1222a(1);

    /* renamed from: d */
    private final Paint f4922d = new C1222a(1, Mode.DST_IN);

    /* renamed from: e */
    private final Paint f4923e = new C1222a(1, Mode.DST_OUT);

    /* renamed from: f */
    private final Paint f4924f = new C1222a(1);

    /* renamed from: g */
    private final Paint f4925g = new C1222a(Mode.CLEAR);

    /* renamed from: h */
    private final RectF f4926h = new RectF();

    /* renamed from: i */
    private final RectF f4927i = new RectF();

    /* renamed from: j */
    private final RectF f4928j = new RectF();

    /* renamed from: k */
    private final RectF f4929k = new RectF();

    /* renamed from: l */
    private final String f4930l;

    /* renamed from: m */
    final Matrix f4931m = new Matrix();

    /* renamed from: n */
    final C1191f f4932n;

    /* renamed from: o */
    final C1320d f4933o;

    /* renamed from: p */
    private C1254g f4934p;

    /* renamed from: q */
    private C1314a f4935q;

    /* renamed from: r */
    private C1314a f4936r;

    /* renamed from: s */
    private List<C1314a> f4937s;

    /* renamed from: t */
    private final List<C1247a<?, ?>> f4938t = new ArrayList();

    /* renamed from: u */
    final C1262o f4939u;

    /* renamed from: v */
    private boolean f4940v = true;

    /* renamed from: com.airbnb.lottie.t.l.a$a */
    /* compiled from: BaseLayer */
    class C1315a implements C1248a {

        /* renamed from: a */
        final /* synthetic */ C1250c f4941a;

        C1315a(C1250c cVar) {
            this.f4941a = cVar;
        }

        /* renamed from: a */
        public void mo6141a() {
            C1314a.this.m6509a(this.f4941a.mo6173i() == 1.0f);
        }
    }

    /* renamed from: com.airbnb.lottie.t.l.a$b */
    /* compiled from: BaseLayer */
    static /* synthetic */ class C1316b {

        /* renamed from: a */
        static final /* synthetic */ int[] f4943a = new int[C1321a.values().length];

        /* renamed from: b */
        static final /* synthetic */ int[] f4944b = new int[C1297a.values().length];

        /* JADX WARNING: Can't wrap try/catch for region: R(22:0|(2:1|2)|3|(2:5|6)|7|(2:9|10)|11|13|14|15|16|17|18|19|20|21|22|23|24|25|26|28) */
        /* JADX WARNING: Can't wrap try/catch for region: R(23:0|1|2|3|(2:5|6)|7|(2:9|10)|11|13|14|15|16|17|18|19|20|21|22|23|24|25|26|28) */
        /* JADX WARNING: Can't wrap try/catch for region: R(24:0|1|2|3|5|6|7|(2:9|10)|11|13|14|15|16|17|18|19|20|21|22|23|24|25|26|28) */
        /* JADX WARNING: Code restructure failed: missing block: B:29:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x003d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x0047 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x0051 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:21:0x005c */
        /* JADX WARNING: Missing exception handler attribute for start block: B:23:0x0067 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:25:0x0072 */
        static {
            /*
                com.airbnb.lottie.t.k.g$a[] r0 = com.airbnb.lottie.p016t.p018k.C1296g.C1297a.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f4944b = r0
                r0 = 1
                int[] r1 = f4944b     // Catch:{ NoSuchFieldError -> 0x0014 }
                com.airbnb.lottie.t.k.g$a r2 = com.airbnb.lottie.p016t.p018k.C1296g.C1297a.MASK_MODE_SUBTRACT     // Catch:{ NoSuchFieldError -> 0x0014 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0014 }
                r1[r2] = r0     // Catch:{ NoSuchFieldError -> 0x0014 }
            L_0x0014:
                r1 = 2
                int[] r2 = f4944b     // Catch:{ NoSuchFieldError -> 0x001f }
                com.airbnb.lottie.t.k.g$a r3 = com.airbnb.lottie.p016t.p018k.C1296g.C1297a.MASK_MODE_INTERSECT     // Catch:{ NoSuchFieldError -> 0x001f }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x001f }
                r2[r3] = r1     // Catch:{ NoSuchFieldError -> 0x001f }
            L_0x001f:
                r2 = 3
                int[] r3 = f4944b     // Catch:{ NoSuchFieldError -> 0x002a }
                com.airbnb.lottie.t.k.g$a r4 = com.airbnb.lottie.p016t.p018k.C1296g.C1297a.MASK_MODE_ADD     // Catch:{ NoSuchFieldError -> 0x002a }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x002a }
                r3[r4] = r2     // Catch:{ NoSuchFieldError -> 0x002a }
            L_0x002a:
                com.airbnb.lottie.t.l.d$a[] r3 = com.airbnb.lottie.p016t.p019l.C1320d.C1321a.values()
                int r3 = r3.length
                int[] r3 = new int[r3]
                f4943a = r3
                int[] r3 = f4943a     // Catch:{ NoSuchFieldError -> 0x003d }
                com.airbnb.lottie.t.l.d$a r4 = com.airbnb.lottie.p016t.p019l.C1320d.C1321a.SHAPE     // Catch:{ NoSuchFieldError -> 0x003d }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x003d }
                r3[r4] = r0     // Catch:{ NoSuchFieldError -> 0x003d }
            L_0x003d:
                int[] r0 = f4943a     // Catch:{ NoSuchFieldError -> 0x0047 }
                com.airbnb.lottie.t.l.d$a r3 = com.airbnb.lottie.p016t.p019l.C1320d.C1321a.PRE_COMP     // Catch:{ NoSuchFieldError -> 0x0047 }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x0047 }
                r0[r3] = r1     // Catch:{ NoSuchFieldError -> 0x0047 }
            L_0x0047:
                int[] r0 = f4943a     // Catch:{ NoSuchFieldError -> 0x0051 }
                com.airbnb.lottie.t.l.d$a r1 = com.airbnb.lottie.p016t.p019l.C1320d.C1321a.SOLID     // Catch:{ NoSuchFieldError -> 0x0051 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0051 }
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0051 }
            L_0x0051:
                int[] r0 = f4943a     // Catch:{ NoSuchFieldError -> 0x005c }
                com.airbnb.lottie.t.l.d$a r1 = com.airbnb.lottie.p016t.p019l.C1320d.C1321a.IMAGE     // Catch:{ NoSuchFieldError -> 0x005c }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x005c }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x005c }
            L_0x005c:
                int[] r0 = f4943a     // Catch:{ NoSuchFieldError -> 0x0067 }
                com.airbnb.lottie.t.l.d$a r1 = com.airbnb.lottie.p016t.p019l.C1320d.C1321a.NULL     // Catch:{ NoSuchFieldError -> 0x0067 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0067 }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0067 }
            L_0x0067:
                int[] r0 = f4943a     // Catch:{ NoSuchFieldError -> 0x0072 }
                com.airbnb.lottie.t.l.d$a r1 = com.airbnb.lottie.p016t.p019l.C1320d.C1321a.TEXT     // Catch:{ NoSuchFieldError -> 0x0072 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0072 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0072 }
            L_0x0072:
                int[] r0 = f4943a     // Catch:{ NoSuchFieldError -> 0x007d }
                com.airbnb.lottie.t.l.d$a r1 = com.airbnb.lottie.p016t.p019l.C1320d.C1321a.UNKNOWN     // Catch:{ NoSuchFieldError -> 0x007d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x007d }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x007d }
            L_0x007d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.airbnb.lottie.p016t.p019l.C1314a.C1316b.<clinit>():void");
        }
    }

    C1314a(C1191f fVar, C1320d dVar) {
        this.f4932n = fVar;
        this.f4933o = dVar;
        StringBuilder sb = new StringBuilder();
        sb.append(dVar.mo6352g());
        sb.append("#draw");
        this.f4930l = sb.toString();
        if (dVar.mo6351f() == C1322b.INVERT) {
            this.f4924f.setXfermode(new PorterDuffXfermode(Mode.DST_OUT));
        } else {
            this.f4924f.setXfermode(new PorterDuffXfermode(Mode.DST_IN));
        }
        this.f4939u = dVar.mo6367u().mo6227a();
        this.f4939u.mo6183a((C1248a) this);
        if (dVar.mo6350e() != null && !dVar.mo6350e().isEmpty()) {
            this.f4934p = new C1254g(dVar.mo6350e());
            for (C1247a a : this.f4934p.mo6176a()) {
                a.mo6163a((C1248a) this);
            }
            for (C1247a aVar : this.f4934p.mo6178c()) {
                mo6336a(aVar);
                aVar.mo6163a((C1248a) this);
            }
        }
        m6519g();
    }

    /* renamed from: c */
    private void m6513c(Canvas canvas, Matrix matrix, C1296g gVar, C1247a<C1304l, Path> aVar, C1247a<Integer, Integer> aVar2) {
        m6506a(canvas, this.f4926h, this.f4921c, true);
        canvas.drawRect(this.f4926h, this.f4921c);
        this.f4919a.set((Path) aVar.mo6169f());
        this.f4919a.transform(matrix);
        this.f4921c.setAlpha((int) (((float) ((Integer) aVar2.mo6169f()).intValue()) * 2.55f));
        canvas.drawPath(this.f4919a, this.f4923e);
        canvas.restore();
    }

    /* renamed from: e */
    private void m6516e(Canvas canvas, Matrix matrix, C1296g gVar, C1247a<C1304l, Path> aVar, C1247a<Integer, Integer> aVar2) {
        m6506a(canvas, this.f4926h, this.f4923e, true);
        canvas.drawRect(this.f4926h, this.f4921c);
        this.f4923e.setAlpha((int) (((float) ((Integer) aVar2.mo6169f()).intValue()) * 2.55f));
        this.f4919a.set((Path) aVar.mo6169f());
        this.f4919a.transform(matrix);
        canvas.drawPath(this.f4919a, this.f4923e);
        canvas.restore();
    }

    /* renamed from: f */
    private void m6517f() {
        this.f4932n.invalidateSelf();
    }

    /* renamed from: g */
    private void m6519g() {
        boolean z = true;
        if (!this.f4933o.mo6348c().isEmpty()) {
            C1250c cVar = new C1250c(this.f4933o.mo6348c());
            cVar.mo6171h();
            cVar.mo6163a((C1248a) new C1315a(cVar));
            if (((Float) cVar.mo6169f()).floatValue() != 1.0f) {
                z = false;
            }
            m6509a(z);
            mo6336a((C1247a<?, ?>) cVar);
            return;
        }
        m6509a(true);
    }

    /* renamed from: a */
    public void mo6146a(List<C1227c> list, List<C1227c> list2) {
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public C1320d mo6338b() {
        return this.f4933o;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public abstract void mo6339b(Canvas canvas, Matrix matrix, int i);

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public void mo6341b(C1271e eVar, int i, List<C1271e> list, C1271e eVar2) {
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public boolean mo6344d() {
        return this.f4935q != null;
    }

    public String getName() {
        return this.f4933o.mo6352g();
    }

    /* renamed from: a */
    static C1314a m6502a(C1320d dVar, C1191f fVar, C1182d dVar2) {
        switch (C1316b.f4943a[dVar.mo6349d().ordinal()]) {
            case 1:
                return new C1324f(fVar, dVar);
            case 2:
                return new C1317b(fVar, dVar, dVar2.mo6036c(dVar.mo6356k()), dVar2);
            case 3:
                return new C1325g(fVar, dVar);
            case 4:
                return new C1319c(fVar, dVar);
            case 5:
                return new C1323e(fVar, dVar);
            case 6:
                return new C1326h(fVar, dVar);
            default:
                StringBuilder sb = new StringBuilder();
                sb.append("Unknown layer type ");
                sb.append(dVar.mo6349d());
                C1181c.m6035d(sb.toString());
                return null;
        }
    }

    /* renamed from: d */
    private void m6514d(Canvas canvas, Matrix matrix, C1296g gVar, C1247a<C1304l, Path> aVar, C1247a<Integer, Integer> aVar2) {
        m6506a(canvas, this.f4926h, this.f4922d, true);
        canvas.drawRect(this.f4926h, this.f4921c);
        this.f4923e.setAlpha((int) (((float) ((Integer) aVar2.mo6169f()).intValue()) * 2.55f));
        this.f4919a.set((Path) aVar.mo6169f());
        this.f4919a.transform(matrix);
        canvas.drawPath(this.f4919a, this.f4923e);
        canvas.restore();
    }

    /* renamed from: f */
    private void m6518f(Canvas canvas, Matrix matrix, C1296g gVar, C1247a<C1304l, Path> aVar, C1247a<Integer, Integer> aVar2) {
        this.f4919a.set((Path) aVar.mo6169f());
        this.f4919a.transform(matrix);
        canvas.drawPath(this.f4919a, this.f4923e);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public void mo6342b(C1314a aVar) {
        this.f4936r = aVar;
    }

    /* renamed from: b */
    public void mo6340b(C1247a<?, ?> aVar) {
        this.f4938t.remove(aVar);
    }

    /* renamed from: b */
    private void m6510b(float f) {
        this.f4932n.mo6084e().mo6044k().mo6134a(this.f4933o.mo6352g(), f);
    }

    /* renamed from: b */
    private void m6512b(RectF rectF, Matrix matrix) {
        if (mo6344d() && this.f4933o.mo6351f() != C1322b.INVERT) {
            this.f4928j.set(0.0f, 0.0f, 0.0f, 0.0f);
            this.f4935q.mo6143a(this.f4928j, matrix, true);
            if (!rectF.intersect(this.f4928j)) {
                rectF.set(0.0f, 0.0f, 0.0f, 0.0f);
            }
        }
    }

    /* renamed from: e */
    private void m6515e() {
        if (this.f4937s == null) {
            if (this.f4936r == null) {
                this.f4937s = Collections.emptyList();
                return;
            }
            this.f4937s = new ArrayList();
            for (C1314a aVar = this.f4936r; aVar != null; aVar = aVar.f4936r) {
                this.f4937s.add(aVar);
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public boolean mo6343c() {
        C1254g gVar = this.f4934p;
        return gVar != null && !gVar.mo6176a().isEmpty();
    }

    /* renamed from: a */
    public void mo6141a() {
        m6517f();
    }

    /* renamed from: b */
    private void m6511b(Canvas canvas, Matrix matrix, C1296g gVar, C1247a<C1304l, Path> aVar, C1247a<Integer, Integer> aVar2) {
        m6506a(canvas, this.f4926h, this.f4922d, true);
        this.f4919a.set((Path) aVar.mo6169f());
        this.f4919a.transform(matrix);
        this.f4921c.setAlpha((int) (((float) ((Integer) aVar2.mo6169f()).intValue()) * 2.55f));
        canvas.drawPath(this.f4919a, this.f4921c);
        canvas.restore();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo6337a(C1314a aVar) {
        this.f4935q = aVar;
    }

    @SuppressLint({"WrongConstant"})
    /* renamed from: a */
    private void m6506a(Canvas canvas, RectF rectF, Paint paint, boolean z) {
        if (VERSION.SDK_INT < 23) {
            canvas.saveLayer(rectF, paint, z ? 31 : 19);
        } else {
            canvas.saveLayer(rectF, paint);
        }
    }

    /* renamed from: a */
    public void mo6336a(C1247a<?, ?> aVar) {
        if (aVar != null) {
            this.f4938t.add(aVar);
        }
    }

    /* renamed from: a */
    public void mo6143a(RectF rectF, Matrix matrix, boolean z) {
        this.f4926h.set(0.0f, 0.0f, 0.0f, 0.0f);
        m6515e();
        this.f4931m.set(matrix);
        if (z) {
            List<C1314a> list = this.f4937s;
            if (list != null) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    this.f4931m.preConcat(((C1314a) this.f4937s.get(size)).f4939u.mo6186b());
                }
            } else {
                C1314a aVar = this.f4936r;
                if (aVar != null) {
                    this.f4931m.preConcat(aVar.f4939u.mo6186b());
                }
            }
        }
        this.f4931m.preConcat(this.f4939u.mo6186b());
    }

    /* renamed from: a */
    public void mo6142a(Canvas canvas, Matrix matrix, int i) {
        C1181c.m6032a(this.f4930l);
        if (!this.f4940v || this.f4933o.mo6368v()) {
            C1181c.m6034c(this.f4930l);
            return;
        }
        m6515e();
        String str = "Layer#parentMatrix";
        C1181c.m6032a(str);
        this.f4920b.reset();
        this.f4920b.set(matrix);
        for (int size = this.f4937s.size() - 1; size >= 0; size--) {
            this.f4920b.preConcat(((C1314a) this.f4937s.get(size)).f4939u.mo6186b());
        }
        C1181c.m6034c(str);
        int intValue = (int) ((((((float) i) / 255.0f) * ((float) (this.f4939u.mo6188c() == null ? 100 : ((Integer) this.f4939u.mo6188c().mo6169f()).intValue()))) / 100.0f) * 255.0f);
        String str2 = "Layer#drawLayer";
        if (mo6344d() || mo6343c()) {
            String str3 = "Layer#computeBounds";
            C1181c.m6032a(str3);
            mo6143a(this.f4926h, this.f4920b, false);
            m6512b(this.f4926h, matrix);
            this.f4920b.preConcat(this.f4939u.mo6186b());
            m6507a(this.f4926h, this.f4920b);
            C1181c.m6034c(str3);
            if (!this.f4926h.isEmpty()) {
                String str4 = "Layer#saveLayer";
                C1181c.m6032a(str4);
                m6506a(canvas, this.f4926h, this.f4921c, true);
                C1181c.m6034c(str4);
                m6503a(canvas);
                C1181c.m6032a(str2);
                mo6339b(canvas, this.f4920b, intValue);
                C1181c.m6034c(str2);
                if (mo6343c()) {
                    m6504a(canvas, this.f4920b);
                }
                String str5 = "Layer#restoreLayer";
                if (mo6344d()) {
                    String str6 = "Layer#drawMatte";
                    C1181c.m6032a(str6);
                    C1181c.m6032a(str4);
                    m6506a(canvas, this.f4926h, this.f4924f, false);
                    C1181c.m6034c(str4);
                    m6503a(canvas);
                    this.f4935q.mo6142a(canvas, matrix, intValue);
                    C1181c.m6032a(str5);
                    canvas.restore();
                    C1181c.m6034c(str5);
                    C1181c.m6034c(str6);
                }
                C1181c.m6032a(str5);
                canvas.restore();
                C1181c.m6034c(str5);
            }
            m6510b(C1181c.m6034c(this.f4930l));
            return;
        }
        this.f4920b.preConcat(this.f4939u.mo6186b());
        C1181c.m6032a(str2);
        mo6339b(canvas, this.f4920b, intValue);
        C1181c.m6034c(str2);
        m6510b(C1181c.m6034c(this.f4930l));
    }

    /* renamed from: a */
    private void m6503a(Canvas canvas) {
        String str = "Layer#clearLayer";
        C1181c.m6032a(str);
        RectF rectF = this.f4926h;
        canvas.drawRect(rectF.left - 1.0f, rectF.top - 1.0f, rectF.right + 1.0f, rectF.bottom + 1.0f, this.f4925g);
        C1181c.m6034c(str);
    }

    /* renamed from: a */
    private void m6507a(RectF rectF, Matrix matrix) {
        this.f4927i.set(0.0f, 0.0f, 0.0f, 0.0f);
        if (mo6343c()) {
            int size = this.f4934p.mo6177b().size();
            int i = 0;
            while (i < size) {
                C1296g gVar = (C1296g) this.f4934p.mo6177b().get(i);
                this.f4919a.set((Path) ((C1247a) this.f4934p.mo6176a().get(i)).mo6169f());
                this.f4919a.transform(matrix);
                int i2 = C1316b.f4944b[gVar.mo6268a().ordinal()];
                if (i2 == 1) {
                    return;
                }
                if ((i2 != 2 && i2 != 3) || !gVar.mo6271d()) {
                    this.f4919a.computeBounds(this.f4929k, false);
                    if (i == 0) {
                        this.f4927i.set(this.f4929k);
                    } else {
                        RectF rectF2 = this.f4927i;
                        rectF2.set(Math.min(rectF2.left, this.f4929k.left), Math.min(this.f4927i.top, this.f4929k.top), Math.max(this.f4927i.right, this.f4929k.right), Math.max(this.f4927i.bottom, this.f4929k.bottom));
                    }
                    i++;
                } else {
                    return;
                }
            }
            if (!rectF.intersect(this.f4927i)) {
                rectF.set(0.0f, 0.0f, 0.0f, 0.0f);
            }
        }
    }

    /* renamed from: a */
    private void m6504a(Canvas canvas, Matrix matrix) {
        String str = "Layer#saveLayer";
        C1181c.m6032a(str);
        m6506a(canvas, this.f4926h, this.f4922d, false);
        C1181c.m6034c(str);
        for (int i = 0; i < this.f4934p.mo6177b().size(); i++) {
            C1296g gVar = (C1296g) this.f4934p.mo6177b().get(i);
            C1247a aVar = (C1247a) this.f4934p.mo6176a().get(i);
            C1247a aVar2 = (C1247a) this.f4934p.mo6178c().get(i);
            int i2 = C1316b.f4944b[gVar.mo6268a().ordinal()];
            if (i2 == 1) {
                if (i == 0) {
                    Paint paint = new Paint();
                    paint.setColor(-16777216);
                    canvas.drawRect(this.f4926h, paint);
                }
                if (gVar.mo6271d()) {
                    m6516e(canvas, matrix, gVar, aVar, aVar2);
                } else {
                    m6518f(canvas, matrix, gVar, aVar, aVar2);
                }
            } else if (i2 != 2) {
                if (i2 == 3) {
                    if (gVar.mo6271d()) {
                        m6513c(canvas, matrix, gVar, aVar, aVar2);
                    } else {
                        m6505a(canvas, matrix, gVar, aVar, aVar2);
                    }
                }
            } else if (gVar.mo6271d()) {
                m6514d(canvas, matrix, gVar, aVar, aVar2);
            } else {
                m6511b(canvas, matrix, gVar, aVar, aVar2);
            }
        }
        String str2 = "Layer#restoreLayer";
        C1181c.m6032a(str2);
        canvas.restore();
        C1181c.m6034c(str2);
    }

    /* renamed from: a */
    private void m6505a(Canvas canvas, Matrix matrix, C1296g gVar, C1247a<C1304l, Path> aVar, C1247a<Integer, Integer> aVar2) {
        this.f4919a.set((Path) aVar.mo6169f());
        this.f4919a.transform(matrix);
        this.f4921c.setAlpha((int) (((float) ((Integer) aVar2.mo6169f()).intValue()) * 2.55f));
        canvas.drawPath(this.f4919a, this.f4921c);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m6509a(boolean z) {
        if (z != this.f4940v) {
            this.f4940v = z;
            m6517f();
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo6335a(float f) {
        this.f4939u.mo6187b(f);
        if (this.f4934p != null) {
            for (int i = 0; i < this.f4934p.mo6176a().size(); i++) {
                ((C1247a) this.f4934p.mo6176a().get(i)).mo6162a(f);
            }
        }
        if (this.f4933o.mo6365t() != 0.0f) {
            f /= this.f4933o.mo6365t();
        }
        C1314a aVar = this.f4935q;
        if (aVar != null) {
            this.f4935q.mo6335a(aVar.f4933o.mo6365t() * f);
        }
        for (int i2 = 0; i2 < this.f4938t.size(); i2++) {
            ((C1247a) this.f4938t.get(i2)).mo6162a(f);
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
                mo6341b(eVar, i + eVar.mo6212b(getName(), i), list, eVar2);
            }
        }
    }

    /* renamed from: a */
    public <T> void mo6145a(T t, C1378c<T> cVar) {
        this.f4939u.mo6185a(t, cVar);
    }
}
