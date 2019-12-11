package com.bamtechmedia.dominguez.playback.p237m.p252q;

import com.bamtechmedia.dominguez.config.C3524e;
import java.util.Map;
import java.util.Set;
import kotlin.C12907r;

/* renamed from: com.bamtechmedia.dominguez.playback.m.q.e */
/* compiled from: UpNextConfig.kt */
public final class C6510e {

    /* renamed from: a */
    private final C3524e f14724a;

    public C6510e(C3524e eVar) {
        this.f14724a = eVar;
    }

    /* renamed from: a */
    public final Map<String, Set<String>> mo19170a() {
        Map<String, Set<String>> map = (Map) this.f14724a.mo12720d("upNext", "supportedScenarios");
        if (map != null) {
            return map;
        }
        return C13173j0.m40356a(C12907r.m40244a("SEQUENTIAL", C13186o0.m40524a("EPISODE_TO_EPISODE")), C12907r.m40244a("SNEAK_PEEK", C13186o0.m40524a("EPISODE_TO_PROMOTIONAL")), C12907r.m40244a("RECOMMENDATION", C13188p0.m40533b("ANY_TO_MOVIE", "ANY_TO_EPISODE")));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0092, code lost:
        if (r0.contains("ANY_TO_ANY") == false) goto L_0x0095;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo19171a(com.bamtechmedia.dominguez.core.content.playback.queryaction.C3714d r6) {
        /*
            r5 = this;
            java.util.Map r0 = r5.mo19170a()
            com.bamtechmedia.dominguez.core.content.playback.queryaction.e r1 = r6.mo13539e()
            java.lang.String r1 = r1.name()
            java.lang.String r2 = "null cannot be cast to non-null type java.lang.String"
            if (r1 == 0) goto L_0x00a3
            java.lang.String r1 = r1.toUpperCase()
            java.lang.String r3 = "(this as java.lang.String).toUpperCase()"
            kotlin.jvm.internal.C12880j.m40222a(r1, r3)
            java.lang.Object r0 = r0.get(r1)
            java.util.Set r0 = (java.util.Set) r0
            r1 = 0
            if (r0 == 0) goto L_0x00a2
            com.bamtechmedia.dominguez.core.content.playback.queryaction.a r4 = r6.mo13537c()
            java.lang.String r4 = r4.name()
            if (r4 == 0) goto L_0x009c
            java.lang.String r4 = r4.toUpperCase()
            kotlin.jvm.internal.C12880j.m40222a(r4, r3)
            com.bamtechmedia.dominguez.core.content.playback.queryaction.a r6 = r6.mo13538d()
            java.lang.String r6 = r6.name()
            if (r6 == 0) goto L_0x0096
            java.lang.String r6 = r6.toUpperCase()
            kotlin.jvm.internal.C12880j.m40222a(r6, r3)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r4)
            java.lang.String r3 = "_TO_"
            r2.append(r3)
            r2.append(r6)
            java.lang.String r2 = r2.toString()
            boolean r2 = r0.contains(r2)
            if (r2 != 0) goto L_0x0094
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "ANY_TO_"
            r2.append(r3)
            r2.append(r6)
            java.lang.String r6 = r2.toString()
            boolean r6 = r0.contains(r6)
            if (r6 != 0) goto L_0x0094
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            r6.append(r4)
            java.lang.String r2 = "_TO_ANY"
            r6.append(r2)
            java.lang.String r6 = r6.toString()
            boolean r6 = r0.contains(r6)
            if (r6 != 0) goto L_0x0094
            java.lang.String r6 = "ANY_TO_ANY"
            boolean r6 = r0.contains(r6)
            if (r6 == 0) goto L_0x0095
        L_0x0094:
            r1 = 1
        L_0x0095:
            return r1
        L_0x0096:
            kotlin.s r6 = new kotlin.s
            r6.<init>(r2)
            throw r6
        L_0x009c:
            kotlin.s r6 = new kotlin.s
            r6.<init>(r2)
            throw r6
        L_0x00a2:
            return r1
        L_0x00a3:
            kotlin.s r6 = new kotlin.s
            r6.<init>(r2)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bamtechmedia.dominguez.playback.p237m.p252q.C6510e.mo19171a(com.bamtechmedia.dominguez.core.content.playback.queryaction.d):boolean");
    }
}
