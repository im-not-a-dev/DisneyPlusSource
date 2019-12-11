package com.bamtech.sdk4.internal.account;

import com.bamtech.sdk4.account.Account;
import com.bamtech.sdk4.internal.service.ServiceTransaction;
import java.util.Map;
import kotlin.Metadata;
import p520io.reactivex.Single;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u0005B'\b\u0007\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r¢\u0006\u0002\u0010\u000eJE\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010\"\u0004\b\u0000\u0010\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0018\b\u0002\u0010\u0015\u001a\u0012\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u00170\u0016j\u0002`\u00182\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u0002H\u00120\u001aH\u0001J9\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001c0\u00102\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0019\u001a\u00020\u001d2\u0018\b\u0002\u0010\u0015\u001a\u0012\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u00170\u0016j\u0002`\u0018H\u0001JA\u0010\u001e\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u001f0\u00102\u0006\u0010\u0013\u001a\u00020\u00142\u0016\u0010\u0015\u001a\u0012\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u00170\u0016j\u0002`\u00182\u000e\u0010 \u001a\n\u0012\u0006\b\u0001\u0012\u00020\u001f0!H\u0001J<\u0010\"\u001a\u00020#\"\u0004\b\u0000\u0010\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0016\u0010\u0015\u001a\u0012\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u00170\u0016j\u0002`\u00182\u0006\u0010$\u001a\u0002H\u0012H\u0001¢\u0006\u0002\u0010%¨\u0006&"}, mo31007d2 = {"Lcom/bamtech/sdk4/internal/account/DefaultAccountClient;", "Lcom/bamtech/sdk4/internal/account/AccountClient;", "Lcom/bamtech/sdk4/internal/account/CreateAccountClient;", "Lcom/bamtech/sdk4/internal/account/CreateAccountGrantClient;", "Lcom/bamtech/sdk4/internal/account/GetAccountClient;", "Lcom/bamtech/sdk4/internal/account/UpdateAccountClient;", "createAccountClient", "Lcom/bamtech/sdk4/internal/account/DefaultCreateAccountClient;", "createAccountGrantClient", "Lcom/bamtech/sdk4/internal/account/DefaultCreateAccountGrantClient;", "getAccountClient", "Lcom/bamtech/sdk4/internal/account/DefaultGetAccountClient;", "updateAccountAttributesClient", "Lcom/bamtech/sdk4/internal/account/DefaultUpdateAccountClient;", "(Lcom/bamtech/sdk4/internal/account/DefaultCreateAccountClient;Lcom/bamtech/sdk4/internal/account/DefaultCreateAccountGrantClient;Lcom/bamtech/sdk4/internal/account/DefaultGetAccountClient;Lcom/bamtech/sdk4/internal/account/DefaultUpdateAccountClient;)V", "createAccount", "Lio/reactivex/Single;", "Lcom/bamtech/sdk4/internal/account/CreateAccountResult;", "T", "transaction", "Lcom/bamtech/sdk4/internal/service/ServiceTransaction;", "tokenMap", "", "", "Lcom/bamtech/sdk4/internal/service/TokenMap;", "request", "Lcom/bamtech/sdk4/internal/account/CreateAccountRequest;", "createAccountGrant", "Lcom/bamtech/sdk4/internal/account/CreateAccountGrantResponse;", "Lcom/bamtech/sdk4/internal/account/CreateAccountGrantRequest;", "getAccount", "Lcom/bamtech/sdk4/account/Account;", "type", "Ljava/lang/Class;", "updateAttributes", "Lio/reactivex/Completable;", "attributes", "(Lcom/bamtech/sdk4/internal/service/ServiceTransaction;Ljava/util/Map;Ljava/lang/Object;)Lio/reactivex/Completable;", "extension-account"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* compiled from: AccountClient.kt */
public final class DefaultAccountClient implements AccountClient, CreateAccountClient, CreateAccountGrantClient, GetAccountClient, UpdateAccountClient {
    private final /* synthetic */ DefaultCreateAccountClient $$delegate_0;
    private final /* synthetic */ DefaultCreateAccountGrantClient $$delegate_1;
    private final /* synthetic */ DefaultGetAccountClient $$delegate_2;

    public DefaultAccountClient(DefaultCreateAccountClient defaultCreateAccountClient, DefaultCreateAccountGrantClient defaultCreateAccountGrantClient, DefaultGetAccountClient defaultGetAccountClient, DefaultUpdateAccountClient defaultUpdateAccountClient) {
        this.$$delegate_0 = defaultCreateAccountClient;
        this.$$delegate_1 = defaultCreateAccountGrantClient;
        this.$$delegate_2 = defaultGetAccountClient;
    }

    public <T> Single<CreateAccountResult> createAccount(ServiceTransaction serviceTransaction, Map<String, String> map, CreateAccountRequest<T> createAccountRequest) {
        return this.$$delegate_0.createAccount(serviceTransaction, map, createAccountRequest);
    }

    public Single<CreateAccountGrantResponse> createAccountGrant(ServiceTransaction serviceTransaction, CreateAccountGrantRequest createAccountGrantRequest, Map<String, String> map) {
        return this.$$delegate_1.createAccountGrant(serviceTransaction, createAccountGrantRequest, map);
    }

    public Single<? extends Account> getAccount(ServiceTransaction serviceTransaction, Map<String, String> map, Class<? extends Account> cls) {
        return this.$$delegate_2.getAccount(serviceTransaction, map, cls);
    }
}
