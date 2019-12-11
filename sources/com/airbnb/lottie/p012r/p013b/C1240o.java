package com.airbnb.lottie.p012r.p013b;

import android.graphics.Path;
import android.graphics.PointF;
import com.airbnb.lottie.C1191f;
import com.airbnb.lottie.C1210j;
import com.airbnb.lottie.p012r.p014c.C1247a;
import com.airbnb.lottie.p012r.p014c.C1247a.C1248a;
import com.airbnb.lottie.p016t.C1271e;
import com.airbnb.lottie.p016t.p018k.C1300i;
import com.airbnb.lottie.p016t.p018k.C1300i.C1301a;
import com.airbnb.lottie.p016t.p018k.C1312q.C1313a;
import com.airbnb.lottie.p016t.p019l.C1314a;
import com.airbnb.lottie.p022w.C1374e;
import com.airbnb.lottie.p023x.C1378c;
import java.util.List;

/* renamed from: com.airbnb.lottie.r.b.o */
/* compiled from: PolystarContent */
public class C1240o implements C1239n, C1248a, C1235k {

    /* renamed from: a */
    private final Path f4643a = new Path();

    /* renamed from: b */
    private final String f4644b;

    /* renamed from: c */
    private final C1191f f4645c;

    /* renamed from: d */
    private final C1301a f4646d;

    /* renamed from: e */
    private final boolean f4647e;

    /* renamed from: f */
    private final C1247a<?, Float> f4648f;

    /* renamed from: g */
    private final C1247a<?, PointF> f4649g;

    /* renamed from: h */
    private final C1247a<?, Float> f4650h;

    /* renamed from: i */
    private final C1247a<?, Float> f4651i;

    /* renamed from: j */
    private final C1247a<?, Float> f4652j;

    /* renamed from: k */
    private final C1247a<?, Float> f4653k;

    /* renamed from: l */
    private final C1247a<?, Float> f4654l;

    /* renamed from: m */
    private C1226b f4655m = new C1226b();

    /* renamed from: n */
    private boolean f4656n;

    /* renamed from: com.airbnb.lottie.r.b.o$a */
    /* compiled from: PolystarContent */
    static /* synthetic */ class C1241a {

        /* renamed from: a */
        static final /* synthetic */ int[] f4657a = new int[C1301a.values().length];

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|6) */
        /* JADX WARNING: Code restructure failed: missing block: B:7:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0014 */
        static {
            /*
                com.airbnb.lottie.t.k.i$a[] r0 = com.airbnb.lottie.p016t.p018k.C1300i.C1301a.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f4657a = r0
                int[] r0 = f4657a     // Catch:{ NoSuchFieldError -> 0x0014 }
                com.airbnb.lottie.t.k.i$a r1 = com.airbnb.lottie.p016t.p018k.C1300i.C1301a.STAR     // Catch:{ NoSuchFieldError -> 0x0014 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0014 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0014 }
            L_0x0014:
                int[] r0 = f4657a     // Catch:{ NoSuchFieldError -> 0x001f }
                com.airbnb.lottie.t.k.i$a r1 = com.airbnb.lottie.p016t.p018k.C1300i.C1301a.POLYGON     // Catch:{ NoSuchFieldError -> 0x001f }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001f }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001f }
            L_0x001f:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.airbnb.lottie.p012r.p013b.C1240o.C1241a.<clinit>():void");
        }
    }

    public C1240o(C1191f fVar, C1314a aVar, C1300i iVar) {
        this.f4645c = fVar;
        this.f4644b = iVar.mo6278c();
        this.f4646d = iVar.mo6284i();
        this.f4647e = iVar.mo6285j();
        this.f4648f = iVar.mo6281f().mo6223a();
        this.f4649g = iVar.mo6282g().mo6223a();
        this.f4650h = iVar.mo6283h().mo6223a();
        this.f4652j = iVar.mo6279d().mo6223a();
        this.f4654l = iVar.mo6280e().mo6223a();
        if (this.f4646d == C1301a.STAR) {
            this.f4651i = iVar.mo6276a().mo6223a();
            this.f4653k = iVar.mo6277b().mo6223a();
        } else {
            this.f4651i = null;
            this.f4653k = null;
        }
        aVar.mo6336a(this.f4648f);
        aVar.mo6336a(this.f4649g);
        aVar.mo6336a(this.f4650h);
        aVar.mo6336a(this.f4652j);
        aVar.mo6336a(this.f4654l);
        if (this.f4646d == C1301a.STAR) {
            aVar.mo6336a(this.f4651i);
            aVar.mo6336a(this.f4653k);
        }
        this.f4648f.mo6163a((C1248a) this);
        this.f4649g.mo6163a((C1248a) this);
        this.f4650h.mo6163a((C1248a) this);
        this.f4652j.mo6163a((C1248a) this);
        this.f4654l.mo6163a((C1248a) this);
        if (this.f4646d == C1301a.STAR) {
            this.f4651i.mo6163a((C1248a) this);
            this.f4653k.mo6163a((C1248a) this);
        }
    }

    /* renamed from: b */
    private void m6233b() {
        double d;
        double d2;
        double d3;
        int i;
        int floor = (int) Math.floor((double) ((Float) this.f4648f.mo6169f()).floatValue());
        C1247a<?, Float> aVar = this.f4650h;
        double radians = Math.toRadians((aVar == null ? 0.0d : (double) ((Float) aVar.mo6169f()).floatValue()) - 90.0d);
        double d4 = (double) floor;
        float f = (float) (6.283185307179586d / d4);
        float floatValue = ((Float) this.f4654l.mo6169f()).floatValue() / 100.0f;
        float floatValue2 = ((Float) this.f4652j.mo6169f()).floatValue();
        double d5 = (double) floatValue2;
        float cos = (float) (Math.cos(radians) * d5);
        float sin = (float) (Math.sin(radians) * d5);
        this.f4643a.moveTo(cos, sin);
        double d6 = (double) f;
        double d7 = radians + d6;
        double ceil = Math.ceil(d4);
        int i2 = 0;
        while (((double) i2) < ceil) {
            float cos2 = (float) (Math.cos(d7) * d5);
            double d8 = ceil;
            float sin2 = (float) (d5 * Math.sin(d7));
            if (floatValue != 0.0f) {
                d3 = d5;
                i = i2;
                d2 = d7;
                double atan2 = (double) ((float) (Math.atan2((double) sin, (double) cos) - 1.5707963267948966d));
                d = d6;
                double atan22 = (double) ((float) (Math.atan2((double) sin2, (double) cos2) - 1.5707963267948966d));
                float f2 = floatValue2 * floatValue * 0.25f;
                this.f4643a.cubicTo(cos - (((float) Math.cos(atan2)) * f2), sin - (((float) Math.sin(atan2)) * f2), cos2 + (((float) Math.cos(atan22)) * f2), sin2 + (f2 * ((float) Math.sin(atan22))), cos2, sin2);
            } else {
                d2 = d7;
                d3 = d5;
                d = d6;
                i = i2;
                this.f4643a.lineTo(cos2, sin2);
            }
            d7 = d2 + d;
            i2 = i + 1;
            sin = sin2;
            cos = cos2;
            ceil = d8;
            d5 = d3;
            d6 = d;
        }
        PointF pointF = (PointF) this.f4649g.mo6169f();
        this.f4643a.offset(pointF.x, pointF.y);
        this.f4643a.close();
    }

    /* renamed from: c */
    private void m6234c() {
        double d;
        int i;
        float f;
        float f2;
        float f3;
        double d2;
        float f4;
        float f5;
        float f6;
        float f7;
        float f8;
        float f9;
        float f10;
        float f11;
        float f12;
        float floatValue = ((Float) this.f4648f.mo6169f()).floatValue();
        C1247a<?, Float> aVar = this.f4650h;
        double radians = Math.toRadians((aVar == null ? 0.0d : (double) ((Float) aVar.mo6169f()).floatValue()) - 90.0d);
        double d3 = (double) floatValue;
        float f13 = (float) (6.283185307179586d / d3);
        float f14 = f13 / 2.0f;
        float f15 = floatValue - ((float) ((int) floatValue));
        int i2 = (f15 > 0.0f ? 1 : (f15 == 0.0f ? 0 : -1));
        if (i2 != 0) {
            radians += (double) ((1.0f - f15) * f14);
        }
        float floatValue2 = ((Float) this.f4652j.mo6169f()).floatValue();
        float floatValue3 = ((Float) this.f4651i.mo6169f()).floatValue();
        C1247a<?, Float> aVar2 = this.f4653k;
        float floatValue4 = aVar2 != null ? ((Float) aVar2.mo6169f()).floatValue() / 100.0f : 0.0f;
        C1247a<?, Float> aVar3 = this.f4654l;
        float floatValue5 = aVar3 != null ? ((Float) aVar3.mo6169f()).floatValue() / 100.0f : 0.0f;
        if (i2 != 0) {
            f = ((floatValue2 - floatValue3) * f15) + floatValue3;
            i = i2;
            double d4 = (double) f;
            d = d3;
            f3 = (float) (d4 * Math.cos(radians));
            f2 = (float) (d4 * Math.sin(radians));
            this.f4643a.moveTo(f3, f2);
            d2 = radians + ((double) ((f13 * f15) / 2.0f));
        } else {
            d = d3;
            i = i2;
            double d5 = (double) floatValue2;
            float cos = (float) (Math.cos(radians) * d5);
            float sin = (float) (d5 * Math.sin(radians));
            this.f4643a.moveTo(cos, sin);
            d2 = radians + ((double) f14);
            f3 = cos;
            f2 = sin;
            f = 0.0f;
        }
        double ceil = Math.ceil(d) * 2.0d;
        boolean z = false;
        double d6 = d2;
        float f16 = f14;
        int i3 = 0;
        while (true) {
            double d7 = (double) i3;
            if (d7 < ceil) {
                float f17 = z ? floatValue2 : floatValue3;
                int i4 = (f > 0.0f ? 1 : (f == 0.0f ? 0 : -1));
                if (i4 == 0 || d7 != ceil - 2.0d) {
                    f4 = f16;
                } else {
                    f4 = f16;
                    f16 = (f13 * f15) / 2.0f;
                }
                if (i4 == 0 || d7 != ceil - 1.0d) {
                    f6 = f13;
                    f5 = floatValue3;
                    f8 = f17;
                    f7 = floatValue2;
                } else {
                    f6 = f13;
                    f7 = floatValue2;
                    f5 = floatValue3;
                    f8 = f;
                }
                double d8 = (double) f8;
                float f18 = f16;
                float cos2 = (float) (d8 * Math.cos(d6));
                float sin2 = (float) (d8 * Math.sin(d6));
                if (floatValue4 == 0.0f && floatValue5 == 0.0f) {
                    this.f4643a.lineTo(cos2, sin2);
                    f12 = sin2;
                    f9 = floatValue4;
                    f10 = floatValue5;
                    f11 = f;
                } else {
                    f9 = floatValue4;
                    f10 = floatValue5;
                    double atan2 = (double) ((float) (Math.atan2((double) f2, (double) f3) - 1.5707963267948966d));
                    float cos3 = (float) Math.cos(atan2);
                    float sin3 = (float) Math.sin(atan2);
                    f11 = f;
                    f12 = sin2;
                    float f19 = f3;
                    double atan22 = (double) ((float) (Math.atan2((double) sin2, (double) cos2) - 1.5707963267948966d));
                    float cos4 = (float) Math.cos(atan22);
                    float sin4 = (float) Math.sin(atan22);
                    float f20 = z ? f9 : f10;
                    float f21 = (z ? f5 : f7) * f20 * 0.47829f;
                    float f22 = cos3 * f21;
                    float f23 = f21 * sin3;
                    float f24 = (z ? f7 : f5) * (z ? f10 : f9) * 0.47829f;
                    float f25 = cos4 * f24;
                    float f26 = f24 * sin4;
                    if (i != 0) {
                        if (i3 == 0) {
                            f22 *= f15;
                            f23 *= f15;
                        } else if (d7 == ceil - 1.0d) {
                            f25 *= f15;
                            f26 *= f15;
                        }
                    }
                    this.f4643a.cubicTo(f19 - f22, f2 - f23, cos2 + f25, f12 + f26, cos2, f12);
                }
                d6 += (double) f18;
                z = !z;
                i3++;
                f3 = cos2;
                f = f11;
                floatValue2 = f7;
                f13 = f6;
                f16 = f4;
                floatValue3 = f5;
                floatValue4 = f9;
                floatValue5 = f10;
                f2 = f12;
            } else {
                PointF pointF = (PointF) this.f4649g.mo6169f();
                this.f4643a.offset(pointF.x, pointF.y);
                this.f4643a.close();
                return;
            }
        }
    }

    /* renamed from: d */
    private void m6235d() {
        this.f4656n = false;
        this.f4645c.invalidateSelf();
    }

    /* renamed from: a */
    public void mo6141a() {
        m6235d();
    }

    public String getName() {
        return this.f4644b;
    }

    /* renamed from: j0 */
    public Path mo6152j0() {
        if (this.f4656n) {
            return this.f4643a;
        }
        this.f4643a.reset();
        if (this.f4647e) {
            this.f4656n = true;
            return this.f4643a;
        }
        int i = C1241a.f4657a[this.f4646d.ordinal()];
        if (i == 1) {
            m6234c();
        } else if (i == 2) {
            m6233b();
        }
        this.f4643a.close();
        this.f4655m.mo6147a(this.f4643a);
        this.f4656n = true;
        return this.f4643a;
    }

    /* renamed from: a */
    public void mo6146a(List<C1227c> list, List<C1227c> list2) {
        for (int i = 0; i < list.size(); i++) {
            C1227c cVar = (C1227c) list.get(i);
            if (cVar instanceof C1246t) {
                C1246t tVar = (C1246t) cVar;
                if (tVar.mo6158e() == C1313a.SIMULTANEOUSLY) {
                    this.f4655m.mo6148a(tVar);
                    tVar.mo6154a(this);
                }
            }
        }
    }

    /* renamed from: a */
    public void mo6144a(C1271e eVar, int i, List<C1271e> list, C1271e eVar2) {
        C1374e.m6727a(eVar, i, list, eVar2, this);
    }

    /* renamed from: a */
    public <T> void mo6145a(T t, C1378c<T> cVar) {
        if (t == C1210j.f4539s) {
            this.f4648f.mo6164a(cVar);
        } else if (t == C1210j.f4540t) {
            this.f4650h.mo6164a(cVar);
        } else if (t == C1210j.f4530j) {
            this.f4649g.mo6164a(cVar);
        } else {
            if (t == C1210j.f4541u) {
                C1247a<?, Float> aVar = this.f4651i;
                if (aVar != null) {
                    aVar.mo6164a(cVar);
                    return;
                }
            }
            if (t == C1210j.f4542v) {
                this.f4652j.mo6164a(cVar);
                return;
            }
            if (t == C1210j.f4543w) {
                C1247a<?, Float> aVar2 = this.f4653k;
                if (aVar2 != null) {
                    aVar2.mo6164a(cVar);
                    return;
                }
            }
            if (t == C1210j.f4544x) {
                this.f4654l.mo6164a(cVar);
            }
        }
    }
}
