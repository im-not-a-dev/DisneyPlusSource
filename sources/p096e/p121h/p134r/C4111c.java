package p096e.p121h.p134r;

import android.os.Build.VERSION;
import java.util.Arrays;
import java.util.Objects;

/* renamed from: e.h.r.c */
/* compiled from: ObjectsCompat */
public class C4111c {
    /* renamed from: a */
    public static boolean m14086a(Object obj, Object obj2) {
        if (VERSION.SDK_INT >= 19) {
            return Objects.equals(obj, obj2);
        }
        return obj == obj2 || (obj != null && obj.equals(obj2));
    }

    /* renamed from: a */
    public static int m14085a(Object... objArr) {
        if (VERSION.SDK_INT >= 19) {
            return Objects.hash(objArr);
        }
        return Arrays.hashCode(objArr);
    }
}
