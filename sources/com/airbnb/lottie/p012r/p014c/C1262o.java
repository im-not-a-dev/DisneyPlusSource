package com.airbnb.lottie.p012r.p014c;

import android.graphics.Matrix;
import android.graphics.PointF;
import com.airbnb.lottie.C1210j;
import com.airbnb.lottie.p012r.p014c.C1247a.C1248a;
import com.airbnb.lottie.p016t.p017j.C1287l;
import com.airbnb.lottie.p016t.p019l.C1314a;
import com.airbnb.lottie.p023x.C1376a;
import com.airbnb.lottie.p023x.C1378c;
import com.airbnb.lottie.p023x.C1379d;
import java.util.Collections;

/* renamed from: com.airbnb.lottie.r.c.o */
/* compiled from: TransformKeyframeAnimation */
public class C1262o {

    /* renamed from: a */
    private final Matrix f4723a = new Matrix();

    /* renamed from: b */
    private final Matrix f4724b;

    /* renamed from: c */
    private final Matrix f4725c;

    /* renamed from: d */
    private final Matrix f4726d;

    /* renamed from: e */
    private final float[] f4727e;

    /* renamed from: f */
    private C1247a<PointF, PointF> f4728f;

    /* renamed from: g */
    private C1247a<?, PointF> f4729g;

    /* renamed from: h */
    private C1247a<C1379d, C1379d> f4730h;

    /* renamed from: i */
    private C1247a<Float, Float> f4731i;

    /* renamed from: j */
    private C1247a<Integer, Integer> f4732j;

    /* renamed from: k */
    private C1250c f4733k;

    /* renamed from: l */
    private C1250c f4734l;

    /* renamed from: m */
    private C1247a<?, Float> f4735m;

    /* renamed from: n */
    private C1247a<?, Float> f4736n;

    public C1262o(C1287l lVar) {
        this.f4728f = lVar.mo6228b() == null ? null : lVar.mo6228b().mo6223a();
        this.f4729g = lVar.mo6231e() == null ? null : lVar.mo6231e().mo6223a();
        this.f4730h = lVar.mo6233g() == null ? null : lVar.mo6233g().mo6223a();
        this.f4731i = lVar.mo6232f() == null ? null : lVar.mo6232f().mo6223a();
        this.f4733k = lVar.mo6234h() == null ? null : (C1250c) lVar.mo6234h().mo6223a();
        if (this.f4733k != null) {
            this.f4724b = new Matrix();
            this.f4725c = new Matrix();
            this.f4726d = new Matrix();
            this.f4727e = new float[9];
        } else {
            this.f4724b = null;
            this.f4725c = null;
            this.f4726d = null;
            this.f4727e = null;
        }
        this.f4734l = lVar.mo6235i() == null ? null : (C1250c) lVar.mo6235i().mo6223a();
        if (lVar.mo6230d() != null) {
            this.f4732j = lVar.mo6230d().mo6223a();
        }
        if (lVar.mo6236j() != null) {
            this.f4735m = lVar.mo6236j().mo6223a();
        } else {
            this.f4735m = null;
        }
        if (lVar.mo6229c() != null) {
            this.f4736n = lVar.mo6229c().mo6223a();
        } else {
            this.f4736n = null;
        }
    }

    /* renamed from: e */
    private void m6317e() {
        for (int i = 0; i < 9; i++) {
            this.f4727e[i] = 0.0f;
        }
    }

    /* renamed from: a */
    public void mo6184a(C1314a aVar) {
        aVar.mo6336a(this.f4732j);
        aVar.mo6336a(this.f4735m);
        aVar.mo6336a(this.f4736n);
        aVar.mo6336a(this.f4728f);
        aVar.mo6336a(this.f4729g);
        aVar.mo6336a(this.f4730h);
        aVar.mo6336a(this.f4731i);
        aVar.mo6336a((C1247a<?, ?>) this.f4733k);
        aVar.mo6336a((C1247a<?, ?>) this.f4734l);
    }

    /* renamed from: b */
    public void mo6187b(float f) {
        C1247a<Integer, Integer> aVar = this.f4732j;
        if (aVar != null) {
            aVar.mo6162a(f);
        }
        C1247a<?, Float> aVar2 = this.f4735m;
        if (aVar2 != null) {
            aVar2.mo6162a(f);
        }
        C1247a<?, Float> aVar3 = this.f4736n;
        if (aVar3 != null) {
            aVar3.mo6162a(f);
        }
        C1247a<PointF, PointF> aVar4 = this.f4728f;
        if (aVar4 != null) {
            aVar4.mo6162a(f);
        }
        C1247a<?, PointF> aVar5 = this.f4729g;
        if (aVar5 != null) {
            aVar5.mo6162a(f);
        }
        C1247a<C1379d, C1379d> aVar6 = this.f4730h;
        if (aVar6 != null) {
            aVar6.mo6162a(f);
        }
        C1247a<Float, Float> aVar7 = this.f4731i;
        if (aVar7 != null) {
            aVar7.mo6162a(f);
        }
        C1250c cVar = this.f4733k;
        if (cVar != null) {
            cVar.mo6162a(f);
        }
        C1250c cVar2 = this.f4734l;
        if (cVar2 != null) {
            cVar2.mo6162a(f);
        }
    }

    /* renamed from: c */
    public C1247a<?, Integer> mo6188c() {
        return this.f4732j;
    }

    /* renamed from: d */
    public C1247a<?, Float> mo6189d() {
        return this.f4735m;
    }

    /* renamed from: a */
    public void mo6183a(C1248a aVar) {
        C1247a<Integer, Integer> aVar2 = this.f4732j;
        if (aVar2 != null) {
            aVar2.mo6163a(aVar);
        }
        C1247a<?, Float> aVar3 = this.f4735m;
        if (aVar3 != null) {
            aVar3.mo6163a(aVar);
        }
        C1247a<?, Float> aVar4 = this.f4736n;
        if (aVar4 != null) {
            aVar4.mo6163a(aVar);
        }
        C1247a<PointF, PointF> aVar5 = this.f4728f;
        if (aVar5 != null) {
            aVar5.mo6163a(aVar);
        }
        C1247a<?, PointF> aVar6 = this.f4729g;
        if (aVar6 != null) {
            aVar6.mo6163a(aVar);
        }
        C1247a<C1379d, C1379d> aVar7 = this.f4730h;
        if (aVar7 != null) {
            aVar7.mo6163a(aVar);
        }
        C1247a<Float, Float> aVar8 = this.f4731i;
        if (aVar8 != null) {
            aVar8.mo6163a(aVar);
        }
        C1250c cVar = this.f4733k;
        if (cVar != null) {
            cVar.mo6163a(aVar);
        }
        C1250c cVar2 = this.f4734l;
        if (cVar2 != null) {
            cVar2.mo6163a(aVar);
        }
    }

    /* renamed from: b */
    public Matrix mo6186b() {
        float f;
        this.f4723a.reset();
        C1247a<?, PointF> aVar = this.f4729g;
        if (aVar != null) {
            PointF pointF = (PointF) aVar.mo6169f();
            if (!(pointF.x == 0.0f && pointF.y == 0.0f)) {
                this.f4723a.preTranslate(pointF.x, pointF.y);
            }
        }
        C1247a<Float, Float> aVar2 = this.f4731i;
        if (aVar2 != null) {
            if (aVar2 instanceof C1263p) {
                f = ((Float) aVar2.mo6169f()).floatValue();
            } else {
                f = ((C1250c) aVar2).mo6173i();
            }
            if (f != 0.0f) {
                this.f4723a.preRotate(f);
            }
        }
        if (this.f4733k != null) {
            C1250c cVar = this.f4734l;
            float cos = cVar == null ? 0.0f : (float) Math.cos(Math.toRadians((double) ((-cVar.mo6173i()) + 90.0f)));
            C1250c cVar2 = this.f4734l;
            float sin = cVar2 == null ? 1.0f : (float) Math.sin(Math.toRadians((double) ((-cVar2.mo6173i()) + 90.0f)));
            float tan = (float) Math.tan(Math.toRadians((double) this.f4733k.mo6173i()));
            m6317e();
            float[] fArr = this.f4727e;
            fArr[0] = cos;
            fArr[1] = sin;
            float f2 = -sin;
            fArr[3] = f2;
            fArr[4] = cos;
            fArr[8] = 1.0f;
            this.f4724b.setValues(fArr);
            m6317e();
            float[] fArr2 = this.f4727e;
            fArr2[0] = 1.0f;
            fArr2[3] = tan;
            fArr2[4] = 1.0f;
            fArr2[8] = 1.0f;
            this.f4725c.setValues(fArr2);
            m6317e();
            float[] fArr3 = this.f4727e;
            fArr3[0] = cos;
            fArr3[1] = f2;
            fArr3[3] = sin;
            fArr3[4] = cos;
            fArr3[8] = 1.0f;
            this.f4726d.setValues(fArr3);
            this.f4725c.preConcat(this.f4724b);
            this.f4726d.preConcat(this.f4725c);
            this.f4723a.preConcat(this.f4726d);
        }
        C1247a<C1379d, C1379d> aVar3 = this.f4730h;
        if (aVar3 != null) {
            C1379d dVar = (C1379d) aVar3.mo6169f();
            if (!(dVar.mo6432a() == 1.0f && dVar.mo6434b() == 1.0f)) {
                this.f4723a.preScale(dVar.mo6432a(), dVar.mo6434b());
            }
        }
        C1247a<PointF, PointF> aVar4 = this.f4728f;
        if (aVar4 != null) {
            PointF pointF2 = (PointF) aVar4.mo6169f();
            if (!(pointF2.x == 0.0f && pointF2.y == 0.0f)) {
                this.f4723a.preTranslate(-pointF2.x, -pointF2.y);
            }
        }
        return this.f4723a;
    }

    /* renamed from: a */
    public C1247a<?, Float> mo6182a() {
        return this.f4736n;
    }

    /* renamed from: a */
    public Matrix mo6181a(float f) {
        C1247a<?, PointF> aVar = this.f4729g;
        PointF pointF = null;
        PointF pointF2 = aVar == null ? null : (PointF) aVar.mo6169f();
        C1247a<C1379d, C1379d> aVar2 = this.f4730h;
        C1379d dVar = aVar2 == null ? null : (C1379d) aVar2.mo6169f();
        this.f4723a.reset();
        if (pointF2 != null) {
            this.f4723a.preTranslate(pointF2.x * f, pointF2.y * f);
        }
        if (dVar != null) {
            double d = (double) f;
            this.f4723a.preScale((float) Math.pow((double) dVar.mo6432a(), d), (float) Math.pow((double) dVar.mo6434b(), d));
        }
        C1247a<Float, Float> aVar3 = this.f4731i;
        if (aVar3 != null) {
            float floatValue = ((Float) aVar3.mo6169f()).floatValue();
            C1247a<PointF, PointF> aVar4 = this.f4728f;
            if (aVar4 != null) {
                pointF = (PointF) aVar4.mo6169f();
            }
            Matrix matrix = this.f4723a;
            float f2 = floatValue * f;
            float f3 = 0.0f;
            float f4 = pointF == null ? 0.0f : pointF.x;
            if (pointF != null) {
                f3 = pointF.y;
            }
            matrix.preRotate(f2, f4, f3);
        }
        return this.f4723a;
    }

    /* renamed from: a */
    public <T> boolean mo6185a(T t, C1378c<T> cVar) {
        if (t == C1210j.f4525e) {
            C1247a<PointF, PointF> aVar = this.f4728f;
            if (aVar == null) {
                this.f4728f = new C1263p(cVar, new PointF());
            } else {
                aVar.mo6164a(cVar);
            }
        } else if (t == C1210j.f4526f) {
            C1247a<?, PointF> aVar2 = this.f4729g;
            if (aVar2 == null) {
                this.f4729g = new C1263p(cVar, new PointF());
            } else {
                aVar2.mo6164a(cVar);
            }
        } else if (t == C1210j.f4531k) {
            C1247a<C1379d, C1379d> aVar3 = this.f4730h;
            if (aVar3 == null) {
                this.f4730h = new C1263p(cVar, new C1379d());
            } else {
                aVar3.mo6164a(cVar);
            }
        } else if (t == C1210j.f4532l) {
            C1247a<Float, Float> aVar4 = this.f4731i;
            if (aVar4 == null) {
                this.f4731i = new C1263p(cVar, Float.valueOf(0.0f));
            } else {
                aVar4.mo6164a(cVar);
            }
        } else if (t == C1210j.f4523c) {
            C1247a<Integer, Integer> aVar5 = this.f4732j;
            if (aVar5 == null) {
                this.f4732j = new C1263p(cVar, Integer.valueOf(100));
            } else {
                aVar5.mo6164a(cVar);
            }
        } else {
            if (t == C1210j.f4545y) {
                C1247a<?, Float> aVar6 = this.f4735m;
                if (aVar6 != null) {
                    if (aVar6 == null) {
                        this.f4735m = new C1263p(cVar, Integer.valueOf(100));
                    } else {
                        aVar6.mo6164a(cVar);
                    }
                }
            }
            if (t == C1210j.f4546z) {
                C1247a<?, Float> aVar7 = this.f4736n;
                if (aVar7 != null) {
                    if (aVar7 == null) {
                        this.f4736n = new C1263p(cVar, Integer.valueOf(100));
                    } else {
                        aVar7.mo6164a(cVar);
                    }
                }
            }
            if (t == C1210j.f4533m) {
                C1250c cVar2 = this.f4733k;
                if (cVar2 != null) {
                    if (cVar2 == null) {
                        this.f4733k = new C1250c(Collections.singletonList(new C1376a(Float.valueOf(0.0f))));
                    }
                    this.f4733k.mo6164a(cVar);
                }
            }
            if (t == C1210j.f4534n) {
                C1250c cVar3 = this.f4734l;
                if (cVar3 != null) {
                    if (cVar3 == null) {
                        this.f4734l = new C1250c(Collections.singletonList(new C1376a(Float.valueOf(0.0f))));
                    }
                    this.f4734l.mo6164a(cVar);
                }
            }
            return false;
        }
        return true;
    }
}
