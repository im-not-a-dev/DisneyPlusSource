package p163g.p201e.p203b.p204d.p207x0;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.widget.NestedScrollView;
import androidx.fragment.app.C0532d;
import com.bamtechmedia.dominguez.analytics.C2378m;
import com.bamtechmedia.dominguez.analytics.C2413n;
import com.bamtechmedia.dominguez.analytics.p057o0.C2433b;
import com.bamtechmedia.dominguez.auth.p061o0.p062h.C2749b;
import com.bamtechmedia.dominguez.auth.p061o0.p063i.C2755d;
import com.bamtechmedia.dominguez.core.design.widgets.C5667d;
import com.bamtechmedia.dominguez.core.design.widgets.DisneyTitleToolbar;
import com.bamtechmedia.dominguez.core.design.widgets.DisneyTitleToolbar.C5621c;
import com.bamtechmedia.dominguez.core.design.widgets.LoadingButton;
import com.bamtechmedia.dominguez.core.design.widgets.OnboardingToolbar;
import com.bamtechmedia.dominguez.core.design.widgets.textinputlayout.C5704a;
import com.bamtechmedia.dominguez.core.design.widgets.textinputlayout.PasswordInputLayout;
import com.bamtechmedia.dominguez.core.framework.C5755i;
import com.bamtechmedia.dominguez.core.utils.C5833g;
import com.bamtechmedia.dominguez.core.utils.C5837i;
import com.bamtechmedia.dominguez.core.utils.C5843l;
import com.bamtechmedia.dominguez.core.utils.C5880u;
import java.util.HashMap;
import kotlin.C12907r;
import kotlin.TypeCastException;
import kotlin.C13145v;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.C12881k;
import p096e.p121h.p135s.C4127b0;
import p163g.p201e.p203b.p204d.C5411n0;
import p163g.p201e.p203b.p204d.C5413o0;
import p163g.p201e.p203b.p204d.C5415p0;
import p163g.p201e.p203b.p204d.p207x0.C5536e.C5537a;
import p163g.p201e.p203b.p312q.C7717x;
import p512h.p513c.p514k.C11890i;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 62\u00020\u00012\u00020\u00022\u00020\u0003:\u00016B\u0005¢\u0006\u0002\u0010\u0004J\b\u0010\"\u001a\u00020#H\u0016J\b\u0010$\u001a\u00020%H\u0002J$\u0010&\u001a\u00020\u00122\u0006\u0010'\u001a\u00020(2\b\u0010)\u001a\u0004\u0018\u00010*2\b\u0010+\u001a\u0004\u0018\u00010,H\u0016J\b\u0010-\u001a\u00020%H\u0016J\b\u0010.\u001a\u00020%H\u0016J\u001a\u0010/\u001a\u00020%2\u0006\u00100\u001a\u00020\u00122\b\u0010+\u001a\u0004\u0018\u00010,H\u0016J\b\u00101\u001a\u00020%H\u0002J\b\u00102\u001a\u00020%H\u0002J\u0010\u00103\u001a\u00020%2\u0006\u00104\u001a\u000205H\u0002R\u001e\u0010\u0005\u001a\u00020\u00068\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u0013\u0010\u000b\u001a\u0004\u0018\u00010\f8F¢\u0006\u0006\u001a\u0004\b\r\u0010\u000eR\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u0012X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0013\u001a\u0004\u0018\u00010\u0010X\u000e¢\u0006\u0002\n\u0000R\u001e\u0010\u0014\u001a\u00020\u00158\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\u0010\u0010\u001a\u001a\u0004\u0018\u00010\u001bX\u000e¢\u0006\u0002\n\u0000R\u001e\u0010\u001c\u001a\u00020\u001d8\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!¨\u00067"}, mo31007d2 = {"Lcom/bamtechmedia/dominguez/account/password/ChangePasswordFragment;", "Ldagger/android/support/DaggerFragment;", "Lcom/bamtechmedia/dominguez/analytics/AnalyticsStateProvider;", "Lcom/bamtechmedia/dominguez/globalnav/HideNavMenu;", "()V", "analytics", "Lcom/bamtechmedia/dominguez/account/password/ChangePasswordAnalytics;", "getAnalytics", "()Lcom/bamtechmedia/dominguez/account/password/ChangePasswordAnalytics;", "setAnalytics", "(Lcom/bamtechmedia/dominguez/account/password/ChangePasswordAnalytics;)V", "currentEmail", "", "getCurrentEmail", "()Ljava/lang/String;", "currentPasswordInput", "Lcom/bamtechmedia/dominguez/core/design/widgets/textinputlayout/PasswordInputLayout;", "forgotPassword", "Landroid/view/View;", "newPasswordInput", "otpRouter", "Lcom/bamtechmedia/dominguez/auth/api/router/OtpRouter;", "getOtpRouter", "()Lcom/bamtechmedia/dominguez/auth/api/router/OtpRouter;", "setOtpRouter", "(Lcom/bamtechmedia/dominguez/auth/api/router/OtpRouter;)V", "saveActionProvider", "Lcom/bamtechmedia/dominguez/core/design/widgets/SaveButtonActionProvider;", "viewModel", "Lcom/bamtechmedia/dominguez/account/password/ChangePasswordViewModel;", "getViewModel", "()Lcom/bamtechmedia/dominguez/account/password/ChangePasswordViewModel;", "setViewModel", "(Lcom/bamtechmedia/dominguez/account/password/ChangePasswordViewModel;)V", "getAnalyticsSection", "Lcom/bamtechmedia/dominguez/analytics/AnalyticsSection;", "initializeViews", "", "onCreateView", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onStart", "onStop", "onViewCreated", "view", "setToolbar", "submitPasswordInputs", "updateViewState", "newState", "Lcom/bamtechmedia/dominguez/account/password/ChangePasswordViewModel$State;", "Companion", "account_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* renamed from: g.e.b.d.x0.c */
/* compiled from: ChangePasswordFragment.kt */
public final class C5513c extends C11890i implements C2413n, C7717x {

    /* renamed from: c0 */
    public static final C5514a f13052c0 = new C5514a(null);

    /* renamed from: U */
    public C5536e f13053U;

    /* renamed from: V */
    public C5512b f13054V;

    /* renamed from: W */
    public C2755d f13055W;
    /* access modifiers changed from: private */

    /* renamed from: X */
    public C5667d f13056X;
    /* access modifiers changed from: private */

    /* renamed from: Y */
    public PasswordInputLayout f13057Y;
    /* access modifiers changed from: private */

    /* renamed from: Z */
    public PasswordInputLayout f13058Z;
    /* access modifiers changed from: private */

    /* renamed from: a0 */
    public View f13059a0;

    /* renamed from: b0 */
    private HashMap f13060b0;

    /* renamed from: g.e.b.d.x0.c$a */
    /* compiled from: ChangePasswordFragment.kt */
    public static final class C5514a {
        private C5514a() {
        }

        /* renamed from: a */
        public final C5513c mo17281a(String str) {
            C5513c cVar = new C5513c();
            cVar.setArguments(C5833g.m18829a(C12907r.m40244a("currentEmail", str)));
            return cVar;
        }

        public /* synthetic */ C5514a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, mo31007d2 = {"setupCurrentPasswordInput", "", "invoke"}, mo31008k = 3, mo31009mv = {1, 1, 15})
    /* renamed from: g.e.b.d.x0.c$b */
    /* compiled from: ChangePasswordFragment.kt */
    static final class C5515b extends C12881k implements Function0<C13145v> {

        /* renamed from: c */
        final /* synthetic */ C5513c f13061c;

        /* renamed from: g.e.b.d.x0.c$b$a */
        /* compiled from: ChangePasswordFragment.kt */
        static final class C5516a extends C12881k implements Function1<String, C13145v> {

            /* renamed from: c */
            final /* synthetic */ C5515b f13062c;

            C5516a(C5515b bVar) {
                this.f13062c = bVar;
                super(1);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((String) obj);
                return C13145v.f29587a;
            }

            public final void invoke(String str) {
                PasswordInputLayout c = this.f13062c.f13061c.f13058Z;
                if (c != null) {
                    c.requestFocus();
                }
            }
        }

        /* renamed from: g.e.b.d.x0.c$b$b */
        /* compiled from: ChangePasswordFragment.kt */
        static final class C5517b extends C12881k implements Function1<String, C13145v> {

            /* renamed from: c */
            final /* synthetic */ C5515b f13063c;

            C5517b(C5515b bVar) {
                this.f13063c = bVar;
                super(1);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((String) obj);
                return C13145v.f29587a;
            }

            public final void invoke(String str) {
                this.f13063c.f13061c.getViewModel().mo17296c(str);
            }
        }

        /* renamed from: g.e.b.d.x0.c$b$c */
        /* compiled from: ChangePasswordFragment.kt */
        static final class C5518c extends C12881k implements Function0<C13145v> {

            /* renamed from: c */
            final /* synthetic */ C5515b f13064c;

            C5518c(C5515b bVar) {
                this.f13064c = bVar;
                super(0);
            }

            public final void invoke() {
                this.f13064c.f13061c.mo17279o().mo17274d();
            }
        }

        C5515b(C5513c cVar) {
            this.f13061c = cVar;
            super(0);
        }

        public final void invoke() {
            PasswordInputLayout a = this.f13061c.f13057Y;
            if (a != null) {
                a.setInputTextValue(this.f13061c.getViewModel().mo17298y());
            }
            PasswordInputLayout a2 = this.f13061c.f13057Y;
            if (a2 != null) {
                C5704a.m18600a(a2, new C5516a(this), new C5517b(this), C13183n.m40498a((ConstraintLayout) this.f13061c._$_findCachedViewById(C5411n0.changePasswordLayout)), false, 8, null);
            }
            PasswordInputLayout a3 = this.f13061c.f13057Y;
            if (a3 != null) {
                a3.mo17571a(false, new C5518c(this));
            }
        }
    }

    @Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, mo31007d2 = {"setupNewPasswordInput", "", "invoke"}, mo31008k = 3, mo31009mv = {1, 1, 15})
    /* renamed from: g.e.b.d.x0.c$c */
    /* compiled from: ChangePasswordFragment.kt */
    static final class C5519c extends C12881k implements Function0<C13145v> {

        /* renamed from: c */
        final /* synthetic */ C5513c f13065c;

        /* renamed from: g.e.b.d.x0.c$c$a */
        /* compiled from: ChangePasswordFragment.kt */
        static final class C5520a extends C12881k implements Function1<String, C13145v> {

            /* renamed from: c */
            final /* synthetic */ C5519c f13066c;

            C5520a(C5519c cVar) {
                this.f13066c = cVar;
                super(1);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((String) obj);
                return C13145v.f29587a;
            }

            public final void invoke(String str) {
                this.f13066c.f13065c.m18316s();
            }
        }

        /* renamed from: g.e.b.d.x0.c$c$b */
        /* compiled from: ChangePasswordFragment.kt */
        static final class C5521b extends C12881k implements Function1<String, C13145v> {

            /* renamed from: c */
            final /* synthetic */ C5519c f13067c;

            C5521b(C5519c cVar) {
                this.f13067c = cVar;
                super(1);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((String) obj);
                return C13145v.f29587a;
            }

            public final void invoke(String str) {
                this.f13067c.f13065c.getViewModel().mo17297d(str);
                this.f13067c.f13065c.getViewModel().mo17295b(str);
            }
        }

        /* renamed from: g.e.b.d.x0.c$c$c */
        /* compiled from: ChangePasswordFragment.kt */
        static final class C5522c extends C12881k implements Function0<C13145v> {

            /* renamed from: c */
            final /* synthetic */ C5519c f13068c;

            C5522c(C5519c cVar) {
                this.f13068c = cVar;
                super(0);
            }

            public final void invoke() {
                this.f13068c.f13065c.mo17279o().mo17274d();
            }
        }

        C5519c(C5513c cVar) {
            this.f13065c = cVar;
            super(0);
        }

        public final void invoke() {
            PasswordInputLayout c = this.f13065c.f13058Z;
            if (c != null) {
                c.setInputTextValue(this.f13065c.getViewModel().mo17299z());
            }
            PasswordInputLayout c2 = this.f13065c.f13058Z;
            if (c2 != null) {
                C5704a.m18600a(c2, new C5520a(this), new C5521b(this), C13183n.m40498a((ConstraintLayout) this.f13065c._$_findCachedViewById(C5411n0.changePasswordLayout)), false, 8, null);
            }
            PasswordInputLayout c3 = this.f13065c.f13058Z;
            if (c3 != null) {
                c3.mo17571a(true, new C5522c(this));
            }
            Context requireContext = this.f13065c.requireContext();
            Intrinsics.checkReturnedValueIsNotNull((Object) requireContext, "requireContext()");
            if (C5837i.m18843e(requireContext)) {
                PasswordInputLayout c4 = this.f13065c.f13058Z;
                if (c4 != null) {
                    String a = C5880u.m18936a(C5415p0.enter_new_password);
                    if (a != null) {
                        String upperCase = a.toUpperCase();
                        Intrinsics.checkReturnedValueIsNotNull((Object) upperCase, "(this as java.lang.String).toUpperCase()");
                        c4.setTitle(upperCase);
                        return;
                    }
                    throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
                }
            }
        }
    }

    @Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, mo31007d2 = {"setupSaveButton", "", "invoke"}, mo31008k = 3, mo31009mv = {1, 1, 15})
    /* renamed from: g.e.b.d.x0.c$d */
    /* compiled from: ChangePasswordFragment.kt */
    static final class C5523d extends C12881k implements Function0<C13145v> {

        /* renamed from: c */
        final /* synthetic */ C5513c f13069c;

        /* renamed from: g.e.b.d.x0.c$d$a */
        /* compiled from: ChangePasswordFragment.kt */
        static final class C5524a implements OnClickListener {

            /* renamed from: c */
            final /* synthetic */ C5523d f13070c;

            C5524a(C5523d dVar) {
                this.f13070c = dVar;
            }

            public final void onClick(View view) {
                this.f13070c.f13069c.m18316s();
            }
        }

        C5523d(C5513c cVar) {
            this.f13069c = cVar;
            super(0);
        }

        public final void invoke() {
            LoadingButton loadingButton = (LoadingButton) this.f13069c._$_findCachedViewById(C5411n0.saveButton);
            if (loadingButton != null) {
                loadingButton.setText(C5415p0.btn_save);
            }
            LoadingButton loadingButton2 = (LoadingButton) this.f13069c._$_findCachedViewById(C5411n0.saveButton);
            if (loadingButton2 != null) {
                loadingButton2.setOnClickListener(new C5524a(this));
            }
        }
    }

    @Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, mo31007d2 = {"setupForgotPasswordButton", "", "invoke"}, mo31008k = 3, mo31009mv = {1, 1, 15})
    /* renamed from: g.e.b.d.x0.c$e */
    /* compiled from: ChangePasswordFragment.kt */
    static final class C5525e extends C12881k implements Function0<C13145v> {

        /* renamed from: c */
        final /* synthetic */ C5513c f13071c;

        /* renamed from: g.e.b.d.x0.c$e$a */
        /* compiled from: ChangePasswordFragment.kt */
        static final class C5526a implements OnClickListener {

            /* renamed from: c */
            final /* synthetic */ C5525e f13072c;

            C5526a(C5525e eVar) {
                this.f13072c = eVar;
            }

            public final void onClick(View view) {
                this.f13072c.f13071c.mo17279o().mo17273c();
                this.f13072c.f13071c.getViewModel().mo17293A();
            }
        }

        C5525e(C5513c cVar) {
            this.f13071c = cVar;
            super(0);
        }

        public final void invoke() {
            View b = this.f13071c.f13059a0;
            if (b != null) {
                b.setOnClickListener(new C5526a(this));
            }
        }
    }

    /* renamed from: g.e.b.d.x0.c$f */
    /* compiled from: ChangePasswordFragment.kt */
    static final class C5527f extends C12881k implements Function1<C5537a, C13145v> {

        /* renamed from: c */
        final /* synthetic */ C5513c f13073c;

        C5527f(C5513c cVar) {
            this.f13073c = cVar;
            super(1);
        }

        /* renamed from: a */
        public final void mo17288a(C5537a aVar) {
            this.f13073c.m18309a(aVar);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo17288a((C5537a) obj);
            return C13145v.f29587a;
        }
    }

    /* renamed from: g.e.b.d.x0.c$g */
    /* compiled from: ChangePasswordFragment.kt */
    static final class C5528g extends C12881k implements Function0<C13145v> {

        /* renamed from: c */
        final /* synthetic */ C5513c f13074c;

        C5528g(C5513c cVar) {
            this.f13074c = cVar;
            super(0);
        }

        public final void invoke() {
            this.f13074c.m18316s();
        }
    }

    /* renamed from: g.e.b.d.x0.c$h */
    /* compiled from: ChangePasswordFragment.kt */
    static final class C5529h extends C12881k implements Function0<C13145v> {

        /* renamed from: c */
        final /* synthetic */ C5513c f13075c;

        C5529h(C5513c cVar) {
            this.f13075c = cVar;
            super(0);
        }

        public final void invoke() {
            this.f13075c.mo17279o().mo17271a();
            this.f13075c.requireFragmentManager().mo3161g();
        }
    }

    /* renamed from: g.e.b.d.x0.c$i */
    /* compiled from: ChangePasswordFragment.kt */
    static final class C5530i extends C12881k implements Function0<C13145v> {

        /* renamed from: c */
        final /* synthetic */ C5513c f13076c;

        C5530i(C5513c cVar) {
            this.f13076c = cVar;
            super(0);
        }

        public final void invoke() {
            this.f13076c.mo17279o().mo17271a();
            this.f13076c.requireFragmentManager().mo3161g();
        }
    }

    /* renamed from: g.e.b.d.x0.c$j */
    /* compiled from: ChangePasswordFragment.kt */
    static final class C5531j extends C12881k implements Function1<Boolean, C13145v> {

        /* renamed from: c */
        final /* synthetic */ C5513c f13077c;

        C5531j(C5513c cVar) {
            this.f13077c = cVar;
            super(1);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke(((Boolean) obj).booleanValue());
            return C13145v.f29587a;
        }

        public final void invoke(boolean z) {
            Context requireContext = this.f13077c.requireContext();
            Intrinsics.checkReturnedValueIsNotNull((Object) requireContext, "requireContext()");
            if (C5837i.m18843e(requireContext)) {
                if (z) {
                    LoadingButton loadingButton = (LoadingButton) this.f13077c._$_findCachedViewById(C5411n0.saveButton);
                    if (loadingButton != null) {
                        loadingButton.mo17425a();
                    }
                } else {
                    LoadingButton loadingButton2 = (LoadingButton) this.f13077c._$_findCachedViewById(C5411n0.saveButton);
                    if (loadingButton2 != null) {
                        loadingButton2.mo17426b();
                    }
                }
            }
            C5667d d = this.f13077c.f13056X;
            if (d != null) {
                d.mo17490a(z);
            }
            ProgressBar progressBar = (ProgressBar) this.f13077c._$_findCachedViewById(C5411n0.progressBar);
            if (progressBar != null) {
                C4127b0.m14131b(progressBar, z);
            }
            PasswordInputLayout a = this.f13077c.f13057Y;
            if (a != null) {
                a.mo17570a(!z);
            }
            PasswordInputLayout c = this.f13077c.f13058Z;
            if (c != null) {
                c.mo17570a(!z);
            }
            View b = this.f13077c.f13059a0;
            if (b != null) {
                b.setEnabled(!z);
            }
        }
    }

    /* renamed from: g.e.b.d.x0.c$k */
    /* compiled from: ChangePasswordFragment.kt */
    static final class C5532k extends C12881k implements Function1<C2749b, C13145v> {

        /* renamed from: c */
        final /* synthetic */ C5513c f13078c;

        C5532k(C5513c cVar) {
            this.f13078c = cVar;
            super(1);
        }

        /* renamed from: a */
        public final void mo17290a(C2749b bVar) {
            PasswordInputLayout c = this.f13078c.f13058Z;
            if (c != null) {
                String str = null;
                Integer valueOf = bVar != null ? Integer.valueOf(bVar.mo11756a()) : null;
                Integer valueOf2 = bVar != null ? Integer.valueOf(bVar.mo11757b()) : null;
                if (bVar != null) {
                    str = bVar.mo11758c();
                }
                c.mo17569a(valueOf, valueOf2, str);
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo17290a((C2749b) obj);
            return C13145v.f29587a;
        }
    }

    /* renamed from: g.e.b.d.x0.c$l */
    /* compiled from: ChangePasswordFragment.kt */
    static final class C5533l extends C12881k implements Function1<String, C13145v> {

        /* renamed from: c */
        final /* synthetic */ C5513c f13079c;

        C5533l(C5513c cVar) {
            this.f13079c = cVar;
            super(1);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((String) obj);
            return C13145v.f29587a;
        }

        public final void invoke(String str) {
            if (str == null) {
                PasswordInputLayout a = this.f13079c.f13057Y;
                if (a != null) {
                    a.mo2144c();
                    return;
                }
                return;
            }
            this.f13079c.mo17279o().mo17272b();
            PasswordInputLayout a2 = this.f13079c.f13057Y;
            if (a2 != null) {
                a2.mo17574a(str);
            }
        }
    }

    /* renamed from: g.e.b.d.x0.c$m */
    /* compiled from: ChangePasswordFragment.kt */
    static final class C5534m extends C12881k implements Function1<String, C13145v> {

        /* renamed from: c */
        final /* synthetic */ C5513c f13080c;

        C5534m(C5513c cVar) {
            this.f13080c = cVar;
            super(1);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((String) obj);
            return C13145v.f29587a;
        }

        public final void invoke(String str) {
            if (str == null) {
                PasswordInputLayout c = this.f13080c.f13058Z;
                if (c != null) {
                    c.mo2144c();
                    return;
                }
                return;
            }
            this.f13080c.mo17279o().mo17272b();
            PasswordInputLayout c2 = this.f13080c.f13058Z;
            if (c2 != null) {
                c2.mo17574a(str);
            }
        }
    }

    /* renamed from: q */
    private final void m18314q() {
        C5515b bVar = new C5515b(this);
        C5519c cVar = new C5519c(this);
        C5523d dVar = new C5523d(this);
        C5525e eVar = new C5525e(this);
        cVar.invoke();
        bVar.invoke();
        dVar.invoke();
        eVar.invoke();
    }

    /* renamed from: r */
    private final void m18315r() {
        OnboardingToolbar onboardingToolbar = (OnboardingToolbar) _$_findCachedViewById(C5411n0.changePasswordOnboardingToolbar);
        if (onboardingToolbar != null) {
            C0532d requireActivity = requireActivity();
            Intrinsics.checkReturnedValueIsNotNull((Object) requireActivity, "requireActivity()");
            onboardingToolbar.mo17459a(requireActivity, getView(), (NestedScrollView) _$_findCachedViewById(C5411n0.changePasswordScrollView), (ConstraintLayout) _$_findCachedViewById(C5411n0.changePasswordLayout), false, new C5530i(this));
        }
        OnboardingToolbar onboardingToolbar2 = (OnboardingToolbar) _$_findCachedViewById(C5411n0.changePasswordOnboardingToolbar);
        if (onboardingToolbar2 != null) {
            DisneyTitleToolbar disneyToolbar = onboardingToolbar2.getDisneyToolbar();
            if (disneyToolbar != null) {
                disneyToolbar.setTitle(C5880u.m18936a(C5415p0.change_password));
                disneyToolbar.mo17377a(C5880u.m18936a(C5415p0.btn_save), (Function0<C13145v>) new C5528g<C13145v>(this));
                disneyToolbar.mo17375a(C5621c.CLOSE_BUTTON, (Function0<C13145v>) new C5529h<C13145v>(this));
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: s */
    public final void m18316s() {
        C5512b bVar = this.f13054V;
        String str = null;
        if (bVar != null) {
            bVar.mo17275e();
            PasswordInputLayout passwordInputLayout = this.f13058Z;
            if (passwordInputLayout != null) {
                C5843l.f13627a.mo17743a(passwordInputLayout);
            }
            C5536e eVar = this.f13053U;
            if (eVar != null) {
                PasswordInputLayout passwordInputLayout2 = this.f13057Y;
                String inputTextValue = passwordInputLayout2 != null ? passwordInputLayout2.getInputTextValue() : null;
                String str2 = "";
                if (inputTextValue == null) {
                    inputTextValue = str2;
                }
                PasswordInputLayout passwordInputLayout3 = this.f13058Z;
                if (passwordInputLayout3 != null) {
                    str = passwordInputLayout3.getInputTextValue();
                }
                if (str == null) {
                    str = str2;
                }
                eVar.mo17294a(inputTextValue, str);
                return;
            }
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
            throw null;
        }
        Intrinsics.throwUninitializedPropertyAccessException("analytics");
        throw null;
    }

    public void _$_clearFindViewByIdCache() {
        HashMap hashMap = this.f13060b0;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    public View _$_findCachedViewById(int i) {
        if (this.f13060b0 == null) {
            this.f13060b0 = new HashMap();
        }
        View view = (View) this.f13060b0.get(Integer.valueOf(i));
        if (view == null) {
            View view2 = getView();
            if (view2 == null) {
                return null;
            }
            view = view2.findViewById(i);
            this.f13060b0.put(Integer.valueOf(i), view);
        }
        return view;
    }

    public final C5536e getViewModel() {
        C5536e eVar = this.f13053U;
        if (eVar != null) {
            return eVar;
        }
        Intrinsics.throwUninitializedPropertyAccessException("viewModel");
        throw null;
    }

    /* renamed from: o */
    public final C5512b mo17279o() {
        C5512b bVar = this.f13054V;
        if (bVar != null) {
            return bVar;
        }
        Intrinsics.throwUninitializedPropertyAccessException("analytics");
        throw null;
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(C5413o0.fragment_account_change_password, viewGroup, false);
        this.f13059a0 = inflate.findViewById(C5411n0.forgotPassword);
        Intrinsics.checkReturnedValueIsNotNull((Object) inflate, "view");
        return inflate;
    }

    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        _$_clearFindViewByIdCache();
    }

    public void onStart() {
        super.onStart();
        m18315r();
        C5536e eVar = this.f13053U;
        if (eVar != null) {
            C5755i.m18679a(this, eVar, null, null, new C5527f(this), 6, null);
            return;
        }
        Intrinsics.throwUninitializedPropertyAccessException("viewModel");
        throw null;
    }

    public void onStop() {
        OnboardingToolbar onboardingToolbar = (OnboardingToolbar) _$_findCachedViewById(C5411n0.changePasswordOnboardingToolbar);
        if (onboardingToolbar != null) {
            onboardingToolbar.setToolbarSet(false);
        }
        super.onStop();
    }

    public void onViewCreated(View view, Bundle bundle) {
        this.f13057Y = (PasswordInputLayout) view.findViewById(C5411n0.currentPasswordInput);
        this.f13058Z = (PasswordInputLayout) view.findViewById(C5411n0.newPasswordInput);
        m18314q();
    }

    /* renamed from: p */
    public final String mo17280p() {
        Bundle arguments = getArguments();
        if (arguments != null) {
            return arguments.getString("currentEmail");
        }
        return null;
    }

    /* renamed from: e */
    public C2378m mo11534e() {
        return new C2378m(C2433b.ACCOUNT_SETTINGS_CHANGE_PASSWORD, (String) null, 2, (DefaultConstructorMarker) null);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final void m18309a(C5537a aVar) {
        C5531j jVar = new C5531j(this);
        C5532k kVar = new C5532k(this);
        C5533l lVar = new C5533l(this);
        C5534m mVar = new C5534m(this);
        jVar.invoke(aVar.mo17302b());
        kVar.mo17290a(aVar.mo17304d());
        lVar.invoke(aVar.mo17301a());
        mVar.invoke(aVar.mo17303c());
    }
}
