package com.bamtech.sdk4.internal.telemetry;

import kotlin.Metadata;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002:\u0002\u0004\u0005B\u0007\b\u0002¢\u0006\u0002\u0010\u0003\u0001\u0002\u0006\u0007¨\u0006\b"}, mo31007d2 = {"Lcom/bamtech/sdk4/internal/telemetry/TaskResponse;", "T", "", "()V", "Failure", "Success", "Lcom/bamtech/sdk4/internal/telemetry/TaskResponse$Success;", "Lcom/bamtech/sdk4/internal/telemetry/TaskResponse$Failure;", "sdk-core-api_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* compiled from: TelemetryStoreEventHelper.kt */
public abstract class TaskResponse<T> {

    @Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0004\u0018\u0000*\u0004\b\u0001\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, mo31007d2 = {"Lcom/bamtech/sdk4/internal/telemetry/TaskResponse$Failure;", "T", "Lcom/bamtech/sdk4/internal/telemetry/TaskResponse;", "error", "", "(Ljava/lang/Throwable;)V", "getError", "()Ljava/lang/Throwable;", "sdk-core-api_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
    /* compiled from: TelemetryStoreEventHelper.kt */
    public static final class Failure<T> extends TaskResponse<T> {
        private final Throwable error;

        public Failure(Throwable th) {
            super(null);
            this.error = th;
        }

        public final Throwable getError() {
            return this.error;
        }
    }

    @Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000*\u0004\b\u0001\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002B\r\u0012\u0006\u0010\u0003\u001a\u00028\u0001¢\u0006\u0002\u0010\u0004R\u0013\u0010\u0003\u001a\u00028\u0001¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u0005\u0010\u0006¨\u0006\b"}, mo31007d2 = {"Lcom/bamtech/sdk4/internal/telemetry/TaskResponse$Success;", "T", "Lcom/bamtech/sdk4/internal/telemetry/TaskResponse;", "item", "(Ljava/lang/Object;)V", "getItem", "()Ljava/lang/Object;", "Ljava/lang/Object;", "sdk-core-api_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
    /* compiled from: TelemetryStoreEventHelper.kt */
    public static final class Success<T> extends TaskResponse<T> {
        private final T item;

        public Success(T t) {
            super(null);
            this.item = t;
        }

        public final T getItem() {
            return this.item;
        }
    }

    private TaskResponse() {
    }

    public /* synthetic */ TaskResponse(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
