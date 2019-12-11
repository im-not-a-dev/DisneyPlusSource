package p163g.p201e.p203b.p319v;

import android.app.Activity;
import android.content.Intent;
import androidx.lifecycle.C0715i;
import androidx.lifecycle.C0715i.C0716a;
import com.bamnet.iap.BamnetIAPProduct;
import com.bamnet.iap.BamnetIAPPurchase;
import com.bamnet.iap.BamnetIAPResult;
import com.bamnet.iap.C1621a;
import com.bamtech.sdk4.internal.service.ServiceError;
import com.bamtech.sdk4.purchase.AccessStatus;
import com.bamtech.sdk4.purchase.ActivationStatus;
import com.bamtech.sdk4.purchase.PurchaseActivation;
import com.bamtech.sdk4.service.ServiceRequestException;
import com.bamtech.sdk4.subscription.SubscriptionApi;
import com.bamtechmedia.dominguez.analytics.C2350e0;
import com.bamtechmedia.dominguez.core.utils.C5855o;
import com.bamtechmedia.dominguez.paywall.exceptions.PaywallError;
import com.bamtechmedia.dominguez.paywall.exceptions.PaywallError.C6254c;
import com.bamtechmedia.dominguez.paywall.exceptions.PaywallError.C6255d;
import com.bamtechmedia.dominguez.paywall.exceptions.PaywallError.C6256e;
import com.bamtechmedia.dominguez.paywall.exceptions.PaywallError.C6257f;
import com.bamtechmedia.dominguez.paywall.exceptions.PaywallError.C6258g;
import com.bamtechmedia.dominguez.paywall.exceptions.PaywallError.C6259h;
import com.bamtechmedia.dominguez.purchase.MarketHolder;
import com.uber.autodispose.android.lifecycle.C10541b;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.Callable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.joda.time.LocalDateTime;
import p163g.p174d.p175a.p176a.C4796b;
import p163g.p174d.p175a.p176a.C4797c;
import p163g.p174d.p175a.p177b.C4815e;
import p163g.p201e.p203b.p307o.C7614e;
import p163g.p201e.p203b.p319v.C7887p.C7888a;
import p163g.p201e.p203b.p319v.C7887p.C7889b;
import p163g.p201e.p203b.p319v.C7887p.C7890c;
import p163g.p201e.p203b.p319v.C7887p.C7891d;
import p163g.p201e.p203b.p319v.C7887p.C7892e;
import p163g.p201e.p203b.p319v.C7887p.C7893f;
import p163g.p201e.p203b.p319v.C7887p.C7894g;
import p163g.p201e.p203b.p319v.C7887p.C7895h;
import p163g.p201e.p203b.p319v.C7887p.C7897j;
import p163g.p201e.p203b.p319v.C7887p.C7898k;
import p163g.p201e.p203b.p319v.C7887p.C7899l;
import p163g.p201e.p203b.p319v.C7900q.C7901a;
import p163g.p503n.p504a.C11790c0;
import p163g.p503n.p504a.C11793e;
import p163g.p503n.p504a.C11839v;
import p520io.reactivex.C11912b;
import p520io.reactivex.Completable;
import p520io.reactivex.CompletableSource;
import p520io.reactivex.functions.C11945a;
import p520io.reactivex.functions.Consumer;
import p520io.reactivex.subjects.C11976a;
import p686n.p687a.Timber;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000Ä\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\t\n\u0002\u0010\u0003\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 ]2\u00020\u00012\u00020\u00022\u00020\u0003:\u0001]BE\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u0011\u0012\u0006\u0010\u0012\u001a\u00020\u0013¢\u0006\u0002\u0010\u0014J\u0012\u0010+\u001a\u00020\r2\b\u0010,\u001a\u0004\u0018\u00010-H\u0002J\u0012\u0010.\u001a\u00020/2\b\u00100\u001a\u0004\u0018\u000101H\u0016J\b\u00102\u001a\u000203H\u0016J\"\u00104\u001a\u0002032\u0006\u00105\u001a\u0002062\u0006\u00107\u001a\u0002062\b\u00108\u001a\u0004\u0018\u000109H\u0016J\u0010\u0010:\u001a\u0002032\u0006\u0010;\u001a\u00020<H\u0016J\u001a\u0010=\u001a\u0002032\u0006\u0010;\u001a\u00020<2\b\u0010,\u001a\u0004\u0018\u00010-H\u0016J \u0010>\u001a\u0002032\u0006\u0010;\u001a\u00020<2\u000e\u0010?\u001a\n\u0012\u0004\u0012\u00020-\u0018\u00010@H\u0016J&\u0010A\u001a\u0002032\u0006\u0010;\u001a\u00020<2\u0014\u0010B\u001a\u0010\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u001b\u0018\u00010\u001aH\u0016J&\u0010C\u001a\u0002032\u0006\u0010;\u001a\u00020<2\u0014\u0010B\u001a\u0010\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u001b\u0018\u00010\u001aH\u0016J&\u0010D\u001a\u0002032\u0006\u0010;\u001a\u00020<2\u0014\u0010E\u001a\u0010\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020-\u0018\u00010\u001aH\u0016J&\u0010F\u001a\u0002032\u0006\u0010;\u001a\u00020<2\u0014\u0010?\u001a\u0010\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020-\u0018\u00010\u001aH\u0016J\u0012\u0010G\u001a\u0002032\b\u00100\u001a\u0004\u0018\u000101H\u0016J\u0012\u0010H\u001a\u0002032\b\u0010I\u001a\u0004\u0018\u00010JH\u0016J\u001a\u0010K\u001a\u0002032\b\u00100\u001a\u0004\u0018\u0001012\u0006\u0010L\u001a\u00020\u0016H\u0016J\u001a\u0010M\u001a\u0002032\b\u0010I\u001a\u0004\u0018\u00010J2\u0006\u0010L\u001a\u00020\u0016H\u0016J\u0010\u0010N\u001a\u0002032\u0006\u0010O\u001a\u00020/H\u0002J\u0018\u0010,\u001a\u0002032\u0006\u0010P\u001a\u00020Q2\u0006\u0010R\u001a\u00020\u001bH\u0016J\u001a\u0010S\u001a\u0004\u0018\u00010T2\u0006\u00100\u001a\u0002012\u0006\u0010U\u001a\u00020VH\u0002J\u0016\u0010W\u001a\u0002032\f\u0010X\u001a\b\u0012\u0004\u0012\u00020\r0@H\u0016J\b\u0010Y\u001a\u000203H\u0016J\b\u0010Z\u001a\u000203H\u0016J\b\u0010[\u001a\u000203H\u0016J\u0010\u0010\\\u001a\u0002032\u0006\u0010P\u001a\u00020QH\u0016R\u000e\u0010\f\u001a\u00020\rX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0015\u001a\u00020\u00168F¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018R\u000e\u0010\u0012\u001a\u00020\u0013X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u001b0\u001aX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\u0016X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001d\u001a\u00020\u0016X\u000e¢\u0006\u0002\n\u0000R&\u0010\u001e\u001a\u0004\u0018\u00010\u001f8\u0000@\u0000X\u000e¢\u0006\u0014\n\u0000\u0012\u0004\b \u0010!\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%R\u000e\u0010\b\u001a\u00020\tX\u0004¢\u0006\u0002\n\u0000R\u001a\u0010&\u001a\b\u0012\u0004\u0012\u00020(0'X\u0004¢\u0006\b\n\u0000\u001a\u0004\b)\u0010*R\u000e\u0010\n\u001a\u00020\u000bX\u0004¢\u0006\u0002\n\u0000¨\u0006^"}, mo31007d2 = {"Lcom/bamtechmedia/dominguez/paywall/DmgzPaywallService;", "Lcom/bamnet/iap/BamnetIAPListener;", "Lcom/bamtech/paywall/purchase/RedemptionListener;", "Lcom/bamtechmedia/dominguez/paywall/PaywallServicesInteractor;", "marketHolder", "Lcom/bamtechmedia/dominguez/purchase/MarketHolder;", "purchaseDelegate", "Lcom/bamtech/paywall/purchase/PurchaseDelegate;", "redemptionDelegate", "Lcom/bamtech/paywall/redemption/RedemptionDelegate;", "subscriptionApi", "Lcom/bamtech/sdk4/subscription/SubscriptionApi;", "base64Key", "", "paywallAnalyticsStore", "Lcom/bamtechmedia/dominguez/analytics/PaywallAnalyticsStore;", "errorLocalization", "Lcom/bamtechmedia/dominguez/error/ErrorLocalization;", "lifecycle", "Landroidx/lifecycle/Lifecycle;", "(Lcom/bamtechmedia/dominguez/purchase/MarketHolder;Lcom/bamtech/paywall/purchase/PurchaseDelegate;Lcom/bamtech/paywall/redemption/RedemptionDelegate;Lcom/bamtech/sdk4/subscription/SubscriptionApi;Ljava/lang/String;Lcom/bamtechmedia/dominguez/analytics/PaywallAnalyticsStore;Lcom/bamtechmedia/dominguez/error/ErrorLocalization;Landroidx/lifecycle/Lifecycle;)V", "iabReady", "", "getIabReady", "()Z", "productMap", "", "Lcom/bamnet/iap/BamnetIAPProduct;", "productsRequestInProgress", "purchaseInProgress", "queuedIabOperation", "Lio/reactivex/functions/Action;", "queuedIabOperation$annotations", "()V", "getQueuedIabOperation$paywall_release", "()Lio/reactivex/functions/Action;", "setQueuedIabOperation$paywall_release", "(Lio/reactivex/functions/Action;)V", "serviceEvents", "Lio/reactivex/subjects/BehaviorSubject;", "Lcom/bamtechmedia/dominguez/paywall/PaywallServiceEvent;", "getServiceEvents", "()Lio/reactivex/subjects/BehaviorSubject;", "getProductPurchaseName", "purchase", "Lcom/bamnet/iap/BamnetIAPPurchase;", "linkSubscriptions", "Lio/reactivex/Completable;", "accessStatus", "Lcom/bamtech/sdk4/purchase/AccessStatus;", "notifyAccessGrantedFromTempAccess", "", "onActivityResult", "requestCode", "", "resultCode", "data", "Landroid/content/Intent;", "onIabSetupFinished", "result", "Lcom/bamnet/iap/BamnetIAPResult;", "onPurchase", "onPurchasesCompleted", "purchases", "", "onQueryInventoryFinished", "products", "onQueryProductsFinished", "onQueryPurchaseHistoryFinished", "purchaseHistory", "onQueryPurchasesFinished", "onRedemptionComplete", "onRedemptionError", "throwable", "", "onRestoreComplete", "fromTempAccess", "onRestoreError", "onTempAccessGranted", "hasBecomePermanentCompletable", "activity", "Landroid/app/Activity;", "product", "purchaseFailedEvent", "Lcom/bamtechmedia/dominguez/paywall/PaywallServiceEvent$Error;", "error", "Lcom/bamtechmedia/dominguez/paywall/exceptions/PaywallError;", "queryProducts", "productSkus", "resetServiceEvents", "resolveTempAccess", "restore", "setup", "Companion", "paywall_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* renamed from: g.e.b.v.b */
/* compiled from: DmgzPaywallService.kt */
public final class C7824b implements C1621a, C4797c, C7900q {

    /* renamed from: m */
    private static final String f16915m;

    /* renamed from: a */
    private boolean f16916a;

    /* renamed from: b */
    private boolean f16917b;

    /* renamed from: c */
    private final C11976a<C7887p> f16918c = this.f16920e.mo19808d();

    /* renamed from: d */
    private Map<String, ? extends BamnetIAPProduct> f16919d = C13173j0.m40350a();

    /* renamed from: e */
    private final MarketHolder f16920e;

    /* renamed from: f */
    private final C4796b f16921f;

    /* renamed from: g */
    private final C4815e f16922g;

    /* renamed from: h */
    private final SubscriptionApi f16923h;

    /* renamed from: i */
    private final String f16924i;

    /* renamed from: j */
    private final C2350e0 f16925j;

    /* renamed from: k */
    private final C7614e f16926k;

    /* renamed from: l */
    private final C0715i f16927l;

    /* renamed from: g.e.b.v.b$a */
    /* compiled from: DmgzPaywallService.kt */
    public static final class C7825a {
        private C7825a() {
        }

        public /* synthetic */ C7825a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: g.e.b.v.b$b */
    /* compiled from: DmgzPaywallService.kt */
    static final class C7826b<T> implements Consumer<Throwable> {

        /* renamed from: c */
        public static final C7826b f16928c = new C7826b();

        C7826b() {
        }

        /* renamed from: a */
        public final void accept(Throwable th) {
            Timber.m44530c(th, "Account linking failed.", new Object[0]);
        }
    }

    /* renamed from: g.e.b.v.b$c */
    /* compiled from: DmgzPaywallService.kt */
    static final class C7827c implements C11945a {

        /* renamed from: a */
        public static final C7827c f16929a = new C7827c();

        C7827c() {
        }

        public final void run() {
            Timber.m44522a("Accounts successfully linked.", new Object[0]);
        }
    }

    /* renamed from: g.e.b.v.b$d */
    /* compiled from: DmgzPaywallService.kt */
    static final class C7828d<V> implements Callable<CompletableSource> {

        /* renamed from: c */
        final /* synthetic */ C7824b f16930c;

        C7828d(C7824b bVar) {
            this.f16930c = bVar;
        }

        public final Completable call() {
            return C7901a.m23120a(this.f16930c, null, 1, null);
        }
    }

    /* renamed from: g.e.b.v.b$e */
    /* compiled from: DmgzPaywallService.kt */
    static final class C7829e implements C11945a {

        /* renamed from: a */
        final /* synthetic */ C7824b f16931a;

        C7829e(C7824b bVar) {
            this.f16931a = bVar;
        }

        public final void run() {
            this.f16931a.mo20744b().onNext(new C7899l(null, false));
        }
    }

    /* renamed from: g.e.b.v.b$f */
    /* compiled from: DmgzPaywallService.kt */
    static final class C7830f<T> implements Consumer<Throwable> {

        /* renamed from: c */
        public static final C7830f f16932c = new C7830f();

        C7830f() {
        }

        /* renamed from: a */
        public final void accept(Throwable th) {
            Timber.m44523a(th);
        }
    }

    static {
        new C7825a(null);
        String localDateTime = LocalDateTime.now().toString();
        Intrinsics.checkReturnedValueIsNotNull((Object) localDateTime, "LocalDateTime.now().toString()");
        f16915m = localDateTime;
    }

    public C7824b(MarketHolder marketHolder, C4796b bVar, C4815e eVar, SubscriptionApi subscriptionApi, String str, C2350e0 e0Var, C7614e eVar2, C0715i iVar) {
        this.f16920e = marketHolder;
        this.f16921f = bVar;
        this.f16922g = eVar;
        this.f16923h = subscriptionApi;
        this.f16924i = str;
        this.f16925j = e0Var;
        this.f16926k = eVar2;
        this.f16927l = iVar;
        this.f16922g.mo16187a(this);
    }

    /* renamed from: a */
    public void mo20741a(Activity activity) {
        this.f16921f.mo16175a(activity, this.f16924i, (C1621a) this);
    }

    /* renamed from: b */
    public C11976a<C7887p> mo20744b() {
        return this.f16918c;
    }

    /* renamed from: c */
    public void mo20745c() {
        mo20744b().onNext(new C7893f(mo20748f()));
    }

    /* renamed from: d */
    public void mo20746d() {
        mo20744b().onNext(C7890c.f17017a);
    }

    /* renamed from: e */
    public void mo20747e() {
        if (!mo20748f()) {
            C5855o oVar = C5855o.f13640a;
            this.f16920e.mo19807b().set(true);
        } else if (!this.f16916a) {
            this.f16916a = true;
            Timber.m44522a("Running restore operation.", new Object[0]);
            this.f16921f.mo16172a();
        }
    }

    /* renamed from: f */
    public final boolean mo20748f() {
        return this.f16920e.mo19809e() != null;
    }

    /* renamed from: a */
    public void mo20742a(Activity activity, BamnetIAPProduct bamnetIAPProduct) {
        if (!this.f16916a && mo20748f()) {
            this.f16916a = true;
            this.f16925j.mo11476d(f16915m);
            C2350e0 e0Var = this.f16925j;
            String c = bamnetIAPProduct.mo7185c();
            Intrinsics.checkReturnedValueIsNotNull((Object) c, "product.localisedPrice");
            e0Var.mo11478e(c);
            this.f16921f.mo16174a(activity, bamnetIAPProduct);
        }
    }

    /* renamed from: b */
    public void mo7228b(BamnetIAPResult bamnetIAPResult, Map<String, ? extends BamnetIAPProduct> map) {
        this.f16920e.mo19810f().set(C13185o.m40513a());
        this.f16917b = false;
        boolean z = true;
        if (!bamnetIAPResult.mo7213c()) {
            if (!(map == null || map.isEmpty())) {
                if (bamnetIAPResult.mo7214d()) {
                    this.f16919d = map;
                    mo20744b().onNext(new C7891d(map));
                    return;
                }
                return;
            }
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Product query failed: ");
        sb.append(bamnetIAPResult);
        sb.append(". Product Size: %s; Success: false");
        String sb2 = sb.toString();
        Object[] objArr = new Object[1];
        if (map != null && !map.isEmpty()) {
            z = false;
        }
        objArr[0] = Integer.valueOf(z ? 0 : map.size());
        Timber.m44522a(sb2, objArr);
        mo20744b().onNext(new C7889b(C6258g.f14297a, "Error querying inventory."));
    }

    /* renamed from: a */
    public void mo20743a(List<String> list) {
        if (!this.f16917b) {
            this.f16917b = true;
            if (mo20748f()) {
                this.f16921f.mo16178a(list);
            } else {
                this.f16920e.mo19810f().set(list);
            }
        }
    }

    /* renamed from: a */
    public Completable mo20738a(AccessStatus accessStatus) {
        if (accessStatus == null || !accessStatus.isTemporary()) {
            Timber.m44522a("Attempting to link account.", new Object[0]);
            Completable b = this.f16923h.linkSubscriptionsFromDeviceToAccount().mo30036a((Consumer<? super Throwable>) C7826b.f16928c).mo30050b((C11945a) C7827c.f16929a);
            Intrinsics.checkReturnedValueIsNotNull((Object) b, "subscriptionApi.linkSubs… successfully linked.\") }");
            return b;
        }
        mo20744b().onNext(C7898k.f17025a);
        m22927a(accessStatus.getHasBecomePermanent());
        Completable i = Completable.m38170i();
        Intrinsics.checkReturnedValueIsNotNull((Object) i, "Completable.never()");
        return i;
    }

    /* renamed from: b */
    public void mo16182b(AccessStatus accessStatus) {
        this.f16916a = false;
        if (accessStatus != null) {
            C7889b a = m22925a(accessStatus, (PaywallError) C6255d.f14294a);
            if (a == null) {
                mo20744b().onNext(new C7897j(accessStatus));
            } else {
                mo20744b().onNext(a);
            }
        } else {
            mo20744b().onNext(new C7889b(C6255d.f14294a, "AccessStatus not available."));
        }
    }

    /* renamed from: a */
    public void mo20740a(int i, int i2, Intent intent) {
        if (i == 1313) {
            this.f16921f.mo16173a(i, i2, intent);
        }
    }

    /* renamed from: a */
    public void mo20739a() {
        this.f16922g.mo16183a();
    }

    /* renamed from: a */
    private final void m22927a(Completable completable) {
        Completable a = completable.mo30034a((CompletableSource) Completable.m38162b((Callable<? extends CompletableSource>) new C7828d<Object>(this)));
        Intrinsics.checkReturnedValueIsNotNull((Object) a, "hasBecomePermanentComple… { linkSubscriptions() })");
        C10541b a2 = C10541b.m33252a(this.f16927l, C0716a.ON_DESTROY);
        Intrinsics.checkReturnedValueIsNotNull((Object) a2, "AndroidLifecycleScopePro…om(\n    this, untilEvent)");
        Object a3 = a.mo30048a((C11912b<? extends R>) C11793e.m37930a((C11790c0) a2));
        Intrinsics.checkReturnedValueIsNotNull(a3, "this.`as`(AutoDispose.au…isposable<Any>(provider))");
        ((C11839v) a3).mo29926a(new C7829e(this), C7830f.f16932c);
    }

    /* renamed from: a */
    public void mo7226a(BamnetIAPResult bamnetIAPResult, List<? extends BamnetIAPPurchase> list) {
        if (!bamnetIAPResult.mo7214d() || list == null) {
            this.f16916a = false;
            this.f16925j.mo11475d();
            if (bamnetIAPResult.mo7212b() != 9) {
                mo20744b().onNext(new C7889b(C6254c.f14293a, bamnetIAPResult.mo7211a()));
            } else {
                mo20744b().onNext(C7888a.f17014a);
            }
        } else {
            BamnetIAPPurchase bamnetIAPPurchase = (BamnetIAPPurchase) C13199w.m40589f((List) list);
            C2350e0 e0Var = this.f16925j;
            String e = bamnetIAPPurchase.mo7210e();
            Intrinsics.checkReturnedValueIsNotNull((Object) e, "purchase.sku");
            e0Var.mo11470a(e);
            this.f16925j.mo11472b(m22926a(bamnetIAPPurchase));
            this.f16925j.mo11474c(f16915m);
            StringBuilder sb = new StringBuilder();
            sb.append("Purchase receipt: ");
            sb.append(bamnetIAPPurchase.mo7208c());
            Timber.m44522a(sb.toString(), new Object[0]);
            this.f16921f.mo16177a(bamnetIAPPurchase);
            mo20744b().onNext(new C7892e(bamnetIAPPurchase));
            this.f16922g.mo16184a(bamnetIAPResult, bamnetIAPPurchase);
        }
    }

    /* renamed from: a */
    public void mo7225a(BamnetIAPResult bamnetIAPResult, BamnetIAPPurchase bamnetIAPPurchase) {
        if (!bamnetIAPResult.mo7214d() || bamnetIAPPurchase == null) {
            this.f16916a = false;
            this.f16925j.mo11475d();
            if (bamnetIAPResult.mo7212b() != 9) {
                mo20744b().onNext(new C7889b(C6254c.f14293a, bamnetIAPResult.mo7211a()));
            } else {
                mo20744b().onNext(C7888a.f17014a);
            }
        } else {
            C2350e0 e0Var = this.f16925j;
            String e = bamnetIAPPurchase.mo7210e();
            Intrinsics.checkReturnedValueIsNotNull((Object) e, "purchase.sku");
            e0Var.mo11470a(e);
            this.f16925j.mo11472b(m22926a(bamnetIAPPurchase));
            this.f16925j.mo11474c(f16915m);
            StringBuilder sb = new StringBuilder();
            sb.append("Purchase receipt: ");
            sb.append(bamnetIAPPurchase.mo7208c());
            Timber.m44522a(sb.toString(), new Object[0]);
            this.f16921f.mo16177a(bamnetIAPPurchase);
            mo20744b().onNext(new C7892e(bamnetIAPPurchase));
            this.f16922g.mo16184a(bamnetIAPResult, bamnetIAPPurchase);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0016, code lost:
        if (r3 != null) goto L_0x001a;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final java.lang.String m22926a(com.bamnet.iap.BamnetIAPPurchase r3) {
        /*
            r2 = this;
            java.lang.String r0 = ""
            if (r3 == 0) goto L_0x001d
            java.util.Map<java.lang.String, ? extends com.bamnet.iap.BamnetIAPProduct> r1 = r2.f16919d
            java.lang.String r3 = r3.mo7210e()
            java.lang.Object r3 = r1.get(r3)
            com.bamnet.iap.BamnetIAPProduct r3 = (com.bamnet.iap.BamnetIAPProduct) r3
            if (r3 == 0) goto L_0x0019
            java.lang.String r3 = r3.mo7189g()
            if (r3 == 0) goto L_0x0019
            goto L_0x001a
        L_0x0019:
            r3 = r0
        L_0x001a:
            if (r3 == 0) goto L_0x001d
            goto L_0x001e
        L_0x001d:
            r3 = r0
        L_0x001e:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: p163g.p201e.p203b.p319v.C7824b.m22926a(com.bamnet.iap.BamnetIAPPurchase):java.lang.String");
    }

    /* renamed from: a */
    public void mo7227a(BamnetIAPResult bamnetIAPResult, Map<String, ? extends BamnetIAPPurchase> map) {
        this.f16917b = false;
        this.f16916a = false;
        if (!bamnetIAPResult.mo7214d() || map == null || !(!map.isEmpty())) {
            mo20744b().onNext(new C7889b(C6256e.f14295a, "No purchases found."));
        } else {
            this.f16922g.mo16185a(bamnetIAPResult, map);
        }
    }

    /* renamed from: a */
    public void mo7224a(BamnetIAPResult bamnetIAPResult) {
        if (bamnetIAPResult.mo7214d()) {
            this.f16920e.mo19806a((C7900q) this);
            mo20744b().onNext(C7895h.f17022a);
            List list = (List) this.f16920e.mo19810f().get();
            Intrinsics.checkReturnedValueIsNotNull((Object) list, "skusRequested");
            if (!list.isEmpty()) {
                mo20743a(list);
            }
            if (this.f16920e.mo19807b().get()) {
                mo20747e();
                return;
            }
            return;
        }
        this.f16920e.mo19806a((C7900q) null);
        StringBuilder sb = new StringBuilder();
        sb.append("IAB Failed to setup. ");
        String a = bamnetIAPResult.mo7211a();
        if (a == null) {
            a = "No Message";
        }
        sb.append(a);
        Timber.m44526b(sb.toString(), new Object[0]);
        mo20744b().onNext(new C7889b(C6257f.f14296a, bamnetIAPResult.mo7211a()));
    }

    /* renamed from: a */
    public void mo16179a(AccessStatus accessStatus, boolean z) {
        this.f16920e.mo19807b().set(false);
        this.f16916a = false;
        if (accessStatus != null) {
            Object a = m22925a(accessStatus, (PaywallError) C6256e.f14295a);
            if (z) {
                a = new C7899l(accessStatus, true);
            } else if (a == null) {
                a = new C7894g(accessStatus);
            }
            mo20744b().onNext(a);
            return;
        }
        mo20744b().onNext(new C7889b(z ? C6259h.f14298a : C6256e.f14295a, ""));
    }

    /* renamed from: a */
    public void mo16181a(Throwable th, boolean z) {
        this.f16920e.mo19807b().set(false);
        this.f16916a = false;
        mo20744b().onNext(new C7889b(C6256e.f14295a, th != null ? this.f16926k.mo20537a(th) : null));
    }

    /* renamed from: a */
    public void mo16180a(Throwable th) {
        this.f16916a = false;
        mo20744b().onNext(new C7889b(C6255d.f14294a, th != null ? this.f16926k.mo20537a(th) : null));
    }

    /* renamed from: a */
    private final C7889b m22925a(AccessStatus accessStatus, PaywallError paywallError) {
        PurchaseActivation purchaseActivation;
        Object obj;
        boolean z;
        List purchases = accessStatus.getPurchases();
        if (purchases != null) {
            Iterator it = purchases.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (((PurchaseActivation) obj).getStatus() == ActivationStatus.FAILED) {
                    z = true;
                    continue;
                } else {
                    z = false;
                    continue;
                }
                if (z) {
                    break;
                }
            }
            purchaseActivation = (PurchaseActivation) obj;
        } else {
            purchaseActivation = null;
        }
        if (purchaseActivation != null) {
            if (!(!accessStatus.isTemporary())) {
                purchaseActivation = null;
            }
            if (purchaseActivation != null) {
                ServiceError reason = purchaseActivation.getReason();
                if (reason != null) {
                    UUID randomUUID = UUID.randomUUID();
                    Intrinsics.checkReturnedValueIsNotNull((Object) randomUUID, "UUID.randomUUID()");
                    ServiceRequestException serviceRequestException = new ServiceRequestException(randomUUID, C13183n.m40498a(reason), null, 4, null);
                    StringBuilder sb = new StringBuilder();
                    sb.append("Purchase failed: ");
                    sb.append(paywallError);
                    Timber.m44528b(serviceRequestException, sb.toString(), new Object[0]);
                    return new C7889b(paywallError, this.f16926k.mo20537a((Throwable) serviceRequestException));
                }
            }
        }
        return null;
    }
}
