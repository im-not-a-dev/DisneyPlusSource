package com.bamnet.iap.p035c.p036c;

import com.android.billingclient.api.C1380a;
import com.android.billingclient.api.C1380a.C1382b;
import com.android.billingclient.api.C1383b;
import com.android.billingclient.api.C1387d;
import com.android.billingclient.api.C1417h;
import com.android.billingclient.api.C1421j;
import com.android.billingclient.api.C1421j.C1423b;
import com.android.billingclient.api.C1424k;
import com.android.billingclient.api.C1426m.C1427a;
import com.android.billingclient.api.C1433s;
import com.android.billingclient.api.C1435t;
import com.android.billingclient.api.C1435t.C1437b;
import com.android.billingclient.api.C1438u;
import com.bamnet.iap.p035c.C1624a;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.C12880j;
import p520io.reactivex.C11914c;
import p520io.reactivex.C11986t;
import p520io.reactivex.C11988v;
import p520io.reactivex.Completable;
import p520io.reactivex.CompletableEmitter;
import p520io.reactivex.Single;
import p520io.reactivex.SingleSource;
import p520io.reactivex.functions.C11947c;
import p520io.reactivex.p524d0.C11918b;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0015\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0000¢\u0006\u0002\b\tJ\u0015\u0010\n\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0000¢\u0006\u0002\b\u000bJ\u0010\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0002J$\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00120\u00112\u0006\u0010\u0013\u001a\u00020\u00142\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u0016H\u0002J\u0016\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00180\u00112\u0006\u0010\u0013\u001a\u00020\u0014H\u0002J\u0016\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00112\u0006\u0010\u0013\u001a\u00020\u0014H\u0002J-\u0010\u001b\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00120\u001c0\u00112\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u0016H\u0000¢\u0006\u0002\b\u001dJ\u001f\u0010\u001e\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u00180\u001c0\u0011H\u0000¢\u0006\u0002\b\u001fJ\u001f\u0010 \u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\u001a0\u001c0\u0011H\u0000¢\u0006\u0002\b!J\u0014\u0010\"\u001a\u00020#*\u00020$2\u0006\u0010\u0013\u001a\u00020\u0014H\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006%"}, mo31007d2 = {"Lcom/bamnet/iap/google/billing/ObservableBillingClient;", "", "billingClient", "Lcom/android/billingclient/api/BillingClient;", "(Lcom/android/billingclient/api/BillingClient;)V", "acknowledgeSubscription", "Lio/reactivex/Completable;", "googlePurchase", "Lcom/bamnet/iap/google/GoogleIAPPurchase;", "acknowledgeSubscription$google_iap_release", "consumePurchase", "consumePurchase$google_iap_release", "isSuccess", "", "responseCode", "", "queryBillingForProducts", "Lio/reactivex/Single;", "Lcom/bamnet/iap/google/billing/ProductResult;", "skuType", "", "skus", "", "queryBillingForPurchaseHistory", "Lcom/bamnet/iap/google/billing/PurchaseHistoryResults;", "queryBillingForPurchases", "Lcom/bamnet/iap/google/billing/PurchaseResults;", "queryProducts", "Lkotlin/Pair;", "queryProducts$google_iap_release", "queryPurchaseHistory", "queryPurchaseHistory$google_iap_release", "queryPurchases", "queryPurchases$google_iap_release", "toGoogleProductException", "Lcom/bamnet/iap/google/billing/GoogleProductException;", "Lcom/android/billingclient/api/BillingResult;", "google-iap_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* renamed from: com.bamnet.iap.c.c.g */
/* compiled from: ObservableBillingClient.kt */
public final class C1647g {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final C1387d f5777a;

    @Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, mo31007d2 = {"<anonymous>", "", "emitter", "Lio/reactivex/CompletableEmitter;", "subscribe"}, mo31008k = 3, mo31009mv = {1, 1, 15})
    /* renamed from: com.bamnet.iap.c.c.g$a */
    /* compiled from: ObservableBillingClient.kt */
    static final class C1648a implements C11914c {

        /* renamed from: a */
        final /* synthetic */ C1647g f5778a;

        /* renamed from: b */
        final /* synthetic */ C1624a f5779b;

        /* renamed from: com.bamnet.iap.c.c.g$a$a */
        /* compiled from: ObservableBillingClient.kt */
        static final class C1649a implements C1383b {

            /* renamed from: U */
            final /* synthetic */ CompletableEmitter f5780U;

            /* renamed from: c */
            final /* synthetic */ C1648a f5781c;

            C1649a(C1648a aVar, CompletableEmitter completableEmitter) {
                this.f5781c = aVar;
                this.f5780U = completableEmitter;
            }

            /* renamed from: a */
            public final void mo6437a(C1417h hVar) {
                C1647g gVar = this.f5781c.f5778a;
                C12880j.m40222a((Object) hVar, "result");
                if (gVar.m7647a(hVar.mo6504b())) {
                    this.f5780U.onComplete();
                } else {
                    this.f5780U.onError(this.f5781c.f5778a.m7643a(hVar, "subs"));
                }
            }
        }

        C1648a(C1647g gVar, C1624a aVar) {
            this.f5778a = gVar;
            this.f5779b = aVar;
        }

        public final void subscribe(CompletableEmitter completableEmitter) {
            C1382b c = C1380a.m6765c();
            c.mo6448a(this.f5779b.mo7243h());
            this.f5778a.f5777a.mo6459a(c.mo6449a(), (C1383b) new C1649a(this, completableEmitter));
        }
    }

    @Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, mo31007d2 = {"<anonymous>", "", "emitter", "Lio/reactivex/CompletableEmitter;", "subscribe"}, mo31008k = 3, mo31009mv = {1, 1, 15})
    /* renamed from: com.bamnet.iap.c.c.g$b */
    /* compiled from: ObservableBillingClient.kt */
    static final class C1650b implements C11914c {

        /* renamed from: a */
        final /* synthetic */ C1647g f5782a;

        /* renamed from: b */
        final /* synthetic */ C1624a f5783b;

        /* renamed from: com.bamnet.iap.c.c.g$b$a */
        /* compiled from: ObservableBillingClient.kt */
        static final class C1651a implements C1424k {

            /* renamed from: U */
            final /* synthetic */ CompletableEmitter f5784U;

            /* renamed from: c */
            final /* synthetic */ C1650b f5785c;

            C1651a(C1650b bVar, CompletableEmitter completableEmitter) {
                this.f5785c = bVar;
                this.f5784U = completableEmitter;
            }

            /* renamed from: a */
            public final void mo6438a(C1417h hVar, String str) {
                C1647g gVar = this.f5785c.f5782a;
                C12880j.m40222a((Object) hVar, "billingResult");
                if (gVar.m7647a(hVar.mo6504b())) {
                    this.f5784U.onComplete();
                } else {
                    this.f5784U.onError(this.f5785c.f5782a.m7643a(hVar, "inapp"));
                }
            }
        }

        C1650b(C1647g gVar, C1624a aVar) {
            this.f5782a = gVar;
            this.f5783b = aVar;
        }

        public final void subscribe(CompletableEmitter completableEmitter) {
            C1423b c = C1421j.m6858c();
            c.mo6510a(this.f5783b.mo7243h());
            this.f5782a.f5777a.mo6461a(c.mo6511a(), (C1424k) new C1651a(this, completableEmitter));
        }
    }

    @Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0014\u0010\u0002\u001a\u0010\u0012\f\u0012\n \u0005*\u0004\u0018\u00010\u00040\u00040\u0003H\n¢\u0006\u0002\b\u0006"}, mo31007d2 = {"<anonymous>", "", "emitter", "Lio/reactivex/SingleEmitter;", "Lcom/bamnet/iap/google/billing/ProductResult;", "kotlin.jvm.PlatformType", "subscribe"}, mo31008k = 3, mo31009mv = {1, 1, 15})
    /* renamed from: com.bamnet.iap.c.c.g$c */
    /* compiled from: ObservableBillingClient.kt */
    static final class C1652c<T> implements C11988v<T> {

        /* renamed from: a */
        final /* synthetic */ C1647g f5786a;

        /* renamed from: b */
        final /* synthetic */ C1435t f5787b;

        /* renamed from: c */
        final /* synthetic */ String f5788c;

        /* renamed from: com.bamnet.iap.c.c.g$c$a */
        /* compiled from: ObservableBillingClient.kt */
        static final class C1653a implements C1438u {

            /* renamed from: U */
            final /* synthetic */ C11986t f5789U;

            /* renamed from: c */
            final /* synthetic */ C1652c f5790c;

            C1653a(C1652c cVar, C11986t tVar) {
                this.f5790c = cVar;
                this.f5789U = tVar;
            }

            /* renamed from: a */
            public final void mo6439a(C1417h hVar, List<C1433s> list) {
                C1647g gVar = this.f5790c.f5786a;
                C12880j.m40222a((Object) hVar, "billingResult");
                if (gVar.m7647a(hVar.mo6504b())) {
                    C11986t tVar = this.f5789U;
                    if (list == null) {
                        list = C13185o.m40513a();
                    }
                    tVar.onSuccess(new C1657h(list));
                    return;
                }
                C11986t tVar2 = this.f5789U;
                C1652c cVar = this.f5790c;
                tVar2.onError(cVar.f5786a.m7643a(hVar, cVar.f5788c));
            }
        }

        C1652c(C1647g gVar, C1435t tVar, String str) {
            this.f5786a = gVar;
            this.f5787b = tVar;
            this.f5788c = str;
        }

        /* renamed from: a */
        public final void mo7288a(C11986t<C1657h> tVar) {
            this.f5786a.f5777a.mo6462a(this.f5787b, (C1438u) new C1653a(this, tVar));
        }
    }

    /* renamed from: com.bamnet.iap.c.c.g$d */
    /* compiled from: ObservableBillingClient.kt */
    static final class C1654d<T> implements C11988v<T> {

        /* renamed from: a */
        final /* synthetic */ C1647g f5791a;

        /* renamed from: b */
        final /* synthetic */ String f5792b;

        C1654d(C1647g gVar, String str) {
            this.f5791a = gVar;
            this.f5792b = str;
        }

        /* renamed from: a */
        public final void mo7288a(C11986t<C1658i> tVar) {
            C1427a a = this.f5791a.f5777a.mo6457a(this.f5792b);
            C1647g gVar = this.f5791a;
            C12880j.m40222a((Object) a, "billingPurchaseResult");
            if (gVar.m7647a(a.mo6526c())) {
                List b = a.mo6525b();
                C12880j.m40222a((Object) b, "billingPurchaseResult.purchasesList");
                tVar.onSuccess(new C1658i(b));
                return;
            }
            C1647g gVar2 = this.f5791a;
            C1417h a2 = a.mo6524a();
            C12880j.m40222a((Object) a2, "billingPurchaseResult.billingResult");
            tVar.onError(gVar2.m7643a(a2, this.f5792b));
        }
    }

    /* renamed from: com.bamnet.iap.c.c.g$e */
    /* compiled from: Singles.kt */
    public static final class C1655e<T1, T2, R> implements C11947c<C1657h, C1657h, R> {
        public final R apply(C1657h hVar, C1657h hVar2) {
            return new Pair(hVar, hVar2);
        }
    }

    /* renamed from: com.bamnet.iap.c.c.g$f */
    /* compiled from: Singles.kt */
    public static final class C1656f<T1, T2, R> implements C11947c<C1658i, C1658i, R> {
        public final R apply(C1658i iVar, C1658i iVar2) {
            return new Pair(iVar, iVar2);
        }
    }

    public C1647g(C1387d dVar) {
        this.f5777a = dVar;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final boolean m7647a(int i) {
        switch (i) {
            case 0:
                return true;
            default:
                return false;
        }
    }

    /* renamed from: b */
    public final Completable mo7286b(C1624a aVar) {
        if (aVar.mo7244i()) {
            Completable h = Completable.m38169h();
            C12880j.m40222a((Object) h, "Completable.complete()");
            return h;
        }
        Completable a = Completable.m38151a((C11914c) new C1650b(this, aVar));
        C12880j.m40222a((Object) a, "create { emitter ->\n    …}\n            }\n        }");
        return a;
    }

    /* renamed from: a */
    public final Single<Pair<C1657h, C1657h>> mo7285a(List<String> list) {
        Single a = m7646a("inapp", list);
        Single a2 = m7646a("subs", list);
        C11918b bVar = C11918b.f27600a;
        Single<Pair<C1657h, C1657h>> a3 = Single.m38390a((SingleSource<? extends T1>) a, (SingleSource<? extends T2>) a2, (C11947c<? super T1, ? super T2, ? extends R>) new C1655e<Object,Object,Object>());
        C12880j.m40222a((Object) a3, "Single.zip(s1, s2, BiFun…-> zipper.invoke(t, u) })");
        return a3;
    }

    /* renamed from: a */
    public final Single<Pair<C1658i, C1658i>> mo7284a() {
        Single a = m7645a("inapp");
        Single a2 = m7645a("subs");
        C11918b bVar = C11918b.f27600a;
        Single<Pair<C1658i, C1658i>> a3 = Single.m38390a((SingleSource<? extends T1>) a, (SingleSource<? extends T2>) a2, (C11947c<? super T1, ? super T2, ? extends R>) new C1656f<Object,Object,Object>());
        C12880j.m40222a((Object) a3, "Single.zip(s1, s2, BiFun…-> zipper.invoke(t, u) })");
        return a3;
    }

    /* renamed from: a */
    public final Completable mo7283a(C1624a aVar) {
        if (aVar.mo7244i()) {
            Completable h = Completable.m38169h();
            C12880j.m40222a((Object) h, "Completable.complete()");
            return h;
        }
        Completable a = Completable.m38151a((C11914c) new C1648a(this, aVar));
        C12880j.m40222a((Object) a, "create { emitter ->\n    …}\n            }\n        }");
        return a;
    }

    /* renamed from: a */
    private final Single<C1657h> m7646a(String str, List<String> list) {
        C1437b c = C1435t.m6896c();
        c.mo6549a(list);
        c.mo6548a(str);
        Single<C1657h> a = Single.m38392a((C11988v<T>) new C1652c<T>(this, c.mo6550a(), str));
        C12880j.m40222a((Object) a, "Single.create { emitter …}\n            }\n        }");
        return a;
    }

    /* renamed from: a */
    private final Single<C1658i> m7645a(String str) {
        Single<C1658i> a = Single.m38392a((C11988v<T>) new C1654d<T>(this, str));
        C12880j.m40222a((Object) a, "Single.create { emitter …)\n            }\n        }");
        return a;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final C1646f m7643a(C1417h hVar, String str) {
        return new C1646f(hVar.mo6504b(), str, hVar.mo6503a());
    }
}
