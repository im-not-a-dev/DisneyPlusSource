package com.bamtech.sdk4.internal.telemetry;

import com.bamtech.sdk4.internal.service.ServiceTransaction;
import kotlin.Metadata;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001JI\u0010\u0002\u001a\u00020\u0003\"\u0010\b\u0000\u0010\u0004*\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u0002H\u0004H&¢\u0006\u0002\u0010\u000f¨\u0006\u0010"}, mo31007d2 = {"Lcom/bamtech/sdk4/internal/telemetry/ErrorHandler;", "", "handleError", "", "T", "Lcom/bamtech/sdk4/internal/telemetry/TelemetryEvent;", "helper", "Lcom/bamtech/sdk4/internal/telemetry/TelemetryEventStorageHelper;", "transaction", "Lcom/bamtech/sdk4/internal/service/ServiceTransaction;", "fileName", "", "throwable", "", "event", "(Lcom/bamtech/sdk4/internal/telemetry/TelemetryEventStorageHelper;Lcom/bamtech/sdk4/internal/service/ServiceTransaction;Ljava/lang/String;Ljava/lang/Throwable;Lcom/bamtech/sdk4/internal/telemetry/TelemetryEvent;)V", "sdk-core-api_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* compiled from: TelemetryStoreEventHelper.kt */
public interface ErrorHandler {
    <T extends TelemetryEvent<?, ?>> void handleError(TelemetryEventStorageHelper telemetryEventStorageHelper, ServiceTransaction serviceTransaction, String str, Throwable th, T t);
}
