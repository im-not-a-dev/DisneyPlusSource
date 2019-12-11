package com.bamtechmedia.dominguez.profiles.p268x1.p269g;

import com.bamtechmedia.dominguez.core.content.assets.Language;
import com.bamtechmedia.dominguez.profiles.C6667g1;
import com.bamtechmedia.dominguez.profiles.C7019z;
import com.bamtechmedia.dominguez.profiles.p263u1.p264d.C6862b;
import com.bamtechmedia.dominguez.profiles.p263u1.p264d.C6863c;
import com.bamtechmedia.dominguez.profiles.p268x1.C6913e;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;
import kotlin.Metadata;
import kotlin.jvm.internal.C12880j;
import p520io.reactivex.Maybe;
import p520io.reactivex.Single;
import p520io.reactivex.SingleSource;
import p520io.reactivex.functions.Function;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B7\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r¢\u0006\u0002\u0010\u000eJ \u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u00102\u0006\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0011H\u0002J6\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00170\u00162\u0006\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u00112\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00190\u00102\u0006\u0010\u001a\u001a\u00020\u0011H\u0016R\u000e\u0010\f\u001a\u00020\rX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000¨\u0006\u001b"}, mo31007d2 = {"Lcom/bamtechmedia/dominguez/profiles/language/handlers/CaptionsResolversImpl;", "Lcom/bamtechmedia/dominguez/profiles/api/language/CaptionsResolvers;", "profilesRepository", "Lcom/bamtechmedia/dominguez/profiles/ProfilesRepository;", "languageFallbackLogic", "Lcom/bamtechmedia/dominguez/profiles/language/LanguageFallbackLogic;", "sdhCaptionsHandler", "Lcom/bamtechmedia/dominguez/profiles/language/handlers/SdhCaptionsHandler;", "nonForcedCaptionsHandler", "Lcom/bamtechmedia/dominguez/profiles/language/handlers/NonForcedCaptionsHandler;", "sdhAlternateCaptionsHandler", "Lcom/bamtechmedia/dominguez/profiles/language/handlers/SdhAlternateCaptionsHandler;", "forcedCaptionsHandler", "Lcom/bamtechmedia/dominguez/profiles/language/handlers/ForcedCaptionsHandler;", "(Lcom/bamtechmedia/dominguez/profiles/ProfilesRepository;Lcom/bamtechmedia/dominguez/profiles/language/LanguageFallbackLogic;Lcom/bamtechmedia/dominguez/profiles/language/handlers/SdhCaptionsHandler;Lcom/bamtechmedia/dominguez/profiles/language/handlers/NonForcedCaptionsHandler;Lcom/bamtechmedia/dominguez/profiles/language/handlers/SdhAlternateCaptionsHandler;Lcom/bamtechmedia/dominguez/profiles/language/handlers/ForcedCaptionsHandler;)V", "resolveAvailableDictionaryLanguages", "", "", "languagePreferences", "Lcom/bamtechmedia/dominguez/profiles/LanguagePreferences;", "originalLanguage", "resolveCaptionsEngineSelection", "Lio/reactivex/Single;", "Lcom/bamtechmedia/dominguez/profiles/api/language/CaptionsEngineSelection;", "captions", "Lcom/bamtechmedia/dominguez/core/content/assets/Language;", "audioLanguageCode", "profiles_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* renamed from: com.bamtechmedia.dominguez.profiles.x1.g.e */
/* compiled from: CaptionsResolversImpl.kt */
public final class C6924e implements C6863c {

    /* renamed from: a */
    private final C6913e f15412a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final C6945x f15413b;

    /* renamed from: c */
    private final C6937p f15414c;

    /* renamed from: d */
    private final C6943v f15415d;

    /* renamed from: e */
    private final C6934m f15416e;

    @Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u0010\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, mo31007d2 = {"<anonymous>", "Lio/reactivex/Single;", "Lcom/bamtechmedia/dominguez/profiles/api/language/CaptionsEngineSelection;", "kotlin.jvm.PlatformType", "it", "Lcom/bamtechmedia/dominguez/profiles/LanguagePreferences;", "apply"}, mo31008k = 3, mo31009mv = {1, 1, 15})
    /* renamed from: com.bamtechmedia.dominguez.profiles.x1.g.e$a */
    /* compiled from: CaptionsResolversImpl.kt */
    static final class C6925a<T, R> implements Function<T, SingleSource<? extends R>> {

        /* renamed from: U */
        final /* synthetic */ String f15417U;

        /* renamed from: V */
        final /* synthetic */ List f15418V;

        /* renamed from: W */
        final /* synthetic */ String f15419W;

        /* renamed from: c */
        final /* synthetic */ C6924e f15420c;

        /* renamed from: com.bamtechmedia.dominguez.profiles.x1.g.e$a$a */
        /* compiled from: CaptionsResolversImpl.kt */
        static final class C6926a<V> implements Callable<T> {

            /* renamed from: U */
            final /* synthetic */ C7019z f15421U;

            /* renamed from: c */
            final /* synthetic */ C6925a f15422c;

            C6926a(C6925a aVar, C7019z zVar) {
                this.f15422c = aVar;
                this.f15421U = zVar;
            }

            public final C6862b call() {
                C6924e eVar = this.f15422c.f15420c;
                C7019z zVar = this.f15421U;
                String str = "it";
                C12880j.m40222a((Object) zVar, str);
                List a = eVar.m21164a(zVar, this.f15422c.f15417U);
                C6945x a2 = this.f15422c.f15420c.f15413b;
                List list = this.f15422c.f15418V;
                C7019z zVar2 = this.f15421U;
                C12880j.m40222a((Object) zVar2, str);
                return a2.mo19682a(list, zVar2, a, this.f15422c.f15419W);
            }
        }

        C6925a(C6924e eVar, String str, List list, String str2) {
            this.f15420c = eVar;
            this.f15417U = str;
            this.f15418V = list;
            this.f15419W = str2;
        }

        /* renamed from: a */
        public final Single<C6862b> apply(C7019z zVar) {
            return Maybe.m38257b((Callable<? extends T>) new C6926a<Object>(this, zVar)).mo30109a((SingleSource<? extends T>) Single.m38399b(new C6862b(zVar.mo19797b0(), false, false)));
        }
    }

    public C6924e(C6667g1 g1Var, C6913e eVar, C6945x xVar, C6937p pVar, C6943v vVar, C6934m mVar) {
        this.f15412a = eVar;
        this.f15413b = xVar;
        this.f15414c = pVar;
        this.f15415d = vVar;
        this.f15416e = mVar;
        this.f15413b.mo19684a((C6917a) this.f15414c);
        this.f15414c.mo19684a((C6917a) this.f15415d);
        this.f15415d.mo19684a((C6917a) this.f15416e);
    }

    /* renamed from: a */
    public Single<C6862b> mo19631a(C7019z zVar, String str, List<Language> list, String str2) {
        Single<C6862b> a = Single.m38399b(zVar).mo30208a((Function<? super T, ? extends SingleSource<? extends R>>) new C6925a<Object,Object>(this, str, list, str2));
        C12880j.m40222a((Object) a, "Single.just(languagePref…e, false)))\n            }");
        return a;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final List<String> m21164a(C7019z zVar, String str) {
        Object obj;
        String b0 = zVar.mo19797b0();
        if (b0 != null) {
            List<String> a = C6936o.m21182a(C13183n.m40498a(b0));
            ArrayList arrayList = new ArrayList(C13187p.m40525a((Iterable) a, 10));
            for (String b : a) {
                arrayList.add(this.f15412a.mo19676b(b, str));
            }
            Iterator it = arrayList.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (!((List) obj).isEmpty()) {
                    break;
                }
            }
            List<String> list = (List) obj;
            return list != null ? list : C13185o.m40513a();
        }
        C12880j.m40220a();
        throw null;
    }
}
