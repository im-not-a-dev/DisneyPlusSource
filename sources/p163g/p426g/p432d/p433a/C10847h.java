package p163g.p426g.p432d.p433a;

import android.content.Context;

/* renamed from: g.g.d.a.h */
/* compiled from: AndroidSystemUtils */
public class C10847h {

    /* renamed from: a */
    private static String f25635a = "UNKNOWN";

    /* renamed from: b */
    private static Context f25636b;

    /* renamed from: a */
    public static void m34190a(Context context) {
        f25635a = System.getProperty("http.agent");
        if (f25636b == null) {
            f25636b = context;
        }
    }

    /* renamed from: b */
    public static String m34192b() {
        return f25635a;
    }

    /* renamed from: a */
    public static boolean m34191a(String str) {
        Context context = f25636b;
        boolean z = false;
        if (context == null) {
            return false;
        }
        if (context.checkCallingOrSelfPermission(str) == 0) {
            z = true;
        }
        return z;
    }

    /* renamed from: a */
    public static Context m34189a() {
        return f25636b;
    }
}
