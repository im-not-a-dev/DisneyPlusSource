package p163g.p164a.p165a;

import android.content.SharedPreferences.Editor;
import com.facebook.stetho.common.Utf8Charset;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p163g.p164a.p165a.C4693k.C4694a;

/* renamed from: g.a.a.l */
/* compiled from: AudienceManagerWorker */
final class C4696l {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public static String f11699a = null;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public static String f11700b = null;

    /* renamed from: c */
    private static String f11701c = null;

    /* renamed from: d */
    private static volatile boolean f11702d = true;

    /* renamed from: g.a.a.l$a */
    /* compiled from: AudienceManagerWorker */
    static class C4697a implements Runnable {
        C4697a() {
        }

        public void run() {
            String str;
            String e = C4728p0.m16448H().mo16086e();
            String b = C4696l.m16350b();
            String e2 = C4673f1.m16289k().mo16013e();
            String r = C4728p0.m16448H().mo16099r();
            if (!C4783y0.m16644e(b) && !C4783y0.m16644e(e)) {
                str = String.format("https://%s/demoptout.jpg?d_uuid=%s", new Object[]{e, b});
            } else if (!C4783y0.m16644e(e2) && !C4783y0.m16644e(r)) {
                str = String.format("https://%s/demoptout.jpg?d_mid=%s&d_orgid=%s", new Object[]{C4673f1.m16289k().mo16014f(), e2, r});
            } else {
                return;
            }
            C4783y0.m16630a("Audience Manager - Opting user out of server-side segments.", new Object[0]);
            C4779x0.m16600b(str, null, 5000, "Audience Manager");
        }
    }

    /* renamed from: g.a.a.l$b */
    /* compiled from: AudienceManagerWorker */
    static class C4698b implements Runnable {
        C4698b() {
        }

        public void run() {
            C4696l.f11699a = null;
            C4696l.f11700b = null;
        }
    }

    /* renamed from: g.a.a.l$c */
    /* compiled from: AudienceManagerWorker */
    static class C4699c implements Runnable {
        C4699c() {
        }

        public void run() {
            C4696l.m16353b((String) null);
            C4696l.m16357c(null);
        }
    }

    /* renamed from: g.a.a.l$d */
    /* compiled from: AudienceManagerWorker */
    public static class C4700d implements Runnable {

        /* renamed from: U */
        public final C4694a<Map<String, Object>> f11703U;

        /* renamed from: c */
        public final Map<String, Object> f11704c;

        /* renamed from: g.a.a.l$d$a */
        /* compiled from: AudienceManagerWorker */
        class C4701a implements Runnable {

            /* renamed from: c */
            final /* synthetic */ HashMap f11706c;

            C4701a(HashMap hashMap) {
                this.f11706c = hashMap;
            }

            public void run() {
                C4700d.this.f11703U.mo16032a(this.f11706c);
            }
        }

        public C4700d(Map<String, Object> map, C4694a<Map<String, Object>> aVar) {
            this.f11704c = map;
            this.f11703U = aVar;
        }

        public void run() {
            Thread thread;
            HashMap hashMap = new HashMap();
            try {
                if (!C4728p0.m16448H().mo16072C()) {
                    if (this.f11703U != null) {
                        new Thread(new C4701a(hashMap)).start();
                    }
                } else if (C4728p0.m16448H().mo16101t() == C4758r0.MOBILE_PRIVACY_STATUS_OPT_OUT) {
                    C4783y0.m16630a("Audience Manager - Privacy status is set to opt out, no signals will be submitted.", new Object[0]);
                    if (this.f11703U != null) {
                        new Thread(new C4701a(hashMap)).start();
                    }
                } else {
                    String d = C4696l.m16347a(this.f11704c);
                    if (d.length() <= 1) {
                        C4783y0.m16640c("Audience Manager - Unable to create URL object", new Object[0]);
                        if (this.f11703U != null) {
                            new Thread(new C4701a(hashMap)).start();
                        }
                        return;
                    }
                    C4783y0.m16630a("Audience Manager - request (%s)", d);
                    byte[] a = C4779x0.m16599a(d, null, C4728p0.m16448H().mo16087f() * 1000, "Audience Manager");
                    String str = "";
                    if (a != null && a.length > 0) {
                        str = new String(a, Utf8Charset.NAME);
                    }
                    hashMap.putAll(C4696l.m16356c(new JSONObject(str)));
                    if (this.f11703U != null) {
                        thread = new Thread(new C4701a(hashMap));
                        thread.start();
                    }
                }
            } catch (UnsupportedEncodingException e) {
                C4783y0.m16640c("Audience Manager - Unable to decode server response (%s)", e.getLocalizedMessage());
                if (this.f11703U != null) {
                    thread = new Thread(new C4701a(hashMap));
                }
            } catch (JSONException e2) {
                C4783y0.m16640c("Audience Manager - Unable to parse JSON data (%s)", e2.getLocalizedMessage());
                if (this.f11703U != null) {
                    thread = new Thread(new C4701a(hashMap));
                }
            } catch (Exception e3) {
                C4783y0.m16640c("Audience Manager - Unexpected error parsing result (%s)", e3.getLocalizedMessage());
                if (this.f11703U != null) {
                    thread = new Thread(new C4701a(hashMap));
                }
            } catch (Throwable th) {
                if (this.f11703U != null) {
                    new Thread(new C4701a(hashMap)).start();
                }
                throw th;
            }
        }
    }

    /* renamed from: a */
    public static void m16348a(Map<String, Object> map, C4694a<Map<String, Object>> aVar) {
        if (C4728p0.m16448H().mo16101t() != C4758r0.MOBILE_PRIVACY_STATUS_OPT_IN) {
            C4783y0.m16630a("Audience Manager - Ignoring signal due to privacy status not being opt in", new Object[0]);
            if (aVar != null) {
                aVar.mo16032a(null);
            }
            return;
        }
        C4783y0.m16650j().execute(new C4700d(map, aVar));
    }

    /* renamed from: b */
    private static String m16351b(Map<String, Object> map) {
        if (map == null || map.size() <= 0) {
            return "";
        }
        StringBuilder sb = new StringBuilder(1024);
        for (Entry entry : map.entrySet()) {
            String str = (String) entry.getKey();
            Object value = entry.getValue();
            if (str != null && str.length() > 0 && value != null && value.toString().length() > 0 && entry.getValue().getClass() == String.class) {
                sb.append("&");
                sb.append("c_");
                sb.append(C4783y0.m16619a(m16346a(str)));
                sb.append("=");
                sb.append(C4783y0.m16619a(value.toString()));
            }
        }
        return sb.toString();
    }

    /* renamed from: f */
    static void m16364f() {
        C4783y0.m16650j().execute(new C4698b());
    }

    /* renamed from: c */
    protected static HashMap<String, Object> m16356c(JSONObject jSONObject) {
        m16349a(jSONObject);
        try {
            m16353b(jSONObject.getString("uuid"));
        } catch (JSONException e) {
            C4783y0.m16640c("Audience Manager - Unable to parse JSON data (%s)", e.getLocalizedMessage());
        }
        HashMap<String, Object> b = m16352b(jSONObject);
        if (b.size() > 0) {
            C4783y0.m16630a("Audience Manager - response (%s)", b);
        } else {
            C4783y0.m16640c("Audience Manager - response was empty", new Object[0]);
        }
        m16357c((Map<String, Object>) b);
        return b;
    }

    /* renamed from: d */
    public static void m16360d() {
        C4783y0.m16650j().execute(new C4699c());
    }

    /* renamed from: e */
    static void m16361e() {
        C4783y0.m16650j().execute(new C4697a());
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static String m16347a(Map<String, Object> map) {
        if (m16354c() == null) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(m16354c());
        sb.append(m16351b(map));
        sb.append(m16345a());
        sb.append("&d_ptfm=android&d_dst=1&d_rtbd=json");
        sb.append(C4728p0.m16448H().mo16097p() ? "&d_coop_unsafe=1" : "");
        return sb.toString().replace("?&", "?");
    }

    /* renamed from: a */
    private static String m16346a(String str) {
        return str.replace(".", "_");
    }

    /* renamed from: a */
    private static String m16345a() {
        StringBuilder sb = new StringBuilder();
        if (C4728p0.m16448H().mo16106y()) {
            sb.append(C4673f1.m16289k().mo16006a());
        }
        String b = m16350b();
        String str = "=";
        String str2 = "&";
        if (b != null) {
            sb.append(str2);
            sb.append("d_uuid");
            sb.append(str);
            sb.append(b);
        }
        String str3 = f11699a;
        if (str3 != null && str3.length() > 0) {
            String str4 = f11700b;
            if (str4 != null && str4.length() > 0) {
                String str5 = f11700b;
                try {
                    str5 = C4783y0.m16619a(URLDecoder.decode(str5.replace("+", "%2B"), Utf8Charset.NAME));
                } catch (UnsupportedEncodingException e) {
                    C4783y0.m16630a("Audience Manager", "Unable to properly encode dpuuid (%s).  Sending original value.", e);
                }
                sb.append(str2);
                sb.append("d_dpid");
                sb.append(str);
                sb.append(f11699a);
                sb.append(str2);
                sb.append("d_dpuuid");
                sb.append(str);
                sb.append(str5);
            }
        }
        return sb.toString();
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public static void m16357c(Map<String, Object> map) {
        try {
            Editor C = C4783y0.m16605C();
            String str = "AAMUserProfile";
            if (map != null) {
                if (map.size() > 0) {
                    C.putString(str, new JSONObject(map).toString());
                    new HashMap(map);
                    C.commit();
                }
            }
            C.remove(str);
            C.commit();
        } catch (C4785b e) {
            C4783y0.m16636b("Audience Manager - Error updating visitor profile (%s)", e.getMessage());
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static void m16353b(String str) {
        if (str == null || str.isEmpty() || C4728p0.m16448H().mo16101t() != C4758r0.MOBILE_PRIVACY_STATUS_OPT_OUT) {
            try {
                Editor C = C4783y0.m16605C();
                String str2 = "AAMUserId";
                if (str == null) {
                    C.remove(str2);
                } else {
                    C.putString(str2, str);
                }
                C.commit();
            } catch (C4785b e) {
                C4783y0.m16636b("Audience Manager - Error updating uuid in shared preferences (%s)", e.getMessage());
            }
        }
    }

    /* renamed from: c */
    private static String m16354c() {
        if (f11702d && C4728p0.m16448H().mo16072C()) {
            f11702d = false;
            Object[] objArr = new Object[2];
            objArr[0] = C4728p0.m16448H().mo16104w() ? "https" : "http";
            objArr[1] = C4728p0.m16448H().mo16086e();
            f11701c = String.format("%s://%s/event?", objArr);
        }
        return f11701c;
    }

    /* renamed from: b */
    static String m16350b() {
        try {
            return C4783y0.m16604B().getString("AAMUserId", null);
        } catch (C4785b e) {
            C4783y0.m16636b("Audience Manager - Error getting uuid from shared preferences (%s).", e.getMessage());
            return null;
        }
    }

    /* renamed from: b */
    private static HashMap<String, Object> m16352b(JSONObject jSONObject) {
        HashMap<String, Object> hashMap = new HashMap<>();
        try {
            JSONArray jSONArray = jSONObject.getJSONArray("stuff");
            for (int i = 0; i < jSONArray.length(); i++) {
                JSONObject jSONObject2 = jSONArray.getJSONObject(i);
                if (jSONObject2 != null) {
                    hashMap.put(jSONObject2.getString("cn"), jSONObject2.getString("cv"));
                }
            }
        } catch (JSONException e) {
            C4783y0.m16630a("Audience Manager - No 'stuff' array in response (%s)", e.getLocalizedMessage());
        }
        return hashMap;
    }

    /* renamed from: a */
    private static void m16349a(JSONObject jSONObject) {
        try {
            JSONArray jSONArray = jSONObject.getJSONArray("dests");
            for (int i = 0; i < jSONArray.length(); i++) {
                String string = jSONArray.getJSONObject(i).getString("c");
                if (string != null && string.length() > 0) {
                    C4779x0.m16600b(string, null, 5000, "Audience Manager");
                }
            }
        } catch (JSONException e) {
            C4783y0.m16630a("Audience Manager - No destination in response (%s)", e.getLocalizedMessage());
        }
    }
}
