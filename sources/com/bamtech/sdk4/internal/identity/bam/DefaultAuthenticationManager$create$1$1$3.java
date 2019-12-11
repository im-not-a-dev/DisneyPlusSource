package com.bamtech.sdk4.internal.identity.bam;

import com.bamtech.sdk4.identity.IdentityToken;
import kotlin.Metadata;
import p520io.reactivex.functions.Function;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0002\b\u0005"}, mo31007d2 = {"<anonymous>", "Lcom/bamtech/sdk4/identity/IdentityToken;", "T", "it", "Lcom/bamtech/sdk4/internal/identity/bam/LoginResponse;", "apply"}, mo31008k = 3, mo31009mv = {1, 1, 15})
/* compiled from: AuthenticationManager.kt */
final class DefaultAuthenticationManager$create$1$1$3<T, R> implements Function<T, R> {
    public static final DefaultAuthenticationManager$create$1$1$3 INSTANCE = new DefaultAuthenticationManager$create$1$1$3();

    DefaultAuthenticationManager$create$1$1$3() {
    }

    public final IdentityToken apply(LoginResponse loginResponse) {
        return (IdentityToken) loginResponse;
    }
}
