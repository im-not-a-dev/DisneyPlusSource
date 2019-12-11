package com.bamtechmedia.dominguez.playback.p237m;

import com.bamtechmedia.dominguez.core.content.C3690l;
import com.bamtechmedia.dominguez.core.content.C3693o;

/* renamed from: com.bamtechmedia.dominguez.playback.m.b */
/* compiled from: PlaybackState.kt */
public final class C6337b {

    /* renamed from: a */
    private final C3693o f14438a;

    /* renamed from: b */
    private final C3690l f14439b;

    public C6337b(C3693o oVar, C3690l lVar) {
        this.f14438a = oVar;
        this.f14439b = lVar;
    }

    /* renamed from: a */
    public final C3690l mo18967a() {
        return this.f14439b;
    }

    /* renamed from: b */
    public final C3693o mo18968b() {
        return this.f14438a;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x001a, code lost:
        if (kotlin.jvm.internal.C12880j.m40224a((java.lang.Object) r2.f14439b, (java.lang.Object) r3.f14439b) != false) goto L_0x001f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean equals(java.lang.Object r3) {
        /*
            r2 = this;
            if (r2 == r3) goto L_0x001f
            boolean r0 = r3 instanceof com.bamtechmedia.dominguez.playback.p237m.C6337b
            if (r0 == 0) goto L_0x001d
            com.bamtechmedia.dominguez.playback.m.b r3 = (com.bamtechmedia.dominguez.playback.p237m.C6337b) r3
            com.bamtechmedia.dominguez.core.content.o r0 = r2.f14438a
            com.bamtechmedia.dominguez.core.content.o r1 = r3.f14438a
            boolean r0 = kotlin.jvm.internal.C12880j.m40224a(r0, r1)
            if (r0 == 0) goto L_0x001d
            com.bamtechmedia.dominguez.core.content.l r0 = r2.f14439b
            com.bamtechmedia.dominguez.core.content.l r3 = r3.f14439b
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
        throw new UnsupportedOperationException("Method not decompiled: com.bamtechmedia.dominguez.playback.p237m.C6337b.equals(java.lang.Object):boolean");
    }

    public int hashCode() {
        C3693o oVar = this.f14438a;
        int i = 0;
        int hashCode = (oVar != null ? oVar.hashCode() : 0) * 31;
        C3690l lVar = this.f14439b;
        if (lVar != null) {
            i = lVar.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("RouteAfterPlayback(playable=");
        sb.append(this.f14438a);
        sb.append(", initialTab=");
        sb.append(this.f14439b);
        sb.append(")");
        return sb.toString();
    }
}
