package com.bamtechmedia.dominguez.search;

import com.bamtechmedia.dominguez.core.utils.C5826e0;
import java.util.List;
import java.util.concurrent.Callable;
import kotlin.Metadata;
import kotlin.jvm.internal.C12880j;
import p520io.reactivex.Maybe;
import p520io.reactivex.Single;
import p520io.reactivex.SingleSource;
import p520io.reactivex.functions.Consumer;
import p520io.reactivex.functions.Function;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u001a\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\b2\u0006\u0010\u000b\u001a\u00020\fJ\u000e\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00060\bH\u0002J\u0012\u0010\u000e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\bJ\u0010\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\bH\u0002J\u001a\u0010\u0010\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\b2\u0006\u0010\u000b\u001a\u00020\fJ\u0010\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0006H\u0002R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0014"}, mo31007d2 = {"Lcom/bamtechmedia/dominguez/search/RecentSearchRepository;", "", "persistentRecentSearches", "Lcom/bamtechmedia/dominguez/search/PersistentRecentSearches;", "(Lcom/bamtechmedia/dominguez/search/PersistentRecentSearches;)V", "cached", "Lcom/bamtechmedia/dominguez/search/RecentSearchList;", "addAndGet", "Lio/reactivex/Single;", "", "Lcom/bamtechmedia/dominguez/search/RecentSearch;", "queryText", "", "getRecentSearchList", "getRecentSearches", "loadFromPersistent", "removeAndGet", "storeToPersistent", "", "recentSearchList", "search_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* renamed from: com.bamtechmedia.dominguez.search.r */
/* compiled from: RecentSearchRepository.kt */
public final class C8052r {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public RecentSearchList f17247a;

    /* renamed from: b */
    private final C8034i f17248b;

    /* renamed from: com.bamtechmedia.dominguez.search.r$a */
    /* compiled from: RecentSearchRepository.kt */
    static final class C8053a<T, R> implements Function<T, R> {

        /* renamed from: c */
        final /* synthetic */ String f17249c;

        C8053a(String str) {
            this.f17249c = str;
        }

        /* renamed from: a */
        public final RecentSearchList apply(RecentSearchList recentSearchList) {
            return recentSearchList.mo20853a(this.f17249c);
        }
    }

    /* renamed from: com.bamtechmedia.dominguez.search.r$b */
    /* compiled from: RecentSearchRepository.kt */
    static final class C8054b<T> implements Consumer<RecentSearchList> {

        /* renamed from: c */
        final /* synthetic */ C8052r f17250c;

        C8054b(C8052r rVar) {
            this.f17250c = rVar;
        }

        /* renamed from: a */
        public final void accept(RecentSearchList recentSearchList) {
            C8052r rVar = this.f17250c;
            C12880j.m40222a((Object) recentSearchList, "it");
            rVar.m23363a(recentSearchList);
        }
    }

    /* renamed from: com.bamtechmedia.dominguez.search.r$c */
    /* compiled from: RecentSearchRepository.kt */
    static final class C8055c<T, R> implements Function<T, R> {

        /* renamed from: c */
        public static final C8055c f17251c = new C8055c();

        C8055c() {
        }

        /* renamed from: a */
        public final List<RecentSearch> apply(RecentSearchList recentSearchList) {
            return recentSearchList.mo20854a();
        }
    }

    /* renamed from: com.bamtechmedia.dominguez.search.r$d */
    /* compiled from: RecentSearchRepository.kt */
    static final class C8056d<V> implements Callable<T> {

        /* renamed from: c */
        final /* synthetic */ C8052r f17252c;

        C8056d(C8052r rVar) {
            this.f17252c = rVar;
        }

        public final RecentSearchList call() {
            return this.f17252c.f17247a;
        }
    }

    /* renamed from: com.bamtechmedia.dominguez.search.r$e */
    /* compiled from: RecentSearchRepository.kt */
    static final class C8057e<T, R> implements Function<T, R> {

        /* renamed from: c */
        public static final C8057e f17253c = new C8057e();

        C8057e() {
        }

        /* renamed from: a */
        public final List<RecentSearch> apply(RecentSearchList recentSearchList) {
            return recentSearchList.mo20854a();
        }
    }

    /* renamed from: com.bamtechmedia.dominguez.search.r$f */
    /* compiled from: RecentSearchRepository.kt */
    static final class C8058f<T> implements Consumer<RecentSearchList> {

        /* renamed from: c */
        final /* synthetic */ C8052r f17254c;

        C8058f(C8052r rVar) {
            this.f17254c = rVar;
        }

        /* renamed from: a */
        public final void accept(RecentSearchList recentSearchList) {
            this.f17254c.f17247a = recentSearchList;
        }
    }

    public C8052r(C8034i iVar) {
        this.f17248b = iVar;
    }

    /* renamed from: c */
    private final Single<RecentSearchList> m23367c() {
        return this.f17248b.mo21018a().mo30120b(new RecentSearchList(C13185o.m40513a())).mo30227d((Consumer<? super T>) new C8058f<Object>(this));
    }

    /* renamed from: b */
    private final Single<RecentSearchList> m23365b() {
        Single<RecentSearchList> a = Maybe.m38257b((Callable<? extends T>) new C8056d<Object>(this)).mo30109a((SingleSource<? extends T>) m23367c());
        C12880j.m40222a((Object) a, "Maybe\n        .fromCalla…pty(loadFromPersistent())");
        return a;
    }

    /* renamed from: a */
    public final Single<List<RecentSearch>> mo21028a() {
        Single<List<RecentSearch>> g = m23365b().mo30233g(C8057e.f17253c);
        C12880j.m40222a((Object) g, "getRecentSearchList().map { it.recentSearches }");
        return g;
    }

    /* renamed from: a */
    public final Single<List<RecentSearch>> mo21029a(String str) {
        Single<List<RecentSearch>> g = m23365b().mo30233g(new C8053a(str)).mo30227d((Consumer<? super T>) new C8054b<Object>(this)).mo30233g(C8055c.f17251c);
        C12880j.m40222a((Object) g, "getRecentSearchList()\n  …map { it.recentSearches }");
        return g;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final void m23363a(RecentSearchList recentSearchList) {
        this.f17247a = recentSearchList;
        C5826e0.m18823a(this.f17248b.mo21017a(recentSearchList), null, null, 3, null);
    }
}
