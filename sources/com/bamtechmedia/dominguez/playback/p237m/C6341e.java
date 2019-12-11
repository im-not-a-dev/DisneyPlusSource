package com.bamtechmedia.dominguez.playback.p237m;

import com.bamtechmedia.dominguez.core.content.playback.queryaction.C3711a;
import com.bamtechmedia.dominguez.core.content.playback.queryaction.C3715e;

/* renamed from: com.bamtechmedia.dominguez.playback.m.e */
/* compiled from: UpNextState.kt */
public final class C6341e {

    /* renamed from: a */
    private final C3715e f14441a;

    /* renamed from: b */
    private final C3711a f14442b;

    /* renamed from: c */
    private final C3711a f14443c;

    /* renamed from: d */
    private final String f14444d;

    public C6341e() {
        this(null, null, null, null, 15, null);
    }

    public C6341e(C3715e eVar, C3711a aVar, C3711a aVar2, String str) {
        this.f14441a = eVar;
        this.f14442b = aVar;
        this.f14443c = aVar2;
        this.f14444d = str;
    }

    /* renamed from: a */
    public final C6341e mo18977a(C3715e eVar, C3711a aVar, C3711a aVar2, String str) {
        return new C6341e(eVar, aVar, aVar2, str);
    }

    /* renamed from: a */
    public final String mo18978a() {
        return this.f14444d;
    }

    /* renamed from: b */
    public final boolean mo18979b() {
        C3711a aVar = this.f14442b;
        C3711a aVar2 = C3711a.EPISODE;
        return aVar == aVar2 && this.f14443c == aVar2 && this.f14441a == C3715e.SEQUENTIAL;
    }

    /* renamed from: c */
    public final boolean mo18980c() {
        return this.f14442b == C3711a.EPISODE && this.f14443c == C3711a.PROMOTIONAL && this.f14441a == C3715e.SNEAK_PEEK;
    }

    /* renamed from: d */
    public final boolean mo18981d() {
        return this.f14443c == C3711a.EPISODE && this.f14441a == C3715e.RECOMMENDATION;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x002e, code lost:
        if (kotlin.jvm.internal.C12880j.m40224a((java.lang.Object) r2.f14444d, (java.lang.Object) r3.f14444d) != false) goto L_0x0033;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean equals(java.lang.Object r3) {
        /*
            r2 = this;
            if (r2 == r3) goto L_0x0033
            boolean r0 = r3 instanceof com.bamtechmedia.dominguez.playback.p237m.C6341e
            if (r0 == 0) goto L_0x0031
            com.bamtechmedia.dominguez.playback.m.e r3 = (com.bamtechmedia.dominguez.playback.p237m.C6341e) r3
            com.bamtechmedia.dominguez.core.content.playback.queryaction.e r0 = r2.f14441a
            com.bamtechmedia.dominguez.core.content.playback.queryaction.e r1 = r3.f14441a
            boolean r0 = kotlin.jvm.internal.C12880j.m40224a(r0, r1)
            if (r0 == 0) goto L_0x0031
            com.bamtechmedia.dominguez.core.content.playback.queryaction.a r0 = r2.f14442b
            com.bamtechmedia.dominguez.core.content.playback.queryaction.a r1 = r3.f14442b
            boolean r0 = kotlin.jvm.internal.C12880j.m40224a(r0, r1)
            if (r0 == 0) goto L_0x0031
            com.bamtechmedia.dominguez.core.content.playback.queryaction.a r0 = r2.f14443c
            com.bamtechmedia.dominguez.core.content.playback.queryaction.a r1 = r3.f14443c
            boolean r0 = kotlin.jvm.internal.C12880j.m40224a(r0, r1)
            if (r0 == 0) goto L_0x0031
            java.lang.String r0 = r2.f14444d
            java.lang.String r3 = r3.f14444d
            boolean r3 = kotlin.jvm.internal.C12880j.m40224a(r0, r3)
            if (r3 == 0) goto L_0x0031
            goto L_0x0033
        L_0x0031:
            r3 = 0
            return r3
        L_0x0033:
            r3 = 1
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bamtechmedia.dominguez.playback.p237m.C6341e.equals(java.lang.Object):boolean");
    }

    public int hashCode() {
        C3715e eVar = this.f14441a;
        int i = 0;
        int hashCode = (eVar != null ? eVar.hashCode() : 0) * 31;
        C3711a aVar = this.f14442b;
        int hashCode2 = (hashCode + (aVar != null ? aVar.hashCode() : 0)) * 31;
        C3711a aVar2 = this.f14443c;
        int hashCode3 = (hashCode2 + (aVar2 != null ? aVar2.hashCode() : 0)) * 31;
        String str = this.f14444d;
        if (str != null) {
            i = str.hashCode();
        }
        return hashCode3 + i;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("UpNextState(upNextType=");
        sb.append(this.f14441a);
        sb.append(", itemFromProgramType=");
        sb.append(this.f14442b);
        sb.append(", itemToProgramType=");
        sb.append(this.f14443c);
        sb.append(", sunriseDayOfTheWeek=");
        sb.append(this.f14444d);
        sb.append(")");
        return sb.toString();
    }

    public /* synthetic */ C6341e(C3715e eVar, C3711a aVar, C3711a aVar2, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i & 1) != 0) {
            eVar = C3715e.NONE;
        }
        if ((i & 2) != 0) {
            aVar = C3711a.UNKNOWN;
        }
        if ((i & 4) != 0) {
            aVar2 = C3711a.UNKNOWN;
        }
        if ((i & 8) != 0) {
            str = null;
        }
        this(eVar, aVar, aVar2, str);
    }
}
