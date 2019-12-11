package com.bamtechmedia.dominguez.profiles;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import com.bamtechmedia.dominguez.config.C3572r0;
import com.bamtechmedia.dominguez.config.C3572r0.C3573a;
import com.bamtechmedia.dominguez.core.content.C3593a;
import com.bamtechmedia.dominguez.core.content.assets.C3626b;
import com.bamtechmedia.dominguez.core.content.collections.C3658a;
import com.bamtechmedia.dominguez.core.content.collections.C3667h;
import com.bamtechmedia.dominguez.core.content.collections.C3678l;
import com.bamtechmedia.dominguez.core.content.search.C3749j;
import com.bamtechmedia.dominguez.core.utils.C5837i;
import com.bamtechmedia.dominguez.profiles.C6667g1.C6668a;
import com.bamtechmedia.dominguez.profiles.p263u1.p264d.C6864d;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.concurrent.Callable;
import kotlin.C13145v;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p163g.p201e.p203b.p330z.C7949h;
import p520io.reactivex.C11969r;
import p520io.reactivex.Completable;
import p520io.reactivex.Maybe;
import p520io.reactivex.MaybeSource;
import p520io.reactivex.Observable;
import p520io.reactivex.Single;
import p520io.reactivex.SingleSource;
import p520io.reactivex.functions.C11952h;
import p520io.reactivex.functions.Consumer;
import p520io.reactivex.functions.Function;
import p686n.p687a.Timber;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 72\u00020\u00012\u00020\u0002:\u00017Bc\b\u0007\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\u0006\u0010\u000f\u001a\u00020\u0010\u0012\u0006\u0010\u0011\u001a\u00020\u0012\u0012\u0006\u0010\u0013\u001a\u00020\u0014\u0012\u0006\u0010\u0015\u001a\u00020\u0016\u0012\b\b\u0001\u0010\u0017\u001a\u00020\u0018¢\u0006\u0002\u0010\u0019J\b\u0010!\u001a\u00020\"H\u0016J\u0010\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020&H\u0002J\b\u0010'\u001a\u00020\"H\u0016J\b\u0010(\u001a\u00020\"H\u0016J\u0010\u0010)\u001a\u00020\"2\u0006\u0010*\u001a\u00020+H\u0016J\"\u0010,\u001a\u0004\u0018\u00010&2\f\u0010-\u001a\b\u0012\u0004\u0012\u00020&0.2\b\b\u0002\u0010/\u001a\u00020\u001bH\u0002J\u0016\u00100\u001a\b\u0012\u0004\u0012\u00020&012\u0006\u0010/\u001a\u00020\u001bH\u0016J\b\u00102\u001a\u00020$H\u0016J\u0016\u00103\u001a\b\u0012\u0004\u0012\u00020&042\u0006\u00105\u001a\u000206H\u0002R\u000e\u0010\u0007\u001a\u00020\bX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0014X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0018X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000R$\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001a\u001a\u00020\u001b8V@VX\u000e¢\u0006\f\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R\u000e\u0010\u0015\u001a\u00020\u0016X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0004¢\u0006\u0002\n\u0000¨\u00068"}, mo31007d2 = {"Lcom/bamtechmedia/dominguez/profiles/LocalProfileSelection;", "Lcom/bamtechmedia/dominguez/profiles/ProfilesSetup;", "Lcom/bamtechmedia/dominguez/profiles/StartupProfileProvider;", "preferences", "Landroid/content/SharedPreferences;", "profilesRepository", "Lcom/bamtechmedia/dominguez/profiles/ProfilesRepository;", "avatarsRepository", "Lcom/bamtechmedia/dominguez/profiles/AvatarsRepository;", "collectionsRepository", "Lcom/bamtechmedia/dominguez/core/content/collections/CollectionsRepository;", "languageSetup", "Lcom/bamtechmedia/dominguez/profiles/api/language/CreateProfileLanguageSetup;", "languageCodeRepo", "Lcom/bamtechmedia/dominguez/core/content/search/UiLanguageCodeRepo;", "slugProvider", "Lcom/bamtechmedia/dominguez/core/content/collections/SlugProvider;", "context", "Landroid/content/Context;", "dictionary", "Lcom/bamtechmedia/dominguez/config/StringDictionary;", "profilesMemoryCache", "Lcom/bamtechmedia/dominguez/profiles/ProfilesMemoryCache;", "mainScheduler", "Lio/reactivex/Scheduler;", "(Landroid/content/SharedPreferences;Lcom/bamtechmedia/dominguez/profiles/ProfilesRepository;Lcom/bamtechmedia/dominguez/profiles/AvatarsRepository;Lcom/bamtechmedia/dominguez/core/content/collections/CollectionsRepository;Lcom/bamtechmedia/dominguez/profiles/api/language/CreateProfileLanguageSetup;Lcom/bamtechmedia/dominguez/core/content/search/UiLanguageCodeRepo;Lcom/bamtechmedia/dominguez/core/content/collections/SlugProvider;Landroid/content/Context;Lcom/bamtechmedia/dominguez/config/StringDictionary;Lcom/bamtechmedia/dominguez/profiles/ProfilesMemoryCache;Lio/reactivex/Scheduler;)V", "value", "", "profileSetupRequested", "getProfileSetupRequested", "()Z", "setProfileSetupRequested", "(Z)V", "clearRequests", "", "ensureActive", "Lio/reactivex/Completable;", "profile", "Lcom/bamtechmedia/dominguez/profiles/Profile;", "removeLocalSelectedProfileId", "requestProfileSetup", "setLocalSelectedProfileId", "profileId", "", "startupProfile", "profiles", "", "forceActiveProfile", "startupProfileMaybe", "Lio/reactivex/Maybe;", "updateDefaultProfile", "updateProfileSingle", "Lio/reactivex/Single;", "avatar", "Lcom/bamtechmedia/dominguez/core/content/Avatar;", "Companion", "profiles_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* renamed from: com.bamtechmedia.dominguez.profiles.a0 */
/* compiled from: LocalProfileSelection.kt */
public final class C6606a0 implements C6722l1, C6766q1 {

    /* renamed from: b */
    private final SharedPreferences f14909b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final C6667g1 f14910c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public final C6675i f14911d;

    /* renamed from: e */
    private final C3667h f14912e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public final C6864d f14913f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public final C3749j f14914g;

    /* renamed from: h */
    private final C3678l f14915h;

    /* renamed from: i */
    private final Context f14916i;
    /* access modifiers changed from: private */

    /* renamed from: j */
    public final C3572r0 f14917j;

    /* renamed from: k */
    private final C6627c1 f14918k;

    /* renamed from: l */
    private final C11969r f14919l;

    /* renamed from: com.bamtechmedia.dominguez.profiles.a0$a */
    /* compiled from: LocalProfileSelection.kt */
    public static final class C6607a {
        private C6607a() {
        }

        public /* synthetic */ C6607a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: com.bamtechmedia.dominguez.profiles.a0$b */
    /* compiled from: LocalProfileSelection.kt */
    static final class C6608b<T> implements C11952h<List<? extends C6626c0>> {

        /* renamed from: c */
        public static final C6608b f14920c = new C6608b();

        C6608b() {
        }

        /* renamed from: a */
        public final boolean test(List<? extends C6626c0> list) {
            return !list.isEmpty();
        }
    }

    @Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\u0010\u0000\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00012\u001a\u0010\u0003\u001a\u0016\u0012\u0004\u0012\u00020\u0002 \u0005*\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00040\u0004H\n¢\u0006\u0002\b\u0006"}, mo31007d2 = {"<anonymous>", "Lio/reactivex/Maybe;", "Lcom/bamtechmedia/dominguez/profiles/Profile;", "profiles", "", "kotlin.jvm.PlatformType", "apply"}, mo31008k = 3, mo31009mv = {1, 1, 15})
    /* renamed from: com.bamtechmedia.dominguez.profiles.a0$c */
    /* compiled from: LocalProfileSelection.kt */
    static final class C6609c<T, R> implements Function<T, MaybeSource<? extends R>> {

        /* renamed from: U */
        final /* synthetic */ boolean f14921U;

        /* renamed from: c */
        final /* synthetic */ C6606a0 f14922c;

        /* renamed from: com.bamtechmedia.dominguez.profiles.a0$c$a */
        /* compiled from: LocalProfileSelection.kt */
        static final class C6610a<V> implements Callable<T> {

            /* renamed from: U */
            final /* synthetic */ List f14923U;

            /* renamed from: c */
            final /* synthetic */ C6609c f14924c;

            C6610a(C6609c cVar, List list) {
                this.f14924c = cVar;
                this.f14923U = list;
            }

            public final C6626c0 call() {
                C6606a0 a0Var = this.f14924c.f14922c;
                List list = this.f14923U;
                Intrinsics.checkReturnedValueIsNotNull((Object) list, "profiles");
                return a0Var.m20524a(list, this.f14924c.f14921U);
            }
        }

        C6609c(C6606a0 a0Var, boolean z) {
            this.f14922c = a0Var;
            this.f14921U = z;
        }

        /* renamed from: a */
        public final Maybe<C6626c0> apply(List<? extends C6626c0> list) {
            return Maybe.m38257b((Callable<? extends T>) new C6610a<Object>(this, list));
        }
    }

    /* renamed from: com.bamtechmedia.dominguez.profiles.a0$d */
    /* compiled from: LocalProfileSelection.kt */
    static final class C6611d<T, R> implements Function<T, MaybeSource<? extends R>> {

        /* renamed from: c */
        final /* synthetic */ C6606a0 f14925c;

        C6611d(C6606a0 a0Var) {
            this.f14925c = a0Var;
        }

        /* renamed from: a */
        public final Maybe<C6626c0> apply(C6626c0 c0Var) {
            return this.f14925c.m20527a(c0Var).mo30042a((MaybeSource<T>) Maybe.m38258c(c0Var));
        }
    }

    /* renamed from: com.bamtechmedia.dominguez.profiles.a0$e */
    /* compiled from: LocalProfileSelection.kt */
    static final class C6612e<T, R> implements Function<T, R> {

        /* renamed from: c */
        public static final C6612e f14926c = new C6612e();

        C6612e() {
        }

        /* renamed from: a */
        public final List<C3626b> apply(C3658a aVar) {
            return aVar.mo13346R();
        }
    }

    /* renamed from: com.bamtechmedia.dominguez.profiles.a0$f */
    /* compiled from: LocalProfileSelection.kt */
    static final class C6613f<T, R> implements Function<T, Iterable<? extends U>> {

        /* renamed from: c */
        public static final C6613f f14927c = new C6613f();

        C6613f() {
        }

        /* renamed from: a */
        public final List<C3626b> mo19277a(List<? extends C3626b> list) {
            return list;
        }

        public /* bridge */ /* synthetic */ Object apply(Object obj) {
            List list = (List) obj;
            mo19277a(list);
            return list;
        }
    }

    /* renamed from: com.bamtechmedia.dominguez.profiles.a0$g */
    /* compiled from: LocalProfileSelection.kt */
    static final class C6614g<T, R> implements Function<T, SingleSource<? extends R>> {

        /* renamed from: c */
        final /* synthetic */ C6606a0 f14928c;

        C6614g(C6606a0 a0Var) {
            this.f14928c = a0Var;
        }

        /* renamed from: a */
        public final Single<C3593a> apply(C3593a aVar) {
            return this.f14928c.f14911d.mo19403a(aVar);
        }
    }

    /* renamed from: com.bamtechmedia.dominguez.profiles.a0$h */
    /* compiled from: LocalProfileSelection.kt */
    static final class C6615h<T, R> implements Function<T, SingleSource<? extends R>> {

        /* renamed from: c */
        final /* synthetic */ C6606a0 f14929c;

        C6615h(C6606a0 a0Var) {
            this.f14929c = a0Var;
        }

        /* renamed from: a */
        public final Single<C6626c0> apply(C3593a aVar) {
            return this.f14929c.m20528a(aVar);
        }
    }

    /* renamed from: com.bamtechmedia.dominguez.profiles.a0$i */
    /* compiled from: LocalProfileSelection.kt */
    static final class C6616i<T> implements Consumer<Throwable> {

        /* renamed from: c */
        public static final C6616i f14930c = new C6616i();

        C6616i() {
        }

        /* renamed from: a */
        public final void accept(Throwable th) {
            Timber.m44528b(th, "error setting default avatar", new Object[0]);
        }
    }

    /* renamed from: com.bamtechmedia.dominguez.profiles.a0$j */
    /* compiled from: LocalProfileSelection.kt */
    static final class C6617j<T, R> implements Function<T, R> {

        /* renamed from: c */
        public static final C6617j f14931c = new C6617j();

        C6617j() {
        }

        /* renamed from: a */
        public final C6626c0 apply(List<? extends C6626c0> list) {
            Object obj;
            Intrinsics.checkReturnedValueIsNotNull((Object) list, "it");
            Iterator it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (((C6626c0) obj).isDefault()) {
                    break;
                }
            }
            return (C6626c0) obj;
        }
    }

    /* renamed from: com.bamtechmedia.dominguez.profiles.a0$k */
    /* compiled from: LocalProfileSelection.kt */
    static final class C6618k<T, R> implements Function<T, SingleSource<? extends R>> {

        /* renamed from: U */
        final /* synthetic */ C3593a f14932U;

        /* renamed from: c */
        final /* synthetic */ C6606a0 f14933c;

        C6618k(C6606a0 a0Var, C3593a aVar) {
            this.f14933c = a0Var;
            this.f14932U = aVar;
        }

        /* renamed from: a */
        public final Single<? extends C6626c0> apply(C6626c0 c0Var) {
            C6667g1 e = this.f14933c.f14910c;
            String a = C3573a.m12035a(this.f14933c.f14917j, C7949h.default_profile, (Map) null, 2, (Object) null);
            String j = this.f14932U.mo12824j();
            C7019z b = this.f14933c.f14913f.mo19634b(c0Var);
            this.f14933c.f14914g.mo13598b(b.mo19792X());
            C6654e0 e0Var = new C6654e0(false, false, true, j, false, false, b, 35, null);
            return e.mo19379a(c0Var, a, e0Var);
        }
    }

    static {
        new C6607a(null);
    }

    public C6606a0(SharedPreferences sharedPreferences, C6667g1 g1Var, C6675i iVar, C3667h hVar, C6864d dVar, C3749j jVar, C3678l lVar, Context context, C3572r0 r0Var, C6627c1 c1Var, C11969r rVar) {
        this.f14909b = sharedPreferences;
        this.f14910c = g1Var;
        this.f14911d = iVar;
        this.f14912e = hVar;
        this.f14913f = dVar;
        this.f14914g = jVar;
        this.f14915h = lVar;
        this.f14916i = context;
        this.f14917j = r0Var;
        this.f14918k = c1Var;
        this.f14919l = rVar;
    }

    /* renamed from: b */
    public Maybe<C6626c0> mo19268b(boolean z) {
        Maybe<C6626c0> a = this.f14910c.mo19378a(true).mo30069a((C11952h<? super T>) C6608b.f14920c).mo30087b().mo30221c((Function<? super T, ? extends MaybeSource<? extends R>>) new C6609c<Object,Object>(this, z)).mo30103a((Function<? super T, ? extends MaybeSource<? extends R>>) new C6611d<Object,Object>(this));
        Intrinsics.checkReturnedValueIsNotNull((Object) a, "profilesRepository.profi…andThen(Maybe.just(it)) }");
        return a;
    }

    /* renamed from: c */
    public void mo19269c() {
        Editor edit = this.f14909b.edit();
        Intrinsics.checkReturnedValueIsNotNull((Object) edit, "editor");
        edit.remove("localSelectedProfileId");
        edit.apply();
        C13145v vVar = C13145v.f29587a;
        this.f14918k.clear();
    }

    /* renamed from: d */
    public void mo19270d() {
        mo19266a(true);
    }

    /* renamed from: e */
    public boolean mo19271e() {
        return this.f14909b.getBoolean("profileSetupRequested", false);
    }

    /* renamed from: a */
    public void mo19266a(boolean z) {
        Editor edit = this.f14909b.edit();
        Intrinsics.checkReturnedValueIsNotNull((Object) edit, "editor");
        edit.putBoolean("profileSetupRequested", z);
        edit.apply();
    }

    /* renamed from: b */
    public Completable mo19267b() {
        Observable d = this.f14912e.mo13367a(this.f14915h.mo13385a()).mo30233g(C6612e.f14926c).mo30231f(C6613f.f14927c).mo30183d(1);
        Intrinsics.checkReturnedValueIsNotNull((Object) d, "collectionsRepository.ge…Observable { it }.take(1)");
        Observable a = d.mo30153a(C3593a.class);
        Intrinsics.checkReturnedValueIsNotNull((Object) a, "cast(R::class.java)");
        Completable f = a.mo30191f((Function<? super T, ? extends SingleSource<? extends R>>) new C6614g<Object,Object>(this)).mo30191f((Function<? super T, ? extends SingleSource<? extends R>>) new C6615h<Object,Object>(this)).mo30177c((Consumer<? super Throwable>) C6616i.f14930c).mo30190f();
        Intrinsics.checkReturnedValueIsNotNull((Object) f, "collectionsRepository.ge…        .ignoreElements()");
        return f;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final Completable m20527a(C6626c0 c0Var) {
        if (!c0Var.mo19353Q()) {
            return this.f14910c.mo19375a(c0Var);
        }
        Completable h = Completable.m38169h();
        Intrinsics.checkReturnedValueIsNotNull((Object) h, "Completable.complete()");
        return h;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final C6626c0 m20524a(List<? extends C6626c0> list, boolean z) {
        Object obj;
        Object obj2;
        String string = this.f14909b.getString("localSelectedProfileId", null);
        for (C6626c0 c0Var : list) {
            if (c0Var.mo19353Q()) {
                Iterator it = list.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        obj = null;
                        break;
                    }
                    obj = it.next();
                    if (Intrinsics.areEqual((Object) ((C6626c0) obj).getProfileId(), (Object) C6766q1.f15142a.mo19490a())) {
                        break;
                    }
                }
                C6626c0 c0Var2 = (C6626c0) obj;
                if (c0Var2 != null) {
                    return c0Var2;
                }
                if (!mo19271e() && list.size() != 1 && !z) {
                    if (C5837i.m18843e(this.f14916i)) {
                        return null;
                    }
                    if (string == null || !Intrinsics.areEqual((Object) c0Var.getProfileId(), (Object) string)) {
                        if (string == null) {
                            return null;
                        }
                        Iterator it2 = list.iterator();
                        while (true) {
                            if (!it2.hasNext()) {
                                obj2 = null;
                                break;
                            }
                            obj2 = it2.next();
                            if (Intrinsics.areEqual((Object) ((C6626c0) obj2).getProfileId(), (Object) string)) {
                                break;
                            }
                        }
                        C6626c0 c0Var3 = (C6626c0) obj2;
                        if (c0Var3 == null) {
                            return null;
                        }
                        this.f14910c.mo19375a(c0Var3);
                        return c0Var3;
                    }
                }
                return c0Var;
            }
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }

    /* renamed from: a */
    public void mo19265a(String str) {
        Editor edit = this.f14909b.edit();
        Intrinsics.checkReturnedValueIsNotNull((Object) edit, "editor");
        edit.putString("localSelectedProfileId", str);
        edit.apply();
    }

    /* renamed from: a */
    public void mo19264a() {
        mo19266a(false);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final Single<C6626c0> m20528a(C3593a aVar) {
        Single<C6626c0> a = C6668a.m20672a(this.f14910c, false, 1, null).mo30087b().mo30233g(C6617j.f14931c).mo30211a(this.f14919l).mo30208a((Function<? super T, ? extends SingleSource<? extends R>>) new C6618k<Object,Object>(this, aVar));
        Intrinsics.checkReturnedValueIsNotNull((Object) a, "profilesRepository.profi…          )\n            }");
        return a;
    }
}
