package com.bamtech.sdk4.internal.service;

import com.bamtech.sdk4.service.ErrorReason;
import com.bamtech.sdk4.service.ErrorsResponse;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u001b\b\u0016\u0012\u0012\u0010\u0002\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00040\u0003\"\u00020\u0004¢\u0006\u0002\u0010\u0005B\u0013\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0002\u0010\bR\u001a\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u000b"}, mo31007d2 = {"Lcom/bamtech/sdk4/internal/service/ServiceErrorsResponse;", "Lcom/bamtech/sdk4/service/ErrorsResponse;", "errors", "", "Lcom/bamtech/sdk4/service/ErrorReason;", "([Lcom/bamtech/sdk4/service/ErrorReason;)V", "", "Lcom/bamtech/sdk4/internal/service/ServiceError;", "(Ljava/util/List;)V", "getErrors", "()Ljava/util/List;", "sdk-service"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* compiled from: ServiceErrorsResponse.kt */
public final class ServiceErrorsResponse implements ErrorsResponse {
    private final List<ServiceError> errors;

    public ServiceErrorsResponse(List<ServiceError> list) {
        this.errors = list;
    }

    public List<ServiceError> getErrors() {
        return this.errors;
    }

    public ServiceErrorsResponse(ErrorReason... errorReasonArr) {
        ArrayList arrayList = new ArrayList(errorReasonArr.length);
        for (ErrorReason errorReason : errorReasonArr) {
            arrayList.add(new ServiceError(errorReason.getCode(), errorReason.getDescription()));
        }
        this(C13199w.m40606q(arrayList));
    }
}
