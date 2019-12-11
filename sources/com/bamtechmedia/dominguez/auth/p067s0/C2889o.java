package com.bamtechmedia.dominguez.auth.p067s0;

import android.app.Activity;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.Editable;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnFocusChangeListener;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.TextView.OnEditorActionListener;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import androidx.core.graphics.drawable.C0492a;
import androidx.core.widget.NestedScrollView;
import androidx.fragment.app.C0532d;
import androidx.fragment.app.C0538i;
import com.bamtechmedia.dominguez.analytics.C2378m;
import com.bamtechmedia.dominguez.analytics.C2413n;
import com.bamtechmedia.dominguez.auth.C2711f0;
import com.bamtechmedia.dominguez.auth.C2714g0;
import com.bamtechmedia.dominguez.auth.C2716h0;
import com.bamtechmedia.dominguez.auth.C2718i0;
import com.bamtechmedia.dominguez.auth.C2721j0;
import com.bamtechmedia.dominguez.auth.p067s0.C2901o0.C2903b;
import com.bamtechmedia.dominguez.core.C3796d;
import com.bamtechmedia.dominguez.core.design.widgets.DisneyTitleToolbar;
import com.bamtechmedia.dominguez.core.design.widgets.LoadingButton;
import com.bamtechmedia.dominguez.core.design.widgets.OnboardingToolbar;
import com.bamtechmedia.dominguez.core.design.widgets.textinputlayout.CustomPinEntryEditText;
import com.bamtechmedia.dominguez.core.design.widgets.textinputlayout.CustomPinEntryEditText.C5697e;
import com.bamtechmedia.dominguez.core.framework.C5755i;
import com.bamtechmedia.dominguez.core.utils.C5833g;
import com.bamtechmedia.dominguez.core.utils.C5843l;
import com.bamtechmedia.dominguez.core.utils.C5880u;
import kotlin.C12907r;
import kotlin.C13145v;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.C12881k;
import p096e.p121h.p122j.C4025a;
import p096e.p121h.p135s.C4127b0;
import p163g.p201e.p203b.p299m.C7536a;
import p163g.p201e.p203b.p307o.p308p.C7629c;
import p163g.p201e.p203b.p307o.p308p.C7630d;
import p163g.p201e.p203b.p316t.C7773b;
import p512h.p513c.p514k.C11890i;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000 \u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\r\n\u0002\b\u000e\b&\u0018\u0000 X2\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u0005:\u0001XB\u0005¢\u0006\u0002\u0010\u0006J\u0010\u00108\u001a\u0002092\u0006\u0010:\u001a\u00020;H&J\u0018\u0010<\u001a\u00020!2\u0006\u0010=\u001a\u00020>2\u0006\u0010?\u001a\u00020>H\u0016J\b\u0010@\u001a\u00020!H\u0016J$\u0010A\u001a\u00020B2\u0006\u0010C\u001a\u00020D2\b\u0010E\u001a\u0004\u0018\u00010F2\b\u0010G\u001a\u0004\u0018\u00010HH\u0016J\u0012\u0010I\u001a\u0002092\b\u0010J\u001a\u0004\u0018\u00010KH\u0016J\b\u0010L\u001a\u000209H\u0016J\b\u0010M\u001a\u000209H\u0016J\b\u0010N\u001a\u000209H\u0016J\u001a\u0010O\u001a\u0002092\u0006\u0010P\u001a\u00020B2\b\u0010G\u001a\u0004\u0018\u00010HH\u0016J\u0010\u0010Q\u001a\u0002092\u0006\u0010R\u001a\u00020!H\u0002J\u0010\u0010S\u001a\u0002092\u0006\u0010P\u001a\u00020BH\u0002J\b\u0010T\u001a\u000209H\u0002J\u0010\u0010U\u001a\u0002092\u0006\u0010V\u001a\u00020\u0010H&J\u0010\u0010W\u001a\u0002092\u0006\u0010:\u001a\u00020;H\u0002R\u001e\u0010\u0007\u001a\u00020\b8\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u0010\u0010\r\u001a\u0004\u0018\u00010\u000eX\u000e¢\u0006\u0002\n\u0000R\u001e\u0010\u000f\u001a\u00020\u00108\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u0010\u0010\u0015\u001a\u0004\u0018\u00010\u0016X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0017\u001a\u0004\u0018\u00010\u0016X\u000e¢\u0006\u0002\n\u0000R\u001e\u0010\u0018\u001a\u00020\u00198\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\u0010\u0010\u001e\u001a\u0004\u0018\u00010\u001fX\u000e¢\u0006\u0002\n\u0000R\u0014\u0010 \u001a\u00020!8BX\u0004¢\u0006\u0006\u001a\u0004\b \u0010\"R\u001e\u0010#\u001a\u00020$8\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b%\u0010&\"\u0004\b'\u0010(R\u001e\u0010)\u001a\u00020*8\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b+\u0010,\"\u0004\b-\u0010.R\u0014\u0010/\u001a\u00020\u00108BX\u0004¢\u0006\u0006\u001a\u0004\b0\u0010\u0012R\u000e\u00101\u001a\u00020!X\u000e¢\u0006\u0002\n\u0000R\u001e\u00102\u001a\u0002038\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b4\u00105\"\u0004\b6\u00107¨\u0006Y"}, mo31007d2 = {"Lcom/bamtechmedia/dominguez/auth/otp/OtpFragment;", "Ldagger/android/support/DaggerFragment;", "Lcom/bamtechmedia/dominguez/analytics/AnalyticsStateProvider;", "Lcom/bamtechmedia/dominguez/dialogs/AlertDialogCallback;", "Lcom/bamtechmedia/dominguez/error/api/ReloadListener;", "Lcom/bamtechmedia/dominguez/core/design/widgets/textinputlayout/CustomPinEntryEditText$OnPinEnteredListener;", "()V", "analytics", "Lcom/bamtechmedia/dominguez/auth/otp/OtpAnalytics;", "getAnalytics", "()Lcom/bamtechmedia/dominguez/auth/otp/OtpAnalytics;", "setAnalytics", "(Lcom/bamtechmedia/dominguez/auth/otp/OtpAnalytics;)V", "continueLoadingButton", "Lcom/bamtechmedia/dominguez/core/design/widgets/LoadingButton;", "email", "", "getEmail", "()Ljava/lang/String;", "setEmail", "(Ljava/lang/String;)V", "errorTextView", "Landroid/widget/TextView;", "forgotPasswordResendEmailButton", "helpRouter", "Lcom/bamtechmedia/dominguez/options/HelpRouter;", "getHelpRouter", "()Lcom/bamtechmedia/dominguez/options/HelpRouter;", "setHelpRouter", "(Lcom/bamtechmedia/dominguez/options/HelpRouter;)V", "inputText", "Lcom/bamtechmedia/dominguez/core/design/widgets/textinputlayout/CustomPinEntryEditText;", "isOnline", "", "()Z", "offlineRouter", "Lcom/bamtechmedia/dominguez/error/api/OfflineRouter;", "getOfflineRouter", "()Lcom/bamtechmedia/dominguez/error/api/OfflineRouter;", "setOfflineRouter", "(Lcom/bamtechmedia/dominguez/error/api/OfflineRouter;)V", "offlineState", "Lcom/bamtechmedia/dominguez/core/OfflineState;", "getOfflineState", "()Lcom/bamtechmedia/dominguez/core/OfflineState;", "setOfflineState", "(Lcom/bamtechmedia/dominguez/core/OfflineState;)V", "passcodeInput", "getPasscodeInput", "passcodeIsResent", "viewModel", "Lcom/bamtechmedia/dominguez/auth/otp/OtpViewModel;", "getViewModel", "()Lcom/bamtechmedia/dominguez/auth/otp/OtpViewModel;", "setViewModel", "(Lcom/bamtechmedia/dominguez/auth/otp/OtpViewModel;)V", "handleRedeemState", "", "newState", "Lcom/bamtechmedia/dominguez/auth/otp/OtpViewModel$State;", "onAlertDialogAction", "requestId", "", "which", "onAlertDialogDismiss", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onPinEntered", "str", "", "onReloadRequested", "onStart", "onStop", "onViewCreated", "view", "setAccessibilityImportanceForInputText", "enable", "setupViews", "submit", "submitPasscode", "passcode", "updateViewState", "Companion", "auth_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* renamed from: com.bamtechmedia.dominguez.auth.s0.o */
/* compiled from: OtpFragment.kt */
public abstract class C2889o extends C11890i implements C2413n, C7536a, C7630d, C5697e {

    /* renamed from: f0 */
    public static final C2890a f7691f0 = new C2890a(null);

    /* renamed from: U */
    public C2901o0 f7692U;

    /* renamed from: V */
    public C2887n f7693V;

    /* renamed from: W */
    public C7773b f7694W;

    /* renamed from: X */
    public C7629c f7695X;

    /* renamed from: Y */
    public C3796d f7696Y;

    /* renamed from: Z */
    public String f7697Z;
    /* access modifiers changed from: private */

    /* renamed from: a0 */
    public CustomPinEntryEditText f7698a0;
    /* access modifiers changed from: private */

    /* renamed from: b0 */
    public TextView f7699b0;
    /* access modifiers changed from: private */

    /* renamed from: c0 */
    public TextView f7700c0;
    /* access modifiers changed from: private */

    /* renamed from: d0 */
    public LoadingButton f7701d0;
    /* access modifiers changed from: private */

    /* renamed from: e0 */
    public boolean f7702e0;

    /* renamed from: com.bamtechmedia.dominguez.auth.s0.o$a */
    /* compiled from: OtpFragment.kt */
    public static final class C2890a {
        private C2890a() {
        }

        /* renamed from: a */
        public final C2926u mo11895a() {
            return new C2926u();
        }

        public /* synthetic */ C2890a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final C2857c0 mo11893a(C2378m mVar) {
            C2857c0 c0Var = new C2857c0();
            c0Var.setArguments(C5833g.m18829a(C12907r.m40244a("section", mVar)));
            return c0Var;
        }

        /* renamed from: a */
        public final C2876l mo11894a(String str) {
            C2876l lVar = new C2876l();
            lVar.setArguments(C5833g.m18829a(C12907r.m40244a("email", str)));
            return lVar;
        }
    }

    /* renamed from: com.bamtechmedia.dominguez.auth.s0.o$b */
    /* compiled from: OtpFragment.kt */
    static final class C2891b extends C12881k implements Function0<C13145v> {

        /* renamed from: c */
        final /* synthetic */ C2889o f7703c;

        C2891b(C2889o oVar) {
            this.f7703c = oVar;
            super(0);
        }

        public final void invoke() {
            this.f7703c.mo11891o().mo11881e();
            NestedScrollView nestedScrollView = (NestedScrollView) this.f7703c._$_findCachedViewById(C2716h0.forgotPwdScrollView);
            if (nestedScrollView != null) {
                C5843l.f13627a.mo17743a(nestedScrollView);
            }
            this.f7703c.requireActivity().onBackPressed();
        }
    }

    /* renamed from: com.bamtechmedia.dominguez.auth.s0.o$c */
    /* compiled from: OtpFragment.kt */
    static final class C2892c extends C12881k implements Function1<C2903b, C13145v> {

        /* renamed from: c */
        final /* synthetic */ C2889o f7704c;

        C2892c(C2889o oVar) {
            this.f7704c = oVar;
            super(1);
        }

        /* renamed from: a */
        public final void mo11896a(C2903b bVar) {
            this.f7704c.m10623b(bVar);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo11896a((C2903b) obj);
            return C13145v.f29587a;
        }
    }

    @Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, mo31007d2 = {"setupInputText", "", "invoke"}, mo31008k = 3, mo31009mv = {1, 1, 15})
    /* renamed from: com.bamtechmedia.dominguez.auth.s0.o$d */
    /* compiled from: OtpFragment.kt */
    static final class C2893d extends C12881k implements Function0<C13145v> {

        /* renamed from: c */
        final /* synthetic */ C2889o f7705c;

        /* renamed from: com.bamtechmedia.dominguez.auth.s0.o$d$a */
        /* compiled from: OtpFragment.kt */
        static final class C2894a implements OnFocusChangeListener {

            /* renamed from: c */
            final /* synthetic */ C2893d f7706c;

            C2894a(C2893d dVar) {
                this.f7706c = dVar;
            }

            public final void onFocusChange(View view, boolean z) {
                ConstraintLayout constraintLayout = (ConstraintLayout) this.f7706c.f7705c._$_findCachedViewById(C2716h0.forgotPwdPinContainer);
                if (constraintLayout != null) {
                    constraintLayout.setClickable(z);
                    constraintLayout.setFocusable(z);
                    constraintLayout.setFocusableInTouchMode(z);
                }
                String str = "view";
                if (z) {
                    C5843l lVar = C5843l.f13627a;
                    Intrinsics.checkReturnedValueIsNotNull((Object) view, str);
                    lVar.mo17744b(view);
                    return;
                }
                C5843l lVar2 = C5843l.f13627a;
                Intrinsics.checkReturnedValueIsNotNull((Object) view, str);
                lVar2.mo17743a(view);
            }
        }

        /* renamed from: com.bamtechmedia.dominguez.auth.s0.o$d$b */
        /* compiled from: EditTextExt.kt */
        public static final class C2895b implements OnEditorActionListener {

            /* renamed from: a */
            final /* synthetic */ C2893d f7707a;

            public C2895b(C2893d dVar) {
                this.f7707a = dVar;
            }

            public final boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
                if (i != 2) {
                    return false;
                }
                Intrinsics.checkReturnedValueIsNotNull((Object) textView, "view");
                this.f7707a.f7705c.m10632s();
                return true;
            }
        }

        C2893d(C2889o oVar) {
            this.f7705c = oVar;
            super(0);
        }

        public final void invoke() {
            Drawable c = C4025a.m13798c(this.f7705c.requireContext(), C2714g0.pincode_background);
            if (c != null) {
                Drawable i = C0492a.m2652i(c);
                C0492a.m2645b(i, C4025a.m13788a(this.f7705c.requireContext(), C2711f0.vader_grey4));
                View _$_findCachedViewById = this.f7705c._$_findCachedViewById(C2716h0.inputTextBackground);
                if (_$_findCachedViewById != null) {
                    _$_findCachedViewById.setBackground(i);
                }
            }
            CustomPinEntryEditText d = this.f7705c.f7698a0;
            if (d != null) {
                d.setOnFocusChangeListener(new C2894a(this));
            }
            TextView b = this.f7705c.f7699b0;
            if (b != null) {
                CustomPinEntryEditText d2 = this.f7705c.f7698a0;
                if (d2 != null) {
                    d2.mo17549a((C5697e) this.f7705c, b);
                }
            }
            CustomPinEntryEditText d3 = this.f7705c.f7698a0;
            if (d3 != null) {
                d3.setOnEditorActionListener(new C2895b(this));
            }
            CustomPinEntryEditText d4 = this.f7705c.f7698a0;
            if (d4 != null) {
                d4.setContentDescription(C5880u.m18937a(C2721j0.a11y_emailcode_otp, C13170i0.m40332a(C12907r.m40244a("user_email", this.f7705c.mo11892p()))));
            }
        }
    }

    @Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, mo31007d2 = {"setupResendEmailButton", "", "invoke"}, mo31008k = 3, mo31009mv = {1, 1, 15})
    /* renamed from: com.bamtechmedia.dominguez.auth.s0.o$e */
    /* compiled from: OtpFragment.kt */
    static final class C2896e extends C12881k implements Function0<C13145v> {

        /* renamed from: c */
        final /* synthetic */ C2889o f7708c;

        /* renamed from: com.bamtechmedia.dominguez.auth.s0.o$e$a */
        /* compiled from: OtpFragment.kt */
        static final class C2897a implements OnClickListener {

            /* renamed from: c */
            final /* synthetic */ C2896e f7709c;

            C2897a(C2896e eVar) {
                this.f7709c = eVar;
            }

            public final void onClick(View view) {
                C0532d requireActivity = this.f7709c.f7708c.requireActivity();
                if (!(requireActivity instanceof Activity)) {
                    requireActivity = null;
                }
                if (requireActivity != null) {
                    View currentFocus = requireActivity.getCurrentFocus();
                    if (currentFocus != null) {
                        C5843l.f13627a.mo17743a(currentFocus);
                    }
                }
                CustomPinEntryEditText d = this.f7709c.f7708c.f7698a0;
                if (d != null) {
                    d.clearFocus();
                }
                CustomPinEntryEditText d2 = this.f7709c.f7708c.f7698a0;
                if (d2 != null) {
                    Editable text = d2.getText();
                    if (text != null) {
                        text.clear();
                    }
                }
                this.f7709c.f7708c.mo11891o().mo11884h();
                this.f7709c.f7708c.f7702e0 = true;
                this.f7709c.f7708c.getViewModel().mo11905d(this.f7709c.f7708c.f7702e0);
            }
        }

        C2896e(C2889o oVar) {
            this.f7708c = oVar;
            super(0);
        }

        public final void invoke() {
            TextView c = this.f7708c.f7700c0;
            if (c != null) {
                c.setOnClickListener(new C2897a(this));
            }
            TextView c2 = this.f7708c.f7700c0;
            if (c2 != null) {
                c2.setContentDescription(C5880u.m18936a(C2721j0.a11y_emailcode_resend));
            }
        }
    }

    /* renamed from: com.bamtechmedia.dominguez.auth.s0.o$f */
    /* compiled from: OtpFragment.kt */
    static final class C2898f implements OnClickListener {

        /* renamed from: c */
        final /* synthetic */ C2889o f7710c;

        C2898f(C2889o oVar) {
            this.f7710c = oVar;
        }

        public final void onClick(View view) {
            this.f7710c.m10632s();
        }
    }

    /* renamed from: com.bamtechmedia.dominguez.auth.s0.o$g */
    /* compiled from: OtpFragment.kt */
    static final class C2899g extends C12881k implements Function1<Boolean, C13145v> {

        /* renamed from: c */
        final /* synthetic */ C2889o f7711c;

        C2899g(C2889o oVar) {
            this.f7711c = oVar;
            super(1);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke(((Boolean) obj).booleanValue());
            return C13145v.f29587a;
        }

        public final void invoke(boolean z) {
            if (z) {
                LoadingButton a = this.f7711c.f7701d0;
                if (a != null) {
                    a.mo17425a();
                }
                if (this.f7711c.f7702e0) {
                    this.f7711c.m10625b(false);
                }
            } else {
                LoadingButton a2 = this.f7711c.f7701d0;
                if (a2 != null) {
                    a2.mo17426b();
                }
            }
            OnboardingToolbar onboardingToolbar = (OnboardingToolbar) this.f7711c._$_findCachedViewById(C2716h0.forgotPwdOnboardingToolbar);
            if (onboardingToolbar != null) {
                DisneyTitleToolbar disneyToolbar = onboardingToolbar.getDisneyToolbar();
                if (disneyToolbar != null) {
                    disneyToolbar.mo17379b(!z);
                }
            }
            TextView c = this.f7711c.f7700c0;
            if (c != null) {
                c.setEnabled(!z);
            }
            CustomPinEntryEditText d = this.f7711c.f7698a0;
            if (d != null) {
                d.setEnabled(!z);
            }
            Group group = (Group) this.f7711c._$_findCachedViewById(C2716h0.contentGroup);
            if (group != null) {
                C4127b0.m14131b(group, !z);
            }
            Group group2 = (Group) this.f7711c._$_findCachedViewById(C2716h0.loadingGroup);
            if (group2 != null) {
                C4127b0.m14131b(group2, z);
            }
            if (!z) {
                CustomPinEntryEditText d2 = this.f7711c.f7698a0;
                if (d2 != null && d2.hasFocus()) {
                    ConstraintLayout constraintLayout = (ConstraintLayout) this.f7711c._$_findCachedViewById(C2716h0.forgotPwdPinContainer);
                    if (constraintLayout != null) {
                        constraintLayout.requestFocus();
                    }
                }
            }
        }
    }

    /* renamed from: com.bamtechmedia.dominguez.auth.s0.o$h */
    /* compiled from: OtpFragment.kt */
    static final class C2900h extends C12881k implements Function1<C2903b, C13145v> {

        /* renamed from: c */
        final /* synthetic */ C2889o f7712c;

        C2900h(C2889o oVar) {
            this.f7712c = oVar;
            super(1);
        }

        /* renamed from: a */
        public final void mo11902a(C2903b bVar) {
            CustomPinEntryEditText d = this.f7712c.f7698a0;
            if (d != null) {
                d.mo17550a(bVar.mo11909c(), this.f7712c._$_findCachedViewById(C2716h0.inputTextBackground));
            }
            TextView b = this.f7712c.f7699b0;
            if (b != null) {
                C4127b0.m14131b(b, bVar.mo11909c());
            }
            if (bVar.mo11909c()) {
                TextView b2 = this.f7712c.f7699b0;
                if (b2 != null) {
                    String d2 = bVar.mo11910d();
                    if (d2 == null) {
                        d2 = "TODO: Need Dictionary Key for Passcode Error";
                    }
                    b2.setText(d2);
                }
                this.f7712c.mo11891o().mo11883g();
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo11902a((C2903b) obj);
            return C13145v.f29587a;
        }
    }

    /* renamed from: q */
    private final String mo11871q() {
        CustomPinEntryEditText customPinEntryEditText = this.f7698a0;
        if (customPinEntryEditText != null) {
            Editable text = customPinEntryEditText.getText();
            if (text != null) {
                String obj = text.toString();
                if (obj != null) {
                    return obj;
                }
            }
        }
        return "";
    }

    /* renamed from: r */
    private final boolean mo11873r() {
        C3796d dVar = this.f7696Y;
        if (dVar != null) {
            return dVar.mo13695j();
        }
        Intrinsics.throwUninitializedPropertyAccessException("offlineState");
        throw null;
    }

    /* access modifiers changed from: private */
    /* renamed from: s */
    public final void m10632s() {
        C2887n nVar = this.f7693V;
        if (nVar != null) {
            nVar.mo11882f();
            mo11870e(mo11871q());
            return;
        }
        Intrinsics.throwUninitializedPropertyAccessException("analytics");
        throw null;
    }

    public abstract void _$_clearFindViewByIdCache();

    public abstract View _$_findCachedViewById(int i);

    /* renamed from: a */
    public abstract void mo11869a(C2903b bVar);

    /* renamed from: e */
    public abstract void mo11870e(String str);

    public final C2901o0 getViewModel() {
        C2901o0 o0Var = this.f7692U;
        if (o0Var != null) {
            return o0Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("viewModel");
        throw null;
    }

    /* renamed from: o */
    public final C2887n mo11891o() {
        C2887n nVar = this.f7693V;
        if (nVar != null) {
            return nVar;
        }
        Intrinsics.throwUninitializedPropertyAccessException("analytics");
        throw null;
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(C2718i0.fragment_forgot_password_pin, viewGroup, false);
        Intrinsics.checkReturnedValueIsNotNull((Object) inflate, "inflater.inflate(R.layou…rd_pin, container, false)");
        return inflate;
    }

    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        _$_clearFindViewByIdCache();
    }

    public void onStart() {
        super.onStart();
        OnboardingToolbar onboardingToolbar = (OnboardingToolbar) _$_findCachedViewById(C2716h0.forgotPwdOnboardingToolbar);
        if (onboardingToolbar != null) {
            C0532d requireActivity = requireActivity();
            Intrinsics.checkReturnedValueIsNotNull((Object) requireActivity, "requireActivity()");
            OnboardingToolbar.m18500a(onboardingToolbar, requireActivity, getView(), (NestedScrollView) _$_findCachedViewById(C2716h0.forgotPwdScrollView), (ConstraintLayout) _$_findCachedViewById(C2716h0.forgotPwdLayout), false, new C2891b(this), 16, null);
        }
        C2901o0 o0Var = this.f7692U;
        if (o0Var != null) {
            C5755i.m18679a(this, o0Var, null, null, new C2892c(this), 6, null);
            return;
        }
        Intrinsics.throwUninitializedPropertyAccessException("viewModel");
        throw null;
    }

    public void onStop() {
        OnboardingToolbar onboardingToolbar = (OnboardingToolbar) _$_findCachedViewById(C2716h0.forgotPwdOnboardingToolbar);
        if (onboardingToolbar != null) {
            onboardingToolbar.setToolbarSet(false);
        }
        super.onStop();
    }

    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.f7698a0 = (CustomPinEntryEditText) view.findViewById(C2716h0.inputText);
        this.f7699b0 = (TextView) view.findViewById(C2716h0.errorTextView);
        this.f7700c0 = (TextView) view.findViewById(C2716h0.forgotPasswordResendEmailButton);
        this.f7701d0 = (LoadingButton) view.findViewById(C2716h0.continueLoadingButton);
        m10619a(view);
        C2901o0 o0Var = this.f7692U;
        if (o0Var != null) {
            C2901o0.m10648a(o0Var, false, 1, null);
            if (!mo11873r()) {
                C7629c cVar = this.f7695X;
                if (cVar != null) {
                    int i = C2716h0.forgotPwdPinContainer;
                    C0538i childFragmentManager = getChildFragmentManager();
                    Intrinsics.checkReturnedValueIsNotNull((Object) childFragmentManager, "childFragmentManager");
                    cVar.mo20550a(i, childFragmentManager);
                    return;
                }
                Intrinsics.throwUninitializedPropertyAccessException("offlineRouter");
                throw null;
            }
            return;
        }
        Intrinsics.throwUninitializedPropertyAccessException("viewModel");
        throw null;
    }

    /* renamed from: p */
    public final String mo11892p() {
        String str = this.f7697Z;
        if (str != null) {
            return str;
        }
        Intrinsics.throwUninitializedPropertyAccessException("email");
        throw null;
    }

    /* renamed from: d */
    public boolean mo11888d() {
        m10625b(true);
        return true;
    }

    /* renamed from: f */
    public void mo11889f() {
        this.f7702e0 = true;
        C2901o0 o0Var = this.f7692U;
        if (o0Var != null) {
            o0Var.mo11905d(this.f7702e0);
        } else {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
            throw null;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public final void m10623b(C2903b bVar) {
        C2899g gVar = new C2899g(this);
        C2900h hVar = new C2900h(this);
        gVar.invoke(bVar.mo11913f());
        hVar.mo11902a(bVar);
        mo11869a(bVar);
    }

    /* renamed from: a */
    private final void m10619a(View view) {
        C2893d dVar = new C2893d(this);
        C2896e eVar = new C2896e(this);
        TextView textView = (TextView) view.findViewById(C2716h0.forgotPwdPinMessageText);
        Intrinsics.checkReturnedValueIsNotNull((Object) textView, "forgotPasswordPinMessageText");
        int i = C2721j0.check_email_copy;
        String str = this.f7697Z;
        if (str != null) {
            textView.setText(C5880u.m18937a(i, C13170i0.m40332a(C12907r.m40244a("user_email", str))));
            dVar.invoke();
            LoadingButton loadingButton = this.f7701d0;
            if (loadingButton != null) {
                loadingButton.setOnClickListener(new C2898f(this));
            }
            LoadingButton loadingButton2 = this.f7701d0;
            if (loadingButton2 != null) {
                loadingButton2.setText(C2721j0.btn_continue);
            }
            eVar.invoke();
            return;
        }
        Intrinsics.throwUninitializedPropertyAccessException("email");
        throw null;
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public final void m10625b(boolean z) {
        CustomPinEntryEditText customPinEntryEditText = this.f7698a0;
        if (customPinEntryEditText != null) {
            customPinEntryEditText.setImportantForAccessibility(z ? 1 : 2);
        }
    }

    /* renamed from: a */
    public void mo11886a(CharSequence charSequence) {
        TextView textView = this.f7699b0;
        if (textView != null) {
            C4127b0.m14131b(textView, false);
        }
    }

    /* renamed from: a */
    public boolean mo11887a(int i, int i2) {
        if (i != C2716h0.email_resent_message) {
            return false;
        }
        if (i2 == -2) {
            C7773b bVar = this.f7694W;
            if (bVar != null) {
                bVar.mo20684a();
            } else {
                Intrinsics.throwUninitializedPropertyAccessException("helpRouter");
                throw null;
            }
        }
        return true;
    }
}
