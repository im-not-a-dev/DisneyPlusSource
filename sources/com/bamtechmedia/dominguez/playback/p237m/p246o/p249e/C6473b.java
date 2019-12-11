package com.bamtechmedia.dominguez.playback.p237m.p246o.p249e;

import com.bamtechmedia.dominguez.core.content.C3693o;
import com.bamtechmedia.dominguez.core.framework.C5741g.C5742a;
import com.bamtechmedia.dominguez.core.utils.C5884x;
import com.bamtechmedia.dominguez.playback.common.contentrating.C6284a;
import com.bamtechmedia.dominguez.playback.common.contentrating.C6285b;
import com.bamtechmedia.dominguez.playback.common.contentrating.C6285b.C6290e;
import com.bamtechmedia.dominguez.playback.common.tracks.C6320f.C6321a;
import com.bamtechmedia.dominguez.playback.p237m.C6336a;
import com.bamtechmedia.dominguez.playback.p237m.C6338c;
import kotlin.jvm.internal.Intrinsics;
import p520io.reactivex.Observable;

/* renamed from: com.bamtechmedia.dominguez.playback.m.o.e.b */
/* compiled from: OnTrackSelectionDialogClosedEvent.kt */
public final class C6473b implements C5742a<C6336a> {

    /* renamed from: a */
    private final C6338c f14666a;

    public C6473b(C6338c cVar) {
        this.f14666a = cVar;
    }

    /* renamed from: a */
    public Observable<C6336a> mo17627a(C6336a aVar) {
        C6336a aVar2 = aVar;
        Object b = aVar2 != null ? aVar.mo18953b() : null;
        C5884x.m18951a(b, (String) null, 1, (Object) null);
        C6285b bVar = (C6285b) b;
        if (this.f14666a.mo18972a()) {
            Object c = aVar2 != null ? aVar.mo18954c() : null;
            C5884x.m18951a(c, (String) null, 1, (Object) null);
            bVar = new C6290e((C3693o) c, C6284a.SHORT_DURATION);
        }
        C6285b bVar2 = bVar;
        C5884x.m18951a((Object) aVar2, (String) null, 1, (Object) null);
        Observable<C6336a> b2 = Observable.m38309b(C6336a.m19906a(aVar2, null, null, null, bVar2, C6321a.f14413a, false, null, false, 0, null, null, null, null, false, false, 32743, null));
        Intrinsics.checkReturnedValueIsNotNull((Object) b2, "Observable.just(\n       …n\n            )\n        )");
        return b2;
    }
}
