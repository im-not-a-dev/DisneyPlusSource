package p163g.p494k.p495a.p496a;

import android.os.Looper;
import p520io.reactivex.C11968q;

/* renamed from: g.k.a.a.b */
/* compiled from: Preconditions */
public final class C11691b {
    /* renamed from: a */
    public static void m37641a(Object obj, String str) {
        if (obj == null) {
            throw new NullPointerException(str);
        }
    }

    /* renamed from: a */
    public static boolean m37642a(C11968q<?> qVar) {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            return true;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Expected to be called on the main thread but was ");
        sb.append(Thread.currentThread().getName());
        qVar.onError(new IllegalStateException(sb.toString()));
        return false;
    }
}
