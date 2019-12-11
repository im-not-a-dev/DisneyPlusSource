package p163g.p201e.p203b.p278h.p279k;

import com.bamtechmedia.dominguez.ctvactivation.api.C5890b;
import com.bamtechmedia.dominguez.ctvactivation.api.C5890b.C5891a;
import java.util.UUID;
import kotlin.jvm.internal.C12880j;

/* renamed from: g.e.b.h.k.e */
/* compiled from: DeviceData.kt */
public final class C7251e implements C5890b {

    /* renamed from: a */
    private final String f15976a;

    public C7251e() {
        this(null, 1, null);
    }

    public C7251e(String str) {
        this.f15976a = str;
    }

    /* renamed from: a */
    public String mo20067a() {
        return C5891a.m18961a(this);
    }

    /* renamed from: b */
    public String mo20068b() {
        return this.f15976a;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0014, code lost:
        if (kotlin.jvm.internal.C12880j.m40224a((java.lang.Object) mo20068b(), (java.lang.Object) ((p163g.p201e.p203b.p278h.p279k.C7251e) r2).mo20068b()) != false) goto L_0x0019;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean equals(java.lang.Object r2) {
        /*
            r1 = this;
            if (r1 == r2) goto L_0x0019
            boolean r0 = r2 instanceof p163g.p201e.p203b.p278h.p279k.C7251e
            if (r0 == 0) goto L_0x0017
            g.e.b.h.k.e r2 = (p163g.p201e.p203b.p278h.p279k.C7251e) r2
            java.lang.String r0 = r1.mo20068b()
            java.lang.String r2 = r2.mo20068b()
            boolean r2 = kotlin.jvm.internal.C12880j.m40224a(r0, r2)
            if (r2 == 0) goto L_0x0017
            goto L_0x0019
        L_0x0017:
            r2 = 0
            return r2
        L_0x0019:
            r2 = 1
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p163g.p201e.p203b.p278h.p279k.C7251e.equals(java.lang.Object):boolean");
    }

    public int hashCode() {
        String b = mo20068b();
        if (b != null) {
            return b.hashCode();
        }
        return 0;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("DeviceData(peerId=");
        sb.append(mo20068b());
        sb.append(")");
        return sb.toString();
    }

    public /* synthetic */ C7251e(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i & 1) != 0) {
            str = UUID.randomUUID().toString();
            C12880j.m40222a((Object) str, "UUID.randomUUID().toString()");
        }
        this(str);
    }
}
