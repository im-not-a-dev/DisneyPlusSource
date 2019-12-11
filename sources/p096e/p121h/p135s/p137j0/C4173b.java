package p096e.p121h.p135s.p137j0;

import android.os.Build.VERSION;
import android.view.animation.Interpolator;
import android.view.animation.PathInterpolator;

/* renamed from: e.h.s.j0.b */
/* compiled from: PathInterpolatorCompat */
public final class C4173b {
    /* renamed from: a */
    public static Interpolator m14300a(float f, float f2, float f3, float f4) {
        if (VERSION.SDK_INT >= 21) {
            return new PathInterpolator(f, f2, f3, f4);
        }
        return new C4172a(f, f2, f3, f4);
    }
}
