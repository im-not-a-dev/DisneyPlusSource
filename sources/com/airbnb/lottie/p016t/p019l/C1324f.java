package com.airbnb.lottie.p016t.p019l;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.RectF;
import com.airbnb.lottie.C1191f;
import com.airbnb.lottie.p012r.p013b.C1228d;
import com.airbnb.lottie.p016t.C1271e;
import com.airbnb.lottie.p016t.p018k.C1306n;
import java.util.Collections;
import java.util.List;

/* renamed from: com.airbnb.lottie.t.l.f */
/* compiled from: ShapeLayer */
public class C1324f extends C1314a {

    /* renamed from: w */
    private final C1228d f4989w;

    C1324f(C1191f fVar, C1320d dVar) {
        super(fVar, dVar);
        this.f4989w = new C1228d(fVar, this, new C1306n("__container", dVar.mo6357l(), false));
        this.f4989w.mo6146a(Collections.emptyList(), Collections.emptyList());
    }

    /* renamed from: a */
    public void mo6143a(RectF rectF, Matrix matrix, boolean z) {
        super.mo6143a(rectF, matrix, z);
        this.f4989w.mo6143a(rectF, this.f4931m, z);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public void mo6339b(Canvas canvas, Matrix matrix, int i) {
        this.f4989w.mo6142a(canvas, matrix, i);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo6341b(C1271e eVar, int i, List<C1271e> list, C1271e eVar2) {
        this.f4989w.mo6144a(eVar, i, list, eVar2);
    }
}
