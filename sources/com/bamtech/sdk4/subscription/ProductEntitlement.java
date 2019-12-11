package com.bamtech.sdk4.subscription;

import com.bamtech.core.annotations.android.DontObfuscate;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@DontObfuscate
@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B\u0007\b\u0010¢\u0006\u0002\u0010\u0002B)\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\tJ\t\u0010\u0012\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0006HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0006HÂ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0006HÆ\u0003J5\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0006HÆ\u0001J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001J\t\u0010\u001c\u001a\u00020\u0006HÖ\u0001R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\u0006X\u0004¢\u0006\u0002\n\u0000R\u0019\u0010\n\u001a\u0004\u0018\u00010\u00068F¢\u0006\f\u0012\u0004\b\u000b\u0010\u0002\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\rR\u0013\u0010\b\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\r¨\u0006\u001d"}, mo31007d2 = {"Lcom/bamtech/sdk4/subscription/ProductEntitlement;", "", "()V", "id", "", "name", "", "desc", "partner", "(JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "description", "description$annotations", "getDescription", "()Ljava/lang/String;", "getId", "()J", "getName", "getPartner", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "extension-iap"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* compiled from: Subscription.kt */
public final class ProductEntitlement {
    private final String desc;

    /* renamed from: id */
    private final long f6087id;
    private final String name;
    private final String partner;

    public ProductEntitlement(long j, String str, String str2, String str3) {
        this.f6087id = j;
        this.name = str;
        this.desc = str2;
        this.partner = str3;
    }

    private final String component3() {
        return this.desc;
    }

    public static /* synthetic */ ProductEntitlement copy$default(ProductEntitlement productEntitlement, long j, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            j = productEntitlement.f6087id;
        }
        long j2 = j;
        if ((i & 2) != 0) {
            str = productEntitlement.name;
        }
        String str4 = str;
        if ((i & 4) != 0) {
            str2 = productEntitlement.desc;
        }
        String str5 = str2;
        if ((i & 8) != 0) {
            str3 = productEntitlement.partner;
        }
        return productEntitlement.copy(j2, str4, str5, str3);
    }

    public static /* synthetic */ void description$annotations() {
    }

    public final long component1() {
        return this.f6087id;
    }

    public final String component2() {
        return this.name;
    }

    public final String component4() {
        return this.partner;
    }

    public final ProductEntitlement copy(long j, String str, String str2, String str3) {
        ProductEntitlement productEntitlement = new ProductEntitlement(j, str, str2, str3);
        return productEntitlement;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ProductEntitlement) {
                ProductEntitlement productEntitlement = (ProductEntitlement) obj;
                if (!(this.f6087id == productEntitlement.f6087id) || !Intrinsics.areEqual((Object) this.name, (Object) productEntitlement.name) || !Intrinsics.areEqual((Object) this.desc, (Object) productEntitlement.desc) || !Intrinsics.areEqual((Object) this.partner, (Object) productEntitlement.partner)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final String getDescription() {
        return this.desc;
    }

    public final long getId() {
        return this.f6087id;
    }

    public final String getName() {
        return this.name;
    }

    public final String getPartner() {
        return this.partner;
    }

    public int hashCode() {
        long j = this.f6087id;
        int i = ((int) (j ^ (j >>> 32))) * 31;
        String str = this.name;
        int i2 = 0;
        int hashCode = (i + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.desc;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.partner;
        if (str3 != null) {
            i2 = str3.hashCode();
        }
        return hashCode2 + i2;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("ProductEntitlement(id=");
        sb.append(this.f6087id);
        sb.append(", name=");
        sb.append(this.name);
        sb.append(", desc=");
        sb.append(this.desc);
        sb.append(", partner=");
        sb.append(this.partner);
        sb.append(")");
        return sb.toString();
    }

    public ProductEntitlement() {
        this(0, "MISSING", null, null);
    }
}
