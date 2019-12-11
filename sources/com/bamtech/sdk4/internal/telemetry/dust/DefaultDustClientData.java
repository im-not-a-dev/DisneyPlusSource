package com.bamtech.sdk4.internal.telemetry.dust;

import com.bamtech.core.annotations.android.DontObfuscate;
import com.bamtech.sdk4.internal.telemetry.dust.DustClientConstants.Application;
import com.bamtech.sdk4.internal.telemetry.dust.DustClientConstants.Device;
import com.bamtech.sdk4.internal.telemetry.dust.DustClientConstants.Sdk;
import java.util.Map;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.C12880j;
import org.joda.time.DateTime;
import org.joda.time.DateTimeZone;

@DontObfuscate
@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010$\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0003\n\u0002\b\u0002\b\u0007\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00012\b\u0012\u0004\u0012\u0002H\u00010\u00022\u00020\u0003B/\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00018\u0000\u0012\u0006\u0010\n\u001a\u00020\u0003¢\u0006\u0002\u0010\u000bJ\u0016\u0010(\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00002\u0006\u0010)\u001a\u00020*J\b\u0010+\u001a\u00020\u0007H\u0016R\u0014\u0010\f\u001a\u00020\rX\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u000e\u0010\n\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\u00020\u0007X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R \u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070\u0013X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0018\u0010\t\u001a\u0004\u0018\u00018\u0000X\u0004¢\u0006\n\n\u0002\u0010\u0018\u001a\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0019\u001a\u00020\u001aX\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0014\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0011R\u0014\u0010\u001e\u001a\u00020\u001fX\u0004¢\u0006\b\n\u0000\u001a\u0004\b \u0010!R\u0014\u0010\"\u001a\u00020#X\u0004¢\u0006\b\n\u0000\u001a\u0004\b$\u0010%R\u0014\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\b\n\u0000\u001a\u0004\b&\u0010'¨\u0006,"}, mo31007d2 = {"Lcom/bamtech/sdk4/internal/telemetry/dust/DefaultDustClientData;", "CLIENT", "Lcom/bamtech/sdk4/internal/telemetry/dust/DustClientData;", "Lcom/bamtech/sdk4/internal/telemetry/dust/DustClientConstants;", "transactionId", "Ljava/util/UUID;", "event", "", "category", "data", "baseData", "(Ljava/util/UUID;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;Lcom/bamtech/sdk4/internal/telemetry/dust/DustClientConstants;)V", "application", "Lcom/bamtech/sdk4/internal/telemetry/dust/DustClientConstants$Application;", "getApplication", "()Lcom/bamtech/sdk4/internal/telemetry/dust/DustClientConstants$Application;", "getCategory", "()Ljava/lang/String;", "correlationIds", "", "getCorrelationIds", "()Ljava/util/Map;", "getData", "()Ljava/lang/Object;", "Ljava/lang/Object;", "device", "Lcom/bamtech/sdk4/internal/telemetry/dust/DustClientConstants$Device;", "getDevice", "()Lcom/bamtech/sdk4/internal/telemetry/dust/DustClientConstants$Device;", "getEvent", "sdk", "Lcom/bamtech/sdk4/internal/telemetry/dust/DustClientConstants$Sdk;", "getSdk", "()Lcom/bamtech/sdk4/internal/telemetry/dust/DustClientConstants$Sdk;", "timestamp", "Lorg/joda/time/DateTime;", "getTimestamp", "()Lorg/joda/time/DateTime;", "getTransactionId", "()Ljava/util/UUID;", "copyDiscardClientData", "t", "", "toString", "sdk-base"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* compiled from: DustClientData.kt */
public final class DefaultDustClientData<CLIENT> implements DustClientData<CLIENT>, DustClientConstants {
    private final Application application = this.baseData.getApplication();
    private final DustClientConstants baseData;
    private final String category;
    private final Map<String, String> correlationIds = this.baseData.getCorrelationIds();
    private final CLIENT data;
    private final Device device = this.baseData.getDevice();
    private final String event;
    private final Sdk sdk = this.baseData.getSdk();
    private final DateTime timestamp;
    private final UUID transactionId;

    public DefaultDustClientData(UUID uuid, String str, String str2, CLIENT client, DustClientConstants dustClientConstants) {
        this.transactionId = uuid;
        this.event = str;
        this.category = str2;
        this.data = client;
        this.baseData = dustClientConstants;
        DateTime withZone = DateTime.now().withZone(DateTimeZone.UTC);
        C12880j.m40222a((Object) withZone, "DateTime.now().withZone(DateTimeZone.UTC)");
        this.timestamp = withZone;
    }

    public final DefaultDustClientData<String> copyDiscardClientData(Throwable th) {
        String str;
        try {
            StringBuilder sb = new StringBuilder();
            sb.append("Throwable is ");
            sb.append(th);
            sb.append(" masking data: ");
            sb.append(C12839z.m40187f(String.valueOf(getData()), 100));
            str = sb.toString();
        } catch (Throwable unused) {
            str = "Failed to capture data substring when copying discard client data";
        }
        DefaultDustClientData defaultDustClientData = new DefaultDustClientData(getTransactionId(), getEvent(), getCategory(), str, this.baseData);
        return defaultDustClientData;
    }

    public Application getApplication() {
        return this.application;
    }

    public String getCategory() {
        return this.category;
    }

    public Map<String, String> getCorrelationIds() {
        return this.correlationIds;
    }

    public CLIENT getData() {
        return this.data;
    }

    public Device getDevice() {
        return this.device;
    }

    public String getEvent() {
        return this.event;
    }

    public Sdk getSdk() {
        return this.sdk;
    }

    public DateTime getTimestamp() {
        return this.timestamp;
    }

    public UUID getTransactionId() {
        return this.transactionId;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("DefaultDustClientData(transactionId=");
        sb.append(getTransactionId());
        sb.append(", event='");
        sb.append(getEvent());
        sb.append("', ");
        sb.append("category='");
        sb.append(getCategory());
        sb.append("', data=");
        sb.append(getData());
        sb.append(", timestamp=");
        sb.append(getTimestamp());
        sb.append(", ");
        sb.append("application=");
        sb.append(getApplication());
        sb.append(", sdk=");
        sb.append(getSdk());
        sb.append(", device=");
        sb.append(getDevice());
        sb.append(',');
        sb.append("correlationIds=");
        sb.append(getCorrelationIds());
        sb.append(')');
        return sb.toString();
    }
}
