package com.bamtech.sdk4.edge;

import com.bamtech.sdk4.internal.service.ServiceTransaction;
import com.bamtech.sdk4.internal.token.AccessTokenProvider;
import javax.inject.Provider;
import kotlin.Metadata;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\u0018\u00002\u00020\u0001B%\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0002\u0010\tJ\b\u0010\n\u001a\u00020\u000bH\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007X\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, mo31007d2 = {"Lcom/bamtech/sdk4/edge/DefaultEdgeManager;", "Lcom/bamtech/sdk4/edge/EdgeManager;", "client", "Lcom/bamtech/sdk4/edge/EdgeClient;", "accessTokenProvider", "Lcom/bamtech/sdk4/internal/token/AccessTokenProvider;", "transactionProvider", "Ljavax/inject/Provider;", "Lcom/bamtech/sdk4/internal/service/ServiceTransaction;", "(Lcom/bamtech/sdk4/edge/EdgeClient;Lcom/bamtech/sdk4/internal/token/AccessTokenProvider;Ljavax/inject/Provider;)V", "connect", "", "sdk-core-api_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* compiled from: EdgeManager.kt */
public final class DefaultEdgeManager implements EdgeManager {
    public DefaultEdgeManager(EdgeClient edgeClient, AccessTokenProvider accessTokenProvider, Provider<ServiceTransaction> provider) {
    }
}
