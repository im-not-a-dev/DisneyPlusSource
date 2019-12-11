package com.bamtech.sdk4.internal.configuration;

import kotlin.Metadata;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0012\u0018\u00002\u00020\u0001B\u0007\b\u0010¢\u0006\u0002\u0010\u0002BA\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0004¢\u0006\u0002\u0010\fR\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0015\u0010\n\u001a\u0004\u0018\u00010\u0004¢\u0006\n\n\u0002\u0010\u0011\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u000b\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u000eR\u0015\u0010\t\u001a\u0004\u0018\u00010\u0006¢\u0006\n\n\u0002\u0010\u0017\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019¨\u0006\u001a"}, mo31007d2 = {"Lcom/bamtech/sdk4/internal/configuration/TelemetryBufferConfiguration;", "Lcom/bamtech/sdk4/internal/configuration/ServiceExtras;", "()V", "batchLimit", "", "replyAfterFallback", "", "disabled", "", "minimumBatchSize", "cacheLimit", "maximumStackTraceElements", "(IJZLjava/lang/Long;Ljava/lang/Integer;I)V", "getBatchLimit", "()I", "getCacheLimit", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getDisabled", "()Z", "getMaximumStackTraceElements", "getMinimumBatchSize", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getReplyAfterFallback", "()J", "sdk-configuration"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* compiled from: TelemetryServiceConfiguration.kt */
public final class TelemetryBufferConfiguration implements ServiceExtras {
    private final int batchLimit;
    private final Integer cacheLimit;
    private final boolean disabled;
    private final int maximumStackTraceElements;
    private final Long minimumBatchSize;
    private final long replyAfterFallback;

    public TelemetryBufferConfiguration(int i, long j, boolean z, Long l, Integer num, int i2) {
        this.batchLimit = i;
        this.replyAfterFallback = j;
        this.disabled = z;
        this.minimumBatchSize = l;
        this.cacheLimit = num;
        this.maximumStackTraceElements = i2;
    }

    public final int getBatchLimit() {
        return this.batchLimit;
    }

    public final Integer getCacheLimit() {
        return this.cacheLimit;
    }

    public final boolean getDisabled() {
        return this.disabled;
    }

    public final int getMaximumStackTraceElements() {
        return this.maximumStackTraceElements;
    }

    public final Long getMinimumBatchSize() {
        return this.minimumBatchSize;
    }

    public final long getReplyAfterFallback() {
        return this.replyAfterFallback;
    }

    public TelemetryBufferConfiguration() {
        this(20, 30, false, null, null, 0);
    }
}
