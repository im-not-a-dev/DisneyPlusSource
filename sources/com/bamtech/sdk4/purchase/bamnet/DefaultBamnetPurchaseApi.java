package com.bamtech.sdk4.purchase.bamnet;

import com.bamnet.iap.BamnetIAPPurchase;
import com.bamnet.iap.BamnetIAPResult;
import com.bamtech.sdk4.purchase.AccessStatus;
import com.bamtech.sdk4.purchase.PurchaseExtension;
import java.util.Map;
import kotlin.Metadata;
import p520io.reactivex.Single;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u001e\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0016J*\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\b\u001a\u00020\t2\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u000b0\u000eH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0010"}, mo31007d2 = {"Lcom/bamtech/sdk4/purchase/bamnet/DefaultBamnetPurchaseApi;", "Lcom/bamtech/sdk4/purchase/bamnet/BamnetPurchaseApi;", "extension", "Lcom/bamtech/sdk4/purchase/PurchaseExtension;", "(Lcom/bamtech/sdk4/purchase/PurchaseExtension;)V", "redeem", "Lio/reactivex/Single;", "Lcom/bamtech/sdk4/purchase/AccessStatus;", "result", "Lcom/bamnet/iap/BamnetIAPResult;", "purchase", "Lcom/bamnet/iap/BamnetIAPPurchase;", "restore", "purchases", "", "", "plugin-iap-bamnet_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* compiled from: BamnetPurchaseApi.kt */
public final class DefaultBamnetPurchaseApi implements BamnetPurchaseApi {
    private final PurchaseExtension extension;

    public DefaultBamnetPurchaseApi(PurchaseExtension purchaseExtension) {
        this.extension = purchaseExtension;
    }

    public Single<AccessStatus> redeem(BamnetIAPResult bamnetIAPResult, BamnetIAPPurchase bamnetIAPPurchase) {
        return this.extension.redeem(new BamnetRedeemClaim(bamnetIAPResult, bamnetIAPPurchase));
    }

    public Single<AccessStatus> restore(BamnetIAPResult bamnetIAPResult, Map<String, ? extends BamnetIAPPurchase> map) {
        return this.extension.restore(new BamnetRestoreClaim(bamnetIAPResult, map));
    }
}
