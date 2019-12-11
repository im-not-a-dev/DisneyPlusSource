package p161f.p162a;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import com.appboy.p024n.C1489b;
import com.appboy.p033s.C1557c;
import com.appboy.p033s.C1563i;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: f.a.u2 */
public class C4597u2 extends C4557q2<C4498l1> {

    /* renamed from: g */
    private static final String f11458g = C1557c.m7461a(C4597u2.class);

    /* renamed from: d */
    private final C1489b f11459d;

    /* renamed from: e */
    final SharedPreferences f11460e;

    /* renamed from: f */
    private C4498l1 f11461f;

    public C4597u2(Context context) {
        this(context, null, null);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public C4498l1 mo15591a() {
        JSONObject a = this.f11461f.mo6750b();
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject = new JSONObject(this.f11460e.getString("cached_device", "{}"));
        } catch (JSONException e) {
            C1557c.m7470c(f11458g, "Caught exception confirming and unlocking Json objects.", e);
        }
        JSONObject jSONObject2 = new JSONObject();
        Iterator keys = a.keys();
        while (keys.hasNext()) {
            String str = (String) keys.next();
            Object opt = a.opt(str);
            Object opt2 = jSONObject.opt(str);
            if ((opt instanceof JSONObject) || (opt instanceof JSONArray)) {
                if (opt2 != null) {
                    try {
                        if (!C4616w5.m16033a(String.valueOf(opt), String.valueOf(opt2), C4626x5.NON_EXTENSIBLE).mo15946b()) {
                        }
                    } catch (JSONException e2) {
                        C1557c.m7466b(f11458g, "Caught json exception creating dirty outbound device on a jsonObject value. Returning the whole device.", (Throwable) e2);
                        return this.f11461f;
                    }
                }
                jSONObject2.put(str, opt);
            } else if (!opt.equals(opt2)) {
                try {
                    jSONObject2.put(str, opt);
                } catch (JSONException e3) {
                    C1557c.m7470c(f11458g, "Caught json exception creating dirty outbound device. Returning the whole device.", e3);
                    return this.f11461f;
                }
            }
        }
        return C4498l1.m15570a(this.f11459d, jSONObject2);
    }

    public C4597u2(Context context, String str, String str2) {
        this.f11461f = null;
        StringBuilder sb = new StringBuilder();
        sb.append("com.appboy.storage.device_cache.v3");
        sb.append(C1563i.m7484a(context, str, str2));
        this.f11460e = context.getSharedPreferences(sb.toString(), 0);
        this.f11459d = new C1489b(context);
    }

    /* renamed from: a */
    public void mo15878a(C4498l1 l1Var) {
        this.f11461f = l1Var;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo15595a(C4498l1 l1Var, boolean z) {
        String str = "cached_device";
        if (z && l1Var != null) {
            try {
                JSONObject jSONObject = new JSONObject(this.f11460e.getString(str, "{}"));
                JSONObject a = l1Var.mo6750b();
                Editor edit = this.f11460e.edit();
                edit.putString(str, C4569r3.m15873a(jSONObject, a).toString());
                edit.apply();
            } catch (JSONException e) {
                C1557c.m7466b(f11458g, "Caught exception confirming and unlocking device cache.", (Throwable) e);
            }
        }
    }
}
