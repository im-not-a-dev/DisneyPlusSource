package com.bamtech.sdk4.internal.telemetry;

import kotlin.Metadata;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0017\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0001¢\u0006\u0002\u0010\u0005R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, mo31007d2 = {"Lcom/bamtech/sdk4/internal/telemetry/TelemetryClientException;", "", "telemetryResponse", "Lcom/bamtech/sdk4/internal/telemetry/TelemetryResponse;", "cause", "(Lcom/bamtech/sdk4/internal/telemetry/TelemetryResponse;Ljava/lang/Throwable;)V", "getTelemetryResponse", "()Lcom/bamtech/sdk4/internal/telemetry/TelemetryResponse;", "extension-telemetry"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* compiled from: TelemetryClient.kt */
public final class TelemetryClientException extends Throwable {
    private final TelemetryResponse telemetryResponse;

    public TelemetryClientException(TelemetryResponse telemetryResponse2, Throwable th) {
        super(th);
        this.telemetryResponse = telemetryResponse2;
    }

    public final TelemetryResponse getTelemetryResponse() {
        return this.telemetryResponse;
    }
}
