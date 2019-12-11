package p163g.p201e.p203b.p307o;

import com.bamtech.sdk4.service.ServiceExceptionCase;

/* renamed from: g.e.b.o.i */
/* compiled from: LocalizedErrorMessage.kt */
public final class C7619i {

    /* renamed from: a */
    private final String f16635a;

    /* renamed from: b */
    private final ServiceExceptionCase f16636b;

    public C7619i(String str, ServiceExceptionCase serviceExceptionCase) {
        this.f16635a = str;
        this.f16636b = serviceExceptionCase;
    }

    /* renamed from: a */
    public final String mo20543a() {
        return this.f16635a;
    }

    /* renamed from: b */
    public final ServiceExceptionCase mo20544b() {
        return this.f16636b;
    }

    /* renamed from: c */
    public final ServiceExceptionCase mo20545c() {
        return this.f16636b;
    }

    /* renamed from: d */
    public final String mo20546d() {
        return this.f16635a;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x001a, code lost:
        if (kotlin.jvm.internal.C12880j.m40224a((java.lang.Object) r2.f16636b, (java.lang.Object) r3.f16636b) != false) goto L_0x001f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean equals(java.lang.Object r3) {
        /*
            r2 = this;
            if (r2 == r3) goto L_0x001f
            boolean r0 = r3 instanceof p163g.p201e.p203b.p307o.C7619i
            if (r0 == 0) goto L_0x001d
            g.e.b.o.i r3 = (p163g.p201e.p203b.p307o.C7619i) r3
            java.lang.String r0 = r2.f16635a
            java.lang.String r1 = r3.f16635a
            boolean r0 = kotlin.jvm.internal.C12880j.m40224a(r0, r1)
            if (r0 == 0) goto L_0x001d
            com.bamtech.sdk4.service.ServiceExceptionCase r0 = r2.f16636b
            com.bamtech.sdk4.service.ServiceExceptionCase r3 = r3.f16636b
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
        throw new UnsupportedOperationException("Method not decompiled: p163g.p201e.p203b.p307o.C7619i.equals(java.lang.Object):boolean");
    }

    public int hashCode() {
        String str = this.f16635a;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        ServiceExceptionCase serviceExceptionCase = this.f16636b;
        if (serviceExceptionCase != null) {
            i = serviceExceptionCase.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("LocalizedErrorMessage(localized=");
        sb.append(this.f16635a);
        sb.append(", case=");
        sb.append(this.f16636b);
        sb.append(")");
        return sb.toString();
    }
}
