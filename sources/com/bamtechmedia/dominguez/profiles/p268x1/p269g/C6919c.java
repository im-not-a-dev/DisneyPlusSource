package com.bamtechmedia.dominguez.profiles.p268x1.p269g;

import com.bamtechmedia.dominguez.core.content.assets.Language;
import com.bamtechmedia.dominguez.profiles.C6667g1;
import com.bamtechmedia.dominguez.profiles.C7019z;
import com.bamtechmedia.dominguez.profiles.p263u1.p264d.C6861a;
import com.bamtechmedia.dominguez.profiles.p263u1.p265e.C6865a;
import java.util.List;
import java.util.concurrent.Callable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p520io.reactivex.Maybe;
import p520io.reactivex.Single;
import p520io.reactivex.SingleSource;
import p520io.reactivex.functions.Function;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000e\u0018\u0000 (2\u00020\u0001:\u0001(B?\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f¢\u0006\u0002\u0010\u0010J\u0016\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00130\u00122\u0006\u0010\u0014\u001a\u00020\u0015H\u0002J<\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00180\u00172\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00130\u00122\u0006\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u00132\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00180\u0012H\u0002J.\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00180\u00122\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001f\u001a\u00020\u00182\u0006\u0010 \u001a\u00020\u00182\u0006\u0010\u001c\u001a\u00020\u0018H\u0002J4\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00180\u00172\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00130\u00122\b\u0010\u001c\u001a\u0004\u0018\u00010\u00132\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00180\u0012H\u0002J4\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00180\u00172\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00130\u00122\b\u0010\u001c\u001a\u0004\u0018\u00010\u00132\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00180\u0012H\u0002J\u0010\u0010#\u001a\u00020\u00182\u0006\u0010\u0014\u001a\u00020\u0015H\u0002J\u0010\u0010$\u001a\u00020\u001b2\u0006\u0010\u0014\u001a\u00020\u0015H\u0016J\u0018\u0010%\u001a\u00020\u001b2\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001f\u001a\u00020\u0018H\u0002J,\u0010&\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00180\u00120\u00172\b\u0010\u001c\u001a\u0004\u0018\u00010\u00132\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00180\u0012H\u0016J.\u0010'\u001a\b\u0012\u0004\u0012\u00020\u00180\u00172\u0006\u0010\u0014\u001a\u00020\u00152\b\u0010\u001c\u001a\u0004\u0018\u00010\u00132\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00180\u0012H\u0016R\u000e\u0010\f\u001a\u00020\rX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006)"}, mo31007d2 = {"Lcom/bamtechmedia/dominguez/profiles/language/handlers/AudioResolversImpl;", "Lcom/bamtechmedia/dominguez/profiles/api/language/AudioResolvers;", "profilesRepository", "Lcom/bamtechmedia/dominguez/profiles/ProfilesRepository;", "deviceSettingsSelections", "Lcom/bamtechmedia/dominguez/profiles/api/settings/DeviceSettingsSelections;", "descriptiveHandler", "Lcom/bamtechmedia/dominguez/profiles/language/handlers/DescriptiveAudioHandler;", "preferredHandler", "Lcom/bamtechmedia/dominguez/profiles/language/handlers/PreferredAudioHandler;", "originalHandler", "Lcom/bamtechmedia/dominguez/profiles/language/handlers/OriginalAudioLanguageHandler;", "defaultHandler", "Lcom/bamtechmedia/dominguez/profiles/language/handlers/DefaultAudioLanguageHandler;", "firstHandler", "Lcom/bamtechmedia/dominguez/profiles/language/handlers/FirstAudioLanguageHandler;", "(Lcom/bamtechmedia/dominguez/profiles/ProfilesRepository;Lcom/bamtechmedia/dominguez/profiles/api/settings/DeviceSettingsSelections;Lcom/bamtechmedia/dominguez/profiles/language/handlers/DescriptiveAudioHandler;Lcom/bamtechmedia/dominguez/profiles/language/handlers/PreferredAudioHandler;Lcom/bamtechmedia/dominguez/profiles/language/handlers/OriginalAudioLanguageHandler;Lcom/bamtechmedia/dominguez/profiles/language/handlers/DefaultAudioLanguageHandler;Lcom/bamtechmedia/dominguez/profiles/language/handlers/FirstAudioLanguageHandler;)V", "determineInputLanguage", "", "", "languagePreferences", "Lcom/bamtechmedia/dominguez/profiles/LanguagePreferences;", "downloadsDescriptiveSingle", "Lio/reactivex/Single;", "Lcom/bamtechmedia/dominguez/core/content/assets/Language;", "inputLanguage", "preferDescriptive", "", "originalLanguage", "audioTracks", "downloadsLanguageCombiner", "descriptiveLanguage", "nonOriginalLanguage", "downloadsNonOriginalSingle", "downloadsOriginalSingle", "emptyLanguage", "isAudioDescriptive", "preferDescriptiveLanguageAvailable", "resolveDownloadAudioLanguages", "resolvePlaybackAudioLanguage", "Companion", "profiles_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* renamed from: com.bamtechmedia.dominguez.profiles.x1.g.c */
/* compiled from: AudioResolversImpl.kt */
public final class C6919c implements C6861a {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final C6930i f15394a;

    /* renamed from: b */
    private final C6941t f15395b;

    /* renamed from: c */
    private final C6939r f15396c;

    /* renamed from: d */
    private final C6928g f15397d;

    /* renamed from: e */
    private final C6932k f15398e;

    /* renamed from: com.bamtechmedia.dominguez.profiles.x1.g.c$a */
    /* compiled from: AudioResolversImpl.kt */
    public static final class C6920a {
        private C6920a() {
        }

        public /* synthetic */ C6920a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u0010\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, mo31007d2 = {"<anonymous>", "Lio/reactivex/Single;", "Lcom/bamtechmedia/dominguez/core/content/assets/Language;", "kotlin.jvm.PlatformType", "it", "Lcom/bamtechmedia/dominguez/profiles/LanguagePreferences;", "apply"}, mo31008k = 3, mo31009mv = {1, 1, 15})
    /* renamed from: com.bamtechmedia.dominguez.profiles.x1.g.c$b */
    /* compiled from: AudioResolversImpl.kt */
    static final class C6921b<T, R> implements Function<T, SingleSource<? extends R>> {

        /* renamed from: U */
        final /* synthetic */ C7019z f15399U;

        /* renamed from: V */
        final /* synthetic */ String f15400V;

        /* renamed from: W */
        final /* synthetic */ List f15401W;

        /* renamed from: c */
        final /* synthetic */ C6919c f15402c;

        /* renamed from: com.bamtechmedia.dominguez.profiles.x1.g.c$b$a */
        /* compiled from: AudioResolversImpl.kt */
        static final class C6922a<V> implements Callable<T> {

            /* renamed from: U */
            final /* synthetic */ C7019z f15403U;

            /* renamed from: c */
            final /* synthetic */ C6921b f15404c;

            C6922a(C6921b bVar, C7019z zVar) {
                this.f15404c = bVar;
                this.f15403U = zVar;
            }

            public final Language call() {
                C6930i a = this.f15404c.f15402c.f15394a;
                C6919c cVar = this.f15404c.f15402c;
                C7019z zVar = this.f15403U;
                Intrinsics.checkReturnedValueIsNotNull((Object) zVar, "it");
                List a2 = cVar.m21156b(zVar);
                Boolean Z = this.f15404c.f15399U.mo19794Z();
                boolean booleanValue = Z != null ? Z.booleanValue() : false;
                C6921b bVar = this.f15404c;
                return a.mo19686a(a2, booleanValue, bVar.f15400V, bVar.f15401W);
            }
        }

        C6921b(C6919c cVar, C7019z zVar, String str, List list) {
            this.f15402c = cVar;
            this.f15399U = zVar;
            this.f15400V = str;
            this.f15401W = list;
        }

        /* renamed from: a */
        public final Single<Language> apply(C7019z zVar) {
            return Maybe.m38257b((Callable<? extends T>) new C6922a<Object>(this, zVar)).mo30109a((SingleSource<? extends T>) Single.m38399b(this.f15402c.m21157c(zVar)));
        }
    }

    static {
        new C6920a(null);
        new Language("no_language_found", "no_language_found", "no_language_found", "no_language_found", C13185o.m40513a());
    }

    public C6919c(C6667g1 g1Var, C6865a aVar, C6930i iVar, C6941t tVar, C6939r rVar, C6928g gVar, C6932k kVar) {
        this.f15394a = iVar;
        this.f15395b = tVar;
        this.f15396c = rVar;
        this.f15397d = gVar;
        this.f15398e = kVar;
        this.f15394a.mo19689a((C6918b) this.f15395b);
        this.f15395b.mo19689a((C6918b) this.f15396c);
        this.f15396c.mo19689a((C6918b) this.f15397d);
        this.f15397d.mo19689a((C6918b) this.f15398e);
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public final Language m21157c(C7019z zVar) {
        String Y = zVar.mo19793Y();
        if (Y != null) {
            String str = "primary";
            Language language = new Language(null, str, "", Y, C13185o.m40513a());
            return language;
        }
        Intrinsics.throwNpe();
        throw null;
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public final List<String> m21156b(C7019z zVar) {
        String Y = zVar.mo19793Y();
        if (Y != null) {
            List<String> a = C6936o.m21182a(C13183n.m40498a(Y));
            if (a != null) {
                return a;
            }
        }
        return C13185o.m40513a();
    }

    /* renamed from: a */
    public Single<Language> mo19626a(C7019z zVar, String str, List<Language> list) {
        Single<Language> a = Single.m38399b(zVar).mo30208a((Function<? super T, ? extends SingleSource<? extends R>>) new C6921b<Object,Object>(this, zVar, str, list));
        Intrinsics.checkReturnedValueIsNotNull((Object) a, "Single.just(languagePref…guage(it)))\n            }");
        return a;
    }

    /* renamed from: a */
    public boolean mo19627a(C7019z zVar) {
        Boolean Z = zVar.mo19794Z();
        if (Z != null) {
            return Z.booleanValue();
        }
        return false;
    }
}
