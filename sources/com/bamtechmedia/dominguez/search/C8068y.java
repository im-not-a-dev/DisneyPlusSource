package com.bamtechmedia.dominguez.search;

import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnLayoutChangeListener;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewTreeObserver;
import android.view.ViewTreeObserver.OnGlobalFocusChangeListener;
import android.widget.EditText;
import android.widget.LinearLayout;
import androidx.appcompat.widget.SearchView.C0184m;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.ConstraintLayout.C0415c;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.C0715i;
import androidx.lifecycle.C0722m;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bamtechmedia.dominguez.analytics.C2378m;
import com.bamtechmedia.dominguez.analytics.C2413n;
import com.bamtechmedia.dominguez.analytics.p057o0.C2433b;
import com.bamtechmedia.dominguez.collections.C3432o;
import com.bamtechmedia.dominguez.config.C3552i0;
import com.bamtechmedia.dominguez.core.BuildInfo;
import com.bamtechmedia.dominguez.core.C3796d;
import com.bamtechmedia.dominguez.core.content.search.C3732d;
import com.bamtechmedia.dominguez.core.design.widgets.C5664b;
import com.bamtechmedia.dominguez.core.design.widgets.NoConnectionView;
import com.bamtechmedia.dominguez.core.design.widgets.NoConnectionView.C5641a;
import com.bamtechmedia.dominguez.core.framework.C5755i;
import com.bamtechmedia.dominguez.core.p215k.C5759b;
import com.bamtechmedia.dominguez.core.recycler.RecyclerViewSnapScrollHelper;
import com.bamtechmedia.dominguez.core.recycler.RecyclerViewSnapScrollHelper.C5805c;
import com.bamtechmedia.dominguez.core.recycler.RecyclerViewSnapScrollHelper.C5805c.C5807b;
import com.bamtechmedia.dominguez.core.utils.C5837i;
import com.bamtechmedia.dominguez.core.utils.C5852n0;
import com.bamtechmedia.dominguez.core.utils.C5864r;
import com.bamtechmedia.dominguez.core.utils.C5880u;
import com.bamtechmedia.dominguez.core.utils.RecyclerViewExtKt;
import com.bamtechmedia.dominguez.search.C7975b0.C7980e;
import com.bamtechmedia.dominguez.search.C8002c.C8007e;
import com.bamtechmedia.dominguez.search.C8063v.C8064a;
import java.util.HashMap;
import kotlin.TypeCastException;
import kotlin.C13145v;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.C12881k;
import p096e.p121h.p135s.C4187x;
import p163g.p201e.p203b.p210g.C5588o;
import p163g.p201e.p203b.p210g.C5597p;
import p163g.p201e.p203b.p312q.C7700r;
import p163g.p201e.p203b.p314r.C7738g;
import p163g.p509o.p510a.C11848c;
import p163g.p509o.p510a.C11863k;
import p512h.p513c.p514k.C11890i;
import p520io.reactivex.functions.C11945a;
import p520io.reactivex.functions.Consumer;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u000f\b\u0016\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u00052\u00020\u00062\u00020\u00072\u00020\bB\u0005¢\u0006\u0002\u0010\tJ\b\u0010k\u001a\u00020lH\u0016J\b\u0010m\u001a\u00020\\H\u0002J\"\u0010n\u001a\u00020o2\b\b\u0001\u0010p\u001a\u00020q2\u000e\b\u0002\u0010r\u001a\b\u0012\u0004\u0012\u00020o0sH\u0002J\u0012\u0010t\u001a\u00020o2\b\u0010u\u001a\u0004\u0018\u00010vH\u0016J&\u0010w\u001a\u0004\u0018\u00010x2\u0006\u0010y\u001a\u00020z2\b\u0010{\u001a\u0004\u0018\u00010|2\b\u0010u\u001a\u0004\u0018\u00010vH\u0016J\b\u0010}\u001a\u00020oH\u0016J\u001d\u0010~\u001a\u00020o2\b\u0010\u001a\u0004\u0018\u00010x2\t\u0010\u0001\u001a\u0004\u0018\u00010xH\u0016J\u0012\u0010\u0001\u001a\u00020\\2\u0007\u0010\u0001\u001a\u00020qH\u0016J\u0012\u0010\u0001\u001a\u00020o2\u0007\u0010\u0001\u001a\u000200H\u0002J\u0013\u0010
\u0001\u001a\u00020o2\b\u0010\u0001\u001a\u00030\u0001H\u0002J\u0013\u0010\u0001\u001a\u00020\\2\b\u0010\u0001\u001a\u00030\u0001H\u0016J\u0013\u0010\u0001\u001a\u00020\\2\b\u0010\u0001\u001a\u00030\u0001H\u0016J5\u0010\u0001\u001a\u00020o2\u0007\u0010\u0001\u001a\u00020q2\u0011\u0010\u0001\u001a\f\u0012\u0007\b\u0001\u0012\u00030\u00010\u00012\b\u0010\u0001\u001a\u00030\u0001H\u0016¢\u0006\u0003\u0010\u0001J\u0012\u0010\u0001\u001a\u00020o2\u0007\u0010\u0001\u001a\u00020\\H\u0016J\t\u0010\u0001\u001a\u00020oH\u0016J\t\u0010\u0001\u001a\u00020oH\u0016J\u0017\u0010\u0001\u001a\u00020o2\f\u0010r\u001a\b\u0012\u0004\u0012\u00020o0sH\u0016J\u0017\u0010\u0001\u001a\u00020o2\f\u0010r\u001a\b\u0012\u0004\u0012\u00020o0sH\u0016J\u001c\u0010\u0001\u001a\u00020o2\u0007\u0010\u0001\u001a\u00020x2\b\u0010u\u001a\u0004\u0018\u00010vH\u0016J\t\u0010\u0001\u001a\u00020oH\u0002J\u000f\u0010\u0001\u001a\u00020oH\u0001¢\u0006\u0003\b\u0001J\u000f\u0010\u0001\u001a\u00020oH\u0001¢\u0006\u0003\b \u0001R$\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b8\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001e\u0010\u0011\u001a\u00020\u00128\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u001c\u0010\u0017\u001a\u0004\u0018\u00010\u0018X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\u001e\u0010\u001d\u001a\u00020\u001e8\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R\u001e\u0010#\u001a\u00020$8\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b%\u0010&\"\u0004\b'\u0010(R\u001e\u0010)\u001a\u00020*8\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b+\u0010,\"\u0004\b-\u0010.R\u0010\u0010/\u001a\u0004\u0018\u000100X\u000e¢\u0006\u0002\n\u0000R\u001e\u00101\u001a\u0002028\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b3\u00104\"\u0004\b5\u00106R\u001e\u00107\u001a\u0002088\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b9\u0010:\"\u0004\b;\u0010<R\u001e\u0010=\u001a\u00020>8\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b?\u0010@\"\u0004\bA\u0010BR\u001e\u0010C\u001a\u00020D8\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\bE\u0010F\"\u0004\bG\u0010HR\u001e\u0010I\u001a\u00020J8\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\bK\u0010L\"\u0004\bM\u0010NR\u001e\u0010O\u001a\u00020P8\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\bQ\u0010R\"\u0004\bS\u0010TR\u001e\u0010U\u001a\u00020V8\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\bW\u0010X\"\u0004\bY\u0010ZR\u0014\u0010[\u001a\u00020\\8BX\u0004¢\u0006\u0006\u001a\u0004\b]\u0010^R\u001e\u0010_\u001a\u00020`8\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\ba\u0010b\"\u0004\bc\u0010dR\u001e\u0010e\u001a\u00020f8\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\bg\u0010h\"\u0004\bi\u0010j¨\u0006¡\u0001"}, mo31007d2 = {"Lcom/bamtechmedia/dominguez/search/SearchTvFragment;", "Ldagger/android/support/DaggerFragment;", "Landroidx/appcompat/widget/SearchView$OnQueryTextListener;", "Lcom/bamtechmedia/dominguez/core/utils/OnKeyDownHandler;", "Lcom/bamtechmedia/dominguez/core/design/widgets/NoConnectionView$RetryListener;", "Lcom/bamtechmedia/dominguez/globalnav/GlobalNavTvEnabled;", "Lcom/bamtechmedia/dominguez/analytics/AnalyticsStateProvider;", "Landroid/view/ViewTreeObserver$OnGlobalFocusChangeListener;", "Lcom/bamtechmedia/dominguez/search/CustomKeyboardPresenter$KeyboardSuggestionAvailabilityListener;", "()V", "adapter", "Lcom/xwray/groupie/GroupAdapter;", "Lcom/xwray/groupie/ViewHolder;", "getAdapter", "()Lcom/xwray/groupie/GroupAdapter;", "setAdapter", "(Lcom/xwray/groupie/GroupAdapter;)V", "buildInfo", "Lcom/bamtechmedia/dominguez/core/BuildInfo;", "getBuildInfo", "()Lcom/bamtechmedia/dominguez/core/BuildInfo;", "setBuildInfo", "(Lcom/bamtechmedia/dominguez/core/BuildInfo;)V", "customKeyboardPresenter", "Lcom/bamtechmedia/dominguez/search/CustomKeyboardPresenter;", "getCustomKeyboardPresenter", "()Lcom/bamtechmedia/dominguez/search/CustomKeyboardPresenter;", "setCustomKeyboardPresenter", "(Lcom/bamtechmedia/dominguez/search/CustomKeyboardPresenter;)V", "focusFinder", "Lcom/bamtechmedia/dominguez/core/focus/FocusFinderWrapper;", "getFocusFinder", "()Lcom/bamtechmedia/dominguez/core/focus/FocusFinderWrapper;", "setFocusFinder", "(Lcom/bamtechmedia/dominguez/core/focus/FocusFinderWrapper;)V", "focusHelper", "Lcom/bamtechmedia/dominguez/collections/CollectionViewFocusHelper;", "getFocusHelper", "()Lcom/bamtechmedia/dominguez/collections/CollectionViewFocusHelper;", "setFocusHelper", "(Lcom/bamtechmedia/dominguez/collections/CollectionViewFocusHelper;)V", "keysSource", "Lcom/bamtechmedia/dominguez/config/KeysSource;", "getKeysSource", "()Lcom/bamtechmedia/dominguez/config/KeysSource;", "setKeysSource", "(Lcom/bamtechmedia/dominguez/config/KeysSource;)V", "lastViewState", "Lcom/bamtechmedia/dominguez/search/SearchPresenter$ViewState;", "offlineState", "Lcom/bamtechmedia/dominguez/core/OfflineState;", "getOfflineState", "()Lcom/bamtechmedia/dominguez/core/OfflineState;", "setOfflineState", "(Lcom/bamtechmedia/dominguez/core/OfflineState;)V", "offlineViewModel", "Lcom/bamtechmedia/dominguez/connectivity/OfflineViewModel;", "getOfflineViewModel", "()Lcom/bamtechmedia/dominguez/connectivity/OfflineViewModel;", "setOfflineViewModel", "(Lcom/bamtechmedia/dominguez/connectivity/OfflineViewModel;)V", "presenter", "Lcom/bamtechmedia/dominguez/search/SearchPresenter;", "getPresenter", "()Lcom/bamtechmedia/dominguez/search/SearchPresenter;", "setPresenter", "(Lcom/bamtechmedia/dominguez/search/SearchPresenter;)V", "recyclerViewSnapScrollHelper", "Lcom/bamtechmedia/dominguez/core/recycler/RecyclerViewSnapScrollHelper;", "getRecyclerViewSnapScrollHelper", "()Lcom/bamtechmedia/dominguez/core/recycler/RecyclerViewSnapScrollHelper;", "setRecyclerViewSnapScrollHelper", "(Lcom/bamtechmedia/dominguez/core/recycler/RecyclerViewSnapScrollHelper;)V", "searchAccessibility", "Lcom/bamtechmedia/dominguez/search/SearchAccessibility;", "getSearchAccessibility", "()Lcom/bamtechmedia/dominguez/search/SearchAccessibility;", "setSearchAccessibility", "(Lcom/bamtechmedia/dominguez/search/SearchAccessibility;)V", "searchSuggestApi", "Lcom/bamtechmedia/dominguez/core/content/search/DmgzSearchSuggestApi;", "getSearchSuggestApi", "()Lcom/bamtechmedia/dominguez/core/content/search/DmgzSearchSuggestApi;", "setSearchSuggestApi", "(Lcom/bamtechmedia/dominguez/core/content/search/DmgzSearchSuggestApi;)V", "speechRecognizerHelper", "Lcom/bamtechmedia/dominguez/search/SpeechRecognizerHelper;", "getSpeechRecognizerHelper", "()Lcom/bamtechmedia/dominguez/search/SpeechRecognizerHelper;", "setSpeechRecognizerHelper", "(Lcom/bamtechmedia/dominguez/search/SpeechRecognizerHelper;)V", "topMarginIsInitial", "", "getTopMarginIsInitial", "()Z", "transitionHelper", "Lcom/bamtechmedia/dominguez/search/SearchTvTransitionHelper;", "getTransitionHelper", "()Lcom/bamtechmedia/dominguez/search/SearchTvTransitionHelper;", "setTransitionHelper", "(Lcom/bamtechmedia/dominguez/search/SearchTvTransitionHelper;)V", "viewModel", "Lcom/bamtechmedia/dominguez/search/SearchViewModel;", "getViewModel", "()Lcom/bamtechmedia/dominguez/search/SearchViewModel;", "setViewModel", "(Lcom/bamtechmedia/dominguez/search/SearchViewModel;)V", "getAnalyticsSection", "Lcom/bamtechmedia/dominguez/analytics/AnalyticsSection;", "isFocusInTopRecyclerView", "keyboardExpansionAnimation", "", "topMarginId", "", "endAction", "Lkotlin/Function0;", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "onDestroyView", "onGlobalFocusChanged", "oldFocus", "newFocus", "onKeyDown", "keyCode", "onNewViewState", "viewState", "onOfflineStateUpdate", "timerState", "Lcom/bamtechmedia/dominguez/connectivity/TimerState;", "onQueryTextChange", "newText", "", "onQueryTextSubmit", "query", "onRequestPermissionsResult", "requestCode", "permissions", "", "grantResults", "", "(I[Ljava/lang/String;[I)V", "onRetryClicked", "isOffline", "onStart", "onStop", "onSuggestionsAvailable", "onSuggestionsEmpty", "onViewCreated", "view", "retrySearch", "setupRecyclerView", "setupRecyclerView$search_release", "setupSearchView", "setupSearchView$search_release", "search_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* renamed from: com.bamtechmedia.dominguez.search.y */
/* compiled from: SearchTvFragment.kt */
public class C8068y extends C11890i implements C0184m, C5864r, C5641a, C7700r, C2413n, OnGlobalFocusChangeListener, C8007e {

    /* renamed from: U */
    public C7975b0 f17267U;

    /* renamed from: V */
    public C8063v f17268V;

    /* renamed from: W */
    public C11848c<C11863k> f17269W;

    /* renamed from: X */
    public C3432o f17270X;

    /* renamed from: Y */
    public RecyclerViewSnapScrollHelper f17271Y;

    /* renamed from: Z */
    public C5588o f17272Z;

    /* renamed from: a0 */
    public C3796d f17273a0;

    /* renamed from: b0 */
    public C3732d f17274b0;

    /* renamed from: c0 */
    public BuildInfo f17275c0;

    /* renamed from: d0 */
    public SpeechRecognizerHelper f17276d0;

    /* renamed from: e0 */
    public C3552i0 f17277e0;

    /* renamed from: f0 */
    public C7965a0 f17278f0;

    /* renamed from: g0 */
    public C5759b f17279g0;

    /* renamed from: h0 */
    public C8059s f17280h0;

    /* renamed from: i0 */
    private C8002c f17281i0;
    /* access modifiers changed from: private */

    /* renamed from: j0 */
    public C8064a f17282j0;

    /* renamed from: k0 */
    private HashMap f17283k0;

    /* renamed from: com.bamtechmedia.dominguez.search.y$a */
    /* compiled from: SearchTvFragment.kt */
    static final class C8069a extends C12881k implements Function1<Integer, Boolean> {

        /* renamed from: c */
        public static final C8069a f17284c = new C8069a();

        C8069a() {
            super(1);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return Boolean.valueOf(invoke(((Number) obj).intValue()));
        }

        public final boolean invoke(int i) {
            return i <= 1;
        }
    }

    /* renamed from: com.bamtechmedia.dominguez.search.y$b */
    /* compiled from: SearchTvFragment.kt */
    static final class C8070b implements C11945a {

        /* renamed from: a */
        final /* synthetic */ C8068y f17285a;

        C8070b(C8068y yVar) {
            this.f17285a = yVar;
        }

        public final void run() {
            this.f17285a.m23399u();
        }
    }

    /* renamed from: com.bamtechmedia.dominguez.search.y$c */
    /* compiled from: SearchTvFragment.kt */
    static final class C8071c<T> implements Consumer<Throwable> {

        /* renamed from: c */
        final /* synthetic */ C8068y f17286c;

        C8071c(C8068y yVar) {
            this.f17286c = yVar;
        }

        /* renamed from: a */
        public final void accept(Throwable th) {
            ((NoConnectionView) this.f17286c._$_findCachedViewById(C8048n.searchNoConnectionView)).mo17433b(false);
        }
    }

    /* renamed from: com.bamtechmedia.dominguez.search.y$d */
    /* compiled from: SearchTvFragment.kt */
    static final class C8072d extends C12881k implements Function1<C7980e, C13145v> {

        /* renamed from: U */
        final /* synthetic */ boolean f17287U;

        /* renamed from: c */
        final /* synthetic */ C8068y f17288c;

        C8072d(C8068y yVar, boolean z) {
            this.f17288c = yVar;
            this.f17287U = z;
            super(1);
        }

        /* renamed from: a */
        public final void mo21061a(C7980e eVar) {
            C8064a a = this.f17288c.mo21054o().mo21042a(eVar, C13173j0.m40350a());
            if ((!Intrinsics.areEqual((Object) a, (Object) this.f17288c.f17282j0)) || this.f17287U) {
                this.f17288c.m23390a(a);
            }
            this.f17288c.f17282j0 = a;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo21061a((C7980e) obj);
            return C13145v.f29587a;
        }
    }

    /* renamed from: com.bamtechmedia.dominguez.search.y$e */
    /* compiled from: SearchTvFragment.kt */
    static final class C8073e extends C12881k implements Function1<C5597p, C13145v> {

        /* renamed from: c */
        final /* synthetic */ C8068y f17289c;

        C8073e(C8068y yVar) {
            this.f17289c = yVar;
            super(1);
        }

        /* renamed from: a */
        public final void mo21062a(C5597p pVar) {
            this.f17289c.m23393a(pVar);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo21062a((C5597p) obj);
            return C13145v.f29587a;
        }
    }

    /* renamed from: com.bamtechmedia.dominguez.search.y$f */
    /* compiled from: View.kt */
    public static final class C8074f implements OnLayoutChangeListener {

        /* renamed from: c */
        final /* synthetic */ C8068y f17290c;

        public C8074f(C8068y yVar) {
            this.f17290c = yVar;
        }

        public void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
            view.removeOnLayoutChangeListener(this);
            C7965a0 p = this.f17290c.mo21056p();
            C8064a a = this.f17290c.f17282j0;
            p.mo20934a(a != null ? a.mo21047d() : true, this.f17290c.m23397s());
        }
    }

    /* renamed from: com.bamtechmedia.dominguez.search.y$g */
    /* compiled from: SearchTvFragment.kt */
    static final class C8075g extends C12881k implements Function1<String, C13145v> {

        /* renamed from: c */
        final /* synthetic */ C8068y f17291c;

        C8075g(C8068y yVar) {
            this.f17291c = yVar;
            super(1);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((String) obj);
            return C13145v.f29587a;
        }

        public final void invoke(String str) {
            if (str.length() == 0) {
                this.f17291c.getViewModel().mo20957a("", false);
            } else {
                this.f17291c.mo1302a(str);
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: s */
    public final boolean m23397s() {
        LinearLayout linearLayout = (LinearLayout) _$_findCachedViewById(C8048n.searchLayout);
        Intrinsics.checkReturnedValueIsNotNull((Object) linearLayout, "searchLayout");
        LayoutParams layoutParams = linearLayout.getLayoutParams();
        if (layoutParams != null) {
            return ((C0415c) layoutParams).topMargin == getResources().getDimensionPixelSize(C8046l.search_layout_margin_top);
        }
        throw new TypeCastException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x0029  */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x0031  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0047  */
    /* JADX WARNING: Removed duplicated region for block: B:22:? A[RETURN, SYNTHETIC] */
    /* renamed from: t */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final boolean m23398t() {
        /*
            r6 = this;
            android.view.View r0 = r6.getView()
            r1 = 0
            if (r0 == 0) goto L_0x000c
            android.view.View r0 = r0.findFocus()
            goto L_0x000d
        L_0x000c:
            r0 = r1
        L_0x000d:
            java.lang.String r2 = "recyclerView"
            r3 = 0
            r4 = 1
            if (r0 == 0) goto L_0x0026
            int r5 = com.bamtechmedia.dominguez.search.C8048n.recyclerView
            android.view.View r5 = r6._$_findCachedViewById(r5)
            androidx.recyclerview.widget.RecyclerView r5 = (androidx.recyclerview.widget.RecyclerView) r5
            kotlin.jvm.internal.Intrinsics.checkReturnedValueIsNotNull(r5, r2)
            boolean r5 = com.bamtechmedia.dominguez.core.utils.C5852n0.m18889b(r0, r5)
            if (r5 != r4) goto L_0x0026
            r5 = 1
            goto L_0x0027
        L_0x0026:
            r5 = 0
        L_0x0027:
            if (r0 == 0) goto L_0x002f
            r1 = 33
            android.view.View r1 = r0.focusSearch(r1)
        L_0x002f:
            if (r1 == 0) goto L_0x0044
            int r0 = com.bamtechmedia.dominguez.search.C8048n.recyclerView
            android.view.View r0 = r6._$_findCachedViewById(r0)
            androidx.recyclerview.widget.RecyclerView r0 = (androidx.recyclerview.widget.RecyclerView) r0
            kotlin.jvm.internal.Intrinsics.checkReturnedValueIsNotNull(r0, r2)
            boolean r0 = com.bamtechmedia.dominguez.core.utils.C5852n0.m18889b(r1, r0)
            if (r0 != r4) goto L_0x0044
            r0 = 1
            goto L_0x0045
        L_0x0044:
            r0 = 0
        L_0x0045:
            if (r5 == 0) goto L_0x004c
            if (r0 == 0) goto L_0x004b
            if (r1 != 0) goto L_0x004c
        L_0x004b:
            r3 = 1
        L_0x004c:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bamtechmedia.dominguez.search.C8068y.m23398t():boolean");
    }

    /* access modifiers changed from: private */
    /* renamed from: u */
    public final void m23399u() {
        C7975b0 b0Var = this.f17267U;
        if (b0Var != null) {
            EditText editText = (EditText) _$_findCachedViewById(C8048n.searchEditText);
            Intrinsics.checkReturnedValueIsNotNull((Object) editText, "searchEditText");
            b0Var.mo20959c(editText.getText().toString(), false);
            return;
        }
        Intrinsics.throwUninitializedPropertyAccessException("viewModel");
        throw null;
    }

    public void _$_clearFindViewByIdCache() {
        HashMap hashMap = this.f17283k0;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    public View _$_findCachedViewById(int i) {
        if (this.f17283k0 == null) {
            this.f17283k0 = new HashMap();
        }
        View view = (View) this.f17283k0.get(Integer.valueOf(i));
        if (view == null) {
            View view2 = getView();
            if (view2 == null) {
                return null;
            }
            view = view2.findViewById(i);
            this.f17283k0.put(Integer.valueOf(i), view);
        }
        return view;
    }

    /* renamed from: e */
    public C2378m mo11534e() {
        return new C2378m(C2433b.EXPLORE, (String) null, 2, (DefaultConstructorMarker) null);
    }

    public final C7975b0 getViewModel() {
        C7975b0 b0Var = this.f17267U;
        if (b0Var != null) {
            return b0Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("viewModel");
        throw null;
    }

    /* renamed from: o */
    public final C8063v mo21054o() {
        C8063v vVar = this.f17268V;
        if (vVar != null) {
            return vVar;
        }
        Intrinsics.throwUninitializedPropertyAccessException("presenter");
        throw null;
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        C0715i lifecycle = getLifecycle();
        SpeechRecognizerHelper speechRecognizerHelper = this.f17276d0;
        if (speechRecognizerHelper != null) {
            lifecycle.mo4134a(speechRecognizerHelper);
        } else {
            Intrinsics.throwUninitializedPropertyAccessException("speechRecognizerHelper");
            throw null;
        }
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return C7738g.m22802a(this, C8050p.fragment_tv_search, viewGroup, false, 4, null);
    }

    public void onDestroyView() {
        View view = getView();
        if (view != null) {
            ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
            if (viewTreeObserver != null) {
                viewTreeObserver.removeOnGlobalFocusChangeListener(this);
            }
        }
        super.onDestroyView();
        _$_clearFindViewByIdCache();
    }

    public void onGlobalFocusChanged(View view, View view2) {
        if (!isRemoving() && view2 != null) {
            ConstraintLayout constraintLayout = (ConstraintLayout) _$_findCachedViewById(C8048n.searchRootView);
            Intrinsics.checkReturnedValueIsNotNull((Object) constraintLayout, "searchRootView");
            if (C5852n0.m18889b(view2, (View) constraintLayout)) {
                C8063v vVar = this.f17268V;
                if (vVar != null) {
                    C7975b0 b0Var = this.f17267U;
                    if (b0Var != null) {
                        boolean a = vVar.mo21043a((C7980e) b0Var.getCurrentState());
                        C7965a0 a0Var = this.f17278f0;
                        if (a0Var != null) {
                            a0Var.mo20933a(view2, a, m23397s());
                        } else {
                            Intrinsics.throwUninitializedPropertyAccessException("transitionHelper");
                            throw null;
                        }
                    } else {
                        Intrinsics.throwUninitializedPropertyAccessException("viewModel");
                        throw null;
                    }
                } else {
                    Intrinsics.throwUninitializedPropertyAccessException("presenter");
                    throw null;
                }
            }
            Context requireContext = requireContext();
            Intrinsics.checkReturnedValueIsNotNull((Object) requireContext, "requireContext()");
            if (C5837i.m18836a(requireContext)) {
                RecyclerViewSnapScrollHelper recyclerViewSnapScrollHelper = this.f17271Y;
                if (recyclerViewSnapScrollHelper != null) {
                    recyclerViewSnapScrollHelper.mo17709a(view2);
                } else {
                    Intrinsics.throwUninitializedPropertyAccessException("recyclerViewSnapScrollHelper");
                    throw null;
                }
            }
        }
    }

    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        super.onRequestPermissionsResult(i, strArr, iArr);
        SpeechRecognizerHelper speechRecognizerHelper = this.f17276d0;
        if (speechRecognizerHelper != null) {
            speechRecognizerHelper.mo20919a(i, iArr);
        } else {
            Intrinsics.throwUninitializedPropertyAccessException("speechRecognizerHelper");
            throw null;
        }
    }

    public void onRetryClicked(boolean z) {
        m23399u();
        if (z) {
            C5588o oVar = this.f17272Z;
            if (oVar != null) {
                oVar.mo17342y();
            } else {
                Intrinsics.throwUninitializedPropertyAccessException("offlineViewModel");
                throw null;
            }
        }
    }

    public void onStart() {
        super.onStart();
        C3796d dVar = this.f17273a0;
        if (dVar != null) {
            boolean p = dVar.mo13698p();
            C7975b0 b0Var = this.f17267U;
            if (b0Var != null) {
                C5755i.m18679a(this, b0Var, null, null, new C8072d(this, p), 6, null);
                C5588o oVar = this.f17272Z;
                if (oVar != null) {
                    C5755i.m18679a(this, oVar, null, null, new C8073e(this), 6, null);
                    if (p) {
                        m23399u();
                    }
                    ((NoConnectionView) _$_findCachedViewById(C8048n.searchNoConnectionView)).setRetryListener(this);
                    return;
                }
                Intrinsics.throwUninitializedPropertyAccessException("offlineViewModel");
                throw null;
            }
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
            throw null;
        }
        Intrinsics.throwUninitializedPropertyAccessException("offlineState");
        throw null;
    }

    public void onStop() {
        super.onStop();
        ((NoConnectionView) _$_findCachedViewById(C8048n.searchNoConnectionView)).mo2144c();
    }

    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        mo21057q();
        mo21058r();
        LinearLayout linearLayout = (LinearLayout) _$_findCachedViewById(C8048n.keyboard);
        Intrinsics.checkReturnedValueIsNotNull((Object) linearLayout, "keyboard");
        EditText editText = (EditText) _$_findCachedViewById(C8048n.searchEditText);
        Intrinsics.checkReturnedValueIsNotNull((Object) editText, "searchEditText");
        C3732d dVar = this.f17274b0;
        if (dVar != null) {
            C3552i0 i0Var = this.f17277e0;
            if (i0Var != null) {
                C8059s sVar = this.f17280h0;
                if (sVar != null) {
                    C8002c cVar = new C8002c(linearLayout, editText, dVar, i0Var, this, sVar, null, null, 192, null);
                    this.f17281i0 = cVar;
                    if (!C4187x.m14340E(view) || view.isLayoutRequested()) {
                        view.addOnLayoutChangeListener(new C8074f(this));
                    } else {
                        C7965a0 p = mo21056p();
                        C8064a a = this.f17282j0;
                        p.mo20934a(a != null ? a.mo21047d() : true, m23397s());
                    }
                    view.getViewTreeObserver().addOnGlobalFocusChangeListener(this);
                    return;
                }
                Intrinsics.throwUninitializedPropertyAccessException("searchAccessibility");
                throw null;
            }
            Intrinsics.throwUninitializedPropertyAccessException("keysSource");
            throw null;
        }
        Intrinsics.throwUninitializedPropertyAccessException("searchSuggestApi");
        throw null;
    }

    /* renamed from: p */
    public final C7965a0 mo21056p() {
        C7965a0 a0Var = this.f17278f0;
        if (a0Var != null) {
            return a0Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("transitionHelper");
        throw null;
    }

    /* renamed from: q */
    public final void mo21057q() {
        RecyclerView recyclerView = (RecyclerView) _$_findCachedViewById(C8048n.recyclerView);
        String str = "recyclerView";
        Intrinsics.checkReturnedValueIsNotNull((Object) recyclerView, str);
        C11848c<C11863k> cVar = this.f17269W;
        String str2 = "adapter";
        if (cVar != null) {
            RecyclerViewExtKt.m18800a(this, recyclerView, cVar);
            C11848c<C11863k> cVar2 = this.f17269W;
            if (cVar2 != null) {
                cVar2.mo29972c(getResources().getInteger(C8049o.collection_total_span_count));
                RecyclerView recyclerView2 = (RecyclerView) _$_findCachedViewById(C8048n.recyclerView);
                Intrinsics.checkReturnedValueIsNotNull((Object) recyclerView2, str);
                Context context = getContext();
                C11848c<C11863k> cVar3 = this.f17269W;
                if (cVar3 != null) {
                    GridLayoutManager gridLayoutManager = new GridLayoutManager(context, cVar3.mo29966b());
                    C11848c<C11863k> cVar4 = this.f17269W;
                    if (cVar4 != null) {
                        gridLayoutManager.mo4298a(cVar4.mo29971c());
                        recyclerView2.setLayoutManager(gridLayoutManager);
                        RecyclerViewSnapScrollHelper recyclerViewSnapScrollHelper = this.f17271Y;
                        if (recyclerViewSnapScrollHelper != null) {
                            C0722m viewLifecycleOwner = getViewLifecycleOwner();
                            Intrinsics.checkReturnedValueIsNotNull((Object) viewLifecycleOwner, "viewLifecycleOwner");
                            RecyclerView recyclerView3 = (RecyclerView) _$_findCachedViewById(C8048n.recyclerView);
                            Intrinsics.checkReturnedValueIsNotNull((Object) recyclerView3, str);
                            RecyclerView recyclerView4 = (RecyclerView) _$_findCachedViewById(C8048n.recyclerView);
                            Intrinsics.checkReturnedValueIsNotNull((Object) recyclerView4, str);
                            int paddingTop = recyclerView4.getPaddingTop();
                            RecyclerView recyclerView5 = (RecyclerView) _$_findCachedViewById(C8048n.recyclerView);
                            Intrinsics.checkReturnedValueIsNotNull((Object) recyclerView5, str);
                            recyclerViewSnapScrollHelper.mo17710a(viewLifecycleOwner, recyclerView3, (C5805c) new C5807b(paddingTop, recyclerView5.getPaddingBottom()));
                            return;
                        }
                        Intrinsics.throwUninitializedPropertyAccessException("recyclerViewSnapScrollHelper");
                        throw null;
                    }
                    Intrinsics.throwUninitializedPropertyAccessException(str2);
                    throw null;
                }
                Intrinsics.throwUninitializedPropertyAccessException(str2);
                throw null;
            }
            Intrinsics.throwUninitializedPropertyAccessException(str2);
            throw null;
        }
        Intrinsics.throwUninitializedPropertyAccessException(str2);
        throw null;
    }

    /* renamed from: r */
    public final void mo21058r() {
        ((EditText) _$_findCachedViewById(C8048n.searchEditText)).addTextChangedListener(new C5664b(new C8075g(this), null, 2, null));
    }

    /* renamed from: b */
    public boolean mo1303b(String str) {
        C7975b0 b0Var = this.f17267U;
        if (b0Var != null) {
            b0Var.mo20957a(str, true);
            return true;
        }
        Intrinsics.throwUninitializedPropertyAccessException("viewModel");
        throw null;
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0049  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x004b  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x005f  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0061  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0077  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0079  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x008d  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x008f  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00ae  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00b0  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00e3  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x00e5  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x0101  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x0109  */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x017f  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void m23390a(com.bamtechmedia.dominguez.search.C8063v.C8064a r10) {
        /*
            r9 = this;
            com.bamtechmedia.dominguez.core.d r0 = r9.f17273a0
            java.lang.String r1 = "offlineState"
            r2 = 0
            if (r0 == 0) goto L_0x0185
            boolean r0 = r0.mo13695j()
            int r3 = com.bamtechmedia.dominguez.search.C8048n.searchLayout
            android.view.View r3 = r9._$_findCachedViewById(r3)
            android.widget.LinearLayout r3 = (android.widget.LinearLayout) r3
            java.lang.String r4 = "searchLayout"
            kotlin.jvm.internal.Intrinsics.checkReturnedValueIsNotNull(r3, r4)
            r4 = 8
            r5 = 0
            if (r0 == 0) goto L_0x001f
            r6 = 0
            goto L_0x0021
        L_0x001f:
            r6 = 8
        L_0x0021:
            r3.setVisibility(r6)
            int r3 = com.bamtechmedia.dominguez.search.C8048n.microphoneImageViewContainer
            android.view.View r3 = r9._$_findCachedViewById(r3)
            android.widget.FrameLayout r3 = (android.widget.FrameLayout) r3
            java.lang.String r6 = "microphoneImageViewContainer"
            kotlin.jvm.internal.Intrinsics.checkReturnedValueIsNotNull(r3, r6)
            r6 = 1
            if (r0 == 0) goto L_0x0046
            com.bamtechmedia.dominguez.search.SpeechRecognizerHelper r7 = r9.f17276d0
            if (r7 == 0) goto L_0x0040
            boolean r7 = r7.mo20921b()
            if (r7 == 0) goto L_0x0046
            r7 = 1
            goto L_0x0047
        L_0x0040:
            java.lang.String r10 = "speechRecognizerHelper"
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r10)
            throw r2
        L_0x0046:
            r7 = 0
        L_0x0047:
            if (r7 == 0) goto L_0x004b
            r7 = 0
            goto L_0x004d
        L_0x004b:
            r7 = 8
        L_0x004d:
            r3.setVisibility(r7)
            int r3 = com.bamtechmedia.dominguez.search.C8048n.recyclerView
            android.view.View r3 = r9._$_findCachedViewById(r3)
            androidx.recyclerview.widget.RecyclerView r3 = (androidx.recyclerview.widget.RecyclerView) r3
            java.lang.String r7 = "recyclerView"
            kotlin.jvm.internal.Intrinsics.checkReturnedValueIsNotNull(r3, r7)
            if (r0 == 0) goto L_0x0061
            r7 = 0
            goto L_0x0063
        L_0x0061:
            r7 = 8
        L_0x0063:
            r3.setVisibility(r7)
            int r3 = com.bamtechmedia.dominguez.search.C8048n.searchNoConnectionView
            android.view.View r3 = r9._$_findCachedViewById(r3)
            com.bamtechmedia.dominguez.core.design.widgets.NoConnectionView r3 = (com.bamtechmedia.dominguez.core.design.widgets.NoConnectionView) r3
            java.lang.String r7 = "searchNoConnectionView"
            kotlin.jvm.internal.Intrinsics.checkReturnedValueIsNotNull(r3, r7)
            r7 = r0 ^ 1
            if (r7 == 0) goto L_0x0079
            r7 = 0
            goto L_0x007b
        L_0x0079:
            r7 = 8
        L_0x007b:
            r3.setVisibility(r7)
            int r3 = com.bamtechmedia.dominguez.search.C8048n.keyboard
            android.view.View r3 = r9._$_findCachedViewById(r3)
            android.widget.LinearLayout r3 = (android.widget.LinearLayout) r3
            java.lang.String r7 = "keyboard"
            kotlin.jvm.internal.Intrinsics.checkReturnedValueIsNotNull(r3, r7)
            if (r0 == 0) goto L_0x008f
            r7 = 0
            goto L_0x0091
        L_0x008f:
            r7 = 8
        L_0x0091:
            r3.setVisibility(r7)
            int r3 = com.bamtechmedia.dominguez.search.C8048n.progressBar
            android.view.View r3 = r9._$_findCachedViewById(r3)
            android.widget.ProgressBar r3 = (android.widget.ProgressBar) r3
            java.lang.String r7 = "progressBar"
            kotlin.jvm.internal.Intrinsics.checkReturnedValueIsNotNull(r3, r7)
            boolean r7 = r10.mo21045b()
            if (r7 == 0) goto L_0x00ab
            if (r0 == 0) goto L_0x00ab
            r7 = 1
            goto L_0x00ac
        L_0x00ab:
            r7 = 0
        L_0x00ac:
            if (r7 == 0) goto L_0x00b0
            r7 = 0
            goto L_0x00b2
        L_0x00b0:
            r7 = 8
        L_0x00b2:
            r3.setVisibility(r7)
            int r3 = com.bamtechmedia.dominguez.search.C8048n.noResultsMsg
            android.view.View r3 = r9._$_findCachedViewById(r3)
            android.widget.TextView r3 = (android.widget.TextView) r3
            java.lang.String r7 = "noResultsMsg"
            kotlin.jvm.internal.Intrinsics.checkReturnedValueIsNotNull(r3, r7)
            java.lang.String r8 = r10.mo21046c()
            r3.setText(r8)
            int r3 = com.bamtechmedia.dominguez.search.C8048n.noResultsSuggestion
            android.view.View r3 = r9._$_findCachedViewById(r3)
            android.widget.TextView r3 = (android.widget.TextView) r3
            java.lang.String r8 = "noResultsSuggestion"
            kotlin.jvm.internal.Intrinsics.checkReturnedValueIsNotNull(r3, r8)
            java.lang.String r8 = r10.mo21046c()
            if (r8 == 0) goto L_0x00e0
            if (r0 == 0) goto L_0x00e0
            r8 = 1
            goto L_0x00e1
        L_0x00e0:
            r8 = 0
        L_0x00e1:
            if (r8 == 0) goto L_0x00e5
            r8 = 0
            goto L_0x00e7
        L_0x00e5:
            r8 = 8
        L_0x00e7:
            r3.setVisibility(r8)
            int r3 = com.bamtechmedia.dominguez.search.C8048n.noResultsMsg
            android.view.View r3 = r9._$_findCachedViewById(r3)
            android.widget.TextView r3 = (android.widget.TextView) r3
            kotlin.jvm.internal.Intrinsics.checkReturnedValueIsNotNull(r3, r7)
            java.lang.String r7 = r10.mo21046c()
            if (r7 == 0) goto L_0x00fe
            if (r0 == 0) goto L_0x00fe
            goto L_0x00ff
        L_0x00fe:
            r6 = 0
        L_0x00ff:
            if (r6 == 0) goto L_0x0102
            r4 = 0
        L_0x0102:
            r3.setVisibility(r4)
            com.bamtechmedia.dominguez.search.a0 r0 = r9.f17278f0
            if (r0 == 0) goto L_0x017f
            boolean r3 = r10.mo21047d()
            boolean r4 = r9.m23397s()
            r0.mo20935b(r3, r4)
            com.bamtechmedia.dominguez.core.d r0 = r9.f17273a0
            if (r0 == 0) goto L_0x017b
            boolean r0 = r0.mo13695j()
            if (r0 == 0) goto L_0x0130
            g.o.a.c<g.o.a.k> r0 = r9.f17269W
            if (r0 == 0) goto L_0x012a
            java.util.List r10 = r10.mo21044a()
            r0.mo29963a(r10)
            goto L_0x0172
        L_0x012a:
            java.lang.String r10 = "adapter"
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r10)
            throw r2
        L_0x0130:
            int r10 = com.bamtechmedia.dominguez.search.C8048n.searchNoConnectionView
            android.view.View r10 = r9._$_findCachedViewById(r10)
            com.bamtechmedia.dominguez.core.design.widgets.NoConnectionView r10 = (com.bamtechmedia.dominguez.core.design.widgets.NoConnectionView) r10
            com.bamtechmedia.dominguez.core.d r0 = r9.f17273a0
            if (r0 == 0) goto L_0x0177
            boolean r0 = r0.mo13695j()
            r10.mo17432a(r0)
            com.bamtechmedia.dominguez.core.d r10 = r9.f17273a0
            if (r10 == 0) goto L_0x0173
            io.reactivex.Completable r10 = r10.mo13697n()
            androidx.lifecycle.i$a r0 = androidx.lifecycle.C0715i.C0716a.ON_STOP
            com.uber.autodispose.android.lifecycle.b r0 = com.uber.autodispose.android.lifecycle.C10541b.m33255a(r9, r0)
            java.lang.String r1 = "AndroidLifecycleScopePro…om(\n    this, untilEvent)"
            kotlin.jvm.internal.Intrinsics.checkReturnedValueIsNotNull(r0, r1)
            g.n.a.h r0 = p163g.p503n.p504a.C11793e.m37930a(r0)
            java.lang.Object r10 = r10.mo30048a(r0)
            java.lang.String r0 = "this.`as`(AutoDispose.au…isposable<Any>(provider))"
            kotlin.jvm.internal.Intrinsics.checkReturnedValueIsNotNull(r10, r0)
            g.n.a.v r10 = (p163g.p503n.p504a.C11839v) r10
            com.bamtechmedia.dominguez.search.y$b r0 = new com.bamtechmedia.dominguez.search.y$b
            r0.<init>(r9)
            com.bamtechmedia.dominguez.search.y$c r1 = new com.bamtechmedia.dominguez.search.y$c
            r1.<init>(r9)
            r10.mo29926a(r0, r1)
        L_0x0172:
            return
        L_0x0173:
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r1)
            throw r2
        L_0x0177:
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r1)
            throw r2
        L_0x017b:
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r1)
            throw r2
        L_0x017f:
            java.lang.String r10 = "transitionHelper"
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r10)
            throw r2
        L_0x0185:
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r1)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bamtechmedia.dominguez.search.C8068y.m23390a(com.bamtechmedia.dominguez.search.v$a):void");
    }

    /* renamed from: b */
    public void mo21001b(Function0<C13145v> function0) {
        ((RecyclerView) _$_findCachedViewById(C8048n.keyboardResultsRecyclerView)).announceForAccessibility(C5880u.m18936a(C8051q.a11y_cdsearch_letters_upnav_autocomplete));
        if (m23397s()) {
            m23389a(C8046l.search_layout_margin_top_w_suggestions, function0);
        }
    }

    /* renamed from: a */
    public boolean mo1302a(String str) {
        C8002c cVar = this.f17281i0;
        if (cVar != null) {
            cVar.mo20997a(str, (Fragment) this);
        }
        C7975b0 b0Var = this.f17267U;
        String str2 = "viewModel";
        if (b0Var != null) {
            b0Var.mo20957a(str, true);
            C7975b0 b0Var2 = this.f17267U;
            if (b0Var2 != null) {
                C7975b0.m23246a(b0Var2, str, false, 2, null);
                return true;
            }
            Intrinsics.throwUninitializedPropertyAccessException(str2);
            throw null;
        }
        Intrinsics.throwUninitializedPropertyAccessException(str2);
        throw null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:61:0x0106, code lost:
        if (r0.isFocusable() == false) goto L_0x0131;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo12232a(int r14) {
        /*
            r13 = this;
            com.bamtechmedia.dominguez.search.SpeechRecognizerHelper r0 = r13.f17276d0
            r1 = 0
            if (r0 == 0) goto L_0x0132
            boolean r0 = r0.mo20920a(r14)
            r2 = 1
            if (r0 == 0) goto L_0x000d
            return r2
        L_0x000d:
            r0 = 19
            r3 = 0
            if (r14 != r0) goto L_0x0014
            r0 = 1
            goto L_0x0015
        L_0x0014:
            r0 = 0
        L_0x0015:
            r4 = 22
            if (r14 != r4) goto L_0x001b
            r4 = 1
            goto L_0x001c
        L_0x001b:
            r4 = 0
        L_0x001c:
            r5 = 20
            if (r14 != r5) goto L_0x0022
            r5 = 1
            goto L_0x0023
        L_0x0022:
            r5 = 0
        L_0x0023:
            android.view.View r6 = r13.getView()
            if (r6 == 0) goto L_0x002e
            android.view.View r6 = r6.findFocus()
            goto L_0x002f
        L_0x002e:
            r6 = r1
        L_0x002f:
            java.lang.String r7 = "focusFinder"
            java.lang.String r8 = "keyboard"
            if (r0 == 0) goto L_0x0074
            if (r6 == 0) goto L_0x0074
            int r9 = com.bamtechmedia.dominguez.search.C8048n.keyboard
            android.view.View r9 = r13._$_findCachedViewById(r9)
            android.widget.LinearLayout r9 = (android.widget.LinearLayout) r9
            kotlin.jvm.internal.Intrinsics.checkReturnedValueIsNotNull(r9, r8)
            boolean r9 = com.bamtechmedia.dominguez.core.utils.C5852n0.m18889b(r6, r9)
            if (r9 != r2) goto L_0x0074
            com.bamtechmedia.dominguez.core.k.b r14 = r13.f17279g0
            if (r14 == 0) goto L_0x0070
            int r0 = com.bamtechmedia.dominguez.search.C8048n.keyboard
            android.view.View r0 = r13._$_findCachedViewById(r0)
            android.widget.LinearLayout r0 = (android.widget.LinearLayout) r0
            kotlin.jvm.internal.Intrinsics.checkReturnedValueIsNotNull(r0, r8)
            r1 = 33
            android.view.View r14 = r14.mo17644a(r0, r6, r1)
            if (r14 == 0) goto L_0x0060
            goto L_0x0068
        L_0x0060:
            int r14 = com.bamtechmedia.dominguez.search.C8048n.microphoneImageView
            android.view.View r14 = r13._$_findCachedViewById(r14)
            android.widget.ImageView r14 = (android.widget.ImageView) r14
        L_0x0068:
            if (r14 == 0) goto L_0x0131
            boolean r2 = r14.requestFocus()
            goto L_0x0131
        L_0x0070:
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r7)
            throw r1
        L_0x0074:
            if (r5 == 0) goto L_0x00d0
            if (r6 == 0) goto L_0x00d0
            int r5 = com.bamtechmedia.dominguez.search.C8048n.keyboard
            android.view.View r5 = r13._$_findCachedViewById(r5)
            android.widget.LinearLayout r5 = (android.widget.LinearLayout) r5
            kotlin.jvm.internal.Intrinsics.checkReturnedValueIsNotNull(r5, r8)
            boolean r5 = com.bamtechmedia.dominguez.core.utils.C5852n0.m18889b(r6, r5)
            if (r5 != r2) goto L_0x00d0
            com.bamtechmedia.dominguez.core.k.b r14 = r13.f17279g0
            if (r14 == 0) goto L_0x00cc
            int r0 = com.bamtechmedia.dominguez.search.C8048n.keyboard
            android.view.View r0 = r13._$_findCachedViewById(r0)
            android.widget.LinearLayout r0 = (android.widget.LinearLayout) r0
            kotlin.jvm.internal.Intrinsics.checkReturnedValueIsNotNull(r0, r8)
            r2 = 130(0x82, float:1.82E-43)
            android.view.View r14 = r14.mo17644a(r0, r6, r2)
            if (r14 == 0) goto L_0x00a6
            boolean r2 = r14.requestFocus()
            goto L_0x0131
        L_0x00a6:
            com.bamtechmedia.dominguez.core.k.b r14 = r13.f17279g0
            if (r14 == 0) goto L_0x00c8
            int r0 = com.bamtechmedia.dominguez.search.C8048n.recyclerView
            android.view.View r0 = r13._$_findCachedViewById(r0)
            androidx.recyclerview.widget.RecyclerView r0 = (androidx.recyclerview.widget.RecyclerView) r0
            java.lang.String r1 = "recyclerView"
            kotlin.jvm.internal.Intrinsics.checkReturnedValueIsNotNull(r0, r1)
            android.graphics.Rect r1 = new android.graphics.Rect
            r1.<init>(r3, r3, r3, r3)
            android.view.View r14 = r14.mo17643a(r0, r1, r2)
            if (r14 == 0) goto L_0x0130
            boolean r14 = r14.requestFocus()
            r2 = r14
            goto L_0x0131
        L_0x00c8:
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r7)
            throw r1
        L_0x00cc:
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r7)
            throw r1
        L_0x00d0:
            if (r0 == 0) goto L_0x00e5
            boolean r0 = r13.m23398t()
            if (r0 == 0) goto L_0x00e5
            int r14 = com.bamtechmedia.dominguez.search.C8048n.keyboardSpaceButton
            android.view.View r14 = r13._$_findCachedViewById(r14)
            android.widget.ImageView r14 = (android.widget.ImageView) r14
            boolean r2 = r14.requestFocus()
            goto L_0x0131
        L_0x00e5:
            if (r4 == 0) goto L_0x0109
            int r0 = com.bamtechmedia.dominguez.search.C8048n.microphoneImageView
            android.view.View r0 = r13._$_findCachedViewById(r0)
            android.widget.ImageView r0 = (android.widget.ImageView) r0
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r6, r0)
            if (r0 == 0) goto L_0x0109
            int r0 = com.bamtechmedia.dominguez.search.C8048n.searchLayout
            android.view.View r0 = r13._$_findCachedViewById(r0)
            android.widget.LinearLayout r0 = (android.widget.LinearLayout) r0
            java.lang.String r4 = "searchLayout"
            kotlin.jvm.internal.Intrinsics.checkReturnedValueIsNotNull(r0, r4)
            boolean r0 = r0.isFocusable()
            if (r0 != 0) goto L_0x0109
            goto L_0x0131
        L_0x0109:
            if (r6 == 0) goto L_0x0130
            com.bamtechmedia.dominguez.collections.o r7 = r13.f17270X
            if (r7 == 0) goto L_0x012a
            r10 = 0
            r11 = 4
            r12 = 0
            r8 = r14
            r9 = r6
            boolean r2 = com.bamtechmedia.dominguez.collections.C3432o.m11717a(r7, r8, r9, r10, r11, r12)
            if (r2 != 0) goto L_0x0131
            com.bamtechmedia.dominguez.core.recycler.RecyclerViewSnapScrollHelper r0 = r13.f17271Y
            if (r0 == 0) goto L_0x0124
            com.bamtechmedia.dominguez.search.y$a r1 = com.bamtechmedia.dominguez.search.C8068y.C8069a.f17284c
            r0.mo17708a(r14, r6, r1)
            goto L_0x0131
        L_0x0124:
            java.lang.String r14 = "recyclerViewSnapScrollHelper"
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r14)
            throw r1
        L_0x012a:
            java.lang.String r14 = "focusHelper"
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r14)
            throw r1
        L_0x0130:
            r2 = 0
        L_0x0131:
            return r2
        L_0x0132:
            java.lang.String r14 = "speechRecognizerHelper"
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r14)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bamtechmedia.dominguez.search.C8068y.mo12232a(int):boolean");
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final void m23393a(C5597p pVar) {
        if (C8067x.$EnumSwitchMapping$0[pVar.ordinal()] != 1) {
            ((NoConnectionView) _$_findCachedViewById(C8048n.searchNoConnectionView)).mo17433b(false);
        } else {
            ((NoConnectionView) _$_findCachedViewById(C8048n.searchNoConnectionView)).mo17433b(true);
        }
    }

    /* renamed from: a */
    public void mo21000a(Function0<C13145v> function0) {
        if (!m23397s()) {
            m23389a(C8046l.search_layout_margin_top, function0);
        }
    }

    /* renamed from: a */
    private final void m23389a(int i, Function0<C13145v> function0) {
        C7965a0 a0Var = this.f17278f0;
        if (a0Var != null) {
            Resources resources = getResources();
            Intrinsics.checkReturnedValueIsNotNull((Object) resources, "resources");
            ConstraintLayout constraintLayout = (ConstraintLayout) _$_findCachedViewById(C8048n.searchRootView);
            Intrinsics.checkReturnedValueIsNotNull((Object) constraintLayout, "searchRootView");
            LinearLayout linearLayout = (LinearLayout) _$_findCachedViewById(C8048n.searchLayout);
            Intrinsics.checkReturnedValueIsNotNull((Object) linearLayout, "searchLayout");
            LinearLayout linearLayout2 = (LinearLayout) _$_findCachedViewById(C8048n.keyboard);
            Intrinsics.checkReturnedValueIsNotNull((Object) linearLayout2, "keyboard");
            a0Var.mo20932a(i, resources, constraintLayout, linearLayout, linearLayout2, function0);
            return;
        }
        Intrinsics.throwUninitializedPropertyAccessException("transitionHelper");
        throw null;
    }
}
