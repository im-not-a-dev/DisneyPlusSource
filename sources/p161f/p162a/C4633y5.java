package p161f.p162a;

import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: f.a.y5 */
public class C4633y5 {

    /* renamed from: a */
    private boolean f11563a;

    /* renamed from: b */
    private StringBuilder f11564b;

    /* renamed from: c */
    private final List<C4600u5> f11565c;

    /* renamed from: d */
    private final List<C4600u5> f11566d;

    /* renamed from: e */
    private final List<C4600u5> f11567e;

    public C4633y5() {
        this(true, null);
    }

    /* renamed from: d */
    private String m16125d(String str, Object obj) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append("\nUnexpected: ");
        sb.append(m16122a(obj));
        sb.append("\n");
        return sb.toString();
    }

    /* renamed from: a */
    public boolean mo15944a() {
        return this.f11563a;
    }

    /* renamed from: b */
    public boolean mo15946b() {
        return !this.f11563a;
    }

    /* renamed from: c */
    public String mo15947c() {
        return this.f11564b.toString();
    }

    public String toString() {
        return this.f11564b.toString();
    }

    private C4633y5(boolean z, String str) {
        this.f11565c = new ArrayList();
        this.f11566d = new ArrayList();
        this.f11567e = new ArrayList();
        this.f11563a = z;
        if (str == null) {
            str = "";
        }
        this.f11564b = new StringBuilder(str);
    }

    /* renamed from: b */
    private String m16123b(String str, Object obj, Object obj2) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append("\nExpected: ");
        sb.append(m16122a(obj));
        sb.append("\n     got: ");
        sb.append(m16122a(obj2));
        sb.append("\n");
        return sb.toString();
    }

    /* renamed from: c */
    private String m16124c(String str, Object obj) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append("\nExpected: ");
        sb.append(m16122a(obj));
        sb.append("\n     but none found\n");
        return sb.toString();
    }

    /* renamed from: a */
    public void mo15943a(String str) {
        this.f11563a = false;
        if (this.f11564b.length() == 0) {
            this.f11564b.append(str);
            return;
        }
        StringBuilder sb = this.f11564b;
        sb.append(" ; ");
        sb.append(str);
    }

    /* renamed from: b */
    public C4633y5 mo15945b(String str, Object obj) {
        this.f11567e.add(new C4600u5(str, null, obj));
        mo15943a(m16125d(str, obj));
        return this;
    }

    /* renamed from: a */
    public C4633y5 mo15942a(String str, Object obj, Object obj2) {
        this.f11565c.add(new C4600u5(str, obj, obj2));
        mo15943a(m16123b(str, obj, obj2));
        return this;
    }

    /* renamed from: a */
    public C4633y5 mo15941a(String str, Object obj) {
        this.f11566d.add(new C4600u5(str, obj, null));
        mo15943a(m16124c(str, obj));
        return this;
    }

    /* renamed from: a */
    private static String m16122a(Object obj) {
        if (obj instanceof JSONArray) {
            return "a JSON array";
        }
        if (obj instanceof JSONObject) {
            return "a JSON object";
        }
        return obj.toString();
    }
}
