package com.bamtechmedia.dominguez.core.content.sets;

import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import p163g.p500m.p501a.C11725h;
import p163g.p500m.p501a.C11737m;
import p163g.p500m.p501a.C11747s;
import p163g.p500m.p501a.C11760v;

/* renamed from: com.bamtechmedia.dominguez.core.content.sets.i */
/* compiled from: DmcSetJsonAdapter.kt */
public final class C3779i extends C11725h<C3778h> {

    /* renamed from: a */
    private final C11760v f9420a;

    public C3779i(C11760v vVar) {
        this.f9420a = vVar;
    }

    /* renamed from: a */
    public void toJson(C11747s sVar, C3778h hVar) {
        if (hVar instanceof ContentSet) {
            this.f9420a.mo29866a(ContentSet.class).toJson(sVar, hVar);
        } else if (hVar instanceof ReferenceSet) {
            this.f9420a.mo29866a(ReferenceSet.class).toJson(sVar, hVar);
        } else if (hVar == null) {
            sVar.mo29800i();
        }
    }

    public C3778h fromJson(C11737m mVar) {
        C3778h hVar;
        Object p = mVar.mo29781p();
        if (!(p instanceof Map)) {
            p = null;
        }
        Map map = (Map) p;
        if (map == null) {
            return null;
        }
        if (Intrinsics.areEqual(map.get("type"), (Object) "SetRef")) {
            hVar = (C3778h) this.f9420a.mo29866a(ReferenceSet.class).fromJsonValue(map);
        } else {
            hVar = (C3778h) this.f9420a.mo29866a(ContentSet.class).fromJsonValue(map);
        }
        return hVar;
    }
}
