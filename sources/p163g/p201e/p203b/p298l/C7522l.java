package p163g.p201e.p203b.p298l;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.bamtechmedia.dominguez.analytics.C2378m;
import com.bamtechmedia.dominguez.analytics.C2413n;
import com.bamtechmedia.dominguez.analytics.p057o0.C2433b;
import com.bamtechmedia.dominguez.config.C3572r0;
import com.bamtechmedia.dominguez.config.C3572r0.C3573a;
import com.bamtechmedia.dominguez.core.BuildInfo;
import com.bamtechmedia.dominguez.core.utils.C5833g;
import com.bamtechmedia.dominguez.core.utils.C5837i;
import com.bamtechmedia.dominguez.core.utils.C5839j;
import com.bamtechmedia.dominguez.core.utils.C5883w;
import com.bamtechmedia.dominguez.profiles.C6722l1;
import com.bamtechmedia.dominguez.purchase.C7051i;
import com.bamtechmedia.dominguez.purchase.C7110x;
import java.util.Arrays;
import java.util.HashMap;
import kotlin.C12898l;
import kotlin.C12907r;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.C12890t;
import kotlin.jvm.internal.C12891u;
import kotlin.jvm.internal.C12895y;
import kotlin.reflect.KProperty;
import p163g.p201e.p203b.p319v.C7862c;
import p163g.p201e.p203b.p319v.C7904t;
import p163g.p201e.p203b.p319v.C7905u;
import p163g.p201e.p203b.p319v.C7907w;
import p512h.p513c.p514k.C11885d;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 N2\u00020\u00012\u00020\u0002:\u0001NB\u0005¢\u0006\u0002\u0010\u0003J\u0018\u00109\u001a\n ;*\u0004\u0018\u00010:0:2\u0006\u0010<\u001a\u000206H\u0002J\b\u0010=\u001a\u00020>H\u0016J\u0012\u0010?\u001a\u00020@2\b\u0010A\u001a\u0004\u0018\u00010BH\u0016J&\u0010C\u001a\u0004\u0018\u00010D2\u0006\u0010E\u001a\u00020F2\b\u0010G\u001a\u0004\u0018\u00010H2\b\u0010A\u001a\u0004\u0018\u00010BH\u0016J\b\u0010I\u001a\u00020@H\u0016J\u001a\u0010J\u001a\u00020@2\u0006\u0010K\u001a\u00020D2\b\u0010A\u001a\u0004\u0018\u00010BH\u0016J\u0010\u0010L\u001a\u00020@2\u0006\u0010<\u001a\u000206H\u0002J\b\u0010M\u001a\u00020@H\u0002R\u001e\u0010\u0004\u001a\u00020\u00058\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR$\u0010\n\u001a\u00020\u000b8\u0006@\u0006X.¢\u0006\u0014\n\u0000\u0012\u0004\b\f\u0010\u0003\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001e\u0010\u0011\u001a\u00020\u00128\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u001e\u0010\u0017\u001a\u00020\u00188\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\u001e\u0010\u001d\u001a\u00020\u001e8\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R\u001e\u0010#\u001a\u00020$8\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b%\u0010&\"\u0004\b'\u0010(R\u001b\u0010)\u001a\u00020*8FX\u0002¢\u0006\f\n\u0004\b-\u0010.\u001a\u0004\b+\u0010,R\u001e\u0010/\u001a\u0002008\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b1\u00102\"\u0004\b3\u00104R\u0014\u00105\u001a\u0002068BX\u0004¢\u0006\u0006\u001a\u0004\b7\u00108¨\u0006O"}, mo31007d2 = {"Lcom/bamtechmedia/dominguez/dialog/FreeTrialWelcomePromoFragment;", "Ldagger/android/support/DaggerAppCompatDialogFragment;", "Lcom/bamtechmedia/dominguez/analytics/AnalyticsStateProvider;", "()V", "buildInfo", "Lcom/bamtechmedia/dominguez/core/BuildInfo;", "getBuildInfo", "()Lcom/bamtechmedia/dominguez/core/BuildInfo;", "setBuildInfo", "(Lcom/bamtechmedia/dominguez/core/BuildInfo;)V", "dictionary", "Lcom/bamtechmedia/dominguez/config/StringDictionary;", "dictionary$annotations", "getDictionary", "()Lcom/bamtechmedia/dominguez/config/StringDictionary;", "setDictionary", "(Lcom/bamtechmedia/dominguez/config/StringDictionary;)V", "map", "Lcom/bamtechmedia/dominguez/dialog/FreeTrialConfig;", "getMap", "()Lcom/bamtechmedia/dominguez/dialog/FreeTrialConfig;", "setMap", "(Lcom/bamtechmedia/dominguez/dialog/FreeTrialConfig;)V", "onboardingImageLoader", "Lcom/bamtechmedia/dominguez/paywall/OnboardingImageLoader;", "getOnboardingImageLoader", "()Lcom/bamtechmedia/dominguez/paywall/OnboardingImageLoader;", "setOnboardingImageLoader", "(Lcom/bamtechmedia/dominguez/paywall/OnboardingImageLoader;)V", "paywallAnalytics", "Lcom/bamtechmedia/dominguez/purchase/PaywallAnalytics;", "getPaywallAnalytics", "()Lcom/bamtechmedia/dominguez/purchase/PaywallAnalytics;", "setPaywallAnalytics", "(Lcom/bamtechmedia/dominguez/purchase/PaywallAnalytics;)V", "profilesSetup", "Lcom/bamtechmedia/dominguez/profiles/ProfilesSetup;", "getProfilesSetup", "()Lcom/bamtechmedia/dominguez/profiles/ProfilesSetup;", "setProfilesSetup", "(Lcom/bamtechmedia/dominguez/profiles/ProfilesSetup;)V", "promoInfo", "Lcom/bamtechmedia/dominguez/dialog/PromoInfo;", "getPromoInfo", "()Lcom/bamtechmedia/dominguez/dialog/PromoInfo;", "promoInfo$delegate", "Lcom/bamtechmedia/dominguez/core/utils/ParcelableFragmentArgumentDelegate;", "purchaseAccessibility", "Lcom/bamtechmedia/dominguez/purchase/PurchaseAccessibility;", "getPurchaseAccessibility", "()Lcom/bamtechmedia/dominguez/purchase/PurchaseAccessibility;", "setPurchaseAccessibility", "(Lcom/bamtechmedia/dominguez/purchase/PurchaseAccessibility;)V", "storeLinkKey", "", "getStoreLinkKey", "()Ljava/lang/String;", "checkAppInstalled", "Landroid/content/Intent;", "kotlin.jvm.PlatformType", "packageName", "getAnalyticsSection", "Lcom/bamtechmedia/dominguez/analytics/AnalyticsSection;", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "onDestroyView", "onViewCreated", "view", "resolveToStoreLink", "tryToOpenAppOrRouteToStore", "Companion", "paywall_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* renamed from: g.e.b.l.l */
/* compiled from: FreeTrialWelcomePromoFragment.kt */
public final class C7522l extends C11885d implements C2413n {

    /* renamed from: d0 */
    static final /* synthetic */ KProperty[] f16483d0 = {C12895y.m40235a((C12890t) new C12891u(C12895y.m40230a(C7522l.class), "promoInfo", "getPromoInfo()Lcom/bamtechmedia/dominguez/dialog/PromoInfo;"))};

    /* renamed from: e0 */
    public static final C7523a f16484e0 = new C7523a(null);

    /* renamed from: U */
    public C7051i f16485U;

    /* renamed from: V */
    public C7110x f16486V;

    /* renamed from: W */
    public C3572r0 f16487W;

    /* renamed from: X */
    public C7862c f16488X;

    /* renamed from: Y */
    private final C5883w f16489Y = C5839j.m18852a("promoInfo", (Function0) null, 2, (Object) null);

    /* renamed from: Z */
    public BuildInfo f16490Z;

    /* renamed from: a0 */
    public C7501b f16491a0;

    /* renamed from: b0 */
    public C6722l1 f16492b0;

    /* renamed from: c0 */
    private HashMap f16493c0;

    /* renamed from: g.e.b.l.l$a */
    /* compiled from: FreeTrialWelcomePromoFragment.kt */
    public static final class C7523a {
        private C7523a() {
        }

        /* renamed from: a */
        public final C7522l mo20413a(C7534q qVar) {
            C7522l lVar = new C7522l();
            Pair[] pairArr = {C12907r.m40244a("promoInfo", qVar)};
            lVar.setArguments(C5833g.m18829a((Pair[]) Arrays.copyOf(pairArr, pairArr.length)));
            return lVar;
        }

        public /* synthetic */ C7523a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: g.e.b.l.l$b */
    /* compiled from: FreeTrialWelcomePromoFragment.kt */
    static final class C7524b implements OnClickListener {

        /* renamed from: c */
        final /* synthetic */ C7522l f16494c;

        C7524b(C7522l lVar) {
            this.f16494c = lVar;
        }

        public final void onClick(View view) {
            this.f16494c.mo20411o().mo19834e();
            this.f16494c.dismiss();
        }
    }

    /* renamed from: g.e.b.l.l$c */
    /* compiled from: FreeTrialWelcomePromoFragment.kt */
    static final class C7525c implements OnClickListener {

        /* renamed from: c */
        final /* synthetic */ C7522l f16495c;

        C7525c(C7522l lVar) {
            this.f16495c = lVar;
        }

        public final void onClick(View view) {
            this.f16495c.m22421r();
        }
    }

    /* renamed from: g.e.b.l.l$d */
    /* compiled from: FreeTrialWelcomePromoFragment.kt */
    static final class C7526d implements OnClickListener {

        /* renamed from: c */
        final /* synthetic */ C7522l f16496c;

        C7526d(C7522l lVar) {
            this.f16496c = lVar;
        }

        public final void onClick(View view) {
            this.f16496c.m22421r();
        }
    }

    /* renamed from: g.e.b.l.l$e */
    /* compiled from: FreeTrialWelcomePromoFragment.kt */
    static final class C7527e implements OnClickListener {

        /* renamed from: c */
        public static final C7527e f16497c = new C7527e();

        C7527e() {
        }

        public final void onClick(View view) {
        }
    }

    /* renamed from: f */
    private final void m22419f(String str) {
        String q = m22420q();
        StringBuilder sb = new StringBuilder();
        sb.append(q);
        sb.append(str);
        Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(sb.toString()));
        Context requireContext = requireContext();
        Intrinsics.checkReturnedValueIsNotNull((Object) requireContext, "requireContext()");
        if (requireContext.getPackageManager().queryIntentActivities(intent, 0).isEmpty()) {
            TextView textView = (TextView) _$_findCachedViewById(C7904t.promoAction);
            Intrinsics.checkReturnedValueIsNotNull((Object) textView, "promoAction");
            C3572r0 r0Var = this.f16487W;
            if (r0Var != null) {
                textView.setText(C3573a.m12037b(r0Var, mo20412p().mo20430a0(), null, 2, null));
                ((LinearLayout) _$_findCachedViewById(C7904t.promoLayout)).setOnClickListener(C7527e.f16497c);
                return;
            }
            Intrinsics.throwUninitializedPropertyAccessException("dictionary");
            throw null;
        }
    }

    /* renamed from: q */
    private final String m22420q() {
        BuildInfo buildInfo = this.f16490Z;
        if (buildInfo != null) {
            int i = C7528m.$EnumSwitchMapping$0[buildInfo.mo12779b().ordinal()];
            String str = "map";
            if (i == 1) {
                C7501b bVar = this.f16491a0;
                if (bVar != null) {
                    return bVar.mo20395b();
                }
                Intrinsics.throwUninitializedPropertyAccessException(str);
                throw null;
            } else if (i == 2) {
                C7501b bVar2 = this.f16491a0;
                if (bVar2 != null) {
                    return bVar2.mo20394a();
                }
                Intrinsics.throwUninitializedPropertyAccessException(str);
                throw null;
            } else {
                throw new C12898l();
            }
        } else {
            Intrinsics.throwUninitializedPropertyAccessException("buildInfo");
            throw null;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: r */
    public final void m22421r() {
        C3572r0 r0Var = this.f16487W;
        if (r0Var != null) {
            String b = C3573a.m12037b(r0Var, mo20412p().mo20428Y(), null, 2, null);
            Intent e = m22418e(b);
            if (e != null) {
                e.setAction("android.intent.action.MAIN");
                e.setFlags(268435456);
                startActivity(e);
                return;
            }
            String q = m22420q();
            StringBuilder sb = new StringBuilder();
            sb.append(q);
            sb.append(b);
            startActivity(new Intent("android.intent.action.VIEW", Uri.parse(sb.toString())));
            return;
        }
        Intrinsics.throwUninitializedPropertyAccessException("dictionary");
        throw null;
    }

    public void _$_clearFindViewByIdCache() {
        HashMap hashMap = this.f16493c0;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    public View _$_findCachedViewById(int i) {
        if (this.f16493c0 == null) {
            this.f16493c0 = new HashMap();
        }
        View view = (View) this.f16493c0.get(Integer.valueOf(i));
        if (view == null) {
            View view2 = getView();
            if (view2 == null) {
                return null;
            }
            view = view2.findViewById(i);
            this.f16493c0.put(Integer.valueOf(i), view);
        }
        return view;
    }

    /* renamed from: e */
    public C2378m mo11534e() {
        return new C2378m(C2433b.ONBOARDING_PAYWALL_IAP_PURCHASE_CONFIRMED, (String) null, 2, (DefaultConstructorMarker) null);
    }

    /* renamed from: o */
    public final C7051i mo20411o() {
        C7051i iVar = this.f16485U;
        if (iVar != null) {
            return iVar;
        }
        Intrinsics.throwUninitializedPropertyAccessException("paywallAnalytics");
        throw null;
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setStyle(0, C7907w.FullScreenDialogOverlay);
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(C7905u.fragment_trial_menu_promo, viewGroup, false);
    }

    public void onDestroyView() {
        C6722l1 l1Var = this.f16492b0;
        if (l1Var != null) {
            l1Var.mo19264a();
            super.onDestroyView();
            _$_clearFindViewByIdCache();
            return;
        }
        Intrinsics.throwUninitializedPropertyAccessException("profilesSetup");
        throw null;
    }

    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        Button button = (Button) _$_findCachedViewById(C7904t.startWatchingButton);
        Intrinsics.checkReturnedValueIsNotNull((Object) button, "startWatchingButton");
        C7110x xVar = this.f16486V;
        if (xVar != null) {
            button.setContentDescription(xVar.mo19902b());
            ((Button) _$_findCachedViewById(C7904t.startWatchingButton)).setOnClickListener(new C7524b(this));
            TextView textView = (TextView) _$_findCachedViewById(C7904t.promoTagline);
            Intrinsics.checkReturnedValueIsNotNull((Object) textView, "promoTagline");
            C3572r0 r0Var = this.f16487W;
            String str = "dictionary";
            if (r0Var != null) {
                textView.setText(C3573a.m12037b(r0Var, mo20412p().getDescription(), null, 2, null));
                TextView textView2 = (TextView) _$_findCachedViewById(C7904t.promoAction);
                Intrinsics.checkReturnedValueIsNotNull((Object) textView2, "promoAction");
                C3572r0 r0Var2 = this.f16487W;
                if (r0Var2 != null) {
                    textView2.setText(C3573a.m12037b(r0Var2, mo20412p().mo20427X(), null, 2, null));
                    Context requireContext = requireContext();
                    Intrinsics.checkReturnedValueIsNotNull((Object) requireContext, "requireContext()");
                    if (C5837i.m18843e(requireContext)) {
                        ((LinearLayout) _$_findCachedViewById(C7904t.promoLayout)).setOnClickListener(new C7525c(this));
                    } else {
                        ((TextView) _$_findCachedViewById(C7904t.promoAction)).setOnClickListener(new C7526d(this));
                    }
                    C7862c cVar = this.f16488X;
                    if (cVar != null) {
                        ImageView imageView = (ImageView) _$_findCachedViewById(C7904t.promoLogo);
                        Intrinsics.checkReturnedValueIsNotNull((Object) imageView, "promoLogo");
                        C3572r0 r0Var3 = this.f16487W;
                        if (r0Var3 != null) {
                            cVar.mo20784a(imageView, C3573a.m12037b(r0Var3, mo20412p().mo20429Z(), null, 2, null));
                            C3572r0 r0Var4 = this.f16487W;
                            if (r0Var4 != null) {
                                m22419f(C3573a.m12037b(r0Var4, mo20412p().mo20428Y(), null, 2, null));
                            } else {
                                Intrinsics.throwUninitializedPropertyAccessException(str);
                                throw null;
                            }
                        } else {
                            Intrinsics.throwUninitializedPropertyAccessException(str);
                            throw null;
                        }
                    } else {
                        Intrinsics.throwUninitializedPropertyAccessException("onboardingImageLoader");
                        throw null;
                    }
                } else {
                    Intrinsics.throwUninitializedPropertyAccessException(str);
                    throw null;
                }
            } else {
                Intrinsics.throwUninitializedPropertyAccessException(str);
                throw null;
            }
        } else {
            Intrinsics.throwUninitializedPropertyAccessException("purchaseAccessibility");
            throw null;
        }
    }

    /* renamed from: p */
    public final C7534q mo20412p() {
        return (C7534q) this.f16489Y.mo17776a(this, f16483d0[0]);
    }

    /* renamed from: e */
    private final Intent m22418e(String str) {
        Context requireContext = requireContext();
        Intrinsics.checkReturnedValueIsNotNull((Object) requireContext, "requireContext()");
        return requireContext.getPackageManager().getLaunchIntentForPackage(str);
    }
}
