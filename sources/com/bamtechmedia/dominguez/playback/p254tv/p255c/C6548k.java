package com.bamtechmedia.dominguez.playback.p254tv.p255c;

import android.content.Context;
import android.content.SharedPreferences;
import androidx.fragment.app.C0532d;
import androidx.lifecycle.C0722m;
import com.bamtechmedia.dominguez.analytics.p057o0.C2435d;
import com.bamtechmedia.dominguez.core.content.playback.queryaction.C3712b;
import com.bamtechmedia.dominguez.core.utils.C5856o0;
import com.bamtechmedia.dominguez.playback.C6266a;
import com.bamtechmedia.dominguez.playback.common.query.PlayableQueryAction;
import com.bamtechmedia.dominguez.playback.p237m.C6342f;
import com.bamtechmedia.dominguez.playback.p237m.p239j.C6381a;
import com.bamtechmedia.dominguez.playback.p237m.p239j.C6384c;
import com.bamtechmedia.dominguez.playback.p237m.p239j.C6394h;
import com.bamtechmedia.dominguez.playback.p237m.p242m.C6421a;
import com.bamtechmedia.dominguez.playback.p237m.p242m.C6425d;
import com.bamtechmedia.dominguez.playback.p237m.p242m.p243e.C6427a;
import com.bamtechmedia.dominguez.playback.p237m.p242m.p244f.C6439c;
import com.bamtechmedia.dominguez.playback.p237m.p245n.C6453d;
import com.bamtechmedia.dominguez.playback.p237m.p252q.C6507c;
import com.bamtechmedia.dominguez.playback.p237m.p252q.C6510e;
import com.bamtechmedia.dominguez.playback.p237m.p252q.p253g.C6512a;
import com.bamtechmedia.dominguez.playback.p254tv.TvPlaybackActivity;
import com.bamtechmedia.dominguez.playback.p254tv.p256d.C6556a;
import com.bamtechmedia.dominguez.playback.p254tv.p256d.C6558b;
import com.bamtechmedia.dominguez.profiles.C6667g1;
import java.util.Set;
import javax.inject.Provider;
import p163g.p174d.p178b.C5273h;
import p163g.p174d.p178b.p180b0.C4922v2;
import p163g.p174d.p178b.p180b0.C4926w2;

/* renamed from: com.bamtechmedia.dominguez.playback.tv.c.k */
/* compiled from: TvPlaybackModule */
abstract class C6548k {
    /* renamed from: a */
    static C0722m m20371a(TvPlaybackActivity tvPlaybackActivity) {
        return tvPlaybackActivity;
    }

    /* renamed from: a */
    static C4922v2 m20378a() {
        return new C4926w2();
    }

    /* renamed from: b */
    static C5273h m20379b(TvPlaybackActivity tvPlaybackActivity) {
        return new C6558b(tvPlaybackActivity);
    }

    /* renamed from: a */
    static C6421a m20375a(C0532d dVar, C5273h hVar, C4922v2 v2Var, C6266a aVar, C0722m mVar, C6425d dVar2, SharedPreferences sharedPreferences) {
        C6556a aVar2 = new C6556a(dVar, hVar, v2Var, mVar, aVar, dVar2, sharedPreferences);
        return aVar2;
    }

    /* renamed from: a */
    static C6342f m20372a(C0532d dVar, PlayableQueryAction playableQueryAction, C3712b bVar, C6507c cVar, C6394h hVar, C6439c cVar2, C6427a aVar, C6453d dVar2, C6512a aVar2, C6667g1 g1Var, C6510e eVar) {
        C6536a aVar3 = new C6536a(playableQueryAction, bVar, cVar, cVar2, aVar, hVar, aVar2, g1Var, eVar);
        C0532d dVar3 = dVar;
        return (C6342f) C5856o0.m18894a(dVar, C6342f.class, (Provider<T>) aVar3);
    }

    /* renamed from: a */
    static /* synthetic */ C6342f m20373a(PlayableQueryAction playableQueryAction, C3712b bVar, C6507c cVar, C6439c cVar2, C6427a aVar, C6394h hVar, C6512a aVar2, C6667g1 g1Var, C6510e eVar) {
        C6342f fVar = new C6342f(playableQueryAction, bVar, cVar, cVar2, aVar, hVar, aVar2, g1Var, eVar);
        return fVar;
    }

    /* renamed from: a */
    static C6384c m20374a(Set<C2435d> set, C6381a aVar, C6266a aVar2, Context context) {
        return new C6384c(set, aVar, aVar2, context);
    }

    /* renamed from: a */
    static /* synthetic */ C6512a m20377a(C6266a aVar) {
        return new C6512a(aVar);
    }

    /* renamed from: a */
    static C6512a m20376a(C0532d dVar, C6266a aVar) {
        return (C6512a) C5856o0.m18894a(dVar, C6512a.class, (Provider<T>) new C6537b<T>(aVar));
    }
}
