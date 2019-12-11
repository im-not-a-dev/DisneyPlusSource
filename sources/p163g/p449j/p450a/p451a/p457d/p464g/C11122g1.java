package p163g.p449j.p450a.p451a.p457d.p464g;

import android.annotation.TargetApi;
import android.content.Context;
import android.os.Build.VERSION;
import android.os.Process;
import android.os.UserManager;
import android.util.Log;

/* renamed from: g.j.a.a.d.g.g1 */
public class C11122g1 {

    /* renamed from: a */
    private static UserManager f26212a;

    /* renamed from: b */
    private static volatile boolean f26213b = (!m35237a());

    private C11122g1() {
    }

    /* renamed from: a */
    public static boolean m35237a() {
        return VERSION.SDK_INT >= 24;
    }

    @TargetApi(24)
    /* renamed from: b */
    private static boolean m35239b(Context context) {
        boolean z;
        int i = 1;
        while (true) {
            z = false;
            if (i > 2) {
                break;
            }
            if (f26212a == null) {
                f26212a = (UserManager) context.getSystemService(UserManager.class);
            }
            UserManager userManager = f26212a;
            if (userManager == null) {
                return true;
            }
            try {
                if (userManager.isUserUnlocked() || !userManager.isUserRunning(Process.myUserHandle())) {
                    z = true;
                }
            } catch (NullPointerException e) {
                Log.w("DirectBootUtils", "Failed to check if user is unlocked.", e);
                f26212a = null;
                i++;
            }
        }
        if (z) {
            f26212a = null;
        }
        return z;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0018, code lost:
        return r3;
     */
    @android.annotation.TargetApi(24)
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static boolean m35240c(android.content.Context r3) {
        /*
            boolean r0 = f26213b
            r1 = 1
            if (r0 == 0) goto L_0x0006
            return r1
        L_0x0006:
            java.lang.Class<g.j.a.a.d.g.g1> r0 = p163g.p449j.p450a.p451a.p457d.p464g.C11122g1.class
            monitor-enter(r0)
            boolean r2 = f26213b     // Catch:{ all -> 0x0019 }
            if (r2 == 0) goto L_0x000f
            monitor-exit(r0)     // Catch:{ all -> 0x0019 }
            return r1
        L_0x000f:
            boolean r3 = m35239b(r3)     // Catch:{ all -> 0x0019 }
            if (r3 == 0) goto L_0x0017
            f26213b = r3     // Catch:{ all -> 0x0019 }
        L_0x0017:
            monitor-exit(r0)     // Catch:{ all -> 0x0019 }
            return r3
        L_0x0019:
            r3 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0019 }
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: p163g.p449j.p450a.p451a.p457d.p464g.C11122g1.m35240c(android.content.Context):boolean");
    }

    /* renamed from: a */
    public static boolean m35238a(Context context) {
        return !m35237a() || m35240c(context);
    }
}
