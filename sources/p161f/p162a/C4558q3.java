package p161f.p162a;

import com.appboy.p025o.p026k.C1512f;
import com.appboy.p030r.C1532b;
import com.appboy.p030r.C1537g;
import com.appboy.p030r.C1538h;
import com.appboy.p030r.C1540j;
import com.appboy.p030r.C1542l;
import com.appboy.p030r.C1543m;
import com.appboy.p033s.C1557c;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: f.a.q3 */
public final class C4558q3 {

    /* renamed from: a */
    private static final String f11346a = C1557c.m7461a(C4558q3.class);

    /* renamed from: f.a.q3$a */
    static /* synthetic */ class C4559a {

        /* renamed from: a */
        static final /* synthetic */ int[] f11347a = new int[C1512f.values().length];

        /* JADX WARNING: Can't wrap try/catch for region: R(10:0|1|2|3|4|5|6|7|8|10) */
        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|(3:7|8|10)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0014 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001f */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x002a */
        static {
            /*
                com.appboy.o.k.f[] r0 = com.appboy.p025o.p026k.C1512f.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f11347a = r0
                int[] r0 = f11347a     // Catch:{ NoSuchFieldError -> 0x0014 }
                com.appboy.o.k.f r1 = com.appboy.p025o.p026k.C1512f.FULL     // Catch:{ NoSuchFieldError -> 0x0014 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0014 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0014 }
            L_0x0014:
                int[] r0 = f11347a     // Catch:{ NoSuchFieldError -> 0x001f }
                com.appboy.o.k.f r1 = com.appboy.p025o.p026k.C1512f.MODAL     // Catch:{ NoSuchFieldError -> 0x001f }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001f }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001f }
            L_0x001f:
                int[] r0 = f11347a     // Catch:{ NoSuchFieldError -> 0x002a }
                com.appboy.o.k.f r1 = com.appboy.p025o.p026k.C1512f.SLIDEUP     // Catch:{ NoSuchFieldError -> 0x002a }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x002a }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x002a }
            L_0x002a:
                int[] r0 = f11347a     // Catch:{ NoSuchFieldError -> 0x0035 }
                com.appboy.o.k.f r1 = com.appboy.p025o.p026k.C1512f.HTML_FULL     // Catch:{ NoSuchFieldError -> 0x0035 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0035 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0035 }
            L_0x0035:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p161f.p162a.C4558q3.C4559a.<clinit>():void");
        }
    }

    /* renamed from: a */
    public static C1532b m15834a(JSONObject jSONObject, C4595u0 u0Var) {
        if (jSONObject == null) {
            try {
                C1557c.m7458a(f11346a, "In-app message Json was null. Not deserializing message.");
                return null;
            } catch (JSONException e) {
                String str = f11346a;
                StringBuilder sb = new StringBuilder();
                sb.append("Encountered JSONException processing in-app message: ");
                sb.append(C4569r3.m15868a(jSONObject));
                C1557c.m7474e(str, sb.toString(), e);
                return null;
            } catch (Exception e2) {
                String str2 = f11346a;
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Failed to deserialize the in-app message: ");
                sb2.append(C4569r3.m15868a(jSONObject));
                C1557c.m7470c(str2, sb2.toString(), e2);
                return null;
            }
        } else if (m15835a(jSONObject)) {
            C1557c.m7458a(f11346a, "Deserializing control in-app message.");
            return new C1537g(jSONObject, u0Var);
        } else {
            C1512f fVar = (C1512f) C4569r3.m15867a(jSONObject, "type", C1512f.class, null);
            if (fVar == null) {
                String str3 = f11346a;
                StringBuilder sb3 = new StringBuilder();
                sb3.append("In-app message type was null. Not deserializing message: ");
                sb3.append(C4569r3.m15868a(jSONObject));
                C1557c.m7469c(str3, sb3.toString());
                return null;
            }
            int i = C4559a.f11347a[fVar.ordinal()];
            if (i == 1) {
                return new C1538h(jSONObject, u0Var);
            }
            if (i == 2) {
                return new C1542l(jSONObject, u0Var);
            }
            if (i == 3) {
                return new C1543m(jSONObject, u0Var);
            }
            if (i == 4) {
                return new C1540j(jSONObject, u0Var);
            }
            String str4 = f11346a;
            StringBuilder sb4 = new StringBuilder();
            sb4.append("Unknown in-app message type. Not deserializing message: ");
            sb4.append(C4569r3.m15868a(jSONObject));
            C1557c.m7465b(str4, sb4.toString());
            return null;
        }
    }

    /* renamed from: a */
    static boolean m15835a(JSONObject jSONObject) {
        return jSONObject.optBoolean("is_control", false);
    }
}
