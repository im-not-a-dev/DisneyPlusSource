package com.bamtechmedia.dominguez.playback.p237m.p246o.p249e;

import com.bamtechmedia.dominguez.core.framework.C5741g.C5742a;
import com.bamtechmedia.dominguez.playback.common.tracks.C6320f;
import com.bamtechmedia.dominguez.playback.common.tracks.C6320f.C6322b;
import com.bamtechmedia.dominguez.playback.common.tracks.C6320f.C6323c;
import com.bamtechmedia.dominguez.playback.p237m.C6336a;
import kotlin.jvm.internal.C12880j;
import p520io.reactivex.Observable;

/* renamed from: com.bamtechmedia.dominguez.playback.m.o.e.d */
/* compiled from: TrackSelectionDialogIsShowingEvent.kt */
public final class C6475d implements C5742a<C6336a> {
    /* renamed from: a */
    public Observable<C6336a> mo17627a(C6336a aVar) {
        Observable<C6336a> observable;
        if (aVar != null) {
            C6320f i = aVar.mo18962i();
            if (i != null) {
                if (i instanceof C6322b) {
                    observable = Observable.m38309b(C6336a.m19906a(aVar, null, null, null, null, C6323c.f14415a, false, null, false, 0, null, null, null, null, false, false, 32751, null));
                } else {
                    observable = null;
                }
                if (observable != null) {
                    return observable;
                }
            }
        }
        Observable<C6336a> m = Observable.m38314m();
        C12880j.m40222a((Object) m, "Observable.empty()");
        return m;
    }
}
