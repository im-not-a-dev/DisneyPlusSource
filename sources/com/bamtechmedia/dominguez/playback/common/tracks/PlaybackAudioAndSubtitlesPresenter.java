package com.bamtechmedia.dominguez.playback.common.tracks;

import androidx.lifecycle.C0708c;
import androidx.lifecycle.C0710d;
import androidx.lifecycle.C0722m;
import com.bamtechmedia.dominguez.playback.C6327f;
import com.bamtechmedia.dominguez.profiles.C6626c0;
import com.bamtechmedia.dominguez.profiles.C6667g1;
import com.bamtechmedia.dominguez.profiles.C6673h1;
import com.bamtechmedia.dominguez.profiles.C6714j0;
import com.bamtechmedia.dominguez.profiles.C7019z;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.C13145v;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12879i;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.C12881k;
import kotlin.jvm.internal.C12895y;
import kotlin.p590y.C13180m;
import kotlin.reflect.KDeclarationContainer;
import p163g.p174d.p178b.p193j0.C5285a;
import p163g.p174d.p178b.p193j0.C5288c;
import p163g.p174d.p178b.p193j0.C5291e;
import p520io.reactivex.Observable;
import p520io.reactivex.Single;
import p520io.reactivex.SingleSource;
import p520io.reactivex.disposables.CompositeDisposable;
import p520io.reactivex.functions.Consumer;
import p520io.reactivex.functions.Function;
import p686n.p687a.Timber;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 #2\u00020\u00012\u00020\u0002:\u0001#B1\b\u0007\u0012\u000e\b\u0001\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\b\b\u0001\u0010\n\u001a\u00020\u000b¢\u0006\u0002\u0010\fJ\u0018\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u0010H\u0002J\u0016\u0010\u0013\u001a\u00020\u00142\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00170\u0016H\u0002J\u0016\u0010\u0018\u001a\u00020\u00142\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u001a0\u0016H\u0002J\u0010\u0010\u001b\u001a\u00020\u00142\u0006\u0010\u001c\u001a\u00020\u0017H\u0016J\u0010\u0010\u001d\u001a\u00020\u00142\u0006\u0010\u001e\u001a\u00020\u001fH\u0016J\u0010\u0010 \u001a\u00020\u00142\u0006\u0010\u001e\u001a\u00020\u001fH\u0016J\u0010\u0010!\u001a\u00020\u00142\u0006\u0010\"\u001a\u00020\u001aH\u0016R\u000e\u0010\n\u001a\u00020\u000bX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000¨\u0006$"}, mo31007d2 = {"Lcom/bamtechmedia/dominguez/playback/common/tracks/PlaybackAudioAndSubtitlesPresenter;", "Landroidx/lifecycle/DefaultLifecycleObserver;", "Lcom/bamtechmedia/dominguez/playback/common/tracks/ProfileUpdateListener;", "trackListObservable", "Lio/reactivex/Observable;", "Lcom/bamtech/player/tracks/TrackList;", "trackUpdateListener", "Lcom/bamtechmedia/dominguez/playback/common/tracks/TrackUpdateListener;", "profilesRepository", "Lcom/bamtechmedia/dominguez/profiles/ProfilesRepository;", "isTelevision", "", "(Lio/reactivex/Observable;Lcom/bamtechmedia/dominguez/playback/common/tracks/TrackUpdateListener;Lcom/bamtechmedia/dominguez/profiles/ProfilesRepository;Z)V", "profileUpdateDisposable", "Lio/reactivex/disposables/CompositeDisposable;", "determineNextAccessibilityId", "", "listSize", "currentPosition", "displayAudioTracks", "", "audioTracks", "", "Lcom/bamtech/player/tracks/AudioTrack;", "displaySubtitleTracks", "subtitleTracks", "Lcom/bamtech/player/tracks/SubtitleTrack;", "onAudioTrackSelected", "audioTrack", "onDestroy", "owner", "Landroidx/lifecycle/LifecycleOwner;", "onStart", "onSubtitleTrackSelected", "subtitleTrack", "Companion", "playback_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* compiled from: PlaybackAudioAndSubtitlesPresenter.kt */
public final class PlaybackAudioAndSubtitlesPresenter implements C0710d, C6316d {

    /* renamed from: U */
    private final Observable<C5291e> f14369U;

    /* renamed from: V */
    private final C6324g f14370V;
    /* access modifiers changed from: private */

    /* renamed from: W */
    public final C6667g1 f14371W;

    /* renamed from: X */
    private final boolean f14372X;

    /* renamed from: c */
    private final CompositeDisposable f14373c = new CompositeDisposable();

    /* renamed from: com.bamtechmedia.dominguez.playback.common.tracks.PlaybackAudioAndSubtitlesPresenter$a */
    /* compiled from: PlaybackAudioAndSubtitlesPresenter.kt */
    public static final class C6297a {
        private C6297a() {
        }

        public /* synthetic */ C6297a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0002\b\u0004"}, mo31007d2 = {"<anonymous>", "Lio/reactivex/Single;", "Lcom/bamtechmedia/dominguez/profiles/Profile;", "activeProfile", "apply"}, mo31008k = 3, mo31009mv = {1, 1, 15})
    /* renamed from: com.bamtechmedia.dominguez.playback.common.tracks.PlaybackAudioAndSubtitlesPresenter$b */
    /* compiled from: PlaybackAudioAndSubtitlesPresenter.kt */
    static final class C6298b<T, R> implements Function<T, SingleSource<? extends R>> {

        /* renamed from: U */
        final /* synthetic */ String f14374U;

        /* renamed from: V */
        final /* synthetic */ C5285a f14375V;

        /* renamed from: c */
        final /* synthetic */ PlaybackAudioAndSubtitlesPresenter f14376c;

        /* renamed from: com.bamtechmedia.dominguez.playback.common.tracks.PlaybackAudioAndSubtitlesPresenter$b$a */
        /* compiled from: PlaybackAudioAndSubtitlesPresenter.kt */
        static final class C6299a extends C12881k implements Function1<C6714j0, C13145v> {

            /* renamed from: U */
            final /* synthetic */ C6626c0 f14377U;

            /* renamed from: c */
            final /* synthetic */ C6298b f14378c;

            C6299a(C6298b bVar, C6626c0 c0Var) {
                this.f14378c = bVar;
                this.f14377U = c0Var;
                super(1);
            }

            /* renamed from: a */
            public final void mo18915a(C6714j0 j0Var) {
                C7019z P = this.f14377U.mo19352P();
                C6298b bVar = this.f14378c;
                j0Var.mo19435a(C7019z.m21314a(P, null, bVar.f14374U, Boolean.valueOf(bVar.f14375V.mo16861h()), null, null, null, 57, null));
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                mo18915a((C6714j0) obj);
                return C13145v.f29587a;
            }
        }

        C6298b(PlaybackAudioAndSubtitlesPresenter playbackAudioAndSubtitlesPresenter, String str, C5285a aVar) {
            this.f14376c = playbackAudioAndSubtitlesPresenter;
            this.f14374U = str;
            this.f14375V = aVar;
        }

        /* renamed from: a */
        public final Single<? extends C6626c0> apply(C6626c0 c0Var) {
            return C6673h1.m20691a(this.f14376c.f14371W, c0Var, new C6299a(this, c0Var));
        }
    }

    /* renamed from: com.bamtechmedia.dominguez.playback.common.tracks.PlaybackAudioAndSubtitlesPresenter$c */
    /* compiled from: PlaybackAudioAndSubtitlesPresenter.kt */
    static final class C6300c<T> implements Consumer<C6626c0> {

        /* renamed from: c */
        public static final C6300c f14379c = new C6300c();

        C6300c() {
        }

        /* renamed from: a */
        public final void accept(C6626c0 c0Var) {
            StringBuilder sb = new StringBuilder();
            sb.append("updated profile from audio track to ");
            sb.append(c0Var);
            Timber.m44522a(sb.toString(), new Object[0]);
        }
    }

    /* renamed from: com.bamtechmedia.dominguez.playback.common.tracks.PlaybackAudioAndSubtitlesPresenter$d */
    /* compiled from: PlaybackAudioAndSubtitlesPresenter.kt */
    static final /* synthetic */ class C6301d extends C12879i implements Function1<Throwable, C13145v> {

        /* renamed from: c */
        public static final C6301d f14380c = new C6301d();

        C6301d() {
            super(1);
        }

        /* renamed from: a */
        public final void mo18917a(Throwable th) {
            Timber.m44523a(th);
        }

        public final String getName() {
            return "e";
        }

        public final KDeclarationContainer getOwner() {
            return C12895y.m40230a(Timber.class);
        }

        public final String getSignature() {
            return "e(Ljava/lang/Throwable;)V";
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo18917a((Throwable) obj);
            return C13145v.f29587a;
        }
    }

    /* renamed from: com.bamtechmedia.dominguez.playback.common.tracks.PlaybackAudioAndSubtitlesPresenter$e */
    /* compiled from: PlaybackAudioAndSubtitlesPresenter.kt */
    static final class C6302e<T, R> implements Function<T, R> {

        /* renamed from: c */
        public static final C6302e f14381c = new C6302e();

        C6302e() {
        }

        /* renamed from: a */
        public final Collection<C5285a> apply(C5291e eVar) {
            return eVar.mo16879c();
        }
    }

    /* renamed from: com.bamtechmedia.dominguez.playback.common.tracks.PlaybackAudioAndSubtitlesPresenter$f */
    /* compiled from: PlaybackAudioAndSubtitlesPresenter.kt */
    static final class C6303f<T> implements Consumer<Collection<C5285a>> {

        /* renamed from: c */
        final /* synthetic */ PlaybackAudioAndSubtitlesPresenter f14382c;

        C6303f(PlaybackAudioAndSubtitlesPresenter playbackAudioAndSubtitlesPresenter) {
            this.f14382c = playbackAudioAndSubtitlesPresenter;
        }

        /* renamed from: a */
        public final void accept(Collection<C5285a> collection) {
            PlaybackAudioAndSubtitlesPresenter playbackAudioAndSubtitlesPresenter = this.f14382c;
            Intrinsics.checkReturnedValueIsNotNull((Object) collection, "it");
            playbackAudioAndSubtitlesPresenter.m19849a(collection);
        }
    }

    /* renamed from: com.bamtechmedia.dominguez.playback.common.tracks.PlaybackAudioAndSubtitlesPresenter$g */
    /* compiled from: PlaybackAudioAndSubtitlesPresenter.kt */
    static final /* synthetic */ class C6304g extends C12879i implements Function1<Throwable, C13145v> {

        /* renamed from: c */
        public static final C6304g f14383c = new C6304g();

        C6304g() {
            super(1);
        }

        /* renamed from: a */
        public final void mo18920a(Throwable th) {
            Timber.m44523a(th);
        }

        public final String getName() {
            return "e";
        }

        public final KDeclarationContainer getOwner() {
            return C12895y.m40230a(Timber.class);
        }

        public final String getSignature() {
            return "e(Ljava/lang/Throwable;)V";
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo18920a((Throwable) obj);
            return C13145v.f29587a;
        }
    }

    /* renamed from: com.bamtechmedia.dominguez.playback.common.tracks.PlaybackAudioAndSubtitlesPresenter$h */
    /* compiled from: PlaybackAudioAndSubtitlesPresenter.kt */
    static final class C6305h<T, R> implements Function<T, R> {

        /* renamed from: c */
        public static final C6305h f14384c = new C6305h();

        C6305h() {
        }

        /* renamed from: a */
        public final List<C5288c> apply(C5291e eVar) {
            return eVar.mo16881e();
        }
    }

    /* renamed from: com.bamtechmedia.dominguez.playback.common.tracks.PlaybackAudioAndSubtitlesPresenter$i */
    /* compiled from: PlaybackAudioAndSubtitlesPresenter.kt */
    static final class C6306i<T> implements Consumer<List<C5288c>> {

        /* renamed from: c */
        final /* synthetic */ PlaybackAudioAndSubtitlesPresenter f14385c;

        C6306i(PlaybackAudioAndSubtitlesPresenter playbackAudioAndSubtitlesPresenter) {
            this.f14385c = playbackAudioAndSubtitlesPresenter;
        }

        /* renamed from: a */
        public final void accept(List<C5288c> list) {
            PlaybackAudioAndSubtitlesPresenter playbackAudioAndSubtitlesPresenter = this.f14385c;
            Intrinsics.checkReturnedValueIsNotNull((Object) list, "it");
            playbackAudioAndSubtitlesPresenter.m19851b((Collection<? extends C5288c>) list);
        }
    }

    /* renamed from: com.bamtechmedia.dominguez.playback.common.tracks.PlaybackAudioAndSubtitlesPresenter$j */
    /* compiled from: PlaybackAudioAndSubtitlesPresenter.kt */
    static final /* synthetic */ class C6307j extends C12879i implements Function1<Throwable, C13145v> {

        /* renamed from: c */
        public static final C6307j f14386c = new C6307j();

        C6307j() {
            super(1);
        }

        /* renamed from: a */
        public final void mo18923a(Throwable th) {
            Timber.m44523a(th);
        }

        public final String getName() {
            return "e";
        }

        public final KDeclarationContainer getOwner() {
            return C12895y.m40230a(Timber.class);
        }

        public final String getSignature() {
            return "e(Ljava/lang/Throwable;)V";
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo18923a((Throwable) obj);
            return C13145v.f29587a;
        }
    }

    @Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0002\b\u0004"}, mo31007d2 = {"<anonymous>", "Lio/reactivex/Single;", "Lcom/bamtechmedia/dominguez/profiles/Profile;", "activeProfile", "apply"}, mo31008k = 3, mo31009mv = {1, 1, 15})
    /* renamed from: com.bamtechmedia.dominguez.playback.common.tracks.PlaybackAudioAndSubtitlesPresenter$k */
    /* compiled from: PlaybackAudioAndSubtitlesPresenter.kt */
    static final class C6308k<T, R> implements Function<T, SingleSource<? extends R>> {

        /* renamed from: U */
        final /* synthetic */ String f14387U;

        /* renamed from: V */
        final /* synthetic */ C5288c f14388V;

        /* renamed from: c */
        final /* synthetic */ PlaybackAudioAndSubtitlesPresenter f14389c;

        /* renamed from: com.bamtechmedia.dominguez.playback.common.tracks.PlaybackAudioAndSubtitlesPresenter$k$a */
        /* compiled from: PlaybackAudioAndSubtitlesPresenter.kt */
        static final class C6309a extends C12881k implements Function1<C6714j0, C13145v> {

            /* renamed from: U */
            final /* synthetic */ C6626c0 f14390U;

            /* renamed from: c */
            final /* synthetic */ C6308k f14391c;

            C6309a(C6308k kVar, C6626c0 c0Var) {
                this.f14391c = kVar;
                this.f14390U = c0Var;
                super(1);
            }

            /* JADX WARNING: Code restructure failed: missing block: B:8:0x0041, code lost:
                if (r1 != null) goto L_0x005c;
             */
            /* renamed from: a */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final void mo18925a(com.bamtechmedia.dominguez.profiles.C6714j0 r20) {
                /*
                    r19 = this;
                    r0 = r19
                    com.bamtechmedia.dominguez.playback.common.tracks.PlaybackAudioAndSubtitlesPresenter$k r1 = r0.f14391c
                    java.lang.String r1 = r1.f14387U
                    r2 = 0
                    java.lang.Boolean r9 = java.lang.Boolean.valueOf(r2)
                    if (r1 == 0) goto L_0x0044
                    com.bamtechmedia.dominguez.profiles.c0 r1 = r0.f14390U
                    com.bamtechmedia.dominguez.profiles.z r10 = r1.mo19352P()
                    r11 = 0
                    r12 = 0
                    r13 = 0
                    com.bamtechmedia.dominguez.playback.common.tracks.PlaybackAudioAndSubtitlesPresenter$k r1 = r0.f14391c
                    java.lang.String r15 = r1.f14387U
                    g.d.b.j0.c r1 = r1.f14388V
                    boolean r1 = r1.mo16864i()
                    java.lang.Boolean r14 = java.lang.Boolean.valueOf(r1)
                    com.bamtechmedia.dominguez.playback.common.tracks.PlaybackAudioAndSubtitlesPresenter$k r1 = r0.f14391c
                    g.d.b.j0.c r1 = r1.f14388V
                    boolean r3 = r1.mo16864i()
                    if (r3 != 0) goto L_0x0034
                    boolean r1 = r1.mo16863h()
                    if (r1 != 0) goto L_0x0035
                L_0x0034:
                    r2 = 1
                L_0x0035:
                    java.lang.Boolean r16 = java.lang.Boolean.valueOf(r2)
                    r17 = 7
                    r18 = 0
                    com.bamtechmedia.dominguez.profiles.z r1 = com.bamtechmedia.dominguez.profiles.C7019z.m21314a(r10, r11, r12, r13, r14, r15, r16, r17, r18)
                    if (r1 == 0) goto L_0x0044
                    goto L_0x005c
                L_0x0044:
                    com.bamtechmedia.dominguez.profiles.c0 r1 = r0.f14390U
                    com.bamtechmedia.dominguez.profiles.z r3 = r1.mo19352P()
                    r4 = 0
                    r5 = 0
                    r6 = 0
                    com.bamtechmedia.dominguez.profiles.z r1 = r20.mo19437c()
                    java.lang.String r8 = r1.mo19793Y()
                    r10 = 7
                    r11 = 0
                    r7 = r9
                    com.bamtechmedia.dominguez.profiles.z r1 = com.bamtechmedia.dominguez.profiles.C7019z.m21314a(r3, r4, r5, r6, r7, r8, r9, r10, r11)
                L_0x005c:
                    r2 = r1
                    r1 = r20
                    r1.mo19435a(r2)
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: com.bamtechmedia.dominguez.playback.common.tracks.PlaybackAudioAndSubtitlesPresenter.C6308k.C6309a.mo18925a(com.bamtechmedia.dominguez.profiles.j0):void");
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                mo18925a((C6714j0) obj);
                return C13145v.f29587a;
            }
        }

        C6308k(PlaybackAudioAndSubtitlesPresenter playbackAudioAndSubtitlesPresenter, String str, C5288c cVar) {
            this.f14389c = playbackAudioAndSubtitlesPresenter;
            this.f14387U = str;
            this.f14388V = cVar;
        }

        /* renamed from: a */
        public final Single<? extends C6626c0> apply(C6626c0 c0Var) {
            return C6673h1.m20691a(this.f14389c.f14371W, c0Var, new C6309a(this, c0Var));
        }
    }

    /* renamed from: com.bamtechmedia.dominguez.playback.common.tracks.PlaybackAudioAndSubtitlesPresenter$l */
    /* compiled from: PlaybackAudioAndSubtitlesPresenter.kt */
    static final class C6310l<T> implements Consumer<C6626c0> {

        /* renamed from: c */
        public static final C6310l f14392c = new C6310l();

        C6310l() {
        }

        /* renamed from: a */
        public final void accept(C6626c0 c0Var) {
            StringBuilder sb = new StringBuilder();
            sb.append("updated profile from subtitle track to ");
            sb.append(c0Var);
            Timber.m44522a(sb.toString(), new Object[0]);
        }
    }

    /* renamed from: com.bamtechmedia.dominguez.playback.common.tracks.PlaybackAudioAndSubtitlesPresenter$m */
    /* compiled from: PlaybackAudioAndSubtitlesPresenter.kt */
    static final /* synthetic */ class C6311m extends C12879i implements Function1<Throwable, C13145v> {

        /* renamed from: c */
        public static final C6311m f14393c = new C6311m();

        C6311m() {
            super(1);
        }

        /* renamed from: a */
        public final void mo18927a(Throwable th) {
            Timber.m44523a(th);
        }

        public final String getName() {
            return "e";
        }

        public final KDeclarationContainer getOwner() {
            return C12895y.m40230a(Timber.class);
        }

        public final String getSignature() {
            return "e(Ljava/lang/Throwable;)V";
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo18927a((Throwable) obj);
            return C13145v.f29587a;
        }
    }

    static {
        new C6297a(null);
    }

    public PlaybackAudioAndSubtitlesPresenter(Observable<C5291e> observable, C6324g gVar, C6667g1 g1Var, boolean z) {
        this.f14369U = observable;
        this.f14370V = gVar;
        this.f14371W = g1Var;
        this.f14372X = z;
    }

    /* renamed from: a */
    public /* synthetic */ void mo4126a(C0722m mVar) {
        C0708c.m3735d(this, mVar);
    }

    /* renamed from: b */
    public /* synthetic */ void mo4127b(C0722m mVar) {
        C0708c.m3732a(this, mVar);
    }

    /* renamed from: c */
    public /* synthetic */ void mo4128c(C0722m mVar) {
        C0708c.m3734c(this, mVar);
    }

    /* renamed from: d */
    public /* synthetic */ void mo4129d(C0722m mVar) {
        C0708c.m3737f(this, mVar);
    }

    /* renamed from: e */
    public void mo4130e(C0722m mVar) {
        this.f14373c.mo30247a();
    }

    /* JADX WARNING: type inference failed for: r5v0, types: [com.bamtechmedia.dominguez.playback.common.tracks.PlaybackAudioAndSubtitlesPresenter$g, kotlin.jvm.functions.Function1] */
    /* JADX WARNING: type inference failed for: r5v1 */
    /* JADX WARNING: type inference failed for: r1v6, types: [com.bamtechmedia.dominguez.playback.common.tracks.PlaybackAudioAndSubtitlesPresenter$j, kotlin.jvm.functions.Function1] */
    /* JADX WARNING: type inference failed for: r1v7 */
    /* JADX WARNING: type inference failed for: r2v1, types: [com.bamtechmedia.dominguez.playback.common.tracks.c] */
    /* JADX WARNING: type inference failed for: r1v9 */
    /* JADX WARNING: type inference failed for: r6v0, types: [com.bamtechmedia.dominguez.playback.common.tracks.c] */
    /* JADX WARNING: type inference failed for: r5v3 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 4 */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo4131f(androidx.lifecycle.C0722m r8) {
        /*
            r7 = this;
            io.reactivex.Observable<g.d.b.j0.e> r0 = r7.f14369U
            com.bamtechmedia.dominguez.playback.common.tracks.PlaybackAudioAndSubtitlesPresenter$e r1 = com.bamtechmedia.dominguez.playback.common.tracks.PlaybackAudioAndSubtitlesPresenter.C6302e.f14381c
            io.reactivex.Observable r0 = r0.mo30193g(r1)
            java.lang.String r1 = "trackListObservable\n    …map { it.audioLanguages }"
            kotlin.jvm.internal.Intrinsics.checkReturnedValueIsNotNull(r0, r1)
            androidx.lifecycle.i r1 = r8.getLifecycle()
            java.lang.String r2 = "owner.lifecycle"
            kotlin.jvm.internal.Intrinsics.checkReturnedValueIsNotNull(r1, r2)
            com.uber.autodispose.android.lifecycle.b r1 = com.uber.autodispose.android.lifecycle.C10541b.m33251a(r1)
            java.lang.String r3 = "AndroidLifecycleScopeProvider.from(this)"
            kotlin.jvm.internal.Intrinsics.checkReturnedValueIsNotNull(r1, r3)
            g.n.a.h r1 = p163g.p503n.p504a.C11793e.m37930a(r1)
            java.lang.Object r0 = r0.mo30161a(r1)
            java.lang.String r1 = "this.`as`(AutoDispose.autoDisposable(provider))"
            kotlin.jvm.internal.Intrinsics.checkReturnedValueIsNotNull(r0, r1)
            g.n.a.a0 r0 = (p163g.p503n.p504a.C11786a0) r0
            com.bamtechmedia.dominguez.playback.common.tracks.PlaybackAudioAndSubtitlesPresenter$f r4 = new com.bamtechmedia.dominguez.playback.common.tracks.PlaybackAudioAndSubtitlesPresenter$f
            r4.<init>(r7)
            com.bamtechmedia.dominguez.playback.common.tracks.PlaybackAudioAndSubtitlesPresenter$g r5 = com.bamtechmedia.dominguez.playback.common.tracks.PlaybackAudioAndSubtitlesPresenter.C6304g.f14383c
            if (r5 == 0) goto L_0x003d
            com.bamtechmedia.dominguez.playback.common.tracks.c r6 = new com.bamtechmedia.dominguez.playback.common.tracks.c
            r6.<init>(r5)
            r5 = r6
        L_0x003d:
            io.reactivex.functions.Consumer r5 = (p520io.reactivex.functions.Consumer) r5
            r0.mo29915a(r4, r5)
            io.reactivex.Observable<g.d.b.j0.e> r0 = r7.f14369U
            com.bamtechmedia.dominguez.playback.common.tracks.PlaybackAudioAndSubtitlesPresenter$h r4 = com.bamtechmedia.dominguez.playback.common.tracks.PlaybackAudioAndSubtitlesPresenter.C6305h.f14384c
            io.reactivex.Observable r0 = r0.mo30193g(r4)
            java.lang.String r4 = "trackListObservable\n    …map { it.subtitleTracks }"
            kotlin.jvm.internal.Intrinsics.checkReturnedValueIsNotNull(r0, r4)
            androidx.lifecycle.i r8 = r8.getLifecycle()
            kotlin.jvm.internal.Intrinsics.checkReturnedValueIsNotNull(r8, r2)
            com.uber.autodispose.android.lifecycle.b r8 = com.uber.autodispose.android.lifecycle.C10541b.m33251a(r8)
            kotlin.jvm.internal.Intrinsics.checkReturnedValueIsNotNull(r8, r3)
            g.n.a.h r8 = p163g.p503n.p504a.C11793e.m37930a(r8)
            java.lang.Object r8 = r0.mo30161a(r8)
            kotlin.jvm.internal.Intrinsics.checkReturnedValueIsNotNull(r8, r1)
            g.n.a.a0 r8 = (p163g.p503n.p504a.C11786a0) r8
            com.bamtechmedia.dominguez.playback.common.tracks.PlaybackAudioAndSubtitlesPresenter$i r0 = new com.bamtechmedia.dominguez.playback.common.tracks.PlaybackAudioAndSubtitlesPresenter$i
            r0.<init>(r7)
            com.bamtechmedia.dominguez.playback.common.tracks.PlaybackAudioAndSubtitlesPresenter$j r1 = com.bamtechmedia.dominguez.playback.common.tracks.PlaybackAudioAndSubtitlesPresenter.C6307j.f14386c
            if (r1 == 0) goto L_0x0079
            com.bamtechmedia.dominguez.playback.common.tracks.c r2 = new com.bamtechmedia.dominguez.playback.common.tracks.c
            r2.<init>(r1)
            r1 = r2
        L_0x0079:
            io.reactivex.functions.Consumer r1 = (p520io.reactivex.functions.Consumer) r1
            r8.mo29915a(r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bamtechmedia.dominguez.playback.common.tracks.PlaybackAudioAndSubtitlesPresenter.mo4131f(androidx.lifecycle.m):void");
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public final void m19851b(Collection<? extends C5288c> collection) {
        ArrayList arrayList = new ArrayList(C13187p.m40525a((Iterable) collection, 10));
        for (C5288c eVar : collection) {
            arrayList.add(new C6317e(eVar, this, this.f14370V, -1));
        }
        this.f14370V.mo18930b(arrayList);
    }

    /* renamed from: a */
    private final int m19846a(int i, int i2) {
        if (i - 1 != i2 || this.f14372X) {
            return -1;
        }
        return C6327f.subtitlesTitle;
    }

    /* JADX WARNING: type inference failed for: r2v2, types: [com.bamtechmedia.dominguez.playback.common.tracks.PlaybackAudioAndSubtitlesPresenter$d, kotlin.jvm.functions.Function1] */
    /* JADX WARNING: type inference failed for: r2v3 */
    /* JADX WARNING: type inference failed for: r3v1, types: [com.bamtechmedia.dominguez.playback.common.tracks.c] */
    /* JADX WARNING: type inference failed for: r2v5 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 2 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo18912a(p163g.p174d.p178b.p193j0.C5285a r5) {
        /*
            r4 = this;
            java.lang.String r0 = r5.mo16860g()
            io.reactivex.disposables.CompositeDisposable r1 = r4.f14373c
            com.bamtechmedia.dominguez.profiles.g1 r2 = r4.f14371W
            io.reactivex.Single r2 = r2.mo19381b()
            com.bamtechmedia.dominguez.playback.common.tracks.PlaybackAudioAndSubtitlesPresenter$b r3 = new com.bamtechmedia.dominguez.playback.common.tracks.PlaybackAudioAndSubtitlesPresenter$b
            r3.<init>(r4, r0, r5)
            io.reactivex.Single r5 = r2.mo30208a(r3)
            com.bamtechmedia.dominguez.playback.common.tracks.PlaybackAudioAndSubtitlesPresenter$c r0 = com.bamtechmedia.dominguez.playback.common.tracks.PlaybackAudioAndSubtitlesPresenter.C6300c.f14379c
            com.bamtechmedia.dominguez.playback.common.tracks.PlaybackAudioAndSubtitlesPresenter$d r2 = com.bamtechmedia.dominguez.playback.common.tracks.PlaybackAudioAndSubtitlesPresenter.C6301d.f14380c
            if (r2 == 0) goto L_0x0021
            com.bamtechmedia.dominguez.playback.common.tracks.c r3 = new com.bamtechmedia.dominguez.playback.common.tracks.c
            r3.<init>(r2)
            r2 = r3
        L_0x0021:
            io.reactivex.functions.Consumer r2 = (p520io.reactivex.functions.Consumer) r2
            io.reactivex.disposables.Disposable r5 = r5.mo30214a(r0, r2)
            r1.mo30250b(r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bamtechmedia.dominguez.playback.common.tracks.PlaybackAudioAndSubtitlesPresenter.mo18912a(g.d.b.j0.a):void");
    }

    /* JADX WARNING: type inference failed for: r2v2, types: [com.bamtechmedia.dominguez.playback.common.tracks.PlaybackAudioAndSubtitlesPresenter$m, kotlin.jvm.functions.Function1] */
    /* JADX WARNING: type inference failed for: r2v3 */
    /* JADX WARNING: type inference failed for: r3v1, types: [com.bamtechmedia.dominguez.playback.common.tracks.c] */
    /* JADX WARNING: type inference failed for: r2v5 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 2 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo18913a(p163g.p174d.p178b.p193j0.C5288c r5) {
        /*
            r4 = this;
            java.lang.String r0 = r5.mo16862g()
            if (r0 != 0) goto L_0x0007
            goto L_0x0019
        L_0x0007:
            int r1 = r0.hashCode()
            r2 = 79183(0x1354f, float:1.10959E-40)
            if (r1 == r2) goto L_0x0011
            goto L_0x001b
        L_0x0011:
            java.lang.String r1 = "Off"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x001b
        L_0x0019:
            r0 = 0
            goto L_0x001f
        L_0x001b:
            java.lang.String r0 = r5.mo16862g()
        L_0x001f:
            io.reactivex.disposables.CompositeDisposable r1 = r4.f14373c
            com.bamtechmedia.dominguez.profiles.g1 r2 = r4.f14371W
            io.reactivex.Single r2 = r2.mo19381b()
            com.bamtechmedia.dominguez.playback.common.tracks.PlaybackAudioAndSubtitlesPresenter$k r3 = new com.bamtechmedia.dominguez.playback.common.tracks.PlaybackAudioAndSubtitlesPresenter$k
            r3.<init>(r4, r0, r5)
            io.reactivex.Single r5 = r2.mo30208a(r3)
            com.bamtechmedia.dominguez.playback.common.tracks.PlaybackAudioAndSubtitlesPresenter$l r0 = com.bamtechmedia.dominguez.playback.common.tracks.PlaybackAudioAndSubtitlesPresenter.C6310l.f14392c
            com.bamtechmedia.dominguez.playback.common.tracks.PlaybackAudioAndSubtitlesPresenter$m r2 = com.bamtechmedia.dominguez.playback.common.tracks.PlaybackAudioAndSubtitlesPresenter.C6311m.f14393c
            if (r2 == 0) goto L_0x003c
            com.bamtechmedia.dominguez.playback.common.tracks.c r3 = new com.bamtechmedia.dominguez.playback.common.tracks.c
            r3.<init>(r2)
            r2 = r3
        L_0x003c:
            io.reactivex.functions.Consumer r2 = (p520io.reactivex.functions.Consumer) r2
            io.reactivex.disposables.Disposable r5 = r5.mo30214a(r0, r2)
            r1.mo30250b(r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bamtechmedia.dominguez.playback.common.tracks.PlaybackAudioAndSubtitlesPresenter.mo18913a(g.d.b.j0.c):void");
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final void m19849a(Collection<C5285a> collection) {
        ArrayList arrayList = new ArrayList(C13187p.m40525a((Iterable) collection, 10));
        int i = 0;
        for (Object next : collection) {
            int i2 = i + 1;
            if (i >= 0) {
                arrayList.add(new C6317e((C5285a) next, this, this.f14370V, m19846a(collection.size(), i)));
                i = i2;
            } else {
                C13180m.m40455c();
                throw null;
            }
        }
        this.f14370V.mo18929a(arrayList);
    }
}
