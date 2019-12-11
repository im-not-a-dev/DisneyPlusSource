package com.bamtechmedia.dominguez.purchase.p273a0;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.fragment.app.C0538i;
import com.bamtechmedia.dominguez.analytics.C2378m;
import com.bamtechmedia.dominguez.analytics.C2413n;
import com.bamtechmedia.dominguez.analytics.p057o0.C2433b;
import com.bamtechmedia.dominguez.auth.p066r0.C2809j;
import com.bamtechmedia.dominguez.auth.p066r0.C2809j.C2810a;
import com.bamtechmedia.dominguez.config.C3572r0;
import com.bamtechmedia.dominguez.config.C3572r0.C3573a;
import com.bamtechmedia.dominguez.core.C3796d;
import com.bamtechmedia.dominguez.core.design.widgets.WindowInsetsFrameLayout;
import com.bamtechmedia.dominguez.core.utils.C5833g;
import com.bamtechmedia.dominguez.core.utils.C5852n0;
import com.bamtechmedia.dominguez.purchase.C7112z;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;
import kotlin.C12907r;
import kotlin.C13145v;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.C12881k;
import p163g.p201e.p203b.p299m.C7536a;
import p163g.p201e.p203b.p299m.C7536a.C7538b;
import p163g.p201e.p203b.p307o.p308p.C7629c;
import p163g.p201e.p203b.p319v.C7862c;
import p163g.p201e.p203b.p319v.C7904t;
import p163g.p201e.p203b.p319v.C7905u;
import p163g.p201e.p203b.p319v.C7906v;
import p512h.p513c.p514k.C11890i;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 N2\u00020\u00012\u00020\u00022\u00020\u0003:\u0002NOB\u0005¢\u0006\u0002\u0010\u0004J\r\u00106\u001a\u000207H\u0001¢\u0006\u0002\b8J\b\u00109\u001a\u00020:H\u0016J\b\u0010;\u001a\u00020\u0012H\u0002J\r\u0010<\u001a\u000207H\u0001¢\u0006\u0002\b=J\u0018\u0010>\u001a\u00020\u00122\u0006\u0010?\u001a\u00020@2\u0006\u0010A\u001a\u00020@H\u0016J&\u0010B\u001a\u0004\u0018\u00010C2\u0006\u0010D\u001a\u00020E2\b\u0010F\u001a\u0004\u0018\u00010G2\b\u0010H\u001a\u0004\u0018\u00010IH\u0016J\u001a\u0010J\u001a\u0002072\u0006\u0010K\u001a\u00020C2\b\u0010H\u001a\u0004\u0018\u00010IH\u0016J\b\u0010L\u001a\u000207H\u0002J\b\u0010M\u001a\u000207H\u0002R\u001e\u0010\u0005\u001a\u00020\u00068\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001e\u0010\u000b\u001a\u00020\f8\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0011\u001a\u00020\u00128BX\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0013R\u001e\u0010\u0014\u001a\u00020\u00158\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\u001e\u0010\u001a\u001a\u00020\u001b8\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR\u001e\u0010 \u001a\u00020!8\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%R\u001e\u0010&\u001a\u00020'8\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b(\u0010)\"\u0004\b*\u0010+R\u001e\u0010,\u001a\u00020-8\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b.\u0010/\"\u0004\b0\u00101R\u0014\u00102\u001a\u0002038BX\u0004¢\u0006\u0006\u001a\u0004\b4\u00105¨\u0006P"}, mo31007d2 = {"Lcom/bamtechmedia/dominguez/purchase/complete/CompletePurchaseFragment;", "Ldagger/android/support/DaggerFragment;", "Lcom/bamtechmedia/dominguez/analytics/AnalyticsStateProvider;", "Lcom/bamtechmedia/dominguez/dialogs/AlertDialogCallback;", "()V", "analytics", "Lcom/bamtechmedia/dominguez/purchase/PurchaseAnalytics;", "getAnalytics", "()Lcom/bamtechmedia/dominguez/purchase/PurchaseAnalytics;", "setAnalytics", "(Lcom/bamtechmedia/dominguez/purchase/PurchaseAnalytics;)V", "appDictionary", "Lcom/bamtechmedia/dominguez/config/StringDictionary;", "getAppDictionary", "()Lcom/bamtechmedia/dominguez/config/StringDictionary;", "setAppDictionary", "(Lcom/bamtechmedia/dominguez/config/StringDictionary;)V", "isOnline", "", "()Z", "logOutRouter", "Lcom/bamtechmedia/dominguez/auth/logout/LogOutRouter;", "getLogOutRouter", "()Lcom/bamtechmedia/dominguez/auth/logout/LogOutRouter;", "setLogOutRouter", "(Lcom/bamtechmedia/dominguez/auth/logout/LogOutRouter;)V", "offlineRouter", "Lcom/bamtechmedia/dominguez/error/api/OfflineRouter;", "getOfflineRouter", "()Lcom/bamtechmedia/dominguez/error/api/OfflineRouter;", "setOfflineRouter", "(Lcom/bamtechmedia/dominguez/error/api/OfflineRouter;)V", "offlineState", "Lcom/bamtechmedia/dominguez/core/OfflineState;", "getOfflineState", "()Lcom/bamtechmedia/dominguez/core/OfflineState;", "setOfflineState", "(Lcom/bamtechmedia/dominguez/core/OfflineState;)V", "onboardingImageLoader", "Lcom/bamtechmedia/dominguez/paywall/OnboardingImageLoader;", "getOnboardingImageLoader", "()Lcom/bamtechmedia/dominguez/paywall/OnboardingImageLoader;", "setOnboardingImageLoader", "(Lcom/bamtechmedia/dominguez/paywall/OnboardingImageLoader;)V", "router", "Lcom/bamtechmedia/dominguez/purchase/complete/CompletePurchaseRouter;", "getRouter", "()Lcom/bamtechmedia/dominguez/purchase/complete/CompletePurchaseRouter;", "setRouter", "(Lcom/bamtechmedia/dominguez/purchase/complete/CompletePurchaseRouter;)V", "type", "Lcom/bamtechmedia/dominguez/purchase/complete/CompletePurchaseFragment$Type;", "getType", "()Lcom/bamtechmedia/dominguez/purchase/complete/CompletePurchaseFragment$Type;", "completePurchaseButtonClicked", "", "completePurchaseButtonClicked$paywall_release", "getAnalyticsSection", "Lcom/bamtechmedia/dominguez/analytics/AnalyticsSection;", "isCompleteType", "logoutButtonClicked", "logoutButtonClicked$paywall_release", "onAlertDialogAction", "requestId", "", "which", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onViewCreated", "view", "proceedToPaywall", "setupViews", "Companion", "Type", "paywall_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* renamed from: com.bamtechmedia.dominguez.purchase.a0.b */
/* compiled from: CompletePurchaseFragment.kt */
public final class C7028b extends C11890i implements C2413n, C7536a {

    /* renamed from: c0 */
    public static final C7029a f15619c0 = new C7029a(null);

    /* renamed from: U */
    public C2809j f15620U;

    /* renamed from: V */
    public C7039e f15621V;

    /* renamed from: W */
    public C7112z f15622W;

    /* renamed from: X */
    public C7629c f15623X;

    /* renamed from: Y */
    public C3572r0 f15624Y;

    /* renamed from: Z */
    public C3796d f15625Z;

    /* renamed from: a0 */
    public C7862c f15626a0;

    /* renamed from: b0 */
    private HashMap f15627b0;

    /* renamed from: com.bamtechmedia.dominguez.purchase.a0.b$a */
    /* compiled from: CompletePurchaseFragment.kt */
    public static final class C7029a {
        private C7029a() {
        }

        /* renamed from: a */
        public final C7028b mo19818a(C7030b bVar) {
            C7028b bVar2 = new C7028b();
            bVar2.setArguments(C5833g.m18829a(C12907r.m40244a("extra_type", bVar)));
            return bVar2;
        }

        public /* synthetic */ C7029a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: com.bamtechmedia.dominguez.purchase.a0.b$b */
    /* compiled from: CompletePurchaseFragment.kt */
    public enum C7030b {
        COMPLETE(C7906v.complete_subscription_title, C7906v.complete_subscription_copy, C7906v.btn_complete_subscription, C7906v.a11y_completepurchase_cta, C7906v.a11y_completepurchase_logout),
        RESTART(C7906v.restart_sub, C7906v.restart_sub_2, C7906v.btn_restartsub, C7906v.a11y_restartsubscription_cta, C7906v.a11y_restartsubscription_logout);
        

        /* renamed from: U */
        private final int f15631U;

        /* renamed from: V */
        private final int f15632V;

        /* renamed from: W */
        private final int f15633W;

        /* renamed from: X */
        private final int f15634X;

        /* renamed from: c */
        private final int f15635c;

        private C7030b(int i, int i2, int i3, int i4, int i5) {
            this.f15635c = i;
            this.f15631U = i2;
            this.f15632V = i3;
            this.f15633W = i4;
            this.f15634X = i5;
        }

        /* renamed from: a */
        public final int mo19819a() {
            return this.f15633W;
        }

        /* renamed from: b */
        public final int mo19820b() {
            return this.f15634X;
        }

        /* renamed from: c */
        public final int mo19821c() {
            return this.f15632V;
        }

        /* renamed from: d */
        public final int mo19822d() {
            return this.f15635c;
        }

        /* renamed from: e */
        public final int mo19823e() {
            return this.f15631U;
        }
    }

    @Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, mo31007d2 = {"setupLogoutPurchaseButton", "", "invoke"}, mo31008k = 3, mo31009mv = {1, 1, 15})
    /* renamed from: com.bamtechmedia.dominguez.purchase.a0.b$c */
    /* compiled from: CompletePurchaseFragment.kt */
    static final class C7031c extends C12881k implements Function0<C13145v> {

        /* renamed from: c */
        final /* synthetic */ C7028b f15636c;

        /* renamed from: com.bamtechmedia.dominguez.purchase.a0.b$c$a */
        /* compiled from: CompletePurchaseFragment.kt */
        static final class C7032a implements OnClickListener {

            /* renamed from: c */
            final /* synthetic */ C7031c f15637c;

            C7032a(C7031c cVar) {
                this.f15637c = cVar;
            }

            public final void onClick(View view) {
                this.f15637c.f15636c.mo19817r();
            }
        }

        C7031c(C7028b bVar) {
            this.f15636c = bVar;
            super(0);
        }

        public final void invoke() {
            WindowInsetsFrameLayout windowInsetsFrameLayout = (WindowInsetsFrameLayout) this.f15636c._$_findCachedViewById(C7904t.completePurchaseBtnLogOutLayout);
            if (windowInsetsFrameLayout != null) {
                C5852n0.m18884a(windowInsetsFrameLayout, false, false, null, 7, null);
            }
            this.f15636c._$_findCachedViewById(C7904t.completePurchaseBtnLogOut).setOnClickListener(new C7032a(this));
            View _$_findCachedViewById = this.f15636c._$_findCachedViewById(C7904t.completePurchaseBtnLogOut);
            Intrinsics.checkReturnedValueIsNotNull((Object) _$_findCachedViewById, "completePurchaseBtnLogOut");
            _$_findCachedViewById.setContentDescription(C3573a.m12035a(this.f15636c.mo19815p(), this.f15636c.m21340s().mo19820b(), (Map) null, 2, (Object) null));
        }
    }

    @Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, mo31007d2 = {"setupCompleteButton", "", "invoke"}, mo31008k = 3, mo31009mv = {1, 1, 15})
    /* renamed from: com.bamtechmedia.dominguez.purchase.a0.b$d */
    /* compiled from: CompletePurchaseFragment.kt */
    static final class C7033d extends C12881k implements Function0<C13145v> {

        /* renamed from: c */
        final /* synthetic */ C7028b f15638c;

        /* renamed from: com.bamtechmedia.dominguez.purchase.a0.b$d$a */
        /* compiled from: CompletePurchaseFragment.kt */
        static final class C7034a implements OnClickListener {

            /* renamed from: c */
            final /* synthetic */ C7033d f15639c;

            C7034a(C7033d dVar) {
                this.f15639c = dVar;
            }

            public final void onClick(View view) {
                this.f15639c.f15638c.mo19814o();
            }
        }

        C7033d(C7028b bVar) {
            this.f15638c = bVar;
            super(0);
        }

        public final void invoke() {
            ((Button) this.f15638c._$_findCachedViewById(C7904t.completeBtnProceed)).setOnClickListener(new C7034a(this));
        }
    }

    /* renamed from: com.bamtechmedia.dominguez.purchase.a0.b$e */
    /* compiled from: CompletePurchaseFragment.kt */
    static final class C7035e extends C12881k implements Function0<C13145v> {

        /* renamed from: c */
        final /* synthetic */ C7028b f15640c;

        C7035e(C7028b bVar) {
            this.f15640c = bVar;
            super(0);
        }

        public final void invoke() {
            int i = C7037c.$EnumSwitchMapping$0[this.f15640c.m21340s().ordinal()];
            String str = "completePurchaseBackgroundImage";
            if (i == 1) {
                C7862c q = this.f15640c.mo19816q();
                ImageView imageView = (ImageView) this.f15640c._$_findCachedViewById(C7904t.completePurchaseBackgroundImage);
                Intrinsics.checkReturnedValueIsNotNull((Object) imageView, str);
                q.mo20786c(imageView);
            } else if (i == 2) {
                C7862c q2 = this.f15640c.mo19816q();
                ImageView imageView2 = (ImageView) this.f15640c._$_findCachedViewById(C7904t.completePurchaseBackgroundImage);
                Intrinsics.checkReturnedValueIsNotNull((Object) imageView2, str);
                q2.mo20787d(imageView2);
            }
        }
    }

    /* renamed from: com.bamtechmedia.dominguez.purchase.a0.b$f */
    /* compiled from: CompletePurchaseFragment.kt */
    static final class C7036f extends C12881k implements Function0<C13145v> {

        /* renamed from: c */
        final /* synthetic */ C7028b f15641c;

        C7036f(C7028b bVar) {
            this.f15641c = bVar;
            super(0);
        }

        public final void invoke() {
            C7030b a = this.f15641c.m21340s();
            TextView textView = (TextView) this.f15641c._$_findCachedViewById(C7904t.completeDescriptionMain);
            Intrinsics.checkReturnedValueIsNotNull((Object) textView, "completeDescriptionMain");
            textView.setText(C3573a.m12035a(this.f15641c.mo19815p(), a.mo19822d(), (Map) null, 2, (Object) null));
            TextView textView2 = (TextView) this.f15641c._$_findCachedViewById(C7904t.completeDescriptionSub);
            Intrinsics.checkReturnedValueIsNotNull((Object) textView2, "completeDescriptionSub");
            textView2.setText(C3573a.m12035a(this.f15641c.mo19815p(), a.mo19823e(), (Map) null, 2, (Object) null));
            Button button = (Button) this.f15641c._$_findCachedViewById(C7904t.completeBtnProceed);
            String str = "completeBtnProceed";
            Intrinsics.checkReturnedValueIsNotNull((Object) button, str);
            button.setText(C3573a.m12035a(this.f15641c.mo19815p(), a.mo19821c(), (Map) null, 2, (Object) null));
            Button button2 = (Button) this.f15641c._$_findCachedViewById(C7904t.completeBtnProceed);
            Intrinsics.checkReturnedValueIsNotNull((Object) button2, str);
            button2.setContentDescription(C3573a.m12035a(this.f15641c.mo19815p(), a.mo19819a(), (Map) null, 2, (Object) null));
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: s */
    public final C7030b m21340s() {
        Bundle arguments = getArguments();
        Serializable serializable = arguments != null ? arguments.getSerializable("extra_type") : null;
        if (!(serializable instanceof C7030b)) {
            serializable = null;
        }
        C7030b bVar = (C7030b) serializable;
        if (bVar != null) {
            return bVar;
        }
        throw new IllegalStateException("You must call one of the newInstance methods.");
    }

    /* renamed from: t */
    private final boolean m21341t() {
        return m21340s() == C7030b.COMPLETE;
    }

    /* renamed from: u */
    private final boolean m21342u() {
        C3796d dVar = this.f15625Z;
        if (dVar != null) {
            return dVar.mo13695j();
        }
        Intrinsics.throwUninitializedPropertyAccessException("offlineState");
        throw null;
    }

    /* renamed from: v */
    private final void m21343v() {
        int i = C7037c.$EnumSwitchMapping$1[m21340s().ordinal()];
        String str = "router";
        if (i == 1) {
            C7039e eVar = this.f15621V;
            if (eVar != null) {
                eVar.mo19826a();
            } else {
                Intrinsics.throwUninitializedPropertyAccessException(str);
                throw null;
            }
        } else if (i == 2) {
            C7039e eVar2 = this.f15621V;
            if (eVar2 != null) {
                eVar2.mo19827b();
            } else {
                Intrinsics.throwUninitializedPropertyAccessException(str);
                throw null;
            }
        }
    }

    /* renamed from: w */
    private final void m21344w() {
        C7031c cVar = new C7031c(this);
        C7033d dVar = new C7033d(this);
        C7035e eVar = new C7035e(this);
        C7036f fVar = new C7036f(this);
        cVar.invoke();
        dVar.invoke();
        eVar.invoke();
        fVar.invoke();
    }

    public void _$_clearFindViewByIdCache() {
        HashMap hashMap = this.f15627b0;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    public View _$_findCachedViewById(int i) {
        if (this.f15627b0 == null) {
            this.f15627b0 = new HashMap();
        }
        View view = (View) this.f15627b0.get(Integer.valueOf(i));
        if (view == null) {
            View view2 = getView();
            if (view2 == null) {
                return null;
            }
            view = view2.findViewById(i);
            this.f15627b0.put(Integer.valueOf(i), view);
        }
        return view;
    }

    /* renamed from: d */
    public boolean mo11888d() {
        return C7538b.m22446a(this);
    }

    /* renamed from: e */
    public C2378m mo11534e() {
        return new C2378m(m21341t() ? C2433b.COMPLETE_SUBSCRIPTION : C2433b.RESTART_SUBSCRIPTION, (String) null, 2, (DefaultConstructorMarker) null);
    }

    /* renamed from: o */
    public final void mo19814o() {
        C7112z zVar = this.f15622W;
        if (zVar != null) {
            zVar.mo19903a(m21340s());
            m21343v();
            return;
        }
        Intrinsics.throwUninitializedPropertyAccessException("analytics");
        throw null;
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(C7905u.fragment_complete_purchase, viewGroup, false);
    }

    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        _$_clearFindViewByIdCache();
    }

    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        m21344w();
        if (!m21342u()) {
            C7629c cVar = this.f15623X;
            if (cVar != null) {
                int i = C7904t.completePurchaseContainer;
                C0538i childFragmentManager = getChildFragmentManager();
                Intrinsics.checkReturnedValueIsNotNull((Object) childFragmentManager, "childFragmentManager");
                cVar.mo20550a(i, childFragmentManager);
                return;
            }
            Intrinsics.throwUninitializedPropertyAccessException("offlineRouter");
            throw null;
        }
    }

    /* renamed from: p */
    public final C3572r0 mo19815p() {
        C3572r0 r0Var = this.f15624Y;
        if (r0Var != null) {
            return r0Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("appDictionary");
        throw null;
    }

    /* renamed from: q */
    public final C7862c mo19816q() {
        C7862c cVar = this.f15626a0;
        if (cVar != null) {
            return cVar;
        }
        Intrinsics.throwUninitializedPropertyAccessException("onboardingImageLoader");
        throw null;
    }

    /* renamed from: r */
    public final void mo19817r() {
        C7112z zVar = this.f15622W;
        if (zVar != null) {
            zVar.mo19904b(m21340s());
            C2809j jVar = this.f15620U;
            if (jVar != null) {
                C2810a.m10486a(jVar, (Integer) null, 0, 3, (Object) null);
            } else {
                Intrinsics.throwUninitializedPropertyAccessException("logOutRouter");
                throw null;
            }
        } else {
            Intrinsics.throwUninitializedPropertyAccessException("analytics");
            throw null;
        }
    }

    /* renamed from: a */
    public boolean mo11887a(int i, int i2) {
        if (i != C7904t.log_out || i2 != -1) {
            return false;
        }
        C2809j jVar = this.f15620U;
        if (jVar != null) {
            C2810a.m10485a(jVar, i, false, 2, (Object) null);
            return true;
        }
        Intrinsics.throwUninitializedPropertyAccessException("logOutRouter");
        throw null;
    }
}
