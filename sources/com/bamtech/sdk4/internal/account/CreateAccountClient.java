package com.bamtech.sdk4.internal.account;

import com.bamtech.sdk4.internal.service.ServiceTransaction;
import java.util.Map;
import kotlin.Metadata;
import p520io.reactivex.Single;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b`\u0018\u00002\u00020\u0001JD\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\"\u0004\b\u0000\u0010\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0018\b\u0002\u0010\b\u001a\u0012\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\n0\tj\u0002`\u000b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u0002H\u00050\rH&¨\u0006\u000e"}, mo31007d2 = {"Lcom/bamtech/sdk4/internal/account/CreateAccountClient;", "", "createAccount", "Lio/reactivex/Single;", "Lcom/bamtech/sdk4/internal/account/CreateAccountResult;", "T", "transaction", "Lcom/bamtech/sdk4/internal/service/ServiceTransaction;", "tokenMap", "", "", "Lcom/bamtech/sdk4/internal/service/TokenMap;", "request", "Lcom/bamtech/sdk4/internal/account/CreateAccountRequest;", "extension-account"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* compiled from: CreateAccountClient.kt */
public interface CreateAccountClient {
    <T> Single<CreateAccountResult> createAccount(ServiceTransaction serviceTransaction, Map<String, String> map, CreateAccountRequest<T> createAccountRequest);
}
