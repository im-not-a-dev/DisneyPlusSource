package com.bamtechmedia.dominguez.dictionaries;

import com.bamtech.sdk4.session.SessionState;
import com.bamtechmedia.dominguez.config.C3556k;
import com.bamtechmedia.dominguez.core.content.search.C3749j;
import com.bamtechmedia.dominguez.core.utils.C5826e0;
import com.bamtechmedia.dominguez.dictionaries.C6087l.C6088a;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import javax.inject.Provider;
import kotlin.C12907r;
import kotlin.C13145v;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12879i;
import kotlin.jvm.internal.C12880j;
import kotlin.jvm.internal.C12895y;
import kotlin.reflect.KDeclarationContainer;
import p520io.reactivex.C11969r;
import p520io.reactivex.Completable;
import p520io.reactivex.CompletableSource;
import p520io.reactivex.Single;
import p520io.reactivex.disposables.CompositeDisposable;
import p520io.reactivex.disposables.Disposable;
import p520io.reactivex.functions.Consumer;
import p686n.p687a.C14100a;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0005\n\u0002\u0010$\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\b\u0001\u0018\u0000 )2\u00020\u0001:\u0001)B?\b\u0007\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\b\b\u0001\u0010\r\u001a\u00020\u000e¢\u0006\u0002\u0010\u000fJ\u0018\u0010\u0018\u001a\u00020\u00132\u0006\u0010\u0019\u001a\u00020\u00122\u0006\u0010\u001a\u001a\u00020\u0012H\u0002J&\u0010\u001b\u001a\u0004\u0018\u00010\u00132\u0006\u0010\u0019\u001a\u00020\u00122\u0012\u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00120\u001dH\u0002J\b\u0010\u001e\u001a\u00020\u0012H\u0002J\u000e\u0010\u001f\u001a\u00020\u00132\u0006\u0010\u0019\u001a\u00020\u0012J\u0006\u0010 \u001a\u00020!J(\u0010\"\u001a\n #*\u0004\u0018\u00010!0!2\u0006\u0010\u001f\u001a\u00020\u00132\u0006\u0010$\u001a\u00020\u00122\u0006\u0010\u001a\u001a\u00020\u0012H\u0002J\u0010\u0010%\u001a\u00020!2\u0006\u0010\u001a\u001a\u00020\u0012H\u0002J\u0012\u0010&\u001a\u00020!2\b\u0010'\u001a\u0004\u0018\u00010\u0012H\u0016J\b\u0010(\u001a\u00020\u0012H\u0002R\u001a\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00130\u0011X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0015X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00120\u0017X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0004¢\u0006\u0002\n\u0000¨\u0006*"}, mo31007d2 = {"Lcom/bamtechmedia/dominguez/dictionaries/DictionaryManager;", "Lcom/bamtechmedia/dominguez/dictionaries/LanguageSwitcher;", "sessionStateOnce", "Lio/reactivex/Single;", "Lcom/bamtech/sdk4/session/SessionState;", "dictionaryFactory", "Lcom/bamtechmedia/dominguez/dictionaries/KeyValueDictionary$Factory;", "entriesDataSource", "Lcom/bamtechmedia/dominguez/dictionaries/DictionaryEntriesDataSource;", "languageProvider", "Lcom/bamtechmedia/dominguez/config/DefaultLanguageProvider;", "uiLanguageCodeRepo", "Lcom/bamtechmedia/dominguez/core/content/search/UiLanguageCodeRepo;", "scheduler", "Lio/reactivex/Scheduler;", "(Lio/reactivex/Single;Lcom/bamtechmedia/dominguez/dictionaries/KeyValueDictionary$Factory;Lcom/bamtechmedia/dominguez/dictionaries/DictionaryEntriesDataSource;Lcom/bamtechmedia/dominguez/config/DefaultLanguageProvider;Lcom/bamtechmedia/dominguez/core/content/search/UiLanguageCodeRepo;Lio/reactivex/Scheduler;)V", "dictionaries", "", "", "Lcom/bamtechmedia/dominguez/dictionaries/KeyValueDictionary;", "dictionaryRequestSubscriptions", "Lio/reactivex/disposables/CompositeDisposable;", "requiredDictionaries", "", "create", "resourceKey", "language", "createDictionary", "entries", "", "deviceDefaultLanguage", "dictionary", "initialize", "Lio/reactivex/Completable;", "loadRemote", "kotlin.jvm.PlatformType", "key", "loadUILanguageDictionaries", "setActiveLanguage", "newLanguage", "uiLanguage", "Companion", "config_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* renamed from: com.bamtechmedia.dominguez.dictionaries.g */
/* compiled from: DictionaryManager.kt */
public final class C6072g implements C6090n {

    /* renamed from: a */
    private final Map<String, C6087l> f13977a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final CompositeDisposable f13978b = new CompositeDisposable();

    /* renamed from: c */
    private final Single<SessionState> f13979c;

    /* renamed from: d */
    private final C6088a f13980d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public final C6068e f13981e;

    /* renamed from: f */
    private final C3556k f13982f;

    /* renamed from: g */
    private final C3749j f13983g;

    /* renamed from: h */
    private final C11969r f13984h;

    /* renamed from: com.bamtechmedia.dominguez.dictionaries.g$a */
    /* compiled from: DictionaryManager.kt */
    public static final class C6073a {
        private C6073a() {
        }

        public /* synthetic */ C6073a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: com.bamtechmedia.dominguez.dictionaries.g$b */
    /* compiled from: DictionaryManager.kt */
    static final class C6074b<T> implements Provider<Map<String, ? extends String>> {

        /* renamed from: a */
        final /* synthetic */ C6072g f13985a;

        /* renamed from: b */
        final /* synthetic */ String f13986b;

        /* renamed from: c */
        final /* synthetic */ String f13987c;

        C6074b(C6072g gVar, String str, String str2) {
            this.f13985a = gVar;
            this.f13986b = str;
            this.f13987c = str2;
        }

        public final Map<String, String> get() {
            return this.f13985a.f13981e.mo18346a(this.f13986b, this.f13987c);
        }
    }

    /* renamed from: com.bamtechmedia.dominguez.dictionaries.g$c */
    /* compiled from: DictionaryManager.kt */
    static final class C6075c<T> implements Provider<Map<String, ? extends String>> {

        /* renamed from: a */
        final /* synthetic */ Map f13988a;

        C6075c(Map map) {
            this.f13988a = map;
        }

        public final Map<String, String> get() {
            return this.f13988a;
        }
    }

    /* renamed from: com.bamtechmedia.dominguez.dictionaries.g$d */
    /* compiled from: DictionaryManager.kt */
    static final class C6076d<T> implements Consumer<List<? extends Dictionary>> {

        /* renamed from: c */
        final /* synthetic */ C6072g f13989c;

        C6076d(C6072g gVar) {
            this.f13989c = gVar;
        }

        /* renamed from: a */
        public final void accept(List<Dictionary> list) {
            for (Dictionary dictionary : list) {
                this.f13989c.m19451a(dictionary.mo18327b(), dictionary.mo18326a());
            }
        }
    }

    /* renamed from: com.bamtechmedia.dominguez.dictionaries.g$e */
    /* compiled from: DictionaryManager.kt */
    static final /* synthetic */ class C6077e extends C12879i implements Function1<Throwable, C13145v> {

        /* renamed from: c */
        public static final C6077e f13990c = new C6077e();

        C6077e() {
            super(1);
        }

        /* renamed from: a */
        public final void mo18353a(Throwable th) {
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
            mo18353a((Throwable) obj);
            return C13145v.f29587a;
        }
    }

    /* renamed from: com.bamtechmedia.dominguez.dictionaries.g$f */
    /* compiled from: DictionaryManager.kt */
    static final class C6078f<T> implements Consumer<Disposable> {

        /* renamed from: c */
        final /* synthetic */ C6072g f13991c;

        C6078f(C6072g gVar) {
            this.f13991c = gVar;
        }

        /* renamed from: a */
        public final void accept(Disposable disposable) {
            this.f13991c.f13978b.mo30250b(disposable);
        }
    }

    /* renamed from: com.bamtechmedia.dominguez.dictionaries.g$g */
    /* compiled from: DictionaryManager.kt */
    static final class C6079g<T> implements Consumer<List<? extends Dictionary>> {

        /* renamed from: c */
        final /* synthetic */ C6087l f13992c;

        C6079g(C6087l lVar) {
            this.f13992c = lVar;
        }

        /* renamed from: a */
        public final void accept(List<Dictionary> list) {
            C12880j.m40222a((Object) list, "dictionaries");
            for (Dictionary a : list) {
                this.f13992c.mo18361a(a.mo18326a());
            }
        }
    }

    static {
        new C6073a(null);
    }

    public C6072g(Single<SessionState> single, C6088a aVar, C6068e eVar, C3556k kVar, C3749j jVar, C11969r rVar) {
        this.f13979c = single;
        this.f13980d = aVar;
        this.f13981e = eVar;
        this.f13982f = kVar;
        this.f13983g = jVar;
        this.f13984h = rVar;
        String str = "language-settings";
        this.f13977a = C13173j0.m40360b(C12907r.m40244a(str, m19450a(str, "en")));
        C13185o.m40520c("application", "sdk-errors", "ratings", "paywall", "accessibility");
        this.f13983g.mo13596a(m19455b());
    }

    /* renamed from: c */
    private final String m19457c() {
        String code = this.f13983g.getCode();
        return code != null ? code : this.f13983g.mo13595a();
    }

    /* renamed from: c */
    private final Completable m19456c(String str) {
        Map<String, C6087l> map = this.f13977a;
        ArrayList arrayList = new ArrayList(map.size());
        for (Entry entry : map.entrySet()) {
            arrayList.add(m19452a((C6087l) entry.getValue(), (String) entry.getKey(), str));
        }
        Completable c = Completable.m38167c((Iterable<? extends CompletableSource>) arrayList);
        C12880j.m40222a((Object) c, "Completable.mergeDelayEr…lue, it.key, language) })");
        return c;
    }

    /* renamed from: b */
    public final C6087l mo18351b(String str) {
        C6087l a;
        Map<String, C6087l> map = this.f13977a;
        Object obj = map.get(str);
        if (obj == 0) {
            synchronized (this) {
                a = m19450a(str, m19457c());
                Completable a2 = m19452a(a, str, m19457c());
                C12880j.m40222a((Object) a2, "loadRemote(it, resourceKey, uiLanguage())");
                C5826e0.m18823a(a2, null, null, 3, null);
            }
            map.put(str, a);
            obj = a;
        }
        return (C6087l) obj;
    }

    /* renamed from: a */
    private final C6087l m19450a(String str, String str2) {
        return this.f13980d.mo18362a(new C6074b(this, str, str2), str);
    }

    /* JADX WARNING: type inference failed for: r1v6, types: [com.bamtechmedia.dominguez.dictionaries.g$e, kotlin.jvm.functions.Function1] */
    /* JADX WARNING: type inference failed for: r1v7 */
    /* JADX WARNING: type inference failed for: r2v3, types: [com.bamtechmedia.dominguez.dictionaries.h] */
    /* JADX WARNING: type inference failed for: r1v10 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 2 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final p520io.reactivex.Completable mo18349a() {
        /*
            r7 = this;
            java.lang.String r0 = r7.m19457c()
            io.reactivex.Single<com.bamtech.sdk4.session.SessionState> r1 = r7.f13979c
            java.util.concurrent.TimeUnit r4 = java.util.concurrent.TimeUnit.MICROSECONDS
            io.reactivex.r r5 = r7.f13984h
            com.bamtech.sdk4.session.SessionState$LoggedOut r2 = new com.bamtech.sdk4.session.SessionState$LoggedOut
            r2.<init>()
            io.reactivex.Single r6 = p520io.reactivex.Single.m38399b(r2)
            r2 = 250(0xfa, double:1.235E-321)
            io.reactivex.Single r1 = r1.mo30204a(r2, r4, r5, r6)
            java.lang.Object r1 = r1.mo30224c()
            com.bamtech.sdk4.session.SessionState r1 = (com.bamtech.sdk4.session.SessionState) r1
            com.bamtech.sdk4.session.SessionState$LoggedIn r2 = new com.bamtech.sdk4.session.SessionState$LoggedIn
            r2.<init>()
            boolean r1 = kotlin.jvm.internal.C12880j.m40224a(r1, r2)
            if (r1 == 0) goto L_0x002d
            r1 = 3
            goto L_0x002f
        L_0x002d:
            r1 = 10
        L_0x002f:
            com.bamtechmedia.dominguez.dictionaries.e r3 = r7.f13981e
            io.reactivex.Single r0 = r3.mo18344a(r0)
            com.bamtechmedia.dominguez.dictionaries.g$d r3 = new com.bamtechmedia.dominguez.dictionaries.g$d
            r3.<init>(r7)
            io.reactivex.Single r0 = r0.mo30227d(r3)
            java.util.concurrent.TimeUnit r3 = java.util.concurrent.TimeUnit.SECONDS
            io.reactivex.r r4 = r7.f13984h
            io.reactivex.Single r0 = r0.mo30203a(r1, r3, r4)
            io.reactivex.Completable r0 = r0.mo30228e()
            com.bamtechmedia.dominguez.dictionaries.g$e r1 = com.bamtechmedia.dominguez.dictionaries.C6072g.C6077e.f13990c
            if (r1 == 0) goto L_0x0054
            com.bamtechmedia.dominguez.dictionaries.h r2 = new com.bamtechmedia.dominguez.dictionaries.h
            r2.<init>(r1)
            r1 = r2
        L_0x0054:
            io.reactivex.functions.Consumer r1 = (p520io.reactivex.functions.Consumer) r1
            io.reactivex.Completable r0 = r0.mo30036a(r1)
            io.reactivex.Completable r0 = r0.mo30055f()
            java.lang.String r1 = "entriesDataSource.initia…       .onErrorComplete()"
            kotlin.jvm.internal.C12880j.m40222a(r0, r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bamtechmedia.dominguez.dictionaries.C6072g.mo18349a():io.reactivex.Completable");
    }

    /* renamed from: b */
    private final String m19455b() {
        return this.f13982f.mo12763a(mo18351b("language-settings"));
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final C6087l m19451a(String str, Map<String, String> map) {
        return (C6087l) this.f13977a.put(str, this.f13980d.mo18362a(new C6075c(map), str));
    }

    /* renamed from: a */
    public Completable mo18350a(String str) {
        if (str == null) {
            Completable a = mo18350a(m19455b());
            this.f13983g.mo13598b(null);
            return a;
        } else if (C12880j.m40224a((Object) str, (Object) this.f13983g.getCode())) {
            Completable h = Completable.m38169h();
            C12880j.m40222a((Object) h, "Completable.complete()");
            return h;
        } else {
            this.f13978b.mo30247a();
            this.f13983g.mo13598b(str);
            return m19456c(str);
        }
    }

    /* renamed from: a */
    private final Completable m19452a(C6087l lVar, String str, String str2) {
        return this.f13981e.mo18345a(C13183n.m40498a(str), str2).mo30222c((Consumer<? super Disposable>) new C6078f<Object>(this)).mo30227d((Consumer<? super T>) new C6079g<Object>(lVar)).mo30228e();
    }
}
