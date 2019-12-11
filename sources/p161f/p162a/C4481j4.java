package p161f.p162a;

import com.appboy.p030r.p032p.C1551a;
import com.appboy.p033s.C1557c;
import java.util.Date;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: f.a.j4 */
public class C4481j4 implements C4435e4 {

    /* renamed from: X */
    private static final String f11115X = C1557c.m7461a(C4481j4.class);

    /* renamed from: U */
    private String f11116U;

    /* renamed from: V */
    private int f11117V;

    /* renamed from: W */
    private Object f11118W;

    /* renamed from: c */
    private C4615w4 f11119c;

    /* renamed from: f.a.j4$a */
    static /* synthetic */ class C4482a {

        /* renamed from: a */
        static final /* synthetic */ int[] f11120a = new int[C4615w4.values().length];

        /* JADX WARNING: Can't wrap try/catch for region: R(10:0|1|2|3|4|5|6|7|8|10) */
        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|(3:7|8|10)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0014 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001f */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x002a */
        static {
            /*
                f.a.w4[] r0 = p161f.p162a.C4615w4.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f11120a = r0
                int[] r0 = f11120a     // Catch:{ NoSuchFieldError -> 0x0014 }
                f.a.w4 r1 = p161f.p162a.C4615w4.STRING     // Catch:{ NoSuchFieldError -> 0x0014 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0014 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0014 }
            L_0x0014:
                int[] r0 = f11120a     // Catch:{ NoSuchFieldError -> 0x001f }
                f.a.w4 r1 = p161f.p162a.C4615w4.BOOLEAN     // Catch:{ NoSuchFieldError -> 0x001f }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001f }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001f }
            L_0x001f:
                int[] r0 = f11120a     // Catch:{ NoSuchFieldError -> 0x002a }
                f.a.w4 r1 = p161f.p162a.C4615w4.DATE     // Catch:{ NoSuchFieldError -> 0x002a }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x002a }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x002a }
            L_0x002a:
                int[] r0 = f11120a     // Catch:{ NoSuchFieldError -> 0x0035 }
                f.a.w4 r1 = p161f.p162a.C4615w4.NUMBER     // Catch:{ NoSuchFieldError -> 0x0035 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0035 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0035 }
            L_0x0035:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p161f.p162a.C4481j4.C4482a.<clinit>():void");
        }
    }

    C4481j4(C4615w4 w4Var, String str, int i) {
        this.f11119c = w4Var;
        this.f11116U = str;
        this.f11117V = i;
    }

    /* renamed from: c */
    private boolean m15511c(Object obj) {
        boolean z = false;
        if (!(obj instanceof String)) {
            int i = this.f11117V;
            if (i == 2 || i == 17) {
                z = true;
            }
            return z;
        }
        int i2 = this.f11117V;
        if (i2 == 1) {
            return obj.equals(this.f11118W);
        }
        if (i2 == 2) {
            return !obj.equals(this.f11118W);
        }
        if (i2 == 10) {
            return ((String) obj).matches((String) this.f11118W);
        }
        if (i2 != 17) {
            return false;
        }
        return !((String) obj).matches((String) this.f11118W);
    }

    /* renamed from: a */
    public boolean mo15493a(C4641z4 z4Var) {
        boolean z = false;
        if (!(z4Var instanceof C4386a5)) {
            return false;
        }
        C1551a f = ((C4386a5) z4Var).mo15415f();
        Object obj = null;
        if (f != null) {
            try {
                obj = f.mo6750b().opt(this.f11116U);
            } catch (Exception e) {
                C1557c.m7470c(f11115X, "Caught exception checking property filter condition.", e);
                return false;
            }
        }
        if (obj == null) {
            if (this.f11117V == 12 || this.f11117V == 17 || this.f11117V == 2) {
                z = true;
            }
            return z;
        } else if (this.f11117V == 11) {
            return true;
        } else {
            if (this.f11117V == 12) {
                return false;
            }
            int i = C4482a.f11120a[this.f11119c.ordinal()];
            if (i == 1) {
                return m15511c(obj);
            }
            if (i == 2) {
                return m15510b(obj);
            }
            if (i == 3) {
                return m15509a(obj, z4Var.mo15614c());
            }
            if (i != 4) {
                return false;
            }
            return m15508a(obj);
        }
    }

    /* renamed from: b */
    private boolean m15510b(Object obj) {
        boolean z = false;
        if (!(obj instanceof Boolean)) {
            if (this.f11117V == 2) {
                z = true;
            }
            return z;
        }
        int i = this.f11117V;
        if (i == 1) {
            return obj.equals(this.f11118W);
        }
        if (i != 2) {
            return false;
        }
        return !obj.equals(this.f11118W);
    }

    protected C4481j4(JSONObject jSONObject) {
        this((C4615w4) C4569r3.m15867a(jSONObject, "property_type", C4615w4.class, C4615w4.UNKNOWN), jSONObject.getString("property_key"), jSONObject.getInt("comparator"));
        String str = "property_value";
        if (!jSONObject.has(str)) {
            return;
        }
        if (this.f11119c.equals(C4615w4.STRING)) {
            this.f11118W = jSONObject.getString(str);
        } else if (this.f11119c.equals(C4615w4.BOOLEAN)) {
            this.f11118W = Boolean.valueOf(jSONObject.getBoolean(str));
        } else if (this.f11119c.equals(C4615w4.NUMBER)) {
            this.f11118W = Double.valueOf(jSONObject.getDouble(str));
        } else if (this.f11119c.equals(C4615w4.DATE)) {
            this.f11118W = Long.valueOf(jSONObject.getLong(str));
        }
    }

    /* renamed from: a */
    private boolean m15509a(Object obj, long j) {
        Date a = obj instanceof String ? C4472i3.m15485a((String) obj, C4573r6.LONG) : null;
        boolean z = true;
        if (a == null) {
            if (this.f11117V != 2) {
                z = false;
            }
            return z;
        }
        long a2 = C4472i3.m15481a(a);
        long longValue = ((Number) this.f11118W).longValue();
        int i = this.f11117V;
        if (i == 15) {
            if (a2 >= j + longValue) {
                z = false;
            }
            return z;
        } else if (i != 16) {
            switch (i) {
                case 1:
                    if (a2 != longValue) {
                        z = false;
                    }
                    return z;
                case 2:
                    if (a2 == longValue) {
                        z = false;
                    }
                    return z;
                case 3:
                    if (a2 <= longValue) {
                        z = false;
                    }
                    return z;
                case 4:
                    if (a2 < j - longValue) {
                        z = false;
                    }
                    return z;
                case 5:
                    if (a2 >= longValue) {
                        z = false;
                    }
                    return z;
                case 6:
                    if (a2 > j - longValue) {
                        z = false;
                    }
                    return z;
                default:
                    return false;
            }
        } else {
            if (a2 <= j + longValue) {
                z = false;
            }
            return z;
        }
    }

    /* renamed from: a */
    private boolean m15508a(Object obj) {
        boolean z = false;
        if ((obj instanceof Integer) || (obj instanceof Double)) {
            double doubleValue = ((Number) obj).doubleValue();
            double doubleValue2 = ((Number) this.f11118W).doubleValue();
            int i = this.f11117V;
            if (i == 1) {
                if (doubleValue == doubleValue2) {
                    z = true;
                }
                return z;
            } else if (i == 2) {
                if (doubleValue != doubleValue2) {
                    z = true;
                }
                return z;
            } else if (i == 3) {
                if (doubleValue > doubleValue2) {
                    z = true;
                }
                return z;
            } else if (i != 5) {
                return false;
            } else {
                if (doubleValue < doubleValue2) {
                    z = true;
                }
                return z;
            }
        } else {
            if (this.f11117V == 2) {
                z = true;
            }
            return z;
        }
    }

    /* renamed from: a */
    public JSONObject mo6750b() {
        JSONObject jSONObject = new JSONObject();
        try {
            if (!this.f11119c.equals(C4615w4.UNKNOWN)) {
                jSONObject.put("property_type", this.f11119c.toString());
            }
            jSONObject.put("property_key", this.f11116U);
            jSONObject.put("comparator", this.f11117V);
            jSONObject.put("property_value", this.f11118W);
        } catch (JSONException e) {
            C1557c.m7470c(f11115X, "Caught exception creating property filter Json.", e);
        }
        return jSONObject;
    }
}
