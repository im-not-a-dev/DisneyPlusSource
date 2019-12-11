package com.bamtech.sdk4.internal.account;

import com.bamtech.core.networking.converters.Converter;
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

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001B#\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\bJB\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n\"\u0004\b\u0000\u0010\f2\u0006\u0010\r\u001a\u00020\u000e2\u0016\u0010\u000f\u001a\u0012\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00110\u0010j\u0002`\u00122\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u0002H\f0\u0014H\u0016J\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00162\u0006\u0010\r\u001a\u00020\u000eH\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0017"}, mo31007d2 = {"Lcom/bamtech/sdk4/internal/account/DefaultCreateAccountClient;", "Lcom/bamtech/sdk4/internal/account/CreateAccountClient;", "configurationProvider", "Lcom/bamtech/sdk4/internal/configuration/ConfigurationProvider;", "converters", "Lcom/bamtech/sdk4/internal/networking/ConverterProvider;", "customConverter", "Lcom/bamtech/core/networking/converters/Converter;", "(Lcom/bamtech/sdk4/internal/configuration/ConfigurationProvider;Lcom/bamtech/sdk4/internal/networking/ConverterProvider;Lcom/bamtech/core/networking/converters/Converter;)V", "createAccount", "Lio/reactivex/Single;", "Lcom/bamtech/sdk4/internal/account/CreateAccountResult;", "T", "transaction", "Lcom/bamtech/sdk4/internal/service/ServiceTransaction;", "tokenMap", "", "", "Lcom/bamtech/sdk4/internal/service/TokenMap;", "request", "Lcom/bamtech/sdk4/internal/account/CreateAccountRequest;", "responseHandler", "Lcom/bamtech/core/networking/handlers/ResponseHandler;", "extension-account"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* compiled from: CreateAccountClient.kt */
public final class DefaultCreateAccountClient implements CreateAccountClient {
    private final ConfigurationProvider configurationProvider;
    /* access modifiers changed from: private */
    public final ConverterProvider converters;
    private final Converter customConverter;

    public DefaultCreateAccountClient(ConfigurationProvider configurationProvider2, ConverterProvider converterProvider, Converter converter) {
        this.configurationProvider = configurationProvider2;
        this.converters = converterProvider;
        this.customConverter = converter;
    }

    /* access modifiers changed from: private */
    public final ResponseHandler<CreateAccountResult> responseHandler(ServiceTransaction serviceTransaction) {
        return new DefaultCreateAccountClient$responseHandler$1(this, serviceTransaction);
    }

    public <T> Single<CreateAccountResult> createAccount(ServiceTransaction serviceTransaction, Map<String, String> map, CreateAccountRequest<T> createAccountRequest) {
        Converter converter = this.customConverter;
        if (converter == null) {
            converter = this.converters.getIdentity();
        }
        Converter converter2 = converter;
        Single serviceLink = this.configurationProvider.getServiceLink(serviceTransaction, DefaultCreateAccountClient$createAccount$1.INSTANCE);
        DefaultCreateAccountClient$createAccount$2 defaultCreateAccountClient$createAccount$2 = new DefaultCreateAccountClient$createAccount$2(this, map, serviceTransaction, converter2, createAccountRequest);
        Single<CreateAccountResult> a = serviceLink.mo30208a((Function<? super T, ? extends SingleSource<? extends R>>) defaultCreateAccountClient$createAccount$2);
        C12880j.m40222a((Object) a, "configurationProvider.ge…CCOUNT)\n                }");
        return a;
    }
}
