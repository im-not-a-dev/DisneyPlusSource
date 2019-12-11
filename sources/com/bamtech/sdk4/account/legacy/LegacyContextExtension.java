package com.bamtech.sdk4.account.legacy;

import com.bamtech.sdk4.plugin.Extension;
import com.bamtech.sdk4.token.AccessContext;
import kotlin.Metadata;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u001a\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0005H&J\u0018\u0010\u0007\u001a\u00020\b2\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0005H&¨\u0006\t"}, mo31007d2 = {"Lcom/bamtech/sdk4/account/legacy/LegacyContextExtension;", "Lcom/bamtech/sdk4/plugin/Extension;", "getLegacyContext", "Lcom/bamtech/sdk4/token/AccessContext;", "clientId", "", "environment", "removeLegacyContext", "", "extension-legacy"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* compiled from: LegacyAccountExtension.kt */
public interface LegacyContextExtension extends Extension {
    AccessContext getLegacyContext(String str, String str2);

    void removeLegacyContext(String str, String str2);
}
