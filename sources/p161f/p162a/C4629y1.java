package p161f.p162a;

import com.appboy.p033s.C1557c;
import java.util.HashSet;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: f.a.y1 */
public class C4629y1 {

    /* renamed from: l */
    private static final String f11550l = C1557c.m7461a(C4629y1.class);

    /* renamed from: a */
    private long f11551a;

    /* renamed from: b */
    private Set<String> f11552b;

    /* renamed from: c */
    private Set<String> f11553c;

    /* renamed from: d */
    private Set<String> f11554d;

    /* renamed from: e */
    private int f11555e = -1;

    /* renamed from: f */
    private int f11556f = -1;

    /* renamed from: g */
    private int f11557g = -1;

    /* renamed from: h */
    private boolean f11558h = false;

    /* renamed from: i */
    private boolean f11559i = false;

    /* renamed from: j */
    private long f11560j = -1;

    /* renamed from: k */
    private boolean f11561k = false;

    public C4629y1() {
    }

    /* renamed from: a */
    public long mo15918a() {
        return this.f11551a;
    }

    /* renamed from: b */
    public Set<String> mo15923b() {
        return this.f11552b;
    }

    /* renamed from: c */
    public Set<String> mo15928c() {
        return this.f11553c;
    }

    /* renamed from: d */
    public Set<String> mo15932d() {
        return this.f11554d;
    }

    /* renamed from: e */
    public long mo15933e() {
        return this.f11560j;
    }

    /* renamed from: f */
    public int mo15934f() {
        return this.f11555e;
    }

    /* renamed from: g */
    public int mo15935g() {
        return this.f11556f;
    }

    /* renamed from: h */
    public int mo15936h() {
        return this.f11557g;
    }

    /* renamed from: i */
    public boolean mo15937i() {
        return this.f11559i;
    }

    /* renamed from: j */
    public boolean mo15938j() {
        return this.f11558h;
    }

    /* renamed from: k */
    public boolean mo15939k() {
        return this.f11561k;
    }

    /* renamed from: a */
    public void mo15920a(long j) {
        this.f11551a = j;
    }

    /* renamed from: b */
    public void mo15926b(Set<String> set) {
        this.f11553c = set;
    }

    /* renamed from: c */
    public void mo15930c(Set<String> set) {
        this.f11554d = set;
    }

    /* renamed from: a */
    public void mo15921a(Set<String> set) {
        this.f11552b = set;
    }

    /* renamed from: b */
    public void mo15925b(long j) {
        this.f11560j = j;
    }

    /* renamed from: c */
    public void mo15929c(int i) {
        this.f11557g = i;
    }

    /* renamed from: a */
    public void mo15919a(int i) {
        this.f11555e = i;
    }

    /* renamed from: b */
    public void mo15924b(int i) {
        this.f11556f = i;
    }

    /* renamed from: c */
    public void mo15931c(boolean z) {
        this.f11561k = z;
    }

    /* renamed from: a */
    public void mo15922a(boolean z) {
        this.f11559i = z;
    }

    /* renamed from: b */
    public void mo15927b(boolean z) {
        this.f11558h = z;
    }

    /* renamed from: a */
    private Set<String> m16083a(JSONObject jSONObject, String str) {
        if (jSONObject.optJSONArray(str) == null) {
            return null;
        }
        HashSet hashSet = new HashSet();
        JSONArray optJSONArray = jSONObject.optJSONArray(str);
        for (int i = 0; i < optJSONArray.length(); i++) {
            hashSet.add(optJSONArray.getString(i));
        }
        return hashSet;
    }

    public C4629y1(JSONObject jSONObject) {
        this.f11552b = m16083a(jSONObject, "events_blacklist");
        this.f11553c = m16083a(jSONObject, "attributes_blacklist");
        this.f11554d = m16083a(jSONObject, "purchases_blacklist");
        this.f11551a = jSONObject.optLong("time", 0);
        this.f11560j = jSONObject.optLong("messaging_session_timeout", -1);
        JSONObject optJSONObject = jSONObject.optJSONObject("geofences");
        if (optJSONObject != null) {
            try {
                this.f11555e = optJSONObject.getInt("min_time_since_last_request");
                this.f11556f = optJSONObject.getInt("min_time_since_last_report");
                this.f11559i = optJSONObject.getBoolean("enabled");
                this.f11558h = true;
                this.f11557g = optJSONObject.optInt("max_num_to_register", 20);
            } catch (JSONException e) {
                C1557c.m7470c(f11550l, "Required geofence fields were null. Using defaults.", e);
                this.f11555e = -1;
                this.f11556f = -1;
                this.f11557g = -1;
                this.f11559i = false;
                this.f11558h = false;
            }
        }
        JSONObject optJSONObject2 = jSONObject.optJSONObject("test_user");
        if (optJSONObject2 != null) {
            try {
                this.f11561k = optJSONObject2.getBoolean("device_logging_enabled");
            } catch (JSONException e2) {
                C1557c.m7470c(f11550l, "Required test user fields were null. Using defaults", e2);
                this.f11561k = false;
            }
        }
    }
}
