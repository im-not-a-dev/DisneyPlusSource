package com.bamtechmedia.dominguez.discover;

import android.os.Bundle;
import android.view.View;
import android.view.View.OnApplyWindowInsetsListener;
import android.view.WindowInsets;
import android.widget.ImageView;
import android.widget.ProgressBar;
import androidx.lifecycle.C0715i;
import androidx.lifecycle.C0721l;
import androidx.lifecycle.C0722m;
import androidx.recyclerview.widget.RecyclerView;
import com.bamtechmedia.dominguez.collections.C3280a;
import com.bamtechmedia.dominguez.collections.C3502x.C3503a;
import com.bamtechmedia.dominguez.collections.caching.C3291a;
import com.bamtechmedia.dominguez.collections.p079n0.C3431b;
import com.bamtechmedia.dominguez.core.design.widgets.AspectRatioImageView;
import com.bamtechmedia.dominguez.core.design.widgets.NoConnectionView;
import com.bamtechmedia.dominguez.core.p088i.p091p.C3848a;
import com.bamtechmedia.dominguez.core.recycler.C5812b;
import com.bamtechmedia.dominguez.core.recycler.C5812b.C5813a;
import com.bamtechmedia.dominguez.core.recycler.C5812b.C5814b;
import com.bamtechmedia.dominguez.discover.p233l.C6108a;
import com.bamtechmedia.dominguez.p331ui.fullbleed.FullBleedItemView.C8077a;
import com.google.common.base.Optional;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p163g.p201e.p202a.C5363f;
import p163g.p201e.p202a.C5364g;
import p163g.p201e.p203b.p312q.C7700r;
import p163g.p509o.p510a.C11848c;
import p163g.p509o.p510a.C11863k;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004B\u0005¢\u0006\u0002\u0010\u0005J\b\u00105\u001a\u000206H\u0016J\n\u00107\u001a\u0004\u0018\u000108H\u0016J\u0012\u00109\u001a\u00020:2\b\u0010;\u001a\u0004\u0018\u00010<H\u0016J\u0016\u0010=\u001a\u00020>2\f\u0010?\u001a\b\u0012\u0004\u0012\u00020A0@H\u0016J\u001a\u0010B\u001a\u00020:2\u0006\u0010C\u001a\u00020D2\b\u0010;\u001a\u0004\u0018\u00010<H\u0016R\u001e\u0010\u0006\u001a\u00020\u00078\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001e\u0010\f\u001a\u00020\r8\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001e\u0010\u0012\u001a\u00020\u00138\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R$\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00198\u0000@\u0000X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR$\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020 0\u00198\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\u001c\"\u0004\b\"\u0010\u001eR\u001e\u0010#\u001a\u00020$8\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b%\u0010&\"\u0004\b'\u0010(R\u001e\u0010)\u001a\u00020*8\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b+\u0010,\"\u0004\b-\u0010.R\u001e\u0010/\u001a\u0002008\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b1\u00102\"\u0004\b3\u00104¨\u0006E"}, mo31007d2 = {"Lcom/bamtechmedia/dominguez/discover/DiscoverFragment;", "Lcom/bamtechmedia/dominguez/collections/AbstractCollectionFragment;", "Lcom/bamtechmedia/dominguez/globalnav/GlobalNavTvEnabled;", "Lcom/bamtechmedia/dominguez/ui/fullbleed/FullBleedItemView$BackgroundViewProvider;", "Lcom/bamtechmedia/dominguez/core/recycler/RecyclerViewVerticalScrollHelper$ScrollToStartBehaviour;", "()V", "analytics", "Lcom/bamtechmedia/dominguez/discover/analytics/DiscoverAnalytics;", "getAnalytics", "()Lcom/bamtechmedia/dominguez/discover/analytics/DiscoverAnalytics;", "setAnalytics", "(Lcom/bamtechmedia/dominguez/discover/analytics/DiscoverAnalytics;)V", "autoPagingLifecycleHelper", "Lcom/bamtechmedia/dominguez/collections/autopaging/AutoPagingLifecycleHelper;", "getAutoPagingLifecycleHelper", "()Lcom/bamtechmedia/dominguez/collections/autopaging/AutoPagingLifecycleHelper;", "setAutoPagingLifecycleHelper", "(Lcom/bamtechmedia/dominguez/collections/autopaging/AutoPagingLifecycleHelper;)V", "backgroundHelper", "Lcom/bamtechmedia/dominguez/core/design/helper/BackgroundHelper;", "getBackgroundHelper", "()Lcom/bamtechmedia/dominguez/core/design/helper/BackgroundHelper;", "setBackgroundHelper", "(Lcom/bamtechmedia/dominguez/core/design/helper/BackgroundHelper;)V", "castButtonHandler", "Lcom/google/common/base/Optional;", "Lcom/bamtechmedia/dominguez/discover/DiscoverCastButtonHandler;", "getCastButtonHandler$core_release", "()Lcom/google/common/base/Optional;", "setCastButtonHandler$core_release", "(Lcom/google/common/base/Optional;)V", "castIntroLifecycleObserver", "Landroidx/lifecycle/LifecycleObserver;", "getCastIntroLifecycleObserver", "setCastIntroLifecycleObserver", "prefetchHelper", "Lcom/bamtechmedia/dominguez/collections/caching/CollectionPrefetchHelper;", "getPrefetchHelper", "()Lcom/bamtechmedia/dominguez/collections/caching/CollectionPrefetchHelper;", "setPrefetchHelper", "(Lcom/bamtechmedia/dominguez/collections/caching/CollectionPrefetchHelper;)V", "recyclerVerticalScrollHelper", "Lcom/bamtechmedia/dominguez/core/recycler/RecyclerViewVerticalScrollHelper;", "getRecyclerVerticalScrollHelper", "()Lcom/bamtechmedia/dominguez/core/recycler/RecyclerViewVerticalScrollHelper;", "setRecyclerVerticalScrollHelper", "(Lcom/bamtechmedia/dominguez/core/recycler/RecyclerViewVerticalScrollHelper;)V", "scrollBehaviour", "Lcom/bamtechmedia/dominguez/core/recycler/RecyclerViewVerticalScrollHelper$ScrollBehaviour;", "getScrollBehaviour", "()Lcom/bamtechmedia/dominguez/core/recycler/RecyclerViewVerticalScrollHelper$ScrollBehaviour;", "setScrollBehaviour", "(Lcom/bamtechmedia/dominguez/core/recycler/RecyclerViewVerticalScrollHelper$ScrollBehaviour;)V", "canScrollViewBackToStart", "", "getFullBleedBackgroundView", "Lcom/bamtechmedia/dominguez/core/design/widgets/AspectRatioImageView;", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "onCreateCollectionView", "Lcom/bamtechmedia/dominguez/collections/CollectionViewPresenter$CollectionView;", "adapter", "Lcom/xwray/groupie/GroupAdapter;", "Lcom/xwray/groupie/ViewHolder;", "onViewCreated", "view", "Landroid/view/View;", "core_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* renamed from: com.bamtechmedia.dominguez.discover.e */
/* compiled from: DiscoverFragment.kt */
public final class C6099e extends C3280a implements C7700r, C8077a, C5814b {

    /* renamed from: g0 */
    public C5813a f14033g0;

    /* renamed from: h0 */
    public C5812b f14034h0;

    /* renamed from: i0 */
    public C3291a f14035i0;

    /* renamed from: j0 */
    public C6108a f14036j0;

    /* renamed from: k0 */
    public C3848a f14037k0;

    /* renamed from: l0 */
    public C3431b f14038l0;

    /* renamed from: m0 */
    public Optional<C0721l> f14039m0;

    /* renamed from: n0 */
    public Optional<C6094a> f14040n0;

    /* renamed from: o0 */
    private HashMap f14041o0;

    /* renamed from: com.bamtechmedia.dominguez.discover.e$a */
    /* compiled from: DiscoverFragment.kt */
    static final class C6100a implements OnApplyWindowInsetsListener {

        /* renamed from: a */
        final /* synthetic */ ImageView f14042a;

        /* renamed from: b */
        final /* synthetic */ C6099e f14043b;

        C6100a(ImageView imageView, C6099e eVar, View view) {
            this.f14042a = imageView;
            this.f14043b = eVar;
        }

        public final WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
            if (this.f14042a.getBackground() == null) {
                C3848a w = this.f14043b.mo12238w();
                ImageView imageView = this.f14042a;
                Intrinsics.checkReturnedValueIsNotNull((Object) windowInsets, "insets");
                w.mo13765a(imageView, windowInsets.getSystemWindowInsetTop());
            }
            return windowInsets;
        }
    }

    public C6099e() {
        super(C5364g.fragment_discover);
    }

    public void _$_clearFindViewByIdCache() {
        HashMap hashMap = this.f14041o0;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    public View _$_findCachedViewById(int i) {
        if (this.f14041o0 == null) {
            this.f14041o0 = new HashMap();
        }
        View view = (View) this.f14041o0.get(Integer.valueOf(i));
        if (view == null) {
            View view2 = getView();
            if (view2 == null) {
                return null;
            }
            view = view2.findViewById(i);
            this.f14041o0.put(Integer.valueOf(i), view);
        }
        return view;
    }

    /* renamed from: a */
    public C3503a mo12229a(C11848c<C11863k> cVar) {
        RecyclerView recyclerView = (RecyclerView) _$_findCachedViewById(C5363f.discoverRecyclerView);
        Intrinsics.checkReturnedValueIsNotNull((Object) recyclerView, "discoverRecyclerView");
        ProgressBar progressBar = (ProgressBar) _$_findCachedViewById(C5363f.discoverProgressBar);
        Intrinsics.checkReturnedValueIsNotNull((Object) progressBar, "discoverProgressBar");
        C3503a aVar = new C3503a(cVar, recyclerView, progressBar, (NoConnectionView) _$_findCachedViewById(C5363f.discoverNoConnectionView), null, null, 48, null);
        return aVar;
    }

    /* renamed from: g */
    public AspectRatioImageView mo18366g() {
        return (AspectRatioImageView) _$_findCachedViewById(C5363f.discoverFullBleedImage);
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Optional<C0721l> optional = this.f14039m0;
        if (optional != null) {
            C0721l lVar = (C0721l) optional.mo27107c();
            if (lVar != null) {
                getLifecycle().mo4134a(lVar);
                return;
            }
            return;
        }
        Intrinsics.throwUninitializedPropertyAccessException("castIntroLifecycleObserver");
        throw null;
    }

    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        _$_clearFindViewByIdCache();
    }

    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        Optional<C6094a> optional = this.f14040n0;
        if (optional != null) {
            C6094a aVar = (C6094a) optional.mo27107c();
            if (aVar != null) {
                aVar.mo18363a();
            }
            C5813a aVar2 = this.f14033g0;
            if (aVar2 != null) {
                aVar2.mo17727a();
                ImageView imageView = (ImageView) _$_findCachedViewById(C5363f.statusbarBackground);
                if (imageView != null) {
                    view.setOnApplyWindowInsetsListener(new C6100a(imageView, this, view));
                }
                C0722m viewLifecycleOwner = getViewLifecycleOwner();
                Intrinsics.checkReturnedValueIsNotNull((Object) viewLifecycleOwner, "viewLifecycleOwner");
                C0715i lifecycle = viewLifecycleOwner.getLifecycle();
                C3431b bVar = this.f14038l0;
                if (bVar != null) {
                    lifecycle.mo4134a(bVar);
                } else {
                    Intrinsics.throwUninitializedPropertyAccessException("autoPagingLifecycleHelper");
                    throw null;
                }
            } else {
                Intrinsics.throwUninitializedPropertyAccessException("scrollBehaviour");
                throw null;
            }
        } else {
            Intrinsics.throwUninitializedPropertyAccessException("castButtonHandler");
            throw null;
        }
    }

    /* renamed from: v */
    public final C6108a mo12237v() {
        C6108a aVar = this.f14036j0;
        if (aVar != null) {
            return aVar;
        }
        Intrinsics.throwUninitializedPropertyAccessException("analytics");
        throw null;
    }

    /* renamed from: w */
    public final C3848a mo12238w() {
        C3848a aVar = this.f14037k0;
        if (aVar != null) {
            return aVar;
        }
        Intrinsics.throwUninitializedPropertyAccessException("backgroundHelper");
        throw null;
    }
}
