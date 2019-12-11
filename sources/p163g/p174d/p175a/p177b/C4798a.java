package p163g.p174d.p175a.p177b;

import com.bamnet.iap.BamnetIAPPurchase;
import com.bamnet.iap.BamnetIAPResult;
import com.bamtech.sdk4.Session;
import com.bamtech.sdk4.purchase.AccessStatus;
import com.bamtech.sdk4.purchase.ClaimException;
import com.bamtech.sdk4.purchase.bamnet.BamnetPurchaseApi;
import java.util.Collections;
import java.util.Map;
import p163g.p174d.p175a.p176a.C4797c;
import p163g.p174d.p175a.p177b.C4812c.C4813a;
import p520io.reactivex.Single;
import p520io.reactivex.SingleSource;
import p520io.reactivex.disposables.CompositeDisposable;
import p520io.reactivex.functions.Consumer;
import p520io.reactivex.functions.Function;
import p520io.reactivex.p525e0.C11934b;
import p520io.reactivex.p527w.p529c.C11992a;
import p686n.p687a.C14100a;

/* renamed from: g.d.a.b.a */
/* compiled from: BamnetRedemptionDelegate */
public class C4798a implements C4815e {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public C4797c f11935a;

    /* renamed from: b */
    private CompositeDisposable f11936b = new CompositeDisposable();
    /* access modifiers changed from: private */

    /* renamed from: c */
    public C4812c f11937c;

    /* renamed from: d */
    BamnetPurchaseApi f11938d;

    /* renamed from: g.d.a.b.a$a */
    /* compiled from: BamnetRedemptionDelegate */
    class C4799a implements Consumer<AccessStatus> {
        C4799a() {
        }

        /* renamed from: a */
        public void accept(AccessStatus accessStatus) {
            C14100a.m44522a("BAM REDEMPTION SUCCESS", new Object[0]);
            if (C4798a.this.f11935a != null) {
                C14100a.m44522a("BAM REDEMPTION SUCCESS: CALLING LISTENER", new Object[0]);
                C4798a.this.f11935a.mo16182b(accessStatus);
            }
        }
    }

    /* renamed from: g.d.a.b.a$b */
    /* compiled from: BamnetRedemptionDelegate */
    class C4800b implements Consumer<Throwable> {
        C4800b() {
        }

        /* renamed from: a */
        public void accept(Throwable th) {
            C14100a.m44522a("BAM REDEMPTION ERROR", new Object[0]);
            if (C4798a.this.f11935a != null) {
                C14100a.m44522a("BAM REDEMPTION ERROR: CALLING ERROR", new Object[0]);
                C4798a.this.f11935a.mo16180a(th);
            }
        }
    }

    /* renamed from: g.d.a.b.a$c */
    /* compiled from: BamnetRedemptionDelegate */
    class C4801c implements Function<AccessStatus, SingleSource<AccessStatus>> {

        /* renamed from: U */
        final /* synthetic */ BamnetIAPPurchase f11941U;

        /* renamed from: c */
        final /* synthetic */ BamnetIAPResult f11943c;

        C4801c(BamnetIAPResult bamnetIAPResult, BamnetIAPPurchase bamnetIAPPurchase) {
            this.f11943c = bamnetIAPResult;
            this.f11941U = bamnetIAPPurchase;
        }

        /* renamed from: a */
        public SingleSource<AccessStatus> apply(AccessStatus accessStatus) {
            if (accessStatus.isTemporary()) {
                return C4798a.this.f11937c.mo16197a(this.f11943c, this.f11941U).mo30045a(accessStatus);
            }
            return Single.m38399b(accessStatus);
        }
    }

    /* renamed from: g.d.a.b.a$d */
    /* compiled from: BamnetRedemptionDelegate */
    class C4802d implements Consumer<C4813a> {
        C4802d() {
        }

        /* renamed from: a */
        public void accept(C4813a aVar) {
            C14100a.m44522a("Successfully restored receipt: %s", aVar.toString());
            C4798a.this.mo16186a(aVar.f11961a, Collections.singletonMap(aVar.f11962b.mo7210e(), aVar.f11962b), true);
        }
    }

    /* renamed from: g.d.a.b.a$e */
    /* compiled from: BamnetRedemptionDelegate */
    class C4803e implements Consumer<Throwable> {
        C4803e() {
        }

        /* renamed from: a */
        public void accept(Throwable th) {
            C14100a.m44528b(th, "Error fetching receipt.", new Object[0]);
            C4798a.this.f11935a.mo16181a(th, true);
        }
    }

    /* renamed from: g.d.a.b.a$f */
    /* compiled from: BamnetRedemptionDelegate */
    class C4804f implements Consumer<AccessStatus> {

        /* renamed from: c */
        final /* synthetic */ boolean f11947c;

        C4804f(boolean z) {
            this.f11947c = z;
        }

        /* renamed from: a */
        public void accept(AccessStatus accessStatus) {
            C14100a.m44522a("BAM RESTORE SUCCESS", new Object[0]);
            if (C4798a.this.f11935a != null) {
                C14100a.m44522a("BAM RESTORE SUCCESS: CALLING LISTENER", new Object[0]);
                C4798a.this.f11935a.mo16179a(accessStatus, this.f11947c);
            }
        }
    }

    /* renamed from: g.d.a.b.a$g */
    /* compiled from: BamnetRedemptionDelegate */
    class C4805g implements Consumer<Throwable> {

        /* renamed from: c */
        final /* synthetic */ boolean f11949c;

        C4805g(boolean z) {
            this.f11949c = z;
        }

        /* renamed from: a */
        public void accept(Throwable th) {
            if (C4798a.this.f11935a != null) {
                C14100a.m44522a("BAM RESTORE ERROR: CALLING LISTENER", new Object[0]);
                C4798a.this.f11935a.mo16181a(th, this.f11949c);
            }
        }
    }

    /* renamed from: g.d.a.b.a$h */
    /* compiled from: BamnetRedemptionDelegate */
    class C4806h implements Function<AccessStatus, SingleSource<AccessStatus>> {
        C4806h() {
        }

        /* renamed from: a */
        public SingleSource<AccessStatus> apply(AccessStatus accessStatus) {
            if (accessStatus.isTemporary()) {
                return Single.m38399b(accessStatus);
            }
            C14100a.m44522a("No temp access. Clearing receipt if stored.", new Object[0]);
            return C4798a.this.f11937c.mo16196a().mo30045a(accessStatus);
        }
    }

    public C4798a(Session session, C4812c cVar) {
        this.f11938d = (BamnetPurchaseApi) session.getPluginApi(BamnetPurchaseApi.class);
        this.f11937c = cVar;
    }

    /* renamed from: a */
    public void mo16184a(BamnetIAPResult bamnetIAPResult, BamnetIAPPurchase bamnetIAPPurchase) {
        try {
            C14100a.m44522a("ACTIVATING PURCHASE", new Object[0]);
            this.f11936b.mo30250b(this.f11938d.redeem(bamnetIAPResult, bamnetIAPPurchase).mo30208a((Function<? super T, ? extends SingleSource<? extends R>>) new C4801c<Object,Object>(bamnetIAPResult, bamnetIAPPurchase)).mo30220b(C11934b.m38500b()).mo30211a(C11992a.m38600a()).mo30214a((Consumer<? super T>) new C4799a<Object>(), (Consumer<? super Throwable>) new C4800b<Object>()));
        } catch (ClaimException e) {
            C14100a.m44528b(e, "SDK Redemption Failed", new Object[0]);
        } catch (NullPointerException e2) {
            C14100a.m44528b(e2, "SDK Session is null", new Object[0]);
        } catch (Exception e3) {
            C14100a.m44528b(e3, "SDK Configuration Failed", new Object[0]);
        }
    }

    /* renamed from: a */
    public void mo16183a() {
        this.f11936b.mo30250b(this.f11937c.mo16198b().mo30119b(C11934b.m38500b()).mo30107a(C11992a.m38600a()).mo30110a((Consumer<? super T>) new C4802d<Object>(), (Consumer<? super Throwable>) new C4803e<Object>()));
    }

    /* renamed from: a */
    public void mo16185a(BamnetIAPResult bamnetIAPResult, Map<String, BamnetIAPPurchase> map) {
        mo16186a(bamnetIAPResult, map, false);
    }

    /* renamed from: a */
    public void mo16187a(C4797c cVar) {
        this.f11935a = cVar;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo16186a(BamnetIAPResult bamnetIAPResult, Map<String, BamnetIAPPurchase> map, boolean z) {
        try {
            this.f11936b.mo30250b(this.f11938d.restore(bamnetIAPResult, map).mo30208a((Function<? super T, ? extends SingleSource<? extends R>>) new C4806h<Object,Object>()).mo30220b(C11934b.m38500b()).mo30211a(C11992a.m38600a()).mo30214a((Consumer<? super T>) new C4804f<Object>(z), (Consumer<? super Throwable>) new C4805g<Object>(z)));
        } catch (ClaimException e) {
            C14100a.m44528b(e, "SDK Restore Failed", new Object[0]);
        } catch (NullPointerException e2) {
            C14100a.m44528b(e2, "SDK Session is null", new Object[0]);
        } catch (Exception e3) {
            C14100a.m44528b(e3, "SDK Configuration Failed", new Object[0]);
        }
    }
}
