package p163g.p201e.p203b.p204d.p205v0;

import android.content.Context;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.widget.NestedScrollView;
import androidx.fragment.app.C0532d;
import com.bamtechmedia.dominguez.analytics.C2378m;
import com.bamtechmedia.dominguez.analytics.C2413n;
import com.bamtechmedia.dominguez.analytics.p057o0.C2433b;
import com.bamtechmedia.dominguez.auth.p061o0.p063i.C2755d;
import com.bamtechmedia.dominguez.core.design.widgets.C5667d;
import com.bamtechmedia.dominguez.core.design.widgets.DisneyTitleToolbar;
import com.bamtechmedia.dominguez.core.design.widgets.DisneyTitleToolbar.C5621c;
import com.bamtechmedia.dominguez.core.design.widgets.LoadingButton;
import com.bamtechmedia.dominguez.core.design.widgets.OnboardingToolbar;
import com.bamtechmedia.dominguez.core.design.widgets.textinputlayout.C5704a;
import com.bamtechmedia.dominguez.core.design.widgets.textinputlayout.FieldInputLayout;
import com.bamtechmedia.dominguez.core.design.widgets.textinputlayout.PasswordInputLayout;
import com.bamtechmedia.dominguez.core.framework.C5755i;
import com.bamtechmedia.dominguez.core.utils.C5833g;
import com.bamtechmedia.dominguez.core.utils.C5837i;
import com.bamtechmedia.dominguez.core.utils.C5843l;
import com.bamtechmedia.dominguez.core.utils.C5880u;
import java.util.HashMap;
import kotlin.C12907r;
import kotlin.C13142s;
import kotlin.C13145v;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12880j;
import kotlin.jvm.internal.C12881k;
import p096e.p121h.p122j.C4025a;
import p096e.p121h.p135s.C4127b0;
import p163g.p201e.p203b.p204d.C5409m0;
import p163g.p201e.p203b.p204d.C5411n0;
import p163g.p201e.p203b.p204d.C5413o0;
import p163g.p201e.p203b.p204d.C5415p0;
import p163g.p201e.p203b.p204d.p205v0.C5468e.C5474e;
import p163g.p201e.p203b.p312q.C7717x;
import p512h.p513c.p514k.C11890i;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 62\u00020\u00012\u00020\u00022\u00020\u0003:\u00016B\u0005¢\u0006\u0002\u0010\u0004J\b\u0010!\u001a\u00020\"H\u0016J\b\u0010#\u001a\u00020$H\u0002J$\u0010%\u001a\u00020\u00102\u0006\u0010&\u001a\u00020'2\b\u0010(\u001a\u0004\u0018\u00010)2\b\u0010*\u001a\u0004\u0018\u00010+H\u0016J\b\u0010,\u001a\u00020$H\u0016J\b\u0010-\u001a\u00020$H\u0016J\u001a\u0010.\u001a\u00020$2\u0006\u0010/\u001a\u00020\u00102\b\u0010*\u001a\u0004\u0018\u00010+H\u0016J\b\u00100\u001a\u00020$H\u0002J\u0012\u00101\u001a\u00020$2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u0002J\b\u00102\u001a\u00020$H\u0002J\u0010\u00103\u001a\u00020$2\u0006\u00104\u001a\u000205H\u0002R\u001e\u0010\u0005\u001a\u00020\u00068\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u0013\u0010\u000b\u001a\u0004\u0018\u00010\f8F¢\u0006\u0006\u001a\u0004\b\r\u0010\u000eR\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u000e¢\u0006\u0002\n\u0000R\u001e\u0010\u0011\u001a\u00020\u00128\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u0010\u0010\u0017\u001a\u0004\u0018\u00010\u0018X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0019\u001a\u0004\u0018\u00010\u001aX\u000e¢\u0006\u0002\n\u0000R\u001e\u0010\u001b\u001a\u00020\u001c8\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 ¨\u00067"}, mo31007d2 = {"Lcom/bamtechmedia/dominguez/account/email/ChangeEmailFragment;", "Ldagger/android/support/DaggerFragment;", "Lcom/bamtechmedia/dominguez/analytics/AnalyticsStateProvider;", "Lcom/bamtechmedia/dominguez/globalnav/HideNavMenu;", "()V", "analytics", "Lcom/bamtechmedia/dominguez/account/email/ChangeEmailAnalytics;", "getAnalytics", "()Lcom/bamtechmedia/dominguez/account/email/ChangeEmailAnalytics;", "setAnalytics", "(Lcom/bamtechmedia/dominguez/account/email/ChangeEmailAnalytics;)V", "currentEmail", "", "getCurrentEmail", "()Ljava/lang/String;", "forgotPassword", "Landroid/view/View;", "otpRouter", "Lcom/bamtechmedia/dominguez/auth/api/router/OtpRouter;", "getOtpRouter", "()Lcom/bamtechmedia/dominguez/auth/api/router/OtpRouter;", "setOtpRouter", "(Lcom/bamtechmedia/dominguez/auth/api/router/OtpRouter;)V", "passwordInputLayout", "Lcom/bamtechmedia/dominguez/core/design/widgets/textinputlayout/PasswordInputLayout;", "saveActionProvider", "Lcom/bamtechmedia/dominguez/core/design/widgets/SaveButtonActionProvider;", "viewModel", "Lcom/bamtechmedia/dominguez/account/email/ChangeEmailViewModel;", "getViewModel", "()Lcom/bamtechmedia/dominguez/account/email/ChangeEmailViewModel;", "setViewModel", "(Lcom/bamtechmedia/dominguez/account/email/ChangeEmailViewModel;)V", "getAnalyticsSection", "Lcom/bamtechmedia/dominguez/analytics/AnalyticsSection;", "initializeViews", "", "onCreateView", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onStart", "onStop", "onViewCreated", "view", "setToolbar", "setupCurrentEmailView", "submitNewEmailAndPassword", "updateViewState", "newState", "Lcom/bamtechmedia/dominguez/account/email/ChangeEmailViewModel$State;", "Companion", "account_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* renamed from: g.e.b.d.v0.c */
/* compiled from: ChangeEmailFragment.kt */
public final class C5449c extends C11890i implements C2413n, C7717x {

    /* renamed from: b0 */
    public static final C5450a f12960b0 = new C5450a(null);

    /* renamed from: U */
    public C5468e f12961U;

    /* renamed from: V */
    public C5448b f12962V;

    /* renamed from: W */
    public C2755d f12963W;
    /* access modifiers changed from: private */

    /* renamed from: X */
    public C5667d f12964X;
    /* access modifiers changed from: private */

    /* renamed from: Y */
    public PasswordInputLayout f12965Y;
    /* access modifiers changed from: private */

    /* renamed from: Z */
    public View f12966Z;

    /* renamed from: a0 */
    private HashMap f12967a0;

    /* renamed from: g.e.b.d.v0.c$a */
    /* compiled from: ChangeEmailFragment.kt */
    public static final class C5450a {
        private C5450a() {
        }

        /* renamed from: a */
        public final C5449c mo17195a(String str) {
            C5449c cVar = new C5449c();
            cVar.setArguments(C5833g.m18829a(C12907r.m40244a("currentEmail", str)));
            return cVar;
        }

        public /* synthetic */ C5450a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, mo31007d2 = {"setupPasswordInput", "", "invoke"}, mo31008k = 3, mo31009mv = {1, 1, 15})
    /* renamed from: g.e.b.d.v0.c$b */
    /* compiled from: ChangeEmailFragment.kt */
    static final class C5451b extends C12881k implements Function0<C13145v> {

        /* renamed from: c */
        final /* synthetic */ C5449c f12968c;

        /* renamed from: g.e.b.d.v0.c$b$a */
        /* compiled from: ChangeEmailFragment.kt */
        static final class C5452a extends C12881k implements Function1<String, C13145v> {

            /* renamed from: c */
            final /* synthetic */ C5451b f12969c;

            C5452a(C5451b bVar) {
                this.f12969c = bVar;
                super(1);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((String) obj);
                return C13145v.f29587a;
            }

            public final void invoke(String str) {
                this.f12969c.f12968c.m18228s();
            }
        }

        /* renamed from: g.e.b.d.v0.c$b$b */
        /* compiled from: ChangeEmailFragment.kt */
        static final class C5453b extends C12881k implements Function1<String, C13145v> {

            /* renamed from: c */
            final /* synthetic */ C5451b f12970c;

            C5453b(C5451b bVar) {
                this.f12970c = bVar;
                super(1);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((String) obj);
                return C13145v.f29587a;
            }

            public final void invoke(String str) {
                this.f12970c.f12968c.getViewModel().mo17208c(str);
            }
        }

        /* renamed from: g.e.b.d.v0.c$b$c */
        /* compiled from: ChangeEmailFragment.kt */
        static final class C5454c extends C12881k implements Function0<C13145v> {

            /* renamed from: c */
            final /* synthetic */ C5451b f12971c;

            C5454c(C5451b bVar) {
                this.f12971c = bVar;
                super(0);
            }

            public final void invoke() {
                this.f12971c.f12968c.mo17193o().mo17188d();
            }
        }

        C5451b(C5449c cVar) {
            this.f12968c = cVar;
            super(0);
        }

        public final void invoke() {
            PasswordInputLayout b = this.f12968c.f12965Y;
            if (b != null) {
                b.setInputTextValue(this.f12968c.getViewModel().mo17210z());
            }
            PasswordInputLayout b2 = this.f12968c.f12965Y;
            if (b2 != null) {
                C5704a.m18600a(b2, new C5452a(this), new C5453b(this), C13183n.m40498a((ConstraintLayout) this.f12968c._$_findCachedViewById(C5411n0.changeEmailLayout)), false, 8, null);
            }
            PasswordInputLayout b3 = this.f12968c.f12965Y;
            if (b3 != null) {
                PasswordInputLayout.m18589a(b3, false, new C5454c(this), 1, null);
            }
        }
    }

    @Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, mo31007d2 = {"setupNewEmailInput", "", "invoke"}, mo31008k = 3, mo31009mv = {1, 1, 15})
    /* renamed from: g.e.b.d.v0.c$c */
    /* compiled from: ChangeEmailFragment.kt */
    static final class C5455c extends C12881k implements Function0<C13145v> {

        /* renamed from: c */
        final /* synthetic */ C5449c f12972c;

        /* renamed from: g.e.b.d.v0.c$c$a */
        /* compiled from: ChangeEmailFragment.kt */
        static final class C5456a extends C12881k implements Function1<String, C13145v> {

            /* renamed from: c */
            final /* synthetic */ C5455c f12973c;

            C5456a(C5455c cVar) {
                this.f12973c = cVar;
                super(1);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((String) obj);
                return C13145v.f29587a;
            }

            public final void invoke(String str) {
                PasswordInputLayout b = this.f12973c.f12972c.f12965Y;
                if (b != null) {
                    b.requestFocus();
                }
            }
        }

        /* renamed from: g.e.b.d.v0.c$c$b */
        /* compiled from: ChangeEmailFragment.kt */
        static final class C5457b extends C12881k implements Function1<String, C13145v> {

            /* renamed from: c */
            final /* synthetic */ C5455c f12974c;

            C5457b(C5455c cVar) {
                this.f12974c = cVar;
                super(1);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((String) obj);
                return C13145v.f29587a;
            }

            public final void invoke(String str) {
                this.f12974c.f12972c.getViewModel().mo17207b(str);
            }
        }

        C5455c(C5449c cVar) {
            this.f12972c = cVar;
            super(0);
        }

        public final void invoke() {
            ((FieldInputLayout) this.f12972c._$_findCachedViewById(C5411n0.newEmailInput)).setInputTextValue(this.f12972c.getViewModel().mo17209y());
            C5704a.m18600a((FieldInputLayout) this.f12972c._$_findCachedViewById(C5411n0.newEmailInput), new C5456a(this), new C5457b(this), C13183n.m40498a((ConstraintLayout) this.f12972c._$_findCachedViewById(C5411n0.changeEmailLayout)), false, 8, null);
            Context requireContext = this.f12972c.requireContext();
            C12880j.m40222a((Object) requireContext, "requireContext()");
            if (!C5837i.m18843e(requireContext)) {
                FieldInputLayout fieldInputLayout = (FieldInputLayout) this.f12972c._$_findCachedViewById(C5411n0.newEmailInput);
                String a = C5880u.m18936a(C5415p0.email_new);
                if (a != null) {
                    String lowerCase = a.toLowerCase();
                    C12880j.m40222a((Object) lowerCase, "(this as java.lang.String).toLowerCase()");
                    fieldInputLayout.setTitle(C12832w.m40125f(lowerCase));
                    return;
                }
                throw new C13142s("null cannot be cast to non-null type java.lang.String");
            }
        }
    }

    @Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, mo31007d2 = {"setupForgotPasswordButton", "", "invoke"}, mo31008k = 3, mo31009mv = {1, 1, 15})
    /* renamed from: g.e.b.d.v0.c$d */
    /* compiled from: ChangeEmailFragment.kt */
    static final class C5458d extends C12881k implements Function0<C13145v> {

        /* renamed from: c */
        final /* synthetic */ C5449c f12975c;

        /* renamed from: g.e.b.d.v0.c$d$a */
        /* compiled from: ChangeEmailFragment.kt */
        static final class C5459a implements OnClickListener {

            /* renamed from: c */
            final /* synthetic */ C5458d f12976c;

            C5459a(C5458d dVar) {
                this.f12976c = dVar;
            }

            public final void onClick(View view) {
                this.f12976c.f12975c.mo17193o().mo17187c();
                this.f12976c.f12975c.getViewModel().mo17205A();
            }
        }

        C5458d(C5449c cVar) {
            this.f12975c = cVar;
            super(0);
        }

        public final void invoke() {
            View a = this.f12975c.f12966Z;
            if (a != null) {
                a.setOnClickListener(new C5459a(this));
            }
        }
    }

    /* renamed from: g.e.b.d.v0.c$e */
    /* compiled from: ChangeEmailFragment.kt */
    static final class C5460e implements OnClickListener {

        /* renamed from: c */
        final /* synthetic */ C5449c f12977c;

        C5460e(C5449c cVar) {
            this.f12977c = cVar;
        }

        public final void onClick(View view) {
            this.f12977c.m18228s();
        }
    }

    /* renamed from: g.e.b.d.v0.c$f */
    /* compiled from: ChangeEmailFragment.kt */
    static final class C5461f extends C12881k implements Function1<C5474e, C13145v> {

        /* renamed from: c */
        final /* synthetic */ C5449c f12978c;

        C5461f(C5449c cVar) {
            this.f12978c = cVar;
            super(1);
        }

        /* renamed from: a */
        public final void mo17202a(C5474e eVar) {
            this.f12978c.m18221a(eVar);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo17202a((C5474e) obj);
            return C13145v.f29587a;
        }
    }

    /* renamed from: g.e.b.d.v0.c$g */
    /* compiled from: ChangeEmailFragment.kt */
    static final class C5462g extends C12881k implements Function0<C13145v> {

        /* renamed from: c */
        final /* synthetic */ C5449c f12979c;

        C5462g(C5449c cVar) {
            this.f12979c = cVar;
            super(0);
        }

        public final void invoke() {
            this.f12979c.m18228s();
        }
    }

    /* renamed from: g.e.b.d.v0.c$h */
    /* compiled from: ChangeEmailFragment.kt */
    static final class C5463h extends C12881k implements Function0<C13145v> {

        /* renamed from: c */
        final /* synthetic */ C5449c f12980c;

        C5463h(C5449c cVar) {
            this.f12980c = cVar;
            super(0);
        }

        public final void invoke() {
            this.f12980c.mo17193o().mo17185a();
            this.f12980c.requireFragmentManager().mo3161g();
        }
    }

    /* renamed from: g.e.b.d.v0.c$i */
    /* compiled from: ChangeEmailFragment.kt */
    static final class C5464i extends C12881k implements Function0<C13145v> {

        /* renamed from: c */
        final /* synthetic */ C5449c f12981c;

        C5464i(C5449c cVar) {
            this.f12981c = cVar;
            super(0);
        }

        public final void invoke() {
            this.f12981c.mo17193o().mo17185a();
            this.f12981c.requireFragmentManager().mo3161g();
        }
    }

    /* renamed from: g.e.b.d.v0.c$j */
    /* compiled from: ChangeEmailFragment.kt */
    static final class C5465j extends C12881k implements Function1<Boolean, C13145v> {

        /* renamed from: c */
        final /* synthetic */ C5449c f12982c;

        C5465j(C5449c cVar) {
            this.f12982c = cVar;
            super(1);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke(((Boolean) obj).booleanValue());
            return C13145v.f29587a;
        }

        public final void invoke(boolean z) {
            C5667d c = this.f12982c.f12964X;
            if (c != null) {
                c.mo17490a(z);
            }
            ProgressBar progressBar = (ProgressBar) this.f12982c._$_findCachedViewById(C5411n0.progressBar);
            if (progressBar != null) {
                C4127b0.m14131b(progressBar, z);
            }
            PasswordInputLayout b = this.f12982c.f12965Y;
            if (b != null) {
                b.mo17570a(!z);
            }
            ((FieldInputLayout) this.f12982c._$_findCachedViewById(C5411n0.newEmailInput)).mo17570a(!z);
            LoadingButton loadingButton = (LoadingButton) this.f12982c._$_findCachedViewById(C5411n0.saveLoadingButton);
            if (z) {
                if (loadingButton != null) {
                    loadingButton.mo17425a();
                }
            } else if (loadingButton != null) {
                loadingButton.mo17426b();
            }
            View a = this.f12982c.f12966Z;
            if (a != null) {
                a.setEnabled(!z);
            }
        }
    }

    /* renamed from: g.e.b.d.v0.c$k */
    /* compiled from: ChangeEmailFragment.kt */
    static final class C5466k extends C12881k implements Function1<C5474e, C13145v> {

        /* renamed from: c */
        final /* synthetic */ C5449c f12983c;

        C5466k(C5449c cVar) {
            this.f12983c = cVar;
            super(1);
        }

        /* renamed from: a */
        public final void mo17204a(C5474e eVar) {
            PasswordInputLayout b = this.f12983c.f12965Y;
            if (b != null) {
                b.mo2144c();
            }
            ((FieldInputLayout) this.f12983c._$_findCachedViewById(C5411n0.newEmailInput)).mo2144c();
            if (eVar.mo17218c() != null) {
                this.f12983c.mo17193o().mo17186b();
                ((FieldInputLayout) this.f12983c._$_findCachedViewById(C5411n0.newEmailInput)).mo17574a(eVar.mo17218c());
            }
            if (eVar.mo17219d() != null) {
                this.f12983c.mo17193o().mo17186b();
                PasswordInputLayout b2 = this.f12983c.f12965Y;
                if (b2 != null) {
                    String d = eVar.mo17219d();
                    if (d == null) {
                        d = "";
                    }
                    b2.mo17574a(d);
                }
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo17204a((C5474e) obj);
            return C13145v.f29587a;
        }
    }

    /* renamed from: q */
    private final void m18226q() {
        C5451b bVar = new C5451b(this);
        C5455c cVar = new C5455c(this);
        C5458d dVar = new C5458d(this);
        m18225e(mo17194p());
        LoadingButton loadingButton = (LoadingButton) _$_findCachedViewById(C5411n0.saveLoadingButton);
        if (loadingButton != null) {
            loadingButton.setOnClickListener(new C5460e(this));
        }
        LoadingButton loadingButton2 = (LoadingButton) _$_findCachedViewById(C5411n0.saveLoadingButton);
        if (loadingButton2 != null) {
            loadingButton2.setText(C5415p0.btn_save);
        }
        bVar.invoke();
        cVar.invoke();
        dVar.invoke();
    }

    /* renamed from: r */
    private final void m18227r() {
        OnboardingToolbar onboardingToolbar = (OnboardingToolbar) _$_findCachedViewById(C5411n0.changeEmailOnboardingToolbar);
        if (onboardingToolbar != null) {
            C0532d requireActivity = requireActivity();
            C12880j.m40222a((Object) requireActivity, "requireActivity()");
            onboardingToolbar.mo17459a(requireActivity, getView(), (NestedScrollView) _$_findCachedViewById(C5411n0.changeEmailScrollView), (ConstraintLayout) _$_findCachedViewById(C5411n0.changeEmailLayout), false, new C5464i(this));
        }
        OnboardingToolbar onboardingToolbar2 = (OnboardingToolbar) _$_findCachedViewById(C5411n0.changeEmailOnboardingToolbar);
        if (onboardingToolbar2 != null) {
            DisneyTitleToolbar disneyToolbar = onboardingToolbar2.getDisneyToolbar();
            if (disneyToolbar != null) {
                disneyToolbar.setTitle(C5880u.m18936a(C5415p0.email_change_title));
                disneyToolbar.mo17377a(C5880u.m18936a(C5415p0.btn_save), (Function0<C13145v>) new C5462g<C13145v>(this));
                disneyToolbar.mo17375a(C5621c.CLOSE_BUTTON, (Function0<C13145v>) new C5463h<C13145v>(this));
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: s */
    public final void m18228s() {
        PasswordInputLayout passwordInputLayout = this.f12965Y;
        if (passwordInputLayout != null) {
            C5843l.f13627a.mo17743a(passwordInputLayout);
        }
        C5448b bVar = this.f12962V;
        String str = null;
        if (bVar != null) {
            bVar.mo17189e();
            C5468e eVar = this.f12961U;
            if (eVar != null) {
                String inputTextValue = ((FieldInputLayout) _$_findCachedViewById(C5411n0.newEmailInput)).getInputTextValue();
                String str2 = "";
                if (inputTextValue == null) {
                    inputTextValue = str2;
                }
                PasswordInputLayout passwordInputLayout2 = this.f12965Y;
                if (passwordInputLayout2 != null) {
                    str = passwordInputLayout2.getInputTextValue();
                }
                if (str == null) {
                    str = str2;
                }
                eVar.mo17206a(inputTextValue, str);
                return;
            }
            C12880j.m40227c("viewModel");
            throw null;
        }
        C12880j.m40227c("analytics");
        throw null;
    }

    public void _$_clearFindViewByIdCache() {
        HashMap hashMap = this.f12967a0;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    public View _$_findCachedViewById(int i) {
        if (this.f12967a0 == null) {
            this.f12967a0 = new HashMap();
        }
        View view = (View) this.f12967a0.get(Integer.valueOf(i));
        if (view == null) {
            View view2 = getView();
            if (view2 == null) {
                return null;
            }
            view = view2.findViewById(i);
            this.f12967a0.put(Integer.valueOf(i), view);
        }
        return view;
    }

    /* renamed from: e */
    public C2378m mo11534e() {
        return new C2378m(C2433b.ACCOUNT_SETTINGS_CHANGE_EMAIL, (String) null, 2, (DefaultConstructorMarker) null);
    }

    public final C5468e getViewModel() {
        C5468e eVar = this.f12961U;
        if (eVar != null) {
            return eVar;
        }
        C12880j.m40227c("viewModel");
        throw null;
    }

    /* renamed from: o */
    public final C5448b mo17193o() {
        C5448b bVar = this.f12962V;
        if (bVar != null) {
            return bVar;
        }
        C12880j.m40227c("analytics");
        throw null;
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(C5413o0.fragment_account_change_email, viewGroup, false);
        this.f12966Z = inflate.findViewById(C5411n0.forgotPassword);
        C12880j.m40222a((Object) inflate, "view");
        return inflate;
    }

    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        _$_clearFindViewByIdCache();
    }

    public void onStart() {
        super.onStart();
        m18227r();
        C5468e eVar = this.f12961U;
        if (eVar != null) {
            C5755i.m18679a(this, eVar, null, null, new C5461f(this), 6, null);
            return;
        }
        C12880j.m40227c("viewModel");
        throw null;
    }

    public void onStop() {
        OnboardingToolbar onboardingToolbar = (OnboardingToolbar) _$_findCachedViewById(C5411n0.changeEmailOnboardingToolbar);
        if (onboardingToolbar != null) {
            onboardingToolbar.setToolbarSet(false);
        }
        super.onStop();
    }

    public void onViewCreated(View view, Bundle bundle) {
        this.f12965Y = (PasswordInputLayout) view.findViewById(C5411n0.passwordInputLayout);
        m18226q();
    }

    /* renamed from: p */
    public final String mo17194p() {
        Bundle arguments = getArguments();
        if (arguments != null) {
            return arguments.getString("currentEmail");
        }
        return null;
    }

    /* renamed from: e */
    private final void m18225e(String str) {
        SpannableString spannableString;
        if (!(str == null || str.length() == 0)) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(C5880u.m18937a(C5415p0.email_current, C13170i0.m40332a(C12907r.m40244a("email", str))));
            int a = C12833x.m40132a((CharSequence) spannableStringBuilder, str, 0, false, 6, (Object) null);
            spannableStringBuilder.setSpan(new ForegroundColorSpan(C4025a.m13788a(requireContext(), C5409m0.vader_white)), a, str.length() + a, 34);
            spannableString = SpannableString.valueOf(spannableStringBuilder);
            C12880j.m40222a((Object) spannableString, "SpannableString.valueOf(this)");
        } else {
            spannableString = null;
        }
        if (spannableString != null) {
            TextView textView = (TextView) _$_findCachedViewById(C5411n0.current_email);
            C12880j.m40222a((Object) textView, "current_email");
            textView.setText(spannableString);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final void m18221a(C5474e eVar) {
        C5465j jVar = new C5465j(this);
        C5466k kVar = new C5466k(this);
        jVar.invoke(eVar.mo17220e());
        m18225e(eVar.mo17217b());
        if (eVar.mo17216a()) {
            C5667d dVar = this.f12964X;
            if (dVar != null) {
                dVar.mo17490a(false);
            }
            requireFragmentManager().mo3161g();
            return;
        }
        kVar.mo17204a(eVar);
    }
}
