package com.airbnb.lottie.p012r.p014c;

import com.airbnb.lottie.p022w.C1374e;
import com.airbnb.lottie.p023x.C1376a;
import com.airbnb.lottie.p023x.C1378c;
import com.airbnb.lottie.p023x.C1379d;
import java.util.List;

/* renamed from: com.airbnb.lottie.r.c.k */
/* compiled from: ScaleKeyframeAnimation */
public class C1258k extends C1253f<C1379d> {

    /* renamed from: l */
    private final C1379d f4717l = new C1379d();

    public C1258k(List<C1376a<C1379d>> list) {
        super(list);
    }

    /* renamed from: a */
    public C1379d m6307a(C1376a<C1379d> aVar, float f) {
        T t = aVar.f5053b;
        if (t != null) {
            T t2 = aVar.f5054c;
            if (t2 != null) {
                C1379d dVar = (C1379d) t;
                C1379d dVar2 = (C1379d) t2;
                C1378c<A> cVar = this.f4699e;
                if (cVar != null) {
                    C1379d dVar3 = (C1379d) cVar.mo6429a(aVar.f5056e, aVar.f5057f.floatValue(), dVar, dVar2, f, mo6167d(), mo6168e());
                    if (dVar3 != null) {
                        return dVar3;
                    }
                }
                this.f4717l.mo6435b(C1374e.m6731c(dVar.mo6432a(), dVar2.mo6432a(), f), C1374e.m6731c(dVar.mo6434b(), dVar2.mo6434b(), f));
                return this.f4717l;
            }
        }
        throw new IllegalStateException("Missing values for keyframe.");
    }
}
