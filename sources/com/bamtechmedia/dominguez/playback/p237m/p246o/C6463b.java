package com.bamtechmedia.dominguez.playback.p237m.p246o;

import com.bamtechmedia.dominguez.core.content.C3690l;
import com.bamtechmedia.dominguez.core.content.C3693o;
import com.bamtechmedia.dominguez.core.framework.C5741g.C5742a;
import com.bamtechmedia.dominguez.core.utils.C5884x;
import com.bamtechmedia.dominguez.playback.p237m.C6336a;
import com.bamtechmedia.dominguez.playback.p237m.C6337b;
import kotlin.jvm.internal.C12880j;
import p520io.reactivex.Observable;

/* renamed from: com.bamtechmedia.dominguez.playback.m.o.b */
/* compiled from: ShouldLeavePlaybackEvent.kt */
public final class C6463b implements C5742a<C6336a> {

    /* renamed from: a */
    private final C3693o f14661a;

    /* renamed from: b */
    private final C3690l f14662b;

    public C6463b() {
        this(null, null, 3, null);
    }

    public C6463b(C3693o oVar, C3690l lVar) {
        this.f14661a = oVar;
        this.f14662b = lVar;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x001a, code lost:
        if (kotlin.jvm.internal.C12880j.m40224a((java.lang.Object) r2.f14662b, (java.lang.Object) r3.f14662b) != false) goto L_0x001f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean equals(java.lang.Object r3) {
        /*
            r2 = this;
            if (r2 == r3) goto L_0x001f
            boolean r0 = r3 instanceof com.bamtechmedia.dominguez.playback.p237m.p246o.C6463b
            if (r0 == 0) goto L_0x001d
            com.bamtechmedia.dominguez.playback.m.o.b r3 = (com.bamtechmedia.dominguez.playback.p237m.p246o.C6463b) r3
            com.bamtechmedia.dominguez.core.content.o r0 = r2.f14661a
            com.bamtechmedia.dominguez.core.content.o r1 = r3.f14661a
            boolean r0 = kotlin.jvm.internal.C12880j.m40224a(r0, r1)
            if (r0 == 0) goto L_0x001d
            com.bamtechmedia.dominguez.core.content.l r0 = r2.f14662b
            com.bamtechmedia.dominguez.core.content.l r3 = r3.f14662b
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
        throw new UnsupportedOperationException("Method not decompiled: com.bamtechmedia.dominguez.playback.p237m.p246o.C6463b.equals(java.lang.Object):boolean");
    }

    public int hashCode() {
        C3693o oVar = this.f14661a;
        int i = 0;
        int hashCode = (oVar != null ? oVar.hashCode() : 0) * 31;
        C3690l lVar = this.f14662b;
        if (lVar != null) {
            i = lVar.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("ShouldLeavePlaybackEvent(playable=");
        sb.append(this.f14661a);
        sb.append(", initialTab=");
        sb.append(this.f14662b);
        sb.append(")");
        return sb.toString();
    }

    public /* synthetic */ C6463b(C3693o oVar, C3690l lVar, int i, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i & 1) != 0) {
            oVar = null;
        }
        if ((i & 2) != 0) {
            lVar = C3690l.NONE;
        }
        this(oVar, lVar);
    }

    /* renamed from: a */
    public Observable<C6336a> mo17627a(C6336a aVar) {
        C6336a aVar2 = aVar;
        C5884x.m18951a((Object) aVar2, (String) null, 1, (Object) null);
        C6336a aVar3 = aVar2;
        C6337b bVar = r1;
        C6337b bVar2 = new C6337b(this.f14661a, this.f14662b);
        Observable<C6336a> b = Observable.m38309b(C6336a.m19906a(aVar3, null, null, null, null, null, true, null, false, 0, null, null, null, bVar, false, false, 28639, null));
        C12880j.m40222a((Object) b, "Observable.just(\n       …)\n            )\n        )");
        return b;
    }
}
