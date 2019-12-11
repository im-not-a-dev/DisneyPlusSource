package com.bamtech.sdk4.internal.identity.bam;

import com.bamtech.sdk4.identity.IdentityToken;
import com.bamtech.sdk4.identity.bam.BamIdentityToken;
import kotlin.Metadata;
import p520io.reactivex.functions.Function;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, mo31007d2 = {"<anonymous>", "Lcom/bamtech/sdk4/identity/IdentityToken;", "it", "Lcom/bamtech/sdk4/internal/identity/bam/LoginResponse;", "apply"}, mo31008k = 3, mo31009mv = {1, 1, 15})
/* compiled from: AuthenticationManager.kt */
final class DefaultAuthenticationManager$authenticateTask$2<T, R> implements Function<T, R> {
    final /* synthetic */ DefaultAuthenticationManager this$0;

    DefaultAuthenticationManager$authenticateTask$2(DefaultAuthenticationManager defaultAuthenticationManager) {
        this.this$0 = defaultAuthenticationManager;
    }

    public final IdentityToken apply(LoginResponse loginResponse) {
        IdentityToken identityToken = (IdentityToken) loginResponse;
        BamIdentityToken bamIdentityToken = new BamIdentityToken(identityToken.getToken(), identityToken.getExpiresIn(), identityToken.getIssuedAt(), identityToken.getSecurityAction());
        BamIdentityTokenKt.saveIdentity(this.this$0.storage, bamIdentityToken, this.this$0.flowConverter);
        return bamIdentityToken;
    }
}
