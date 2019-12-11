package com.bamtechmedia.dominguez.auth.p067s0;

import android.os.Bundle;
import android.view.View;
import androidx.core.widget.NestedScrollView;
import androidx.lifecycle.C0722m;
import com.bamtechmedia.dominguez.analytics.C2378m;
import com.bamtechmedia.dominguez.auth.C2716h0;
import com.bamtechmedia.dominguez.auth.p061o0.p063i.C2752a;
import com.bamtechmedia.dominguez.auth.p061o0.p063i.C2756e;
import com.bamtechmedia.dominguez.auth.p067s0.C2901o0.C2903b;
import com.bamtechmedia.dominguez.core.design.widgets.DisneyTitleToolbar.C5621c;
import com.bamtechmedia.dominguez.core.design.widgets.OnboardingToolbar;
import com.bamtechmedia.dominguez.core.utils.C5839j;
import com.bamtechmedia.dominguez.core.utils.C5840j0;
import com.bamtechmedia.dominguez.core.utils.C5843l;
import com.bamtechmedia.dominguez.core.utils.C5884x;
import com.uber.autodispose.android.lifecycle.C10541b;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;
import kotlin.C13145v;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.C12881k;
import kotlin.jvm.internal.C12890t;
import kotlin.jvm.internal.C12891u;
import kotlin.jvm.internal.C12895y;
import kotlin.reflect.KProperty;
import p163g.p201e.p203b.p312q.C7717x;
import p163g.p503n.p504a.C11786a0;
import p163g.p503n.p504a.C11790c0;
import p163g.p503n.p504a.C11793e;
import p520io.reactivex.C11960n;
import p520io.reactivex.C11969r;
import p520io.reactivex.Observable;
import p520io.reactivex.functions.Consumer;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 ,2\u00020\u00012\u00020\u0002:\u0001,B\u0005¢\u0006\u0002\u0010\u0003J\b\u0010\u001f\u001a\u00020 H\u0016J\u0010\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020$H\u0016J\u001a\u0010%\u001a\u00020\"2\u0006\u0010&\u001a\u00020'2\b\u0010(\u001a\u0004\u0018\u00010)H\u0016J\u0010\u0010*\u001a\u00020\"2\u0006\u0010+\u001a\u00020\u0014H\u0016R\u001e\u0010\u0004\u001a\u00020\u00058\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001e\u0010\n\u001a\u00020\u000b8\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001e\u0010\u0010\u001a\u00020\u000b8\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\r\"\u0004\b\u0012\u0010\u000fR\u001b\u0010\u0013\u001a\u00020\u00148FX\u0002¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0015\u0010\u0016R\u001e\u0010\u0019\u001a\u00020\u001a8\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001e¨\u0006-"}, mo31007d2 = {"Lcom/bamtechmedia/dominguez/auth/otp/OtpVerifyFragment;", "Lcom/bamtechmedia/dominguez/auth/otp/OtpFragment;", "Lcom/bamtechmedia/dominguez/globalnav/HideNavMenu;", "()V", "accountUpdateRouter", "Lcom/bamtechmedia/dominguez/auth/api/router/AccountUpdateRouter;", "getAccountUpdateRouter", "()Lcom/bamtechmedia/dominguez/auth/api/router/AccountUpdateRouter;", "setAccountUpdateRouter", "(Lcom/bamtechmedia/dominguez/auth/api/router/AccountUpdateRouter;)V", "ioScheduler", "Lio/reactivex/Scheduler;", "getIoScheduler", "()Lio/reactivex/Scheduler;", "setIoScheduler", "(Lio/reactivex/Scheduler;)V", "mainScheduler", "getMainScheduler", "setMainScheduler", "passedEmail", "", "getPassedEmail", "()Ljava/lang/String;", "passedEmail$delegate", "Lcom/bamtechmedia/dominguez/core/utils/StringFragmentArgumentDelegate;", "passwordResetRouter", "Lcom/bamtechmedia/dominguez/auth/api/router/PasswordResetRouter;", "getPasswordResetRouter", "()Lcom/bamtechmedia/dominguez/auth/api/router/PasswordResetRouter;", "setPasswordResetRouter", "(Lcom/bamtechmedia/dominguez/auth/api/router/PasswordResetRouter;)V", "getAnalyticsSection", "Lcom/bamtechmedia/dominguez/analytics/AnalyticsSection;", "handleRedeemState", "", "newState", "Lcom/bamtechmedia/dominguez/auth/otp/OtpViewModel$State;", "onViewCreated", "view", "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "submitPasscode", "passcode", "Companion", "auth_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* renamed from: com.bamtechmedia.dominguez.auth.s0.m0 */
/* compiled from: OtpVerifyFragment.kt */
public final class C2881m0 extends C2889o implements C7717x {

    /* renamed from: m0 */
    static final /* synthetic */ KProperty[] f7677m0 = {C12895y.m40235a((C12890t) new C12891u(C12895y.m40230a(C2881m0.class), "passedEmail", "getPassedEmail()Ljava/lang/String;"))};

    /* renamed from: g0 */
    public C2756e f7678g0;

    /* renamed from: h0 */
    public C2752a f7679h0;

    /* renamed from: i0 */
    public C11969r f7680i0;

    /* renamed from: j0 */
    public C11969r f7681j0;

    /* renamed from: k0 */
    private final C5840j0 f7682k0 = C5839j.m18854b("email", null, null, 6, null);

    /* renamed from: l0 */
    private HashMap f7683l0;

    /* renamed from: com.bamtechmedia.dominguez.auth.s0.m0$a */
    /* compiled from: OtpVerifyFragment.kt */
    public static final class C2882a {
        private C2882a() {
        }

        public /* synthetic */ C2882a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: com.bamtechmedia.dominguez.auth.s0.m0$b */
    /* compiled from: OtpVerifyFragment.kt */
    static final class C2883b<T> implements Consumer<Long> {

        /* renamed from: c */
        final /* synthetic */ C2881m0 f7684c;

        C2883b(C2881m0 m0Var) {
            this.f7684c = m0Var;
        }

        /* renamed from: a */
        public final void accept(Long l) {
            this.f7684c.mo11871q().mo11748a();
        }
    }

    /* renamed from: com.bamtechmedia.dominguez.auth.s0.m0$c */
    /* compiled from: OtpVerifyFragment.kt */
    static final class C2884c<T> implements Consumer<Throwable> {

        /* renamed from: c */
        final /* synthetic */ C2881m0 f7685c;

        C2884c(C2881m0 m0Var) {
            this.f7685c = m0Var;
        }

        /* renamed from: a */
        public final void accept(Throwable th) {
            this.f7685c.mo11871q().mo11748a();
        }
    }

    @Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, mo31007d2 = {"<anonymous>", "", "toolbar", "Lcom/bamtechmedia/dominguez/core/design/widgets/OnboardingToolbar;", "scrollView", "Landroidx/core/widget/NestedScrollView;", "invoke"}, mo31008k = 3, mo31009mv = {1, 1, 15})
    /* renamed from: com.bamtechmedia.dominguez.auth.s0.m0$d */
    /* compiled from: OtpVerifyFragment.kt */
    static final class C2885d extends C12881k implements Function2<OnboardingToolbar, NestedScrollView, C13145v> {

        /* renamed from: c */
        final /* synthetic */ C2881m0 f7686c;

        /* renamed from: com.bamtechmedia.dominguez.auth.s0.m0$d$a */
        /* compiled from: OtpVerifyFragment.kt */
        static final class C2886a extends C12881k implements Function0<C13145v> {

            /* renamed from: U */
            final /* synthetic */ NestedScrollView f7687U;

            /* renamed from: c */
            final /* synthetic */ C2885d f7688c;

            C2886a(C2885d dVar, NestedScrollView nestedScrollView) {
                this.f7688c = dVar;
                this.f7687U = nestedScrollView;
                super(0);
            }

            public final void invoke() {
                this.f7688c.f7686c.mo11891o().mo11881e();
                C5843l.f13627a.mo17743a(this.f7687U);
                this.f7688c.f7686c.requireActivity().onBackPressed();
            }
        }

        C2885d(C2881m0 m0Var) {
            this.f7686c = m0Var;
            super(2);
        }

        /* renamed from: a */
        public final void mo11876a(OnboardingToolbar onboardingToolbar, NestedScrollView nestedScrollView) {
            onboardingToolbar.getDisneyToolbar().mo17375a(C5621c.CLOSE_BUTTON, (Function0<C13145v>) new C2886a<C13145v>(this, nestedScrollView));
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            mo11876a((OnboardingToolbar) obj, (NestedScrollView) obj2);
            return C13145v.f29587a;
        }
    }

    static {
        new C2882a(null);
    }

    public void _$_clearFindViewByIdCache() {
        HashMap hashMap = this.f7683l0;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    public View _$_findCachedViewById(int i) {
        if (this.f7683l0 == null) {
            this.f7683l0 = new HashMap();
        }
        View view = (View) this.f7683l0.get(Integer.valueOf(i));
        if (view == null) {
            View view2 = getView();
            if (view2 == null) {
                return null;
            }
            view = view2.findViewById(i);
            this.f7683l0.put(Integer.valueOf(i), view);
        }
        return view;
    }

    /* renamed from: a */
    public void mo11869a(C2903b bVar) {
        if (bVar.mo11908b()) {
            TimeUnit timeUnit = TimeUnit.SECONDS;
            C11969r rVar = this.f7680i0;
            if (rVar != null) {
                Observable c = Observable.m38311c(5, timeUnit, rVar);
                C11969r rVar2 = this.f7681j0;
                if (rVar2 != null) {
                    Observable a = c.mo30151a(rVar2);
                    Intrinsics.checkReturnedValueIsNotNull((Object) a, "Observable.timer(SUCCESS….observeOn(mainScheduler)");
                    C10541b a2 = C10541b.m33254a((C0722m) this);
                    Intrinsics.checkReturnedValueIsNotNull((Object) a2, "AndroidLifecycleScopeProvider.from(\n    this)");
                    Object a3 = a.mo30161a((C11960n<T, ? extends R>) C11793e.m37930a((C11790c0) a2));
                    Intrinsics.checkReturnedValueIsNotNull(a3, "this.`as`(AutoDispose.autoDisposable(provider))");
                    ((C11786a0) a3).mo29915a(new C2883b(this), new C2884c(this));
                    return;
                }
                Intrinsics.throwUninitializedPropertyAccessException("mainScheduler");
                throw null;
            }
            Intrinsics.throwUninitializedPropertyAccessException("ioScheduler");
            throw null;
        } else if (bVar.mo11911e()) {
            C2756e eVar = this.f7678g0;
            if (eVar != null) {
                eVar.mo11772a();
            } else {
                Intrinsics.throwUninitializedPropertyAccessException("passwordResetRouter");
                throw null;
            }
        }
    }

    /* renamed from: e */
    public C2378m mo11534e() {
        C2378m mVar = new C2378m("", "", null, null, 12, null);
        return mVar;
    }

    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        _$_clearFindViewByIdCache();
    }

    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        C5884x.m18949a((OnboardingToolbar) _$_findCachedViewById(C2716h0.forgotPwdOnboardingToolbar), (NestedScrollView) _$_findCachedViewById(C2716h0.forgotPwdScrollView), new C2885d(this));
    }

    /* renamed from: q */
    public final C2752a mo11871q() {
        C2752a aVar = this.f7679h0;
        if (aVar != null) {
            return aVar;
        }
        Intrinsics.throwUninitializedPropertyAccessException("accountUpdateRouter");
        throw null;
    }

    /* renamed from: r */
    public final String mo11873r() {
        return this.f7682k0.mo17741a(this, f7677m0[0]);
    }

    /* renamed from: e */
    public void mo11870e(String str) {
        getViewModel().mo11903b(str);
    }
}
