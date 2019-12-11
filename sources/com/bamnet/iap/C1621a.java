package com.bamnet.iap;

import java.util.List;
import java.util.Map;

/* renamed from: com.bamnet.iap.a */
/* compiled from: BamnetIAPListener */
public interface C1621a {
    /* renamed from: a */
    void mo7224a(BamnetIAPResult bamnetIAPResult);

    @Deprecated
    /* renamed from: a */
    void mo7225a(BamnetIAPResult bamnetIAPResult, BamnetIAPPurchase bamnetIAPPurchase);

    /* renamed from: a */
    void mo7226a(BamnetIAPResult bamnetIAPResult, List<BamnetIAPPurchase> list);

    /* renamed from: a */
    void mo7227a(BamnetIAPResult bamnetIAPResult, Map<String, BamnetIAPPurchase> map);

    /* renamed from: b */
    void mo7228b(BamnetIAPResult bamnetIAPResult, Map<String, BamnetIAPProduct> map);
}
