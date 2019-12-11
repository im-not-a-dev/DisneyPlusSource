package com.bamnet.iap.p035c.p036c;

import android.content.Context;
import com.android.billingclient.api.C1426m;
import com.android.billingclient.api.C1433s;
import com.bamnet.iap.BamnetIAPProduct;
import com.bamnet.iap.BamnetIAPProduct.BamnetIAPProductType;
import com.bamnet.iap.BamnetIAPProduct.C1620a;
import com.bamnet.iap.BamnetIAPPurchase;
import com.bamnet.iap.p035c.C1624a;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.bamnet.iap.c.c.a */
/* compiled from: BillingMapper.kt */
public final class C1626a {
    public C1626a(Context context) {
    }

    /* renamed from: b */
    private final BamnetIAPProductType m7589b(String str) {
        if (Intrinsics.areEqual((Object) str, (Object) "subs")) {
            return BamnetIAPProductType.SUBSCRIPTION;
        }
        return BamnetIAPProductType.ENTITLED;
    }

    /* renamed from: a */
    public final Map<String, BamnetIAPProduct> mo7255a(List<? extends C1433s> list) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (C1433s sVar : list) {
            String g = sVar.mo6534g();
            Intrinsics.checkReturnedValueIsNotNull((Object) g, "it.sku");
            linkedHashMap.put(g, m7588a(sVar));
        }
        return linkedHashMap;
    }

    /* renamed from: a */
    public final Map<String, BamnetIAPPurchase> mo7256a(List<? extends C1426m> list, BamnetIAPProductType bamnetIAPProductType) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (C1426m mVar : list) {
            String h = mVar.mo6520h();
            Intrinsics.checkReturnedValueIsNotNull((Object) h, "it.sku");
            linkedHashMap.put(h, mo7254a(mVar, bamnetIAPProductType));
        }
        return linkedHashMap;
    }

    /* renamed from: a */
    private final BamnetIAPProduct m7588a(C1433s sVar) {
        C1620a aVar = new C1620a(sVar.mo6534g());
        aVar.mo7194a(sVar.mo6527a());
        aVar.mo7197c(null);
        aVar.mo7198d(sVar.mo6530d());
        aVar.mo7193a(Long.valueOf(sVar.mo6531e()));
        aVar.mo7200f(sVar.mo6533f());
        aVar.mo7201g(sVar.mo6537i());
        aVar.mo7202h(sVar.mo6538j());
        String k = sVar.mo6539k();
        Intrinsics.checkReturnedValueIsNotNull((Object) k, "skuDetails.type");
        aVar.mo7192a(m7589b(k));
        aVar.mo7196b(sVar.mo6528b());
        aVar.mo7199e(sVar.mo6529c());
        BamnetIAPProduct a = aVar.mo7195a();
        Intrinsics.checkReturnedValueIsNotNull((Object) a, "BamnetIAPProduct.Builder…\n                .build()");
        return a;
    }

    /* renamed from: a */
    public final BamnetIAPPurchase mo7254a(C1426m mVar, BamnetIAPProductType bamnetIAPProductType) {
        C1624a aVar = new C1624a();
        aVar.mo7238d(mVar.mo6514c());
        aVar.mo7204a(bamnetIAPProductType);
        aVar.mo7205a(mVar.mo6513b());
        aVar.mo7239e(mVar.mo6519g());
        aVar.mo7207b(mVar.mo6520h());
        aVar.mo7241f(mVar.mo6518f());
        aVar.mo7237c(mVar.mo6512a());
        aVar.mo7236a(mVar.mo6522i());
        aVar.mo7235a(mVar.mo6516e());
        aVar.mo7234a(m7587a(mVar.mo6515d()));
        return aVar;
    }

    /* renamed from: a */
    public final BamnetIAPProductType mo7253a(String str) {
        if (Intrinsics.areEqual((Object) "inapp", (Object) str)) {
            return BamnetIAPProductType.ENTITLED;
        }
        if (Intrinsics.areEqual((Object) "subs", (Object) str)) {
            return BamnetIAPProductType.SUBSCRIPTION;
        }
        return BamnetIAPProductType.UNKNOWN;
    }

    /* renamed from: a */
    private final int m7587a(int i) {
        if (i == 0) {
            return 997;
        }
        if (i == 1) {
            return 998;
        }
        if (i == 2) {
            return 999;
        }
        throw new IllegalStateException("Unsuppported purchase state. Please update library.");
    }
}
