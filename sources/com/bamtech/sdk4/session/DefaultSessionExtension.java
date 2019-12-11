package com.bamtech.sdk4.session;

import com.bamtech.sdk4.internal.service.ServiceTransaction;
import com.bamtech.sdk4.internal.token.ExternalGrantExchange;
import kotlin.Metadata;
import p520io.reactivex.Completable;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\u0018\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0016J\u0018\u0010\f\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\u000eH\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000¨\u0006\u000f"}, mo31007d2 = {"Lcom/bamtech/sdk4/session/DefaultSessionExtension;", "Lcom/bamtech/sdk4/session/SessionExtension;", "Lcom/bamtech/sdk4/session/ReauthorizationHandler;", "grantExchange", "Lcom/bamtech/sdk4/internal/token/ExternalGrantExchange;", "(Lcom/bamtech/sdk4/internal/token/ExternalGrantExchange;)V", "authorizeExternalGrant", "Lio/reactivex/Completable;", "transaction", "Lcom/bamtech/sdk4/internal/service/ServiceTransaction;", "grantToken", "", "handle", "mode", "Lcom/bamtech/sdk4/session/ReauthorizeMode;", "extension-session"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* compiled from: SessionExtension.kt */
public final class DefaultSessionExtension implements SessionExtension, ReauthorizationHandler {
    private final ExternalGrantExchange grantExchange;

    public DefaultSessionExtension(ExternalGrantExchange externalGrantExchange) {
        this.grantExchange = externalGrantExchange;
    }

    public Completable authorizeExternalGrant(ServiceTransaction serviceTransaction, String str) {
        return this.grantExchange.authorizeExternalGrant(serviceTransaction, str);
    }

    public Completable handle(ServiceTransaction serviceTransaction, ReauthorizeMode reauthorizeMode) {
        return authorizeExternalGrant(serviceTransaction, ((GrantRenewal) reauthorizeMode).getGrant().getAssertion());
    }
}
