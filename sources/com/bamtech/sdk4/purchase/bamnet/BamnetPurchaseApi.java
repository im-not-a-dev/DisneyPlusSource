package com.bamtech.sdk4.purchase.bamnet;

import com.bamnet.iap.BamnetIAPPurchase;
import com.bamnet.iap.BamnetIAPResult;
import com.bamtech.sdk4.plugin.PluginApi;
import com.bamtech.sdk4.purchase.AccessStatus;
import java.util.Map;
import kotlin.Metadata;
import p520io.reactivex.Single;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\bg\u0018\u00002\u00020\u0001J\u001e\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH&J*\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0005\u001a\u00020\u00062\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\b0\u000bH&¨\u0006\r"}, mo31007d2 = {"Lcom/bamtech/sdk4/purchase/bamnet/BamnetPurchaseApi;", "Lcom/bamtech/sdk4/plugin/PluginApi;", "redeem", "Lio/reactivex/Single;", "Lcom/bamtech/sdk4/purchase/AccessStatus;", "result", "Lcom/bamnet/iap/BamnetIAPResult;", "purchase", "Lcom/bamnet/iap/BamnetIAPPurchase;", "restore", "purchases", "", "", "plugin-iap-bamnet_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* compiled from: BamnetPurchaseApi.kt */
public interface BamnetPurchaseApi extends PluginApi {
    Single<AccessStatus> redeem(BamnetIAPResult bamnetIAPResult, BamnetIAPPurchase bamnetIAPPurchase) throws BamnetClaimException;

    Single<AccessStatus> restore(BamnetIAPResult bamnetIAPResult, Map<String, ? extends BamnetIAPPurchase> map) throws BamnetClaimException;
}
