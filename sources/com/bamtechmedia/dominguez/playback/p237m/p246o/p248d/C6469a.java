package com.bamtechmedia.dominguez.playback.p237m.p246o.p248d;

import com.bamtech.player.exo.sdk4.SDK4ExoPlaybackEngine;
import com.bamtechmedia.dominguez.core.framework.C5741g.C5742a;
import com.bamtechmedia.dominguez.playback.p237m.C6336a;
import kotlin.jvm.internal.C12880j;
import p163g.p174d.p178b.C5300m;
import p520io.reactivex.Observable;

/* renamed from: com.bamtechmedia.dominguez.playback.m.o.d.a */
/* compiled from: AllowControlsToBeShownEvent.kt */
public final class C6469a implements C5742a<C6336a> {
    /* renamed from: a */
    public Observable<C6336a> mo17627a(C6336a aVar) {
        if (aVar != null) {
            SDK4ExoPlaybackEngine d = aVar.mo18955d();
            if (d != null) {
                C5300m b = d.mo7537b();
                if (b != null) {
                    b.mo17010b("startupControlsLockout");
                }
            }
        }
        Observable<C6336a> m = Observable.m38314m();
        C12880j.m40222a((Object) m, "Observable.empty()");
        return m;
    }
}
