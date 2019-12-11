package com.bamtech.sdk4.identity.bam;

import com.bamtech.sdk4.identity.IdentityToken;
import com.bamtech.sdk4.internal.identity.bam.AuthenticationManager.DefaultImpls;
import com.bamtech.sdk4.internal.identity.bam.IdentityManager;
import com.bamtech.sdk4.internal.service.ServiceTransaction;
import com.bamtech.sdk4.internal.telemetry.dust.DustExtensionsKt;
import java.util.List;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.internal.C12880j;
import p520io.reactivex.Completable;
import p520io.reactivex.CompletableSource;
import p520io.reactivex.Single;
import p520io.reactivex.functions.Function;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\b\u0000\u0018\u00002\u00020\u0001B#\b\u0007\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003¢\u0006\u0002\u0010\u0007J&\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u0006\u0010\u000b\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\rH\u0002J\u001e\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\rH\u0016J\u001e\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\t2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\rH\u0016J3\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\n0\t\"\u0004\b\u0000\u0010\u00132\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\r2\b\u0010\u0014\u001a\u0004\u0018\u0001H\u0013H\u0016¢\u0006\u0002\u0010\u0015J;\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\n0\t\"\u0004\b\u0000\u0010\u00132\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\r2\b\u0010\u0014\u001a\u0004\u0018\u0001H\u00132\u0006\u0010\u0016\u001a\u00020\u0017H\u0016¢\u0006\u0002\u0010\u0018J\b\u0010\u0019\u001a\u00020\u001aH\u0016J\u0010\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u000b\u001a\u00020\u0004H\u0002J\u001c\u0010\u001b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001d0\u001c0\t2\u0006\u0010\f\u001a\u00020\rH\u0016J\u000e\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001f0\tH\u0016J&\u0010\u001e\u001a\b\u0012\u0004\u0012\u0002H\u00130\t\"\b\b\u0000\u0010\u0013*\u00020 2\f\u0010!\u001a\b\u0012\u0004\u0012\u0002H\u00130\"H\u0016J\u001a\u0010#\u001a\u00020\u001a2\u0006\u0010\f\u001a\u00020\r2\b\u0010$\u001a\u0004\u0018\u00010%H\u0016J\u0010\u0010&\u001a\u00020\u001a2\u0006\u0010\f\u001a\u00020\rH\u0016J\b\u0010'\u001a\u00020\u0017H\u0016J\u0018\u0010(\u001a\u00020\u001a2\u0006\u0010)\u001a\u00020\r2\u0006\u0010*\u001a\u00020\rH\u0016J \u0010+\u001a\u00020\u001a2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010,\u001a\u00020\rH\u0016J\u001b\u0010-\u001a\u00020\u001a\"\u0004\b\u0000\u0010\u00132\u0006\u0010\u0014\u001a\u0002H\u0013H\u0016¢\u0006\u0002\u0010.J \u0010/\u001a\u00020\u001a2\u0006\u0010\f\u001a\u00020\r2\u0006\u00100\u001a\u00020\r2\u0006\u0010)\u001a\u00020\rH\u0016J\u001a\u0010/\u001a\u00020\u001a2\b\u00100\u001a\u0004\u0018\u00010\r2\u0006\u0010)\u001a\u00020\rH\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003X\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0004¢\u0006\u0002\n\u0000¨\u00061"}, mo31007d2 = {"Lcom/bamtech/sdk4/identity/bam/DefaultBamIdentityApi;", "Lcom/bamtech/sdk4/identity/bam/BamIdentityApi;", "transactionProvider", "Ljavax/inject/Provider;", "Lcom/bamtech/sdk4/internal/service/ServiceTransaction;", "identityManager", "Lcom/bamtech/sdk4/internal/identity/bam/IdentityManager;", "(Ljavax/inject/Provider;Ljavax/inject/Provider;)V", "authenticate", "Lio/reactivex/Single;", "Lcom/bamtech/sdk4/identity/IdentityToken;", "transaction", "email", "", "password", "authenticateWithPasscode", "Lcom/bamtech/sdk4/identity/bam/RedeemedPasscodeToken;", "passcode", "create", "T", "attributes", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)Lio/reactivex/Single;", "isTest", "", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;Z)Lio/reactivex/Single;", "deauthenticate", "Lio/reactivex/Completable;", "getAuthenticationFlow", "", "Lcom/bamtech/sdk4/identity/bam/AuthenticationFlow;", "getIdentity", "Lcom/bamtech/sdk4/identity/bam/DefaultIdentity;", "Lcom/bamtech/sdk4/identity/bam/Identity;", "identityType", "Ljava/lang/Class;", "requestOneTimePasscode", "reason", "Lcom/bamtech/sdk4/identity/bam/OneTimePasscodeRequestReason;", "requestPasswordReset", "requiresAuthentication", "resetPassword", "newPassword", "resetToken", "updateEmail", "newEmail", "updateIdentityAttributes", "(Ljava/lang/Object;)Lio/reactivex/Completable;", "updatePassword", "oldPassword", "plugin-identity-bam"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* compiled from: BamIdentityApi.kt */
public final class DefaultBamIdentityApi implements BamIdentityApi {
    /* access modifiers changed from: private */
    public final Provider<IdentityManager> identityManager;
    private final Provider<ServiceTransaction> transactionProvider;

    public DefaultBamIdentityApi(Provider<ServiceTransaction> provider, Provider<IdentityManager> provider2) {
        this.transactionProvider = provider;
        this.identityManager = provider2;
    }

    public Single<IdentityToken> authenticate(String str, String str2) {
        ServiceTransaction serviceTransaction = (ServiceTransaction) this.transactionProvider.get();
        C12880j.m40222a((Object) serviceTransaction, "transaction");
        return authenticate(serviceTransaction, str, str2);
    }

    public Single<RedeemedPasscodeToken> authenticateWithPasscode(String str, String str2) {
        ServiceTransaction serviceTransaction = (ServiceTransaction) this.transactionProvider.get();
        IdentityManager identityManager2 = (IdentityManager) this.identityManager.get();
        C12880j.m40222a((Object) serviceTransaction, "transaction");
        return DustExtensionsKt.withDust$default(identityManager2.redeemOneTimePasscode(serviceTransaction, str, str2), serviceTransaction, BamIdentityApiKt.getBAMIDP_API_AUTHENTICATE_WITH_PASSCODE(), (Object) null, 4, (Object) null);
    }

    public <T> Single<IdentityToken> create(String str, String str2, T t, boolean z) {
        ServiceTransaction serviceTransaction = (ServiceTransaction) this.transactionProvider.get();
        IdentityManager identityManager2 = (IdentityManager) this.identityManager.get();
        C12880j.m40222a((Object) serviceTransaction, "transaction");
        ServiceTransaction serviceTransaction2 = serviceTransaction;
        return DustExtensionsKt.withDust$default(DefaultImpls.create$default(identityManager2, serviceTransaction2, str, str2, t, false, 16, null), serviceTransaction2, BamIdentityApiKt.getBAMIDP_API_CREATE_IDENTITY(), (Object) null, 4, (Object) null);
    }

    public Single<List<AuthenticationFlow>> getAuthenticationFlow(String str) {
        ServiceTransaction serviceTransaction = (ServiceTransaction) this.transactionProvider.get();
        IdentityManager identityManager2 = (IdentityManager) this.identityManager.get();
        C12880j.m40222a((Object) serviceTransaction, "transaction");
        return DustExtensionsKt.withDust$default(identityManager2.getAuthenticationFlow(serviceTransaction, str), serviceTransaction, BamIdentityApiKt.getBAMIDP_API_REQUEST_AUTHENTICATION_FLOW(), (Object) null, 4, (Object) null);
    }

    public Completable requestOneTimePasscode(String str, OneTimePasscodeRequestReason oneTimePasscodeRequestReason) {
        ServiceTransaction serviceTransaction = (ServiceTransaction) this.transactionProvider.get();
        IdentityManager identityManager2 = (IdentityManager) this.identityManager.get();
        C12880j.m40222a((Object) serviceTransaction, "transaction");
        return DustExtensionsKt.withDust$default(identityManager2.requestOneTimePasscode(serviceTransaction, str, oneTimePasscodeRequestReason), serviceTransaction, BamIdentityApiKt.getBAMIDP_API_REQUEST_ONE_TIME_PASSCODE(), (Object) null, 4, (Object) null);
    }

    public boolean requiresAuthentication() {
        ServiceTransaction serviceTransaction = (ServiceTransaction) this.transactionProvider.get();
        IdentityManager identityManager2 = (IdentityManager) this.identityManager.get();
        C12880j.m40222a((Object) serviceTransaction, "transaction");
        return identityManager2.requiresAuthentication(serviceTransaction);
    }

    public Completable updateEmail(String str, String str2, String str3) {
        ServiceTransaction serviceTransaction = (ServiceTransaction) this.transactionProvider.get();
        C12880j.m40222a((Object) serviceTransaction, "transaction");
        Completable b = authenticate(serviceTransaction, str, str2).mo30217b((Function<? super T, ? extends CompletableSource>) new DefaultBamIdentityApi$updateEmail$1<Object,Object>(this, serviceTransaction, str3, str2));
        C12880j.m40222a((Object) b, "authenticate(transaction…ssword)\n                }");
        return DustExtensionsKt.withDust$default(b, serviceTransaction, BamIdentityApiKt.getBAMIDP_API_UPDATE_EMAIL(), (Object) null, 4, (Object) null);
    }

    public Completable updatePassword(String str, String str2) {
        ServiceTransaction serviceTransaction = (ServiceTransaction) this.transactionProvider.get();
        IdentityManager identityManager2 = (IdentityManager) this.identityManager.get();
        C12880j.m40222a((Object) serviceTransaction, "transaction");
        return DustExtensionsKt.withDust$default(identityManager2.changePassword(serviceTransaction, str, str2), serviceTransaction, BamIdentityApiKt.getBAMIDP_API_UPDATE_PASSWORD(), (Object) null, 4, (Object) null);
    }

    private final Single<IdentityToken> authenticate(ServiceTransaction serviceTransaction, String str, String str2) {
        return DustExtensionsKt.withDust$default(((IdentityManager) this.identityManager.get()).authenticate(serviceTransaction, str, str2), serviceTransaction, BamIdentityApiKt.getBAMIDP_API_AUTHENTICATE_IDENTITY(), (Object) null, 4, (Object) null);
    }

    public <T> Single<IdentityToken> create(String str, String str2, T t) {
        return create(str, str2, t, false);
    }
}
