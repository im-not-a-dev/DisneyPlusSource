package com.airbnb.lottie.p016t.p019l;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.graphics.Path;
import android.graphics.RectF;
import com.airbnb.lottie.C1191f;
import com.airbnb.lottie.C1210j;
import com.airbnb.lottie.p012r.C1222a;
import com.airbnb.lottie.p012r.p014c.C1247a;
import com.airbnb.lottie.p012r.p014c.C1263p;
import com.airbnb.lottie.p023x.C1378c;

/* renamed from: com.airbnb.lottie.t.l.g */
/* compiled from: SolidLayer */
public class C1325g extends C1314a {

    /* renamed from: A */
    private final C1320d f4990A;

    /* renamed from: B */
    private C1247a<ColorFilter, ColorFilter> f4991B;

    /* renamed from: w */
    private final RectF f4992w = new RectF();

    /* renamed from: x */
    private final Paint f4993x = new C1222a();

    /* renamed from: y */
    private final float[] f4994y = new float[8];

    /* renamed from: z */
    private final Path f4995z = new Path();

    C1325g(C1191f fVar, C1320d dVar) {
        super(fVar, dVar);
        this.f4990A = dVar;
        this.f4993x.setAlpha(0);
        this.f4993x.setStyle(Style.FILL);
        this.f4993x.setColor(dVar.mo6358m());
    }

    /* renamed from: a */
    public void mo6143a(RectF rectF, Matrix matrix, boolean z) {
        super.mo6143a(rectF, matrix, z);
        this.f4992w.set(0.0f, 0.0f, (float) this.f4990A.mo6360o(), (float) this.f4990A.mo6359n());
        this.f4931m.mapRect(this.f4992w);
        rectF.set(this.f4992w);
    }

    /* renamed from: b */
    public void mo6339b(Canvas canvas, Matrix matrix, int i) {
        int alpha = Color.alpha(this.f4990A.mo6358m());
        if (alpha != 0) {
            int intValue = (int) ((((float) i) / 255.0f) * (((((float) alpha) / 255.0f) * ((float) (this.f4939u.mo6188c() == null ? 100 : ((Integer) this.f4939u.mo6188c().mo6169f()).intValue()))) / 100.0f) * 255.0f);
            this.f4993x.setAlpha(intValue);
            C1247a<ColorFilter, ColorFilter> aVar = this.f4991B;
            if (aVar != null) {
                this.f4993x.setColorFilter((ColorFilter) aVar.mo6169f());
            }
            if (intValue > 0) {
                float[] fArr = this.f4994y;
                fArr[0] = 0.0f;
                fArr[1] = 0.0f;
                fArr[2] = (float) this.f4990A.mo6360o();
                float[] fArr2 = this.f4994y;
                fArr2[3] = 0.0f;
                fArr2[4] = (float) this.f4990A.mo6360o();
                this.f4994y[5] = (float) this.f4990A.mo6359n();
                float[] fArr3 = this.f4994y;
                fArr3[6] = 0.0f;
                fArr3[7] = (float) this.f4990A.mo6359n();
                matrix.mapPoints(this.f4994y);
                this.f4995z.reset();
                Path path = this.f4995z;
                float[] fArr4 = this.f4994y;
                path.moveTo(fArr4[0], fArr4[1]);
                Path path2 = this.f4995z;
                float[] fArr5 = this.f4994y;
                path2.lineTo(fArr5[2], fArr5[3]);
                Path path3 = this.f4995z;
                float[] fArr6 = this.f4994y;
                path3.lineTo(fArr6[4], fArr6[5]);
                Path path4 = this.f4995z;
                float[] fArr7 = this.f4994y;
                path4.lineTo(fArr7[6], fArr7[7]);
                Path path5 = this.f4995z;
                float[] fArr8 = this.f4994y;
                path5.lineTo(fArr8[0], fArr8[1]);
                this.f4995z.close();
                canvas.drawPath(this.f4995z, this.f4993x);
            }
        }
    }

    /* renamed from: a */
    public <T> void mo6145a(T t, C1378c<T> cVar) {
        super.mo6145a(t, cVar);
        if (t != C1210j.f4519B) {
            return;
        }
        if (cVar == null) {
            this.f4991B = null;
        } else {
            this.f4991B = new C1263p(cVar);
        }
    }
}
