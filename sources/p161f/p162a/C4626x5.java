package p161f.p162a;

/* renamed from: f.a.x5 */
public enum C4626x5 {
    STRICT(false, true),
    LENIENT(true, false),
    NON_EXTENSIBLE(false, false),
    STRICT_ORDER(true, true);
    

    /* renamed from: U */
    private final boolean f11545U;

    /* renamed from: c */
    private final boolean f11546c;

    private C4626x5(boolean z, boolean z2) {
        this.f11546c = z;
        this.f11545U = z2;
    }

    /* renamed from: a */
    public boolean mo15912a() {
        return this.f11546c;
    }

    /* renamed from: b */
    public boolean mo15913b() {
        return this.f11545U;
    }
}
