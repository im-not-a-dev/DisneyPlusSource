package p161f.p162a;

import com.appboy.p024n.C1489b;
import com.appboy.p025o.C1498f;
import com.appboy.p030r.C1535e;
import com.appboy.p033s.C1557c;
import com.appboy.p033s.C1563i;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: f.a.l1 */
public class C4498l1 implements C4453g1, C1535e<JSONObject> {

    /* renamed from: c0 */
    private static final String f11152c0 = C1557c.m7461a(C4498l1.class);

    /* renamed from: U */
    private final String f11153U;

    /* renamed from: V */
    private final String f11154V;

    /* renamed from: W */
    private final String f11155W;

    /* renamed from: X */
    private final String f11156X;

    /* renamed from: Y */
    private String f11157Y;

    /* renamed from: Z */
    private final Boolean f11158Z;

    /* renamed from: a0 */
    private final Boolean f11159a0;

    /* renamed from: b0 */
    private final C1489b f11160b0;

    /* renamed from: c */
    private final String f11161c;

    /* renamed from: f.a.l1$a */
    static /* synthetic */ class C4499a {

        /* renamed from: a */
        static final /* synthetic */ int[] f11162a = new int[C1498f.values().length];

        /* JADX WARNING: Can't wrap try/catch for region: R(16:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|(3:15|16|18)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(18:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|18) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x0040 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x004b */
        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0056 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0014 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001f */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x002a */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0035 */
        static {
            /*
                com.appboy.o.f[] r0 = com.appboy.p025o.C1498f.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f11162a = r0
                int[] r0 = f11162a     // Catch:{ NoSuchFieldError -> 0x0014 }
                com.appboy.o.f r1 = com.appboy.p025o.C1498f.TIMEZONE     // Catch:{ NoSuchFieldError -> 0x0014 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0014 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0014 }
            L_0x0014:
                int[] r0 = f11162a     // Catch:{ NoSuchFieldError -> 0x001f }
                com.appboy.o.f r1 = com.appboy.p025o.C1498f.CARRIER     // Catch:{ NoSuchFieldError -> 0x001f }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001f }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001f }
            L_0x001f:
                int[] r0 = f11162a     // Catch:{ NoSuchFieldError -> 0x002a }
                com.appboy.o.f r1 = com.appboy.p025o.C1498f.ANDROID_VERSION     // Catch:{ NoSuchFieldError -> 0x002a }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x002a }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x002a }
            L_0x002a:
                int[] r0 = f11162a     // Catch:{ NoSuchFieldError -> 0x0035 }
                com.appboy.o.f r1 = com.appboy.p025o.C1498f.RESOLUTION     // Catch:{ NoSuchFieldError -> 0x0035 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0035 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0035 }
            L_0x0035:
                int[] r0 = f11162a     // Catch:{ NoSuchFieldError -> 0x0040 }
                com.appboy.o.f r1 = com.appboy.p025o.C1498f.LOCALE     // Catch:{ NoSuchFieldError -> 0x0040 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0040 }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0040 }
            L_0x0040:
                int[] r0 = f11162a     // Catch:{ NoSuchFieldError -> 0x004b }
                com.appboy.o.f r1 = com.appboy.p025o.C1498f.MODEL     // Catch:{ NoSuchFieldError -> 0x004b }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x004b }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x004b }
            L_0x004b:
                int[] r0 = f11162a     // Catch:{ NoSuchFieldError -> 0x0056 }
                com.appboy.o.f r1 = com.appboy.p025o.C1498f.NOTIFICATIONS_ENABLED     // Catch:{ NoSuchFieldError -> 0x0056 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0056 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0056 }
            L_0x0056:
                int[] r0 = f11162a     // Catch:{ NoSuchFieldError -> 0x0062 }
                com.appboy.o.f r1 = com.appboy.p025o.C1498f.IS_BACKGROUND_RESTRICTED     // Catch:{ NoSuchFieldError -> 0x0062 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0062 }
                r2 = 8
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0062 }
            L_0x0062:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p161f.p162a.C4498l1.C4499a.<clinit>():void");
        }
    }

    public C4498l1(C1489b bVar, String str, String str2, String str3, String str4, String str5, String str6, Boolean bool, Boolean bool2) {
        this.f11160b0 = bVar;
        this.f11161c = str;
        this.f11153U = str2;
        this.f11154V = str3;
        this.f11155W = str4;
        this.f11157Y = str5;
        this.f11156X = str6;
        this.f11158Z = bool;
        this.f11159a0 = bool2;
    }

    /* renamed from: a */
    public static C4498l1 m15570a(C1489b bVar, JSONObject jSONObject) {
        JSONObject jSONObject2 = jSONObject;
        C1498f[] values = C1498f.values();
        int length = values.length;
        boolean z = false;
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        String str6 = null;
        Boolean bool = null;
        Boolean bool2 = null;
        int i = 0;
        while (i < length) {
            C1498f fVar = values[i];
            switch (C4499a.f11162a[fVar.ordinal()]) {
                case 1:
                    str5 = C1563i.m7488b(jSONObject2.optString(fVar.mo6749a()));
                    break;
                case 2:
                    str2 = C1563i.m7488b(jSONObject2.optString(fVar.mo6749a()));
                    break;
                case 3:
                    str = C1563i.m7488b(jSONObject2.optString(fVar.mo6749a()));
                    break;
                case 4:
                    str6 = C1563i.m7488b(jSONObject2.optString(fVar.mo6749a()));
                    break;
                case 5:
                    str4 = C1563i.m7488b(jSONObject2.optString(fVar.mo6749a()));
                    break;
                case 6:
                    str3 = C1563i.m7488b(jSONObject2.optString(fVar.mo6749a()));
                    break;
                case 7:
                    if (!jSONObject2.has(fVar.mo6749a())) {
                        break;
                    } else {
                        bool = Boolean.valueOf(jSONObject2.optBoolean(fVar.mo6749a(), true));
                        break;
                    }
                case 8:
                    if (!jSONObject2.has(fVar.mo6749a())) {
                        break;
                    } else {
                        bool2 = Boolean.valueOf(jSONObject2.optBoolean(fVar.mo6749a(), z));
                        break;
                    }
                default:
                    String str7 = f11152c0;
                    StringBuilder sb = new StringBuilder();
                    sb.append("Unknown key encountered in Device createFromJson ");
                    sb.append(fVar);
                    C1557c.m7465b(str7, sb.toString());
                    break;
            }
            i++;
            z = false;
        }
        C4498l1 l1Var = new C4498l1(bVar, str, str2, str3, str4, str5, str6, bool, bool2);
        return l1Var;
    }

    /* renamed from: c */
    public boolean mo15669c() {
        return mo6750b().has(C1498f.NOTIFICATIONS_ENABLED.mo6749a());
    }

    /* renamed from: d */
    public boolean mo15457d() {
        return mo6750b().length() == 0;
    }

    /* renamed from: a */
    public JSONObject mo6750b() {
        JSONObject jSONObject = new JSONObject();
        try {
            m15571a(this.f11160b0, jSONObject, C1498f.ANDROID_VERSION, this.f11161c);
            m15571a(this.f11160b0, jSONObject, C1498f.CARRIER, this.f11153U);
            m15571a(this.f11160b0, jSONObject, C1498f.MODEL, this.f11154V);
            m15571a(this.f11160b0, jSONObject, C1498f.RESOLUTION, this.f11156X);
            m15571a(this.f11160b0, jSONObject, C1498f.LOCALE, this.f11155W);
            m15571a(this.f11160b0, jSONObject, C1498f.NOTIFICATIONS_ENABLED, this.f11158Z);
            m15571a(this.f11160b0, jSONObject, C1498f.IS_BACKGROUND_RESTRICTED, this.f11159a0);
            if (!C1563i.m7490d(this.f11157Y)) {
                m15571a(this.f11160b0, jSONObject, C1498f.TIMEZONE, this.f11157Y);
            }
        } catch (JSONException e) {
            C1557c.m7470c(f11152c0, "Caught exception creating device Json.", e);
        }
        return jSONObject;
    }

    /* renamed from: a */
    static void m15571a(C1489b bVar, JSONObject jSONObject, C1498f fVar, Object obj) {
        if (!bVar.mo6718k() || bVar.mo6715h().contains(fVar)) {
            jSONObject.putOpt(fVar.mo6749a(), obj);
            return;
        }
        String str = f11152c0;
        StringBuilder sb = new StringBuilder();
        sb.append("Not adding device key <");
        sb.append(fVar);
        sb.append("> to export due to whitelist restrictions.");
        C1557c.m7471d(str, sb.toString());
    }
}
