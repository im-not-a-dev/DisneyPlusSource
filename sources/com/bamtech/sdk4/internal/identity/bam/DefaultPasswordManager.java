package com.bamtech.sdk4.internal.identity.bam;

import com.bamtech.sdk4.identity.IdentityToken;
import com.bamtech.sdk4.internal.service.ServiceTransaction;
import com.bamtech.sdk4.internal.token.AccessTokenProvider;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.internal.C12880j;
import p520io.reactivex.Completable;
import p520io.reactivex.CompletableSource;
import p520io.reactivex.Single;
import p520io.reactivex.functions.C11945a;
import p520io.reactivex.functions.Consumer;
import p520io.reactivex.functions.Function;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B-\b\u0007\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u0001¢\u0006\u0002\u0010\u000bJ\"\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u00052\b\u0010\u0010\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u0012\u001a\u00020\u0011H\u0016J2\u0010\u0013\u001a\u0004\u0018\u00010\r2\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00160\u00152\u0006\u0010\u000f\u001a\u00020\u00052\b\u0010\u0010\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u0012\u001a\u00020\u0011H\u0002J\u0017\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00160\u00152\u0006\u0010\u000f\u001a\u00020\u0005H\u0001J\u0018\u0010\u0018\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u00052\u0006\u0010\u0019\u001a\u00020\u0011H\u0016J \u0010\u001a\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u00052\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u001b\u001a\u00020\u0011H\u0016J \u0010\u001c\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u00052\u0006\u0010\u001d\u001a\u00020\u00112\u0006\u0010\u001e\u001a\u00020\u0011H\u0016R\u000e\u0010\b\u001a\u00020\tX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0001X\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\f\u001a\u0004\u0018\u00010\rX\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0004¢\u0006\u0002\n\u0000¨\u0006\u001f"}, mo31007d2 = {"Lcom/bamtech/sdk4/internal/identity/bam/DefaultPasswordManager;", "Lcom/bamtech/sdk4/internal/identity/bam/CommonIdentityTokenManager;", "Lcom/bamtech/sdk4/internal/identity/bam/PasswordManager;", "transactionProvider", "Ljavax/inject/Provider;", "Lcom/bamtech/sdk4/internal/service/ServiceTransaction;", "client", "Lcom/bamtech/sdk4/internal/identity/bam/IdentityClient;", "accessTokenProvider", "Lcom/bamtech/sdk4/internal/token/AccessTokenProvider;", "commonIdentityTokenManager", "(Ljavax/inject/Provider;Lcom/bamtech/sdk4/internal/identity/bam/IdentityClient;Lcom/bamtech/sdk4/internal/token/AccessTokenProvider;Lcom/bamtech/sdk4/internal/identity/bam/CommonIdentityTokenManager;)V", "tokenTask", "Lio/reactivex/Completable;", "changePassword", "transaction", "oldPassword", "", "newPassword", "changePasswordTask", "identityTokenTask", "Lio/reactivex/Single;", "Lcom/bamtech/sdk4/identity/IdentityToken;", "getIdentityToken", "requestPasswordReset", "email", "resetPassword", "resetToken", "updateEmail", "newEmail", "password", "plugin-identity-bam"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* compiled from: PasswordManager.kt */
public final class DefaultPasswordManager implements CommonIdentityTokenManager, PasswordManager {
    /* access modifiers changed from: private */
    public final IdentityClient client;
    private final CommonIdentityTokenManager commonIdentityTokenManager;
    /* access modifiers changed from: private */
    public Completable tokenTask;

    public DefaultPasswordManager(Provider<ServiceTransaction> provider, IdentityClient identityClient, AccessTokenProvider accessTokenProvider, CommonIdentityTokenManager commonIdentityTokenManager2) {
        this.client = identityClient;
        this.commonIdentityTokenManager = commonIdentityTokenManager2;
    }

    private final Completable changePasswordTask(Single<IdentityToken> single, ServiceTransaction serviceTransaction, String str, String str2) {
        return single.mo30218b((Consumer<? super Throwable>) new DefaultPasswordManager$changePasswordTask$1<Object>(this, serviceTransaction)).mo30217b((Function<? super T, ? extends CompletableSource>) new DefaultPasswordManager$changePasswordTask$2<Object,Object>(this, str, str2, serviceTransaction)).mo30036a((Consumer<? super Throwable>) new DefaultPasswordManager$changePasswordTask$3<Object>(this, serviceTransaction)).mo30038a((C11945a) new DefaultPasswordManager$changePasswordTask$4(this));
    }

    public Completable changePassword(ServiceTransaction serviceTransaction, String str, String str2) {
        if (this.tokenTask == null) {
            this.tokenTask = changePasswordTask(getIdentityToken(serviceTransaction), serviceTransaction, str, str2);
        }
        Completable completable = this.tokenTask;
        if (completable != null) {
            return completable;
        }
        C12880j.m40220a();
        throw null;
    }

    public Single<IdentityToken> getIdentityToken(ServiceTransaction serviceTransaction) {
        return this.commonIdentityTokenManager.getIdentityToken(serviceTransaction);
    }

    public Completable updateEmail(ServiceTransaction serviceTransaction, String str, String str2) {
        Completable b = getIdentityToken(serviceTransaction).mo30217b((Function<? super T, ? extends CompletableSource>) new DefaultPasswordManager$updateEmail$1<Object,Object>(this, serviceTransaction, str, str2));
        C12880j.m40222a((Object) b, "getIdentityToken(transac…ord), tokenMap)\n        }");
        return b;
    }
}
