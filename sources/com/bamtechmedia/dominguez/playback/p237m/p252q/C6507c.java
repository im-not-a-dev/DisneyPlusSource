package com.bamtechmedia.dominguez.playback.p237m.p252q;

import com.bamtechmedia.dominguez.core.content.C3693o;
import com.bamtechmedia.dominguez.playback.p237m.C6341e;
import kotlin.C13145v;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import p520io.reactivex.Maybe;
import p520io.reactivex.Observable;
import p520io.reactivex.Single;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J]\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\n\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\f2!\u0010\r\u001a\u001d\u0012\u0013\u0012\u00110\b¢\u0006\f\b\u000f\u0012\b\b\u0010\u0012\u0004\b\b(\t\u0012\u0004\u0012\u00020\u00110\u000eH&J\u0018\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\b0\u00132\b\u0010\u0007\u001a\u0004\u0018\u00010\bH&J\u0016\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\b0\u00152\u0006\u0010\u0016\u001a\u00020\u0017H&J\u0010\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\bH\u0016¨\u0006\u001b"}, mo31007d2 = {"Lcom/bamtechmedia/dominguez/playback/common/upnext/UpNextActionResolver;", "", "determineUpNextAction", "Lio/reactivex/Observable;", "Lcom/bamtechmedia/dominguez/playback/common/upnext/UpNextAction;", "shouldShow", "", "currentPlayable", "Lcom/bamtechmedia/dominguez/core/content/Playable;", "nextPlayable", "isMilestone", "upNextState", "Lcom/bamtechmedia/dominguez/playback/common/UpNextState;", "updateNextState", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "", "getNextOfflineEpisode", "Lio/reactivex/Maybe;", "getOfflineEpisode", "Lio/reactivex/Single;", "contentId", "", "startTimeMillis", "", "playable", "playback_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* renamed from: com.bamtechmedia.dominguez.playback.m.q.c */
/* compiled from: UpNextRecommendation.kt */
public interface C6507c {

    /* renamed from: com.bamtechmedia.dominguez.playback.m.q.c$a */
    /* compiled from: UpNextRecommendation.kt */
    public static final class C6508a {
        /* renamed from: a */
        public static long m20255a(C6507c cVar, C3693o oVar) {
            Long y = oVar.mo13281y();
            if (y != null) {
                return y.longValue();
            }
            return Long.MAX_VALUE;
        }
    }

    /* renamed from: a */
    long mo19166a(C3693o oVar);

    /* renamed from: a */
    Observable<C6501b> mo19167a(boolean z, C3693o oVar, C3693o oVar2, boolean z2, C6341e eVar, Function1<? super C3693o, C13145v> function1);

    /* renamed from: a */
    Single<C3693o> mo19168a(String str);

    /* renamed from: b */
    Maybe<C3693o> mo19169b(C3693o oVar);
}
