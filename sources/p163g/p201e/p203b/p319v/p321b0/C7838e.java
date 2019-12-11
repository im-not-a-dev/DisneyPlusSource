package p163g.p201e.p203b.p319v.p321b0;

import android.content.Context;
import android.os.Bundle;
import android.text.method.LinkMovementMethod;
import android.text.method.TransformationMethod;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.Window;
import android.view.WindowInsets;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.constraintlayout.helper.widget.Flow;
import androidx.constraintlayout.widget.C0425d;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.ConstraintLayout.C0415c;
import androidx.core.widget.NestedScrollView;
import androidx.fragment.app.C0532d;
import androidx.fragment.app.C0538i;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.C0715i.C0716a;
import com.bamtechmedia.dominguez.analytics.C2378m;
import com.bamtechmedia.dominguez.analytics.C2413n;
import com.bamtechmedia.dominguez.analytics.p057o0.C2433b;
import com.bamtechmedia.dominguez.core.C3796d;
import com.bamtechmedia.dominguez.core.design.widgets.DisneyTitleToolbar;
import com.bamtechmedia.dominguez.core.design.widgets.LoadingButton;
import com.bamtechmedia.dominguez.core.design.widgets.focus.C5691a;
import com.bamtechmedia.dominguez.core.design.widgets.focus.FocusSearchInterceptFrameLayout;
import com.bamtechmedia.dominguez.core.framework.C5755i;
import com.bamtechmedia.dominguez.core.p084g.C3807b;
import com.bamtechmedia.dominguez.core.utils.C5818b;
import com.bamtechmedia.dominguez.core.utils.C5833g;
import com.bamtechmedia.dominguez.core.utils.C5837i;
import com.bamtechmedia.dominguez.core.utils.C5839j;
import com.bamtechmedia.dominguez.core.utils.C5852n0;
import com.bamtechmedia.dominguez.core.utils.C5884x;
import com.bamtechmedia.dominguez.purchase.C7051i;
import com.bamtechmedia.dominguez.purchase.C7081s;
import com.bamtechmedia.dominguez.purchase.C7083u;
import com.bamtechmedia.dominguez.purchase.C7084v;
import com.bamtechmedia.dominguez.purchase.p274b0.C7041a;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import kotlin.C12907r;
import kotlin.C13142s;
import kotlin.C13145v;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.C12881k;
import net.danlew.android.joda.DateUtils;
import p096e.p121h.p122j.C4025a;
import p096e.p121h.p135s.C4121a0;
import p163g.p201e.p203b.p299m.C7536a;
import p163g.p201e.p203b.p299m.C7536a.C7538b;
import p163g.p201e.p203b.p307o.p308p.C7629c;
import p163g.p201e.p203b.p307o.p308p.C7630d;
import p163g.p201e.p203b.p319v.C7902r;
import p163g.p201e.p203b.p319v.C7903s;
import p163g.p201e.p203b.p319v.C7904t;
import p163g.p201e.p203b.p319v.C7905u;
import p163g.p201e.p203b.p319v.p320a0.C7822c;
import p163g.p201e.p203b.p319v.p320a0.C7823d;
import p512h.p513c.p514k.C11890i;
import p686n.p687a.Timber;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000º\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0013\u0018\u0000 t2\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u0005:\u0002tuB\u0005¢\u0006\u0002\u0010\u0006J\b\u0010M\u001a\u00020NH\u0002J\u0010\u0010O\u001a\u00020N2\u0006\u0010P\u001a\u00020QH\u0002J\b\u0010R\u001a\u00020NH\u0002J\b\u0010S\u001a\u00020NH\u0002J\b\u0010T\u001a\u00020UH\u0016J\u0015\u0010V\u001a\u00020N2\u0006\u0010W\u001a\u00020?H\u0001¢\u0006\u0002\bXJ\u0018\u0010Y\u001a\u00020\u001e2\u0006\u0010Z\u001a\u00020Q2\u0006\u0010[\u001a\u00020QH\u0016J\b\u0010\\\u001a\u00020\u001eH\u0016J&\u0010]\u001a\u0004\u0018\u00010\u00142\u0006\u0010^\u001a\u00020_2\b\u0010`\u001a\u0004\u0018\u00010a2\b\u0010b\u001a\u0004\u0018\u00010cH\u0016J\b\u0010d\u001a\u00020NH\u0016J\b\u0010e\u001a\u00020NH\u0016J\b\u0010f\u001a\u00020NH\u0016J\b\u0010g\u001a\u00020NH\u0016J\b\u0010h\u001a\u00020NH\u0016J\u001a\u0010i\u001a\u00020N2\u0006\u0010j\u001a\u00020\u00142\b\u0010b\u001a\u0004\u0018\u00010cH\u0016J\u0018\u0010k\u001a\u00020N2\u0006\u0010l\u001a\u00020a2\u0006\u0010m\u001a\u00020\u001eH\u0002J\u0017\u0010n\u001a\u0004\u0018\u00010N2\u0006\u0010o\u001a\u00020\u001eH\u0002¢\u0006\u0002\u0010pJ\b\u0010q\u001a\u00020NH\u0002J\u0010\u0010r\u001a\u00020\u001e2\u0006\u0010Z\u001a\u00020QH\u0002J\b\u0010s\u001a\u00020NH\u0002R\u001e\u0010\u0007\u001a\u00020\b8\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u001e\u0010\r\u001a\u00020\u000e8\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u0010\u0010\u0013\u001a\u0004\u0018\u00010\u0014X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0015\u001a\u0004\u0018\u00010\u0016X\u000e¢\u0006\u0002\n\u0000R\u001e\u0010\u0017\u001a\u00020\u00188\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\u0014\u0010\u001d\u001a\u00020\u001e8BX\u0004¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001fR\u001e\u0010 \u001a\u00020!8\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%R\u001e\u0010&\u001a\u00020'8\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b(\u0010)\"\u0004\b*\u0010+R\u001e\u0010,\u001a\u00020-8\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b.\u0010/\"\u0004\b0\u00101R\u001e\u00102\u001a\u0002038\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b4\u00105\"\u0004\b6\u00107R\u001e\u00108\u001a\u0002098\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b:\u0010;\"\u0004\b<\u0010=R\u0010\u0010>\u001a\u0004\u0018\u00010?X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010@\u001a\u0004\u0018\u00010\u0014X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010A\u001a\u0004\u0018\u00010BX\u000e¢\u0006\u0002\n\u0000R\u0011\u0010C\u001a\u00020D8F¢\u0006\u0006\u001a\u0004\bE\u0010FR\u001e\u0010G\u001a\u00020H8\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\bI\u0010J\"\u0004\bK\u0010L¨\u0006v"}, mo31007d2 = {"Lcom/bamtechmedia/dominguez/paywall/ui/PaywallFragment;", "Ldagger/android/support/DaggerFragment;", "Lcom/bamtechmedia/dominguez/core/utils/BackPressHandler;", "Lcom/bamtechmedia/dominguez/analytics/AnalyticsStateProvider;", "Lcom/bamtechmedia/dominguez/error/api/ReloadListener;", "Lcom/bamtechmedia/dominguez/dialogs/AlertDialogCallback;", "()V", "analytics", "Lcom/bamtechmedia/dominguez/purchase/PaywallAnalytics;", "getAnalytics", "()Lcom/bamtechmedia/dominguez/purchase/PaywallAnalytics;", "setAnalytics", "(Lcom/bamtechmedia/dominguez/purchase/PaywallAnalytics;)V", "finishSubscribingRouter", "Lcom/bamtechmedia/dominguez/purchase/finishsubscribe/FinishSubscribingRouter;", "getFinishSubscribingRouter", "()Lcom/bamtechmedia/dominguez/purchase/finishsubscribe/FinishSubscribingRouter;", "setFinishSubscribingRouter", "(Lcom/bamtechmedia/dominguez/purchase/finishsubscribe/FinishSubscribingRouter;)V", "firstPaymentButton", "Landroid/view/View;", "focusSearchInterceptor", "Lcom/bamtechmedia/dominguez/core/design/widgets/focus/FocusSearchInterceptor;", "forceWebTransformationMethod", "Landroid/text/method/TransformationMethod;", "getForceWebTransformationMethod", "()Landroid/text/method/TransformationMethod;", "setForceWebTransformationMethod", "(Landroid/text/method/TransformationMethod;)V", "isOnline", "", "()Z", "offlineRouter", "Lcom/bamtechmedia/dominguez/error/api/OfflineRouter;", "getOfflineRouter", "()Lcom/bamtechmedia/dominguez/error/api/OfflineRouter;", "setOfflineRouter", "(Lcom/bamtechmedia/dominguez/error/api/OfflineRouter;)V", "offlineState", "Lcom/bamtechmedia/dominguez/core/OfflineState;", "getOfflineState", "()Lcom/bamtechmedia/dominguez/core/OfflineState;", "setOfflineState", "(Lcom/bamtechmedia/dominguez/core/OfflineState;)V", "paywallRouter", "Lcom/bamtechmedia/dominguez/purchase/PaywallRouter;", "getPaywallRouter", "()Lcom/bamtechmedia/dominguez/purchase/PaywallRouter;", "setPaywallRouter", "(Lcom/bamtechmedia/dominguez/purchase/PaywallRouter;)V", "paywallTransitionAnimation", "Lcom/bamtechmedia/dominguez/core/animation/TransitionAnimationHelper;", "getPaywallTransitionAnimation", "()Lcom/bamtechmedia/dominguez/core/animation/TransitionAnimationHelper;", "setPaywallTransitionAnimation", "(Lcom/bamtechmedia/dominguez/core/animation/TransitionAnimationHelper;)V", "presenter", "Lcom/bamtechmedia/dominguez/paywall/ui/PaywallPresenter;", "getPresenter", "()Lcom/bamtechmedia/dominguez/paywall/ui/PaywallPresenter;", "setPresenter", "(Lcom/bamtechmedia/dominguez/paywall/ui/PaywallPresenter;)V", "previousState", "Lcom/bamtechmedia/dominguez/purchase/PaywallState;", "secondPaymentButton", "topFragment", "Landroidx/fragment/app/Fragment;", "type", "Lcom/bamtechmedia/dominguez/paywall/ui/PaywallFragment$Type;", "getType", "()Lcom/bamtechmedia/dominguez/paywall/ui/PaywallFragment$Type;", "viewModel", "Lcom/bamtechmedia/dominguez/purchase/PaywallViewModel;", "getViewModel", "()Lcom/bamtechmedia/dominguez/purchase/PaywallViewModel;", "setViewModel", "(Lcom/bamtechmedia/dominguez/purchase/PaywallViewModel;)V", "addOnFocusInterceptor", "", "adjustMarginRestoreButton", "listSize", "", "disableAccessibilityForTopFragment", "enableAccessibilityForTopFragment", "getAnalyticsSection", "Lcom/bamtechmedia/dominguez/analytics/AnalyticsSection;", "handlePaywallState", "paywallState", "handlePaywallState$paywall_release", "onAlertDialogAction", "requestId", "which", "onBackPress", "onCreateView", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onDestroyView", "onPause", "onReloadRequested", "onResume", "onStart", "onViewCreated", "view", "setButtonStatus", "buttonContainer", "isLoading", "setNavigationBar", "shouldBeTranslucent", "(Z)Lkotlin/Unit;", "setupDisclaimerTextView", "shouldBeGrantedAccess", "showFinishSubscribingDialog", "Companion", "Type", "paywall_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* renamed from: g.e.b.v.b0.e */
/* compiled from: PaywallFragment.kt */
public final class C7838e extends C11890i implements C5818b, C2413n, C7630d, C7536a {

    /* renamed from: j0 */
    public static final C7839a f16939j0 = new C7839a(null);

    /* renamed from: U */
    public C7081s f16940U;

    /* renamed from: V */
    public C7041a f16941V;

    /* renamed from: W */
    public C7084v f16942W;

    /* renamed from: X */
    public C7629c f16943X;

    /* renamed from: Y */
    public C7856j f16944Y;

    /* renamed from: Z */
    public C3807b f16945Z;

    /* renamed from: a0 */
    public TransformationMethod f16946a0;

    /* renamed from: b0 */
    public C3796d f16947b0;

    /* renamed from: c0 */
    public C7051i f16948c0;
    /* access modifiers changed from: private */

    /* renamed from: d0 */
    public View f16949d0;
    /* access modifiers changed from: private */

    /* renamed from: e0 */
    public View f16950e0;

    /* renamed from: f0 */
    private C5691a f16951f0;
    /* access modifiers changed from: private */

    /* renamed from: g0 */
    public C7083u f16952g0;

    /* renamed from: h0 */
    private Fragment f16953h0;

    /* renamed from: i0 */
    private HashMap f16954i0;

    /* renamed from: g.e.b.v.b0.e$a */
    /* compiled from: PaywallFragment.kt */
    public static final class C7839a {
        private C7839a() {
        }

        /* renamed from: a */
        public final C7838e mo20763a(C7840b bVar) {
            C7838e eVar = new C7838e();
            eVar.setArguments(C5833g.m18829a(C12907r.m40244a("extra_type", bVar)));
            return eVar;
        }

        public /* synthetic */ C7839a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: g.e.b.v.b0.e$b */
    /* compiled from: PaywallFragment.kt */
    public enum C7840b {
        SUBSCRIBE,
        RESTART
    }

    /* renamed from: g.e.b.v.b0.e$c */
    /* compiled from: PaywallFragment.kt */
    public static final class C7841c implements C5691a {

        /* renamed from: a */
        final /* synthetic */ C7838e f16958a;

        C7841c(C7838e eVar) {
            this.f16958a = eVar;
        }

        /* renamed from: a */
        public View mo17542a(View view, int i, View view2) {
            View view3 = null;
            if (Intrinsics.areEqual((Object) view, (Object) this.f16958a.f16949d0)) {
                if (i == 66) {
                    view3 = this.f16958a.f16950e0;
                }
                if (i == 33 || i == 17) {
                    return this.f16958a.f16949d0;
                }
                return view3;
            } else if (Intrinsics.areEqual((Object) view, (Object) this.f16958a.f16950e0)) {
                if (i == 17) {
                    view3 = this.f16958a.f16949d0;
                }
                if (i == 33 || i == 66) {
                    return this.f16958a.f16950e0;
                }
                return view3;
            } else if (!Intrinsics.areEqual((Object) view, (Object) (Button) this.f16958a._$_findCachedViewById(C7904t.paywallBtnRestore)) || i != 130) {
                return null;
            } else {
                View _$_findCachedViewById = this.f16958a._$_findCachedViewById(C7904t.paywallBtnDeveloperSkip);
                Intrinsics.checkReturnedValueIsNotNull((Object) _$_findCachedViewById, "paywallBtnDeveloperSkip");
                if (_$_findCachedViewById.getVisibility() == 8) {
                    return (Button) this.f16958a._$_findCachedViewById(C7904t.paywallBtnRestore);
                }
                return null;
            }
        }
    }

    /* renamed from: g.e.b.v.b0.e$d */
    /* compiled from: PaywallFragment.kt */
    static final class C7842d extends C12881k implements Function2<List<? extends C7823d>, ViewGroup, C13145v> {

        /* renamed from: U */
        final /* synthetic */ C7083u f16959U;

        /* renamed from: c */
        final /* synthetic */ C7838e f16960c;

        C7842d(C7838e eVar, C7083u uVar) {
            this.f16960c = eVar;
            this.f16959U = uVar;
            super(2);
        }

        /* renamed from: a */
        public final void mo20764a(List<? extends C7823d> list, ViewGroup viewGroup) {
            C7083u b = this.f16960c.f16952g0;
            if (!Intrinsics.areEqual((Object) list, (Object) b != null ? b.mo19869e() : null)) {
                List<View> a = this.f16960c.mo20761q().mo20776a(viewGroup, this.f16959U);
                if (!a.isEmpty()) {
                    this.f16960c.f16949d0 = (View) a.get(0);
                    if (a.size() > 1) {
                        this.f16960c.f16950e0 = (View) a.get(1);
                    }
                    for (View addView : a) {
                        viewGroup.addView(addView);
                    }
                    this.f16960c.m22971w();
                    Context requireContext = this.f16960c.requireContext();
                    Intrinsics.checkReturnedValueIsNotNull((Object) requireContext, "requireContext()");
                    if (C5837i.m18843e(requireContext)) {
                        this.f16960c.m22961b(a.size());
                        Flow flow = (Flow) this.f16960c._$_findCachedViewById(C7904t.paywallFlow);
                        if (flow != null) {
                            ArrayList arrayList = new ArrayList(C13187p.m40525a((Iterable) a, 10));
                            for (View id : a) {
                                arrayList.add(Integer.valueOf(id.getId()));
                            }
                            flow.setReferencedIds(C13199w.m40570b(arrayList));
                        }
                        ((View) C13199w.m40589f((List) a)).requestFocus();
                    }
                }
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            mo20764a((List) obj, (ViewGroup) obj2);
            return C13145v.f29587a;
        }
    }

    /* renamed from: g.e.b.v.b0.e$e */
    /* compiled from: View.kt */
    public static final class C7843e implements Runnable {

        /* renamed from: c */
        final /* synthetic */ C7838e f16961c;

        public C7843e(C7838e eVar) {
            this.f16961c = eVar;
        }

        public final void run() {
            this.f16961c.m22960b(false);
        }
    }

    /* renamed from: g.e.b.v.b0.e$f */
    /* compiled from: PaywallFragment.kt */
    static final class C7844f extends C12881k implements Function0<C13145v> {

        /* renamed from: c */
        final /* synthetic */ C7838e f16962c;

        C7844f(C7838e eVar) {
            this.f16962c = eVar;
            super(0);
        }

        public final void invoke() {
            this.f16962c.mo20760p().mo19828a(this.f16962c);
        }
    }

    /* renamed from: g.e.b.v.b0.e$g */
    /* compiled from: PaywallFragment.kt */
    static final class C7845g extends C12881k implements Function1<C7083u, C13145v> {

        /* renamed from: c */
        final /* synthetic */ C7838e f16963c;

        C7845g(C7838e eVar) {
            this.f16963c = eVar;
            super(1);
        }

        /* renamed from: a */
        public final void mo20766a(C7083u uVar) {
            this.f16963c.mo20757a(uVar);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo20766a((C7083u) obj);
            return C13145v.f29587a;
        }
    }

    /* renamed from: g.e.b.v.b0.e$h */
    /* compiled from: View.kt */
    public static final class C7846h implements Runnable {

        /* renamed from: c */
        final /* synthetic */ C7838e f16964c;

        public C7846h(C7838e eVar) {
            this.f16964c = eVar;
        }

        public final void run() {
            this.f16964c.m22960b(true);
        }
    }

    /* renamed from: g.e.b.v.b0.e$i */
    /* compiled from: PaywallFragment.kt */
    static final class C7847i implements OnClickListener {

        /* renamed from: c */
        final /* synthetic */ C7838e f16965c;

        C7847i(C7838e eVar) {
            this.f16965c = eVar;
        }

        public final void onClick(View view) {
            this.f16965c.getViewModel().mo19875C();
        }
    }

    /* renamed from: g.e.b.v.b0.e$j */
    /* compiled from: PaywallFragment.kt */
    static final class C7848j implements OnClickListener {

        /* renamed from: c */
        final /* synthetic */ C7838e f16966c;

        C7848j(C7838e eVar) {
            this.f16966c = eVar;
        }

        public final void onClick(View view) {
            this.f16966c.getViewModel().mo19876D();
            this.f16966c.mo20759o().mo19833d();
        }
    }

    /* renamed from: g.e.b.v.b0.e$k */
    /* compiled from: PaywallFragment.kt */
    static final class C7849k extends C12881k implements Function0<C13145v> {

        /* renamed from: c */
        final /* synthetic */ C7838e f16967c;

        C7849k(C7838e eVar) {
            this.f16967c = eVar;
            super(0);
        }

        public final void invoke() {
            this.f16967c.m22972x();
            this.f16967c.mo20759o().mo19829a();
        }
    }

    /* renamed from: g.e.b.v.b0.e$l */
    /* compiled from: PaywallFragment.kt */
    static final class C7850l extends C12881k implements Function1<WindowInsets, C13145v> {

        /* renamed from: c */
        final /* synthetic */ C7838e f16968c;

        C7850l(C7838e eVar) {
            this.f16968c = eVar;
            super(1);
        }

        /* renamed from: a */
        public final void mo20770a(WindowInsets windowInsets) {
            FrameLayout frameLayout = (FrameLayout) this.f16968c._$_findCachedViewById(C7904t.paywallBtnRestoreLayout);
            if (frameLayout != null) {
                frameLayout.setPaddingRelative(frameLayout.getPaddingStart(), frameLayout.getPaddingTop(), frameLayout.getPaddingEnd(), windowInsets.getSystemWindowInsetBottom());
            }
            NestedScrollView nestedScrollView = (NestedScrollView) this.f16968c._$_findCachedViewById(C7904t.paywallConstraintScrollLayout);
            if (nestedScrollView != null) {
                nestedScrollView.setPaddingRelative(nestedScrollView.getPaddingStart(), windowInsets.getSystemWindowInsetTop(), nestedScrollView.getPaddingEnd(), nestedScrollView.getPaddingBottom());
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo20770a((WindowInsets) obj);
            return C13145v.f29587a;
        }
    }

    /* renamed from: g.e.b.v.b0.e$m */
    /* compiled from: PaywallFragment.kt */
    static final class C7851m extends C12881k implements Function2<View, TextView, C13145v> {

        /* renamed from: c */
        final /* synthetic */ C7838e f16969c;

        C7851m(C7838e eVar) {
            this.f16969c = eVar;
            super(2);
        }

        /* renamed from: a */
        public final void mo20771a(View view, TextView textView) {
            C0425d dVar = new C0425d();
            dVar.mo2430c((ConstraintLayout) this.f16969c._$_findCachedViewById(C7904t.paywallConstraintLayout));
            dVar.mo2413a(textView.getId(), 6, view.getId(), 6);
            dVar.mo2413a(textView.getId(), 7, view.getId(), 7);
            dVar.mo2413a(textView.getId(), 3, view.getId(), 4);
            dVar.mo2427b((ConstraintLayout) this.f16969c._$_findCachedViewById(C7904t.paywallConstraintLayout));
            textView.setVisibility(0);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            mo20771a((View) obj, (TextView) obj2);
            return C13145v.f29587a;
        }
    }

    /* renamed from: s */
    private final void m22967s() {
        View _$_findCachedViewById = _$_findCachedViewById(C7904t.paywallContainer);
        if (_$_findCachedViewById != null) {
            FocusSearchInterceptFrameLayout focusSearchInterceptFrameLayout = (FocusSearchInterceptFrameLayout) _$_findCachedViewById;
            this.f16951f0 = new C7841c(this);
            focusSearchInterceptFrameLayout.setFocusSearchInterceptor(this.f16951f0);
            return;
        }
        throw new C13142s("null cannot be cast to non-null type com.bamtechmedia.dominguez.core.design.widgets.focus.FocusSearchInterceptFrameLayout");
    }

    /* renamed from: t */
    private final void m22968t() {
        this.f16953h0 = C5839j.m18845a(getFragmentManager());
        Fragment fragment = this.f16953h0;
        if (fragment != null) {
            View view = fragment.getView();
            if (view != null) {
                view.setImportantForAccessibility(4);
            }
        }
    }

    /* renamed from: u */
    private final void m22969u() {
        Fragment fragment = this.f16953h0;
        if (fragment != null) {
            View view = fragment.getView();
            if (view != null) {
                view.setImportantForAccessibility(1);
            }
        }
        this.f16953h0 = null;
    }

    /* renamed from: v */
    private final boolean m22970v() {
        C3796d dVar = this.f16947b0;
        if (dVar != null) {
            return dVar.mo13695j();
        }
        Intrinsics.throwUninitializedPropertyAccessException("offlineState");
        throw null;
    }

    /* access modifiers changed from: private */
    /* renamed from: w */
    public final void m22971w() {
        boolean z;
        Context requireContext = requireContext();
        Intrinsics.checkReturnedValueIsNotNull((Object) requireContext, "requireContext()");
        if (C5837i.m18843e(requireContext)) {
            ConstraintLayout constraintLayout = (ConstraintLayout) _$_findCachedViewById(C7904t.paywallConstraintLayout);
            Intrinsics.checkReturnedValueIsNotNull((Object) constraintLayout, "paywallConstraintLayout");
            Object obj = null;
            for (Object next : C4121a0.m14117a(constraintLayout)) {
                Object tag = ((View) next).getTag();
                if (!(tag instanceof C7822c)) {
                    tag = null;
                }
                C7822c cVar = (C7822c) tag;
                if (cVar != null) {
                    C7856j jVar = this.f16944Y;
                    if (jVar != null) {
                        z = jVar.mo20778a((C7823d) cVar);
                    } else {
                        Intrinsics.throwUninitializedPropertyAccessException("presenter");
                        throw null;
                    }
                } else {
                    z = false;
                }
                if (z) {
                    obj = next;
                }
            }
            C5884x.m18949a((View) obj, (TextView) _$_findCachedViewById(C7904t.paywallYearlyTVDisclaimerText), new C7851m(this));
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: x */
    public final void m22972x() {
        C7081s sVar = this.f16940U;
        if (sVar != null) {
            sVar.mo19863a();
        } else {
            Intrinsics.throwUninitializedPropertyAccessException("paywallRouter");
            throw null;
        }
    }

    public void _$_clearFindViewByIdCache() {
        HashMap hashMap = this.f16954i0;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    public View _$_findCachedViewById(int i) {
        if (this.f16954i0 == null) {
            this.f16954i0 = new HashMap();
        }
        View view = (View) this.f16954i0.get(Integer.valueOf(i));
        if (view == null) {
            View view2 = getView();
            if (view2 == null) {
                return null;
            }
            view = view2.findViewById(i);
            this.f16954i0.put(Integer.valueOf(i), view);
        }
        return view;
    }

    /* renamed from: f */
    public void mo11889f() {
        C7084v vVar = this.f16942W;
        if (vVar != null) {
            vVar.mo19874B();
        } else {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
            throw null;
        }
    }

    public final C7084v getViewModel() {
        C7084v vVar = this.f16942W;
        if (vVar != null) {
            return vVar;
        }
        Intrinsics.throwUninitializedPropertyAccessException("viewModel");
        throw null;
    }

    /* renamed from: k */
    public boolean mo12236k() {
        m22972x();
        return true;
    }

    /* renamed from: o */
    public final C7051i mo20759o() {
        C7051i iVar = this.f16948c0;
        if (iVar != null) {
            return iVar;
        }
        Intrinsics.throwUninitializedPropertyAccessException("analytics");
        throw null;
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(C7905u.fragment_paywall, viewGroup, false);
    }

    public void onDestroyView() {
        this.f16949d0 = null;
        this.f16950e0 = null;
        this.f16951f0 = null;
        super.onDestroyView();
        _$_clearFindViewByIdCache();
    }

    public void onPause() {
        super.onPause();
        m22969u();
    }

    public void onResume() {
        super.onResume();
        m22968t();
        C7084v vVar = this.f16942W;
        if (vVar != null) {
            C5755i.m18679a(this, vVar, C0716a.ON_PAUSE, null, new C7845g(this), 4, null);
            return;
        }
        Intrinsics.throwUninitializedPropertyAccessException("viewModel");
        throw null;
    }

    public void onStart() {
        super.onStart();
        C7084v vVar = this.f16942W;
        if (vVar != null) {
            vVar.mo19879y();
        } else {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
            throw null;
        }
    }

    public void onViewCreated(View view, Bundle bundle) {
        C3807b bVar = this.f16945Z;
        String str = "paywallTransitionAnimation";
        if (bVar != null) {
            View findViewById = view.findViewById(C7904t.paywallScrimBackground);
            Intrinsics.checkReturnedValueIsNotNull((Object) findViewById, "view.paywallScrimBackground");
            View view2 = (FrameLayout) view.findViewById(C7904t.paywallConstraintLayoutContainer);
            if (view2 == null) {
                view2 = (ConstraintLayout) view.findViewById(C7904t.paywallConstraintLayout);
                Intrinsics.checkReturnedValueIsNotNull((Object) view2, "view.paywallConstraintLayout");
            }
            C0532d requireActivity = requireActivity();
            Intrinsics.checkReturnedValueIsNotNull((Object) requireActivity, "requireActivity()");
            bVar.mo13709a(findViewById, view2, requireActivity);
            NestedScrollView nestedScrollView = (NestedScrollView) _$_findCachedViewById(C7904t.paywallConstraintScrollLayout);
            if (nestedScrollView != null) {
                DisneyTitleToolbar disneyTitleToolbar = (DisneyTitleToolbar) _$_findCachedViewById(C7904t.paywallDisneyToolbar);
                if (disneyTitleToolbar != null) {
                    DisneyTitleToolbar.m18444a(disneyTitleToolbar, nestedScrollView, (Function1) null, 0, (Function0) null, 14, (Object) null);
                }
                DisneyTitleToolbar disneyTitleToolbar2 = (DisneyTitleToolbar) _$_findCachedViewById(C7904t.paywallDisneyToolbar);
                if (disneyTitleToolbar2 != null) {
                    disneyTitleToolbar2.mo17380c(false);
                }
            }
            View _$_findCachedViewById = _$_findCachedViewById(C7904t.paywallBtnDeveloperSkip);
            Intrinsics.checkReturnedValueIsNotNull((Object) _$_findCachedViewById, "paywallBtnDeveloperSkip");
            C7084v vVar = this.f16942W;
            String str2 = "viewModel";
            if (vVar != null) {
                _$_findCachedViewById.setVisibility(vVar.mo19873A() ? 0 : 8);
                _$_findCachedViewById(C7904t.paywallBtnDeveloperSkip).setOnClickListener(new C7847i(this));
                TextView textView = (TextView) _$_findCachedViewById(C7904t.paywallLegalText);
                String str3 = "paywallLegalText";
                Intrinsics.checkReturnedValueIsNotNull((Object) textView, str3);
                textView.setMovementMethod(LinkMovementMethod.getInstance());
                TextView textView2 = (TextView) _$_findCachedViewById(C7904t.paywallLegalText);
                Intrinsics.checkReturnedValueIsNotNull((Object) textView2, str3);
                TransformationMethod transformationMethod = this.f16946a0;
                if (transformationMethod != null) {
                    textView2.setTransformationMethod(transformationMethod);
                    TextView textView3 = (Button) _$_findCachedViewById(C7904t.paywallBtnRestore);
                    if (textView3 == null) {
                        textView3 = (TextView) _$_findCachedViewById(C7904t.paywallBtnRestoreMobile);
                    }
                    if (textView3 != null) {
                        textView3.setOnClickListener(new C7848j(this));
                    }
                    DisneyTitleToolbar disneyTitleToolbar3 = (DisneyTitleToolbar) _$_findCachedViewById(C7904t.paywallDisneyToolbar);
                    if (disneyTitleToolbar3 != null) {
                        DisneyTitleToolbar.m18447a(disneyTitleToolbar3, (String) null, (Function0) new C7849k(this), 1, (Object) null);
                    }
                    if (!m22970v()) {
                        C7629c cVar = this.f16943X;
                        if (cVar != null) {
                            int i = C7904t.paywallContainer;
                            C0538i childFragmentManager = getChildFragmentManager();
                            Intrinsics.checkReturnedValueIsNotNull((Object) childFragmentManager, "childFragmentManager");
                            cVar.mo20550a(i, childFragmentManager);
                        } else {
                            Intrinsics.throwUninitializedPropertyAccessException("offlineRouter");
                            throw null;
                        }
                    }
                    C7084v vVar2 = this.f16942W;
                    if (vVar2 != null) {
                        if (!vVar2.mo19880z()) {
                            view.postDelayed(new C7846h(this), 200);
                            C3807b bVar2 = this.f16945Z;
                            if (bVar2 != null) {
                                bVar2.mo13708a();
                                C7084v vVar3 = this.f16942W;
                                if (vVar3 != null) {
                                    vVar3.mo19878d(true);
                                } else {
                                    Intrinsics.throwUninitializedPropertyAccessException(str2);
                                    throw null;
                                }
                            } else {
                                Intrinsics.throwUninitializedPropertyAccessException(str);
                                throw null;
                            }
                        } else {
                            m22960b(true);
                        }
                        C5852n0.m18883a(view, false, false, (Function1<? super WindowInsets, C13145v>) new C7850l<Object,C13145v>(this));
                        Context requireContext = requireContext();
                        Intrinsics.checkReturnedValueIsNotNull((Object) requireContext, "requireContext()");
                        if (C5837i.m18843e(requireContext)) {
                            m22967s();
                            return;
                        }
                        return;
                    }
                    Intrinsics.throwUninitializedPropertyAccessException(str2);
                    throw null;
                }
                Intrinsics.throwUninitializedPropertyAccessException("forceWebTransformationMethod");
                throw null;
            }
            Intrinsics.throwUninitializedPropertyAccessException(str2);
            throw null;
        }
        Intrinsics.throwUninitializedPropertyAccessException(str);
        throw null;
    }

    /* renamed from: p */
    public final C7041a mo20760p() {
        C7041a aVar = this.f16941V;
        if (aVar != null) {
            return aVar;
        }
        Intrinsics.throwUninitializedPropertyAccessException("finishSubscribingRouter");
        throw null;
    }

    /* renamed from: q */
    public final C7856j mo20761q() {
        C7856j jVar = this.f16944Y;
        if (jVar != null) {
            return jVar;
        }
        Intrinsics.throwUninitializedPropertyAccessException("presenter");
        throw null;
    }

    /* renamed from: r */
    public final C7840b mo20762r() {
        Bundle arguments = getArguments();
        Serializable serializable = arguments != null ? arguments.getSerializable("extra_type") : null;
        if (!(serializable instanceof C7840b)) {
            serializable = null;
        }
        C7840b bVar = (C7840b) serializable;
        if (bVar != null) {
            return bVar;
        }
        throw new IllegalStateException("You must call one of the newInstance methods.");
    }

    /* renamed from: c */
    private final boolean m22964c(int i) {
        return i == C7904t.paywall_sdk_error_link_subscription_partial_error || i == C7904t.paywall_sdk_error_temp_access;
    }

    /* renamed from: d */
    public boolean mo11888d() {
        return C7538b.m22446a(this);
    }

    /* renamed from: e */
    public C2378m mo11534e() {
        return new C2378m(C2433b.ONBOARDING_PAYWALL_IAP, (String) null, 2, (DefaultConstructorMarker) null);
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public final void m22961b(int i) {
        Button button = (Button) _$_findCachedViewById(C7904t.paywallBtnRestore);
        LayoutParams layoutParams = button != null ? button.getLayoutParams() : null;
        if (layoutParams != null) {
            C0415c cVar = (C0415c) layoutParams;
            if (i == 1) {
                cVar.topMargin = (int) getResources().getDimension(C7903s.padding_small);
                return;
            }
            TextView textView = (TextView) _$_findCachedViewById(C7904t.paywallYearlyTVDisclaimerText);
            if (textView != null) {
                if (textView.getVisibility() == 0) {
                    cVar.topMargin = (int) getResources().getDimension(C7903s.paywall_restore_btn_dynamic_top_margin);
                    return;
                }
                return;
            }
            return;
        }
        throw new C13142s("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
    }

    /* renamed from: a */
    public final void mo20757a(C7083u uVar) {
        StringBuilder sb = new StringBuilder();
        sb.append("New PaywallState observed: ");
        sb.append(uVar);
        int i = 0;
        Timber.m44522a(sb.toString(), new Object[0]);
        if (uVar.mo19865a()) {
            m22960b(false);
        }
        ProgressBar progressBar = (ProgressBar) _$_findCachedViewById(C7904t.progressBar);
        Intrinsics.checkReturnedValueIsNotNull((Object) progressBar, "progressBar");
        if (!uVar.mo19868d()) {
            i = 8;
        }
        progressBar.setVisibility(i);
        C7856j jVar = this.f16944Y;
        if (jVar != null) {
            jVar.mo20777a(uVar, getView(), mo20762r());
            Context requireContext = requireContext();
            Intrinsics.checkReturnedValueIsNotNull((Object) requireContext, "requireContext()");
            ViewGroup viewGroup = C5837i.m18843e(requireContext) ? (ConstraintLayout) _$_findCachedViewById(C7904t.paywallConstraintLayout) : (LinearLayout) _$_findCachedViewById(C7904t.paywallButtonsLayout);
            Intrinsics.checkReturnedValueIsNotNull((Object) viewGroup, "btnContainer");
            m22956a(viewGroup, uVar.mo19866b());
            C5884x.m18949a(uVar.mo19869e(), viewGroup, new C7842d(this, uVar));
            this.f16952g0 = uVar;
            return;
        }
        Intrinsics.throwUninitializedPropertyAccessException("presenter");
        throw null;
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public final C13145v m22960b(boolean z) {
        int i;
        C0532d activity = getActivity();
        if (activity == null) {
            return null;
        }
        Intrinsics.checkReturnedValueIsNotNull((Object) activity, "activity");
        Window window = activity.getWindow();
        if (window != null) {
            View decorView = window.getDecorView();
            if (decorView != null) {
                decorView.setSystemUiVisibility((z ? DateUtils.FORMAT_NO_NOON : 1024) | 256);
            }
        }
        Window window2 = activity.getWindow();
        if (window2 != null) {
            if (z) {
                i = C7902r.vader_grey2_80;
            } else {
                i = C7902r.vader_grey2;
            }
            window2.setNavigationBarColor(C4025a.m13788a((Context) activity, i));
        }
        return C13145v.f29587a;
    }

    /* renamed from: a */
    public boolean mo11887a(int i, int i2) {
        if (i == C7904t.finish_subscribing && i2 == -1) {
            View _$_findCachedViewById = _$_findCachedViewById(C7904t.paywallContainer);
            Intrinsics.checkReturnedValueIsNotNull((Object) _$_findCachedViewById, "paywallContainer");
            _$_findCachedViewById.postDelayed(new C7843e(this), 200);
            C3807b bVar = this.f16945Z;
            if (bVar != null) {
                return bVar.mo13710a(new C7844f(this));
            }
            Intrinsics.throwUninitializedPropertyAccessException("paywallTransitionAnimation");
            throw null;
        } else if (!m22964c(i) || i2 != -1) {
            return false;
        } else {
            if (isAdded()) {
                m22960b(false);
            }
            C7084v vVar = this.f16942W;
            if (vVar != null) {
                vVar.mo19875C();
                return true;
            }
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
            throw null;
        }
    }

    /* renamed from: a */
    private final void m22956a(ViewGroup viewGroup, boolean z) {
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = viewGroup.getChildAt(i);
            Intrinsics.checkReturnedValueIsNotNull((Object) childAt, "getChildAt(index)");
            if (childAt instanceof LinearLayout) {
                m22956a((ViewGroup) childAt, z);
            } else {
                if (!(childAt instanceof LoadingButton)) {
                    childAt = null;
                }
                LoadingButton loadingButton = (LoadingButton) childAt;
                if (loadingButton != null) {
                    loadingButton.setEnabled(!z);
                }
            }
        }
    }
}
