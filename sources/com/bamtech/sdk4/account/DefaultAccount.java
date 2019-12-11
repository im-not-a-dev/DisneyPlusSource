package com.bamtech.sdk4.account;

import com.bamtech.core.annotations.android.DontObfuscate;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@DontObfuscate
@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0007\b\u0010¢\u0006\u0002\u0010\u0002B7\u0012\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\u0014\b\u0002\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u000b0\n¢\u0006\u0002\u0010\fJ\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u000bH\u0002J\b\u0010\u0016\u001a\u00020\u0017H\u0016J\b\u0010\u0018\u001a\u00020\u0004H\u0016R\u0018\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u001d\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u000b0\n¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0019"}, mo31007d2 = {"Lcom/bamtech/sdk4/account/DefaultAccount;", "Lcom/bamtech/sdk4/account/Account;", "()V", "accountId", "", "Lcom/bamtech/sdk4/account/AccountId;", "identities", "", "Lcom/bamtech/sdk4/account/AccountIdentity;", "attributes", "", "", "(Ljava/lang/String;Ljava/util/List;Ljava/util/Map;)V", "getAccountId", "()Ljava/lang/String;", "getAttributes", "()Ljava/util/Map;", "getIdentities", "()Ljava/util/List;", "equals", "", "other", "hashCode", "", "toString", "extension-account"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* compiled from: Account.kt */
public final class DefaultAccount implements Account {
    private final String accountId;
    private final Map<String, Object> attributes;
    private final List<AccountIdentity> identities;

    public DefaultAccount(String str, List<AccountIdentity> list, Map<String, ? extends Object> map) {
        this.accountId = str;
        this.identities = list;
        this.attributes = map;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof DefaultAccount) && !(Intrinsics.areEqual((Object) getAccountId(), (Object) ((DefaultAccount) obj).getAccountId()) ^ true);
    }

    public String getAccountId() {
        return this.accountId;
    }

    public final Map<String, Object> getAttributes() {
        return this.attributes;
    }

    public List<AccountIdentity> getIdentities() {
        return this.identities;
    }

    public int hashCode() {
        return getAccountId().hashCode();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("DefaultAccount(accountId='");
        sb.append(getAccountId());
        sb.append("')");
        return sb.toString();
    }

    public /* synthetic */ DefaultAccount(String str, List list, Map map, int i, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i & 2) != 0) {
            list = C13185o.m40513a();
        }
        if ((i & 4) != 0) {
            map = C13173j0.m40350a();
        }
        this(str, list, map);
    }

    public DefaultAccount() {
        this("", C13185o.m40513a(), C13173j0.m40350a());
    }
}
