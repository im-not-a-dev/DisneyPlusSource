package p163g.p413f.p414a.p424w;

import android.annotation.TargetApi;
import android.os.Build.VERSION;
import android.os.SystemClock;

/* renamed from: g.f.a.w.f */
/* compiled from: LogTime */
public final class C10770f {

    /* renamed from: a */
    private static final double f25480a;

    static {
        double d = 1.0d;
        if (VERSION.SDK_INT >= 17) {
            d = 1.0d / Math.pow(10.0d, 6.0d);
        }
        f25480a = d;
    }

    @TargetApi(17)
    /* renamed from: a */
    public static long m33999a() {
        if (VERSION.SDK_INT >= 17) {
            return SystemClock.elapsedRealtimeNanos();
        }
        return SystemClock.uptimeMillis();
    }

    /* renamed from: a */
    public static double m33998a(long j) {
        return ((double) (m33999a() - j)) * f25480a;
    }
}
