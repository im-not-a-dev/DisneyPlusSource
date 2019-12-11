package com.bamtech.sdk4.internal.service;

import com.bamtech.sdk4.service.ErrorReason;
import kotlin.Metadata;
import kotlin.jvm.internal.C12880j;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u00002\u00020\u0001:\u0001\u0012B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0005J\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eH\u0002J\b\u0010\u000f\u001a\u00020\u0010H\u0016J\b\u0010\u0011\u001a\u00020\u0003H\u0016R\u0014\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\u0007\"\u0004\b\t\u0010\n¨\u0006\u0013"}, mo31007d2 = {"Lcom/bamtech/sdk4/internal/service/ServiceError;", "Lcom/bamtech/sdk4/service/ErrorReason;", "code", "", "description", "(Ljava/lang/String;Ljava/lang/String;)V", "getCode", "()Ljava/lang/String;", "getDescription", "setDescription", "(Ljava/lang/String;)V", "equals", "", "other", "", "hashCode", "", "toString", "Collection", "sdk-service"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* compiled from: ServiceErrorsResponse.kt */
public final class ServiceError implements ErrorReason {
    private final String code;
    private String description;

    public ServiceError(String str, String str2) {
        this.code = str;
        this.description = str2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ServiceError) && !(C12880j.m40224a((Object) getCode(), (Object) ((ServiceError) obj).getCode()) ^ true);
    }

    public String getCode() {
        return this.code;
    }

    public String getDescription() {
        return this.description;
    }

    public int hashCode() {
        return getCode().hashCode();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("(code='");
        sb.append(getCode());
        sb.append("', description=");
        sb.append(getDescription());
        sb.append(')');
        return sb.toString();
    }

    public /* synthetic */ ServiceError(String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i & 2) != 0) {
            str2 = null;
        }
        this(str, str2);
    }
}
