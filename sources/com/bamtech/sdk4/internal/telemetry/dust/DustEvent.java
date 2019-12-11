package com.bamtech.sdk4.internal.telemetry.dust;

import com.bamtech.core.annotations.android.DontObfuscate;
import com.bamtech.sdk4.internal.telemetry.TelemetryEvent;
import kotlin.Metadata;

@DontObfuscate
@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\b\u0007\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u0001*\u0006\b\u0001\u0010\u0002 \u00012\u0014\u0012\u0004\u0012\u0002H\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00020\u00040\u0003B\u001b\u0012\u0006\u0010\u0005\u001a\u00028\u0000\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00010\u0004¢\u0006\u0002\u0010\u0007J\b\u0010\b\u001a\u00020\tH\u0016¨\u0006\n"}, mo31007d2 = {"Lcom/bamtech/sdk4/internal/telemetry/dust/DustEvent;", "SERVER", "CLIENT", "Lcom/bamtech/sdk4/internal/telemetry/TelemetryEvent;", "Lcom/bamtech/sdk4/internal/telemetry/dust/DefaultDustClientData;", "server", "client", "(Ljava/lang/Object;Lcom/bamtech/sdk4/internal/telemetry/dust/DefaultDustClientData;)V", "toString", "", "sdk-base"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* compiled from: DustEvent.kt */
public final class DustEvent<SERVER, CLIENT> extends TelemetryEvent<SERVER, DefaultDustClientData<? extends CLIENT>> {
    public DustEvent(SERVER server, DefaultDustClientData<? extends CLIENT> defaultDustClientData) {
        super(server, defaultDustClientData);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("DustEvent(server=");
        sb.append(getServer());
        sb.append(", client=");
        sb.append((DefaultDustClientData) getClient());
        sb.append(')');
        return sb.toString();
    }
}
