package com.bamtech.sdk4.internal.identity.bam;

import com.bamtech.sdk4.identity.bam.RedeemedPasscodeToken;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.joda.time.DateTime;
import org.joda.time.DateTimeZone;
import p520io.reactivex.functions.Function;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, mo31007d2 = {"<anonymous>", "Lcom/bamtech/sdk4/identity/bam/RedeemedPasscodeToken;", "it", "Lcom/bamtech/sdk4/internal/identity/bam/OtpRedeemResponse;", "apply"}, mo31008k = 3, mo31009mv = {1, 1, 15})
/* compiled from: AuthenticationManager.kt */
final class DefaultAuthenticationManager$redeemOneTimePasscode$2<T, R> implements Function<T, R> {
    public static final DefaultAuthenticationManager$redeemOneTimePasscode$2 INSTANCE = new DefaultAuthenticationManager$redeemOneTimePasscode$2();

    DefaultAuthenticationManager$redeemOneTimePasscode$2() {
    }

    public final RedeemedPasscodeToken apply(OtpRedeemResponse otpRedeemResponse) {
        String tokenId = otpRedeemResponse.getTokenId();
        int expiresIn = otpRedeemResponse.getExpiresIn();
        DateTime now = DateTime.now(DateTimeZone.UTC);
        Intrinsics.checkReturnedValueIsNotNull((Object) now, "DateTime.now(DateTimeZone.UTC)");
        RedeemedPasscodeToken redeemedPasscodeToken = new RedeemedPasscodeToken(tokenId, expiresIn, now, otpRedeemResponse.getSecurityAction(), otpRedeemResponse.getReason());
        return redeemedPasscodeToken;
    }
}
