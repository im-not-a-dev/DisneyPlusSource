package com.bamtech.sdk4.purchase.bamnet;

import com.bamnet.iap.BamnetIAPPurchase;
import com.bamnet.iap.BamnetIAPResult;
import com.bamtech.sdk4.purchase.bamnet.models.BamnetReceiptClaimBody;
import kotlin.Metadata;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\b\u0010\u000b\u001a\u00020\fH\u0016J\b\u0010\r\u001a\u00020\u000eH\u0016R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u000f"}, mo31007d2 = {"Lcom/bamtech/sdk4/purchase/bamnet/BamnetRedeemClaim;", "Lcom/bamtech/sdk4/purchase/bamnet/BamnetClaim;", "result", "Lcom/bamnet/iap/BamnetIAPResult;", "fromPurchase", "Lcom/bamnet/iap/BamnetIAPPurchase;", "(Lcom/bamnet/iap/BamnetIAPResult;Lcom/bamnet/iap/BamnetIAPPurchase;)V", "getFromPurchase", "()Lcom/bamnet/iap/BamnetIAPPurchase;", "getResult", "()Lcom/bamnet/iap/BamnetIAPResult;", "getClaimBody", "Lcom/bamtech/sdk4/purchase/bamnet/models/BamnetReceiptClaimBody;", "getStore", "", "plugin-iap-bamnet_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* compiled from: BamnetClaim.kt */
public final class BamnetRedeemClaim extends BamnetClaim {
    private final BamnetIAPPurchase fromPurchase;
    private final BamnetIAPResult result;

    public BamnetRedeemClaim(BamnetIAPResult bamnetIAPResult, BamnetIAPPurchase bamnetIAPPurchase) {
        this.result = bamnetIAPResult;
        this.fromPurchase = bamnetIAPPurchase;
    }

    public String getStore() {
        return getStore(this.fromPurchase);
    }

    public BamnetReceiptClaimBody getClaimBody() {
        if (!this.result.mo7213c()) {
            return getClaimFactory().create(C13185o.m40512a((Object[]) new BamnetIAPPurchase[]{this.fromPurchase}));
        }
        throw new BamnetClaimException(BamnetClaim.Companion.getFAILED_RESPONSE());
    }
}
