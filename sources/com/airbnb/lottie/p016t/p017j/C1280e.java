package com.airbnb.lottie.p016t.p017j;

import android.graphics.PointF;
import com.airbnb.lottie.p012r.p014c.C1247a;
import com.airbnb.lottie.p012r.p014c.C1256i;
import com.airbnb.lottie.p012r.p014c.C1257j;
import com.airbnb.lottie.p023x.C1376a;
import java.util.List;

/* renamed from: com.airbnb.lottie.t.j.e */
/* compiled from: AnimatablePathValue */
public class C1280e implements C1288m<PointF, PointF> {

    /* renamed from: a */
    private final List<C1376a<PointF>> f4785a;

    public C1280e(List<C1376a<PointF>> list) {
        this.f4785a = list;
    }

    /* renamed from: a */
    public C1247a<PointF, PointF> mo6223a() {
        if (((C1376a) this.f4785a.get(0)).mo6426g()) {
            return new C1257j(this.f4785a);
        }
        return new C1256i(this.f4785a);
    }

    /* renamed from: b */
    public List<C1376a<PointF>> mo6224b() {
        return this.f4785a;
    }

    public boolean isStatic() {
        return this.f4785a.size() == 1 && ((C1376a) this.f4785a.get(0)).mo6426g();
    }
}
