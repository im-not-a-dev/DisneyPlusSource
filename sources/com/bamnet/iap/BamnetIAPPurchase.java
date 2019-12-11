package com.bamnet.iap;

import com.bamnet.iap.BamnetIAPProduct.BamnetIAPProductType;
import com.bamnet.iap.Market.MarketType;
import java.io.Serializable;
import org.json.JSONObject;

public abstract class BamnetIAPPurchase implements Serializable {

    /* renamed from: U */
    private BamnetIAPProductType f5731U;

    /* renamed from: V */
    private String f5732V;

    /* renamed from: W */
    private String f5733W;

    /* renamed from: c */
    private MarketType f5734c;

    public BamnetIAPPurchase(MarketType marketType) {
        this.f5734c = marketType;
    }

    /* renamed from: a */
    public void mo7204a(BamnetIAPProductType bamnetIAPProductType) {
        this.f5731U = bamnetIAPProductType;
    }

    /* renamed from: b */
    public MarketType mo7206b() {
        return this.f5734c;
    }

    /* renamed from: c */
    public String mo7208c() {
        return this.f5733W;
    }

    /* renamed from: d */
    public abstract JSONObject mo7209d();

    /* renamed from: e */
    public String mo7210e() {
        return this.f5732V;
    }

    /* renamed from: a */
    public BamnetIAPProductType mo7203a() {
        return this.f5731U;
    }

    /* renamed from: b */
    public void mo7207b(String str) {
        this.f5732V = str;
    }

    /* renamed from: a */
    public void mo7205a(String str) {
        this.f5733W = str;
    }
}
