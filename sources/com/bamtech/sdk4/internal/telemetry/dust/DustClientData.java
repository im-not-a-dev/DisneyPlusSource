package com.bamtech.sdk4.internal.telemetry.dust;

import com.bamtech.sdk4.internal.telemetry.TelemetryClientPayload;
import kotlin.Metadata;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00012\u00020\u00022\u00020\u0003R\u0012\u0010\u0004\u001a\u00020\u0005X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u0004\u0018\u00018\u0000X¦\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\nR\u0012\u0010\u000b\u001a\u00020\u0005X¦\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\u0007R\u0012\u0010\r\u001a\u00020\u000eX¦\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010R\u0012\u0010\u0011\u001a\u00020\u0012X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, mo31007d2 = {"Lcom/bamtech/sdk4/internal/telemetry/dust/DustClientData;", "CLIENT", "Lcom/bamtech/sdk4/internal/telemetry/dust/DustClientConstants;", "Lcom/bamtech/sdk4/internal/telemetry/TelemetryClientPayload;", "category", "", "getCategory", "()Ljava/lang/String;", "data", "getData", "()Ljava/lang/Object;", "event", "getEvent", "timestamp", "Lorg/joda/time/DateTime;", "getTimestamp", "()Lorg/joda/time/DateTime;", "transactionId", "Ljava/util/UUID;", "getTransactionId", "()Ljava/util/UUID;", "sdk-base"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* compiled from: DustClientData.kt */
public interface DustClientData<CLIENT> extends DustClientConstants, TelemetryClientPayload {
}
