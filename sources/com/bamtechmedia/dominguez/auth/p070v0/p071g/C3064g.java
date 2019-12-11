package com.bamtechmedia.dominguez.auth.p070v0.p071g;

import android.app.Activity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import androidx.core.widget.NestedScrollView;
import androidx.fragment.app.C0532d;
import androidx.fragment.app.C0538i;
import com.bamtechmedia.dominguez.analytics.C2378m;
import com.bamtechmedia.dominguez.analytics.C2413n;
import com.bamtechmedia.dominguez.analytics.p057o0.C2433b;
import com.bamtechmedia.dominguez.auth.C2716h0;
import com.bamtechmedia.dominguez.auth.C2718i0;
import com.bamtechmedia.dominguez.auth.C2721j0;
import com.bamtechmedia.dominguez.auth.p070v0.p071g.C3077i.C3081c;
import com.bamtechmedia.dominguez.core.C3796d;
import com.bamtechmedia.dominguez.core.design.widgets.LoadingButton;
import com.bamtechmedia.dominguez.core.design.widgets.OnboardingToolbar;
import com.bamtechmedia.dominguez.core.design.widgets.textinputlayout.C5704a;
import com.bamtechmedia.dominguez.core.design.widgets.textinputlayout.FieldInputLayout;
import com.bamtechmedia.dominguez.core.framework.C5755i;
import com.bamtechmedia.dominguez.core.utils.C5823d;
import com.bamtechmedia.dominguez.core.utils.C5833g;
import com.bamtechmedia.dominguez.core.utils.C5839j;
import com.bamtechmedia.dominguez.core.utils.C5843l;
import com.bamtechmedia.dominguez.core.utils.C5880u;
import java.util.HashMap;
import kotlin.C12907r;
import kotlin.C13145v;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12880j;
import kotlin.jvm.internal.C12881k;
import kotlin.jvm.internal.C12890t;
import kotlin.jvm.internal.C12891u;
import kotlin.jvm.internal.C12895y;
import kotlin.reflect.KProperty;
import p096e.p121h.p135s.C4127b0;
import p163g.p201e.p203b.p299m.C7536a;
import p163g.p201e.p203b.p299m.C7536a.C7538b;
import p163g.p201e.p203b.p299m.C7543f.C7544a;
import p163g.p201e.p203b.p299m.C7547h;
import p163g.p201e.p203b.p307o.p308p.C7629c;
import p512h.p513c.p514k.C11890i;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u0000 M2\u00020\u00012\u00020\u00022\u00020\u0003:\u0001MB\u0005¢\u0006\u0002\u0010\u0004J\b\u00102\u001a\u000203H\u0016J\u0010\u00104\u001a\u0002052\u0006\u00106\u001a\u000207H\u0002J\b\u00108\u001a\u000205H\u0002J\u0018\u00109\u001a\u00020\u000e2\u0006\u0010:\u001a\u00020;2\u0006\u0010<\u001a\u00020;H\u0016J&\u0010=\u001a\u0004\u0018\u00010\f2\u0006\u0010>\u001a\u00020?2\b\u0010@\u001a\u0004\u0018\u00010A2\b\u0010B\u001a\u0004\u0018\u00010CH\u0016J\b\u0010D\u001a\u000205H\u0016J\b\u0010E\u001a\u000205H\u0016J\u001a\u0010F\u001a\u0002052\u0006\u0010G\u001a\u00020\f2\b\u0010B\u001a\u0004\u0018\u00010CH\u0016J\u0010\u0010H\u001a\u0002052\u0006\u0010I\u001a\u000207H\u0002J\u0010\u0010J\u001a\u0002052\u0006\u00106\u001a\u000207H\u0002J\u0010\u0010K\u001a\u0002052\u0006\u0010L\u001a\u00020\u000eH\u0002R\u001e\u0010\u0005\u001a\u00020\u00068\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fX\u000e¢\u0006\u0002\n\u0000R\u001b\u0010\r\u001a\u00020\u000e8BX\u0002¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u000f\u0010\u0010R\u0010\u0010\u0013\u001a\u0004\u0018\u00010\u0014X\u000e¢\u0006\u0002\n\u0000R\u001e\u0010\u0015\u001a\u00020\u00168\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u0010\u0010\u001b\u001a\u0004\u0018\u00010\u001cX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u001d\u001a\u0004\u0018\u00010\u001eX\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u001f\u001a\u00020\u000e8BX\u0004¢\u0006\u0006\u001a\u0004\b\u001f\u0010\u0010R\u001e\u0010 \u001a\u00020!8\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%R\u001e\u0010&\u001a\u00020'8\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b(\u0010)\"\u0004\b*\u0010+R\u001e\u0010,\u001a\u00020-8\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b.\u0010/\"\u0004\b0\u00101¨\u0006N"}, mo31007d2 = {"Lcom/bamtechmedia/dominguez/auth/validation/login/LoginEmailFragment;", "Ldagger/android/support/DaggerFragment;", "Lcom/bamtechmedia/dominguez/analytics/AnalyticsStateProvider;", "Lcom/bamtechmedia/dominguez/dialogs/AlertDialogCallback;", "()V", "analytics", "Lcom/bamtechmedia/dominguez/auth/validation/login/LoginEmailAnalytics;", "getAnalytics", "()Lcom/bamtechmedia/dominguez/auth/validation/login/LoginEmailAnalytics;", "setAnalytics", "(Lcom/bamtechmedia/dominguez/auth/validation/login/LoginEmailAnalytics;)V", "backButton", "Landroid/view/View;", "canSignUp", "", "getCanSignUp", "()Z", "canSignUp$delegate", "Lcom/bamtechmedia/dominguez/core/utils/BooleanFragmentArgumentDelegate;", "continueLoadingButton", "Lcom/bamtechmedia/dominguez/core/design/widgets/LoadingButton;", "dialogRouter", "Lcom/bamtechmedia/dominguez/dialogs/DialogRouter;", "getDialogRouter", "()Lcom/bamtechmedia/dominguez/dialogs/DialogRouter;", "setDialogRouter", "(Lcom/bamtechmedia/dominguez/dialogs/DialogRouter;)V", "emailInputLayout", "Lcom/bamtechmedia/dominguez/core/design/widgets/textinputlayout/FieldInputLayout;", "isNotFoundErrorMessage", "", "isOnline", "offlineRouter", "Lcom/bamtechmedia/dominguez/error/api/OfflineRouter;", "getOfflineRouter", "()Lcom/bamtechmedia/dominguez/error/api/OfflineRouter;", "setOfflineRouter", "(Lcom/bamtechmedia/dominguez/error/api/OfflineRouter;)V", "offlineState", "Lcom/bamtechmedia/dominguez/core/OfflineState;", "getOfflineState", "()Lcom/bamtechmedia/dominguez/core/OfflineState;", "setOfflineState", "(Lcom/bamtechmedia/dominguez/core/OfflineState;)V", "viewModel", "Lcom/bamtechmedia/dominguez/auth/validation/login/LoginEmailViewModel;", "getViewModel", "()Lcom/bamtechmedia/dominguez/auth/validation/login/LoginEmailViewModel;", "setViewModel", "(Lcom/bamtechmedia/dominguez/auth/validation/login/LoginEmailViewModel;)V", "getAnalyticsSection", "Lcom/bamtechmedia/dominguez/analytics/AnalyticsSection;", "handleNotFoundErrorState", "", "newState", "Lcom/bamtechmedia/dominguez/auth/validation/login/LoginEmailViewModel$ViewState;", "initializeViews", "onAlertDialogAction", "requestId", "", "which", "onCreateView", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onStart", "onStop", "onViewCreated", "view", "renderViewState", "viewState", "showError", "showLoading", "isLoading", "Companion", "auth_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* renamed from: com.bamtechmedia.dominguez.auth.v0.g.g */
/* compiled from: LoginEmailFragment.kt */
public final class C3064g extends C11890i implements C2413n, C7536a {

    /* renamed from: f0 */
    static final /* synthetic */ KProperty[] f7938f0 = {C12895y.m40235a((C12890t) new C12891u(C12895y.m40230a(C3064g.class), "canSignUp", "getCanSignUp()Z"))};

    /* renamed from: g0 */
    public static final C3065a f7939g0 = new C3065a(null);

    /* renamed from: U */
    public C3077i f7940U;

    /* renamed from: V */
    public C3058c f7941V;

    /* renamed from: W */
    public C7629c f7942W;

    /* renamed from: X */
    public C7547h f7943X;

    /* renamed from: Y */
    public C3796d f7944Y;

    /* renamed from: Z */
    private View f7945Z;

    /* renamed from: a0 */
    private String f7946a0;
    /* access modifiers changed from: private */

    /* renamed from: b0 */
    public FieldInputLayout f7947b0;
    /* access modifiers changed from: private */

    /* renamed from: c0 */
    public LoadingButton f7948c0;

    /* renamed from: d0 */
    private final C5823d f7949d0 = C5839j.m18846a("can_sign_up", Boolean.valueOf(true));

    /* renamed from: e0 */
    private HashMap f7950e0;

    /* renamed from: com.bamtechmedia.dominguez.auth.v0.g.g$a */
    /* compiled from: LoginEmailFragment.kt */
    public static final class C3065a {
        private C3065a() {
        }

        /* renamed from: a */
        public final C3064g mo12094a(boolean z) {
            C3064g gVar = new C3064g();
            gVar.setArguments(C5833g.m18829a(C12907r.m40244a("can_sign_up", Boolean.valueOf(z))));
            return gVar;
        }

        public /* synthetic */ C3065a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: com.bamtechmedia.dominguez.auth.v0.g.g$b */
    /* compiled from: LoginEmailFragment.kt */
    static final class C3066b extends C12881k implements Function0<C13145v> {

        /* renamed from: c */
        final /* synthetic */ C3064g f7951c;

        C3066b(C3064g gVar) {
            this.f7951c = gVar;
            super(0);
        }

        public final void invoke() {
            TextView textView = (TextView) this.f7951c._$_findCachedViewById(C2716h0.newUserText);
            if (textView != null) {
                C5880u.m18941a(textView, C2721j0.new_to_disney);
            }
        }
    }

    @Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, mo31007d2 = {"setupEmailInput", "", "invoke"}, mo31008k = 3, mo31009mv = {1, 1, 15})
    /* renamed from: com.bamtechmedia.dominguez.auth.v0.g.g$c */
    /* compiled from: LoginEmailFragment.kt */
    static final class C3067c extends C12881k implements Function0<C13145v> {

        /* renamed from: c */
        final /* synthetic */ C3064g f7952c;

        /* renamed from: com.bamtechmedia.dominguez.auth.v0.g.g$c$a */
        /* compiled from: LoginEmailFragment.kt */
        static final class C3068a extends C12881k implements Function1<String, C13145v> {

            /* renamed from: c */
            final /* synthetic */ C3067c f7953c;

            C3068a(C3067c cVar) {
                this.f7953c = cVar;
                super(1);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((String) obj);
                return C13145v.f29587a;
            }

            public final void invoke(String str) {
                this.f7953c.f7952c.getViewModel().mo12100b(str);
            }
        }

        /* renamed from: com.bamtechmedia.dominguez.auth.v0.g.g$c$b */
        /* compiled from: LoginEmailFragment.kt */
        static final class C3069b extends C12881k implements Function1<String, C13145v> {

            /* renamed from: c */
            final /* synthetic */ C3067c f7954c;

            C3069b(C3067c cVar) {
                this.f7954c = cVar;
                super(1);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((String) obj);
                return C13145v.f29587a;
            }

            public final void invoke(String str) {
                this.f7954c.f7952c.getViewModel().mo12101c(str);
            }
        }

        C3067c(C3064g gVar) {
            this.f7952c = gVar;
            super(0);
        }

        public final void invoke() {
            FieldInputLayout b = this.f7952c.f7947b0;
            if (b != null) {
                b.setInputTextValue(this.f7952c.getViewModel().mo12103y());
            }
            FieldInputLayout b2 = this.f7952c.f7947b0;
            if (b2 != null) {
                C5704a.m18600a(b2, new C3068a(this), new C3069b(this), C13185o.m40520c((ConstraintLayout) this.f7952c._$_findCachedViewById(C2716h0.loginEmailContainer), (ConstraintLayout) this.f7952c._$_findCachedViewById(C2716h0.loginEmailLayout)), false, 8, null);
            }
        }
    }

    @Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, mo31007d2 = {"setupSignUpButton", "", "invoke"}, mo31008k = 3, mo31009mv = {1, 1, 15})
    /* renamed from: com.bamtechmedia.dominguez.auth.v0.g.g$d */
    /* compiled from: LoginEmailFragment.kt */
    static final class C3070d extends C12881k implements Function0<C13145v> {

        /* renamed from: c */
        final /* synthetic */ C3064g f7955c;

        /* renamed from: com.bamtechmedia.dominguez.auth.v0.g.g$d$a */
        /* compiled from: LoginEmailFragment.kt */
        static final class C3071a implements OnClickListener {

            /* renamed from: c */
            final /* synthetic */ C3070d f7956c;

            C3071a(C3070d dVar) {
                this.f7956c = dVar;
            }

            public final void onClick(View view) {
                this.f7956c.f7955c.mo12093o().mo12089c();
                C3077i viewModel = this.f7956c.f7955c.getViewModel();
                FieldInputLayout b = this.f7956c.f7955c.f7947b0;
                viewModel.mo12102d(b != null ? b.getInputTextValue() : null);
            }
        }

        C3070d(C3064g gVar) {
            this.f7955c = gVar;
            super(0);
        }

        public final void invoke() {
            TextView textView = (TextView) this.f7955c._$_findCachedViewById(C2716h0.signUpButton);
            if (textView != null) {
                C5880u.m18941a(textView, C2721j0.sign_up);
            }
            TextView textView2 = (TextView) this.f7955c._$_findCachedViewById(C2716h0.signUpButton);
            if (textView2 != null) {
                textView2.setOnClickListener(new C3071a(this));
            }
        }
    }

    @Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, mo31007d2 = {"setupContinueButton", "", "invoke"}, mo31008k = 3, mo31009mv = {1, 1, 15})
    /* renamed from: com.bamtechmedia.dominguez.auth.v0.g.g$e */
    /* compiled from: LoginEmailFragment.kt */
    static final class C3072e extends C12881k implements Function0<C13145v> {

        /* renamed from: c */
        final /* synthetic */ C3064g f7957c;

        /* renamed from: com.bamtechmedia.dominguez.auth.v0.g.g$e$a */
        /* compiled from: LoginEmailFragment.kt */
        static final class C3073a implements OnClickListener {

            /* renamed from: c */
            final /* synthetic */ C3072e f7958c;

            C3073a(C3072e eVar) {
                this.f7958c = eVar;
            }

            public final void onClick(View view) {
                this.f7958c.f7957c.mo12093o().mo12088b();
                FieldInputLayout b = this.f7958c.f7957c.f7947b0;
                if (b != null) {
                    b.mo2144c();
                }
                C3077i viewModel = this.f7958c.f7957c.getViewModel();
                FieldInputLayout b2 = this.f7958c.f7957c.f7947b0;
                viewModel.mo12100b(b2 != null ? b2.getInputTextValue() : null);
            }
        }

        C3072e(C3064g gVar) {
            this.f7957c = gVar;
            super(0);
        }

        public final void invoke() {
            LoadingButton a = this.f7957c.f7948c0;
            if (a != null) {
                a.setText(C2721j0.btn_continue);
            }
            LoadingButton a2 = this.f7957c.f7948c0;
            if (a2 != null) {
                a2.setOnClickListener(new C3073a(this));
            }
        }
    }

    /* renamed from: com.bamtechmedia.dominguez.auth.v0.g.g$f */
    /* compiled from: LoginEmailFragment.kt */
    static final class C3074f extends C12881k implements Function0<C13145v> {

        /* renamed from: c */
        final /* synthetic */ C3064g f7959c;

        C3074f(C3064g gVar) {
            this.f7959c = gVar;
            super(0);
        }

        public final void invoke() {
            this.f7959c.mo12093o().mo12087a();
            NestedScrollView nestedScrollView = (NestedScrollView) this.f7959c._$_findCachedViewById(C2716h0.loginScrollView);
            if (nestedScrollView != null) {
                C5843l.f13627a.mo17743a(nestedScrollView);
            }
            this.f7959c.requireActivity().onBackPressed();
        }
    }

    /* renamed from: com.bamtechmedia.dominguez.auth.v0.g.g$g */
    /* compiled from: LoginEmailFragment.kt */
    static final class C3075g extends C12881k implements Function1<C3081c, C13145v> {

        /* renamed from: c */
        final /* synthetic */ C3064g f7960c;

        C3075g(C3064g gVar) {
            this.f7960c = gVar;
            super(1);
        }

        /* renamed from: a */
        public final void mo12099a(C3081c cVar) {
            this.f7960c.m10875b(cVar);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo12099a((C3081c) obj);
            return C13145v.f29587a;
        }
    }

    /* renamed from: c */
    private final void m10876c(C3081c cVar) {
        FieldInputLayout fieldInputLayout = this.f7947b0;
        if (fieldInputLayout != null) {
            fieldInputLayout.mo2144c();
        }
        if (!cVar.mo12110c()) {
            return;
        }
        if (cVar.mo12108a() != null) {
            FieldInputLayout fieldInputLayout2 = this.f7947b0;
            if (fieldInputLayout2 != null) {
                fieldInputLayout2.mo17574a(cVar.mo12108a());
            }
        } else if (cVar.mo12109b() != null) {
            FieldInputLayout fieldInputLayout3 = this.f7947b0;
            if (fieldInputLayout3 != null) {
                fieldInputLayout3.mo17574a(C5880u.m18936a(cVar.mo12109b().intValue()));
            }
        }
    }

    /* renamed from: p */
    private final boolean m10877p() {
        return this.f7949d0.mo17732a(this, f7938f0[0]).booleanValue();
    }

    /* renamed from: q */
    private final void m10878q() {
        C3066b bVar = new C3066b(this);
        C3067c cVar = new C3067c(this);
        C3070d dVar = new C3070d(this);
        C3072e eVar = new C3072e(this);
        bVar.invoke();
        cVar.invoke();
        dVar.invoke();
        eVar.invoke();
    }

    /* renamed from: r */
    private final boolean m10879r() {
        C3796d dVar = this.f7944Y;
        if (dVar != null) {
            return dVar.mo13695j();
        }
        C12880j.m40227c("offlineState");
        throw null;
    }

    public void _$_clearFindViewByIdCache() {
        HashMap hashMap = this.f7950e0;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    public View _$_findCachedViewById(int i) {
        if (this.f7950e0 == null) {
            this.f7950e0 = new HashMap();
        }
        View view = (View) this.f7950e0.get(Integer.valueOf(i));
        if (view == null) {
            View view2 = getView();
            if (view2 == null) {
                return null;
            }
            view = view2.findViewById(i);
            this.f7950e0.put(Integer.valueOf(i), view);
        }
        return view;
    }

    /* renamed from: d */
    public boolean mo11888d() {
        return C7538b.m22446a(this);
    }

    /* renamed from: e */
    public C2378m mo11534e() {
        return new C2378m(C2433b.LOG_IN_ENTER_EMAIL, (String) null, 2, (DefaultConstructorMarker) null);
    }

    public final C3077i getViewModel() {
        C3077i iVar = this.f7940U;
        if (iVar != null) {
            return iVar;
        }
        C12880j.m40227c("viewModel");
        throw null;
    }

    /* renamed from: o */
    public final C3058c mo12093o() {
        C3058c cVar = this.f7941V;
        if (cVar != null) {
            return cVar;
        }
        C12880j.m40227c("analytics");
        throw null;
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(C2718i0.fragment_login_email, viewGroup, false);
    }

    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        _$_clearFindViewByIdCache();
    }

    public void onStart() {
        super.onStart();
        OnboardingToolbar onboardingToolbar = (OnboardingToolbar) _$_findCachedViewById(C2716h0.loginOnboardingToolbar);
        if (onboardingToolbar != null) {
            C0532d requireActivity = requireActivity();
            C12880j.m40222a((Object) requireActivity, "requireActivity()");
            OnboardingToolbar.m18500a(onboardingToolbar, requireActivity, getView(), (NestedScrollView) _$_findCachedViewById(C2716h0.loginScrollView), (ConstraintLayout) _$_findCachedViewById(C2716h0.loginEmailLayout), false, new C3074f(this), 16, null);
        }
        C3077i iVar = this.f7940U;
        if (iVar != null) {
            C5755i.m18679a(this, iVar, null, null, new C3075g(this), 6, null);
            return;
        }
        C12880j.m40227c("viewModel");
        throw null;
    }

    public void onStop() {
        OnboardingToolbar onboardingToolbar = (OnboardingToolbar) _$_findCachedViewById(C2716h0.loginOnboardingToolbar);
        if (onboardingToolbar != null) {
            onboardingToolbar.setToolbarSet(false);
        }
        super.onStop();
    }

    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.f7947b0 = (FieldInputLayout) view.findViewById(C2716h0.emailInputLayout);
        this.f7948c0 = (LoadingButton) view.findViewById(C2716h0.continueLoadingButton);
        m10878q();
        if (!m10879r()) {
            C0532d activity = getActivity();
            if (!(activity instanceof Activity)) {
                activity = null;
            }
            if (activity != null) {
                View currentFocus = activity.getCurrentFocus();
                if (currentFocus != null) {
                    C5843l.f13627a.mo17743a(currentFocus);
                }
            }
            C7629c cVar = this.f7942W;
            if (cVar != null) {
                int i = C2716h0.loginEmailContainer;
                C0538i childFragmentManager = getChildFragmentManager();
                C12880j.m40222a((Object) childFragmentManager, "childFragmentManager");
                cVar.mo20550a(i, childFragmentManager);
                return;
            }
            C12880j.m40227c("offlineRouter");
            throw null;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public final void m10875b(C3081c cVar) {
        m10873a(cVar.mo12112e());
        m10872a(cVar);
        m10876c(cVar);
        Group group = (Group) _$_findCachedViewById(C2716h0.newUserGroup);
        if (group != null) {
            C4127b0.m14131b(group, cVar.mo12111d() && m10877p());
        }
    }

    /* renamed from: a */
    private final void m10872a(C3081c cVar) {
        String str;
        Integer num = null;
        if (cVar.mo12114f()) {
            C7547h hVar = this.f7943X;
            if (hVar != null) {
                C7544a aVar = new C7544a();
                aVar.mo20473c("Log In - Email Not Recognized Modal : Try Again Click");
                aVar.mo20471b("Log In - Email Not Recognized Modal : Sign Up Click");
                aVar.mo20468a("Log In - Email Not Recognized Modal");
                aVar.mo20466a(C2716h0.email_not_found_message);
                aVar.mo20484i(Integer.valueOf(C2721j0.log_in_noaccount));
                Integer valueOf = Integer.valueOf(C2721j0.log_in_noaccount_subcopy);
                valueOf.intValue();
                boolean z = true;
                if (!(cVar.mo12111d() && m10877p())) {
                    valueOf = null;
                }
                aVar.mo20467a(valueOf);
                aVar.mo20480g(Integer.valueOf(C2721j0.btn_try_again));
                Integer valueOf2 = Integer.valueOf(C2721j0.btn_signup);
                valueOf2.intValue();
                if (!cVar.mo12111d() || !m10877p()) {
                    z = false;
                }
                if (z) {
                    num = valueOf2;
                }
                aVar.mo20472c(num);
                hVar.mo20491b(aVar.mo20465a());
                if (cVar.mo12108a() != null) {
                    str = cVar.mo12108a();
                } else if (cVar.mo12109b() != null) {
                    str = C5880u.m18936a(cVar.mo12109b().intValue());
                } else {
                    str = C5880u.m18936a(C2721j0.log_in_email_error_no_account);
                }
                this.f7946a0 = str;
                return;
            }
            C12880j.m40227c("dialogRouter");
            throw null;
        }
        this.f7946a0 = null;
    }

    /* renamed from: a */
    public boolean mo11887a(int i, int i2) {
        if (i != C2716h0.email_not_found_message) {
            return false;
        }
        if (i2 == -2) {
            C3058c cVar = this.f7941V;
            String str = null;
            if (cVar != null) {
                cVar.mo12089c();
                C3077i iVar = this.f7940U;
                if (iVar != null) {
                    FieldInputLayout fieldInputLayout = this.f7947b0;
                    if (fieldInputLayout != null) {
                        str = fieldInputLayout.getInputTextValue();
                    }
                    iVar.mo12102d(str);
                } else {
                    C12880j.m40227c("viewModel");
                    throw null;
                }
            } else {
                C12880j.m40227c("analytics");
                throw null;
            }
        } else if (i2 == -1) {
            FieldInputLayout fieldInputLayout2 = this.f7947b0;
            if (fieldInputLayout2 != null) {
                String str2 = this.f7946a0;
                if (str2 == null) {
                    str2 = C5880u.m18936a(C2721j0.log_in_noaccount);
                }
                fieldInputLayout2.mo17574a(str2);
            }
        }
        return true;
    }

    /* renamed from: a */
    private final void m10873a(boolean z) {
        if (z) {
            C0532d activity = getActivity();
            if (!(activity instanceof Activity)) {
                activity = null;
            }
            if (activity != null) {
                View currentFocus = activity.getCurrentFocus();
                if (currentFocus != null) {
                    C5843l.f13627a.mo17743a(currentFocus);
                }
            }
        }
        LoadingButton loadingButton = this.f7948c0;
        if (z) {
            if (loadingButton != null) {
                loadingButton.mo17425a();
            }
        } else if (loadingButton != null) {
            loadingButton.mo17426b();
        }
        FieldInputLayout fieldInputLayout = this.f7947b0;
        if (fieldInputLayout != null) {
            fieldInputLayout.mo17570a(!z);
        }
        TextView textView = (TextView) _$_findCachedViewById(C2716h0.signUpButton);
        if (textView != null) {
            textView.setEnabled(!z);
        }
        View view = this.f7945Z;
        if (view != null) {
            view.setEnabled(!z);
        }
    }
}
