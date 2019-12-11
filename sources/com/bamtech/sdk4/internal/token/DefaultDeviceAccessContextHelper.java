package com.bamtech.sdk4.internal.token;

import com.bamtech.sdk4.internal.device.DeviceManager;
import com.bamtech.sdk4.internal.service.ServiceTransaction;
import com.bamtech.sdk4.internal.service.TransactionResult;
import com.bamtech.sdk4.internal.session.InternalSessionStateProvider;
import com.bamtech.sdk4.service.ErrorReason;
import com.bamtech.sdk4.service.ServiceException;
import com.bamtech.sdk4.service.UnauthorizedException;
import com.bamtech.sdk4.token.AccessContext;
import com.bamtech.sdk4.token.Grant;
import java.util.concurrent.Callable;
import kotlin.Metadata;
import kotlin.jvm.internal.C12880j;
import p520io.reactivex.Single;
import p520io.reactivex.SingleSource;
import p520io.reactivex.SingleTransformer;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\u0010\u0003\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\u001f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u001c\u0010\u0011\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b0\n2\u0006\u0010\u0012\u001a\u00020\u0013H\u0016J\"\u0010\u0014\u001a\u0014\u0012\u0004\u0012\u00020\u0016\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b0\u00152\u0006\u0010\u0012\u001a\u00020\u0013H\u0002J\u001c\u0010\u0017\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b0\n2\u0006\u0010\u0012\u001a\u00020\u0013H\u0016J\f\u0010\u0018\u001a\u00020\u0019*\u00020\u001aH\u0002R(\u0010\t\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b\u0018\u00010\nX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000¨\u0006\u001b"}, mo31007d2 = {"Lcom/bamtech/sdk4/internal/token/DefaultDeviceAccessContextHelper;", "Lcom/bamtech/sdk4/internal/token/DeviceAccessContextHelper;", "deviceManager", "Lcom/bamtech/sdk4/internal/device/DeviceManager;", "internalSessionStateProvider", "Lcom/bamtech/sdk4/internal/session/InternalSessionStateProvider;", "tokenExchangeManager", "Lcom/bamtech/sdk4/internal/token/TokenExchangeManager;", "(Lcom/bamtech/sdk4/internal/device/DeviceManager;Lcom/bamtech/sdk4/internal/session/InternalSessionStateProvider;Lcom/bamtech/sdk4/internal/token/TokenExchangeManager;)V", "contextRetrievalInProgress", "Lio/reactivex/Single;", "Lcom/bamtech/sdk4/internal/service/TransactionResult;", "Lcom/bamtech/sdk4/token/AccessContext;", "getContextRetrievalInProgress", "()Lio/reactivex/Single;", "setContextRetrievalInProgress", "(Lio/reactivex/Single;)V", "createDeviceContext", "transaction", "Lcom/bamtech/sdk4/internal/service/ServiceTransaction;", "deviceTransformer", "Lio/reactivex/SingleTransformer;", "Lcom/bamtech/sdk4/token/Grant;", "getDeviceContext", "isInvalidGrantException", "", "", "sdk-core-api_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* compiled from: DeviceAccessContextHelper.kt */
public final class DefaultDeviceAccessContextHelper implements DeviceAccessContextHelper {
    private Single<TransactionResult<AccessContext>> contextRetrievalInProgress;
    /* access modifiers changed from: private */
    public final DeviceManager deviceManager;
    /* access modifiers changed from: private */
    public final InternalSessionStateProvider internalSessionStateProvider;
    /* access modifiers changed from: private */
    public final TokenExchangeManager tokenExchangeManager;

    public DefaultDeviceAccessContextHelper(DeviceManager deviceManager2, InternalSessionStateProvider internalSessionStateProvider2, TokenExchangeManager tokenExchangeManager2) {
        this.deviceManager = deviceManager2;
        this.internalSessionStateProvider = internalSessionStateProvider2;
        this.tokenExchangeManager = tokenExchangeManager2;
    }

    /* access modifiers changed from: private */
    public final SingleTransformer<Grant, TransactionResult<AccessContext>> deviceTransformer(ServiceTransaction serviceTransaction) {
        return new DefaultDeviceAccessContextHelper$deviceTransformer$1(this, serviceTransaction);
    }

    /* access modifiers changed from: private */
    public final boolean isInvalidGrantException(Throwable th) {
        if (!(th instanceof UnauthorizedException)) {
            return false;
        }
        Throwable cause = th.getCause();
        if (cause instanceof ServiceException) {
            return C12880j.m40224a((Object) ((ErrorReason) C13199w.m40589f(((ServiceException) cause).getErrors())).getCode(), (Object) "invalid_grant");
        }
        return false;
    }

    public Single<TransactionResult<AccessContext>> createDeviceContext(ServiceTransaction serviceTransaction) {
        Single<TransactionResult<AccessContext>> h = getDeviceContext(serviceTransaction).mo30235h(new DefaultDeviceAccessContextHelper$createDeviceContext$1(this, serviceTransaction));
        C12880j.m40222a((Object) h, "getDeviceContext(transac…}\n            }\n        }");
        return h;
    }

    public Single<TransactionResult<AccessContext>> getContextRetrievalInProgress() {
        return this.contextRetrievalInProgress;
    }

    public Single<TransactionResult<AccessContext>> getDeviceContext(ServiceTransaction serviceTransaction) {
        Single<TransactionResult<AccessContext>> a = Single.m38396a((Callable<? extends SingleSource<? extends T>>) new DefaultDeviceAccessContextHelper$getDeviceContext$1<Object>(this, serviceTransaction));
        C12880j.m40222a((Object) a, "Single.defer {\n         …valInProgress!!\n        }");
        return a;
    }

    public void setContextRetrievalInProgress(Single<TransactionResult<AccessContext>> single) {
        this.contextRetrievalInProgress = single;
    }
}
