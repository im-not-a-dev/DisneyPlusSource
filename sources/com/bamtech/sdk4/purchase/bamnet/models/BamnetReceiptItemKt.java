package com.bamtech.sdk4.purchase.bamnet.models;

import com.bamtech.sdk4.purchase.bamnet.BamnetClaim;
import com.bamtech.sdk4.purchase.bamnet.BamnetClaimException;
import kotlin.Metadata;
import kotlin.jvm.internal.C12880j;
import org.json.JSONObject;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0014\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0001H\u0000¨\u0006\u0004"}, mo31007d2 = {"safeGetString", "", "Lorg/json/JSONObject;", "key", "plugin-iap-bamnet_release"}, mo31008k = 2, mo31009mv = {1, 1, 15})
/* compiled from: BamnetReceiptItem.kt */
public final class BamnetReceiptItemKt {
    public static final String safeGetString(JSONObject jSONObject, String str) {
        if (jSONObject.has(str)) {
            String string = jSONObject.getString(str);
            C12880j.m40222a((Object) string, "getString(key)");
            return string;
        }
        throw new BamnetClaimException(BamnetClaim.Companion.getMISSING_DATA());
    }
}
