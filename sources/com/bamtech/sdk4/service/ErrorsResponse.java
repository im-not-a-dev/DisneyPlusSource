package com.bamtech.sdk4.service;

import com.bamtech.core.annotations.android.DontObfuscate;
import java.util.List;
import kotlin.Metadata;

@DontObfuscate
@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001R\u0018\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, mo31007d2 = {"Lcom/bamtech/sdk4/service/ErrorsResponse;", "", "errors", "", "Lcom/bamtech/sdk4/service/ErrorReason;", "getErrors", "()Ljava/util/List;", "sdk-base"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* compiled from: ErrorsResponse.kt */
public interface ErrorsResponse {
    List<ErrorReason> getErrors();
}
