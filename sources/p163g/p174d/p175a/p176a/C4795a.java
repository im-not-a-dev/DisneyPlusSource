package p163g.p174d.p175a.p176a;

import android.app.Activity;
import android.content.Intent;
import android.text.TextUtils;
import com.bamnet.iap.BamnetIAPProduct;
import com.bamnet.iap.BamnetIAPPurchase;
import com.bamnet.iap.C1621a;
import com.bamnet.iap.Market;
import java.util.List;
import p686n.p687a.C14100a;

/* renamed from: g.d.a.a.a */
/* compiled from: BamPurchaseDelegate */
public class C4795a implements C4796b {

    /* renamed from: b */
    private static final String f11933b = "g.d.a.a.a";

    /* renamed from: a */
    private final Market f11934a;

    public C4795a(Market market) {
        this.f11934a = market;
    }

    /* renamed from: a */
    public void mo16175a(Activity activity, String str, C1621a aVar) {
        try {
            this.f11934a.mo7218a(activity, str, aVar);
        } catch (Exception e) {
            C14100a.m44521a(f11933b).mo35671b(e, "Exception during Paywall setup", new Object[0]);
        }
    }

    /* renamed from: a */
    public void mo16178a(List<String> list) {
        C14100a.m44521a(f11933b).mo35666a(f11933b, TextUtils.join("::", list));
        this.f11934a.mo7221a(list);
    }

    /* renamed from: a */
    public void mo16173a(int i, int i2, Intent intent) {
        C14100a.m44521a(f11933b).mo35666a(f11933b, "HANDLING IAP ACTIVITY RESULT");
        this.f11934a.mo7222a(i, i2, intent);
    }

    /* renamed from: a */
    public void mo16176a(BamnetIAPProduct bamnetIAPProduct) {
        try {
            this.f11934a.mo7220a(bamnetIAPProduct.mo7188f(), bamnetIAPProduct.mo7190h(), 1313, "");
        } catch (Exception e) {
            C14100a.m44521a(f11933b).mo35671b(e, "Exception during Purchase", new Object[0]);
        }
    }

    /* renamed from: a */
    public void mo16174a(Activity activity, BamnetIAPProduct bamnetIAPProduct) {
        this.f11934a.mo7217a(activity, bamnetIAPProduct.mo7188f());
    }

    /* renamed from: a */
    public void mo16172a() {
        try {
            this.f11934a.mo7216a();
        } catch (Exception e) {
            C14100a.m44521a(f11933b).mo35671b(e, "Exception during Restore", new Object[0]);
        }
    }

    /* renamed from: a */
    public void mo16177a(BamnetIAPPurchase bamnetIAPPurchase) {
        this.f11934a.mo7219a(bamnetIAPPurchase);
    }
}
