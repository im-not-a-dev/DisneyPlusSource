package com.bamtechmedia.dominguez.collections;

import androidx.fragment.app.Fragment;
import androidx.lifecycle.C0722m;
import androidx.lifecycle.C0741y;
import com.bamtechmedia.dominguez.analytics.C2366i0;
import com.bamtechmedia.dominguez.analytics.C2366i0.C2367a;
import com.bamtechmedia.dominguez.collections.C3454q.C3455a;
import com.bamtechmedia.dominguez.collections.C3454q.C3456b;
import com.bamtechmedia.dominguez.collections.caching.C3314g;
import com.bamtechmedia.dominguez.collections.p080o0.C3439e;
import com.bamtechmedia.dominguez.core.C3796d;
import com.bamtechmedia.dominguez.core.content.assets.C3626b;
import com.bamtechmedia.dominguez.core.content.collections.C3658a;
import com.bamtechmedia.dominguez.core.content.collections.C3667h;
import com.bamtechmedia.dominguez.core.content.collections.C3676k;
import com.bamtechmedia.dominguez.core.content.containers.Container;
import com.bamtechmedia.dominguez.core.content.paging.C3700c;
import com.bamtechmedia.dominguez.core.content.sets.AvailabilityHint;
import com.bamtechmedia.dominguez.core.content.sets.C3765c;
import com.bamtechmedia.dominguez.core.content.sets.C3778h;
import com.bamtechmedia.dominguez.core.content.sets.ContentSet;
import com.bamtechmedia.dominguez.core.content.sets.ContentSetType;
import com.bamtechmedia.dominguez.core.content.sets.ReferenceSet;
import com.bamtechmedia.dominguez.core.framework.C5741g;
import com.bamtechmedia.dominguez.core.utils.C5855o;
import com.bamtechmedia.dominguez.core.utils.C5856o0;
import com.google.common.base.Optional;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.inject.Provider;
import kotlin.TypeCastException;
import kotlin.C13145v;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12879i;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.C12881k;
import kotlin.jvm.internal.C12895y;
import kotlin.p587i0.C12775h;
import kotlin.reflect.KDeclarationContainer;
import org.reactivestreams.C14313b;
import p163g.p503n.p504a.C11792d0;
import p163g.p503n.p504a.C11793e;
import p163g.p503n.p504a.C11842x;
import p520io.reactivex.C11932e;
import p520io.reactivex.C11974s;
import p520io.reactivex.Flowable;
import p520io.reactivex.Single;
import p520io.reactivex.functions.C11952h;
import p520io.reactivex.functions.Consumer;
import p520io.reactivex.functions.Function;
import p520io.reactivex.p527w.p529c.C11992a;
import p686n.p687a.Timber;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0001>BE\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u0011\u0012\u0006\u0010\u0012\u001a\u00020\u0013¢\u0006\u0002\u0010\u0014J\u0010\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001eH\u0016J\u0010\u0010\u001f\u001a\u00020\u001c2\u0006\u0010 \u001a\u00020!H\u0002J\b\u0010\"\u001a\u00020\u001cH\u0016J\b\u0010#\u001a\u00020\u001cH\u0002J\u0010\u0010$\u001a\u00020\u001c2\u0006\u0010%\u001a\u00020&H\u0002J$\u0010'\u001a\u00020\u001c2\u0006\u0010(\u001a\u00020)2\u0012\u0010*\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u001c0+H\u0016J\u0010\u0010,\u001a\u00020\u001c2\u0006\u0010-\u001a\u00020.H\u0002J\u0010\u0010/\u001a\u00020\u001c2\u0006\u0010%\u001a\u00020&H\u0002J\u001c\u00100\u001a\u00020\u001c2\n\u00101\u001a\u0006\u0012\u0002\b\u0003022\u0006\u00103\u001a\u000204H\u0016J\u0010\u00105\u001a\u00020\u001c2\u0006\u00106\u001a\u000207H\u0002J\u0010\u00108\u001a\u00020\u001c2\u0006\u00106\u001a\u000207H\u0002J\u0016\u00109\u001a\u00020\u001c2\f\u00101\u001a\b\u0012\u0004\u0012\u00020:02H\u0016J\b\u0010;\u001a\u00020\u001cH\u0016J\u0010\u0010<\u001a\u00020\u001c2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J\u0010\u0010=\u001a\u00020\u001c2\u0006\u0010 \u001a\u00020!H\u0016R\u000e\u0010\b\u001a\u00020\tX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000e\u001a\u00020\u000fX\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0017\u001a\u00020\u00188BX\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001aR\u000e\u0010\u0012\u001a\u00020\u0013X\u0004¢\u0006\u0002\n\u0000¨\u0006?"}, mo31007d2 = {"Lcom/bamtechmedia/dominguez/collections/CollectionViewModelImpl;", "Lcom/bamtechmedia/dominguez/core/framework/ReactiveViewModel;", "Lcom/bamtechmedia/dominguez/collections/CollectionViewModel$State;", "Lcom/bamtechmedia/dominguez/collections/CollectionViewModel;", "repository", "Lcom/bamtechmedia/dominguez/core/content/collections/CollectionsRepository;", "contentSetRepository", "Lcom/bamtechmedia/dominguez/core/content/sets/ContentSetDataSource;", "collectionConfigResolver", "Lcom/bamtechmedia/dominguez/collections/config/CollectionConfigResolver;", "offlineState", "Lcom/bamtechmedia/dominguez/core/OfflineState;", "collectionInvalidator", "Lcom/bamtechmedia/dominguez/collections/CollectionInvalidator;", "slug", "Lcom/bamtechmedia/dominguez/core/content/collections/Slug;", "refreshManager", "Lcom/bamtechmedia/dominguez/collections/caching/RefreshManager;", "transactionIdProvider", "Lcom/bamtechmedia/dominguez/analytics/TransactionIdProvider;", "(Lcom/bamtechmedia/dominguez/core/content/collections/CollectionsRepository;Lcom/bamtechmedia/dominguez/core/content/sets/ContentSetDataSource;Lcom/bamtechmedia/dominguez/collections/config/CollectionConfigResolver;Lcom/bamtechmedia/dominguez/core/OfflineState;Lcom/bamtechmedia/dominguez/collections/CollectionInvalidator;Lcom/bamtechmedia/dominguez/core/content/collections/Slug;Lcom/bamtechmedia/dominguez/collections/caching/RefreshManager;Lcom/bamtechmedia/dominguez/analytics/TransactionIdProvider;)V", "getSlug", "()Lcom/bamtechmedia/dominguez/core/content/collections/Slug;", "transactionId", "", "getTransactionId", "()Ljava/lang/String;", "filterAssets", "", "filter", "Lcom/bamtechmedia/dominguez/collections/CollectionFilter;", "forceRefreshReferenceSetsOfType", "contentSetType", "Lcom/bamtechmedia/dominguez/core/content/sets/ContentSetType;", "invalidateCollection", "loadCollection", "loadNoContentExpectedSets", "collection", "Lcom/bamtechmedia/dominguez/core/content/collections/Collection;", "observeUntilOnStop", "owner", "Landroidx/lifecycle/LifecycleOwner;", "consumer", "Lkotlin/Function1;", "onCollectionFailed", "throwable", "", "onCollectionLoaded", "onPageItemBound", "list", "Lcom/bamtechmedia/dominguez/core/content/paging/PagedList;", "pagedListPosition", "", "onSetLoaded", "set", "Lcom/bamtechmedia/dominguez/core/content/sets/ContentSet;", "onSetUpdated", "onShelfItemBound", "Lcom/bamtechmedia/dominguez/core/content/assets/Asset;", "refresh", "syncCollectionsByCache", "syncContentSetByCache", "Factory", "collections_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* renamed from: com.bamtechmedia.dominguez.collections.r */
/* compiled from: CollectionViewModelImpl.kt */
public final class C3457r extends C5741g<C3456b> implements C3454q {
    /* access modifiers changed from: private */

    /* renamed from: U */
    public final C3765c f8723U;
    /* access modifiers changed from: private */

    /* renamed from: V */
    public final C3439e f8724V;
    /* access modifiers changed from: private */

    /* renamed from: W */
    public final C3796d f8725W;

    /* renamed from: X */
    private final C3419l f8726X;

    /* renamed from: Y */
    private final C3676k f8727Y;
    /* access modifiers changed from: private */

    /* renamed from: Z */
    public final C3314g f8728Z;

    /* renamed from: a0 */
    private final C2366i0 f8729a0;

    /* renamed from: c */
    private final C3667h f8730c;

    /* renamed from: com.bamtechmedia.dominguez.collections.r$a */
    /* compiled from: CollectionViewModelImpl.kt */
    static final class C3458a<T> implements Consumer<ContentSetType> {

        /* renamed from: c */
        final /* synthetic */ C3457r f8731c;

        C3458a(C3457r rVar) {
            this.f8731c = rVar;
        }

        /* renamed from: a */
        public final void accept(ContentSetType contentSetType) {
            C3457r rVar = this.f8731c;
            Intrinsics.checkReturnedValueIsNotNull((Object) contentSetType, "it");
            rVar.m11816d(contentSetType);
        }
    }

    /* renamed from: com.bamtechmedia.dominguez.collections.r$b */
    /* compiled from: CollectionViewModelImpl.kt */
    static final class C3459b<T> implements Consumer<Throwable> {

        /* renamed from: c */
        public static final C3459b f8732c = new C3459b();

        C3459b() {
        }

        /* renamed from: a */
        public final void accept(Throwable th) {
        }
    }

    /* renamed from: com.bamtechmedia.dominguez.collections.r$c */
    /* compiled from: CollectionViewModelImpl.kt */
    static final class C3460c<T> implements C11952h<C3676k> {

        /* renamed from: c */
        final /* synthetic */ C3457r f8733c;

        C3460c(C3457r rVar) {
            this.f8733c = rVar;
        }

        /* renamed from: a */
        public final boolean test(C3676k kVar) {
            return Intrinsics.areEqual((Object) kVar, (Object) this.f8733c.mo12649b());
        }
    }

    /* renamed from: com.bamtechmedia.dominguez.collections.r$d */
    /* compiled from: CollectionViewModelImpl.kt */
    static final class C3461d<T, R> implements Function<T, R> {

        /* renamed from: c */
        public static final C3461d f8734c = new C3461d();

        C3461d() {
        }

        /* renamed from: a */
        public final void mo12667a(C3676k kVar) {
        }

        public /* bridge */ /* synthetic */ Object apply(Object obj) {
            mo12667a((C3676k) obj);
            return C13145v.f29587a;
        }
    }

    /* renamed from: com.bamtechmedia.dominguez.collections.r$e */
    /* compiled from: CollectionViewModelImpl.kt */
    static final class C3462e<T> implements Consumer<C13145v> {

        /* renamed from: c */
        final /* synthetic */ C3457r f8735c;

        C3462e(C3457r rVar) {
            this.f8735c = rVar;
        }

        /* renamed from: a */
        public final void accept(C13145v vVar) {
            this.f8735c.mo12650d();
        }
    }

    /* renamed from: com.bamtechmedia.dominguez.collections.r$f */
    /* compiled from: CollectionViewModelImpl.kt */
    static final class C3463f<T> implements Consumer<Throwable> {

        /* renamed from: c */
        public static final C3463f f8736c = new C3463f();

        C3463f() {
        }

        /* renamed from: a */
        public final void mo12669a(Throwable th) {
            Intrinsics.checkReturnedValueIsNotNull((Object) th, "it");
            throw th;
        }

        public /* bridge */ /* synthetic */ void accept(Object obj) {
            mo12669a((Throwable) obj);
            throw null;
        }
    }

    @Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001Bi\b\u0007\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u0003\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u0003\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u0003\u0012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e\u0012\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\u0003¢\u0006\u0002\u0010\u0012J\u0015\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0016H\u0000¢\u0006\u0002\b\u0017J\u0018\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u0015\u001a\u00020\u0016H\u0016R\u0014\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u0003X\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u0003X\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003X\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u0003X\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eX\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\u001c"}, mo31007d2 = {"Lcom/bamtechmedia/dominguez/collections/CollectionViewModelImpl$Factory;", "Lcom/bamtechmedia/dominguez/collections/CollectionViewModel$Factory;", "collectionsRepositoryProvider", "Ljavax/inject/Provider;", "Lcom/bamtechmedia/dominguez/core/content/collections/CollectionsRepository;", "contentSetRepositoryProvider", "Lcom/bamtechmedia/dominguez/core/content/sets/ContentSetDataSource;", "collectionsConfigResolverProvider", "Lcom/bamtechmedia/dominguez/collections/config/CollectionConfigResolver;", "collectionInvalidatorProvider", "Lcom/bamtechmedia/dominguez/collections/CollectionInvalidator;", "offlineStateProvider", "Lcom/bamtechmedia/dominguez/core/OfflineState;", "refreshManager", "Lcom/google/common/base/Optional;", "Lcom/bamtechmedia/dominguez/collections/caching/RefreshManager;", "transactionIdProvider", "Lcom/bamtechmedia/dominguez/analytics/TransactionIdProvider;", "(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Lcom/google/common/base/Optional;Ljavax/inject/Provider;)V", "create", "Lcom/bamtechmedia/dominguez/collections/CollectionViewModelImpl;", "slug", "Lcom/bamtechmedia/dominguez/core/content/collections/Slug;", "create$collections_release", "get", "Lcom/bamtechmedia/dominguez/collections/CollectionViewModel;", "fragment", "Landroidx/fragment/app/Fragment;", "collections_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
    /* renamed from: com.bamtechmedia.dominguez.collections.r$g */
    /* compiled from: CollectionViewModelImpl.kt */
    public static final class C3464g implements C3455a {

        /* renamed from: a */
        private final Provider<C3667h> f8737a;

        /* renamed from: b */
        private final Provider<C3765c> f8738b;

        /* renamed from: c */
        private final Provider<C3439e> f8739c;

        /* renamed from: d */
        private final Provider<C3419l> f8740d;

        /* renamed from: e */
        private final Provider<C3796d> f8741e;

        /* renamed from: f */
        private final Optional<C3314g> f8742f;

        /* renamed from: g */
        private final Provider<C2366i0> f8743g;

        /* renamed from: com.bamtechmedia.dominguez.collections.r$g$a */
        /* compiled from: ViewModelUtilsExt.kt */
        public static final class C3465a<T> implements Provider<T> {

            /* renamed from: a */
            final /* synthetic */ C3464g f8744a;

            /* renamed from: b */
            final /* synthetic */ C3676k f8745b;

            public C3465a(C3464g gVar, C3676k kVar) {
                this.f8744a = gVar;
                this.f8745b = kVar;
            }

            public final T get() {
                return this.f8744a.mo12670a(this.f8745b);
            }
        }

        public C3464g(Provider<C3667h> provider, Provider<C3765c> provider2, Provider<C3439e> provider3, Provider<C3419l> provider4, Provider<C3796d> provider5, Optional<C3314g> optional, Provider<C2366i0> provider6) {
            this.f8737a = provider;
            this.f8738b = provider2;
            this.f8739c = provider3;
            this.f8740d = provider4;
            this.f8741e = provider5;
            this.f8742f = optional;
            this.f8743g = provider6;
        }

        /* renamed from: a */
        public final C3457r mo12670a(C3676k kVar) {
            Object obj = this.f8737a.get();
            Intrinsics.checkReturnedValueIsNotNull(obj, "collectionsRepositoryProvider.get()");
            C3667h hVar = (C3667h) obj;
            Object obj2 = this.f8738b.get();
            Intrinsics.checkReturnedValueIsNotNull(obj2, "contentSetRepositoryProvider.get()");
            C3765c cVar = (C3765c) obj2;
            Object obj3 = this.f8739c.get();
            Intrinsics.checkReturnedValueIsNotNull(obj3, "collectionsConfigResolverProvider.get()");
            C3439e eVar = (C3439e) obj3;
            Object obj4 = this.f8741e.get();
            Intrinsics.checkReturnedValueIsNotNull(obj4, "offlineStateProvider.get()");
            C3796d dVar = (C3796d) obj4;
            Object obj5 = this.f8740d.get();
            Intrinsics.checkReturnedValueIsNotNull(obj5, "collectionInvalidatorProvider.get()");
            C3419l lVar = (C3419l) obj5;
            Object a = this.f8742f.mo27104a();
            Intrinsics.checkReturnedValueIsNotNull(a, "refreshManager.get()");
            C3314g gVar = (C3314g) a;
            Object obj6 = this.f8743g.get();
            Intrinsics.checkReturnedValueIsNotNull(obj6, "transactionIdProvider.get()");
            C3457r rVar = new C3457r(hVar, cVar, eVar, dVar, lVar, kVar, gVar, (C2366i0) obj6);
            return rVar;
        }

        /* renamed from: a */
        public C3454q mo12651a(Fragment fragment, C3676k kVar) {
            C0741y a = C5856o0.m18893a(fragment, C3457r.class, (Provider<T>) new C3465a<T>(this, kVar));
            Intrinsics.checkReturnedValueIsNotNull((Object) a, "ViewModelUtils.getViewMo…:class.java) { create() }");
            return (C3454q) a;
        }
    }

    /* renamed from: com.bamtechmedia.dominguez.collections.r$h */
    /* compiled from: CollectionViewModelImpl.kt */
    static final class C3466h extends C12881k implements Function1<C3456b, C3456b> {

        /* renamed from: c */
        final /* synthetic */ C3333i f8746c;

        C3466h(C3333i iVar) {
            this.f8746c = iVar;
            super(1);
        }

        /* renamed from: a */
        public final C3456b invoke(C3456b bVar) {
            return C3456b.m11793a(bVar, null, this.f8746c, null, false, false, null, 61, null);
        }
    }

    @Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, mo31007d2 = {"<anonymous>", "", "state", "Lcom/bamtechmedia/dominguez/collections/CollectionViewModel$State;", "invoke"}, mo31008k = 3, mo31009mv = {1, 1, 15})
    /* renamed from: com.bamtechmedia.dominguez.collections.r$i */
    /* compiled from: CollectionViewModelImpl.kt */
    static final class C3467i extends C12881k implements Function1<C3456b, C13145v> {

        /* renamed from: U */
        final /* synthetic */ ContentSetType f8747U;

        /* renamed from: c */
        final /* synthetic */ C3457r f8748c;

        /* renamed from: com.bamtechmedia.dominguez.collections.r$i$a */
        /* compiled from: CollectionViewModelImpl.kt */
        static final /* synthetic */ class C3468a extends C12879i implements Function1<ContentSet, C13145v> {
            C3468a(C3457r rVar) {
                super(1, rVar);
            }

            /* renamed from: a */
            public final void mo12673a(ContentSet contentSet) {
                ((C3457r) this.receiver).m11813b(contentSet);
            }

            public final String getName() {
                return "onSetUpdated";
            }

            public final KDeclarationContainer getOwner() {
                return C12895y.m40230a(C3457r.class);
            }

            public final String getSignature() {
                return "onSetUpdated(Lcom/bamtechmedia/dominguez/core/content/sets/ContentSet;)V";
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                mo12673a((ContentSet) obj);
                return C13145v.f29587a;
            }
        }

        /* renamed from: com.bamtechmedia.dominguez.collections.r$i$b */
        /* compiled from: CollectionViewModelImpl.kt */
        static final /* synthetic */ class C3469b extends C12879i implements Function1<Throwable, C13145v> {

            /* renamed from: c */
            public static final C3469b f8749c = new C3469b();

            C3469b() {
                super(1);
            }

            /* renamed from: a */
            public final void mo12674a(Throwable th) {
                Timber.m44523a(th);
            }

            public final String getName() {
                return "e";
            }

            public final KDeclarationContainer getOwner() {
                return C12895y.m40230a(Timber.class);
            }

            public final String getSignature() {
                return "e(Ljava/lang/Throwable;)V";
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                mo12674a((Throwable) obj);
                return C13145v.f29587a;
            }
        }

        C3467i(C3457r rVar, ContentSetType contentSetType) {
            this.f8748c = rVar;
            this.f8747U = contentSetType;
            super(1);
        }

        /* renamed from: a */
        public final void mo12672a(C3456b bVar) {
            C3658a a = bVar.mo12653a();
            if (a != null) {
                List<Container> O = a.mo13343O();
                ArrayList arrayList = new ArrayList(C13187p.m40525a((Iterable) O, 10));
                for (Container a2 : O) {
                    arrayList.add(a2.mo13400a());
                }
                ArrayList<C3778h> arrayList2 = new ArrayList<>();
                Iterator it = arrayList.iterator();
                while (true) {
                    boolean z = true;
                    if (!it.hasNext()) {
                        break;
                    }
                    Object next = it.next();
                    if (((C3778h) next).mo13604b() != this.f8747U) {
                        z = false;
                    }
                    if (z) {
                        arrayList2.add(next);
                    }
                }
                for (C3778h hVar : arrayList2) {
                    Single a3 = this.f8748c.f8723U.mo13659a(hVar.mo13604b(), hVar.mo13608e(), this.f8748c.m11819y(), true).mo30211a(C11992a.m38600a());
                    Intrinsics.checkReturnedValueIsNotNull((Object) a3, "contentSetRepository.get…dSchedulers.mainThread())");
                    Object a4 = a3.mo30215a((C11974s<T, ? extends R>) C11793e.m37930a(this.f8748c.getViewModelScope()));
                    Intrinsics.checkReturnedValueIsNotNull(a4, "this.`as`(AutoDispose.autoDisposable(provider))");
                    C11792d0 d0Var = (C11792d0) a4;
                    C3488t tVar = new C3488t(new C3468a(this.f8748c));
                    Function1 function1 = C3469b.f8749c;
                    d0Var.mo29920a(tVar, (Consumer) (function1 != 0 ? new C3488t(function1) : function1));
                }
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo12672a((C3456b) obj);
            return C13145v.f29587a;
        }
    }

    /* renamed from: com.bamtechmedia.dominguez.collections.r$j */
    /* compiled from: CollectionViewModelImpl.kt */
    static final /* synthetic */ class C3470j extends C12879i implements Function1<C3658a, C13145v> {
        C3470j(C3457r rVar) {
            super(1, rVar);
        }

        /* renamed from: a */
        public final void mo12675a(C3658a aVar) {
            ((C3457r) this.receiver).m11812b(aVar);
        }

        public final String getName() {
            return "onCollectionLoaded";
        }

        public final KDeclarationContainer getOwner() {
            return C12895y.m40230a(C3457r.class);
        }

        public final String getSignature() {
            return "onCollectionLoaded(Lcom/bamtechmedia/dominguez/core/content/collections/Collection;)V";
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo12675a((C3658a) obj);
            return C13145v.f29587a;
        }
    }

    /* renamed from: com.bamtechmedia.dominguez.collections.r$k */
    /* compiled from: CollectionViewModelImpl.kt */
    static final /* synthetic */ class C3471k extends C12879i implements Function1<Throwable, C13145v> {
        C3471k(C3457r rVar) {
            super(1, rVar);
        }

        /* renamed from: a */
        public final void mo12676a(Throwable th) {
            ((C3457r) this.receiver).m11809a(th);
        }

        public final String getName() {
            return "onCollectionFailed";
        }

        public final KDeclarationContainer getOwner() {
            return C12895y.m40230a(C3457r.class);
        }

        public final String getSignature() {
            return "onCollectionFailed(Ljava/lang/Throwable;)V";
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo12676a((Throwable) obj);
            return C13145v.f29587a;
        }
    }

    /* renamed from: com.bamtechmedia.dominguez.collections.r$l */
    /* compiled from: _Sequences.kt */
    public static final class C3472l extends C12881k implements Function1<Object, Boolean> {

        /* renamed from: c */
        public static final C3472l f8750c = new C3472l();

        public C3472l() {
            super(1);
        }

        public final boolean invoke(Object obj) {
            return obj instanceof ReferenceSet;
        }
    }

    /* renamed from: com.bamtechmedia.dominguez.collections.r$m */
    /* compiled from: CollectionViewModelImpl.kt */
    static final class C3473m extends C12881k implements Function1<Container, C3778h> {

        /* renamed from: c */
        public static final C3473m f8751c = new C3473m();

        C3473m() {
            super(1);
        }

        /* renamed from: a */
        public final C3778h invoke(Container container) {
            return container.mo13400a();
        }
    }

    /* renamed from: com.bamtechmedia.dominguez.collections.r$n */
    /* compiled from: CollectionViewModelImpl.kt */
    static final class C3474n extends C12881k implements Function1<ReferenceSet, Boolean> {

        /* renamed from: c */
        public static final C3474n f8752c = new C3474n();

        C3474n() {
            super(1);
        }

        /* renamed from: a */
        public final boolean mo12678a(ReferenceSet referenceSet) {
            return referenceSet.mo13635j() == AvailabilityHint.NO_CONTENT;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return Boolean.valueOf(mo12678a((ReferenceSet) obj));
        }
    }

    /* renamed from: com.bamtechmedia.dominguez.collections.r$o */
    /* compiled from: CollectionViewModelImpl.kt */
    static final class C3475o extends C12881k implements Function1<ReferenceSet, C13145v> {

        /* renamed from: c */
        final /* synthetic */ C3457r f8753c;

        C3475o(C3457r rVar) {
            this.f8753c = rVar;
            super(1);
        }

        /* renamed from: a */
        public final void mo12679a(ReferenceSet referenceSet) {
            this.f8753c.mo12479a((C3700c<? extends C3626b>) referenceSet);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo12679a((ReferenceSet) obj);
            return C13145v.f29587a;
        }
    }

    /* renamed from: com.bamtechmedia.dominguez.collections.r$p */
    /* compiled from: CollectionViewModelImpl.kt */
    static final class C3476p extends C12881k implements Function1<C3456b, C3456b> {

        /* renamed from: U */
        final /* synthetic */ Throwable f8754U;

        /* renamed from: c */
        final /* synthetic */ C3457r f8755c;

        C3476p(C3457r rVar, Throwable th) {
            this.f8755c = rVar;
            this.f8754U = th;
            super(1);
        }

        /* renamed from: a */
        public final C3456b invoke(C3456b bVar) {
            return C3456b.m11793a(bVar, null, null, null, false, !this.f8755c.f8725W.mo13695j(), this.f8754U, 7, null);
        }
    }

    /* renamed from: com.bamtechmedia.dominguez.collections.r$q */
    /* compiled from: CollectionViewModelImpl.kt */
    static final /* synthetic */ class C3477q extends C12879i implements Function0<C13145v> {
        C3477q(C3457r rVar) {
            super(0, rVar);
        }

        public final String getName() {
            return "loadCollection";
        }

        public final KDeclarationContainer getOwner() {
            return C12895y.m40230a(C3457r.class);
        }

        public final String getSignature() {
            return "loadCollection()V";
        }

        public final void invoke() {
            ((C3457r) this.receiver).m11820z();
        }
    }

    /* renamed from: com.bamtechmedia.dominguez.collections.r$r */
    /* compiled from: CollectionViewModelImpl.kt */
    static final /* synthetic */ class C3478r extends C12879i implements Function1<Throwable, C13145v> {

        /* renamed from: c */
        public static final C3478r f8756c = new C3478r();

        C3478r() {
            super(1);
        }

        /* renamed from: a */
        public final void mo12681a(Throwable th) {
            Timber.m44523a(th);
        }

        public final String getName() {
            return "e";
        }

        public final KDeclarationContainer getOwner() {
            return C12895y.m40230a(Timber.class);
        }

        public final String getSignature() {
            return "e(Ljava/lang/Throwable;)V";
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo12681a((Throwable) obj);
            return C13145v.f29587a;
        }
    }

    /* renamed from: com.bamtechmedia.dominguez.collections.r$s */
    /* compiled from: CollectionViewModelImpl.kt */
    static final class C3479s extends C12881k implements Function1<C3456b, C3456b> {

        /* renamed from: U */
        final /* synthetic */ C3658a f8757U;

        /* renamed from: c */
        final /* synthetic */ C3457r f8758c;

        C3479s(C3457r rVar, C3658a aVar) {
            this.f8758c = rVar;
            this.f8757U = aVar;
            super(1);
        }

        /* renamed from: a */
        public final C3456b invoke(C3456b bVar) {
            return C3456b.m11793a(bVar, this.f8757U, null, this.f8758c.f8724V.mo12614a(this.f8757U.mo13344P()), false, false, null, 2, null);
        }
    }

    /* renamed from: com.bamtechmedia.dominguez.collections.r$t */
    /* compiled from: CollectionViewModelImpl.kt */
    static final /* synthetic */ class C3480t extends C12879i implements Function1<ContentSet, C13145v> {
        C3480t(C3457r rVar) {
            super(1, rVar);
        }

        /* renamed from: a */
        public final void mo12683a(ContentSet contentSet) {
            ((C3457r) this.receiver).m11808a(contentSet);
        }

        public final String getName() {
            return "onSetLoaded";
        }

        public final KDeclarationContainer getOwner() {
            return C12895y.m40230a(C3457r.class);
        }

        public final String getSignature() {
            return "onSetLoaded(Lcom/bamtechmedia/dominguez/core/content/sets/ContentSet;)V";
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo12683a((ContentSet) obj);
            return C13145v.f29587a;
        }
    }

    /* renamed from: com.bamtechmedia.dominguez.collections.r$u */
    /* compiled from: CollectionViewModelImpl.kt */
    static final /* synthetic */ class C3481u extends C12879i implements Function1<Throwable, C13145v> {

        /* renamed from: c */
        public static final C3481u f8759c = new C3481u();

        C3481u() {
            super(1);
        }

        /* renamed from: a */
        public final void mo12684a(Throwable th) {
            Timber.m44523a(th);
        }

        public final String getName() {
            return "e";
        }

        public final KDeclarationContainer getOwner() {
            return C12895y.m40230a(Timber.class);
        }

        public final String getSignature() {
            return "e(Ljava/lang/Throwable;)V";
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo12684a((Throwable) obj);
            return C13145v.f29587a;
        }
    }

    /* renamed from: com.bamtechmedia.dominguez.collections.r$v */
    /* compiled from: CollectionViewModelImpl.kt */
    static final class C3482v extends C12881k implements Function1<C3456b, C3456b> {

        /* renamed from: c */
        final /* synthetic */ ContentSet f8760c;

        C3482v(ContentSet contentSet) {
            this.f8760c = contentSet;
            super(1);
        }

        /* renamed from: a */
        public final C3456b invoke(C3456b bVar) {
            C3658a a = bVar.mo12653a();
            return C3456b.m11793a(bVar, a != null ? a.mo13354a(C13186o0.m40524a(this.f8760c)) : null, null, null, false, false, null, 62, null);
        }
    }

    /* renamed from: com.bamtechmedia.dominguez.collections.r$w */
    /* compiled from: CollectionViewModelImpl.kt */
    static final class C3483w extends C12881k implements Function1<C3456b, C3456b> {

        /* renamed from: U */
        final /* synthetic */ ContentSet f8761U;

        /* renamed from: c */
        final /* synthetic */ C3457r f8762c;

        C3483w(C3457r rVar, ContentSet contentSet) {
            this.f8762c = rVar;
            this.f8761U = contentSet;
            super(1);
        }

        /* renamed from: a */
        public final C3456b invoke(C3456b bVar) {
            this.f8762c.f8728Z.mo12335a(this.f8761U.mo13604b());
            C3658a a = bVar.mo12653a();
            return C3456b.m11793a(bVar, a != null ? a.mo13354a(C13186o0.m40524a(this.f8761U)) : null, null, null, false, false, null, 62, null);
        }
    }

    /* renamed from: com.bamtechmedia.dominguez.collections.r$x */
    /* compiled from: CollectionViewModelImpl.kt */
    static final /* synthetic */ class C3484x extends C12879i implements Function1<ContentSet, C13145v> {
        C3484x(C3457r rVar) {
            super(1, rVar);
        }

        /* renamed from: a */
        public final void mo12687a(ContentSet contentSet) {
            ((C3457r) this.receiver).m11808a(contentSet);
        }

        public final String getName() {
            return "onSetLoaded";
        }

        public final KDeclarationContainer getOwner() {
            return C12895y.m40230a(C3457r.class);
        }

        public final String getSignature() {
            return "onSetLoaded(Lcom/bamtechmedia/dominguez/core/content/sets/ContentSet;)V";
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo12687a((ContentSet) obj);
            return C13145v.f29587a;
        }
    }

    /* renamed from: com.bamtechmedia.dominguez.collections.r$y */
    /* compiled from: CollectionViewModelImpl.kt */
    static final /* synthetic */ class C3485y extends C12879i implements Function1<Throwable, C13145v> {

        /* renamed from: c */
        public static final C3485y f8763c = new C3485y();

        C3485y() {
            super(1);
        }

        /* renamed from: a */
        public final void mo12688a(Throwable th) {
            Timber.m44523a(th);
        }

        public final String getName() {
            return "e";
        }

        public final KDeclarationContainer getOwner() {
            return C12895y.m40230a(Timber.class);
        }

        public final String getSignature() {
            return "e(Ljava/lang/Throwable;)V";
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo12688a((Throwable) obj);
            return C13145v.f29587a;
        }
    }

    /* renamed from: com.bamtechmedia.dominguez.collections.r$z */
    /* compiled from: CollectionViewModelImpl.kt */
    static final class C3486z extends C12881k implements Function1<C3456b, C3456b> {

        /* renamed from: c */
        public static final C3486z f8764c = new C3486z();

        C3486z() {
            super(1);
        }

        /* renamed from: a */
        public final C3456b invoke(C3456b bVar) {
            return C3456b.m11793a(bVar, null, null, null, true, false, null, 55, null);
        }
    }

    public C3457r(C3667h hVar, C3765c cVar, C3439e eVar, C3796d dVar, C3419l lVar, C3676k kVar, C3314g gVar, C2366i0 i0Var) {
        super(null, 1, null);
        this.f8730c = hVar;
        this.f8723U = cVar;
        this.f8724V = eVar;
        this.f8725W = dVar;
        this.f8726X = lVar;
        this.f8727Y = kVar;
        this.f8728Z = gVar;
        this.f8729a0 = i0Var;
        Object a = this.f8726X.mo12593a().mo30079a((C11932e<T, ? extends R>) C11793e.m37930a(getViewModelScope()));
        String str = "this.`as`(AutoDispose.autoDisposable(provider))";
        Intrinsics.checkReturnedValueIsNotNull(a, str);
        ((C11842x) a).mo29927a(new C3458a(this), C3459b.f8732c);
        Flowable a2 = this.f8726X.mo12597c().mo30069a((C11952h<? super T>) new C3460c<Object>(this)).mo30097e(C3461d.f8734c).mo30074a((C14313b<? extends T>) this.f8726X.mo12596b());
        Intrinsics.checkReturnedValueIsNotNull((Object) a2, "collectionInvalidator.in…or.invalidateAllStream())");
        Object a3 = a2.mo30079a((C11932e<T, ? extends R>) C11793e.m37930a(getViewModelScope()));
        Intrinsics.checkReturnedValueIsNotNull(a3, str);
        ((C11842x) a3).mo29927a(new C3462e(this), C3463f.f8736c);
        C3456b bVar = new C3456b(null, null, null, true, false, null, 55, null);
        createState(bVar);
        m11820z();
    }

    /* access modifiers changed from: private */
    /* renamed from: y */
    public final String m11819y() {
        return C2367a.m8888a(this.f8729a0, mo12649b().mo13376Z(), false, 2, null);
    }

    /* access modifiers changed from: private */
    /* renamed from: z */
    public final void m11820z() {
        C5855o oVar = C5855o.f13640a;
        Object a = this.f8730c.mo13367a(mo12649b()).mo30215a((C11974s<T, ? extends R>) C11793e.m37930a(getViewModelScope()));
        Intrinsics.checkReturnedValueIsNotNull(a, "this.`as`(AutoDispose.autoDisposable(provider))");
        ((C11792d0) a).mo29920a(new C3488t(new C3470j(this)), new C3488t(new C3471k(this)));
    }

    /* renamed from: d */
    public void mo12650d() {
        updateState(C3486z.f8764c);
        m11820z();
    }

    /* renamed from: b */
    public C3676k mo12649b() {
        return this.f8727Y;
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public final void m11812b(C3658a aVar) {
        updateState(new C3479s(this, aVar));
        C13145v vVar = C13145v.f29587a;
        m11807a(aVar);
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public final void m11816d(ContentSetType contentSetType) {
        withState(new C3467i(this, contentSetType));
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public final void m11813b(ContentSet contentSet) {
        updateState(new C3483w(this, contentSet));
    }

    /* renamed from: a */
    public void mo12648a(C3676k kVar) {
        this.f8728Z.mo12334a(kVar);
    }

    /* renamed from: a */
    public void mo12646a(C0722m mVar, Function1<? super C3456b, C13145v> function1) {
        C5741g.observeInLifecycle$default(this, mVar, null, null, function1, 6, null);
    }

    /* renamed from: a */
    public void mo12647a(C3333i iVar) {
        updateState(new C3466h(iVar));
    }

    /* renamed from: a */
    private final void m11807a(C3658a aVar) {
        C12775h a = C12788p.m39989a(C12788p.m39994d(C13199w.m40577c((Iterable) aVar.mo13343O()), C3473m.f8751c), (Function1) C3472l.f8750c);
        if (a != null) {
            C12788p.m39998f(C12788p.m39989a(a, (Function1) C3474n.f8752c), new C3475o(this));
            return;
        }
        throw new TypeCastException("null cannot be cast to non-null type kotlin.sequences.Sequence<R>");
    }

    /* JADX WARNING: type inference failed for: r0v5, types: [kotlin.jvm.functions.Function1, com.bamtechmedia.dominguez.collections.r$r] */
    /* JADX WARNING: type inference failed for: r0v6 */
    /* JADX WARNING: type inference failed for: r2v0, types: [com.bamtechmedia.dominguez.collections.t] */
    /* JADX WARNING: type inference failed for: r0v8 */
    /* access modifiers changed from: private */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 2 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void m11809a(java.lang.Throwable r4) {
        /*
            r3 = this;
            com.bamtechmedia.dominguez.collections.r$p r0 = new com.bamtechmedia.dominguez.collections.r$p
            r0.<init>(r3, r4)
            r3.updateState(r0)
            com.bamtechmedia.dominguez.core.d r4 = r3.f8725W
            boolean r4 = r4.mo13695j()
            if (r4 != 0) goto L_0x0042
            com.bamtechmedia.dominguez.core.d r4 = r3.f8725W
            io.reactivex.Completable r4 = r4.mo13697n()
            g.n.a.c0 r0 = r3.getViewModelScope()
            g.n.a.h r0 = p163g.p503n.p504a.C11793e.m37930a(r0)
            java.lang.Object r4 = r4.mo30048a(r0)
            java.lang.String r0 = "this.`as`(AutoDispose.au…isposable<Any>(provider))"
            kotlin.jvm.internal.Intrinsics.checkReturnedValueIsNotNull(r4, r0)
            g.n.a.v r4 = (p163g.p503n.p504a.C11839v) r4
            com.bamtechmedia.dominguez.collections.r$q r0 = new com.bamtechmedia.dominguez.collections.r$q
            r0.<init>(r3)
            com.bamtechmedia.dominguez.collections.s r1 = new com.bamtechmedia.dominguez.collections.s
            r1.<init>(r0)
            com.bamtechmedia.dominguez.collections.r$r r0 = com.bamtechmedia.dominguez.collections.C3457r.C3478r.f8756c
            if (r0 == 0) goto L_0x003d
            com.bamtechmedia.dominguez.collections.t r2 = new com.bamtechmedia.dominguez.collections.t
            r2.<init>(r0)
            r0 = r2
        L_0x003d:
            io.reactivex.functions.Consumer r0 = (p520io.reactivex.functions.Consumer) r0
            r4.mo29926a(r1, r0)
        L_0x0042:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bamtechmedia.dominguez.collections.C3457r.m11809a(java.lang.Throwable):void");
    }

    /* JADX WARNING: type inference failed for: r0v5, types: [com.bamtechmedia.dominguez.collections.r$y, kotlin.jvm.functions.Function1] */
    /* JADX WARNING: type inference failed for: r0v6 */
    /* JADX WARNING: type inference failed for: r2v1, types: [com.bamtechmedia.dominguez.collections.t] */
    /* JADX WARNING: type inference failed for: r0v8 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 2 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo12479a(com.bamtechmedia.dominguez.core.content.paging.C3700c<? extends com.bamtechmedia.dominguez.core.content.assets.C3626b> r9) {
        /*
            r8 = this;
            boolean r0 = r9 instanceof com.bamtechmedia.dominguez.core.content.sets.ReferenceSet
            if (r0 == 0) goto L_0x0048
            com.bamtechmedia.dominguez.core.content.sets.c r1 = r8.f8723U
            com.bamtechmedia.dominguez.core.content.sets.ReferenceSet r9 = (com.bamtechmedia.dominguez.core.content.sets.ReferenceSet) r9
            com.bamtechmedia.dominguez.core.content.sets.ContentSetType r2 = r9.mo13604b()
            java.lang.String r3 = r9.mo13608e()
            java.lang.String r4 = r8.m11819y()
            r5 = 0
            r6 = 8
            r7 = 0
            io.reactivex.Single r9 = com.bamtechmedia.dominguez.core.content.sets.C3765c.C3767b.m12769a(r1, r2, r3, r4, r5, r6, r7)
            g.n.a.c0 r0 = r8.getViewModelScope()
            g.n.a.h r0 = p163g.p503n.p504a.C11793e.m37930a(r0)
            java.lang.Object r9 = r9.mo30215a(r0)
            java.lang.String r0 = "this.`as`(AutoDispose.autoDisposable(provider))"
            kotlin.jvm.internal.Intrinsics.checkReturnedValueIsNotNull(r9, r0)
            g.n.a.d0 r9 = (p163g.p503n.p504a.C11792d0) r9
            com.bamtechmedia.dominguez.collections.r$x r0 = new com.bamtechmedia.dominguez.collections.r$x
            r0.<init>(r8)
            com.bamtechmedia.dominguez.collections.t r1 = new com.bamtechmedia.dominguez.collections.t
            r1.<init>(r0)
            com.bamtechmedia.dominguez.collections.r$y r0 = com.bamtechmedia.dominguez.collections.C3457r.C3485y.f8763c
            if (r0 == 0) goto L_0x0043
            com.bamtechmedia.dominguez.collections.t r2 = new com.bamtechmedia.dominguez.collections.t
            r2.<init>(r0)
            r0 = r2
        L_0x0043:
            io.reactivex.functions.Consumer r0 = (p520io.reactivex.functions.Consumer) r0
            r9.mo29920a(r1, r0)
        L_0x0048:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bamtechmedia.dominguez.collections.C3457r.mo12479a(com.bamtechmedia.dominguez.core.content.paging.c):void");
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final void m11808a(ContentSet contentSet) {
        updateState(new C3482v(contentSet));
    }

    /* JADX WARNING: type inference failed for: r10v8, types: [com.bamtechmedia.dominguez.collections.r$u, kotlin.jvm.functions.Function1] */
    /* JADX WARNING: type inference failed for: r10v9 */
    /* JADX WARNING: type inference failed for: r1v1, types: [com.bamtechmedia.dominguez.collections.t] */
    /* JADX WARNING: type inference failed for: r10v11 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 2 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo12663a(com.bamtechmedia.dominguez.core.content.paging.C3700c<?> r9, int r10) {
        /*
            r8 = this;
            boolean r0 = r9 instanceof com.bamtechmedia.dominguez.core.content.sets.ContentSet
            if (r0 == 0) goto L_0x0058
            java.lang.Object r0 = r8.getCurrentState()
            com.bamtechmedia.dominguez.collections.q$b r0 = (com.bamtechmedia.dominguez.collections.C3454q.C3456b) r0
            if (r0 == 0) goto L_0x0078
            com.bamtechmedia.dominguez.core.content.collections.a r0 = r0.mo12653a()
            if (r0 == 0) goto L_0x0078
            r2 = r9
            com.bamtechmedia.dominguez.core.content.sets.ContentSet r2 = (com.bamtechmedia.dominguez.core.content.sets.ContentSet) r2
            boolean r9 = com.bamtechmedia.dominguez.core.content.collections.C3659b.m12473a(r0, r2)
            r0 = 1
            if (r9 != r0) goto L_0x0078
            com.bamtechmedia.dominguez.core.content.sets.c r1 = r8.f8723U
            java.lang.String r4 = r8.m11819y()
            r5 = 0
            r6 = 8
            r7 = 0
            r3 = r10
            io.reactivex.Maybe r9 = com.bamtechmedia.dominguez.core.content.sets.C3765c.C3767b.m12768a(r1, r2, r3, r4, r5, r6, r7)
            g.n.a.c0 r10 = r8.getViewModelScope()
            g.n.a.h r10 = p163g.p503n.p504a.C11793e.m37930a(r10)
            java.lang.Object r9 = r9.mo30112a(r10)
            java.lang.String r10 = "this.`as`(AutoDispose.autoDisposable(provider))"
            kotlin.jvm.internal.Intrinsics.checkReturnedValueIsNotNull(r9, r10)
            g.n.a.z r9 = (p163g.p503n.p504a.C11844z) r9
            com.bamtechmedia.dominguez.collections.r$t r10 = new com.bamtechmedia.dominguez.collections.r$t
            r10.<init>(r8)
            com.bamtechmedia.dominguez.collections.t r0 = new com.bamtechmedia.dominguez.collections.t
            r0.<init>(r10)
            com.bamtechmedia.dominguez.collections.r$u r10 = com.bamtechmedia.dominguez.collections.C3457r.C3481u.f8759c
            if (r10 == 0) goto L_0x0052
            com.bamtechmedia.dominguez.collections.t r1 = new com.bamtechmedia.dominguez.collections.t
            r1.<init>(r10)
            r10 = r1
        L_0x0052:
            io.reactivex.functions.Consumer r10 = (p520io.reactivex.functions.Consumer) r10
            r9.mo29929a(r0, r10)
            goto L_0x0078
        L_0x0058:
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            java.lang.String r0 = "Paging on "
            r10.append(r0)
            java.lang.Class r9 = r9.getClass()
            r10.append(r9)
            java.lang.String r9 = " is not supported by this ViewModel"
            r10.append(r9)
            java.lang.String r9 = r10.toString()
            r10 = 0
            java.lang.Object[] r10 = new java.lang.Object[r10]
            p686n.p687a.Timber.m44526b(r9, r10)
        L_0x0078:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bamtechmedia.dominguez.collections.C3457r.mo12663a(com.bamtechmedia.dominguez.core.content.paging.c, int):void");
    }
}
