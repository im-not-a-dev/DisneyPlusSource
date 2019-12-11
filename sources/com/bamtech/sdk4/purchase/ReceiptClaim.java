package com.bamtech.sdk4.purchase;

import com.bamtech.core.annotations.android.DontObfuscate;
import kotlin.Metadata;

@DontObfuscate
@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\bg\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0006"}, mo31007d2 = {"Lcom/bamtech/sdk4/purchase/ReceiptClaim;", "", "getClaimBody", "Lcom/bamtech/sdk4/purchase/ReceiptClaimBody;", "getStore", "", "extension-iap"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* compiled from: ReceiptClaim.kt */
public interface ReceiptClaim {
    ReceiptClaimBody getClaimBody();

    String getStore();
}
