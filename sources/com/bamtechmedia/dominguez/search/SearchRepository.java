package com.bamtechmedia.dominguez.search;

import com.bamtech.sdk4.content.GraphQlResponse;
import com.bamtechmedia.dominguez.core.content.C3688j;
import com.bamtechmedia.dominguez.core.content.assets.C3623a;
import com.bamtechmedia.dominguez.core.content.assets.C3626b;
import com.bamtechmedia.dominguez.core.content.assets.C3632f;
import com.bamtechmedia.dominguez.core.content.assets.Image;
import com.bamtechmedia.dominguez.core.content.paging.C3700c;
import com.bamtechmedia.dominguez.core.content.paging.DefaultPagingMetaData;
import com.bamtechmedia.dominguez.core.content.search.C3724a;
import com.bamtechmedia.dominguez.core.utils.C5884x;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.function.UnaryOperator;
import kotlin.C12907r;
import kotlin.Metadata;
import kotlin.jvm.internal.C12871f;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.p589f0.C12872a;
import p163g.p500m.p501a.C11724g;
import p163g.p500m.p501a.C11733i;
import p520io.reactivex.Maybe;
import p520io.reactivex.Single;
import p520io.reactivex.disposables.Disposable;
import p520io.reactivex.functions.C11945a;
import p520io.reactivex.functions.Consumer;
import p520io.reactivex.functions.Function;
import p686n.p687a.Timber;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 \u001e2\u00020\u0001:\u0005\u001e\u001f !\"B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\u0010\u001a\u00020\u0006H\u0002J<\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00130\u00122\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u0017\u001a\u00020\u00182\f\u0010\u0019\u001a\b\u0018\u00010\u0015j\u0002`\u001a2\b\b\u0002\u0010\u001b\u001a\u00020\u0018J\"\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00130\u001d2\u0006\u0010\u0014\u001a\u00020\u00152\f\u0010\u0019\u001a\b\u0018\u00010\u0015j\u0002`\u001aR\u000e\u0010\u0005\u001a\u00020\u0006X\u000e¢\u0006\u0002\n\u0000R$\u0010\u0007\u001a\u00020\u00068\u0000@\u0000X\u000e¢\u0006\u0014\n\u0000\u0012\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u000e¢\u0006\u0002\n\u0000¨\u0006#"}, mo31007d2 = {"Lcom/bamtechmedia/dominguez/search/SearchRepository;", "", "searchApi", "Lcom/bamtechmedia/dominguez/core/content/search/DmgzSearchApi;", "(Lcom/bamtechmedia/dominguez/core/content/search/DmgzSearchApi;)V", "loadingInitialSearch", "", "loadingNextPage", "loadingNextPage$annotations", "()V", "getLoadingNextPage$search_release", "()Z", "setLoadingNextPage$search_release", "(Z)V", "searchDisposable", "Lio/reactivex/disposables/Disposable;", "isLoadingSearchData", "loadNextPage", "Lio/reactivex/Maybe;", "Lcom/bamtechmedia/dominguez/search/SearchRepository$SearchResults;", "queryText", "", "set", "positionInSet", "", "transactionId", "Lcom/bamtechmedia/dominguez/core/content/TransactionId;", "offsetFromEndToStartLoading", "searchQuery", "Lio/reactivex/Single;", "Companion", "DmcAssetWrapper", "DmcHits", "SearchResponse", "SearchResults", "search_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* compiled from: SearchRepository.kt */
public final class SearchRepository {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public Disposable f17096a;

    /* renamed from: b */
    private boolean f17097b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public boolean f17098c;

    /* renamed from: d */
    private final C3724a f17099d;

    @C11733i(generateAdapter = true)
    @Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\b\u0018\u00002\u00020\u0001B\u000f\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\u0011\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015HÖ\u0003J\u001b\u0010\u0016\u001a\u0004\u0018\u00010\t2\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001aH\u0001J\u001b\u0010\u0016\u001a\u0004\u0018\u00010\t2\u0006\u0010\u0017\u001a\u00020\r2\u0006\u0010\u0019\u001a\u00020\u001aH\u0001J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001J\u0011\u0010\u001d\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0001H\u0001J\t\u0010\u001e\u001a\u00020\rHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u001a\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\bX\u0005¢\u0006\u0006\u001a\u0004\b\n\u0010\u000bR\u0012\u0010\f\u001a\u00020\rX\u0005¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001f"}, mo31007d2 = {"Lcom/bamtechmedia/dominguez/search/SearchRepository$DmcAssetWrapper;", "Lcom/bamtechmedia/dominguez/core/content/assets/Asset;", "hit", "Lcom/bamtechmedia/dominguez/core/content/assets/DmcAsset;", "(Lcom/bamtechmedia/dominguez/core/content/assets/DmcAsset;)V", "getHit", "()Lcom/bamtechmedia/dominguez/core/content/assets/DmcAsset;", "images", "", "Lcom/bamtechmedia/dominguez/core/content/assets/Image;", "getImages", "()Ljava/util/List;", "title", "", "getTitle", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "getPhoto", "purpose", "Lcom/bamtechmedia/dominguez/core/content/ImagePurpose;", "preferredAspectRatio", "Lcom/bamtechmedia/dominguez/core/content/assets/AspectRatio;", "hashCode", "", "isSameAs", "toString", "search_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
    /* compiled from: SearchRepository.kt */
    public static final class DmcAssetWrapper implements C3626b {

        /* renamed from: c */
        private final C3632f f17100c;

        public DmcAssetWrapper(@C11724g(name = "hit") C3632f fVar) {
            this.f17100c = fVar;
        }

        /* renamed from: H */
        public final C3632f mo20863H() {
            return this.f17100c;
        }

        /* renamed from: a */
        public Image mo12845a(C3688j jVar, C3623a aVar) {
            return this.f17100c.mo12845a(jVar, aVar);
        }

        /* renamed from: a */
        public Image mo12846a(String str, C3623a aVar) {
            return this.f17100c.mo12846a(str, aVar);
        }

        /* renamed from: a */
        public List<Image> mo12847a() {
            return this.f17100c.mo12847a();
        }

        /* renamed from: a */
        public boolean mo12848a(C3626b bVar) {
            return this.f17100c.mo12848a(bVar);
        }

        public final DmcAssetWrapper copy(@C11724g(name = "hit") C3632f fVar) {
            return new DmcAssetWrapper(fVar);
        }

        /* JADX WARNING: Code restructure failed: missing block: B:4:0x0010, code lost:
            if (kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r1.f17100c, (java.lang.Object) ((com.bamtechmedia.dominguez.search.SearchRepository.DmcAssetWrapper) r2).f17100c) != false) goto L_0x0015;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean equals(java.lang.Object r2) {
            /*
                r1 = this;
                if (r1 == r2) goto L_0x0015
                boolean r0 = r2 instanceof com.bamtechmedia.dominguez.search.SearchRepository.DmcAssetWrapper
                if (r0 == 0) goto L_0x0013
                com.bamtechmedia.dominguez.search.SearchRepository$DmcAssetWrapper r2 = (com.bamtechmedia.dominguez.search.SearchRepository.DmcAssetWrapper) r2
                com.bamtechmedia.dominguez.core.content.assets.f r0 = r1.f17100c
                com.bamtechmedia.dominguez.core.content.assets.f r2 = r2.f17100c
                boolean r2 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r2)
                if (r2 == 0) goto L_0x0013
                goto L_0x0015
            L_0x0013:
                r2 = 0
                return r2
            L_0x0015:
                r2 = 1
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bamtechmedia.dominguez.search.SearchRepository.DmcAssetWrapper.equals(java.lang.Object):boolean");
        }

        public String getTitle() {
            return this.f17100c.getTitle();
        }

        public int hashCode() {
            C3632f fVar = this.f17100c;
            if (fVar != null) {
                return fVar.hashCode();
            }
            return 0;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("DmcAssetWrapper(hit=");
            sb.append(this.f17100c);
            sb.append(")");
            return sb.toString();
        }
    }

    @C11733i(generateAdapter = true)
    @Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u001e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0010(\n\u0002\b\u0002\n\u0002\u0010*\n\u0002\b\u0005\b\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003B5\u0012\u000e\b\u0001\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00050\u0001\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001¢\u0006\u0002\u0010\u000bJ\u000f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00050\u0001HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0007HÆ\u0003J\t\u0010\u0019\u001a\u00020\tHÆ\u0003J\u000f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001HÆ\u0003J\u0011\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u0002H\u0003J\u0017\u0010\u001e\u001a\u00020\u001c2\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00020 H\u0001J=\u0010!\u001a\u00020\u00002\u000e\b\u0003\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00050\u00012\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001HÆ\u0001J\u0013\u0010\"\u001a\u00020\u001c2\b\u0010#\u001a\u0004\u0018\u00010$HÖ\u0003J\u0011\u0010%\u001a\u00020\u00022\u0006\u0010&\u001a\u00020\u0014H\u0003J\t\u0010'\u001a\u00020\u0014HÖ\u0001J\u0011\u0010(\u001a\u00020\u00142\u0006\u0010\u001d\u001a\u00020\u0002H\u0001J\t\u0010)\u001a\u00020\u001cH\u0001J\u000f\u0010*\u001a\b\u0012\u0004\u0012\u00020\u00020+H\u0003J\u0011\u0010,\u001a\u00020\u00142\u0006\u0010\u001d\u001a\u00020\u0002H\u0001J\u000f\u0010-\u001a\b\u0012\u0004\u0012\u00020\u00020.H\u0001J\u0017\u0010-\u001a\b\u0012\u0004\u0012\u00020\u00020.2\u0006\u0010&\u001a\u00020\u0014H\u0001J\u001f\u0010/\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u00100\u001a\u00020\u00142\u0006\u00101\u001a\u00020\u0014H\u0001J\t\u00102\u001a\u00020\u0007HÖ\u0001R\u0017\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00050\u0001¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0014\u0010\b\u001a\u00020\tX\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0012\u0010\u0013\u001a\u00020\u0014X\u0005¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016¨\u00063"}, mo31007d2 = {"Lcom/bamtechmedia/dominguez/search/SearchRepository$DmcHits;", "", "Lcom/bamtechmedia/dominguez/core/content/assets/Asset;", "Lcom/bamtechmedia/dominguez/search/SearchRepository$SearchResults;", "hits", "Lcom/bamtechmedia/dominguez/search/SearchRepository$DmcAssetWrapper;", "resultsType", "", "meta", "Lcom/bamtechmedia/dominguez/core/content/paging/DefaultPagingMetaData;", "assets", "(Ljava/util/List;Ljava/lang/String;Lcom/bamtechmedia/dominguez/core/content/paging/DefaultPagingMetaData;Ljava/util/List;)V", "getAssets", "()Ljava/util/List;", "getHits", "getMeta", "()Lcom/bamtechmedia/dominguez/core/content/paging/DefaultPagingMetaData;", "getResultsType", "()Ljava/lang/String;", "size", "", "getSize", "()I", "component1", "component2", "component3", "component4", "contains", "", "element", "containsAll", "elements", "", "copy", "equals", "other", "", "get", "index", "hashCode", "indexOf", "isEmpty", "iterator", "", "lastIndexOf", "listIterator", "", "subList", "fromIndex", "toIndex", "toString", "search_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
    /* compiled from: SearchRepository.kt */
    public static final class DmcHits implements List<C3626b>, C7952b, C12872a {

        /* renamed from: U */
        private final String f17101U;

        /* renamed from: V */
        private final DefaultPagingMetaData f17102V;

        /* renamed from: W */
        private final List<C3626b> f17103W;

        /* renamed from: c */
        private final List<DmcAssetWrapper> f17104c;

        public DmcHits(@C11724g(name = "hits") List<DmcAssetWrapper> list, String str, DefaultPagingMetaData defaultPagingMetaData, List<? extends C3626b> list2) {
            this.f17104c = list;
            this.f17101U = str;
            this.f17102V = defaultPagingMetaData;
            this.f17103W = list2;
        }

        /* JADX WARNING: Incorrect type for immutable var: ssa=java.util.List, code=java.util.List<com.bamtechmedia.dominguez.core.content.assets.b>, for r4v0, types: [java.util.List] */
        /* JADX WARNING: Incorrect type for immutable var: ssa=java.util.List, code=java.util.List<com.bamtechmedia.dominguez.search.SearchRepository$DmcAssetWrapper>, for r1v0, types: [java.util.List] */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public static /* synthetic */ com.bamtechmedia.dominguez.search.SearchRepository.DmcHits m23184a(com.bamtechmedia.dominguez.search.SearchRepository.DmcHits r0, java.util.List<com.bamtechmedia.dominguez.search.SearchRepository.DmcAssetWrapper> r1, java.lang.String r2, com.bamtechmedia.dominguez.core.content.paging.DefaultPagingMetaData r3, java.util.List<com.bamtechmedia.dominguez.core.content.assets.C3626b> r4, int r5, java.lang.Object r6) {
            /*
                r6 = r5 & 1
                if (r6 == 0) goto L_0x0006
                java.util.List<com.bamtechmedia.dominguez.search.SearchRepository$DmcAssetWrapper> r1 = r0.f17104c
            L_0x0006:
                r6 = r5 & 2
                if (r6 == 0) goto L_0x000c
                java.lang.String r2 = r0.f17101U
            L_0x000c:
                r6 = r5 & 4
                if (r6 == 0) goto L_0x0014
                com.bamtechmedia.dominguez.core.content.paging.DefaultPagingMetaData r3 = r0.m23193f0()
            L_0x0014:
                r5 = r5 & 8
                if (r5 == 0) goto L_0x001a
                java.util.List<com.bamtechmedia.dominguez.core.content.assets.b> r4 = r0.f17103W
            L_0x001a:
                com.bamtechmedia.dominguez.search.SearchRepository$DmcHits r0 = r0.copy(r1, r2, r3, r4)
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bamtechmedia.dominguez.search.SearchRepository.DmcHits.m23184a(com.bamtechmedia.dominguez.search.SearchRepository$DmcHits, java.util.List, java.lang.String, com.bamtechmedia.dominguez.core.content.paging.DefaultPagingMetaData, java.util.List, int, java.lang.Object):com.bamtechmedia.dominguez.search.SearchRepository$DmcHits");
        }

        /* renamed from: a */
        public boolean mo20868a(C3626b bVar) {
            return this.f17103W.contains(bVar);
        }

        public /* synthetic */ void add(int i, Object obj) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        public /* synthetic */ boolean add(Object obj) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        public boolean addAll(int i, Collection<? extends C3626b> collection) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        public boolean addAll(Collection<? extends C3626b> collection) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        /* renamed from: b */
        public int mo20873b(C3626b bVar) {
            return this.f17103W.indexOf(bVar);
        }

        /* renamed from: b */
        public final List<C3626b> mo20874b() {
            return this.f17103W;
        }

        /* renamed from: c */
        public int mo20875c(C3626b bVar) {
            return this.f17103W.lastIndexOf(bVar);
        }

        /* renamed from: c */
        public final List<DmcAssetWrapper> mo20876c() {
            return this.f17104c;
        }

        public void clear() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        public final /* bridge */ boolean contains(Object obj) {
            if (obj instanceof C3626b) {
                return mo20868a((C3626b) obj);
            }
            return false;
        }

        public boolean containsAll(Collection<? extends Object> collection) {
            return this.f17103W.containsAll(collection);
        }

        public final DmcHits copy(@C11724g(name = "hits") List<DmcAssetWrapper> list, String str, DefaultPagingMetaData defaultPagingMetaData, List<? extends C3626b> list2) {
            return new DmcHits(list, str, defaultPagingMetaData, list2);
        }

        /* renamed from: d */
        public final String mo20881d() {
            return this.f17101U;
        }

        /* renamed from: e */
        public int mo20882e() {
            return this.f17103W.size();
        }

        /* JADX WARNING: Code restructure failed: missing block: B:10:0x0032, code lost:
            if (kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r2.f17103W, (java.lang.Object) r3.f17103W) != false) goto L_0x0037;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean equals(java.lang.Object r3) {
            /*
                r2 = this;
                if (r2 == r3) goto L_0x0037
                boolean r0 = r3 instanceof com.bamtechmedia.dominguez.search.SearchRepository.DmcHits
                if (r0 == 0) goto L_0x0035
                com.bamtechmedia.dominguez.search.SearchRepository$DmcHits r3 = (com.bamtechmedia.dominguez.search.SearchRepository.DmcHits) r3
                java.util.List<com.bamtechmedia.dominguez.search.SearchRepository$DmcAssetWrapper> r0 = r2.f17104c
                java.util.List<com.bamtechmedia.dominguez.search.SearchRepository$DmcAssetWrapper> r1 = r3.f17104c
                boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r1)
                if (r0 == 0) goto L_0x0035
                java.lang.String r0 = r2.f17101U
                java.lang.String r1 = r3.f17101U
                boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r1)
                if (r0 == 0) goto L_0x0035
                com.bamtechmedia.dominguez.core.content.paging.DefaultPagingMetaData r0 = r2.m23193f0()
                com.bamtechmedia.dominguez.core.content.paging.DefaultPagingMetaData r1 = r3.m23193f0()
                boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r1)
                if (r0 == 0) goto L_0x0035
                java.util.List<com.bamtechmedia.dominguez.core.content.assets.b> r0 = r2.f17103W
                java.util.List<com.bamtechmedia.dominguez.core.content.assets.b> r3 = r3.f17103W
                boolean r3 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r3)
                if (r3 == 0) goto L_0x0035
                goto L_0x0037
            L_0x0035:
                r3 = 0
                return r3
            L_0x0037:
                r3 = 1
                return r3
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bamtechmedia.dominguez.search.SearchRepository.DmcHits.equals(java.lang.Object):boolean");
        }

        public C3626b get(int i) {
            Object obj = this.f17103W.get(i);
            Intrinsics.checkReturnedValueIsNotNull(obj, "get(...)");
            return (C3626b) obj;
        }

        public int hashCode() {
            List<DmcAssetWrapper> list = this.f17104c;
            int i = 0;
            int hashCode = (list != null ? list.hashCode() : 0) * 31;
            String str = this.f17101U;
            int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
            DefaultPagingMetaData f0 = m23193f0();
            int hashCode3 = (hashCode2 + (f0 != null ? f0.hashCode() : 0)) * 31;
            List<C3626b> list2 = this.f17103W;
            if (list2 != null) {
                i = list2.hashCode();
            }
            return hashCode3 + i;
        }

        public final /* bridge */ int indexOf(Object obj) {
            if (obj instanceof C3626b) {
                return mo20873b((C3626b) obj);
            }
            return -1;
        }

        public boolean isEmpty() {
            return this.f17103W.isEmpty();
        }

        public Iterator<C3626b> iterator() {
            return this.f17103W.iterator();
        }

        public final /* bridge */ int lastIndexOf(Object obj) {
            if (obj instanceof C3626b) {
                return mo20875c((C3626b) obj);
            }
            return -1;
        }

        public ListIterator<C3626b> listIterator() {
            return this.f17103W.listIterator();
        }

        public ListIterator<C3626b> listIterator(int i) {
            return this.f17103W.listIterator(i);
        }

        public /* synthetic */ Object remove(int i) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        public boolean remove(Object obj) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        public boolean removeAll(Collection<? extends Object> collection) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        public void replaceAll(UnaryOperator<C3626b> unaryOperator) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        public boolean retainAll(Collection<? extends Object> collection) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        public /* synthetic */ Object set(int i, Object obj) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        public final /* bridge */ int size() {
            return mo20882e();
        }

        public void sort(Comparator<? super C3626b> comparator) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        public List<C3626b> subList(int i, int i2) {
            return this.f17103W.subList(i, i2);
        }

        public Object[] toArray() {
            return C12871f.m40215a(this);
        }

        public <T> T[] toArray(T[] tArr) {
            return C12871f.m40216a(this, tArr);
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("DmcHits(hits=");
            sb.append(this.f17104c);
            sb.append(", resultsType=");
            sb.append(this.f17101U);
            sb.append(", meta=");
            sb.append(m23193f0());
            sb.append(", assets=");
            sb.append(this.f17103W);
            sb.append(")");
            return sb.toString();
        }

        /* JADX WARNING: Incorrect type for immutable var: ssa=java.util.List, code=java.util.List<com.bamtechmedia.dominguez.search.SearchRepository$DmcAssetWrapper>, for r1v0, types: [java.util.List<com.bamtechmedia.dominguez.search.SearchRepository$DmcAssetWrapper>, java.util.List, java.lang.Iterable] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public /* synthetic */ DmcHits(java.util.List<com.bamtechmedia.dominguez.search.SearchRepository.DmcAssetWrapper> r1, java.lang.String r2, com.bamtechmedia.dominguez.core.content.paging.DefaultPagingMetaData r3, java.util.List r4, int r5, kotlin.jvm.internal.DefaultConstructorMarker r6) {
            /*
                r0 = this;
                r5 = r5 & 8
                if (r5 == 0) goto L_0x0033
                java.lang.String r4 = "real"
                boolean r4 = kotlin.jvm.internal.Intrinsics.areEqual(r2, r4)
                if (r4 == 0) goto L_0x002f
                java.util.ArrayList r4 = new java.util.ArrayList
                r5 = 10
                int r5 = kotlin.p590y.C13187p.m40525a(r1, r5)
                r4.<init>(r5)
                java.util.Iterator r5 = r1.iterator()
            L_0x001b:
                boolean r6 = r5.hasNext()
                if (r6 == 0) goto L_0x0033
                java.lang.Object r6 = r5.next()
                com.bamtechmedia.dominguez.search.SearchRepository$DmcAssetWrapper r6 = (com.bamtechmedia.dominguez.search.SearchRepository.DmcAssetWrapper) r6
                com.bamtechmedia.dominguez.core.content.assets.f r6 = r6.mo20863H()
                r4.add(r6)
                goto L_0x001b
            L_0x002f:
                java.util.List r4 = kotlin.p590y.C13185o.m40513a()
            L_0x0033:
                r0.<init>(r1, r2, r3, r4)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bamtechmedia.dominguez.search.SearchRepository.DmcHits.<init>(java.util.List, java.lang.String, com.bamtechmedia.dominguez.core.content.paging.DefaultPagingMetaData, java.util.List, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
        }

        /* renamed from: f0 */
        public DefaultPagingMetaData m23193f0() {
            return this.f17102V;
        }
    }

    @C11733i(generateAdapter = true)
    @Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B\u000f\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\f\u001a\u00020\rHÖ\u0001J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0010"}, mo31007d2 = {"Lcom/bamtechmedia/dominguez/search/SearchRepository$SearchResponse;", "", "results", "Lcom/bamtechmedia/dominguez/search/SearchRepository$DmcHits;", "(Lcom/bamtechmedia/dominguez/search/SearchRepository$DmcHits;)V", "getResults", "()Lcom/bamtechmedia/dominguez/search/SearchRepository$DmcHits;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "search_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
    /* compiled from: SearchRepository.kt */
    public static final class SearchResponse {

        /* renamed from: a */
        private final DmcHits f17105a;

        public SearchResponse(@C11724g(name = "disneysearch") DmcHits dmcHits) {
            this.f17105a = dmcHits;
        }

        /* renamed from: a */
        public final DmcHits mo20904a() {
            return this.f17105a;
        }

        public final SearchResponse copy(@C11724g(name = "disneysearch") DmcHits dmcHits) {
            return new SearchResponse(dmcHits);
        }

        /* JADX WARNING: Code restructure failed: missing block: B:4:0x0010, code lost:
            if (kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r1.f17105a, (java.lang.Object) ((com.bamtechmedia.dominguez.search.SearchRepository.SearchResponse) r2).f17105a) != false) goto L_0x0015;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean equals(java.lang.Object r2) {
            /*
                r1 = this;
                if (r1 == r2) goto L_0x0015
                boolean r0 = r2 instanceof com.bamtechmedia.dominguez.search.SearchRepository.SearchResponse
                if (r0 == 0) goto L_0x0013
                com.bamtechmedia.dominguez.search.SearchRepository$SearchResponse r2 = (com.bamtechmedia.dominguez.search.SearchRepository.SearchResponse) r2
                com.bamtechmedia.dominguez.search.SearchRepository$DmcHits r0 = r1.f17105a
                com.bamtechmedia.dominguez.search.SearchRepository$DmcHits r2 = r2.f17105a
                boolean r2 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r2)
                if (r2 == 0) goto L_0x0013
                goto L_0x0015
            L_0x0013:
                r2 = 0
                return r2
            L_0x0015:
                r2 = 1
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bamtechmedia.dominguez.search.SearchRepository.SearchResponse.equals(java.lang.Object):boolean");
        }

        public int hashCode() {
            DmcHits dmcHits = this.f17105a;
            if (dmcHits != null) {
                return dmcHits.hashCode();
            }
            return 0;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("SearchResponse(results=");
            sb.append(this.f17105a);
            sb.append(")");
            return sb.toString();
        }
    }

    /* renamed from: com.bamtechmedia.dominguez.search.SearchRepository$a */
    /* compiled from: SearchRepository.kt */
    public static final class C7951a {
        private C7951a() {
        }

        public /* synthetic */ C7951a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: com.bamtechmedia.dominguez.search.SearchRepository$b */
    /* compiled from: SearchRepository.kt */
    public interface C7952b extends C3700c<C3626b> {
    }

    /* renamed from: com.bamtechmedia.dominguez.search.SearchRepository$c */
    /* compiled from: SearchRepository.kt */
    static final class C7953c<T> implements Consumer<Disposable> {

        /* renamed from: c */
        final /* synthetic */ SearchRepository f17106c;

        C7953c(SearchRepository searchRepository) {
            this.f17106c = searchRepository;
        }

        /* renamed from: a */
        public final void accept(Disposable disposable) {
            this.f17106c.f17096a = disposable;
        }
    }

    /* renamed from: com.bamtechmedia.dominguez.search.SearchRepository$d */
    /* compiled from: SearchRepository.kt */
    static final class C7954d<T, R> implements Function<T, R> {

        /* renamed from: c */
        final /* synthetic */ C7952b f17107c;

        C7954d(C7952b bVar) {
            this.f17107c = bVar;
        }

        /* renamed from: a */
        public final DmcHits apply(GraphQlResponse<SearchResponse> graphQlResponse) {
            SearchResponse searchResponse = (SearchResponse) graphQlResponse.getData();
            Object a = searchResponse != null ? searchResponse.mo20904a() : null;
            C5884x.m18951a(a, (String) null, 1, (Object) null);
            DmcHits dmcHits = (DmcHits) a;
            return DmcHits.m23184a(dmcHits, null, null, null, C13199w.m40583d((Collection) this.f17107c, (Iterable) dmcHits.mo20874b()), 7, null);
        }
    }

    /* renamed from: com.bamtechmedia.dominguez.search.SearchRepository$e */
    /* compiled from: SearchRepository.kt */
    static final class C7955e implements C11945a {

        /* renamed from: a */
        final /* synthetic */ SearchRepository f17108a;

        C7955e(SearchRepository searchRepository) {
            this.f17108a = searchRepository;
        }

        public final void run() {
            this.f17108a.mo20862a(false);
        }
    }

    /* renamed from: com.bamtechmedia.dominguez.search.SearchRepository$f */
    /* compiled from: SearchRepository.kt */
    static final class C7956f<T> implements Consumer<Disposable> {

        /* renamed from: c */
        final /* synthetic */ SearchRepository f17109c;

        C7956f(SearchRepository searchRepository) {
            this.f17109c = searchRepository;
        }

        /* renamed from: a */
        public final void accept(Disposable disposable) {
            this.f17109c.f17096a = disposable;
        }
    }

    /* renamed from: com.bamtechmedia.dominguez.search.SearchRepository$g */
    /* compiled from: SearchRepository.kt */
    static final class C7957g<T, R> implements Function<T, R> {

        /* renamed from: c */
        public static final C7957g f17110c = new C7957g();

        C7957g() {
        }

        /* renamed from: a */
        public final DmcHits apply(GraphQlResponse<SearchResponse> graphQlResponse) {
            SearchResponse searchResponse = (SearchResponse) graphQlResponse.getData();
            Object a = searchResponse != null ? searchResponse.mo20904a() : null;
            C5884x.m18951a(a, (String) null, 1, (Object) null);
            return (DmcHits) a;
        }
    }

    /* renamed from: com.bamtechmedia.dominguez.search.SearchRepository$h */
    /* compiled from: SearchRepository.kt */
    static final class C7958h implements C11945a {

        /* renamed from: a */
        final /* synthetic */ SearchRepository f17111a;

        C7958h(SearchRepository searchRepository) {
            this.f17111a = searchRepository;
        }

        public final void run() {
            this.f17111a.f17098c = false;
        }
    }

    static {
        new C7951a(null);
    }

    public SearchRepository(C3724a aVar) {
        this.f17099d = aVar;
    }

    /* renamed from: a */
    public final void mo20862a(boolean z) {
        this.f17097b = z;
    }

    /* renamed from: a */
    public final Single<C7952b> mo20861a(String str, String str2) {
        Disposable disposable = this.f17096a;
        if (disposable != null) {
            disposable.dispose();
        }
        this.f17098c = true;
        this.f17097b = false;
        StringBuilder sb = new StringBuilder();
        sb.append("Starting initial search for query: ");
        sb.append(str);
        Timber.m44529c(sb.toString(), new Object[0]);
        Class<SearchResponse> cls = SearchResponse.class;
        String str3 = "core/disneysearch";
        Single<C7952b> b = this.f17099d.mo13577a(cls, str3, C13173j0.m40356a(C12907r.m40244a("index", "disney_global"), C12907r.m40244a("q", str)), str2).mo30222c((Consumer<? super Disposable>) new C7956f<Object>(this)).mo30233g(C7957g.f17110c).mo30219b((C11945a) new C7958h(this));
        Intrinsics.checkReturnedValueIsNotNull((Object) b, "searchApi\n            .t…ngInitialSearch = false }");
        return b;
    }

    /* renamed from: a */
    public static /* synthetic */ Maybe m23172a(SearchRepository searchRepository, String str, C7952b bVar, int i, String str2, int i2, int i3, Object obj) {
        return searchRepository.mo20860a(str, bVar, i, str2, (i3 & 16) != 0 ? 5 : i2);
    }

    /* renamed from: a */
    public final Maybe<C7952b> mo20860a(String str, C7952b bVar, int i, String str2, int i2) {
        if ((i + i2 >= bVar.size()) && bVar.mo13457f0().mo13412a0() && !m23175a()) {
            int Y = bVar.mo13457f0().mo13410Y();
            StringBuilder sb = new StringBuilder();
            sb.append("Starting next page ");
            sb.append(Y);
            sb.append(" load for query: ");
            sb.append(str);
            Timber.m44529c(sb.toString(), new Object[0]);
            Disposable disposable = this.f17096a;
            if (disposable != null) {
                disposable.dispose();
            }
            this.f17097b = true;
            Maybe<C7952b> a = this.f17099d.mo13577a(SearchResponse.class, "core/disneysearch", C13173j0.m40356a(C12907r.m40244a("index", "disney_global"), C12907r.m40244a("q", str), C12907r.m40244a("pageSize", Integer.valueOf(bVar.mo13457f0().mo13411Z())), C12907r.m40244a("page", Integer.valueOf(Y))), str2).mo30222c((Consumer<? super Disposable>) new C7953c<Object>(this)).mo30233g(new C7954d(bVar)).mo30234h().mo30104a((C11945a) new C7955e(this));
            Intrinsics.checkReturnedValueIsNotNull((Object) a, "searchApi\n              …loadingNextPage = false }");
            return a;
        }
        Maybe<C7952b> h = Maybe.m38259h();
        Intrinsics.checkReturnedValueIsNotNull((Object) h, "Maybe.empty()");
        return h;
    }

    /* renamed from: a */
    private final boolean m23175a() {
        return this.f17097b || this.f17098c;
    }
}
