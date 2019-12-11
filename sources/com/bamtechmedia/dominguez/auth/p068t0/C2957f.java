package com.bamtechmedia.dominguez.auth.p068t0;

import android.app.Activity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.widget.NestedScrollView;
import androidx.fragment.app.C0532d;
import androidx.fragment.app.C0538i;
import com.bamtechmedia.dominguez.analytics.C2378m;
import com.bamtechmedia.dominguez.analytics.C2413n;
import com.bamtechmedia.dominguez.analytics.p057o0.C2433b;
import com.bamtechmedia.dominguez.auth.C2716h0;
import com.bamtechmedia.dominguez.auth.C2718i0;
import com.bamtechmedia.dominguez.auth.C2721j0;
import com.bamtechmedia.dominguez.auth.p061o0.p063i.C2755d;
import com.bamtechmedia.dominguez.auth.p068t0.C2968h.C2969a;
import com.bamtechmedia.dominguez.core.C3796d;
import com.bamtechmedia.dominguez.core.design.widgets.DisneyTitleToolbar;
import com.bamtechmedia.dominguez.core.design.widgets.LoadingButton;
import com.bamtechmedia.dominguez.core.design.widgets.OnboardingToolbar;
import com.bamtechmedia.dominguez.core.design.widgets.textinputlayout.C5704a;
import com.bamtechmedia.dominguez.core.design.widgets.textinputlayout.PasswordInputLayout;
import com.bamtechmedia.dominguez.core.framework.C5755i;
import com.bamtechmedia.dominguez.core.utils.C5843l;
import com.bamtechmedia.dominguez.core.utils.C5880u;
import java.util.HashMap;
import kotlin.C13145v;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12880j;
import kotlin.jvm.internal.C12881k;
import p163g.p201e.p203b.p307o.p308p.C7629c;
import p512h.p513c.p514k.C11890i;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u0005¢\u0006\u0002\u0010\u0003J\b\u0010/\u001a\u000200H\u0002J\u0010\u00101\u001a\u0002002\u0006\u00102\u001a\u00020\rH\u0002J\r\u00103\u001a\u000200H\u0001¢\u0006\u0002\b4J\b\u00105\u001a\u000206H\u0016J&\u00107\u001a\u0004\u0018\u0001082\u0006\u00109\u001a\u00020:2\b\u0010;\u001a\u0004\u0018\u00010<2\b\u0010=\u001a\u0004\u0018\u00010>H\u0016J\b\u0010?\u001a\u000200H\u0016J\b\u0010@\u001a\u000200H\u0016J\u001a\u0010A\u001a\u0002002\u0006\u0010B\u001a\u0002082\b\u0010=\u001a\u0004\u0018\u00010>H\u0016J\u0010\u0010C\u001a\u0002002\u0006\u0010D\u001a\u00020EH\u0002R\u001e\u0010\u0004\u001a\u00020\u00058\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u0010\u0010\n\u001a\u0004\u0018\u00010\u000bX\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\u00020\r8BX\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\u000eR\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u000e¢\u0006\u0002\n\u0000R\u001e\u0010\u0011\u001a\u00020\u00128\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u001e\u0010\u0017\u001a\u00020\u00188\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\u001e\u0010\u001d\u001a\u00020\u001e8\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R\u0014\u0010#\u001a\u00020$8BX\u0004¢\u0006\u0006\u001a\u0004\b%\u0010&R\u0010\u0010'\u001a\u0004\u0018\u00010(X\u000e¢\u0006\u0002\n\u0000R\u001e\u0010)\u001a\u00020*8\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b+\u0010,\"\u0004\b-\u0010.¨\u0006F"}, mo31007d2 = {"Lcom/bamtechmedia/dominguez/auth/password/LoginPasswordFragment;", "Ldagger/android/support/DaggerFragment;", "Lcom/bamtechmedia/dominguez/analytics/AnalyticsStateProvider;", "()V", "analytics", "Lcom/bamtechmedia/dominguez/auth/password/LoginPasswordAnalytics;", "getAnalytics", "()Lcom/bamtechmedia/dominguez/auth/password/LoginPasswordAnalytics;", "setAnalytics", "(Lcom/bamtechmedia/dominguez/auth/password/LoginPasswordAnalytics;)V", "forgotPasswordButton", "Landroid/widget/TextView;", "isOnline", "", "()Z", "loginButton", "Lcom/bamtechmedia/dominguez/core/design/widgets/LoadingButton;", "offlineRouter", "Lcom/bamtechmedia/dominguez/error/api/OfflineRouter;", "getOfflineRouter", "()Lcom/bamtechmedia/dominguez/error/api/OfflineRouter;", "setOfflineRouter", "(Lcom/bamtechmedia/dominguez/error/api/OfflineRouter;)V", "offlineState", "Lcom/bamtechmedia/dominguez/core/OfflineState;", "getOfflineState", "()Lcom/bamtechmedia/dominguez/core/OfflineState;", "setOfflineState", "(Lcom/bamtechmedia/dominguez/core/OfflineState;)V", "otpRouter", "Lcom/bamtechmedia/dominguez/auth/api/router/OtpRouter;", "getOtpRouter", "()Lcom/bamtechmedia/dominguez/auth/api/router/OtpRouter;", "setOtpRouter", "(Lcom/bamtechmedia/dominguez/auth/api/router/OtpRouter;)V", "passwordInput", "", "getPasswordInput", "()Ljava/lang/String;", "passwordInputLayout", "Lcom/bamtechmedia/dominguez/core/design/widgets/textinputlayout/PasswordInputLayout;", "viewModel", "Lcom/bamtechmedia/dominguez/auth/password/LoginPasswordViewModel;", "getViewModel", "()Lcom/bamtechmedia/dominguez/auth/password/LoginPasswordViewModel;", "setViewModel", "(Lcom/bamtechmedia/dominguez/auth/password/LoginPasswordViewModel;)V", "continueClicked", "", "enable", "enabled", "forgotPasswordClicked", "forgotPasswordClicked$auth_release", "getAnalyticsSection", "Lcom/bamtechmedia/dominguez/analytics/AnalyticsSection;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onStart", "onStop", "onViewCreated", "view", "updateViewState", "newState", "Lcom/bamtechmedia/dominguez/auth/password/LoginPasswordViewModel$State;", "auth_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* renamed from: com.bamtechmedia.dominguez.auth.t0.f */
/* compiled from: LoginPasswordFragment.kt */
public final class C2957f extends C11890i implements C2413n {

    /* renamed from: U */
    public C2968h f7781U;

    /* renamed from: V */
    public C2951b f7782V;

    /* renamed from: W */
    public C7629c f7783W;

    /* renamed from: X */
    public C2755d f7784X;

    /* renamed from: Y */
    public C3796d f7785Y;
    /* access modifiers changed from: private */

    /* renamed from: Z */
    public PasswordInputLayout f7786Z;

    /* renamed from: a0 */
    private LoadingButton f7787a0;

    /* renamed from: b0 */
    private TextView f7788b0;

    /* renamed from: c0 */
    private HashMap f7789c0;

    /* renamed from: com.bamtechmedia.dominguez.auth.t0.f$a */
    /* compiled from: LoginPasswordFragment.kt */
    static final class C2958a extends C12881k implements Function0<C13145v> {

        /* renamed from: c */
        final /* synthetic */ C2957f f7790c;

        C2958a(C2957f fVar) {
            this.f7790c = fVar;
            super(0);
        }

        public final void invoke() {
            this.f7790c.mo11959p().mo11949a();
            NestedScrollView nestedScrollView = (NestedScrollView) this.f7790c._$_findCachedViewById(C2716h0.passwordScrollView);
            if (nestedScrollView != null) {
                C5843l.f13627a.mo17743a(nestedScrollView);
            }
            this.f7790c.requireActivity().onBackPressed();
        }
    }

    /* renamed from: com.bamtechmedia.dominguez.auth.t0.f$b */
    /* compiled from: LoginPasswordFragment.kt */
    static final class C2959b extends C12881k implements Function1<C2969a, C13145v> {

        /* renamed from: c */
        final /* synthetic */ C2957f f7791c;

        C2959b(C2957f fVar) {
            this.f7791c = fVar;
            super(1);
        }

        /* renamed from: a */
        public final void mo11960a(C2969a aVar) {
            this.f7791c.m10730a(aVar);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo11960a((C2969a) obj);
            return C13145v.f29587a;
        }
    }

    /* renamed from: com.bamtechmedia.dominguez.auth.t0.f$c */
    /* compiled from: LoginPasswordFragment.kt */
    static final class C2960c implements OnClickListener {

        /* renamed from: c */
        final /* synthetic */ C2957f f7792c;

        C2960c(C2957f fVar) {
            this.f7792c = fVar;
        }

        public final void onClick(View view) {
            this.f7792c.m10733q();
        }
    }

    /* renamed from: com.bamtechmedia.dominguez.auth.t0.f$d */
    /* compiled from: LoginPasswordFragment.kt */
    static final class C2961d implements OnClickListener {

        /* renamed from: c */
        final /* synthetic */ C2957f f7793c;

        C2961d(C2957f fVar) {
            this.f7793c = fVar;
        }

        public final void onClick(View view) {
            this.f7793c.mo11958o();
        }
    }

    /* renamed from: com.bamtechmedia.dominguez.auth.t0.f$e */
    /* compiled from: LoginPasswordFragment.kt */
    static final class C2962e extends C12881k implements Function1<String, C13145v> {

        /* renamed from: c */
        final /* synthetic */ C2957f f7794c;

        C2962e(C2957f fVar) {
            this.f7794c = fVar;
            super(1);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((String) obj);
            return C13145v.f29587a;
        }

        public final void invoke(String str) {
            this.f7794c.m10733q();
        }
    }

    /* renamed from: com.bamtechmedia.dominguez.auth.t0.f$f */
    /* compiled from: LoginPasswordFragment.kt */
    static final class C2963f extends C12881k implements Function1<String, C13145v> {

        /* renamed from: c */
        final /* synthetic */ C2957f f7795c;

        C2963f(C2957f fVar) {
            this.f7795c = fVar;
            super(1);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((String) obj);
            return C13145v.f29587a;
        }

        public final void invoke(String str) {
            this.f7795c.getViewModel().mo11968c(str);
        }
    }

    /* renamed from: com.bamtechmedia.dominguez.auth.t0.f$g */
    /* compiled from: LoginPasswordFragment.kt */
    static final class C2964g extends C12881k implements Function0<C13145v> {

        /* renamed from: c */
        final /* synthetic */ C2957f f7796c;

        C2964g(C2957f fVar) {
            this.f7796c = fVar;
            super(0);
        }

        public final void invoke() {
            this.f7796c.mo11959p().mo11954e();
        }
    }

    /* renamed from: com.bamtechmedia.dominguez.auth.t0.f$h */
    /* compiled from: LoginPasswordFragment.kt */
    static final class C2965h extends C12881k implements Function1<C2969a, C13145v> {

        /* renamed from: c */
        final /* synthetic */ C2957f f7797c;

        C2965h(C2957f fVar) {
            this.f7797c = fVar;
            super(1);
        }

        /* renamed from: a */
        public final void mo11965a(C2969a aVar) {
            PasswordInputLayout b = this.f7797c.f7786Z;
            if (b != null) {
                b.mo2144c();
            }
            if (aVar.mo11970a()) {
                String b2 = aVar.mo11971b();
                if (b2 == null) {
                    b2 = C5880u.m18936a(C2721j0.log_in_pwd_error_none);
                }
                this.f7797c.mo11959p().mo11950a(b2);
                PasswordInputLayout b3 = this.f7797c.f7786Z;
                if (b3 != null) {
                    b3.mo17574a(b2);
                }
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo11965a((C2969a) obj);
            return C13145v.f29587a;
        }
    }

    /* renamed from: com.bamtechmedia.dominguez.auth.t0.f$i */
    /* compiled from: LoginPasswordFragment.kt */
    static final class C2966i extends C12881k implements Function1<C2969a, C13145v> {

        /* renamed from: c */
        final /* synthetic */ C2957f f7798c;

        C2966i(C2957f fVar) {
            this.f7798c = fVar;
            super(1);
        }

        /* renamed from: a */
        public final void mo11966a(C2969a aVar) {
            if (aVar.mo11972c()) {
                this.f7798c.m10732b(false);
                C0532d requireActivity = this.f7798c.requireActivity();
                if (!(requireActivity instanceof Activity)) {
                    requireActivity = null;
                }
                if (requireActivity != null) {
                    View currentFocus = requireActivity.getCurrentFocus();
                    if (currentFocus != null) {
                        C5843l.f13627a.mo17743a(currentFocus);
                        return;
                    }
                    return;
                }
                return;
            }
            this.f7798c.m10732b(true);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo11966a((C2969a) obj);
            return C13145v.f29587a;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: q */
    public final void m10733q() {
        C2951b bVar = this.f7782V;
        if (bVar != null) {
            bVar.mo11951b();
            C2968h hVar = this.f7781U;
            if (hVar != null) {
                hVar.mo11967b(m10734r());
            } else {
                C12880j.m40227c("viewModel");
                throw null;
            }
        } else {
            C12880j.m40227c("analytics");
            throw null;
        }
    }

    /* renamed from: r */
    private final String m10734r() {
        PasswordInputLayout passwordInputLayout = this.f7786Z;
        if (passwordInputLayout != null) {
            String inputTextValue = passwordInputLayout.getInputTextValue();
            if (inputTextValue != null) {
                return inputTextValue;
            }
        }
        return "";
    }

    /* renamed from: s */
    private final boolean m10735s() {
        C3796d dVar = this.f7785Y;
        if (dVar != null) {
            return dVar.mo13695j();
        }
        C12880j.m40227c("offlineState");
        throw null;
    }

    public void _$_clearFindViewByIdCache() {
        HashMap hashMap = this.f7789c0;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    public View _$_findCachedViewById(int i) {
        if (this.f7789c0 == null) {
            this.f7789c0 = new HashMap();
        }
        View view = (View) this.f7789c0.get(Integer.valueOf(i));
        if (view == null) {
            View view2 = getView();
            if (view2 == null) {
                return null;
            }
            view = view2.findViewById(i);
            this.f7789c0.put(Integer.valueOf(i), view);
        }
        return view;
    }

    /* renamed from: e */
    public C2378m mo11534e() {
        return new C2378m(C2433b.LOG_IN_ENTER_PASSWORD, (String) null, 2, (DefaultConstructorMarker) null);
    }

    public final C2968h getViewModel() {
        C2968h hVar = this.f7781U;
        if (hVar != null) {
            return hVar;
        }
        C12880j.m40227c("viewModel");
        throw null;
    }

    /* renamed from: o */
    public final void mo11958o() {
        C2951b bVar = this.f7782V;
        if (bVar != null) {
            bVar.mo11952c();
            C2755d dVar = this.f7784X;
            if (dVar != null) {
                dVar.mo11769a();
            } else {
                C12880j.m40227c("otpRouter");
                throw null;
            }
        } else {
            C12880j.m40227c("analytics");
            throw null;
        }
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(C2718i0.fragment_password, viewGroup, false);
    }

    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        _$_clearFindViewByIdCache();
    }

    public void onStart() {
        super.onStart();
        OnboardingToolbar onboardingToolbar = (OnboardingToolbar) _$_findCachedViewById(C2716h0.passwordOnboardingToolbar);
        if (onboardingToolbar != null) {
            C0532d requireActivity = requireActivity();
            C12880j.m40222a((Object) requireActivity, "requireActivity()");
            OnboardingToolbar.m18500a(onboardingToolbar, requireActivity, getView(), (NestedScrollView) _$_findCachedViewById(C2716h0.passwordScrollView), (ConstraintLayout) _$_findCachedViewById(C2716h0.passwordLayout), false, new C2958a(this), 16, null);
        }
        C2968h hVar = this.f7781U;
        if (hVar != null) {
            C5755i.m18679a(this, hVar, null, null, new C2959b(this), 6, null);
            return;
        }
        C12880j.m40227c("viewModel");
        throw null;
    }

    public void onStop() {
        OnboardingToolbar onboardingToolbar = (OnboardingToolbar) _$_findCachedViewById(C2716h0.passwordOnboardingToolbar);
        if (onboardingToolbar != null) {
            onboardingToolbar.setToolbarSet(false);
        }
        super.onStop();
    }

    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.f7786Z = (PasswordInputLayout) view.findViewById(C2716h0.passwordInputLayout);
        this.f7787a0 = (LoadingButton) view.findViewById(C2716h0.loginButton);
        this.f7788b0 = (TextView) view.findViewById(C2716h0.forgotPasswordButton);
        LoadingButton loadingButton = this.f7787a0;
        if (loadingButton != null) {
            loadingButton.setText(C2721j0.btn_login);
        }
        LoadingButton loadingButton2 = this.f7787a0;
        if (loadingButton2 != null) {
            loadingButton2.setOnClickListener(new C2960c(this));
        }
        TextView textView = this.f7788b0;
        if (textView != null) {
            textView.setOnClickListener(new C2961d(this));
        }
        PasswordInputLayout passwordInputLayout = this.f7786Z;
        if (passwordInputLayout != null) {
            C2968h hVar = this.f7781U;
            if (hVar != null) {
                passwordInputLayout.setInputTextValue(hVar.mo11969y());
            } else {
                C12880j.m40227c("viewModel");
                throw null;
            }
        }
        PasswordInputLayout passwordInputLayout2 = this.f7786Z;
        if (passwordInputLayout2 != null) {
            C5704a.m18600a(passwordInputLayout2, new C2962e(this), new C2963f(this), C13185o.m40520c((ConstraintLayout) _$_findCachedViewById(C2716h0.passwordContainer), (ConstraintLayout) _$_findCachedViewById(C2716h0.passwordLayout)), false, 8, null);
        }
        PasswordInputLayout passwordInputLayout3 = this.f7786Z;
        if (passwordInputLayout3 != null) {
            PasswordInputLayout.m18589a(passwordInputLayout3, false, new C2964g(this), 1, null);
        }
        if (!m10735s()) {
            C7629c cVar = this.f7783W;
            if (cVar != null) {
                int i = C2716h0.passwordContainer;
                C0538i childFragmentManager = getChildFragmentManager();
                C12880j.m40222a((Object) childFragmentManager, "childFragmentManager");
                cVar.mo20550a(i, childFragmentManager);
                return;
            }
            C12880j.m40227c("offlineRouter");
            throw null;
        }
    }

    /* renamed from: p */
    public final C2951b mo11959p() {
        C2951b bVar = this.f7782V;
        if (bVar != null) {
            return bVar;
        }
        C12880j.m40227c("analytics");
        throw null;
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public final void m10732b(boolean z) {
        LoadingButton loadingButton = this.f7787a0;
        if (z) {
            if (loadingButton != null) {
                loadingButton.mo17426b();
            }
        } else if (loadingButton != null) {
            loadingButton.mo17425a();
        }
        TextView textView = this.f7788b0;
        if (textView != null) {
            textView.setEnabled(z);
        }
        OnboardingToolbar onboardingToolbar = (OnboardingToolbar) _$_findCachedViewById(C2716h0.passwordOnboardingToolbar);
        if (onboardingToolbar != null) {
            DisneyTitleToolbar disneyToolbar = onboardingToolbar.getDisneyToolbar();
            if (disneyToolbar != null) {
                disneyToolbar.mo17379b(z);
            }
        }
        PasswordInputLayout passwordInputLayout = this.f7786Z;
        if (passwordInputLayout != null) {
            passwordInputLayout.mo17570a(z);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final void m10730a(C2969a aVar) {
        C2965h hVar = new C2965h(this);
        new C2966i(this).mo11966a(aVar);
        hVar.mo11965a(aVar);
    }
}
