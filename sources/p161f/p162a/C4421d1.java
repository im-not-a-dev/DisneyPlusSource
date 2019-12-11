package p161f.p162a;

import com.appboy.p025o.C1494c.C1495a;
import com.appboy.p025o.C1496d;
import com.appboy.p030r.p031o.C1545a;
import com.appboy.p030r.p031o.C1546b;
import com.appboy.p030r.p031o.C1547c;
import com.appboy.p030r.p031o.C1548d;
import com.appboy.p030r.p031o.C1549e;
import com.appboy.p030r.p031o.C1550f;
import com.appboy.p033s.C1557c;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: f.a.d1 */
public final class C4421d1 {

    /* renamed from: a */
    private static final String f11003a = C1557c.m7461a(C4421d1.class);

    /* renamed from: f.a.d1$a */
    static /* synthetic */ class C4422a {

        /* renamed from: a */
        static final /* synthetic */ int[] f11004a = new int[C1496d.values().length];

        /* JADX WARNING: Can't wrap try/catch for region: R(12:0|1|2|3|4|5|6|7|8|9|10|12) */
        /* JADX WARNING: Code restructure failed: missing block: B:13:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0014 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001f */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x002a */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0035 */
        static {
            /*
                com.appboy.o.d[] r0 = com.appboy.p025o.C1496d.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f11004a = r0
                int[] r0 = f11004a     // Catch:{ NoSuchFieldError -> 0x0014 }
                com.appboy.o.d r1 = com.appboy.p025o.C1496d.BANNER     // Catch:{ NoSuchFieldError -> 0x0014 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0014 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0014 }
            L_0x0014:
                int[] r0 = f11004a     // Catch:{ NoSuchFieldError -> 0x001f }
                com.appboy.o.d r1 = com.appboy.p025o.C1496d.CAPTIONED_IMAGE     // Catch:{ NoSuchFieldError -> 0x001f }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001f }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001f }
            L_0x001f:
                int[] r0 = f11004a     // Catch:{ NoSuchFieldError -> 0x002a }
                com.appboy.o.d r1 = com.appboy.p025o.C1496d.SHORT_NEWS     // Catch:{ NoSuchFieldError -> 0x002a }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x002a }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x002a }
            L_0x002a:
                int[] r0 = f11004a     // Catch:{ NoSuchFieldError -> 0x0035 }
                com.appboy.o.d r1 = com.appboy.p025o.C1496d.TEXT_ANNOUNCEMENT     // Catch:{ NoSuchFieldError -> 0x0035 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0035 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0035 }
            L_0x0035:
                int[] r0 = f11004a     // Catch:{ NoSuchFieldError -> 0x0040 }
                com.appboy.o.d r1 = com.appboy.p025o.C1496d.CONTROL     // Catch:{ NoSuchFieldError -> 0x0040 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0040 }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0040 }
            L_0x0040:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p161f.p162a.C4421d1.C4422a.<clinit>():void");
        }
    }

    /* renamed from: a */
    public static List<C1547c> m15261a(JSONArray jSONArray, C1495a aVar, C4546p0 p0Var, C4639z2 z2Var, C4413c1 c1Var) {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < jSONArray.length(); i++) {
            try {
                C1547c a = m15259a(jSONArray.optString(i), aVar, p0Var, z2Var, c1Var);
                if (a != null) {
                    arrayList.add(a);
                }
            } catch (Exception e) {
                String str = f11003a;
                StringBuilder sb = new StringBuilder();
                sb.append("Unable to create Card JSON in array. Ignoring. Was on element index: ");
                sb.append(i);
                sb.append(" of json array: ");
                sb.append(jSONArray.toString());
                C1557c.m7470c(str, sb.toString(), e);
            }
        }
        return arrayList;
    }

    /* renamed from: a */
    private static C1547c m15259a(String str, C1495a aVar, C4546p0 p0Var, C4639z2 z2Var, C4413c1 c1Var) {
        return m15260a(new JSONObject(str), aVar, p0Var, z2Var, c1Var);
    }

    /* renamed from: a */
    static C1547c m15260a(JSONObject jSONObject, C1495a aVar, C4546p0 p0Var, C4639z2 z2Var, C4413c1 c1Var) {
        int i = C4422a.f11004a[aVar.mo6746a(jSONObject).ordinal()];
        if (i == 1) {
            C1545a aVar2 = new C1545a(jSONObject, aVar, p0Var, z2Var, c1Var);
            return aVar2;
        } else if (i == 2) {
            C1546b bVar = new C1546b(jSONObject, aVar, p0Var, z2Var, c1Var);
            return bVar;
        } else if (i == 3) {
            C1549e eVar = new C1549e(jSONObject, aVar, p0Var, z2Var, c1Var);
            return eVar;
        } else if (i == 4) {
            C1550f fVar = new C1550f(jSONObject, aVar, p0Var, z2Var, c1Var);
            return fVar;
        } else if (i == 5) {
            C1548d dVar = new C1548d(jSONObject, aVar, p0Var, z2Var, c1Var);
            return dVar;
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append("Failed to construct java object from JSON [");
            sb.append(jSONObject.toString());
            sb.append("]");
            throw new JSONException(sb.toString());
        }
    }
}
