package com.bamtech.sdk4.identity.bam;

import com.bamtech.sdk4.identity.IdentityToken;
import com.bamtech.sdk4.plugin.PluginApi;
import java.util.List;
import kotlin.Metadata;
import p520io.reactivex.Completable;
import p520io.reactivex.Single;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\bf\u0018\u00002\u00020\u0001J\u001e\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006H&J\u001e\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u00032\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u0006H&J5\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\"\u0004\b\u0000\u0010\f2\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\n\b\u0002\u0010\r\u001a\u0004\u0018\u0001H\fH&¢\u0006\u0002\u0010\u000eJ?\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\"\u0004\b\u0000\u0010\f2\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\n\b\u0002\u0010\r\u001a\u0004\u0018\u0001H\f2\b\b\u0002\u0010\u000f\u001a\u00020\u0010H&¢\u0006\u0002\u0010\u0011J\b\u0010\u0012\u001a\u00020\u0013H&J\u001c\u0010\u0014\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00160\u00150\u00032\u0006\u0010\u0005\u001a\u00020\u0006H&J\u000e\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00180\u0003H&J&\u0010\u0017\u001a\b\u0012\u0004\u0012\u0002H\f0\u0003\"\b\b\u0000\u0010\f*\u00020\u00192\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u0002H\f0\u001bH&J\u001a\u0010\u001c\u001a\u00020\u00132\u0006\u0010\u0005\u001a\u00020\u00062\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eH&J\u0010\u0010\u001f\u001a\u00020\u00132\u0006\u0010\u0005\u001a\u00020\u0006H&J\b\u0010 \u001a\u00020\u0010H&J\u0018\u0010!\u001a\u00020\u00132\u0006\u0010\"\u001a\u00020\u00062\u0006\u0010#\u001a\u00020\u0006H&J \u0010$\u001a\u00020\u00132\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010%\u001a\u00020\u0006H&J\u001b\u0010&\u001a\u00020\u0013\"\u0004\b\u0000\u0010\f2\u0006\u0010\r\u001a\u0002H\fH&¢\u0006\u0002\u0010'J \u0010(\u001a\u00020\u00132\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010)\u001a\u00020\u00062\u0006\u0010\"\u001a\u00020\u0006H&J\u001a\u0010(\u001a\u00020\u00132\b\u0010)\u001a\u0004\u0018\u00010\u00062\u0006\u0010\"\u001a\u00020\u0006H&¨\u0006*"}, mo31007d2 = {"Lcom/bamtech/sdk4/identity/bam/BamIdentityApi;", "Lcom/bamtech/sdk4/plugin/PluginApi;", "authenticate", "Lio/reactivex/Single;", "Lcom/bamtech/sdk4/identity/IdentityToken;", "email", "", "password", "authenticateWithPasscode", "Lcom/bamtech/sdk4/identity/bam/RedeemedPasscodeToken;", "passcode", "create", "T", "attributes", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)Lio/reactivex/Single;", "isTest", "", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;Z)Lio/reactivex/Single;", "deauthenticate", "Lio/reactivex/Completable;", "getAuthenticationFlow", "", "Lcom/bamtech/sdk4/identity/bam/AuthenticationFlow;", "getIdentity", "Lcom/bamtech/sdk4/identity/bam/DefaultIdentity;", "Lcom/bamtech/sdk4/identity/bam/Identity;", "identityType", "Ljava/lang/Class;", "requestOneTimePasscode", "reason", "Lcom/bamtech/sdk4/identity/bam/OneTimePasscodeRequestReason;", "requestPasswordReset", "requiresAuthentication", "resetPassword", "newPassword", "resetToken", "updateEmail", "newEmail", "updateIdentityAttributes", "(Ljava/lang/Object;)Lio/reactivex/Completable;", "updatePassword", "oldPassword", "plugin-identity-bam"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* compiled from: BamIdentityApi.kt */
public interface BamIdentityApi extends PluginApi {
    Single<IdentityToken> authenticate(String str, String str2);

    Single<RedeemedPasscodeToken> authenticateWithPasscode(String str, String str2);

    <T> Single<IdentityToken> create(String str, String str2, T t);

    Single<List<AuthenticationFlow>> getAuthenticationFlow(String str);

    Completable requestOneTimePasscode(String str, OneTimePasscodeRequestReason oneTimePasscodeRequestReason);

    boolean requiresAuthentication();

    Completable updateEmail(String str, String str2, String str3);

    Completable updatePassword(String str, String str2);
}
