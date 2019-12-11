package com.bamtech.sdk4.purchase.bamnet;

import com.bamnet.iap.BamnetIAPPurchase;
import com.bamnet.iap.BamnetIAPResult;
import com.bamtech.sdk4.purchase.bamnet.models.BamnetReceiptClaimBody;
import java.util.Map;
import kotlin.Metadata;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005¢\u0006\u0002\u0010\bJ\b\u0010\r\u001a\u00020\u000eH\u0016J\b\u0010\u000f\u001a\u00020\u0006H\u0016R\u001d\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0010"}, mo31007d2 = {"Lcom/bamtech/sdk4/purchase/bamnet/BamnetRestoreClaim;", "Lcom/bamtech/sdk4/purchase/bamnet/BamnetClaim;", "result", "Lcom/bamnet/iap/BamnetIAPResult;", "fromPurchases", "", "", "Lcom/bamnet/iap/BamnetIAPPurchase;", "(Lcom/bamnet/iap/BamnetIAPResult;Ljava/util/Map;)V", "getFromPurchases", "()Ljava/util/Map;", "getResult", "()Lcom/bamnet/iap/BamnetIAPResult;", "getClaimBody", "Lcom/bamtech/sdk4/purchase/bamnet/models/BamnetReceiptClaimBody;", "getStore", "plugin-iap-bamnet_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* compiled from: BamnetClaim.kt */
public final class BamnetRestoreClaim extends BamnetClaim {
    private final Map<String, BamnetIAPPurchase> fromPurchases;
    private final BamnetIAPResult result;

    public BamnetRestoreClaim(BamnetIAPResult bamnetIAPResult, Map<String, ? extends BamnetIAPPurchase> map) {
        this.result = bamnetIAPResult;
        this.fromPurchases = map;
    }

    public String getStore() {
        if (!this.fromPurchases.isEmpty()) {
            return getStore((BamnetIAPPurchase) C13199w.m40588f((Iterable) this.fromPurchases.values()));
        }
        throw new BamnetClaimException(BamnetClaim.Companion.getMISSING_PURCHASES());
    }

    public BamnetReceiptClaimBody getClaimBody() {
        if (!this.result.mo7213c()) {
            return getClaimFactory().create(C13199w.m40606q(this.fromPurchases.values()));
        }
        throw new BamnetClaimException(BamnetClaim.Companion.getFAILED_RESPONSE());
    }
}
