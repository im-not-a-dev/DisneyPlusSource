package com.bamtech.sdk4.internal.telemetry;

import com.bamtech.sdk4.internal.service.ServiceTransaction;
import java.util.Map;
import kotlin.Metadata;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\f\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\u001c\u0010\u001c\u001a\u00020\u001d2\u0012\u0010\u001e\u001a\u000e\u0012\u0004\u0012\u00020\u001d\u0012\u0004\u0012\u00020\u001d0\u001fH&J\u0014\u0010 \u001a\u000e\u0012\u0004\u0012\u00020\u001d\u0012\u0004\u0012\u00020\u001d0\u001fH&J\u001c\u0010!\u001a\u000e\u0012\u0004\u0012\u00020\u001d\u0012\u0004\u0012\u00020\u001d0\u001f2\u0006\u0010\"\u001a\u00020\u001dH&J\u001c\u0010#\u001a\u00020$2\u0012\u0010\u001e\u001a\u000e\u0012\u0004\u0012\u00020\u001d\u0012\u0004\u0012\u00020\u001d0\u001fH&J1\u0010%\u001a\u0004\u0018\u00010\u001d\"\u0010\b\u0000\u0010&*\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030'2\u0006\u0010(\u001a\u00020)2\u0006\u0010*\u001a\u0002H&H&¢\u0006\u0002\u0010+J\u0010\u0010,\u001a\u00020$2\u0006\u0010(\u001a\u00020)H&R\u0018\u0010\u0002\u001a\u00020\u0003X¦\u000e¢\u0006\f\u001a\u0004\b\u0004\u0010\u0005\"\u0004\b\u0006\u0010\u0007R\u0012\u0010\b\u001a\u00020\tX¦\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000bR\u0018\u0010\f\u001a\u00020\u0003X¦\u000e¢\u0006\f\u001a\u0004\b\r\u0010\u0005\"\u0004\b\u000e\u0010\u0007R\u001a\u0010\u000f\u001a\u0004\u0018\u00010\u0010X¦\u000e¢\u0006\f\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0015\u001a\u0004\u0018\u00010\u0003X¦\u000e¢\u0006\f\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\u0012\u0010\u001a\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u0005¨\u0006-"}, mo31007d2 = {"Lcom/bamtech/sdk4/internal/telemetry/TelemetryStorage;", "", "batchLimit", "", "getBatchLimit", "()I", "setBatchLimit", "(I)V", "hasEnoughValues", "", "getHasEnoughValues", "()Z", "maxBatchLimit", "getMaxBatchLimit", "setMaxBatchLimit", "minBatchLimit", "", "getMinBatchLimit", "()Ljava/lang/Long;", "setMinBatchLimit", "(Ljava/lang/Long;)V", "queueLimit", "getQueueLimit", "()Ljava/lang/Integer;", "setQueueLimit", "(Ljava/lang/Integer;)V", "size", "getSize", "convertBatchToPayload", "", "batch", "", "createBatch", "createSingleBatch", "fileName", "deleteBatch", "", "storeEvent", "T", "Lcom/bamtech/sdk4/internal/telemetry/TelemetryEvent;", "transaction", "Lcom/bamtech/sdk4/internal/service/ServiceTransaction;", "event", "(Lcom/bamtech/sdk4/internal/service/ServiceTransaction;Lcom/bamtech/sdk4/internal/telemetry/TelemetryEvent;)Ljava/lang/String;", "trimSavedEvents", "sdk-core-api_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* compiled from: TelemetryStorage.kt */
public interface TelemetryStorage {
    String convertBatchToPayload(Map<String, String> map);

    Map<String, String> createBatch();

    Map<String, String> createSingleBatch(String str);

    void deleteBatch(Map<String, String> map);

    int getBatchLimit();

    boolean getHasEnoughValues();

    int getSize();

    void setBatchLimit(int i);

    void setMaxBatchLimit(int i);

    void setMinBatchLimit(Long l);

    void setQueueLimit(Integer num);

    <T extends TelemetryEvent<?, ?>> String storeEvent(ServiceTransaction serviceTransaction, T t);

    void trimSavedEvents(ServiceTransaction serviceTransaction);
}
