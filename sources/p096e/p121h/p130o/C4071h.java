package p096e.p121h.p130o;

import android.content.Context;
import android.os.Build.VERSION;
import android.os.UserManager;

/* renamed from: e.h.o.h */
/* compiled from: UserManagerCompat */
public class C4071h {
    /* renamed from: a */
    public static boolean m13984a(Context context) {
        if (VERSION.SDK_INT >= 24) {
            return ((UserManager) context.getSystemService(UserManager.class)).isUserUnlocked();
        }
        return true;
    }
}
