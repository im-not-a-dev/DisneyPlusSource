package com.bamtech.sdk4.internal.account;

import com.bamtech.core.networking.handlers.ResponseHandler;
import com.bamtech.sdk4.internal.configuration.ConfigurationProvider;
import com.bamtech.sdk4.internal.networking.ConverterProvider;
import com.bamtech.sdk4.internal.service.ServiceTransaction;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.C12880j;
import p520io.reactivex.Single;
import p520io.reactivex.SingleSource;
import p520io.reactivex.functions.Function;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J6\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0016\u0010\u000e\u001a\u0012\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00100\u000fj\u0002`\u0011H\u0016J\u0016\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\t0\u00132\u0006\u0010\n\u001a\u00020\u000bH\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0014"}, mo31007d2 = {"Lcom/bamtech/sdk4/internal/account/DefaultCreateAccountGrantClient;", "Lcom/bamtech/sdk4/internal/account/CreateAccountGrantClient;", "configurationProvider", "Lcom/bamtech/sdk4/internal/configuration/ConfigurationProvider;", "converters", "Lcom/bamtech/sdk4/internal/networking/ConverterProvider;", "(Lcom/bamtech/sdk4/internal/configuration/ConfigurationProvider;Lcom/bamtech/sdk4/internal/networking/ConverterProvider;)V", "createAccountGrant", "Lio/reactivex/Single;", "Lcom/bamtech/sdk4/internal/account/CreateAccountGrantResponse;", "transaction", "Lcom/bamtech/sdk4/internal/service/ServiceTransaction;", "request", "Lcom/bamtech/sdk4/internal/account/CreateAccountGrantRequest;", "tokenMap", "", "", "Lcom/bamtech/sdk4/internal/service/TokenMap;", "responseHandler", "Lcom/bamtech/core/networking/handlers/ResponseHandler;", "extension-account"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* compiled from: CreateAccountGrantClient.kt */
public final class DefaultCreateAccountGrantClient implements CreateAccountGrantClient {
    private final ConfigurationProvider configurationProvider;
    /* access modifiers changed from: private */
    public final ConverterProvider converters;

    public DefaultCreateAccountGrantClient(ConfigurationProvider configurationProvider2, ConverterProvider converterProvider) {
        this.configurationProvider = configurationProvider2;
        this.converters = converterProvider;
    }

    /* access modifiers changed from: private */
    public final ResponseHandler<CreateAccountGrantResponse> responseHandler(ServiceTransaction serviceTransaction) {
        return new DefaultCreateAccountGrantClient$responseHandler$1(this, serviceTransaction);
    }

    public Single<CreateAccountGrantResponse> createAccountGrant(ServiceTransaction serviceTransaction, CreateAccountGrantRequest createAccountGrantRequest, Map<String, String> map) {
        Single<CreateAccountGrantResponse> a = this.configurationProvider.getServiceLink(serviceTransaction, DefaultCreateAccountGrantClient$createAccountGrant$1.INSTANCE).mo30208a((Function<? super T, ? extends SingleSource<? extends R>>) new DefaultCreateAccountGrantClient$createAccountGrant$2<Object,Object>(this, map, serviceTransaction, createAccountGrantRequest));
        C12880j.m40222a((Object) a, "configurationProvider.ge…_GRANT)\n                }");
        return a;
    }
}
