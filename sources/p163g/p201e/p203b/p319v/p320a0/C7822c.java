package p163g.p201e.p203b.p319v.p320a0;

import com.bamnet.iap.BamnetIAPProduct;
import com.bamtech.sdk4.paywall.Product;
import kotlin.jvm.internal.Intrinsics;
import org.joda.time.Period;
import org.joda.time.format.ISOPeriodFormat;

/* renamed from: g.e.b.v.a0.c */
/* compiled from: DmgzPaywallProduct.kt */
public final class C7822c implements C7823d {

    /* renamed from: a */
    private final Product f16913a;

    /* renamed from: b */
    private final BamnetIAPProduct f16914b;

    public C7822c(Product product, BamnetIAPProduct bamnetIAPProduct) {
        this.f16913a = product;
        this.f16914b = bamnetIAPProduct;
    }

    /* renamed from: a */
    public Long mo20729a() {
        return this.f16914b.mo7186d();
    }

    /* renamed from: b */
    public String mo20730b() {
        String c = this.f16914b.mo7185c();
        Intrinsics.checkReturnedValueIsNotNull((Object) c, "iapProduct.localisedPrice");
        return c;
    }

    /* renamed from: c */
    public String mo20731c() {
        return this.f16914b.mo7187e();
    }

    /* renamed from: d */
    public String mo20732d() {
        return this.f16913a.getSku();
    }

    /* renamed from: e */
    public Period mo20733e() {
        String b = this.f16914b.mo7184b();
        if (b == null) {
            return null;
        }
        Intrinsics.checkReturnedValueIsNotNull((Object) b, "it");
        if (b.length() > 0) {
            return ISOPeriodFormat.standard().parsePeriod(b);
        }
        return null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x001a, code lost:
        if (kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r2.f16914b, (java.lang.Object) r3.f16914b) != false) goto L_0x001f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean equals(java.lang.Object r3) {
        /*
            r2 = this;
            if (r2 == r3) goto L_0x001f
            boolean r0 = r3 instanceof p163g.p201e.p203b.p319v.p320a0.C7822c
            if (r0 == 0) goto L_0x001d
            g.e.b.v.a0.c r3 = (p163g.p201e.p203b.p319v.p320a0.C7822c) r3
            com.bamtech.sdk4.paywall.Product r0 = r2.f16913a
            com.bamtech.sdk4.paywall.Product r1 = r3.f16913a
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r1)
            if (r0 == 0) goto L_0x001d
            com.bamnet.iap.BamnetIAPProduct r0 = r2.f16914b
            com.bamnet.iap.BamnetIAPProduct r3 = r3.f16914b
            boolean r3 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r3)
            if (r3 == 0) goto L_0x001d
            goto L_0x001f
        L_0x001d:
            r3 = 0
            return r3
        L_0x001f:
            r3 = 1
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: p163g.p201e.p203b.p319v.p320a0.C7822c.equals(java.lang.Object):boolean");
    }

    /* renamed from: f */
    public final BamnetIAPProduct mo20735f() {
        return this.f16914b;
    }

    public int hashCode() {
        Product product = this.f16913a;
        int i = 0;
        int hashCode = (product != null ? product.hashCode() : 0) * 31;
        BamnetIAPProduct bamnetIAPProduct = this.f16914b;
        if (bamnetIAPProduct != null) {
            i = bamnetIAPProduct.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("DmgzPaywallProduct(paywallProduct=");
        sb.append(this.f16913a);
        sb.append(", iapProduct=");
        sb.append(this.f16914b);
        sb.append(")");
        return sb.toString();
    }
}
