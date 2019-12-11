package p163g.p201e.p203b.p315s;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewTreeObserver;
import android.view.ViewTreeObserver.OnGlobalFocusChangeListener;
import android.view.WindowManager;
import android.view.animation.LinearInterpolator;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.fragment.app.C0532d;
import androidx.lifecycle.C0722m;
import androidx.recyclerview.widget.RecyclerView;
import com.bamtechmedia.dominguez.collections.C3280a;
import com.bamtechmedia.dominguez.collections.C3454q.C3456b;
import com.bamtechmedia.dominguez.collections.C3502x.C3503a;
import com.bamtechmedia.dominguez.core.content.collections.C3658a;
import com.bamtechmedia.dominguez.core.content.collections.C3676k;
import com.bamtechmedia.dominguez.core.content.sets.C3778h;
import com.bamtechmedia.dominguez.core.design.widgets.DisneyTitleToolbar;
import com.bamtechmedia.dominguez.core.design.widgets.NoConnectionView;
import com.bamtechmedia.dominguez.core.design.widgets.focus.FocusSearchInterceptConstraintLayout;
import com.bamtechmedia.dominguez.core.design.widgets.focus.FocusSearchInterceptTabLayout;
import com.bamtechmedia.dominguez.core.design.widgets.p213e.C5681a;
import com.bamtechmedia.dominguez.core.framework.C5755i;
import com.bamtechmedia.dominguez.core.p084g.p085c.C3821b;
import com.bamtechmedia.dominguez.core.p084g.p086d.C3822a;
import com.bamtechmedia.dominguez.core.p088i.p091p.C3848a;
import com.bamtechmedia.dominguez.core.recycler.RecyclerViewSnapScrollHelper;
import com.bamtechmedia.dominguez.core.recycler.RecyclerViewSnapScrollHelper.C5805c;
import com.bamtechmedia.dominguez.core.recycler.RecyclerViewSnapScrollHelper.C5805c.C5806a;
import com.bamtechmedia.dominguez.core.utils.C5833g;
import com.bamtechmedia.dominguez.core.utils.C5837i;
import com.bamtechmedia.dominguez.core.utils.C5839j;
import com.bamtechmedia.dominguez.core.utils.C5842k0;
import com.bamtechmedia.dominguez.core.utils.C5852n0;
import com.bamtechmedia.dominguez.core.utils.C5883w;
import com.google.android.material.chip.Chip;
import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.TabLayout.C10341g;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kotlin.C12907r;
import kotlin.TypeCastException;
import kotlin.C13145v;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.C12881k;
import kotlin.jvm.internal.C12890t;
import kotlin.jvm.internal.C12891u;
import kotlin.jvm.internal.C12895y;
import kotlin.reflect.KProperty;
import net.danlew.android.joda.DateUtils;
import p096e.p121h.p135s.C4127b0;
import p163g.p201e.p202a.C5363f;
import p163g.p201e.p202a.C5364g;
import p163g.p201e.p202a.C5366i;
import p163g.p201e.p203b.p311p.C7649a;
import p163g.p201e.p203b.p312q.C7700r;
import p163g.p201e.p203b.p315s.C7762m.C7764b;
import p163g.p509o.p510a.C11848c;
import p163g.p509o.p510a.C11863k;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 B2\u00020\u00012\u00020\u00022\u00020\u0003:\u0001BB\u0005¢\u0006\u0002\u0010\u0004J\u0010\u0010'\u001a\u00020(2\u0006\u0010)\u001a\u00020*H\u0002J\u0012\u0010+\u001a\u00020(2\b\u0010,\u001a\u0004\u0018\u00010-H\u0007J\u0018\u0010.\u001a\u00020(2\u0006\u0010/\u001a\u0002002\u0006\u0010)\u001a\u000201H\u0016J\u0016\u00102\u001a\u0002002\f\u00103\u001a\b\u0012\u0004\u0012\u00020504H\u0016J\b\u00106\u001a\u00020(H\u0016J\u001c\u00107\u001a\u00020(2\b\u00108\u001a\u0004\u0018\u00010-2\b\u00109\u001a\u0004\u0018\u00010-H\u0016J\b\u0010:\u001a\u00020(H\u0016J\u001a\u0010;\u001a\u00020(2\u0006\u0010/\u001a\u00020-2\b\u0010<\u001a\u0004\u0018\u00010=H\u0016J\u001a\u0010>\u001a\u00020(*\u00020\u00182\f\u0010?\u001a\b\u0012\u0004\u0012\u00020A0@H\u0002R\u001e\u0010\u0005\u001a\u00020\u00068\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001e\u0010\u000b\u001a\u00020\f8\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001b\u0010\u0011\u001a\u00020\u00128FX\u0002¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0017\u001a\u0004\u0018\u00010\u00188BX\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001aR\u001e\u0010\u001b\u001a\u00020\u001c8\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R\u001e\u0010!\u001a\u00020\"8\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&¨\u0006C"}, mo31007d2 = {"Lcom/bamtechmedia/dominguez/landing/LandingPageFragment;", "Lcom/bamtechmedia/dominguez/collections/AbstractCollectionFragment;", "Lcom/bamtechmedia/dominguez/globalnav/GlobalNavTvEnabled;", "Landroid/view/ViewTreeObserver$OnGlobalFocusChangeListener;", "()V", "accessibilityHelper", "Lcom/bamtechmedia/dominguez/landing/LandingPageAccessibilityHelper;", "getAccessibilityHelper", "()Lcom/bamtechmedia/dominguez/landing/LandingPageAccessibilityHelper;", "setAccessibilityHelper", "(Lcom/bamtechmedia/dominguez/landing/LandingPageAccessibilityHelper;)V", "backgroundHelper", "Lcom/bamtechmedia/dominguez/core/design/helper/BackgroundHelper;", "getBackgroundHelper", "()Lcom/bamtechmedia/dominguez/core/design/helper/BackgroundHelper;", "setBackgroundHelper", "(Lcom/bamtechmedia/dominguez/core/design/helper/BackgroundHelper;)V", "slug", "Lcom/bamtechmedia/dominguez/core/content/collections/Slug;", "getSlug", "()Lcom/bamtechmedia/dominguez/core/content/collections/Slug;", "slug$delegate", "Lcom/bamtechmedia/dominguez/core/utils/ParcelableFragmentArgumentDelegate;", "tabLayout", "Lcom/google/android/material/tabs/TabLayout;", "getTabLayout", "()Lcom/google/android/material/tabs/TabLayout;", "tabLayoutHelper", "Lcom/bamtechmedia/dominguez/core/design/widgets/tablayout/TabLayoutHelper;", "getTabLayoutHelper", "()Lcom/bamtechmedia/dominguez/core/design/widgets/tablayout/TabLayoutHelper;", "setTabLayoutHelper", "(Lcom/bamtechmedia/dominguez/core/design/widgets/tablayout/TabLayoutHelper;)V", "viewModel", "Lcom/bamtechmedia/dominguez/landing/LandingPageViewModel;", "getViewModel", "()Lcom/bamtechmedia/dominguez/landing/LandingPageViewModel;", "setViewModel", "(Lcom/bamtechmedia/dominguez/landing/LandingPageViewModel;)V", "assignNewTabState", "", "state", "Lcom/bamtechmedia/dominguez/landing/LandingPageViewModel$State;", "initMobileItems", "backButton", "Landroid/view/View;", "onCollectionStateChanged", "view", "Lcom/bamtechmedia/dominguez/collections/CollectionViewPresenter$CollectionView;", "Lcom/bamtechmedia/dominguez/collections/CollectionViewModel$State;", "onCreateCollectionView", "adapter", "Lcom/xwray/groupie/GroupAdapter;", "Lcom/xwray/groupie/ViewHolder;", "onDestroyView", "onGlobalFocusChanged", "oldFocus", "newFocus", "onStart", "onViewCreated", "savedInstanceState", "Landroid/os/Bundle;", "addFilters", "filters", "", "Lcom/bamtechmedia/dominguez/filter/Filter;", "Companion", "core_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* renamed from: g.e.b.s.e */
/* compiled from: LandingPageFragment.kt */
public final class C7745e extends C3280a implements C7700r, OnGlobalFocusChangeListener {

    /* renamed from: m0 */
    static final /* synthetic */ KProperty[] f16812m0 = {C12895y.m40235a((C12890t) new C12891u(C12895y.m40230a(C7745e.class), "slug", "getSlug()Lcom/bamtechmedia/dominguez/core/content/collections/Slug;"))};

    /* renamed from: n0 */
    public static final C7746a f16813n0 = new C7746a(null);

    /* renamed from: g0 */
    public C7762m f16814g0;

    /* renamed from: h0 */
    public C5681a f16815h0;

    /* renamed from: i0 */
    public C3848a f16816i0;

    /* renamed from: j0 */
    public C7742c f16817j0;

    /* renamed from: k0 */
    private final C5883w f16818k0 = C5839j.m18852a("slug", (Function0) null, 2, (Object) null);

    /* renamed from: l0 */
    private HashMap f16819l0;

    /* renamed from: g.e.b.s.e$a */
    /* compiled from: LandingPageFragment.kt */
    public static final class C7746a {
        private C7746a() {
        }

        /* renamed from: a */
        public final Bundle mo20658a(C3676k kVar) {
            return C5833g.m18829a(C12907r.m40244a("slug", kVar));
        }

        /* renamed from: b */
        public final C7745e mo20659b(C3676k kVar) {
            C7745e eVar = new C7745e();
            eVar.setArguments(C7745e.f16813n0.mo20658a(kVar));
            return eVar;
        }

        public /* synthetic */ C7746a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: g.e.b.s.e$b */
    /* compiled from: LandingPageFragment.kt */
    static final class C7747b extends C12881k implements Function1<C10341g, C13145v> {

        /* renamed from: c */
        final /* synthetic */ C7745e f16820c;

        C7747b(C7745e eVar, C7764b bVar) {
            this.f16820c = eVar;
            super(1);
        }

        /* renamed from: a */
        public final void mo20660a(C10341g gVar) {
            C7762m viewModel = this.f16820c.getViewModel();
            Object d = gVar.mo26966d();
            if (d != null) {
                viewModel.mo20666a((C7649a) d);
                return;
            }
            throw new TypeCastException("null cannot be cast to non-null type com.bamtechmedia.dominguez.filter.Filter");
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo20660a((C10341g) obj);
            return C13145v.f29587a;
        }
    }

    /* renamed from: g.e.b.s.e$c */
    /* compiled from: LandingPageFragment.kt */
    static final class C7748c implements OnClickListener {

        /* renamed from: c */
        final /* synthetic */ C7745e f16821c;

        C7748c(C7745e eVar) {
            this.f16821c = eVar;
        }

        public final void onClick(View view) {
            this.f16821c.getViewModel().mo20667y();
        }
    }

    /* renamed from: g.e.b.s.e$d */
    /* compiled from: LandingPageFragment.kt */
    static final class C7749d implements OnClickListener {

        /* renamed from: c */
        final /* synthetic */ C7745e f16822c;

        C7749d(C7745e eVar) {
            this.f16822c = eVar;
        }

        public final void onClick(View view) {
            this.f16822c.getViewModel().mo20667y();
        }
    }

    /* renamed from: g.e.b.s.e$e */
    /* compiled from: LandingPageFragment.kt */
    static final class C7750e implements OnClickListener {

        /* renamed from: c */
        final /* synthetic */ C7745e f16823c;

        C7750e(C7745e eVar) {
            this.f16823c = eVar;
        }

        public final void onClick(View view) {
            C0532d activity = this.f16823c.getActivity();
            if (activity != null) {
                activity.onBackPressed();
            }
        }
    }

    /* renamed from: g.e.b.s.e$f */
    /* compiled from: LandingPageFragment.kt */
    static final class C7751f extends C12881k implements Function0<C13145v> {

        /* renamed from: c */
        final /* synthetic */ C7745e f16824c;

        C7751f(C7745e eVar) {
            this.f16824c = eVar;
            super(0);
        }

        public final void invoke() {
            C0532d activity = this.f16824c.getActivity();
            if (activity != null) {
                activity.onBackPressed();
            }
        }
    }

    /* renamed from: g.e.b.s.e$g */
    /* compiled from: LandingPageFragment.kt */
    static final class C7752g extends C12881k implements Function1<C7764b, C13145v> {

        /* renamed from: c */
        final /* synthetic */ C7745e f16825c;

        C7752g(C7745e eVar) {
            this.f16825c = eVar;
            super(1);
        }

        /* renamed from: a */
        public final void mo20664a(C7764b bVar) {
            this.f16825c.m22810a(bVar);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo20664a((C7764b) obj);
            return C13145v.f29587a;
        }
    }

    public C7745e() {
        super(C5364g.fragment_landing_page);
    }

    /* renamed from: w */
    private final TabLayout m22811w() {
        TabLayout tabLayout = (FocusSearchInterceptTabLayout) _$_findCachedViewById(C5363f.landingPageTvTypeTabLayout);
        if (tabLayout == null) {
            tabLayout = (TabLayout) _$_findCachedViewById(C5363f.landingPageTypeTabLayout);
        }
        if (tabLayout != null) {
            return tabLayout;
        }
        return null;
    }

    public void _$_clearFindViewByIdCache() {
        HashMap hashMap = this.f16819l0;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    public View _$_findCachedViewById(int i) {
        if (this.f16819l0 == null) {
            this.f16819l0 = new HashMap();
        }
        View view = (View) this.f16819l0.get(Integer.valueOf(i));
        if (view == null) {
            View view2 = getView();
            if (view2 == null) {
                return null;
            }
            view = view2.findViewById(i);
            this.f16819l0.put(Integer.valueOf(i), view);
        }
        return view;
    }

    public final C7762m getViewModel() {
        C7762m mVar = this.f16814g0;
        if (mVar != null) {
            return mVar;
        }
        Intrinsics.throwUninitializedPropertyAccessException("viewModel");
        throw null;
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
        Object obj = null;
        if (Intrinsics.areEqual(view != null ? view.getTag(C5363f.focusHelperTabView) : null, (Object) Boolean.valueOf(true))) {
            if (view2 != null) {
                obj = view2.getTag(C5363f.focusHelperGlobalNavItem);
            }
            if (Intrinsics.areEqual(obj, (Object) Boolean.valueOf(true))) {
                TabLayout w = m22811w();
                if (w != null) {
                    w.setDescendantFocusability(DateUtils.FORMAT_NUMERIC_DATE);
                }
            }
        }
    }

    public void onStart() {
        super.onStart();
        C7762m mVar = this.f16814g0;
        if (mVar != null) {
            C5755i.m18679a(this, mVar, null, null, new C7752g(this), 6, null);
            return;
        }
        Intrinsics.throwUninitializedPropertyAccessException("viewModel");
        throw null;
    }

    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        View findViewById = view.findViewById(C5363f.backButton);
        C5852n0.m18884a(view, false, false, null, 7, null);
        RecyclerView recyclerView = (RecyclerView) view.findViewById(C5363f.landingPageRecyclerView);
        String str = "view.landingPageRecyclerView";
        Intrinsics.checkReturnedValueIsNotNull((Object) recyclerView, str);
        C3821b bVar = new C3821b(C3822a.f9509k.mo13746a(), new LinearInterpolator(), 250, 150);
        recyclerView.setItemAnimator(bVar);
        mo20655a(findViewById);
        RecyclerViewSnapScrollHelper r = mo12327r();
        C0722m viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkReturnedValueIsNotNull((Object) viewLifecycleOwner, "viewLifecycleOwner");
        RecyclerView recyclerView2 = (RecyclerView) view.findViewById(C5363f.landingPageRecyclerView);
        Intrinsics.checkReturnedValueIsNotNull((Object) recyclerView2, str);
        r.mo17710a(viewLifecycleOwner, recyclerView2, (C5805c) C5806a.f13590a);
        view.getViewTreeObserver().addOnGlobalFocusChangeListener(this);
        TabLayout w = m22811w();
        if (w != null) {
            C7742c cVar = this.f16817j0;
            if (cVar != null) {
                FocusSearchInterceptConstraintLayout focusSearchInterceptConstraintLayout = (FocusSearchInterceptConstraintLayout) view.findViewById(C5363f.landingPageContainer);
                Intrinsics.checkReturnedValueIsNotNull((Object) focusSearchInterceptConstraintLayout, "view.landingPageContainer");
                cVar.mo20653a(focusSearchInterceptConstraintLayout, w);
                return;
            }
            Intrinsics.throwUninitializedPropertyAccessException("accessibilityHelper");
            throw null;
        }
    }

    /* renamed from: v */
    public final C3676k mo12237v() {
        return (C3676k) this.f16818k0.mo17776a(this, f16812m0[0]);
    }

    /* renamed from: a */
    public C3503a mo12229a(C11848c<C11863k> cVar) {
        RecyclerView recyclerView = (RecyclerView) _$_findCachedViewById(C5363f.landingPageRecyclerView);
        Intrinsics.checkReturnedValueIsNotNull((Object) recyclerView, "landingPageRecyclerView");
        ProgressBar progressBar = (ProgressBar) _$_findCachedViewById(C5363f.landingPageProgressBar);
        Intrinsics.checkReturnedValueIsNotNull((Object) progressBar, "landingPageProgressBar");
        C3503a aVar = new C3503a(cVar, recyclerView, progressBar, (NoConnectionView) _$_findCachedViewById(C5363f.landingNoConnection), null, null, 48, null);
        return aVar;
    }

    /* renamed from: a */
    public final void mo20655a(View view) {
        Chip chip = (Chip) _$_findCachedViewById(C5363f.landingPageTypeChip);
        if (chip != null) {
            chip.setOnClickListener(new C7748c(this));
        }
        Chip chip2 = (Chip) _$_findCachedViewById(C5363f.landingPageTypeChip);
        if (chip2 != null) {
            chip2.setOnCloseIconClickListener(new C7749d(this));
        }
        if (view != null) {
            view.setOnClickListener(new C7750e(this));
        }
        DisneyTitleToolbar disneyTitleToolbar = (DisneyTitleToolbar) _$_findCachedViewById(C5363f.disneyToolbar);
        if (disneyTitleToolbar != null) {
            RecyclerView recyclerView = (RecyclerView) _$_findCachedViewById(C5363f.landingPageRecyclerView);
            Intrinsics.checkReturnedValueIsNotNull((Object) recyclerView, "landingPageRecyclerView");
            C3848a aVar = this.f16816i0;
            if (aVar != null) {
                DisneyTitleToolbar.m18445a(disneyTitleToolbar, recyclerView, aVar, null, null, null, 0, new C7751f(this), 60, null);
            } else {
                Intrinsics.throwUninitializedPropertyAccessException("backgroundHelper");
                throw null;
            }
        }
    }

    /* renamed from: a */
    public void mo12231a(C3503a aVar, C3456b bVar) {
        C3658a a = bVar.mo12653a();
        String str = null;
        if (a != null) {
            C7762m mVar = this.f16814g0;
            if (mVar != null) {
                mVar.mo20665a(a);
            } else {
                Intrinsics.throwUninitializedPropertyAccessException("viewModel");
                throw null;
            }
        }
        TextView textView = (TextView) _$_findCachedViewById(C5363f.landingPageTextView);
        Intrinsics.checkReturnedValueIsNotNull((Object) textView, "landingPageTextView");
        C3658a a2 = bVar.mo12653a();
        if (a2 != null) {
            str = a2.getTitle();
        }
        textView.setText(str);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final void m22810a(C7764b bVar) {
        int i;
        int i2;
        int i3;
        if (!bVar.mo20670b().isEmpty()) {
            Chip chip = (Chip) _$_findCachedViewById(C5363f.landingPageTypeChip);
            if (chip != null) {
                C3778h a = bVar.mo20668a();
                chip.setText(a != null ? a.mo13611g() : null);
            }
            Chip chip2 = (Chip) _$_findCachedViewById(C5363f.landingPageTypeChip);
            boolean z = true;
            if (chip2 != null) {
                C4127b0.m14131b(chip2, true);
            }
            View _$_findCachedViewById = _$_findCachedViewById(C5363f.landingPageTypeSeparator);
            if (_$_findCachedViewById != null) {
                C4127b0.m14131b(_$_findCachedViewById, !bVar.mo20672d());
            }
            View _$_findCachedViewById2 = _$_findCachedViewById(C5363f.landingPageTvDivider);
            int i4 = 0;
            if (_$_findCachedViewById2 != null) {
                if (!(_$_findCachedViewById2.getVisibility() == 0) && bVar.mo20672d()) {
                    z = false;
                }
                _$_findCachedViewById2.setVisibility(z ? 0 : 8);
            }
            TabLayout w = m22811w();
            if (w != null) {
                m22808a(w, bVar.mo20671c());
                Iterator it = bVar.mo20671c().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        i = -1;
                        break;
                    } else if (((C7649a) it.next()).mo20572Z()) {
                        i = i4;
                        break;
                    } else {
                        i4++;
                    }
                }
                Context requireContext = requireContext();
                String str = "requireContext()";
                Intrinsics.checkReturnedValueIsNotNull((Object) requireContext, str);
                if (C5837i.m18843e(requireContext)) {
                    i2 = C5366i.Disney_TextAppearance_FacetNav;
                } else {
                    i2 = C5366i.Disney_TextAppearance_BodyCopyHeadline;
                }
                Context requireContext2 = requireContext();
                Intrinsics.checkReturnedValueIsNotNull((Object) requireContext2, str);
                if (C5837i.m18843e(requireContext2)) {
                    i3 = C5366i.Disney_TextAppearance_H5;
                } else {
                    i3 = C5366i.Disney_TextAppearance_BodyCopy;
                }
                C5681a aVar = this.f16815h0;
                if (aVar != null) {
                    Integer valueOf = Integer.valueOf(i3);
                    Integer valueOf2 = Integer.valueOf(i2);
                    C0532d requireActivity = requireActivity();
                    Intrinsics.checkReturnedValueIsNotNull((Object) requireActivity, "requireActivity()");
                    WindowManager windowManager = requireActivity.getWindowManager();
                    Intrinsics.checkReturnedValueIsNotNull((Object) windowManager, "requireActivity().windowManager");
                    aVar.mo17518a(w, i, valueOf, valueOf2, windowManager.getDefaultDisplay(), (Function1<? super C10341g, C13145v>) new C7747b<Object,C13145v>(this, bVar));
                    if (w.isFocused()) {
                        View a2 = C5842k0.m18857a(w, i);
                        if (a2 != null) {
                            a2.requestFocus();
                        }
                    }
                } else {
                    Intrinsics.throwUninitializedPropertyAccessException("tabLayoutHelper");
                    throw null;
                }
            }
        }
    }

    /* renamed from: a */
    private final void m22808a(TabLayout tabLayout, List<C7649a> list) {
        if (tabLayout.getTabCount() == 0) {
            for (C7649a aVar : list) {
                C10341g a = C5842k0.m18858a(tabLayout, C5364g.landing_tabs_tab, aVar.mo20571Y());
                a.mo26961a((Object) aVar);
                tabLayout.mo26885a(a);
            }
        }
    }
}
