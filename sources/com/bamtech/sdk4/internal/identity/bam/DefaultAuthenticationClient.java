package com.bamtech.sdk4.internal.identity.bam;

import com.bamtech.core.networking.converters.Converter;
import com.bamtech.core.networking.handlers.ResponseHandler;
import com.bamtech.sdk4.internal.configuration.ConfigurationProvider;
import com.bamtech.sdk4.internal.networking.ConverterProvider;
import com.bamtech.sdk4.internal.service.ServiceTransaction;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.C12880j;
import p520io.reactivex.Completable;
import p520io.reactivex.CompletableSource;
import p520io.reactivex.Single;
import p520io.reactivex.SingleSource;
import p520io.reactivex.functions.Function;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001B!\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ2\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00120\u0011H\u0016J2\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00140\n2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u00152\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00120\u0011H\u0016J\u0016\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00172\u0006\u0010\f\u001a\u00020\rH\u0002J2\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00190\n2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u001a2\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00120\u0011H\u0016J,\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u001d2\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00120\u0011H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000¨\u0006\u001e"}, mo31007d2 = {"Lcom/bamtech/sdk4/internal/identity/bam/DefaultAuthenticationClient;", "Lcom/bamtech/sdk4/internal/identity/bam/AuthenticationClient;", "configurationProvider", "Lcom/bamtech/sdk4/internal/configuration/ConfigurationProvider;", "converters", "Lcom/bamtech/sdk4/internal/networking/ConverterProvider;", "flowConverter", "Lcom/bamtech/core/networking/converters/Converter;", "(Lcom/bamtech/sdk4/internal/configuration/ConfigurationProvider;Lcom/bamtech/sdk4/internal/networking/ConverterProvider;Lcom/bamtech/core/networking/converters/Converter;)V", "authenticate", "Lio/reactivex/Single;", "Lcom/bamtech/sdk4/internal/identity/bam/LoginResponse;", "transaction", "Lcom/bamtech/sdk4/internal/service/ServiceTransaction;", "request", "Lcom/bamtech/sdk4/internal/identity/bam/AuthenticationRequest;", "tokenMap", "", "", "check", "Lcom/bamtech/sdk4/internal/identity/bam/AuthenticationFlowResponse;", "Lcom/bamtech/sdk4/internal/identity/bam/CheckRequest;", "loginResponseHandler", "Lcom/bamtech/core/networking/handlers/ResponseHandler;", "redeemOnetimePasscode", "Lcom/bamtech/sdk4/internal/identity/bam/OtpRedeemResponse;", "Lcom/bamtech/sdk4/internal/identity/bam/OneTimePasscodeRedeemRequest;", "requestOneTimePasscode", "Lio/reactivex/Completable;", "Lcom/bamtech/sdk4/internal/identity/bam/OneTimePasscodeRequest;", "plugin-identity-bam"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* compiled from: AuthenticationClient.kt */
public final class DefaultAuthenticationClient implements AuthenticationClient {
    private final ConfigurationProvider configurationProvider;
    /* access modifiers changed from: private */
    public final ConverterProvider converters;
    /* access modifiers changed from: private */
    public final Converter flowConverter;

    public DefaultAuthenticationClient(ConfigurationProvider configurationProvider2, ConverterProvider converterProvider, Converter converter) {
        this.configurationProvider = configurationProvider2;
        this.converters = converterProvider;
        this.flowConverter = converter;
    }

    /* access modifiers changed from: private */
    public final ResponseHandler<LoginResponse> loginResponseHandler(ServiceTransaction serviceTransaction) {
        return new DefaultAuthenticationClient$loginResponseHandler$1(this, serviceTransaction);
    }

    public Single<LoginResponse> authenticate(ServiceTransaction serviceTransaction, AuthenticationRequest authenticationRequest, Map<String, String> map) {
        Single<LoginResponse> a = this.configurationProvider.getServiceLink(serviceTransaction, DefaultAuthenticationClient$authenticate$1.INSTANCE).mo30208a((Function<? super T, ? extends SingleSource<? extends R>>) new DefaultAuthenticationClient$authenticate$2<Object,Object>(this, map, serviceTransaction, authenticationRequest));
        C12880j.m40222a((Object) a, "configurationProvider.ge…_LOGIN)\n                }");
        return a;
    }

    public Single<AuthenticationFlowResponse> check(ServiceTransaction serviceTransaction, CheckRequest checkRequest, Map<String, String> map) {
        Single<AuthenticationFlowResponse> a = this.configurationProvider.getServiceLink(serviceTransaction, DefaultAuthenticationClient$check$1.INSTANCE).mo30208a((Function<? super T, ? extends SingleSource<? extends R>>) new DefaultAuthenticationClient$check$2<Object,Object>(this, map, serviceTransaction, checkRequest));
        C12880j.m40222a((Object) a, "configurationProvider.ge…_CHECK)\n                }");
        return a;
    }

    public Single<OtpRedeemResponse> redeemOnetimePasscode(ServiceTransaction serviceTransaction, OneTimePasscodeRedeemRequest oneTimePasscodeRedeemRequest, Map<String, String> map) {
        Single<OtpRedeemResponse> a = this.configurationProvider.getServiceLink(serviceTransaction, DefaultAuthenticationClient$redeemOnetimePasscode$1.INSTANCE).mo30208a((Function<? super T, ? extends SingleSource<? extends R>>) new DefaultAuthenticationClient$redeemOnetimePasscode$2<Object,Object>(this, map, serviceTransaction, oneTimePasscodeRedeemRequest));
        C12880j.m40222a((Object) a, "configurationProvider.ge…E_PASSCODE)\n            }");
        return a;
    }

    public Completable requestOneTimePasscode(ServiceTransaction serviceTransaction, OneTimePasscodeRequest oneTimePasscodeRequest, Map<String, String> map) {
        Completable b = this.configurationProvider.getServiceLink(serviceTransaction, DefaultAuthenticationClient$requestOneTimePasscode$1.INSTANCE).mo30217b((Function<? super T, ? extends CompletableSource>) new DefaultAuthenticationClient$requestOneTimePasscode$2<Object,Object>(this, map, serviceTransaction, oneTimePasscodeRequest));
        C12880j.m40222a((Object) b, "configurationProvider.ge…E_PASSCODE)\n            }");
        return b;
    }
}
