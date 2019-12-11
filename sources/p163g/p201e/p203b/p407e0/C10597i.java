package p163g.p201e.p203b.p407e0;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.ProgressBar;
import androidx.lifecycle.C0722m;
import androidx.recyclerview.widget.RecyclerView;
import com.bamtechmedia.dominguez.analytics.C2378m;
import com.bamtechmedia.dominguez.analytics.C2413n;
import com.bamtechmedia.dominguez.analytics.p057o0.C2433b;
import com.bamtechmedia.dominguez.collections.C3280a;
import com.bamtechmedia.dominguez.collections.C3502x.C3503a;
import com.bamtechmedia.dominguez.core.design.widgets.DisneyTitleToolbar;
import com.bamtechmedia.dominguez.core.design.widgets.EmptyStateView;
import com.bamtechmedia.dominguez.core.design.widgets.NoConnectionView;
import com.bamtechmedia.dominguez.core.p088i.p091p.C3848a;
import com.bamtechmedia.dominguez.core.recycler.RecyclerViewSnapScrollHelper;
import com.bamtechmedia.dominguez.core.recycler.RecyclerViewSnapScrollHelper.C5805c;
import com.bamtechmedia.dominguez.core.recycler.RecyclerViewSnapScrollHelper.C5805c.C5807b;
import com.bamtechmedia.dominguez.core.utils.C5837i;
import java.util.HashMap;
import java.util.List;
import kotlin.C13145v;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.C12880j;
import kotlin.jvm.internal.C12881k;
import p163g.p201e.p203b.p312q.C7700r;
import p163g.p509o.p510a.C11848c;
import p163g.p509o.p510a.C11863k;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u0005¢\u0006\u0002\u0010\u0004J\b\u0010\u0011\u001a\u00020\u0012H\u0016J\b\u0010\u0013\u001a\u00020\u0014H\u0002J\u0016\u0010\u0015\u001a\u00020\u00162\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00190\u0018H\u0016J\u0010\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001dH\u0016J\u001a\u0010\u001e\u001a\u00020\u00142\u0006\u0010\u001f\u001a\u00020 2\b\u0010!\u001a\u0004\u0018\u00010\"H\u0016R\u001e\u0010\u0005\u001a\u00020\u00068\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001e\u0010\u000b\u001a\u00020\f8\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010¨\u0006#"}, mo31007d2 = {"Lcom/bamtechmedia/dominguez/watchlist/WatchlistFragment;", "Lcom/bamtechmedia/dominguez/collections/AbstractCollectionFragment;", "Lcom/bamtechmedia/dominguez/globalnav/GlobalNavTvEnabled;", "Lcom/bamtechmedia/dominguez/analytics/AnalyticsStateProvider;", "()V", "backgroundHelper", "Lcom/bamtechmedia/dominguez/core/design/helper/BackgroundHelper;", "getBackgroundHelper", "()Lcom/bamtechmedia/dominguez/core/design/helper/BackgroundHelper;", "setBackgroundHelper", "(Lcom/bamtechmedia/dominguez/core/design/helper/BackgroundHelper;)V", "watchlistAnalytics", "Lcom/bamtechmedia/dominguez/watchlist/WatchlistAnalytics;", "getWatchlistAnalytics", "()Lcom/bamtechmedia/dominguez/watchlist/WatchlistAnalytics;", "setWatchlistAnalytics", "(Lcom/bamtechmedia/dominguez/watchlist/WatchlistAnalytics;)V", "getAnalyticsSection", "Lcom/bamtechmedia/dominguez/analytics/AnalyticsSection;", "logBackPressAndPropagate", "", "onCreateCollectionView", "Lcom/bamtechmedia/dominguez/collections/CollectionViewPresenter$CollectionView;", "adapter", "Lcom/xwray/groupie/GroupAdapter;", "Lcom/xwray/groupie/ViewHolder;", "onKeyDown", "", "keyCode", "", "onViewCreated", "view", "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "watchlist_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* renamed from: g.e.b.e0.i */
/* compiled from: WatchlistFragment.kt */
public final class C10597i extends C3280a implements C7700r, C2413n {

    /* renamed from: g0 */
    public C10592e f25038g0;

    /* renamed from: h0 */
    public C3848a f25039h0;

    /* renamed from: i0 */
    private HashMap f25040i0;

    /* renamed from: g.e.b.e0.i$a */
    /* compiled from: WatchlistFragment.kt */
    static final class C10598a extends C12881k implements Function0<C13145v> {

        /* renamed from: c */
        final /* synthetic */ C10597i f25041c;

        C10598a(C10597i iVar) {
            this.f25041c = iVar;
            super(0);
        }

        public final void invoke() {
            this.f25041c.m33320v();
        }
    }

    public C10597i() {
        super(C10590c.fragment_watchlist);
    }

    /* access modifiers changed from: private */
    /* renamed from: v */
    public final void m33320v() {
        C10592e eVar = this.f25038g0;
        if (eVar != null) {
            eVar.mo27465a();
            requireActivity().onBackPressed();
            return;
        }
        C12880j.m40227c("watchlistAnalytics");
        throw null;
    }

    public void _$_clearFindViewByIdCache() {
        HashMap hashMap = this.f25040i0;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    public View _$_findCachedViewById(int i) {
        if (this.f25040i0 == null) {
            this.f25040i0 = new HashMap();
        }
        View view = (View) this.f25040i0.get(Integer.valueOf(i));
        if (view == null) {
            View view2 = getView();
            if (view2 == null) {
                return null;
            }
            view = view2.findViewById(i);
            this.f25040i0.put(Integer.valueOf(i), view);
        }
        return view;
    }

    /* renamed from: e */
    public C2378m mo11534e() {
        return new C2378m(C2433b.WATCHLIST, (String) null, 2, (DefaultConstructorMarker) null);
    }

    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        _$_clearFindViewByIdCache();
    }

    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        DisneyTitleToolbar disneyTitleToolbar = (DisneyTitleToolbar) _$_findCachedViewById(C10589b.disneyToolbar);
        String str = "recyclerView";
        if (disneyTitleToolbar != null) {
            RecyclerView recyclerView = (RecyclerView) _$_findCachedViewById(C10589b.recyclerView);
            C12880j.m40222a((Object) recyclerView, str);
            C3848a aVar = this.f25039h0;
            if (aVar != null) {
                DisneyTitleToolbar.m18445a(disneyTitleToolbar, recyclerView, aVar, null, null, null, 0, new C10598a(this), 60, null);
            } else {
                C12880j.m40227c("backgroundHelper");
                throw null;
            }
        }
        ((RecyclerView) _$_findCachedViewById(C10589b.recyclerView)).requestFocus();
        Context requireContext = requireContext();
        C12880j.m40222a((Object) requireContext, "requireContext()");
        float dimension = requireContext.getResources().getDimension(C10588a.watchlist_header_size);
        RecyclerViewSnapScrollHelper r = mo12327r();
        C0722m viewLifecycleOwner = getViewLifecycleOwner();
        C12880j.m40222a((Object) viewLifecycleOwner, "viewLifecycleOwner");
        RecyclerView recyclerView2 = (RecyclerView) _$_findCachedViewById(C10589b.recyclerView);
        C12880j.m40222a((Object) recyclerView2, str);
        RecyclerView recyclerView3 = (RecyclerView) _$_findCachedViewById(C10589b.recyclerView);
        C12880j.m40222a((Object) recyclerView3, str);
        r.mo17710a(viewLifecycleOwner, recyclerView2, (C5805c) new C5807b(0, (int) (dimension + ((float) recyclerView3.getPaddingBottom())), 1, null));
    }

    /* renamed from: a */
    public C3503a mo12229a(C11848c<C11863k> cVar) {
        List list;
        EmptyStateView emptyStateView = (EmptyStateView) _$_findCachedViewById(C10589b.watchlistEmptyState);
        RecyclerView recyclerView = (RecyclerView) _$_findCachedViewById(C10589b.recyclerView);
        C12880j.m40222a((Object) recyclerView, "recyclerView");
        ProgressBar progressBar = (ProgressBar) _$_findCachedViewById(C10589b.watchlistProgressBar);
        C12880j.m40222a((Object) progressBar, "watchlistProgressBar");
        NoConnectionView noConnectionView = (NoConnectionView) _$_findCachedViewById(C10589b.watchlistNoConnection);
        Context requireContext = requireContext();
        C12880j.m40222a((Object) requireContext, "requireContext()");
        if (C5837i.m18843e(requireContext)) {
            list = C13183n.m40498a(new C10605n(C10591d.watchlist_title));
        } else {
            list = C13185o.m40513a();
        }
        C3503a aVar = new C3503a(cVar, recyclerView, progressBar, noConnectionView, emptyStateView, list);
        return aVar;
    }

    /* renamed from: a */
    public boolean mo12232a(int i) {
        if (i == 4) {
            C10592e eVar = this.f25038g0;
            if (eVar != null) {
                eVar.mo27465a();
            } else {
                C12880j.m40227c("watchlistAnalytics");
                throw null;
            }
        }
        return super.mo12232a(i);
    }
}
