package com.bamtech.sdk4.account.legacy;

import com.bamtech.sdk4.token.AccessContext;
import kotlin.Metadata;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u001a\u0010\u0003\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J\u0018\u0010\b\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¨\u0006\n"}, mo31007d2 = {"Lcom/bamtech/sdk4/account/legacy/NullLegacyContextExtension;", "Lcom/bamtech/sdk4/account/legacy/LegacyContextExtension;", "()V", "getLegacyContext", "Lcom/bamtech/sdk4/token/AccessContext;", "clientId", "", "environment", "removeLegacyContext", "", "extension-legacy"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* compiled from: NullLegacyContextExtension.kt */
public final class NullLegacyContextExtension implements LegacyContextExtension {
    public AccessContext getLegacyContext(String str, String str2) {
        return null;
    }

    public void removeLegacyContext(String str, String str2) {
    }
}
