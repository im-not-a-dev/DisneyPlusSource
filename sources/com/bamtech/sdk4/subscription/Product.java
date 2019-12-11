package com.bamtech.sdk4.subscription;

import com.bamtech.core.annotations.android.DontObfuscate;
import com.bamtech.sdk4.internal.service.ServiceError;
import com.bamtech.sdk4.internal.subscription.ProductRule;
import java.util.List;
import kotlin.Metadata;

@DontObfuscate
@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001c\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B\u0007\b\u0010¢\u0006\u0002\u0010\u0002Bg\u0012\u000e\u0010\u0003\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\t\u001a\u00020\u0005\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0005\u0012\u000e\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u0004\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012¢\u0006\u0002\u0010\u0013J\u0011\u0010#\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004HÆ\u0003J\u0010\u0010$\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\u001cJ\u000b\u0010%\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010&\u001a\u00020\u0005HÆ\u0003J\t\u0010'\u001a\u00020\u000bHÆ\u0003J\u000b\u0010(\u001a\u0004\u0018\u00010\rHÆ\u0003J\u000b\u0010)\u001a\u0004\u0018\u00010\u0005HÂ\u0003J\u0011\u0010*\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u0004HÂ\u0003J\u000b\u0010+\u001a\u0004\u0018\u00010\u0012HÂ\u0003J\u0001\u0010,\u001a\u00020\u00002\u0010\b\u0002\u0010\u0003\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\t\u001a\u00020\u00052\b\b\u0002\u0010\n\u001a\u00020\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00052\u0010\b\u0002\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u00042\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÆ\u0001¢\u0006\u0002\u0010-J\u0013\u0010.\u001a\u00020/2\b\u00100\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00101\u001a\u000202HÖ\u0001J\t\u00103\u001a\u00020\u0005HÖ\u0001R\u0019\u0010\u0003\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u001f\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u00048F¢\u0006\f\u0012\u0004\b\u0017\u0010\u0002\u001a\u0004\b\u0018\u0010\u0015R\u0013\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\n\n\u0002\u0010\u001d\u001a\u0004\b\u001b\u0010\u001cR\u0013\u0010\b\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u0005X\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u0004X\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u0012X\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\t\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u001fR\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\"¨\u00064"}, mo31007d2 = {"Lcom/bamtech/sdk4/subscription/Product;", "", "()V", "categoryCodes", "", "", "id", "", "name", "sku", "status", "Lcom/bamtech/sdk4/subscription/ProductStatus;", "error", "Lcom/bamtech/sdk4/internal/service/ServiceError;", "partner", "productEntitlements", "Lcom/bamtech/sdk4/subscription/ProductEntitlement;", "rule", "Lcom/bamtech/sdk4/internal/subscription/ProductRule;", "(Ljava/util/List;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Lcom/bamtech/sdk4/subscription/ProductStatus;Lcom/bamtech/sdk4/internal/service/ServiceError;Ljava/lang/String;Ljava/util/List;Lcom/bamtech/sdk4/internal/subscription/ProductRule;)V", "getCategoryCodes", "()Ljava/util/List;", "entitlements", "entitlements$annotations", "getEntitlements", "getError", "()Lcom/bamtech/sdk4/internal/service/ServiceError;", "getId", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getName", "()Ljava/lang/String;", "getSku", "getStatus", "()Lcom/bamtech/sdk4/subscription/ProductStatus;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Ljava/util/List;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Lcom/bamtech/sdk4/subscription/ProductStatus;Lcom/bamtech/sdk4/internal/service/ServiceError;Ljava/lang/String;Ljava/util/List;Lcom/bamtech/sdk4/internal/subscription/ProductRule;)Lcom/bamtech/sdk4/subscription/Product;", "equals", "", "other", "hashCode", "", "toString", "extension-iap"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* compiled from: Subscription.kt */
public final class Product {
    private final List<String> categoryCodes;
    private final ServiceError error;

    /* renamed from: id */
    private final Long f6086id;
    private final String name;
    private final String partner;
    private final List<ProductEntitlement> productEntitlements;
    private final ProductRule rule;
    private final String sku;
    private final ProductStatus status;

    public Product(List<String> list, Long l, String str, String str2, ProductStatus productStatus, ServiceError serviceError, String str3, List<ProductEntitlement> list2, ProductRule productRule) {
        this.categoryCodes = list;
        this.f6086id = l;
        this.name = str;
        this.sku = str2;
        this.status = productStatus;
        this.error = serviceError;
        this.partner = str3;
        this.productEntitlements = list2;
        this.rule = productRule;
    }

    private final String component7() {
        return this.partner;
    }

    private final List<ProductEntitlement> component8() {
        return this.productEntitlements;
    }

    private final ProductRule component9() {
        return this.rule;
    }

    public static /* synthetic */ Product copy$default(Product product, List list, Long l, String str, String str2, ProductStatus productStatus, ServiceError serviceError, String str3, List list2, ProductRule productRule, int i, Object obj) {
        Product product2 = product;
        int i2 = i;
        return product.copy((i2 & 1) != 0 ? product2.categoryCodes : list, (i2 & 2) != 0 ? product2.f6086id : l, (i2 & 4) != 0 ? product2.name : str, (i2 & 8) != 0 ? product2.sku : str2, (i2 & 16) != 0 ? product2.status : productStatus, (i2 & 32) != 0 ? product2.error : serviceError, (i2 & 64) != 0 ? product2.partner : str3, (i2 & 128) != 0 ? product2.productEntitlements : list2, (i2 & 256) != 0 ? product2.rule : productRule);
    }

    public static /* synthetic */ void entitlements$annotations() {
    }

    public final List<String> component1() {
        return this.categoryCodes;
    }

    public final Long component2() {
        return this.f6086id;
    }

    public final String component3() {
        return this.name;
    }

    public final String component4() {
        return this.sku;
    }

    public final ProductStatus component5() {
        return this.status;
    }

    public final ServiceError component6() {
        return this.error;
    }

    public final Product copy(List<String> list, Long l, String str, String str2, ProductStatus productStatus, ServiceError serviceError, String str3, List<ProductEntitlement> list2, ProductRule productRule) {
        Product product = new Product(list, l, str, str2, productStatus, serviceError, str3, list2, productRule);
        return product;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0060, code lost:
        if (kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r2.rule, (java.lang.Object) r3.rule) != false) goto L_0x0065;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean equals(java.lang.Object r3) {
        /*
            r2 = this;
            if (r2 == r3) goto L_0x0065
            boolean r0 = r3 instanceof com.bamtech.sdk4.subscription.Product
            if (r0 == 0) goto L_0x0063
            com.bamtech.sdk4.subscription.Product r3 = (com.bamtech.sdk4.subscription.Product) r3
            java.util.List<java.lang.String> r0 = r2.categoryCodes
            java.util.List<java.lang.String> r1 = r3.categoryCodes
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r1)
            if (r0 == 0) goto L_0x0063
            java.lang.Long r0 = r2.f6086id
            java.lang.Long r1 = r3.f6086id
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r1)
            if (r0 == 0) goto L_0x0063
            java.lang.String r0 = r2.name
            java.lang.String r1 = r3.name
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r1)
            if (r0 == 0) goto L_0x0063
            java.lang.String r0 = r2.sku
            java.lang.String r1 = r3.sku
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r1)
            if (r0 == 0) goto L_0x0063
            com.bamtech.sdk4.subscription.ProductStatus r0 = r2.status
            com.bamtech.sdk4.subscription.ProductStatus r1 = r3.status
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r1)
            if (r0 == 0) goto L_0x0063
            com.bamtech.sdk4.internal.service.ServiceError r0 = r2.error
            com.bamtech.sdk4.internal.service.ServiceError r1 = r3.error
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r1)
            if (r0 == 0) goto L_0x0063
            java.lang.String r0 = r2.partner
            java.lang.String r1 = r3.partner
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r1)
            if (r0 == 0) goto L_0x0063
            java.util.List<com.bamtech.sdk4.subscription.ProductEntitlement> r0 = r2.productEntitlements
            java.util.List<com.bamtech.sdk4.subscription.ProductEntitlement> r1 = r3.productEntitlements
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r1)
            if (r0 == 0) goto L_0x0063
            com.bamtech.sdk4.internal.subscription.ProductRule r0 = r2.rule
            com.bamtech.sdk4.internal.subscription.ProductRule r3 = r3.rule
            boolean r3 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r3)
            if (r3 == 0) goto L_0x0063
            goto L_0x0065
        L_0x0063:
            r3 = 0
            return r3
        L_0x0065:
            r3 = 1
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bamtech.sdk4.subscription.Product.equals(java.lang.Object):boolean");
    }

    public final List<String> getCategoryCodes() {
        return this.categoryCodes;
    }

    public final List<ProductEntitlement> getEntitlements() {
        return this.productEntitlements;
    }

    public final ServiceError getError() {
        return this.error;
    }

    public final Long getId() {
        return this.f6086id;
    }

    public final String getName() {
        return this.name;
    }

    public final String getSku() {
        return this.sku;
    }

    public final ProductStatus getStatus() {
        return this.status;
    }

    public int hashCode() {
        List<String> list = this.categoryCodes;
        int i = 0;
        int hashCode = (list != null ? list.hashCode() : 0) * 31;
        Long l = this.f6086id;
        int hashCode2 = (hashCode + (l != null ? l.hashCode() : 0)) * 31;
        String str = this.name;
        int hashCode3 = (hashCode2 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.sku;
        int hashCode4 = (hashCode3 + (str2 != null ? str2.hashCode() : 0)) * 31;
        ProductStatus productStatus = this.status;
        int hashCode5 = (hashCode4 + (productStatus != null ? productStatus.hashCode() : 0)) * 31;
        ServiceError serviceError = this.error;
        int hashCode6 = (hashCode5 + (serviceError != null ? serviceError.hashCode() : 0)) * 31;
        String str3 = this.partner;
        int hashCode7 = (hashCode6 + (str3 != null ? str3.hashCode() : 0)) * 31;
        List<ProductEntitlement> list2 = this.productEntitlements;
        int hashCode8 = (hashCode7 + (list2 != null ? list2.hashCode() : 0)) * 31;
        ProductRule productRule = this.rule;
        if (productRule != null) {
            i = productRule.hashCode();
        }
        return hashCode8 + i;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Product(categoryCodes=");
        sb.append(this.categoryCodes);
        sb.append(", id=");
        sb.append(this.f6086id);
        sb.append(", name=");
        sb.append(this.name);
        sb.append(", sku=");
        sb.append(this.sku);
        sb.append(", status=");
        sb.append(this.status);
        sb.append(", error=");
        sb.append(this.error);
        sb.append(", partner=");
        sb.append(this.partner);
        sb.append(", productEntitlements=");
        sb.append(this.productEntitlements);
        sb.append(", rule=");
        sb.append(this.rule);
        sb.append(")");
        return sb.toString();
    }

    public Product() {
        this(C13185o.m40513a(), null, null, "MISSING", ProductStatus.UNKNOWN, null, null, null, null);
    }
}
