package com.bamnet.iap.p035c;

import android.app.Activity;
import android.content.Intent;
import com.bamnet.iap.BamnetIAPProduct;
import com.bamnet.iap.BamnetIAPProduct.BamnetIAPProductType;
import com.bamnet.iap.BamnetIAPProduct.C1620a;
import com.bamnet.iap.BamnetIAPPurchase;
import com.bamnet.iap.BamnetIAPResult;
import com.bamnet.iap.C1621a;
import com.bamnet.iap.Market;
import com.bamnet.iap.p035c.p037d.C1662d;
import com.bamnet.iap.p035c.p037d.C1662d.C1668d;
import com.bamnet.iap.p035c.p037d.C1662d.C1669e;
import com.bamnet.iap.p035c.p037d.C1662d.C1670f;
import com.bamnet.iap.p035c.p037d.C1671e;
import com.bamnet.iap.p035c.p037d.C1672f;
import com.bamnet.iap.p035c.p037d.C1673g;
import com.bamnet.iap.p035c.p037d.C1675i;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import p686n.p687a.C14100a;

@Deprecated
/* renamed from: com.bamnet.iap.c.b */
/* compiled from: GoogleMarket */
public class C1625b implements Market, C1669e, C1670f, C1668d {

    /* renamed from: a */
    C1662d f5744a;

    /* renamed from: b */
    C1621a f5745b;

    /* renamed from: c */
    private Activity f5746c;

    /* renamed from: a */
    public void mo7218a(Activity activity, String str, C1621a aVar) {
        this.f5746c = activity;
        this.f5745b = aVar;
        if (this.f5744a == null) {
            this.f5744a = new C1662d(activity, null);
        }
        this.f5744a.mo7305a((C1669e) this);
    }

    /* renamed from: a */
    public void mo7219a(BamnetIAPPurchase bamnetIAPPurchase) {
    }

    /* renamed from: b */
    public void mo7252b(C1671e eVar, C1672f fVar) {
        BamnetIAPResult bamnetIAPResult;
        if (eVar.mo7324c()) {
            bamnetIAPResult = new BamnetIAPResult(0, eVar.mo7322a());
        } else {
            bamnetIAPResult = new BamnetIAPResult(2, eVar.mo7322a());
        }
        C1621a aVar = this.f5745b;
        if (aVar != null) {
            aVar.mo7228b(bamnetIAPResult, mo7248a(fVar));
        }
    }

    public void cleanup() {
        C1662d dVar = this.f5744a;
        if (dVar != null) {
            dVar.mo7310b();
        }
        this.f5746c = null;
        this.f5745b = null;
        this.f5744a = null;
    }

    /* renamed from: a */
    public void mo7249a(C1671e eVar) {
        BamnetIAPResult bamnetIAPResult;
        String str = "set up complete";
        if (!eVar.mo7324c()) {
            C14100a.m44522a("In-app Billing setup failed: %s", eVar.toString());
            bamnetIAPResult = new BamnetIAPResult(1, str);
        } else {
            C14100a.m44522a("In-app Billing is set up OK", new Object[0]);
            bamnetIAPResult = new BamnetIAPResult(0, str);
        }
        this.f5745b.mo7224a(bamnetIAPResult);
    }

    /* renamed from: a */
    public void mo7221a(List<String> list) {
        this.f5744a.mo7307a((C1670f) this, list);
    }

    /* renamed from: a */
    public void mo7216a() {
        this.f5744a.mo7306a((C1670f) this);
    }

    /* renamed from: a */
    public void mo7220a(String str, BamnetIAPProductType bamnetIAPProductType, int i, String str2) {
        this.f5744a.mo7304a(this.f5746c, str, bamnetIAPProductType == BamnetIAPProductType.SUBSCRIPTION ? "subs" : "inapp", i, this, str2);
    }

    /* renamed from: a */
    public void mo7217a(Activity activity, String str) {
        throw new IllegalStateException("Since you are using the old implementation of GoogleMarket, you must use the other purchase method.");
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public C1624a mo7247a(C1673g gVar) {
        if (gVar == null) {
            return null;
        }
        C1624a aVar = new C1624a();
        aVar.mo7238d(gVar.mo7334d());
        aVar.mo7237c(gVar.mo7331a());
        aVar.mo7204a(mo7245a(gVar.mo7332b()));
        aVar.mo7205a(gVar.mo7333c());
        aVar.mo7239e(gVar.mo7335e());
        aVar.mo7207b(gVar.mo7336f());
        aVar.mo7241f(gVar.mo7337g());
        return aVar;
    }

    /* renamed from: a */
    public boolean mo7222a(int i, int i2, Intent intent) {
        return this.f5744a.mo7309a(i, i2, intent);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public Map<String, BamnetIAPProduct> mo7248a(C1672f fVar) {
        HashMap hashMap = new HashMap();
        if (fVar != null) {
            for (C1675i iVar : fVar.mo7326a()) {
                hashMap.put(iVar.mo7344f(), mo7246a(iVar));
            }
        }
        return hashMap;
    }

    /* renamed from: a */
    public BamnetIAPProductType mo7245a(String str) {
        if ("inapp".equals(str)) {
            return BamnetIAPProductType.ENTITLED;
        }
        if ("subs".equals(str)) {
            return BamnetIAPProductType.SUBSCRIPTION;
        }
        return BamnetIAPProductType.UNKNOWN;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public BamnetIAPProduct mo7246a(C1675i iVar) {
        C1620a aVar = new C1620a(iVar.mo7344f());
        aVar.mo7194a(iVar.mo7339a());
        aVar.mo7202h(iVar.mo7346h());
        aVar.mo7197c(null);
        aVar.mo7198d(iVar.mo7341c());
        aVar.mo7192a(mo7245a(iVar.mo7347i()));
        aVar.mo7193a(iVar.mo7342d());
        aVar.mo7200f(iVar.mo7343e());
        aVar.mo7201g(iVar.mo7345g());
        aVar.mo7196b(iVar.mo7340b());
        return aVar.mo7195a();
    }

    /* renamed from: a */
    public void mo7250a(C1671e eVar, C1672f fVar) {
        BamnetIAPResult bamnetIAPResult;
        HashMap hashMap = new HashMap();
        if (fVar != null) {
            for (C1673g a : fVar.mo7330b()) {
                C1624a a2 = mo7247a(a);
                hashMap.put(a2.mo7210e(), a2);
            }
        }
        if (eVar.mo7324c()) {
            bamnetIAPResult = new BamnetIAPResult(0, eVar.mo7322a());
        } else {
            bamnetIAPResult = new BamnetIAPResult(3, eVar.mo7322a());
        }
        C1621a aVar = this.f5745b;
        if (aVar != null) {
            aVar.mo7227a(bamnetIAPResult, (Map<String, BamnetIAPPurchase>) hashMap);
        }
    }

    /* renamed from: a */
    public void mo7251a(C1671e eVar, C1673g gVar) {
        int b = eVar.mo7323b();
        int i = 9;
        C1624a aVar = null;
        if (b != -1005) {
            if (b == 0) {
                aVar = mo7247a(gVar);
                i = 0;
            } else if (b == 7) {
                C14100a.m44529c("onPurchaseResponse: already purchased, you should verify the subscription purchase on your side and make sure the purchase was granted to customer", new Object[0]);
                aVar = mo7247a(gVar);
                i = 7;
            } else if (b != 9) {
                C14100a.m44522a("onPurchaseResponse: Error in default case with response code: %s", Integer.valueOf(eVar.mo7323b()));
                i = 6;
            }
            this.f5745b.mo7225a(new BamnetIAPResult(i, eVar.mo7322a()), (BamnetIAPPurchase) aVar);
        }
        C14100a.m44522a("onPurchaseResponse: user cancelled", new Object[0]);
        this.f5745b.mo7225a(new BamnetIAPResult(i, eVar.mo7322a()), (BamnetIAPPurchase) aVar);
    }
}
