package com.bamtechmedia.dominguez.purchase;

import com.bamnet.iap.BamnetIAPProduct;
import com.bamtech.sdk4.paywall.AccountEntitlementContext;
import com.bamtech.sdk4.paywall.Paywall;
import com.bamtech.sdk4.paywall.PaywallApi;
import com.bamtech.sdk4.paywall.Product;
import com.bamtech.sdk4.paywall.ProductType;
import com.bamtech.sdk4.service.NetworkException;
import com.bamtechmedia.dominguez.core.utils.C5826e0;
import com.bamtechmedia.dominguez.paywall.exceptions.C6261a;
import com.bamtechmedia.dominguez.paywall.exceptions.PaywallError;
import com.bamtechmedia.dominguez.paywall.exceptions.PaywallError.C6253b;
import com.bamtechmedia.dominguez.paywall.exceptions.PaywallError.C6257f;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import kotlin.Metadata;
import kotlin.jvm.internal.C12880j;
import p163g.p201e.p203b.p319v.C7873f;
import p163g.p201e.p203b.p319v.C7885o;
import p163g.p201e.p203b.p319v.C7887p;
import p163g.p201e.p203b.p319v.C7887p.C7889b;
import p163g.p201e.p203b.p319v.C7887p.C7891d;
import p163g.p201e.p203b.p319v.C7887p.C7893f;
import p163g.p201e.p203b.p319v.C7887p.C7895h;
import p163g.p201e.p203b.p319v.C7887p.C7896i;
import p163g.p201e.p203b.p319v.C7900q;
import p163g.p201e.p203b.p319v.p320a0.C7820a;
import p163g.p201e.p203b.p319v.p320a0.C7821b;
import p163g.p201e.p203b.p319v.p320a0.C7822c;
import p163g.p201e.p203b.p319v.p320a0.C7823d;
import p163g.p201e.p203b.p319v.p321b0.C7835b;
import p520io.reactivex.C11969r;
import p520io.reactivex.Completable;
import p520io.reactivex.CompletableSource;
import p520io.reactivex.Single;
import p520io.reactivex.SingleSource;
import p520io.reactivex.disposables.Disposable;
import p520io.reactivex.functions.C11952h;
import p520io.reactivex.functions.Consumer;
import p520io.reactivex.functions.Function;
import p686n.p687a.C14100a;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001BE\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0001\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\b\b\u0001\u0010\r\u001a\u00020\u000e¢\u0006\u0002\u0010\u000fJ\u0010\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020\u000eH\u0016J\u0010\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020&H\u0002J\u0018\u0010'\u001a\b\u0012\u0004\u0012\u00020\u00110(2\b\b\u0002\u0010)\u001a\u00020\u000eH\u0002J\u0016\u0010*\u001a\b\u0012\u0004\u0012\u00020+0(2\u0006\u0010,\u001a\u00020+H\u0002J\u0010\u0010-\u001a\u00020\u000e2\u0006\u0010.\u001a\u00020\u0011H\u0002J\u0010\u0010/\u001a\u00020\u000e2\u0006\u0010,\u001a\u00020+H\u0002J\u0010\u00100\u001a\u00020+2\u0006\u0010,\u001a\u00020+H\u0002J\u000e\u00101\u001a\b\u0012\u0004\u0012\u00020+0(H\u0002J\u0016\u00102\u001a\b\u0012\u0004\u0012\u0002030(2\u0006\u00104\u001a\u00020\u000eH\u0016J\b\u00105\u001a\u000206H\u0016J\u0016\u00107\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00192\u0006\u0010,\u001a\u000208H\u0002J\u0010\u00109\u001a\u00020\u000e2\u0006\u0010,\u001a\u00020+H\u0002J\f\u0010:\u001a\u00020\u0011*\u00020\u0011H\u0002R&\u0010\u0010\u001a\u0004\u0018\u00010\u00118\u0000@\u0000X\u000e¢\u0006\u0014\n\u0000\u0012\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R,\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\u001a\u0018\u00010\u00198\u0000@\u0000X\u000e¢\u0006\u0014\n\u0000\u0012\u0004\b\u001b\u0010\u0013\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR\u000e\u0010\b\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0004¢\u0006\u0002\n\u0000¨\u0006;"}, mo31007d2 = {"Lcom/bamtechmedia/dominguez/purchase/PaywallRepositoryImpl;", "Lcom/bamtechmedia/dominguez/paywall/PaywallRepository;", "paywallApi", "Lcom/bamtech/sdk4/paywall/PaywallApi;", "paywallConfig", "Lcom/bamtechmedia/dominguez/paywall/PaywallConfig;", "mainThreadScheduler", "Lio/reactivex/Scheduler;", "computationThreadScheduler", "paywallServicesInteractor", "Lcom/bamtechmedia/dominguez/paywall/PaywallServicesInteractor;", "setupFragmentHelper", "Lcom/bamtechmedia/dominguez/paywall/ui/IapSetupFragmentHelper;", "isDebug", "", "(Lcom/bamtech/sdk4/paywall/PaywallApi;Lcom/bamtechmedia/dominguez/paywall/PaywallConfig;Lio/reactivex/Scheduler;Lio/reactivex/Scheduler;Lcom/bamtechmedia/dominguez/paywall/PaywallServicesInteractor;Lcom/bamtechmedia/dominguez/paywall/ui/IapSetupFragmentHelper;Z)V", "cachedPaywall", "Lcom/bamtech/sdk4/paywall/Paywall;", "cachedPaywall$annotations", "()V", "getCachedPaywall$paywall_release", "()Lcom/bamtech/sdk4/paywall/Paywall;", "setCachedPaywall$paywall_release", "(Lcom/bamtech/sdk4/paywall/Paywall;)V", "cachedPaywallProducts", "", "Lcom/bamtechmedia/dominguez/paywall/model/PaywallProduct;", "cachedPaywallProducts$annotations", "getCachedPaywallProducts$paywall_release", "()Ljava/util/List;", "setCachedPaywallProducts$paywall_release", "(Ljava/util/List;)V", "clearPaywall", "", "evictCache", "createPaywallException", "Lcom/bamtechmedia/dominguez/paywall/exceptions/PaywallException;", "error", "Lcom/bamtechmedia/dominguez/paywall/exceptions/PaywallError;", "fetchPaywall", "Lio/reactivex/Single;", "cache", "handleServiceEvent", "Lcom/bamtechmedia/dominguez/paywall/PaywallServiceEvent;", "event", "isEntitled", "paywall", "isValidSetupError", "mapErrorEvents", "monitorServiceEvents", "paywallOnce", "Lcom/bamtechmedia/dominguez/paywall/model/DmgzPaywall;", "forceRefresh", "paywallOnlyOnce", "Lio/reactivex/Completable;", "products", "Lcom/bamtechmedia/dominguez/paywall/PaywallServiceEvent$ProductQuerySuccess;", "shouldFetchPaywall", "withOverrides", "paywall_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* renamed from: com.bamtechmedia.dominguez.purchase.q */
/* compiled from: PaywallRepositoryImpl.kt */
public final class C7062q implements C7885o {

    /* renamed from: a */
    private Paywall f15663a;

    /* renamed from: b */
    private List<? extends C7823d> f15664b;

    /* renamed from: c */
    private final PaywallApi f15665c;

    /* renamed from: d */
    private final C7873f f15666d;

    /* renamed from: e */
    private final C11969r f15667e;

    /* renamed from: f */
    private final C11969r f15668f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public final C7900q f15669g;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public final C7835b f15670h;

    /* renamed from: i */
    private final boolean f15671i;

    /* renamed from: com.bamtechmedia.dominguez.purchase.q$a */
    /* compiled from: PaywallRepositoryImpl.kt */
    static final class C7063a<T, R> implements Function<T, R> {

        /* renamed from: c */
        final /* synthetic */ C7062q f15672c;

        C7063a(C7062q qVar) {
            this.f15672c = qVar;
        }

        /* renamed from: a */
        public final Paywall apply(Paywall paywall) {
            return this.f15672c.m21425c(paywall);
        }
    }

    /* renamed from: com.bamtechmedia.dominguez.purchase.q$b */
    /* compiled from: PaywallRepositoryImpl.kt */
    static final class C7064b<T> implements Consumer<Paywall> {

        /* renamed from: U */
        final /* synthetic */ boolean f15673U;

        /* renamed from: c */
        final /* synthetic */ C7062q f15674c;

        C7064b(C7062q qVar, boolean z) {
            this.f15674c = qVar;
            this.f15673U = z;
        }

        /* renamed from: a */
        public final void accept(Paywall paywall) {
            if (this.f15673U) {
                this.f15674c.mo19842a(paywall);
            }
        }
    }

    /* renamed from: com.bamtechmedia.dominguez.purchase.q$c */
    /* compiled from: PaywallRepositoryImpl.kt */
    static final class C7065c<T> implements Consumer<Paywall> {

        /* renamed from: c */
        final /* synthetic */ C7062q f15675c;

        C7065c(C7062q qVar) {
            this.f15675c = qVar;
        }

        /* renamed from: a */
        public final void accept(Paywall paywall) {
            this.f15675c.mo19842a(paywall);
        }
    }

    /* renamed from: com.bamtechmedia.dominguez.purchase.q$d */
    /* compiled from: PaywallRepositoryImpl.kt */
    static final class C7066d<T> implements Consumer<Paywall> {

        /* renamed from: U */
        final /* synthetic */ boolean f15676U;

        /* renamed from: c */
        final /* synthetic */ C7062q f15677c;

        C7066d(C7062q qVar, boolean z) {
            this.f15677c = qVar;
            this.f15676U = z;
        }

        /* renamed from: a */
        public final void accept(Paywall paywall) {
            C7062q qVar = this.f15677c;
            C12880j.m40222a((Object) paywall, "paywall");
            if (qVar.m21423b(paywall)) {
                this.f15677c.f15669g.mo20744b().onNext(C7896i.f17023a);
            } else if (paywall.getProducts().isEmpty()) {
                this.f15677c.f15669g.mo20744b().onNext(new C7891d(C13173j0.m40350a()));
            } else if (!this.f15676U) {
                C7900q a = this.f15677c.f15669g;
                List<Product> products = paywall.getProducts();
                ArrayList arrayList = new ArrayList(C13187p.m40525a((Iterable) products, 10));
                for (Product sku : products) {
                    arrayList.add(sku.getSku());
                }
                a.mo20743a((List<String>) arrayList);
            }
        }
    }

    /* renamed from: com.bamtechmedia.dominguez.purchase.q$e */
    /* compiled from: PaywallRepositoryImpl.kt */
    static final class C7067e<T, R> implements Function<T, R> {

        /* renamed from: U */
        final /* synthetic */ C7887p f15678U;

        /* renamed from: c */
        final /* synthetic */ boolean f15679c;

        C7067e(boolean z, C7887p pVar) {
            this.f15679c = z;
            this.f15678U = pVar;
        }

        /* renamed from: a */
        public final C7887p apply(Paywall paywall) {
            if (this.f15679c) {
                return new C7891d(C13173j0.m40350a());
            }
            return this.f15678U;
        }
    }

    /* renamed from: com.bamtechmedia.dominguez.purchase.q$f */
    /* compiled from: PaywallRepositoryImpl.kt */
    static final class C7068f<T> implements Consumer<C7887p> {

        /* renamed from: c */
        final /* synthetic */ C7062q f15680c;

        C7068f(C7062q qVar) {
            this.f15680c = qVar;
        }

        /* renamed from: a */
        public final void accept(C7887p pVar) {
        }
    }

    /* renamed from: com.bamtechmedia.dominguez.purchase.q$g */
    /* compiled from: PaywallRepositoryImpl.kt */
    static final class C7069g<T> implements Consumer<Disposable> {

        /* renamed from: c */
        final /* synthetic */ C7062q f15681c;

        C7069g(C7062q qVar) {
            this.f15681c = qVar;
        }

        /* renamed from: a */
        public final void accept(Disposable disposable) {
            this.f15681c.f15670h.start();
        }
    }

    /* renamed from: com.bamtechmedia.dominguez.purchase.q$h */
    /* compiled from: PaywallRepositoryImpl.kt */
    static final class C7070h<T, R> implements Function<T, SingleSource<? extends R>> {

        /* renamed from: c */
        final /* synthetic */ C7062q f15682c;

        C7070h(C7062q qVar) {
            this.f15682c = qVar;
        }

        /* renamed from: a */
        public final Single<C7887p> apply(C7887p pVar) {
            return this.f15682c.m21416a(pVar);
        }
    }

    /* renamed from: com.bamtechmedia.dominguez.purchase.q$i */
    /* compiled from: PaywallRepositoryImpl.kt */
    static final class C7071i<T, R> implements Function<T, R> {

        /* renamed from: c */
        final /* synthetic */ C7062q f15683c;

        C7071i(C7062q qVar) {
            this.f15683c = qVar;
        }

        /* renamed from: a */
        public final C7887p mo19854a(C7887p pVar) {
            this.f15683c.m21426c(pVar);
            return pVar;
        }

        public /* bridge */ /* synthetic */ Object apply(Object obj) {
            C7887p pVar = (C7887p) obj;
            mo19854a(pVar);
            return pVar;
        }
    }

    /* renamed from: com.bamtechmedia.dominguez.purchase.q$j */
    /* compiled from: PaywallRepositoryImpl.kt */
    static final class C7072j<T> implements C11952h<C7887p> {

        /* renamed from: c */
        public static final C7072j f15684c = new C7072j();

        C7072j() {
        }

        /* renamed from: a */
        public final boolean test(C7887p pVar) {
            return pVar instanceof C7891d;
        }
    }

    /* renamed from: com.bamtechmedia.dominguez.purchase.q$k */
    /* compiled from: PaywallRepositoryImpl.kt */
    static final class C7073k<T> implements C11952h<C7887p> {

        /* renamed from: c */
        final /* synthetic */ C7062q f15685c;

        C7073k(C7062q qVar) {
            this.f15685c = qVar;
        }

        /* renamed from: a */
        public final boolean test(C7887p pVar) {
            return this.f15685c.mo19844b() != null;
        }
    }

    /* renamed from: com.bamtechmedia.dominguez.purchase.q$l */
    /* compiled from: PaywallRepositoryImpl.kt */
    static final class C7074l<T, R> implements Function<T, R> {

        /* renamed from: c */
        final /* synthetic */ C7062q f15686c;

        C7074l(C7062q qVar) {
            this.f15686c = qVar;
        }

        /* renamed from: a */
        public final List<C7823d> apply(C7887p pVar) {
            return this.f15686c.m21418a((C7891d) pVar);
        }
    }

    /* renamed from: com.bamtechmedia.dominguez.purchase.q$m */
    /* compiled from: PaywallRepositoryImpl.kt */
    static final class C7075m<T> implements Consumer<List<? extends C7823d>> {

        /* renamed from: c */
        final /* synthetic */ C7062q f15687c;

        C7075m(C7062q qVar) {
            this.f15687c = qVar;
        }

        /* renamed from: a */
        public final void accept(List<? extends C7823d> list) {
            this.f15687c.mo19843a(list);
        }
    }

    /* renamed from: com.bamtechmedia.dominguez.purchase.q$n */
    /* compiled from: PaywallRepositoryImpl.kt */
    static final class C7076n<T, R> implements Function<T, R> {

        /* renamed from: c */
        final /* synthetic */ C7062q f15688c;

        C7076n(C7062q qVar) {
            this.f15688c = qVar;
        }

        /* renamed from: a */
        public final C7821b apply(List<? extends C7823d> list) {
            Paywall b = this.f15688c.mo19844b();
            if (b != null) {
                return new C7821b(list, b);
            }
            C12880j.m40220a();
            throw null;
        }
    }

    /* renamed from: com.bamtechmedia.dominguez.purchase.q$o */
    /* compiled from: PaywallRepositoryImpl.kt */
    static final class C7077o<T> implements Consumer<Throwable> {

        /* renamed from: c */
        public static final C7077o f15689c = new C7077o();

        C7077o() {
        }

        /* renamed from: a */
        public final void accept(Throwable th) {
            C14100a.m44527b(th);
        }
    }

    /* renamed from: com.bamtechmedia.dominguez.purchase.q$p */
    /* compiled from: PaywallRepositoryImpl.kt */
    static final class C7078p<T, R> implements Function<Throwable, SingleSource<? extends C7820a>> {

        /* renamed from: c */
        final /* synthetic */ C7062q f15690c;

        C7078p(C7062q qVar) {
            this.f15690c = qVar;
        }

        /* renamed from: a */
        public final Single<C7820a> apply(Throwable th) {
            C6261a aVar;
            if (th instanceof C6261a) {
                aVar = (C6261a) th;
            } else if (!(th instanceof TimeoutException) && !(th instanceof NetworkException)) {
                aVar = this.f15690c.m21411a((PaywallError) C6257f.f14296a);
            } else {
                aVar = this.f15690c.m21411a((PaywallError) C6253b.f14292a);
            }
            return Single.m38395a((Throwable) aVar);
        }
    }

    /* renamed from: com.bamtechmedia.dominguez.purchase.q$q */
    /* compiled from: PaywallRepositoryImpl.kt */
    static final class C7079q<T, R> implements Function<Paywall, CompletableSource> {

        /* renamed from: c */
        final /* synthetic */ C7062q f15691c;

        C7079q(C7062q qVar) {
            this.f15691c = qVar;
        }

        /* renamed from: a */
        public final CompletableSource apply(Paywall paywall) {
            if (this.f15691c.m21423b(paywall)) {
                return Completable.m38169h();
            }
            return Completable.m38170i();
        }
    }

    public C7062q(PaywallApi paywallApi, C7873f fVar, C11969r rVar, C11969r rVar2, C7900q qVar, C7835b bVar, boolean z) {
        this.f15665c = paywallApi;
        this.f15666d = fVar;
        this.f15667e = rVar;
        this.f15668f = rVar2;
        this.f15669g = qVar;
        this.f15670h = bVar;
        this.f15671i = z;
    }

    /* renamed from: c */
    private final Single<C7887p> m21427c() {
        Single<C7887p> d = this.f15669g.mo20744b().mo30184d((Consumer<? super T>) new C7068f<Object>(this)).mo30188e((Consumer<? super Disposable>) new C7069g<Object>(this)).mo30191f((Function<? super T, ? extends SingleSource<? extends R>>) new C7070h<Object,Object>(this)).mo30193g(new C7071i(this)).mo30150a((C11952h<? super T>) C7072j.f15684c).mo30150a((C11952h<? super T>) new C7073k<Object>(this)).mo30186d();
        C12880j.m40222a((Object) d, "paywallServicesInteracto…          .firstOrError()");
        return d;
    }

    /* renamed from: d */
    private final boolean m21429d(C7887p pVar) {
        return (pVar instanceof C7895h) || ((pVar instanceof C7893f) && ((C7893f) pVar).mo20816a());
    }

    /* renamed from: b */
    public final Paywall mo19844b() {
        return this.f15663a;
    }

    /* renamed from: b */
    public void mo19845b(boolean z) {
        if (z) {
            this.f15663a = null;
            this.f15664b = null;
        }
        this.f15669g.mo20745c();
    }

    /* renamed from: a */
    public final void mo19842a(Paywall paywall) {
        this.f15663a = paywall;
    }

    /* renamed from: a */
    public final void mo19843a(List<? extends C7823d> list) {
        this.f15664b = list;
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public final boolean m21423b(Paywall paywall) {
        return paywall.getAccountEntitlementContext() == AccountEntitlementContext.AccountActiveEntitlement;
    }

    /* renamed from: a */
    public Single<C7820a> mo19841a(boolean z) {
        Paywall paywall = this.f15663a;
        List<? extends C7823d> list = this.f15664b;
        if (paywall == null || list == null || z) {
            Single g = C5826e0.m18821a(m21427c(), this.f15666d.mo20796b(), TimeUnit.SECONDS, this.f15668f).mo30233g(new C7074l(this)).mo30227d((Consumer<? super T>) new C7075m<Object>(this)).mo30233g(new C7076n(this));
            C12880j.m40222a((Object) g, "monitorServiceEvents()\n …pl(it, cachedPaywall!!) }");
            Single<C7820a> h = g.mo30218b((Consumer<? super Throwable>) C7077o.f15689c).mo30235h(new C7078p(this));
            C12880j.m40222a((Object) h, "monitorServiceEvents()\n …         })\n            }");
            return h;
        }
        Single<C7820a> b = Single.m38399b(new C7821b(list, paywall));
        C12880j.m40222a((Object) b, "Single.just(DmgzPaywallImpl(products, paywall))");
        return b;
    }

    /* renamed from: b */
    private final boolean m21424b(C7887p pVar) {
        return (pVar instanceof C7889b) && (((C7889b) pVar).mo20804a() instanceof C6257f) && this.f15671i;
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public final C7887p m21426c(C7887p pVar) {
        if (!(pVar instanceof C7889b) || m21424b(pVar)) {
            return pVar;
        }
        throw m21411a(((C7889b) pVar).mo20804a());
    }

    /* renamed from: c */
    private final Single<Paywall> m21428c(boolean z) {
        Single<Paywall> a = this.f15665c.getPaywall().mo30233g(new C7063a(this)).mo30227d((Consumer<? super T>) new C7064b<Object>(this, z)).mo30211a(this.f15667e);
        C12880j.m40222a((Object) a, "paywallApi.getPaywall()\n…veOn(mainThreadScheduler)");
        return a;
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public final Paywall m21425c(Paywall paywall) {
        List<String> a = this.f15666d.mo20795a();
        if (a == null) {
            return paywall;
        }
        ArrayList arrayList = new ArrayList(C13187p.m40525a((Iterable) a, 10));
        for (String product : a) {
            Product product2 = new Product(null, C13185o.m40513a(), null, null, "", ProductType.IAP, product);
            arrayList.add(product2);
        }
        Paywall copy$default = Paywall.copy$default(paywall, null, arrayList, null, 5, null);
        return copy$default != null ? copy$default : paywall;
    }

    /* renamed from: a */
    public Completable mo19840a() {
        Completable b = m21428c(false).mo30217b((Function<? super T, ? extends CompletableSource>) new C7079q<Object,Object>(this));
        C12880j.m40222a((Object) b, "fetchPaywall(false)\n    …ble.never()\n            }");
        return b;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final Single<C7887p> m21416a(C7887p pVar) {
        boolean b = m21424b(pVar);
        if (m21429d(pVar) || b) {
            Single<C7887p> g = m21415a(this, false, 1, null).mo30227d((Consumer<? super T>) new C7065c<Object>(this)).mo30227d((Consumer<? super T>) new C7066d<Object>(this, b)).mo30233g(new C7067e(b, pVar));
            C12880j.m40222a((Object) g, "fetchPaywall()\n         …      }\n                }");
            return g;
        }
        Single<C7887p> b2 = Single.m38399b(pVar);
        C12880j.m40222a((Object) b2, "Single.just(event)");
        return b2;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final List<C7823d> m21418a(C7891d dVar) {
        Paywall paywall = this.f15663a;
        if (paywall != null) {
            List<Product> products = paywall.getProducts();
            if (products != null) {
                ArrayList arrayList = new ArrayList();
                for (Product product : products) {
                    BamnetIAPProduct bamnetIAPProduct = (BamnetIAPProduct) dVar.mo20809a().get(product.getSku());
                    C7822c cVar = bamnetIAPProduct != null ? new C7822c(product, bamnetIAPProduct) : null;
                    if (cVar != null) {
                        arrayList.add(cVar);
                    }
                }
                return arrayList;
            }
        }
        return C13185o.m40513a();
    }

    /* renamed from: a */
    static /* synthetic */ Single m21415a(C7062q qVar, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = true;
        }
        return qVar.m21428c(z);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final C6261a m21411a(PaywallError paywallError) {
        List<? extends C7823d> list = this.f15664b;
        if (list == null) {
            list = C13185o.m40513a();
        }
        Paywall paywall = this.f15663a;
        if (paywall != null) {
            return new C6261a(paywallError, new C7821b(list, paywall));
        }
        return new C6261a(paywallError, null);
    }
}
