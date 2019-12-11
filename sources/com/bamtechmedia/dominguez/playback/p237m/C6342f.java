package com.bamtechmedia.dominguez.playback.p237m;

import android.net.Uri;
import com.bamtech.player.exo.sdk4.SDK4ExoPlaybackEngine;
import com.bamtechmedia.dominguez.core.content.C3693o;
import com.bamtechmedia.dominguez.core.content.playback.queryaction.C3712b;
import com.bamtechmedia.dominguez.core.framework.C5741g;
import com.bamtechmedia.dominguez.core.utils.C5861q;
import com.bamtechmedia.dominguez.core.utils.C5884x;
import com.bamtechmedia.dominguez.playback.common.contentrating.C6284a;
import com.bamtechmedia.dominguez.playback.common.query.PlayableQueryAction;
import com.bamtechmedia.dominguez.playback.p237m.p239j.C6394h;
import com.bamtechmedia.dominguez.playback.p237m.p242m.p243e.C6427a;
import com.bamtechmedia.dominguez.playback.p237m.p242m.p244f.C6439c;
import com.bamtechmedia.dominguez.playback.p237m.p246o.C6455a;
import com.bamtechmedia.dominguez.playback.p237m.p246o.C6463b;
import com.bamtechmedia.dominguez.playback.p237m.p246o.p247c.C6465b;
import com.bamtechmedia.dominguez.playback.p237m.p246o.p247c.C6468e;
import com.bamtechmedia.dominguez.playback.p237m.p246o.p248d.C6469a;
import com.bamtechmedia.dominguez.playback.p237m.p246o.p248d.C6470b;
import com.bamtechmedia.dominguez.playback.p237m.p246o.p249e.C6472a;
import com.bamtechmedia.dominguez.playback.p237m.p246o.p250f.C6476a;
import com.bamtechmedia.dominguez.playback.p237m.p246o.p250f.C6478c;
import com.bamtechmedia.dominguez.playback.p237m.p246o.p250f.C6486g;
import com.bamtechmedia.dominguez.playback.p237m.p252q.C6501b;
import com.bamtechmedia.dominguez.playback.p237m.p252q.C6501b.C6503b;
import com.bamtechmedia.dominguez.playback.p237m.p252q.C6501b.C6504c;
import com.bamtechmedia.dominguez.playback.p237m.p252q.C6501b.C6505d;
import com.bamtechmedia.dominguez.playback.p237m.p252q.C6507c;
import com.bamtechmedia.dominguez.playback.p237m.p252q.C6510e;
import com.bamtechmedia.dominguez.playback.p237m.p252q.p253g.C6512a;
import com.bamtechmedia.dominguez.profiles.C6667g1;
import java.util.concurrent.TimeUnit;
import kotlin.C13145v;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12879i;
import kotlin.jvm.internal.C12880j;
import kotlin.jvm.internal.C12881k;
import kotlin.jvm.internal.C12895y;
import kotlin.reflect.KDeclarationContainer;
import p163g.p174d.p178b.C5300m;
import p163g.p174d.p178b.C5326w;
import p163g.p174d.p178b.p195l0.C5298a;
import p163g.p174d.p178b.p195l0.C5299b;
import p520io.reactivex.Observable;
import p520io.reactivex.ObservableSource;
import p520io.reactivex.functions.C11952h;
import p520io.reactivex.functions.Consumer;
import p520io.reactivex.functions.Function;
import p686n.p687a.C14100a;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 H2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001HBM\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\u0006\u0010\u000f\u001a\u00020\u0010\u0012\u0006\u0010\u0011\u001a\u00020\u0012\u0012\u0006\u0010\u0013\u001a\u00020\u0014¢\u0006\u0002\u0010\u0015J\u0018\u0010*\u001a\n ,*\u0004\u0018\u00010+0+2\u0006\u0010-\u001a\u00020.H\u0002J\u0018\u0010/\u001a\n ,*\u0004\u0018\u00010+0+2\u0006\u0010-\u001a\u00020.H\u0002J\u0018\u00100\u001a\n ,*\u0004\u0018\u00010+0+2\u0006\u0010-\u001a\u00020.H\u0002J\u0010\u00101\u001a\u0002022\u0006\u0010-\u001a\u00020.H\u0003J\u0010\u00103\u001a\u0002022\u0006\u0010-\u001a\u00020.H\u0003J\u0010\u00104\u001a\u0002022\u0006\u00105\u001a\u000206H\u0002J2\u00107\u001a\u0002022\u0006\u0010-\u001a\u00020.2\b\u00108\u001a\u0004\u0018\u0001062\u0006\u00109\u001a\u00020:2\b\b\u0002\u0010\u001a\u001a\u00020\u001b2\u0006\u0010;\u001a\u00020\u001bJ\u0010\u0010<\u001a\u0002022\u0006\u0010-\u001a\u00020.H\u0003J\u0010\u0010=\u001a\u0002022\u0006\u0010>\u001a\u000206H\u0002J\b\u0010?\u001a\u000202H\u0002J\u0012\u0010@\u001a\u0004\u0018\u00010A2\u0006\u00105\u001a\u000206H\u0002J\u0010\u0010B\u001a\u0002022\u0006\u00105\u001a\u000206H\u0002J\u0010\u0010C\u001a\u00020\u001b2\u0006\u0010D\u001a\u00020\u001bH\u0002J\u0010\u0010E\u001a\u0002022\u0006\u0010-\u001a\u00020.H\u0002J\u0015\u0010F\u001a\u0002022\u0006\u0010-\u001a\u00020.H\u0001¢\u0006\u0002\bGR\u000e\u0010\u000f\u001a\u00020\u0010X\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0016\u001a\u00020\u00178F¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019R\u000e\u0010\u000b\u001a\u00020\fX\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u001a\u001a\u00020\u001bX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR$\u0010 \u001a\u00020!8\u0006@\u0006X\u000e¢\u0006\u0014\n\u0000\u0012\u0004\b\"\u0010#\u001a\u0004\b$\u0010%\"\u0004\b&\u0010'R\u000e\u0010\u0007\u001a\u00020\bX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0014X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0004¢\u0006\u0002\n\u0000R\u0014\u0010(\u001a\u00020\u00178BX\u0004¢\u0006\u0006\u001a\u0004\b)\u0010\u0019¨\u0006I"}, mo31007d2 = {"Lcom/bamtechmedia/dominguez/playback/common/VideoPlaybackViewModel;", "Lcom/bamtechmedia/dominguez/core/framework/ReactiveViewModel;", "Lcom/bamtechmedia/dominguez/playback/common/PlaybackState;", "playableQueryAction", "Lcom/bamtechmedia/dominguez/playback/common/query/PlayableQueryAction;", "upNextQueryAction", "Lcom/bamtechmedia/dominguez/core/content/playback/queryaction/UpNextQueryAction;", "nextRecommendation", "Lcom/bamtechmedia/dominguez/playback/common/upnext/UpNextActionResolver;", "sessionStarter", "Lcom/bamtechmedia/dominguez/playback/common/engine/session/SessionStarter;", "engineLanguageSetup", "Lcom/bamtechmedia/dominguez/playback/common/engine/languages/EngineLanguageSetup;", "playerAnalytics", "Lcom/bamtechmedia/dominguez/playback/common/analytics/PlayerAnalytics;", "autoPlayRules", "Lcom/bamtechmedia/dominguez/playback/common/upnext/autoplay/AutoPlayRules;", "profilesRepository", "Lcom/bamtechmedia/dominguez/profiles/ProfilesRepository;", "upNextConfig", "Lcom/bamtechmedia/dominguez/playback/common/upnext/UpNextConfig;", "(Lcom/bamtechmedia/dominguez/playback/common/query/PlayableQueryAction;Lcom/bamtechmedia/dominguez/core/content/playback/queryaction/UpNextQueryAction;Lcom/bamtechmedia/dominguez/playback/common/upnext/UpNextActionResolver;Lcom/bamtechmedia/dominguez/playback/common/engine/session/SessionStarter;Lcom/bamtechmedia/dominguez/playback/common/engine/languages/EngineLanguageSetup;Lcom/bamtechmedia/dominguez/playback/common/analytics/PlayerAnalytics;Lcom/bamtechmedia/dominguez/playback/common/upnext/autoplay/AutoPlayRules;Lcom/bamtechmedia/dominguez/profiles/ProfilesRepository;Lcom/bamtechmedia/dominguez/playback/common/upnext/UpNextConfig;)V", "currentPlayhead", "", "getCurrentPlayhead", "()J", "fromDeeplink", "", "getFromDeeplink", "()Z", "setFromDeeplink", "(Z)V", "mediator", "Lcom/bamtechmedia/dominguez/playback/common/StateMediator;", "mediator$annotations", "()V", "getMediator", "()Lcom/bamtechmedia/dominguez/playback/common/StateMediator;", "setMediator", "(Lcom/bamtechmedia/dominguez/playback/common/StateMediator;)V", "videoDuration", "getVideoDuration", "configureUpNextForMilestone", "Lio/reactivex/disposables/Disposable;", "kotlin.jvm.PlatformType", "engine", "Lcom/bamtech/player/exo/sdk4/SDK4ExoPlaybackEngine;", "handlePrematurelyHidingRatingOverlay", "handleReshowingRatingOverlay", "launchCloseIconOnInitialBuffering", "", "launchRatingAndMilestoneOnVideoStart", "loadUpNextValue", "currentPlayable", "Lcom/bamtechmedia/dominguez/core/content/Playable;", "onEngineCreated", "initialPlayable", "contentId", "", "kidsOnly", "playerErrors", "replaceNextState", "newNextPlayable", "sendPageLoad", "setMilestoneLocation", "Lcom/bamtech/player/upnext/UpNextTimeEvents;", "setMilestones", "shouldAcceptVisibilityChange", "show", "subscribeToEvents", "trackVideoEnd", "trackVideoEnd$playback_release", "Companion", "playback_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* renamed from: com.bamtechmedia.dominguez.playback.m.f */
/* compiled from: VideoPlaybackViewModel.kt */
public final class C6342f extends C5741g<C6336a> {

    /* renamed from: a */
    private boolean f14445a;

    /* renamed from: b */
    private C6338c f14446b = new C6338c(this);

    /* renamed from: c */
    private final PlayableQueryAction f14447c;

    /* renamed from: d */
    private final C3712b f14448d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public final C6507c f14449e;

    /* renamed from: f */
    private final C6439c f14450f;

    /* renamed from: g */
    private final C6427a f14451g;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public final C6394h f14452h;

    /* renamed from: i */
    private final C6512a f14453i;

    /* renamed from: j */
    private final C6667g1 f14454j;

    /* renamed from: k */
    private final C6510e f14455k;

    /* renamed from: com.bamtechmedia.dominguez.playback.m.f$a */
    /* compiled from: VideoPlaybackViewModel.kt */
    public static final class C6343a {
        private C6343a() {
        }

        public /* synthetic */ C6343a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: com.bamtechmedia.dominguez.playback.m.f$b */
    /* compiled from: VideoPlaybackViewModel.kt */
    static final class C6344b<T> implements C11952h<Boolean> {

        /* renamed from: c */
        final /* synthetic */ C6342f f14456c;

        C6344b(C6342f fVar) {
            this.f14456c = fVar;
        }

        /* renamed from: a */
        public final boolean test(Boolean bool) {
            return this.f14456c.m19951d(bool.booleanValue());
        }
    }

    @Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\b\u0003\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, mo31007d2 = {"<anonymous>", "Lio/reactivex/Observable;", "Lcom/bamtechmedia/dominguez/playback/common/upnext/UpNextAction;", "visibility", "", "apply", "(Ljava/lang/Boolean;)Lio/reactivex/Observable;", "com/bamtechmedia/dominguez/playback/common/VideoPlaybackViewModel$configureUpNextForMilestone$1$2"}, mo31008k = 3, mo31009mv = {1, 1, 15})
    /* renamed from: com.bamtechmedia.dominguez.playback.m.f$c */
    /* compiled from: VideoPlaybackViewModel.kt */
    static final class C6345c<T, R> implements Function<T, ObservableSource<? extends R>> {

        /* renamed from: c */
        final /* synthetic */ C6342f f14457c;

        /* renamed from: com.bamtechmedia.dominguez.playback.m.f$c$a */
        /* compiled from: VideoPlaybackViewModel.kt */
        static final /* synthetic */ class C6346a extends C12879i implements Function1<C3693o, C13145v> {
            C6346a(C6342f fVar) {
                super(1, fVar);
            }

            /* renamed from: a */
            public final void mo18992a(C3693o oVar) {
                ((C6342f) this.receiver).m19942b(oVar);
            }

            public final String getName() {
                return "replaceNextState";
            }

            public final KDeclarationContainer getOwner() {
                return C12895y.m40230a(C6342f.class);
            }

            public final String getSignature() {
                return "replaceNextState(Lcom/bamtechmedia/dominguez/core/content/Playable;)V";
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                mo18992a((C3693o) obj);
                return C13145v.f29587a;
            }
        }

        C6345c(C6342f fVar) {
            this.f14457c = fVar;
        }

        /* renamed from: a */
        public final Observable<C6501b> apply(Boolean bool) {
            C6341e eVar;
            C6507c a = this.f14457c.f14449e;
            boolean booleanValue = bool.booleanValue();
            C6336a aVar = (C6336a) this.f14457c.getCurrentState();
            C3693o c = aVar != null ? aVar.mo18954c() : null;
            C6336a aVar2 = (C6336a) this.f14457c.getCurrentState();
            C3693o f = aVar2 != null ? aVar2.mo18958f() : null;
            C6336a aVar3 = (C6336a) this.f14457c.getCurrentState();
            if (aVar3 != null) {
                C6341e k = aVar3.mo18964k();
                if (k != null) {
                    eVar = k;
                    return a.mo19167a(booleanValue, c, f, true, eVar, new C6346a(this.f14457c));
                }
            }
            eVar = new C6341e(null, null, null, null, 15, null);
            return a.mo19167a(booleanValue, c, f, true, eVar, new C6346a(this.f14457c));
        }
    }

    /* renamed from: com.bamtechmedia.dominguez.playback.m.f$d */
    /* compiled from: VideoPlaybackViewModel.kt */
    static final class C6347d<T> implements Consumer<C6501b> {

        /* renamed from: c */
        final /* synthetic */ C6342f f14458c;

        C6347d(C6342f fVar) {
            this.f14458c = fVar;
        }

        /* renamed from: a */
        public final void accept(C6501b bVar) {
            C6338c A = this.f14458c.mo18985A();
            C12880j.m40222a((Object) bVar, "it");
            if (A.mo18973a(bVar)) {
                this.f14458c.submitEvent(new C6472a());
            }
        }
    }

    /* renamed from: com.bamtechmedia.dominguez.playback.m.f$e */
    /* compiled from: VideoPlaybackViewModel.kt */
    static final class C6348e<T> implements Consumer<C6501b> {

        /* renamed from: c */
        final /* synthetic */ C6342f f14459c;

        C6348e(C6342f fVar) {
            this.f14459c = fVar;
        }

        /* renamed from: a */
        public final void accept(C6501b bVar) {
            C6342f fVar = this.f14459c;
            C12880j.m40222a((Object) bVar, "it");
            fVar.submitEvent(new C6476a(bVar));
        }
    }

    /* renamed from: com.bamtechmedia.dominguez.playback.m.f$f */
    /* compiled from: VideoPlaybackViewModel.kt */
    static final /* synthetic */ class C6349f extends C12879i implements Function1<Throwable, C13145v> {

        /* renamed from: c */
        public static final C6349f f14460c = new C6349f();

        C6349f() {
            super(1);
        }

        /* renamed from: a */
        public final void mo18995a(Throwable th) {
            C14100a.m44523a(th);
        }

        public final String getName() {
            return "e";
        }

        public final KDeclarationContainer getOwner() {
            return C12895y.m40230a(C14100a.class);
        }

        public final String getSignature() {
            return "e(Ljava/lang/Throwable;)V";
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo18995a((Throwable) obj);
            return C13145v.f29587a;
        }
    }

    /* renamed from: com.bamtechmedia.dominguez.playback.m.f$g */
    /* compiled from: VideoPlaybackViewModel.kt */
    static final class C6350g<T> implements C11952h<Boolean> {

        /* renamed from: c */
        final /* synthetic */ C6342f f14461c;

        C6350g(C6342f fVar) {
            this.f14461c = fVar;
        }

        /* renamed from: a */
        public final boolean test(Boolean bool) {
            return bool.booleanValue() && this.f14461c.mo18985A().mo18974b();
        }
    }

    /* renamed from: com.bamtechmedia.dominguez.playback.m.f$h */
    /* compiled from: VideoPlaybackViewModel.kt */
    static final class C6351h<T> implements Consumer<Boolean> {

        /* renamed from: c */
        final /* synthetic */ C6342f f14462c;

        C6351h(C6342f fVar) {
            this.f14462c = fVar;
        }

        /* renamed from: a */
        public final void accept(Boolean bool) {
            this.f14462c.submitEvent(new C6465b());
        }
    }

    /* renamed from: com.bamtechmedia.dominguez.playback.m.f$i */
    /* compiled from: VideoPlaybackViewModel.kt */
    static final /* synthetic */ class C6352i extends C12879i implements Function1<Throwable, C13145v> {

        /* renamed from: c */
        public static final C6352i f14463c = new C6352i();

        C6352i() {
            super(1);
        }

        /* renamed from: a */
        public final void mo18998a(Throwable th) {
            C14100a.m44523a(th);
        }

        public final String getName() {
            return "e";
        }

        public final KDeclarationContainer getOwner() {
            return C12895y.m40230a(C14100a.class);
        }

        public final String getSignature() {
            return "e(Ljava/lang/Throwable;)V";
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo18998a((Throwable) obj);
            return C13145v.f29587a;
        }
    }

    /* renamed from: com.bamtechmedia.dominguez.playback.m.f$j */
    /* compiled from: VideoPlaybackViewModel.kt */
    static final class C6353j<T> implements C11952h<Boolean> {

        /* renamed from: c */
        final /* synthetic */ C6342f f14464c;

        C6353j(C6342f fVar) {
            this.f14464c = fVar;
        }

        /* renamed from: a */
        public final boolean test(Boolean bool) {
            return !bool.booleanValue() && this.f14464c.mo18985A().mo18976d();
        }
    }

    /* renamed from: com.bamtechmedia.dominguez.playback.m.f$k */
    /* compiled from: VideoPlaybackViewModel.kt */
    static final class C6354k<T> implements Consumer<Boolean> {

        /* renamed from: c */
        final /* synthetic */ C6342f f14465c;

        C6354k(C6342f fVar) {
            this.f14465c = fVar;
        }

        /* renamed from: a */
        public final void accept(Boolean bool) {
            C6342f fVar = this.f14465c;
            C6336a aVar = (C6336a) fVar.getCurrentState();
            Object c = aVar != null ? aVar.mo18954c() : null;
            C5884x.m18951a(c, (String) null, 1, (Object) null);
            fVar.submitEvent(new C6468e((C3693o) c, C6284a.SHORT_DURATION));
        }
    }

    /* renamed from: com.bamtechmedia.dominguez.playback.m.f$l */
    /* compiled from: VideoPlaybackViewModel.kt */
    static final /* synthetic */ class C6355l extends C12879i implements Function1<Throwable, C13145v> {

        /* renamed from: c */
        public static final C6355l f14466c = new C6355l();

        C6355l() {
            super(1);
        }

        /* renamed from: a */
        public final void mo19001a(Throwable th) {
            C14100a.m44523a(th);
        }

        public final String getName() {
            return "e";
        }

        public final KDeclarationContainer getOwner() {
            return C12895y.m40230a(C14100a.class);
        }

        public final String getSignature() {
            return "e(Ljava/lang/Throwable;)V";
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo19001a((Throwable) obj);
            return C13145v.f29587a;
        }
    }

    @Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, mo31007d2 = {"<anonymous>", "", "it", "Landroid/net/Uri;", "kotlin.jvm.PlatformType", "accept"}, mo31008k = 3, mo31009mv = {1, 1, 15})
    /* renamed from: com.bamtechmedia.dominguez.playback.m.f$m */
    /* compiled from: VideoPlaybackViewModel.kt */
    static final class C6356m<T> implements Consumer<Uri> {

        /* renamed from: c */
        final /* synthetic */ C6342f f14467c;

        /* renamed from: com.bamtechmedia.dominguez.playback.m.f$m$a */
        /* compiled from: VideoPlaybackViewModel.kt */
        static final class C6357a extends C12881k implements Function1<C6336a, C6336a> {

            /* renamed from: c */
            public static final C6357a f14468c = new C6357a();

            C6357a() {
                super(1);
            }

            /* renamed from: a */
            public final C6336a invoke(C6336a aVar) {
                return C6336a.m19906a(aVar, null, null, null, null, null, false, null, false, 0, null, null, null, null, true, false, 24575, null);
            }
        }

        C6356m(C6342f fVar) {
            this.f14467c = fVar;
        }

        /* renamed from: a */
        public final void accept(Uri uri) {
            this.f14467c.updateState(C6357a.f14468c);
        }
    }

    /* renamed from: com.bamtechmedia.dominguez.playback.m.f$n */
    /* compiled from: VideoPlaybackViewModel.kt */
    static final /* synthetic */ class C6358n extends C12879i implements Function1<Throwable, C13145v> {

        /* renamed from: c */
        public static final C6358n f14469c = new C6358n();

        C6358n() {
            super(1);
        }

        /* renamed from: a */
        public final void mo19004a(Throwable th) {
            C14100a.m44523a(th);
        }

        public final String getName() {
            return "e";
        }

        public final KDeclarationContainer getOwner() {
            return C12895y.m40230a(C14100a.class);
        }

        public final String getSignature() {
            return "e(Ljava/lang/Throwable;)V";
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo19004a((Throwable) obj);
            return C13145v.f29587a;
        }
    }

    @Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a&\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002 \u0003*\u0012\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002\u0018\u00010\u00010\u00012\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, mo31007d2 = {"<anonymous>", "Lio/reactivex/Observable;", "", "kotlin.jvm.PlatformType", "it", "Landroid/net/Uri;", "apply"}, mo31008k = 3, mo31009mv = {1, 1, 15})
    /* renamed from: com.bamtechmedia.dominguez.playback.m.f$o */
    /* compiled from: VideoPlaybackViewModel.kt */
    static final class C6359o<T, R> implements Function<T, ObservableSource<? extends R>> {

        /* renamed from: c */
        final /* synthetic */ SDK4ExoPlaybackEngine f14470c;

        /* renamed from: com.bamtechmedia.dominguez.playback.m.f$o$a */
        /* compiled from: VideoPlaybackViewModel.kt */
        static final class C6360a<T> implements C11952h<Boolean> {

            /* renamed from: c */
            public static final C6360a f14471c = new C6360a();

            C6360a() {
            }

            /* renamed from: a */
            public final Boolean mo19006a(Boolean bool) {
                return bool;
            }

            public /* bridge */ /* synthetic */ boolean test(Object obj) {
                Boolean bool = (Boolean) obj;
                mo19006a(bool);
                return bool.booleanValue();
            }
        }

        C6359o(SDK4ExoPlaybackEngine sDK4ExoPlaybackEngine) {
            this.f14470c = sDK4ExoPlaybackEngine;
        }

        /* renamed from: a */
        public final Observable<Boolean> apply(Uri uri) {
            return this.f14470c.mo7537b().mo17014b0().mo30150a((C11952h<? super T>) C6360a.f14471c).mo30183d(1);
        }
    }

    /* renamed from: com.bamtechmedia.dominguez.playback.m.f$p */
    /* compiled from: VideoPlaybackViewModel.kt */
    static final class C6361p<T> implements Consumer<Boolean> {

        /* renamed from: c */
        final /* synthetic */ C6342f f14472c;

        C6361p(C6342f fVar) {
            this.f14472c = fVar;
        }

        /* renamed from: a */
        public final void accept(Boolean bool) {
            this.f14472c.m19935C();
        }
    }

    /* renamed from: com.bamtechmedia.dominguez.playback.m.f$q */
    /* compiled from: VideoPlaybackViewModel.kt */
    static final class C6362q<T> implements Consumer<Boolean> {

        /* renamed from: c */
        final /* synthetic */ C6342f f14473c;

        C6362q(C6342f fVar) {
            this.f14473c = fVar;
        }

        /* renamed from: a */
        public final void accept(Boolean bool) {
            C6336a aVar = (C6336a) this.f14473c.getCurrentState();
            if (aVar != null) {
                C3693o c = aVar.mo18954c();
                if (c != null) {
                    this.f14473c.m19937a(c);
                    this.f14473c.m19944c(c);
                    this.f14473c.m19949d(c);
                    this.f14473c.f14452h.mo19046a(c);
                }
            }
        }
    }

    @Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, mo31007d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "accept", "(Ljava/lang/Boolean;)V"}, mo31008k = 3, mo31009mv = {1, 1, 15})
    /* renamed from: com.bamtechmedia.dominguez.playback.m.f$r */
    /* compiled from: VideoPlaybackViewModel.kt */
    static final class C6363r<T> implements Consumer<Boolean> {

        /* renamed from: c */
        final /* synthetic */ C6342f f14474c;

        /* renamed from: com.bamtechmedia.dominguez.playback.m.f$r$a */
        /* compiled from: VideoPlaybackViewModel.kt */
        static final class C6364a extends C12881k implements Function1<C6336a, C6336a> {

            /* renamed from: c */
            public static final C6364a f14475c = new C6364a();

            C6364a() {
                super(1);
            }

            /* renamed from: a */
            public final C6336a invoke(C6336a aVar) {
                return C6336a.m19906a(aVar, null, null, null, null, null, false, null, false, 0, null, null, null, null, false, false, 16383, null);
            }
        }

        C6363r(C6342f fVar) {
            this.f14474c = fVar;
        }

        /* renamed from: a */
        public final void accept(Boolean bool) {
            this.f14474c.updateState(C6364a.f14475c);
            this.f14474c.submitEvent(new C6469a());
            C6342f fVar = this.f14474c;
            C6336a aVar = (C6336a) fVar.getCurrentState();
            C3693o c = aVar != null ? aVar.mo18954c() : null;
            if (c != null) {
                fVar.submitEvent(new C6468e(c, C6284a.SHORT_DURATION));
            } else {
                C12880j.m40220a();
                throw null;
            }
        }
    }

    /* renamed from: com.bamtechmedia.dominguez.playback.m.f$s */
    /* compiled from: VideoPlaybackViewModel.kt */
    static final /* synthetic */ class C6365s extends C12879i implements Function1<Throwable, C13145v> {

        /* renamed from: c */
        public static final C6365s f14476c = new C6365s();

        C6365s() {
            super(1);
        }

        /* renamed from: a */
        public final void mo19011a(Throwable th) {
            C14100a.m44523a(th);
        }

        public final String getName() {
            return "e";
        }

        public final KDeclarationContainer getOwner() {
            return C12895y.m40230a(C14100a.class);
        }

        public final String getSignature() {
            return "e(Ljava/lang/Throwable;)V";
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo19011a((Throwable) obj);
            return C13145v.f29587a;
        }
    }

    /* renamed from: com.bamtechmedia.dominguez.playback.m.f$t */
    /* compiled from: VideoPlaybackViewModel.kt */
    static final class C6366t<T> implements Consumer<Throwable> {

        /* renamed from: c */
        public static final C6366t f14477c = new C6366t();

        C6366t() {
        }

        /* renamed from: a */
        public final void accept(Throwable th) {
            C14100a.m44528b(th, "playback exception", new Object[0]);
        }
    }

    /* renamed from: com.bamtechmedia.dominguez.playback.m.f$u */
    /* compiled from: VideoPlaybackViewModel.kt */
    static final /* synthetic */ class C6367u extends C12879i implements Function1<Throwable, C13145v> {

        /* renamed from: c */
        public static final C6367u f14478c = new C6367u();

        C6367u() {
            super(1);
        }

        /* renamed from: a */
        public final void mo19013a(Throwable th) {
            C14100a.m44523a(th);
        }

        public final String getName() {
            return "e";
        }

        public final KDeclarationContainer getOwner() {
            return C12895y.m40230a(C14100a.class);
        }

        public final String getSignature() {
            return "e(Ljava/lang/Throwable;)V";
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo19013a((Throwable) obj);
            return C13145v.f29587a;
        }
    }

    @Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\u0010\u0000\u001a\u0012\u0012\u000e\b\u0001\u0012\n \u0003*\u0004\u0018\u00010\u00020\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, mo31007d2 = {"<anonymous>", "Lio/reactivex/Observable;", "Lcom/bamtechmedia/dominguez/playback/common/upnext/UpNextAction;", "kotlin.jvm.PlatformType", "it", "", "apply"}, mo31008k = 3, mo31009mv = {1, 1, 15})
    /* renamed from: com.bamtechmedia.dominguez.playback.m.f$v */
    /* compiled from: VideoPlaybackViewModel.kt */
    static final class C6368v<T, R> implements Function<T, ObservableSource<? extends R>> {

        /* renamed from: c */
        final /* synthetic */ C6342f f14479c;

        /* renamed from: com.bamtechmedia.dominguez.playback.m.f$v$a */
        /* compiled from: VideoPlaybackViewModel.kt */
        static final /* synthetic */ class C6369a extends C12879i implements Function1<C3693o, C13145v> {
            C6369a(C6342f fVar) {
                super(1, fVar);
            }

            /* renamed from: a */
            public final void mo19014a(C3693o oVar) {
                ((C6342f) this.receiver).m19942b(oVar);
            }

            public final String getName() {
                return "replaceNextState";
            }

            public final KDeclarationContainer getOwner() {
                return C12895y.m40230a(C6342f.class);
            }

            public final String getSignature() {
                return "replaceNextState(Lcom/bamtechmedia/dominguez/core/content/Playable;)V";
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                mo19014a((C3693o) obj);
                return C13145v.f29587a;
            }
        }

        C6368v(C6342f fVar) {
            this.f14479c = fVar;
        }

        public final Observable<? extends C6501b> apply(Object obj) {
            C6341e eVar;
            C6336a aVar = (C6336a) this.f14479c.getCurrentState();
            if (!(aVar != null ? aVar.mo18965l() : true)) {
                C6507c a = this.f14479c.f14449e;
                C6336a aVar2 = (C6336a) this.f14479c.getCurrentState();
                C3693o oVar = null;
                C3693o c = aVar2 != null ? aVar2.mo18954c() : null;
                C6336a aVar3 = (C6336a) this.f14479c.getCurrentState();
                if (aVar3 != null) {
                    oVar = aVar3.mo18958f();
                }
                C3693o oVar2 = oVar;
                C6336a aVar4 = (C6336a) this.f14479c.getCurrentState();
                if (aVar4 != null) {
                    C6341e k = aVar4.mo18964k();
                    if (k != null) {
                        eVar = k;
                        return a.mo19167a(true, c, oVar2, false, eVar, new C6369a(this.f14479c));
                    }
                }
                eVar = new C6341e(null, null, null, null, 15, null);
                return a.mo19167a(true, c, oVar2, false, eVar, new C6369a(this.f14479c));
            }
            Observable<? extends C6501b> b = Observable.m38309b(C6505d.f14720a);
            C12880j.m40222a((Object) b, "Observable.just(IgnoreUpNextPreparing)");
            return b;
        }
    }

    /* renamed from: com.bamtechmedia.dominguez.playback.m.f$w */
    /* compiled from: VideoPlaybackViewModel.kt */
    static final class C6370w<T> implements Consumer<C6501b> {

        /* renamed from: c */
        final /* synthetic */ C6342f f14480c;

        C6370w(C6342f fVar) {
            this.f14480c = fVar;
        }

        /* renamed from: a */
        public final void accept(C6501b bVar) {
            if (C12880j.m40224a((Object) bVar, (Object) C6504c.f14719a) || C12880j.m40224a((Object) bVar, (Object) C6503b.f14718a)) {
                this.f14480c.submitEvent(new C6463b(null, null, 3, null));
            } else if (C12880j.m40224a((Object) bVar, (Object) C6505d.f14720a)) {
                C5861q.m18905a("Up Next visibility event while content was preparing");
            } else {
                C6342f fVar = this.f14480c;
                C12880j.m40222a((Object) bVar, "upNextAction");
                fVar.submitEvent(new C6476a(bVar));
            }
        }
    }

    /* renamed from: com.bamtechmedia.dominguez.playback.m.f$x */
    /* compiled from: VideoPlaybackViewModel.kt */
    static final /* synthetic */ class C6371x extends C12879i implements Function1<Throwable, C13145v> {

        /* renamed from: c */
        public static final C6371x f14481c = new C6371x();

        C6371x() {
            super(1);
        }

        /* renamed from: a */
        public final void mo19016a(Throwable th) {
            C14100a.m44523a(th);
        }

        public final String getName() {
            return "e";
        }

        public final KDeclarationContainer getOwner() {
            return C12895y.m40230a(C14100a.class);
        }

        public final String getSignature() {
            return "e(Ljava/lang/Throwable;)V";
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo19016a((Throwable) obj);
            return C13145v.f29587a;
        }
    }

    static {
        new C6343a(null);
    }

    public C6342f(PlayableQueryAction playableQueryAction, C3712b bVar, C6507c cVar, C6439c cVar2, C6427a aVar, C6394h hVar, C6512a aVar2, C6667g1 g1Var, C6510e eVar) {
        super(null, 1, null);
        this.f14447c = playableQueryAction;
        this.f14448d = bVar;
        this.f14449e = cVar;
        this.f14450f = cVar2;
        this.f14451g = aVar;
        this.f14452h = hVar;
        this.f14453i = aVar2;
        this.f14454j = g1Var;
        this.f14455k = eVar;
    }

    /* renamed from: B */
    private final long m19934B() {
        C6336a aVar = (C6336a) getCurrentState();
        if (aVar != null) {
            SDK4ExoPlaybackEngine d = aVar.mo18955d();
            if (d != null) {
                C5326w d2 = d.mo7539d();
                if (d2 != null) {
                    return d2.getDuration();
                }
            }
        }
        return 0;
    }

    /* access modifiers changed from: private */
    /* renamed from: C */
    public final void m19935C() {
        this.f14452h.mo19044a();
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [com.bamtechmedia.dominguez.playback.m.f$n, kotlin.jvm.functions.Function1] */
    /* JADX WARNING: type inference failed for: r1v1 */
    /* JADX WARNING: type inference failed for: r2v0, types: [com.bamtechmedia.dominguez.playback.m.h] */
    /* JADX WARNING: type inference failed for: r1v3 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 2 */
    @android.annotation.SuppressLint({"CheckResult"})
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void m19952e(com.bamtech.player.exo.sdk4.SDK4ExoPlaybackEngine r4) {
        /*
            r3 = this;
            g.d.b.m r4 = r4.mo7537b()
            io.reactivex.Observable r4 = r4.mo16973U()
            com.bamtechmedia.dominguez.playback.m.f$m r0 = new com.bamtechmedia.dominguez.playback.m.f$m
            r0.<init>(r3)
            com.bamtechmedia.dominguez.playback.m.f$n r1 = com.bamtechmedia.dominguez.playback.p237m.C6342f.C6358n.f14469c
            if (r1 == 0) goto L_0x0017
            com.bamtechmedia.dominguez.playback.m.h r2 = new com.bamtechmedia.dominguez.playback.m.h
            r2.<init>(r1)
            r1 = r2
        L_0x0017:
            io.reactivex.functions.Consumer r1 = (p520io.reactivex.functions.Consumer) r1
            r4.mo30157a(r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bamtechmedia.dominguez.playback.p237m.C6342f.m19952e(com.bamtech.player.exo.sdk4.SDK4ExoPlaybackEngine):void");
    }

    /* JADX WARNING: type inference failed for: r1v1, types: [kotlin.jvm.functions.Function1, com.bamtechmedia.dominguez.playback.m.f$s] */
    /* JADX WARNING: type inference failed for: r1v2 */
    /* JADX WARNING: type inference failed for: r2v0, types: [com.bamtechmedia.dominguez.playback.m.h] */
    /* JADX WARNING: type inference failed for: r1v4 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 2 */
    @android.annotation.SuppressLint({"CheckResult"})
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void m19953f(com.bamtech.player.exo.sdk4.SDK4ExoPlaybackEngine r4) {
        /*
            r3 = this;
            g.d.b.m r0 = r4.mo7537b()
            io.reactivex.Observable r0 = r0.mo16973U()
            com.bamtechmedia.dominguez.playback.m.f$o r1 = new com.bamtechmedia.dominguez.playback.m.f$o
            r1.<init>(r4)
            io.reactivex.Observable r4 = r0.mo30178c(r1)
            com.bamtechmedia.dominguez.playback.m.f$p r0 = new com.bamtechmedia.dominguez.playback.m.f$p
            r0.<init>(r3)
            io.reactivex.Observable r4 = r4.mo30184d(r0)
            com.bamtechmedia.dominguez.playback.m.f$q r0 = new com.bamtechmedia.dominguez.playback.m.f$q
            r0.<init>(r3)
            io.reactivex.Observable r4 = r4.mo30141a(r0)
            com.bamtechmedia.dominguez.playback.m.f$r r0 = new com.bamtechmedia.dominguez.playback.m.f$r
            r0.<init>(r3)
            com.bamtechmedia.dominguez.playback.m.f$s r1 = com.bamtechmedia.dominguez.playback.p237m.C6342f.C6365s.f14476c
            if (r1 == 0) goto L_0x0032
            com.bamtechmedia.dominguez.playback.m.h r2 = new com.bamtechmedia.dominguez.playback.m.h
            r2.<init>(r1)
            r1 = r2
        L_0x0032:
            io.reactivex.functions.Consumer r1 = (p520io.reactivex.functions.Consumer) r1
            r4.mo30157a(r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bamtechmedia.dominguez.playback.p237m.C6342f.m19953f(com.bamtech.player.exo.sdk4.SDK4ExoPlaybackEngine):void");
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [com.bamtechmedia.dominguez.playback.m.f$u, kotlin.jvm.functions.Function1] */
    /* JADX WARNING: type inference failed for: r1v1 */
    /* JADX WARNING: type inference failed for: r2v0, types: [com.bamtechmedia.dominguez.playback.m.h] */
    /* JADX WARNING: type inference failed for: r1v3 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 2 */
    @android.annotation.SuppressLint({"CheckResult"})
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void m19954g(com.bamtech.player.exo.sdk4.SDK4ExoPlaybackEngine r4) {
        /*
            r3 = this;
            g.d.b.m r4 = r4.mo7537b()
            io.reactivex.Observable r4 = r4.mo17024d0()
            com.bamtechmedia.dominguez.playback.m.f$t r0 = com.bamtechmedia.dominguez.playback.p237m.C6342f.C6366t.f14477c
            com.bamtechmedia.dominguez.playback.m.f$u r1 = com.bamtechmedia.dominguez.playback.p237m.C6342f.C6367u.f14478c
            if (r1 == 0) goto L_0x0014
            com.bamtechmedia.dominguez.playback.m.h r2 = new com.bamtechmedia.dominguez.playback.m.h
            r2.<init>(r1)
            r1 = r2
        L_0x0014:
            io.reactivex.functions.Consumer r1 = (p520io.reactivex.functions.Consumer) r1
            r4.mo30157a(r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bamtechmedia.dominguez.playback.p237m.C6342f.m19954g(com.bamtech.player.exo.sdk4.SDK4ExoPlaybackEngine):void");
    }

    /* renamed from: h */
    private final void m19955h(SDK4ExoPlaybackEngine sDK4ExoPlaybackEngine) {
        m19952e(sDK4ExoPlaybackEngine);
        m19953f(sDK4ExoPlaybackEngine);
        m19948d(sDK4ExoPlaybackEngine);
        m19946c(sDK4ExoPlaybackEngine);
        mo18986a(sDK4ExoPlaybackEngine);
        m19941b(sDK4ExoPlaybackEngine);
        m19954g(sDK4ExoPlaybackEngine);
        this.f14452h.mo19045a(sDK4ExoPlaybackEngine);
    }

    /* renamed from: A */
    public final C6338c mo18985A() {
        return this.f14446b;
    }

    /* renamed from: y */
    public final long mo18988y() {
        C6336a aVar = (C6336a) getCurrentState();
        if (aVar != null) {
            SDK4ExoPlaybackEngine d = aVar.mo18955d();
            if (d != null) {
                C5326w d2 = d.mo7539d();
                if (d2 != null) {
                    return d2.getCurrentPosition();
                }
            }
        }
        return 0;
    }

    /* renamed from: z */
    public final boolean mo18989z() {
        return this.f14445a;
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public final void m19949d(C3693o oVar) {
        Long t = oVar.mo13279t();
        Long o = oVar.mo13276o();
        if (!(t == null || o == null)) {
            C6336a aVar = (C6336a) getCurrentState();
            if (aVar != null) {
                SDK4ExoPlaybackEngine d = aVar.mo18955d();
                if (d != null) {
                    d.mo7530a(t.longValue(), 10000, o.longValue());
                }
            }
        }
        Long k = oVar.mo13272k();
        Long p = oVar.mo13277p();
        if (k != null && p != null) {
            C6336a aVar2 = (C6336a) getCurrentState();
            if (aVar2 != null) {
                SDK4ExoPlaybackEngine d2 = aVar2.mo18955d();
                if (d2 != null) {
                    d2.mo7538b(k.longValue(), 10000, p.longValue());
                }
            }
        }
    }

    /* JADX WARNING: type inference failed for: r1v2, types: [com.bamtechmedia.dominguez.playback.m.f$f, kotlin.jvm.functions.Function1] */
    /* JADX WARNING: type inference failed for: r1v3 */
    /* JADX WARNING: type inference failed for: r2v0, types: [com.bamtechmedia.dominguez.playback.m.g] */
    /* JADX WARNING: type inference failed for: r1v5 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 2 */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final p520io.reactivex.disposables.Disposable m19941b(com.bamtech.player.exo.sdk4.SDK4ExoPlaybackEngine r14) {
        /*
            r13 = this;
            g.d.b.m r14 = r14.mo7537b()
            g.d.b.l0.b r14 = r14.mo16974U0()
            g.d.b.l0.a r12 = new g.d.b.l0.a
            java.util.concurrent.TimeUnit r0 = java.util.concurrent.TimeUnit.SECONDS
            r1 = 20
            long r4 = r0.toMillis(r1)
            r1 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            r3 = 0
            r6 = 0
            r7 = 0
            r9 = 0
            r10 = 58
            r11 = 0
            r0 = r12
            r0.<init>(r1, r3, r4, r6, r7, r9, r10, r11)
            r14.mo16929a(r12)
            io.reactivex.Observable r14 = r14.mo16932c()
            com.bamtechmedia.dominguez.playback.m.f$b r0 = new com.bamtechmedia.dominguez.playback.m.f$b
            r0.<init>(r13)
            io.reactivex.Observable r14 = r14.mo30150a(r0)
            com.bamtechmedia.dominguez.playback.m.f$c r0 = new com.bamtechmedia.dominguez.playback.m.f$c
            r0.<init>(r13)
            io.reactivex.Observable r14 = r14.mo30178c(r0)
            com.bamtechmedia.dominguez.playback.m.f$d r0 = new com.bamtechmedia.dominguez.playback.m.f$d
            r0.<init>(r13)
            io.reactivex.Observable r14 = r14.mo30184d(r0)
            com.bamtechmedia.dominguez.playback.m.f$e r0 = new com.bamtechmedia.dominguez.playback.m.f$e
            r0.<init>(r13)
            com.bamtechmedia.dominguez.playback.m.f$f r1 = com.bamtechmedia.dominguez.playback.p237m.C6342f.C6349f.f14460c
            if (r1 == 0) goto L_0x0054
            com.bamtechmedia.dominguez.playback.m.g r2 = new com.bamtechmedia.dominguez.playback.m.g
            r2.<init>(r1)
            r1 = r2
        L_0x0054:
            io.reactivex.functions.Consumer r1 = (p520io.reactivex.functions.Consumer) r1
            io.reactivex.disposables.Disposable r14 = r14.mo30157a(r0, r1)
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bamtechmedia.dominguez.playback.p237m.C6342f.m19941b(com.bamtech.player.exo.sdk4.SDK4ExoPlaybackEngine):io.reactivex.disposables.Disposable");
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public final C5299b m19944c(C3693o oVar) {
        C6336a aVar = (C6336a) getCurrentState();
        if (aVar != null) {
            SDK4ExoPlaybackEngine d = aVar.mo18955d();
            if (d != null) {
                C5300m b = d.mo7537b();
                if (b != null) {
                    C5299b U0 = b.mo16974U0();
                    if (U0 != null) {
                        C5298a aVar2 = new C5298a(this.f14449e.mo19166a(oVar), null, TimeUnit.SECONDS.toMillis(20), null, 0, null, 58, null);
                        U0.mo16929a(aVar2);
                        return U0;
                    }
                }
            }
        }
        return null;
    }

    /* renamed from: a */
    public final void mo18987a(SDK4ExoPlaybackEngine sDK4ExoPlaybackEngine, C3693o oVar, String str, boolean z, boolean z2) {
        this.f14445a = z;
        submitEvent(new C6470b(sDK4ExoPlaybackEngine));
        C6455a aVar = new C6455a(sDK4ExoPlaybackEngine, oVar, str, this.f14447c, z2, this.f14450f, this.f14451g, this.f14453i, this.f14454j);
        submitEvent(aVar);
        m19955h(sDK4ExoPlaybackEngine);
    }

    /* JADX WARNING: type inference failed for: r1v1, types: [com.bamtechmedia.dominguez.playback.m.f$l, kotlin.jvm.functions.Function1] */
    /* JADX WARNING: type inference failed for: r1v2 */
    /* JADX WARNING: type inference failed for: r2v1, types: [com.bamtechmedia.dominguez.playback.m.h] */
    /* JADX WARNING: type inference failed for: r1v4 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 2 */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final p520io.reactivex.disposables.Disposable m19948d(com.bamtech.player.exo.sdk4.SDK4ExoPlaybackEngine r8) {
        /*
            r7 = this;
            g.d.b.m r8 = r8.mo7537b()
            io.reactivex.Observable r8 = r8.mo17076x()
            com.bamtechmedia.dominguez.playback.m.f$j r0 = new com.bamtechmedia.dominguez.playback.m.f$j
            r0.<init>(r7)
            io.reactivex.Observable r1 = r8.mo30150a(r0)
            java.util.concurrent.TimeUnit r4 = java.util.concurrent.TimeUnit.MILLISECONDS
            io.reactivex.r r5 = p520io.reactivex.p525e0.C11934b.m38498a()
            r2 = 350(0x15e, double:1.73E-321)
            r6 = 0
            io.reactivex.Observable r8 = r1.mo30139a(r2, r4, r5, r6)
            com.bamtechmedia.dominguez.playback.m.f$k r0 = new com.bamtechmedia.dominguez.playback.m.f$k
            r0.<init>(r7)
            com.bamtechmedia.dominguez.playback.m.f$l r1 = com.bamtechmedia.dominguez.playback.p237m.C6342f.C6355l.f14466c
            if (r1 == 0) goto L_0x002d
            com.bamtechmedia.dominguez.playback.m.h r2 = new com.bamtechmedia.dominguez.playback.m.h
            r2.<init>(r1)
            r1 = r2
        L_0x002d:
            io.reactivex.functions.Consumer r1 = (p520io.reactivex.functions.Consumer) r1
            io.reactivex.disposables.Disposable r8 = r8.mo30157a(r0, r1)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bamtechmedia.dominguez.playback.p237m.C6342f.m19948d(com.bamtech.player.exo.sdk4.SDK4ExoPlaybackEngine):io.reactivex.disposables.Disposable");
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [com.bamtechmedia.dominguez.playback.m.f$i, kotlin.jvm.functions.Function1] */
    /* JADX WARNING: type inference failed for: r1v1 */
    /* JADX WARNING: type inference failed for: r2v0, types: [com.bamtechmedia.dominguez.playback.m.h] */
    /* JADX WARNING: type inference failed for: r1v3 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 2 */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final p520io.reactivex.disposables.Disposable m19946c(com.bamtech.player.exo.sdk4.SDK4ExoPlaybackEngine r4) {
        /*
            r3 = this;
            g.d.b.m r4 = r4.mo7537b()
            io.reactivex.Observable r4 = r4.mo17076x()
            com.bamtechmedia.dominguez.playback.m.f$g r0 = new com.bamtechmedia.dominguez.playback.m.f$g
            r0.<init>(r3)
            io.reactivex.Observable r4 = r4.mo30150a(r0)
            com.bamtechmedia.dominguez.playback.m.f$h r0 = new com.bamtechmedia.dominguez.playback.m.f$h
            r0.<init>(r3)
            com.bamtechmedia.dominguez.playback.m.f$i r1 = com.bamtechmedia.dominguez.playback.p237m.C6342f.C6352i.f14463c
            if (r1 == 0) goto L_0x0020
            com.bamtechmedia.dominguez.playback.m.h r2 = new com.bamtechmedia.dominguez.playback.m.h
            r2.<init>(r1)
            r1 = r2
        L_0x0020:
            io.reactivex.functions.Consumer r1 = (p520io.reactivex.functions.Consumer) r1
            io.reactivex.disposables.Disposable r4 = r4.mo30157a(r0, r1)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bamtechmedia.dominguez.playback.p237m.C6342f.m19946c(com.bamtech.player.exo.sdk4.SDK4ExoPlaybackEngine):io.reactivex.disposables.Disposable");
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public final void m19942b(C3693o oVar) {
        submitEvent(new C6478c(oVar));
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final void m19937a(C3693o oVar) {
        submitEvent(new C6486g(this.f14448d.mo13477a(oVar.mo12903f()), this.f14449e, this.f14454j, this.f14455k));
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public final boolean m19951d(boolean z) {
        boolean c = this.f14446b.mo18975c();
        return (z && !c) || (!z && c && mo18988y() < m19934B());
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [com.bamtechmedia.dominguez.playback.m.f$x, kotlin.jvm.functions.Function1] */
    /* JADX WARNING: type inference failed for: r1v1 */
    /* JADX WARNING: type inference failed for: r2v0, types: [com.bamtechmedia.dominguez.playback.m.h] */
    /* JADX WARNING: type inference failed for: r1v3 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 2 */
    @android.annotation.SuppressLint({"CheckResult"})
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo18986a(com.bamtech.player.exo.sdk4.SDK4ExoPlaybackEngine r4) {
        /*
            r3 = this;
            g.d.b.m r4 = r4.mo7537b()
            io.reactivex.Observable r4 = r4.mo17019c0()
            com.bamtechmedia.dominguez.playback.m.f$v r0 = new com.bamtechmedia.dominguez.playback.m.f$v
            r0.<init>(r3)
            io.reactivex.Observable r4 = r4.mo30178c(r0)
            com.bamtechmedia.dominguez.playback.m.f$w r0 = new com.bamtechmedia.dominguez.playback.m.f$w
            r0.<init>(r3)
            com.bamtechmedia.dominguez.playback.m.f$x r1 = com.bamtechmedia.dominguez.playback.p237m.C6342f.C6371x.f14481c
            if (r1 == 0) goto L_0x0020
            com.bamtechmedia.dominguez.playback.m.h r2 = new com.bamtechmedia.dominguez.playback.m.h
            r2.<init>(r1)
            r1 = r2
        L_0x0020:
            io.reactivex.functions.Consumer r1 = (p520io.reactivex.functions.Consumer) r1
            r4.mo30157a(r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bamtechmedia.dominguez.playback.p237m.C6342f.mo18986a(com.bamtech.player.exo.sdk4.SDK4ExoPlaybackEngine):void");
    }
}
