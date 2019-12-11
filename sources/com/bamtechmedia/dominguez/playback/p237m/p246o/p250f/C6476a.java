package com.bamtechmedia.dominguez.playback.p237m.p246o.p250f;

import com.bamtechmedia.dominguez.core.framework.C5741g.C5742a;
import com.bamtechmedia.dominguez.core.utils.C5884x;
import com.bamtechmedia.dominguez.playback.p237m.C6336a;
import com.bamtechmedia.dominguez.playback.p237m.p252q.C6501b;
import kotlin.jvm.internal.C12880j;
import p520io.reactivex.Observable;

/* renamed from: com.bamtechmedia.dominguez.playback.m.o.f.a */
/* compiled from: ChangeUpNextVisibilityEvent.kt */
public final class C6476a implements C5742a<C6336a> {

    /* renamed from: a */
    private final C6501b f14667a;

    public C6476a(C6501b bVar) {
        this.f14667a = bVar;
    }

    /* renamed from: a */
    public Observable<C6336a> mo17627a(C6336a aVar) {
        C6336a aVar2 = aVar;
        C6336a aVar3 = null;
        C5884x.m18951a((Object) aVar2, (String) null, 1, (Object) null);
        if (aVar2 != null) {
            aVar3 = C6336a.m19906a(aVar, null, null, null, null, null, false, null, false, 0, this.f14667a, null, null, null, false, false, 32255, null);
        }
        Observable<C6336a> b = Observable.m38309b(aVar3);
        C12880j.m40222a((Object) b, "Observable.just(currentS…xtAction = upNextAction))");
        return b;
    }
}
