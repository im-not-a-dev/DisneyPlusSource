package p163g.p174d.p175a.p177b;

import com.bamnet.iap.BamnetIAPPurchase;
import p163g.p449j.p487c.C11547f;
import p163g.p449j.p487c.C11571v;
import p163g.p449j.p487c.C11573w;
import p163g.p449j.p487c.p493z.C11689a;

/* renamed from: g.d.a.b.d */
/* compiled from: ReceiptTypeAdapterFactory */
public class C4814d implements C11573w {

    /* renamed from: c */
    private final Class<? extends BamnetIAPPurchase> f11963c;

    public C4814d(Class<? extends BamnetIAPPurchase> cls) {
        this.f11963c = cls;
    }

    /* renamed from: a */
    public <T> C11571v<T> mo16202a(C11547f fVar, C11689a<T> aVar) {
        if (aVar.mo29701a() == BamnetIAPPurchase.class) {
            return fVar.mo29511a(this.f11963c);
        }
        return null;
    }
}
