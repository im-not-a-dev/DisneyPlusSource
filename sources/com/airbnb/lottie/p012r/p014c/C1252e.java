package com.airbnb.lottie.p012r.p014c;

import com.airbnb.lottie.p022w.C1374e;
import com.airbnb.lottie.p023x.C1376a;
import com.airbnb.lottie.p023x.C1378c;
import java.util.List;

/* renamed from: com.airbnb.lottie.r.c.e */
/* compiled from: IntegerKeyframeAnimation */
public class C1252e extends C1253f<Integer> {
    public C1252e(List<C1376a<Integer>> list) {
        super(list);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public int mo6175b(C1376a<Integer> aVar, float f) {
        if (aVar.f5053b == null || aVar.f5054c == null) {
            throw new IllegalStateException("Missing values for keyframe.");
        }
        C1378c<A> cVar = this.f4699e;
        if (cVar != null) {
            Integer num = (Integer) cVar.mo6429a(aVar.f5056e, aVar.f5057f.floatValue(), aVar.f5053b, aVar.f5054c, f, mo6167d(), mo6168e());
            if (num != null) {
                return num.intValue();
            }
        }
        return C1374e.m6724a(aVar.mo6425f(), aVar.mo6422c(), f);
    }

    /* renamed from: i */
    public int mo6173i() {
        return mo6175b(mo6160a(), mo6166c());
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public Integer m6294a(C1376a<Integer> aVar, float f) {
        return Integer.valueOf(mo6175b(aVar, f));
    }
}
