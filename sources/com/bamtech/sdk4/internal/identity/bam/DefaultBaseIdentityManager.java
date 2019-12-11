package com.bamtech.sdk4.internal.identity.bam;

import com.bamtech.sdk4.identity.IdentityToken;
import com.bamtech.sdk4.internal.service.ServiceTransaction;
import kotlin.Metadata;
import p520io.reactivex.Single;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u0017\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0001¢\u0006\u0002\u0010\u0006J\u0016\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\n\u001a\u00020\u000bH\u0016J.\u0010\u0007\u001a\b\u0012\u0004\u0012\u0002H\f0\b\"\b\b\u0000\u0010\f*\u00020\r2\u0006\u0010\n\u001a\u00020\u000b2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u0002H\f0\u000fH\u0016J\u0017\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\b2\u0006\u0010\n\u001a\u00020\u000bH\u0001J#\u0010\u0012\u001a\u00020\u0013\"\u0004\b\u0000\u0010\f2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\u0014\u001a\u0002H\fH\u0016¢\u0006\u0002\u0010\u0015R\u000e\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0001X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0016"}, mo31007d2 = {"Lcom/bamtech/sdk4/internal/identity/bam/DefaultBaseIdentityManager;", "Lcom/bamtech/sdk4/internal/identity/bam/CommonIdentityTokenManager;", "Lcom/bamtech/sdk4/internal/identity/bam/BaseIdentityManager;", "client", "Lcom/bamtech/sdk4/internal/identity/bam/BaseIdentityClient;", "commonIdentityTokenManager", "(Lcom/bamtech/sdk4/internal/identity/bam/BaseIdentityClient;Lcom/bamtech/sdk4/internal/identity/bam/CommonIdentityTokenManager;)V", "getIdentity", "Lio/reactivex/Single;", "Lcom/bamtech/sdk4/identity/bam/DefaultIdentity;", "transaction", "Lcom/bamtech/sdk4/internal/service/ServiceTransaction;", "T", "Lcom/bamtech/sdk4/identity/bam/Identity;", "identityType", "Ljava/lang/Class;", "getIdentityToken", "Lcom/bamtech/sdk4/identity/IdentityToken;", "updateAttributes", "Lio/reactivex/Completable;", "attributes", "(Lcom/bamtech/sdk4/internal/service/ServiceTransaction;Ljava/lang/Object;)Lio/reactivex/Completable;", "plugin-identity-bam"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* compiled from: BaseIdentityManager.kt */
public final class DefaultBaseIdentityManager implements CommonIdentityTokenManager, BaseIdentityManager {
    private final CommonIdentityTokenManager commonIdentityTokenManager;

    public DefaultBaseIdentityManager(BaseIdentityClient baseIdentityClient, CommonIdentityTokenManager commonIdentityTokenManager2) {
        this.commonIdentityTokenManager = commonIdentityTokenManager2;
    }

    public Single<IdentityToken> getIdentityToken(ServiceTransaction serviceTransaction) {
        return this.commonIdentityTokenManager.getIdentityToken(serviceTransaction);
    }
}
