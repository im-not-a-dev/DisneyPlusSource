package com.bamtechmedia.dominguez.playback.p237m.p251p;

import com.bamtechmedia.dominguez.core.content.C3690l;
import com.bamtechmedia.dominguez.core.content.C3693o;
import com.bamtechmedia.dominguez.core.framework.C5741g.C5742a;
import com.bamtechmedia.dominguez.playback.p237m.C6336a;
import com.bamtechmedia.dominguez.playback.p237m.C6342f;
import com.bamtechmedia.dominguez.playback.p237m.p239j.C6410j;
import com.bamtechmedia.dominguez.playback.p237m.p242m.p243e.C6427a;
import com.bamtechmedia.dominguez.playback.p237m.p242m.p244f.C6439c;
import com.bamtechmedia.dominguez.playback.p237m.p246o.C6463b;
import com.bamtechmedia.dominguez.playback.p237m.p246o.p248d.C6470b;
import com.bamtechmedia.dominguez.playback.p237m.p246o.p250f.C6476a;
import com.bamtechmedia.dominguez.playback.p237m.p246o.p250f.C6477b;
import com.bamtechmedia.dominguez.playback.p237m.p246o.p250f.C6479d;
import com.bamtechmedia.dominguez.playback.p237m.p246o.p250f.C6480e;
import com.bamtechmedia.dominguez.playback.p237m.p246o.p250f.C6492h;
import com.bamtechmedia.dominguez.playback.p237m.p252q.C6501b.C6503b;
import com.bamtechmedia.dominguez.profiles.C6667g1;
import p163g.p201e.p203b.p283i.p284a.p285a.C7284a;
import p163g.p201e.p203b.p283i.p284a.p285a.C7285b;

/* renamed from: com.bamtechmedia.dominguez.playback.m.p.f */
/* compiled from: UpNextListenersImpl.kt */
public final class C6498f implements C6497e {

    /* renamed from: a */
    private C6342f f14701a;

    /* renamed from: b */
    private C7285b f14702b;

    /* renamed from: c */
    private C7284a f14703c;

    /* renamed from: d */
    private C6439c f14704d;

    /* renamed from: e */
    private C6427a f14705e;

    /* renamed from: f */
    private final C6410j f14706f;

    /* renamed from: g */
    private final C6667g1 f14707g;

    public C6498f(C6342f fVar, C7285b bVar, C7284a aVar, C6439c cVar, C6427a aVar2, C6410j jVar, C6667g1 g1Var) {
        this.f14701a = fVar;
        this.f14702b = bVar;
        this.f14703c = aVar;
        this.f14704d = cVar;
        this.f14705e = aVar2;
        this.f14706f = jVar;
        this.f14707g = g1Var;
    }

    /* renamed from: b */
    private final void m20240b(boolean z) {
        C3693o oVar;
        C3693o oVar2;
        if (z) {
            C6336a aVar = (C6336a) this.f14701a.getCurrentState();
            if (aVar != null) {
                C6336a a = C6336a.m19906a(aVar, null, null, null, null, null, false, null, false, 0, null, null, null, null, false, false, 32767, null);
                if (a != null) {
                    oVar2 = a.mo18954c();
                    oVar = oVar2;
                }
            }
            oVar2 = null;
            oVar = oVar2;
        } else {
            oVar = null;
        }
        m20239a((C5742a<C6336a>) new C6479d<C6336a>());
        m20239a((C5742a<C6336a>) new C6470b<C6336a>(null, 1, null));
        C6480e eVar = new C6480e(oVar, this.f14702b, this.f14703c, z, this.f14704d, this.f14705e, this.f14707g);
        m20239a((C5742a<C6336a>) eVar);
    }

    /* renamed from: a */
    public void mo19156a(boolean z) {
        m20240b(z);
    }

    /* renamed from: c */
    public void mo19158c() {
        m20239a((C5742a<C6336a>) new C6477b<C6336a>());
    }

    /* renamed from: a */
    public void mo19155a(C3693o oVar) {
        m20239a((C5742a<C6336a>) new C6463b<C6336a>(oVar, C3690l.DETAILS));
    }

    /* renamed from: a */
    public void mo19154a() {
        m20239a((C5742a<C6336a>) new C6492h<C6336a>());
    }

    /* renamed from: a */
    private final void m20239a(C5742a<C6336a> aVar) {
        this.f14701a.submitEvent(aVar);
    }

    /* renamed from: b */
    public void mo19157b() {
        m20239a((C5742a<C6336a>) new C6476a<C6336a>(C6503b.f14718a));
    }
}
