package p163g.p201e.p203b.p287k.p293k.p296s;

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
import com.bamtechmedia.dominguez.core.content.C3791v;
import com.bamtechmedia.dominguez.core.design.widgets.NoConnectionView;
import com.bamtechmedia.dominguez.core.design.widgets.focus.FocusSearchInterceptMotionLayout;
import com.bamtechmedia.dominguez.core.design.widgets.focus.FocusSearchInterceptTabLayout;
import com.bamtechmedia.dominguez.core.framework.C5755i;
import com.bamtechmedia.dominguez.core.recycler.RecyclerViewSnapScrollHelper;
import com.bamtechmedia.dominguez.core.recycler.RecyclerViewSnapScrollHelper.C5805c;
import com.bamtechmedia.dominguez.core.recycler.RecyclerViewSnapScrollHelper.C5805c.C5806a;
import com.bamtechmedia.dominguez.core.recycler.RecyclerViewSnapScrollHelper.C5805c.C5808c;
import com.bamtechmedia.dominguez.core.utils.C5833g;
import com.bamtechmedia.dominguez.core.utils.C5837i;
import com.bamtechmedia.dominguez.core.utils.C5839j;
import com.bamtechmedia.dominguez.core.utils.C5864r;
import com.bamtechmedia.dominguez.core.utils.C5883w;
import com.bamtechmedia.dominguez.core.utils.RecyclerViewExtKt;
import com.bamtechmedia.dominguez.detail.common.C5904a0;
import com.bamtechmedia.dominguez.detail.common.C6008x;
import com.bamtechmedia.dominguez.detail.common.DefaultBookmarkButton;
import com.bamtechmedia.dominguez.detail.common.offline.C5995c;
import com.bamtechmedia.dominguez.detail.common.offline.DetailOfflineStateMonitor;
import com.bamtechmedia.dominguez.detail.common.p226c0.C5910b;
import com.bamtechmedia.dominguez.detail.common.p230g0.C5944a;
import com.bamtechmedia.dominguez.detail.common.p230g0.C5950d;
import com.bamtechmedia.dominguez.detail.common.p230g0.C5951e;
import com.bamtechmedia.dominguez.detail.common.p230g0.C5955f;
import com.bamtechmedia.dominguez.detail.common.p230g0.C5956g;
import com.google.android.material.tabs.TabLayout;
import java.util.Arrays;
import java.util.HashMap;
import kotlin.C12907r;
import kotlin.C13145v;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.C12880j;
import kotlin.jvm.internal.C12881k;
import kotlin.jvm.internal.C12890t;
import kotlin.jvm.internal.C12891u;
import kotlin.jvm.internal.C12895y;
import kotlin.reflect.KProperty;
import p163g.p201e.p203b.p287k.C7310d;
import p163g.p201e.p203b.p287k.C7312f;
import p163g.p201e.p203b.p287k.C7313g;
import p163g.p201e.p203b.p287k.p293k.C7394e;
import p163g.p201e.p203b.p287k.p293k.C7396f;
import p163g.p201e.p203b.p287k.p293k.p294q.C7410a;
import p163g.p201e.p203b.p287k.p293k.p297t.C7454a;
import p163g.p201e.p203b.p287k.p293k.p297t.C7454a.C7468g;
import p163g.p201e.p203b.p314r.C7738g;
import p163g.p509o.p510a.C11847b;
import p163g.p509o.p510a.C11848c;
import p163g.p509o.p510a.C11863k;
import p512h.p513c.p514k.C11890i;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000Þ\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u0000 \u00012\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u00052\u00020\u0006:\u0002\u0001B\u0005¢\u0006\u0002\u0010\u0007J\u0018\u0010e\u001a\u00020f2\u0006\u0010g\u001a\u00020h2\u0006\u0010i\u001a\u00020\u001cH\u0002J\b\u0010j\u001a\u00020kH\u0016J\u0015\u0010l\u001a\u00020f2\u0006\u0010m\u001a\u00020nH\u0001¢\u0006\u0002\boJ\u0010\u0010p\u001a\u00020q2\u0006\u0010r\u001a\u00020sH\u0016J\u0012\u0010t\u001a\u00020f2\b\u0010u\u001a\u0004\u0018\u00010vH\u0016J&\u0010w\u001a\u0004\u0018\u00010\u001c2\u0006\u0010x\u001a\u00020y2\b\u0010z\u001a\u0004\u0018\u00010{2\b\u0010u\u001a\u0004\u0018\u00010vH\u0016J\b\u0010|\u001a\u00020fH\u0016J\u001c\u0010}\u001a\u00020f2\b\u0010~\u001a\u0004\u0018\u00010\u001c2\b\u0010\u001a\u0004\u0018\u00010\u001cH\u0016J\u0011\u0010\u0001\u001a\u00020q2\u0006\u0010g\u001a\u00020hH\u0016J\t\u0010\u0001\u001a\u00020fH\u0016J\u001c\u0010\u0001\u001a\u00020f2\u0007\u0010\u0001\u001a\u00020\u001c2\b\u0010u\u001a\u0004\u0018\u00010vH\u0016J\r\u0010\u0001\u001a\u00020q*\u00020\u001cH\u0002R\u001e\u0010\b\u001a\u00020\t8\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR$\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f8\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001e\u0010\u0015\u001a\u00020\u00168\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u0018\u0010\u001b\u001a\u0004\u0018\u00010\u001c8BX\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u001e\u0010\u001f\u001a\u00020 8\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R\u001e\u0010%\u001a\u00020&8\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b'\u0010(\"\u0004\b)\u0010*R\u001e\u0010+\u001a\u00020,8\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b-\u0010.\"\u0004\b/\u00100R\u001e\u00101\u001a\u0002028\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b3\u00104\"\u0004\b5\u00106R\u0014\u00107\u001a\u00020\u001c8VX\u0004¢\u0006\u0006\u001a\u0004\b8\u0010\u001eR\u001e\u00109\u001a\u00020:8\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b;\u0010<\"\u0004\b=\u0010>R\u0014\u0010?\u001a\u00020\u001c8VX\u0004¢\u0006\u0006\u001a\u0004\b@\u0010\u001eR\u0014\u0010A\u001a\u00020B8VX\u0004¢\u0006\u0006\u001a\u0004\bC\u0010DR\u001e\u0010E\u001a\u00020F8\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\bG\u0010H\"\u0004\bI\u0010JR\u001e\u0010K\u001a\u00020L8\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\bM\u0010N\"\u0004\bO\u0010PR\u001e\u0010Q\u001a\u00020R8\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\bS\u0010T\"\u0004\bU\u0010VR\u001b\u0010W\u001a\u00020X8FX\u0002¢\u0006\f\n\u0004\b[\u0010\\\u001a\u0004\bY\u0010ZR\u0014\u0010]\u001a\u00020\u001c8VX\u0004¢\u0006\u0006\u001a\u0004\b^\u0010\u001eR\u001e\u0010_\u001a\u00020`8\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\ba\u0010b\"\u0004\bc\u0010d¨\u0006\u0001"}, mo31007d2 = {"Lcom/bamtechmedia/dominguez/detail/series/tv/SeriesDetailTvFragment;", "Ldagger/android/support/DaggerFragment;", "Lcom/bamtechmedia/dominguez/core/utils/OnKeyDownHandler;", "Lcom/bamtechmedia/dominguez/detail/common/TvDetail;", "Landroid/view/ViewTreeObserver$OnGlobalFocusChangeListener;", "Lcom/bamtechmedia/dominguez/detail/common/offline/OfflineViewProvider;", "Lcom/bamtechmedia/dominguez/analytics/AnalyticsStateProvider;", "()V", "accessibilityHelper", "Lcom/bamtechmedia/dominguez/detail/common/tv/ContentDetailAccessibilityHelper;", "getAccessibilityHelper", "()Lcom/bamtechmedia/dominguez/detail/common/tv/ContentDetailAccessibilityHelper;", "setAccessibilityHelper", "(Lcom/bamtechmedia/dominguez/detail/common/tv/ContentDetailAccessibilityHelper;)V", "adapter", "Lcom/xwray/groupie/GroupAdapter;", "Lcom/xwray/groupie/ViewHolder;", "getAdapter", "()Lcom/xwray/groupie/GroupAdapter;", "setAdapter", "(Lcom/xwray/groupie/GroupAdapter;)V", "contentDetailKeyDownHandler", "Lcom/bamtechmedia/dominguez/detail/common/tv/ContentDetailTvKeyDownHandler;", "getContentDetailKeyDownHandler", "()Lcom/bamtechmedia/dominguez/detail/common/tv/ContentDetailTvKeyDownHandler;", "setContentDetailKeyDownHandler", "(Lcom/bamtechmedia/dominguez/detail/common/tv/ContentDetailTvKeyDownHandler;)V", "currentFocusButton", "Landroid/view/View;", "getCurrentFocusButton", "()Landroid/view/View;", "detailErrorStateHandler", "Lcom/bamtechmedia/dominguez/detail/common/error/DetailErrorStateHandler;", "getDetailErrorStateHandler", "()Lcom/bamtechmedia/dominguez/detail/common/error/DetailErrorStateHandler;", "setDetailErrorStateHandler", "(Lcom/bamtechmedia/dominguez/detail/common/error/DetailErrorStateHandler;)V", "detailImageLoader", "Lcom/bamtechmedia/dominguez/detail/common/tv/DetailImageLoader;", "getDetailImageLoader", "()Lcom/bamtechmedia/dominguez/detail/common/tv/DetailImageLoader;", "setDetailImageLoader", "(Lcom/bamtechmedia/dominguez/detail/common/tv/DetailImageLoader;)V", "detailsListContentManipulator", "Lcom/bamtechmedia/dominguez/detail/common/tv/DetailsListTvContentManipulator;", "getDetailsListContentManipulator", "()Lcom/bamtechmedia/dominguez/detail/common/tv/DetailsListTvContentManipulator;", "setDetailsListContentManipulator", "(Lcom/bamtechmedia/dominguez/detail/common/tv/DetailsListTvContentManipulator;)V", "focusHelper", "Lcom/bamtechmedia/dominguez/collections/CollectionViewFocusHelper;", "getFocusHelper", "()Lcom/bamtechmedia/dominguez/collections/CollectionViewFocusHelper;", "setFocusHelper", "(Lcom/bamtechmedia/dominguez/collections/CollectionViewFocusHelper;)V", "header", "getHeader", "headerSectionViewHolder", "Lcom/bamtechmedia/dominguez/detail/common/tv/TvDetailHeaderSectionViewHolder;", "getHeaderSectionViewHolder", "()Lcom/bamtechmedia/dominguez/detail/common/tv/TvDetailHeaderSectionViewHolder;", "setHeaderSectionViewHolder", "(Lcom/bamtechmedia/dominguez/detail/common/tv/TvDetailHeaderSectionViewHolder;)V", "mainView", "getMainView", "noConnectionView", "Lcom/bamtechmedia/dominguez/core/design/widgets/NoConnectionView;", "getNoConnectionView", "()Lcom/bamtechmedia/dominguez/core/design/widgets/NoConnectionView;", "offlineStateMonitor", "Lcom/bamtechmedia/dominguez/detail/common/offline/DetailOfflineStateMonitor;", "getOfflineStateMonitor", "()Lcom/bamtechmedia/dominguez/detail/common/offline/DetailOfflineStateMonitor;", "setOfflineStateMonitor", "(Lcom/bamtechmedia/dominguez/detail/common/offline/DetailOfflineStateMonitor;)V", "presenter", "Lcom/bamtechmedia/dominguez/detail/series/tv/SeriesDetailPresenter;", "getPresenter", "()Lcom/bamtechmedia/dominguez/detail/series/tv/SeriesDetailPresenter;", "setPresenter", "(Lcom/bamtechmedia/dominguez/detail/series/tv/SeriesDetailPresenter;)V", "recyclerViewSnapScrollHelper", "Lcom/bamtechmedia/dominguez/core/recycler/RecyclerViewSnapScrollHelper;", "getRecyclerViewSnapScrollHelper", "()Lcom/bamtechmedia/dominguez/core/recycler/RecyclerViewSnapScrollHelper;", "setRecyclerViewSnapScrollHelper", "(Lcom/bamtechmedia/dominguez/core/recycler/RecyclerViewSnapScrollHelper;)V", "seriesDetailArguments", "Lcom/bamtechmedia/dominguez/detail/series/SeriesDetailArguments;", "getSeriesDetailArguments", "()Lcom/bamtechmedia/dominguez/detail/series/SeriesDetailArguments;", "seriesDetailArguments$delegate", "Lcom/bamtechmedia/dominguez/core/utils/ParcelableFragmentArgumentDelegate;", "tabs", "getTabs", "viewModel", "Lcom/bamtechmedia/dominguez/detail/series/viewmodel/SeriesDetailViewModel;", "getViewModel", "()Lcom/bamtechmedia/dominguez/detail/series/viewmodel/SeriesDetailViewModel;", "setViewModel", "(Lcom/bamtechmedia/dominguez/detail/series/viewmodel/SeriesDetailViewModel;)V", "animate", "", "keyCode", "", "v", "getAnalyticsSection", "Lcom/bamtechmedia/dominguez/analytics/AnalyticsSection;", "handleState", "state", "Lcom/bamtechmedia/dominguez/detail/series/viewmodel/SeriesDetailViewModel$State;", "handleState$contentDetail_release", "isHeaderItem", "", "group", "Lcom/xwray/groupie/Group;", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onCreateView", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "onDestroyView", "onGlobalFocusChanged", "oldFocus", "newFocus", "onKeyDown", "onStart", "onViewCreated", "view", "isFocusableButton", "Companion", "contentDetail_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* renamed from: g.e.b.k.k.s.g */
/* compiled from: SeriesDetailTvFragment.kt */
public final class C7444g extends C11890i implements C5864r, C5904a0, OnGlobalFocusChangeListener, C5995c, C2413n {

    /* renamed from: j0 */
    static final /* synthetic */ KProperty[] f16349j0 = {C12895y.m40235a((C12890t) new C12891u(C12895y.m40230a(C7444g.class), "seriesDetailArguments", "getSeriesDetailArguments()Lcom/bamtechmedia/dominguez/detail/series/SeriesDetailArguments;"))};

    /* renamed from: k0 */
    public static final C7445a f16350k0 = new C7445a(null);

    /* renamed from: U */
    private final C5883w f16351U = C5839j.m18852a("seriesArguments", (Function0) null, 2, (Object) null);

    /* renamed from: V */
    public C7454a f16352V;

    /* renamed from: W */
    public C7443f f16353W;

    /* renamed from: X */
    public C11848c<C11863k> f16354X;

    /* renamed from: Y */
    public C5955f f16355Y;

    /* renamed from: Z */
    public C3432o f16356Z;

    /* renamed from: a0 */
    public C5956g f16357a0;

    /* renamed from: b0 */
    public C5910b f16358b0;

    /* renamed from: c0 */
    public C5950d f16359c0;

    /* renamed from: d0 */
    public RecyclerViewSnapScrollHelper f16360d0;

    /* renamed from: e0 */
    public DetailOfflineStateMonitor f16361e0;

    /* renamed from: f0 */
    public C5951e f16362f0;

    /* renamed from: g0 */
    public C5944a f16363g0;

    /* renamed from: h0 */
    private View f16364h0;

    /* renamed from: i0 */
    private HashMap f16365i0;

    /* renamed from: g.e.b.k.k.s.g$a */
    /* compiled from: SeriesDetailTvFragment.kt */
    public static final class C7445a implements C7396f {
        private C7445a() {
        }

        /* renamed from: a */
        public Fragment mo20240a(C7394e eVar) {
            C7444g gVar = new C7444g();
            Pair[] pairArr = {C12907r.m40244a("seriesArguments", eVar)};
            gVar.setArguments(C5833g.m18829a((Pair[]) Arrays.copyOf(pairArr, pairArr.length)));
            return gVar;
        }

        public /* synthetic */ C7445a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: g.e.b.k.k.s.g$b */
    /* compiled from: SeriesDetailTvFragment.kt */
    static final class C7446b extends C12881k implements Function1<Integer, C13145v> {

        /* renamed from: c */
        final /* synthetic */ C7444g f16366c;

        C7446b(C7444g gVar) {
            this.f16366c = gVar;
            super(1);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke(((Number) obj).intValue());
            return C13145v.f29587a;
        }

        public final void invoke(int i) {
            ((FocusSearchInterceptMotionLayout) this.f16366c._$_findCachedViewById(C7310d.contentDetailMotionLayout)).mo2145c(i);
            this.f16366c.getViewModel().mo20303a(Integer.valueOf(i));
        }
    }

    /* renamed from: g.e.b.k.k.s.g$c */
    /* compiled from: SeriesDetailTvFragment.kt */
    static final class C7447c extends C12881k implements Function1<C7468g, C13145v> {

        /* renamed from: c */
        final /* synthetic */ C7444g f16367c;

        C7447c(C7444g gVar) {
            this.f16367c = gVar;
            super(1);
        }

        /* renamed from: a */
        public final void mo20294a(C7468g gVar) {
            this.f16367c.mo20289a(gVar);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo20294a((C7468g) obj);
            return C13145v.f29587a;
        }
    }

    @Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, mo31007d2 = {"<anonymous>", "", "invoke"}, mo31008k = 3, mo31009mv = {1, 1, 15})
    /* renamed from: g.e.b.k.k.s.g$d */
    /* compiled from: SeriesDetailTvFragment.kt */
    static final class C7448d extends C12881k implements Function0<C13145v> {

        /* renamed from: c */
        final /* synthetic */ C7444g f16368c;

        /* renamed from: g.e.b.k.k.s.g$d$a */
        /* compiled from: View.kt */
        public static final class C7449a implements OnLayoutChangeListener {

            /* renamed from: c */
            final /* synthetic */ C7448d f16369c;

            public C7449a(C7448d dVar) {
                this.f16369c = dVar;
            }

            public void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
                view.removeOnLayoutChangeListener(this);
                View a = this.f16369c.f16368c.m22243p();
                if (a != null) {
                    a.sendAccessibilityEvent(8);
                }
            }
        }

        C7448d(C7444g gVar) {
            this.f16368c = gVar;
            super(0);
        }

        public final void invoke() {
            View a = this.f16368c.m22243p();
            if (a != null) {
                a.requestFocus();
            }
            FocusSearchInterceptMotionLayout focusSearchInterceptMotionLayout = (FocusSearchInterceptMotionLayout) this.f16368c._$_findCachedViewById(C7310d.contentDetailMotionLayout);
            C12880j.m40222a((Object) focusSearchInterceptMotionLayout, "contentDetailMotionLayout");
            focusSearchInterceptMotionLayout.addOnLayoutChangeListener(new C7449a(this));
        }
    }

    /* renamed from: g.e.b.k.k.s.g$e */
    /* compiled from: SeriesDetailTvFragment.kt */
    static final class C7450e extends C12881k implements Function2<Integer, View, C13145v> {

        /* renamed from: c */
        final /* synthetic */ C7444g f16370c;

        C7450e(C7444g gVar) {
            this.f16370c = gVar;
            super(2);
        }

        /* renamed from: a */
        public final void mo20296a(int i, View view) {
            if (view != null) {
                this.f16370c.m22240a(i, view);
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            mo20296a(((Number) obj).intValue(), (View) obj2);
            return C13145v.f29587a;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: p */
    public final View m22243p() {
        View view = this.f16364h0;
        if (view != null) {
            return view;
        }
        View _$_findCachedViewById = _$_findCachedViewById(C7310d.includeHeader);
        C12880j.m40222a((Object) _$_findCachedViewById, "includeHeader");
        return (DefaultBookmarkButton) _$_findCachedViewById.findViewById(C7310d.startPlayerButton);
    }

    public void _$_clearFindViewByIdCache() {
        HashMap hashMap = this.f16365i0;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    public View _$_findCachedViewById(int i) {
        if (this.f16365i0 == null) {
            this.f16365i0 = new HashMap();
        }
        View view = (View) this.f16365i0.get(Integer.valueOf(i));
        if (view == null) {
            View view2 = getView();
            if (view2 == null) {
                return null;
            }
            view = view2.findViewById(i);
            this.f16365i0.put(Integer.valueOf(i), view);
        }
        return view;
    }

    /* renamed from: b */
    public NoConnectionView mo18038b() {
        NoConnectionView noConnectionView = (NoConnectionView) _$_findCachedViewById(C7310d.contentDetailNoConnectionView);
        C12880j.m40222a((Object) noConnectionView, "contentDetailNoConnectionView");
        return noConnectionView;
    }

    /* renamed from: c */
    public View mo17810c() {
        View _$_findCachedViewById = _$_findCachedViewById(C7310d.includeTabs);
        C12880j.m40222a((Object) _$_findCachedViewById, "includeTabs");
        return _$_findCachedViewById;
    }

    /* renamed from: e */
    public C2378m mo11534e() {
        return new C2378m(C2433b.SERIES_DETAILS, (String) null, 2, (DefaultConstructorMarker) null);
    }

    public final C7454a getViewModel() {
        C7454a aVar = this.f16352V;
        if (aVar != null) {
            return aVar;
        }
        C12880j.m40227c("viewModel");
        throw null;
    }

    /* renamed from: l */
    public View mo17811l() {
        View _$_findCachedViewById = _$_findCachedViewById(C7310d.includeHeader);
        C12880j.m40222a((Object) _$_findCachedViewById, "includeHeader");
        return _$_findCachedViewById;
    }

    /* renamed from: o */
    public final C7394e mo20291o() {
        return (C7394e) this.f16351U.mo17776a(this, f16349j0[0]);
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        C0715i lifecycle = getLifecycle();
        C7454a aVar = this.f16352V;
        if (aVar != null) {
            lifecycle.mo4134a(aVar.mo17917z());
            C0715i lifecycle2 = getLifecycle();
            DetailOfflineStateMonitor detailOfflineStateMonitor = this.f16361e0;
            if (detailOfflineStateMonitor != null) {
                lifecycle2.mo4134a(detailOfflineStateMonitor);
            } else {
                C12880j.m40227c("offlineStateMonitor");
                throw null;
            }
        } else {
            C12880j.m40227c("viewModel");
            throw null;
        }
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return C7738g.m22802a(this, C7312f.fragment_content_detail_tv, viewGroup, false, 4, null);
    }

    public void onDestroyView() {
        C5956g gVar = this.f16357a0;
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
        C12880j.m40227c("headerSectionViewHolder");
        throw null;
    }

    public void onGlobalFocusChanged(View view, View view2) {
        if (!isRemoving() && view2 != null) {
            Context requireContext = requireContext();
            C12880j.m40222a((Object) requireContext, "requireContext()");
            if (C5837i.m18836a(requireContext)) {
                RecyclerViewSnapScrollHelper recyclerViewSnapScrollHelper = this.f16360d0;
                if (recyclerViewSnapScrollHelper != null) {
                    recyclerViewSnapScrollHelper.mo17709a(view2);
                } else {
                    C12880j.m40227c("recyclerViewSnapScrollHelper");
                    throw null;
                }
            }
        }
    }

    public void onStart() {
        super.onStart();
        C7454a aVar = this.f16352V;
        if (aVar != null) {
            C5755i.m18679a(this, aVar, null, null, new C7447c(this), 6, null);
            return;
        }
        C12880j.m40227c("viewModel");
        throw null;
    }

    public void onViewCreated(View view, Bundle bundle) {
        C5955f fVar = this.f16355Y;
        if (fVar != null) {
            C11848c<C11863k> cVar = this.f16354X;
            String str = "adapter";
            if (cVar != null) {
                RecyclerView recyclerView = (RecyclerView) _$_findCachedViewById(C7310d.contentDetailRecyclerView);
                String str2 = "contentDetailRecyclerView";
                C12880j.m40222a((Object) recyclerView, str2);
                View _$_findCachedViewById = _$_findCachedViewById(C7310d.includeTabs);
                String str3 = "includeTabs";
                C12880j.m40222a((Object) _$_findCachedViewById, str3);
                FocusSearchInterceptTabLayout focusSearchInterceptTabLayout = (FocusSearchInterceptTabLayout) _$_findCachedViewById.findViewById(C7310d.detailTabLayout);
                String str4 = "includeTabs.detailTabLayout";
                C12880j.m40222a((Object) focusSearchInterceptTabLayout, str4);
                fVar.mo17888a(cVar, recyclerView, (TabLayout) focusSearchInterceptTabLayout);
                RecyclerView recyclerView2 = (RecyclerView) _$_findCachedViewById(C7310d.contentDetailRecyclerView);
                C12880j.m40222a((Object) recyclerView2, str2);
                C11848c<C11863k> cVar2 = this.f16354X;
                if (cVar2 != null) {
                    RecyclerViewExtKt.m18800a(this, recyclerView2, cVar2);
                    ((RecyclerView) _$_findCachedViewById(C7310d.contentDetailRecyclerView)).setHasFixedSize(true);
                    RecyclerView recyclerView3 = (RecyclerView) _$_findCachedViewById(C7310d.contentDetailRecyclerView);
                    C12880j.m40222a((Object) recyclerView3, str2);
                    recyclerView3.setClipToOutline(true);
                    C7454a aVar = this.f16352V;
                    if (aVar != null) {
                        Integer E = aVar.mo20297E();
                        String str5 = "contentDetailMotionLayout";
                        if (E != null) {
                            int intValue = E.intValue();
                            ((FocusSearchInterceptMotionLayout) _$_findCachedViewById(C7310d.contentDetailMotionLayout)).setTransitionDuration(0);
                            ((FocusSearchInterceptMotionLayout) _$_findCachedViewById(C7310d.contentDetailMotionLayout)).mo2142b(intValue, intValue);
                            FocusSearchInterceptMotionLayout focusSearchInterceptMotionLayout = (FocusSearchInterceptMotionLayout) _$_findCachedViewById(C7310d.contentDetailMotionLayout);
                            C12880j.m40222a((Object) focusSearchInterceptMotionLayout, str5);
                            focusSearchInterceptMotionLayout.setProgress(1.0f);
                            if (intValue == C7310d.headerExpanded) {
                                View p = m22243p();
                                if (p != null) {
                                    p.requestFocus();
                                }
                            }
                        }
                        view.getViewTreeObserver().addOnGlobalFocusChangeListener(this);
                        RecyclerViewSnapScrollHelper recyclerViewSnapScrollHelper = this.f16360d0;
                        if (recyclerViewSnapScrollHelper != null) {
                            C0722m viewLifecycleOwner = getViewLifecycleOwner();
                            C12880j.m40222a((Object) viewLifecycleOwner, "viewLifecycleOwner");
                            RecyclerView recyclerView4 = (RecyclerView) _$_findCachedViewById(C7310d.contentDetailRecyclerView);
                            C12880j.m40222a((Object) recyclerView4, str2);
                            recyclerViewSnapScrollHelper.mo17710a(viewLifecycleOwner, recyclerView4, (C5805c) new C5808c(null, 1, null));
                            C5944a aVar2 = this.f16363g0;
                            String str6 = "accessibilityHelper";
                            if (aVar2 != null) {
                                View _$_findCachedViewById2 = _$_findCachedViewById(C7310d.contentDetailAccessibilityFocusWorkaround);
                                C12880j.m40222a((Object) _$_findCachedViewById2, "contentDetailAccessibilityFocusWorkaround");
                                aVar2.mo17872a(_$_findCachedViewById2, (Function0<C13145v>) new C7448d<C13145v>(this));
                                C5944a aVar3 = this.f16363g0;
                                if (aVar3 != null) {
                                    FocusSearchInterceptMotionLayout focusSearchInterceptMotionLayout2 = (FocusSearchInterceptMotionLayout) _$_findCachedViewById(C7310d.contentDetailMotionLayout);
                                    C12880j.m40222a((Object) focusSearchInterceptMotionLayout2, str5);
                                    View _$_findCachedViewById3 = _$_findCachedViewById(C7310d.includeTabs);
                                    C12880j.m40222a((Object) _$_findCachedViewById3, str3);
                                    FocusSearchInterceptTabLayout focusSearchInterceptTabLayout2 = (FocusSearchInterceptTabLayout) _$_findCachedViewById3.findViewById(C7310d.detailTabLayout);
                                    C12880j.m40222a((Object) focusSearchInterceptTabLayout2, str4);
                                    aVar3.mo17873a(focusSearchInterceptMotionLayout2, focusSearchInterceptTabLayout2, new C7450e(this));
                                    return;
                                }
                                C12880j.m40227c(str6);
                                throw null;
                            }
                            C12880j.m40227c(str6);
                            throw null;
                        }
                        C12880j.m40227c("recyclerViewSnapScrollHelper");
                        throw null;
                    }
                    C12880j.m40227c("viewModel");
                    throw null;
                }
                C12880j.m40227c(str);
                throw null;
            }
            C12880j.m40227c(str);
            throw null;
        }
        C12880j.m40227c("detailsListContentManipulator");
        throw null;
    }

    /* renamed from: a */
    public View mo18037a() {
        FocusSearchInterceptMotionLayout focusSearchInterceptMotionLayout = (FocusSearchInterceptMotionLayout) _$_findCachedViewById(C7310d.contentDetailMotionLayout);
        C12880j.m40222a((Object) focusSearchInterceptMotionLayout, "contentDetailMotionLayout");
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
        if (m22242a(findFocus)) {
            this.f16364h0 = findFocus;
        }
        m22240a(i, findFocus);
        C5950d dVar = this.f16359c0;
        if (dVar == null) {
            C12880j.m40227c("contentDetailKeyDownHandler");
            throw null;
        } else if (dVar.mo17884a(i, findFocus, m22243p())) {
            return true;
        } else {
            C3432o oVar = this.f16356Z;
            if (oVar != null) {
                boolean a = oVar.mo12605a(i, findFocus, false);
                if (!a) {
                    RecyclerViewSnapScrollHelper recyclerViewSnapScrollHelper = this.f16360d0;
                    if (recyclerViewSnapScrollHelper != null) {
                        RecyclerViewSnapScrollHelper.m18771a(recyclerViewSnapScrollHelper, i, findFocus, null, 4, null);
                    } else {
                        C12880j.m40227c("recyclerViewSnapScrollHelper");
                        throw null;
                    }
                }
                return a;
            }
            C12880j.m40227c("focusHelper");
            throw null;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final void m22240a(int i, View view) {
        ImageView imageView = (ImageView) _$_findCachedViewById(C7310d.contentDetailBlurredBackgroundImage);
        C12880j.m40222a((Object) imageView, "contentDetailBlurredBackgroundImage");
        boolean z = imageView.getDrawable() == null;
        Context requireContext = requireContext();
        C12880j.m40222a((Object) requireContext, "requireContext()");
        boolean z2 = C5837i.m18836a(requireContext) ? view.getId() == C7310d.videoDetailDescription : m22242a(view);
        C5950d dVar = this.f16359c0;
        if (dVar != null) {
            dVar.mo17883a(i, view, z, z2, new C7446b(this));
        } else {
            C12880j.m40227c("contentDetailKeyDownHandler");
            throw null;
        }
    }

    /* renamed from: a */
    public boolean mo17809a(C11847b bVar) {
        return bVar instanceof C7410a;
    }

    /* renamed from: a */
    public final void mo20289a(C7468g gVar) {
        C5805c cVar;
        DetailOfflineStateMonitor detailOfflineStateMonitor = this.f16361e0;
        String str = "offlineStateMonitor";
        if (detailOfflineStateMonitor != null) {
            detailOfflineStateMonitor.mo18032b();
            C5910b bVar = this.f16358b0;
            if (bVar != null) {
                C0532d requireActivity = requireActivity();
                C12880j.m40222a((Object) requireActivity, "requireActivity()");
                DetailOfflineStateMonitor detailOfflineStateMonitor2 = this.f16361e0;
                if (detailOfflineStateMonitor2 == null) {
                    C12880j.m40227c(str);
                    throw null;
                } else if (!bVar.mo17817a(gVar, requireActivity, !detailOfflineStateMonitor2.mo18033d())) {
                    C3791v m = gVar.mo20362m();
                    if (m != null) {
                        C5951e eVar = this.f16362f0;
                        if (eVar != null) {
                            eVar.mo17885a(this, m);
                        } else {
                            C12880j.m40227c("detailImageLoader");
                            throw null;
                        }
                    }
                    C5956g gVar2 = this.f16357a0;
                    if (gVar2 != null) {
                        C7443f fVar = this.f16353W;
                        String str2 = "presenter";
                        if (fVar != null) {
                            gVar2.mo17891a(fVar.mo20286d(gVar));
                            C6008x d = gVar.mo17871d();
                            if (d != null) {
                                int indexOf = gVar.mo17870c().indexOf(d);
                                C5955f fVar2 = this.f16355Y;
                                if (fVar2 != null) {
                                    C7443f fVar3 = this.f16353W;
                                    if (fVar3 != null) {
                                        C5955f.m19103a(fVar2, fVar3.mo20285c(gVar), indexOf, false, 4, null);
                                        RecyclerViewSnapScrollHelper recyclerViewSnapScrollHelper = this.f16360d0;
                                        if (recyclerViewSnapScrollHelper != null) {
                                            int d2 = d.mo18028d();
                                            if (d2 == C7313g.nav_episodes) {
                                                cVar = new C5808c(null, 1, null);
                                            } else if (d2 == C7313g.nav_extras) {
                                                cVar = new C5808c(null, 1, null);
                                            } else {
                                                cVar = C5806a.f13590a;
                                            }
                                            recyclerViewSnapScrollHelper.mo17711a(cVar);
                                            return;
                                        }
                                        C12880j.m40227c("recyclerViewSnapScrollHelper");
                                        throw null;
                                    }
                                    C12880j.m40227c(str2);
                                    throw null;
                                }
                                C12880j.m40227c("detailsListContentManipulator");
                                throw null;
                            }
                            return;
                        }
                        C12880j.m40227c(str2);
                        throw null;
                    }
                    C12880j.m40227c("headerSectionViewHolder");
                    throw null;
                }
            } else {
                C12880j.m40227c("detailErrorStateHandler");
                throw null;
            }
        } else {
            C12880j.m40227c(str);
            throw null;
        }
    }

    /* renamed from: a */
    private final boolean m22242a(View view) {
        return view.getId() == C7310d.startPlayerButton || view.getId() == C7310d.restartButton || view.getId() == C7310d.watchlistButton;
    }
}
