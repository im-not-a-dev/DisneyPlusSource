package com.bamtech.sdk4.internal.identity.bam;

import com.bamtech.sdk4.identity.IdentityToken;
import com.bamtech.sdk4.identity.bam.AuthenticationFlow;
import com.bamtech.sdk4.identity.bam.OneTimePasscodeRequestReason;
import com.bamtech.sdk4.identity.bam.RedeemedPasscodeToken;
import com.bamtech.sdk4.internal.service.ServiceTransaction;
import java.util.List;
import kotlin.Metadata;
import p520io.reactivex.Completable;
import p520io.reactivex.Single;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\b\u0000\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004B\u001f\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0002\u0010\u000bJ'\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0012H\u0001J#\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u000f\u001a\u00020\u00102\b\u0010\u0016\u001a\u0004\u0018\u00010\u00122\u0006\u0010\u0017\u001a\u00020\u0012H\u0001JH\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u000e0\r\"\u0004\b\u0000\u0010\u00192\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00122\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u0001H\u00192\b\b\u0002\u0010\u001b\u001a\u00020\u001cH\u0001¢\u0006\u0002\u0010\u001dJ\u0011\u0010\u001e\u001a\u00020\u00152\u0006\u0010\u000f\u001a\u00020\u0010H\u0001J%\u0010\u001f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020!0 0\r2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0001J\u0017\u0010\"\u001a\b\u0012\u0004\u0012\u00020#0\r2\u0006\u0010\u000f\u001a\u00020\u0010H\u0001J/\u0010\"\u001a\b\u0012\u0004\u0012\u0002H\u00190\r\"\b\b\u0000\u0010\u0019*\u00020$2\u0006\u0010\u000f\u001a\u00020\u00102\f\u0010%\u001a\b\u0012\u0004\u0012\u0002H\u00190&H\u0001J'\u0010'\u001a\b\u0012\u0004\u0012\u00020(0\r2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010)\u001a\u00020\u0012H\u0001J#\u0010*\u001a\u00020\u00152\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\b\u0010+\u001a\u0004\u0018\u00010,H\u0001J\u0019\u0010-\u001a\u00020\u00152\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0001J\u0011\u0010.\u001a\u00020\u001c2\u0006\u0010\u000f\u001a\u00020\u0010H\u0001J!\u0010/\u001a\u00020\u00152\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0017\u001a\u00020\u00122\u0006\u00100\u001a\u00020\u0012H\u0001J$\u00101\u001a\u00020\u0015\"\u0004\b\u0000\u0010\u00192\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u001a\u001a\u0002H\u0019H\u0001¢\u0006\u0002\u00102J!\u00103\u001a\u00020\u00152\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u00104\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0012H\u0001¨\u00065"}, mo31007d2 = {"Lcom/bamtech/sdk4/internal/identity/bam/DefaultIdentityManager;", "Lcom/bamtech/sdk4/internal/identity/bam/IdentityManager;", "Lcom/bamtech/sdk4/internal/identity/bam/AuthenticationManager;", "Lcom/bamtech/sdk4/internal/identity/bam/PasswordManager;", "Lcom/bamtech/sdk4/internal/identity/bam/BaseIdentityManager;", "authenticationManager", "Lcom/bamtech/sdk4/internal/identity/bam/DefaultAuthenticationManager;", "passwordManager", "Lcom/bamtech/sdk4/internal/identity/bam/DefaultPasswordManager;", "baseIdentityManager", "Lcom/bamtech/sdk4/internal/identity/bam/DefaultBaseIdentityManager;", "(Lcom/bamtech/sdk4/internal/identity/bam/DefaultAuthenticationManager;Lcom/bamtech/sdk4/internal/identity/bam/DefaultPasswordManager;Lcom/bamtech/sdk4/internal/identity/bam/DefaultBaseIdentityManager;)V", "authenticate", "Lio/reactivex/Single;", "Lcom/bamtech/sdk4/identity/IdentityToken;", "transaction", "Lcom/bamtech/sdk4/internal/service/ServiceTransaction;", "email", "", "password", "changePassword", "Lio/reactivex/Completable;", "oldPassword", "newPassword", "create", "T", "attributes", "isTest", "", "(Lcom/bamtech/sdk4/internal/service/ServiceTransaction;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;Z)Lio/reactivex/Single;", "deauthenticate", "getAuthenticationFlow", "", "Lcom/bamtech/sdk4/identity/bam/AuthenticationFlow;", "getIdentity", "Lcom/bamtech/sdk4/identity/bam/DefaultIdentity;", "Lcom/bamtech/sdk4/identity/bam/Identity;", "identityType", "Ljava/lang/Class;", "redeemOneTimePasscode", "Lcom/bamtech/sdk4/identity/bam/RedeemedPasscodeToken;", "passcode", "requestOneTimePasscode", "reason", "Lcom/bamtech/sdk4/identity/bam/OneTimePasscodeRequestReason;", "requestPasswordReset", "requiresAuthentication", "resetPassword", "resetToken", "updateAttributes", "(Lcom/bamtech/sdk4/internal/service/ServiceTransaction;Ljava/lang/Object;)Lio/reactivex/Completable;", "updateEmail", "newEmail", "plugin-identity-bam"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* compiled from: IdentityManager.kt */
public final class DefaultIdentityManager implements IdentityManager, AuthenticationManager, PasswordManager, BaseIdentityManager {
    private final /* synthetic */ DefaultAuthenticationManager $$delegate_0;
    private final /* synthetic */ DefaultPasswordManager $$delegate_1;

    public DefaultIdentityManager(DefaultAuthenticationManager defaultAuthenticationManager, DefaultPasswordManager defaultPasswordManager, DefaultBaseIdentityManager defaultBaseIdentityManager) {
        this.$$delegate_0 = defaultAuthenticationManager;
        this.$$delegate_1 = defaultPasswordManager;
    }

    public Single<IdentityToken> authenticate(ServiceTransaction serviceTransaction, String str, String str2) {
        return this.$$delegate_0.authenticate(serviceTransaction, str, str2);
    }

    public Completable changePassword(ServiceTransaction serviceTransaction, String str, String str2) {
        return this.$$delegate_1.changePassword(serviceTransaction, str, str2);
    }

    public <T> Single<IdentityToken> create(ServiceTransaction serviceTransaction, String str, String str2, T t, boolean z) {
        return this.$$delegate_0.create(serviceTransaction, str, str2, t, z);
    }

    public Single<List<AuthenticationFlow>> getAuthenticationFlow(ServiceTransaction serviceTransaction, String str) {
        return this.$$delegate_0.getAuthenticationFlow(serviceTransaction, str);
    }

    public Single<RedeemedPasscodeToken> redeemOneTimePasscode(ServiceTransaction serviceTransaction, String str, String str2) {
        return this.$$delegate_0.redeemOneTimePasscode(serviceTransaction, str, str2);
    }

    public Completable requestOneTimePasscode(ServiceTransaction serviceTransaction, String str, OneTimePasscodeRequestReason oneTimePasscodeRequestReason) {
        return this.$$delegate_0.requestOneTimePasscode(serviceTransaction, str, oneTimePasscodeRequestReason);
    }

    public boolean requiresAuthentication(ServiceTransaction serviceTransaction) {
        return this.$$delegate_0.requiresAuthentication(serviceTransaction);
    }

    public Completable updateEmail(ServiceTransaction serviceTransaction, String str, String str2) {
        return this.$$delegate_1.updateEmail(serviceTransaction, str, str2);
    }
}
