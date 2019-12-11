package com.bamtech.sdk4.account;

import com.bamtech.core.annotations.android.DontObfuscate;
import java.util.List;
import kotlin.Metadata;

@DontObfuscate
@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001R\u0016\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u0018\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bX¦\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000b¨\u0006\f"}, mo31007d2 = {"Lcom/bamtech/sdk4/account/Account;", "", "accountId", "", "Lcom/bamtech/sdk4/account/AccountId;", "getAccountId", "()Ljava/lang/String;", "identities", "", "Lcom/bamtech/sdk4/account/AccountIdentity;", "getIdentities", "()Ljava/util/List;", "extension-account"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* compiled from: Account.kt */
public interface Account {
    String getAccountId();

    List<AccountIdentity> getIdentities();
}
