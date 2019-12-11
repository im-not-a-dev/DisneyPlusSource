package p163g.p164a.p165a;

import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

/* renamed from: g.a.a.b1 */
/* compiled from: TargetWorker */
final class C4657b1 {

    /* renamed from: a */
    private static String f11632a = null;

    /* renamed from: b */
    private static String f11633b = null;

    /* renamed from: c */
    private static final Object f11634c = new Object();

    /* renamed from: d */
    private static final Object f11635d = new Object();

    /* renamed from: e */
    private static final Object f11636e = new Object();

    /* renamed from: f */
    private static boolean f11637f = false;

    static {
        Arrays.asList(new String[]{"mbox", "parameters", "product", "order", "content", "eventTokens", "clientSideAnalyticsLoggingPayload", "errorType", "profileScriptToken", "clickToken"});
        Arrays.asList(new String[]{"mbox", "profileScriptToken", "clickToken"});
        new HashMap();
        new ArrayList();
        new HashMap();
    }

    /* renamed from: a */
    protected static String m16227a() {
        String str;
        synchronized (f11635d) {
            if (m16231b(f11633b)) {
                try {
                    f11633b = C4783y0.m16604B().getString("ADBMOBILE_TARGET_3RD_PARTY_ID", null);
                } catch (C4785b unused) {
                    C4783y0.m16636b("Target - Error retrieving shared preferences - application context is null", new Object[0]);
                    return null;
                }
            }
            str = f11633b;
        }
        return str;
    }

    /* renamed from: b */
    protected static void m16230b() {
        synchronized (f11636e) {
            if (!f11637f) {
                String a = m16228a("mboxPC");
                if (a != null) {
                    m16233d(a);
                }
                f11637f = true;
            }
        }
    }

    /* renamed from: c */
    protected static void m16232c(String str) {
        synchronized (f11635d) {
            if (str != null) {
                if (!str.isEmpty() && C4728p0.m16448H().mo16101t() == C4758r0.MOBILE_PRIVACY_STATUS_OPT_OUT) {
                    return;
                }
            }
            String a = m16227a();
            if (a == null || str == null || !a.equals(str)) {
                f11633b = str;
                try {
                    Editor C = C4783y0.m16605C();
                    if (m16231b(f11633b)) {
                        C.remove("ADBMOBILE_TARGET_3RD_PARTY_ID");
                    } else {
                        C.putString("ADBMOBILE_TARGET_3RD_PARTY_ID", f11633b);
                    }
                    C.commit();
                } catch (C4785b unused) {
                    C4783y0.m16636b("Target - Error retrieving shared preferences - application context is null", new Object[0]);
                }
            }
        }
    }

    /* renamed from: d */
    protected static void m16233d(String str) {
        synchronized (f11634c) {
            if (!m16229a(f11632a, str)) {
                f11632a = str;
                try {
                    Editor C = C4783y0.m16605C();
                    if (m16231b(f11632a)) {
                        C.remove("ADBMOBILE_TARGET_TNT_ID");
                    } else {
                        C.putString("ADBMOBILE_TARGET_TNT_ID", f11632a);
                    }
                    C.commit();
                } catch (C4785b unused) {
                    C4783y0.m16636b("Target - Error retrieving shared preferences - application context is null", new Object[0]);
                }
            }
        }
    }

    /* renamed from: b */
    private static boolean m16231b(String str) {
        return str == null || str.isEmpty();
    }

    /* renamed from: a */
    private static String m16228a(String str) {
        String str2 = "_Expires";
        String str3 = null;
        if (!(str == null || str.length() == 0)) {
            try {
                SharedPreferences B = C4783y0.m16604B();
                StringBuilder sb = new StringBuilder();
                sb.append(str);
                sb.append(str2);
                if (B.contains(sb.toString())) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(str);
                    sb2.append(str2);
                    String str4 = "_Value";
                    if (B.getLong(sb2.toString(), 0) > System.currentTimeMillis()) {
                        StringBuilder sb3 = new StringBuilder();
                        sb3.append(str);
                        sb3.append(str4);
                        String string = B.getString(sb3.toString(), "");
                        if (string.length() > 0) {
                            str3 = string;
                        }
                    }
                    Editor C = C4783y0.m16605C();
                    StringBuilder sb4 = new StringBuilder();
                    sb4.append(str);
                    sb4.append(str4);
                    C.remove(sb4.toString());
                    StringBuilder sb5 = new StringBuilder();
                    sb5.append(str);
                    sb5.append(str2);
                    C.remove(sb5.toString());
                    C.commit();
                }
            } catch (C4785b unused) {
                C4783y0.m16636b("Target - Error retrieving shared preferences - application context is null", new Object[0]);
            }
        }
        return str3;
    }

    /* renamed from: a */
    private static boolean m16229a(String str, String str2) {
        if (str == null && str2 == null) {
            return true;
        }
        if (str == null || str2 == null) {
            return false;
        }
        if (str.equals(str2)) {
            return true;
        }
        int indexOf = str.indexOf(46);
        if (indexOf != -1) {
            str = str.substring(0, indexOf);
        }
        int indexOf2 = str2.indexOf(46);
        if (indexOf2 != -1) {
            str2 = str2.substring(0, indexOf2);
        }
        return str.equals(str2);
    }
}
