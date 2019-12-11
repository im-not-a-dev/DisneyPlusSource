package com.bamnet.iap.p035c.p036c;

import android.app.Activity;
import android.content.Intent;
import androidx.fragment.app.C0532d;
import androidx.lifecycle.C0703a0;
import com.bamnet.iap.BamnetIAPProduct.BamnetIAPProductType;
import com.bamnet.iap.BamnetIAPPurchase;
import com.bamnet.iap.C1621a;
import com.bamnet.iap.C1622b;
import com.bamnet.iap.Market;
import java.util.List;

/* renamed from: com.bamnet.iap.c.c.c */
/* compiled from: GoogleBillingMarket.kt */
public final class C1628c implements Market {

    /* renamed from: a */
    private C1630e f5747a;

    /* renamed from: b */
    private final C1622b f5748b;

    public C1628c(C1622b bVar) {
        this.f5748b = bVar;
    }

    /* renamed from: a */
    public void mo7218a(Activity activity, String str, C1621a aVar) {
        if (activity instanceof C0532d) {
            this.f5747a = (C1630e) C0703a0.m3718a((C0532d) activity).mo4180a(C1630e.class);
            C1630e eVar = this.f5747a;
            if (eVar != null) {
                eVar.mo7263a(this.f5748b);
            }
            C1630e eVar2 = this.f5747a;
            if (eVar2 != null) {
                eVar2.mo7262a(aVar);
                return;
            }
            return;
        }
        throw new IllegalStateException("You must use a FragmentActivity.");
    }

    /* renamed from: a */
    public boolean mo7222a(int i, int i2, Intent intent) {
        return false;
    }

    public void cleanup() {
        C1630e eVar = this.f5747a;
        if (eVar != null) {
            eVar.mo7265z();
        }
    }

    /* renamed from: a */
    public void mo7221a(List<String> list) {
        C1630e eVar = this.f5747a;
        if (eVar != null) {
            eVar.mo7264a(list);
        }
    }

    /* renamed from: a */
    public void mo7216a() {
        C1630e eVar = this.f5747a;
        if (eVar != null) {
            eVar.mo7259C();
        }
    }

    /* renamed from: a */
    public void mo7220a(String str, BamnetIAPProductType bamnetIAPProductType, int i, String str2) {
        throw new IllegalStateException("You must call the purchase method with activity for Google Purchases.");
    }

    /* renamed from: a */
    public void mo7217a(Activity activity, String str) {
        C1630e eVar = this.f5747a;
        if (eVar != null) {
            eVar.mo7260a(activity, str);
        }
    }

    /* renamed from: a */
    public void mo7219a(BamnetIAPPurchase bamnetIAPPurchase) {
        C1630e eVar = this.f5747a;
        if (eVar != null) {
            eVar.mo7261a(bamnetIAPPurchase);
        }
    }
}
