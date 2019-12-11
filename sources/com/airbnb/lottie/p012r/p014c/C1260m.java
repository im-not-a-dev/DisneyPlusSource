package com.airbnb.lottie.p012r.p014c;

import android.graphics.PointF;
import com.airbnb.lottie.p012r.p014c.C1247a.C1248a;
import com.airbnb.lottie.p023x.C1376a;
import java.util.Collections;

/* renamed from: com.airbnb.lottie.r.c.m */
/* compiled from: SplitDimensionPathKeyframeAnimation */
public class C1260m extends C1247a<PointF, PointF> {

    /* renamed from: l */
    private final PointF f4720l = new PointF();

    /* renamed from: m */
    private final C1247a<Float, Float> f4721m;

    /* renamed from: n */
    private final C1247a<Float, Float> f4722n;

    public C1260m(C1247a<Float, Float> aVar, C1247a<Float, Float> aVar2) {
        super(Collections.emptyList());
        this.f4721m = aVar;
        this.f4722n = aVar2;
        mo6162a(mo6168e());
    }

    /* renamed from: a */
    public void mo6162a(float f) {
        this.f4721m.mo6162a(f);
        this.f4722n.mo6162a(f);
        this.f4720l.set(((Float) this.f4721m.mo6169f()).floatValue(), ((Float) this.f4722n.mo6169f()).floatValue());
        for (int i = 0; i < this.f4695a.size(); i++) {
            ((C1248a) this.f4695a.get(i)).mo6141a();
        }
    }

    /* renamed from: f */
    public PointF m6314f() {
        return m6311a(null, 0.0f);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public PointF m6311a(C1376a<PointF> aVar, float f) {
        return this.f4720l;
    }
}
