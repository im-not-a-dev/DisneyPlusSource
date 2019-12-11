package com.bamtechmedia.dominguez.auth.p067s0;

import android.os.Bundle;
import android.view.View;
import androidx.core.widget.NestedScrollView;
import com.bamtechmedia.dominguez.analytics.C2378m;
import com.bamtechmedia.dominguez.analytics.p057o0.C2433b;
import com.bamtechmedia.dominguez.auth.C2716h0;
import com.bamtechmedia.dominguez.auth.p061o0.p063i.C2756e;
import com.bamtechmedia.dominguez.auth.p067s0.C2901o0.C2903b;
import com.bamtechmedia.dominguez.core.design.widgets.DisneyTitleToolbar.C5621c;
import com.bamtechmedia.dominguez.core.design.widgets.OnboardingToolbar;
import com.bamtechmedia.dominguez.core.utils.C5843l;
import com.bamtechmedia.dominguez.core.utils.C5884x;
import java.util.HashMap;
import kotlin.C13145v;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.C12880j;
import kotlin.jvm.internal.C12881k;
import p163g.p201e.p203b.p312q.C7717x;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002B\u0005¢\u0006\u0002\u0010\u0003J\b\u0010\u000e\u001a\u00020\u000fH\u0016J\u0010\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013H\u0016J\u001a\u0010\u0014\u001a\u00020\u00112\u0006\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018H\u0016J\u0010\u0010\u0019\u001a\u00020\u00112\u0006\u0010\u001a\u001a\u00020\u0005H\u0016R\u0011\u0010\u0004\u001a\u00020\u00058F¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R\u001e\u0010\b\u001a\u00020\t8\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\r¨\u0006\u001b"}, mo31007d2 = {"Lcom/bamtechmedia/dominguez/auth/otp/AccountOtpPasscodeFragment;", "Lcom/bamtechmedia/dominguez/auth/otp/OtpFragment;", "Lcom/bamtechmedia/dominguez/globalnav/HideNavMenu;", "()V", "passedEmail", "", "getPassedEmail", "()Ljava/lang/String;", "passwordResetRouter", "Lcom/bamtechmedia/dominguez/auth/api/router/PasswordResetRouter;", "getPasswordResetRouter", "()Lcom/bamtechmedia/dominguez/auth/api/router/PasswordResetRouter;", "setPasswordResetRouter", "(Lcom/bamtechmedia/dominguez/auth/api/router/PasswordResetRouter;)V", "getAnalyticsSection", "Lcom/bamtechmedia/dominguez/analytics/AnalyticsSection;", "handleRedeemState", "", "newState", "Lcom/bamtechmedia/dominguez/auth/otp/OtpViewModel$State;", "onViewCreated", "view", "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "submitPasscode", "passcode", "auth_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* renamed from: com.bamtechmedia.dominguez.auth.s0.l */
/* compiled from: AccountOtpPasscodeFragment.kt */
public final class C2876l extends C2889o implements C7717x {

    /* renamed from: g0 */
    public C2756e f7672g0;

    /* renamed from: h0 */
    private HashMap f7673h0;

    @Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, mo31007d2 = {"<anonymous>", "", "toolbar", "Lcom/bamtechmedia/dominguez/core/design/widgets/OnboardingToolbar;", "scrollView", "Landroidx/core/widget/NestedScrollView;", "invoke"}, mo31008k = 3, mo31009mv = {1, 1, 15})
    /* renamed from: com.bamtechmedia.dominguez.auth.s0.l$a */
    /* compiled from: AccountOtpPasscodeFragment.kt */
    static final class C2877a extends C12881k implements Function2<OnboardingToolbar, NestedScrollView, C13145v> {

        /* renamed from: c */
        final /* synthetic */ C2876l f7674c;

        /* renamed from: com.bamtechmedia.dominguez.auth.s0.l$a$a */
        /* compiled from: AccountOtpPasscodeFragment.kt */
        static final class C2878a extends C12881k implements Function0<C13145v> {

            /* renamed from: U */
            final /* synthetic */ NestedScrollView f7675U;

            /* renamed from: c */
            final /* synthetic */ C2877a f7676c;

            C2878a(C2877a aVar, NestedScrollView nestedScrollView) {
                this.f7676c = aVar;
                this.f7675U = nestedScrollView;
                super(0);
            }

            public final void invoke() {
                this.f7676c.f7674c.mo11891o().mo11881e();
                C5843l.f13627a.mo17743a(this.f7675U);
                this.f7676c.f7674c.requireActivity().onBackPressed();
            }
        }

        C2877a(C2876l lVar) {
            this.f7674c = lVar;
            super(2);
        }

        /* renamed from: a */
        public final void mo11872a(OnboardingToolbar onboardingToolbar, NestedScrollView nestedScrollView) {
            onboardingToolbar.getDisneyToolbar().mo17375a(C5621c.CLOSE_BUTTON, (Function0<C13145v>) new C2878a<C13145v>(this, nestedScrollView));
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            mo11872a((OnboardingToolbar) obj, (NestedScrollView) obj2);
            return C13145v.f29587a;
        }
    }

    public void _$_clearFindViewByIdCache() {
        HashMap hashMap = this.f7673h0;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    public View _$_findCachedViewById(int i) {
        if (this.f7673h0 == null) {
            this.f7673h0 = new HashMap();
        }
        View view = (View) this.f7673h0.get(Integer.valueOf(i));
        if (view == null) {
            View view2 = getView();
            if (view2 == null) {
                return null;
            }
            view = view2.findViewById(i);
            this.f7673h0.put(Integer.valueOf(i), view);
        }
        return view;
    }

    /* renamed from: a */
    public void mo11869a(C2903b bVar) {
        if (bVar.mo11911e()) {
            C2756e eVar = this.f7672g0;
            if (eVar != null) {
                eVar.mo11772a();
            } else {
                C12880j.m40227c("passwordResetRouter");
                throw null;
            }
        }
    }

    /* renamed from: e */
    public C2378m mo11534e() {
        return new C2378m(C2433b.ACCOUNT_SETTINGS_CREATE_PASSWORD, (String) null, 2, (DefaultConstructorMarker) null);
    }

    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        _$_clearFindViewByIdCache();
    }

    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        C5884x.m18949a((OnboardingToolbar) _$_findCachedViewById(C2716h0.forgotPwdOnboardingToolbar), (NestedScrollView) _$_findCachedViewById(C2716h0.forgotPwdScrollView), new C2877a(this));
    }

    /* renamed from: q */
    public final String mo11871q() {
        Bundle arguments = getArguments();
        if (arguments != null) {
            String string = arguments.getString("email");
            if (string != null) {
                return string;
            }
        }
        throw new IllegalArgumentException("Arguments \"email\" key value is null!");
    }

    /* renamed from: e */
    public void mo11870e(String str) {
        getViewModel().mo11904c(str);
    }
}
