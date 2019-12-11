package com.airbnb.lottie.p016t.p017j;

import android.graphics.PointF;
import com.airbnb.lottie.p012r.p014c.C1247a;
import com.airbnb.lottie.p012r.p014c.C1260m;
import com.airbnb.lottie.p023x.C1376a;
import java.util.List;

/* renamed from: com.airbnb.lottie.t.j.i */
/* compiled from: AnimatableSplitDimensionPathValue */
public class C1284i implements C1288m<PointF, PointF> {

    /* renamed from: a */
    private final C1277b f4786a;

    /* renamed from: b */
    private final C1277b f4787b;

    public C1284i(C1277b bVar, C1277b bVar2) {
        this.f4786a = bVar;
        this.f4787b = bVar2;
    }

    /* renamed from: a */
    public C1247a<PointF, PointF> mo6223a() {
        return new C1260m(this.f4786a.mo6223a(), this.f4787b.mo6223a());
    }

    /* renamed from: b */
    public List<C1376a<PointF>> mo6224b() {
        throw new UnsupportedOperationException("Cannot call getKeyframes on AnimatableSplitDimensionPathValue.");
    }

    public boolean isStatic() {
        return this.f4786a.isStatic() && this.f4787b.isStatic();
    }
}
