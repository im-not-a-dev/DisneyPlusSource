package com.bamtech.sdk4.token;

import com.bamtech.core.annotations.android.DontObfuscate;
import kotlin.Metadata;

@DontObfuscate
@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\bg\u0018\u00002\u00020\u0001:\u0002\b\tR\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0012\u0010\u0006\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\u0005¨\u0006\n"}, mo31007d2 = {"Lcom/bamtech/sdk4/token/Grant;", "", "assertion", "", "getAssertion", "()Ljava/lang/String;", "grantType", "getGrantType", "Basic", "Jwt", "sdk-base"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* compiled from: Grant.kt */
public interface Grant {
    String getAssertion();

    String getGrantType();
}
