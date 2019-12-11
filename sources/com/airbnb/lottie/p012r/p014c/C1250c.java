package com.airbnb.lottie.p012r.p014c;

import com.airbnb.lottie.p022w.C1374e;
import com.airbnb.lottie.p023x.C1376a;
import com.airbnb.lottie.p023x.C1378c;
import java.util.List;

/* renamed from: com.airbnb.lottie.r.c.c */
/* compiled from: FloatKeyframeAnimation */
public class C1250c extends C1253f<Float> {
    public C1250c(List<C1376a<Float>> list) {
        super(list);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public float mo6174b(C1376a<Float> aVar, float f) {
        if (aVar.f5053b == null || aVar.f5054c == null) {
            throw new IllegalStateException("Missing values for keyframe.");
        }
        C1378c<A> cVar = this.f4699e;
        if (cVar != null) {
            Float f2 = (Float) cVar.mo6429a(aVar.f5056e, aVar.f5057f.floatValue(), aVar.f5053b, aVar.f5054c, f, mo6167d(), mo6168e());
            if (f2 != null) {
                return f2.floatValue();
            }
        }
        return C1374e.m6731c(aVar.mo6424e(), aVar.mo6421b(), f);
    }

    /* renamed from: i */
    public float mo6173i() {
        return mo6174b(mo6160a(), mo6166c());
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public Float m6288a(C1376a<Float> aVar, float f) {
        return Float.valueOf(mo6174b(aVar, f));
    }
}
