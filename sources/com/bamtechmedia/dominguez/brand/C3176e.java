package com.bamtechmedia.dominguez.brand;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;
import android.widget.ProgressBar;
import androidx.constraintlayout.motion.widget.MotionLayout;
import androidx.fragment.app.C0532d;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.C0722m;
import androidx.recyclerview.widget.RecyclerView;
import com.bamtechmedia.dominguez.analytics.C2378m;
import com.bamtechmedia.dominguez.collections.AssetStaticImageHandler.C3254b;
import com.bamtechmedia.dominguez.collections.AssetTransitionHandler.C3271b;
import com.bamtechmedia.dominguez.collections.C3280a;
import com.bamtechmedia.dominguez.collections.C3317e;
import com.bamtechmedia.dominguez.collections.C3320f;
import com.bamtechmedia.dominguez.collections.C3327g0;
import com.bamtechmedia.dominguez.collections.C3454q.C3456b;
import com.bamtechmedia.dominguez.collections.C3502x.C3503a;
import com.bamtechmedia.dominguez.collections.p080o0.C3433a;
import com.bamtechmedia.dominguez.core.content.assets.C3623a;
import com.bamtechmedia.dominguez.core.content.assets.Image;
import com.bamtechmedia.dominguez.core.content.collections.C3658a;
import com.bamtechmedia.dominguez.core.content.collections.C3676k;
import com.bamtechmedia.dominguez.core.content.collections.C3680n;
import com.bamtechmedia.dominguez.core.design.widgets.AspectRatioImageView;
import com.bamtechmedia.dominguez.core.design.widgets.NoConnectionView;
import com.bamtechmedia.dominguez.core.framework.C5755i;
import com.bamtechmedia.dominguez.core.p084g.C3807b;
import com.bamtechmedia.dominguez.core.p088i.p091p.C3849b;
import com.bamtechmedia.dominguez.core.p215k.C5759b;
import com.bamtechmedia.dominguez.core.p216l.C5763b;
import com.bamtechmedia.dominguez.core.recycler.RecyclerViewSnapScrollHelper;
import com.bamtechmedia.dominguez.core.recycler.RecyclerViewSnapScrollHelper.C5805c;
import com.bamtechmedia.dominguez.core.recycler.RecyclerViewSnapScrollHelper.C5805c.C5808c;
import com.bamtechmedia.dominguez.core.utils.C5818b;
import com.bamtechmedia.dominguez.core.utils.C5833g;
import com.bamtechmedia.dominguez.core.utils.C5837i;
import com.bamtechmedia.dominguez.core.utils.C5839j;
import com.bamtechmedia.dominguez.core.utils.C5852n0;
import com.bamtechmedia.dominguez.core.utils.C5880u;
import com.bamtechmedia.dominguez.core.utils.C5883w;
import com.bamtechmedia.dominguez.core.utils.C5884x;
import com.bamtechmedia.dominguez.profiles.C6626c0;
import com.bamtechmedia.dominguez.profiles.C6627c1;
import com.google.android.exoplayer2.p391ui.PlayerView;
import com.google.common.base.Optional;
import java.util.HashMap;
import kotlin.C12907r;
import kotlin.C13142s;
import kotlin.C13145v;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.C12880j;
import kotlin.jvm.internal.C12881k;
import kotlin.jvm.internal.C12890t;
import kotlin.jvm.internal.C12891u;
import kotlin.jvm.internal.C12895y;
import kotlin.reflect.KProperty;
import p163g.p201e.p202a.C5361d;
import p163g.p201e.p202a.C5363f;
import p163g.p201e.p202a.C5364g;
import p163g.p201e.p202a.C5365h;
import p163g.p201e.p203b.p299m.C7540c;
import p163g.p509o.p510a.C11848c;
import p163g.p509o.p510a.C11863k;
import p520io.reactivex.Single;
import p520io.reactivex.functions.Function;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000Ú\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 l2\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004:\u0001lB\u0005¢\u0006\u0002\u0010\u0005J\u000e\u0010<\u001a\b\u0012\u0004\u0012\u00020>0=H\u0016J\b\u0010?\u001a\u00020@H\u0002J\b\u0010A\u001a\u00020@H\u0002J\b\u0010B\u001a\u00020@H\u0002J\n\u0010C\u001a\u0004\u0018\u00010DH\u0016J\n\u0010E\u001a\u0004\u0018\u00010DH\u0016J\n\u0010F\u001a\u0004\u0018\u00010GH\u0016J\u0018\u0010H\u001a\u00020@2\u0006\u0010I\u001a\u00020J2\u0006\u0010K\u001a\u00020LH\u0002J\u0010\u0010M\u001a\u00020@2\u0006\u0010N\u001a\u00020OH\u0002J\u0010\u0010P\u001a\u00020@2\u0006\u0010N\u001a\u00020OH\u0002J2\u0010Q\u001a\u00020@2\b\u0010R\u001a\u0004\u0018\u00010D2\u0006\u0010K\u001a\u00020L2\u0006\u0010I\u001a\u00020J2\u0006\u0010S\u001a\u00020T2\u0006\u0010U\u001a\u00020TH\u0002J\b\u0010V\u001a\u00020\u0014H\u0016J\u0018\u0010W\u001a\u00020@2\u0006\u0010X\u001a\u00020Y2\u0006\u0010N\u001a\u00020OH\u0016J\u0016\u0010Z\u001a\u00020Y2\f\u0010[\u001a\b\u0012\u0004\u0012\u00020]0\\H\u0016J\u0010\u0010^\u001a\u00020\u00142\u0006\u0010_\u001a\u00020`H\u0016J\b\u0010a\u001a\u00020@H\u0016J&\u0010b\u001a\u00020@2\u0006\u0010X\u001a\u00020c2\u0006\u0010N\u001a\u00020O2\f\u0010d\u001a\b\u0012\u0004\u0012\u00020@0eH\u0016J\b\u0010f\u001a\u00020@H\u0016J\b\u0010g\u001a\u00020@H\u0016J\u001a\u0010h\u001a\u00020@2\u0006\u0010X\u001a\u00020c2\b\u0010i\u001a\u0004\u0018\u00010jH\u0016J\u0010\u0010k\u001a\u00020@2\u0006\u0010N\u001a\u00020OH\u0002R\u001e\u0010\u0006\u001a\u00020\u00078\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR$\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r8\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u000e\u0010\u0013\u001a\u00020\u0014X\u000e¢\u0006\u0002\n\u0000R\u001e\u0010\u0015\u001a\u00020\u00168\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u001e\u0010\u001b\u001a\u00020\u001c8\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R\u001e\u0010!\u001a\u00020\"8\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&R\u000e\u0010'\u001a\u00020\u0014X\u000e¢\u0006\u0002\n\u0000R\u001e\u0010(\u001a\u00020)8\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b*\u0010+\"\u0004\b,\u0010-R\u001e\u0010.\u001a\u00020/8\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b0\u00101\"\u0004\b2\u00103R\u001b\u00104\u001a\u0002058FX\u0002¢\u0006\f\n\u0004\b8\u00109\u001a\u0004\b6\u00107R\u0010\u0010:\u001a\u0004\u0018\u00010;X\u000e¢\u0006\u0002\n\u0000¨\u0006m"}, mo31007d2 = {"Lcom/bamtechmedia/dominguez/brand/BrandPageFragment;", "Lcom/bamtechmedia/dominguez/collections/AbstractCollectionFragment;", "Lcom/bamtechmedia/dominguez/collections/AssetStaticImageHandler$ViewProvider;", "Lcom/bamtechmedia/dominguez/collections/AssetTransitionHandler$ViewProvider;", "Lcom/bamtechmedia/dominguez/core/utils/BackPressHandler;", "()V", "analytics", "Lcom/bamtechmedia/dominguez/collections/CollectionAnalytics;", "getAnalytics", "()Lcom/bamtechmedia/dominguez/collections/CollectionAnalytics;", "setAnalytics", "(Lcom/bamtechmedia/dominguez/collections/CollectionAnalytics;)V", "brandPageAnimationHelper", "Lcom/google/common/base/Optional;", "Lcom/bamtechmedia/dominguez/brand/BrandPageAnimationHelper;", "getBrandPageAnimationHelper", "()Lcom/google/common/base/Optional;", "setBrandPageAnimationHelper", "(Lcom/google/common/base/Optional;)V", "closeWindow", "", "contentTransitionAnimation", "Lcom/bamtechmedia/dominguez/core/animation/TransitionAnimationHelper;", "getContentTransitionAnimation", "()Lcom/bamtechmedia/dominguez/core/animation/TransitionAnimationHelper;", "setContentTransitionAnimation", "(Lcom/bamtechmedia/dominguez/core/animation/TransitionAnimationHelper;)V", "deepLinkDialog", "Lcom/bamtechmedia/dominguez/dialogs/DeepLinkDialog;", "getDeepLinkDialog", "()Lcom/bamtechmedia/dominguez/dialogs/DeepLinkDialog;", "setDeepLinkDialog", "(Lcom/bamtechmedia/dominguez/dialogs/DeepLinkDialog;)V", "focusFinder", "Lcom/bamtechmedia/dominguez/core/focus/FocusFinderWrapper;", "getFocusFinder", "()Lcom/bamtechmedia/dominguez/core/focus/FocusFinderWrapper;", "setFocusFinder", "(Lcom/bamtechmedia/dominguez/core/focus/FocusFinderWrapper;)V", "initialBrandIntroStarted", "motionLayoutViewModel", "Lcom/bamtechmedia/dominguez/collections/MotionLayoutViewModel;", "getMotionLayoutViewModel", "()Lcom/bamtechmedia/dominguez/collections/MotionLayoutViewModel;", "setMotionLayoutViewModel", "(Lcom/bamtechmedia/dominguez/collections/MotionLayoutViewModel;)V", "profilesMemoryCache", "Lcom/bamtechmedia/dominguez/profiles/ProfilesMemoryCache;", "getProfilesMemoryCache", "()Lcom/bamtechmedia/dominguez/profiles/ProfilesMemoryCache;", "setProfilesMemoryCache", "(Lcom/bamtechmedia/dominguez/profiles/ProfilesMemoryCache;)V", "slug", "Lcom/bamtechmedia/dominguez/core/content/collections/Slug;", "getSlug", "()Lcom/bamtechmedia/dominguez/core/content/collections/Slug;", "slug$delegate", "Lcom/bamtechmedia/dominguez/core/utils/ParcelableFragmentArgumentDelegate;", "topFragment", "Landroidx/fragment/app/Fragment;", "analyticsSectionOnce", "Lio/reactivex/Single;", "Lcom/bamtechmedia/dominguez/analytics/AnalyticsSection;", "deepLinkFailureNavigateBack", "", "disableAccessibilityForTopFragment", "enableAccessibililtyForTopFragment", "getHeroImageView", "Landroid/widget/ImageView;", "getLogoImageView", "getPlayerView", "Lcom/google/android/exoplayer2/ui/PlayerView;", "loadBackgroundImage", "config", "Lcom/bamtechmedia/dominguez/collections/config/CollectionConfig;", "collection", "Lcom/bamtechmedia/dominguez/core/content/collections/Collection;", "loadBrandLogoImage", "state", "Lcom/bamtechmedia/dominguez/collections/CollectionViewModel$State;", "loadImages", "loadLogoImage", "imageView", "key", "", "aspectRatioKey", "onBackPress", "onCollectionStateChanged", "view", "Lcom/bamtechmedia/dominguez/collections/CollectionViewPresenter$CollectionView;", "onCreateCollectionView", "adapter", "Lcom/xwray/groupie/GroupAdapter;", "Lcom/xwray/groupie/ViewHolder;", "onKeyDown", "keyCode", "", "onPause", "onPreCollectionStateChanged", "Landroid/view/View;", "bindCollection", "Lkotlin/Function0;", "onResume", "onStart", "onViewCreated", "savedInstanceState", "Landroid/os/Bundle;", "updateIfVideoHero", "Companion", "core_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* renamed from: com.bamtechmedia.dominguez.brand.e */
/* compiled from: BrandPageFragment.kt */
public final class C3176e extends C3280a implements C3254b, C3271b, C5818b {

    /* renamed from: s0 */
    static final /* synthetic */ KProperty[] f8130s0 = {C12895y.m40235a((C12890t) new C12891u(C12895y.m40230a(C3176e.class), "slug", "getSlug()Lcom/bamtechmedia/dominguez/core/content/collections/Slug;"))};

    /* renamed from: t0 */
    public static final C3177a f8131t0 = new C3177a(null);

    /* renamed from: g0 */
    public C7540c f8132g0;

    /* renamed from: h0 */
    public C3327g0 f8133h0;

    /* renamed from: i0 */
    public Optional<BrandPageAnimationHelper> f8134i0;

    /* renamed from: j0 */
    public C6627c1 f8135j0;

    /* renamed from: k0 */
    public C5759b f8136k0;

    /* renamed from: l0 */
    public C3807b f8137l0;

    /* renamed from: m0 */
    public C3320f f8138m0;

    /* renamed from: n0 */
    private boolean f8139n0;

    /* renamed from: o0 */
    private final C5883w f8140o0 = C5839j.m18852a("slug", (Function0) null, 2, (Object) null);

    /* renamed from: p0 */
    private boolean f8141p0;

    /* renamed from: q0 */
    private Fragment f8142q0;

    /* renamed from: r0 */
    private HashMap f8143r0;

    /* renamed from: com.bamtechmedia.dominguez.brand.e$a */
    /* compiled from: BrandPageFragment.kt */
    public static final class C3177a {
        private C3177a() {
        }

        /* renamed from: a */
        public final C3176e mo12240a(C3676k kVar) {
            C3176e eVar = new C3176e();
            eVar.setArguments(C5833g.m18829a(C12907r.m40244a("slug", kVar)));
            return eVar;
        }

        public /* synthetic */ C3177a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: com.bamtechmedia.dominguez.brand.e$b */
    /* compiled from: BrandPageFragment.kt */
    static final class C3178b<T, R> implements Function<T, R> {

        /* renamed from: c */
        public static final C3178b f8144c = new C3178b();

        C3178b() {
        }

        /* renamed from: a */
        public final C2378m apply(C2378m mVar) {
            return C2378m.m8910a(mVar, mVar.mo11510Y(), null, null, C13173j0.m40354a(mVar.mo11509X(), C12907r.m40244a("brand", mVar.mo11510Y())), 6, null);
        }
    }

    /* renamed from: com.bamtechmedia.dominguez.brand.e$c */
    /* compiled from: BrandPageFragment.kt */
    static final class C3179c extends C12881k implements Function2<C3658a, C3433a, C13145v> {

        /* renamed from: c */
        final /* synthetic */ C3176e f8145c;

        C3179c(C3176e eVar) {
            this.f8145c = eVar;
            super(2);
        }

        /* renamed from: a */
        public final void mo12242a(C3658a aVar, C3433a aVar2) {
            C3176e eVar = this.f8145c;
            eVar.m11088a((ImageView) eVar._$_findCachedViewById(C5363f.brandLogoImageView), aVar, aVar2, "title", "titleAspectRatio");
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            mo12242a((C3658a) obj, (C3433a) obj2);
            return C13145v.f29587a;
        }
    }

    /* renamed from: com.bamtechmedia.dominguez.brand.e$d */
    /* compiled from: BrandPageFragment.kt */
    static final class C3180d extends C12881k implements Function2<C3658a, C3433a, C13145v> {

        /* renamed from: c */
        final /* synthetic */ C3176e f8146c;

        C3180d(C3176e eVar) {
            this.f8146c = eVar;
            super(2);
        }

        /* renamed from: a */
        public final void mo12243a(C3658a aVar, C3433a aVar2) {
            C3176e eVar = this.f8146c;
            eVar.m11088a((ImageView) eVar._$_findCachedViewById(C5363f.brandLogoImageView), aVar, aVar2, "title", "titleAspectRatio");
            this.f8146c.m11091a(aVar2, aVar);
            Context requireContext = this.f8146c.requireContext();
            C12880j.m40222a((Object) requireContext, "requireContext()");
            if (!C5837i.m18843e(requireContext)) {
                C3176e eVar2 = this.f8146c;
                eVar2.m11088a((ImageView) eVar2._$_findCachedViewById(C5363f.brandTopLogoImageView), aVar, aVar2, "title", "titleAspectRatio");
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            mo12243a((C3658a) obj, (C3433a) obj2);
            return C13145v.f29587a;
        }
    }

    /* renamed from: com.bamtechmedia.dominguez.brand.e$e */
    /* compiled from: BrandPageFragment.kt */
    static final class C3181e extends C12881k implements Function0<C13145v> {

        /* renamed from: c */
        final /* synthetic */ C3176e f8147c;

        C3181e(C3176e eVar) {
            this.f8147c = eVar;
            super(0);
        }

        public final void invoke() {
            C0532d activity = this.f8147c.getActivity();
            if (activity != null) {
                activity.onBackPressed();
            }
        }
    }

    /* renamed from: com.bamtechmedia.dominguez.brand.e$f */
    /* compiled from: BrandPageFragment.kt */
    static final class C3182f extends C12881k implements Function0<C13145v> {

        /* renamed from: c */
        final /* synthetic */ C3176e f8148c;

        C3182f(C3176e eVar) {
            this.f8148c = eVar;
            super(0);
        }

        public final void invoke() {
            C0532d activity = this.f8148c.getActivity();
            if (activity != null) {
                activity.onBackPressed();
            }
        }
    }

    /* renamed from: com.bamtechmedia.dominguez.brand.e$g */
    /* compiled from: BrandPageFragment.kt */
    static final class C3183g extends C12881k implements Function0<C13145v> {

        /* renamed from: c */
        final /* synthetic */ C3176e f8149c;

        C3183g(C3176e eVar) {
            this.f8149c = eVar;
            super(0);
        }

        public final void invoke() {
            C5759b w = this.f8149c.mo12238w();
            RecyclerView recyclerView = (RecyclerView) this.f8149c._$_findCachedViewById(C5363f.brandRecyclerView);
            C12880j.m40222a((Object) recyclerView, "brandRecyclerView");
            View a = w.mo17645a(recyclerView);
            if (a != null) {
                a.requestFocus();
            }
        }
    }

    /* renamed from: com.bamtechmedia.dominguez.brand.e$h */
    /* compiled from: View.kt */
    public static final class C3184h implements Runnable {

        /* renamed from: c */
        final /* synthetic */ Function0 f8150c;

        public C3184h(Function0 function0) {
            this.f8150c = function0;
        }

        public final void run() {
            this.f8150c.invoke();
        }
    }

    /* renamed from: com.bamtechmedia.dominguez.brand.e$i */
    /* compiled from: BrandPageFragment.kt */
    static final class C3185i extends C12881k implements Function1<Float, C13145v> {

        /* renamed from: c */
        final /* synthetic */ C3176e f8151c;

        C3185i(C3176e eVar) {
            this.f8151c = eVar;
            super(1);
        }

        /* renamed from: a */
        public final void mo12245a(float f) {
            View _$_findCachedViewById = this.f8151c._$_findCachedViewById(C5363f.brandMainLayout);
            if (!(_$_findCachedViewById instanceof MotionLayout)) {
                _$_findCachedViewById = null;
            }
            MotionLayout motionLayout = (MotionLayout) _$_findCachedViewById;
            if (motionLayout != null && motionLayout.getProgress() == 0.0f) {
                motionLayout.setProgress(f);
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo12245a(((Number) obj).floatValue());
            return C13145v.f29587a;
        }
    }

    /* renamed from: com.bamtechmedia.dominguez.brand.e$j */
    /* compiled from: BrandPageFragment.kt */
    static final class C3186j implements OnClickListener {

        /* renamed from: c */
        final /* synthetic */ C3176e f8152c;

        C3186j(C3176e eVar) {
            this.f8152c = eVar;
        }

        public final void onClick(View view) {
            this.f8152c.requireActivity().onBackPressed();
        }
    }

    /* renamed from: com.bamtechmedia.dominguez.brand.e$k */
    /* compiled from: BrandPageFragment.kt */
    static final class C3187k extends C12881k implements Function0<C13145v> {

        /* renamed from: c */
        final /* synthetic */ C3176e f8153c;

        C3187k(C3176e eVar) {
            this.f8153c = eVar;
            super(0);
        }

        public final void invoke() {
            RecyclerView recyclerView = (RecyclerView) this.f8153c._$_findCachedViewById(C5363f.brandRecyclerView);
            String str = "brandRecyclerView";
            C12880j.m40222a((Object) recyclerView, str);
            if (recyclerView.isFocused()) {
                BrandPageAnimationHelper brandPageAnimationHelper = (BrandPageAnimationHelper) this.f8153c.mo12237v().mo27107c();
                if (brandPageAnimationHelper != null) {
                    brandPageAnimationHelper.mo12217e();
                }
                C5759b w = this.f8153c.mo12238w();
                RecyclerView recyclerView2 = (RecyclerView) this.f8153c._$_findCachedViewById(C5363f.brandRecyclerView);
                C12880j.m40222a((Object) recyclerView2, str);
                View a = w.mo17645a(recyclerView2);
                if (a != null) {
                    a.requestFocus();
                }
            }
        }
    }

    public C3176e() {
        super(C5364g.fragment_brand_page);
    }

    /* renamed from: A */
    private final void m11087A() {
        C0532d requireActivity = requireActivity();
        C12880j.m40222a((Object) requireActivity, "requireActivity()");
        if (!C5837i.m18843e(requireActivity)) {
            Fragment fragment = this.f8142q0;
            if (fragment != null) {
                View view = fragment.getView();
                if (view != null) {
                    view.setImportantForAccessibility(1);
                }
            }
            this.f8142q0 = null;
        }
    }

    /* renamed from: b */
    private final void m11093b(C3456b bVar) {
        C5884x.m18949a(bVar.mo12653a(), bVar.mo12654b(), new C3180d(this));
    }

    /* renamed from: c */
    private final void m11094c(C3456b bVar) {
        C3658a a = bVar.mo12653a();
        C3680n Q = a != null ? a.mo13345Q() : null;
        PlayerView playerView = (PlayerView) _$_findCachedViewById(C5363f.brandBackgroundPlayerView);
        C3317e eVar = (C3317e) mo12326q().mo27107c();
        C6627c1 c1Var = this.f8135j0;
        if (c1Var != null) {
            C6626c0 b = c1Var.mo19287b();
            boolean O = b != null ? b.mo19351O() : false;
            if (Q != null && playerView != null && O && eVar != null) {
                eVar.mo12320a(playerView, Q, new C3187k(this));
                return;
            }
            return;
        }
        C12880j.m40227c("profilesMemoryCache");
        throw null;
    }

    /* renamed from: y */
    private final void m11095y() {
        requireActivity().onBackPressed();
        C7540c cVar = this.f8132g0;
        if (cVar != null) {
            cVar.mo20439a(Integer.valueOf(C5365h.error_collection_unavailable), Integer.valueOf(C5365h.btn_action1_collection_unavailable));
        } else {
            C12880j.m40227c("deepLinkDialog");
            throw null;
        }
    }

    /* renamed from: z */
    private final void m11096z() {
        C0532d requireActivity = requireActivity();
        C12880j.m40222a((Object) requireActivity, "requireActivity()");
        if (!C5837i.m18843e(requireActivity)) {
            this.f8142q0 = C5839j.m18845a(getFragmentManager());
            Fragment fragment = this.f8142q0;
            if (fragment != null) {
                View view = fragment.getView();
                if (view != null) {
                    view.setImportantForAccessibility(4);
                }
            }
        }
    }

    public void _$_clearFindViewByIdCache() {
        HashMap hashMap = this.f8143r0;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    public View _$_findCachedViewById(int i) {
        if (this.f8143r0 == null) {
            this.f8143r0 = new HashMap();
        }
        View view = (View) this.f8143r0.get(Integer.valueOf(i));
        if (view == null) {
            View view2 = getView();
            if (view2 == null) {
                return null;
            }
            view = view2.findViewById(i);
            this.f8143r0.put(Integer.valueOf(i), view);
        }
        return view;
    }

    /* renamed from: h */
    public ImageView mo12233h() {
        return (ImageView) _$_findCachedViewById(C5363f.contentLogoImageView);
    }

    /* renamed from: i */
    public ImageView mo12234i() {
        View _$_findCachedViewById = _$_findCachedViewById(C5363f.brandBackgroundImageView);
        if (_$_findCachedViewById != null) {
            return (ImageView) _$_findCachedViewById;
        }
        throw new C13142s("null cannot be cast to non-null type android.widget.ImageView");
    }

    /* renamed from: j */
    public PlayerView mo12235j() {
        return (PlayerView) _$_findCachedViewById(C5363f.brandBackgroundPlayerView);
    }

    /* renamed from: k */
    public boolean mo12236k() {
        if (!this.f8141p0) {
            this.f8141p0 = true;
            Context requireContext = requireContext();
            String str = "requireContext()";
            C12880j.m40222a((Object) requireContext, str);
            if (!C5837i.m18843e(requireContext)) {
                Context requireContext2 = requireContext();
                C12880j.m40222a((Object) requireContext2, str);
                String str2 = "contentTransitionAnimation";
                if (C5837i.m18842d(requireContext2)) {
                    C3807b bVar = this.f8137l0;
                    if (bVar != null) {
                        return bVar.mo13710a(new C3181e(this));
                    }
                    C12880j.m40227c(str2);
                    throw null;
                }
                C3807b bVar2 = this.f8137l0;
                if (bVar2 != null) {
                    return bVar2.mo13712b(new C3182f(this));
                }
                C12880j.m40227c(str2);
                throw null;
            }
        }
        return false;
    }

    /* renamed from: n */
    public Single<C2378m> mo11486n() {
        Single<C2378m> g = super.mo11486n().mo30233g(C3178b.f8144c);
        C12880j.m40222a((Object) g, "valueAnalytics.map {\n   …)\n            )\n        }");
        return g;
    }

    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        _$_clearFindViewByIdCache();
    }

    public void onPause() {
        super.onPause();
        m11087A();
    }

    public void onResume() {
        super.onResume();
        m11096z();
    }

    public void onStart() {
        super.onStart();
        C3327g0 g0Var = this.f8133h0;
        if (g0Var != null) {
            C5755i.m18679a(this, g0Var, null, null, new C3185i(this), 6, null);
            return;
        }
        C12880j.m40227c("motionLayoutViewModel");
        throw null;
    }

    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        view.announceForAccessibility(C5880u.m18937a(C5365h.a11y_brandlanding_pageload, C13170i0.m40332a(C12907r.m40244a("brand_name", C3174d.m11086a(mo12239x())))));
        View findViewById = view.findViewById(C5363f.brandBackLayout);
        View findViewById2 = view.findViewById(C5363f.backButton);
        if (findViewById != null) {
            C5852n0.m18884a(findViewById, false, false, null, 7, null);
        }
        if (findViewById2 != null) {
            findViewById2.setOnClickListener(new C3186j(this));
        }
        View _$_findCachedViewById = _$_findCachedViewById(C5363f.backgroundScrim);
        String str = "contentTransitionAnimation";
        if (_$_findCachedViewById != null) {
            C3807b bVar = this.f8137l0;
            if (bVar != null) {
                View _$_findCachedViewById2 = _$_findCachedViewById(C5363f.brandMainLayout);
                C12880j.m40222a((Object) _$_findCachedViewById2, "brandMainLayout");
                C0532d requireActivity = requireActivity();
                C12880j.m40222a((Object) requireActivity, "requireActivity()");
                bVar.mo13709a(_$_findCachedViewById, _$_findCachedViewById2, requireActivity);
            } else {
                C12880j.m40227c(str);
                throw null;
            }
        }
        RecyclerViewSnapScrollHelper r = mo12327r();
        C0722m viewLifecycleOwner = getViewLifecycleOwner();
        String str2 = "viewLifecycleOwner";
        C12880j.m40222a((Object) viewLifecycleOwner, str2);
        RecyclerView recyclerView = (RecyclerView) view.findViewById(C5363f.brandRecyclerView);
        C12880j.m40222a((Object) recyclerView, "view.brandRecyclerView");
        r.mo17710a(viewLifecycleOwner, recyclerView, (C5805c) new C5808c(Integer.valueOf(C5361d.padding_extra_small)));
        Optional<BrandPageAnimationHelper> optional = this.f8134i0;
        if (optional != null) {
            BrandPageAnimationHelper brandPageAnimationHelper = (BrandPageAnimationHelper) optional.mo27107c();
            if (brandPageAnimationHelper != null) {
                C0722m viewLifecycleOwner2 = getViewLifecycleOwner();
                C12880j.m40222a((Object) viewLifecycleOwner2, str2);
                viewLifecycleOwner2.getLifecycle().mo4134a(brandPageAnimationHelper);
            }
            View _$_findCachedViewById3 = _$_findCachedViewById(C5363f.brandMainLayout);
            if (!(_$_findCachedViewById3 instanceof MotionLayout)) {
                _$_findCachedViewById3 = null;
            }
            MotionLayout motionLayout = (MotionLayout) _$_findCachedViewById3;
            String str3 = "motionLayoutViewModel";
            if (motionLayout != null) {
                C3327g0 g0Var = this.f8133h0;
                if (g0Var != null) {
                    g0Var.mo12382a(motionLayout);
                } else {
                    C12880j.m40227c(str3);
                    throw null;
                }
            }
            C3327g0 g0Var2 = this.f8133h0;
            if (g0Var2 == null) {
                C12880j.m40227c(str3);
                throw null;
            } else if (g0Var2.mo12384y()) {
                Context requireContext = requireContext();
                String str4 = "requireContext()";
                C12880j.m40222a((Object) requireContext, str4);
                if (C5837i.m18842d(requireContext)) {
                    C3807b bVar2 = this.f8137l0;
                    if (bVar2 != null) {
                        bVar2.mo13708a();
                    } else {
                        C12880j.m40227c(str);
                        throw null;
                    }
                } else {
                    Context requireContext2 = requireContext();
                    C12880j.m40222a((Object) requireContext2, str4);
                    if (!C5837i.m18843e(requireContext2)) {
                        C3807b bVar3 = this.f8137l0;
                        if (bVar3 != null) {
                            bVar3.mo13711b();
                        } else {
                            C12880j.m40227c(str);
                            throw null;
                        }
                    }
                }
                C3327g0 g0Var3 = this.f8133h0;
                if (g0Var3 != null) {
                    g0Var3.mo12383d(false);
                } else {
                    C12880j.m40227c(str3);
                    throw null;
                }
            }
        } else {
            C12880j.m40227c("brandPageAnimationHelper");
            throw null;
        }
    }

    /* renamed from: v */
    public final Optional<BrandPageAnimationHelper> mo12237v() {
        Optional<BrandPageAnimationHelper> optional = this.f8134i0;
        if (optional != null) {
            return optional;
        }
        C12880j.m40227c("brandPageAnimationHelper");
        throw null;
    }

    /* renamed from: w */
    public final C5759b mo12238w() {
        C5759b bVar = this.f8136k0;
        if (bVar != null) {
            return bVar;
        }
        C12880j.m40227c("focusFinder");
        throw null;
    }

    /* renamed from: x */
    public final C3676k mo12239x() {
        return (C3676k) this.f8140o0.mo17776a(this, f8130s0[0]);
    }

    /* renamed from: a */
    public C3503a mo12229a(C11848c<C11863k> cVar) {
        RecyclerView recyclerView = (RecyclerView) _$_findCachedViewById(C5363f.brandRecyclerView);
        C12880j.m40222a((Object) recyclerView, "brandRecyclerView");
        ProgressBar progressBar = (ProgressBar) _$_findCachedViewById(C5363f.brandProgressBar);
        C12880j.m40222a((Object) progressBar, "brandProgressBar");
        C3503a aVar = new C3503a(cVar, recyclerView, progressBar, (NoConnectionView) _$_findCachedViewById(C5363f.brandNoConnectionView), null, null, 48, null);
        return aVar;
    }

    /* renamed from: a */
    public boolean mo12232a(int i) {
        Context requireContext = requireContext();
        C12880j.m40222a((Object) requireContext, "requireContext()");
        boolean z = false;
        if (C5837i.m18843e(requireContext)) {
            View view = getView();
            if (view != null) {
                View findFocus = view.findFocus();
                if (findFocus != null) {
                    boolean z2 = i == 20 || i == 21 || i == 22;
                    if (!C12880j.m40224a((Object) findFocus, (Object) (RecyclerView) _$_findCachedViewById(C5363f.brandRecyclerView)) || !z2) {
                        z = mo12323a(i, findFocus, false);
                    } else {
                        Optional<BrandPageAnimationHelper> optional = this.f8134i0;
                        if (optional != null) {
                            BrandPageAnimationHelper brandPageAnimationHelper = (BrandPageAnimationHelper) optional.mo27107c();
                            if (brandPageAnimationHelper != null) {
                                brandPageAnimationHelper.mo12217e();
                            }
                            C5759b bVar = this.f8136k0;
                            if (bVar != null) {
                                RecyclerView recyclerView = (RecyclerView) _$_findCachedViewById(C5363f.brandRecyclerView);
                                C12880j.m40222a((Object) recyclerView, "brandRecyclerView");
                                View a = bVar.mo17645a(recyclerView);
                                if (a != null) {
                                    z = a.requestFocus();
                                }
                                return z;
                            }
                            C12880j.m40227c("focusFinder");
                            throw null;
                        }
                        C12880j.m40227c("brandPageAnimationHelper");
                        throw null;
                    }
                }
            }
        }
        return z;
    }

    /* renamed from: a */
    public void mo12230a(View view, C3456b bVar, Function0<C13145v> function0) {
        String str = "brandMainLayout";
        boolean z = false;
        if (bVar.mo12655c()) {
            if (!bVar.mo12660g()) {
                m11095y();
            } else {
                View _$_findCachedViewById = _$_findCachedViewById(C5363f.brandMainLayout);
                C12880j.m40222a((Object) _$_findCachedViewById, str);
                _$_findCachedViewById.setVisibility(8);
            }
            View _$_findCachedViewById2 = _$_findCachedViewById(C5363f.blockingView);
            if (_$_findCachedViewById2 != null) {
                _$_findCachedViewById2.setClickable(bVar.mo12660g());
            }
        } else {
            View _$_findCachedViewById3 = _$_findCachedViewById(C5363f.brandMainLayout);
            C12880j.m40222a((Object) _$_findCachedViewById3, str);
            _$_findCachedViewById3.setVisibility(0);
        }
        if (!this.f8139n0 && bVar.mo12653a() != null) {
            Optional<BrandPageAnimationHelper> optional = this.f8134i0;
            if (optional != null) {
                BrandPageAnimationHelper brandPageAnimationHelper = (BrandPageAnimationHelper) optional.mo27107c();
                if (brandPageAnimationHelper != null) {
                    brandPageAnimationHelper.mo12216d();
                }
                C3658a a = bVar.mo12653a();
                if (!((a != null ? a.mo13345Q() : null) == null || mo12326q().mo27107c() == null || ((PlayerView) _$_findCachedViewById(C5363f.brandBackgroundPlayerView)) == null)) {
                    C6627c1 c1Var = this.f8135j0;
                    if (c1Var != null) {
                        C6626c0 b = c1Var.mo19287b();
                        if (b != null ? b.mo19351O() : false) {
                            z = true;
                        }
                    } else {
                        C12880j.m40227c("profilesMemoryCache");
                        throw null;
                    }
                }
                if (z) {
                    m11092a(bVar);
                } else {
                    m11093b(bVar);
                }
            } else {
                C12880j.m40227c("brandPageAnimationHelper");
                throw null;
            }
        }
        Context requireContext = requireContext();
        C12880j.m40222a((Object) requireContext, "requireContext()");
        view.postDelayed(new C3184h(function0), (!C5837i.m18842d(requireContext) || this.f8139n0) ? 0 : 350);
    }

    /* renamed from: a */
    public void mo12231a(C3503a aVar, C3456b bVar) {
        if (!this.f8139n0 && bVar.mo12653a() != null) {
            this.f8139n0 = true;
            m11094c(bVar);
            Optional<BrandPageAnimationHelper> optional = this.f8134i0;
            if (optional != null) {
                BrandPageAnimationHelper brandPageAnimationHelper = (BrandPageAnimationHelper) optional.mo27107c();
                if (brandPageAnimationHelper != null) {
                    brandPageAnimationHelper.mo12214a((Function0<C13145v>) new C3183g<C13145v>(this));
                    return;
                }
                return;
            }
            C12880j.m40227c("brandPageAnimationHelper");
            throw null;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final void m11091a(C3433a aVar, C3658a aVar2) {
        C3433a aVar3 = aVar;
        String string = getResources().getString(C5365h.collection_size_qualifier);
        C12880j.m40222a((Object) string, "resources.getString(R.st…ollection_size_qualifier)");
        C3623a aVar4 = new C3623a(((Number) aVar3.mo12607a("backgroundAspectRatio", string)).floatValue());
        View _$_findCachedViewById = _$_findCachedViewById(C5363f.brandBackgroundImageView);
        if (!(_$_findCachedViewById instanceof AspectRatioImageView)) {
            _$_findCachedViewById = null;
        }
        AspectRatioImageView aspectRatioImageView = (AspectRatioImageView) _$_findCachedViewById;
        if (aspectRatioImageView != null) {
            aspectRatioImageView.setRatio(aVar4);
        }
        View _$_findCachedViewById2 = _$_findCachedViewById(C5363f.brandBackgroundImageView);
        if (_$_findCachedViewById2 != null) {
            ImageView imageView = (ImageView) _$_findCachedViewById2;
            Image a = aVar2.mo12846a((String) aVar3.mo12606a("background"), aVar4);
            int a2 = C3849b.m12935a(C3849b.f9526a, aVar4.mo13242X(), 0, 2, null);
            Context requireContext = requireContext();
            C12880j.m40222a((Object) requireContext, "requireContext()");
            C5763b.m18702a(imageView, a, a2, null, null, C5837i.m18843e(requireContext), false, false, 108, null);
            return;
        }
        throw new C13142s("null cannot be cast to non-null type android.widget.ImageView");
    }

    /* renamed from: a */
    private final void m11092a(C3456b bVar) {
        C5884x.m18949a(bVar.mo12653a(), bVar.mo12654b(), new C3179c(this));
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final void m11088a(ImageView imageView, C3658a aVar, C3433a aVar2, String str, String str2) {
        String str3 = (String) aVar2.mo12606a(str);
        C3623a aVar3 = new C3623a(((Number) aVar2.mo12606a(str2)).floatValue());
        if (imageView != null) {
            C3658a aVar4 = aVar;
            C5763b.m18702a(imageView, aVar.mo12846a(str3, aVar3), 0, null, null, false, false, false, 126, null);
        }
    }
}
