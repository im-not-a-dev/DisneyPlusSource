package androidx.work.impl.p008l;

/* renamed from: androidx.work.impl.l.b */
/* compiled from: NetworkState */
public class C1076b {

    /* renamed from: a */
    private boolean f4229a;

    /* renamed from: b */
    private boolean f4230b;

    /* renamed from: c */
    private boolean f4231c;

    /* renamed from: d */
    private boolean f4232d;

    public C1076b(boolean z, boolean z2, boolean z3, boolean z4) {
        this.f4229a = z;
        this.f4230b = z2;
        this.f4231c = z3;
        this.f4232d = z4;
    }

    /* renamed from: a */
    public boolean mo5794a() {
        return this.f4229a;
    }

    /* renamed from: b */
    public boolean mo5795b() {
        return this.f4231c;
    }

    /* renamed from: c */
    public boolean mo5796c() {
        return this.f4232d;
    }

    /* renamed from: d */
    public boolean mo5797d() {
        return this.f4230b;
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (this == obj) {
            return true;
        }
        if (obj == null || C1076b.class != obj.getClass()) {
            return false;
        }
        C1076b bVar = (C1076b) obj;
        if (!(this.f4229a == bVar.f4229a && this.f4230b == bVar.f4230b && this.f4231c == bVar.f4231c && this.f4232d == bVar.f4232d)) {
            z = false;
        }
        return z;
    }

    public int hashCode() {
        int i = this.f4229a ? 1 : 0;
        if (this.f4230b) {
            i += 16;
        }
        if (this.f4231c) {
            i += 256;
        }
        return this.f4232d ? i + 4096 : i;
    }

    public String toString() {
        return String.format("[ Connected=%b Validated=%b Metered=%b NotRoaming=%b ]", new Object[]{Boolean.valueOf(this.f4229a), Boolean.valueOf(this.f4230b), Boolean.valueOf(this.f4231c), Boolean.valueOf(this.f4232d)});
    }
}
