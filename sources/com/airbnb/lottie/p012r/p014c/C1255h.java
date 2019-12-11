package com.airbnb.lottie.p012r.p014c;

import android.graphics.Path;
import android.graphics.PointF;
import com.airbnb.lottie.C1182d;
import com.airbnb.lottie.p022w.C1375f;
import com.airbnb.lottie.p023x.C1376a;

/* renamed from: com.airbnb.lottie.r.c.h */
/* compiled from: PathKeyframe */
public class C1255h extends C1376a<PointF> {

    /* renamed from: o */
    private Path f4710o;

    /* renamed from: p */
    private final C1376a<PointF> f4711p;

    public C1255h(C1182d dVar, C1376a<PointF> aVar) {
        super(dVar, aVar.f5053b, aVar.f5054c, aVar.f5055d, aVar.f5056e, aVar.f5057f);
        this.f4711p = aVar;
        mo6179h();
    }

    /* renamed from: h */
    public void mo6179h() {
        boolean z;
        T t;
        T t2 = this.f5054c;
        if (t2 != null) {
            T t3 = this.f5053b;
            if (t3 != null && ((PointF) t3).equals(((PointF) t2).x, ((PointF) t2).y)) {
                z = true;
                t = this.f5054c;
                if (t != null && !z) {
                    PointF pointF = (PointF) this.f5053b;
                    PointF pointF2 = (PointF) t;
                    C1376a<PointF> aVar = this.f4711p;
                    this.f4710o = C1375f.m6735a(pointF, pointF2, aVar.f5064m, aVar.f5065n);
                    return;
                }
            }
        }
        z = false;
        t = this.f5054c;
        if (t != null) {
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: i */
    public Path mo6180i() {
        return this.f4710o;
    }
}
