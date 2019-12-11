package com.bamtech.sdk4.internal.telemetry;

import com.bamtech.sdk4.internal.service.ServiceTransaction;
import kotlin.Metadata;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002JI\u0010\u0003\u001a\u00020\u0004\"\u0010\b\u0000\u0010\u0005*\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u0002H\u0005H\u0016¢\u0006\u0002\u0010\u0010¨\u0006\u0011"}, mo31007d2 = {"Lcom/bamtech/sdk4/internal/telemetry/NoOpRecoverHandler;", "Lcom/bamtech/sdk4/internal/telemetry/ErrorHandler;", "()V", "handleError", "", "T", "Lcom/bamtech/sdk4/internal/telemetry/TelemetryEvent;", "helper", "Lcom/bamtech/sdk4/internal/telemetry/TelemetryEventStorageHelper;", "transaction", "Lcom/bamtech/sdk4/internal/service/ServiceTransaction;", "fileName", "", "throwable", "", "event", "(Lcom/bamtech/sdk4/internal/telemetry/TelemetryEventStorageHelper;Lcom/bamtech/sdk4/internal/service/ServiceTransaction;Ljava/lang/String;Ljava/lang/Throwable;Lcom/bamtech/sdk4/internal/telemetry/TelemetryEvent;)V", "sdk-core-api_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* compiled from: TelemetryStoreEventHelper.kt */
public final class NoOpRecoverHandler implements ErrorHandler {
    public <T extends TelemetryEvent<?, ?>> void handleError(TelemetryEventStorageHelper telemetryEventStorageHelper, ServiceTransaction serviceTransaction, String str, Throwable th, T t) {
    }
}
