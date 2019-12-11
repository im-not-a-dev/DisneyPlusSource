package com.bamtechmedia.dominguez.playback.p237m.p246o.p249e;

import com.bamtechmedia.dominguez.core.framework.C5741g.C5742a;
import com.bamtechmedia.dominguez.core.utils.C5884x;
import com.bamtechmedia.dominguez.playback.common.tracks.C6320f.C6321a;
import com.bamtechmedia.dominguez.playback.p237m.C6336a;
import kotlin.jvm.internal.C12880j;
import p520io.reactivex.Observable;

/* renamed from: com.bamtechmedia.dominguez.playback.m.o.e.a */
/* compiled from: CloseTrackSelectionDialogEvent.kt */
public final class C6472a implements C5742a<C6336a> {
    /* renamed from: a */
    public Observable<C6336a> mo17627a(C6336a aVar) {
        C6336a aVar2 = aVar;
        C5884x.m18951a((Object) aVar2, (String) null, 1, (Object) null);
        Observable<C6336a> b = Observable.m38309b(C6336a.m19906a(aVar2, null, null, null, null, C6321a.f14413a, false, null, false, 0, null, null, null, null, false, false, 32751, null));
        C12880j.m40222a((Object) b, "Observable.just(currentS… = IgnoreTrackSelection))");
        return b;
    }
}
