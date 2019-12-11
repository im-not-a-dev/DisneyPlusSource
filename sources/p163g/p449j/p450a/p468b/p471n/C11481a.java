package p163g.p449j.p450a.p468b.p471n;

import android.graphics.Canvas;
import android.os.Build.VERSION;

/* renamed from: g.j.a.b.n.a */
/* compiled from: CanvasCompat */
public class C11481a {
    /* renamed from: a */
    public static int m37050a(Canvas canvas, float f, float f2, float f3, float f4, int i) {
        if (VERSION.SDK_INT > 21) {
            return canvas.saveLayerAlpha(f, f2, f3, f4, i);
        }
        return canvas.saveLayerAlpha(f, f2, f3, f4, i, 31);
    }
}
