package p163g.p164a.p165a;

import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.net.Uri;
import com.facebook.stetho.common.Utf8Charset;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Map.Entry;
import org.json.JSONException;
import org.json.JSONObject;
import p163g.p164a.p165a.C4705m.C4711f;

/* renamed from: g.a.a.p */
/* compiled from: Lifecycle */
final class C4727p {

    /* renamed from: a */
    protected static long f11754a = 0;

    /* renamed from: b */
    private static boolean f11755b = false;

    /* renamed from: c */
    protected static volatile boolean f11756c = false;

    /* renamed from: d */
    private static final HashMap<String, Object> f11757d = new HashMap<>();

    /* renamed from: e */
    private static final HashMap<String, Object> f11758e = new HashMap<>();

    /* renamed from: f */
    private static final HashMap<String, Object> f11759f = new HashMap<>();

    /* renamed from: g */
    private static final Object f11760g = new Object();

    /* renamed from: h */
    private static final Object f11761h = new Object();

    /* renamed from: a */
    protected static void m16424a(Activity activity, Map<String, Object> map) {
        Activity activity2;
        HashMap hashMap;
        Activity activity3 = activity;
        Map<String, Object> map2 = map;
        f11755b = false;
        m16447j();
        if (!f11756c) {
            f11756c = true;
            try {
                SharedPreferences B = C4783y0.m16604B();
                try {
                    activity2 = C4783y0.m16653m();
                } catch (C4784a unused) {
                    activity2 = null;
                }
                if (!(activity2 == null || activity3 == null || !activity2.getComponentName().toString().equals(activity.getComponentName().toString()))) {
                    C4721o0.m16413a(null, null, null);
                }
                C4783y0.m16624a(activity);
                Map a = m16422a(activity3, "targetPreviewlink");
                if (a != null && C4648a1.m16198k().mo15978i() == null) {
                    m16436c(a);
                    C4648a1.m16198k().mo15970c();
                }
                C4648a1.m16198k().mo15979j();
                C4728p0 H = C4728p0.m16448H();
                String str = "ADMS_PauseDate";
                long a2 = m16420a(B.getLong(str, 0));
                int o = H.mo16096o();
                if (a2 > 0) {
                    long E = C4783y0.m16607E() - a2;
                    String str2 = "ADMS_SessionStart";
                    long a3 = m16420a(B.getLong(str2, 0));
                    f11754a = a3;
                    C4687i.m16319h().mo16026a(E);
                    if (E < ((long) o) && a3 > 0) {
                        try {
                            Editor C = C4783y0.m16605C();
                            C.putLong(str2, m16434c(a3 + E));
                            C.putBoolean("ADMS_SuccessfulClose", false);
                            C.remove(str);
                            C.commit();
                        } catch (C4785b e) {
                            C4783y0.m16636b("Lifecycle - Error while updating start time (%s).", e.getMessage());
                        }
                        f11754a = m16420a(B.getLong(str2, 0));
                        m16425a(activity3, false);
                        return;
                    }
                }
                C4673f1.m16289k().mo16009a(null, null, null, true);
                H.mo16082b();
                f11757d.clear();
                m16435c();
                if (map2 != null) {
                    hashMap = new HashMap(map2);
                } else {
                    hashMap = new HashMap();
                }
                Map a4 = m16422a(activity3, "applink");
                if (a4 != null) {
                    hashMap.putAll(a4);
                }
                long c = m16434c(C4783y0.m16607E());
                if (!B.contains("ADMS_InstallDate")) {
                    m16428a((Map<String, Object>) hashMap, c);
                } else {
                    m16437c(hashMap, c);
                    m16440d(hashMap, c);
                    m16432b((Map<String, Object>) hashMap);
                    m16430b();
                }
                m16433b(hashMap, c);
                m16439d(hashMap);
                m16445h();
                C4728p0.m16448H().mo16078a(C4711f.MOBILE_EVENT_LIFECYCLE, (Map<String, Object>) hashMap);
                C4671f.m16253a("Lifecycle", hashMap, C4783y0.m16607E() - 1);
                if (!H.mo16085d()) {
                    C4696l.m16348a(f11757d, null);
                }
                m16425a(activity3, true);
                m16431b(c);
            } catch (C4785b e2) {
                C4783y0.m16636b("Lifecycle - Error starting lifecycle (%s).", e2.getMessage());
            }
        }
    }

    /* renamed from: b */
    private static void m16431b(long j) {
        String str = "ADMS_SessionStart";
        try {
            Editor C = C4783y0.m16605C();
            if (!C4783y0.m16604B().contains(str)) {
                C.putLong(str, j);
                f11754a = j / 1000;
            }
            C.putString("ADMS_LastVersion", C4783y0.m16648h());
            C.putBoolean("ADMS_SuccessfulClose", false);
            C.remove("ADMS_PauseDate");
            C.commit();
        } catch (C4785b e) {
            C4783y0.m16636b("Lifecycle - Error resetting lifecycle flags (%s).", e.getMessage());
        }
    }

    /* renamed from: c */
    private static long m16434c(long j) {
        return j * 1000;
    }

    /* renamed from: c */
    private static void m16436c(Map<String, Object> map) {
        if (map != null) {
            Object obj = map.get("at_preview_token");
            if (obj != null && (obj instanceof String)) {
                C4648a1.m16198k().mo15971c((String) obj);
            }
            Object obj2 = map.get("at_preview_endpoint");
            if (obj2 != null && (obj2 instanceof String)) {
                C4648a1.m16198k().mo15969b((String) obj2);
            }
        }
    }

    /* renamed from: d */
    protected static HashMap<String, Object> m16438d() {
        synchronized (f11760g) {
            if (f11757d.size() > 0) {
                HashMap<String, Object> hashMap = new HashMap<>(f11757d);
                return hashMap;
            } else if (f11759f.size() > 0) {
                HashMap<String, Object> hashMap2 = new HashMap<>(f11759f);
                return hashMap2;
            } else {
                m16427a((Map<String, Object>) f11759f);
                HashMap<String, Object> hashMap3 = new HashMap<>(f11759f);
                return hashMap3;
            }
        }
    }

    /* renamed from: e */
    protected static void m16442e(Map<String, Object> map) {
        synchronized (f11760g) {
            f11757d.putAll(map);
        }
        synchronized (f11761h) {
            for (Entry entry : map.entrySet()) {
                f11758e.put(((String) entry.getKey()).toLowerCase(), entry.getValue());
            }
        }
    }

    /* renamed from: f */
    private static Map<String, Object> m16443f() {
        String str = "Analytics - Error persisting referrer data (%s)";
        String str2 = "utm_campaign";
        String str3 = "ADMS_Referrer_ContextData_Json_String";
        try {
            String str4 = "a.referrer.campaign.source";
            String str5 = "a.referrer.campaign.name";
            if (C4783y0.m16604B().contains(str3)) {
                HashMap hashMap = new HashMap();
                String e = C4768u0.m16559e(C4783y0.m16604B().getString(str3, null));
                hashMap.putAll(C4768u0.m16558d(e));
                if (hashMap.size() > 0) {
                    hashMap.putAll(C4768u0.m16560f(e));
                } else {
                    HashMap b = C4768u0.m16556b(e);
                    if (b.containsKey(str5) && b.containsKey(str4)) {
                        hashMap.putAll(b);
                    }
                    if (hashMap.size() == 0) {
                        HashMap c = C4768u0.m16557c(e);
                        if (c != null && c.size() > 0) {
                            hashMap.putAll(c);
                        }
                    }
                }
                return hashMap;
            }
            if (C4783y0.m16604B().contains(str2)) {
                String string = C4783y0.m16604B().getString("utm_source", null);
                String string2 = C4783y0.m16604B().getString("utm_medium", null);
                String string3 = C4783y0.m16604B().getString("utm_term", null);
                String string4 = C4783y0.m16604B().getString("utm_content", null);
                String string5 = C4783y0.m16604B().getString(str2, null);
                String string6 = C4783y0.m16604B().getString("trackingcode", null);
                if (!(string == null || string5 == null)) {
                    HashMap hashMap2 = new HashMap();
                    hashMap2.put(str4, string);
                    hashMap2.put("a.referrer.campaign.medium", string2);
                    hashMap2.put("a.referrer.campaign.term", string3);
                    hashMap2.put("a.referrer.campaign.content", string4);
                    hashMap2.put(str5, string5);
                    hashMap2.put("a.referrer.campaign.trackingcode", string6);
                    try {
                        Editor C = C4783y0.m16605C();
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("googleReferrerData", new JSONObject(hashMap2));
                        C.putString(str3, jSONObject.toString());
                        C.commit();
                    } catch (C4785b e2) {
                        C4783y0.m16636b(str, e2.getMessage());
                    } catch (JSONException e3) {
                        C4783y0.m16636b(str, e3.getMessage());
                    }
                    return hashMap2;
                }
            }
            return null;
        } catch (C4785b e4) {
            C4783y0.m16636b("Lifecycle - Error pulling persisted Acquisition data (%s)", e4.getMessage());
        }
    }

    /* renamed from: g */
    private static boolean m16444g() {
        try {
            return true ^ C4783y0.m16648h().equalsIgnoreCase(C4783y0.m16604B().getString("ADMS_LastVersion", ""));
        } catch (C4785b e) {
            C4783y0.m16636b("Lifecycle - Unable to get application version (%s)", e.getLocalizedMessage());
            return false;
        }
    }

    /* renamed from: h */
    private static void m16445h() {
        try {
            Editor C = C4783y0.m16605C();
            C.putString("ADMS_LifecycleData", new JSONObject(f11757d).toString());
            C.commit();
        } catch (C4785b e) {
            C4783y0.m16640c("Lifecycle - Error persisting lifecycle data (%s)", e.getMessage());
        }
    }

    /* renamed from: i */
    protected static void m16446i() {
        f11755b = true;
        f11756c = false;
        C4783y0.m16627a(Long.valueOf(C4783y0.m16607E()));
        try {
            Editor C = C4783y0.m16605C();
            C.putBoolean("ADMS_SuccessfulClose", true);
            C.putLong("ADMS_PauseDate", m16434c(C4783y0.m16607E()));
            C.commit();
        } catch (C4785b e) {
            C4783y0.m16636b("Lifecycle - Error updating lifecycle pause data (%s)", e.getMessage());
        }
        try {
            if (C4783y0.m16653m().isFinishing()) {
                C4721o0.m16418f();
            }
        } catch (C4784a unused) {
        }
    }

    /* renamed from: j */
    private static void m16447j() {
        if (m16444g()) {
            HashMap d = m16438d();
            if (d != null && d.size() > 0) {
                d.put("a.AppID", C4783y0.m16645f());
                HashMap<String, Object> hashMap = f11757d;
                if (hashMap == null || hashMap.size() <= 0) {
                    try {
                        synchronized (f11760g) {
                            f11759f.put("a.AppID", C4783y0.m16645f());
                        }
                        Editor C = C4783y0.m16605C();
                        C.putString("ADMS_LifecycleData", new JSONObject(d).toString());
                        C.commit();
                        m16435c();
                    } catch (C4785b e) {
                        C4783y0.m16640c("Lifecycle - Error persisting lifecycle data (%s)", e.getMessage());
                    }
                } else {
                    m16442e(d);
                }
            }
        }
    }

    /* renamed from: c */
    private static void m16435c() {
        synchronized (f11761h) {
            f11758e.clear();
        }
    }

    /* renamed from: d */
    private static void m16439d(Map<String, Object> map) {
        HashMap hashMap;
        if (map != null) {
            hashMap = new HashMap(map);
        } else {
            hashMap = new HashMap();
        }
        hashMap.putAll(C4783y0.m16657q());
        hashMap.put("a.locale", C4783y0.m16656p());
        hashMap.put("a.ltv.amount", C4682g.m16301a());
        f11757d.putAll(hashMap);
        m16435c();
        for (Entry entry : f11757d.entrySet()) {
            f11758e.put(((String) entry.getKey()).toLowerCase(), entry.getValue());
        }
    }

    /* renamed from: e */
    protected static Map<String, Object> m16441e() {
        HashMap<String, Object> hashMap;
        synchronized (f11761h) {
            if (f11758e.size() <= 0) {
                HashMap hashMap2 = new HashMap();
                m16427a((Map<String, Object>) hashMap2);
                for (Entry entry : hashMap2.entrySet()) {
                    f11758e.put(((String) entry.getKey()).toLowerCase(), entry.getValue());
                }
            }
            hashMap = f11758e;
        }
        return hashMap;
    }

    /* renamed from: b */
    private static void m16430b() {
        Map f = m16443f();
        if (f != null && f.size() != 0) {
            m16442e(f);
            C4728p0.m16448H().mo16078a(C4711f.MOBILE_EVENT_ACQUISITION_LAUNCH, f);
        }
    }

    /* renamed from: c */
    private static void m16437c(Map<String, Object> map, long j) {
        String str = "";
        try {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy/M/d", Locale.US);
            long j2 = C4783y0.m16604B().getLong("ADMS_LastDateUsed", 0);
            if (!simpleDateFormat.format(Long.valueOf(j)).equalsIgnoreCase(simpleDateFormat.format(new Date(j2)))) {
                map.put("a.DailyEngUserEvent", "DailyEngUserEvent");
            }
            SimpleDateFormat simpleDateFormat2 = new SimpleDateFormat("yyyy/M", Locale.US);
            if (!simpleDateFormat2.format(Long.valueOf(j)).equalsIgnoreCase(simpleDateFormat2.format(new Date(j2)))) {
                map.put("a.MonthlyEngUserEvent", "MonthlyEngUserEvent");
            }
            map.put("a.DaysSinceFirstUse", m16421a(C4783y0.m16604B().getLong("ADMS_InstallDate", 0), j));
            map.put("a.DaysSinceLastUse", m16421a(j2, j));
            if (!C4783y0.m16604B().getBoolean("ADMS_SuccessfulClose", false)) {
                Editor C = C4783y0.m16605C();
                C.remove("ADMS_PauseDate");
                C.remove("ADMS_SessionStart");
                f11754a = C4783y0.m16607E();
                C.commit();
                long j3 = C4783y0.m16604B().getLong("ADBLastKnownTimestampKey", 0);
                String str2 = "CrashEvent";
                String str3 = "a.CrashEvent";
                if (j3 > 0) {
                    if (C4728p0.m16448H().mo16071B() && C4728p0.m16448H().mo16100s() && C4728p0.m16448H().mo16089h()) {
                        try {
                            SharedPreferences B = C4783y0.m16604B();
                            HashMap hashMap = new HashMap();
                            hashMap.put(str3, str2);
                            hashMap.put("a.OSVersion", B.getString("ADOBEMOBILE_STOREDDEFAULTS_OS", str));
                            hashMap.put("a.AppID", B.getString("ADOBEMOBILE_STOREDDEFAULTS_APPID", str));
                            C4671f.m16253a("Crash", hashMap, j3 + 1);
                            f11757d.put(str3, str2);
                        } catch (C4785b e) {
                            C4783y0.m16640c("Config - Unable to get crash data for backdated hit (%s)", e.getLocalizedMessage());
                        }
                        C4687i.m16319h().mo15986g();
                    }
                }
                map.put(str3, str2);
                C4687i.m16319h().mo15986g();
            }
        } catch (C4785b e2) {
            C4783y0.m16636b("Lifecycle - Error setting non install data (%s).", e2.getMessage());
        }
    }

    /* renamed from: b */
    private static void m16433b(Map<String, Object> map, long j) {
        String str = "ADMS_Launches";
        map.putAll(C4783y0.m16657q());
        map.put("a.LaunchEvent", "LaunchEvent");
        map.put("a.OSVersion", C4783y0.m16663w());
        map.put("a.HourOfDay", new SimpleDateFormat("H", Locale.US).format(Long.valueOf(j)));
        Calendar instance = Calendar.getInstance();
        instance.setTimeInMillis(j);
        map.put("a.DayOfWeek", Integer.toString(instance.get(7)));
        String c = C4783y0.m16638c();
        if (c != null) {
            map.put("a.adid", c);
        }
        try {
            Editor C = C4783y0.m16605C();
            int i = C4783y0.m16604B().getInt(str, 0) + 1;
            map.put("a.Launches", Integer.toString(i));
            C.putInt(str, i);
            C.putLong("ADMS_LastDateUsed", j);
            C.commit();
        } catch (C4785b e) {
            C4783y0.m16636b("Lifecycle - Error adding generic data (%s).", e.getMessage());
        }
    }

    /* renamed from: d */
    private static void m16440d(Map<String, Object> map, long j) {
        String str = "ADMS_UpgradeDate";
        try {
            Editor C = C4783y0.m16605C();
            long j2 = C4783y0.m16604B().getLong(str, 0);
            String str2 = "ADMS_LaunchesAfterUpgrade";
            if (m16444g()) {
                map.put("a.UpgradeEvent", "UpgradeEvent");
                C.putLong(str, j);
                C.putInt(str2, 0);
            } else if (j2 > 0) {
                map.put("a.DaysSinceLastUpgrade", m16421a(j2, j));
            }
            if (j2 > 0) {
                int i = C4783y0.m16604B().getInt(str2, 0) + 1;
                StringBuilder sb = new StringBuilder();
                sb.append("");
                sb.append(i);
                map.put("a.LaunchesSinceUpgrade", sb.toString());
                C.putInt(str2, i);
            }
            C.commit();
        } catch (C4785b e) {
            C4783y0.m16636b("Lifecycle - Error setting upgrade data (%s).", e.getMessage());
        }
    }

    /* renamed from: b */
    private static void m16432b(Map<String, Object> map) {
        String str = "";
        String str2 = "ADMS_SessionStart";
        try {
            long a = m16420a(C4783y0.m16604B().getLong("ADMS_PauseDate", 0));
            if (C4783y0.m16607E() - a >= ((long) C4728p0.m16448H().mo16096o())) {
                long a2 = a - m16420a(C4783y0.m16604B().getLong(str2, 0));
                f11754a = C4783y0.m16607E();
                if (a2 <= 0 || a2 >= 604800) {
                    map.put("a.ignoredSessionLength", Long.toString(a2));
                } else {
                    long j = C4783y0.m16604B().getLong("ADBLastKnownTimestampKey", 0);
                    String str3 = "a.PrevSessionLength";
                    if (j > 0) {
                        if (C4728p0.m16448H().mo16071B() && C4728p0.m16448H().mo16100s() && C4728p0.m16448H().mo16089h()) {
                            try {
                                SharedPreferences B = C4783y0.m16604B();
                                HashMap hashMap = new HashMap();
                                hashMap.put(str3, String.valueOf(a2));
                                hashMap.put("a.OSVersion", B.getString("ADOBEMOBILE_STOREDDEFAULTS_OS", str));
                                hashMap.put("a.AppID", B.getString("ADOBEMOBILE_STOREDDEFAULTS_APPID", str));
                                C4671f.m16253a("SessionInfo", hashMap, j + 1);
                                f11757d.put(str3, String.valueOf(a2));
                            } catch (C4785b e) {
                                C4783y0.m16640c("Config - Unable to get session data for backdated hit (%s)", e.getLocalizedMessage());
                            }
                        }
                    }
                    map.put(str3, Long.toString(a2));
                }
                Editor C = C4783y0.m16605C();
                C.remove(str2);
                C.commit();
            }
        } catch (C4785b e2) {
            C4783y0.m16636b("Lifecycle - Error adding session length data (%s).", e2.getMessage());
        }
    }

    /* renamed from: a */
    protected static boolean m16429a() {
        return f11755b;
    }

    /* renamed from: a */
    private static void m16427a(Map<String, Object> map) {
        try {
            String string = C4783y0.m16604B().getString("ADMS_LifecycleData", null);
            if (string != null && string.length() > 0) {
                map.putAll(C4783y0.m16622a(new JSONObject(string)));
            }
        } catch (C4785b e) {
            C4783y0.m16636b("Lifecycle - Issue loading persisted lifecycle data", e.getMessage());
        } catch (JSONException e2) {
            C4783y0.m16640c("Lifecycle - Issue loading persisted lifecycle data (%s)", e2.getMessage());
        }
    }

    /* renamed from: a */
    private static void m16428a(Map<String, Object> map, long j) {
        String str = "ADMS_Referrer_ContextData_Json_String";
        map.put("a.InstallDate", new SimpleDateFormat("M/d/yyyy", Locale.US).format(Long.valueOf(j)));
        map.put("a.InstallEvent", "InstallEvent");
        map.put("a.DailyEngUserEvent", "DailyEngUserEvent");
        map.put("a.MonthlyEngUserEvent", "MonthlyEngUserEvent");
        try {
            if (!C4783y0.m16604B().contains(str)) {
                if (!C4783y0.m16604B().contains("utm_campaign")) {
                    if (C4728p0.m16448H().mo16070A() && C4728p0.m16448H().mo16102u() > 0) {
                        C4768u0.m16553a(false);
                        C4721o0.m16409a();
                    }
                    Editor C = C4783y0.m16605C();
                    C.putLong("ADMS_InstallDate", j);
                    C.commit();
                }
            }
            Map f = m16443f();
            C4768u0.m16562h(C4768u0.m16550a(C4768u0.m16561g(C4783y0.m16604B().getString(str, null))));
            if (f != null && f.size() >= 0) {
                map.putAll(f);
                C4728p0.m16448H().mo16078a(C4711f.MOBILE_EVENT_ACQUISITION_INSTALL, f);
            }
            Editor C2 = C4783y0.m16605C();
            C2.putLong("ADMS_InstallDate", j);
            C2.commit();
        } catch (C4785b e) {
            C4783y0.m16636b("Lifecycle - Error setting install data (%s).", e.getMessage());
        }
    }

    /* renamed from: a */
    private static String m16421a(long j, long j2) {
        return Integer.toString((int) ((j2 - j) / 86400000));
    }

    /* renamed from: a */
    private static void m16425a(Activity activity, boolean z) {
        if (activity != null) {
            Intent intent = activity.getIntent();
            if (intent != null) {
                String str = null;
                String stringExtra = intent.getStringExtra("adb_m_id");
                String stringExtra2 = intent.getStringExtra("adb_m_l_id");
                Map a = m16423a(intent.getData(), "applink");
                HashMap hashMap = new HashMap();
                if (!z && a != null) {
                    hashMap.putAll(a);
                    m16442e(hashMap);
                    str = "AdobeLink";
                }
                if (stringExtra != null && stringExtra.length() > 0) {
                    hashMap.put("a.push.payloadId", stringExtra);
                    m16442e(hashMap);
                    str = "PushMessage";
                } else if (stringExtra2 != null && stringExtra2.length() > 0) {
                    hashMap.put("a.message.id", stringExtra2);
                    hashMap.put("a.message.clicked", Integer.valueOf(1));
                    m16442e(hashMap);
                    str = "In-App Message";
                }
                if (str != null && C4728p0.m16448H().mo16071B()) {
                    C4671f.m16253a(str, hashMap, C4783y0.m16607E());
                }
            }
        }
    }

    /* renamed from: a */
    private static Map<String, Object> m16422a(Activity activity, String str) {
        if (activity == null) {
            return null;
        }
        Intent intent = activity.getIntent();
        if (intent == null) {
            return null;
        }
        Uri data = intent.getData();
        if (data == null) {
            return null;
        }
        Map<String, Object> a = m16423a(data, str);
        m16426a(intent, a);
        return a;
    }

    /* renamed from: a */
    private static void m16426a(Intent intent, Map<String, Object> map) {
        try {
            Uri data = intent.getData();
            if (!(data == null || map == null)) {
                if (!map.isEmpty()) {
                    if (map.containsKey("at_preview_token")) {
                        intent.setData(data.buildUpon().encodedQuery("").build());
                    }
                }
            }
        } catch (Exception e) {
            C4783y0.m16636b("Lifecycle - Exception while attempting to remove target token parameters from Uri (%s).", e.getMessage());
        }
    }

    /* renamed from: a */
    private static Map<String, Object> m16423a(Uri uri, String str) {
        String[] split;
        String str2;
        String str3;
        String str4 = Utf8Charset.NAME;
        HashMap hashMap = null;
        if (uri == null) {
            return null;
        }
        String encodedQuery = uri.getEncodedQuery();
        String str5 = str.equals("targetPreviewlink") ? "at_preview_token" : "a.deeplink.id";
        if (encodedQuery != null && encodedQuery.length() > 0) {
            StringBuilder sb = new StringBuilder();
            sb.append(str5);
            String str6 = "=";
            sb.append(str6);
            if (encodedQuery.contains(sb.toString())) {
                hashMap = new HashMap();
                for (String str7 : encodedQuery.split("&")) {
                    if (str7 != null && str7.length() > 0) {
                        String[] split2 = str7.split(str6, 2);
                        if (split2.length == 1 || (split2.length == 2 && split2[1].isEmpty())) {
                            C4783y0.m16640c("Deep Link - Skipping an invalid variable on the URI query (%s).", split2[0]);
                        } else {
                            try {
                                str2 = URLDecoder.decode(split2[0], str4);
                            } catch (UnsupportedEncodingException unused) {
                                str2 = split2[0];
                            }
                            try {
                                str3 = URLDecoder.decode(split2[1], str4);
                            } catch (UnsupportedEncodingException unused2) {
                                str3 = split2[1];
                            }
                            if (str2.startsWith("ctx")) {
                                hashMap.put(str2.substring(3), str3);
                            } else if (str2.startsWith("adb")) {
                                hashMap.put("a.acquisition.custom.".concat(str2.substring(3)), str3);
                            } else {
                                hashMap.put(str2, str3);
                            }
                        }
                    }
                }
            }
        }
        return hashMap;
    }

    /* renamed from: a */
    private static long m16420a(long j) {
        return j / 1000;
    }
}
