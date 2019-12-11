package com.bamtechmedia.dominguez.playback.p237m.p246o.p250f;

import com.bamtechmedia.dominguez.core.framework.C5741g.C5742a;
import com.bamtechmedia.dominguez.playback.p237m.C6336a;
import com.bamtechmedia.dominguez.playback.p237m.p252q.C6501b;
import com.bamtechmedia.dominguez.playback.p237m.p252q.C6501b.C6502a;
import com.bamtechmedia.dominguez.playback.p237m.p252q.C6501b.C6506e;
import kotlin.jvm.internal.Intrinsics;
import p520io.reactivex.Observable;

/* renamed from: com.bamtechmedia.dominguez.playback.m.o.f.h */
/* compiled from: UpNextDialogIsShowingEvent.kt */
public final class C6492h implements C5742a<C6336a> {
    /* renamed from: a */
    public Observable<C6336a> mo17627a(C6336a aVar) {
        Observable<C6336a> observable;
        if (aVar != null) {
            C6501b j = aVar.mo18963j();
            if (j != null) {
                if (j instanceof C6502a) {
                    C6506e eVar = r11;
                    C6502a aVar2 = (C6502a) j;
                    C6506e eVar2 = new C6506e(aVar2.mo19160a(), aVar2.mo19162c(), aVar2.mo19161b());
                    observable = Observable.m38309b(C6336a.m19906a(aVar, null, null, null, null, null, false, null, false, 0, eVar, null, null, null, false, false, 32255, null));
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
