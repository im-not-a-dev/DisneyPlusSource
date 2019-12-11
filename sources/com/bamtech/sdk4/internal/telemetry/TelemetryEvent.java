package com.bamtech.sdk4.internal.telemetry;

import com.bamtech.core.annotations.android.DontObfuscate;
import com.bamtech.sdk4.internal.telemetry.TelemetryClientPayload;
import kotlin.Metadata;

@DontObfuscate
@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\n\n\u0002\u0010\u000e\n\u0000\b'\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u0001*\n\b\u0001\u0010\u0002 \u0001*\u00020\u00032\u00020\u0004B\u0015\u0012\u0006\u0010\u0005\u001a\u00028\u0000\u0012\u0006\u0010\u0006\u001a\u00028\u0001¢\u0006\u0002\u0010\u0007J\b\u0010\u000e\u001a\u00020\u000fH\u0016R\u0013\u0010\u0006\u001a\u00028\u0001¢\u0006\n\n\u0002\u0010\n\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0005\u001a\u00028\u0000¢\u0006\n\n\u0002\u0010\r\u001a\u0004\b\u000b\u0010\f¨\u0006\u0010"}, mo31007d2 = {"Lcom/bamtech/sdk4/internal/telemetry/TelemetryEvent;", "T", "U", "Lcom/bamtech/sdk4/internal/telemetry/TelemetryClientPayload;", "", "server", "client", "(Ljava/lang/Object;Lcom/bamtech/sdk4/internal/telemetry/TelemetryClientPayload;)V", "getClient", "()Lcom/bamtech/sdk4/internal/telemetry/TelemetryClientPayload;", "Lcom/bamtech/sdk4/internal/telemetry/TelemetryClientPayload;", "getServer", "()Ljava/lang/Object;", "Ljava/lang/Object;", "toString", "", "sdk-base"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* compiled from: TelemetryEvent.kt */
public abstract class TelemetryEvent<T, U extends TelemetryClientPayload> {
    private final U client;
    private final T server;

    public TelemetryEvent(T t, U u) {
        this.server = t;
        this.client = u;
    }

    public final U getClient() {
        return this.client;
    }

    public final T getServer() {
        return this.server;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("TelemetryEvent(server=");
        sb.append(this.server);
        sb.append(", client=");
        sb.append(this.client);
        sb.append(')');
        return sb.toString();
    }
}
