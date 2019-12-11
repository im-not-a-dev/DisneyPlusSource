package p161f.p162a;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import com.appboy.p033s.C1557c;
import com.appboy.p033s.C1563i;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: f.a.g3 */
public class C4455g3 implements C4384a3 {

    /* renamed from: b */
    private static final String f11068b = C1557c.m7461a(C4455g3.class);

    /* renamed from: a */
    private final SharedPreferences f11069a;

    public C4455g3(Context context, String str, String str2) {
        StringBuilder sb = new StringBuilder();
        sb.append("com.appboy.storage.session_storage");
        sb.append(C1563i.m7484a(context, str, str2));
        this.f11069a = context.getSharedPreferences(sb.toString(), 0);
    }

    /* renamed from: a */
    public C4462h1 mo15405a() {
        JSONObject jSONObject;
        String str;
        String str2 = "";
        String str3 = "current_open_session";
        if (!this.f11069a.contains(str3)) {
            C1557c.m7458a(f11068b, "No stored open session in storage.");
            return null;
        }
        try {
            str = this.f11069a.getString(str3, str2);
            try {
                jSONObject = new JSONObject(this.f11069a.getString(str, str2));
            } catch (JSONException e) {
                e = e;
                jSONObject = null;
                String str4 = f11068b;
                StringBuilder sb = new StringBuilder();
                sb.append("Could not create new mutable session for open session with id: ");
                sb.append(str);
                sb.append(" and json data: ");
                sb.append(jSONObject);
                C1557c.m7470c(str4, sb.toString(), e);
                return null;
            }
            try {
                return new C4462h1(jSONObject);
            } catch (JSONException e2) {
                e = e2;
                String str42 = f11068b;
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Could not create new mutable session for open session with id: ");
                sb2.append(str);
                sb2.append(" and json data: ");
                sb2.append(jSONObject);
                C1557c.m7470c(str42, sb2.toString(), e);
                return null;
            }
        } catch (JSONException e3) {
            e = e3;
            str = null;
            jSONObject = null;
            String str422 = f11068b;
            StringBuilder sb22 = new StringBuilder();
            sb22.append("Could not create new mutable session for open session with id: ");
            sb22.append(str);
            sb22.append(" and json data: ");
            sb22.append(jSONObject);
            C1557c.m7470c(str422, sb22.toString(), e);
            return null;
        }
    }

    /* renamed from: b */
    public void mo15407b(C4462h1 h1Var) {
        String i1Var = h1Var.mo15570a().toString();
        JSONObject h = h1Var.mo6750b();
        Editor edit = this.f11069a.edit();
        m15397a(h);
        edit.putString(i1Var, h.toString());
        String str = "current_open_session";
        if (!h1Var.mo15576g()) {
            edit.putString(str, i1Var);
        } else if (this.f11069a.getString(str, "").equals(i1Var)) {
            edit.remove(str);
        }
        edit.apply();
    }

    /* renamed from: a */
    public void mo15406a(C4462h1 h1Var) {
        String str = "current_open_session";
        String string = this.f11069a.getString(str, null);
        String i1Var = h1Var.mo15570a().toString();
        Editor edit = this.f11069a.edit();
        edit.remove(i1Var);
        if (i1Var.equals(string)) {
            edit.remove(str);
        }
        edit.apply();
    }

    /* renamed from: a */
    private void m15397a(JSONObject jSONObject) {
        String str = "end_time";
        if (!jSONObject.has(str)) {
            try {
                jSONObject.put(str, C4472i3.m15486b());
            } catch (JSONException unused) {
                C1557c.m7465b(f11068b, "Failed to set end time to now for session json data");
            }
        }
    }
}
