package com.bamtech.sdk4.internal.identity.bam;

import com.bamtech.sdk4.identity.bam.RedeemedPasscodeToken;
import kotlin.Metadata;
import p520io.reactivex.functions.Function;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0003"}, mo31007d2 = {"<anonymous>", "Lcom/bamtech/sdk4/identity/bam/RedeemedPasscodeToken;", "it", "apply"}, mo31008k = 3, mo31009mv = {1, 1, 15})
/* compiled from: AuthenticationManager.kt */
final class DefaultAuthenticationManager$redeemOneTimePasscode$3<T, R> implements Function<T, R> {
    final /* synthetic */ DefaultAuthenticationManager this$0;

    DefaultAuthenticationManager$redeemOneTimePasscode$3(DefaultAuthenticationManager defaultAuthenticationManager) {
        this.this$0 = defaultAuthenticationManager;
    }

    public /* bridge */ /* synthetic */ Object apply(Object obj) {
        RedeemedPasscodeToken redeemedPasscodeToken = (RedeemedPasscodeToken) obj;
        apply(redeemedPasscodeToken);
        return redeemedPasscodeToken;
    }

    public final RedeemedPasscodeToken apply(RedeemedPasscodeToken redeemedPasscodeToken) {
        BamIdentityTokenKt.saveIdentity(this.this$0.storage, redeemedPasscodeToken, this.this$0.flowConverter);
        return redeemedPasscodeToken;
    }
}
