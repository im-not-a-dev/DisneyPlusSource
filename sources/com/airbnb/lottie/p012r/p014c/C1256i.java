package com.airbnb.lottie.p012r.p014c;

import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PointF;
import com.airbnb.lottie.p023x.C1376a;
import com.airbnb.lottie.p023x.C1378c;
import java.util.List;

/* renamed from: com.airbnb.lottie.r.c.i */
/* compiled from: PathKeyframeAnimation */
public class C1256i extends C1253f<PointF> {

    /* renamed from: l */
    private final PointF f4712l = new PointF();

    /* renamed from: m */
    private final float[] f4713m = new float[2];

    /* renamed from: n */
    private C1255h f4714n;

    /* renamed from: o */
    private PathMeasure f4715o = new PathMeasure();

    public C1256i(List<? extends C1376a<PointF>> list) {
        super(list);
    }

    /* renamed from: a */
    public PointF m6303a(C1376a<PointF> aVar, float f) {
        C1255h hVar = (C1255h) aVar;
        Path i = hVar.mo6180i();
        if (i == null) {
            return (PointF) aVar.f5053b;
        }
        C1378c<A> cVar = this.f4699e;
        if (cVar != null) {
            PointF pointF = (PointF) cVar.mo6429a(hVar.f5056e, hVar.f5057f.floatValue(), hVar.f5053b, hVar.f5054c, mo6167d(), f, mo6168e());
            if (pointF != null) {
                return pointF;
            }
        }
        if (this.f4714n != hVar) {
            this.f4715o.setPath(i, false);
            this.f4714n = hVar;
        }
        PathMeasure pathMeasure = this.f4715o;
        pathMeasure.getPosTan(f * pathMeasure.getLength(), this.f4713m, null);
        PointF pointF2 = this.f4712l;
        float[] fArr = this.f4713m;
        pointF2.set(fArr[0], fArr[1]);
        return this.f4712l;
    }
}
