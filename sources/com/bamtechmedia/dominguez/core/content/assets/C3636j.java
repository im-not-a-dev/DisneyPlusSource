package com.bamtechmedia.dominguez.core.content.assets;

import com.bamtechmedia.dominguez.core.content.collections.C3680n;
import com.bamtechmedia.dominguez.core.content.collections.DmcVideoArt;
import java.util.Map;
import kotlin.C13142s;
import p163g.p500m.p501a.C11725h;
import p163g.p500m.p501a.C11737m;
import p163g.p500m.p501a.C11747s;
import p163g.p500m.p501a.C11760v;

/* renamed from: com.bamtechmedia.dominguez.core.content.assets.j */
/* compiled from: DmcVideoArtJsonAdapter.kt */
public final class C3636j extends C11725h<C3680n> {

    /* renamed from: a */
    private final C11760v f9146a;

    public C3636j(C11760v vVar) {
        this.f9146a = vVar;
    }

    /* renamed from: a */
    public void toJson(C11747s sVar, C3680n nVar) {
        if (nVar == null) {
            sVar.mo29800i();
        } else {
            this.f9146a.mo29866a(nVar.getClass()).toJson(sVar, nVar);
        }
    }

    public C3680n fromJson(C11737m mVar) {
        Object p = mVar.mo29781p();
        if (p != null) {
            return (C3680n) this.f9146a.mo29866a(DmcVideoArt.class).fromJsonValue((Map) p);
        }
        throw new C13142s("null cannot be cast to non-null type kotlin.collections.Map<*, *>");
    }
}
