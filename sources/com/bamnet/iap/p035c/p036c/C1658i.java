package com.bamnet.iap.p035c.p036c;

import com.android.billingclient.api.C1426m;
import java.util.List;

/* renamed from: com.bamnet.iap.c.c.i */
/* compiled from: DataWrappers.kt */
public final class C1658i {

    /* renamed from: a */
    private final List<C1426m> f5794a;

    public C1658i(List<? extends C1426m> list) {
        this.f5794a = list;
    }

    /* renamed from: a */
    public final List<C1426m> mo7294a() {
        return this.f5794a;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0010, code lost:
        if (kotlin.jvm.internal.C12880j.m40224a((java.lang.Object) r1.f5794a, (java.lang.Object) ((com.bamnet.iap.p035c.p036c.C1658i) r2).f5794a) != false) goto L_0x0015;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean equals(java.lang.Object r2) {
        /*
            r1 = this;
            if (r1 == r2) goto L_0x0015
            boolean r0 = r2 instanceof com.bamnet.iap.p035c.p036c.C1658i
            if (r0 == 0) goto L_0x0013
            com.bamnet.iap.c.c.i r2 = (com.bamnet.iap.p035c.p036c.C1658i) r2
            java.util.List<com.android.billingclient.api.m> r0 = r1.f5794a
            java.util.List<com.android.billingclient.api.m> r2 = r2.f5794a
            boolean r2 = kotlin.jvm.internal.C12880j.m40224a(r0, r2)
            if (r2 == 0) goto L_0x0013
            goto L_0x0015
        L_0x0013:
            r2 = 0
            return r2
        L_0x0015:
            r2 = 1
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bamnet.iap.p035c.p036c.C1658i.equals(java.lang.Object):boolean");
    }

    public int hashCode() {
        List<C1426m> list = this.f5794a;
        if (list != null) {
            return list.hashCode();
        }
        return 0;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("PurchaseResults(purchases=");
        sb.append(this.f5794a);
        sb.append(")");
        return sb.toString();
    }
}
