package com.bamtechmedia.dominguez.search;

import com.bamtechmedia.dominguez.analytics.C2366i0;
import com.bamtechmedia.dominguez.analytics.C2366i0.C2367a;
import com.bamtechmedia.dominguez.collections.C3420l0;
import com.bamtechmedia.dominguez.collections.items.C3374o;
import com.bamtechmedia.dominguez.core.content.assets.C3626b;
import com.bamtechmedia.dominguez.core.content.collections.C3658a;
import com.bamtechmedia.dominguez.core.content.collections.C3659b;
import com.bamtechmedia.dominguez.core.content.collections.C3667h;
import com.bamtechmedia.dominguez.core.content.collections.C3678l;
import com.bamtechmedia.dominguez.core.content.paging.C3700c;
import com.bamtechmedia.dominguez.core.content.paging.C3702e;
import com.bamtechmedia.dominguez.core.content.sets.C3765c;
import com.bamtechmedia.dominguez.core.content.sets.C3765c.C3767b;
import com.bamtechmedia.dominguez.core.content.sets.ContentSet;
import com.bamtechmedia.dominguez.core.content.sets.ReferenceSet;
import com.bamtechmedia.dominguez.core.framework.C5741g;
import com.bamtechmedia.dominguez.keyboard.KeyboardStateListener;
import com.bamtechmedia.dominguez.search.SearchRepository.C7952b;
import com.google.common.base.Optional;
import java.util.List;
import kotlin.C13145v;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12879i;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.C12881k;
import kotlin.jvm.internal.C12895y;
import kotlin.reflect.KDeclarationContainer;
import org.joda.time.DateTime;
import p163g.p503n.p504a.C11792d0;
import p163g.p503n.p504a.C11793e;
import p163g.p503n.p504a.C11844z;
import p520io.reactivex.C11957k;
import p520io.reactivex.C11974s;
import p520io.reactivex.functions.Consumer;
import p686n.p687a.Timber;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000¦\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 L2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\u00020\u00042\u00020\u00052\u00020\u0006:\u0003KLMBK\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\u0006\u0010\u000f\u001a\u00020\u0010\u0012\u0006\u0010\u0011\u001a\u00020\u0012\u0012\u0006\u0010\u0013\u001a\u00020\u0014\u0012\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00170\u0016¢\u0006\u0002\u0010\u0018J\u0010\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\u001aH\u0016J\u0006\u0010\"\u001a\u00020#J\u0012\u0010$\u001a\u00020#2\b\u0010%\u001a\u0004\u0018\u00010\u001aH\u0002J\b\u0010&\u001a\u00020#H\u0002J\b\u0010'\u001a\u00020 H\u0002J\u0006\u0010(\u001a\u00020#J\b\u0010)\u001a\u00020 H\u0016J\u0010\u0010*\u001a\u00020 2\u0006\u0010+\u001a\u00020,H\u0016J\u001c\u0010-\u001a\u00020 2\n\u0010.\u001a\u0006\u0012\u0002\b\u00030/2\u0006\u00100\u001a\u000201H\u0016J\u0016\u00102\u001a\u00020 2\u0006\u00103\u001a\u00020\u001a2\u0006\u00104\u001a\u00020#J\u0018\u00105\u001a\u00020 2\u0006\u00106\u001a\u0002072\u0006\u00108\u001a\u000201H\u0002J\u0018\u00109\u001a\u00020 2\u0006\u0010:\u001a\u00020;2\u0006\u00108\u001a\u000201H\u0002J\u0016\u0010<\u001a\u00020 2\f\u0010.\u001a\b\u0012\u0004\u0012\u00020,0/H\u0016J\u0018\u0010=\u001a\u00020 2\u0006\u00103\u001a\u00020\u001a2\b\b\u0002\u0010>\u001a\u00020#J\u0016\u0010?\u001a\u00020 2\u0006\u00103\u001a\u00020\u001a2\u0006\u0010@\u001a\u00020#J\u0006\u0010A\u001a\u00020 J\b\u0010B\u001a\u00020#H\u0002J\u0010\u0010C\u001a\u00020 2\u0006\u0010D\u001a\u00020EH\u0002J\u0016\u0010F\u001a\u00020 2\f\u0010G\u001a\b\u0012\u0004\u0012\u00020I0HH\u0002J\u0010\u0010J\u001a\u00020 2\u0006\u0010:\u001a\u00020;H\u0002R\u000e\u0010\u0007\u001a\u00020\bX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0019\u001a\u00020\u001a8BX\u0004¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u001cR\u0014\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00170\u0016X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u001d\u001a\u00020\u001a8BX\u0004¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001cR\u000e\u0010\t\u001a\u00020\nX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0014X\u0004¢\u0006\u0002\n\u0000¨\u0006N"}, mo31007d2 = {"Lcom/bamtechmedia/dominguez/search/SearchViewModel;", "Lcom/bamtechmedia/dominguez/core/framework/ReactiveViewModel;", "Lcom/bamtechmedia/dominguez/search/SearchViewModel$State;", "Lcom/bamtechmedia/dominguez/search/DeleteRecentSearchOnClickListener;", "Lcom/bamtechmedia/dominguez/collections/items/ShelfBindListener;", "Lcom/bamtechmedia/dominguez/core/content/paging/PagingListener;", "Lcom/bamtechmedia/dominguez/collections/SupplementalItemClickListener;", "collectionsRepository", "Lcom/bamtechmedia/dominguez/core/content/collections/CollectionsRepository;", "slugProvider", "Lcom/bamtechmedia/dominguez/core/content/collections/SlugProvider;", "searchRepository", "Lcom/bamtechmedia/dominguez/search/SearchRepository;", "recentSearchRepository", "Lcom/bamtechmedia/dominguez/search/RecentSearchRepository;", "contentSetRepository", "Lcom/bamtechmedia/dominguez/core/content/sets/ContentSetDataSource;", "searchAnalytics", "Lcom/bamtechmedia/dominguez/search/SearchAnalytics;", "transactionIdProvider", "Lcom/bamtechmedia/dominguez/analytics/TransactionIdProvider;", "keyboardStateOptional", "Lcom/google/common/base/Optional;", "Lcom/bamtechmedia/dominguez/keyboard/KeyboardStateListener;", "(Lcom/bamtechmedia/dominguez/core/content/collections/CollectionsRepository;Lcom/bamtechmedia/dominguez/core/content/collections/SlugProvider;Lcom/bamtechmedia/dominguez/search/SearchRepository;Lcom/bamtechmedia/dominguez/search/RecentSearchRepository;Lcom/bamtechmedia/dominguez/core/content/sets/ContentSetDataSource;Lcom/bamtechmedia/dominguez/search/SearchAnalytics;Lcom/bamtechmedia/dominguez/analytics/TransactionIdProvider;Lcom/google/common/base/Optional;)V", "exploreTransactionId", "", "getExploreTransactionId", "()Ljava/lang/String;", "searchTransactionId", "getSearchTransactionId", "deleteRecentSearch", "", "search", "inRecentSearchesWithKeyboard", "", "isNewSearchQuery", "newQueryText", "keyboardOpenWhenLeavingExplore", "loadExploreCollection", "onBackPressed", "onCleared", "onCollectionItemClicked", "asset", "Lcom/bamtechmedia/dominguez/core/content/assets/Asset;", "onPageItemBound", "list", "Lcom/bamtechmedia/dominguez/core/content/paging/PagedList;", "pagedListPosition", "", "onSearchBoxStatusChanged", "queryText", "hasFocus", "onSearchResultBound", "searchResults", "Lcom/bamtechmedia/dominguez/search/SearchRepository$SearchResults;", "positionInSet", "onSetItemBound", "set", "Lcom/bamtechmedia/dominguez/core/content/sets/ContentSet;", "onShelfItemBound", "performSearch", "override", "retrySearch", "searchHasFocus", "returnToExplore", "shouldReturnToExplore", "updateLastError", "throwable", "", "updateRecentSearches", "recentSearches", "", "Lcom/bamtechmedia/dominguez/search/RecentSearch;", "updateSet", "ActiveViewState", "Companion", "State", "search_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* renamed from: com.bamtechmedia.dominguez.search.b0 */
/* compiled from: SearchViewModel.kt */
public final class C7975b0 extends C5741g<C7980e> implements C8023e, C3374o, C3702e, C3420l0 {

    /* renamed from: b0 */
    private static final C7980e f17140b0;

    /* renamed from: U */
    private final C3678l f17141U;

    /* renamed from: V */
    private final SearchRepository f17142V;

    /* renamed from: W */
    private final C8052r f17143W;

    /* renamed from: X */
    private final C3765c f17144X;
    /* access modifiers changed from: private */

    /* renamed from: Y */
    public final C8060t f17145Y;

    /* renamed from: Z */
    private final C2366i0 f17146Z;

    /* renamed from: a0 */
    private final Optional<KeyboardStateListener> f17147a0;

    /* renamed from: c */
    private final C3667h f17148c;

    /* renamed from: com.bamtechmedia.dominguez.search.b0$a */
    /* compiled from: SearchViewModel.kt */
    static final /* synthetic */ class C7976a extends C12879i implements Function1<List<? extends RecentSearch>, C13145v> {
        C7976a(C7975b0 b0Var) {
            super(1, b0Var);
        }

        /* renamed from: a */
        public final void mo20961a(List<RecentSearch> list) {
            ((C7975b0) this.receiver).m23250a(list);
        }

        public final String getName() {
            return "updateRecentSearches";
        }

        public final KDeclarationContainer getOwner() {
            return C12895y.m40230a(C7975b0.class);
        }

        public final String getSignature() {
            return "updateRecentSearches(Ljava/util/List;)V";
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo20961a((List) obj);
            return C13145v.f29587a;
        }
    }

    /* renamed from: com.bamtechmedia.dominguez.search.b0$b */
    /* compiled from: SearchViewModel.kt */
    static final /* synthetic */ class C7977b extends C12879i implements Function1<Throwable, C13145v> {
        C7977b(C7975b0 b0Var) {
            super(1, b0Var);
        }

        /* renamed from: a */
        public final void mo20962a(Throwable th) {
            ((C7975b0) this.receiver).m23249a(th);
        }

        public final String getName() {
            return "updateLastError";
        }

        public final KDeclarationContainer getOwner() {
            return C12895y.m40230a(C7975b0.class);
        }

        public final String getSignature() {
            return "updateLastError(Ljava/lang/Throwable;)V";
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo20962a((Throwable) obj);
            return C13145v.f29587a;
        }
    }

    /* renamed from: com.bamtechmedia.dominguez.search.b0$c */
    /* compiled from: SearchViewModel.kt */
    public enum C7978c {
        EXPLORE,
        RECENT_SEARCHES,
        SEARCH_RESULTS
    }

    /* renamed from: com.bamtechmedia.dominguez.search.b0$d */
    /* compiled from: SearchViewModel.kt */
    public static final class C7979d {
        private C7979d() {
        }

        public /* synthetic */ C7979d(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: com.bamtechmedia.dominguez.search.b0$e */
    /* compiled from: SearchViewModel.kt */
    public static final class C7980e {

        /* renamed from: a */
        private final C7978c f17153a;

        /* renamed from: b */
        private final C3658a f17154b;

        /* renamed from: c */
        private final List<RecentSearch> f17155c;

        /* renamed from: d */
        private final C3700c<C3626b> f17156d;

        /* renamed from: e */
        private final String f17157e;

        /* renamed from: f */
        private final boolean f17158f;

        /* renamed from: g */
        private final Throwable f17159g;

        public C7980e() {
            this(null, null, null, null, null, false, null, 127, null);
        }

        public C7980e(C7978c cVar, C3658a aVar, List<RecentSearch> list, C3700c<? extends C3626b> cVar2, String str, boolean z, Throwable th) {
            this.f17153a = cVar;
            this.f17154b = aVar;
            this.f17155c = list;
            this.f17156d = cVar2;
            this.f17157e = str;
            this.f17158f = z;
            this.f17159g = th;
        }

        /* JADX WARNING: Incorrect type for immutable var: ssa=com.bamtechmedia.dominguez.core.content.paging.c, code=com.bamtechmedia.dominguez.core.content.paging.c<com.bamtechmedia.dominguez.core.content.assets.b>, for r9v0, types: [com.bamtechmedia.dominguez.core.content.paging.c] */
        /* JADX WARNING: Incorrect type for immutable var: ssa=java.util.List, code=java.util.List<com.bamtechmedia.dominguez.search.RecentSearch>, for r8v0, types: [java.util.List] */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public static /* synthetic */ com.bamtechmedia.dominguez.search.C7975b0.C7980e m23262a(com.bamtechmedia.dominguez.search.C7975b0.C7980e r5, com.bamtechmedia.dominguez.search.C7975b0.C7978c r6, com.bamtechmedia.dominguez.core.content.collections.C3658a r7, java.util.List<com.bamtechmedia.dominguez.search.RecentSearch> r8, com.bamtechmedia.dominguez.core.content.paging.C3700c<com.bamtechmedia.dominguez.core.content.assets.C3626b> r9, java.lang.String r10, boolean r11, java.lang.Throwable r12, int r13, java.lang.Object r14) {
            /*
                r14 = r13 & 1
                if (r14 == 0) goto L_0x0006
                com.bamtechmedia.dominguez.search.b0$c r6 = r5.f17153a
            L_0x0006:
                r14 = r13 & 2
                if (r14 == 0) goto L_0x000c
                com.bamtechmedia.dominguez.core.content.collections.a r7 = r5.f17154b
            L_0x000c:
                r14 = r7
                r7 = r13 & 4
                if (r7 == 0) goto L_0x0013
                java.util.List<com.bamtechmedia.dominguez.search.RecentSearch> r8 = r5.f17155c
            L_0x0013:
                r0 = r8
                r7 = r13 & 8
                if (r7 == 0) goto L_0x001a
                com.bamtechmedia.dominguez.core.content.paging.c<com.bamtechmedia.dominguez.core.content.assets.b> r9 = r5.f17156d
            L_0x001a:
                r1 = r9
                r7 = r13 & 16
                if (r7 == 0) goto L_0x0021
                java.lang.String r10 = r5.f17157e
            L_0x0021:
                r2 = r10
                r7 = r13 & 32
                if (r7 == 0) goto L_0x0028
                boolean r11 = r5.f17158f
            L_0x0028:
                r3 = r11
                r7 = r13 & 64
                if (r7 == 0) goto L_0x002f
                java.lang.Throwable r12 = r5.f17159g
            L_0x002f:
                r4 = r12
                r7 = r5
                r8 = r6
                r9 = r14
                r10 = r0
                r11 = r1
                r12 = r2
                r13 = r3
                r14 = r4
                com.bamtechmedia.dominguez.search.b0$e r5 = r7.mo20964a(r8, r9, r10, r11, r12, r13, r14)
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bamtechmedia.dominguez.search.C7975b0.C7980e.m23262a(com.bamtechmedia.dominguez.search.b0$e, com.bamtechmedia.dominguez.search.b0$c, com.bamtechmedia.dominguez.core.content.collections.a, java.util.List, com.bamtechmedia.dominguez.core.content.paging.c, java.lang.String, boolean, java.lang.Throwable, int, java.lang.Object):com.bamtechmedia.dominguez.search.b0$e");
        }

        /* renamed from: a */
        public final C7978c mo20963a() {
            return this.f17153a;
        }

        /* renamed from: a */
        public final C7980e mo20964a(C7978c cVar, C3658a aVar, List<RecentSearch> list, C3700c<? extends C3626b> cVar2, String str, boolean z, Throwable th) {
            C7980e eVar = new C7980e(cVar, aVar, list, cVar2, str, z, th);
            return eVar;
        }

        /* renamed from: b */
        public final C3658a mo20965b() {
            return this.f17154b;
        }

        /* renamed from: c */
        public final Throwable mo20966c() {
            return this.f17159g;
        }

        /* renamed from: d */
        public final String mo20967d() {
            return this.f17157e;
        }

        /* renamed from: e */
        public final List<RecentSearch> mo20968e() {
            return this.f17155c;
        }

        public boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof C7980e) {
                    C7980e eVar = (C7980e) obj;
                    if (Intrinsics.areEqual((Object) this.f17153a, (Object) eVar.f17153a) && Intrinsics.areEqual((Object) this.f17154b, (Object) eVar.f17154b) && Intrinsics.areEqual((Object) this.f17155c, (Object) eVar.f17155c) && Intrinsics.areEqual((Object) this.f17156d, (Object) eVar.f17156d) && Intrinsics.areEqual((Object) this.f17157e, (Object) eVar.f17157e)) {
                        if (!(this.f17158f == eVar.f17158f) || !Intrinsics.areEqual((Object) this.f17159g, (Object) eVar.f17159g)) {
                            return false;
                        }
                    }
                }
                return false;
            }
            return true;
        }

        /* renamed from: f */
        public final C3700c<C3626b> mo20970f() {
            return this.f17156d;
        }

        public int hashCode() {
            C7978c cVar = this.f17153a;
            int i = 0;
            int hashCode = (cVar != null ? cVar.hashCode() : 0) * 31;
            C3658a aVar = this.f17154b;
            int hashCode2 = (hashCode + (aVar != null ? aVar.hashCode() : 0)) * 31;
            List<RecentSearch> list = this.f17155c;
            int hashCode3 = (hashCode2 + (list != null ? list.hashCode() : 0)) * 31;
            C3700c<C3626b> cVar2 = this.f17156d;
            int hashCode4 = (hashCode3 + (cVar2 != null ? cVar2.hashCode() : 0)) * 31;
            String str = this.f17157e;
            int hashCode5 = (hashCode4 + (str != null ? str.hashCode() : 0)) * 31;
            boolean z = this.f17158f;
            if (z) {
                z = true;
            }
            int i2 = (hashCode5 + (z ? 1 : 0)) * 31;
            Throwable th = this.f17159g;
            if (th != null) {
                i = th.hashCode();
            }
            return i2 + i;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("State(activeView=");
            sb.append(this.f17153a);
            sb.append(", exploreCollection=");
            sb.append(this.f17154b);
            sb.append(", recentSearches=");
            sb.append(this.f17155c);
            sb.append(", searchResults=");
            sb.append(this.f17156d);
            sb.append(", queryText=");
            sb.append(this.f17157e);
            sb.append(", isRecentSearch=");
            sb.append(this.f17158f);
            sb.append(", lastError=");
            sb.append(this.f17159g);
            sb.append(")");
            return sb.toString();
        }

        public /* synthetic */ C7980e(C7978c cVar, C3658a aVar, List list, C3700c cVar2, String str, boolean z, Throwable th, int i, DefaultConstructorMarker defaultConstructorMarker) {
            if ((i & 1) != 0) {
                cVar = C7978c.EXPLORE;
            }
            Throwable th2 = null;
            C3658a aVar2 = (i & 2) != 0 ? null : aVar;
            if ((i & 4) != 0) {
                list = C13185o.m40513a();
            }
            List list2 = list;
            C3700c cVar3 = (i & 8) != 0 ? null : cVar2;
            if ((i & 16) != 0) {
                str = "";
            }
            String str2 = str;
            boolean z2 = (i & 32) != 0 ? false : z;
            if ((i & 64) == 0) {
                th2 = th;
            }
            this(cVar, aVar2, list2, cVar3, str2, z2, th2);
        }
    }

    @Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, mo31007d2 = {"<anonymous>", "", "collection", "Lcom/bamtechmedia/dominguez/core/content/collections/Collection;", "kotlin.jvm.PlatformType", "accept"}, mo31008k = 3, mo31009mv = {1, 1, 15})
    /* renamed from: com.bamtechmedia.dominguez.search.b0$f */
    /* compiled from: SearchViewModel.kt */
    static final class C7981f<T> implements Consumer<C3658a> {

        /* renamed from: c */
        final /* synthetic */ C7975b0 f17160c;

        /* renamed from: com.bamtechmedia.dominguez.search.b0$f$a */
        /* compiled from: SearchViewModel.kt */
        static final class C7982a extends C12881k implements Function1<C7980e, C7980e> {

            /* renamed from: c */
            final /* synthetic */ C3658a f17161c;

            C7982a(C3658a aVar) {
                this.f17161c = aVar;
                super(1);
            }

            /* renamed from: a */
            public final C7980e invoke(C7980e eVar) {
                return C7980e.m23262a(eVar, null, this.f17161c, null, null, null, false, null, 125, null);
            }
        }

        C7981f(C7975b0 b0Var) {
            this.f17160c = b0Var;
        }

        /* renamed from: a */
        public final void accept(C3658a aVar) {
            this.f17160c.updateState(new C7982a(aVar));
        }
    }

    /* renamed from: com.bamtechmedia.dominguez.search.b0$g */
    /* compiled from: SearchViewModel.kt */
    static final /* synthetic */ class C7983g extends C12879i implements Function1<Throwable, C13145v> {
        C7983g(C7975b0 b0Var) {
            super(1, b0Var);
        }

        /* renamed from: a */
        public final void mo20975a(Throwable th) {
            ((C7975b0) this.receiver).m23249a(th);
        }

        public final String getName() {
            return "updateLastError";
        }

        public final KDeclarationContainer getOwner() {
            return C12895y.m40230a(C7975b0.class);
        }

        public final String getSignature() {
            return "updateLastError(Ljava/lang/Throwable;)V";
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo20975a((Throwable) obj);
            return C13145v.f29587a;
        }
    }

    /* renamed from: com.bamtechmedia.dominguez.search.b0$h */
    /* compiled from: SearchViewModel.kt */
    static final /* synthetic */ class C7984h extends C12879i implements Function1<List<? extends RecentSearch>, C13145v> {
        C7984h(C7975b0 b0Var) {
            super(1, b0Var);
        }

        /* renamed from: a */
        public final void mo20976a(List<RecentSearch> list) {
            ((C7975b0) this.receiver).m23250a(list);
        }

        public final String getName() {
            return "updateRecentSearches";
        }

        public final KDeclarationContainer getOwner() {
            return C12895y.m40230a(C7975b0.class);
        }

        public final String getSignature() {
            return "updateRecentSearches(Ljava/util/List;)V";
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo20976a((List) obj);
            return C13145v.f29587a;
        }
    }

    /* renamed from: com.bamtechmedia.dominguez.search.b0$i */
    /* compiled from: SearchViewModel.kt */
    static final /* synthetic */ class C7985i extends C12879i implements Function1<Throwable, C13145v> {
        C7985i(C7975b0 b0Var) {
            super(1, b0Var);
        }

        /* renamed from: a */
        public final void mo20977a(Throwable th) {
            ((C7975b0) this.receiver).m23249a(th);
        }

        public final String getName() {
            return "updateLastError";
        }

        public final KDeclarationContainer getOwner() {
            return C12895y.m40230a(C7975b0.class);
        }

        public final String getSignature() {
            return "updateLastError(Ljava/lang/Throwable;)V";
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo20977a((Throwable) obj);
            return C13145v.f29587a;
        }
    }

    /* renamed from: com.bamtechmedia.dominguez.search.b0$j */
    /* compiled from: SearchViewModel.kt */
    static final class C7986j extends C12881k implements Function1<C7980e, C7980e> {

        /* renamed from: c */
        public static final C7986j f17162c = new C7986j();

        C7986j() {
            super(1);
        }

        /* renamed from: a */
        public final C7980e invoke(C7980e eVar) {
            return C7980e.m23262a(eVar, C7978c.RECENT_SEARCHES, null, null, null, "", false, null, 102, null);
        }
    }

    /* renamed from: com.bamtechmedia.dominguez.search.b0$k */
    /* compiled from: SearchViewModel.kt */
    static final class C7987k extends C12881k implements Function1<C7980e, C7980e> {

        /* renamed from: c */
        public static final C7987k f17163c = new C7987k();

        C7987k() {
            super(1);
        }

        /* renamed from: a */
        public final C7980e invoke(C7980e eVar) {
            return C7980e.m23262a(eVar, C7978c.SEARCH_RESULTS, null, null, null, null, false, null, 126, null);
        }
    }

    @Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005¨\u0006\u0006"}, mo31007d2 = {"<anonymous>", "", "results", "Lcom/bamtechmedia/dominguez/search/SearchRepository$SearchResults;", "kotlin.jvm.PlatformType", "accept", "com/bamtechmedia/dominguez/search/SearchViewModel$onSearchResultBound$1$1"}, mo31008k = 3, mo31009mv = {1, 1, 15})
    /* renamed from: com.bamtechmedia.dominguez.search.b0$l */
    /* compiled from: SearchViewModel.kt */
    static final class C7988l<T> implements Consumer<C7952b> {

        /* renamed from: c */
        final /* synthetic */ C7975b0 f17164c;

        /* renamed from: com.bamtechmedia.dominguez.search.b0$l$a */
        /* compiled from: SearchViewModel.kt */
        static final class C7989a extends C12881k implements Function1<C7980e, C7980e> {

            /* renamed from: c */
            final /* synthetic */ C7952b f17165c;

            C7989a(C7952b bVar) {
                this.f17165c = bVar;
                super(1);
            }

            /* renamed from: a */
            public final C7980e invoke(C7980e eVar) {
                return C7980e.m23262a(eVar, null, null, null, this.f17165c, null, false, null, 119, null);
            }
        }

        C7988l(C7975b0 b0Var, C7952b bVar, int i) {
            this.f17164c = b0Var;
        }

        /* renamed from: a */
        public final void accept(C7952b bVar) {
            this.f17164c.updateState(new C7989a(bVar));
        }
    }

    /* renamed from: com.bamtechmedia.dominguez.search.b0$m */
    /* compiled from: SearchViewModel.kt */
    static final /* synthetic */ class C7990m extends C12879i implements Function1<Throwable, C13145v> {
        C7990m(C7975b0 b0Var) {
            super(1, b0Var);
        }

        /* renamed from: a */
        public final void mo20982a(Throwable th) {
            ((C7975b0) this.receiver).m23249a(th);
        }

        public final String getName() {
            return "updateLastError";
        }

        public final KDeclarationContainer getOwner() {
            return C12895y.m40230a(C7975b0.class);
        }

        public final String getSignature() {
            return "updateLastError(Ljava/lang/Throwable;)V";
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo20982a((Throwable) obj);
            return C13145v.f29587a;
        }
    }

    /* renamed from: com.bamtechmedia.dominguez.search.b0$n */
    /* compiled from: SearchViewModel.kt */
    static final /* synthetic */ class C7991n extends C12879i implements Function1<ContentSet, C13145v> {
        C7991n(C7975b0 b0Var) {
            super(1, b0Var);
        }

        /* renamed from: a */
        public final void mo20983a(ContentSet contentSet) {
            ((C7975b0) this.receiver).m23242a(contentSet);
        }

        public final String getName() {
            return "updateSet";
        }

        public final KDeclarationContainer getOwner() {
            return C12895y.m40230a(C7975b0.class);
        }

        public final String getSignature() {
            return "updateSet(Lcom/bamtechmedia/dominguez/core/content/sets/ContentSet;)V";
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo20983a((ContentSet) obj);
            return C13145v.f29587a;
        }
    }

    /* renamed from: com.bamtechmedia.dominguez.search.b0$o */
    /* compiled from: SearchViewModel.kt */
    static final /* synthetic */ class C7992o extends C12879i implements Function1<Throwable, C13145v> {
        C7992o(C7975b0 b0Var) {
            super(1, b0Var);
        }

        /* renamed from: a */
        public final void mo20984a(Throwable th) {
            ((C7975b0) this.receiver).m23249a(th);
        }

        public final String getName() {
            return "updateLastError";
        }

        public final KDeclarationContainer getOwner() {
            return C12895y.m40230a(C7975b0.class);
        }

        public final String getSignature() {
            return "updateLastError(Ljava/lang/Throwable;)V";
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo20984a((Throwable) obj);
            return C13145v.f29587a;
        }
    }

    /* renamed from: com.bamtechmedia.dominguez.search.b0$p */
    /* compiled from: SearchViewModel.kt */
    static final /* synthetic */ class C7993p extends C12879i implements Function1<ContentSet, C13145v> {
        C7993p(C7975b0 b0Var) {
            super(1, b0Var);
        }

        /* renamed from: a */
        public final void mo20985a(ContentSet contentSet) {
            ((C7975b0) this.receiver).m23242a(contentSet);
        }

        public final String getName() {
            return "updateSet";
        }

        public final KDeclarationContainer getOwner() {
            return C12895y.m40230a(C7975b0.class);
        }

        public final String getSignature() {
            return "updateSet(Lcom/bamtechmedia/dominguez/core/content/sets/ContentSet;)V";
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo20985a((ContentSet) obj);
            return C13145v.f29587a;
        }
    }

    /* renamed from: com.bamtechmedia.dominguez.search.b0$q */
    /* compiled from: SearchViewModel.kt */
    static final /* synthetic */ class C7994q extends C12879i implements Function1<Throwable, C13145v> {
        C7994q(C7975b0 b0Var) {
            super(1, b0Var);
        }

        /* renamed from: a */
        public final void mo20986a(Throwable th) {
            ((C7975b0) this.receiver).m23249a(th);
        }

        public final String getName() {
            return "updateLastError";
        }

        public final KDeclarationContainer getOwner() {
            return C12895y.m40230a(C7975b0.class);
        }

        public final String getSignature() {
            return "updateLastError(Ljava/lang/Throwable;)V";
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo20986a((Throwable) obj);
            return C13145v.f29587a;
        }
    }

    @Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, mo31007d2 = {"<anonymous>", "", "results", "Lcom/bamtechmedia/dominguez/search/SearchRepository$SearchResults;", "kotlin.jvm.PlatformType", "accept"}, mo31008k = 3, mo31009mv = {1, 1, 15})
    /* renamed from: com.bamtechmedia.dominguez.search.b0$r */
    /* compiled from: SearchViewModel.kt */
    static final class C7995r<T> implements Consumer<C7952b> {

        /* renamed from: U */
        final /* synthetic */ String f17166U;

        /* renamed from: V */
        final /* synthetic */ long f17167V;

        /* renamed from: c */
        final /* synthetic */ C7975b0 f17168c;

        /* renamed from: com.bamtechmedia.dominguez.search.b0$r$a */
        /* compiled from: SearchViewModel.kt */
        static final class C7996a extends C12881k implements Function1<C7980e, C7980e> {

            /* renamed from: U */
            final /* synthetic */ C7952b f17169U;

            /* renamed from: c */
            final /* synthetic */ C7995r f17170c;

            C7996a(C7995r rVar, C7952b bVar) {
                this.f17170c = rVar;
                this.f17169U = bVar;
                super(1);
            }

            /* renamed from: a */
            public final C7980e invoke(C7980e eVar) {
                return C7980e.m23262a(eVar, null, null, null, this.f17169U, this.f17170c.f17166U, false, null, 103, null);
            }
        }

        C7995r(C7975b0 b0Var, String str, long j) {
            this.f17168c = b0Var;
            this.f17166U = str;
            this.f17167V = j;
        }

        /* renamed from: a */
        public final void accept(C7952b bVar) {
            this.f17168c.f17145Y.mo21041a(this.f17166U, this.f17167V);
            this.f17168c.updateState(new C7996a(this, bVar));
        }
    }

    /* renamed from: com.bamtechmedia.dominguez.search.b0$s */
    /* compiled from: SearchViewModel.kt */
    static final /* synthetic */ class C7997s extends C12879i implements Function1<Throwable, C13145v> {
        C7997s(C7975b0 b0Var) {
            super(1, b0Var);
        }

        /* renamed from: a */
        public final void mo20989a(Throwable th) {
            ((C7975b0) this.receiver).m23249a(th);
        }

        public final String getName() {
            return "updateLastError";
        }

        public final KDeclarationContainer getOwner() {
            return C12895y.m40230a(C7975b0.class);
        }

        public final String getSignature() {
            return "updateLastError(Ljava/lang/Throwable;)V";
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo20989a((Throwable) obj);
            return C13145v.f29587a;
        }
    }

    /* renamed from: com.bamtechmedia.dominguez.search.b0$t */
    /* compiled from: SearchViewModel.kt */
    static final class C7998t extends C12881k implements Function1<C7980e, C7980e> {

        /* renamed from: c */
        public static final C7998t f17171c = new C7998t();

        C7998t() {
            super(1);
        }

        /* renamed from: a */
        public final C7980e invoke(C7980e eVar) {
            return C7980e.m23262a(eVar, C7978c.EXPLORE, null, null, null, "", false, null, 102, null);
        }
    }

    /* renamed from: com.bamtechmedia.dominguez.search.b0$u */
    /* compiled from: SearchViewModel.kt */
    static final class C7999u extends C12881k implements Function1<C7980e, C7980e> {

        /* renamed from: c */
        final /* synthetic */ Throwable f17172c;

        C7999u(Throwable th) {
            this.f17172c = th;
            super(1);
        }

        /* renamed from: a */
        public final C7980e invoke(C7980e eVar) {
            return C7980e.m23262a(eVar, null, null, null, null, null, false, this.f17172c, 63, null);
        }
    }

    /* renamed from: com.bamtechmedia.dominguez.search.b0$v */
    /* compiled from: SearchViewModel.kt */
    static final class C8000v extends C12881k implements Function1<C7980e, C7980e> {

        /* renamed from: c */
        final /* synthetic */ List f17173c;

        C8000v(List list) {
            this.f17173c = list;
            super(1);
        }

        /* renamed from: a */
        public final C7980e invoke(C7980e eVar) {
            return C7980e.m23262a(eVar, null, null, this.f17173c, null, null, false, null, 123, null);
        }
    }

    /* renamed from: com.bamtechmedia.dominguez.search.b0$w */
    /* compiled from: SearchViewModel.kt */
    static final class C8001w extends C12881k implements Function1<C7980e, C7980e> {

        /* renamed from: c */
        final /* synthetic */ ContentSet f17174c;

        C8001w(ContentSet contentSet) {
            this.f17174c = contentSet;
            super(1);
        }

        /* renamed from: a */
        public final C7980e invoke(C7980e eVar) {
            C3658a b = eVar.mo20965b();
            return C7980e.m23262a(eVar, null, b != null ? b.mo13354a(C13186o0.m40524a(this.f17174c)) : null, null, null, null, false, null, 125, null);
        }
    }

    static {
        new C7979d(null);
        C7980e eVar = new C7980e(C7978c.EXPLORE, null, null, null, null, false, null, 126, null);
        f17140b0 = eVar;
    }

    public C7975b0(C3667h hVar, C3678l lVar, SearchRepository searchRepository, C8052r rVar, C3765c cVar, C8060t tVar, C2366i0 i0Var, Optional<KeyboardStateListener> optional) {
        super(null, 1, null);
        this.f17148c = hVar;
        this.f17141U = lVar;
        this.f17142V = searchRepository;
        this.f17143W = rVar;
        this.f17144X = cVar;
        this.f17145Y = tVar;
        this.f17146Z = i0Var;
        this.f17147a0 = optional;
        createState(f17140b0);
        Object a = this.f17143W.mo21028a().mo30215a((C11974s<T, ? extends R>) C11793e.m37930a(getViewModelScope()));
        Intrinsics.checkReturnedValueIsNotNull(a, "this.`as`(AutoDispose.autoDisposable(provider))");
        ((C11792d0) a).mo29920a(new C8022d0(new C7976a(this)), new C8022d0(new C7977b(this)));
        m23240C();
    }

    /* renamed from: A */
    private final String m23238A() {
        return this.f17146Z.mo11491a(this.f17141U.mo13388b().mo13376Z(), false);
    }

    /* renamed from: B */
    private final boolean m23239B() {
        KeyboardStateListener keyboardStateListener = (KeyboardStateListener) this.f17147a0.mo27107c();
        if (keyboardStateListener == null) {
            return false;
        }
        C7980e eVar = (C7980e) getCurrentState();
        if ((eVar != null ? eVar.mo20963a() : null) != C7978c.RECENT_SEARCHES || !keyboardStateListener.mo18369b()) {
            return false;
        }
        return true;
    }

    /* renamed from: C */
    private final void m23240C() {
        Object a = this.f17148c.mo13367a(this.f17141U.mo13388b()).mo30215a((C11974s<T, ? extends R>) C11793e.m37930a(getViewModelScope()));
        Intrinsics.checkReturnedValueIsNotNull(a, "this.`as`(AutoDispose.autoDisposable(provider))");
        ((C11792d0) a).mo29920a(new C7981f(this), new C8022d0(new C7983g(this)));
    }

    /* renamed from: z */
    private final String m23252z() {
        return C2367a.m8888a(this.f17146Z, this.f17141U.mo13388b().mo13376Z(), false, 2, null);
    }

    /* renamed from: b */
    public final void mo20958b(String str, boolean z) {
        if (m23251b(str) || z) {
            DateTime now = DateTime.now();
            Intrinsics.checkReturnedValueIsNotNull((Object) now, "DateTime.now()");
            long millis = now.getMillis();
            Object a = this.f17142V.mo20861a(str, m23238A()).mo30215a((C11974s<T, ? extends R>) C11793e.m37930a(getViewModelScope()));
            Intrinsics.checkReturnedValueIsNotNull(a, "this.`as`(AutoDispose.autoDisposable(provider))");
            ((C11792d0) a).mo29920a(new C7995r(this, str, millis), new C8022d0(new C7997s(this)));
            return;
        }
        Timber.m44532e("## SEARCH -> query text is the same as previous...ignoring search", new Object[0]);
    }

    /* renamed from: c */
    public final void mo20959c(String str, boolean z) {
        if (C12832w.m40118a(str)) {
            m23240C();
            return;
        }
        mo20957a(str, z);
        mo20958b(str, true);
    }

    public void onCleared() {
        this.f17146Z.mo11492a(m23252z());
        super.onCleared();
    }

    /* renamed from: y */
    public final void mo20960y() {
        updateState(C7998t.f17171c);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final void m23249a(Throwable th) {
        updateState(new C7999u(th));
    }

    /* renamed from: a */
    public final void mo20957a(String str, boolean z) {
        boolean a = C12832w.m40118a(str);
        if (a && z) {
            updateState(C7986j.f17162c);
        } else if (a && !m23239B()) {
            mo20960y();
        } else if (!a) {
            updateState(C7987k.f17163c);
        }
    }

    /* renamed from: b */
    public void mo12599b(C3626b bVar) {
        Object a = this.f17143W.mo21029a(bVar.getTitle()).mo30215a((C11974s<T, ? extends R>) C11793e.m37930a(getViewModelScope()));
        Intrinsics.checkReturnedValueIsNotNull(a, "this.`as`(AutoDispose.autoDisposable(provider))");
        ((C11792d0) a).mo29920a(new C8022d0(new C7984h(this)), new C8022d0(new C7985i(this)));
    }

    /* renamed from: a */
    public static /* synthetic */ void m23246a(C7975b0 b0Var, String str, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        b0Var.mo20958b(str, z);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final void m23250a(List<RecentSearch> list) {
        updateState(new C8000v(list));
    }

    /* renamed from: a */
    public void mo12479a(C3700c<? extends C3626b> cVar) {
        if (cVar instanceof ReferenceSet) {
            ReferenceSet referenceSet = (ReferenceSet) cVar;
            Object a = C3767b.m12769a(this.f17144X, referenceSet.mo13604b(), referenceSet.mo13608e(), m23252z(), false, 8, (Object) null).mo30215a((C11974s<T, ? extends R>) C11793e.m37930a(getViewModelScope()));
            Intrinsics.checkReturnedValueIsNotNull(a, "this.`as`(AutoDispose.autoDisposable(provider))");
            ((C11792d0) a).mo29920a(new C8022d0(new C7993p(this)), new C8022d0(new C7994q(this)));
        }
    }

    /* renamed from: b */
    private final boolean m23251b(String str) {
        C7980e eVar = (C7980e) getCurrentState();
        return !Intrinsics.areEqual((Object) eVar != null ? eVar.mo20967d() : null, (Object) str);
    }

    /* renamed from: a */
    public void mo12663a(C3700c<?> cVar, int i) {
        if (cVar instanceof ContentSet) {
            m23243a((ContentSet) cVar, i);
        } else if (cVar instanceof C7952b) {
            m23244a((C7952b) cVar, i);
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append("Paging on ");
            sb.append(cVar.getClass());
            sb.append(" is not supported by this ViewModel");
            Timber.m44526b(sb.toString(), new Object[0]);
        }
    }

    /* renamed from: a */
    private final void m23243a(ContentSet contentSet, int i) {
        C7980e eVar = (C7980e) getCurrentState();
        if (eVar != null) {
            C3658a b = eVar.mo20965b();
            if (b != null && C3659b.m12473a(b, contentSet)) {
                Object a = C3767b.m12768a(this.f17144X, contentSet, i, m23252z(), 0, 8, (Object) null).mo30112a((C11957k<T, ? extends R>) C11793e.m37930a(getViewModelScope()));
                Intrinsics.checkReturnedValueIsNotNull(a, "this.`as`(AutoDispose.autoDisposable(provider))");
                ((C11844z) a).mo29929a(new C8022d0(new C7991n(this)), new C8022d0(new C7992o(this)));
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final void m23242a(ContentSet contentSet) {
        updateState(new C8001w(contentSet));
    }

    /* renamed from: a */
    private final void m23244a(C7952b bVar, int i) {
        C7980e eVar = (C7980e) getCurrentState();
        if (eVar != null) {
            String d = eVar.mo20967d();
            if (d != null) {
                Object a = SearchRepository.m23172a(this.f17142V, d, bVar, i, m23238A(), 0, 16, null).mo30112a((C11957k<T, ? extends R>) C11793e.m37930a(getViewModelScope()));
                Intrinsics.checkReturnedValueIsNotNull(a, "this.`as`(AutoDispose.autoDisposable(provider))");
                ((C11844z) a).mo29929a(new C7988l(this, bVar, i), new C8020c0(new C7990m(this)));
            }
        }
    }
}
