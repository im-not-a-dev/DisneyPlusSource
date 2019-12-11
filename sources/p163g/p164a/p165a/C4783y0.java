package p163g.p164a.p165a;

import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.os.Build.VERSION;
import android.telephony.TelephonyManager;
import android.util.DisplayMetrics;
import android.util.Log;
import com.facebook.stetho.common.Utf8Charset;
import java.io.File;
import java.io.UnsupportedEncodingException;
import java.lang.ref.WeakReference;
import java.security.SecureRandom;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Map.Entry;
import java.util.UUID;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.joda.time.DateTimeConstants;
import org.json.JSONException;
import org.json.JSONObject;
import p163g.p164a.p165a.C4705m.C4710e;

/* renamed from: g.a.a.y0 */
/* compiled from: StaticMethods */
final class C4783y0 {

    /* renamed from: A */
    private static HashMap<String, Object> f11873A = null;

    /* renamed from: B */
    private static final Object f11874B = new Object();

    /* renamed from: C */
    private static String f11875C = null;

    /* renamed from: D */
    private static final Object f11876D = new Object();

    /* renamed from: E */
    private static String f11877E = null;

    /* renamed from: F */
    private static final Object f11878F = new Object();

    /* renamed from: G */
    private static String f11879G = null;

    /* renamed from: H */
    private static final Object f11880H = new Object();

    /* renamed from: I */
    private static String f11881I = null;

    /* renamed from: J */
    private static final Object f11882J = new Object();

    /* renamed from: K */
    private static ExecutorService f11883K = null;

    /* renamed from: L */
    private static final Object f11884L = new Object();

    /* renamed from: M */
    private static ExecutorService f11885M = null;

    /* renamed from: N */
    private static final Object f11886N = new Object();

    /* renamed from: O */
    private static ExecutorService f11887O = null;

    /* renamed from: P */
    private static final Object f11888P = new Object();

    /* renamed from: Q */
    private static ExecutorService f11889Q = null;

    /* renamed from: R */
    private static final Object f11890R = new Object();

    /* renamed from: S */
    private static ExecutorService f11891S = null;

    /* renamed from: T */
    private static final Object f11892T = new Object();

    /* renamed from: U */
    private static ExecutorService f11893U = null;

    /* renamed from: V */
    private static final Object f11894V = new Object();

    /* renamed from: W */
    private static String f11895W = null;

    /* renamed from: X */
    private static final Object f11896X = new Object();

    /* renamed from: Y */
    static final Map<String, String> f11897Y = new HashMap(256);

    /* renamed from: Z */
    static int f11898Z = 0;

    /* renamed from: a */
    private static final String[] f11899a = {"%00", "%01", "%02", "%03", "%04", "%05", "%06", "%07", "%08", "%09", "%0A", "%0B", "%0C", "%0D", "%0E", "%0F", "%10", "%11", "%12", "%13", "%14", "%15", "%16", "%17", "%18", "%19", "%1A", "%1B", "%1C", "%1D", "%1E", "%1F", "%20", "%21", "%22", "%23", "%24", "%25", "%26", "%27", "%28", "%29", "*", "%2B", "%2C", "-", ".", "%2F", "0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "%3A", "%3B", "%3C", "%3D", "%3E", "%3F", "%40", "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z", "%5B", "%5C", "%5D", "%5E", "_", "%60", "a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z", "%7B", "%7C", "%7D", "%7E", "%7F", "%80", "%81", "%82", "%83", "%84", "%85", "%86", "%87", "%88", "%89", "%8A", "%8B", "%8C", "%8D", "%8E", "%8F", "%90", "%91", "%92", "%93", "%94", "%95", "%96", "%97", "%98", "%99", "%9A", "%9B", "%9C", "%9D", "%9E", "%9F", "%A0", "%A1", "%A2", "%A3", "%A4", "%A5", "%A6", "%A7", "%A8", "%A9", "%AA", "%AB", "%AC", "%AD", "%AE", "%AF", "%B0", "%B1", "%B2", "%B3", "%B4", "%B5", "%B6", "%B7", "%B8", "%B9", "%BA", "%BB", "%BC", "%BD", "%BE", "%BF", "%C0", "%C1", "%C2", "%C3", "%C4", "%C5", "%C6", "%C7", "%C8", "%C9", "%CA", "%CB", "%CC", "%CD", "%CE", "%CF", "%D0", "%D1", "%D2", "%D3", "%D4", "%D5", "%D6", "%D7", "%D8", "%D9", "%DA", "%DB", "%DC", "%DD", "%DE", "%DF", "%E0", "%E1", "%E2", "%E3", "%E4", "%E5", "%E6", "%E7", "%E8", "%E9", "%EA", "%EB", "%EC", "%ED", "%EE", "%EF", "%F0", "%F1", "%F2", "%F3", "%F4", "%F5", "%F6", "%F7", "%F8", "%F9", "%FA", "%FB", "%FC", "%FD", "%FE", "%FF"};

    /* renamed from: a0 */
    private static Context f11900a0 = null;

    /* renamed from: b */
    private static final boolean[] f11901b = {false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, true, false, false, true, true, false, true, true, true, true, true, true, true, true, true, true, false, false, false, false, false, false, false, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, false, false, false, false, true, false, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false};

    /* renamed from: b0 */
    private static WeakReference<Activity> f11902b0 = null;

    /* renamed from: c */
    private static final boolean[] f11903c = {false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, true, false, true, true, true, true, true, true, true, true, true, true, false, false, false, false, false, false, false, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, false, false, false, false, true, false, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false};

    /* renamed from: c0 */
    private static final Object f11904c0 = new Object();

    /* renamed from: d */
    private static boolean f11905d;

    /* renamed from: d0 */
    private static final char[] f11906d0 = "000102030405060708090A0B0C0D0E0F101112131415161718191A1B1C1D1E1F202122232425262728292A2B2C2D2E2F303132333435363738393A3B3C3D3E3F404142434445464748494A4B4C4D4E4F505152535455565758595A5B5C5D5E5F606162636465666768696A6B6C6D6E6F707172737475767778797A7B7C7D7E7F808182838485868788898A8B8C8D8E8F909192939495969798999A9B9C9D9E9FA0A1A2A3A4A5A6A7A8A9AAABACADAEAFB0B1B2B3B4B5B6B7B8B9BABBBCBDBEBFC0C1C2C3C4C5C6C7C8C9CACBCCCDCECFD0D1D2D3D4D5D6D7D8D9DADBDCDDDEDFE0E1E2E3E4E5E6E7E8E9EAEBECEDEEEFF0F1F2F3F4F5F6F7F8F9FAFBFCFDFEFF".toCharArray();

    /* renamed from: e */
    private static C4710e f11907e = C4710e.APPLICATION_TYPE_HANDHELD;

    /* renamed from: f */
    private static boolean f11908f = false;

    /* renamed from: g */
    private static SharedPreferences f11909g = null;

    /* renamed from: h */
    private static final Object f11910h = new Object();

    /* renamed from: i */
    private static String f11911i = null;

    /* renamed from: j */
    private static final Object f11912j = new Object();

    /* renamed from: k */
    private static String f11913k = null;

    /* renamed from: l */
    private static final Object f11914l = new Object();

    /* renamed from: m */
    private static String f11915m = null;

    /* renamed from: n */
    private static final Object f11916n = new Object();

    /* renamed from: o */
    private static int f11917o = -1;

    /* renamed from: p */
    private static final Object f11918p = new Object();

    /* renamed from: q */
    private static String f11919q = null;

    /* renamed from: r */
    private static final Object f11920r = new Object();

    /* renamed from: s */
    private static final Object f11921s = new Object();

    /* renamed from: t */
    private static final Object f11922t = new Object();

    /* renamed from: u */
    private static String f11923u = null;

    /* renamed from: v */
    private static final Object f11924v = new Object();

    /* renamed from: w */
    private static String f11925w = null;

    /* renamed from: x */
    private static final Object f11926x = new Object();

    /* renamed from: y */
    private static String f11927y = null;

    /* renamed from: z */
    private static final Object f11928z = new Object();

    /* renamed from: g.a.a.y0$a */
    /* compiled from: StaticMethods */
    protected static class C4784a extends Exception {
        public C4784a(String str) {
            super(str);
        }
    }

    /* renamed from: g.a.a.y0$b */
    /* compiled from: StaticMethods */
    protected static class C4785b extends Exception {
        public C4785b(String str) {
            super(str);
        }
    }

    static {
        "0123456789abcdef".toCharArray();
    }

    /* renamed from: A */
    protected static Context m16603A() throws C4785b {
        Context context = f11900a0;
        if (context != null) {
            return context;
        }
        throw new C4785b("Config - No Application Context (Application context must be set prior to calling any library functions.)");
    }

    /* renamed from: B */
    protected static SharedPreferences m16604B() throws C4785b {
        SharedPreferences sharedPreferences;
        synchronized (f11910h) {
            if (f11909g == null) {
                f11909g = m16603A().getSharedPreferences("APP_MEASUREMENT_CACHE", 0);
                if (f11909g == null) {
                    m16640c("Config - No SharedPreferences available", new Object[0]);
                }
            }
            if (f11909g != null) {
                sharedPreferences = f11909g;
            } else {
                throw new C4785b("Config - No SharedPreferences available");
            }
        }
        return sharedPreferences;
    }

    /* renamed from: C */
    protected static Editor m16605C() throws C4785b {
        Editor edit = m16604B().edit();
        if (edit != null) {
            return edit;
        }
        throw new C4785b("Config - Unable to create an instance of a SharedPreferences Editor");
    }

    /* renamed from: D */
    protected static ExecutorService m16606D() {
        ExecutorService executorService;
        synchronized (f11888P) {
            if (f11887O == null) {
                f11887O = Executors.newSingleThreadExecutor();
            }
            executorService = f11887O;
        }
        return executorService;
    }

    /* renamed from: E */
    protected static long m16607E() {
        return System.currentTimeMillis() / 1000;
    }

    /* renamed from: F */
    protected static long m16608F() {
        long E = m16607E() - C4727p.f11754a;
        if (E < 604800) {
            return E;
        }
        return 0;
    }

    /* renamed from: G */
    protected static String m16609G() {
        String str;
        synchronized (f11882J) {
            if (f11881I == null) {
                Date date = new Date();
                Calendar instance = Calendar.getInstance();
                instance.setTime(date);
                StringBuilder sb = new StringBuilder();
                sb.append("00/00/0000 00:00:00 0 ");
                sb.append((instance.getTimeZone().getOffset(1, instance.get(1), instance.get(2), instance.get(5), instance.get(7), (((((instance.get(11) * 60) + instance.get(12)) * 60) + instance.get(13)) * 1000) + instance.get(14)) / DateTimeConstants.MILLIS_PER_MINUTE) * -1);
                f11881I = sb.toString();
            }
            str = f11881I;
        }
        return str;
    }

    /* renamed from: H */
    protected static String m16610H() {
        String str;
        synchronized (f11920r) {
            if (f11919q == null) {
                try {
                    f11919q = m16604B().getString("APP_MEASUREMENT_VISITOR_ID", null);
                } catch (C4785b e) {
                    m16636b("Config - Unable to pull visitorID from shared preferences. (%s)", e.getMessage());
                }
            }
            str = f11919q;
        }
        return str;
    }

    /* renamed from: I */
    protected static boolean m16611I() {
        return f11908f;
    }

    /* renamed from: J */
    protected static void m16612J() {
        synchronized (f11896X) {
            f11895W = null;
            try {
                Editor edit = m16604B().edit();
                edit.remove("ADOBEMOBILE_STOREDDEFAULTS_AID");
                edit.remove("ADOBEMOBILE_STOREDDEFAULTS_IGNORE_AID");
                edit.remove("ADOBEMOBILE_STOREDDEFAULTS_AID_SYNCED");
                edit.apply();
            } catch (C4785b unused) {
                m16640c("Config - Failed to purge AID (application context is null)", new Object[0]);
            }
        }
    }

    /* renamed from: K */
    protected static void m16613K() {
        synchronized (f11926x) {
            f11925w = null;
            C4684g1.m16305a((String) null);
        }
    }

    /* renamed from: L */
    protected static void m16614L() {
        synchronized (f11924v) {
            m16637b(false);
            f11923u = null;
            try {
                Editor C = m16605C();
                C.remove("ADBMOBILE_KEY_PUSH_TOKEN");
                C.commit();
            } catch (C4785b e) {
                m16636b("Config - Failed to remove push identifier from shared preferences. (%s)", e.getMessage());
            }
        }
    }

    /* renamed from: M */
    protected static void m16615M() {
        synchronized (f11921s) {
            f11919q = null;
            C4684g1.m16313b(null);
            try {
                Editor C = m16605C();
                C.remove("APP_MEASUREMENT_VISITOR_ID");
                C.commit();
            } catch (C4785b e) {
                m16636b("Config - Error purging visitorID. (%s)", e.getMessage());
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:21:0x009c A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x009d  */
    /* renamed from: N */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.lang.String m16616N() {
        /*
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r1 = 64
            r0.<init>(r1)
            g.a.a.p0 r1 = p163g.p164a.p165a.C4728p0.m16448H()
            boolean r1 = r1.mo16104w()
            if (r1 == 0) goto L_0x0014
            java.lang.String r1 = "https"
            goto L_0x0016
        L_0x0014:
            java.lang.String r1 = "http"
        L_0x0016:
            r0.append(r1)
            java.lang.String r1 = "://"
            r0.append(r1)
            g.a.a.p0 r1 = p163g.p164a.p165a.C4728p0.m16448H()
            java.lang.String r1 = r1.mo16105x()
            r0.append(r1)
            java.lang.String r1 = "/id"
            r0.append(r1)
            g.a.a.p0 r1 = p163g.p164a.p165a.C4728p0.m16448H()
            boolean r1 = r1.mo16106y()
            if (r1 == 0) goto L_0x0043
            g.a.a.f1 r2 = p163g.p164a.p165a.C4673f1.m16289k()
            java.lang.String r2 = r2.mo16010b()
            r0.append(r2)
        L_0x0043:
            r2 = 1
            java.lang.Object[] r3 = new java.lang.Object[r2]
            r4 = 0
            r3[r4] = r0
            java.lang.String r5 = "Analytics ID - Sending Analytics ID call(%s)"
            m16630a(r5, r3)
            java.lang.String r0 = r0.toString()
            r3 = 500(0x1f4, float:7.0E-43)
            r5 = 0
            java.lang.String r6 = "Analytics ID"
            byte[] r0 = p163g.p164a.p165a.C4779x0.m16599a(r0, r5, r3, r6)
            if (r0 == 0) goto L_0x008f
            org.json.JSONObject r3 = new org.json.JSONObject     // Catch:{ UnsupportedEncodingException -> 0x0081, JSONException -> 0x0070 }
            java.lang.String r6 = new java.lang.String     // Catch:{ UnsupportedEncodingException -> 0x0081, JSONException -> 0x0070 }
            java.lang.String r7 = "UTF-8"
            r6.<init>(r0, r7)     // Catch:{ UnsupportedEncodingException -> 0x0081, JSONException -> 0x0070 }
            r3.<init>(r6)     // Catch:{ UnsupportedEncodingException -> 0x0081, JSONException -> 0x0070 }
            java.lang.String r0 = "id"
            java.lang.String r0 = r3.getString(r0)     // Catch:{ UnsupportedEncodingException -> 0x0081, JSONException -> 0x0070 }
            goto L_0x0090
        L_0x0070:
            r0 = move-exception
            if (r1 != 0) goto L_0x008f
            java.lang.Object[] r2 = new java.lang.Object[r2]
            java.lang.String r0 = r0.getLocalizedMessage()
            r2[r4] = r0
            java.lang.String r0 = "Analytics ID - Unable to parse /id response(%s)"
            m16636b(r0, r2)
            goto L_0x008f
        L_0x0081:
            r0 = move-exception
            java.lang.Object[] r2 = new java.lang.Object[r2]
            java.lang.String r0 = r0.getLocalizedMessage()
            r2[r4] = r0
            java.lang.String r0 = "Analytics ID - Unable to decode /id response(%s)"
            m16636b(r0, r2)
        L_0x008f:
            r0 = r5
        L_0x0090:
            if (r0 == 0) goto L_0x009a
            int r2 = r0.length()
            r3 = 33
            if (r2 == r3) goto L_0x00a1
        L_0x009a:
            if (r1 == 0) goto L_0x009d
            return r5
        L_0x009d:
            java.lang.String r0 = m16617a()
        L_0x00a1:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p163g.p164a.p165a.C4783y0.m16616N():java.lang.String");
    }

    /* renamed from: a */
    private static String m16617a() {
        String str = "-";
        String upperCase = UUID.randomUUID().toString().replace(str, "").toUpperCase(Locale.US);
        Pattern compile = Pattern.compile("^[89A-F]");
        Pattern compile2 = Pattern.compile("^[4-9A-F]");
        Matcher matcher = compile.matcher(upperCase.substring(0, 16));
        Matcher matcher2 = compile2.matcher(upperCase.substring(16, 32));
        SecureRandom secureRandom = new SecureRandom();
        String replaceAll = matcher.replaceAll(String.valueOf(secureRandom.nextInt(7)));
        String replaceAll2 = matcher2.replaceAll(String.valueOf(secureRandom.nextInt(3)));
        StringBuilder sb = new StringBuilder();
        sb.append(replaceAll);
        sb.append(str);
        sb.append(replaceAll2);
        return sb.toString();
    }

    /* renamed from: b */
    protected static void m16637b(boolean z) {
        synchronized (f11922t) {
            try {
                Editor C = m16605C();
                C.putBoolean("ADBMOBILE_KEY_PUSH_ENABLED", z);
                C.commit();
                C4684g1.m16308a(z);
            } catch (C4785b e) {
                m16636b("Config - Unable to set pushEnabled shared preferences. (%s)", e.getMessage());
            }
        }
    }

    /* renamed from: c */
    protected static String m16638c() {
        String str;
        synchronized (f11926x) {
            str = f11925w;
        }
        return str;
    }

    /* renamed from: d */
    protected static ExecutorService m16642d() {
        ExecutorService executorService;
        synchronized (f11884L) {
            if (f11883K == null) {
                f11883K = Executors.newSingleThreadExecutor();
            }
            executorService = f11883K;
        }
        return executorService;
    }

    /* renamed from: e */
    private static String m16643e() {
        return VERSION.RELEASE;
    }

    /* renamed from: f */
    protected static String m16645f() {
        String str;
        String str2;
        synchronized (f11912j) {
            if (f11911i == null) {
                StringBuilder sb = new StringBuilder();
                sb.append(m16647g() != null ? m16647g() : "");
                if (m16648h() == null || m16648h().length() <= 0) {
                    str2 = "";
                } else {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(" ");
                    sb2.append(m16648h());
                    sb2.append(" ");
                    str2 = sb2.toString();
                }
                sb.append(str2);
                sb.append(m16649i() != 0 ? String.format(Locale.US, "(%d)", new Object[]{Integer.valueOf(m16649i())}) : "");
                f11911i = sb.toString();
                try {
                    Editor C = m16605C();
                    C.putString("ADOBEMOBILE_STOREDDEFAULTS_APPID", f11911i);
                    C.commit();
                } catch (C4785b e) {
                    m16640c("Config - Unable to set Application ID in preferences (%s)", e.getLocalizedMessage());
                }
            }
            str = f11911i;
        }
        return str;
    }

    /* renamed from: g */
    private static String m16647g() {
        String str;
        synchronized (f11914l) {
            if (f11913k == null) {
                f11913k = "";
                try {
                    PackageManager packageManager = m16603A().getPackageManager();
                    if (packageManager != null) {
                        ApplicationInfo applicationInfo = packageManager.getApplicationInfo(m16603A().getPackageName(), 0);
                        if (applicationInfo != null) {
                            f11913k = packageManager.getApplicationLabel(applicationInfo) != null ? (String) packageManager.getApplicationLabel(applicationInfo) : "";
                        } else {
                            m16640c("Analytics - ApplicationInfo was null", new Object[0]);
                            f11913k = "";
                        }
                    } else {
                        m16640c("Analytics - PackageManager was null", new Object[0]);
                        f11913k = "";
                    }
                } catch (NameNotFoundException e) {
                    m16640c("Analytics - PackageManager couldn't find application name (%s)", e.toString());
                    f11913k = "";
                } catch (C4785b e2) {
                    m16636b("Config - Unable to get package to pull application name. (%s)", e2.getMessage());
                    f11913k = "";
                }
            }
            str = f11913k;
        }
        return str;
    }

    /* renamed from: h */
    protected static String m16648h() {
        String str;
        synchronized (f11916n) {
            if (f11915m == null) {
                f11915m = "";
                try {
                    PackageManager packageManager = m16603A().getPackageManager();
                    if (packageManager != null) {
                        PackageInfo packageInfo = packageManager.getPackageInfo(m16603A().getPackageName(), 0);
                        if (packageInfo != null) {
                            f11915m = packageInfo.versionName != null ? packageInfo.versionName : "";
                        } else {
                            m16640c("Analytics - PackageInfo was null", new Object[0]);
                            f11915m = "";
                        }
                    } else {
                        m16640c("Analytics - PackageManager was null", new Object[0]);
                        f11915m = "";
                    }
                } catch (NameNotFoundException e) {
                    m16640c("Analytics - PackageManager couldn't find application version (%s)", e.toString());
                    f11915m = "";
                } catch (C4785b e2) {
                    m16636b("Config - Unable to get package to pull application version. (%s)", e2.getMessage());
                    f11915m = "";
                }
            }
            str = f11915m;
        }
        return str;
    }

    /* renamed from: i */
    protected static int m16649i() {
        int i;
        synchronized (f11918p) {
            if (f11917o == -1) {
                try {
                    PackageManager packageManager = m16603A().getPackageManager();
                    if (packageManager != null) {
                        PackageInfo packageInfo = packageManager.getPackageInfo(m16603A().getPackageName(), 0);
                        if (packageInfo != null) {
                            f11917o = packageInfo.versionCode > 0 ? packageInfo.versionCode : 0;
                        } else {
                            m16640c("Analytics - PackageInfo was null", new Object[0]);
                            f11917o = 0;
                        }
                    } else {
                        m16640c("Analytics - PackageManager was null", new Object[0]);
                        f11917o = 0;
                    }
                } catch (NameNotFoundException e) {
                    m16640c("Analytics - PackageManager couldn't find application version code (%s)", e.toString());
                    f11917o = 0;
                } catch (C4785b e2) {
                    m16636b("Config - Unable to get package to pull application version code. (%s)", e2.getMessage());
                    f11917o = 0;
                }
            }
            i = f11917o;
        }
        return i;
    }

    /* renamed from: j */
    protected static ExecutorService m16650j() {
        ExecutorService executorService;
        synchronized (f11892T) {
            if (f11891S == null) {
                f11891S = Executors.newSingleThreadExecutor();
            }
            executorService = f11891S;
        }
        return executorService;
    }

    /* renamed from: k */
    protected static File m16651k() {
        try {
            return m16603A().getCacheDir();
        } catch (C4785b e) {
            m16636b("Config - Error getting cache directory. (%s)", e.getMessage());
            return null;
        }
    }

    /* renamed from: l */
    protected static String m16652l() {
        String str;
        synchronized (f11878F) {
            if (f11877E == null) {
                try {
                    f11877E = ((TelephonyManager) m16603A().getSystemService("phone")).getNetworkOperatorName();
                } catch (C4785b e) {
                    m16636b("Config - Error getting device carrier. (%s)", e.getMessage());
                }
            }
            str = f11877E;
        }
        return str;
    }

    /* renamed from: m */
    protected static Activity m16653m() throws C4784a {
        Activity activity;
        synchronized (f11904c0) {
            if (f11902b0 == null || f11902b0.get() == null) {
                throw new C4784a("Message - No Current Activity (Messages must have a reference to the current activity to work properly)");
            }
            activity = (Activity) f11902b0.get();
        }
        return activity;
    }

    /* renamed from: n */
    protected static int m16654n() {
        try {
            return m16653m().getResources().getConfiguration().orientation;
        } catch (C4784a unused) {
            return -1;
        }
    }

    /* renamed from: o */
    protected static boolean m16655o() {
        return f11905d;
    }

    /* renamed from: p */
    protected static String m16656p() {
        try {
            Resources resources = m16603A().getResources();
            if (resources == null) {
                return null;
            }
            Configuration configuration = resources.getConfiguration();
            if (configuration == null) {
                return null;
            }
            Locale locale = configuration.locale;
            if (locale == null) {
                return null;
            }
            return locale.toString().replace('_', '-');
        } catch (C4785b e) {
            m16636b("Config - Error getting application resources for default accepted language. (%s)", e.getMessage());
            return null;
        }
    }

    /* renamed from: q */
    protected static HashMap<String, Object> m16657q() {
        HashMap<String, Object> hashMap;
        synchronized (f11874B) {
            if (f11873A == null) {
                f11873A = new HashMap<>();
                f11873A.put("a.DeviceName", Build.MODEL);
                f11873A.put("a.Resolution", m16666z());
                f11873A.put("a.OSVersion", m16663w());
                f11873A.put("a.CarrierName", m16652l());
                f11873A.put("a.AppID", m16645f());
                f11873A.put("a.RunMode", m16611I() ? "Extension" : "Application");
            }
            hashMap = f11873A;
        }
        return hashMap;
    }

    /* renamed from: r */
    protected static String m16658r() {
        String str;
        synchronized (f11928z) {
            if (f11927y == null) {
                StringBuilder sb = new StringBuilder();
                sb.append("Mozilla/5.0 (Linux; U; Android ");
                sb.append(m16643e());
                sb.append("; ");
                sb.append(m16656p());
                sb.append("; ");
                sb.append(Build.MODEL);
                sb.append(" Build/");
                sb.append(Build.ID);
                sb.append(")");
                f11927y = sb.toString();
            }
            str = f11927y;
        }
        return str;
    }

    /* renamed from: s */
    private static Locale m16659s() {
        try {
            Resources resources = m16603A().getResources();
            if (resources == null) {
                return Locale.US;
            }
            Configuration configuration = resources.getConfiguration();
            if (configuration == null) {
                return Locale.US;
            }
            Locale locale = configuration.locale;
            if (locale == null) {
                locale = Locale.US;
            }
            return locale;
        } catch (C4785b e) {
            m16636b("Config - Error getting application resources for device locale. (%s)", e.getMessage());
            return Locale.US;
        }
    }

    /* renamed from: t */
    protected static String m16660t() {
        return m16621a(new Date());
    }

    /* renamed from: u */
    protected static ExecutorService m16661u() {
        ExecutorService executorService;
        synchronized (f11890R) {
            if (f11889Q == null) {
                f11889Q = Executors.newSingleThreadExecutor();
            }
            executorService = f11889Q;
        }
        return executorService;
    }

    /* renamed from: v */
    protected static ExecutorService m16662v() {
        ExecutorService executorService;
        synchronized (f11886N) {
            if (f11885M == null) {
                f11885M = Executors.newSingleThreadExecutor();
            }
            executorService = f11885M;
        }
        return executorService;
    }

    /* renamed from: w */
    protected static String m16663w() {
        String str;
        synchronized (f11880H) {
            if (f11879G == null) {
                StringBuilder sb = new StringBuilder();
                sb.append("Android ");
                sb.append(m16643e());
                f11879G = sb.toString();
                try {
                    Editor C = m16605C();
                    C.putString("ADOBEMOBILE_STOREDDEFAULTS_OS", f11879G);
                    C.commit();
                } catch (C4785b e) {
                    m16640c("Config - Unable to set OS version in preferences (%s)", e.getLocalizedMessage());
                }
            }
            str = f11879G;
        }
        return str;
    }

    /* renamed from: x */
    protected static ExecutorService m16664x() {
        ExecutorService executorService;
        synchronized (f11894V) {
            if (f11893U == null) {
                f11893U = Executors.newSingleThreadExecutor();
            }
            executorService = f11893U;
        }
        return executorService;
    }

    /* renamed from: y */
    protected static String m16665y() {
        String str;
        synchronized (f11924v) {
            str = f11923u;
        }
        return str;
    }

    /* renamed from: z */
    protected static String m16666z() {
        String str;
        synchronized (f11876D) {
            if (f11875C == null) {
                try {
                    DisplayMetrics displayMetrics = m16603A().getResources().getDisplayMetrics();
                    StringBuilder sb = new StringBuilder();
                    sb.append(displayMetrics.widthPixels);
                    sb.append("x");
                    sb.append(displayMetrics.heightPixels);
                    f11875C = sb.toString();
                } catch (C4785b e) {
                    m16636b("Config - Error getting device resolution. (%s)", e.getMessage());
                }
            }
            str = f11875C;
        }
        return str;
    }

    /* renamed from: e */
    static boolean m16644e(String str) {
        return str == null || str.isEmpty();
    }

    /* renamed from: c */
    protected static void m16640c(String str, Object... objArr) {
        if (m16655o()) {
            String str2 = "ADBMobile Warning : ";
            String str3 = "ADBMobile";
            if (objArr == null || objArr.length <= 0) {
                StringBuilder sb = new StringBuilder();
                sb.append(str2);
                sb.append(str);
                Log.w(str3, sb.toString());
                return;
            }
            StringBuilder sb2 = new StringBuilder();
            sb2.append(str2);
            sb2.append(str);
            Log.w(str3, String.format(sb2.toString(), objArr));
        }
    }

    /* renamed from: d */
    protected static String m16641d(String str) {
        String str2;
        if (str == null || str.length() <= 0 || str.length() % 2 != 0) {
            return null;
        }
        int length = str.length();
        byte[] bArr = new byte[(length / 2)];
        for (int i = 0; i < length; i += 2) {
            bArr[i / 2] = (byte) ((Character.digit(str.charAt(i), 16) << 4) + Character.digit(str.charAt(i + 1), 16));
        }
        try {
            str2 = new String(bArr, Utf8Charset.NAME);
        } catch (UnsupportedEncodingException e) {
            m16630a("Failed to get string from hex (%s)", e.getMessage());
            str2 = null;
        }
        return str2;
    }

    /* renamed from: b */
    protected static String m16634b() {
        if (!C4728p0.m16448H().mo16071B() || C4728p0.m16448H().mo16101t() == C4758r0.MOBILE_PRIVACY_STATUS_OPT_OUT) {
            return null;
        }
        synchronized (f11896X) {
            if (f11895W == null || f11895W.isEmpty()) {
                try {
                    boolean z = m16604B().getBoolean("ADOBEMOBILE_STOREDDEFAULTS_IGNORE_AID", false);
                    f11895W = m16604B().getString("ADOBEMOBILE_STOREDDEFAULTS_AID", null);
                    if ((!z && f11895W == null) || (!C4728p0.m16448H().mo16106y() && z)) {
                        f11895W = m16616N();
                        Editor C = m16605C();
                        if (f11895W != null) {
                            C.putString("ADOBEMOBILE_STOREDDEFAULTS_AID", f11895W);
                            C.putBoolean("ADOBEMOBILE_STOREDDEFAULTS_IGNORE_AID", false);
                        } else {
                            C.putBoolean("ADOBEMOBILE_STOREDDEFAULTS_IGNORE_AID", true);
                        }
                        C.commit();
                        m16646f(f11895W);
                    }
                } catch (C4785b e) {
                    m16636b("Config - Error getting AID. (%s)", e.getMessage());
                }
            }
        }
        return f11895W;
    }

    /* renamed from: c */
    protected static String m16639c(String str) {
        if (str != null && str.length() > 0) {
            int i = 0;
            try {
                byte[] bytes = str.getBytes(Utf8Charset.NAME);
                int length = bytes.length;
                char[] cArr = new char[(length << 1)];
                int i2 = 0;
                while (i < length) {
                    int i3 = i + 1;
                    int i4 = (bytes[i] & 255) << 1;
                    int i5 = i2 + 1;
                    char[] cArr2 = f11906d0;
                    int i6 = i4 + 1;
                    cArr[i2] = cArr2[i4];
                    i2 = i5 + 1;
                    cArr[i5] = cArr2[i6];
                    i = i3;
                }
                return new String(cArr);
            } catch (UnsupportedEncodingException e) {
                m16630a("Failed to get hex from string (%s)", e.getMessage());
            }
        }
        return null;
    }

    /* renamed from: a */
    protected static void m16632a(boolean z) {
        f11905d = z;
    }

    /* renamed from: a */
    protected static void m16626a(C4710e eVar) {
        f11907e = eVar;
        f11908f = f11907e == C4710e.APPLICATION_TYPE_WEARABLE;
    }

    /* renamed from: f */
    private static void m16646f(String str) {
        boolean z;
        String str2 = "ADOBEMOBILE_STOREDDEFAULTS_AID_SYNCED";
        if (str != null && C4728p0.m16448H().mo16106y()) {
            try {
                z = m16604B().getBoolean(str2, false);
            } catch (C4785b e) {
                m16640c("Visitor ID - Null context when attempting to determine visitor ID sync status (%s)", e.getLocalizedMessage());
                z = false;
            }
            if (!z) {
                HashMap hashMap = new HashMap();
                hashMap.put("AVID", str);
                C4673f1.m16289k().mo16008a((Map<String, String>) hashMap);
                try {
                    Editor C = m16605C();
                    C.putBoolean(str2, true);
                    C.commit();
                } catch (C4785b e2) {
                    m16640c("Visitor ID - Null context when attempting to persist visitor ID sync status (%s)", e2.getLocalizedMessage());
                }
            }
        }
    }

    /* renamed from: a */
    protected static void m16631a(Map<String, Object> map, StringBuilder sb) {
        if (map != null) {
            for (Entry entry : map.entrySet()) {
                String a = m16619a((String) entry.getKey());
                if (a != null) {
                    Object value = entry.getValue();
                    if (value instanceof C4713n) {
                        C4713n nVar = (C4713n) value;
                        Object obj = nVar.f11719a;
                        if (obj != null) {
                            m16629a(a, obj, sb);
                        }
                        HashMap<String, Object> hashMap = nVar.f11720b;
                        if (hashMap != null && hashMap.size() > 0) {
                            sb.append("&");
                            sb.append(a);
                            sb.append(".");
                            m16631a((Map<String, Object>) nVar.f11720b, sb);
                            sb.append("&.");
                            sb.append(a);
                        }
                    } else {
                        m16629a(a, value, sb);
                    }
                }
            }
        }
    }

    /* renamed from: b */
    protected static void m16636b(String str, Object... objArr) {
        String str2 = "ADBMobile Error : ";
        String str3 = "ADBMobile";
        if (objArr == null || objArr.length <= 0) {
            StringBuilder sb = new StringBuilder();
            sb.append(str2);
            sb.append(str);
            Log.e(str3, sb.toString());
            return;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str2);
        sb2.append(str);
        Log.e(str3, String.format(sb2.toString(), objArr));
    }

    /* renamed from: a */
    private static void m16629a(String str, Object obj, StringBuilder sb) {
        if (str != null && obj != null && !(obj instanceof C4713n) && str.length() > 0 && (!(obj instanceof String) || ((String) obj).length() > 0)) {
            sb.append("&");
            sb.append(str);
            sb.append("=");
            if (obj instanceof List) {
                sb.append(m16619a(m16618a((Iterable<?>) (List) obj, ",")));
            } else {
                sb.append(m16619a(obj.toString()));
            }
        }
    }

    /* renamed from: b */
    protected static C4713n m16633b(Map<String, Object> map) {
        C4713n nVar = new C4713n();
        for (Entry entry : m16623a(map).entrySet()) {
            String str = (String) entry.getKey();
            ArrayList arrayList = new ArrayList();
            int i = 0;
            while (true) {
                int indexOf = str.indexOf(46, i);
                if (indexOf < 0) {
                    break;
                }
                arrayList.add(str.substring(i, indexOf));
                i = indexOf + 1;
            }
            arrayList.add(str.substring(i, str.length()));
            m16628a(entry.getValue(), nVar, arrayList, 0);
        }
        return nVar;
    }

    /* renamed from: a */
    protected static String m16618a(Iterable<?> iterable, String str) {
        StringBuilder sb = new StringBuilder();
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            sb.append(it.next());
            if (!it.hasNext()) {
                break;
            }
            sb.append(str);
        }
        return sb.toString();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:?, code lost:
        r3 = r12.getBytes(com.facebook.stetho.common.Utf8Charset.NAME);
        r4 = new byte[r3.length];
        r5 = r3.length;
        r6 = 0;
        r7 = 0;
        r8 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0025, code lost:
        if (r6 >= r5) goto L_0x003f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0027, code lost:
        r10 = r3[r6];
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0029, code lost:
        if (r10 != 46) goto L_0x002e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x002b, code lost:
        if (r8 != 46) goto L_0x002e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0034, code lost:
        if (f11903c[r10 & 255] == false) goto L_0x003c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0036, code lost:
        r8 = r7 + 1;
        r4[r7] = r10;
        r7 = r8;
        r8 = r10;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x003c, code lost:
        r6 = r6 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x003f, code lost:
        if (r7 != 0) goto L_0x0042;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0041, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0044, code lost:
        if (r4[0] != 46) goto L_0x0048;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0046, code lost:
        r3 = 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0048, code lost:
        r3 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x004d, code lost:
        if (r4[r7 - 1] != 46) goto L_0x0051;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x004f, code lost:
        r5 = 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0051, code lost:
        r5 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0052, code lost:
        r7 = (r7 - r5) - r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x0054, code lost:
        if (r7 > 0) goto L_0x0057;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x0056, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x0057, code lost:
        r5 = new java.lang.String(r4, r3, r7, com.facebook.stetho.common.Utf8Charset.NAME);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x005e, code lost:
        r3 = f11897Y;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x0060, code lost:
        monitor-enter(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x0065, code lost:
        if (f11898Z <= 250) goto L_0x006e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x0067, code lost:
        f11897Y.clear();
        f11898Z = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x006e, code lost:
        f11897Y.put(r12, r5);
        f11898Z++;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x0078, code lost:
        monitor-exit(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x0079, code lost:
        return r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x007d, code lost:
        r12 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x007e, code lost:
        m16636b("Analytics - Unable to clean context data key (%s)", r12.getLocalizedMessage());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x008b, code lost:
        return null;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    protected static java.lang.String m16635b(java.lang.String r12) {
        /*
            r0 = 0
            if (r12 != 0) goto L_0x0004
            return r0
        L_0x0004:
            java.util.Map<java.lang.String, java.lang.String> r1 = f11897Y
            monitor-enter(r1)
            java.util.Map<java.lang.String, java.lang.String> r2 = f11897Y     // Catch:{ all -> 0x008c }
            java.lang.Object r2 = r2.get(r12)     // Catch:{ all -> 0x008c }
            java.lang.String r2 = (java.lang.String) r2     // Catch:{ all -> 0x008c }
            if (r2 == 0) goto L_0x0013
            monitor-exit(r1)     // Catch:{ all -> 0x008c }
            return r2
        L_0x0013:
            monitor-exit(r1)     // Catch:{ all -> 0x008c }
            r1 = 1
            r2 = 0
            java.lang.String r3 = "UTF-8"
            byte[] r3 = r12.getBytes(r3)     // Catch:{ UnsupportedEncodingException -> 0x007d }
            int r4 = r3.length     // Catch:{ UnsupportedEncodingException -> 0x007d }
            byte[] r4 = new byte[r4]     // Catch:{ UnsupportedEncodingException -> 0x007d }
            int r5 = r3.length     // Catch:{ UnsupportedEncodingException -> 0x007d }
            r6 = 0
            r7 = 0
            r8 = 0
        L_0x0023:
            r9 = 46
            if (r6 >= r5) goto L_0x003f
            byte r10 = r3[r6]     // Catch:{ UnsupportedEncodingException -> 0x007d }
            if (r10 != r9) goto L_0x002e
            if (r8 != r9) goto L_0x002e
            goto L_0x003c
        L_0x002e:
            boolean[] r9 = f11903c     // Catch:{ UnsupportedEncodingException -> 0x007d }
            r11 = r10 & 255(0xff, float:3.57E-43)
            boolean r9 = r9[r11]     // Catch:{ UnsupportedEncodingException -> 0x007d }
            if (r9 == 0) goto L_0x003c
            int r8 = r7 + 1
            r4[r7] = r10     // Catch:{ UnsupportedEncodingException -> 0x007d }
            r7 = r8
            r8 = r10
        L_0x003c:
            int r6 = r6 + 1
            goto L_0x0023
        L_0x003f:
            if (r7 != 0) goto L_0x0042
            return r0
        L_0x0042:
            byte r3 = r4[r2]     // Catch:{ UnsupportedEncodingException -> 0x007d }
            if (r3 != r9) goto L_0x0048
            r3 = 1
            goto L_0x0049
        L_0x0048:
            r3 = 0
        L_0x0049:
            int r5 = r7 + -1
            byte r5 = r4[r5]     // Catch:{ UnsupportedEncodingException -> 0x007d }
            if (r5 != r9) goto L_0x0051
            r5 = 1
            goto L_0x0052
        L_0x0051:
            r5 = 0
        L_0x0052:
            int r7 = r7 - r5
            int r7 = r7 - r3
            if (r7 > 0) goto L_0x0057
            return r0
        L_0x0057:
            java.lang.String r5 = new java.lang.String     // Catch:{ UnsupportedEncodingException -> 0x007d }
            java.lang.String r6 = "UTF-8"
            r5.<init>(r4, r3, r7, r6)     // Catch:{ UnsupportedEncodingException -> 0x007d }
            java.util.Map<java.lang.String, java.lang.String> r3 = f11897Y
            monitor-enter(r3)
            int r0 = f11898Z     // Catch:{ all -> 0x007a }
            r4 = 250(0xfa, float:3.5E-43)
            if (r0 <= r4) goto L_0x006e
            java.util.Map<java.lang.String, java.lang.String> r0 = f11897Y     // Catch:{ all -> 0x007a }
            r0.clear()     // Catch:{ all -> 0x007a }
            f11898Z = r2     // Catch:{ all -> 0x007a }
        L_0x006e:
            java.util.Map<java.lang.String, java.lang.String> r0 = f11897Y     // Catch:{ all -> 0x007a }
            r0.put(r12, r5)     // Catch:{ all -> 0x007a }
            int r12 = f11898Z     // Catch:{ all -> 0x007a }
            int r12 = r12 + r1
            f11898Z = r12     // Catch:{ all -> 0x007a }
            monitor-exit(r3)     // Catch:{ all -> 0x007a }
            return r5
        L_0x007a:
            r12 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x007a }
            throw r12
        L_0x007d:
            r12 = move-exception
            java.lang.Object[] r1 = new java.lang.Object[r1]
            java.lang.String r12 = r12.getLocalizedMessage()
            r1[r2] = r12
            java.lang.String r12 = "Analytics - Unable to clean context data key (%s)"
            m16636b(r12, r1)
            return r0
        L_0x008c:
            r12 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x008c }
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: p163g.p164a.p165a.C4783y0.m16635b(java.lang.String):java.lang.String");
    }

    /* renamed from: a */
    protected static String m16619a(String str) {
        String str2 = Utf8Charset.NAME;
        if (str == null) {
            return null;
        }
        try {
            byte[] bytes = str.getBytes(str2);
            int length = bytes.length;
            int i = 0;
            while (i < length && f11901b[bytes[i] & 255]) {
                i++;
            }
            if (i == length) {
                return str;
            }
            StringBuilder sb = new StringBuilder(bytes.length << 1);
            if (i > 0) {
                sb.append(new String(bytes, 0, i, str2));
            }
            while (i < length) {
                sb.append(f11899a[bytes[i] & 255]);
                i++;
            }
            return sb.toString();
        } catch (UnsupportedEncodingException e) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("UnsupportedEncodingException : ");
            sb2.append(e.getMessage());
            m16640c(sb2.toString(), new Object[0]);
            return null;
        }
    }

    /* renamed from: a */
    protected static void m16630a(String str, Object... objArr) {
        if (m16655o()) {
            String str2 = "ADBMobile Debug : ";
            String str3 = "ADBMobile";
            if (objArr == null || objArr.length <= 0) {
                StringBuilder sb = new StringBuilder();
                sb.append(str2);
                sb.append(str);
                Log.d(str3, sb.toString());
                return;
            }
            StringBuilder sb2 = new StringBuilder();
            sb2.append(str2);
            sb2.append(str);
            Log.d(str3, String.format(sb2.toString(), objArr));
        }
    }

    /* renamed from: a */
    protected static Map<String, Object> m16623a(Map<String, Object> map) {
        if (map == null) {
            return new HashMap();
        }
        HashMap hashMap = new HashMap();
        for (Entry entry : map.entrySet()) {
            String b = m16635b((String) entry.getKey());
            if (b != null) {
                hashMap.put(b, entry.getValue());
            }
        }
        return hashMap;
    }

    /* renamed from: a */
    private static void m16628a(Object obj, C4713n nVar, List<String> list, int i) {
        if (!(nVar == null || list == null)) {
            int size = list.size();
            String str = i < size ? (String) list.get(i) : null;
            if (str != null) {
                C4713n nVar2 = new C4713n();
                if (nVar.mo16052a(str)) {
                    nVar2 = nVar.mo16053b(str);
                }
                if (size - 1 == i) {
                    nVar2.f11719a = obj;
                    nVar.mo16051a(str, nVar2);
                } else {
                    nVar.mo16051a(str, nVar2);
                    m16628a(obj, nVar2, list, i + 1);
                }
            }
        }
    }

    /* renamed from: a */
    protected static void m16627a(Long l) {
        C4728p0 H = C4728p0.m16448H();
        if (H == null) {
            m16636b("Config - Lost config instance", new Object[0]);
        } else if (H.mo16100s()) {
            try {
                Editor C = m16605C();
                C.putLong("ADBLastKnownTimestampKey", l.longValue());
                C.commit();
            } catch (C4785b e) {
                m16636b("Config - Error while updating last known timestamp. (%s)", e.getMessage());
            }
        }
    }

    /* renamed from: a */
    protected static void m16625a(Context context) {
        if (context == null) {
            return;
        }
        if (context instanceof Activity) {
            f11900a0 = context.getApplicationContext();
        } else {
            f11900a0 = context;
        }
    }

    /* renamed from: a */
    protected static HashMap<String, Object> m16622a(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        Iterator keys = jSONObject.keys();
        HashMap<String, Object> hashMap = new HashMap<>();
        while (keys.hasNext()) {
            String str = (String) keys.next();
            try {
                hashMap.put(str, jSONObject.getString(str));
            } catch (JSONException e) {
                m16640c("Problem parsing json data (%s)", e.getLocalizedMessage());
            }
        }
        return hashMap;
    }

    /* renamed from: a */
    protected static void m16624a(Activity activity) {
        synchronized (f11904c0) {
            f11902b0 = new WeakReference<>(activity);
        }
    }

    /* renamed from: a */
    protected static String m16620a(String str, Map<String, String> map) {
        try {
            for (Entry entry : map.entrySet()) {
                str = str.replace((CharSequence) entry.getKey(), (CharSequence) entry.getValue());
            }
        } catch (Exception e) {
            m16630a("Unable to expand tokens (%s)", e.toString());
        }
        return str;
    }

    /* renamed from: a */
    protected static String m16621a(Date date) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ssZZZ", m16659s());
        if (date == null) {
            date = new Date();
        }
        return simpleDateFormat.format(date);
    }
}
