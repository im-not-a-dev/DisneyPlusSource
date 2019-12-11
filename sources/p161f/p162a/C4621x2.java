package p161f.p162a;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import com.appboy.p025o.C1494c;
import com.appboy.p025o.C1494c.C1495a;
import com.appboy.p027p.C1517b;
import com.appboy.p030r.p031o.C1547c;
import com.appboy.p033s.C1557c;
import com.appboy.p033s.C1563i;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ConcurrentSkipListSet;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: f.a.x2 */
public class C4621x2 implements C4639z2<C1517b> {

    /* renamed from: f */
    private static final String f11507f = C1557c.m7461a(C4621x2.class);

    /* renamed from: a */
    private final SharedPreferences f11508a;

    /* renamed from: b */
    private final Set<String> f11509b;

    /* renamed from: c */
    private final Set<String> f11510c;

    /* renamed from: d */
    private final C4413c1 f11511d = new C4403b0();

    /* renamed from: e */
    private C4546p0 f11512e;

    /* renamed from: f.a.x2$a */
    enum C4622a {
        READ_CARDS("read_cards_set", "read_cards_flat"),
        VIEWED_CARDS("viewed_cards_set", "viewed_cards_flat");
        

        /* renamed from: U */
        private final String f11516U;

        /* renamed from: c */
        private final String f11517c;

        private C4622a(String str, String str2) {
            this.f11517c = str;
            this.f11516U = str2;
        }

        /* renamed from: a */
        public String mo15894a() {
            return this.f11517c;
        }

        /* renamed from: b */
        public String mo15895b() {
            return this.f11516U;
        }
    }

    public C4621x2(Context context, String str) {
        String a = C1563i.m7483a(context, str == null ? "" : str);
        StringBuilder sb = new StringBuilder();
        sb.append("com.appboy.storage.feedstorageprovider");
        sb.append(a);
        this.f11508a = context.getSharedPreferences(sb.toString(), 0);
        this.f11509b = m16040a(C4622a.VIEWED_CARDS);
        this.f11510c = m16040a(C4622a.READ_CARDS);
        m16044f(str);
    }

    /* renamed from: e */
    static Set<String> m16043e(String str) {
        HashSet hashSet = new HashSet();
        if (str != null) {
            Collections.addAll(hashSet, str.split(";"));
        }
        return hashSet;
    }

    /* renamed from: f */
    private void m16044f(String str) {
        Editor edit = this.f11508a.edit();
        edit.putString("uid", str);
        edit.apply();
    }

    /* renamed from: a */
    public void mo15840a(String str) {
        if (!this.f11510c.contains(str)) {
            this.f11510c.add(str);
            mo15893a(this.f11510c, C4622a.READ_CARDS);
        }
    }

    /* renamed from: b */
    public void mo15845b(String str) {
    }

    /* renamed from: c */
    public void mo15848c(String str) {
    }

    /* renamed from: d */
    public void mo15850d(String str) {
        if (!this.f11509b.contains(str)) {
            this.f11509b.add(str);
            mo15893a(this.f11509b, C4622a.VIEWED_CARDS);
        }
    }

    /* renamed from: a */
    public void mo15892a(C4546p0 p0Var) {
        this.f11512e = p0Var;
    }

    /* renamed from: a */
    public C1517b mo15891a(JSONArray jSONArray, String str) {
        String str2 = "";
        String str3 = str == null ? str2 : str;
        String string = this.f11508a.getString("uid", str2);
        if (string.equals(str3)) {
            String str4 = f11507f;
            StringBuilder sb = new StringBuilder();
            sb.append("Updating offline feed for user with id: ");
            sb.append(str);
            C1557c.m7469c(str4, sb.toString());
            long a = C4472i3.m15480a();
            m16042a(jSONArray, a);
            this.f11509b.retainAll(m16041a(jSONArray));
            mo15893a(this.f11509b, C4622a.VIEWED_CARDS);
            this.f11510c.retainAll(m16041a(jSONArray));
            mo15893a(this.f11510c, C4622a.READ_CARDS);
            return m16039a(jSONArray, str, false, a);
        }
        String str5 = f11507f;
        StringBuilder sb2 = new StringBuilder();
        sb2.append("The received cards are for user ");
        sb2.append(str);
        sb2.append(" and the current user is ");
        sb2.append(string);
        sb2.append(" , the cards will be discarded and no changes will be made.");
        C1557c.m7469c(str5, sb2.toString());
        return null;
    }

    /* renamed from: a */
    public C1517b mo15890a() {
        return m16039a(new JSONArray(this.f11508a.getString("cards", "[]")), this.f11508a.getString("uid", ""), true, this.f11508a.getLong("cards_timestamp", -1));
    }

    /* renamed from: a */
    private C1517b m16039a(JSONArray jSONArray, String str, boolean z, long j) {
        List list;
        if (jSONArray == null || jSONArray.length() == 0) {
            list = new ArrayList();
        } else {
            list = C4421d1.m15261a(jSONArray, new C1495a(false), this.f11512e, (C4639z2) this, this.f11511d);
        }
        List<C1547c> list2 = list;
        for (C1547c cVar : list2) {
            if (this.f11509b.contains(cVar.mo6866K())) {
                cVar.mo6878f(true);
                cVar.mo6876d(true);
            }
            if (this.f11510c.contains(cVar.mo6866K())) {
                cVar.mo6876d(true);
            }
        }
        C1517b bVar = new C1517b(list2, str, z, j);
        return bVar;
    }

    /* renamed from: a */
    private Set<String> m16040a(C4622a aVar) {
        String a = aVar.mo15894a();
        String b = aVar.mo15895b();
        if (!this.f11508a.contains(b)) {
            return new ConcurrentSkipListSet(this.f11508a.getStringSet(a, new HashSet()));
        }
        Set<String> e = m16043e(this.f11508a.getString(b, null));
        Editor edit = this.f11508a.edit();
        edit.remove(b);
        edit.apply();
        mo15893a(e, aVar);
        return e;
    }

    /* renamed from: a */
    private void m16042a(JSONArray jSONArray, long j) {
        Editor edit = this.f11508a.edit();
        String str = "cards";
        if (jSONArray == null || jSONArray.length() == 0) {
            edit.remove(str);
        } else {
            edit.putString(str, jSONArray.toString());
        }
        edit.putLong("cards_timestamp", j);
        edit.apply();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo15893a(Set<String> set, C4622a aVar) {
        String a = aVar.mo15894a();
        Editor edit = this.f11508a.edit();
        if (set == null || set.isEmpty()) {
            edit.remove(a);
        } else {
            edit.putStringSet(a, set);
        }
        edit.apply();
    }

    /* renamed from: a */
    static Set<String> m16041a(JSONArray jSONArray) {
        HashSet hashSet = new HashSet();
        if (jSONArray != null) {
            for (int i = 0; i < jSONArray.length(); i++) {
                JSONObject jSONObject = jSONArray.getJSONObject(i);
                if (jSONObject.has(C1494c.ID.mo6745b())) {
                    hashSet.add(jSONObject.getString(C1494c.ID.mo6745b()));
                }
            }
        }
        return hashSet;
    }
}
