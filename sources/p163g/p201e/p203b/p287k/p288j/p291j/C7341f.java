package p163g.p201e.p203b.p287k.p288j.p291j;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnLayoutChangeListener;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.ViewTreeObserver.OnGlobalFocusChangeListener;
import android.widget.ImageView;
import androidx.fragment.app.C0532d;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.C0715i;
import androidx.lifecycle.C0722m;
import androidx.recyclerview.widget.RecyclerView;
import com.bamtechmedia.dominguez.analytics.C2378m;
import com.bamtechmedia.dominguez.analytics.C2413n;
import com.bamtechmedia.dominguez.analytics.p057o0.C2433b;
import com.bamtechmedia.dominguez.collections.C3432o;
import com.bamtechmedia.dominguez.core.content.C3690l;
import com.bamtechmedia.dominguez.core.content.C3692n;
import com.bamtechmedia.dominguez.core.design.widgets.NoConnectionView;
import com.bamtechmedia.dominguez.core.design.widgets.focus.FocusSearchInterceptMotionLayout;
import com.bamtechmedia.dominguez.core.design.widgets.focus.FocusSearchInterceptTabLayout;
import com.bamtechmedia.dominguez.core.framework.C5755i;
import com.bamtechmedia.dominguez.core.recycler.RecyclerViewSnapScrollHelper;
import com.bamtechmedia.dominguez.core.recycler.RecyclerViewSnapScrollHelper.C5805c;
import com.bamtechmedia.dominguez.core.recycler.RecyclerViewSnapScrollHelper.C5805c.C5806a;
import com.bamtechmedia.dominguez.core.recycler.RecyclerViewSnapScrollHelper.C5805c.C5808c;
import com.bamtechmedia.dominguez.core.utils.C5821c0;
import com.bamtechmedia.dominguez.core.utils.C5833g;
import com.bamtechmedia.dominguez.core.utils.C5837i;
import com.bamtechmedia.dominguez.core.utils.C5864r;
import com.bamtechmedia.dominguez.core.utils.RecyclerViewExtKt;
import com.bamtechmedia.dominguez.detail.common.C5904a0;
import com.bamtechmedia.dominguez.detail.common.C6008x;
import com.bamtechmedia.dominguez.detail.common.DefaultBookmarkButton;
import com.bamtechmedia.dominguez.detail.common.item.C5981c;
import com.bamtechmedia.dominguez.detail.common.offline.C5995c;
import com.bamtechmedia.dominguez.detail.common.offline.DetailOfflineStateMonitor;
import com.bamtechmedia.dominguez.detail.common.p226c0.C5910b;
import com.bamtechmedia.dominguez.detail.common.p230g0.C5944a;
import com.bamtechmedia.dominguez.detail.common.p230g0.C5950d;
import com.bamtechmedia.dominguez.detail.common.p230g0.C5951e;
import com.bamtechmedia.dominguez.detail.common.p230g0.C5955f;
import com.bamtechmedia.dominguez.detail.common.p230g0.C5956g;
import com.google.android.material.tabs.TabLayout;
import java.io.Serializable;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import kotlin.C12907r;
import kotlin.C13145v;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.C12881k;
import p163g.p201e.p203b.p287k.C7310d;
import p163g.p201e.p203b.p287k.C7312f;
import p163g.p201e.p203b.p287k.C7313g;
import p163g.p201e.p203b.p287k.p288j.p289h.C7327a;
import p163g.p201e.p203b.p287k.p288j.p292k.C7350a;
import p163g.p201e.p203b.p287k.p288j.p292k.C7352b;
import p163g.p201e.p203b.p287k.p288j.p292k.C7352b.C7354b;
import p163g.p201e.p203b.p314r.C7738g;
import p163g.p509o.p510a.C11847b;
import p163g.p509o.p510a.C11848c;
import p163g.p509o.p510a.C11863k;
import p512h.p513c.p514k.C11890i;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u0000 \u00012\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u00052\u00020\u0006:\u0002\u0001B\u0005¢\u0006\u0002\u0010\u0007J\u0018\u0010{\u001a\u00020|2\u0006\u0010}\u001a\u00020~2\u0006\u0010\u001a\u00020 H\u0002J\n\u0010\u0001\u001a\u00030\u0001H\u0016J\u001c\u0010\u0001\u001a\u00020|2\b\u0010\u0001\u001a\u00030\u00012\u0007\u0010
\u0001\u001a\u00020LH\u0002J\u0013\u0010\u0001\u001a\u00020\u00162\b\u0010\u0001\u001a\u00030\u0001H\u0016J\u0015\u0010\u0001\u001a\u00020|2\n\u0010\u0001\u001a\u0005\u0018\u00010\u0001H\u0016J-\u0010\u0001\u001a\u0004\u0018\u00010 2\b\u0010\u0001\u001a\u00030\u00012\n\u0010\u0001\u001a\u0005\u0018\u00010\u00012\n\u0010\u0001\u001a\u0005\u0018\u00010\u0001H\u0016J\t\u0010\u0001\u001a\u00020|H\u0016J\u001f\u0010\u0001\u001a\u00020|2\t\u0010\u0001\u001a\u0004\u0018\u00010 2\t\u0010\u0001\u001a\u0004\u0018\u00010 H\u0016J\u0011\u0010\u0001\u001a\u00020\u00162\u0006\u0010}\u001a\u00020~H\u0016J\t\u0010\u0001\u001a\u00020|H\u0016J\u001e\u0010\u0001\u001a\u00020|2\u0007\u0010\u0001\u001a\u00020 2\n\u0010\u0001\u001a\u0005\u0018\u00010\u0001H\u0016J\r\u0010\u0001\u001a\u00020\u0016*\u00020 H\u0002R\u001e\u0010\b\u001a\u00020\t8\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR$\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f8\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0015\u001a\u00020\u00168F¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018R\u001e\u0010\u0019\u001a\u00020\u001a8\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR\u0018\u0010\u001f\u001a\u0004\u0018\u00010 8BX\u000e¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\"R\u001e\u0010#\u001a\u00020$8\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b%\u0010&\"\u0004\b'\u0010(R\u001e\u0010)\u001a\u00020*8\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b+\u0010,\"\u0004\b-\u0010.R\u001e\u0010/\u001a\u0002008\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b1\u00102\"\u0004\b3\u00104R\u0011\u00105\u001a\u0002068F¢\u0006\u0006\u001a\u0004\b7\u00108R\u001e\u00109\u001a\u00020:8\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b;\u0010<\"\u0004\b=\u0010>R\u0014\u0010?\u001a\u00020 8VX\u0004¢\u0006\u0006\u001a\u0004\b@\u0010\"R\u001e\u0010A\u001a\u00020B8\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\bC\u0010D\"\u0004\bE\u0010FR\u0011\u0010G\u001a\u00020H8F¢\u0006\u0006\u001a\u0004\bI\u0010JR\u001e\u0010K\u001a\u00020L8\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\bM\u0010N\"\u0004\bO\u0010PR\u0014\u0010Q\u001a\u00020 8VX\u0004¢\u0006\u0006\u001a\u0004\bR\u0010\"R\u0013\u0010S\u001a\u0004\u0018\u00010T8F¢\u0006\u0006\u001a\u0004\bU\u0010VR\u0014\u0010W\u001a\u00020X8VX\u0004¢\u0006\u0006\u001a\u0004\bY\u0010ZR\u001e\u0010[\u001a\u00020\\8\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b]\u0010^\"\u0004\b_\u0010`R\u001e\u0010a\u001a\u00020b8\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\bc\u0010d\"\u0004\be\u0010fR\u001e\u0010g\u001a\u00020h8\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\bi\u0010j\"\u0004\bk\u0010lR\u001e\u0010m\u001a\u00020n8\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\bo\u0010p\"\u0004\bq\u0010rR\u0014\u0010s\u001a\u00020 8VX\u0004¢\u0006\u0006\u001a\u0004\bt\u0010\"R\u001e\u0010u\u001a\u00020v8\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\bw\u0010x\"\u0004\by\u0010z¨\u0006\u0001"}, mo31007d2 = {"Lcom/bamtechmedia/dominguez/detail/movie/tv/MovieDetailTvFragment;", "Ldagger/android/support/DaggerFragment;", "Landroid/view/ViewTreeObserver$OnGlobalFocusChangeListener;", "Lcom/bamtechmedia/dominguez/core/utils/OnKeyDownHandler;", "Lcom/bamtechmedia/dominguez/detail/common/TvDetail;", "Lcom/bamtechmedia/dominguez/detail/common/offline/OfflineViewProvider;", "Lcom/bamtechmedia/dominguez/analytics/AnalyticsStateProvider;", "()V", "accessibilityHelper", "Lcom/bamtechmedia/dominguez/detail/common/tv/ContentDetailAccessibilityHelper;", "getAccessibilityHelper", "()Lcom/bamtechmedia/dominguez/detail/common/tv/ContentDetailAccessibilityHelper;", "setAccessibilityHelper", "(Lcom/bamtechmedia/dominguez/detail/common/tv/ContentDetailAccessibilityHelper;)V", "adapter", "Lcom/xwray/groupie/GroupAdapter;", "Lcom/xwray/groupie/ViewHolder;", "getAdapter", "()Lcom/xwray/groupie/GroupAdapter;", "setAdapter", "(Lcom/xwray/groupie/GroupAdapter;)V", "addToWatchlist", "", "getAddToWatchlist", "()Z", "contentDetailKeyDownHandler", "Lcom/bamtechmedia/dominguez/detail/common/tv/ContentDetailTvKeyDownHandler;", "getContentDetailKeyDownHandler", "()Lcom/bamtechmedia/dominguez/detail/common/tv/ContentDetailTvKeyDownHandler;", "setContentDetailKeyDownHandler", "(Lcom/bamtechmedia/dominguez/detail/common/tv/ContentDetailTvKeyDownHandler;)V", "currentFocusButton", "Landroid/view/View;", "getCurrentFocusButton", "()Landroid/view/View;", "detailErrorStateHandler", "Lcom/bamtechmedia/dominguez/detail/common/error/DetailErrorStateHandler;", "getDetailErrorStateHandler", "()Lcom/bamtechmedia/dominguez/detail/common/error/DetailErrorStateHandler;", "setDetailErrorStateHandler", "(Lcom/bamtechmedia/dominguez/detail/common/error/DetailErrorStateHandler;)V", "detailImageLoader", "Lcom/bamtechmedia/dominguez/detail/common/tv/DetailImageLoader;", "getDetailImageLoader", "()Lcom/bamtechmedia/dominguez/detail/common/tv/DetailImageLoader;", "setDetailImageLoader", "(Lcom/bamtechmedia/dominguez/detail/common/tv/DetailImageLoader;)V", "detailsListContentManipulator", "Lcom/bamtechmedia/dominguez/detail/common/tv/DetailsListTvContentManipulator;", "getDetailsListContentManipulator", "()Lcom/bamtechmedia/dominguez/detail/common/tv/DetailsListTvContentManipulator;", "setDetailsListContentManipulator", "(Lcom/bamtechmedia/dominguez/detail/common/tv/DetailsListTvContentManipulator;)V", "familyId", "", "getFamilyId", "()Ljava/lang/String;", "focusHelper", "Lcom/bamtechmedia/dominguez/collections/CollectionViewFocusHelper;", "getFocusHelper", "()Lcom/bamtechmedia/dominguez/collections/CollectionViewFocusHelper;", "setFocusHelper", "(Lcom/bamtechmedia/dominguez/collections/CollectionViewFocusHelper;)V", "header", "getHeader", "headerSectionViewHolder", "Lcom/bamtechmedia/dominguez/detail/common/tv/TvDetailHeaderSectionViewHolder;", "getHeaderSectionViewHolder", "()Lcom/bamtechmedia/dominguez/detail/common/tv/TvDetailHeaderSectionViewHolder;", "setHeaderSectionViewHolder", "(Lcom/bamtechmedia/dominguez/detail/common/tv/TvDetailHeaderSectionViewHolder;)V", "initialTab", "Lcom/bamtechmedia/dominguez/core/content/InitialTab;", "getInitialTab", "()Lcom/bamtechmedia/dominguez/core/content/InitialTab;", "itemViewStateUserIntent", "Lcom/bamtechmedia/dominguez/detail/common/item/UserIntent;", "getItemViewStateUserIntent", "()Lcom/bamtechmedia/dominguez/detail/common/item/UserIntent;", "setItemViewStateUserIntent", "(Lcom/bamtechmedia/dominguez/detail/common/item/UserIntent;)V", "mainView", "getMainView", "movie", "Lcom/bamtechmedia/dominguez/core/content/Movie;", "getMovie", "()Lcom/bamtechmedia/dominguez/core/content/Movie;", "noConnectionView", "Lcom/bamtechmedia/dominguez/core/design/widgets/NoConnectionView;", "getNoConnectionView", "()Lcom/bamtechmedia/dominguez/core/design/widgets/NoConnectionView;", "offlineStateMonitor", "Lcom/bamtechmedia/dominguez/detail/common/offline/DetailOfflineStateMonitor;", "getOfflineStateMonitor", "()Lcom/bamtechmedia/dominguez/detail/common/offline/DetailOfflineStateMonitor;", "setOfflineStateMonitor", "(Lcom/bamtechmedia/dominguez/detail/common/offline/DetailOfflineStateMonitor;)V", "presenter", "Lcom/bamtechmedia/dominguez/detail/movie/tv/MovieDetailTvPresenter;", "getPresenter", "()Lcom/bamtechmedia/dominguez/detail/movie/tv/MovieDetailTvPresenter;", "setPresenter", "(Lcom/bamtechmedia/dominguez/detail/movie/tv/MovieDetailTvPresenter;)V", "recyclerViewSnapScrollHelper", "Lcom/bamtechmedia/dominguez/core/recycler/RecyclerViewSnapScrollHelper;", "getRecyclerViewSnapScrollHelper", "()Lcom/bamtechmedia/dominguez/core/recycler/RecyclerViewSnapScrollHelper;", "setRecyclerViewSnapScrollHelper", "(Lcom/bamtechmedia/dominguez/core/recycler/RecyclerViewSnapScrollHelper;)V", "runtimeConverter", "Lcom/bamtechmedia/dominguez/core/utils/RuntimeConverter;", "getRuntimeConverter", "()Lcom/bamtechmedia/dominguez/core/utils/RuntimeConverter;", "setRuntimeConverter", "(Lcom/bamtechmedia/dominguez/core/utils/RuntimeConverter;)V", "tabs", "getTabs", "viewModel", "Lcom/bamtechmedia/dominguez/detail/movie/viewmodel/MovieDetailViewModel;", "getViewModel", "()Lcom/bamtechmedia/dominguez/detail/movie/viewmodel/MovieDetailViewModel;", "setViewModel", "(Lcom/bamtechmedia/dominguez/detail/movie/viewmodel/MovieDetailViewModel;)V", "animate", "", "keyCode", "", "v", "getAnalyticsSection", "Lcom/bamtechmedia/dominguez/analytics/AnalyticsSection;", "handleState", "state", "Lcom/bamtechmedia/dominguez/detail/movie/viewmodel/MovieDetailViewModel$State;", "userIntent", "isHeaderItem", "group", "Lcom/xwray/groupie/Group;", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onCreateView", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "onDestroyView", "onGlobalFocusChanged", "oldFocus", "newFocus", "onKeyDown", "onStart", "onViewCreated", "view", "isFocusableButton", "Companion", "contentDetail_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* renamed from: g.e.b.k.j.j.f */
/* compiled from: MovieDetailTvFragment.kt */
public final class C7341f extends C11890i implements OnGlobalFocusChangeListener, C5864r, C5904a0, C5995c, C2413n {

    /* renamed from: k0 */
    public static final C7342a f16127k0 = new C7342a(null);

    /* renamed from: U */
    public C7352b f16128U;

    /* renamed from: V */
    public C11848c<C11863k> f16129V;

    /* renamed from: W */
    public C7349h f16130W;

    /* renamed from: X */
    public C5821c0 f16131X;

    /* renamed from: Y */
    public C5955f f16132Y;

    /* renamed from: Z */
    public C5956g f16133Z;

    /* renamed from: a0 */
    public C3432o f16134a0;

    /* renamed from: b0 */
    public C5950d f16135b0;

    /* renamed from: c0 */
    public C5910b f16136c0;

    /* renamed from: d0 */
    public RecyclerViewSnapScrollHelper f16137d0;

    /* renamed from: e0 */
    public DetailOfflineStateMonitor f16138e0;

    /* renamed from: f0 */
    public C5981c f16139f0;

    /* renamed from: g0 */
    public C5951e f16140g0;

    /* renamed from: h0 */
    public C5944a f16141h0;

    /* renamed from: i0 */
    private View f16142i0;

    /* renamed from: j0 */
    private HashMap f16143j0;

    /* renamed from: g.e.b.k.j.j.f$a */
    /* compiled from: MovieDetailTvFragment.kt */
    public static final class C7342a implements C7350a {
        private C7342a() {
        }

        /* renamed from: a */
        public Fragment mo20164a(String str, C3690l lVar, boolean z, boolean z2) {
            C7341f fVar = new C7341f();
            Pair[] pairArr = {C12907r.m40244a("familyId", str), C12907r.m40244a("initialTab", lVar), C12907r.m40244a("addToWatchlist", Boolean.valueOf(z))};
            fVar.setArguments(C5833g.m18829a((Pair[]) Arrays.copyOf(pairArr, pairArr.length)));
            return fVar;
        }

        public /* synthetic */ C7342a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public C7341f mo20165a(C3692n nVar, C3690l lVar) {
            C7341f fVar = new C7341f();
            Pair[] pairArr = {C12907r.m40244a("movie", nVar), C12907r.m40244a("familyId", nVar.mo13264e()), C12907r.m40244a("initialTab", lVar)};
            fVar.setArguments(C5833g.m18829a((Pair[]) Arrays.copyOf(pairArr, pairArr.length)));
            return fVar;
        }
    }

    /* renamed from: g.e.b.k.j.j.f$b */
    /* compiled from: MovieDetailTvFragment.kt */
    static final class C7343b extends C12881k implements Function1<Integer, C13145v> {

        /* renamed from: c */
        final /* synthetic */ C7341f f16144c;

        C7343b(C7341f fVar) {
            this.f16144c = fVar;
            super(1);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke(((Number) obj).intValue());
            return C13145v.f29587a;
        }

        public final void invoke(int i) {
            ((FocusSearchInterceptMotionLayout) this.f16144c._$_findCachedViewById(C7310d.contentDetailMotionLayout)).mo2145c(i);
            this.f16144c.getViewModel().mo20175a(Integer.valueOf(i));
        }
    }

    /* renamed from: g.e.b.k.j.j.f$c */
    /* compiled from: MovieDetailTvFragment.kt */
    static final class C7344c extends C12881k implements Function1<C7354b, C13145v> {

        /* renamed from: c */
        final /* synthetic */ C7341f f16145c;

        C7344c(C7341f fVar) {
            this.f16145c = fVar;
            super(1);
        }

        /* renamed from: a */
        public final void mo20167a(C7354b bVar) {
            C7341f fVar = this.f16145c;
            fVar.m22004a(bVar, fVar.mo20162r());
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo20167a((C7354b) obj);
            return C13145v.f29587a;
        }
    }

    @Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, mo31007d2 = {"<anonymous>", "", "invoke"}, mo31008k = 3, mo31009mv = {1, 1, 15})
    /* renamed from: g.e.b.k.j.j.f$d */
    /* compiled from: MovieDetailTvFragment.kt */
    static final class C7345d extends C12881k implements Function0<C13145v> {

        /* renamed from: c */
        final /* synthetic */ C7341f f16146c;

        /* renamed from: g.e.b.k.j.j.f$d$a */
        /* compiled from: View.kt */
        public static final class C7346a implements OnLayoutChangeListener {

            /* renamed from: c */
            final /* synthetic */ C7345d f16147c;

            public C7346a(C7345d dVar) {
                this.f16147c = dVar;
            }

            public void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
                view.removeOnLayoutChangeListener(this);
                View a = this.f16147c.f16146c.m22006t();
                if (a != null) {
                    a.sendAccessibilityEvent(8);
                }
            }
        }

        C7345d(C7341f fVar) {
            this.f16146c = fVar;
            super(0);
        }

        public final void invoke() {
            View a = this.f16146c.m22006t();
            if (a != null) {
                a.requestFocus();
            }
            FocusSearchInterceptMotionLayout focusSearchInterceptMotionLayout = (FocusSearchInterceptMotionLayout) this.f16146c._$_findCachedViewById(C7310d.contentDetailMotionLayout);
            Intrinsics.checkReturnedValueIsNotNull((Object) focusSearchInterceptMotionLayout, "contentDetailMotionLayout");
            focusSearchInterceptMotionLayout.addOnLayoutChangeListener(new C7346a(this));
        }
    }

    /* renamed from: g.e.b.k.j.j.f$e */
    /* compiled from: MovieDetailTvFragment.kt */
    static final class C7347e extends C12881k implements Function2<Integer, View, C13145v> {

        /* renamed from: c */
        final /* synthetic */ C7341f f16148c;

        C7347e(C7341f fVar) {
            this.f16148c = fVar;
            super(2);
        }

        /* renamed from: a */
        public final void mo20169a(int i, View view) {
            if (view != null) {
                this.f16148c.m22001a(i, view);
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            mo20169a(((Number) obj).intValue(), (View) obj2);
            return C13145v.f29587a;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: t */
    public final View m22006t() {
        View view = this.f16142i0;
        if (view != null) {
            return view;
        }
        View _$_findCachedViewById = _$_findCachedViewById(C7310d.includeHeader);
        Intrinsics.checkReturnedValueIsNotNull((Object) _$_findCachedViewById, "includeHeader");
        return (DefaultBookmarkButton) _$_findCachedViewById.findViewById(C7310d.startPlayerButton);
    }

    public void _$_clearFindViewByIdCache() {
        HashMap hashMap = this.f16143j0;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    public View _$_findCachedViewById(int i) {
        if (this.f16143j0 == null) {
            this.f16143j0 = new HashMap();
        }
        View view = (View) this.f16143j0.get(Integer.valueOf(i));
        if (view == null) {
            View view2 = getView();
            if (view2 == null) {
                return null;
            }
            view = view2.findViewById(i);
            this.f16143j0.put(Integer.valueOf(i), view);
        }
        return view;
    }

    /* renamed from: b */
    public NoConnectionView mo18038b() {
        NoConnectionView noConnectionView = (NoConnectionView) _$_findCachedViewById(C7310d.contentDetailNoConnectionView);
        Intrinsics.checkReturnedValueIsNotNull((Object) noConnectionView, "contentDetailNoConnectionView");
        return noConnectionView;
    }

    /* renamed from: c */
    public View mo17810c() {
        View _$_findCachedViewById = _$_findCachedViewById(C7310d.includeTabs);
        Intrinsics.checkReturnedValueIsNotNull((Object) _$_findCachedViewById, "includeTabs");
        return _$_findCachedViewById;
    }

    /* renamed from: e */
    public C2378m mo11534e() {
        return new C2378m(C2433b.MOVIE_DETAILS, (String) null, 2, (DefaultConstructorMarker) null);
    }

    public final C7352b getViewModel() {
        C7352b bVar = this.f16128U;
        if (bVar != null) {
            return bVar;
        }
        Intrinsics.throwUninitializedPropertyAccessException("viewModel");
        throw null;
    }

    /* renamed from: l */
    public View mo17811l() {
        View _$_findCachedViewById = _$_findCachedViewById(C7310d.includeHeader);
        Intrinsics.checkReturnedValueIsNotNull((Object) _$_findCachedViewById, "includeHeader");
        return _$_findCachedViewById;
    }

    /* renamed from: o */
    public final boolean mo20158o() {
        Bundle arguments = getArguments();
        if (arguments != null) {
            return arguments.getBoolean("addToWatchlist");
        }
        return false;
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        C0715i lifecycle = getLifecycle();
        C7352b bVar = this.f16128U;
        if (bVar != null) {
            lifecycle.mo4134a(bVar.mo17917z());
            C0715i lifecycle2 = getLifecycle();
            DetailOfflineStateMonitor detailOfflineStateMonitor = this.f16138e0;
            if (detailOfflineStateMonitor != null) {
                lifecycle2.mo4134a(detailOfflineStateMonitor);
            } else {
                Intrinsics.throwUninitializedPropertyAccessException("offlineStateMonitor");
                throw null;
            }
        } else {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
            throw null;
        }
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return C7738g.m22802a(this, C7312f.fragment_content_detail_tv, viewGroup, false, 4, null);
    }

    public void onDestroyView() {
        C5956g gVar = this.f16133Z;
        if (gVar != null) {
            gVar.mo17890a();
            View view = getView();
            if (view != null) {
                ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
                if (viewTreeObserver != null) {
                    viewTreeObserver.removeOnGlobalFocusChangeListener(this);
                }
            }
            super.onDestroyView();
            _$_clearFindViewByIdCache();
            return;
        }
        Intrinsics.throwUninitializedPropertyAccessException("headerSectionViewHolder");
        throw null;
    }

    public void onGlobalFocusChanged(View view, View view2) {
        if (!isRemoving() && view2 != null) {
            Context requireContext = requireContext();
            Intrinsics.checkReturnedValueIsNotNull((Object) requireContext, "requireContext()");
            if (C5837i.m18836a(requireContext)) {
                RecyclerViewSnapScrollHelper recyclerViewSnapScrollHelper = this.f16137d0;
                if (recyclerViewSnapScrollHelper != null) {
                    recyclerViewSnapScrollHelper.mo17709a(view2);
                } else {
                    Intrinsics.throwUninitializedPropertyAccessException("recyclerViewSnapScrollHelper");
                    throw null;
                }
            }
        }
    }

    public void onStart() {
        super.onStart();
        C7352b bVar = this.f16128U;
        if (bVar != null) {
            C5755i.m18679a(this, bVar, null, null, new C7344c(this), 6, null);
            return;
        }
        Intrinsics.throwUninitializedPropertyAccessException("viewModel");
        throw null;
    }

    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        C5955f fVar = this.f16132Y;
        if (fVar != null) {
            C11848c<C11863k> cVar = this.f16129V;
            String str = "adapter";
            if (cVar != null) {
                RecyclerView recyclerView = (RecyclerView) _$_findCachedViewById(C7310d.contentDetailRecyclerView);
                String str2 = "contentDetailRecyclerView";
                Intrinsics.checkReturnedValueIsNotNull((Object) recyclerView, str2);
                View _$_findCachedViewById = _$_findCachedViewById(C7310d.includeTabs);
                String str3 = "includeTabs";
                Intrinsics.checkReturnedValueIsNotNull((Object) _$_findCachedViewById, str3);
                FocusSearchInterceptTabLayout focusSearchInterceptTabLayout = (FocusSearchInterceptTabLayout) _$_findCachedViewById.findViewById(C7310d.detailTabLayout);
                String str4 = "includeTabs.detailTabLayout";
                Intrinsics.checkReturnedValueIsNotNull((Object) focusSearchInterceptTabLayout, str4);
                fVar.mo17888a(cVar, recyclerView, (TabLayout) focusSearchInterceptTabLayout);
                RecyclerView recyclerView2 = (RecyclerView) _$_findCachedViewById(C7310d.contentDetailRecyclerView);
                Intrinsics.checkReturnedValueIsNotNull((Object) recyclerView2, str2);
                C11848c<C11863k> cVar2 = this.f16129V;
                if (cVar2 != null) {
                    RecyclerViewExtKt.m18800a(this, recyclerView2, cVar2);
                    ((RecyclerView) _$_findCachedViewById(C7310d.contentDetailRecyclerView)).setHasFixedSize(true);
                    RecyclerView recyclerView3 = (RecyclerView) _$_findCachedViewById(C7310d.contentDetailRecyclerView);
                    Intrinsics.checkReturnedValueIsNotNull((Object) recyclerView3, str2);
                    recyclerView3.setClipToOutline(true);
                    C7352b bVar = this.f16128U;
                    if (bVar != null) {
                        Integer E = bVar.mo20171E();
                        String str5 = "contentDetailMotionLayout";
                        if (E != null) {
                            int intValue = E.intValue();
                            ((FocusSearchInterceptMotionLayout) _$_findCachedViewById(C7310d.contentDetailMotionLayout)).setTransitionDuration(0);
                            ((FocusSearchInterceptMotionLayout) _$_findCachedViewById(C7310d.contentDetailMotionLayout)).mo2142b(intValue, intValue);
                            FocusSearchInterceptMotionLayout focusSearchInterceptMotionLayout = (FocusSearchInterceptMotionLayout) _$_findCachedViewById(C7310d.contentDetailMotionLayout);
                            Intrinsics.checkReturnedValueIsNotNull((Object) focusSearchInterceptMotionLayout, str5);
                            focusSearchInterceptMotionLayout.setProgress(1.0f);
                            if (intValue == C7310d.headerExpanded) {
                                View t = m22006t();
                                if (t != null) {
                                    t.requestFocus();
                                }
                            }
                        }
                        view.getViewTreeObserver().addOnGlobalFocusChangeListener(this);
                        RecyclerViewSnapScrollHelper recyclerViewSnapScrollHelper = this.f16137d0;
                        if (recyclerViewSnapScrollHelper != null) {
                            C0722m viewLifecycleOwner = getViewLifecycleOwner();
                            Intrinsics.checkReturnedValueIsNotNull((Object) viewLifecycleOwner, "viewLifecycleOwner");
                            RecyclerView recyclerView4 = (RecyclerView) _$_findCachedViewById(C7310d.contentDetailRecyclerView);
                            Intrinsics.checkReturnedValueIsNotNull((Object) recyclerView4, str2);
                            recyclerViewSnapScrollHelper.mo17710a(viewLifecycleOwner, recyclerView4, (C5805c) new C5808c(null, 1, null));
                            C5944a aVar = this.f16141h0;
                            String str6 = "accessibilityHelper";
                            if (aVar != null) {
                                View _$_findCachedViewById2 = _$_findCachedViewById(C7310d.contentDetailAccessibilityFocusWorkaround);
                                Intrinsics.checkReturnedValueIsNotNull((Object) _$_findCachedViewById2, "contentDetailAccessibilityFocusWorkaround");
                                aVar.mo17872a(_$_findCachedViewById2, (Function0<C13145v>) new C7345d<C13145v>(this));
                                C5944a aVar2 = this.f16141h0;
                                if (aVar2 != null) {
                                    FocusSearchInterceptMotionLayout focusSearchInterceptMotionLayout2 = (FocusSearchInterceptMotionLayout) _$_findCachedViewById(C7310d.contentDetailMotionLayout);
                                    Intrinsics.checkReturnedValueIsNotNull((Object) focusSearchInterceptMotionLayout2, str5);
                                    View _$_findCachedViewById3 = _$_findCachedViewById(C7310d.includeTabs);
                                    Intrinsics.checkReturnedValueIsNotNull((Object) _$_findCachedViewById3, str3);
                                    FocusSearchInterceptTabLayout focusSearchInterceptTabLayout2 = (FocusSearchInterceptTabLayout) _$_findCachedViewById3.findViewById(C7310d.detailTabLayout);
                                    Intrinsics.checkReturnedValueIsNotNull((Object) focusSearchInterceptTabLayout2, str4);
                                    aVar2.mo17873a(focusSearchInterceptMotionLayout2, focusSearchInterceptTabLayout2, new C7347e(this));
                                    return;
                                }
                                Intrinsics.throwUninitializedPropertyAccessException(str6);
                                throw null;
                            }
                            Intrinsics.throwUninitializedPropertyAccessException(str6);
                            throw null;
                        }
                        Intrinsics.throwUninitializedPropertyAccessException("recyclerViewSnapScrollHelper");
                        throw null;
                    }
                    Intrinsics.throwUninitializedPropertyAccessException("viewModel");
                    throw null;
                }
                Intrinsics.throwUninitializedPropertyAccessException(str);
                throw null;
            }
            Intrinsics.throwUninitializedPropertyAccessException(str);
            throw null;
        }
        Intrinsics.throwUninitializedPropertyAccessException("detailsListContentManipulator");
        throw null;
    }

    /* renamed from: p */
    public final String mo20160p() {
        Bundle arguments = getArguments();
        if (arguments != null) {
            String string = arguments.getString("familyId");
            if (string != null) {
                return string;
            }
        }
        return "";
    }

    /* renamed from: q */
    public final C3690l mo20161q() {
        Bundle arguments = getArguments();
        Serializable serializable = arguments != null ? arguments.getSerializable("initialTab") : null;
        if (!(serializable instanceof C3690l)) {
            serializable = null;
        }
        C3690l lVar = (C3690l) serializable;
        return lVar != null ? lVar : C3690l.NONE;
    }

    /* renamed from: r */
    public final C5981c mo20162r() {
        C5981c cVar = this.f16139f0;
        if (cVar != null) {
            return cVar;
        }
        Intrinsics.throwUninitializedPropertyAccessException("itemViewStateUserIntent");
        throw null;
    }

    /* renamed from: s */
    public final C3692n mo20163s() {
        Bundle arguments = getArguments();
        if (arguments != null) {
            return (C3692n) arguments.getParcelable("movie");
        }
        return null;
    }

    /* renamed from: a */
    public View mo18037a() {
        FocusSearchInterceptMotionLayout focusSearchInterceptMotionLayout = (FocusSearchInterceptMotionLayout) _$_findCachedViewById(C7310d.contentDetailMotionLayout);
        Intrinsics.checkReturnedValueIsNotNull((Object) focusSearchInterceptMotionLayout, "contentDetailMotionLayout");
        return focusSearchInterceptMotionLayout;
    }

    /* renamed from: a */
    public boolean mo12232a(int i) {
        View view = getView();
        if (view == null) {
            return false;
        }
        View findFocus = view.findFocus();
        if (findFocus == null) {
            return false;
        }
        if (m22005a(findFocus)) {
            this.f16142i0 = findFocus;
        }
        m22001a(i, findFocus);
        C5950d dVar = this.f16135b0;
        if (dVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("contentDetailKeyDownHandler");
            throw null;
        } else if (dVar.mo17884a(i, findFocus, m22006t())) {
            return true;
        } else {
            C3432o oVar = this.f16134a0;
            if (oVar != null) {
                boolean a = oVar.mo12605a(i, findFocus, false);
                if (!a) {
                    RecyclerViewSnapScrollHelper recyclerViewSnapScrollHelper = this.f16137d0;
                    if (recyclerViewSnapScrollHelper != null) {
                        RecyclerViewSnapScrollHelper.m18771a(recyclerViewSnapScrollHelper, i, findFocus, null, 4, null);
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

    /* renamed from: a */
    public boolean mo17809a(C11847b bVar) {
        return bVar instanceof C7327a;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final void m22004a(C7354b bVar, C5981c cVar) {
        C5805c cVar2;
        DetailOfflineStateMonitor detailOfflineStateMonitor = this.f16138e0;
        String str = "offlineStateMonitor";
        if (detailOfflineStateMonitor != null) {
            detailOfflineStateMonitor.mo18032b();
            C5910b bVar2 = this.f16136c0;
            if (bVar2 != null) {
                C0532d requireActivity = requireActivity();
                Intrinsics.checkReturnedValueIsNotNull((Object) requireActivity, "requireActivity()");
                DetailOfflineStateMonitor detailOfflineStateMonitor2 = this.f16138e0;
                if (detailOfflineStateMonitor2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException(str);
                    throw null;
                } else if (!bVar2.mo17817a(bVar, requireActivity, !detailOfflineStateMonitor2.mo18033d())) {
                    C3692n i = bVar.mo20182i();
                    if (i != null) {
                        C5951e eVar = this.f16140g0;
                        if (eVar != null) {
                            eVar.mo17885a(this, i);
                        } else {
                            Intrinsics.throwUninitializedPropertyAccessException("detailImageLoader");
                            throw null;
                        }
                    }
                    C5956g gVar = this.f16133Z;
                    if (gVar != null) {
                        C7349h hVar = this.f16130W;
                        String str2 = "presenter";
                        if (hVar != null) {
                            gVar.mo17891a(hVar.mo20170a(bVar));
                            C6008x d = bVar.mo17871d();
                            if (d != null) {
                                int indexOf = bVar.mo17870c().indexOf(d);
                                C7349h hVar2 = this.f16130W;
                                if (hVar2 != null) {
                                    List a = hVar2.mo20154a(bVar, cVar);
                                    C5955f fVar = this.f16132Y;
                                    if (fVar != null) {
                                        C5955f.m19103a(fVar, a, indexOf, false, 4, null);
                                        RecyclerViewSnapScrollHelper recyclerViewSnapScrollHelper = this.f16137d0;
                                        if (recyclerViewSnapScrollHelper != null) {
                                            if (d.mo18028d() == C7313g.nav_extras) {
                                                cVar2 = new C5808c(null, 1, null);
                                            } else {
                                                cVar2 = C5806a.f13590a;
                                            }
                                            recyclerViewSnapScrollHelper.mo17711a(cVar2);
                                            return;
                                        }
                                        Intrinsics.throwUninitializedPropertyAccessException("recyclerViewSnapScrollHelper");
                                        throw null;
                                    }
                                    Intrinsics.throwUninitializedPropertyAccessException("detailsListContentManipulator");
                                    throw null;
                                }
                                Intrinsics.throwUninitializedPropertyAccessException(str2);
                                throw null;
                            }
                            return;
                        }
                        Intrinsics.throwUninitializedPropertyAccessException(str2);
                        throw null;
                    }
                    Intrinsics.throwUninitializedPropertyAccessException("headerSectionViewHolder");
                    throw null;
                }
            } else {
                Intrinsics.throwUninitializedPropertyAccessException("detailErrorStateHandler");
                throw null;
            }
        } else {
            Intrinsics.throwUninitializedPropertyAccessException(str);
            throw null;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final void m22001a(int i, View view) {
        ImageView imageView = (ImageView) _$_findCachedViewById(C7310d.contentDetailBlurredBackgroundImage);
        Intrinsics.checkReturnedValueIsNotNull((Object) imageView, "contentDetailBlurredBackgroundImage");
        boolean z = imageView.getDrawable() == null;
        Context requireContext = requireContext();
        Intrinsics.checkReturnedValueIsNotNull((Object) requireContext, "requireContext()");
        boolean z2 = C5837i.m18836a(requireContext) ? view.getId() == C7310d.videoDetailDescription : m22005a(view);
        C5950d dVar = this.f16135b0;
        if (dVar != null) {
            dVar.mo17883a(i, view, z, z2, new C7343b(this));
        } else {
            Intrinsics.throwUninitializedPropertyAccessException("contentDetailKeyDownHandler");
            throw null;
        }
    }

    /* renamed from: a */
    private final boolean m22005a(View view) {
        return view.getId() == C7310d.startPlayerButton || view.getId() == C7310d.restartButton || view.getId() == C7310d.watchlistButton;
    }
}
