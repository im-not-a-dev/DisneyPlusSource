package com.bamtechmedia.dominguez.playback.p237m.p246o.p250f;

import com.bamtech.sdk4.media.MediaItemPlaylist;
import com.bamtech.sdk4.media.PlaybackContext;
import com.bamtechmedia.dominguez.core.content.C3693o;
import com.bamtechmedia.dominguez.core.framework.C5741g.C5742a;
import com.bamtechmedia.dominguez.playback.common.contentrating.C6285b.C6287b;
import com.bamtechmedia.dominguez.playback.p237m.C6336a;
import com.bamtechmedia.dominguez.playback.p237m.C6341e;
import com.bamtechmedia.dominguez.playback.p237m.p242m.p243e.C6427a;
import com.bamtechmedia.dominguez.playback.p237m.p242m.p244f.C6439c;
import com.bamtechmedia.dominguez.playback.p237m.p252q.C6501b.C6504c;
import com.bamtechmedia.dominguez.profiles.C6626c0;
import com.bamtechmedia.dominguez.profiles.C6667g1;
import com.bamtechmedia.dominguez.profiles.C7019z;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import p163g.p201e.p203b.p283i.p284a.p285a.C7284a;
import p163g.p201e.p203b.p283i.p284a.p285a.C7285b;
import p520io.reactivex.Completable;
import p520io.reactivex.CompletableSource;
import p520io.reactivex.Observable;
import p520io.reactivex.ObservableSource;
import p520io.reactivex.functions.Function;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B?\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\u0006\u0010\u000f\u001a\u00020\u0010¢\u0006\u0002\u0010\u0011J\u0018\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0002H\u0016J\u001a\u0010\u0015\u001a\u00020\n2\b\u0010\u0016\u001a\u0004\u0018\u00010\u00042\u0006\u0010\t\u001a\u00020\nH\u0007J \u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00022\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0002R\u000e\u0010\r\u001a\u00020\u000eX\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, mo31007d2 = {"Lcom/bamtechmedia/dominguez/playback/common/events/upnext/ReadyToPlayNextEpisodeEvent;", "Lcom/bamtechmedia/dominguez/core/framework/ReactiveViewModel$Event;", "Lcom/bamtechmedia/dominguez/playback/common/PlaybackState;", "playableForDeletion", "Lcom/bamtechmedia/dominguez/core/content/Playable;", "upNextRepository", "Lcom/bamtechmedia/dominguez/data/source/repository/UpNextRepository;", "upNextContentRemover", "Lcom/bamtechmedia/dominguez/data/source/repository/UpNextContentRemover;", "shouldDeleteDownload", "", "sessionStarter", "Lcom/bamtechmedia/dominguez/playback/common/engine/session/SessionStarter;", "engineLanguageSetup", "Lcom/bamtechmedia/dominguez/playback/common/engine/languages/EngineLanguageSetup;", "profilesRepository", "Lcom/bamtechmedia/dominguez/profiles/ProfilesRepository;", "(Lcom/bamtechmedia/dominguez/core/content/Playable;Lcom/bamtechmedia/dominguez/data/source/repository/UpNextRepository;Lcom/bamtechmedia/dominguez/data/source/repository/UpNextContentRemover;ZLcom/bamtechmedia/dominguez/playback/common/engine/session/SessionStarter;Lcom/bamtechmedia/dominguez/playback/common/engine/languages/EngineLanguageSetup;Lcom/bamtechmedia/dominguez/profiles/ProfilesRepository;)V", "process", "Lio/reactivex/Observable;", "currentState", "qualifiesForDeletion", "currentPlayable", "updateState", "playbackContext", "Lcom/bamtech/sdk4/media/PlaybackContext;", "playback_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* renamed from: com.bamtechmedia.dominguez.playback.m.o.f.e */
/* compiled from: ReadyToPlayNextEpisodeEvent.kt */
public final class C6480e implements C5742a<C6336a> {

    /* renamed from: a */
    private final C3693o f14669a;

    /* renamed from: b */
    private final C7284a f14670b;

    /* renamed from: c */
    private final boolean f14671c;

    /* renamed from: d */
    private final C6439c f14672d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public final C6427a f14673e;

    /* renamed from: f */
    private final C6667g1 f14674f;

    /* renamed from: com.bamtechmedia.dominguez.playback.m.o.f.e$a */
    /* compiled from: ReadyToPlayNextEpisodeEvent.kt */
    static final class C6481a<T, R> implements Function<C7019z, CompletableSource> {

        /* renamed from: U */
        final /* synthetic */ C6480e f14675U;

        /* renamed from: V */
        final /* synthetic */ C6336a f14676V;

        /* renamed from: c */
        final /* synthetic */ C3693o f14677c;

        C6481a(C3693o oVar, C6480e eVar, C6336a aVar) {
            this.f14677c = oVar;
            this.f14675U = eVar;
            this.f14676V = aVar;
        }

        /* renamed from: a */
        public final Completable apply(C7019z zVar) {
            return this.f14675U.f14673e.mo19080a(zVar, this.f14676V.mo18955d(), this.f14677c);
        }
    }

    /* renamed from: com.bamtechmedia.dominguez.playback.m.o.f.e$b */
    /* compiled from: ReadyToPlayNextEpisodeEvent.kt */
    static final class C6482b<T, R> implements Function<T, ObservableSource<? extends R>> {

        /* renamed from: U */
        final /* synthetic */ C6336a f14678U;

        /* renamed from: c */
        final /* synthetic */ C6480e f14679c;

        C6482b(C6480e eVar, C6336a aVar) {
            this.f14679c = eVar;
            this.f14678U = aVar;
        }

        /* renamed from: a */
        public final Observable<C6336a> apply(Pair<? extends MediaItemPlaylist, ? extends PlaybackContext> pair) {
            return this.f14679c.m20190a(this.f14678U, (PlaybackContext) pair.mo31016d());
        }
    }

    /* renamed from: com.bamtechmedia.dominguez.playback.m.o.f.e$c */
    /* compiled from: ReadyToPlayNextEpisodeEvent.kt */
    static final class C6483c<T, R> implements Function<Throwable, C6336a> {

        /* renamed from: U */
        final /* synthetic */ C6336a f14680U;

        /* renamed from: c */
        final /* synthetic */ C3693o f14681c;

        C6483c(C3693o oVar, C6480e eVar, C6336a aVar) {
            this.f14681c = oVar;
            this.f14680U = aVar;
        }

        /* renamed from: a */
        public final C6336a apply(Throwable th) {
            C6336a aVar = new C6336a(this.f14680U.mo18955d(), this.f14681c, null, null, null, false, th, false, 0, null, null, null, null, false, false, 32700, null);
            return aVar;
        }
    }

    /* renamed from: com.bamtechmedia.dominguez.playback.m.o.f.e$d */
    /* compiled from: ReadyToPlayNextEpisodeEvent.kt */
    static final class C6484d<T, R> implements Function<T, R> {

        /* renamed from: c */
        public static final C6484d f14682c = new C6484d();

        C6484d() {
        }

        /* renamed from: a */
        public final C7019z apply(C6626c0 c0Var) {
            return c0Var.mo19352P();
        }
    }

    public C6480e(C3693o oVar, C7285b bVar, C7284a aVar, boolean z, C6439c cVar, C6427a aVar2, C6667g1 g1Var) {
        this.f14669a = oVar;
        this.f14670b = aVar;
        this.f14671c = z;
        this.f14672d = cVar;
        this.f14673e = aVar2;
        this.f14674f = g1Var;
    }

    /* renamed from: a */
    public final boolean mo19136a(C3693o oVar, boolean z) {
        return false;
    }

    /* renamed from: a */
    public Observable<C6336a> mo17627a(C6336a aVar) {
        if (aVar != null) {
            C3693o c = aVar.mo18954c();
            if (c != null) {
                Observable<C6336a> a = this.f14674f.mo19382c().mo30233g(C6484d.f14682c).mo30217b((Function<? super T, ? extends CompletableSource>) new C6481a<Object,Object>(c, this, aVar)).mo30043a((ObservableSource<T>) this.f14672d.mo19091a(aVar.mo18955d(), c, true).mo30225d((Function<? super T, ? extends ObservableSource<? extends R>>) new C6482b<Object,Object>(this, aVar)).mo30198i(new C6483c(c, this, aVar)));
                if (a != null) {
                    return a;
                }
            }
        }
        Observable<C6336a> m = Observable.m38314m();
        Intrinsics.checkReturnedValueIsNotNull((Object) m, "Observable.empty()");
        return m;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final Observable<C6336a> m20190a(C6336a aVar, PlaybackContext playbackContext) {
        C6336a aVar2 = aVar;
        PlaybackContext playbackContext2 = playbackContext;
        C6287b bVar = C6287b.f14356a;
        C6504c cVar = C6504c.f14719a;
        C6341e eVar = r14;
        C6341e eVar2 = new C6341e(null, null, null, null, 15, null);
        Observable<C6336a> b = Observable.m38309b(C6336a.m19906a(aVar2, null, null, null, bVar, null, false, null, false, 0, cVar, eVar, playbackContext2, null, false, false, 29079, null));
        Intrinsics.checkReturnedValueIsNotNull((Object) b, "Observable.just(\n       …t\n            )\n        )");
        if (!mo19136a(this.f14669a, this.f14671c)) {
            return b;
        }
        C7284a aVar3 = this.f14670b;
        C3693o oVar = this.f14669a;
        if (oVar != null) {
            Observable<C6336a> a = aVar3.mo19231a(oVar).mo30043a((ObservableSource<T>) b);
            Intrinsics.checkReturnedValueIsNotNull((Object) a, "upNextContentRemover.del…n(updatedStateObservable)");
            return a;
        }
        Intrinsics.throwNpe();
        throw null;
    }
}
