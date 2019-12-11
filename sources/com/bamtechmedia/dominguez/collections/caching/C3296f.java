package com.bamtechmedia.dominguez.collections.caching;

import com.bamtechmedia.dominguez.analytics.C2366i0;
import com.bamtechmedia.dominguez.analytics.C2366i0.C2367a;
import com.bamtechmedia.dominguez.collections.C3330h;
import com.bamtechmedia.dominguez.collections.C3419l;
import com.bamtechmedia.dominguez.core.content.collections.C3658a;
import com.bamtechmedia.dominguez.core.content.collections.C3676k;
import com.bamtechmedia.dominguez.core.content.sets.ContentSetType;
import com.bamtechmedia.dominguez.core.framework.C5733a;
import com.bamtechmedia.dominguez.core.utils.C5855o;
import com.bamtechmedia.dominguez.profiles.C6626c0;
import com.bamtechmedia.dominguez.profiles.C6667g1;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Callable;
import kotlin.C12907r;
import kotlin.C13145v;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import org.joda.time.DateTime;
import p163g.p503n.p504a.C11792d0;
import p163g.p503n.p504a.C11793e;
import p163g.p503n.p504a.C11842x;
import p520io.reactivex.C11932e;
import p520io.reactivex.C11974s;
import p520io.reactivex.Maybe;
import p520io.reactivex.MaybeSource;
import p520io.reactivex.Single;
import p520io.reactivex.functions.Consumer;
import p520io.reactivex.functions.Function;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u00002\u00020\u00012\u00020\u0002B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ\b\u0010\u0015\u001a\u00020\u0016H\u0016J\"\u0010\u0017\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\f0\u00100\u00182\u0006\u0010\u0019\u001a\u00020\fH\u0002J\"\u0010\u0017\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00140\u00100\u00182\u0006\u0010\u001a\u001a\u00020\u0014H\u0002J\b\u0010\u001b\u001a\u00020\u0016H\u0002J\u0016\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u000e0\u001d2\u0006\u0010\u0019\u001a\u00020\fH\u0016J\u0018\u0010\u001e\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r2\u0006\u0010\u0019\u001a\u00020\fH\u0016J\u0012\u0010\u001f\u001a\u0004\u0018\u00010\u00122\u0006\u0010\u001a\u001a\u00020\u0014H\u0016J\u0012\u0010 \u001a\u0004\u0018\u00010\u00122\u0006\u0010\u0019\u001a\u00020\fH\u0016J\u0010\u0010!\u001a\u00020\u00162\u0006\u0010\u001a\u001a\u00020\u0014H\u0016J\u0018\u0010\"\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\f2\u0006\u0010#\u001a\u00020\u000eH\u0016J$\u0010$\u001a\b\u0012\u0004\u0012\u00020\u000e0\r2\u0006\u0010\u0019\u001a\u00020\f2\f\u0010%\u001a\b\u0012\u0004\u0012\u00020\u000e0\rH\u0016J\u0010\u0010&\u001a\u00020\u00162\u0006\u0010\u001a\u001a\u00020\u0014H\u0016J\u0010\u0010'\u001a\u00020\u00112\u0006\u0010\u0019\u001a\u00020\fH\u0016R \u0010\n\u001a\u0014\u0012\u0004\u0012\u00020\f\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r0\u000bX\u0004¢\u0006\u0002\n\u0000R2\u0010\u000f\u001a&\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\f0\u0010\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u000e0\u00100\u000bX\u0004¢\u0006\u0002\n\u0000R&\u0010\u0013\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00140\u0010\u0012\u0004\u0012\u00020\u00120\u000bX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0004¢\u0006\u0002\n\u0000¨\u0006("}, mo31007d2 = {"Lcom/bamtechmedia/dominguez/collections/caching/ProfileBasedCollectionsCache;", "Lcom/bamtechmedia/dominguez/core/framework/AutoDisposeViewModel;", "Lcom/bamtechmedia/dominguez/collections/CollectionCache;", "profilesRepository", "Lcom/bamtechmedia/dominguez/profiles/ProfilesRepository;", "invalidator", "Lcom/bamtechmedia/dominguez/collections/CollectionInvalidator;", "transactionIdProvider", "Lcom/bamtechmedia/dominguez/analytics/TransactionIdProvider;", "(Lcom/bamtechmedia/dominguez/profiles/ProfilesRepository;Lcom/bamtechmedia/dominguez/collections/CollectionInvalidator;Lcom/bamtechmedia/dominguez/analytics/TransactionIdProvider;)V", "activeRequestCache", "", "Lcom/bamtechmedia/dominguez/core/content/collections/Slug;", "Lio/reactivex/Single;", "Lcom/bamtechmedia/dominguez/core/content/collections/Collection;", "cache", "Lkotlin/Pair;", "", "Lorg/joda/time/DateTime;", "contentSetCache", "Lcom/bamtechmedia/dominguez/core/content/sets/ContentSetType;", "clearAll", "", "evict", "", "slug", "setType", "evictAll", "get", "Lio/reactivex/Maybe;", "getActiveRequest", "getLastFetched", "getLastFetchedBySlug", "invalidate", "put", "collection", "putActiveRequest", "subscription", "putLastFetched", "transactionId", "collections_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* renamed from: com.bamtechmedia.dominguez.collections.caching.f */
/* compiled from: ProfileBasedCollectionsCache.kt */
public final class C3296f extends C5733a implements C3330h {
    /* access modifiers changed from: private */

    /* renamed from: U */
    public final Map<Pair<String, ContentSetType>, DateTime> f8340U = new LinkedHashMap();
    /* access modifiers changed from: private */

    /* renamed from: V */
    public final Map<C3676k, Single<C3658a>> f8341V = new LinkedHashMap();

    /* renamed from: W */
    private final C6667g1 f8342W;
    /* access modifiers changed from: private */

    /* renamed from: X */
    public final C2366i0 f8343X;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final Map<Pair<String, C3676k>, Pair<DateTime, C3658a>> f8344c = new LinkedHashMap();

    /* renamed from: com.bamtechmedia.dominguez.collections.caching.f$a */
    /* compiled from: ProfileBasedCollectionsCache.kt */
    static final class C3297a<T> implements Consumer<C13145v> {

        /* renamed from: c */
        final /* synthetic */ C3296f f8345c;

        C3297a(C3296f fVar) {
            this.f8345c = fVar;
        }

        /* renamed from: a */
        public final void accept(C13145v vVar) {
            this.f8345c.m11390y();
        }
    }

    /* renamed from: com.bamtechmedia.dominguez.collections.caching.f$b */
    /* compiled from: ProfileBasedCollectionsCache.kt */
    static final class C3298b<T> implements Consumer<Throwable> {

        /* renamed from: c */
        public static final C3298b f8346c = new C3298b();

        C3298b() {
        }

        /* renamed from: a */
        public final void mo12352a(Throwable th) {
            Intrinsics.checkReturnedValueIsNotNull((Object) th, "it");
            throw th;
        }

        public /* bridge */ /* synthetic */ void accept(Object obj) {
            mo12352a((Throwable) obj);
            throw null;
        }
    }

    /* renamed from: com.bamtechmedia.dominguez.collections.caching.f$c */
    /* compiled from: ProfileBasedCollectionsCache.kt */
    static final class C3299c<T> implements Consumer<C3676k> {

        /* renamed from: c */
        final /* synthetic */ C3296f f8347c;

        C3299c(C3296f fVar) {
            this.f8347c = fVar;
        }

        /* renamed from: a */
        public final void accept(C3676k kVar) {
            C3296f fVar = this.f8347c;
            Intrinsics.checkReturnedValueIsNotNull((Object) kVar, "it");
            fVar.m11389f(kVar);
        }
    }

    /* renamed from: com.bamtechmedia.dominguez.collections.caching.f$d */
    /* compiled from: ProfileBasedCollectionsCache.kt */
    static final class C3300d<T> implements Consumer<Throwable> {

        /* renamed from: c */
        public static final C3300d f8348c = new C3300d();

        C3300d() {
        }

        /* renamed from: a */
        public final void mo12354a(Throwable th) {
            Intrinsics.checkReturnedValueIsNotNull((Object) th, "it");
            throw th;
        }

        public /* bridge */ /* synthetic */ void accept(Object obj) {
            mo12354a((Throwable) obj);
            throw null;
        }
    }

    /* renamed from: com.bamtechmedia.dominguez.collections.caching.f$e */
    /* compiled from: ProfileBasedCollectionsCache.kt */
    static final class C3301e<T> implements Consumer<ContentSetType> {

        /* renamed from: c */
        final /* synthetic */ C3296f f8349c;

        C3301e(C3296f fVar) {
            this.f8349c = fVar;
        }

        /* renamed from: a */
        public final void accept(ContentSetType contentSetType) {
            C3296f fVar = this.f8349c;
            Intrinsics.checkReturnedValueIsNotNull((Object) contentSetType, "it");
            fVar.m11386d(contentSetType);
        }
    }

    /* renamed from: com.bamtechmedia.dominguez.collections.caching.f$f */
    /* compiled from: ProfileBasedCollectionsCache.kt */
    static final class C3302f<T> implements Consumer<Throwable> {

        /* renamed from: c */
        public static final C3302f f8350c = new C3302f();

        C3302f() {
        }

        /* renamed from: a */
        public final void mo12356a(Throwable th) {
            Intrinsics.checkReturnedValueIsNotNull((Object) th, "it");
            throw th;
        }

        public /* bridge */ /* synthetic */ void accept(Object obj) {
            mo12356a((Throwable) obj);
            throw null;
        }
    }

    @Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\u001c\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a(\u0012$\u0012\"\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004 \u0005*\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00020\u00020\u00012\u0006\u0010\u0006\u001a\u00020\u0007H\n¢\u0006\u0002\b\b"}, mo31007d2 = {"<anonymous>", "Lio/reactivex/Maybe;", "Lkotlin/Pair;", "Lorg/joda/time/DateTime;", "Lcom/bamtechmedia/dominguez/core/content/collections/Collection;", "kotlin.jvm.PlatformType", "it", "Lcom/bamtechmedia/dominguez/profiles/Profile;", "apply"}, mo31008k = 3, mo31009mv = {1, 1, 15})
    /* renamed from: com.bamtechmedia.dominguez.collections.caching.f$g */
    /* compiled from: ProfileBasedCollectionsCache.kt */
    static final class C3303g<T, R> implements Function<T, MaybeSource<? extends R>> {

        /* renamed from: U */
        final /* synthetic */ C3676k f8351U;

        /* renamed from: c */
        final /* synthetic */ C3296f f8352c;

        /* renamed from: com.bamtechmedia.dominguez.collections.caching.f$g$a */
        /* compiled from: ProfileBasedCollectionsCache.kt */
        static final class C3304a<V> implements Callable<T> {

            /* renamed from: U */
            final /* synthetic */ C6626c0 f8353U;

            /* renamed from: c */
            final /* synthetic */ C3303g f8354c;

            C3304a(C3303g gVar, C6626c0 c0Var) {
                this.f8354c = gVar;
                this.f8353U = c0Var;
            }

            public final Pair<DateTime, C3658a> call() {
                return (Pair) this.f8354c.f8352c.f8344c.get(C12907r.m40244a(this.f8353U.getProfileId(), this.f8354c.f8351U));
            }
        }

        C3303g(C3296f fVar, C3676k kVar) {
            this.f8352c = fVar;
            this.f8351U = kVar;
        }

        /* renamed from: a */
        public final Maybe<Pair<DateTime, C3658a>> apply(C6626c0 c0Var) {
            return Maybe.m38257b((Callable<? extends T>) new C3304a<Object>(this, c0Var));
        }
    }

    /* renamed from: com.bamtechmedia.dominguez.collections.caching.f$h */
    /* compiled from: ProfileBasedCollectionsCache.kt */
    static final class C3305h<T, R> implements Function<T, R> {

        /* renamed from: c */
        public static final C3305h f8355c = new C3305h();

        C3305h() {
        }

        /* renamed from: a */
        public final C3658a apply(Pair<DateTime, ? extends C3658a> pair) {
            return (C3658a) pair.mo31016d();
        }
    }

    /* renamed from: com.bamtechmedia.dominguez.collections.caching.f$i */
    /* compiled from: ProfileBasedCollectionsCache.kt */
    static final class C3306i<T> implements Consumer<C3658a> {
        C3306i(C3676k kVar) {
        }

        /* renamed from: a */
        public final void accept(C3658a aVar) {
            C5855o oVar = C5855o.f13640a;
        }
    }

    /* renamed from: com.bamtechmedia.dominguez.collections.caching.f$j */
    /* compiled from: ProfileBasedCollectionsCache.kt */
    static final class C3307j<T> implements Consumer<C6626c0> {

        /* renamed from: U */
        final /* synthetic */ ContentSetType f8356U;

        /* renamed from: c */
        final /* synthetic */ C3296f f8357c;

        C3307j(C3296f fVar, ContentSetType contentSetType) {
            this.f8357c = fVar;
            this.f8356U = contentSetType;
        }

        /* renamed from: a */
        public final void accept(C6626c0 c0Var) {
            this.f8357c.f8340U.remove(C12907r.m40244a(c0Var.getProfileId(), this.f8356U));
        }
    }

    /* renamed from: com.bamtechmedia.dominguez.collections.caching.f$k */
    /* compiled from: ProfileBasedCollectionsCache.kt */
    static final class C3308k<T> implements Consumer<Throwable> {

        /* renamed from: c */
        public static final C3308k f8358c = new C3308k();

        C3308k() {
        }

        /* renamed from: a */
        public final void accept(Throwable th) {
        }
    }

    /* renamed from: com.bamtechmedia.dominguez.collections.caching.f$l */
    /* compiled from: ProfileBasedCollectionsCache.kt */
    static final class C3309l<T> implements Consumer<C6626c0> {

        /* renamed from: U */
        final /* synthetic */ C3676k f8359U;

        /* renamed from: V */
        final /* synthetic */ C3658a f8360V;

        /* renamed from: c */
        final /* synthetic */ C3296f f8361c;

        C3309l(C3296f fVar, C3676k kVar, C3658a aVar) {
            this.f8361c = fVar;
            this.f8359U = kVar;
            this.f8360V = aVar;
        }

        /* renamed from: a */
        public final void accept(C6626c0 c0Var) {
            this.f8361c.f8344c.put(C12907r.m40244a(c0Var.getProfileId(), this.f8359U), new Pair(DateTime.now(), this.f8360V));
            C2367a.m8888a(this.f8361c.f8343X, this.f8359U.mo13376Z(), false, 2, null);
        }
    }

    /* renamed from: com.bamtechmedia.dominguez.collections.caching.f$m */
    /* compiled from: ProfileBasedCollectionsCache.kt */
    static final class C3310m<T> implements Consumer<Throwable> {

        /* renamed from: c */
        public static final C3310m f8362c = new C3310m();

        C3310m() {
        }

        /* renamed from: a */
        public final void accept(Throwable th) {
        }
    }

    /* renamed from: com.bamtechmedia.dominguez.collections.caching.f$n */
    /* compiled from: ProfileBasedCollectionsCache.kt */
    static final class C3311n<T> implements Consumer<C3658a> {

        /* renamed from: U */
        final /* synthetic */ C3676k f8363U;

        /* renamed from: c */
        final /* synthetic */ C3296f f8364c;

        C3311n(C3296f fVar, C3676k kVar) {
            this.f8364c = fVar;
            this.f8363U = kVar;
        }

        /* renamed from: a */
        public final void accept(C3658a aVar) {
            this.f8364c.f8341V.remove(this.f8363U);
        }
    }

    /* renamed from: com.bamtechmedia.dominguez.collections.caching.f$o */
    /* compiled from: ProfileBasedCollectionsCache.kt */
    static final class C3312o<T> implements Consumer<C6626c0> {

        /* renamed from: U */
        final /* synthetic */ ContentSetType f8365U;

        /* renamed from: c */
        final /* synthetic */ C3296f f8366c;

        C3312o(C3296f fVar, ContentSetType contentSetType) {
            this.f8366c = fVar;
            this.f8365U = contentSetType;
        }

        /* renamed from: a */
        public final void accept(C6626c0 c0Var) {
            Map d = this.f8366c.f8340U;
            Pair a = C12907r.m40244a(c0Var.getProfileId(), this.f8365U);
            DateTime now = DateTime.now();
            Intrinsics.checkReturnedValueIsNotNull((Object) now, "DateTime.now()");
            d.put(a, now);
        }
    }

    /* renamed from: com.bamtechmedia.dominguez.collections.caching.f$p */
    /* compiled from: ProfileBasedCollectionsCache.kt */
    static final class C3313p<T> implements Consumer<Throwable> {

        /* renamed from: c */
        public static final C3313p f8367c = new C3313p();

        C3313p() {
        }

        /* renamed from: a */
        public final void accept(Throwable th) {
        }
    }

    public C3296f(C6667g1 g1Var, C3419l lVar, C2366i0 i0Var) {
        this.f8342W = g1Var;
        this.f8343X = i0Var;
        Object a = lVar.mo12596b().mo30079a((C11932e<T, ? extends R>) C11793e.m37930a(getViewModelScope()));
        String str = "this.`as`(AutoDispose.autoDisposable(provider))";
        Intrinsics.checkReturnedValueIsNotNull(a, str);
        ((C11842x) a).mo29927a(new C3297a(this), C3298b.f8346c);
        Object a2 = lVar.mo12597c().mo30079a((C11932e<T, ? extends R>) C11793e.m37930a(getViewModelScope()));
        Intrinsics.checkReturnedValueIsNotNull(a2, str);
        ((C11842x) a2).mo29927a(new C3299c(this), C3300d.f8348c);
        Object a3 = lVar.mo12593a().mo30079a((C11932e<T, ? extends R>) C11793e.m37930a(getViewModelScope()));
        Intrinsics.checkReturnedValueIsNotNull(a3, str);
        ((C11842x) a3).mo29927a(new C3301e(this), C3302f.f8350c);
    }

    /* access modifiers changed from: private */
    /* renamed from: f */
    public final List<Pair<String, C3676k>> m11389f(C3676k kVar) {
        Set keySet = this.f8344c.keySet();
        ArrayList<Pair> arrayList = new ArrayList<>();
        for (Object next : keySet) {
            if (Intrinsics.areEqual((Object) (C3676k) ((Pair) next).mo31016d(), (Object) kVar)) {
                arrayList.add(next);
            }
        }
        for (Pair pair : arrayList) {
            this.f8343X.mo11492a(((C3676k) pair.mo31016d()).mo13376Z());
            this.f8344c.remove(pair);
        }
        return arrayList;
    }

    /* access modifiers changed from: private */
    /* renamed from: y */
    public final void m11390y() {
        this.f8344c.clear();
        this.f8340U.clear();
        this.f8343X.mo11493e();
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public final List<Pair<String, ContentSetType>> m11386d(ContentSetType contentSetType) {
        Set keySet = this.f8340U.keySet();
        ArrayList<Pair> arrayList = new ArrayList<>();
        for (Object next : keySet) {
            if (((ContentSetType) ((Pair) next).mo31016d()) == contentSetType) {
                arrayList.add(next);
            }
        }
        for (Pair remove : arrayList) {
            this.f8340U.remove(remove);
        }
        return arrayList;
    }

    /* renamed from: b */
    public Maybe<C3658a> mo12344b(C3676k kVar) {
        Maybe<C3658a> c = this.f8342W.mo19381b().mo30221c((Function<? super T, ? extends MaybeSource<? extends R>>) new C3303g<Object,Object>(this, kVar)).mo30131f(C3305h.f8355c).mo30123c((Consumer<? super T>) new C3306i<Object>(kVar));
        Intrinsics.checkReturnedValueIsNotNull((Object) c, "profilesRepository.activ…g.value}' from cache\" } }");
        return c;
    }

    /* renamed from: c */
    public DateTime mo12346c(C3676k kVar) {
        Pair pair = (Pair) this.f8344c.get(C12907r.m40244a(((C6626c0) this.f8342W.mo19381b().mo30224c()).getProfileId(), kVar));
        if (pair != null) {
            return (DateTime) pair.mo31015c();
        }
        return null;
    }

    /* renamed from: e */
    public Single<C3658a> mo12349e(C3676k kVar) {
        return (Single) this.f8341V.get(kVar);
    }

    /* renamed from: e */
    public void mo12350e() {
        this.f8344c.clear();
        this.f8340U.clear();
        this.f8341V.clear();
    }

    /* renamed from: a */
    public void mo12342a(C3676k kVar, C3658a aVar) {
        Object a = this.f8342W.mo19381b().mo30215a((C11974s<T, ? extends R>) C11793e.m37930a(getViewModelScope()));
        Intrinsics.checkReturnedValueIsNotNull(a, "this.`as`(AutoDispose.autoDisposable(provider))");
        ((C11792d0) a).mo29920a(new C3309l(this, kVar, aVar), C3310m.f8362c);
    }

    /* renamed from: c */
    public DateTime mo12347c(ContentSetType contentSetType) {
        return (DateTime) this.f8340U.get(C12907r.m40244a(((C6626c0) this.f8342W.mo19381b().mo30224c()).getProfileId(), contentSetType));
    }

    /* renamed from: b */
    public void mo12345b(ContentSetType contentSetType) {
        Object a = this.f8342W.mo19381b().mo30215a((C11974s<T, ? extends R>) C11793e.m37930a(getViewModelScope()));
        Intrinsics.checkReturnedValueIsNotNull(a, "this.`as`(AutoDispose.autoDisposable(provider))");
        ((C11792d0) a).mo29920a(new C3307j(this, contentSetType), C3308k.f8358c);
    }

    /* renamed from: d */
    public String mo12348d(C3676k kVar) {
        return C2367a.m8888a(this.f8343X, kVar.mo13376Z(), false, 2, null);
    }

    /* renamed from: a */
    public void mo12343a(ContentSetType contentSetType) {
        Object a = this.f8342W.mo19381b().mo30215a((C11974s<T, ? extends R>) C11793e.m37930a(getViewModelScope()));
        Intrinsics.checkReturnedValueIsNotNull(a, "this.`as`(AutoDispose.autoDisposable(provider))");
        ((C11792d0) a).mo29920a(new C3312o(this, contentSetType), C3313p.f8367c);
    }

    /* renamed from: a */
    public Single<C3658a> mo12341a(C3676k kVar, Single<C3658a> single) {
        this.f8341V.put(kVar, single);
        Single<C3658a> d = single.mo30227d((Consumer<? super T>) new C3311n<Object>(this, kVar));
        Intrinsics.checkReturnedValueIsNotNull((Object) d, "subscription.doOnSuccess…questCache.remove(slug) }");
        return d;
    }
}
