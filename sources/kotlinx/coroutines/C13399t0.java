package kotlinx.coroutines;

/* renamed from: kotlinx.coroutines.t0 */
/* compiled from: JobSupport.kt */
final class C13399t0 implements C13238f1 {

    /* renamed from: c */
    private final boolean f29897c;

    public C13399t0(boolean z) {
        this.f29897c = z;
    }

    /* renamed from: a */
    public boolean mo34370a() {
        return this.f29897c;
    }

    /* renamed from: b */
    public C13408v1 mo34371b() {
        return null;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Empty{");
        sb.append(mo34370a() ? "Active" : "New");
        sb.append('}');
        return sb.toString();
    }
}
