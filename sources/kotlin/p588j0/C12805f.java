package kotlin.p588j0;

import kotlin.p586h0.C12757d;

/* renamed from: kotlin.j0.f */
/* compiled from: Regex.kt */
public final class C12805f {

    /* renamed from: a */
    private final String f29485a;

    /* renamed from: b */
    private final C12757d f29486b;

    public C12805f(String str, C12757d dVar) {
        this.f29485a = str;
        this.f29486b = dVar;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x001a, code lost:
        if (kotlin.jvm.internal.C12880j.m40224a((java.lang.Object) r2.f29486b, (java.lang.Object) r3.f29486b) != false) goto L_0x001f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean equals(java.lang.Object r3) {
        /*
            r2 = this;
            if (r2 == r3) goto L_0x001f
            boolean r0 = r3 instanceof kotlin.p588j0.C12805f
            if (r0 == 0) goto L_0x001d
            kotlin.j0.f r3 = (kotlin.p588j0.C12805f) r3
            java.lang.String r0 = r2.f29485a
            java.lang.String r1 = r3.f29485a
            boolean r0 = kotlin.jvm.internal.C12880j.m40224a(r0, r1)
            if (r0 == 0) goto L_0x001d
            kotlin.h0.d r0 = r2.f29486b
            kotlin.h0.d r3 = r3.f29486b
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
        throw new UnsupportedOperationException("Method not decompiled: kotlin.p588j0.C12805f.equals(java.lang.Object):boolean");
    }

    public int hashCode() {
        String str = this.f29485a;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        C12757d dVar = this.f29486b;
        if (dVar != null) {
            i = dVar.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("MatchGroup(value=");
        sb.append(this.f29485a);
        sb.append(", range=");
        sb.append(this.f29486b);
        sb.append(")");
        return sb.toString();
    }
}
