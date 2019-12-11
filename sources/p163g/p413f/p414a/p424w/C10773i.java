package p163g.p413f.p414a.p424w;

/* renamed from: g.f.a.w.i */
/* compiled from: MultiClassKey */
public class C10773i {

    /* renamed from: a */
    private Class<?> f25485a;

    /* renamed from: b */
    private Class<?> f25486b;

    /* renamed from: c */
    private Class<?> f25487c;

    public C10773i() {
    }

    /* renamed from: a */
    public void mo27815a(Class<?> cls, Class<?> cls2, Class<?> cls3) {
        this.f25485a = cls;
        this.f25486b = cls2;
        this.f25487c = cls3;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C10773i.class != obj.getClass()) {
            return false;
        }
        C10773i iVar = (C10773i) obj;
        return this.f25485a.equals(iVar.f25485a) && this.f25486b.equals(iVar.f25486b) && C10775k.m34034b((Object) this.f25487c, (Object) iVar.f25487c);
    }

    public int hashCode() {
        int hashCode = ((this.f25485a.hashCode() * 31) + this.f25486b.hashCode()) * 31;
        Class<?> cls = this.f25487c;
        return hashCode + (cls != null ? cls.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("MultiClassKey{first=");
        sb.append(this.f25485a);
        sb.append(", second=");
        sb.append(this.f25486b);
        sb.append('}');
        return sb.toString();
    }

    public C10773i(Class<?> cls, Class<?> cls2, Class<?> cls3) {
        mo27815a(cls, cls2, cls3);
    }
}
