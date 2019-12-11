package com.bamtech.sdk4.internal.identity.bam;

import com.bamtech.sdk4.internal.service.ServiceTransaction;
import java.util.Map;
import kotlin.Metadata;
import p520io.reactivex.Completable;
import p520io.reactivex.Single;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b`\u0018\u00002\u00020\u0001J6\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0016\u0010\t\u001a\u0012\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u000b0\nj\u0002`\fH&J2\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00032\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u000f2\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u000b0\nH&J2\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\u00032\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00122\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u000b0\nH&J,\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00152\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u000b0\nH&¨\u0006\u0016"}, mo31007d2 = {"Lcom/bamtech/sdk4/internal/identity/bam/AuthenticationClient;", "", "authenticate", "Lio/reactivex/Single;", "Lcom/bamtech/sdk4/internal/identity/bam/LoginResponse;", "transaction", "Lcom/bamtech/sdk4/internal/service/ServiceTransaction;", "request", "Lcom/bamtech/sdk4/internal/identity/bam/AuthenticationRequest;", "tokenMap", "", "", "Lcom/bamtech/sdk4/internal/service/TokenMap;", "check", "Lcom/bamtech/sdk4/internal/identity/bam/AuthenticationFlowResponse;", "Lcom/bamtech/sdk4/internal/identity/bam/CheckRequest;", "redeemOnetimePasscode", "Lcom/bamtech/sdk4/internal/identity/bam/OtpRedeemResponse;", "Lcom/bamtech/sdk4/internal/identity/bam/OneTimePasscodeRedeemRequest;", "requestOneTimePasscode", "Lio/reactivex/Completable;", "Lcom/bamtech/sdk4/internal/identity/bam/OneTimePasscodeRequest;", "plugin-identity-bam"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* compiled from: AuthenticationClient.kt */
public interface AuthenticationClient {
    Single<LoginResponse> authenticate(ServiceTransaction serviceTransaction, AuthenticationRequest authenticationRequest, Map<String, String> map);

    Single<AuthenticationFlowResponse> check(ServiceTransaction serviceTransaction, CheckRequest checkRequest, Map<String, String> map);

    Single<OtpRedeemResponse> redeemOnetimePasscode(ServiceTransaction serviceTransaction, OneTimePasscodeRedeemRequest oneTimePasscodeRedeemRequest, Map<String, String> map);

    Completable requestOneTimePasscode(ServiceTransaction serviceTransaction, OneTimePasscodeRequest oneTimePasscodeRequest, Map<String, String> map);
}
