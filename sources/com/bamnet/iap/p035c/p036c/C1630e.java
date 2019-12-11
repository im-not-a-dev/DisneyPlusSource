package com.bamnet.iap.p035c.p036c;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import androidx.lifecycle.C0702a;
import com.android.billingclient.api.C1387d;
import com.android.billingclient.api.C1387d.C1389b;
import com.android.billingclient.api.C1413f;
import com.android.billingclient.api.C1414g;
import com.android.billingclient.api.C1414g.C1416b;
import com.android.billingclient.api.C1417h;
import com.android.billingclient.api.C1426m;
import com.android.billingclient.api.C1431q;
import com.android.billingclient.api.C1433s;
import com.bamnet.iap.BamnetIAPProduct;
import com.bamnet.iap.BamnetIAPProduct.BamnetIAPProductType;
import com.bamnet.iap.BamnetIAPPurchase;
import com.bamnet.iap.BamnetIAPResult;
import com.bamnet.iap.C1621a;
import com.bamnet.iap.C1622b;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.concurrent.Callable;
import kotlin.TypeCastException;
import kotlin.C13145v;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.C12881k;
import kotlin.p590y.C13166g0;
import p520io.reactivex.C11969r;
import p520io.reactivex.Completable;
import p520io.reactivex.CompletableSource;
import p520io.reactivex.Single;
import p520io.reactivex.SingleSource;
import p520io.reactivex.disposables.CompositeDisposable;
import p520io.reactivex.disposables.Disposable;
import p520io.reactivex.functions.C11945a;
import p520io.reactivex.functions.Consumer;
import p520io.reactivex.functions.Function;
import p520io.reactivex.p525e0.C11934b;
import p686n.p687a.Timber;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000¸\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010!\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\r\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0010\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020$H\u0002J\r\u0010%\u001a\u00020&H\u0000¢\u0006\u0002\b'J\u0015\u0010(\u001a\u00020&2\u0006\u0010)\u001a\u00020*H\u0000¢\u0006\u0002\b+J\u0016\u0010,\u001a\u00020&2\f\u0010-\u001a\b\u0012\u0004\u0012\u00020*0.H\u0002J\u001d\u0010/\u001a\u00020&2\u0006\u00100\u001a\u0002012\u0006\u00102\u001a\u00020\u001fH\u0000¢\u0006\u0002\b3J\u001c\u00104\u001a\u00020&2\u0012\u00105\u001a\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020706H\u0002J\b\u00108\u001a\u00020&H\u0016J\u0012\u00109\u001a\u00020&2\b\u0010:\u001a\u0004\u0018\u00010;H\u0016J\b\u0010<\u001a\u00020&H\u0014J\"\u0010=\u001a\u00020&2\b\u0010:\u001a\u0004\u0018\u00010;2\u000e\u0010>\u001a\n\u0012\u0004\u0012\u00020$\u0018\u00010?H\u0016J\u0010\u0010@\u001a\u00020A2\u0006\u0010#\u001a\u00020*H\u0002J\r\u0010B\u001a\u00020&H\u0000¢\u0006\u0002\bCJ\u001b\u0010D\u001a\u00020&2\f\u0010E\u001a\b\u0012\u0004\u0012\u00020\u001f0.H\u0000¢\u0006\u0002\bFJ\r\u0010G\u001a\u00020&H\u0000¢\u0006\u0002\bHJ\u001c\u0010I\u001a\u00020J2\b\b\u0002\u0010K\u001a\u00020L2\b\b\u0002\u0010M\u001a\u00020\u001fH\u0002J\u0015\u0010N\u001a\u00020&2\u0006\u0010\u0013\u001a\u00020\u0014H\u0000¢\u0006\u0002\bOR\u000e\u0010\u0007\u001a\u00020\bX\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u000f\u001a\u00020\u00108@X\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012R\u0010\u0010\u0013\u001a\u0004\u0018\u00010\u0014X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0015\u001a\u0004\u0018\u00010\u0016X\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\u0017\u001a\u00020\u0018X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\u001a\u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00020\u001f\u0012\u0004\u0012\u00020 0\u001eX\u0004¢\u0006\u0002\n\u0000¨\u0006P"}, mo31007d2 = {"Lcom/bamnet/iap/google/billing/GoogleBillingViewModel;", "Landroidx/lifecycle/AndroidViewModel;", "Lcom/android/billingclient/api/PurchasesUpdatedListener;", "Lcom/android/billingclient/api/BillingClientStateListener;", "application", "Landroid/app/Application;", "(Landroid/app/Application;)V", "backgroundScheduler", "Lio/reactivex/Scheduler;", "billingClient", "Lcom/android/billingclient/api/BillingClient;", "billingMapper", "Lcom/bamnet/iap/google/billing/BillingMapper;", "disposables", "Lio/reactivex/disposables/CompositeDisposable;", "isReady", "", "isReady$google_iap_release", "()Z", "listener", "Lcom/bamnet/iap/BamnetIAPListener;", "observableBillingClient", "Lcom/bamnet/iap/google/billing/ObservableBillingClient;", "options", "Lcom/bamnet/iap/MarketOptions;", "getOptions$google_iap_release", "()Lcom/bamnet/iap/MarketOptions;", "setOptions$google_iap_release", "(Lcom/bamnet/iap/MarketOptions;)V", "skuDetailMap", "", "", "Lcom/android/billingclient/api/SkuDetails;", "bamnetProductType", "Lcom/bamnet/iap/BamnetIAPProduct$BamnetIAPProductType;", "purchase", "Lcom/android/billingclient/api/Purchase;", "clear", "", "clear$google_iap_release", "consumePurchase", "bamnetIAPPurchase", "Lcom/bamnet/iap/BamnetIAPPurchase;", "consumePurchase$google_iap_release", "consumePurchases", "purchaseList", "", "launchBillingFlow", "activity", "Landroid/app/Activity;", "sku", "launchBillingFlow$google_iap_release", "observe", "block", "Lkotlin/Function1;", "Lio/reactivex/disposables/Disposable;", "onBillingServiceDisconnected", "onBillingSetupFinished", "billingResult", "Lcom/android/billingclient/api/BillingResult;", "onCleared", "onPurchasesUpdated", "purchases", "", "performConsumption", "Lio/reactivex/Completable;", "queryCachedPurchases", "queryCachedPurchases$google_iap_release", "queryProducts", "skuList", "queryProducts$google_iap_release", "queryPurchaseHistory", "queryPurchaseHistory$google_iap_release", "resultOk", "Lcom/bamnet/iap/BamnetIAPResult;", "responseCode", "", "message", "startBillingClient", "startBillingClient$google_iap_release", "google-iap_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* renamed from: com.bamnet.iap.c.c.e */
/* compiled from: GoogleBillingViewModel.kt */
public final class C1630e extends C0702a implements C1431q, C1413f {

    /* renamed from: U */
    private C1387d f5749U;

    /* renamed from: V */
    private CompositeDisposable f5750V = new CompositeDisposable();
    /* access modifiers changed from: private */

    /* renamed from: W */
    public C1621a f5751W;

    /* renamed from: X */
    private C1647g f5752X;
    /* access modifiers changed from: private */

    /* renamed from: Y */
    public final Map<String, C1433s> f5753Y = new LinkedHashMap();
    /* access modifiers changed from: private */

    /* renamed from: Z */
    public final C1626a f5754Z;
    /* access modifiers changed from: private */

    /* renamed from: a0 */
    public final C11969r f5755a0;

    /* renamed from: b0 */
    private C1622b f5756b0;

    @Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, mo31007d2 = {"<anonymous>", "Lio/reactivex/disposables/Disposable;", "it", "Lcom/bamnet/iap/google/billing/ObservableBillingClient;", "invoke"}, mo31008k = 3, mo31009mv = {1, 1, 15})
    /* renamed from: com.bamnet.iap.c.c.e$a */
    /* compiled from: GoogleBillingViewModel.kt */
    static final class C1631a extends C12881k implements Function1<C1647g, Disposable> {

        /* renamed from: U */
        final /* synthetic */ List f5757U;

        /* renamed from: V */
        final /* synthetic */ List f5758V;

        /* renamed from: c */
        final /* synthetic */ C1630e f5759c;

        /* renamed from: com.bamnet.iap.c.c.e$a$a */
        /* compiled from: GoogleBillingViewModel.kt */
        static final class C1632a implements C11945a {

            /* renamed from: a */
            final /* synthetic */ C1631a f5760a;

            C1632a(C1631a aVar) {
                this.f5760a = aVar;
            }

            public final void run() {
                StringBuilder sb = new StringBuilder();
                sb.append("Successfully consumed list of purchases: ");
                sb.append(this.f5760a.f5758V);
                Timber.m44522a(sb.toString(), new Object[0]);
            }
        }

        /* renamed from: com.bamnet.iap.c.c.e$a$b */
        /* compiled from: GoogleBillingViewModel.kt */
        static final class C1633b<T> implements Consumer<Throwable> {

            /* renamed from: c */
            final /* synthetic */ C1631a f5761c;

            C1633b(C1631a aVar) {
                this.f5761c = aVar;
            }

            /* renamed from: a */
            public final void accept(Throwable th) {
                StringBuilder sb = new StringBuilder();
                sb.append("Error consuming list of purchases: ");
                sb.append(this.f5761c.f5758V);
                Timber.m44530c(th, sb.toString(), new Object[0]);
            }
        }

        C1631a(C1630e eVar, List list, List list2) {
            this.f5759c = eVar;
            this.f5757U = list;
            this.f5758V = list2;
            super(1);
        }

        /* renamed from: a */
        public final Disposable invoke(C1647g gVar) {
            List list = this.f5757U;
            if (list != null) {
                Object[] array = list.toArray(new Completable[0]);
                if (array != null) {
                    CompletableSource[] completableSourceArr = (CompletableSource[]) array;
                    Disposable a = Completable.m38157a((CompletableSource[]) Arrays.copyOf(completableSourceArr, completableSourceArr.length)).mo30051b(this.f5759c.f5755a0).mo30047a(new C1632a(this), new C1633b(this));
                    Intrinsics.checkReturnedValueIsNotNull((Object) a, "Completable.mergeArray(*…\")\n                    })");
                    return a;
                }
                throw new TypeCastException("null cannot be cast to non-null type kotlin.Array<T>");
            }
            throw new TypeCastException("null cannot be cast to non-null type java.util.Collection<T>");
        }
    }

    @Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, mo31007d2 = {"<anonymous>", "Lio/reactivex/disposables/Disposable;", "client", "Lcom/bamnet/iap/google/billing/ObservableBillingClient;", "invoke"}, mo31008k = 3, mo31009mv = {1, 1, 15})
    /* renamed from: com.bamnet.iap.c.c.e$b */
    /* compiled from: GoogleBillingViewModel.kt */
    static final class C1634b extends C12881k implements Function1<C1647g, Disposable> {

        /* renamed from: c */
        final /* synthetic */ C1630e f5762c;

        /* renamed from: com.bamnet.iap.c.c.e$b$a */
        /* compiled from: GoogleBillingViewModel.kt */
        static final class C1635a<T, R> implements Function<T, R> {

            /* renamed from: c */
            final /* synthetic */ C1634b f5763c;

            C1635a(C1634b bVar) {
                this.f5763c = bVar;
            }

            /* renamed from: a */
            public final Map<String, BamnetIAPPurchase> apply(Pair<C1658i, C1658i> pair) {
                return C13166g0.m40317a(this.f5763c.f5762c.f5754Z.mo7256a(((C1658i) pair.mo31015c()).mo7294a(), BamnetIAPProductType.ENTITLED), this.f5763c.f5762c.f5754Z.mo7256a(((C1658i) pair.mo31016d()).mo7294a(), BamnetIAPProductType.SUBSCRIPTION));
            }
        }

        @Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a(\u0012$\u0012\"\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004 \u0005*\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00020\u00020\u00012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002H\n¢\u0006\u0002\b\u0007"}, mo31007d2 = {"<anonymous>", "Lio/reactivex/Single;", "", "", "Lcom/bamnet/iap/BamnetIAPPurchase;", "kotlin.jvm.PlatformType", "purchaseMap", "apply"}, mo31008k = 3, mo31009mv = {1, 1, 15})
        /* renamed from: com.bamnet.iap.c.c.e$b$b */
        /* compiled from: GoogleBillingViewModel.kt */
        static final class C1636b<T, R> implements Function<T, SingleSource<? extends R>> {

            /* renamed from: c */
            final /* synthetic */ C1634b f5764c;

            /* renamed from: com.bamnet.iap.c.c.e$b$b$a */
            /* compiled from: GoogleBillingViewModel.kt */
            static final class C1637a<V> implements Callable<Map<String, ? extends BamnetIAPPurchase>> {

                /* renamed from: c */
                final /* synthetic */ Map f5765c;

                C1637a(Map map) {
                    this.f5765c = map;
                }

                public final Map<String, BamnetIAPPurchase> call() {
                    return this.f5765c;
                }
            }

            C1636b(C1634b bVar) {
                this.f5764c = bVar;
            }

            /* renamed from: a */
            public final Single<Map<String, BamnetIAPPurchase>> apply(Map<String, ? extends BamnetIAPPurchase> map) {
                if (!this.f5764c.f5762c.mo7257A().mo7229a()) {
                    return Single.m38399b(map);
                }
                ArrayList arrayList = new ArrayList(map.size());
                for (Entry value : map.entrySet()) {
                    arrayList.add(this.f5764c.f5762c.m7611b((BamnetIAPPurchase) value.getValue()));
                }
                Object[] array = arrayList.toArray(new Completable[0]);
                if (array != null) {
                    CompletableSource[] completableSourceArr = (CompletableSource[]) array;
                    return Completable.m38157a((CompletableSource[]) Arrays.copyOf(completableSourceArr, completableSourceArr.length)).mo30046a((Callable<? extends T>) new C1637a<Object>(map));
                }
                throw new TypeCastException("null cannot be cast to non-null type kotlin.Array<T>");
            }
        }

        /* renamed from: com.bamnet.iap.c.c.e$b$c */
        /* compiled from: GoogleBillingViewModel.kt */
        static final class C1638c<T> implements Consumer<Map<String, ? extends BamnetIAPPurchase>> {

            /* renamed from: c */
            final /* synthetic */ C1634b f5766c;

            C1638c(C1634b bVar) {
                this.f5766c = bVar;
            }

            /* renamed from: a */
            public final void accept(Map<String, ? extends BamnetIAPPurchase> map) {
                C1621a c = this.f5766c.f5762c.f5751W;
                if (c != null) {
                    c.mo7227a(C1630e.m7606a(this.f5766c.f5762c, 0, null, 3, null), map);
                }
            }
        }

        /* renamed from: com.bamnet.iap.c.c.e$b$d */
        /* compiled from: GoogleBillingViewModel.kt */
        static final class C1639d<T> implements Consumer<Throwable> {

            /* renamed from: c */
            final /* synthetic */ C1634b f5767c;

            C1639d(C1634b bVar) {
                this.f5767c = bVar;
            }

            /* renamed from: a */
            public final void accept(Throwable th) {
                Timber.m44528b(th, "Error fetching cached purchases.", new Object[0]);
                C1621a c = this.f5767c.f5762c.f5751W;
                if (c != null) {
                    Intrinsics.checkReturnedValueIsNotNull((Object) th, "it");
                    c.mo7227a(C1627b.m7595a(th), null);
                }
            }
        }

        C1634b(C1630e eVar) {
            this.f5762c = eVar;
            super(1);
        }

        /* renamed from: a */
        public final Disposable invoke(C1647g gVar) {
            Disposable a = gVar.mo7284a().mo30220b(this.f5762c.f5755a0).mo30233g(new C1635a(this)).mo30208a((Function<? super T, ? extends SingleSource<? extends R>>) new C1636b<Object,Object>(this)).mo30214a((Consumer<? super T>) new C1638c<Object>(this), (Consumer<? super Throwable>) new C1639d<Object>(this));
            Intrinsics.checkReturnedValueIsNotNull((Object) a, "client.queryPurchases()\n…l)\n                    })");
            return a;
        }
    }

    @Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, mo31007d2 = {"<anonymous>", "Lio/reactivex/disposables/Disposable;", "client", "Lcom/bamnet/iap/google/billing/ObservableBillingClient;", "invoke"}, mo31008k = 3, mo31009mv = {1, 1, 15})
    /* renamed from: com.bamnet.iap.c.c.e$c */
    /* compiled from: GoogleBillingViewModel.kt */
    static final class C1640c extends C12881k implements Function1<C1647g, Disposable> {

        /* renamed from: U */
        final /* synthetic */ List f5768U;

        /* renamed from: c */
        final /* synthetic */ C1630e f5769c;

        /* renamed from: com.bamnet.iap.c.c.e$c$a */
        /* compiled from: GoogleBillingViewModel.kt */
        static final class C1641a<T, R> implements Function<T, R> {

            /* renamed from: c */
            public static final C1641a f5770c = new C1641a();

            C1641a() {
            }

            /* renamed from: a */
            public final List<C1433s> apply(Pair<C1657h, C1657h> pair) {
                return C13199w.m40583d((Collection) ((C1657h) pair.mo31015c()).mo7290a(), (Iterable) ((C1657h) pair.mo31016d()).mo7290a());
            }
        }

        /* renamed from: com.bamnet.iap.c.c.e$c$b */
        /* compiled from: GoogleBillingViewModel.kt */
        static final class C1642b<T> implements Consumer<List<? extends C1433s>> {

            /* renamed from: c */
            final /* synthetic */ C1640c f5771c;

            C1642b(C1640c cVar) {
                this.f5771c = cVar;
            }

            /* renamed from: a */
            public final void accept(List<? extends C1433s> list) {
                Intrinsics.checkReturnedValueIsNotNull((Object) list, "it");
                ArrayList arrayList = new ArrayList(C13187p.m40525a((Iterable) list, 10));
                for (C1433s sVar : list) {
                    Map d = this.f5771c.f5769c.f5753Y;
                    String g = sVar.mo6534g();
                    Intrinsics.checkReturnedValueIsNotNull((Object) g, "skuDetails.sku");
                    d.put(g, sVar);
                    arrayList.add(C13145v.f29587a);
                }
            }
        }

        /* renamed from: com.bamnet.iap.c.c.e$c$c */
        /* compiled from: GoogleBillingViewModel.kt */
        static final class C1643c<T, R> implements Function<T, R> {

            /* renamed from: c */
            final /* synthetic */ C1640c f5772c;

            C1643c(C1640c cVar) {
                this.f5772c = cVar;
            }

            /* renamed from: a */
            public final Map<String, BamnetIAPProduct> apply(List<? extends C1433s> list) {
                return this.f5772c.f5769c.f5754Z.mo7255a(list);
            }
        }

        /* renamed from: com.bamnet.iap.c.c.e$c$d */
        /* compiled from: GoogleBillingViewModel.kt */
        static final class C1644d<T> implements Consumer<Map<String, ? extends BamnetIAPProduct>> {

            /* renamed from: c */
            final /* synthetic */ C1640c f5773c;

            C1644d(C1640c cVar) {
                this.f5773c = cVar;
            }

            /* renamed from: a */
            public final void accept(Map<String, ? extends BamnetIAPProduct> map) {
                C1621a c = this.f5773c.f5769c.f5751W;
                if (c != null) {
                    c.mo7228b(C1630e.m7606a(this.f5773c.f5769c, 0, null, 3, null), map);
                }
            }
        }

        /* renamed from: com.bamnet.iap.c.c.e$c$e */
        /* compiled from: GoogleBillingViewModel.kt */
        static final class C1645e<T> implements Consumer<Throwable> {

            /* renamed from: c */
            final /* synthetic */ C1640c f5774c;

            C1645e(C1640c cVar) {
                this.f5774c = cVar;
            }

            /* renamed from: a */
            public final void accept(Throwable th) {
                Timber.m44530c(th, "Error fetching products", new Object[0]);
                C1621a c = this.f5774c.f5769c.f5751W;
                if (c != null) {
                    Intrinsics.checkReturnedValueIsNotNull((Object) th, "it");
                    c.mo7228b(C1627b.m7595a(th), null);
                }
            }
        }

        C1640c(C1630e eVar, List list) {
            this.f5769c = eVar;
            this.f5768U = list;
            super(1);
        }

        /* renamed from: a */
        public final Disposable invoke(C1647g gVar) {
            Disposable a = gVar.mo7285a(this.f5768U).mo30220b(this.f5769c.f5755a0).mo30233g(C1641a.f5770c).mo30227d((Consumer<? super T>) new C1642b<Object>(this)).mo30233g(new C1643c(this)).mo30214a((Consumer<? super T>) new C1644d<Object>(this), (Consumer<? super Throwable>) new C1645e<Object>(this));
            Intrinsics.checkReturnedValueIsNotNull((Object) a, "client.queryProducts(sku…l)\n                    })");
            return a;
        }
    }

    public C1630e(Application application) {
        super(application);
        this.f5754Z = new C1626a(application);
        C11969r b = C11934b.m38500b();
        Intrinsics.checkReturnedValueIsNotNull((Object) b, "Schedulers.io()");
        this.f5755a0 = b;
        this.f5756b0 = C1622b.f5738c.mo7233a();
    }

    /* renamed from: A */
    public final C1622b mo7257A() {
        return this.f5756b0;
    }

    /* renamed from: B */
    public final boolean mo7258B() {
        C1387d dVar = this.f5749U;
        if (dVar != null) {
            return dVar.mo6463b();
        }
        return false;
    }

    /* renamed from: C */
    public final void mo7259C() {
        m7609a((Function1<? super C1647g, ? extends Disposable>) new C1634b<Object,Object>(this));
    }

    /* renamed from: g */
    public void mo6442g() {
    }

    /* access modifiers changed from: protected */
    public void onCleared() {
        super.onCleared();
        mo7265z();
    }

    /* renamed from: z */
    public final void mo7265z() {
        this.f5753Y.clear();
        this.f5750V.dispose();
        C1387d dVar = this.f5749U;
        if (dVar != null) {
            dVar.mo6458a();
        }
        this.f5749U = null;
        this.f5751W = null;
    }

    /* renamed from: b */
    public void mo6441b(C1417h hVar, List<C1426m> list) {
        List list2;
        int b = hVar != null ? hVar.mo6504b() : 6;
        if (b == 0) {
            BamnetIAPResult bamnetIAPResult = new BamnetIAPResult(0, "Purchase success.");
            if (list != null) {
                list2 = new ArrayList(C13187p.m40525a((Iterable) list, 10));
                for (C1426m mVar : list) {
                    list2.add(this.f5754Z.mo7254a(mVar, m7604a(mVar)));
                }
            } else {
                list2 = C13185o.m40513a();
            }
            if (this.f5756b0.mo7229a()) {
                m7612b(list2);
            }
            C1621a aVar = this.f5751W;
            if (aVar != null) {
                aVar.mo7226a(bamnetIAPResult, list2);
                return;
            }
            return;
        }
        BamnetIAPResult bamnetIAPResult2 = new BamnetIAPResult(C1627b.m7594a(b), "Purchase failed.");
        C1621a aVar2 = this.f5751W;
        if (aVar2 != null) {
            aVar2.mo7226a(bamnetIAPResult2, null);
        }
    }

    /* renamed from: a */
    public final void mo7263a(C1622b bVar) {
        this.f5756b0 = bVar;
    }

    /* renamed from: a */
    public final void mo7262a(C1621a aVar) {
        this.f5751W = aVar;
        if (!mo7258B()) {
            C1387d dVar = this.f5749U;
            if (!(dVar == null || dVar == null)) {
                dVar.mo6458a();
            }
            C1389b a = C1387d.m6778a((Context) mo4111y());
            a.mo6464a(this);
            a.mo6466b();
            this.f5749U = a.mo6465a();
            C1387d dVar2 = this.f5749U;
            if (dVar2 != null) {
                dVar2.mo6460a((C1413f) this);
            }
            if (this.f5752X == null) {
                C1387d dVar3 = this.f5749U;
                if (dVar3 != null) {
                    this.f5752X = new C1647g(dVar3);
                } else {
                    Intrinsics.throwNpe();
                    throw null;
                }
            }
        } else {
            aVar.mo7224a(new BamnetIAPResult(11, "set up previously complete"));
        }
    }

    /* renamed from: a */
    public final void mo7264a(List<String> list) {
        m7609a((Function1<? super C1647g, ? extends Disposable>) new C1640c<Object,Object>(this, list));
    }

    /* renamed from: b */
    public void mo6440b(C1417h hVar) {
        BamnetIAPResult bamnetIAPResult;
        if ((hVar != null ? hVar.mo6504b() : 6) != 0) {
            bamnetIAPResult = new BamnetIAPResult(1, "set up failed to complete");
        } else {
            bamnetIAPResult = new BamnetIAPResult(0, "set up complete");
        }
        C1621a aVar = this.f5751W;
        if (aVar != null) {
            aVar.mo7224a(bamnetIAPResult);
        }
    }

    /* renamed from: a */
    public final void mo7260a(Activity activity, String str) {
        C1433s sVar = (C1433s) this.f5753Y.get(str);
        if (sVar == null) {
            BamnetIAPResult bamnetIAPResult = new BamnetIAPResult(5, "SKU does not have an associated product.");
            C1621a aVar = this.f5751W;
            if (aVar != null) {
                aVar.mo7226a(bamnetIAPResult, null);
            }
            return;
        }
        C1416b j = C1414g.m6836j();
        j.mo6501a(sVar);
        C1414g a = j.mo6502a();
        C1387d dVar = this.f5749U;
        if (dVar != null) {
            dVar.mo6456a(activity, a);
        }
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0046  */
    /* JADX WARNING: Removed duplicated region for block: B:22:? A[RETURN, SYNTHETIC] */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final p520io.reactivex.Completable m7611b(com.bamnet.iap.BamnetIAPPurchase r5) {
        /*
            r4 = this;
            com.bamnet.iap.BamnetIAPProduct$BamnetIAPProductType r0 = r5.mo7203a()
            r1 = 0
            if (r0 != 0) goto L_0x0008
            goto L_0x0018
        L_0x0008:
            int[] r2 = com.bamnet.iap.p035c.p036c.C1629d.$EnumSwitchMapping$0
            int r0 = r0.ordinal()
            r0 = r2[r0]
            r2 = 1
            java.lang.String r3 = "null cannot be cast to non-null type com.bamnet.iap.google.GoogleIAPPurchase"
            if (r0 == r2) goto L_0x0030
            r2 = 2
            if (r0 == r2) goto L_0x001d
        L_0x0018:
            io.reactivex.Completable r1 = p520io.reactivex.Completable.m38169h()
            goto L_0x0043
        L_0x001d:
            com.bamnet.iap.c.c.g r0 = r4.f5752X
            if (r0 == 0) goto L_0x0043
            if (r5 == 0) goto L_0x002a
            com.bamnet.iap.c.a r5 = (com.bamnet.iap.p035c.C1624a) r5
            io.reactivex.Completable r1 = r0.mo7286b(r5)
            goto L_0x0043
        L_0x002a:
            kotlin.s r5 = new kotlin.s
            r5.<init>(r3)
            throw r5
        L_0x0030:
            com.bamnet.iap.c.c.g r0 = r4.f5752X
            if (r0 == 0) goto L_0x0043
            if (r5 == 0) goto L_0x003d
            com.bamnet.iap.c.a r5 = (com.bamnet.iap.p035c.C1624a) r5
            io.reactivex.Completable r1 = r0.mo7283a(r5)
            goto L_0x0043
        L_0x003d:
            kotlin.s r5 = new kotlin.s
            r5.<init>(r3)
            throw r5
        L_0x0043:
            if (r1 == 0) goto L_0x0046
            goto L_0x004f
        L_0x0046:
            io.reactivex.Completable r1 = p520io.reactivex.Completable.m38169h()
            java.lang.String r5 = "Completable.complete()"
            kotlin.jvm.internal.Intrinsics.checkReturnedValueIsNotNull(r1, r5)
        L_0x004f:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bamnet.iap.p035c.p036c.C1630e.m7611b(com.bamnet.iap.BamnetIAPPurchase):io.reactivex.Completable");
    }

    /* renamed from: a */
    public final void mo7261a(BamnetIAPPurchase bamnetIAPPurchase) {
        m7612b(C13183n.m40498a(bamnetIAPPurchase));
    }

    /* renamed from: a */
    private final void m7609a(Function1<? super C1647g, ? extends Disposable> function1) {
        C1647g gVar = this.f5752X;
        if (gVar != null) {
            this.f5750V.mo30250b((Disposable) function1.invoke(gVar));
        }
    }

    /* renamed from: a */
    static /* synthetic */ BamnetIAPResult m7606a(C1630e eVar, int i, String str, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = 0;
        }
        if ((i2 & 2) != 0) {
            str = "";
        }
        return eVar.m7605a(i, str);
    }

    /* renamed from: a */
    private final BamnetIAPResult m7605a(int i, String str) {
        return new BamnetIAPResult(i, str);
    }

    /* renamed from: b */
    private final void m7612b(List<? extends BamnetIAPPurchase> list) {
        ArrayList arrayList = new ArrayList(C13187p.m40525a((Iterable) list, 10));
        for (BamnetIAPPurchase b : list) {
            arrayList.add(m7611b(b));
        }
        m7609a((Function1<? super C1647g, ? extends Disposable>) new C1631a<Object,Object>(this, arrayList, list));
    }

    /* renamed from: a */
    private final BamnetIAPProductType m7604a(C1426m mVar) {
        C1433s sVar = (C1433s) this.f5753Y.get(mVar.mo6520h());
        if (sVar != null) {
            String k = sVar.mo6539k();
            if (k != null) {
                return this.f5754Z.mo7253a(k);
            }
        }
        return BamnetIAPProductType.UNKNOWN;
    }
}
