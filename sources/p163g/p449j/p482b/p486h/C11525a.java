package p163g.p449j.p482b.p486h;

/* renamed from: g.j.b.h.a */
/* compiled from: com.google.firebase:firebase-common@@17.1.0 */
final class C11525a extends C11529e {

    /* renamed from: a */
    private final String f26937a;

    /* renamed from: b */
    private final String f26938b;

    C11525a(String str, String str2) {
        if (str != null) {
            this.f26937a = str;
            if (str2 != null) {
                this.f26938b = str2;
                return;
            }
            throw new NullPointerException("Null version");
        }
        throw new NullPointerException("Null libraryName");
    }

    /* renamed from: a */
    public String mo29451a() {
        return this.f26937a;
    }

    /* renamed from: b */
    public String mo29452b() {
        return this.f26938b;
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C11529e)) {
            return false;
        }
        C11529e eVar = (C11529e) obj;
        if (!this.f26937a.equals(eVar.mo29451a()) || !this.f26938b.equals(eVar.mo29452b())) {
            z = false;
        }
        return z;
    }

    public int hashCode() {
        return ((this.f26937a.hashCode() ^ 1000003) * 1000003) ^ this.f26938b.hashCode();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("LibraryVersion{libraryName=");
        sb.append(this.f26937a);
        sb.append(", version=");
        sb.append(this.f26938b);
        sb.append("}");
        return sb.toString();
    }
}
