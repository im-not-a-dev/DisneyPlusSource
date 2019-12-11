package com.airbnb.lottie.p012r.p014c;

import android.graphics.PointF;
import com.airbnb.lottie.p023x.C1376a;
import com.airbnb.lottie.p023x.C1378c;
import java.util.List;

/* renamed from: com.airbnb.lottie.r.c.j */
/* compiled from: PointKeyframeAnimation */
public class C1257j extends C1253f<PointF> {

    /* renamed from: l */
    private final PointF f4716l = new PointF();

    public C1257j(List<C1376a<PointF>> list) {
        super(list);
    }

    /* renamed from: a */
    public PointF m6305a(C1376a<PointF> aVar, float f) {
        T t = aVar.f5053b;
        if (t != null) {
            T t2 = aVar.f5054c;
            if (t2 != null) {
                PointF pointF = (PointF) t;
                PointF pointF2 = (PointF) t2;
                C1378c<A> cVar = this.f4699e;
                if (cVar != null) {
                    PointF pointF3 = (PointF) cVar.mo6429a(aVar.f5056e, aVar.f5057f.floatValue(), pointF, pointF2, f, mo6167d(), mo6168e());
                    if (pointF3 != null) {
                        return pointF3;
                    }
                }
                PointF pointF4 = this.f4716l;
                float f2 = pointF.x;
                float f3 = f2 + ((pointF2.x - f2) * f);
                float f4 = pointF.y;
                pointF4.set(f3, f4 + (f * (pointF2.y - f4)));
                return this.f4716l;
            }
        }
        throw new IllegalStateException("Missing values for keyframe.");
    }
}
