package com.bamtech.sdk4.account;

import com.bamtech.sdk4.identity.IdentityToken;
import com.bamtech.sdk4.plugin.PluginApi;
import kotlin.Metadata;
import p520io.reactivex.Completable;
import p520io.reactivex.Maybe;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0016\u0010\u0006\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u00072\u0006\u0010\u0004\u001a\u00020\u0005H&J'\u0010\u0006\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u00072\u0006\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u0001H\u0007H&¢\u0006\u0002\u0010\tJ1\u0010\u0006\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u00072\u0006\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u0001H\u00072\b\b\u0002\u0010\n\u001a\u00020\u000bH&¢\u0006\u0002\u0010\fJ\u000e\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eH&J&\u0010\r\u001a\b\u0012\u0004\u0012\u0002H\u00070\u000e\"\b\b\u0000\u0010\u0007*\u00020\u00102\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u0002H\u00070\u0012H&J\u001b\u0010\u0013\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u00072\u0006\u0010\b\u001a\u0002H\u0007H&¢\u0006\u0002\u0010\u0014¨\u0006\u0015"}, mo31007d2 = {"Lcom/bamtech/sdk4/account/AccountApi;", "Lcom/bamtech/sdk4/plugin/PluginApi;", "authorize", "Lio/reactivex/Completable;", "identityToken", "Lcom/bamtech/sdk4/identity/IdentityToken;", "createAccount", "T", "attributes", "(Lcom/bamtech/sdk4/identity/IdentityToken;Ljava/lang/Object;)Lio/reactivex/Completable;", "isTest", "", "(Lcom/bamtech/sdk4/identity/IdentityToken;Ljava/lang/Object;Z)Lio/reactivex/Completable;", "getAccount", "Lio/reactivex/Maybe;", "Lcom/bamtech/sdk4/account/DefaultAccount;", "Lcom/bamtech/sdk4/account/Account;", "accountType", "Ljava/lang/Class;", "updateAccountAttributes", "(Ljava/lang/Object;)Lio/reactivex/Completable;", "plugin-account"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* compiled from: AccountApi.kt */
public interface AccountApi extends PluginApi {
    Completable authorize(IdentityToken identityToken);

    <T> Completable createAccount(IdentityToken identityToken, T t);

    Maybe<DefaultAccount> getAccount();
}
