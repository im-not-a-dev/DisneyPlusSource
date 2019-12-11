package p161f.p162a;

import java.util.EnumSet;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* renamed from: f.a.v6 */
public enum C4609v6 {
    UNKNOWN("unknown"),
    NONE("none"),
    TWO_G("2g"),
    THREE_G("3g"),
    FOUR_G("4g"),
    WIFI("wifi");
    

    /* renamed from: a0 */
    private static final Map<String, C4609v6> f11489a0 = null;

    /* renamed from: c */
    private final String f11491c;

    static {
        f11489a0 = new HashMap();
        Iterator it = EnumSet.allOf(C4609v6.class).iterator();
        while (it.hasNext()) {
            C4609v6 v6Var = (C4609v6) it.next();
            f11489a0.put(v6Var.mo15888a(), v6Var);
        }
    }

    private C4609v6(String str) {
        this.f11491c = str;
    }

    /* renamed from: a */
    public String mo15888a() {
        return this.f11491c;
    }
}
