package p163g.p201e.p203b.p411h0;

import android.content.Context;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.motion.widget.MotionLayout;
import androidx.fragment.app.C0532d;
import androidx.fragment.app.C0538i;
import com.bamtechmedia.dominguez.analytics.C2378m;
import com.bamtechmedia.dominguez.analytics.C2413n;
import com.bamtechmedia.dominguez.analytics.p057o0.C2433b;
import com.bamtechmedia.dominguez.auth.p061o0.C2744e;
import com.bamtechmedia.dominguez.auth.p061o0.p063i.C2757f;
import com.bamtechmedia.dominguez.auth.p061o0.p063i.C2757f.C2758a;
import com.bamtechmedia.dominguez.config.C3572r0;
import com.bamtechmedia.dominguez.core.C3796d;
import com.bamtechmedia.dominguez.core.framework.C5755i;
import com.bamtechmedia.dominguez.core.p084g.C3800a;
import com.bamtechmedia.dominguez.core.utils.C5816a;
import com.bamtechmedia.dominguez.core.utils.C5837i;
import com.bamtechmedia.dominguez.core.utils.C5880u;
import java.util.HashMap;
import kotlin.C13142s;
import kotlin.C13145v;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.C12881k;
import p096e.p121h.p122j.C4025a;
import p096e.p121h.p135s.C4127b0;
import p163g.p201e.p203b.p278h.C7236b;
import p163g.p201e.p203b.p307o.p308p.C7629c;
import p163g.p201e.p203b.p319v.C7862c;
import p163g.p201e.p203b.p411h0.C10640n.C10641a;
import p163g.p509o.p510a.C11848c;
import p163g.p509o.p510a.C11863k;
import p512h.p513c.p514k.C11890i;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000Â\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 p2\u00020\u00012\u00020\u0002:\u0001pB\u0005¢\u0006\u0002\u0010\u0003J\b\u0010Q\u001a\u00020RH\u0002J\u0012\u0010S\u001a\u00020R2\b\u0010T\u001a\u0004\u0018\u00010UH\u0002J\u0010\u0010V\u001a\u00020R2\u0006\u0010W\u001a\u00020XH\u0002J\b\u0010Y\u001a\u00020ZH\u0016J\b\u0010[\u001a\u00020RH\u0002J&\u0010\\\u001a\u0004\u0018\u00010]2\u0006\u0010^\u001a\u00020_2\b\u0010`\u001a\u0004\u0018\u00010a2\b\u0010b\u001a\u0004\u0018\u00010cH\u0016J\u0010\u0010d\u001a\u00020R2\u0006\u0010e\u001a\u00020$H\u0002J\b\u0010f\u001a\u00020RH\u0016J\u001a\u0010g\u001a\u00020R2\u0006\u0010h\u001a\u00020]2\b\u0010b\u001a\u0004\u0018\u00010cH\u0016J\u0010\u0010i\u001a\u00020R2\u0006\u0010j\u001a\u00020$H\u0002J$\u0010k\u001a\u00020R*\u00020]2\u0006\u0010l\u001a\u00020m2\u000e\b\u0002\u0010n\u001a\b\u0012\u0004\u0012\u00020R0oH\u0002R$\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001e\u0010\u000b\u001a\u00020\f8\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001e\u0010\u0011\u001a\u00020\u00128\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u001e\u0010\u0017\u001a\u00020\u00188\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\u001e\u0010\u001d\u001a\u00020\u001e8\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R\u0014\u0010#\u001a\u00020$8BX\u0004¢\u0006\u0006\u001a\u0004\b#\u0010%R\u001e\u0010&\u001a\u00020'8\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b(\u0010)\"\u0004\b*\u0010+R\u001e\u0010,\u001a\u00020-8\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b.\u0010/\"\u0004\b0\u00101R\u001e\u00102\u001a\u0002038\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b4\u00105\"\u0004\b6\u00107R\u001e\u00108\u001a\u0002098\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b:\u0010;\"\u0004\b<\u0010=R\u001e\u0010>\u001a\u00020?8\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b@\u0010A\"\u0004\bB\u0010CR\u000e\u0010D\u001a\u00020$X\u000e¢\u0006\u0002\n\u0000R\u001e\u0010E\u001a\u00020F8\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\bG\u0010H\"\u0004\bI\u0010JR\u001e\u0010K\u001a\u00020L8\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\bM\u0010N\"\u0004\bO\u0010P¨\u0006q"}, mo31007d2 = {"Lcom/bamtechmedia/dominguez/welcome/WelcomeFragment;", "Ldagger/android/support/DaggerFragment;", "Lcom/bamtechmedia/dominguez/analytics/AnalyticsStateProvider;", "()V", "adapter", "Lcom/xwray/groupie/GroupAdapter;", "Lcom/xwray/groupie/ViewHolder;", "getAdapter", "()Lcom/xwray/groupie/GroupAdapter;", "setAdapter", "(Lcom/xwray/groupie/GroupAdapter;)V", "analytics", "Lcom/bamtechmedia/dominguez/welcome/WelcomeAnalytics;", "getAnalytics", "()Lcom/bamtechmedia/dominguez/welcome/WelcomeAnalytics;", "setAnalytics", "(Lcom/bamtechmedia/dominguez/welcome/WelcomeAnalytics;)V", "ctvActivationConfig", "Lcom/bamtechmedia/dominguez/ctvactivation/CtvActivationConfig;", "getCtvActivationConfig", "()Lcom/bamtechmedia/dominguez/ctvactivation/CtvActivationConfig;", "setCtvActivationConfig", "(Lcom/bamtechmedia/dominguez/ctvactivation/CtvActivationConfig;)V", "dictionary", "Lcom/bamtechmedia/dominguez/config/StringDictionary;", "getDictionary", "()Lcom/bamtechmedia/dominguez/config/StringDictionary;", "setDictionary", "(Lcom/bamtechmedia/dominguez/config/StringDictionary;)V", "emailHolder", "Lcom/bamtechmedia/dominguez/auth/api/OnboardingEmailHolder;", "getEmailHolder", "()Lcom/bamtechmedia/dominguez/auth/api/OnboardingEmailHolder;", "setEmailHolder", "(Lcom/bamtechmedia/dominguez/auth/api/OnboardingEmailHolder;)V", "isOnline", "", "()Z", "offlineRouter", "Lcom/bamtechmedia/dominguez/error/api/OfflineRouter;", "getOfflineRouter", "()Lcom/bamtechmedia/dominguez/error/api/OfflineRouter;", "setOfflineRouter", "(Lcom/bamtechmedia/dominguez/error/api/OfflineRouter;)V", "offlineState", "Lcom/bamtechmedia/dominguez/core/OfflineState;", "getOfflineState", "()Lcom/bamtechmedia/dominguez/core/OfflineState;", "setOfflineState", "(Lcom/bamtechmedia/dominguez/core/OfflineState;)V", "onboardingImageLoader", "Lcom/bamtechmedia/dominguez/paywall/OnboardingImageLoader;", "getOnboardingImageLoader", "()Lcom/bamtechmedia/dominguez/paywall/OnboardingImageLoader;", "setOnboardingImageLoader", "(Lcom/bamtechmedia/dominguez/paywall/OnboardingImageLoader;)V", "presenter", "Lcom/bamtechmedia/dominguez/welcome/WelcomePresenter;", "getPresenter", "()Lcom/bamtechmedia/dominguez/welcome/WelcomePresenter;", "setPresenter", "(Lcom/bamtechmedia/dominguez/welcome/WelcomePresenter;)V", "router", "Lcom/bamtechmedia/dominguez/auth/api/router/WelcomeRouter;", "getRouter", "()Lcom/bamtechmedia/dominguez/auth/api/router/WelcomeRouter;", "setRouter", "(Lcom/bamtechmedia/dominguez/auth/api/router/WelcomeRouter;)V", "translateLogo", "viewModel", "Lcom/bamtechmedia/dominguez/welcome/WelcomeViewModel;", "getViewModel", "()Lcom/bamtechmedia/dominguez/welcome/WelcomeViewModel;", "setViewModel", "(Lcom/bamtechmedia/dominguez/welcome/WelcomeViewModel;)V", "welcomeAccessibility", "Lcom/bamtechmedia/dominguez/welcome/WelcomeAccessibility;", "getWelcomeAccessibility", "()Lcom/bamtechmedia/dominguez/welcome/WelcomeAccessibility;", "setWelcomeAccessibility", "(Lcom/bamtechmedia/dominguez/welcome/WelcomeAccessibility;)V", "animateWelcomeScreen", "", "displayNoSubscribeAvailable", "paywallHash", "", "displayProduct", "state", "Lcom/bamtechmedia/dominguez/welcome/WelcomeViewModel$State;", "getAnalyticsSection", "Lcom/bamtechmedia/dominguez/analytics/AnalyticsSection;", "initView", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onLoginClick", "canSignUp", "onStart", "onViewCreated", "view", "showOfflineIfNecessary", "isOffline", "welcomeAnimate", "delay", "", "withEndAction", "Lkotlin/Function0;", "Companion", "welcome_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* renamed from: g.e.b.h0.k */
/* compiled from: WelcomeFragment.kt */
public final class C10629k extends C11890i implements C2413n {

    /* renamed from: U */
    public C10640n f25082U;

    /* renamed from: V */
    public C11848c<C11863k> f25083V;

    /* renamed from: W */
    public C7629c f25084W;

    /* renamed from: X */
    public C2757f f25085X;

    /* renamed from: Y */
    public C2744e f25086Y;

    /* renamed from: Z */
    public C10623g f25087Z;

    /* renamed from: a0 */
    public C7236b f25088a0;

    /* renamed from: b0 */
    public C3796d f25089b0;

    /* renamed from: c0 */
    public C7862c f25090c0;

    /* renamed from: d0 */
    public C3572r0 f25091d0;

    /* renamed from: e0 */
    public C10622f f25092e0;

    /* renamed from: f0 */
    public C10638m f25093f0;

    /* renamed from: g0 */
    private boolean f25094g0 = true;

    /* renamed from: h0 */
    private HashMap f25095h0;

    /* renamed from: g.e.b.h0.k$a */
    /* compiled from: WelcomeFragment.kt */
    public static final class C10630a {
        private C10630a() {
        }

        public /* synthetic */ C10630a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: g.e.b.h0.k$b */
    /* compiled from: WelcomeFragment.kt */
    static final class C10631b extends C12881k implements Function0<C13145v> {

        /* renamed from: c */
        final /* synthetic */ C10629k f25096c;

        C10631b(C10629k kVar) {
            this.f25096c = kVar;
            super(0);
        }

        public final void invoke() {
            Button button = (Button) this.f25096c._$_findCachedViewById(C10619c.welcomeButtonSignUp);
            if (button != null) {
                button.requestFocus();
            }
        }
    }

    /* renamed from: g.e.b.h0.k$c */
    /* compiled from: WelcomeFragment.kt */
    static final class C10632c implements OnClickListener {

        /* renamed from: c */
        final /* synthetic */ C10629k f25097c;

        C10632c(C10629k kVar) {
            this.f25097c = kVar;
        }

        public final void onClick(View view) {
            this.f25097c.m33359b(false);
        }
    }

    /* renamed from: g.e.b.h0.k$d */
    /* compiled from: WelcomeFragment.kt */
    static final class C10633d implements OnClickListener {

        /* renamed from: c */
        final /* synthetic */ C10629k f25098c;

        C10633d(C10629k kVar) {
            this.f25098c = kVar;
        }

        public final void onClick(View view) {
            this.f25098c.mo27487o().mo27484b();
            this.f25098c.mo27488p().mo11754q();
            C2758a.m10407a(this.f25098c.mo27490r(), true, false, false, 6, null);
        }
    }

    /* renamed from: g.e.b.h0.k$e */
    /* compiled from: WelcomeFragment.kt */
    static final class C10634e implements OnClickListener {

        /* renamed from: c */
        final /* synthetic */ C10629k f25099c;

        C10634e(C10629k kVar) {
            this.f25099c = kVar;
        }

        public final void onClick(View view) {
            this.f25099c.m33359b(true);
        }
    }

    /* renamed from: g.e.b.h0.k$f */
    /* compiled from: WelcomeFragment.kt */
    static final class C10635f extends C12881k implements Function1<C10641a, C13145v> {

        /* renamed from: c */
        final /* synthetic */ C10629k f25100c;

        C10635f(C10629k kVar) {
            this.f25100c = kVar;
            super(1);
        }

        /* renamed from: a */
        public final void mo27494a(C10641a aVar) {
            this.f25100c.m33360c(aVar.mo27502a());
            TextView textView = (TextView) this.f25100c._$_findCachedViewById(C10619c.welcomeDescriptionMain);
            Intrinsics.checkReturnedValueIsNotNull((Object) textView, "welcomeDescriptionMain");
            textView.setText(C10638m.m33386a(this.f25100c.mo27489q(), "welcome_tagline_copy", aVar.mo27503b(), null, 4, null));
            if (aVar.mo27504c() == null) {
                this.f25100c.m33361e(aVar.mo27503b());
            } else {
                this.f25100c.m33357a(aVar);
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo27494a((C10641a) obj);
            return C13145v.f29587a;
        }
    }

    /* renamed from: g.e.b.h0.k$g */
    /* compiled from: WelcomeFragment.kt */
    static final class C10636g extends C12881k implements Function0<C13145v> {

        /* renamed from: c */
        public static final C10636g f25101c = new C10636g();

        C10636g() {
            super(0);
        }

        public final void invoke() {
        }
    }

    static {
        new C10630a(null);
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public final void m33360c(boolean z) {
        if (z) {
            C7629c cVar = this.f25084W;
            if (cVar != null) {
                int i = C10619c.welcomeContainer;
                C0538i childFragmentManager = getChildFragmentManager();
                Intrinsics.checkReturnedValueIsNotNull((Object) childFragmentManager, "childFragmentManager");
                cVar.mo20550a(i, childFragmentManager);
                return;
            }
            Intrinsics.throwUninitializedPropertyAccessException("offlineRouter");
            throw null;
        }
    }

    /* renamed from: s */
    private final void m33362s() {
        MotionLayout motionLayout = (MotionLayout) _$_findCachedViewById(C10619c.welcomeMotionLayout);
        if (motionLayout != null) {
            if (this.f25094g0) {
                motionLayout.mo2146d();
                this.f25094g0 = false;
            } else {
                motionLayout.setProgress(1.0f);
            }
        }
        DisplayMetrics displayMetrics = new DisplayMetrics();
        C0532d requireActivity = requireActivity();
        Intrinsics.checkReturnedValueIsNotNull((Object) requireActivity, "requireActivity()");
        WindowManager windowManager = requireActivity.getWindowManager();
        Intrinsics.checkReturnedValueIsNotNull((Object) windowManager, "requireActivity().windowManager");
        windowManager.getDefaultDisplay().getMetrics(displayMetrics);
        ImageView imageView = (ImageView) _$_findCachedViewById(C10619c.welcomeBackgroundImageView);
        if (imageView != null) {
            C3800a.m12829a(imageView, 0.0f, 0.0f, 1.06f, 0.0f, Float.valueOf(0.0f), Float.valueOf(((float) displayMetrics.widthPixels) * 0.5f), 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 700, 0, null, null, null, null, 257994, null);
        }
        ImageView imageView2 = (ImageView) _$_findCachedViewById(C10619c.welcome_logo_tv);
        if (imageView2 != null) {
            C3800a.m12829a(imageView2, 0.0f, 0.0f, 0.9f, 0.0f, null, null, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 300, 0, null, null, null, null, 258043, null);
        }
        TextView textView = (TextView) _$_findCachedViewById(C10619c.welcomeDescriptionMain);
        Intrinsics.checkReturnedValueIsNotNull((Object) textView, "welcomeDescriptionMain");
        m33353a(this, textView, 0, null, 2, null);
        Button button = (Button) _$_findCachedViewById(C10619c.welcomeButtonSignUp);
        Intrinsics.checkReturnedValueIsNotNull((Object) button, "welcomeButtonSignUp");
        m33353a(this, button, 100, null, 2, null);
        TextView textView2 = (TextView) _$_findCachedViewById(C10619c.welcomeDescriptionSub1);
        Intrinsics.checkReturnedValueIsNotNull((Object) textView2, "welcomeDescriptionSub1");
        m33353a(this, textView2, 200, null, 2, null);
        ImageView imageView3 = (ImageView) _$_findCachedViewById(C10619c.welcomeBrandLogos);
        Intrinsics.checkReturnedValueIsNotNull((Object) imageView3, "welcomeBrandLogos");
        m33353a(this, imageView3, 250, null, 2, null);
        View _$_findCachedViewById = _$_findCachedViewById(C10619c.welcomeButtonLogIn);
        Intrinsics.checkReturnedValueIsNotNull((Object) _$_findCachedViewById, "welcomeButtonLogIn");
        m33352a(_$_findCachedViewById, 300, new C10631b(this));
        TextView textView3 = (TextView) _$_findCachedViewById(C10619c.ctvActivationText);
        if (textView3 != null) {
            m33353a(this, textView3, 300, null, 2, null);
        }
        ImageView imageView4 = (ImageView) _$_findCachedViewById(C10619c.welcomeCtvDeviceImage);
        if (imageView4 != null) {
            m33353a(this, imageView4, 300, null, 2, null);
        }
        TextView textView4 = (TextView) _$_findCachedViewById(C10619c.ctvActivationDescription);
        if (textView4 != null) {
            m33353a(this, textView4, 300, null, 2, null);
        }
        View _$_findCachedViewById2 = _$_findCachedViewById(C10619c.viewSeparator);
        if (_$_findCachedViewById2 != null) {
            m33353a(this, _$_findCachedViewById2, 300, null, 2, null);
        }
        C10640n nVar = this.f25082U;
        if (nVar != null) {
            nVar.mo27499d(true);
        } else {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
            throw null;
        }
    }

    /* renamed from: t */
    private final void m33363t() {
        C7862c cVar = this.f25090c0;
        String str = "onboardingImageLoader";
        if (cVar != null) {
            ImageView imageView = (ImageView) _$_findCachedViewById(C10619c.welcomeBackgroundImageView);
            Intrinsics.checkReturnedValueIsNotNull((Object) imageView, "welcomeBackgroundImageView");
            cVar.mo20783a(imageView);
            C7862c cVar2 = this.f25090c0;
            if (cVar2 != null) {
                ImageView imageView2 = (ImageView) _$_findCachedViewById(C10619c.welcomeBrandLogos);
                Intrinsics.checkReturnedValueIsNotNull((Object) imageView2, "welcomeBrandLogos");
                cVar2.mo20785b(imageView2);
                Context requireContext = requireContext();
                Intrinsics.checkReturnedValueIsNotNull((Object) requireContext, "requireContext()");
                if (C5837i.m18843e(requireContext)) {
                    C7236b bVar = this.f25088a0;
                    if (bVar == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("ctvActivationConfig");
                        throw null;
                    } else if (bVar.mo20060a()) {
                        TextView textView = (TextView) _$_findCachedViewById(C10619c.ctvActivationText);
                        if (textView != null) {
                            textView.setText(C5880u.m18936a(C10621e.f25067or));
                        }
                        TextView textView2 = (TextView) _$_findCachedViewById(C10619c.ctvActivationText);
                        if (textView2 != null) {
                            C4127b0.m14131b(textView2, true);
                        }
                        ImageView imageView3 = (ImageView) _$_findCachedViewById(C10619c.welcomeCtvDeviceImage);
                        if (imageView3 != null) {
                            C4127b0.m14131b(imageView3, true);
                        }
                        TextView textView3 = (TextView) _$_findCachedViewById(C10619c.ctvActivationDescription);
                        if (textView3 != null) {
                            textView3.setText(C5880u.m18936a(C10621e.paywall_mobile_link));
                        }
                        TextView textView4 = (TextView) _$_findCachedViewById(C10619c.ctvActivationDescription);
                        if (textView4 != null) {
                            C4127b0.m14131b(textView4, true);
                        }
                    }
                }
            } else {
                Intrinsics.throwUninitializedPropertyAccessException(str);
                throw null;
            }
        } else {
            Intrinsics.throwUninitializedPropertyAccessException(str);
            throw null;
        }
    }

    /* renamed from: u */
    private final boolean m33364u() {
        C3796d dVar = this.f25089b0;
        if (dVar != null) {
            return dVar.mo13695j();
        }
        Intrinsics.throwUninitializedPropertyAccessException("offlineState");
        throw null;
    }

    public void _$_clearFindViewByIdCache() {
        HashMap hashMap = this.f25095h0;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    public View _$_findCachedViewById(int i) {
        if (this.f25095h0 == null) {
            this.f25095h0 = new HashMap();
        }
        View view = (View) this.f25095h0.get(Integer.valueOf(i));
        if (view == null) {
            View view2 = getView();
            if (view2 == null) {
                return null;
            }
            view = view2.findViewById(i);
            this.f25095h0.put(Integer.valueOf(i), view);
        }
        return view;
    }

    /* renamed from: e */
    public C2378m mo11534e() {
        return new C2378m(C2433b.WELCOME, (String) null, 2, (DefaultConstructorMarker) null);
    }

    /* renamed from: o */
    public final C10623g mo27487o() {
        C10623g gVar = this.f25087Z;
        if (gVar != null) {
            return gVar;
        }
        Intrinsics.throwUninitializedPropertyAccessException("analytics");
        throw null;
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(C10620d.fragment_welcome, viewGroup, false);
    }

    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        _$_clearFindViewByIdCache();
    }

    public void onStart() {
        super.onStart();
        C0532d requireActivity = requireActivity();
        Intrinsics.checkReturnedValueIsNotNull((Object) requireActivity, "requireActivity()");
        C5816a.m18808a(requireActivity);
        C10640n nVar = this.f25082U;
        if (nVar != null) {
            nVar.mo27501z();
        } else {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
            throw null;
        }
    }

    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        C0532d requireActivity = requireActivity();
        Intrinsics.checkReturnedValueIsNotNull((Object) requireActivity, "requireActivity()");
        Window window = requireActivity.getWindow();
        Intrinsics.checkReturnedValueIsNotNull((Object) window, "requireActivity().window");
        window.setNavigationBarColor(C4025a.m13788a(requireContext(), C10618b.vader_grey2));
        m33360c(!m33364u());
        C10640n nVar = this.f25082U;
        String str = "viewModel";
        if (nVar != null) {
            C5755i.m18679a(this, nVar, null, null, new C10635f(this), 6, null);
            m33363t();
            if (m33364u()) {
                C10640n nVar2 = this.f25082U;
                if (nVar2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException(str);
                    throw null;
                } else if (!nVar2.mo27500y()) {
                    m33362s();
                    return;
                }
            }
            if (m33364u()) {
                MotionLayout motionLayout = (MotionLayout) _$_findCachedViewById(C10619c.welcomeMotionLayout);
                if (motionLayout != null) {
                    motionLayout.setProgress(1.0f);
                    return;
                }
                return;
            }
            return;
        }
        Intrinsics.throwUninitializedPropertyAccessException(str);
        throw null;
    }

    /* renamed from: p */
    public final C2744e mo27488p() {
        C2744e eVar = this.f25086Y;
        if (eVar != null) {
            return eVar;
        }
        Intrinsics.throwUninitializedPropertyAccessException("emailHolder");
        throw null;
    }

    /* renamed from: q */
    public final C10638m mo27489q() {
        C10638m mVar = this.f25093f0;
        if (mVar != null) {
            return mVar;
        }
        Intrinsics.throwUninitializedPropertyAccessException("presenter");
        throw null;
    }

    /* renamed from: r */
    public final C2757f mo27490r() {
        C2757f fVar = this.f25085X;
        if (fVar != null) {
            return fVar;
        }
        Intrinsics.throwUninitializedPropertyAccessException("router");
        throw null;
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public final void m33359b(boolean z) {
        C10623g gVar = this.f25087Z;
        if (gVar != null) {
            gVar.mo27483a();
            C2744e eVar = this.f25086Y;
            if (eVar != null) {
                eVar.mo11754q();
                C2757f fVar = this.f25085X;
                if (fVar != null) {
                    C2758a.m10407a(fVar, false, z, false, 4, null);
                } else {
                    Intrinsics.throwUninitializedPropertyAccessException("router");
                    throw null;
                }
            } else {
                Intrinsics.throwUninitializedPropertyAccessException("emailHolder");
                throw null;
            }
        } else {
            Intrinsics.throwUninitializedPropertyAccessException("analytics");
            throw null;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: e */
    public final void m33361e(String str) {
        Button button = (Button) _$_findCachedViewById(C10619c.welcomeButtonSignUp);
        Intrinsics.checkReturnedValueIsNotNull((Object) button, "welcomeButtonSignUp");
        C10638m mVar = this.f25093f0;
        String str2 = "presenter";
        if (mVar != null) {
            button.setText(C10638m.m33386a(mVar, "btn_login", str, null, 4, null));
            ((Button) _$_findCachedViewById(C10619c.welcomeButtonSignUp)).setOnClickListener(new C10632c(this));
            View _$_findCachedViewById = _$_findCachedViewById(C10619c.welcomeButtonLogIn);
            Intrinsics.checkReturnedValueIsNotNull((Object) _$_findCachedViewById, "welcomeButtonLogIn");
            _$_findCachedViewById.setVisibility(8);
            View _$_findCachedViewById2 = _$_findCachedViewById(C10619c.viewSeparator);
            if (_$_findCachedViewById2 != null) {
                C4127b0.m14131b(_$_findCachedViewById2, false);
            }
            TextView textView = (TextView) _$_findCachedViewById(C10619c.ctvActivationText);
            if (textView != null) {
                C4127b0.m14131b(textView, false);
            }
            TextView textView2 = (TextView) _$_findCachedViewById(C10619c.welcomeDescriptionSub1);
            Intrinsics.checkReturnedValueIsNotNull((Object) textView2, "welcomeDescriptionSub1");
            C10638m mVar2 = this.f25093f0;
            if (mVar2 != null) {
                textView2.setText(mVar2.mo27496a(str));
            } else {
                Intrinsics.throwUninitializedPropertyAccessException(str2);
                throw null;
            }
        } else {
            Intrinsics.throwUninitializedPropertyAccessException(str2);
            throw null;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final void m33357a(C10641a aVar) {
        Button button = (Button) _$_findCachedViewById(C10619c.welcomeButtonSignUp);
        String str = "welcomeButtonSignUp";
        Intrinsics.checkReturnedValueIsNotNull((Object) button, str);
        C10638m mVar = this.f25093f0;
        String str2 = "presenter";
        if (mVar != null) {
            button.setText(C10638m.m33386a(mVar, "btn_welcome_signup_cta", aVar.mo27503b(), null, 4, null));
            View _$_findCachedViewById = _$_findCachedViewById(C10619c.welcomeButtonLogIn);
            if (!(_$_findCachedViewById instanceof Button)) {
                _$_findCachedViewById = null;
            }
            TextView textView = (Button) _$_findCachedViewById;
            if (textView == null) {
                View _$_findCachedViewById2 = _$_findCachedViewById(C10619c.welcomeButtonLogIn);
                if (_$_findCachedViewById2 != null) {
                    textView = (TextView) _$_findCachedViewById2;
                } else {
                    throw new C13142s("null cannot be cast to non-null type android.widget.TextView");
                }
            }
            C10638m mVar2 = this.f25093f0;
            if (mVar2 != null) {
                textView.setText(C10638m.m33386a(mVar2, "btn_login", aVar.mo27503b(), null, 4, null));
                TextView textView2 = (TextView) _$_findCachedViewById(C10619c.welcomeDescriptionSub1);
                String str3 = "welcomeDescriptionSub1";
                Intrinsics.checkReturnedValueIsNotNull((Object) textView2, str3);
                C10638m mVar3 = this.f25093f0;
                if (mVar3 != null) {
                    textView2.setText(mVar3.mo27495a(aVar));
                    TextView textView3 = (TextView) _$_findCachedViewById(C10619c.welcomeDescriptionSub1);
                    Intrinsics.checkReturnedValueIsNotNull((Object) textView3, str3);
                    textView3.setVisibility(0);
                    Button button2 = (Button) _$_findCachedViewById(C10619c.welcomeButtonSignUp);
                    Intrinsics.checkReturnedValueIsNotNull((Object) button2, str);
                    C10622f fVar = this.f25092e0;
                    if (fVar != null) {
                        button2.setContentDescription(fVar.mo27482a());
                        ((Button) _$_findCachedViewById(C10619c.welcomeButtonSignUp)).setOnClickListener(new C10633d(this));
                        _$_findCachedViewById(C10619c.welcomeButtonLogIn).setOnClickListener(new C10634e(this));
                        return;
                    }
                    Intrinsics.throwUninitializedPropertyAccessException("welcomeAccessibility");
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

    /* renamed from: a */
    static /* synthetic */ void m33353a(C10629k kVar, View view, long j, Function0 function0, int i, Object obj) {
        if ((i & 2) != 0) {
            function0 = C10636g.f25101c;
        }
        kVar.m33352a(view, j, function0);
    }

    /* renamed from: a */
    private final void m33352a(View view, long j, Function0<C13145v> function0) {
        Context requireContext = requireContext();
        Intrinsics.checkReturnedValueIsNotNull((Object) requireContext, "requireContext()");
        C3800a.m12829a(view, 0.0f, 0.0f, 0.0f, 0.0f, null, null, 10.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 300, j + (C5837i.m18843e(requireContext) ? 200 : 0), null, null, function0, null, 184254, null);
    }
}
