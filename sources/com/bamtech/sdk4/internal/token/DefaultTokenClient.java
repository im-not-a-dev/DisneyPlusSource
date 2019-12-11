package com.bamtech.sdk4.internal.token;

import com.bamtech.core.networking.handlers.ResponseHandler;
import com.bamtech.sdk4.internal.configuration.ConfigurationProvider;
import com.bamtech.sdk4.internal.location.LocationResolver;
import com.bamtech.sdk4.internal.networking.ConverterProvider;
import com.bamtech.sdk4.internal.service.ServiceTransaction;
import com.bamtech.sdk4.internal.token.TokenExchangeRequest.Refresh;
import com.bamtech.sdk4.internal.token.TokenExchangeRequest.TokenExchange;
import java.util.Map;
import kotlin.C12898l;
import kotlin.Metadata;
import kotlin.jvm.internal.C12880j;
import okhttp3.FormBody.Builder;
import p520io.reactivex.Single;
import p520io.reactivex.SingleSource;
import p520io.reactivex.functions.Function;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001B\u001f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u0016\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\f\u001a\u00020\rH\u0002J6\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u00122\u0016\u0010\u0013\u001a\u0012\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00150\u0014j\u0002`\u0016H\u0016J\u0011\u0010\u0017\u001a\u00020\u0018*\u00020\u0019H\u0000¢\u0006\u0002\b\u001aJ\u0011\u0010\u001b\u001a\u00020\u0018*\u00020\u0019H\u0000¢\u0006\u0002\b\u001cR\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000¨\u0006\u001d"}, mo31007d2 = {"Lcom/bamtech/sdk4/internal/token/DefaultTokenClient;", "Lcom/bamtech/sdk4/internal/token/TokenClient;", "configurationProvider", "Lcom/bamtech/sdk4/internal/configuration/ConfigurationProvider;", "locationResolver", "Lcom/bamtech/sdk4/internal/location/LocationResolver;", "converters", "Lcom/bamtech/sdk4/internal/networking/ConverterProvider;", "(Lcom/bamtech/sdk4/internal/configuration/ConfigurationProvider;Lcom/bamtech/sdk4/internal/location/LocationResolver;Lcom/bamtech/sdk4/internal/networking/ConverterProvider;)V", "errorResponseHandler", "Lcom/bamtech/core/networking/handlers/ResponseHandler;", "", "transaction", "Lcom/bamtech/sdk4/internal/service/ServiceTransaction;", "exchange", "Lio/reactivex/Single;", "Lcom/bamtech/sdk4/internal/token/TokenExchangeResponse;", "request", "Lcom/bamtech/sdk4/internal/token/TokenExchangeRequest;", "tokenMap", "", "", "Lcom/bamtech/sdk4/internal/service/TokenMap;", "isInvalid", "", "Lcom/bamtech/sdk4/internal/token/TokenExchangeErrorResponse;", "isInvalid$sdk_core_api_release", "isTokenExpired", "isTokenExpired$sdk_core_api_release", "sdk-core-api_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* compiled from: TokenClient.kt */
public final class DefaultTokenClient implements TokenClient {
    /* access modifiers changed from: private */
    public final ConfigurationProvider configurationProvider;
    /* access modifiers changed from: private */
    public final ConverterProvider converters;
    private final LocationResolver locationResolver;

    public DefaultTokenClient(ConfigurationProvider configurationProvider2, LocationResolver locationResolver2, ConverterProvider converterProvider) {
        this.configurationProvider = configurationProvider2;
        this.locationResolver = locationResolver2;
        this.converters = converterProvider;
    }

    /* access modifiers changed from: private */
    public final ResponseHandler errorResponseHandler(ServiceTransaction serviceTransaction) {
        return new DefaultTokenClient$errorResponseHandler$1(this, serviceTransaction);
    }

    public Single<TokenExchangeResponse> exchange(ServiceTransaction serviceTransaction, TokenExchangeRequest tokenExchangeRequest, Map<String, String> map) {
        Builder builder;
        String str = "platform";
        String str2 = "grant_type";
        if (tokenExchangeRequest instanceof TokenExchange) {
            TokenExchange tokenExchange = (TokenExchange) tokenExchangeRequest;
            String str3 = "subject_token_type";
            builder = new Builder().mo35744a(str2, tokenExchange.getGrantType()).mo35744a("subject_token", tokenExchange.getSubjectToken()).mo35744a(str3, tokenExchange.getSubjectTokenType()).mo35744a(str, tokenExchange.getPlatform());
        } else if (tokenExchangeRequest instanceof Refresh) {
            Refresh refresh = (Refresh) tokenExchangeRequest;
            builder = new Builder().mo35744a(str2, refresh.getGrantType()).mo35744a("refresh_token", refresh.getRefreshToken()).mo35744a(str, refresh.getPlatform());
        } else {
            throw new C12898l();
        }
        Single<TokenExchangeResponse> a = this.locationResolver.getLocation(serviceTransaction).mo30233g(new DefaultTokenClient$exchange$1(this, serviceTransaction, builder)).mo30208a((Function<? super T, ? extends SingleSource<? extends R>>) new DefaultTokenClient$exchange$2<Object,Object>(this, serviceTransaction, map));
        C12880j.m40222a((Object) a, "locationResolver.getLoca…      }\n                }");
        return a;
    }

    public final boolean isInvalid$sdk_core_api_release(TokenExchangeErrorResponse tokenExchangeErrorResponse) {
        if (C12880j.m40224a((Object) "invalid_grant", (Object) tokenExchangeErrorResponse.getError())) {
            if (C12880j.m40224a((Object) "invalid-token", (Object) tokenExchangeErrorResponse.getError_description())) {
                return true;
            }
        }
        return false;
    }

    public final boolean isTokenExpired$sdk_core_api_release(TokenExchangeErrorResponse tokenExchangeErrorResponse) {
        if (C12880j.m40224a((Object) "invalid_grant", (Object) tokenExchangeErrorResponse.getError())) {
            if (C12880j.m40224a((Object) "expired-token", (Object) tokenExchangeErrorResponse.getError_description())) {
                return true;
            }
        }
        return false;
    }
}
