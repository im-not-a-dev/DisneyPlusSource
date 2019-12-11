package com.bamtech.sdk4.service;

import kotlin.Metadata;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\b\u001a\u00020\u0003H\u0016R\u0014\u0010\u0002\u001a\u00020\u00038VX\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0016\u0010\u0006\u001a\u0004\u0018\u00010\u00038VX\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\u0005¨\u0006\t"}, mo31007d2 = {"com/bamtech/sdk4/service/IllegalArgumentException$Companion$init$reason$1", "Lcom/bamtech/sdk4/service/ErrorReason;", "code", "", "getCode", "()Ljava/lang/String;", "description", "getDescription", "toString", "sdk-service"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* compiled from: ServiceExceptions.kt */
public final class IllegalArgumentException$Companion$init$reason$1 implements ErrorReason {
    final /* synthetic */ String $code;
    final /* synthetic */ String $description;

    IllegalArgumentException$Companion$init$reason$1(String str, String str2) {
        this.$code = str;
        this.$description = str2;
    }

    public String getCode() {
        return this.$code;
    }

    public String getDescription() {
        return this.$description;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(ErrorReason.class.getSimpleName());
        sb.append('(');
        sb.append(this.$code);
        sb.append(", ");
        sb.append(this.$description);
        sb.append(')');
        return sb.toString();
    }
}
