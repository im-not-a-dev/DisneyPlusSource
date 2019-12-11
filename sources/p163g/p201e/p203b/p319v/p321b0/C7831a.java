package p163g.p201e.p203b.p319v.p321b0;

import android.app.Activity;
import android.os.Bundle;
import androidx.fragment.app.C0532d;
import androidx.fragment.app.C0564o;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.C0715i;
import com.bamtechmedia.dominguez.core.p218n.C5773a;
import com.bamtechmedia.dominguez.purchase.MarketHolder;
import java.util.HashMap;
import kotlin.C13145v;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12880j;
import kotlin.jvm.internal.C12881k;
import p163g.p201e.p203b.p319v.C7900q;
import p512h.p513c.p514k.C11890i;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 \u00142\u00020\u0001:\u0002\u0014\u0015B\u0005¢\u0006\u0002\u0010\u0002J\u0012\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u0016J\u0012\u0010\u0013\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u0016R\u001e\u0010\u0003\u001a\u00020\u00048\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001e\u0010\t\u001a\u00020\n8\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e¨\u0006\u0016"}, mo31007d2 = {"Lcom/bamtechmedia/dominguez/paywall/ui/IapSetupFragment;", "Ldagger/android/support/DaggerFragment;", "()V", "marketHolder", "Lcom/bamtechmedia/dominguez/purchase/MarketHolder;", "getMarketHolder", "()Lcom/bamtechmedia/dominguez/purchase/MarketHolder;", "setMarketHolder", "(Lcom/bamtechmedia/dominguez/purchase/MarketHolder;)V", "paywallServicesInteractor", "Lcom/bamtechmedia/dominguez/paywall/PaywallServicesInteractor;", "getPaywallServicesInteractor", "()Lcom/bamtechmedia/dominguez/paywall/PaywallServicesInteractor;", "setPaywallServicesInteractor", "(Lcom/bamtechmedia/dominguez/paywall/PaywallServicesInteractor;)V", "onActivityCreated", "", "savedInstanceState", "Landroid/os/Bundle;", "onCreate", "Companion", "Helper", "paywall_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* renamed from: g.e.b.v.b0.a */
/* compiled from: IapSetupFragment.kt */
public final class C7831a extends C11890i {

    /* renamed from: U */
    public C7900q f16933U;

    /* renamed from: V */
    public MarketHolder f16934V;

    /* renamed from: W */
    private HashMap f16935W;

    /* renamed from: g.e.b.v.b0.a$a */
    /* compiled from: IapSetupFragment.kt */
    public static final class C7832a {
        private C7832a() {
        }

        public /* synthetic */ C7832a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\u0005\u001a\u00020\u0006H\u0016J\b\u0010\u0007\u001a\u00020\u0006H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\b"}, mo31007d2 = {"Lcom/bamtechmedia/dominguez/paywall/ui/IapSetupFragment$Helper;", "Lcom/bamtechmedia/dominguez/paywall/ui/IapSetupFragmentHelper;", "activityNavigation", "Lcom/bamtechmedia/dominguez/core/navigation/ActivityNavigation;", "(Lcom/bamtechmedia/dominguez/core/navigation/ActivityNavigation;)V", "start", "", "stop", "paywall_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
    /* renamed from: g.e.b.v.b0.a$b */
    /* compiled from: IapSetupFragment.kt */
    public static final class C7833b implements C7835b {

        /* renamed from: a */
        private final C5773a f16936a;

        /* renamed from: g.e.b.v.b0.a$b$a */
        /* compiled from: IapSetupFragment.kt */
        static final class C7834a extends C12881k implements Function1<C0532d, C13145v> {

            /* renamed from: c */
            public static final C7834a f16937c = new C7834a();

            C7834a() {
                super(1);
            }

            /* renamed from: a */
            public final void mo20754a(C0532d dVar) {
                String str = "IapSetupFragment";
                if (dVar.getSupportFragmentManager().mo3146a(str) == null) {
                    C0564o a = dVar.getSupportFragmentManager().mo3147a();
                    a.mo3314a((Fragment) new C7831a(), str);
                    a.mo3030a();
                }
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                mo20754a((C0532d) obj);
                return C13145v.f29587a;
            }
        }

        public C7833b(C5773a aVar) {
            this.f16936a = aVar;
        }

        public void start() {
            this.f16936a.mo17670a((Function1<? super C0532d, C13145v>) C7834a.f16937c);
        }
    }

    static {
        new C7832a(null);
    }

    public C7831a() {
        setRetainInstance(true);
    }

    public void _$_clearFindViewByIdCache() {
        HashMap hashMap = this.f16935W;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    public void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        C7900q qVar = this.f16933U;
        if (qVar != null) {
            C0532d requireActivity = requireActivity();
            String str = "requireActivity()";
            C12880j.m40222a((Object) requireActivity, str);
            qVar.mo20741a((Activity) requireActivity);
            C0532d requireActivity2 = requireActivity();
            C12880j.m40222a((Object) requireActivity2, str);
            C0715i lifecycle = requireActivity2.getLifecycle();
            MarketHolder marketHolder = this.f16934V;
            if (marketHolder != null) {
                lifecycle.mo4134a(marketHolder);
            } else {
                C12880j.m40227c("marketHolder");
                throw null;
            }
        } else {
            C12880j.m40227c("paywallServicesInteractor");
            throw null;
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        C0715i lifecycle = getLifecycle();
        MarketHolder marketHolder = this.f16934V;
        if (marketHolder != null) {
            lifecycle.mo4134a(marketHolder);
        } else {
            C12880j.m40227c("marketHolder");
            throw null;
        }
    }

    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        _$_clearFindViewByIdCache();
    }
}
