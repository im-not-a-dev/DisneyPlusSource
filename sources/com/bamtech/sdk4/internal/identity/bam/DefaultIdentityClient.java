package com.bamtech.sdk4.internal.identity.bam;

import com.bamtech.sdk4.internal.service.ServiceTransaction;
import java.util.Map;
import kotlin.Metadata;
import p520io.reactivex.Completable;
import p520io.reactivex.Single;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004B\u001f\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0002\u0010\u000bJ7\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0016\u0010\u0013\u001a\u0012\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00150\u0014j\u0002`\u0016H\u0001J-\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00192\u0012\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00150\u0014H\u0001J-\u0010\u001a\u001a\u00020\u00182\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u001b2\u0012\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00150\u0014H\u0001J3\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001d0\r2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u001e2\u0012\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00150\u0014H\u0001J-\u0010\u001f\u001a\u00020\u00182\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020 2\u0012\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00150\u0014H\u0001J3\u0010!\u001a\b\u0012\u0004\u0012\u00020\"0\r2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020#2\u0012\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00150\u0014H\u0001J=\u0010$\u001a\u00020\u0018\"\u0004\b\u0000\u0010%2\u0006\u0010\u000f\u001a\u00020\u00102\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u0002H%0&2\u0016\u0010\u0013\u001a\u0012\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00150\u0014j\u0002`\u0016H\u0001J-\u0010'\u001a\u00020\u00182\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020(2\u0012\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00150\u0014H\u0001J-\u0010)\u001a\u00020\u00182\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020*2\u0012\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00150\u0014H\u0001¨\u0006+"}, mo31007d2 = {"Lcom/bamtech/sdk4/internal/identity/bam/DefaultIdentityClient;", "Lcom/bamtech/sdk4/internal/identity/bam/IdentityClient;", "Lcom/bamtech/sdk4/internal/identity/bam/AuthenticationClient;", "Lcom/bamtech/sdk4/internal/identity/bam/RegistrationClient;", "Lcom/bamtech/sdk4/internal/identity/bam/PasswordClient;", "authenticationClient", "Lcom/bamtech/sdk4/internal/identity/bam/DefaultAuthenticationClient;", "registrationClient", "Lcom/bamtech/sdk4/internal/identity/bam/DefaultRegistrationClient;", "passwordClient", "Lcom/bamtech/sdk4/internal/identity/bam/DefaultPasswordClient;", "(Lcom/bamtech/sdk4/internal/identity/bam/DefaultAuthenticationClient;Lcom/bamtech/sdk4/internal/identity/bam/DefaultRegistrationClient;Lcom/bamtech/sdk4/internal/identity/bam/DefaultPasswordClient;)V", "authenticate", "Lio/reactivex/Single;", "Lcom/bamtech/sdk4/internal/identity/bam/LoginResponse;", "transaction", "Lcom/bamtech/sdk4/internal/service/ServiceTransaction;", "request", "Lcom/bamtech/sdk4/internal/identity/bam/AuthenticationRequest;", "tokenMap", "", "", "Lcom/bamtech/sdk4/internal/service/TokenMap;", "changeEmail", "Lio/reactivex/Completable;", "Lcom/bamtech/sdk4/internal/identity/bam/ChangeEmailRequest;", "changePassword", "Lcom/bamtech/sdk4/internal/identity/bam/ChangePasswordRequest;", "check", "Lcom/bamtech/sdk4/internal/identity/bam/AuthenticationFlowResponse;", "Lcom/bamtech/sdk4/internal/identity/bam/CheckRequest;", "passwordReset", "Lcom/bamtech/sdk4/internal/identity/bam/ResetPasswordRequest;", "redeemOnetimePasscode", "Lcom/bamtech/sdk4/internal/identity/bam/OtpRedeemResponse;", "Lcom/bamtech/sdk4/internal/identity/bam/OneTimePasscodeRedeemRequest;", "register", "T", "Lcom/bamtech/sdk4/internal/identity/bam/RegistrationRequest;", "requestOneTimePasscode", "Lcom/bamtech/sdk4/internal/identity/bam/OneTimePasscodeRequest;", "requestPasswordReset", "Lcom/bamtech/sdk4/internal/identity/bam/StartResetPasswordRequest;", "plugin-identity-bam"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* compiled from: IdentityClient.kt */
public final class DefaultIdentityClient implements IdentityClient, AuthenticationClient, RegistrationClient, PasswordClient {
    private final /* synthetic */ DefaultAuthenticationClient $$delegate_0;
    private final /* synthetic */ DefaultRegistrationClient $$delegate_1;
    private final /* synthetic */ DefaultPasswordClient $$delegate_2;

    public DefaultIdentityClient(DefaultAuthenticationClient defaultAuthenticationClient, DefaultRegistrationClient defaultRegistrationClient, DefaultPasswordClient defaultPasswordClient) {
        this.$$delegate_0 = defaultAuthenticationClient;
        this.$$delegate_1 = defaultRegistrationClient;
        this.$$delegate_2 = defaultPasswordClient;
    }

    public Single<LoginResponse> authenticate(ServiceTransaction serviceTransaction, AuthenticationRequest authenticationRequest, Map<String, String> map) {
        return this.$$delegate_0.authenticate(serviceTransaction, authenticationRequest, map);
    }

    public Completable changeEmail(ServiceTransaction serviceTransaction, ChangeEmailRequest changeEmailRequest, Map<String, String> map) {
        return this.$$delegate_2.changeEmail(serviceTransaction, changeEmailRequest, map);
    }

    public Completable changePassword(ServiceTransaction serviceTransaction, ChangePasswordRequest changePasswordRequest, Map<String, String> map) {
        return this.$$delegate_2.changePassword(serviceTransaction, changePasswordRequest, map);
    }

    public Single<AuthenticationFlowResponse> check(ServiceTransaction serviceTransaction, CheckRequest checkRequest, Map<String, String> map) {
        return this.$$delegate_0.check(serviceTransaction, checkRequest, map);
    }

    public Single<OtpRedeemResponse> redeemOnetimePasscode(ServiceTransaction serviceTransaction, OneTimePasscodeRedeemRequest oneTimePasscodeRedeemRequest, Map<String, String> map) {
        return this.$$delegate_0.redeemOnetimePasscode(serviceTransaction, oneTimePasscodeRedeemRequest, map);
    }

    public <T> Completable register(ServiceTransaction serviceTransaction, RegistrationRequest<T> registrationRequest, Map<String, String> map) {
        return this.$$delegate_1.register(serviceTransaction, registrationRequest, map);
    }

    public Completable requestOneTimePasscode(ServiceTransaction serviceTransaction, OneTimePasscodeRequest oneTimePasscodeRequest, Map<String, String> map) {
        return this.$$delegate_0.requestOneTimePasscode(serviceTransaction, oneTimePasscodeRequest, map);
    }
}
