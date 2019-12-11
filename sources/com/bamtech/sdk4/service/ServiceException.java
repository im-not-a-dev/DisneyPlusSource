package com.bamtech.sdk4.service;

import java.util.List;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b&\u0018\u0000 \u00182\u00020\u0001:\u0001\u0018B)\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0001¢\u0006\u0002\u0010\bJ\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014H\u0002J\b\u0010\u0015\u001a\u00020\u0016H\u0016J\b\u0010\u0017\u001a\u00020\fH\u0016R\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0016\u0010\u000b\u001a\u0004\u0018\u00010\f8VX\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0019"}, mo31007d2 = {"Lcom/bamtech/sdk4/service/ServiceException;", "", "transactionId", "Ljava/util/UUID;", "errors", "", "Lcom/bamtech/sdk4/service/ErrorReason;", "cause", "(Ljava/util/UUID;Ljava/util/List;Ljava/lang/Throwable;)V", "getErrors", "()Ljava/util/List;", "message", "", "getMessage", "()Ljava/lang/String;", "getTransactionId", "()Ljava/util/UUID;", "equals", "", "other", "", "hashCode", "", "toString", "Companion", "sdk-service"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* compiled from: ServiceException.kt */
public abstract class ServiceException extends Throwable {
    public static final Companion Companion = new Companion(null);
    private final List<ErrorReason> errors;
    private final UUID transactionId;

    @Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J6\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\rJ2\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u000e\b\u0002\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r¨\u0006\u0011"}, mo31007d2 = {"Lcom/bamtech/sdk4/service/ServiceException$Companion;", "", "()V", "create", "Lcom/bamtech/sdk4/service/ServiceException;", "responseCode", "", "transactionId", "Ljava/util/UUID;", "code", "", "description", "cause", "", "errors", "", "Lcom/bamtech/sdk4/service/ErrorReason;", "sdk-service"}, mo31008k = 1, mo31009mv = {1, 1, 15})
    /* compiled from: ServiceException.kt */
    public static final class Companion {
        private Companion() {
        }

        public static /* synthetic */ ServiceException create$default(Companion companion, int i, UUID uuid, List list, Throwable th, int i2, Object obj) {
            if ((i2 & 4) != 0) {
                list = C13185o.m40513a();
            }
            if ((i2 & 8) != 0) {
                th = null;
            }
            return companion.create(i, uuid, list, th);
        }

        public final ServiceException create(int i, UUID uuid, List<? extends ErrorReason> list, Throwable th) {
            if (i == 400) {
                return new InvalidRequestException(uuid, list, th);
            }
            if (i == 401) {
                return new UnauthorizedException(uuid, list, th);
            }
            if (i == 403) {
                return new ForbiddenException(uuid, list, th);
            }
            if (i == 404) {
                return new NotFoundException(uuid, list, th);
            }
            if (i == 409) {
                return new ConflictException(uuid, list, th);
            }
            if (i == 422) {
                return new UnprocessableEntityException(uuid, list, th);
            }
            if (500 <= i && 599 >= i) {
                return new ServerErrorException(uuid, list, th);
            }
            return new ServiceRequestException(uuid, list, th);
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ ServiceException(UUID uuid, List list, Throwable th, int i, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i & 2) != 0) {
            list = C13185o.m40513a();
        }
        if ((i & 4) != 0) {
            th = null;
        }
        this(uuid, list, th);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ServiceException)) {
            return false;
        }
        ServiceException serviceException = (ServiceException) obj;
        return !(Intrinsics.areEqual((Object) this.transactionId, (Object) serviceException.transactionId) ^ true) && !(Intrinsics.areEqual((Object) this.errors, (Object) serviceException.errors) ^ true);
    }

    public final List<ErrorReason> getErrors() {
        return this.errors;
    }

    public String getMessage() {
        return toString();
    }

    public int hashCode() {
        return (this.transactionId.hashCode() * 31) + this.errors.hashCode();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append("(transactionId=");
        sb.append(this.transactionId);
        sb.append(", errors=");
        sb.append(this.errors);
        sb.append(')');
        return sb.toString();
    }

    public ServiceException(UUID uuid, List<? extends ErrorReason> list, Throwable th) {
        super(th);
        this.transactionId = uuid;
        this.errors = list;
    }
}
