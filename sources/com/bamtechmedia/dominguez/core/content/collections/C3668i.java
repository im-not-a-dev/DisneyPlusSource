package com.bamtechmedia.dominguez.core.content.collections;

import com.bamtechmedia.dominguez.collections.C3330h;
import com.bamtechmedia.dominguez.core.content.containers.Container;
import com.bamtechmedia.dominguez.core.content.sets.AvailabilityHint;
import com.bamtechmedia.dominguez.core.content.sets.C3762a;
import com.bamtechmedia.dominguez.core.content.sets.C3765c;
import com.bamtechmedia.dominguez.core.content.sets.C3765c.C3767b;
import com.bamtechmedia.dominguez.core.content.sets.C3778h;
import com.bamtechmedia.dominguez.core.content.sets.ContentSet;
import com.bamtechmedia.dominguez.core.content.sets.ContentSetType;
import com.bamtechmedia.dominguez.core.content.sets.ReferenceSet;
import com.bamtechmedia.dominguez.core.utils.C5855o;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;
import kotlin.C13145v;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p520io.reactivex.Completable;
import p520io.reactivex.Single;
import p520io.reactivex.SingleSource;
import p520io.reactivex.functions.Consumer;
import p520io.reactivex.functions.Function;
import p520io.reactivex.p525e0.C11934b;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u0000 \u001c2\u00020\u0001:\u0001\u001cB/\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b¢\u0006\u0002\u0010\fJ\u0016\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e2\u0006\u0010\u0010\u001a\u00020\u0011H\u0016J\u0010\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0011H\u0016J,\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e2\u0006\u0010\u0016\u001a\u00020\u000f2\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00190\u00182\u0006\u0010\u001a\u001a\u00020\u001bH\u0002R\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0004¢\u0006\u0002\n\u0000¨\u0006\u001d"}, mo31007d2 = {"Lcom/bamtechmedia/dominguez/core/content/collections/CollectionsRepositoryImpl;", "Lcom/bamtechmedia/dominguez/core/content/collections/CollectionsRepository;", "collectionsRemoteDataSource", "Lcom/bamtechmedia/dominguez/core/content/collections/CollectionsRemoteDataSource;", "contentSetDataSource", "Lcom/bamtechmedia/dominguez/core/content/sets/ContentSetDataSource;", "cache", "Lcom/bamtechmedia/dominguez/collections/CollectionCache;", "setAvailabilityHint", "Lcom/bamtechmedia/dominguez/core/content/sets/ContentSetAvailabilityHint;", "requestConfig", "Lcom/bamtechmedia/dominguez/core/content/collections/CollectionRequestConfig;", "(Lcom/bamtechmedia/dominguez/core/content/collections/CollectionsRemoteDataSource;Lcom/bamtechmedia/dominguez/core/content/sets/ContentSetDataSource;Lcom/bamtechmedia/dominguez/collections/CollectionCache;Lcom/bamtechmedia/dominguez/core/content/sets/ContentSetAvailabilityHint;Lcom/bamtechmedia/dominguez/core/content/collections/CollectionRequestConfig;)V", "getCollectionBySlug", "Lio/reactivex/Single;", "Lcom/bamtechmedia/dominguez/core/content/collections/Collection;", "collectionSlug", "Lcom/bamtechmedia/dominguez/core/content/collections/Slug;", "prefetchBySlug", "Lio/reactivex/Completable;", "slug", "resolveReferenceSets", "collection", "resolveContentSetTypes", "", "Lcom/bamtechmedia/dominguez/core/content/sets/ContentSetType;", "transactionId", "", "Companion", "collections_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* renamed from: com.bamtechmedia.dominguez.core.content.collections.i */
/* compiled from: CollectionsRepositoryImpl.kt */
public final class C3668i implements C3667h {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final C3663f f9201a;

    /* renamed from: b */
    private final C3765c f9202b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final C3330h f9203c;

    /* renamed from: d */
    private final C3762a f9204d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public final C3660c f9205e;

    /* renamed from: com.bamtechmedia.dominguez.core.content.collections.i$a */
    /* compiled from: CollectionsRepositoryImpl.kt */
    public static final class C3669a {
        private C3669a() {
        }

        public /* synthetic */ C3669a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u0010\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u00020\u0001H\n¢\u0006\u0002\b\u0004"}, mo31007d2 = {"<anonymous>", "Lio/reactivex/Single;", "Lcom/bamtechmedia/dominguez/core/content/collections/Collection;", "kotlin.jvm.PlatformType", "call"}, mo31008k = 3, mo31009mv = {1, 1, 15})
    /* renamed from: com.bamtechmedia.dominguez.core.content.collections.i$b */
    /* compiled from: CollectionsRepositoryImpl.kt */
    static final class C3670b<V> implements Callable<SingleSource<? extends T>> {

        /* renamed from: U */
        final /* synthetic */ C3676k f9206U;

        /* renamed from: c */
        final /* synthetic */ C3668i f9207c;

        /* renamed from: com.bamtechmedia.dominguez.core.content.collections.i$b$a */
        /* compiled from: CollectionsRepositoryImpl.kt */
        static final class C3671a<T> implements Consumer<C3658a> {

            /* renamed from: c */
            final /* synthetic */ C3670b f9208c;

            C3671a(C3670b bVar) {
                this.f9208c = bVar;
            }

            /* renamed from: a */
            public final void accept(C3658a aVar) {
                C5855o oVar = C5855o.f13640a;
                if (this.f9208c.f9206U.mo13374X()) {
                    C3330h a = this.f9208c.f9207c.f9203c;
                    C3676k kVar = this.f9208c.f9206U;
                    Intrinsics.checkReturnedValueIsNotNull((Object) aVar, "it");
                    a.mo12342a(kVar, aVar);
                }
            }
        }

        C3670b(C3668i iVar, C3676k kVar) {
            this.f9207c = iVar;
            this.f9206U = kVar;
        }

        public final Single<C3658a> call() {
            return this.f9207c.f9201a.mo13365a(this.f9206U, this.f9207c.f9203c.mo12348d(this.f9206U)).mo30227d((Consumer<? super T>) new C3671a<Object>(this));
        }
    }

    /* renamed from: com.bamtechmedia.dominguez.core.content.collections.i$c */
    /* compiled from: CollectionsRepositoryImpl.kt */
    static final class C3672c<T, R> implements Function<T, SingleSource<? extends R>> {

        /* renamed from: U */
        final /* synthetic */ C3676k f9209U;

        /* renamed from: c */
        final /* synthetic */ C3668i f9210c;

        C3672c(C3668i iVar, C3676k kVar) {
            this.f9210c = iVar;
            this.f9209U = kVar;
        }

        /* renamed from: a */
        public final Single<C3658a> apply(C3658a aVar) {
            C3668i iVar = this.f9210c;
            return iVar.m12499a(aVar, iVar.f9205e.mo13363d(this.f9209U), this.f9210c.f9203c.mo12348d(this.f9209U));
        }
    }

    /* renamed from: com.bamtechmedia.dominguez.core.content.collections.i$d */
    /* compiled from: CollectionsRepositoryImpl.kt */
    static final class C3673d<T> implements Consumer<C3658a> {
        C3673d(C3676k kVar) {
        }

        /* renamed from: a */
        public final void accept(C3658a aVar) {
            C5855o oVar = C5855o.f13640a;
        }
    }

    /* renamed from: com.bamtechmedia.dominguez.core.content.collections.i$e */
    /* compiled from: CollectionsRepositoryImpl.kt */
    static final class C3674e<T, R> implements Function<Object[], R> {

        /* renamed from: U */
        final /* synthetic */ C3658a f9211U;

        /* renamed from: c */
        final /* synthetic */ C3668i f9212c;

        C3674e(C3668i iVar, C3658a aVar) {
            this.f9212c = iVar;
            this.f9211U = aVar;
        }

        /* renamed from: a */
        public final C3658a apply(Object[] objArr) {
            ArrayList<ContentSet> arrayList = new ArrayList<>();
            for (Object obj : objArr) {
                if (obj instanceof ContentSet) {
                    arrayList.add(obj);
                }
            }
            ArrayList arrayList2 = new ArrayList(C13187p.m40525a((Iterable) arrayList, 10));
            for (ContentSet b : arrayList) {
                this.f9212c.f9203c.mo12343a(b.mo13604b());
                arrayList2.add(C13145v.f29587a);
            }
            return this.f9211U.mo13354a(C13199w.m40609t(arrayList));
        }
    }

    static {
        new C3669a(null);
    }

    public C3668i(C3663f fVar, C3765c cVar, C3330h hVar, C3762a aVar, C3660c cVar2) {
        this.f9201a = fVar;
        this.f9202b = cVar;
        this.f9203c = hVar;
        this.f9204d = aVar;
        this.f9205e = cVar2;
    }

    /* renamed from: b */
    public Completable mo13368b(C3676k kVar) {
        if (!this.f9205e.mo13364e(kVar)) {
            Completable h = Completable.m38169h();
            Intrinsics.checkReturnedValueIsNotNull((Object) h, "Completable.complete()");
            return h;
        }
        Completable f = mo13367a(kVar).mo30236i().mo30194g().mo30683c(0).mo30186d().mo30228e().mo30033a(3, TimeUnit.SECONDS, C11934b.m38500b()).mo30055f();
        Intrinsics.checkReturnedValueIsNotNull((Object) f, "getCollectionBySlug(slug…       .onErrorComplete()");
        return f;
    }

    /* renamed from: a */
    public Single<C3658a> mo13367a(C3676k kVar) {
        Single<C3658a> e = this.f9203c.mo12349e(kVar);
        if (e != null) {
            return e;
        }
        Single d = this.f9203c.mo12344b(kVar).mo30109a((SingleSource<? extends T>) Single.m38396a((Callable<? extends SingleSource<? extends T>>) new C3670b<Object>(this, kVar))).mo30208a((Function<? super T, ? extends SingleSource<? extends R>>) new C3672c<Object,Object>(this, kVar)).mo30227d((Consumer<? super T>) new C3673d<Object>(kVar));
        Intrinsics.checkReturnedValueIsNotNull((Object) d, "cache.get(collectionSlug… with resolved sets'\" } }");
        return this.f9203c.mo12341a(kVar, d);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final Single<C3658a> m12499a(C3658a aVar, List<? extends ContentSetType> list, String str) {
        List<Container> O = aVar.mo13343O();
        ArrayList arrayList = new ArrayList(C13187p.m40525a((Iterable) O, 10));
        for (Container a : O) {
            arrayList.add(a.mo13400a());
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object next : arrayList) {
            if (next instanceof ReferenceSet) {
                arrayList2.add(next);
            }
        }
        ArrayList<ReferenceSet> arrayList3 = new ArrayList<>();
        for (Object next2 : arrayList2) {
            ReferenceSet referenceSet = (ReferenceSet) next2;
            if (list.contains(referenceSet.mo13604b()) && this.f9204d.mo13656a(referenceSet) == AvailabilityHint.UNKNOWN) {
                arrayList3.add(next2);
            }
        }
        if (arrayList3.isEmpty()) {
            Single<C3658a> b = Single.m38399b(aVar);
            Intrinsics.checkReturnedValueIsNotNull((Object) b, "Single.just(collection)");
            return b;
        }
        C5855o oVar = C5855o.f13640a;
        ArrayList arrayList4 = new ArrayList(C13187p.m40525a((Iterable) arrayList3, 10));
        for (ReferenceSet referenceSet2 : arrayList3) {
            Single a2 = C3767b.m12769a(this.f9202b, referenceSet2.mo13604b(), referenceSet2.mo13608e(), str, false, 8, (Object) null).mo30212a(C3778h.class);
            Intrinsics.checkReturnedValueIsNotNull((Object) a2, "cast(R::class.java)");
            arrayList4.add(a2.mo30213a(referenceSet2));
        }
        Single<C3658a> a3 = Single.m38394a((Iterable<? extends SingleSource<? extends T>>) arrayList4, (Function<? super Object[], ? extends R>) new C3674e<Object,Object>(this, aVar));
        Intrinsics.checkReturnedValueIsNotNull((Object) a3, "Single.zip<DmcSet, Colle…)\n            }\n        }");
        return a3;
    }
}
