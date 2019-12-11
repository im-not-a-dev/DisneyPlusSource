package com.bamtechmedia.dominguez.auth.p069u0;

import android.app.Activity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.widget.NestedScrollView;
import androidx.fragment.app.C0532d;
import com.bamtechmedia.dominguez.analytics.C2413n;
import com.bamtechmedia.dominguez.auth.C2716h0;
import com.bamtechmedia.dominguez.auth.C2718i0;
import com.bamtechmedia.dominguez.auth.C2721j0;
import com.bamtechmedia.dominguez.auth.p061o0.p062h.C2749b;
import com.bamtechmedia.dominguez.auth.p067s0.C2887n;
import com.bamtechmedia.dominguez.auth.p069u0.C3017j.C3018a;
import com.bamtechmedia.dominguez.core.design.widgets.DisneyTitleToolbar;
import com.bamtechmedia.dominguez.core.design.widgets.LoadingButton;
import com.bamtechmedia.dominguez.core.design.widgets.OnboardingToolbar;
import com.bamtechmedia.dominguez.core.design.widgets.textinputlayout.C5704a;
import com.bamtechmedia.dominguez.core.design.widgets.textinputlayout.PasswordInputLayout;
import com.bamtechmedia.dominguez.core.framework.C5755i;
import com.bamtechmedia.dominguez.core.utils.C5843l;
import com.bamtechmedia.dominguez.core.utils.C5880u;
import kotlin.C13145v;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.C12881k;
import p512h.p513c.p514k.C11890i;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b&\u0018\u00002\u00020\u00012\u00020\u0002B\u0005¢\u0006\u0002\u0010\u0003J\r\u0010 \u001a\u00020!H\u0000¢\u0006\u0002\b\"J\u0010\u0010#\u001a\u00020!2\u0006\u0010$\u001a\u00020%H\u0016J$\u0010&\u001a\u00020'2\u0006\u0010(\u001a\u00020)2\b\u0010*\u001a\u0004\u0018\u00010+2\b\u0010,\u001a\u0004\u0018\u00010-H\u0016J\b\u0010.\u001a\u00020!H\u0016J\b\u0010/\u001a\u00020!H\u0016J\u001a\u00100\u001a\u00020!2\u0006\u00101\u001a\u00020'2\b\u0010,\u001a\u0004\u0018\u00010-H\u0016J\b\u00102\u001a\u00020!H\u0002J\u0010\u00103\u001a\u00020!2\u0006\u0010$\u001a\u00020%H\u0002R\u001e\u0010\u0004\u001a\u00020\u00058\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001c\u0010\n\u001a\u0004\u0018\u00010\u000bX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0010\u001a\u00020\u00118BX\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013R\u001c\u0010\u0014\u001a\u0004\u0018\u00010\u0015X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\u001e\u0010\u001a\u001a\u00020\u001b8\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001f¨\u00064"}, mo31007d2 = {"Lcom/bamtechmedia/dominguez/auth/reset/PasswordResetFragment;", "Ldagger/android/support/DaggerFragment;", "Lcom/bamtechmedia/dominguez/analytics/AnalyticsStateProvider;", "()V", "analytics", "Lcom/bamtechmedia/dominguez/auth/otp/OtpAnalytics;", "getAnalytics", "()Lcom/bamtechmedia/dominguez/auth/otp/OtpAnalytics;", "setAnalytics", "(Lcom/bamtechmedia/dominguez/auth/otp/OtpAnalytics;)V", "loginButton", "Lcom/bamtechmedia/dominguez/core/design/widgets/LoadingButton;", "getLoginButton", "()Lcom/bamtechmedia/dominguez/core/design/widgets/LoadingButton;", "setLoginButton", "(Lcom/bamtechmedia/dominguez/core/design/widgets/LoadingButton;)V", "passwordInput", "", "getPasswordInput", "()Ljava/lang/String;", "passwordInputLayout", "Lcom/bamtechmedia/dominguez/core/design/widgets/textinputlayout/PasswordInputLayout;", "getPasswordInputLayout", "()Lcom/bamtechmedia/dominguez/core/design/widgets/textinputlayout/PasswordInputLayout;", "setPasswordInputLayout", "(Lcom/bamtechmedia/dominguez/core/design/widgets/textinputlayout/PasswordInputLayout;)V", "viewModel", "Lcom/bamtechmedia/dominguez/auth/reset/PasswordResetViewModel;", "getViewModel", "()Lcom/bamtechmedia/dominguez/auth/reset/PasswordResetViewModel;", "setViewModel", "(Lcom/bamtechmedia/dominguez/auth/reset/PasswordResetViewModel;)V", "continueClicked", "", "continueClicked$auth_release", "handleSuccessState", "newState", "Lcom/bamtechmedia/dominguez/auth/reset/PasswordResetViewModel$State;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onStart", "onStop", "onViewCreated", "view", "setupViews", "updateViewState", "auth_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* renamed from: com.bamtechmedia.dominguez.auth.u0.g */
/* compiled from: PasswordResetFragment.kt */
public abstract class C3004g extends C11890i implements C2413n {

    /* renamed from: U */
    public C3017j f7849U;

    /* renamed from: V */
    public C2887n f7850V;

    /* renamed from: W */
    private LoadingButton f7851W;

    /* renamed from: X */
    private PasswordInputLayout f7852X;

    /* renamed from: com.bamtechmedia.dominguez.auth.u0.g$a */
    /* compiled from: PasswordResetFragment.kt */
    static final class C3005a extends C12881k implements Function0<C13145v> {

        /* renamed from: c */
        public static final C3005a f7853c = new C3005a();

        C3005a() {
            super(0);
        }

        public final void invoke() {
        }
    }

    /* renamed from: com.bamtechmedia.dominguez.auth.u0.g$b */
    /* compiled from: PasswordResetFragment.kt */
    static final class C3006b extends C12881k implements Function1<C3018a, C13145v> {

        /* renamed from: c */
        final /* synthetic */ C3004g f7854c;

        C3006b(C3004g gVar) {
            this.f7854c = gVar;
            super(1);
        }

        /* renamed from: a */
        public final void mo12012a(C3018a aVar) {
            this.f7854c.m10795b(aVar);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo12012a((C3018a) obj);
            return C13145v.f29587a;
        }
    }

    /* renamed from: com.bamtechmedia.dominguez.auth.u0.g$c */
    /* compiled from: PasswordResetFragment.kt */
    static final class C3007c extends C12881k implements Function0<C13145v> {

        /* renamed from: c */
        final /* synthetic */ C3004g f7855c;

        C3007c(C3004g gVar) {
            this.f7855c = gVar;
            super(0);
        }

        public final void invoke() {
            this.f7855c.requireActivity().onBackPressed();
        }
    }

    /* renamed from: com.bamtechmedia.dominguez.auth.u0.g$d */
    /* compiled from: PasswordResetFragment.kt */
    static final class C3008d implements OnClickListener {

        /* renamed from: c */
        final /* synthetic */ C3004g f7856c;

        C3008d(C3004g gVar) {
            this.f7856c = gVar;
        }

        public final void onClick(View view) {
            this.f7856c.mo12008o();
        }
    }

    /* renamed from: com.bamtechmedia.dominguez.auth.u0.g$e */
    /* compiled from: PasswordResetFragment.kt */
    static final class C3009e extends C12881k implements Function1<String, C13145v> {

        /* renamed from: c */
        final /* synthetic */ C3004g f7857c;

        C3009e(C3004g gVar) {
            this.f7857c = gVar;
            super(1);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((String) obj);
            return C13145v.f29587a;
        }

        public final void invoke(String str) {
            this.f7857c.mo12008o();
        }
    }

    /* renamed from: com.bamtechmedia.dominguez.auth.u0.g$f */
    /* compiled from: PasswordResetFragment.kt */
    static final class C3010f extends C12881k implements Function1<String, C13145v> {

        /* renamed from: c */
        final /* synthetic */ C3004g f7858c;

        C3010f(C3004g gVar) {
            this.f7858c = gVar;
            super(1);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((String) obj);
            return C13145v.f29587a;
        }

        public final void invoke(String str) {
            this.f7858c.getViewModel().mo12020c(str);
        }
    }

    /* renamed from: com.bamtechmedia.dominguez.auth.u0.g$g */
    /* compiled from: PasswordResetFragment.kt */
    static final class C3011g extends C12881k implements Function0<C13145v> {

        /* renamed from: c */
        final /* synthetic */ C3004g f7859c;

        C3011g(C3004g gVar) {
            this.f7859c = gVar;
            super(0);
        }

        public final void invoke() {
            this.f7859c.mo12009p().mo11880d();
        }
    }

    /* renamed from: com.bamtechmedia.dominguez.auth.u0.g$h */
    /* compiled from: PasswordResetFragment.kt */
    static final class C3012h extends C12881k implements Function1<Boolean, C13145v> {

        /* renamed from: c */
        final /* synthetic */ C3004g f7860c;

        C3012h(C3004g gVar) {
            this.f7860c = gVar;
            super(1);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke(((Boolean) obj).booleanValue());
            return C13145v.f29587a;
        }

        public final void invoke(boolean z) {
            if (z) {
                LoadingButton q = this.f7860c.mo12010q();
                if (q != null) {
                    q.mo17425a();
                }
                C0532d requireActivity = this.f7860c.requireActivity();
                if (!(requireActivity instanceof Activity)) {
                    requireActivity = null;
                }
                if (requireActivity != null) {
                    View currentFocus = requireActivity.getCurrentFocus();
                    if (currentFocus != null) {
                        C5843l.f13627a.mo17743a(currentFocus);
                    }
                }
            } else {
                LoadingButton q2 = this.f7860c.mo12010q();
                if (q2 != null) {
                    q2.mo17426b();
                }
            }
            PasswordInputLayout r = this.f7860c.mo12011r();
            if (r != null) {
                r.mo17570a(!z);
            }
            OnboardingToolbar onboardingToolbar = (OnboardingToolbar) this.f7860c._$_findCachedViewById(C2716h0.resetPwdOnboardingToolbar);
            if (onboardingToolbar != null) {
                DisneyTitleToolbar disneyToolbar = onboardingToolbar.getDisneyToolbar();
                if (disneyToolbar != null) {
                    disneyToolbar.mo17378a(!z);
                }
            }
        }
    }

    /* renamed from: com.bamtechmedia.dominguez.auth.u0.g$i */
    /* compiled from: PasswordResetFragment.kt */
    static final class C3013i extends C12881k implements Function1<C3018a, C13145v> {

        /* renamed from: c */
        final /* synthetic */ C3004g f7861c;

        C3013i(C3004g gVar) {
            this.f7861c = gVar;
            super(1);
        }

        /* renamed from: a */
        public final void mo12017a(C3018a aVar) {
            C2749b c = aVar.mo12025c();
            if (c != null) {
                PasswordInputLayout r = this.f7861c.mo12011r();
                if (r != null) {
                    r.mo17569a(Integer.valueOf(c.mo11756a()), Integer.valueOf(c.mo11757b()), c.mo11758c());
                }
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo12017a((C3018a) obj);
            return C13145v.f29587a;
        }
    }

    /* renamed from: com.bamtechmedia.dominguez.auth.u0.g$j */
    /* compiled from: PasswordResetFragment.kt */
    static final class C3014j extends C12881k implements Function1<C3018a, C13145v> {

        /* renamed from: c */
        final /* synthetic */ C3004g f7862c;

        C3014j(C3004g gVar) {
            this.f7862c = gVar;
            super(1);
        }

        /* renamed from: a */
        public final void mo12018a(C3018a aVar) {
            String str;
            if (aVar.mo12024b()) {
                if (aVar.mo12023a() != null) {
                    str = aVar.mo12023a();
                } else {
                    str = C5880u.m18936a(C2721j0.error_generic);
                }
                PasswordInputLayout r = this.f7862c.mo12011r();
                if (r != null) {
                    r.mo17574a(str);
                }
                this.f7862c.mo12009p().mo11879c();
                return;
            }
            PasswordInputLayout r2 = this.f7862c.mo12011r();
            if (r2 != null) {
                r2.mo2144c();
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo12018a((C3018a) obj);
            return C13145v.f29587a;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public final void m10795b(C3018a aVar) {
        C3012h hVar = new C3012h(this);
        C3013i iVar = new C3013i(this);
        C3014j jVar = new C3014j(this);
        hVar.invoke(aVar.mo12027e());
        iVar.mo12017a(aVar);
        jVar.mo12018a(aVar);
        mo11747a(aVar);
    }

    /* renamed from: s */
    private final String m10796s() {
        PasswordInputLayout passwordInputLayout = this.f7852X;
        if (passwordInputLayout != null) {
            String inputTextValue = passwordInputLayout.getInputTextValue();
            if (inputTextValue != null) {
                return inputTextValue;
            }
        }
        return "";
    }

    /* renamed from: t */
    private final void m10797t() {
        OnboardingToolbar onboardingToolbar = (OnboardingToolbar) _$_findCachedViewById(C2716h0.resetPwdOnboardingToolbar);
        if (onboardingToolbar != null) {
            DisneyTitleToolbar disneyToolbar = onboardingToolbar.getDisneyToolbar();
            if (disneyToolbar != null) {
                disneyToolbar.mo17377a(C5880u.m18936a(C2721j0.cancel_label), (Function0<C13145v>) new C3007c<C13145v>(this));
            }
        }
        LoadingButton loadingButton = this.f7851W;
        if (loadingButton != null) {
            loadingButton.setText(C2721j0.btn_continue);
        }
        LoadingButton loadingButton2 = this.f7851W;
        if (loadingButton2 != null) {
            loadingButton2.setOnClickListener(new C3008d(this));
        }
        PasswordInputLayout passwordInputLayout = this.f7852X;
        if (passwordInputLayout != null) {
            C5704a.m18600a(passwordInputLayout, new C3009e(this), new C3010f(this), C13183n.m40498a((ConstraintLayout) _$_findCachedViewById(C2716h0.resetLayout)), false, 8, null);
        }
        PasswordInputLayout passwordInputLayout2 = this.f7852X;
        if (passwordInputLayout2 != null) {
            passwordInputLayout2.mo17571a(true, new C3011g(this));
        }
    }

    public abstract void _$_clearFindViewByIdCache();

    public abstract View _$_findCachedViewById(int i);

    /* renamed from: a */
    public void mo11747a(C3018a aVar) {
    }

    public final C3017j getViewModel() {
        C3017j jVar = this.f7849U;
        if (jVar != null) {
            return jVar;
        }
        Intrinsics.throwUninitializedPropertyAccessException("viewModel");
        throw null;
    }

    /* renamed from: o */
    public final void mo12008o() {
        C2887n nVar = this.f7850V;
        if (nVar != null) {
            nVar.mo11878b();
            C3017j jVar = this.f7849U;
            if (jVar != null) {
                jVar.mo12019b(m10796s());
            } else {
                Intrinsics.throwUninitializedPropertyAccessException("viewModel");
                throw null;
            }
        } else {
            Intrinsics.throwUninitializedPropertyAccessException("analytics");
            throw null;
        }
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(C2718i0.fragment_reset_password, viewGroup, false);
        Intrinsics.checkReturnedValueIsNotNull((Object) inflate, "inflater.inflate(R.layou…ssword, container, false)");
        return inflate;
    }

    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        _$_clearFindViewByIdCache();
    }

    public void onStart() {
        super.onStart();
        OnboardingToolbar onboardingToolbar = (OnboardingToolbar) _$_findCachedViewById(C2716h0.resetPwdOnboardingToolbar);
        if (onboardingToolbar != null) {
            C0532d requireActivity = requireActivity();
            Intrinsics.checkReturnedValueIsNotNull((Object) requireActivity, "requireActivity()");
            OnboardingToolbar.m18500a(onboardingToolbar, requireActivity, getView(), (NestedScrollView) _$_findCachedViewById(C2716h0.resetPwdScrollView), (ConstraintLayout) _$_findCachedViewById(C2716h0.resetLayout), false, C3005a.f7853c, 16, null);
        }
        OnboardingToolbar onboardingToolbar2 = (OnboardingToolbar) _$_findCachedViewById(C2716h0.resetPwdOnboardingToolbar);
        if (onboardingToolbar2 != null) {
            DisneyTitleToolbar disneyToolbar = onboardingToolbar2.getDisneyToolbar();
            if (disneyToolbar != null) {
                disneyToolbar.mo17380c(false);
            }
        }
        C3017j jVar = this.f7849U;
        if (jVar != null) {
            C5755i.m18679a(this, jVar, null, null, new C3006b(this), 6, null);
            return;
        }
        Intrinsics.throwUninitializedPropertyAccessException("viewModel");
        throw null;
    }

    public void onStop() {
        OnboardingToolbar onboardingToolbar = (OnboardingToolbar) _$_findCachedViewById(C2716h0.resetPwdOnboardingToolbar);
        if (onboardingToolbar != null) {
            onboardingToolbar.setToolbarSet(false);
        }
        super.onStop();
    }

    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.f7851W = (LoadingButton) view.findViewById(C2716h0.loginButton);
        this.f7852X = (PasswordInputLayout) view.findViewById(C2716h0.passwordInputLayout);
        m10797t();
    }

    /* renamed from: p */
    public final C2887n mo12009p() {
        C2887n nVar = this.f7850V;
        if (nVar != null) {
            return nVar;
        }
        Intrinsics.throwUninitializedPropertyAccessException("analytics");
        throw null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: q */
    public final LoadingButton mo12010q() {
        return this.f7851W;
    }

    /* access modifiers changed from: protected */
    /* renamed from: r */
    public final PasswordInputLayout mo12011r() {
        return this.f7852X;
    }
}
