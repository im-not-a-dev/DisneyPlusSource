package com.airbnb.lottie.p012r.p014c;

import com.airbnb.lottie.p016t.p018k.C1292c;
import com.airbnb.lottie.p023x.C1376a;
import java.util.List;

/* renamed from: com.airbnb.lottie.r.c.d */
/* compiled from: GradientColorKeyframeAnimation */
public class C1251d extends C1253f<C1292c> {

    /* renamed from: l */
    private final C1292c f4706l;

    public C1251d(List<C1376a<C1292c>> list) {
        super(list);
        int i = 0;
        C1292c cVar = (C1292c) ((C1376a) list.get(0)).f5053b;
        if (cVar != null) {
            i = cVar.mo6246c();
        }
        this.f4706l = new C1292c(new float[i], new int[i]);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public C1292c m6292a(C1376a<C1292c> aVar, float f) {
        this.f4706l.mo6243a((C1292c) aVar.f5053b, (C1292c) aVar.f5054c, f);
        return this.f4706l;
    }
}
