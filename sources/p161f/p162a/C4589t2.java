package p161f.p162a;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import com.appboy.p025o.C1494c;
import com.appboy.p025o.C1494c.C1495a;
import com.appboy.p027p.C1516a;
import com.appboy.p030r.p031o.C1547c;
import com.appboy.p033s.C1557c;
import com.appboy.p033s.C1563i;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: f.a.t2 */
public class C4589t2 implements C4639z2<C1516a> {

    /* renamed from: f */
    private static final String f11438f = C1557c.m7461a(C4589t2.class);

    /* renamed from: g */
    private static final Set<String> f11439g = new HashSet();

    /* renamed from: a */
    private final SharedPreferences f11440a;

    /* renamed from: b */
    private final SharedPreferences f11441b;

    /* renamed from: c */
    private final C4413c1 f11442c = new C4379a();

    /* renamed from: d */
    private final String f11443d;

    /* renamed from: e */
    private C4546p0 f11444e;

    static {
        f11439g.add(C1494c.VIEWED.mo6744a());
        f11439g.add(C1494c.DISMISSED.mo6744a());
    }

    public C4589t2(Context context, String str, String str2) {
        this.f11443d = str;
        String a = C1563i.m7484a(context, str, str2);
        StringBuilder sb = new StringBuilder();
        sb.append("com.appboy.storage.content_cards_storage_provider.metadata");
        sb.append(a);
        this.f11441b = context.getSharedPreferences(sb.toString(), 0);
        StringBuilder sb2 = new StringBuilder();
        sb2.append("com.appboy.storage.content_cards_storage_provider.cards");
        sb2.append(a);
        this.f11440a = context.getSharedPreferences(sb2.toString(), 0);
    }

    /* renamed from: e */
    private void m15922e() {
        Editor edit = this.f11441b.edit();
        edit.putLong("last_storage_update_timestamp", C4472i3.m15480a());
        edit.apply();
    }

    /* renamed from: f */
    private long m15923f() {
        return this.f11441b.getLong("last_storage_update_timestamp", 0);
    }

    /* renamed from: a */
    public void mo15838a(C4546p0 p0Var) {
        this.f11444e = p0Var;
    }

    /* renamed from: b */
    public void mo15845b(String str) {
        mo15852f(str);
        mo15842a(str, (JSONObject) null);
    }

    /* renamed from: c */
    public void mo15848c(String str) {
        mo15841a(str, C1494c.CLICKED, true);
    }

    /* renamed from: d */
    public void mo15850d(String str) {
        mo15841a(str, C1494c.VIEWED, true);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: g */
    public void mo15853g(String str) {
        Set d = mo15849d();
        d.remove(str);
        this.f11441b.edit().putStringSet("dismissed", d).apply();
    }

    /* renamed from: a */
    public void mo15840a(String str) {
        mo15841a(str, C1494c.READ, true);
    }

    /* renamed from: c */
    public long mo15847c() {
        return this.f11441b.getLong("last_full_sync_at", 0);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public Set<String> mo15849d() {
        return new HashSet(this.f11441b.getStringSet("dismissed", new HashSet()));
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: f */
    public void mo15852f(String str) {
        Set d = mo15849d();
        d.add(str);
        this.f11441b.edit().putStringSet("dismissed", d).apply();
    }

    /* renamed from: a */
    public C1516a mo15836a(C4604v1 v1Var, String str) {
        if (str == null) {
            C1557c.m7458a(f11438f, "Input user id was null. Defaulting to the empty user id");
            str = "";
        }
        if (!this.f11443d.equals(str)) {
            String str2 = f11438f;
            StringBuilder sb = new StringBuilder();
            sb.append("The received cards are for user ");
            sb.append(str);
            sb.append(" and the current user is ");
            sb.append(this.f11443d);
            sb.append(" , the cards will be discarded and no changes will be made.");
            C1557c.m7469c(str2, sb.toString());
            return null;
        }
        String str3 = f11438f;
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Updating offline Content Cards for user with id: ");
        sb2.append(str);
        C1557c.m7469c(str3, sb2.toString());
        mo15839a(v1Var);
        m15922e();
        HashSet hashSet = new HashSet();
        JSONArray d = v1Var.mo15886d();
        if (!(d == null || d.length() == 0)) {
            Set d2 = mo15849d();
            for (int i = 0; i < d.length(); i++) {
                JSONObject jSONObject = d.getJSONObject(i);
                String string = jSONObject.getString(C1494c.ID.mo6744a());
                JSONObject e = mo15851e(string);
                if (m15920a(e, jSONObject)) {
                    C1557c.m7469c(f11438f, "The server card received is older than the cached card. Discarding the server card.");
                    String str4 = f11438f;
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append("Server card json: ");
                    sb3.append(jSONObject.toString());
                    C1557c.m7458a(str4, sb3.toString());
                    String str5 = f11438f;
                    StringBuilder sb4 = new StringBuilder();
                    sb4.append("Cached card json: ");
                    sb4.append(jSONObject.toString());
                    C1557c.m7458a(str5, sb4.toString());
                } else {
                    hashSet.add(string);
                    if (jSONObject.has(C1494c.REMOVED.mo6744a()) && jSONObject.getBoolean(C1494c.REMOVED.mo6744a())) {
                        String str6 = f11438f;
                        StringBuilder sb5 = new StringBuilder();
                        sb5.append("Server card is marked as removed. Removing from card storage with id: ");
                        sb5.append(string);
                        C1557c.m7458a(str6, sb5.toString());
                        mo15853g(string);
                        mo15842a(string, (JSONObject) null);
                    } else if (d2.contains(string)) {
                        String str7 = f11438f;
                        StringBuilder sb6 = new StringBuilder();
                        sb6.append("Server card was locally dismissed already. Not adding card to storage. Server card: ");
                        sb6.append(jSONObject);
                        C1557c.m7458a(str7, sb6.toString());
                    } else if (!jSONObject.has(C1494c.DISMISSED.mo6744a()) || !jSONObject.getBoolean(C1494c.DISMISSED.mo6744a())) {
                        mo15842a(string, m15921b(e, jSONObject));
                    } else {
                        String str8 = f11438f;
                        StringBuilder sb7 = new StringBuilder();
                        sb7.append("Server card is marked as dismissed. Adding to dismissed cached and removing from card storage with id: ");
                        sb7.append(string);
                        C1557c.m7458a(str8, sb7.toString());
                        mo15852f(string);
                        mo15842a(string, (JSONObject) null);
                    }
                }
            }
        }
        if (v1Var.mo15885c()) {
            mo15843a((Set<String>) hashSet);
            mo15846b((Set<String>) hashSet);
        }
        return mo15837a(false);
    }

    /* renamed from: b */
    public long mo15844b() {
        return this.f11441b.getLong("last_card_updated_at", 0);
    }

    /* renamed from: b */
    static JSONObject m15921b(JSONObject jSONObject, JSONObject jSONObject2) {
        if (jSONObject == null) {
            return jSONObject2;
        }
        JSONObject jSONObject3 = new JSONObject();
        Iterator keys = jSONObject.keys();
        while (keys.hasNext()) {
            String str = (String) keys.next();
            jSONObject3.put(str, jSONObject.get(str));
        }
        Iterator keys2 = jSONObject2.keys();
        while (keys2.hasNext()) {
            String str2 = (String) keys2.next();
            if (f11439g.contains(str2)) {
                jSONObject3.put(str2, jSONObject.getBoolean(str2) || jSONObject2.getBoolean(str2));
            } else {
                jSONObject3.put(str2, jSONObject2.get(str2));
            }
        }
        return jSONObject3;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: e */
    public JSONObject mo15851e(String str) {
        String string = this.f11440a.getString(str, null);
        if (string == null) {
            String str2 = f11438f;
            StringBuilder sb = new StringBuilder();
            sb.append("Card not present in storage for id: ");
            sb.append(str);
            C1557c.m7458a(str2, sb.toString());
            return null;
        }
        try {
            return new JSONObject(string);
        } catch (JSONException e) {
            String str3 = f11438f;
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Failed to read card json from storage. Json: ");
            sb2.append(string);
            C1557c.m7470c(str3, sb2.toString(), e);
            return null;
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public void mo15846b(Set<String> set) {
        Set<String> keySet = this.f11440a.getAll().keySet();
        Editor edit = this.f11440a.edit();
        for (String str : keySet) {
            if (!set.contains(str)) {
                String str2 = f11438f;
                StringBuilder sb = new StringBuilder();
                sb.append("Removing card from storage with id: ");
                sb.append(str);
                C1557c.m7458a(str2, sb.toString());
                edit.remove(str);
            }
        }
        edit.apply();
    }

    /* renamed from: a */
    public C1516a mo15835a() {
        return mo15837a(true);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public C1516a mo15837a(boolean z) {
        C1495a aVar = new C1495a(true);
        Map all = this.f11440a.getAll();
        JSONArray jSONArray = new JSONArray();
        for (String put : all.values()) {
            jSONArray.put(put);
        }
        List a = C4421d1.m15261a(jSONArray, aVar, this.f11444e, (C4639z2) this, this.f11442c);
        Iterator it = a.iterator();
        while (it.hasNext()) {
            C1547c cVar = (C1547c) it.next();
            if (cVar.mo6871Q()) {
                String str = f11438f;
                StringBuilder sb = new StringBuilder();
                sb.append("Deleting expired card from storage with id: ");
                sb.append(cVar.mo6866K());
                C1557c.m7458a(str, sb.toString());
                mo15842a(cVar.mo6866K(), (JSONObject) null);
                it.remove();
            }
        }
        C1516a aVar2 = new C1516a(a, this.f11443d, m15923f(), z);
        return aVar2;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo15841a(String str, C1494c cVar, boolean z) {
        JSONObject e = mo15851e(str);
        if (e == null) {
            String str2 = f11438f;
            StringBuilder sb = new StringBuilder();
            sb.append("Can't update card field. Json cannot be parsed from disk or is not present. Id: ");
            sb.append(str);
            C1557c.m7458a(str2, sb.toString());
            return;
        }
        try {
            e.put(cVar.mo6744a(), z);
            mo15842a(str, e);
        } catch (JSONException e2) {
            String str3 = f11438f;
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Failed to update card json field to ");
            sb2.append(z);
            sb2.append(" with key: ");
            sb2.append(cVar);
            C1557c.m7470c(str3, sb2.toString(), e2);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo15839a(C4604v1 v1Var) {
        Editor edit = this.f11441b.edit();
        if (v1Var.mo15884b() != -1) {
            edit.putLong("last_card_updated_at", v1Var.mo15884b());
        }
        if (v1Var.mo15883a() != -1) {
            edit.putLong("last_full_sync_at", v1Var.mo15883a());
        }
        edit.apply();
    }

    /* renamed from: a */
    static boolean m15920a(JSONObject jSONObject, JSONObject jSONObject2) {
        boolean z = true;
        if (jSONObject2 == null) {
            return true;
        }
        if (jSONObject == null) {
            return false;
        }
        String a = C1494c.CREATED.mo6744a();
        if (!jSONObject.has(a) || !jSONObject2.has(a) || jSONObject.getLong(a) <= jSONObject2.getLong(a)) {
            z = false;
        }
        return z;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo15842a(String str, JSONObject jSONObject) {
        Editor edit = this.f11440a.edit();
        if (jSONObject != null) {
            edit.putString(str, jSONObject.toString());
        } else {
            edit.remove(str);
        }
        edit.apply();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo15843a(Set<String> set) {
        Set d = mo15849d();
        d.retainAll(set);
        this.f11441b.edit().putStringSet("dismissed", d).apply();
    }
}
