package com.bamtechmedia.dominguez.playback.p237m.p246o.p250f;

import com.bamtechmedia.dominguez.core.framework.C5741g.C5742a;
import com.bamtechmedia.dominguez.playback.p237m.C6336a;
import com.bamtechmedia.dominguez.playback.p237m.p252q.C6501b.C6503b;
import kotlin.jvm.internal.Intrinsics;
import p520io.reactivex.Observable;

/* renamed from: com.bamtechmedia.dominguez.playback.m.o.f.d */
/* compiled from: PrepareToPlayNextEpisodeEvent.kt */
public final class C6479d implements C5742a<C6336a> {
    /* renamed from: a */
    public Observable<C6336a> mo17627a(C6336a aVar) {
        C6336a aVar2;
        if (aVar != null) {
            aVar2 = C6336a.m19906a(aVar, null, aVar.mo18958f(), null, null, null, false, null, false, 0, C6503b.f14718a, null, null, null, false, true, 15869, null);
        } else {
            aVar2 = null;
        }
        Observable<C6336a> b = Observable.m38309b(aVar2);
        Intrinsics.checkReturnedValueIsNotNull((Object) b, "Observable.just(\n       …e\n            )\n        )");
        return b;
    }
}
