package com.bamnet.iap.p035c.p036c;

import com.android.billingclient.api.C1433s;
import java.util.List;

/* renamed from: com.bamnet.iap.c.c.h */
/* compiled from: DataWrappers.kt */
public final class C1657h {

    /* renamed from: a */
    private final List<C1433s> f5793a;

    public C1657h(List<? extends C1433s> list) {
        this.f5793a = list;
    }

    /* renamed from: a */
    public final List<C1433s> mo7290a() {
        return this.f5793a;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0010, code lost:
        if (kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r1.f5793a, (java.lang.Object) ((com.bamnet.iap.p035c.p036c.C1657h) r2).f5793a) != false) goto L_0x0015;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean equals(java.lang.Object r2) {
        /*
            r1 = this;
            if (r1 == r2) goto L_0x0015
            boolean r0 = r2 instanceof com.bamnet.iap.p035c.p036c.C1657h
            if (r0 == 0) goto L_0x0013
            com.bamnet.iap.c.c.h r2 = (com.bamnet.iap.p035c.p036c.C1657h) r2
            java.util.List<com.android.billingclient.api.s> r0 = r1.f5793a
            java.util.List<com.android.billingclient.api.s> r2 = r2.f5793a
            boolean r2 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r2)
            if (r2 == 0) goto L_0x0013
            goto L_0x0015
        L_0x0013:
            r2 = 0
            return r2
        L_0x0015:
            r2 = 1
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bamnet.iap.p035c.p036c.C1657h.equals(java.lang.Object):boolean");
    }

    public int hashCode() {
        List<C1433s> list = this.f5793a;
        if (list != null) {
            return list.hashCode();
        }
        return 0;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("ProductResult(skuDetails=");
        sb.append(this.f5793a);
        sb.append(")");
        return sb.toString();
    }
}
