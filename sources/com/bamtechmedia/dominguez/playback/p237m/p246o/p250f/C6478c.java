package com.bamtechmedia.dominguez.playback.p237m.p246o.p250f;

import com.bamtechmedia.dominguez.core.content.C3693o;
import com.bamtechmedia.dominguez.core.framework.C5741g.C5742a;
import com.bamtechmedia.dominguez.core.utils.C5884x;
import com.bamtechmedia.dominguez.playback.p237m.C6336a;
import kotlin.jvm.internal.C12880j;
import p520io.reactivex.Observable;

/* renamed from: com.bamtechmedia.dominguez.playback.m.o.f.c */
/* compiled from: OnUpNextAvailableEvent.kt */
public final class C6478c implements C5742a<C6336a> {

    /* renamed from: a */
    private final C3693o f14668a;

    public C6478c(C3693o oVar) {
        this.f14668a = oVar;
    }

    /* renamed from: a */
    public Observable<C6336a> mo17627a(C6336a aVar) {
        C6336a aVar2 = aVar;
        C5884x.m18951a((Object) aVar2, (String) null, 1, (Object) null);
        Observable<C6336a> b = Observable.m38309b(C6336a.m19906a(aVar2, null, null, this.f14668a, null, null, false, null, false, 0, null, null, null, null, false, false, 32763, null));
        C12880j.m40222a((Object) b, "Observable.just(currentS…).copy(next = nextState))");
        return b;
    }
}
