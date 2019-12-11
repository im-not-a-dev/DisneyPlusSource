package p161f.p162a;

import com.appboy.p030r.C1532b;
import org.json.JSONObject;

/* renamed from: f.a.j */
public final class C4476j {

    /* renamed from: a */
    private final C1532b f11107a;

    /* renamed from: b */
    private final String f11108b;

    /* renamed from: c */
    private final C4631y3 f11109c;

    public C4476j(C4631y3 y3Var, C1532b bVar, String str) {
        this.f11108b = str;
        if (bVar != null) {
            this.f11107a = bVar;
            this.f11109c = y3Var;
            return;
        }
        throw new NullPointerException();
    }

    /* renamed from: a */
    public C4631y3 mo15628a() {
        return this.f11109c;
    }

    /* renamed from: b */
    public C1532b mo15629b() {
        return this.f11107a;
    }

    /* renamed from: c */
    public String mo15630c() {
        return this.f11108b;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(C4569r3.m15868a((JSONObject) this.f11107a.mo6750b()));
        sb.append("\nTriggered Action Id: ");
        sb.append(this.f11109c.mo15473d());
        sb.append("\nUser Id: ");
        sb.append(this.f11108b);
        return sb.toString();
    }
}
