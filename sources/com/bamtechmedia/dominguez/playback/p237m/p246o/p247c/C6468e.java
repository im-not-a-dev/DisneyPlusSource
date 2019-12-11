package com.bamtechmedia.dominguez.playback.p237m.p246o.p247c;

import com.bamtechmedia.dominguez.core.content.C3693o;
import com.bamtechmedia.dominguez.core.framework.C5741g.C5742a;
import com.bamtechmedia.dominguez.core.utils.C5884x;
import com.bamtechmedia.dominguez.playback.common.contentrating.C6284a;
import com.bamtechmedia.dominguez.playback.common.contentrating.C6285b.C6290e;
import com.bamtechmedia.dominguez.playback.p237m.C6336a;
import kotlin.jvm.internal.Intrinsics;
import p520io.reactivex.Observable;

/* renamed from: com.bamtechmedia.dominguez.playback.m.o.c.e */
/* compiled from: ShowContentRatingOverlayEvent.kt */
public final class C6468e implements C5742a<C6336a> {

    /* renamed from: a */
    private final C3693o f14663a;

    /* renamed from: b */
    private final C6284a f14664b;

    public C6468e(C3693o oVar, C6284a aVar) {
        this.f14663a = oVar;
        this.f14664b = aVar;
    }

    /* renamed from: a */
    public Observable<C6336a> mo17627a(C6336a aVar) {
        C6336a aVar2 = aVar;
        C5884x.m18951a((Object) aVar2, (String) null, 1, (Object) null);
        C6336a aVar3 = aVar2;
        C6290e eVar = r1;
        C6290e eVar2 = new C6290e(this.f14663a, this.f14664b);
        Observable<C6336a> b = Observable.m38309b(C6336a.m19906a(aVar3, null, null, null, eVar, null, false, null, false, 0, null, null, null, null, false, false, 24567, null));
        Intrinsics.checkReturnedValueIsNotNull((Object) b, "Observable.just(\n       …e\n            )\n        )");
        return b;
    }
}
