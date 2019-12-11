package com.bamtech.sdk4.internal.token;

import com.bamtech.sdk4.internal.service.ServiceTransaction;
import com.bamtech.sdk4.internal.service.TransactionResult;
import com.bamtech.sdk4.token.AccessContext;
import kotlin.Metadata;
import p520io.reactivex.Single;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u001c\u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u00032\u0006\u0010\u000b\u001a\u00020\fH&J\u001c\u0010\r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u00032\u0006\u0010\u000b\u001a\u00020\fH&R&\u0010\u0002\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0018\u00010\u0003X¦\u000e¢\u0006\f\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\t¨\u0006\u000e"}, mo31007d2 = {"Lcom/bamtech/sdk4/internal/token/DeviceAccessContextHelper;", "", "contextRetrievalInProgress", "Lio/reactivex/Single;", "Lcom/bamtech/sdk4/internal/service/TransactionResult;", "Lcom/bamtech/sdk4/token/AccessContext;", "getContextRetrievalInProgress", "()Lio/reactivex/Single;", "setContextRetrievalInProgress", "(Lio/reactivex/Single;)V", "createDeviceContext", "transaction", "Lcom/bamtech/sdk4/internal/service/ServiceTransaction;", "getDeviceContext", "sdk-core-api_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* compiled from: DeviceAccessContextHelper.kt */
public interface DeviceAccessContextHelper {
    Single<TransactionResult<AccessContext>> createDeviceContext(ServiceTransaction serviceTransaction);

    Single<TransactionResult<AccessContext>> getContextRetrievalInProgress();

    Single<TransactionResult<AccessContext>> getDeviceContext(ServiceTransaction serviceTransaction);

    void setContextRetrievalInProgress(Single<TransactionResult<AccessContext>> single);
}
