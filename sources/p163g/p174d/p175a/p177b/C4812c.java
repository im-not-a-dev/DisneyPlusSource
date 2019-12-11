package p163g.p174d.p175a.p177b;

import com.bamnet.iap.BamnetIAPPurchase;
import com.bamnet.iap.BamnetIAPResult;
import p520io.reactivex.Completable;
import p520io.reactivex.Maybe;

/* renamed from: g.d.a.b.c */
/* compiled from: ReceiptCache */
public interface C4812c {

    /* renamed from: g.d.a.b.c$a */
    /* compiled from: ReceiptCache */
    public static class C4813a {

        /* renamed from: a */
        public final BamnetIAPResult f11961a;

        /* renamed from: b */
        public final BamnetIAPPurchase f11962b;

        public C4813a(BamnetIAPResult bamnetIAPResult, BamnetIAPPurchase bamnetIAPPurchase) {
            this.f11961a = bamnetIAPResult;
            this.f11962b = bamnetIAPPurchase;
        }
    }

    /* renamed from: a */
    Completable mo16196a();

    /* renamed from: a */
    Completable mo16197a(BamnetIAPResult bamnetIAPResult, BamnetIAPPurchase bamnetIAPPurchase);

    /* renamed from: b */
    Maybe<C4813a> mo16198b();
}
