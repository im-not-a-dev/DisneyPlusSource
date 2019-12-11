package com.bamtechmedia.dominguez.playback.p237m.p246o.p250f;

import com.bamtechmedia.dominguez.core.content.C3685g;
import com.bamtechmedia.dominguez.core.content.C3686h;
import com.bamtechmedia.dominguez.core.content.C3692n;
import com.bamtechmedia.dominguez.core.content.C3693o;
import com.bamtechmedia.dominguez.core.content.assets.C3632f;
import com.bamtechmedia.dominguez.core.content.playback.queryaction.C3711a;
import com.bamtechmedia.dominguez.core.content.playback.queryaction.C3714d;
import com.bamtechmedia.dominguez.core.content.playback.queryaction.C3715e;
import com.bamtechmedia.dominguez.core.framework.C5741g.C5742a;
import com.bamtechmedia.dominguez.core.utils.C5884x;
import com.bamtechmedia.dominguez.playback.p237m.C6336a;
import com.bamtechmedia.dominguez.playback.p237m.C6341e;
import com.bamtechmedia.dominguez.playback.p237m.p252q.C6501b.C6504c;
import com.bamtechmedia.dominguez.playback.p237m.p252q.C6507c;
import com.bamtechmedia.dominguez.playback.p237m.p252q.C6510e;
import com.bamtechmedia.dominguez.profiles.C6626c0;
import com.bamtechmedia.dominguez.profiles.C6667g1;
import java.util.Locale;
import kotlin.C13142s;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import org.joda.time.DateTime;
import org.joda.time.DateTime.Property;
import p520io.reactivex.Observable;
import p520io.reactivex.ObservableSource;
import p520io.reactivex.Single;
import p520io.reactivex.functions.Function;
import p520io.reactivex.p524d0.C11918b;
import p686n.p687a.Timber;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B+\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b¢\u0006\u0002\u0010\fJ\u0010\u0010\r\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\u0002H\u0002J,\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00052\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0014H\u0002J\u001a\u0010\u0015\u001a\u0004\u0018\u00010\u00142\u0006\u0010\u0012\u001a\u00020\u00052\u0006\u0010\u0013\u001a\u00020\u0014H\u0002J\u0018\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0002H\u0016J&\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u00052\u0006\u0010\u001b\u001a\u00020\u00022\u0006\u0010\u001c\u001a\u00020\u0002H\u0002J\u0018\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0002H\u0002J\u001e\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00020\u00172\u0006\u0010\u001b\u001a\u00020\u00022\u0006\u0010\u001c\u001a\u00020\u0002H\u0002R\u000e\u0010\b\u001a\u00020\tX\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0004¢\u0006\u0002\n\u0000¨\u0006\u001f"}, mo31007d2 = {"Lcom/bamtechmedia/dominguez/playback/common/events/upnext/TriggerLoadUpNextEvent;", "Lcom/bamtechmedia/dominguez/core/framework/ReactiveViewModel$Event;", "Lcom/bamtechmedia/dominguez/playback/common/PlaybackState;", "request", "Lio/reactivex/Single;", "Lcom/bamtechmedia/dominguez/core/content/playback/queryaction/UpNextResult;", "upNextActionResolver", "Lcom/bamtechmedia/dominguez/playback/common/upnext/UpNextActionResolver;", "profilesRepository", "Lcom/bamtechmedia/dominguez/profiles/ProfilesRepository;", "upNextConfig", "Lcom/bamtechmedia/dominguez/playback/common/upnext/UpNextConfig;", "(Lio/reactivex/Single;Lcom/bamtechmedia/dominguez/playback/common/upnext/UpNextActionResolver;Lcom/bamtechmedia/dominguez/profiles/ProfilesRepository;Lcom/bamtechmedia/dominguez/playback/common/upnext/UpNextConfig;)V", "copyPlaybackStateWithEmptyUpNextState", "playbackState", "copyPlaybackStateWithUpNextState", "playable", "Lcom/bamtechmedia/dominguez/core/content/Playable;", "result", "appLanguage", "", "getSunriseDayOfTheWeek", "process", "Lio/reactivex/Observable;", "currentState", "queryForNetworkOrOfflineEpisode", "upNextResult", "state", "returnStateIfEmpty", "queryUpNextContent", "updateStateWithNextOfflineContent", "playback_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* renamed from: com.bamtechmedia.dominguez.playback.m.o.f.g */
/* compiled from: TriggerLoadUpNextEvent.kt */
public final class C6486g implements C5742a<C6336a> {

    /* renamed from: a */
    private final Single<C3714d> f14683a;

    /* renamed from: b */
    private final C6507c f14684b;

    /* renamed from: c */
    private final C6667g1 f14685c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public final C6510e f14686d;

    /* renamed from: com.bamtechmedia.dominguez.playback.m.o.f.g$a */
    /* compiled from: TriggerLoadUpNextEvent.kt */
    static final class C6487a<T, R> implements Function<Throwable, C3693o> {

        /* renamed from: c */
        final /* synthetic */ C3685g f14687c;

        C6487a(C3685g gVar) {
            this.f14687c = gVar;
        }

        /* renamed from: a */
        public final C3685g apply(Throwable th) {
            return this.f14687c;
        }
    }

    /* renamed from: com.bamtechmedia.dominguez.playback.m.o.f.g$b */
    /* compiled from: TriggerLoadUpNextEvent.kt */
    static final class C6488b<T, R> implements Function<T, R> {

        /* renamed from: U */
        final /* synthetic */ C6336a f14688U;

        /* renamed from: V */
        final /* synthetic */ C3714d f14689V;

        /* renamed from: c */
        final /* synthetic */ C6486g f14690c;

        C6488b(C6486g gVar, C6336a aVar, C3714d dVar) {
            this.f14690c = gVar;
            this.f14688U = aVar;
            this.f14689V = dVar;
        }

        /* renamed from: a */
        public final C6336a apply(C3693o oVar) {
            return C6486g.m20202a(this.f14690c, this.f14688U, oVar, this.f14689V, null, 8, null);
        }
    }

    /* renamed from: com.bamtechmedia.dominguez.playback.m.o.f.g$c */
    /* compiled from: TriggerLoadUpNextEvent.kt */
    static final class C6489c<T, R> implements Function<T, ObservableSource<? extends R>> {

        /* renamed from: U */
        final /* synthetic */ C6336a f14691U;

        /* renamed from: V */
        final /* synthetic */ C6336a f14692V;

        /* renamed from: c */
        final /* synthetic */ C6486g f14693c;

        C6489c(C6486g gVar, C6336a aVar, C6336a aVar2) {
            this.f14693c = gVar;
            this.f14691U = aVar;
            this.f14692V = aVar2;
        }

        /* renamed from: a */
        public final Observable<C6336a> apply(Pair<? extends C6626c0, C3714d> pair) {
            String X = ((C6626c0) pair.mo31015c()).mo19352P().mo19792X();
            C3714d dVar = (C3714d) pair.mo31016d();
            C6510e a = this.f14693c.f14686d;
            Intrinsics.checkReturnedValueIsNotNull((Object) dVar, "result");
            String str = "Observable.just(copyPlay…NextState(playbackState))";
            String str2 = " is not currently supported";
            String str3 = "## UPNEXT -> Up Next scenario for ";
            if (a.mo19171a(dVar)) {
                int i = C6485f.$EnumSwitchMapping$0[dVar.mo13538d().ordinal()];
                if (i != 1) {
                    if (i == 2) {
                        C3632f b = dVar.mo13536b();
                        if (b != null) {
                            Observable<C6336a> b2 = Observable.m38309b(C6486g.m20202a(this.f14693c, this.f14691U, (C3692n) b, dVar, null, 8, null));
                            Intrinsics.checkReturnedValueIsNotNull((Object) b2, "Observable.just(copyPlay…ackState, movie, result))");
                            return b2;
                        }
                        throw new C13142s("null cannot be cast to non-null type com.bamtechmedia.dominguez.core.content.Movie");
                    } else if (i == 3 || i == 4) {
                        C3632f b3 = dVar.mo13536b();
                        if (b3 != null) {
                            Observable<C6336a> b4 = Observable.m38309b(this.f14693c.m20199a(this.f14691U, (C3693o) (C3686h) b3, dVar, X));
                            Intrinsics.checkReturnedValueIsNotNull((Object) b4, "Observable.just(copyPlay…ra, result, appLanguage))");
                            return b4;
                        }
                        throw new C13142s("null cannot be cast to non-null type com.bamtechmedia.dominguez.core.content.Extra");
                    } else {
                        StringBuilder sb = new StringBuilder();
                        sb.append(str3);
                        sb.append(dVar);
                        sb.append(str2);
                        Timber.m44532e(sb.toString(), new Object[0]);
                        Observable<C6336a> b5 = Observable.m38309b(this.f14693c.m20209b(this.f14691U));
                        Intrinsics.checkReturnedValueIsNotNull((Object) b5, str);
                        return b5;
                    }
                } else if (dVar.mo13539e() == C3715e.SEQUENTIAL) {
                    return this.f14693c.m20204a(dVar, this.f14691U, this.f14692V);
                } else {
                    C3632f b6 = dVar.mo13536b();
                    if (b6 != null) {
                        Observable<C6336a> b7 = Observable.m38309b(C6486g.m20202a(this.f14693c, this.f14691U, (C3685g) b6, dVar, null, 8, null));
                        Intrinsics.checkReturnedValueIsNotNull((Object) b7, "Observable.just(copyPlay…kState, episode, result))");
                        return b7;
                    }
                    throw new C13142s("null cannot be cast to non-null type com.bamtechmedia.dominguez.core.content.Episode");
                }
            } else {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(str3);
                sb2.append(dVar);
                sb2.append(str2);
                Timber.m44532e(sb2.toString(), new Object[0]);
                Observable<C6336a> b8 = Observable.m38309b(this.f14693c.m20209b(this.f14691U));
                Intrinsics.checkReturnedValueIsNotNull((Object) b8, str);
                return b8;
            }
        }
    }

    /* renamed from: com.bamtechmedia.dominguez.playback.m.o.f.g$d */
    /* compiled from: TriggerLoadUpNextEvent.kt */
    static final class C6490d<T, R> implements Function<Throwable, ObservableSource<? extends C6336a>> {

        /* renamed from: U */
        final /* synthetic */ C6336a f14694U;

        /* renamed from: V */
        final /* synthetic */ C6336a f14695V;

        /* renamed from: c */
        final /* synthetic */ C6486g f14696c;

        C6490d(C6486g gVar, C6336a aVar, C6336a aVar2) {
            this.f14696c = gVar;
            this.f14694U = aVar;
            this.f14695V = aVar2;
        }

        /* renamed from: a */
        public final Observable<C6336a> apply(Throwable th) {
            Timber.m44528b(th, "error when requesting up next from server", new Object[0]);
            return this.f14696c.m20205a(this.f14694U, this.f14695V);
        }
    }

    /* renamed from: com.bamtechmedia.dominguez.playback.m.o.f.g$e */
    /* compiled from: TriggerLoadUpNextEvent.kt */
    static final class C6491e<T, R> implements Function<T, R> {

        /* renamed from: U */
        final /* synthetic */ C6336a f14697U;

        /* renamed from: c */
        final /* synthetic */ C6486g f14698c;

        C6491e(C6486g gVar, C6336a aVar) {
            this.f14698c = gVar;
            this.f14697U = aVar;
        }

        /* renamed from: a */
        public final C6336a apply(C3693o oVar) {
            C3715e eVar = C3715e.RECOMMENDATION;
            C3711a aVar = C3711a.EPISODE;
            C3714d dVar = new C3714d(eVar, null, aVar, aVar, null, 18, null);
            return C6486g.m20202a(this.f14698c, this.f14697U, oVar, dVar, null, 8, null);
        }
    }

    public C6486g(Single<C3714d> single, C6507c cVar, C6667g1 g1Var, C6510e eVar) {
        this.f14683a = single;
        this.f14684b = cVar;
        this.f14685c = g1Var;
        this.f14686d = eVar;
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public final C6336a m20209b(C6336a aVar) {
        C6336a aVar2 = aVar;
        C6504c cVar = C6504c.f14719a;
        C6341e eVar = r1;
        C6341e eVar2 = new C6341e(null, null, null, null, 15, null);
        return C6336a.m19906a(aVar2, null, null, null, null, null, false, null, false, 0, cVar, eVar, null, null, false, false, 31227, null);
    }

    /* renamed from: c */
    private final Observable<C6336a> m20210c(C6336a aVar) {
        C6336a aVar2 = aVar;
        C5884x.m18951a((Object) aVar2, (String) null, 1, (Object) null);
        C6336a aVar3 = aVar2;
        C6336a aVar4 = aVar3;
        C6341e eVar = r5;
        C6341e eVar2 = new C6341e(null, null, null, null, 15, null);
        C6336a a = C6336a.m19906a(aVar4, null, null, null, null, null, false, null, false, 0, null, eVar, null, null, false, false, 31739, null);
        Observable<C6336a> h = C11918b.f27600a.mo30245a(this.f14685c.mo19381b(), this.f14683a).mo30225d((Function<? super T, ? extends ObservableSource<? extends R>>) new C6489c<Object,Object>(this, aVar3, a)).mo30196h(new C6490d(this, aVar3, a));
        Intrinsics.checkReturnedValueIsNotNull((Object) h, "Singles.zip(profilesRepo…mptyUpNext)\n            }");
        return h;
    }

    /* renamed from: a */
    public Observable<C6336a> mo17627a(C6336a aVar) {
        return m20210c(aVar);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final Observable<C6336a> m20205a(C6336a aVar, C6336a aVar2) {
        C3693o c = aVar.mo18954c();
        if (c instanceof C3685g) {
            Observable<C6336a> f = this.f14684b.mo19169b(c).mo30131f(new C6491e(this, aVar)).mo30108a(aVar2).mo30132f();
            Intrinsics.checkReturnedValueIsNotNull((Object) f, "upNextActionResolver.get…          .toObservable()");
            return f;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("UpNext offline playback for ");
        sb.append(aVar.mo18954c());
        sb.append(" is not currently handled");
        Timber.m44532e(sb.toString(), new Object[0]);
        Observable<C6336a> b = Observable.m38309b(aVar2);
        Intrinsics.checkReturnedValueIsNotNull((Object) b, "Observable.just(returnStateIfEmpty)");
        return b;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final Observable<C6336a> m20204a(C3714d dVar, C6336a aVar, C6336a aVar2) {
        C3632f b = dVar.mo13536b();
        if (!(b instanceof C3685g)) {
            b = null;
        }
        C3685g gVar = (C3685g) b;
        if (gVar != null) {
            Observable<C6336a> i = this.f14684b.mo19168a(gVar.mo12903f()).mo30237i(new C6487a(gVar)).mo30233g(new C6488b(this, aVar, dVar)).mo30236i();
            Intrinsics.checkReturnedValueIsNotNull((Object) i, "upNextActionResolver.get…          .toObservable()");
            return i;
        }
        Observable<C6336a> b2 = Observable.m38309b(aVar2);
        Intrinsics.checkReturnedValueIsNotNull((Object) b2, "Observable.just(returnStateIfEmpty)");
        return b2;
    }

    /* renamed from: a */
    static /* synthetic */ C6336a m20202a(C6486g gVar, C6336a aVar, C3693o oVar, C3714d dVar, String str, int i, Object obj) {
        if ((i & 8) != 0) {
            str = null;
        }
        return gVar.m20199a(aVar, oVar, dVar, str);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final C6336a m20199a(C6336a aVar, C3693o oVar, C3714d dVar, String str) {
        String str2 = str;
        return C6336a.m19906a(aVar, null, null, oVar, null, null, false, null, false, 0, null, aVar.mo18964k().mo18977a(dVar.mo13539e(), dVar.mo13537c(), dVar.mo13538d(), str2 != null ? m20208a(dVar, str2) : null), null, null, false, false, 31739, null);
    }

    /* renamed from: a */
    private final String m20208a(C3714d dVar, String str) {
        DateTime a = dVar.mo13535a();
        if (a != null) {
            Property dayOfWeek = a.dayOfWeek();
            if (dayOfWeek != null) {
                return dayOfWeek.getAsText(Locale.forLanguageTag(str));
            }
        }
        return null;
    }
}
