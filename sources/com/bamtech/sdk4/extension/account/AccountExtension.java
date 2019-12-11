package com.bamtech.sdk4.extension.account;

import com.bamtech.sdk4.account.DefaultAccount;
import com.bamtech.sdk4.identity.IdentityToken;
import com.bamtech.sdk4.internal.service.ServiceTransaction;
import kotlin.Metadata;
import p520io.reactivex.Completable;
import p520io.reactivex.Single;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u0000 \u00162\u00020\u0001:\u0001\u0016J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&J9\u0010\b\u001a\u00020\u0003\"\u0004\b\u0000\u0010\t2\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u0001H\t2\b\b\u0002\u0010\u000b\u001a\u00020\fH&¢\u0006\u0002\u0010\rJ\u0016\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f2\u0006\u0010\u0004\u001a\u00020\u0005H&J.\u0010\u000e\u001a\b\u0012\u0004\u0012\u0002H\t0\u000f\"\b\b\u0000\u0010\t*\u00020\u00112\u0006\u0010\u0004\u001a\u00020\u00052\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u0002H\t0\u0013H&J#\u0010\u0014\u001a\u00020\u0003\"\u0004\b\u0000\u0010\t2\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\n\u001a\u0002H\tH&¢\u0006\u0002\u0010\u0015¨\u0006\u0017"}, mo31007d2 = {"Lcom/bamtech/sdk4/extension/account/AccountExtension;", "", "authorize", "Lio/reactivex/Completable;", "transaction", "Lcom/bamtech/sdk4/internal/service/ServiceTransaction;", "identityToken", "Lcom/bamtech/sdk4/identity/IdentityToken;", "createAccount", "T", "attributes", "isTest", "", "(Lcom/bamtech/sdk4/internal/service/ServiceTransaction;Lcom/bamtech/sdk4/identity/IdentityToken;Ljava/lang/Object;Z)Lio/reactivex/Completable;", "getAccount", "Lio/reactivex/Single;", "Lcom/bamtech/sdk4/account/DefaultAccount;", "Lcom/bamtech/sdk4/account/Account;", "accountType", "Ljava/lang/Class;", "updateAttributes", "(Lcom/bamtech/sdk4/internal/service/ServiceTransaction;Ljava/lang/Object;)Lio/reactivex/Completable;", "Companion", "extension-account"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* compiled from: AccountExtension.kt */
public interface AccountExtension {

    @Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, mo31007d2 = {"Lcom/bamtech/sdk4/extension/account/AccountExtension$Companion;", "", "()V", "IS_TEST", "", "extension-account"}, mo31008k = 1, mo31009mv = {1, 1, 15})
    /* compiled from: AccountExtension.kt */
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }
    }

    static {
        Companion companion = Companion.$$INSTANCE;
    }

    Completable authorize(ServiceTransaction serviceTransaction, IdentityToken identityToken);

    <T> Completable createAccount(ServiceTransaction serviceTransaction, IdentityToken identityToken, T t, boolean z);

    Single<DefaultAccount> getAccount(ServiceTransaction serviceTransaction);
}
