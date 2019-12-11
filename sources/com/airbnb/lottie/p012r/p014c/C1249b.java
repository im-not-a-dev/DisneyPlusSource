package com.airbnb.lottie.p012r.p014c;

import com.airbnb.lottie.p022w.C1371b;
import com.airbnb.lottie.p022w.C1374e;
import com.airbnb.lottie.p023x.C1376a;
import com.airbnb.lottie.p023x.C1378c;
import java.util.List;

/* renamed from: com.airbnb.lottie.r.c.b */
/* compiled from: ColorKeyframeAnimation */
public class C1249b extends C1253f<Integer> {
    public C1249b(List<C1376a<Integer>> list) {
        super(list);
    }

    /* renamed from: b */
    public int mo6172b(C1376a<Integer> aVar, float f) {
        T t = aVar.f5053b;
        if (t == null || aVar.f5054c == null) {
            throw new IllegalStateException("Missing values for keyframe.");
        }
        int intValue = ((Integer) t).intValue();
        int intValue2 = ((Integer) aVar.f5054c).intValue();
        C1378c<A> cVar = this.f4699e;
        if (cVar != null) {
            Integer num = (Integer) cVar.mo6429a(aVar.f5056e, aVar.f5057f.floatValue(), Integer.valueOf(intValue), Integer.valueOf(intValue2), f, mo6167d(), mo6168e());
            if (num != null) {
                return num.intValue();
            }
        }
        return C1371b.m6694a(C1374e.m6721a(f, 0.0f, 1.0f), intValue, intValue2);
    }

    /* renamed from: i */
    public int mo6173i() {
        return mo6172b(mo6160a(), mo6166c());
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public Integer m6284a(C1376a<Integer> aVar, float f) {
        return Integer.valueOf(mo6172b(aVar, f));
    }
}
