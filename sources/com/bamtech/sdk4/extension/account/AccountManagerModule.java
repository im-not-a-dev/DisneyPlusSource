package com.bamtech.sdk4.extension.account;

import com.bamtech.sdk4.internal.account.AccountClient;
import com.bamtech.sdk4.internal.token.AccessTokenProvider;
import com.bamtech.sdk4.internal.token.AccountTokenExchangeProvider;
import com.bamtech.sdk4.session.ReauthorizationHandlerRegistry;
import com.bamtech.sdk4.session.RenewSessionTransformers;
import kotlin.Metadata;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J0\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0007¨\u0006\u000f"}, mo31007d2 = {"Lcom/bamtech/sdk4/extension/account/AccountManagerModule;", "", "()V", "manager", "Lcom/bamtech/sdk4/extension/account/AccountExtension;", "client", "Lcom/bamtech/sdk4/internal/account/AccountClient;", "tokenProvider", "Lcom/bamtech/sdk4/internal/token/AccessTokenProvider;", "tokenExchangeProvider", "Lcom/bamtech/sdk4/internal/token/AccountTokenExchangeProvider;", "renewSessionTransformers", "Lcom/bamtech/sdk4/session/RenewSessionTransformers;", "reauthorizationHandlerRegistry", "Lcom/bamtech/sdk4/session/ReauthorizationHandlerRegistry;", "extension-account"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* compiled from: AccountModule.kt */
public final class AccountManagerModule {
    public final AccountExtension manager(AccountClient accountClient, AccessTokenProvider accessTokenProvider, AccountTokenExchangeProvider accountTokenExchangeProvider, RenewSessionTransformers renewSessionTransformers, ReauthorizationHandlerRegistry reauthorizationHandlerRegistry) {
        return DefaultAccountExtension.Companion.createAndRegister(accountClient, accessTokenProvider, accountTokenExchangeProvider, renewSessionTransformers, reauthorizationHandlerRegistry);
    }
}
