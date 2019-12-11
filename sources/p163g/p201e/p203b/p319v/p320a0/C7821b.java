package p163g.p201e.p203b.p319v.p320a0;

import com.bamtech.sdk4.paywall.AccountEntitlementContext;
import com.bamtech.sdk4.paywall.Paywall;
import java.util.List;

/* renamed from: g.e.b.v.a0.b */
/* compiled from: DmgzPaywallImpl.kt */
public final class C7821b implements C7820a {

    /* renamed from: a */
    private final List<C7823d> f16911a;

    /* renamed from: b */
    private final Paywall f16912b;

    public C7821b(List<? extends C7823d> list, Paywall paywall) {
        this.f16911a = list;
        this.f16912b = paywall;
    }

    /* renamed from: a */
    public String mo20723a() {
        return this.f16912b.getPaywallHash();
    }

    /* renamed from: b */
    public List<C7823d> mo20724b() {
        return this.f16911a;
    }

    /* renamed from: c */
    public boolean mo20725c() {
        return this.f16912b.getAccountEntitlementContext() == AccountEntitlementContext.AccountExpiredEntitlement;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x001e, code lost:
        if (kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r2.f16912b, (java.lang.Object) r3.f16912b) != false) goto L_0x0023;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean equals(java.lang.Object r3) {
        /*
            r2 = this;
            if (r2 == r3) goto L_0x0023
            boolean r0 = r3 instanceof p163g.p201e.p203b.p319v.p320a0.C7821b
            if (r0 == 0) goto L_0x0021
            g.e.b.v.a0.b r3 = (p163g.p201e.p203b.p319v.p320a0.C7821b) r3
            java.util.List r0 = r2.mo20724b()
            java.util.List r1 = r3.mo20724b()
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r1)
            if (r0 == 0) goto L_0x0021
            com.bamtech.sdk4.paywall.Paywall r0 = r2.f16912b
            com.bamtech.sdk4.paywall.Paywall r3 = r3.f16912b
            boolean r3 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r3)
            if (r3 == 0) goto L_0x0021
            goto L_0x0023
        L_0x0021:
            r3 = 0
            return r3
        L_0x0023:
            r3 = 1
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: p163g.p201e.p203b.p319v.p320a0.C7821b.equals(java.lang.Object):boolean");
    }

    public int hashCode() {
        List b = mo20724b();
        int i = 0;
        int hashCode = (b != null ? b.hashCode() : 0) * 31;
        Paywall paywall = this.f16912b;
        if (paywall != null) {
            i = paywall.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("DmgzPaywallImpl(products=");
        sb.append(mo20724b());
        sb.append(", paywall=");
        sb.append(this.f16912b);
        sb.append(")");
        return sb.toString();
    }
}
