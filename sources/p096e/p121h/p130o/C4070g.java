package p096e.p121h.p130o;

import android.os.Build.VERSION;
import android.os.Trace;

/* renamed from: e.h.o.g */
/* compiled from: TraceCompat */
public final class C4070g {
    /* renamed from: a */
    public static void m13983a(String str) {
        if (VERSION.SDK_INT >= 18) {
            Trace.beginSection(str);
        }
    }

    /* renamed from: a */
    public static void m13982a() {
        if (VERSION.SDK_INT >= 18) {
            Trace.endSection();
        }
    }
}
