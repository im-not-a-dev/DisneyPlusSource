package com.bamtech.sdk4.service;

import com.bamtech.sdk4.internal.service.ServiceError;
import java.util.List;
import java.util.UUID;
import kotlin.Metadata;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0002\u0010\t¨\u0006\n"}, mo31007d2 = {"Lcom/bamtech/sdk4/service/ConflictException;", "Lcom/bamtech/sdk4/service/ServiceException;", "transactionId", "Ljava/util/UUID;", "errors", "", "Lcom/bamtech/sdk4/service/ErrorReason;", "cause", "", "(Ljava/util/UUID;Ljava/util/List;Ljava/lang/Throwable;)V", "sdk-service"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* compiled from: ServiceExceptions.kt */
public final class ConflictException extends ServiceException {
    public ConflictException(UUID uuid, List<? extends ErrorReason> list, Throwable th) {
        if (!(!list.isEmpty())) {
            list = C13183n.m40498a(new ServiceError("conflict", th != null ? th.getMessage() : null));
        }
        super(uuid, list, th);
    }
}
