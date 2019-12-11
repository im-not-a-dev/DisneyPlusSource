package com.bamtechmedia.dominguez.core.content.collections;

import com.bamtech.sdk4.content.GraphQlResponse;
import com.bamtech.sdk4.internal.sugar.MapExtensionsKt;
import com.bamtechmedia.dominguez.core.content.containers.Container;
import com.bamtechmedia.dominguez.core.content.search.C3724a;
import com.bamtechmedia.dominguez.core.content.sets.ContentSetType;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.C12907r;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p163g.p500m.p501a.C11780y;
import p520io.reactivex.Single;
import p520io.reactivex.functions.Function;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \u00122\u00020\u0001:\u0001\u0012B\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0002J$\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\b0\f2\u0006\u0010\r\u001a\u00020\u000e2\u000e\b\u0002\u0010\u000f\u001a\b\u0018\u00010\u0010j\u0002`\u0011R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0013"}, mo31007d2 = {"Lcom/bamtechmedia/dominguez/core/content/collections/CollectionsRemoteDataSource;", "", "searchApi", "Lcom/bamtechmedia/dominguez/core/content/search/DmgzSearchApi;", "requestConfig", "Lcom/bamtechmedia/dominguez/core/content/collections/CollectionRequestConfig;", "(Lcom/bamtechmedia/dominguez/core/content/search/DmgzSearchApi;Lcom/bamtechmedia/dominguez/core/content/collections/CollectionRequestConfig;)V", "filterUnsupportedSets", "Lcom/bamtechmedia/dominguez/core/content/collections/Collection;", "collection", "Lcom/bamtechmedia/dominguez/core/content/collections/StandardCollection;", "getCollectionBySlug", "Lio/reactivex/Single;", "collectionSlug", "Lcom/bamtechmedia/dominguez/core/content/collections/Slug;", "transactionId", "", "Lcom/bamtechmedia/dominguez/core/content/TransactionId;", "Companion", "coreContentApi_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* renamed from: com.bamtechmedia.dominguez.core.content.collections.f */
/* compiled from: CollectionsRemoteDataSource.kt */
public final class C3663f {

    /* renamed from: a */
    private final C3724a f9195a;

    /* renamed from: b */
    private final C3660c f9196b;

    /* renamed from: com.bamtechmedia.dominguez.core.content.collections.f$a */
    /* compiled from: CollectionsRemoteDataSource.kt */
    public static final class C3664a {
        private C3664a() {
        }

        public /* synthetic */ C3664a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: com.bamtechmedia.dominguez.core.content.collections.f$b */
    /* compiled from: CollectionsRemoteDataSource.kt */
    static final class C3665b<T, R> implements Function<T, R> {

        /* renamed from: U */
        final /* synthetic */ String f9197U;

        /* renamed from: c */
        final /* synthetic */ C3663f f9198c;

        C3665b(C3663f fVar, String str) {
            this.f9198c = fVar;
            this.f9197U = str;
        }

        /* renamed from: a */
        public final C3658a apply(GraphQlResponse<? extends Map<String, StandardCollection>> graphQlResponse) {
            C3663f fVar = this.f9198c;
            Map map = (Map) graphQlResponse.getData();
            StandardCollection standardCollection = map != null ? (StandardCollection) map.get(this.f9197U) : null;
            if (standardCollection != null) {
                return fVar.m12490a(standardCollection);
            }
            throw new IllegalArgumentException("Required value was null.".toString());
        }
    }

    static {
        new C3664a(null);
    }

    public C3663f(C3724a aVar, C3660c cVar) {
        this.f9195a = aVar;
        this.f9196b = cVar;
    }

    /* renamed from: a */
    public static /* synthetic */ Single m12492a(C3663f fVar, C3676k kVar, String str, int i, Object obj) {
        if ((i & 2) != 0) {
            str = null;
        }
        return fVar.mo13365a(kVar, str);
    }

    /* renamed from: a */
    public final Single<C3658a> mo13365a(C3676k kVar, String str) {
        String b = this.f9196b.mo13361b(kVar);
        C3724a aVar = this.f9195a;
        ParameterizedType a = C11780y.m37894a((Type) Map.class, String.class, StandardCollection.class);
        Intrinsics.checkReturnedValueIsNotNull((Object) a, "Types.newParameterizedTy…rdCollection::class.java)");
        StringBuilder sb = new StringBuilder();
        sb.append("core/");
        sb.append(b);
        Single<C3658a> g = aVar.mo13577a(a, sb.toString(), MapExtensionsKt.plusIfNotNull(MapExtensionsKt.plusIfNotNull(C13173j0.m40356a(C12907r.m40244a("slug", kVar.mo13377a0()), C12907r.m40244a("contentClass", kVar.mo13375Y())), C12907r.m40244a("curatedSetsFilled", this.f9196b.mo13362c(kVar))), C12907r.m40244a("text_field", this.f9196b.mo13360a(kVar))), str).mo30233g(new C3665b(this, b));
        Intrinsics.checkReturnedValueIsNotNull((Object) g, "searchApi.search<Map<Str…l(it.data?.get(query))) }");
        return g;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final C3658a m12490a(StandardCollection standardCollection) {
        boolean z;
        boolean z2;
        List O = standardCollection.mo13343O();
        if (!(O instanceof Collection) || !O.isEmpty()) {
            Iterator it = O.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                if (((Container) it.next()).mo13400a().mo13604b() == ContentSetType.UnsupportedSet) {
                    z2 = true;
                    continue;
                } else {
                    z2 = false;
                    continue;
                }
                if (z2) {
                    z = false;
                    break;
                }
            }
        }
        z = true;
        if (z) {
            return standardCollection;
        }
        List O2 = standardCollection.mo13343O();
        ArrayList arrayList = new ArrayList();
        for (Object next : O2) {
            if (((Container) next).mo13400a().mo13604b() != ContentSetType.UnsupportedSet) {
                arrayList.add(next);
            }
        }
        return StandardCollection.m12444a(standardCollection, null, null, null, arrayList, null, null, 55, null);
    }
}
