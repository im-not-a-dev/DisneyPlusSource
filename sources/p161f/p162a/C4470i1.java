package p161f.p162a;

import com.appboy.p030r.C1535e;
import java.util.UUID;

/* renamed from: f.a.i1 */
public final class C4470i1 implements C1535e<String> {

    /* renamed from: U */
    private final String f11100U;

    /* renamed from: c */
    private final UUID f11101c;

    public C4470i1(UUID uuid) {
        this.f11101c = uuid;
        this.f11100U = uuid.toString();
    }

    /* renamed from: a */
    public static C4470i1 m15470a() {
        return new C4470i1(UUID.randomUUID());
    }

    /* renamed from: d */
    public String mo6750b() {
        return this.f11100U;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C4470i1.class != obj.getClass()) {
            return false;
        }
        return this.f11101c.equals(((C4470i1) obj).f11101c);
    }

    public int hashCode() {
        return this.f11101c.hashCode();
    }

    public String toString() {
        return this.f11100U;
    }

    /* renamed from: a */
    public static C4470i1 m15471a(String str) {
        return new C4470i1(UUID.fromString(str));
    }
}
