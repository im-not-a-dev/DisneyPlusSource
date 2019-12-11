package com.bamtechmedia.dominguez.auth.register;

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
import com.bamtechmedia.dominguez.auth.C2784r;
import com.bamtechmedia.dominguez.auth.p061o0.p062h.C2749b;
import com.bamtechmedia.dominguez.auth.register.C2842h.C2843a;
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

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u0005¢\u0006\u0002\u0010\u0003J\b\u0010)\u001a\u00020*H\u0002J\u0010\u0010+\u001a\u00020*2\u0006\u0010,\u001a\u00020\u0011H\u0002J\b\u0010-\u001a\u00020.H\u0016J&\u0010/\u001a\u0004\u0018\u0001002\u0006\u00101\u001a\u0002022\b\u00103\u001a\u0004\u0018\u0001042\b\u00105\u001a\u0004\u0018\u000106H\u0016J\b\u00107\u001a\u00020*H\u0016J\b\u00108\u001a\u00020*H\u0016J\u001a\u00109\u001a\u00020*2\u0006\u0010:\u001a\u0002002\b\u00105\u001a\u0004\u0018\u000106H\u0016J\b\u0010;\u001a\u00020*H\u0002J\u0010\u0010<\u001a\u00020*2\u0006\u0010=\u001a\u00020>H\u0002R\u001e\u0010\u0004\u001a\u00020\u00058\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001e\u0010\n\u001a\u00020\u000b8\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0010\u001a\u00020\u00118BX\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0012R\u001e\u0010\u0013\u001a\u00020\u00148\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u001e\u0010\u0019\u001a\u00020\u001a8\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR\u0014\u0010\u001f\u001a\u00020 8BX\u0004¢\u0006\u0006\u001a\u0004\b!\u0010\"R\u001e\u0010#\u001a\u00020$8\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b%\u0010&\"\u0004\b'\u0010(¨\u0006?"}, mo31007d2 = {"Lcom/bamtechmedia/dominguez/auth/register/RegisterAccountFragment;", "Ldagger/android/support/DaggerFragment;", "Lcom/bamtechmedia/dominguez/analytics/AnalyticsStateProvider;", "()V", "analytics", "Lcom/bamtechmedia/dominguez/auth/register/RegisterAccountAnalytics;", "getAnalytics", "()Lcom/bamtechmedia/dominguez/auth/register/RegisterAccountAnalytics;", "setAnalytics", "(Lcom/bamtechmedia/dominguez/auth/register/RegisterAccountAnalytics;)V", "authHostViewModel", "Lcom/bamtechmedia/dominguez/auth/AuthHostViewModel;", "getAuthHostViewModel", "()Lcom/bamtechmedia/dominguez/auth/AuthHostViewModel;", "setAuthHostViewModel", "(Lcom/bamtechmedia/dominguez/auth/AuthHostViewModel;)V", "isOnline", "", "()Z", "offlineRouter", "Lcom/bamtechmedia/dominguez/error/api/OfflineRouter;", "getOfflineRouter", "()Lcom/bamtechmedia/dominguez/error/api/OfflineRouter;", "setOfflineRouter", "(Lcom/bamtechmedia/dominguez/error/api/OfflineRouter;)V", "offlineState", "Lcom/bamtechmedia/dominguez/core/OfflineState;", "getOfflineState", "()Lcom/bamtechmedia/dominguez/core/OfflineState;", "setOfflineState", "(Lcom/bamtechmedia/dominguez/core/OfflineState;)V", "passwordInput", "", "getPasswordInput", "()Ljava/lang/String;", "viewModel", "Lcom/bamtechmedia/dominguez/auth/register/RegisterViewModel;", "getViewModel", "()Lcom/bamtechmedia/dominguez/auth/register/RegisterViewModel;", "setViewModel", "(Lcom/bamtechmedia/dominguez/auth/register/RegisterViewModel;)V", "continueClicked", "", "enable", "enabled", "getAnalyticsSection", "Lcom/bamtechmedia/dominguez/analytics/AnalyticsSection;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onStart", "onStop", "onViewCreated", "view", "setupButtons", "updateViewState", "newState", "Lcom/bamtechmedia/dominguez/auth/register/RegisterViewModel$State;", "auth_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* renamed from: com.bamtechmedia.dominguez.auth.register.f */
/* compiled from: RegisterAccountFragment.kt */
public final class C2833f extends C11890i implements C2413n {

    /* renamed from: U */
    public C2842h f7597U;

    /* renamed from: V */
    public C2784r f7598V;

    /* renamed from: W */
    public C2827b f7599W;

    /* renamed from: X */
    public C7629c f7600X;

    /* renamed from: Y */
    public C3796d f7601Y;

    /* renamed from: Z */
    private HashMap f7602Z;

    /* renamed from: com.bamtechmedia.dominguez.auth.register.f$a */
    /* compiled from: RegisterAccountFragment.kt */
    static final class C2834a extends C12881k implements Function0<C13145v> {

        /* renamed from: c */
        final /* synthetic */ C2833f f7603c;

        C2834a(C2833f fVar) {
            this.f7603c = fVar;
            super(0);
        }

        public final void invoke() {
            this.f7603c.mo11844o().mo11836a();
            this.f7603c.requireActivity().onBackPressed();
        }
    }

    /* renamed from: com.bamtechmedia.dominguez.auth.register.f$b */
    /* compiled from: RegisterAccountFragment.kt */
    static final class C2835b extends C12881k implements Function1<C2843a, C13145v> {

        /* renamed from: c */
        final /* synthetic */ C2833f f7604c;

        C2835b(C2833f fVar) {
            this.f7604c = fVar;
            super(1);
        }

        /* renamed from: a */
        public final void mo11845a(C2843a aVar) {
            this.f7604c.m10517a(aVar);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo11845a((C2843a) obj);
            return C13145v.f29587a;
        }
    }

    /* renamed from: com.bamtechmedia.dominguez.auth.register.f$c */
    /* compiled from: RegisterAccountFragment.kt */
    static final class C2836c extends C12881k implements Function1<String, C13145v> {

        /* renamed from: c */
        final /* synthetic */ C2833f f7605c;

        C2836c(C2833f fVar) {
            this.f7605c = fVar;
            super(1);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((String) obj);
            return C13145v.f29587a;
        }

        public final void invoke(String str) {
            this.f7605c.m10519p();
        }
    }

    /* renamed from: com.bamtechmedia.dominguez.auth.register.f$d */
    /* compiled from: RegisterAccountFragment.kt */
    static final class C2837d extends C12881k implements Function1<String, C13145v> {

        /* renamed from: c */
        final /* synthetic */ C2833f f7606c;

        C2837d(C2833f fVar) {
            this.f7606c = fVar;
            super(1);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((String) obj);
            return C13145v.f29587a;
        }

        public final void invoke(String str) {
            this.f7606c.getViewModel().mo11851c(str);
        }
    }

    /* renamed from: com.bamtechmedia.dominguez.auth.register.f$e */
    /* compiled from: RegisterAccountFragment.kt */
    static final class C2838e extends C12881k implements Function0<C13145v> {

        /* renamed from: c */
        final /* synthetic */ C2833f f7607c;

        C2838e(C2833f fVar) {
            this.f7607c = fVar;
            super(0);
        }

        public final void invoke() {
            this.f7607c.mo11844o().mo11839c();
        }
    }

    /* renamed from: com.bamtechmedia.dominguez.auth.register.f$f */
    /* compiled from: RegisterAccountFragment.kt */
    static final class C2839f implements OnClickListener {

        /* renamed from: c */
        final /* synthetic */ C2833f f7608c;

        C2839f(C2833f fVar) {
            this.f7608c = fVar;
        }

        public final void onClick(View view) {
            this.f7608c.m10519p();
        }
    }

    /* renamed from: com.bamtechmedia.dominguez.auth.register.f$g */
    /* compiled from: RegisterAccountFragment.kt */
    static final class C2840g extends C12881k implements Function1<C2843a, C13145v> {

        /* renamed from: c */
        final /* synthetic */ C2833f f7609c;

        C2840g(C2833f fVar) {
            this.f7609c = fVar;
            super(1);
        }

        /* renamed from: a */
        public final void mo11849a(C2843a aVar) {
            String str;
            if (aVar.mo11855b()) {
                if (aVar.mo11854a() != null) {
                    str = aVar.mo11854a();
                } else {
                    str = C5880u.m18936a(C2721j0.error_generic);
                }
                this.f7609c.mo11844o().mo11837a(str);
                PasswordInputLayout passwordInputLayout = (PasswordInputLayout) this.f7609c._$_findCachedViewById(C2716h0.passwordInputLayout);
                if (passwordInputLayout != null) {
                    passwordInputLayout.mo17574a(str);
                }
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo11849a((C2843a) obj);
            return C13145v.f29587a;
        }
    }

    /* renamed from: b */
    private final void m10518b(boolean z) {
        LoadingButton loadingButton = (LoadingButton) _$_findCachedViewById(C2716h0.continueLoadingButton);
        if (z) {
            if (loadingButton != null) {
                loadingButton.mo17426b();
            }
        } else if (loadingButton != null) {
            loadingButton.mo17425a();
        }
        PasswordInputLayout passwordInputLayout = (PasswordInputLayout) _$_findCachedViewById(C2716h0.passwordInputLayout);
        if (passwordInputLayout != null) {
            passwordInputLayout.mo17570a(z);
        }
        OnboardingToolbar onboardingToolbar = (OnboardingToolbar) _$_findCachedViewById(C2716h0.registerAccountOnboardingToolbar);
        if (onboardingToolbar != null) {
            DisneyTitleToolbar disneyToolbar = onboardingToolbar.getDisneyToolbar();
            if (disneyToolbar != null) {
                disneyToolbar.mo17379b(z);
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: p */
    public final void m10519p() {
        C0532d requireActivity = requireActivity();
        if (!(requireActivity instanceof Activity)) {
            requireActivity = null;
        }
        if (requireActivity != null) {
            View currentFocus = requireActivity.getCurrentFocus();
            if (currentFocus != null) {
                C5843l.f13627a.mo17743a(currentFocus);
            }
        }
        C2827b bVar = this.f7599W;
        if (bVar != null) {
            bVar.mo11838b();
            C2842h hVar = this.f7597U;
            if (hVar != null) {
                hVar.mo11850b(m10520q());
            } else {
                C12880j.m40227c("viewModel");
                throw null;
            }
        } else {
            C12880j.m40227c("analytics");
            throw null;
        }
    }

    /* renamed from: q */
    private final String m10520q() {
        PasswordInputLayout passwordInputLayout = (PasswordInputLayout) _$_findCachedViewById(C2716h0.passwordInputLayout);
        if (passwordInputLayout != null) {
            String inputTextValue = passwordInputLayout.getInputTextValue();
            if (inputTextValue != null) {
                return inputTextValue;
            }
        }
        return "";
    }

    /* renamed from: r */
    private final boolean m10521r() {
        C3796d dVar = this.f7601Y;
        if (dVar != null) {
            return dVar.mo13695j();
        }
        C12880j.m40227c("offlineState");
        throw null;
    }

    /* renamed from: s */
    private final void m10522s() {
        LoadingButton loadingButton = (LoadingButton) _$_findCachedViewById(C2716h0.continueLoadingButton);
        if (loadingButton != null) {
            loadingButton.setText(C2721j0.btn_continue);
        }
        LoadingButton loadingButton2 = (LoadingButton) _$_findCachedViewById(C2716h0.continueLoadingButton);
        if (loadingButton2 != null) {
            loadingButton2.setOnClickListener(new C2839f(this));
        }
    }

    public void _$_clearFindViewByIdCache() {
        HashMap hashMap = this.f7602Z;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    public View _$_findCachedViewById(int i) {
        if (this.f7602Z == null) {
            this.f7602Z = new HashMap();
        }
        View view = (View) this.f7602Z.get(Integer.valueOf(i));
        if (view == null) {
            View view2 = getView();
            if (view2 == null) {
                return null;
            }
            view = view2.findViewById(i);
            this.f7602Z.put(Integer.valueOf(i), view);
        }
        return view;
    }

    /* renamed from: e */
    public C2378m mo11534e() {
        return new C2378m(C2433b.SIGN_UP_CREATE_PASSWORD, (String) null, 2, (DefaultConstructorMarker) null);
    }

    public final C2842h getViewModel() {
        C2842h hVar = this.f7597U;
        if (hVar != null) {
            return hVar;
        }
        C12880j.m40227c("viewModel");
        throw null;
    }

    /* renamed from: o */
    public final C2827b mo11844o() {
        C2827b bVar = this.f7599W;
        if (bVar != null) {
            return bVar;
        }
        C12880j.m40227c("analytics");
        throw null;
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(C2718i0.fragment_register_account, viewGroup, false);
    }

    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        _$_clearFindViewByIdCache();
    }

    public void onStart() {
        super.onStart();
        OnboardingToolbar onboardingToolbar = (OnboardingToolbar) _$_findCachedViewById(C2716h0.registerAccountOnboardingToolbar);
        if (onboardingToolbar != null) {
            C0532d requireActivity = requireActivity();
            C12880j.m40222a((Object) requireActivity, "requireActivity()");
            onboardingToolbar.mo17459a(requireActivity, getView(), (NestedScrollView) _$_findCachedViewById(C2716h0.registerAccountScrollView), (ConstraintLayout) _$_findCachedViewById(C2716h0.registerAccountLayout), false, new C2834a(this));
        }
        C2842h hVar = this.f7597U;
        if (hVar != null) {
            C5755i.m18679a(this, hVar, null, null, new C2835b(this), 6, null);
            if (!m10521r()) {
                C7629c cVar = this.f7600X;
                if (cVar != null) {
                    int i = C2716h0.registerAccountContainer;
                    C0538i childFragmentManager = getChildFragmentManager();
                    C12880j.m40222a((Object) childFragmentManager, "childFragmentManager");
                    cVar.mo20550a(i, childFragmentManager);
                    return;
                }
                C12880j.m40227c("offlineRouter");
                throw null;
            }
            return;
        }
        C12880j.m40227c("viewModel");
        throw null;
    }

    public void onStop() {
        OnboardingToolbar onboardingToolbar = (OnboardingToolbar) _$_findCachedViewById(C2716h0.registerAccountOnboardingToolbar);
        if (onboardingToolbar != null) {
            onboardingToolbar.setToolbarSet(false);
        }
        super.onStop();
    }

    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        TextView textView = (TextView) _$_findCachedViewById(C2716h0.registerEmailTextView);
        if (textView != null) {
            C2784r rVar = this.f7598V;
            if (rVar != null) {
                textView.setText(rVar.mo11802y());
            } else {
                C12880j.m40227c("authHostViewModel");
                throw null;
            }
        }
        m10522s();
        PasswordInputLayout passwordInputLayout = (PasswordInputLayout) _$_findCachedViewById(C2716h0.passwordInputLayout);
        if (passwordInputLayout != null) {
            C2842h hVar = this.f7597U;
            if (hVar != null) {
                passwordInputLayout.setInputTextValue(hVar.mo11852y());
            } else {
                C12880j.m40227c("viewModel");
                throw null;
            }
        }
        PasswordInputLayout passwordInputLayout2 = (PasswordInputLayout) _$_findCachedViewById(C2716h0.passwordInputLayout);
        if (passwordInputLayout2 != null) {
            C5704a.m18600a(passwordInputLayout2, new C2836c(this), new C2837d(this), C13183n.m40498a((ConstraintLayout) _$_findCachedViewById(C2716h0.registerAccountLayout)), false, 8, null);
        }
        PasswordInputLayout passwordInputLayout3 = (PasswordInputLayout) _$_findCachedViewById(C2716h0.passwordInputLayout);
        if (passwordInputLayout3 != null) {
            passwordInputLayout3.mo17571a(true, new C2838e(this));
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final void m10517a(C2843a aVar) {
        C2840g gVar = new C2840g(this);
        m10518b(!aVar.mo11857d());
        gVar.mo11849a(aVar);
        PasswordInputLayout passwordInputLayout = (PasswordInputLayout) _$_findCachedViewById(C2716h0.passwordInputLayout);
        if (passwordInputLayout != null) {
            C2749b c = aVar.mo11856c();
            String str = null;
            Integer valueOf = c != null ? Integer.valueOf(c.mo11756a()) : null;
            C2749b c2 = aVar.mo11856c();
            Integer valueOf2 = c2 != null ? Integer.valueOf(c2.mo11757b()) : null;
            C2749b c3 = aVar.mo11856c();
            if (c3 != null) {
                str = c3.mo11758c();
            }
            passwordInputLayout.mo17569a(valueOf, valueOf2, str);
        }
    }
}
