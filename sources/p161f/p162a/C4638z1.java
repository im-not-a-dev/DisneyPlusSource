package p161f.p162a;

import android.net.Uri;
import com.appboy.C1440a;
import com.appboy.p025o.C1504j;
import com.appboy.p030r.C1535e;
import com.appboy.p033s.C1557c;
import com.bamtech.sdk4.internal.configuration.SubjectTokenTypes;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: f.a.z1 */
public abstract class C4638z1 extends C4500l2 implements C4453g1, C4463h2 {

    /* renamed from: f0 */
    private static final String f11577f0 = C1557c.m7461a(C4638z1.class);

    /* renamed from: V */
    private Long f11578V;

    /* renamed from: W */
    private String f11579W;

    /* renamed from: X */
    private String f11580X;

    /* renamed from: Y */
    private String f11581Y;

    /* renamed from: Z */
    private C4498l1 f11582Z;

    /* renamed from: a0 */
    private String f11583a0;

    /* renamed from: b0 */
    private C1504j f11584b0;

    /* renamed from: c0 */
    private C4535o1 f11585c0;

    /* renamed from: d0 */
    private C4517n1 f11586d0;

    /* renamed from: e0 */
    private C4404b1 f11587e0;

    protected C4638z1(Uri uri, Map<String, String> map) {
        super(uri, map);
    }

    /* renamed from: a */
    public Uri mo15622a() {
        return C1440a.m6910a(this.f11163U);
    }

    /* renamed from: b */
    public void mo15584b(String str) {
        this.f11583a0 = str;
    }

    /* renamed from: c */
    public C4498l1 mo15585c() {
        return this.f11582Z;
    }

    /* renamed from: d */
    public void mo15587d(String str) {
        this.f11580X = str;
    }

    /* renamed from: e */
    public C4535o1 mo15588e() {
        return this.f11585c0;
    }

    /* renamed from: f */
    public C4517n1 mo15589f() {
        return this.f11586d0;
    }

    /* renamed from: g */
    public boolean mo15461g() {
        return mo15457d();
    }

    /* renamed from: h */
    public C4404b1 mo15590h() {
        return this.f11587e0;
    }

    /* renamed from: i */
    public JSONObject mo15462i() {
        JSONObject jSONObject = new JSONObject();
        try {
            if (this.f11583a0 != null) {
                jSONObject.put("app_version", this.f11583a0);
            }
            if (this.f11579W != null) {
                jSONObject.put("device_id", this.f11579W);
            }
            if (this.f11578V != null) {
                jSONObject.put("time", this.f11578V);
            }
            if (this.f11580X != null) {
                jSONObject.put("api_key", this.f11580X);
            }
            if (this.f11581Y != null) {
                jSONObject.put("sdk_version", this.f11581Y);
            }
            if (this.f11582Z != null && !this.f11582Z.mo15457d()) {
                jSONObject.put(SubjectTokenTypes.DEVICE, this.f11582Z.mo6750b());
            }
            if (this.f11585c0 != null && !this.f11585c0.mo15457d()) {
                jSONObject.put("attributes", this.f11585c0.mo6750b());
            }
            if (this.f11587e0 != null && !this.f11587e0.mo15457d()) {
                jSONObject.put("events", C4569r3.m15871a((Collection<? extends C1535e<T>>) this.f11587e0.mo15456a()));
            }
            if (this.f11584b0 != null) {
                jSONObject.put("sdk_flavor", this.f11584b0.mo6750b());
            }
            return jSONObject;
        } catch (JSONException e) {
            C1557c.m7474e(f11577f0, "Experienced JSONException while retrieving parameters. Returning null.", e);
            return null;
        }
    }

    /* renamed from: k */
    public String mo15954k() {
        return this.f11580X;
    }

    /* renamed from: a */
    public void mo15583a(String str) {
        this.f11579W = str;
    }

    /* renamed from: b */
    public void mo15624b(C4419d dVar) {
        C1557c.m7471d(f11577f0, "Request started");
        C4517n1 n1Var = this.f11586d0;
        if (n1Var != null && n1Var.mo15711g()) {
            dVar.mo15485a(new C4563r(this), C4563r.class);
        }
    }

    /* renamed from: c */
    public void mo15586c(String str) {
        this.f11581Y = str;
    }

    /* renamed from: d */
    public boolean mo15457d() {
        ArrayList<C4453g1> arrayList = new ArrayList<>();
        arrayList.add(this.f11582Z);
        arrayList.add(this.f11585c0);
        arrayList.add(this.f11587e0);
        for (C4453g1 g1Var : arrayList) {
            if (g1Var != null && !g1Var.mo15457d()) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: a */
    public void mo15581a(C4498l1 l1Var) {
        this.f11582Z = l1Var;
    }

    /* renamed from: a */
    public void mo15578a(long j) {
        this.f11578V = Long.valueOf(j);
    }

    /* renamed from: a */
    public void mo15579a(C1504j jVar) {
        this.f11584b0 = jVar;
    }

    /* renamed from: a */
    public void mo15582a(C4535o1 o1Var) {
        this.f11585c0 = o1Var;
    }

    /* renamed from: a */
    public void mo15953a(C4517n1 n1Var) {
        this.f11586d0 = n1Var;
    }

    /* renamed from: a */
    public void mo15580a(C4404b1 b1Var) {
        this.f11587e0 = b1Var;
    }

    /* renamed from: a */
    public void mo15527a(C4419d dVar, C4419d dVar2, C4612w1 w1Var) {
        String a = w1Var.mo15834a();
        String str = f11577f0;
        StringBuilder sb = new StringBuilder();
        sb.append("Error occurred while executing Braze request: ");
        sb.append(a);
        C1557c.m7465b(str, sb.toString());
        if (a != null && a.equals("invalid_api_key")) {
            String str2 = "******************************************************************";
            C1557c.m7465b(f11577f0, str2);
            C1557c.m7465b(f11577f0, "**                        !! WARNING !!                         **");
            C1557c.m7465b(f11577f0, "**  The current API key/endpoint combination is invalid. This   **");
            C1557c.m7465b(f11577f0, "** is potentially an integration error. Please ensure that your **");
            C1557c.m7465b(f11577f0, "**     API key AND custom endpoint information are correct.     **");
            String str3 = f11577f0;
            StringBuilder sb2 = new StringBuilder();
            sb2.append(">> API key    : ");
            sb2.append(mo15954k());
            C1557c.m7465b(str3, sb2.toString());
            String str4 = f11577f0;
            StringBuilder sb3 = new StringBuilder();
            sb3.append(">> Request Uri: ");
            sb3.append(mo15622a());
            C1557c.m7465b(str4, sb3.toString());
            C1557c.m7465b(f11577f0, str2);
        }
    }

    /* renamed from: a */
    public void mo15623a(C4419d dVar) {
        C4517n1 n1Var = this.f11586d0;
        if (n1Var != null && n1Var.mo15711g()) {
            C1557c.m7458a(f11577f0, "Trigger dispatch completed. Alerting subscribers.");
            dVar.mo15485a(new C4554q(this), C4554q.class);
        }
    }

    /* renamed from: a */
    public void mo15459a(Map<String, String> map) {
        map.put("X-Braze-Api-Key", this.f11580X);
    }
}
