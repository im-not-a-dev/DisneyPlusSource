package com.bamtechmedia.dominguez.collections;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.C0722m;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView.C0808o;
import com.bamtechmedia.dominguez.analytics.C2359f0;
import com.bamtechmedia.dominguez.analytics.C2366i0;
import com.bamtechmedia.dominguez.analytics.C2366i0.C2367a;
import com.bamtechmedia.dominguez.analytics.C2378m;
import com.bamtechmedia.dominguez.collections.C3408j.C3409a;
import com.bamtechmedia.dominguez.collections.C3454q.C3456b;
import com.bamtechmedia.dominguez.collections.C3502x.C3503a;
import com.bamtechmedia.dominguez.core.content.collections.C3658a;
import com.bamtechmedia.dominguez.core.content.collections.C3676k;
import com.bamtechmedia.dominguez.core.recycler.RecyclerViewSnapScrollHelper;
import com.bamtechmedia.dominguez.core.utils.C5837i;
import com.bamtechmedia.dominguez.core.utils.C5864r;
import com.google.common.base.Optional;
import kotlin.C13142s;
import kotlin.C13145v;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import p163g.p201e.p203b.p314r.C7738g;
import p163g.p509o.p510a.C11848c;
import p163g.p509o.p510a.C11863k;
import p512h.p513c.p514k.C11890i;
import p520io.reactivex.Single;
import p520io.reactivex.functions.C11952h;
import p520io.reactivex.functions.Function;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000Ð\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\b&\u0018\u0000 g2\u00020\u00012\u00020\u00022\u00020\u0003:\u0001gB\u000f\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u000e\u0010>\u001a\b\u0012\u0004\u0012\u00020@0?H\u0016J\n\u0010A\u001a\u0004\u0018\u00010BH\u0002J\n\u0010C\u001a\u0004\u0018\u00010%H\u0002J \u0010D\u001a\u00020E2\u0006\u0010F\u001a\u00020\u00052\u0006\u0010G\u001a\u00020H2\u0006\u0010I\u001a\u00020EH\u0004J\u0018\u0010J\u001a\u00020K2\u0006\u0010L\u001a\u00020M2\u0006\u0010N\u001a\u00020OH\u0016J\u0016\u0010P\u001a\u00020M2\f\u0010Q\u001a\b\u0012\u0004\u0012\u00020S0RH&J$\u0010T\u001a\u0004\u0018\u00010H2\u0006\u0010U\u001a\u00020V2\b\u0010W\u001a\u0004\u0018\u00010X2\b\u0010Y\u001a\u0004\u0018\u00010ZJ\b\u0010[\u001a\u00020KH\u0016J\u0010\u0010\\\u001a\u00020E2\u0006\u0010F\u001a\u00020\u0005H\u0016J&\u0010]\u001a\u00020K2\u0006\u0010L\u001a\u00020H2\u0006\u0010N\u001a\u00020O2\f\u0010^\u001a\b\u0012\u0004\u0012\u00020K0_H\u0016J\b\u0010`\u001a\u00020KH\u0016J\u0010\u0010a\u001a\u00020K2\u0006\u0010b\u001a\u00020ZH\u0016J\b\u0010c\u001a\u00020KH\u0016J\b\u0010d\u001a\u00020KH\u0016J\u001a\u0010e\u001a\u00020K2\u0006\u0010L\u001a\u00020H2\b\u0010Y\u001a\u0004\u0018\u00010ZH\u0016J\u0006\u0010f\u001a\u00020KR$\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR$\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\b8\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u000b\"\u0004\b\u0011\u0010\rR$\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00130\b8\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u000b\"\u0004\b\u0015\u0010\rR\u001e\u0010\u0016\u001a\u00020\u00178\u0000@\u0000X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\u001e\u0010\u001c\u001a\u00020\u001d8\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R\u0010\u0010\"\u001a\u0004\u0018\u00010#X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010$\u001a\u0004\u0018\u00010%X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u001e\u0010&\u001a\u00020'8\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b(\u0010)\"\u0004\b*\u0010+R\u001e\u0010,\u001a\u00020-8\u0000@\u0000X.¢\u0006\u000e\n\u0000\u001a\u0004\b.\u0010/\"\u0004\b0\u00101R\u001e\u00102\u001a\u0002038\u0000@\u0000X.¢\u0006\u000e\n\u0000\u001a\u0004\b4\u00105\"\u0004\b6\u00107R\u001e\u00108\u001a\u0002098\u0000@\u0000X.¢\u0006\u000e\n\u0000\u001a\u0004\b:\u0010;\"\u0004\b<\u0010=¨\u0006h"}, mo31007d2 = {"Lcom/bamtechmedia/dominguez/collections/AbstractCollectionFragment;", "Ldagger/android/support/DaggerFragment;", "Lcom/bamtechmedia/dominguez/core/utils/OnKeyDownHandler;", "Lcom/bamtechmedia/dominguez/analytics/RxAnalyticsStateProvider;", "layoutId", "", "(I)V", "assetStaticImageHandler", "Lcom/google/common/base/Optional;", "Lcom/bamtechmedia/dominguez/collections/AssetStaticImageHandler;", "getAssetStaticImageHandler", "()Lcom/google/common/base/Optional;", "setAssetStaticImageHandler", "(Lcom/google/common/base/Optional;)V", "assetTransitionHandler", "Lcom/bamtechmedia/dominguez/collections/AssetTransitionHandler;", "getAssetTransitionHandler", "setAssetTransitionHandler", "assetVideoArtHandler", "Lcom/bamtechmedia/dominguez/collections/AssetVideoArtHandler;", "getAssetVideoArtHandler", "setAssetVideoArtHandler", "collectionFragmentHelperSetup", "Lcom/bamtechmedia/dominguez/collections/CollectionFragmentHelper$Setup;", "getCollectionFragmentHelperSetup$collections_release", "()Lcom/bamtechmedia/dominguez/collections/CollectionFragmentHelper$Setup;", "setCollectionFragmentHelperSetup$collections_release", "(Lcom/bamtechmedia/dominguez/collections/CollectionFragmentHelper$Setup;)V", "focusHelper", "Lcom/bamtechmedia/dominguez/collections/CollectionViewFocusHelper;", "getFocusHelper", "()Lcom/bamtechmedia/dominguez/collections/CollectionViewFocusHelper;", "setFocusHelper", "(Lcom/bamtechmedia/dominguez/collections/CollectionViewFocusHelper;)V", "helper", "Lcom/bamtechmedia/dominguez/collections/CollectionFragmentHelper;", "lastRecyclerViewState", "Landroid/os/Parcelable;", "recyclerViewSnapScrollHelper", "Lcom/bamtechmedia/dominguez/core/recycler/RecyclerViewSnapScrollHelper;", "getRecyclerViewSnapScrollHelper", "()Lcom/bamtechmedia/dominguez/core/recycler/RecyclerViewSnapScrollHelper;", "setRecyclerViewSnapScrollHelper", "(Lcom/bamtechmedia/dominguez/core/recycler/RecyclerViewSnapScrollHelper;)V", "slug", "Lcom/bamtechmedia/dominguez/core/content/collections/Slug;", "getSlug$collections_release", "()Lcom/bamtechmedia/dominguez/core/content/collections/Slug;", "setSlug$collections_release", "(Lcom/bamtechmedia/dominguez/core/content/collections/Slug;)V", "transactionIdProvider", "Lcom/bamtechmedia/dominguez/analytics/TransactionIdProvider;", "getTransactionIdProvider$collections_release", "()Lcom/bamtechmedia/dominguez/analytics/TransactionIdProvider;", "setTransactionIdProvider$collections_release", "(Lcom/bamtechmedia/dominguez/analytics/TransactionIdProvider;)V", "viewModel", "Lcom/bamtechmedia/dominguez/collections/CollectionViewModel;", "getViewModel$collections_release", "()Lcom/bamtechmedia/dominguez/collections/CollectionViewModel;", "setViewModel$collections_release", "(Lcom/bamtechmedia/dominguez/collections/CollectionViewModel;)V", "analyticsSectionOnce", "Lio/reactivex/Single;", "Lcom/bamtechmedia/dominguez/analytics/AnalyticsSection;", "getRecyclerView", "Landroidx/recyclerview/widget/RecyclerView;", "getRecyclerViewSaveState", "handleOnKeyDown", "", "keyCode", "currentFocus", "Landroid/view/View;", "globalNavAvailable", "onCollectionStateChanged", "", "view", "Lcom/bamtechmedia/dominguez/collections/CollectionViewPresenter$CollectionView;", "state", "Lcom/bamtechmedia/dominguez/collections/CollectionViewModel$State;", "onCreateCollectionView", "adapter", "Lcom/xwray/groupie/GroupAdapter;", "Lcom/xwray/groupie/ViewHolder;", "onCreateView", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onDestroyView", "onKeyDown", "onPreCollectionStateChanged", "bindCollection", "Lkotlin/Function0;", "onResume", "onSaveInstanceState", "outState", "onStart", "onStop", "onViewCreated", "restoreStateAfterBind", "Companion", "collections_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* renamed from: com.bamtechmedia.dominguez.collections.a */
/* compiled from: AbstractCollectionFragment.kt */
public abstract class C3280a extends C11890i implements C5864r, C2359f0 {

    /* renamed from: U */
    public C3409a f8314U;

    /* renamed from: V */
    public C3432o f8315V;

    /* renamed from: W */
    public RecyclerViewSnapScrollHelper f8316W;

    /* renamed from: X */
    public Optional<C3317e> f8317X;

    /* renamed from: Y */
    public Optional<AssetTransitionHandler> f8318Y;

    /* renamed from: Z */
    public Optional<AssetStaticImageHandler> f8319Z;

    /* renamed from: a0 */
    public C3454q f8320a0;

    /* renamed from: b0 */
    public C2366i0 f8321b0;

    /* renamed from: c0 */
    public C3676k f8322c0;

    /* renamed from: d0 */
    private C3408j f8323d0;

    /* renamed from: e0 */
    private Parcelable f8324e0;

    /* renamed from: f0 */
    private final int f8325f0;

    /* renamed from: com.bamtechmedia.dominguez.collections.a$a */
    /* compiled from: AbstractCollectionFragment.kt */
    public static final class C3281a {
        private C3281a() {
        }

        public /* synthetic */ C3281a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: com.bamtechmedia.dominguez.collections.a$b */
    /* compiled from: AbstractCollectionFragment.kt */
    static final class C3282b<T> implements C11952h<C3456b> {

        /* renamed from: c */
        public static final C3282b f8326c = new C3282b();

        C3282b() {
        }

        /* renamed from: a */
        public final boolean test(C3456b bVar) {
            return bVar.mo12653a() != null;
        }
    }

    /* renamed from: com.bamtechmedia.dominguez.collections.a$c */
    /* compiled from: AbstractCollectionFragment.kt */
    static final class C3283c<T, R> implements Function<T, R> {

        /* renamed from: c */
        public static final C3283c f8327c = new C3283c();

        C3283c() {
        }

        /* renamed from: a */
        public final C3658a apply(C3456b bVar) {
            C3658a a = bVar.mo12653a();
            if (a != null) {
                return a;
            }
            throw new IllegalArgumentException("Required value was null.".toString());
        }
    }

    /* renamed from: com.bamtechmedia.dominguez.collections.a$d */
    /* compiled from: AbstractCollectionFragment.kt */
    static final class C3284d<T, R> implements Function<T, R> {

        /* renamed from: c */
        final /* synthetic */ C3280a f8328c;

        C3284d(C3280a aVar) {
            this.f8328c = aVar;
        }

        /* renamed from: a */
        public final C2378m apply(C3658a aVar) {
            C2378m mVar = new C2378m(aVar.mo13342K(), aVar.mo13344P(), C2367a.m8888a(this.f8328c.mo12329t(), this.f8328c.mo12328s().mo13376Z(), false, 2, null), null, 8, null);
            return mVar;
        }
    }

    static {
        new C3281a(null);
    }

    public C3280a(int i) {
        this.f8325f0 = i;
    }

    /* renamed from: v */
    private final RecyclerView mo12237v() {
        C3408j jVar = this.f8323d0;
        if (jVar != null) {
            C3503a a = jVar.mo12569a();
            if (a != null) {
                return a.mo12710f();
            }
        }
        return null;
    }

    /* renamed from: w */
    private final Parcelable mo12238w() {
        RecyclerView v = mo12237v();
        if (v != null) {
            C0808o layoutManager = v.getLayoutManager();
            if (layoutManager != null) {
                return layoutManager.mo3930z();
            }
        }
        return null;
    }

    public abstract void _$_clearFindViewByIdCache();

    /* renamed from: a */
    public abstract C3503a mo12229a(C11848c<C11863k> cVar);

    /* renamed from: a */
    public void mo12230a(View view, C3456b bVar, Function0<C13145v> function0) {
        function0.invoke();
    }

    /* renamed from: a */
    public void mo12231a(C3503a aVar, C3456b bVar) {
    }

    /* renamed from: n */
    public Single<C2378m> mo11486n() {
        C3454q qVar = this.f8320a0;
        if (qVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
            throw null;
        } else if (qVar != null) {
            Single<C2378m> g = ((C3457r) qVar).getState().mo30150a((C11952h<? super T>) C3282b.f8326c).mo30186d().mo30233g(C3283c.f8327c).mo30233g(new C3284d(this));
            Intrinsics.checkReturnedValueIsNotNull((Object) g, "(viewModel as Collection….pageName))\n            }");
            return g;
        } else {
            throw new C13142s("null cannot be cast to non-null type com.bamtechmedia.dominguez.collections.CollectionViewModelImpl");
        }
    }

    /* renamed from: o */
    public final Optional<AssetStaticImageHandler> mo12324o() {
        Optional<AssetStaticImageHandler> optional = this.f8319Z;
        if (optional != null) {
            return optional;
        }
        Intrinsics.throwUninitializedPropertyAccessException("assetStaticImageHandler");
        throw null;
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return C7738g.m22802a(this, this.f8325f0, viewGroup, false, 4, null);
    }

    public void onDestroyView() {
        if (this.f8324e0 == null) {
            this.f8324e0 = mo12238w();
        }
        C3408j jVar = this.f8323d0;
        if (jVar != null) {
            jVar.mo12571b();
        }
        super.onDestroyView();
        _$_clearFindViewByIdCache();
    }

    public void onResume() {
        super.onResume();
        C3454q qVar = this.f8320a0;
        String str = "viewModel";
        if (qVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException(str);
            throw null;
        } else if (qVar != null) {
            qVar.mo12648a(qVar.mo12649b());
        } else {
            Intrinsics.throwUninitializedPropertyAccessException(str);
            throw null;
        }
    }

    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putParcelable("saved_state_recycler", mo12238w());
    }

    public void onStart() {
        super.onStart();
        C3408j jVar = this.f8323d0;
        if (jVar != null) {
            jVar.mo12570a((C0722m) this);
        }
    }

    public void onStop() {
        super.onStop();
        C3408j jVar = this.f8323d0;
        if (jVar != null) {
            jVar.mo12573c();
        }
    }

    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        C3409a aVar = this.f8314U;
        Parcelable parcelable = null;
        if (aVar != null) {
            this.f8323d0 = aVar.mo12576a(this);
            C3408j jVar = this.f8323d0;
            if (jVar != null) {
                C0722m viewLifecycleOwner = getViewLifecycleOwner();
                Intrinsics.checkReturnedValueIsNotNull((Object) viewLifecycleOwner, "viewLifecycleOwner");
                jVar.mo12572b(viewLifecycleOwner);
            }
            if (this.f8324e0 == null) {
                if (bundle != null) {
                    parcelable = bundle.getParcelable("saved_state_recycler");
                }
                this.f8324e0 = parcelable;
                return;
            }
            return;
        }
        Intrinsics.throwUninitializedPropertyAccessException("collectionFragmentHelperSetup");
        throw null;
    }

    /* renamed from: p */
    public final Optional<AssetTransitionHandler> mo12325p() {
        Optional<AssetTransitionHandler> optional = this.f8318Y;
        if (optional != null) {
            return optional;
        }
        Intrinsics.throwUninitializedPropertyAccessException("assetTransitionHandler");
        throw null;
    }

    /* renamed from: q */
    public final Optional<C3317e> mo12326q() {
        Optional<C3317e> optional = this.f8317X;
        if (optional != null) {
            return optional;
        }
        Intrinsics.throwUninitializedPropertyAccessException("assetVideoArtHandler");
        throw null;
    }

    /* renamed from: r */
    public final RecyclerViewSnapScrollHelper mo12327r() {
        RecyclerViewSnapScrollHelper recyclerViewSnapScrollHelper = this.f8316W;
        if (recyclerViewSnapScrollHelper != null) {
            return recyclerViewSnapScrollHelper;
        }
        Intrinsics.throwUninitializedPropertyAccessException("recyclerViewSnapScrollHelper");
        throw null;
    }

    /* renamed from: s */
    public final C3676k mo12328s() {
        C3676k kVar = this.f8322c0;
        if (kVar != null) {
            return kVar;
        }
        Intrinsics.throwUninitializedPropertyAccessException("slug");
        throw null;
    }

    /* renamed from: t */
    public final C2366i0 mo12329t() {
        C2366i0 i0Var = this.f8321b0;
        if (i0Var != null) {
            return i0Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("transactionIdProvider");
        throw null;
    }

    /* renamed from: u */
    public final void mo12330u() {
        if (this.f8324e0 != null) {
            RecyclerView v = mo12237v();
            if (v != null) {
                C0808o layoutManager = v.getLayoutManager();
                if (layoutManager != null) {
                    layoutManager.mo3845a(this.f8324e0);
                }
            }
            this.f8324e0 = null;
        }
    }

    /* renamed from: a */
    public boolean mo12232a(int i) {
        Context requireContext = requireContext();
        Intrinsics.checkReturnedValueIsNotNull((Object) requireContext, "requireContext()");
        if (!C5837i.m18843e(requireContext)) {
            return false;
        }
        View view = getView();
        if (view == null) {
            return false;
        }
        View findFocus = view.findFocus();
        if (findFocus != null) {
            return mo12323a(i, findFocus, true);
        }
        return false;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final boolean mo12323a(int i, View view, boolean z) {
        C3432o oVar = this.f8315V;
        if (oVar != null) {
            boolean a = oVar.mo12605a(i, view, z);
            if (!a) {
                RecyclerViewSnapScrollHelper recyclerViewSnapScrollHelper = this.f8316W;
                if (recyclerViewSnapScrollHelper != null) {
                    RecyclerViewSnapScrollHelper.m18771a(recyclerViewSnapScrollHelper, i, view, null, 4, null);
                } else {
                    Intrinsics.throwUninitializedPropertyAccessException("recyclerViewSnapScrollHelper");
                    throw null;
                }
            }
            return a;
        }
        Intrinsics.throwUninitializedPropertyAccessException("focusHelper");
        throw null;
    }
}
