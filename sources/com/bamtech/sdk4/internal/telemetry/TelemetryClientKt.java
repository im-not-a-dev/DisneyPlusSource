package com.bamtech.sdk4.internal.telemetry;

import com.bamtech.core.networking.handlers.ResponseHandler;
import com.bamtech.sdk4.internal.networking.ConverterProvider;
import com.bamtech.sdk4.internal.service.ServiceTransaction;
import kotlin.Metadata;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u001c\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006¨\u0006\u0007"}, mo31007d2 = {"telemetryResponseHandler", "Lcom/bamtech/core/networking/handlers/ResponseHandler;", "Lcom/bamtech/sdk4/internal/telemetry/TelemetryResponse;", "transaction", "Lcom/bamtech/sdk4/internal/service/ServiceTransaction;", "converters", "Lcom/bamtech/sdk4/internal/networking/ConverterProvider;", "extension-telemetry"}, mo31008k = 2, mo31009mv = {1, 1, 15})
/* compiled from: TelemetryClient.kt */
public final class TelemetryClientKt {
    public static final ResponseHandler<TelemetryResponse> telemetryResponseHandler(ServiceTransaction serviceTransaction, ConverterProvider converterProvider) {
        return new TelemetryClientKt$telemetryResponseHandler$1(converterProvider, serviceTransaction);
    }
}
