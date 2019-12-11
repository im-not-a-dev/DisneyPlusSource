package com.bamtechmedia.dominguez.search;

import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import com.bamtechmedia.dominguez.profiles.C6626c0;
import com.bamtechmedia.dominguez.profiles.C6667g1;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Map;
import java.util.concurrent.Callable;
import kotlin.Metadata;
import kotlin.jvm.internal.C12880j;
import p163g.p500m.p501a.C11725h;
import p163g.p500m.p501a.C11760v;
import p163g.p500m.p501a.C11780y;
import p520io.reactivex.C11969r;
import p520io.reactivex.Maybe;
import p520io.reactivex.MaybeSource;
import p520io.reactivex.Single;
import p520io.reactivex.SingleSource;
import p520io.reactivex.functions.Consumer;
import p520io.reactivex.functions.Function;
import p686n.p687a.C14100a;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 #2\u00020\u0001:\u0001#B-\b\u0007\u0012\n\b\u0001\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u000f0\u001cJ\u0010\u0010\u001d\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00120\u001eH\u0002J.\u0010\u001f\u001a(\u0012$\u0012\"\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f \u0010*\u0010\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f\u0018\u00010\r0\r0\u001cH\u0002J\u000e\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020\u000fRb\u0010\u000b\u001aV\u0012$\u0012\"\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f \u0010*\u0010\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f\u0018\u00010\r0\r \u0010**\u0012$\u0012\"\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f \u0010*\u0010\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f\u0018\u00010\r0\r\u0018\u00010\f0\fX\u0004¢\u0006\u0002\n\u0000R&\u0010\u0011\u001a\u0004\u0018\u00010\u00128\u0000@\u0000X\u000e¢\u0006\u0014\n\u0000\u0012\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u0019\u001a\n \u0010*\u0004\u0018\u00010\u001a0\u001aX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006$"}, mo31007d2 = {"Lcom/bamtechmedia/dominguez/search/PersistentRecentSearches;", "", "sharedPrefs", "Landroid/content/SharedPreferences;", "moshi", "Lcom/squareup/moshi/Moshi;", "ioScheduler", "Lio/reactivex/Scheduler;", "profilesRepository", "Lcom/bamtechmedia/dominguez/profiles/ProfilesRepository;", "(Landroid/content/SharedPreferences;Lcom/squareup/moshi/Moshi;Lio/reactivex/Scheduler;Lcom/bamtechmedia/dominguez/profiles/ProfilesRepository;)V", "adapter", "Lcom/squareup/moshi/JsonAdapter;", "", "", "Lcom/bamtechmedia/dominguez/search/RecentSearchList;", "kotlin.jvm.PlatformType", "cachedProfile", "Lcom/bamtechmedia/dominguez/profiles/Profile;", "cachedProfile$annotations", "()V", "getCachedProfile$search_release", "()Lcom/bamtechmedia/dominguez/profiles/Profile;", "setCachedProfile$search_release", "(Lcom/bamtechmedia/dominguez/profiles/Profile;)V", "mapType", "Ljava/lang/reflect/ParameterizedType;", "get", "Lio/reactivex/Maybe;", "getActiveProfile", "Lio/reactivex/Single;", "recentSearchMapMaybe", "store", "Lio/reactivex/Completable;", "recentSearches", "Companion", "search_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* renamed from: com.bamtechmedia.dominguez.search.i */
/* compiled from: PersistentRecentSearches.kt */
public final class C8034i {

    /* renamed from: a */
    private final ParameterizedType f17227a = C11780y.m37894a((Type) Map.class, String.class, RecentSearchList.class);
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final C11725h<Map<String, RecentSearchList>> f17228b = this.f17231e.mo29867a((Type) this.f17227a);

    /* renamed from: c */
    private C6626c0 f17229c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public final SharedPreferences f17230d;

    /* renamed from: e */
    private final C11760v f17231e;

    /* renamed from: f */
    private final C11969r f17232f;

    /* renamed from: g */
    private final C6667g1 f17233g;

    /* renamed from: com.bamtechmedia.dominguez.search.i$a */
    /* compiled from: PersistentRecentSearches.kt */
    public static final class C8035a {
        private C8035a() {
        }

        public /* synthetic */ C8035a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u0010\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, mo31007d2 = {"<anonymous>", "Lio/reactivex/Maybe;", "Lcom/bamtechmedia/dominguez/search/RecentSearchList;", "kotlin.jvm.PlatformType", "profile", "Lcom/bamtechmedia/dominguez/profiles/Profile;", "apply"}, mo31008k = 3, mo31009mv = {1, 1, 15})
    /* renamed from: com.bamtechmedia.dominguez.search.i$b */
    /* compiled from: PersistentRecentSearches.kt */
    static final class C8036b<T, R> implements Function<T, MaybeSource<? extends R>> {

        /* renamed from: c */
        final /* synthetic */ C8034i f17234c;

        /* renamed from: com.bamtechmedia.dominguez.search.i$b$a */
        /* compiled from: PersistentRecentSearches.kt */
        static final class C8037a<T, R> implements Function<T, R> {

            /* renamed from: c */
            final /* synthetic */ C6626c0 f17235c;

            C8037a(C6626c0 c0Var) {
                this.f17235c = c0Var;
            }

            /* renamed from: a */
            public final RecentSearchList apply(Map<String, RecentSearchList> map) {
                RecentSearchList recentSearchList = (RecentSearchList) map.get(this.f17235c.getProfileId());
                return recentSearchList != null ? recentSearchList : new RecentSearchList(C13185o.m40513a());
            }
        }

        C8036b(C8034i iVar) {
            this.f17234c = iVar;
        }

        /* renamed from: a */
        public final Maybe<RecentSearchList> apply(C6626c0 c0Var) {
            return this.f17234c.m23351d().mo30131f(new C8037a(c0Var));
        }
    }

    /* renamed from: com.bamtechmedia.dominguez.search.i$c */
    /* compiled from: PersistentRecentSearches.kt */
    static final class C8038c<T> implements Consumer<Throwable> {

        /* renamed from: c */
        public static final C8038c f17236c = new C8038c();

        C8038c() {
        }

        /* renamed from: a */
        public final void accept(Throwable th) {
            C14100a.m44528b(th, "Failed to load recents from disk", new Object[0]);
        }
    }

    /* renamed from: com.bamtechmedia.dominguez.search.i$d */
    /* compiled from: PersistentRecentSearches.kt */
    static final class C8039d<V> implements Callable<T> {

        /* renamed from: c */
        final /* synthetic */ C8034i f17237c;

        C8039d(C8034i iVar) {
            this.f17237c = iVar;
        }

        public final C6626c0 call() {
            return this.f17237c.mo21020b();
        }
    }

    /* renamed from: com.bamtechmedia.dominguez.search.i$e */
    /* compiled from: PersistentRecentSearches.kt */
    static final class C8040e<T> implements Consumer<C6626c0> {

        /* renamed from: c */
        final /* synthetic */ C8034i f17238c;

        C8040e(C8034i iVar) {
            this.f17238c = iVar;
        }

        /* renamed from: a */
        public final void accept(C6626c0 c0Var) {
            this.f17238c.mo21019a(c0Var);
        }
    }

    /* renamed from: com.bamtechmedia.dominguez.search.i$f */
    /* compiled from: PersistentRecentSearches.kt */
    static final class C8041f<V> implements Callable<T> {

        /* renamed from: c */
        final /* synthetic */ C8034i f17239c;

        C8041f(C8034i iVar) {
            this.f17239c = iVar;
        }

        public final Map<String, RecentSearchList> call() {
            SharedPreferences b = this.f17239c.f17230d;
            String string = b != null ? b.getString("recentSearches", null) : null;
            if (string == null) {
                return null;
            }
            Map map = (Map) this.f17239c.f17228b.fromJson(string);
            if (map == null) {
                map = C13173j0.m40350a();
            }
            return map;
        }
    }

    /* renamed from: com.bamtechmedia.dominguez.search.i$g */
    /* compiled from: PersistentRecentSearches.kt */
    static final class C8042g<T> implements Consumer<Map<String, ? extends RecentSearchList>> {

        /* renamed from: U */
        final /* synthetic */ C8034i f17240U;

        /* renamed from: V */
        final /* synthetic */ RecentSearchList f17241V;

        /* renamed from: c */
        final /* synthetic */ C6626c0 f17242c;

        C8042g(C6626c0 c0Var, C8034i iVar, RecentSearchList recentSearchList) {
            this.f17242c = c0Var;
            this.f17240U = iVar;
            this.f17241V = recentSearchList;
        }

        /* renamed from: a */
        public final void accept(Map<String, RecentSearchList> map) {
            C12880j.m40222a((Object) map, "cachedMap");
            Map e = C13173j0.m40365e(map);
            e.put(this.f17242c.getProfileId(), this.f17241V);
            SharedPreferences b = this.f17240U.f17230d;
            if (b != null) {
                Editor edit = b.edit();
                C12880j.m40222a((Object) edit, "editor");
                edit.putString("recentSearches", this.f17240U.f17228b.toJson(e));
                edit.apply();
            }
        }
    }

    static {
        new C8035a(null);
    }

    public C8034i(SharedPreferences sharedPreferences, C11760v vVar, C11969r rVar, C6667g1 g1Var) {
        this.f17230d = sharedPreferences;
        this.f17231e = vVar;
        this.f17232f = rVar;
        this.f17233g = g1Var;
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public final Maybe<Map<String, RecentSearchList>> m23351d() {
        Maybe<Map<String, RecentSearchList>> b = Maybe.m38257b((Callable<? extends T>) new C8041f<Object>(this));
        C12880j.m40222a((Object) b, "Maybe\n        .fromCalla…t) ?: mapOf() }\n        }");
        return b;
    }

    /* renamed from: c */
    private final Single<C6626c0> m23350c() {
        Single<C6626c0> d = Maybe.m38257b((Callable<? extends T>) new C8039d<Object>(this)).mo30109a((SingleSource<? extends T>) this.f17233g.mo19381b()).mo30227d((Consumer<? super T>) new C8040e<Object>(this));
        C12880j.m40222a((Object) d, "Maybe.fromCallable { cac…ss { cachedProfile = it }");
        return d;
    }

    /* renamed from: a */
    public final void mo21019a(C6626c0 c0Var) {
        this.f17229c = c0Var;
    }

    /* renamed from: b */
    public final C6626c0 mo21020b() {
        return this.f17229c;
    }

    /* renamed from: a */
    public final Maybe<RecentSearchList> mo21018a() {
        Maybe<RecentSearchList> b = m23350c().mo30221c((Function<? super T, ? extends MaybeSource<? extends R>>) new C8036b<Object,Object>(this)).mo30102a((Consumer<? super Throwable>) C8038c.f17236c).mo30127d().mo30119b(this.f17232f);
        C12880j.m40222a((Object) b, "getActiveProfile()\n     ….subscribeOn(ioScheduler)");
        return b;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0021, code lost:
        if (r4 != null) goto L_0x002d;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final p520io.reactivex.Completable mo21017a(com.bamtechmedia.dominguez.search.RecentSearchList r4) {
        /*
            r3 = this;
            com.bamtechmedia.dominguez.profiles.c0 r0 = r3.f17229c
            if (r0 == 0) goto L_0x0024
            io.reactivex.Maybe r1 = r3.m23351d()
            java.util.Map r2 = kotlin.p590y.C13173j0.m40350a()
            io.reactivex.Single r2 = p520io.reactivex.Single.m38399b(r2)
            io.reactivex.Single r1 = r1.mo30109a(r2)
            com.bamtechmedia.dominguez.search.i$g r2 = new com.bamtechmedia.dominguez.search.i$g
            r2.<init>(r0, r3, r4)
            io.reactivex.Single r4 = r1.mo30227d(r2)
            io.reactivex.Completable r4 = r4.mo30228e()
            if (r4 == 0) goto L_0x0024
            goto L_0x002d
        L_0x0024:
            io.reactivex.Completable r4 = p520io.reactivex.Completable.m38169h()
            java.lang.String r0 = "Completable.complete()"
            kotlin.jvm.internal.C12880j.m40222a(r4, r0)
        L_0x002d:
            io.reactivex.r r0 = r3.f17232f
            io.reactivex.Completable r4 = r4.mo30051b(r0)
            java.lang.String r0 = "completable.subscribeOn(ioScheduler)"
            kotlin.jvm.internal.C12880j.m40222a(r4, r0)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bamtechmedia.dominguez.search.C8034i.mo21017a(com.bamtechmedia.dominguez.search.RecentSearchList):io.reactivex.Completable");
    }
}
