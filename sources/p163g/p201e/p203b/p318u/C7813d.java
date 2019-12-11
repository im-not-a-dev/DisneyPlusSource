package p163g.p201e.p203b.p318u;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.WindowInsets;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ProgressBar;
import androidx.lifecycle.C0722m;
import androidx.recyclerview.widget.RecyclerView;
import com.bamtechmedia.dominguez.collections.C3280a;
import com.bamtechmedia.dominguez.collections.C3502x.C3503a;
import com.bamtechmedia.dominguez.core.content.collections.C3676k;
import com.bamtechmedia.dominguez.core.design.widgets.DisneyTitleToolbar;
import com.bamtechmedia.dominguez.core.p084g.C3800a;
import com.bamtechmedia.dominguez.core.p088i.p091p.C3848a;
import com.bamtechmedia.dominguez.core.recycler.RecyclerViewSnapScrollHelper;
import com.bamtechmedia.dominguez.core.recycler.RecyclerViewSnapScrollHelper.C5805c;
import com.bamtechmedia.dominguez.core.recycler.RecyclerViewSnapScrollHelper.C5805c.C5806a;
import com.bamtechmedia.dominguez.core.utils.C5833g;
import com.bamtechmedia.dominguez.core.utils.C5837i;
import com.bamtechmedia.dominguez.core.utils.C5839j;
import com.bamtechmedia.dominguez.core.utils.C5852n0;
import com.bamtechmedia.dominguez.core.utils.C5883w;
import java.util.HashMap;
import kotlin.C12907r;
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
import p163g.p201e.p202a.C5361d;
import p163g.p201e.p202a.C5363f;
import p163g.p201e.p202a.C5364g;
import p163g.p201e.p203b.p312q.C7700r;
import p163g.p509o.p510a.C11848c;
import p163g.p509o.p510a.C11863k;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \u001e2\u00020\u00012\u00020\u0002:\u0001\u001eB\u0005¢\u0006\u0002\u0010\u0003J\u0018\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0015H\u0002J\u0016\u0010\u0016\u001a\u00020\u00172\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u001a0\u0019H\u0016J\u001a\u0010\u001b\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dH\u0016R\u001e\u0010\u0004\u001a\u00020\u00058\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001b\u0010\n\u001a\u00020\u000b8FX\u0002¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\f\u0010\r¨\u0006\u001f"}, mo31007d2 = {"Lcom/bamtechmedia/dominguez/originals/OriginalsPageFragment;", "Lcom/bamtechmedia/dominguez/collections/AbstractCollectionFragment;", "Lcom/bamtechmedia/dominguez/globalnav/GlobalNavTvEnabled;", "()V", "backgroundHelper", "Lcom/bamtechmedia/dominguez/core/design/helper/BackgroundHelper;", "getBackgroundHelper", "()Lcom/bamtechmedia/dominguez/core/design/helper/BackgroundHelper;", "setBackgroundHelper", "(Lcom/bamtechmedia/dominguez/core/design/helper/BackgroundHelper;)V", "slug", "Lcom/bamtechmedia/dominguez/core/content/collections/Slug;", "getSlug", "()Lcom/bamtechmedia/dominguez/core/content/collections/Slug;", "slug$delegate", "Lcom/bamtechmedia/dominguez/core/utils/ParcelableFragmentArgumentDelegate;", "animateToolbar", "", "view", "Landroid/view/View;", "scrollHeaderSize", "", "onCreateCollectionView", "Lcom/bamtechmedia/dominguez/collections/CollectionViewPresenter$CollectionView;", "adapter", "Lcom/xwray/groupie/GroupAdapter;", "Lcom/xwray/groupie/ViewHolder;", "onViewCreated", "savedInstanceState", "Landroid/os/Bundle;", "Companion", "core_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* renamed from: g.e.b.u.d */
/* compiled from: OriginalsPageFragment.kt */
public final class C7813d extends C3280a implements C7700r {

    /* renamed from: j0 */
    static final /* synthetic */ KProperty[] f16900j0 = {C12895y.m40235a((C12890t) new C12891u(C12895y.m40230a(C7813d.class), "slug", "getSlug()Lcom/bamtechmedia/dominguez/core/content/collections/Slug;"))};

    /* renamed from: k0 */
    public static final C7814a f16901k0 = new C7814a(null);

    /* renamed from: g0 */
    public C3848a f16902g0;

    /* renamed from: h0 */
    private final C5883w f16903h0 = C5839j.m18852a("slug", (Function0) null, 2, (Object) null);

    /* renamed from: i0 */
    private HashMap f16904i0;

    /* renamed from: g.e.b.u.d$a */
    /* compiled from: OriginalsPageFragment.kt */
    public static final class C7814a {
        private C7814a() {
        }

        /* renamed from: a */
        public final Bundle mo20719a(C3676k kVar) {
            return C5833g.m18829a(C12907r.m40244a("slug", kVar));
        }

        /* renamed from: b */
        public final C7813d mo20720b(C3676k kVar) {
            C7813d dVar = new C7813d();
            dVar.setArguments(C7813d.f16901k0.mo20719a(kVar));
            return dVar;
        }

        public /* synthetic */ C7814a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, mo31007d2 = {"<anonymous>", "", "inset", "Landroid/view/WindowInsets;", "invoke"}, mo31008k = 3, mo31009mv = {1, 1, 15})
    /* renamed from: g.e.b.u.d$b */
    /* compiled from: OriginalsPageFragment.kt */
    static final class C7815b extends C12881k implements Function1<WindowInsets, C13145v> {

        /* renamed from: U */
        final /* synthetic */ View f16905U;

        /* renamed from: V */
        final /* synthetic */ float f16906V;

        /* renamed from: c */
        final /* synthetic */ C7813d f16907c;

        /* renamed from: g.e.b.u.d$b$a */
        /* compiled from: OriginalsPageFragment.kt */
        static final class C7816a extends C12881k implements Function1<Integer, C13145v> {

            /* renamed from: U */
            final /* synthetic */ int f16908U;

            /* renamed from: c */
            final /* synthetic */ C7815b f16909c;

            C7816a(C7815b bVar, int i) {
                this.f16909c = bVar;
                this.f16908U = i;
                super(1);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke(((Number) obj).intValue());
                return C13145v.f29587a;
            }

            public final void invoke(int i) {
                float a = C12762h.m39912a(((float) i) / this.f16909c.f16906V, 1.0f);
                float a2 = C12762h.m39912a(((float) (i + this.f16908U)) / this.f16909c.f16906V, 1.0f);
                if (a > 0.5f) {
                    ImageView imageView = (ImageView) this.f16909c.f16907c._$_findCachedViewById(C5363f.originalsToolbarImageView);
                    if (imageView != null) {
                        imageView.setAlpha((a * 2.0f) - ((float) 1));
                    }
                    FrameLayout frameLayout = (FrameLayout) this.f16909c.f16907c._$_findCachedViewById(C5363f.originalsLogoImageViewLayout);
                    if (frameLayout != null) {
                        frameLayout.setAlpha(0.0f);
                    }
                } else {
                    FrameLayout frameLayout2 = (FrameLayout) this.f16909c.f16907c._$_findCachedViewById(C5363f.originalsLogoImageViewLayout);
                    if (frameLayout2 != null) {
                        frameLayout2.setAlpha(((float) 1) - (a * 2.0f));
                    }
                    ImageView imageView2 = (ImageView) this.f16909c.f16907c._$_findCachedViewById(C5363f.originalsToolbarImageView);
                    if (imageView2 != null) {
                        imageView2.setAlpha(0.0f);
                    }
                }
                FrameLayout frameLayout3 = (FrameLayout) this.f16909c.f16907c._$_findCachedViewById(C5363f.originalsLogoImageViewLayout);
                Intrinsics.checkReturnedValueIsNotNull((Object) frameLayout3, "originalsLogoImageViewLayout");
                int i2 = this.f16908U;
                frameLayout3.setTranslationY(((float) i2) - ((a2 * 2.0f) * ((float) i2)));
            }
        }

        /* renamed from: g.e.b.u.d$b$b */
        /* compiled from: OriginalsPageFragment.kt */
        static final class C7817b extends C12881k implements Function0<C13145v> {

            /* renamed from: c */
            final /* synthetic */ C7815b f16910c;

            C7817b(C7815b bVar) {
                this.f16910c = bVar;
                super(0);
            }

            public final void invoke() {
                this.f16910c.f16907c.requireActivity().onBackPressed();
            }
        }

        C7815b(C7813d dVar, View view, float f) {
            this.f16907c = dVar;
            this.f16905U = view;
            this.f16906V = f;
            super(1);
        }

        /* renamed from: a */
        public final void mo20721a(WindowInsets windowInsets) {
            int systemWindowInsetTop = windowInsets.getSystemWindowInsetTop();
            FrameLayout frameLayout = (FrameLayout) this.f16907c._$_findCachedViewById(C5363f.originalsLogoImageViewLayout);
            Intrinsics.checkReturnedValueIsNotNull((Object) frameLayout, "originalsLogoImageViewLayout");
            frameLayout.setTranslationY((float) systemWindowInsetTop);
            DisneyTitleToolbar disneyTitleToolbar = (DisneyTitleToolbar) this.f16905U.findViewById(C5363f.disneyToolbar);
            if (disneyTitleToolbar != null) {
                RecyclerView recyclerView = (RecyclerView) this.f16905U.findViewById(C5363f.originalsRecyclerView);
                Intrinsics.checkReturnedValueIsNotNull((Object) recyclerView, "view.originalsRecyclerView");
                DisneyTitleToolbar.m18445a(disneyTitleToolbar, recyclerView, this.f16907c.mo12237v(), null, null, new C7816a(this, systemWindowInsetTop), systemWindowInsetTop, new C7817b(this), 12, null);
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo20721a((WindowInsets) obj);
            return C13145v.f29587a;
        }
    }

    public C7813d() {
        super(C5364g.fragment_originals_page);
    }

    /* renamed from: a */
    private final void m22898a(View view, float f) {
        Context requireContext = requireContext();
        Intrinsics.checkReturnedValueIsNotNull((Object) requireContext, "requireContext()");
        if (C5837i.m18843e(requireContext)) {
            RecyclerView recyclerView = (RecyclerView) _$_findCachedViewById(C5363f.originalsRecyclerView);
            RecyclerView recyclerView2 = recyclerView;
            Intrinsics.checkReturnedValueIsNotNull((Object) recyclerView, "originalsRecyclerView");
            C3800a.m12829a(recyclerView2, 0.0f, 0.0f, 0.0f, 0.0f, null, null, 40.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 750, 1000, null, null, null, null, 249790, null);
            return;
        }
        C5852n0.m18884a(view, false, false, new C7815b(this, view, f), 2, null);
    }

    public void _$_clearFindViewByIdCache() {
        HashMap hashMap = this.f16904i0;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    public View _$_findCachedViewById(int i) {
        if (this.f16904i0 == null) {
            this.f16904i0 = new HashMap();
        }
        View view = (View) this.f16904i0.get(Integer.valueOf(i));
        if (view == null) {
            View view2 = getView();
            if (view2 == null) {
                return null;
            }
            view = view2.findViewById(i);
            this.f16904i0.put(Integer.valueOf(i), view);
        }
        return view;
    }

    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        _$_clearFindViewByIdCache();
    }

    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        Context requireContext = requireContext();
        Intrinsics.checkReturnedValueIsNotNull((Object) requireContext, "requireContext()");
        float dimension = requireContext.getResources().getDimension(C5361d.toolbar_height);
        RecyclerViewSnapScrollHelper r = mo12327r();
        C0722m viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkReturnedValueIsNotNull((Object) viewLifecycleOwner, "viewLifecycleOwner");
        RecyclerView recyclerView = (RecyclerView) view.findViewById(C5363f.originalsRecyclerView);
        Intrinsics.checkReturnedValueIsNotNull((Object) recyclerView, "view.originalsRecyclerView");
        r.mo17710a(viewLifecycleOwner, recyclerView, (C5805c) C5806a.f13590a);
        m22898a(view, dimension);
    }

    /* renamed from: v */
    public final C3848a mo12237v() {
        C3848a aVar = this.f16902g0;
        if (aVar != null) {
            return aVar;
        }
        Intrinsics.throwUninitializedPropertyAccessException("backgroundHelper");
        throw null;
    }

    /* renamed from: w */
    public final C3676k mo12238w() {
        return (C3676k) this.f16903h0.mo17776a(this, f16900j0[0]);
    }

    /* renamed from: a */
    public C3503a mo12229a(C11848c<C11863k> cVar) {
        RecyclerView recyclerView = (RecyclerView) _$_findCachedViewById(C5363f.originalsRecyclerView);
        Intrinsics.checkReturnedValueIsNotNull((Object) recyclerView, "originalsRecyclerView");
        ProgressBar progressBar = (ProgressBar) _$_findCachedViewById(C5363f.originalsProgressBar);
        Intrinsics.checkReturnedValueIsNotNull((Object) progressBar, "originalsProgressBar");
        C3503a aVar = new C3503a(cVar, recyclerView, progressBar, null, null, null, 56, null);
        return aVar;
    }
}
