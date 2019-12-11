package p161f.p162a;

import com.appboy.p030r.C1531a;
import com.appboy.p030r.C1532b;
import com.appboy.p033s.C1557c;
import java.util.List;
import org.json.JSONArray;

/* renamed from: f.a.u1 */
public class C4596u1 {

    /* renamed from: h */
    private static final String f11450h = C1557c.m7461a(C4596u1.class);

    /* renamed from: a */
    private final JSONArray f11451a;

    /* renamed from: b */
    private final C4604v1 f11452b;

    /* renamed from: c */
    private final C1532b f11453c;

    /* renamed from: d */
    private final List<C4631y3> f11454d;

    /* renamed from: e */
    private final C4629y1 f11455e;

    /* renamed from: f */
    private final List<C1531a> f11456f;

    /* renamed from: g */
    private final C4612w1 f11457g;

    /* JADX WARNING: Removed duplicated region for block: B:23:0x0082 A[SYNTHETIC, Splitter:B:23:0x0082] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C4596u1(org.json.JSONObject r6, p161f.p162a.C4463h2 r7, p161f.p162a.C4595u0 r8) {
        /*
            r5 = this;
            r5.<init>()
            r0 = 0
            java.lang.String r1 = "error"
            java.lang.String r1 = r6.optString(r1, r0)
            if (r1 == 0) goto L_0x0014
            f.a.t1 r2 = new f.a.t1
            r2.<init>(r1)
            r5.f11457g = r2
            goto L_0x0016
        L_0x0014:
            r5.f11457g = r0
        L_0x0016:
            java.lang.String r1 = "feed"
            org.json.JSONArray r1 = r6.optJSONArray(r1)
            if (r1 == 0) goto L_0x0021
            r5.f11451a = r1
            goto L_0x0023
        L_0x0021:
            r5.f11451a = r0
        L_0x0023:
            f.a.w1 r1 = r5.f11457g
            if (r1 != 0) goto L_0x006c
            boolean r7 = r7 instanceof p161f.p162a.C4405b2
            if (r7 == 0) goto L_0x006c
            f.a.v1 r7 = new f.a.v1     // Catch:{ JSONException -> 0x004d, Exception -> 0x0031 }
            r7.<init>(r6)     // Catch:{ JSONException -> 0x004d, Exception -> 0x0031 }
            goto L_0x0069
        L_0x0031:
            r7 = move-exception
            java.lang.String r1 = f11450h
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Encountered Exception processing Content Cards response: "
            r2.append(r3)
            java.lang.String r3 = r6.toString()
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            com.appboy.p033s.C1557c.m7474e(r1, r2, r7)
            goto L_0x0068
        L_0x004d:
            r7 = move-exception
            java.lang.String r1 = f11450h
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Encountered JSONException processing Content Cards response: "
            r2.append(r3)
            java.lang.String r3 = r6.toString()
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            com.appboy.p033s.C1557c.m7474e(r1, r2, r7)
        L_0x0068:
            r7 = r0
        L_0x0069:
            r5.f11452b = r7
            goto L_0x006e
        L_0x006c:
            r5.f11452b = r0
        L_0x006e:
            java.lang.String r7 = "triggers"
            org.json.JSONArray r7 = r6.optJSONArray(r7)
            java.util.List r7 = p161f.p162a.C4584s5.m15910a(r7, r8)
            r5.f11454d = r7
            java.lang.String r7 = "config"
            org.json.JSONObject r7 = r6.optJSONObject(r7)
            if (r7 == 0) goto L_0x00c0
            f.a.y1 r1 = new f.a.y1     // Catch:{ JSONException -> 0x00a5, Exception -> 0x0089 }
            r1.<init>(r7)     // Catch:{ JSONException -> 0x00a5, Exception -> 0x0089 }
            r0 = r1
            goto L_0x00c0
        L_0x0089:
            r1 = move-exception
            java.lang.String r2 = f11450h
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "Encountered Exception processing server config: "
            r3.append(r4)
            java.lang.String r7 = r7.toString()
            r3.append(r7)
            java.lang.String r7 = r3.toString()
            com.appboy.p033s.C1557c.m7474e(r2, r7, r1)
            goto L_0x00c0
        L_0x00a5:
            r1 = move-exception
            java.lang.String r2 = f11450h
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "Encountered JSONException processing server config: "
            r3.append(r4)
            java.lang.String r7 = r7.toString()
            r3.append(r7)
            java.lang.String r7 = r3.toString()
            com.appboy.p033s.C1557c.m7474e(r2, r7, r1)
        L_0x00c0:
            r5.f11455e = r0
            java.lang.String r7 = "templated_message"
            org.json.JSONObject r7 = r6.optJSONObject(r7)
            com.appboy.r.b r7 = p161f.p162a.C4584s5.m15908a(r7, r8)
            r5.f11453c = r7
            java.lang.String r7 = "geofences"
            org.json.JSONArray r6 = r6.optJSONArray(r7)
            java.util.List r6 = p161f.p162a.C4489k3.m15541a(r6)
            r5.f11456f = r6
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p161f.p162a.C4596u1.<init>(org.json.JSONObject, f.a.h2, f.a.u0):void");
    }

    /* renamed from: a */
    public boolean mo15864a() {
        return this.f11451a != null;
    }

    /* renamed from: b */
    public boolean mo15865b() {
        return this.f11453c != null;
    }

    /* renamed from: c */
    public boolean mo15866c() {
        return this.f11455e != null;
    }

    /* renamed from: d */
    public boolean mo15867d() {
        return this.f11454d != null;
    }

    /* renamed from: e */
    public boolean mo15868e() {
        return this.f11457g != null;
    }

    /* renamed from: f */
    public boolean mo15869f() {
        return this.f11456f != null;
    }

    /* renamed from: g */
    public boolean mo15870g() {
        return this.f11452b != null;
    }

    /* renamed from: h */
    public JSONArray mo15871h() {
        return this.f11451a;
    }

    /* renamed from: i */
    public C1532b mo15872i() {
        return this.f11453c;
    }

    /* renamed from: j */
    public C4629y1 mo15873j() {
        return this.f11455e;
    }

    /* renamed from: k */
    public List<C4631y3> mo15874k() {
        return this.f11454d;
    }

    /* renamed from: l */
    public List<C1531a> mo15875l() {
        return this.f11456f;
    }

    /* renamed from: m */
    public C4604v1 mo15876m() {
        return this.f11452b;
    }

    /* renamed from: n */
    public C4612w1 mo15877n() {
        return this.f11457g;
    }
}
