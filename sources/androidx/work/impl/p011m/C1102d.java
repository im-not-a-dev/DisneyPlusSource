package androidx.work.impl.p011m;

/* renamed from: androidx.work.impl.m.d */
/* compiled from: SystemIdInfo */
public class C1102d {

    /* renamed from: a */
    public final String f4269a;

    /* renamed from: b */
    public final int f4270b;

    public C1102d(String str, int i) {
        this.f4269a = str;
        this.f4270b = i;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C1102d.class != obj.getClass()) {
            return false;
        }
        C1102d dVar = (C1102d) obj;
        if (this.f4270b != dVar.f4270b) {
            return false;
        }
        return this.f4269a.equals(dVar.f4269a);
    }

    public int hashCode() {
        return (this.f4269a.hashCode() * 31) + this.f4270b;
    }
}
