package com.bamtech.sdk4.internal.telemetry;

import com.bamtech.core.networking.handlers.ResponseHandler;
import com.bamtech.sdk4.internal.networking.ConverterProvider;
import com.bamtech.sdk4.internal.service.ResponseHandlersKt;
import com.bamtech.sdk4.internal.service.ServiceError;
import com.bamtech.sdk4.internal.service.ServiceErrorsResponse;
import com.bamtech.sdk4.internal.service.ServiceTransaction;
import com.bamtech.sdk4.service.ServiceException;
import java.util.List;
import kotlin.C12898l;
import kotlin.Metadata;
import okhttp3.C14264y;
import okhttp3.Response;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0010\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0006H\u0016¨\u0006\b"}, mo31007d2 = {"com/bamtech/sdk4/internal/telemetry/TelemetryClientKt$telemetryResponseHandler$1", "Lcom/bamtech/core/networking/handlers/ResponseHandler;", "Lcom/bamtech/sdk4/internal/telemetry/TelemetryResponse;", "canHandle", "", "response", "Lokhttp3/Response;", "handle", "extension-telemetry"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* compiled from: TelemetryClient.kt */
public final class TelemetryClientKt$telemetryResponseHandler$1 implements ResponseHandler<TelemetryResponse> {
    final /* synthetic */ ConverterProvider $converters;
    final /* synthetic */ ServiceTransaction $transaction;

    TelemetryClientKt$telemetryResponseHandler$1(ConverterProvider converterProvider, ServiceTransaction serviceTransaction) {
        this.$converters = converterProvider;
        this.$transaction = serviceTransaction;
    }

    public boolean canHandle(Response response) {
        return true;
    }

    public TelemetryResponse handle(Response response) {
        ServiceException serviceException;
        String a = response.mo35862e().mo36244a("x-request-id");
        String a2 = response.mo35862e().mo36244a("x-mlbam-reply-after");
        TelemetryResponse telemetryResponse = new TelemetryResponse(a, a2 != null ? Long.valueOf(Long.parseLong(a2)) : null);
        boolean f = response.mo35863f();
        if (f) {
            return telemetryResponse;
        }
        if (!f) {
            C14264y a3 = response.mo35856a(524288);
            ServiceErrorsResponse deserializeError = ResponseHandlersKt.deserializeError(this.$converters.getIdentity(), response);
            if (deserializeError != null) {
                List errors = deserializeError.getErrors();
                if (errors != null && !errors.isEmpty()) {
                    serviceException = ServiceException.Companion.create(response.mo35858c(), this.$transaction.getId(), deserializeError.getErrors(), this.$transaction.getSource());
                    throw new TelemetryClientException(telemetryResponse, serviceException);
                }
            }
            serviceException = ServiceException.Companion.create(response.mo35858c(), this.$transaction.getId(), C13183n.m40498a(new ServiceError("error", a3.mo36279e())), this.$transaction.getSource());
            throw new TelemetryClientException(telemetryResponse, serviceException);
        }
        throw new C12898l();
    }
}
