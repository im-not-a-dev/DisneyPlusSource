package com.bamtech.sdk4.internal.identity.bam;

import com.bamtech.core.networking.converters.Converter;
import com.bamtech.sdk4.identity.IdentityToken;
import com.bamtech.sdk4.identity.bam.AuthenticationFlow;
import com.bamtech.sdk4.identity.bam.OneTimePasscodeRequestReason;
import com.bamtech.sdk4.identity.bam.RedeemedPasscodeToken;
import com.bamtech.sdk4.internal.configuration.BamIdentityServiceExtras;
import com.bamtech.sdk4.internal.configuration.ConfigurationProvider;
import com.bamtech.sdk4.internal.core.Storage;
import com.bamtech.sdk4.internal.service.ServiceTransaction;
import com.bamtech.sdk4.internal.token.AccessTokenProvider;
import java.util.List;
import java.util.concurrent.Callable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.joda.time.DateTime;
import p520io.reactivex.Completable;
import p520io.reactivex.CompletableSource;
import p520io.reactivex.Single;
import p520io.reactivex.SingleSource;
import p520io.reactivex.functions.C11945a;
import p520io.reactivex.functions.C11946b;
import p520io.reactivex.functions.Consumer;
import p520io.reactivex.functions.Function;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B1\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\b\b\u0001\u0010\n\u001a\u00020\u000b¢\u0006\u0002\u0010\fJ&\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e2\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0014H\u0016J\u001e\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e2\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0017\u001a\u00020\u0018H\u0002JC\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e\"\u0004\b\u0000\u0010\u001a2\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00142\b\u0010\u001b\u001a\u0004\u0018\u0001H\u001a2\u0006\u0010\u001c\u001a\u00020\u001dH\u0016¢\u0006\u0002\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020 2\u0006\u0010\u0011\u001a\u00020\u0012H\u0016J$\u0010!\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020#0\"0\u000e2\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014H\u0016J&\u0010$\u001a\b\u0012\u0004\u0012\u00020%0\u000e2\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010&\u001a\u00020\u0014H\u0016J\"\u0010'\u001a\u00020 2\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\b\u0010(\u001a\u0004\u0018\u00010)H\u0016J\u0010\u0010*\u001a\u00020\u001d2\u0006\u0010\u0011\u001a\u00020\u0012H\u0016J\u001e\u0010+\u001a\b\u0012\u0004\u0012\u0002H\u001a0\u000e\"\u0004\b\u0000\u0010\u001a*\b\u0012\u0004\u0012\u0002H\u001a0\u000eH\u0002R\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000eX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0004¢\u0006\u0002\n\u0000¨\u0006,"}, mo31007d2 = {"Lcom/bamtech/sdk4/internal/identity/bam/DefaultAuthenticationManager;", "Lcom/bamtech/sdk4/internal/identity/bam/AuthenticationManager;", "configurationProvider", "Lcom/bamtech/sdk4/internal/configuration/ConfigurationProvider;", "client", "Lcom/bamtech/sdk4/internal/identity/bam/IdentityClient;", "accessTokenProvider", "Lcom/bamtech/sdk4/internal/token/AccessTokenProvider;", "storage", "Lcom/bamtech/sdk4/internal/core/Storage;", "flowConverter", "Lcom/bamtech/core/networking/converters/Converter;", "(Lcom/bamtech/sdk4/internal/configuration/ConfigurationProvider;Lcom/bamtech/sdk4/internal/identity/bam/IdentityClient;Lcom/bamtech/sdk4/internal/token/AccessTokenProvider;Lcom/bamtech/sdk4/internal/core/Storage;Lcom/bamtech/core/networking/converters/Converter;)V", "authenticateProcess", "Lio/reactivex/Single;", "Lcom/bamtech/sdk4/identity/IdentityToken;", "authenticate", "transaction", "Lcom/bamtech/sdk4/internal/service/ServiceTransaction;", "email", "", "password", "authenticateTask", "request", "Lcom/bamtech/sdk4/internal/identity/bam/AuthenticationRequest;", "create", "T", "attributes", "isTest", "", "(Lcom/bamtech/sdk4/internal/service/ServiceTransaction;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;Z)Lio/reactivex/Single;", "deauthenticate", "Lio/reactivex/Completable;", "getAuthenticationFlow", "", "Lcom/bamtech/sdk4/identity/bam/AuthenticationFlow;", "redeemOneTimePasscode", "Lcom/bamtech/sdk4/identity/bam/RedeemedPasscodeToken;", "passcode", "requestOneTimePasscode", "reason", "Lcom/bamtech/sdk4/identity/bam/OneTimePasscodeRequestReason;", "requiresAuthentication", "releaseLockOnTerminate", "plugin-identity-bam"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* compiled from: AuthenticationManager.kt */
public final class DefaultAuthenticationManager implements AuthenticationManager {
    /* access modifiers changed from: private */
    public final AccessTokenProvider accessTokenProvider;
    /* access modifiers changed from: private */
    public Single<IdentityToken> authenticateProcess;
    /* access modifiers changed from: private */
    public final IdentityClient client;
    private final ConfigurationProvider configurationProvider;
    /* access modifiers changed from: private */
    public final Converter flowConverter;
    /* access modifiers changed from: private */
    public final Storage storage;

    public DefaultAuthenticationManager(ConfigurationProvider configurationProvider2, IdentityClient identityClient, AccessTokenProvider accessTokenProvider2, Storage storage2, Converter converter) {
        this.configurationProvider = configurationProvider2;
        this.client = identityClient;
        this.accessTokenProvider = accessTokenProvider2;
        this.storage = storage2;
        this.flowConverter = converter;
    }

    /* access modifiers changed from: private */
    public final Single<IdentityToken> authenticateTask(ServiceTransaction serviceTransaction, AuthenticationRequest authenticationRequest) {
        Single<IdentityToken> b = this.accessTokenProvider.getAccessToken(serviceTransaction).mo30208a((Function<? super T, ? extends SingleSource<? extends R>>) new DefaultAuthenticationManager$authenticateTask$1<Object,Object>(this, serviceTransaction, authenticationRequest)).mo30233g(new DefaultAuthenticationManager$authenticateTask$2(this)).mo30226d().mo30218b((Consumer<? super Throwable>) new DefaultAuthenticationManager$authenticateTask$3<Object>(this, serviceTransaction));
        Intrinsics.checkReturnedValueIsNotNull((Object) b, "accessTokenProvider.getA…essage)\n                }");
        return b;
    }

    /* access modifiers changed from: private */
    public final <T> Single<T> releaseLockOnTerminate(Single<T> single) {
        DefaultAuthenticationManager$releaseLockOnTerminate$1 defaultAuthenticationManager$releaseLockOnTerminate$1 = new DefaultAuthenticationManager$releaseLockOnTerminate$1(this, single);
        Single<T> a = single.mo30223c((C11945a) new DefaultAuthenticationManager$releaseLockOnTerminate$2(defaultAuthenticationManager$releaseLockOnTerminate$1)).mo30210a((C11946b<? super T, ? super Throwable>) new DefaultAuthenticationManager$releaseLockOnTerminate$3<Object,Object>(defaultAuthenticationManager$releaseLockOnTerminate$1));
        Intrinsics.checkReturnedValueIsNotNull((Object) a, "doOnDispose {\n          …eanUp()\n                }");
        return a;
    }

    public synchronized Single<IdentityToken> authenticate(ServiceTransaction serviceTransaction, String str, String str2) {
        Single<IdentityToken> a;
        a = Single.m38396a((Callable<? extends SingleSource<? extends T>>) new DefaultAuthenticationManager$authenticate$1<Object>(this, serviceTransaction, str, str2));
        Intrinsics.checkReturnedValueIsNotNull((Object) a, "Single.defer<IdentityTok…         }\n\n            }");
        return a;
    }

    public <T> Single<IdentityToken> create(ServiceTransaction serviceTransaction, String str, String str2, T t, boolean z) {
        DefaultAuthenticationManager$create$1 defaultAuthenticationManager$create$1 = new DefaultAuthenticationManager$create$1(this, serviceTransaction, z, str, str2, t);
        Single<IdentityToken> a = Single.m38396a((Callable<? extends SingleSource<? extends T>>) defaultAuthenticationManager$create$1);
        Intrinsics.checkReturnedValueIsNotNull((Object) a, "Single.defer<IdentityTok…          }\n            }");
        return a;
    }

    public Single<List<AuthenticationFlow>> getAuthenticationFlow(ServiceTransaction serviceTransaction, String str) {
        Single<List<AuthenticationFlow>> g = this.accessTokenProvider.getAccessToken(serviceTransaction).mo30208a((Function<? super T, ? extends SingleSource<? extends R>>) new DefaultAuthenticationManager$getAuthenticationFlow$1<Object,Object>(this, serviceTransaction, str)).mo30233g(DefaultAuthenticationManager$getAuthenticationFlow$2.INSTANCE);
        Intrinsics.checkReturnedValueIsNotNull((Object) g, "accessTokenProvider.getA…rations\n                }");
        return g;
    }

    public Single<RedeemedPasscodeToken> redeemOneTimePasscode(ServiceTransaction serviceTransaction, String str, String str2) {
        Single<RedeemedPasscodeToken> g = this.accessTokenProvider.getAccessToken(serviceTransaction).mo30208a((Function<? super T, ? extends SingleSource<? extends R>>) new DefaultAuthenticationManager$redeemOneTimePasscode$1<Object,Object>(this, serviceTransaction, str, str2)).mo30233g(DefaultAuthenticationManager$redeemOneTimePasscode$2.INSTANCE).mo30233g(new DefaultAuthenticationManager$redeemOneTimePasscode$3(this));
        Intrinsics.checkReturnedValueIsNotNull((Object) g, "accessTokenProvider.getA…     it\n                }");
        return g;
    }

    public Completable requestOneTimePasscode(ServiceTransaction serviceTransaction, String str, OneTimePasscodeRequestReason oneTimePasscodeRequestReason) {
        Completable b = this.accessTokenProvider.getAccessToken(serviceTransaction).mo30217b((Function<? super T, ? extends CompletableSource>) new DefaultAuthenticationManager$requestOneTimePasscode$1<Object,Object>(this, serviceTransaction, str, oneTimePasscodeRequestReason));
        Intrinsics.checkReturnedValueIsNotNull((Object) b, "accessTokenProvider.getA…kenMap)\n                }");
        return b;
    }

    public boolean requiresAuthentication(ServiceTransaction serviceTransaction) {
        BamIdentityServiceExtras bamIdentityServiceExtras = (BamIdentityServiceExtras) this.configurationProvider.getServiceConfigurationExtras(serviceTransaction, C1882xde0ab955.INSTANCE).mo30224c();
        IdentityToken identity = BamIdentityTokenKt.getIdentity(this.storage, this.flowConverter);
        if (identity == null) {
            return false;
        }
        if (identity.getIssuedAt().isAfterNow()) {
            return true;
        }
        DateTime plusSeconds = identity.getIssuedAt().plusSeconds(identity.getExpiresIn() - bamIdentityServiceExtras.getExpirationBufferSeconds());
        Intrinsics.checkReturnedValueIsNotNull((Object) plusSeconds, "expiration");
        return plusSeconds.isBeforeNow();
    }
}
