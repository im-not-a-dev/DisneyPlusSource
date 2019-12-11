package p163g.p174d.p178b.p184f0;

import java.util.Map;
import p163g.p174d.p178b.p196m0.C5306d;

/* renamed from: g.d.b.f0.a */
/* compiled from: DateRange */
public class C4956a implements Comparable<C4956a> {

    /* renamed from: U */
    public long f12168U;

    /* renamed from: V */
    public long f12169V;

    /* renamed from: W */
    public long f12170W;

    /* renamed from: X */
    public long f12171X;

    /* renamed from: Y */
    public long f12172Y;

    /* renamed from: Z */
    public Map<String, String> f12173Z;

    /* renamed from: a0 */
    public boolean f12174a0;

    /* renamed from: b0 */
    public String f12175b0;

    /* renamed from: c */
    public String f12176c;

    /* renamed from: c0 */
    public String f12177c0;

    /* renamed from: d0 */
    public final String f12178d0;

    public C4956a(String str) {
        this.f12178d0 = str;
    }

    /* renamed from: a */
    public boolean mo16417a(long j) {
        return (mo16418b() >= 0 && mo16418b() <= j) || (mo16416a() >= 0 && mo16416a() <= j);
    }

    /* renamed from: b */
    public long mo16418b() {
        return this.f12169V - this.f12168U;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C4956a.class != obj.getClass()) {
            return false;
        }
        return this.f12178d0.equals(((C4956a) obj).f12178d0);
    }

    public int hashCode() {
        return this.f12178d0.hashCode();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("DateRange{id='");
        sb.append(this.f12176c);
        sb.append('\'');
        sb.append(", startDateMs=");
        sb.append(C5306d.m17958a(this.f12169V - this.f12168U));
        sb.append(", endDateMs=");
        sb.append(C5306d.m17958a(this.f12170W - this.f12168U));
        sb.append('}');
        return sb.toString();
    }

    /* renamed from: a */
    public long mo16416a() {
        return this.f12170W - this.f12168U;
    }

    /* renamed from: a */
    public int compareTo(C4956a aVar) {
        long j = this.f12169V;
        if (j < 0) {
            j = this.f12170W;
        }
        long j2 = aVar.f12169V;
        if (j2 < 0) {
            j2 = aVar.f12170W;
        }
        int i = (j > j2 ? 1 : (j == j2 ? 0 : -1));
        if (i < 0) {
            return -1;
        }
        return i == 0 ? 0 : 1;
    }
}
