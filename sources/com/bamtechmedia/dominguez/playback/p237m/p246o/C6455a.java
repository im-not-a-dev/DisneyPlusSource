package com.bamtechmedia.dominguez.playback.p237m.p246o;

import com.bamtech.player.exo.sdk4.SDK4ExoPlaybackEngine;
import com.bamtech.sdk4.media.MediaItemPlaylist;
import com.bamtech.sdk4.media.PlaybackContext;
import com.bamtechmedia.dominguez.core.content.C3693o;
import com.bamtechmedia.dominguez.core.framework.C5741g.C5742a;
import com.bamtechmedia.dominguez.playback.common.query.PlayableQueryAction;
import com.bamtechmedia.dominguez.playback.p237m.C6336a;
import com.bamtechmedia.dominguez.playback.p237m.p242m.p243e.C6427a;
import com.bamtechmedia.dominguez.playback.p237m.p242m.p244f.C6439c;
import com.bamtechmedia.dominguez.playback.p237m.p252q.p253g.C6512a;
import com.bamtechmedia.dominguez.profiles.C6626c0;
import com.bamtechmedia.dominguez.profiles.C6667g1;
import com.bamtechmedia.dominguez.profiles.C7019z;
import java.util.concurrent.Callable;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import p520io.reactivex.Completable;
import p520io.reactivex.CompletableSource;
import p520io.reactivex.Maybe;
import p520io.reactivex.Observable;
import p520io.reactivex.Single;
import p520io.reactivex.SingleSource;
import p520io.reactivex.functions.Consumer;
import p520io.reactivex.functions.Function;
import p686n.p687a.Timber;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001BO\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\u0006\u0010\u000f\u001a\u00020\u0010\u0012\u0006\u0010\u0011\u001a\u00020\u0012\u0012\u0006\u0010\u0013\u001a\u00020\u0014¢\u0006\u0002\u0010\u0015J\u001a\u0010\u0016\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u00172\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0002J\u0018\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u0002H\u0016R\u000e\u0010\u0011\u001a\u00020\u0012X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0014X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0004¢\u0006\u0002\n\u0000¨\u0006\u001b"}, mo31007d2 = {"Lcom/bamtechmedia/dominguez/playback/common/events/EngineWasCreatedEvent;", "Lcom/bamtechmedia/dominguez/core/framework/ReactiveViewModel$Event;", "Lcom/bamtechmedia/dominguez/playback/common/PlaybackState;", "engine", "Lcom/bamtech/player/exo/sdk4/SDK4ExoPlaybackEngine;", "initialPlayable", "Lcom/bamtechmedia/dominguez/core/content/Playable;", "contentId", "", "playableQueryAction", "Lcom/bamtechmedia/dominguez/playback/common/query/PlayableQueryAction;", "kidsOnly", "", "sessionStarter", "Lcom/bamtechmedia/dominguez/playback/common/engine/session/SessionStarter;", "engineLanguageSetup", "Lcom/bamtechmedia/dominguez/playback/common/engine/languages/EngineLanguageSetup;", "autoPlayRules", "Lcom/bamtechmedia/dominguez/playback/common/upnext/autoplay/AutoPlayRules;", "profilesRepository", "Lcom/bamtechmedia/dominguez/profiles/ProfilesRepository;", "(Lcom/bamtech/player/exo/sdk4/SDK4ExoPlaybackEngine;Lcom/bamtechmedia/dominguez/core/content/Playable;Ljava/lang/String;Lcom/bamtechmedia/dominguez/playback/common/query/PlayableQueryAction;ZLcom/bamtechmedia/dominguez/playback/common/engine/session/SessionStarter;Lcom/bamtechmedia/dominguez/playback/common/engine/languages/EngineLanguageSetup;Lcom/bamtechmedia/dominguez/playback/common/upnext/autoplay/AutoPlayRules;Lcom/bamtechmedia/dominguez/profiles/ProfilesRepository;)V", "assignOrRequestPlayable", "Lio/reactivex/Single;", "process", "Lio/reactivex/Observable;", "currentState", "playback_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* renamed from: com.bamtechmedia.dominguez.playback.m.o.a */
/* compiled from: EngineWasCreatedEvent.kt */
public final class C6455a implements C5742a<C6336a> {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final SDK4ExoPlaybackEngine f14644a;

    /* renamed from: b */
    private final C3693o f14645b;

    /* renamed from: c */
    private final String f14646c;

    /* renamed from: d */
    private final PlayableQueryAction f14647d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public final C6439c f14648e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public final C6427a f14649f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public final C6512a f14650g;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public final C6667g1 f14651h;

    /* renamed from: com.bamtechmedia.dominguez.playback.m.o.a$a */
    /* compiled from: EngineWasCreatedEvent.kt */
    static final class C6456a<V> implements Callable<T> {

        /* renamed from: c */
        final /* synthetic */ C3693o f14652c;

        C6456a(C3693o oVar) {
            this.f14652c = oVar;
        }

        public final C3693o call() {
            return this.f14652c;
        }
    }

    @Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u0010\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, mo31007d2 = {"<anonymous>", "Lio/reactivex/Single;", "Lcom/bamtechmedia/dominguez/playback/common/PlaybackState;", "kotlin.jvm.PlatformType", "playable", "Lcom/bamtechmedia/dominguez/core/content/Playable;", "apply"}, mo31008k = 3, mo31009mv = {1, 1, 15})
    /* renamed from: com.bamtechmedia.dominguez.playback.m.o.a$b */
    /* compiled from: EngineWasCreatedEvent.kt */
    static final class C6457b<T, R> implements Function<T, SingleSource<? extends R>> {

        /* renamed from: c */
        final /* synthetic */ C6455a f14653c;

        /* renamed from: com.bamtechmedia.dominguez.playback.m.o.a$b$a */
        /* compiled from: EngineWasCreatedEvent.kt */
        static final class C6458a<T, R> implements Function<T, R> {

            /* renamed from: c */
            public static final C6458a f14654c = new C6458a();

            C6458a() {
            }

            /* renamed from: a */
            public final C7019z apply(C6626c0 c0Var) {
                return c0Var.mo19352P();
            }
        }

        /* renamed from: com.bamtechmedia.dominguez.playback.m.o.a$b$b */
        /* compiled from: EngineWasCreatedEvent.kt */
        static final class C6459b<T, R> implements Function<C7019z, CompletableSource> {

            /* renamed from: U */
            final /* synthetic */ C3693o f14655U;

            /* renamed from: c */
            final /* synthetic */ C6457b f14656c;

            C6459b(C6457b bVar, C3693o oVar) {
                this.f14656c = bVar;
                this.f14655U = oVar;
            }

            /* renamed from: a */
            public final Completable apply(C7019z zVar) {
                C6427a c = this.f14656c.f14653c.f14649f;
                SDK4ExoPlaybackEngine b = this.f14656c.f14653c.f14644a;
                C3693o oVar = this.f14655U;
                Intrinsics.checkReturnedValueIsNotNull((Object) oVar, "playable");
                return c.mo19080a(zVar, b, oVar);
            }
        }

        /* renamed from: com.bamtechmedia.dominguez.playback.m.o.a$b$c */
        /* compiled from: EngineWasCreatedEvent.kt */
        static final class C6460c<T, R> implements Function<T, R> {

            /* renamed from: U */
            final /* synthetic */ C3693o f14657U;

            /* renamed from: c */
            final /* synthetic */ C6457b f14658c;

            C6460c(C6457b bVar, C3693o oVar) {
                this.f14658c = bVar;
                this.f14657U = oVar;
            }

            /* renamed from: a */
            public final C6336a apply(Pair<? extends MediaItemPlaylist, ? extends PlaybackContext> pair) {
                C6336a aVar = new C6336a(this.f14658c.f14653c.f14644a, this.f14657U, null, null, null, false, null, false, 0, null, null, (PlaybackContext) pair.mo31016d(), null, false, false, 30716, null);
                return aVar;
            }
        }

        /* renamed from: com.bamtechmedia.dominguez.playback.m.o.a$b$d */
        /* compiled from: EngineWasCreatedEvent.kt */
        static final class C6461d<T> implements Consumer<C6336a> {

            /* renamed from: c */
            final /* synthetic */ C6457b f14659c;

            C6461d(C6457b bVar) {
                this.f14659c = bVar;
            }

            /* renamed from: a */
            public final void accept(C6336a aVar) {
                this.f14659c.f14653c.f14650g.mo19174z();
            }
        }

        C6457b(C6455a aVar) {
            this.f14653c = aVar;
        }

        /* renamed from: a */
        public final Single<C6336a> apply(C3693o oVar) {
            return this.f14653c.f14651h.mo19382c().mo30233g(C6458a.f14654c).mo30217b((Function<? super T, ? extends CompletableSource>) new C6459b<Object,Object>(this, oVar)).mo30044a((SingleSource<T>) C6439c.m20113a(this.f14653c.f14648e, this.f14653c.f14644a, oVar, false, 4, null).mo30233g(new C6460c(this, oVar))).mo30207a((Consumer<? super T>) new C6461d<Object>(this));
        }
    }

    /* renamed from: com.bamtechmedia.dominguez.playback.m.o.a$c */
    /* compiled from: EngineWasCreatedEvent.kt */
    static final class C6462c<T, R> implements Function<Throwable, C6336a> {

        /* renamed from: c */
        final /* synthetic */ C6455a f14660c;

        C6462c(C6455a aVar) {
            this.f14660c = aVar;
        }

        /* renamed from: a */
        public final C6336a apply(Throwable th) {
            Throwable th2 = th;
            Throwable th3 = th;
            Timber.m44528b(th3, "error loading content", new Object[0]);
            C6336a aVar = new C6336a(this.f14660c.f14644a, null, null, null, null, false, th2, false, 0, null, null, null, null, false, false, 32700, null);
            return aVar;
        }
    }

    public C6455a(SDK4ExoPlaybackEngine sDK4ExoPlaybackEngine, C3693o oVar, String str, PlayableQueryAction playableQueryAction, boolean z, C6439c cVar, C6427a aVar, C6512a aVar2, C6667g1 g1Var) {
        this.f14644a = sDK4ExoPlaybackEngine;
        this.f14645b = oVar;
        this.f14646c = str;
        this.f14647d = playableQueryAction;
        this.f14648e = cVar;
        this.f14649f = aVar;
        this.f14650g = aVar2;
        this.f14651h = g1Var;
    }

    /* renamed from: a */
    public Observable<C6336a> mo17627a(C6336a aVar) {
        Observable<C6336a> i = m20144a(this.f14645b).mo30208a((Function<? super T, ? extends SingleSource<? extends R>>) new C6457b<Object,Object>(this)).mo30236i().mo30198i(new C6462c(this));
        Intrinsics.checkReturnedValueIsNotNull((Object) i, "assignOrRequestPlayable(…error = it)\n            }");
        return i;
    }

    /* renamed from: a */
    private final Single<C3693o> m20144a(C3693o oVar) {
        Single<C3693o> a = Maybe.m38257b((Callable<? extends T>) new C6456a<Object>(oVar)).mo30109a((SingleSource<? extends T>) this.f14647d.mo18894a(this.f14646c));
        Intrinsics.checkReturnedValueIsNotNull((Object) a, "Maybe.fromCallable { ini…playableQuery(contentId))");
        return a;
    }
}
