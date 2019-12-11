package com.bamtechmedia.dominguez.playback.p254tv.upnext;

import com.bamtechmedia.dominguez.core.content.C3693o;
import com.bamtechmedia.dominguez.playback.p237m.C6341e;
import com.bamtechmedia.dominguez.playback.p237m.p252q.C6500a;
import com.bamtechmedia.dominguez.playback.p237m.p252q.C6501b;
import com.bamtechmedia.dominguez.playback.p237m.p252q.C6501b.C6502a;
import com.bamtechmedia.dominguez.playback.p237m.p252q.C6501b.C6504c;
import com.bamtechmedia.dominguez.playback.p237m.p252q.C6507c;
import com.bamtechmedia.dominguez.playback.p237m.p252q.C6507c.C6508a;
import com.bamtechmedia.dominguez.playback.p237m.p252q.C6509d;
import kotlin.C13145v;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import p520io.reactivex.Maybe;
import p520io.reactivex.Observable;
import p520io.reactivex.Single;
import p520io.reactivex.functions.Function;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J]\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\r\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\u000f2!\u0010\u0010\u001a\u001d\u0012\u0013\u0012\u00110\u000b¢\u0006\f\b\u0012\u0012\b\b\u0013\u0012\u0004\b\b(\f\u0012\u0004\u0012\u00020\u00140\u0011H\u0016J\u0018\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00162\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0016J\u0016\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00182\u0006\u0010\u0019\u001a\u00020\u001aH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\u001b"}, mo31007d2 = {"Lcom/bamtechmedia/dominguez/playback/tv/upnext/TvNextRecommendation;", "Lcom/bamtechmedia/dominguez/playback/common/upnext/UpNextActionResolver;", "dialogTypeResolver", "Lcom/bamtechmedia/dominguez/playback/common/upnext/DialogTypeResolver;", "(Lcom/bamtechmedia/dominguez/playback/common/upnext/DialogTypeResolver;)V", "determineUpNextAction", "Lio/reactivex/Observable;", "Lcom/bamtechmedia/dominguez/playback/common/upnext/UpNextAction;", "shouldShow", "", "currentPlayable", "Lcom/bamtechmedia/dominguez/core/content/Playable;", "nextPlayable", "isMilestone", "upNextState", "Lcom/bamtechmedia/dominguez/playback/common/UpNextState;", "updateNextState", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "", "getNextOfflineEpisode", "Lio/reactivex/Maybe;", "getOfflineEpisode", "Lio/reactivex/Single;", "contentId", "", "playback_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* renamed from: com.bamtechmedia.dominguez.playback.tv.upnext.c */
/* compiled from: TvNextRecommendation.kt */
public final class C6581c implements C6507c {

    /* renamed from: a */
    private final C6500a f14876a;

    /* renamed from: com.bamtechmedia.dominguez.playback.tv.upnext.c$a */
    /* compiled from: TvNextRecommendation.kt */
    static final class C6582a<T, R> implements Function<T, R> {

        /* renamed from: c */
        final /* synthetic */ boolean f14877c;

        C6582a(boolean z) {
            this.f14877c = z;
        }

        /* renamed from: a */
        public final C6502a apply(C6509d dVar) {
            C6502a aVar = new C6502a(dVar, this.f14877c, false, 4, null);
            return aVar;
        }
    }

    public C6581c(C6500a aVar) {
        this.f14876a = aVar;
    }

    /* renamed from: a */
    public long mo19166a(C3693o oVar) {
        return C6508a.m20255a(this, oVar);
    }

    /* renamed from: b */
    public Maybe<C3693o> mo19169b(C3693o oVar) {
        Maybe<C3693o> h = Maybe.m38259h();
        Intrinsics.checkReturnedValueIsNotNull((Object) h, "Maybe.empty()");
        return h;
    }

    /* renamed from: a */
    public Observable<C6501b> mo19167a(boolean z, C3693o oVar, C3693o oVar2, boolean z2, C6341e eVar, Function1<? super C3693o, C13145v> function1) {
        if (!z || oVar2 == null) {
            Observable<C6501b> b = Observable.m38309b(C6504c.f14719a);
            Intrinsics.checkReturnedValueIsNotNull((Object) b, "Observable.just(IgnoreUpNext)");
            return b;
        }
        Single g = this.f14876a.mo19159a(eVar, oVar2, z2).mo30233g(new C6582a(z2));
        Intrinsics.checkReturnedValueIsNotNull((Object) g, "dialogTypeResolver.nextD…ilestone = isMilestone) }");
        Single a = g.mo30212a(C6501b.class);
        Intrinsics.checkReturnedValueIsNotNull((Object) a, "cast(R::class.java)");
        Observable<C6501b> i = a.mo30236i();
        Intrinsics.checkReturnedValueIsNotNull((Object) i, "dialogTypeResolver.nextD…          .toObservable()");
        return i;
    }

    /* renamed from: a */
    public Single<C3693o> mo19168a(String str) {
        Single<C3693o> a = Single.m38395a(new Throwable("No offline episodes for tv"));
        Intrinsics.checkReturnedValueIsNotNull((Object) a, "Single.error(Throwable(\"…ffline episodes for tv\"))");
        return a;
    }
}
