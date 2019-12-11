package com.bamtech.sdk4.paywall;

import com.bamtech.core.annotations.android.DontObfuscate;
import com.bamtech.shadow.gson.p050r.C2246c;
import java.util.List;
import kotlin.Metadata;

@DontObfuscate
@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J\t\u0010\u0012\u001a\u00020\bHÆ\u0003J-\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\b\b\u0002\u0010\u0007\u001a\u00020\bHÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\bHÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u001c\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001a"}, mo31007d2 = {"Lcom/bamtech/sdk4/paywall/Paywall;", "", "accountEntitlementContext", "Lcom/bamtech/sdk4/paywall/AccountEntitlementContext;", "products", "", "Lcom/bamtech/sdk4/paywall/Product;", "paywallHash", "", "(Lcom/bamtech/sdk4/paywall/AccountEntitlementContext;Ljava/util/List;Ljava/lang/String;)V", "getAccountEntitlementContext", "()Lcom/bamtech/sdk4/paywall/AccountEntitlementContext;", "getPaywallHash", "()Ljava/lang/String;", "getProducts", "()Ljava/util/List;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "plugin-paywall"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* compiled from: Paywall.kt */
public final class Paywall {
    @C2246c("context")
    private final AccountEntitlementContext accountEntitlementContext;
    private final String paywallHash;
    @C2246c("skus")
    private final List<Product> products;

    public Paywall(AccountEntitlementContext accountEntitlementContext2, List<Product> list, String str) {
        this.accountEntitlementContext = accountEntitlementContext2;
        this.products = list;
        this.paywallHash = str;
    }

    /* JADX WARNING: Incorrect type for immutable var: ssa=java.util.List, code=java.util.List<com.bamtech.sdk4.paywall.Product>, for r2v0, types: [java.util.List] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static /* synthetic */ com.bamtech.sdk4.paywall.Paywall copy$default(com.bamtech.sdk4.paywall.Paywall r0, com.bamtech.sdk4.paywall.AccountEntitlementContext r1, java.util.List<com.bamtech.sdk4.paywall.Product> r2, java.lang.String r3, int r4, java.lang.Object r5) {
        /*
            r5 = r4 & 1
            if (r5 == 0) goto L_0x0006
            com.bamtech.sdk4.paywall.AccountEntitlementContext r1 = r0.accountEntitlementContext
        L_0x0006:
            r5 = r4 & 2
            if (r5 == 0) goto L_0x000c
            java.util.List<com.bamtech.sdk4.paywall.Product> r2 = r0.products
        L_0x000c:
            r4 = r4 & 4
            if (r4 == 0) goto L_0x0012
            java.lang.String r3 = r0.paywallHash
        L_0x0012:
            com.bamtech.sdk4.paywall.Paywall r0 = r0.copy(r1, r2, r3)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bamtech.sdk4.paywall.Paywall.copy$default(com.bamtech.sdk4.paywall.Paywall, com.bamtech.sdk4.paywall.AccountEntitlementContext, java.util.List, java.lang.String, int, java.lang.Object):com.bamtech.sdk4.paywall.Paywall");
    }

    public final AccountEntitlementContext component1() {
        return this.accountEntitlementContext;
    }

    public final List<Product> component2() {
        return this.products;
    }

    public final String component3() {
        return this.paywallHash;
    }

    public final Paywall copy(AccountEntitlementContext accountEntitlementContext2, List<Product> list, String str) {
        return new Paywall(accountEntitlementContext2, list, str);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0024, code lost:
        if (kotlin.jvm.internal.C12880j.m40224a((java.lang.Object) r2.paywallHash, (java.lang.Object) r3.paywallHash) != false) goto L_0x0029;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean equals(java.lang.Object r3) {
        /*
            r2 = this;
            if (r2 == r3) goto L_0x0029
            boolean r0 = r3 instanceof com.bamtech.sdk4.paywall.Paywall
            if (r0 == 0) goto L_0x0027
            com.bamtech.sdk4.paywall.Paywall r3 = (com.bamtech.sdk4.paywall.Paywall) r3
            com.bamtech.sdk4.paywall.AccountEntitlementContext r0 = r2.accountEntitlementContext
            com.bamtech.sdk4.paywall.AccountEntitlementContext r1 = r3.accountEntitlementContext
            boolean r0 = kotlin.jvm.internal.C12880j.m40224a(r0, r1)
            if (r0 == 0) goto L_0x0027
            java.util.List<com.bamtech.sdk4.paywall.Product> r0 = r2.products
            java.util.List<com.bamtech.sdk4.paywall.Product> r1 = r3.products
            boolean r0 = kotlin.jvm.internal.C12880j.m40224a(r0, r1)
            if (r0 == 0) goto L_0x0027
            java.lang.String r0 = r2.paywallHash
            java.lang.String r3 = r3.paywallHash
            boolean r3 = kotlin.jvm.internal.C12880j.m40224a(r0, r3)
            if (r3 == 0) goto L_0x0027
            goto L_0x0029
        L_0x0027:
            r3 = 0
            return r3
        L_0x0029:
            r3 = 1
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bamtech.sdk4.paywall.Paywall.equals(java.lang.Object):boolean");
    }

    public final AccountEntitlementContext getAccountEntitlementContext() {
        return this.accountEntitlementContext;
    }

    public final String getPaywallHash() {
        return this.paywallHash;
    }

    public final List<Product> getProducts() {
        return this.products;
    }

    public int hashCode() {
        AccountEntitlementContext accountEntitlementContext2 = this.accountEntitlementContext;
        int i = 0;
        int hashCode = (accountEntitlementContext2 != null ? accountEntitlementContext2.hashCode() : 0) * 31;
        List<Product> list = this.products;
        int hashCode2 = (hashCode + (list != null ? list.hashCode() : 0)) * 31;
        String str = this.paywallHash;
        if (str != null) {
            i = str.hashCode();
        }
        return hashCode2 + i;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Paywall(accountEntitlementContext=");
        sb.append(this.accountEntitlementContext);
        sb.append(", products=");
        sb.append(this.products);
        sb.append(", paywallHash=");
        sb.append(this.paywallHash);
        sb.append(")");
        return sb.toString();
    }
}
