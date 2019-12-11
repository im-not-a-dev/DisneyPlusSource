package com.bamtechmedia.dominguez.purchase;

import android.app.Activity;
import android.content.Intent;
import com.bamnet.iap.BamnetIAPProduct.BamnetIAPProductType;
import com.bamnet.iap.BamnetIAPPurchase;
import com.bamnet.iap.BamnetIAPResult;
import com.bamnet.iap.C1621a;
import com.bamnet.iap.Market;
import java.util.List;

/* renamed from: com.bamtechmedia.dominguez.purchase.h */
/* compiled from: NoOpMarket.kt */
public final class C7050h implements Market {

    /* renamed from: a */
    private C1621a f15655a;

    /* renamed from: a */
    public void mo7218a(Activity activity, String str, C1621a aVar) {
        this.f15655a = aVar;
        aVar.mo7224a(m21385a(this, 0, null, 3, null));
    }

    /* renamed from: a */
    public void mo7219a(BamnetIAPPurchase bamnetIAPPurchase) {
    }

    /* renamed from: a */
    public boolean mo7222a(int i, int i2, Intent intent) {
        return true;
    }

    public void cleanup() {
        this.f15655a = null;
    }

    /* renamed from: a */
    public void mo7221a(List<String> list) {
        C1621a aVar = this.f15655a;
        if (aVar != null) {
            aVar.mo7228b(m21385a(this, 0, null, 3, null), C13173j0.m40350a());
        }
    }

    /* renamed from: a */
    public void mo7220a(String str, BamnetIAPProductType bamnetIAPProductType, int i, String str2) {
        throw new UnsupportedOperationException();
    }

    /* renamed from: a */
    public void mo7217a(Activity activity, String str) {
        throw new UnsupportedOperationException();
    }

    /* renamed from: a */
    public void mo7216a() {
        C1621a aVar = this.f15655a;
        if (aVar != null) {
            aVar.mo7227a(m21385a(this, 0, null, 3, null), C13173j0.m40350a());
        }
    }

    /* renamed from: a */
    static /* synthetic */ BamnetIAPResult m21385a(C7050h hVar, int i, String str, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = 0;
        }
        if ((i2 & 2) != 0) {
            str = "";
        }
        return hVar.m21384a(i, str);
    }

    /* renamed from: a */
    private final BamnetIAPResult m21384a(int i, String str) {
        return new BamnetIAPResult(i, str);
    }
}
