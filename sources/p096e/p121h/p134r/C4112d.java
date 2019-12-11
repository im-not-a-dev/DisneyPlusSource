package p096e.p121h.p134r;

/* renamed from: e.h.r.d */
/* compiled from: Pair */
public class C4112d<F, S> {

    /* renamed from: a */
    public final F f10379a;

    /* renamed from: b */
    public final S f10380b;

    public C4112d(F f, S s) {
        this.f10379a = f;
        this.f10380b = s;
    }

    public boolean equals(Object obj) {
        boolean z = false;
        if (!(obj instanceof C4112d)) {
            return false;
        }
        C4112d dVar = (C4112d) obj;
        if (C4111c.m14086a(dVar.f10379a, this.f10379a) && C4111c.m14086a(dVar.f10380b, this.f10380b)) {
            z = true;
        }
        return z;
    }

    public int hashCode() {
        F f = this.f10379a;
        int i = 0;
        int hashCode = f == null ? 0 : f.hashCode();
        S s = this.f10380b;
        if (s != null) {
            i = s.hashCode();
        }
        return hashCode ^ i;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Pair{");
        sb.append(String.valueOf(this.f10379a));
        sb.append(" ");
        sb.append(String.valueOf(this.f10380b));
        sb.append("}");
        return sb.toString();
    }
}
