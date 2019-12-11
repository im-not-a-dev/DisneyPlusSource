package p163g.p201e.p203b.p319v.p322c0;

import android.app.Activity;
import android.content.Intent;
import com.bamnet.iap.BamnetIAPProduct;
import com.bamnet.iap.BamnetIAPPurchase;
import com.bamnet.iap.C1621a;
import java.util.List;
import p163g.p174d.p175a.p176a.C4796b;
import p163g.p201e.p203b.p319v.C7873f;

/* renamed from: g.e.b.v.c0.a */
/* compiled from: PurchaseDelegateShim.kt */
public final class C7863a implements C4796b {

    /* renamed from: a */
    private final C4796b f16987a;

    /* renamed from: b */
    private final C7873f f16988b;

    public C7863a(C4796b bVar, C7873f fVar) {
        this.f16987a = bVar;
        this.f16988b = fVar;
    }

    /* renamed from: a */
    public void mo16172a() {
        this.f16987a.mo16172a();
    }

    /* renamed from: a */
    public void mo16173a(int i, int i2, Intent intent) {
        this.f16987a.mo16173a(i, i2, intent);
    }

    /* renamed from: a */
    public void mo16174a(Activity activity, BamnetIAPProduct bamnetIAPProduct) {
        if (this.f16988b.mo20801e()) {
            this.f16987a.mo16174a(activity, bamnetIAPProduct);
        } else {
            this.f16987a.mo16176a(bamnetIAPProduct);
        }
    }

    /* renamed from: a */
    public void mo16175a(Activity activity, String str, C1621a aVar) {
        this.f16987a.mo16175a(activity, str, aVar);
    }

    /* renamed from: a */
    public void mo16176a(BamnetIAPProduct bamnetIAPProduct) {
        this.f16987a.mo16176a(bamnetIAPProduct);
    }

    /* renamed from: a */
    public void mo16177a(BamnetIAPPurchase bamnetIAPPurchase) {
        this.f16987a.mo16177a(bamnetIAPPurchase);
    }

    /* renamed from: a */
    public void mo16178a(List<String> list) {
        this.f16987a.mo16178a(list);
    }
}
