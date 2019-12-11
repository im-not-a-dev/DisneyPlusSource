package p520io.sentry.event.p550f;

import java.util.Map;
import java.util.Objects;

/* renamed from: io.sentry.event.f.k */
/* compiled from: UserInterface */
public class C12585k implements C12582h {

    /* renamed from: U */
    private final String f29179U;

    /* renamed from: V */
    private final String f29180V;

    /* renamed from: W */
    private final String f29181W;

    /* renamed from: X */
    private final Map<String, Object> f29182X;

    /* renamed from: c */
    private final String f29183c;

    public C12585k(String str, String str2, String str3, String str4, Map<String, Object> map) {
        this.f29183c = str;
        this.f29179U = str2;
        this.f29180V = str3;
        this.f29181W = str4;
        this.f29182X = map;
    }

    /* renamed from: Z */
    public String mo30763Z() {
        return "sentry.interfaces.User";
    }

    /* renamed from: a */
    public Map<String, Object> mo30833a() {
        return this.f29182X;
    }

    /* renamed from: b */
    public String mo30834b() {
        return this.f29181W;
    }

    /* renamed from: c */
    public String mo30835c() {
        return this.f29183c;
    }

    /* renamed from: d */
    public String mo30836d() {
        return this.f29180V;
    }

    /* renamed from: e */
    public String mo30837e() {
        return this.f29179U;
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (this == obj) {
            return true;
        }
        if (obj == null || C12585k.class != obj.getClass()) {
            return false;
        }
        C12585k kVar = (C12585k) obj;
        if (!Objects.equals(this.f29183c, kVar.f29183c) || !Objects.equals(this.f29179U, kVar.f29179U) || !Objects.equals(this.f29180V, kVar.f29180V) || !Objects.equals(this.f29181W, kVar.f29181W) || !Objects.equals(this.f29182X, kVar.f29182X)) {
            z = false;
        }
        return z;
    }

    public int hashCode() {
        return Objects.hash(new Object[]{this.f29183c, this.f29179U, this.f29180V, this.f29181W, this.f29182X});
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("UserInterface{id='");
        sb.append(this.f29183c);
        sb.append('\'');
        sb.append(", username='");
        sb.append(this.f29179U);
        sb.append('\'');
        sb.append(", ipAddress='");
        sb.append(this.f29180V);
        sb.append('\'');
        sb.append(", email='");
        sb.append(this.f29181W);
        sb.append('\'');
        sb.append(", data=");
        sb.append(this.f29182X);
        sb.append('}');
        return sb.toString();
    }

    public C12585k(String str, String str2, String str3, String str4) {
        this(str, str2, str3, str4, null);
    }
}
