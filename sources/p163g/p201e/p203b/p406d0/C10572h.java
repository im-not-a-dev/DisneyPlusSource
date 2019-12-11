package p163g.p201e.p203b.p406d0;

import android.animation.Animator;
import android.animation.Animator.AnimatorListener;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnLayoutChangeListener;
import android.view.ViewGroup;
import android.view.Window;
import android.view.animation.AccelerateInterpolator;
import android.widget.ProgressBar;
import androidx.fragment.app.C0532d;
import com.airbnb.lottie.C1182d;
import com.airbnb.lottie.C1209i;
import com.airbnb.lottie.C1219o;
import com.airbnb.lottie.LottieAnimationView;
import com.bamtechmedia.dominguez.core.BuildInfo;
import com.bamtechmedia.dominguez.core.framework.C5755i;
import com.bamtechmedia.dominguez.core.p084g.C3800a;
import java.util.HashMap;
import kotlin.C13145v;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12880j;
import kotlin.jvm.internal.C12881k;
import net.danlew.android.joda.DateUtils;
import p096e.p121h.p122j.C4025a;
import p096e.p121h.p135s.C4187x;
import p163g.p201e.p203b.p406d0.C10583l.C10587d;
import p512h.p513c.p514k.C11890i;
import p686n.p687a.C14100a;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\u0018\u0000 \u001d2\u00020\u0001:\u0001\u001dB\u0005¢\u0006\u0002\u0010\u0002J&\u0010\u000f\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016H\u0016J\b\u0010\u0017\u001a\u00020\u0018H\u0016J\b\u0010\u0019\u001a\u00020\u0018H\u0016J\u001a\u0010\u001a\u001a\u00020\u00182\u0006\u0010\u001b\u001a\u00020\u00102\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016H\u0016J\b\u0010\u001c\u001a\u00020\u0018H\u0002R\u001e\u0010\u0003\u001a\u00020\u00048\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001e\u0010\t\u001a\u00020\n8\u0000@\u0000X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e¨\u0006\u001e"}, mo31007d2 = {"Lcom/bamtechmedia/dominguez/splash/SplashFragment;", "Ldagger/android/support/DaggerFragment;", "()V", "buildInfo", "Lcom/bamtechmedia/dominguez/core/BuildInfo;", "getBuildInfo", "()Lcom/bamtechmedia/dominguez/core/BuildInfo;", "setBuildInfo", "(Lcom/bamtechmedia/dominguez/core/BuildInfo;)V", "viewModel", "Lcom/bamtechmedia/dominguez/splash/SplashViewModel;", "getViewModel$splash_release", "()Lcom/bamtechmedia/dominguez/splash/SplashViewModel;", "setViewModel$splash_release", "(Lcom/bamtechmedia/dominguez/splash/SplashViewModel;)V", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onStart", "", "onStop", "onViewCreated", "view", "startAnimation", "Companion", "splash_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* renamed from: g.e.b.d0.h */
/* compiled from: SplashFragment.kt */
public final class C10572h extends C11890i {

    /* renamed from: X */
    public static final C10573a f25016X = new C10573a(null);

    /* renamed from: U */
    public C10583l f25017U;

    /* renamed from: V */
    public BuildInfo f25018V;

    /* renamed from: W */
    private HashMap f25019W;

    /* renamed from: g.e.b.d0.h$a */
    /* compiled from: SplashFragment.kt */
    public static final class C10573a implements C10580i {
        private C10573a() {
        }

        public /* synthetic */ C10573a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public C10572h newInstance() {
            return new C10572h();
        }
    }

    /* renamed from: g.e.b.d0.h$b */
    /* compiled from: SplashFragment.kt */
    static final class C10574b extends C12881k implements Function1<C10587d, C13145v> {

        /* renamed from: c */
        final /* synthetic */ C10572h f25020c;

        C10574b(C10572h hVar) {
            this.f25020c = hVar;
            super(1);
        }

        /* renamed from: a */
        public final void mo27453a(C10587d dVar) {
            ProgressBar progressBar = (ProgressBar) this.f25020c._$_findCachedViewById(C10564b.splash_progress_bar);
            C12880j.m40222a((Object) progressBar, "splash_progress_bar");
            progressBar.setVisibility(dVar.mo27461a() ? 0 : 8);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo27453a((C10587d) obj);
            return C13145v.f29587a;
        }
    }

    /* renamed from: g.e.b.d0.h$c */
    /* compiled from: View.kt */
    public static final class C10575c implements OnLayoutChangeListener {

        /* renamed from: c */
        final /* synthetic */ C10572h f25021c;

        public C10575c(C10572h hVar) {
            this.f25021c = hVar;
        }

        public void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
            view.removeOnLayoutChangeListener(this);
            this.f25021c.requireActivity().reportFullyDrawn();
        }
    }

    /* renamed from: g.e.b.d0.h$d */
    /* compiled from: SplashFragment.kt */
    static final class C10576d extends C12881k implements Function0<C13145v> {

        /* renamed from: c */
        final /* synthetic */ C10572h f25022c;

        C10576d(C10572h hVar) {
            this.f25022c = hVar;
            super(0);
        }

        public final void invoke() {
            this.f25022c.mo27451o().mo27459z();
        }
    }

    /* renamed from: g.e.b.d0.h$e */
    /* compiled from: SplashFragment.kt */
    public static final class C10577e extends AnimatorListenerAdapter {

        /* renamed from: a */
        final /* synthetic */ C10572h f25023a;

        C10577e(C10572h hVar) {
            this.f25023a = hVar;
        }

        public void onAnimationEnd(Animator animator) {
            this.f25023a.mo27451o().mo27459z();
        }
    }

    @Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, mo31007d2 = {"<anonymous>", "", "it", "Lcom/airbnb/lottie/LottieComposition;", "kotlin.jvm.PlatformType", "onCompositionLoaded"}, mo31008k = 3, mo31009mv = {1, 1, 15})
    /* renamed from: g.e.b.d0.h$f */
    /* compiled from: SplashFragment.kt */
    static final class C10578f implements C1209i {

        /* renamed from: a */
        final /* synthetic */ C10572h f25024a;

        /* renamed from: g.e.b.d0.h$f$a */
        /* compiled from: SplashFragment.kt */
        static final class C10579a implements AnimatorUpdateListener {

            /* renamed from: a */
            final /* synthetic */ C10578f f25025a;

            C10579a(C10578f fVar) {
                this.f25025a = fVar;
            }

            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                C12880j.m40222a((Object) valueAnimator, "it");
                Object animatedValue = valueAnimator.getAnimatedValue();
                if (!(animatedValue instanceof Float)) {
                    animatedValue = null;
                }
                Float f = (Float) animatedValue;
                if (f == null) {
                    this.f25025a.f25024a.mo27451o().mo27459z();
                    return;
                }
                View _$_findCachedViewById = this.f25025a.f25024a._$_findCachedViewById(C10564b.background);
                if (_$_findCachedViewById != null) {
                    _$_findCachedViewById.setAlpha(f.floatValue() < 0.5f ? f.floatValue() / 0.5f : 1.0f);
                }
            }
        }

        C10578f(C10572h hVar) {
            this.f25024a = hVar;
        }

        /* renamed from: a */
        public final void mo6123a(C1182d dVar) {
            LottieAnimationView lottieAnimationView = (LottieAnimationView) this.f25024a._$_findCachedViewById(C10564b.lottieLoadingView);
            if (lottieAnimationView != null) {
                lottieAnimationView.mo5965a((AnimatorUpdateListener) new C10579a(this));
            } else {
                this.f25024a.mo27451o().mo27459z();
            }
        }
    }

    /* renamed from: p */
    private final void m33303p() {
        LottieAnimationView lottieAnimationView = (LottieAnimationView) _$_findCachedViewById(C10564b.lottieLoadingView);
        if (lottieAnimationView != null) {
            C10583l lVar = this.f25017U;
            if (lVar != null) {
                lottieAnimationView.setProgress(lVar.mo27458y());
            } else {
                C12880j.m40227c("viewModel");
                throw null;
            }
        }
        LottieAnimationView lottieAnimationView2 = (LottieAnimationView) _$_findCachedViewById(C10564b.lottieLoadingView);
        if (lottieAnimationView2 != null) {
            lottieAnimationView2.mo5974g();
        }
        LottieAnimationView lottieAnimationView3 = (LottieAnimationView) _$_findCachedViewById(C10564b.lottieLoadingView);
        if (lottieAnimationView3 != null) {
            lottieAnimationView3.mo5964a((AnimatorListener) new C10577e(this));
        }
        LottieAnimationView lottieAnimationView4 = (LottieAnimationView) _$_findCachedViewById(C10564b.lottieLoadingView);
        if (lottieAnimationView4 != null) {
            lottieAnimationView4.mo5970a((C1209i) new C10578f(this));
        }
        View _$_findCachedViewById = _$_findCachedViewById(C10564b.logoImageView);
        if (_$_findCachedViewById != null) {
            AccelerateInterpolator accelerateInterpolator = r1;
            AccelerateInterpolator accelerateInterpolator2 = new AccelerateInterpolator();
            C10576d dVar = r1;
            C10576d dVar2 = new C10576d(this);
            C3800a.m12829a(_$_findCachedViewById, 0.0f, 0.0f, 0.0f, 0.0f, null, null, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1500, 50, accelerateInterpolator, null, dVar, null, 167934, null);
            View _$_findCachedViewById2 = _$_findCachedViewById(C10564b.background);
            View view = _$_findCachedViewById2;
            C12880j.m40222a((Object) _$_findCachedViewById2, "background");
            AccelerateInterpolator accelerateInterpolator3 = r1;
            AccelerateInterpolator accelerateInterpolator4 = new AccelerateInterpolator();
            C3800a.m12829a(view, 0.0f, 0.0f, 0.0f, 0.0f, null, null, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1500, 0, accelerateInterpolator3, null, null, null, 241662, null);
        }
    }

    public void _$_clearFindViewByIdCache() {
        HashMap hashMap = this.f25019W;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    public View _$_findCachedViewById(int i) {
        if (this.f25019W == null) {
            this.f25019W = new HashMap();
        }
        View view = (View) this.f25019W.get(Integer.valueOf(i));
        if (view == null) {
            View view2 = getView();
            if (view2 == null) {
                return null;
            }
            view = view2.findViewById(i);
            this.f25019W.put(Integer.valueOf(i), view);
        }
        return view;
    }

    /* renamed from: o */
    public final C10583l mo27451o() {
        C10583l lVar = this.f25017U;
        if (lVar != null) {
            return lVar;
        }
        C12880j.m40227c("viewModel");
        throw null;
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(C10565c.fragment_splash, viewGroup, false);
    }

    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        _$_clearFindViewByIdCache();
    }

    public void onStart() {
        super.onStart();
        m33303p();
        C0532d requireActivity = requireActivity();
        C12880j.m40222a((Object) requireActivity, "requireActivity()");
        Window window = requireActivity.getWindow();
        window.setNavigationBarColor(C4025a.m13788a(requireContext(), 17170445));
        window.setFlags(DateUtils.FORMAT_NO_NOON, DateUtils.FORMAT_NO_NOON);
        C10583l lVar = this.f25017U;
        if (lVar != null) {
            C5755i.m18679a(this, lVar, null, null, new C10574b(this), 6, null);
            return;
        }
        C12880j.m40227c("viewModel");
        throw null;
    }

    public void onStop() {
        C0532d requireActivity = requireActivity();
        C12880j.m40222a((Object) requireActivity, "requireActivity()");
        requireActivity.getWindow().clearFlags(DateUtils.FORMAT_NO_NOON);
        LottieAnimationView lottieAnimationView = (LottieAnimationView) _$_findCachedViewById(C10564b.lottieLoadingView);
        if (lottieAnimationView != null) {
            lottieAnimationView.mo5972e();
        }
        C10583l lVar = this.f25017U;
        if (lVar != null) {
            LottieAnimationView lottieAnimationView2 = (LottieAnimationView) _$_findCachedViewById(C10564b.lottieLoadingView);
            lVar.mo27457a(lottieAnimationView2 != null ? lottieAnimationView2.getProgress() : 0.0f);
            super.onStop();
            return;
        }
        C12880j.m40227c("viewModel");
        throw null;
    }

    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        LottieAnimationView lottieAnimationView = (LottieAnimationView) _$_findCachedViewById(C10564b.lottieLoadingView);
        if (lottieAnimationView != null) {
            lottieAnimationView.setRenderMode(C1219o.SOFTWARE);
        }
        BuildInfo buildInfo = this.f25018V;
        if (buildInfo == null) {
            C12880j.m40227c("buildInfo");
            throw null;
        } else if (buildInfo.mo12784f()) {
            try {
                if (!C4187x.m14340E(view) || view.isLayoutRequested()) {
                    view.addOnLayoutChangeListener(new C10575c(this));
                } else {
                    requireActivity().reportFullyDrawn();
                }
            } catch (Exception unused) {
                C14100a.m44529c("Attempt to invoke reportFullyDrawn on Debug build failed.", new Object[0]);
            }
        }
    }
}
