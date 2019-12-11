package com.bamtechmedia.dominguez.playback.p237m.p246o.p247c;

import com.bamtechmedia.dominguez.core.framework.C5741g.C5742a;
import com.bamtechmedia.dominguez.playback.common.contentrating.C6285b;
import com.bamtechmedia.dominguez.playback.common.contentrating.C6285b.C6289d;
import com.bamtechmedia.dominguez.playback.common.contentrating.C6285b.C6290e;
import com.bamtechmedia.dominguez.playback.p237m.C6336a;
import kotlin.jvm.internal.Intrinsics;
import p520io.reactivex.Observable;

/* renamed from: com.bamtechmedia.dominguez.playback.m.o.c.a */
/* compiled from: ContentRatingOverlayIsShowingEvent.kt */
public final class C6464a implements C5742a<C6336a> {
    /* renamed from: a */
    public Observable<C6336a> mo17627a(C6336a aVar) {
        Observable<C6336a> observable;
        if (aVar != null) {
            C6285b b = aVar.mo18953b();
            if (b != null) {
                if (b instanceof C6290e) {
                    C6289d dVar = r5;
                    C6290e eVar = (C6290e) b;
                    C6289d dVar2 = new C6289d(eVar.mo18893b(), eVar.mo18892a());
                    observable = Observable.m38309b(C6336a.m19906a(aVar, null, null, null, dVar, null, false, null, false, 0, null, null, null, null, false, false, 32759, null));
                } else {
                    observable = null;
                }
                if (observable != null) {
                    return observable;
                }
            }
        }
        Observable<C6336a> m = Observable.m38314m();
        Intrinsics.checkReturnedValueIsNotNull((Object) m, "Observable.empty()");
        return m;
    }
}
