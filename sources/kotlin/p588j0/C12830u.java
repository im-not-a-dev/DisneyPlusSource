package kotlin.p588j0;

/* renamed from: kotlin.j0.u */
/* compiled from: StringNumberConversionsJVM.kt */
class C12830u extends C12829t {
    /* renamed from: a */
    public static Double m40105a(String str) {
        try {
            if (C12821n.f29503a.mo31141c(str)) {
                return Double.valueOf(Double.parseDouble(str));
            }
            return null;
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    /* renamed from: b */
    public static Float m40106b(String str) {
        try {
            if (C12821n.f29503a.mo31141c(str)) {
                return Float.valueOf(Float.parseFloat(str));
            }
            return null;
        } catch (NumberFormatException unused) {
            return null;
        }
    }
}
