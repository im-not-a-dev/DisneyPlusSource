package com.airbnb.lottie.p016t.p019l;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import com.airbnb.lottie.C1191f;
import com.airbnb.lottie.C1210j;
import com.airbnb.lottie.p012r.C1222a;
import com.airbnb.lottie.p012r.p014c.C1247a;
import com.airbnb.lottie.p012r.p014c.C1263p;
import com.airbnb.lottie.p022w.C1375f;
import com.airbnb.lottie.p023x.C1378c;

/* renamed from: com.airbnb.lottie.t.l.c */
/* compiled from: ImageLayer */
public class C1319c extends C1314a {

    /* renamed from: w */
    private final Paint f4950w = new C1222a(3);

    /* renamed from: x */
    private final Rect f4951x = new Rect();

    /* renamed from: y */
    private final Rect f4952y = new Rect();

    /* renamed from: z */
    private C1247a<ColorFilter, ColorFilter> f4953z;

    C1319c(C1191f fVar, C1320d dVar) {
        super(fVar, dVar);
    }

    /* renamed from: e */
    private Bitmap m6542e() {
        return this.f4932n.mo6055a(this.f4933o.mo6356k());
    }

    /* renamed from: a */
    public void mo6143a(RectF rectF, Matrix matrix, boolean z) {
        super.mo6143a(rectF, matrix, z);
        Bitmap e = m6542e();
        if (e != null) {
            rectF.set(0.0f, 0.0f, ((float) e.getWidth()) * C1375f.m6732a(), ((float) e.getHeight()) * C1375f.m6732a());
            this.f4931m.mapRect(rectF);
        }
    }

    /* renamed from: b */
    public void mo6339b(Canvas canvas, Matrix matrix, int i) {
        Bitmap e = m6542e();
        if (e != null && !e.isRecycled()) {
            float a = C1375f.m6732a();
            this.f4950w.setAlpha(i);
            C1247a<ColorFilter, ColorFilter> aVar = this.f4953z;
            if (aVar != null) {
                this.f4950w.setColorFilter((ColorFilter) aVar.mo6169f());
            }
            canvas.save();
            canvas.concat(matrix);
            this.f4951x.set(0, 0, e.getWidth(), e.getHeight());
            this.f4952y.set(0, 0, (int) (((float) e.getWidth()) * a), (int) (((float) e.getHeight()) * a));
            canvas.drawBitmap(e, this.f4951x, this.f4952y, this.f4950w);
            canvas.restore();
        }
    }

    /* renamed from: a */
    public <T> void mo6145a(T t, C1378c<T> cVar) {
        super.mo6145a(t, cVar);
        if (t != C1210j.f4519B) {
            return;
        }
        if (cVar == null) {
            this.f4953z = null;
        } else {
            this.f4953z = new C1263p(cVar);
        }
    }
}
