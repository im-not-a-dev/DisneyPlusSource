package com.bamtech.sdk4.internal.subscription;

import com.bamtech.core.annotations.android.DontObfuscate;
import kotlin.Metadata;

@DontObfuscate
@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B\u0007\b\u0010¢\u0006\u0002\u0010\u0002B\u0019\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0002\u0010\u0006J\u000b\u0010\u0007\u001a\u0004\u0018\u00010\u0004HÂ\u0003J\u000b\u0010\b\u001a\u0004\u0018\u00010\u0004HÂ\u0003J!\u0010\t\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0004HÖ\u0001R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0004X\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0010"}, mo31007d2 = {"Lcom/bamtech/sdk4/internal/subscription/ProductRule;", "", "()V", "id", "", "description", "(Ljava/lang/String;Ljava/lang/String;)V", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "extension-iap"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* compiled from: Subscription.kt */
public final class ProductRule {
    private final String description;

    /* renamed from: id */
    private final String f6079id;

    public ProductRule(String str, String str2) {
        this.f6079id = str;
        this.description = str2;
    }

    private final String component1() {
        return this.f6079id;
    }

    private final String component2() {
        return this.description;
    }

    public static /* synthetic */ ProductRule copy$default(ProductRule productRule, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = productRule.f6079id;
        }
        if ((i & 2) != 0) {
            str2 = productRule.description;
        }
        return productRule.copy(str, str2);
    }

    public final ProductRule copy(String str, String str2) {
        return new ProductRule(str, str2);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x001a, code lost:
        if (kotlin.jvm.internal.C12880j.m40224a((java.lang.Object) r2.description, (java.lang.Object) r3.description) != false) goto L_0x001f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean equals(java.lang.Object r3) {
        /*
            r2 = this;
            if (r2 == r3) goto L_0x001f
            boolean r0 = r3 instanceof com.bamtech.sdk4.internal.subscription.ProductRule
            if (r0 == 0) goto L_0x001d
            com.bamtech.sdk4.internal.subscription.ProductRule r3 = (com.bamtech.sdk4.internal.subscription.ProductRule) r3
            java.lang.String r0 = r2.f6079id
            java.lang.String r1 = r3.f6079id
            boolean r0 = kotlin.jvm.internal.C12880j.m40224a(r0, r1)
            if (r0 == 0) goto L_0x001d
            java.lang.String r0 = r2.description
            java.lang.String r3 = r3.description
            boolean r3 = kotlin.jvm.internal.C12880j.m40224a(r0, r3)
            if (r3 == 0) goto L_0x001d
            goto L_0x001f
        L_0x001d:
            r3 = 0
            return r3
        L_0x001f:
            r3 = 1
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bamtech.sdk4.internal.subscription.ProductRule.equals(java.lang.Object):boolean");
    }

    public int hashCode() {
        String str = this.f6079id;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.description;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("ProductRule(id=");
        sb.append(this.f6079id);
        sb.append(", description=");
        sb.append(this.description);
        sb.append(")");
        return sb.toString();
    }

    public ProductRule() {
        this(null, null);
    }
}
