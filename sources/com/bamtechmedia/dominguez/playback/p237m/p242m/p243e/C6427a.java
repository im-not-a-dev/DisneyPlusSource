package com.bamtechmedia.dominguez.playback.p237m.p242m.p243e;

import com.bamtech.player.exo.sdk4.SDK4ExoPlaybackEngine;
import com.bamtechmedia.dominguez.core.content.C3693o;
import com.bamtechmedia.dominguez.core.content.assets.Language;
import com.bamtechmedia.dominguez.profiles.C7019z;
import com.bamtechmedia.dominguez.profiles.p263u1.p264d.C6861a;
import com.bamtechmedia.dominguez.profiles.p263u1.p264d.C6862b;
import com.bamtechmedia.dominguez.profiles.p263u1.p264d.C6863c;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import p520io.reactivex.Completable;
import p520io.reactivex.Single;
import p520io.reactivex.SingleSource;
import p520io.reactivex.functions.Consumer;
import p520io.reactivex.functions.Function;
import p686n.p687a.Timber;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u001e\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0002J2\u0010\u000e\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00100\u000f0\b2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\tH\u0002J\u001e\u0010\u0012\u001a\u00020\u00132\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\f\u001a\u00020\rR\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0016"}, mo31007d2 = {"Lcom/bamtechmedia/dominguez/playback/common/engine/languages/EngineLanguageSetup;", "", "audioResolvers", "Lcom/bamtechmedia/dominguez/profiles/api/language/AudioResolvers;", "captionsResolvers", "Lcom/bamtechmedia/dominguez/profiles/api/language/CaptionsResolvers;", "(Lcom/bamtechmedia/dominguez/profiles/api/language/AudioResolvers;Lcom/bamtechmedia/dominguez/profiles/api/language/CaptionsResolvers;)V", "getAudioPreferencesOnce", "Lio/reactivex/Single;", "Lcom/bamtechmedia/dominguez/core/content/assets/Language;", "languagePreferences", "Lcom/bamtechmedia/dominguez/profiles/LanguagePreferences;", "playable", "Lcom/bamtechmedia/dominguez/core/content/Playable;", "getCaptionPreferencesOnce", "Lkotlin/Pair;", "Lcom/bamtechmedia/dominguez/profiles/api/language/CaptionsEngineSelection;", "audioTrack", "setupLanguage", "Lio/reactivex/Completable;", "engine", "Lcom/bamtech/player/exo/sdk4/SDK4ExoPlaybackEngine;", "playback_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* renamed from: com.bamtechmedia.dominguez.playback.m.m.e.a */
/* compiled from: EngineLanguageSetup.kt */
public final class C6427a {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final C6861a f14577a;

    /* renamed from: b */
    private final C6863c f14578b;

    /* renamed from: com.bamtechmedia.dominguez.playback.m.m.e.a$a */
    /* compiled from: EngineLanguageSetup.kt */
    static final class C6428a<T> implements Consumer<Throwable> {

        /* renamed from: c */
        public static final C6428a f14579c = new C6428a();

        C6428a() {
        }

        /* renamed from: a */
        public final void accept(Throwable th) {
            Timber.m44528b(th, "error setupAudioLanguage", new Object[0]);
        }
    }

    /* renamed from: com.bamtechmedia.dominguez.playback.m.m.e.a$b */
    /* compiled from: EngineLanguageSetup.kt */
    static final class C6429b<T, R> implements Function<T, R> {

        /* renamed from: c */
        final /* synthetic */ Language f14580c;

        C6429b(Language language) {
            this.f14580c = language;
        }

        /* renamed from: a */
        public final Pair<Language, C6862b> apply(C6862b bVar) {
            return new Pair<>(this.f14580c, bVar);
        }
    }

    /* renamed from: com.bamtechmedia.dominguez.playback.m.m.e.a$c */
    /* compiled from: EngineLanguageSetup.kt */
    static final class C6430c<T> implements Consumer<Throwable> {

        /* renamed from: c */
        public static final C6430c f14581c = new C6430c();

        C6430c() {
        }

        /* renamed from: a */
        public final void accept(Throwable th) {
            Timber.m44528b(th, "error setupCaptionsLanguage", new Object[0]);
        }
    }

    /* renamed from: com.bamtechmedia.dominguez.playback.m.m.e.a$d */
    /* compiled from: EngineLanguageSetup.kt */
    static final class C6431d<T, R> implements Function<T, SingleSource<? extends R>> {

        /* renamed from: U */
        final /* synthetic */ C7019z f14582U;

        /* renamed from: V */
        final /* synthetic */ C3693o f14583V;

        /* renamed from: c */
        final /* synthetic */ C6427a f14584c;

        C6431d(C6427a aVar, C7019z zVar, C3693o oVar) {
            this.f14584c = aVar;
            this.f14582U = zVar;
            this.f14583V = oVar;
        }

        /* renamed from: a */
        public final Single<Pair<Language, C6862b>> apply(Language language) {
            return this.f14584c.m20095a(this.f14582U, this.f14583V, language);
        }
    }

    /* renamed from: com.bamtechmedia.dominguez.playback.m.m.e.a$e */
    /* compiled from: EngineLanguageSetup.kt */
    static final class C6432e<T> implements Consumer<Pair<? extends Language, ? extends C6862b>> {

        /* renamed from: U */
        final /* synthetic */ SDK4ExoPlaybackEngine f14585U;

        /* renamed from: V */
        final /* synthetic */ C7019z f14586V;

        /* renamed from: c */
        final /* synthetic */ C6427a f14587c;

        C6432e(C6427a aVar, SDK4ExoPlaybackEngine sDK4ExoPlaybackEngine, C7019z zVar) {
            this.f14587c = aVar;
            this.f14585U = sDK4ExoPlaybackEngine;
            this.f14586V = zVar;
        }

        /* renamed from: a */
        public final void accept(Pair<Language, C6862b> pair) {
            this.f14585U.mo7533a(((Language) pair.mo31015c()).mo13104Y(), this.f14587c.f14577a.mo19627a(this.f14586V));
            this.f14585U.mo7534a(((C6862b) pair.mo31016d()).mo19629b(), ((C6862b) pair.mo31016d()).mo19630c(), ((C6862b) pair.mo31016d()).mo19628a());
        }
    }

    public C6427a(C6861a aVar, C6863c cVar) {
        this.f14577a = aVar;
        this.f14578b = cVar;
    }

    /* renamed from: a */
    public final Completable mo19080a(C7019z zVar, SDK4ExoPlaybackEngine sDK4ExoPlaybackEngine, C3693o oVar) {
        Completable f = m20094a(zVar, oVar).mo30208a((Function<? super T, ? extends SingleSource<? extends R>>) new C6431d<Object,Object>(this, zVar, oVar)).mo30227d((Consumer<? super T>) new C6432e<Object>(this, sDK4ExoPlaybackEngine, zVar)).mo30228e().mo30055f();
        Intrinsics.checkReturnedValueIsNotNull((Object) f, "getAudioPreferencesOnce(…       .onErrorComplete()");
        return f;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final Single<Pair<Language, C6862b>> m20095a(C7019z zVar, C3693o oVar, Language language) {
        Single<Pair<Language, C6862b>> b = this.f14578b.mo19631a(zVar, oVar.mo12910s(), oVar.mo12915x(), language.mo13104Y()).mo30233g(new C6429b(language)).mo30218b((Consumer<? super Throwable>) C6430c.f14581c);
        Intrinsics.checkReturnedValueIsNotNull((Object) b, "captionsResolvers\n      …setupCaptionsLanguage\") }");
        return b;
    }

    /* renamed from: a */
    private final Single<Language> m20094a(C7019z zVar, C3693o oVar) {
        Single<Language> b = this.f14577a.mo19626a(zVar, oVar.mo12910s(), oVar.mo13273l()).mo30218b((Consumer<? super Throwable>) C6428a.f14579c);
        Intrinsics.checkReturnedValueIsNotNull((Object) b, "audioResolvers.resolvePl…or setupAudioLanguage\") }");
        return b;
    }
}
