package p163g.p201e.p203b.p298l;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnLayoutChangeListener;
import android.view.ViewGroup;
import android.widget.Button;
import androidx.constraintlayout.motion.widget.MotionLayout;
import androidx.fragment.app.C0532d;
import androidx.fragment.app.C0538i;
import androidx.fragment.app.Fragment;
import com.bamtechmedia.dominguez.analytics.C2378m;
import com.bamtechmedia.dominguez.analytics.C2413n;
import com.bamtechmedia.dominguez.analytics.p057o0.C2433b;
import com.bamtechmedia.dominguez.core.framework.C5755i;
import com.bamtechmedia.dominguez.profiles.C6722l1;
import com.bamtechmedia.dominguez.purchase.C7051i;
import com.bamtechmedia.dominguez.purchase.C7110x;
import java.util.ArrayList;
import java.util.HashMap;
import kotlin.C13145v;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12880j;
import kotlin.jvm.internal.C12881k;
import p096e.p121h.p135s.C4187x;
import p163g.p201e.p203b.p298l.C7531p.C7532a;
import p163g.p201e.p203b.p319v.C7819a;
import p163g.p201e.p203b.p319v.C7904t;
import p163g.p201e.p203b.p319v.C7905u;
import p163g.p201e.p203b.p319v.C7907w;
import p512h.p513c.p514k.C11885d;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 12\u00020\u00012\u00020\u0002:\u00011B\u0005¢\u0006\u0002\u0010\u0003J\b\u0010\u001c\u001a\u00020\u001dH\u0002J\b\u0010\u001e\u001a\u00020\u001fH\u0016J\u0012\u0010 \u001a\u00020\u001d2\b\u0010!\u001a\u0004\u0018\u00010\"H\u0016J&\u0010#\u001a\u0004\u0018\u00010$2\u0006\u0010%\u001a\u00020&2\b\u0010'\u001a\u0004\u0018\u00010(2\b\u0010!\u001a\u0004\u0018\u00010\"H\u0016J\b\u0010)\u001a\u00020\u001dH\u0016J\b\u0010*\u001a\u00020\u001dH\u0016J\u001a\u0010+\u001a\u00020\u001d2\u0006\u0010,\u001a\u00020$2\b\u0010!\u001a\u0004\u0018\u00010\"H\u0016J\b\u0010-\u001a\u00020\u001dH\u0002J\u0010\u0010.\u001a\u00020\u001d2\u0006\u0010/\u001a\u000200H\u0002R\u001e\u0010\u0004\u001a\u00020\u00058\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001e\u0010\n\u001a\u00020\u000b8\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001e\u0010\u0010\u001a\u00020\u00118\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u001e\u0010\u0016\u001a\u00020\u00178\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001b¨\u00062"}, mo31007d2 = {"Lcom/bamtechmedia/dominguez/dialog/FreeTrialWelcomeFragment;", "Ldagger/android/support/DaggerAppCompatDialogFragment;", "Lcom/bamtechmedia/dominguez/analytics/AnalyticsStateProvider;", "()V", "paywallAnalytics", "Lcom/bamtechmedia/dominguez/purchase/PaywallAnalytics;", "getPaywallAnalytics", "()Lcom/bamtechmedia/dominguez/purchase/PaywallAnalytics;", "setPaywallAnalytics", "(Lcom/bamtechmedia/dominguez/purchase/PaywallAnalytics;)V", "profilesSetup", "Lcom/bamtechmedia/dominguez/profiles/ProfilesSetup;", "getProfilesSetup", "()Lcom/bamtechmedia/dominguez/profiles/ProfilesSetup;", "setProfilesSetup", "(Lcom/bamtechmedia/dominguez/profiles/ProfilesSetup;)V", "purchaseAccessibility", "Lcom/bamtechmedia/dominguez/purchase/PurchaseAccessibility;", "getPurchaseAccessibility", "()Lcom/bamtechmedia/dominguez/purchase/PurchaseAccessibility;", "setPurchaseAccessibility", "(Lcom/bamtechmedia/dominguez/purchase/PurchaseAccessibility;)V", "viewModel", "Lcom/bamtechmedia/dominguez/dialog/FreeTrialWelcomeViewModel;", "getViewModel", "()Lcom/bamtechmedia/dominguez/dialog/FreeTrialWelcomeViewModel;", "setViewModel", "(Lcom/bamtechmedia/dominguez/dialog/FreeTrialWelcomeViewModel;)V", "animateExitAndComplete", "", "getAnalyticsSection", "Lcom/bamtechmedia/dominguez/analytics/AnalyticsSection;", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "onDestroyView", "onStart", "onViewCreated", "view", "performStartUpAnimations", "renderState", "newState", "Lcom/bamtechmedia/dominguez/dialog/FreeTrialWelcomeViewModel$State;", "Companion", "paywall_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* renamed from: g.e.b.l.i */
/* compiled from: FreeTrialWelcomeFragment.kt */
public final class C7513i extends C11885d implements C2413n {

    /* renamed from: Z */
    public static final C7514a f16473Z = new C7514a(null);

    /* renamed from: U */
    public C6722l1 f16474U;

    /* renamed from: V */
    public C7531p f16475V;

    /* renamed from: W */
    public C7110x f16476W;

    /* renamed from: X */
    public C7051i f16477X;

    /* renamed from: Y */
    private HashMap f16478Y;

    /* renamed from: g.e.b.l.i$a */
    /* compiled from: FreeTrialWelcomeFragment.kt */
    public static final class C7514a {
        private C7514a() {
        }

        /* renamed from: a */
        public final C7513i mo20404a() {
            return new C7513i();
        }

        public /* synthetic */ C7514a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: g.e.b.l.i$b */
    /* compiled from: FreeTrialWelcomeFragment.kt */
    static final class C7515b extends C12881k implements Function1<C7532a, C13145v> {

        /* renamed from: c */
        final /* synthetic */ C7513i f16479c;

        C7515b(C7513i iVar) {
            this.f16479c = iVar;
            super(1);
        }

        /* renamed from: a */
        public final void mo20405a(C7532a aVar) {
            this.f16479c.m22406a(aVar);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo20405a((C7532a) obj);
            return C13145v.f29587a;
        }
    }

    /* renamed from: g.e.b.l.i$c */
    /* compiled from: View.kt */
    public static final class C7516c implements OnLayoutChangeListener {

        /* renamed from: c */
        final /* synthetic */ C7513i f16480c;

        public C7516c(C7513i iVar) {
            this.f16480c = iVar;
        }

        public void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
            view.removeOnLayoutChangeListener(this);
            this.f16480c.m22408q();
        }
    }

    /* renamed from: g.e.b.l.i$d */
    /* compiled from: FreeTrialWelcomeFragment.kt */
    static final class C7517d implements OnClickListener {

        /* renamed from: c */
        final /* synthetic */ C7513i f16481c;

        C7517d(C7513i iVar) {
            this.f16481c = iVar;
        }

        public final void onClick(View view) {
            this.f16481c.mo20403o().mo19834e();
            this.f16481c.getViewModel().mo20421z();
        }
    }

    /* renamed from: g.e.b.l.i$e */
    /* compiled from: FreeTrialWelcomeFragment.kt */
    static final class C7518e implements OnClickListener {

        /* renamed from: c */
        final /* synthetic */ C7513i f16482c;

        C7518e(C7513i iVar) {
            this.f16482c = iVar;
        }

        public final void onClick(View view) {
            this.f16482c.mo20403o().mo19831b();
            this.f16482c.getViewModel().mo20420y();
        }
    }

    /* renamed from: p */
    private final void m22407p() {
        ((MotionLayout) _$_findCachedViewById(C7904t.trialParentLayout)).mo2142b(C7904t.freeTrialEnd, C7904t.freeTrialStart);
        ((MotionLayout) _$_findCachedViewById(C7904t.trialParentLayout)).mo2146d();
        C0532d activity = getActivity();
        if (activity != null) {
            ArrayList arrayList = new ArrayList();
            C0538i supportFragmentManager = activity.getSupportFragmentManager();
            C12880j.m40222a((Object) supportFragmentManager, "supportFragmentManager");
            Fragment f = supportFragmentManager.mo3160f();
            while (f != null && f.isAdded()) {
                C7819a aVar = (C7819a) (!(f instanceof C7819a) ? null : f);
                if (aVar != null) {
                    arrayList.add(aVar);
                }
                C0538i childFragmentManager = f.getChildFragmentManager();
                C12880j.m40222a((Object) childFragmentManager, "candidate.childFragmentManager");
                f = childFragmentManager.mo3160f();
            }
            C7819a aVar2 = (C7819a) C13199w.m40591g(C13199w.m40606q(arrayList));
            if (aVar2 != null) {
                aVar2.mo20616b(300);
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: q */
    public final void m22408q() {
        ((MotionLayout) _$_findCachedViewById(C7904t.trialParentLayout)).mo2142b(C7904t.freeTrialStart, C7904t.freeTrialEnd);
        ((MotionLayout) _$_findCachedViewById(C7904t.trialParentLayout)).mo2146d();
        C0532d activity = getActivity();
        if (activity != null) {
            ArrayList arrayList = new ArrayList();
            C0538i supportFragmentManager = activity.getSupportFragmentManager();
            C12880j.m40222a((Object) supportFragmentManager, "supportFragmentManager");
            Fragment f = supportFragmentManager.mo3160f();
            while (f != null && f.isAdded()) {
                C7819a aVar = (C7819a) (!(f instanceof C7819a) ? null : f);
                if (aVar != null) {
                    arrayList.add(aVar);
                }
                C0538i childFragmentManager = f.getChildFragmentManager();
                C12880j.m40222a((Object) childFragmentManager, "candidate.childFragmentManager");
                f = childFragmentManager.mo3160f();
            }
            C7819a aVar2 = (C7819a) C13199w.m40591g(C13199w.m40606q(arrayList));
            if (aVar2 != null) {
                aVar2.mo20615a(400);
            }
        }
    }

    public void _$_clearFindViewByIdCache() {
        HashMap hashMap = this.f16478Y;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    public View _$_findCachedViewById(int i) {
        if (this.f16478Y == null) {
            this.f16478Y = new HashMap();
        }
        View view = (View) this.f16478Y.get(Integer.valueOf(i));
        if (view == null) {
            View view2 = getView();
            if (view2 == null) {
                return null;
            }
            view = view2.findViewById(i);
            this.f16478Y.put(Integer.valueOf(i), view);
        }
        return view;
    }

    /* renamed from: e */
    public C2378m mo11534e() {
        return new C2378m(C2433b.ONBOARDING_PAYWALL_IAP_PURCHASE_CONFIRMED, (String) null, 2, (DefaultConstructorMarker) null);
    }

    public final C7531p getViewModel() {
        C7531p pVar = this.f16475V;
        if (pVar != null) {
            return pVar;
        }
        C12880j.m40227c("viewModel");
        throw null;
    }

    /* renamed from: o */
    public final C7051i mo20403o() {
        C7051i iVar = this.f16477X;
        if (iVar != null) {
            return iVar;
        }
        C12880j.m40227c("paywallAnalytics");
        throw null;
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setStyle(0, C7907w.FullScreenDialogOverlay);
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(C7905u.fragment_enjoy_trial_menu, viewGroup, false);
    }

    public void onDestroyView() {
        C6722l1 l1Var = this.f16474U;
        if (l1Var != null) {
            l1Var.mo19266a(false);
            m22407p();
            super.onDestroyView();
            _$_clearFindViewByIdCache();
            return;
        }
        C12880j.m40227c("profilesSetup");
        throw null;
    }

    public void onStart() {
        super.onStart();
        C7531p pVar = this.f16475V;
        if (pVar != null) {
            C5755i.m18679a(this, pVar, null, null, new C7515b(this), 6, null);
            return;
        }
        C12880j.m40227c("viewModel");
        throw null;
    }

    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        Button button = (Button) _$_findCachedViewById(C7904t.startWatchingButton);
        C12880j.m40222a((Object) button, "startWatchingButton");
        C7110x xVar = this.f16476W;
        String str = "purchaseAccessibility";
        if (xVar != null) {
            button.setContentDescription(xVar.mo19902b());
            Button button2 = (Button) _$_findCachedViewById(C7904t.setupProfilesButton);
            C12880j.m40222a((Object) button2, "setupProfilesButton");
            C7110x xVar2 = this.f16476W;
            if (xVar2 != null) {
                button2.setContentDescription(xVar2.mo19901a());
                ((Button) _$_findCachedViewById(C7904t.startWatchingButton)).setOnClickListener(new C7517d(this));
                ((Button) _$_findCachedViewById(C7904t.setupProfilesButton)).setOnClickListener(new C7518e(this));
                MotionLayout motionLayout = (MotionLayout) _$_findCachedViewById(C7904t.trialParentLayout);
                C12880j.m40222a((Object) motionLayout, "trialParentLayout");
                if (!C4187x.m14340E(motionLayout) || motionLayout.isLayoutRequested()) {
                    motionLayout.addOnLayoutChangeListener(new C7516c(this));
                } else {
                    m22408q();
                }
            } else {
                C12880j.m40227c(str);
                throw null;
            }
        } else {
            C12880j.m40227c(str);
            throw null;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final void m22406a(C7532a aVar) {
        if (aVar.mo20422a()) {
            dismiss();
        }
    }
}
