package p161f.p162a;

import com.appboy.p025o.p026k.C1510e;
import com.appboy.p030r.C1544n;
import com.appboy.p030r.p032p.C1551a;
import com.appboy.p033s.C1557c;
import com.appboy.p033s.C1563i;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.math.BigDecimal;
import java.util.UUID;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: f.a.p1 */
public class C4548p1 implements C4432e1 {

    /* renamed from: Z */
    private static final String f11321Z = C1557c.m7461a(C4548p1.class);

    /* renamed from: U */
    private final JSONObject f11322U;

    /* renamed from: V */
    private final double f11323V;

    /* renamed from: W */
    private final String f11324W;

    /* renamed from: X */
    private String f11325X;

    /* renamed from: Y */
    private C4470i1 f11326Y;

    /* renamed from: c */
    private final C4585s6 f11327c;

    protected C4548p1(C4585s6 s6Var, JSONObject jSONObject) {
        this(s6Var, jSONObject, C4472i3.m15486b());
    }

    /* renamed from: a */
    public static C4548p1 m15764a(String str, C1551a aVar) {
        JSONObject jSONObject = new JSONObject();
        C1563i.m7485a(str);
        jSONObject.put("n", str);
        if (aVar != null && aVar.mo6891I() > 0) {
            jSONObject.put("p", aVar.mo6750b());
        }
        return new C4548p1(C4585s6.CUSTOM_EVENT, jSONObject);
    }

    /* renamed from: c */
    public static C4548p1 m15782c(String str) {
        JSONObject jSONObject = new JSONObject();
        JSONArray jSONArray = new JSONArray();
        jSONArray.put(str);
        jSONObject.put("ids", jSONArray);
        return new C4548p1(C4585s6.NEWS_FEED_CARD_CLICK, jSONObject);
    }

    /* renamed from: d */
    public static C4548p1 m15786d(String str) {
        JSONObject jSONObject = new JSONObject();
        JSONArray jSONArray = new JSONArray();
        jSONArray.put(str);
        jSONObject.put("ids", jSONArray);
        return new C4548p1(C4585s6.CONTENT_CARDS_IMPRESSION, jSONObject);
    }

    /* renamed from: e */
    public static C4548p1 m15788e(String str) {
        JSONObject jSONObject = new JSONObject();
        JSONArray jSONArray = new JSONArray();
        jSONArray.put(str);
        jSONObject.put("ids", jSONArray);
        return new C4548p1(C4585s6.CONTENT_CARDS_CONTROL_IMPRESSION, jSONObject);
    }

    /* renamed from: f */
    public static C4548p1 m15789f(String str) {
        JSONObject jSONObject = new JSONObject();
        JSONArray jSONArray = new JSONArray();
        jSONArray.put(str);
        jSONObject.put("ids", jSONArray);
        return new C4548p1(C4585s6.CONTENT_CARDS_CLICK, jSONObject);
    }

    /* renamed from: g */
    public static C4548p1 m15790g(String str) {
        JSONObject jSONObject = new JSONObject();
        JSONArray jSONArray = new JSONArray();
        jSONArray.put(str);
        jSONObject.put("ids", jSONArray);
        return new C4548p1(C4585s6.CONTENT_CARDS_DISMISS, jSONObject);
    }

    /* renamed from: h */
    public static C4548p1 m15791h(String str) {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("n", str);
        return new C4548p1(C4585s6.INTERNAL, jSONObject);
    }

    /* renamed from: i */
    public static C4548p1 m15792i(String str) {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("cid", str);
        return new C4548p1(C4585s6.PUSH_DELIVERY, jSONObject);
    }

    /* renamed from: k */
    public static C4548p1 m15793k() {
        return m15791h("content_cards_displayed");
    }

    /* renamed from: l */
    public static C4548p1 m15794l() {
        return m15791h("feed_displayed");
    }

    @Deprecated
    /* renamed from: m */
    public static C4548p1 m15795m() {
        return m15791h("feedback_displayed");
    }

    /* renamed from: n */
    public static C4548p1 m15796n() {
        return new C4548p1(C4585s6.SESSION_START, new JSONObject());
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return this.f11324W.equals(((C4548p1) obj).f11324W);
    }

    public int hashCode() {
        return this.f11324W.hashCode();
    }

    /* renamed from: j */
    public JSONObject mo6750b() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("name", this.f11327c.mo6750b());
            jSONObject.put("data", this.f11322U);
            jSONObject.put("time", this.f11323V);
            if (!C1563i.m7491e(this.f11325X)) {
                jSONObject.put("user_id", this.f11325X);
            }
            if (this.f11326Y != null) {
                jSONObject.put("session_id", this.f11326Y.mo6750b());
            }
        } catch (JSONException e) {
            C1557c.m7470c(f11321Z, "Caught exception creating Braze event Json.", e);
        }
        return jSONObject;
    }

    public String toString() {
        JSONObject j = mo6750b();
        return (j == null || j.length() <= 0) ? "" : j.toString();
    }

    protected C4548p1(C4585s6 s6Var, JSONObject jSONObject, double d) {
        this(s6Var, jSONObject, d, UUID.randomUUID().toString());
    }

    /* renamed from: b */
    public static C4548p1 m15778b(String str) {
        JSONObject jSONObject = new JSONObject();
        JSONArray jSONArray = new JSONArray();
        jSONArray.put(str);
        jSONObject.put("ids", jSONArray);
        return new C4548p1(C4585s6.NEWS_FEED_CARD_IMPRESSION, jSONObject);
    }

    protected C4548p1(C4585s6 s6Var, JSONObject jSONObject, double d, String str) {
        this.f11325X = null;
        this.f11326Y = null;
        if (jSONObject == null) {
            throw new NullPointerException("Event data cannot be null");
        } else if (s6Var.mo6750b() != null) {
            this.f11327c = s6Var;
            this.f11322U = jSONObject;
            this.f11323V = d;
            this.f11324W = str;
        } else {
            throw new NullPointerException("Event type cannot be null");
        }
    }

    /* renamed from: h */
    public C4470i1 mo15525h() {
        return this.f11326Y;
    }

    /* renamed from: i */
    public boolean mo15526i() {
        if (this.f11327c != C4585s6.INTERNAL_ERROR || !this.f11322U.optBoolean("nop", false)) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public static C4548p1 m15771a(String str, String str2, BigDecimal bigDecimal, int i, C1551a aVar) {
        BigDecimal a = C4590t3.m15943a(bigDecimal);
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("pid", str);
        jSONObject.put("c", str2);
        jSONObject.put("p", a.doubleValue());
        jSONObject.put("q", i);
        if (aVar != null && aVar.mo6891I() > 0) {
            jSONObject.put("pr", aVar.mo6750b());
        }
        return new C4548p1(C4585s6.PURCHASE, jSONObject);
    }

    /* renamed from: c */
    public static C4548p1 m15784c(String str, String str2, String str3) {
        return new C4548p1(C4585s6.INAPP_MESSAGE_CLICK, m15787d(str, str2, str3));
    }

    /* renamed from: d */
    static JSONObject m15787d(String str, String str2, String str3) {
        return m15777a(str, str2, str3, (String) null, (C1510e) null);
    }

    /* renamed from: e */
    public String mo15522e() {
        return mo6750b().toString();
    }

    /* renamed from: f */
    public String mo15523f() {
        return this.f11325X;
    }

    /* renamed from: g */
    public String mo15524g() {
        return this.f11324W;
    }

    /* renamed from: b */
    public static C4548p1 m15780b(String str, String str2, String str3) {
        return new C4548p1(C4585s6.INAPP_MESSAGE_IMPRESSION, m15787d(str, str2, str3));
    }

    /* renamed from: c */
    public static C4548p1 m15783c(String str, String str2) {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("key", str);
        jSONObject.put("value", str2);
        return new C4548p1(C4585s6.REMOVE_FROM_CUSTOM_ATTRIBUTE_ARRAY, jSONObject);
    }

    /* renamed from: d */
    public static C4432e1 m15785d(String str, String str2) {
        JSONObject jSONObject = new JSONObject(str);
        String string = jSONObject.getString("name");
        C4585s6 a = C4585s6.m15912a(string);
        if (a != null) {
            C4548p1 p1Var = new C4548p1(a, jSONObject.getJSONObject("data"), jSONObject.getDouble("time"), str2, jSONObject.optString("user_id", null), jSONObject.optString("session_id", null));
            return p1Var;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Cannot parse eventType ");
        sb.append(string);
        sb.append(". Event json: ");
        sb.append(jSONObject);
        throw new IllegalArgumentException(sb.toString());
    }

    /* renamed from: b */
    static JSONObject m15781b(String str, String str2, String str3, C1510e eVar) {
        return m15777a(str, str2, str3, (String) null, eVar);
    }

    /* renamed from: b */
    public static C4548p1 m15779b(String str, String str2) {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("key", str);
        jSONObject.put("value", str2);
        return new C4548p1(C4585s6.ADD_TO_CUSTOM_ATTRIBUTE_ARRAY, jSONObject);
    }

    /* renamed from: c */
    public JSONObject mo15520c() {
        return this.f11322U;
    }

    protected C4548p1(C4585s6 s6Var, JSONObject jSONObject, double d, String str, String str2, String str3) {
        this.f11325X = null;
        this.f11326Y = null;
        if (jSONObject == null) {
            throw new NullPointerException("Event data cannot be null");
        } else if (s6Var.mo6750b() != null) {
            this.f11327c = s6Var;
            this.f11322U = jSONObject;
            this.f11323V = d;
            this.f11324W = str;
            this.f11325X = str2;
            if (str3 != null) {
                this.f11326Y = C4470i1.m15471a(str3);
            }
        } else {
            throw new NullPointerException("Event type cannot be null");
        }
    }

    /* renamed from: a */
    public static C4548p1 m15761a(C4445f1 f1Var) {
        return new C4548p1(C4585s6.LOCATION_RECORDED, (JSONObject) f1Var.mo6750b());
    }

    /* renamed from: a */
    public static C4548p1 m15773a(Throwable th, C4470i1 i1Var, boolean z) {
        String a = m15776a(th, i1Var);
        String a2 = m15775a(th);
        StringBuilder sb = new StringBuilder();
        sb.append(a);
        sb.append("\n");
        sb.append(a2);
        String sb2 = sb.toString();
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("e", sb2);
        if (!z) {
            jSONObject.put("nop", true);
        }
        return new C4548p1(C4585s6.INTERNAL_ERROR, jSONObject);
    }

    /* renamed from: d */
    public C4585s6 mo15521d() {
        return this.f11327c;
    }

    /* renamed from: a */
    public static C4548p1 m15765a(String str, String str2) {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("geo_id", str);
        jSONObject.put("event_type", str2);
        return new C4548p1(C4585s6.GEOFENCE, jSONObject);
    }

    /* renamed from: a */
    public static C4548p1 m15767a(String str, String str2, String str3) {
        return new C4548p1(C4585s6.INAPP_MESSAGE_CONTROL_IMPRESSION, m15787d(str, str2, str3));
    }

    /* renamed from: a */
    public static C4548p1 m15769a(String str, String str2, String str3, C1544n nVar) {
        return new C4548p1(C4585s6.INAPP_MESSAGE_BUTTON_CLICK, m15777a(str, str2, str3, m15774a(nVar), (C1510e) null));
    }

    /* renamed from: a */
    public static C4548p1 m15770a(String str, String str2, String str3, String str4) {
        return new C4548p1(C4585s6.INAPP_MESSAGE_BUTTON_CLICK, m15777a(str, str2, str3, str4, (C1510e) null));
    }

    /* renamed from: a */
    public static C4548p1 m15768a(String str, String str2, String str3, C1510e eVar) {
        return new C4548p1(C4585s6.INAPP_MESSAGE_DISPLAY_FAILURE, m15781b(str, str2, str3, eVar));
    }

    /* renamed from: a */
    static JSONObject m15777a(String str, String str2, String str3, String str4, C1510e eVar) {
        JSONObject jSONObject = new JSONObject();
        if (!C1563i.m7491e(str)) {
            JSONArray jSONArray = new JSONArray();
            jSONArray.put(str);
            jSONObject.put("campaign_ids", jSONArray);
        }
        if (!C1563i.m7491e(str2)) {
            JSONArray jSONArray2 = new JSONArray();
            jSONArray2.put(str2);
            jSONObject.put("card_ids", jSONArray2);
        }
        if (!C1563i.m7491e(str3)) {
            JSONArray jSONArray3 = new JSONArray();
            jSONArray3.put(str3);
            jSONObject.put("trigger_ids", jSONArray3);
        }
        if (!C1563i.m7491e(str4)) {
            jSONObject.put("bid", str4);
        }
        if (eVar != null) {
            String b = eVar.mo6750b();
            if (!C1563i.m7491e(b)) {
                jSONObject.put("error_code", b);
            }
        }
        return jSONObject;
    }

    /* renamed from: a */
    public static String m15774a(C1544n nVar) {
        if (nVar != null) {
            return String.valueOf(nVar.mo6849J());
        }
        return null;
    }

    /* renamed from: a */
    public static C4548p1 m15763a(String str, int i) {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("key", str);
        jSONObject.put("value", i);
        return new C4548p1(C4585s6.INCREMENT, jSONObject);
    }

    /* renamed from: a */
    public static C4548p1 m15772a(String str, String[] strArr) {
        JSONArray jSONArray = strArr == null ? null : new JSONArray();
        if (strArr != null) {
            for (String put : strArr) {
                jSONArray.put(put);
            }
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("key", str);
        String str2 = "value";
        if (strArr == null) {
            jSONObject.put(str2, JSONObject.NULL);
        } else {
            jSONObject.put(str2, jSONArray);
        }
        return new C4548p1(C4585s6.SET_CUSTOM_ATTRIBUTE_ARRAY, jSONObject);
    }

    /* renamed from: a */
    public static C4548p1 m15760a(long j) {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("d", j);
        return new C4548p1(C4585s6.SESSION_END, jSONObject);
    }

    /* renamed from: a */
    public static C4548p1 m15762a(String str, double d, double d2) {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("key", str);
        jSONObject.put("latitude", d);
        jSONObject.put("longitude", d2);
        return new C4548p1(C4585s6.LOCATION_CUSTOM_ATTRIBUTE_ADD, jSONObject);
    }

    /* renamed from: a */
    public static C4548p1 m15766a(String str, String str2, double d, String str3, String str4, String str5) {
        C4585s6 a = C4585s6.m15912a(str);
        if (a != null) {
            C4548p1 p1Var = new C4548p1(a, new JSONObject(str2), d, str3, str4, str5);
            return p1Var;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Cannot parse eventType ");
        sb.append(str);
        throw new IllegalArgumentException(sb.toString());
    }

    /* renamed from: a */
    public double mo15517a() {
        return this.f11323V;
    }

    /* renamed from: a */
    static String m15776a(Throwable th, C4470i1 i1Var) {
        StringBuilder sb = new StringBuilder();
        String name = th.getClass().getName();
        sb.append("\nexception_class: ");
        sb.append(name);
        sb.append("\navailable_cpus: ");
        sb.append(C4614w3.m16029e());
        if (i1Var != null) {
            sb.append("\nsession_id: ");
            sb.append(i1Var);
        }
        return sb.toString();
    }

    /* renamed from: a */
    static String m15775a(Throwable th) {
        StringWriter stringWriter = new StringWriter();
        th.printStackTrace(new PrintWriter(stringWriter));
        String obj = stringWriter.toString();
        return obj.length() > 5000 ? obj.substring(0, 5000) : obj;
    }

    /* renamed from: a */
    public void mo15518a(C4470i1 i1Var) {
        if (this.f11326Y == null) {
            this.f11326Y = i1Var;
            return;
        }
        String str = f11321Z;
        StringBuilder sb = new StringBuilder();
        sb.append("Session id can only be set once. Doing nothing. Given session id: ");
        sb.append(i1Var);
        C1557c.m7458a(str, sb.toString());
    }

    /* renamed from: a */
    public void mo15519a(String str) {
        if (this.f11325X == null) {
            this.f11325X = str;
            return;
        }
        String str2 = f11321Z;
        StringBuilder sb = new StringBuilder();
        sb.append("User id can only be set once. Doing nothing. Given user id: ");
        sb.append(str);
        C1557c.m7458a(str2, sb.toString());
    }
}
