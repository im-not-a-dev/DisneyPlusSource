package p161f.p162a;

import com.appboy.p030r.C1535e;
import com.appboy.p033s.C1563i;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: f.a.n1 */
public class C4517n1 implements C4453g1, C1535e<JSONObject> {

    /* renamed from: U */
    private final Boolean f11207U;

    /* renamed from: V */
    private final Boolean f11208V;

    /* renamed from: W */
    private final C4507m1 f11209W;

    /* renamed from: c */
    private final String f11210c;

    /* renamed from: f.a.n1$b */
    public static class C4519b {

        /* renamed from: a */
        private String f11211a;

        /* renamed from: b */
        private Boolean f11212b;

        /* renamed from: c */
        private Boolean f11213c;

        /* renamed from: d */
        private C4507m1 f11214d;

        /* renamed from: a */
        public C4519b mo15714a(String str) {
            this.f11211a = str;
            return this;
        }

        /* renamed from: b */
        public C4519b mo15715b() {
            this.f11213c = Boolean.valueOf(true);
            return this;
        }

        /* renamed from: c */
        public C4517n1 mo15716c() {
            C4517n1 n1Var = new C4517n1(this.f11211a, this.f11212b, this.f11213c, this.f11214d);
            return n1Var;
        }

        /* renamed from: a */
        public C4519b mo15712a() {
            this.f11212b = Boolean.valueOf(true);
            return this;
        }

        /* renamed from: a */
        public C4519b mo15713a(C4507m1 m1Var) {
            this.f11214d = m1Var;
            return this;
        }
    }

    /* renamed from: a */
    public JSONObject mo6750b() {
        JSONObject jSONObject = new JSONObject();
        try {
            if (!C1563i.m7491e(this.f11210c)) {
                jSONObject.put("user_id", this.f11210c);
            }
            if (this.f11207U != null) {
                jSONObject.put("feed", this.f11207U);
            }
            if (this.f11208V != null) {
                jSONObject.put("triggers", this.f11208V);
            }
            if (this.f11209W != null) {
                jSONObject.put("config", this.f11209W.mo6750b());
            }
            return jSONObject;
        } catch (JSONException unused) {
            return null;
        }
    }

    /* renamed from: c */
    public boolean mo15708c() {
        return this.f11209W != null;
    }

    /* renamed from: d */
    public boolean mo15457d() {
        JSONObject a = mo6750b();
        if (a.length() == 0) {
            return true;
        }
        if (a.length() == 1) {
            return a.has("user_id");
        }
        return false;
    }

    /* renamed from: e */
    public boolean mo15709e() {
        return this.f11207U != null;
    }

    /* renamed from: f */
    public boolean mo15710f() {
        return !C1563i.m7491e(this.f11210c);
    }

    /* renamed from: g */
    public boolean mo15711g() {
        return this.f11208V != null;
    }

    private C4517n1(String str, Boolean bool, Boolean bool2, C4507m1 m1Var) {
        this.f11210c = str;
        this.f11207U = bool;
        this.f11208V = bool2;
        this.f11209W = m1Var;
    }
}
