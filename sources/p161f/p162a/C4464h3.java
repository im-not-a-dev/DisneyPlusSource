package p161f.p162a;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import com.appboy.p025o.C1499g;
import com.appboy.p025o.C1501h;
import com.appboy.p025o.C1502i;
import com.appboy.p033s.C1557c;
import com.appboy.p033s.C1559e;
import com.appboy.p033s.C1563i;
import com.appboy.p033s.C1564j;
import java.util.Date;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: f.a.h3 */
public class C4464h3 extends C4557q2<C4535o1> {

    /* renamed from: j */
    private static final String f11083j = C1557c.m7461a(C4464h3.class);

    /* renamed from: d */
    private final C4628y0 f11084d;

    /* renamed from: e */
    private final C4424d3 f11085e;

    /* renamed from: f */
    private final String f11086f;

    /* renamed from: g */
    private final C4415c3 f11087g;

    /* renamed from: h */
    final SharedPreferences f11088h;

    /* renamed from: i */
    final SharedPreferences f11089i;

    public C4464h3(Context context, C4628y0 y0Var, C4424d3 d3Var, C4415c3 c3Var) {
        this(context, null, null, y0Var, d3Var, c3Var);
    }

    /* renamed from: b */
    public synchronized void mo15601b(String str) {
        m15436c("first_name", str);
    }

    /* renamed from: c */
    public synchronized void mo15603c(String str) {
        m15436c("last_name", str);
    }

    /* renamed from: d */
    public synchronized boolean mo15605d(String str) {
        if (str != null) {
            try {
                str = str.trim();
            } catch (Throwable th) {
                throw th;
            }
        }
        if (str != null) {
            if (!C1564j.m7497b(str)) {
                String str2 = f11083j;
                StringBuilder sb = new StringBuilder();
                sb.append("Email address is not valid: ");
                sb.append(str);
                C1557c.m7473e(str2, sb.toString());
                return false;
            }
        }
        return m15436c("email", str);
    }

    /* renamed from: e */
    public synchronized void mo15607e(String str) {
        m15436c("country", str);
    }

    /* renamed from: f */
    public synchronized void mo15609f(String str) {
        m15436c("home_city", str);
    }

    /* renamed from: g */
    public synchronized void mo15610g(String str) {
        m15436c("language", str);
    }

    /* renamed from: h */
    public synchronized boolean mo15611h(String str) {
        if (str != null) {
            try {
                str = str.trim();
            } catch (Throwable th) {
                throw th;
            }
        }
        if (str != null) {
            if (!C1564j.m7498c(str)) {
                String str2 = f11083j;
                StringBuilder sb = new StringBuilder();
                sb.append("Phone number contains invalid characters (allowed are digits, spaces, or any of the following +.-()): ");
                sb.append(str);
                C1557c.m7473e(str2, sb.toString());
                return false;
            }
        }
        return m15436c("phone", str);
    }

    public C4464h3(Context context, String str, String str2, C4628y0 y0Var, C4424d3 d3Var, C4415c3 c3Var) {
        String a = C1563i.m7484a(context, str, str2);
        StringBuilder sb = new StringBuilder();
        sb.append("com.appboy.storage.user_cache.v3");
        sb.append(a);
        this.f11088h = context.getSharedPreferences(sb.toString(), 0);
        StringBuilder sb2 = new StringBuilder();
        sb2.append("com.appboy.storage.user_cache.push_token_store");
        sb2.append(a);
        this.f11089i = context.getSharedPreferences(sb2.toString(), 0);
        this.f11084d = y0Var;
        this.f11085e = d3Var;
        this.f11086f = str;
        this.f11087g = c3Var;
    }

    /* renamed from: c */
    private boolean m15436c(String str, Object obj) {
        JSONObject f = mo15608f();
        if (obj == null) {
            try {
                f.put(str, JSONObject.NULL);
            } catch (JSONException unused) {
                String str2 = f11083j;
                StringBuilder sb = new StringBuilder();
                sb.append("Failed to write to user object json from prefs with key: [");
                sb.append(str);
                sb.append("] value: [");
                sb.append(obj);
                sb.append("] ");
                C1557c.m7473e(str2, sb.toString());
                return false;
            }
        } else {
            f.put(str, obj);
        }
        return m15435b(f);
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x001c  */
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private org.json.JSONObject m15437g() {
        /*
            r3 = this;
            org.json.JSONObject r0 = r3.mo15608f()
            java.lang.String r1 = "custom"
            boolean r2 = r0.has(r1)
            if (r2 == 0) goto L_0x0019
            org.json.JSONObject r0 = r0.getJSONObject(r1)     // Catch:{ JSONException -> 0x0011 }
            goto L_0x001a
        L_0x0011:
            r0 = move-exception
            java.lang.String r1 = f11083j
            java.lang.String r2 = "Could not create custom attributes json object from preferences."
            com.appboy.p033s.C1557c.m7470c(r1, r2, r0)
        L_0x0019:
            r0 = 0
        L_0x001a:
            if (r0 != 0) goto L_0x0021
            org.json.JSONObject r0 = new org.json.JSONObject
            r0.<init>()
        L_0x0021:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p161f.p162a.C4464h3.m15437g():org.json.JSONObject");
    }

    /* renamed from: a */
    public synchronized void mo15596a(String str) {
        m15436c("user_id", str);
    }

    /* renamed from: b */
    public synchronized void mo15600b(C1502i iVar) {
        if (iVar == null) {
            m15436c("push_subscribe", null);
        } else {
            m15436c("push_subscribe", iVar.mo6750b());
        }
    }

    /* renamed from: e */
    public C4535o1 mo15591a() {
        if (!C1563i.m7491e(this.f11086f)) {
            mo15596a(this.f11086f);
        }
        JSONObject f = mo15608f();
        try {
            mo15597a(f);
        } catch (JSONException e) {
            C1557c.m7470c(f11083j, "Couldn't add push token to outbound json", e);
        }
        this.f11088h.edit().clear().apply();
        return new C4535o1(f);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: f */
    public JSONObject mo15608f() {
        String string = this.f11088h.getString("user_cache_attributes_object", null);
        if (string == null) {
            return new JSONObject();
        }
        try {
            return new JSONObject(string);
        } catch (JSONException e) {
            String str = f11083j;
            StringBuilder sb = new StringBuilder();
            sb.append("Failed to load user object json from prefs with json string: ");
            sb.append(string);
            C1557c.m7470c(str, sb.toString(), e);
            return new JSONObject();
        }
    }

    /* renamed from: a */
    public synchronized void mo15592a(C1499g gVar) {
        if (gVar == null) {
            m15436c("gender", null);
        } else {
            m15436c("gender", gVar.mo6750b());
        }
    }

    /* renamed from: b */
    private boolean m15435b(JSONObject jSONObject) {
        if (this.f11087g.mo15491a()) {
            C1557c.m7473e(f11083j, "SDK is disabled. Not writing to user cache.");
            return false;
        }
        Editor edit = this.f11088h.edit();
        edit.putString("user_cache_attributes_object", jSONObject.toString());
        edit.apply();
        return true;
    }

    /* renamed from: d */
    public synchronized void mo15604d() {
        C1557c.m7471d(f11083j, "Push token cache cleared.");
        this.f11089i.edit().clear().apply();
    }

    /* renamed from: a */
    public synchronized boolean mo15598a(int i, C1501h hVar, int i2) {
        if (hVar == null) {
            C1557c.m7473e(f11083j, "Month cannot be null.");
            return false;
        }
        return m15436c("dob", C4472i3.m15482a(C4472i3.m15483a(i, hVar.mo6751a(), i2), C4573r6.SHORT));
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public boolean mo15602b(String str, Object obj) {
        JSONObject g = m15437g();
        if (obj == null) {
            try {
                g.put(str, JSONObject.NULL);
            } catch (JSONException e) {
                String str2 = f11083j;
                StringBuilder sb = new StringBuilder();
                sb.append("Could not write to custom attributes json object with key: [");
                sb.append(str);
                sb.append("] value: [");
                sb.append(obj);
                sb.append("] ");
                C1557c.m7474e(str2, sb.toString(), e);
                return false;
            }
        } else {
            g.put(str, obj);
        }
        return m15436c("custom", g);
    }

    /* renamed from: a */
    public synchronized void mo15593a(C1502i iVar) {
        if (iVar == null) {
            m15436c("email_subscribe", null);
        } else {
            m15436c("email_subscribe", iVar.mo6750b());
        }
    }

    /* renamed from: a */
    public synchronized boolean mo15599a(String str, Object obj) {
        if (!C1559e.m7477a(str, this.f11085e.mo15505i())) {
            C1557c.m7473e(f11083j, "Custom attribute key cannot be null.");
            return false;
        }
        String a = C1564j.m7492a(str);
        if (!(obj instanceof Boolean) && !(obj instanceof Integer) && !(obj instanceof Float) && !(obj instanceof Long)) {
            if (!(obj instanceof Double)) {
                if (obj instanceof String) {
                    return mo15602b(a, C1564j.m7492a((String) obj));
                } else if (obj instanceof Date) {
                    return mo15602b(a, C4472i3.m15482a((Date) obj, C4573r6.LONG));
                } else if (obj instanceof String[]) {
                    return mo15602b(a, C4569r3.m15872a((T[]) (String[]) obj));
                } else {
                    String str2 = f11083j;
                    StringBuilder sb = new StringBuilder();
                    sb.append("Could not add unsupported custom attribute type with key: ");
                    sb.append(a);
                    sb.append(" and value: ");
                    sb.append(obj);
                    C1557c.m7473e(str2, sb.toString());
                    return false;
                }
            }
        }
        return mo15602b(a, obj);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo15597a(JSONObject jSONObject) {
        String a = this.f11084d.mo15916a();
        if (a == null) {
            C1557c.m7458a(f11083j, "Cannot add null push token to attributes object.");
            return;
        }
        String str = "push_token";
        String string = this.f11089i.getString(str, null);
        if (string == null || !a.equals(string)) {
            jSONObject.put(str, a);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo15595a(C4535o1 o1Var, boolean z) {
        if (o1Var == null || o1Var.mo15741a() == null) {
            C1557c.m7458a(f11083j, "Tried to confirm with a null outbound user. Doing nothing.");
            return;
        }
        JSONObject a = o1Var.mo15741a();
        String str = "push_token";
        if (z) {
            if (a.has(str)) {
                Editor edit = this.f11089i.edit();
                edit.putString(str, a.optString(str));
                edit.apply();
            }
            return;
        }
        JSONObject f = mo15608f();
        JSONObject a2 = C4569r3.m15873a(a, f);
        a2.remove(str);
        String str2 = "custom";
        JSONObject optJSONObject = f.optJSONObject(str2);
        JSONObject optJSONObject2 = a.optJSONObject(str2);
        if (optJSONObject != null && optJSONObject2 != null) {
            try {
                a2.put(str2, C4569r3.m15873a(optJSONObject2, optJSONObject));
            } catch (JSONException e) {
                C1557c.m7474e(f11083j, "Failed to add merged custom attributes back to user object.", e);
            }
        } else if (optJSONObject != null) {
            a2.put(str2, optJSONObject);
        } else if (optJSONObject2 != null) {
            a2.put(str2, optJSONObject2);
        }
        Editor edit2 = this.f11088h.edit();
        edit2.putString("user_cache_attributes_object", a2.toString());
        edit2.apply();
    }
}
