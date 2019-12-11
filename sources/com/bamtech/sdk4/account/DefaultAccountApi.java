package com.bamtech.sdk4.account;

import com.bamtech.sdk4.extension.account.AccountExtension;
import com.bamtech.sdk4.identity.IdentityToken;
import com.bamtech.sdk4.internal.service.ServiceTransaction;
import com.bamtech.sdk4.internal.telemetry.dust.DustExtensionsKt;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.internal.C12880j;
import p520io.reactivex.Completable;
import p520io.reactivex.Maybe;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u001d\b\u0007\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0016J\u0016\u0010\f\u001a\u00020\t\"\u0004\b\u0000\u0010\r2\u0006\u0010\n\u001a\u00020\u000bH\u0016J%\u0010\f\u001a\u00020\t\"\u0004\b\u0000\u0010\r2\u0006\u0010\n\u001a\u00020\u000b2\b\u0010\u000e\u001a\u0004\u0018\u0001H\rH\u0016¢\u0006\u0002\u0010\u000fJ-\u0010\f\u001a\u00020\t\"\u0004\b\u0000\u0010\r2\u0006\u0010\n\u001a\u00020\u000b2\b\u0010\u000e\u001a\u0004\u0018\u0001H\r2\u0006\u0010\u0010\u001a\u00020\u0011H\u0016¢\u0006\u0002\u0010\u0012J\u000e\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00150\u0014H\u0016J&\u0010\u0013\u001a\b\u0012\u0004\u0012\u0002H\r0\u0014\"\b\b\u0000\u0010\r*\u00020\u00162\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u0002H\r0\u0018H\u0016J\u001b\u0010\u0019\u001a\u00020\t\"\u0004\b\u0000\u0010\r2\u0006\u0010\u000e\u001a\u0002H\rH\u0016¢\u0006\u0002\u0010\u001aR\u000e\u0010\u0005\u001a\u00020\u0006X\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\u001b"}, mo31007d2 = {"Lcom/bamtech/sdk4/account/DefaultAccountApi;", "Lcom/bamtech/sdk4/account/AccountApi;", "transactionProvider", "Ljavax/inject/Provider;", "Lcom/bamtech/sdk4/internal/service/ServiceTransaction;", "accountExtension", "Lcom/bamtech/sdk4/extension/account/AccountExtension;", "(Ljavax/inject/Provider;Lcom/bamtech/sdk4/extension/account/AccountExtension;)V", "authorize", "Lio/reactivex/Completable;", "identityToken", "Lcom/bamtech/sdk4/identity/IdentityToken;", "createAccount", "T", "attributes", "(Lcom/bamtech/sdk4/identity/IdentityToken;Ljava/lang/Object;)Lio/reactivex/Completable;", "isTest", "", "(Lcom/bamtech/sdk4/identity/IdentityToken;Ljava/lang/Object;Z)Lio/reactivex/Completable;", "getAccount", "Lio/reactivex/Maybe;", "Lcom/bamtech/sdk4/account/DefaultAccount;", "Lcom/bamtech/sdk4/account/Account;", "accountType", "Ljava/lang/Class;", "updateAccountAttributes", "(Ljava/lang/Object;)Lio/reactivex/Completable;", "plugin-account"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* compiled from: AccountApi.kt */
public final class DefaultAccountApi implements AccountApi {
    private final AccountExtension accountExtension;
    private final Provider<ServiceTransaction> transactionProvider;

    public DefaultAccountApi(Provider<ServiceTransaction> provider, AccountExtension accountExtension2) {
        this.transactionProvider = provider;
        this.accountExtension = accountExtension2;
    }

    public Completable authorize(IdentityToken identityToken) {
        ServiceTransaction serviceTransaction = (ServiceTransaction) this.transactionProvider.get();
        AccountExtension accountExtension2 = this.accountExtension;
        C12880j.m40222a((Object) serviceTransaction, "transaction");
        return DustExtensionsKt.withDust$default(accountExtension2.authorize(serviceTransaction, identityToken), serviceTransaction, AccountApiKt.getACCOUNT_API_AUTHORIZE(), (Object) null, 4, (Object) null);
    }

    public <T> Completable createAccount(IdentityToken identityToken, T t) {
        return createAccount(identityToken, t, false);
    }

    public Maybe<DefaultAccount> getAccount() {
        ServiceTransaction serviceTransaction = (ServiceTransaction) this.transactionProvider.get();
        AccountExtension accountExtension2 = this.accountExtension;
        C12880j.m40222a((Object) serviceTransaction, "transaction");
        Maybe<DefaultAccount> h = DustExtensionsKt.withDust$default(accountExtension2.getAccount(serviceTransaction), serviceTransaction, AccountApiKt.getACCOUNT_API_GET_ACCOUNT(), (Object) null, 4, (Object) null).mo30234h();
        C12880j.m40222a((Object) h, "accountExtension.getAcco…               .toMaybe()");
        return h;
    }

    public <T> Completable createAccount(IdentityToken identityToken, T t, boolean z) {
        ServiceTransaction serviceTransaction = (ServiceTransaction) this.transactionProvider.get();
        AccountExtension accountExtension2 = this.accountExtension;
        C12880j.m40222a((Object) serviceTransaction, "transaction");
        return DustExtensionsKt.withDust$default(accountExtension2.createAccount(serviceTransaction, identityToken, t, z), serviceTransaction, AccountApiKt.getACCOUNT_API_CREATE_ACCOUNT(), (Object) null, 4, (Object) null);
    }
}
