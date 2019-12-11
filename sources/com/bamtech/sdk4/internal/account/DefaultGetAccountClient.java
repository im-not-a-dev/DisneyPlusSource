package com.bamtech.sdk4.internal.account;

import com.bamtech.core.networking.converters.Converter;
import com.bamtech.core.networking.handlers.DefaultResponseTransformer;
import com.bamtech.core.networking.handlers.ResponseHandler;
import com.bamtech.sdk4.account.Account;
import com.bamtech.sdk4.internal.configuration.ConfigurationProvider;
import com.bamtech.sdk4.internal.networking.ConverterProvider;
import com.bamtech.sdk4.internal.service.ServiceTransaction;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.C12880j;
import p520io.reactivex.Single;
import p520io.reactivex.SingleSource;
import p520io.reactivex.functions.Function;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B#\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\bJ.\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020\u00072\u000e\u0010\u000f\u001a\n\u0012\u0006\b\u0001\u0012\u00020\f0\u0010H\u0002J;\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\f0\u00122\u0006\u0010\r\u001a\u00020\u000e2\u001e\u0010\u0013\u001a\u0010\u0012\f\b\u0001\u0012\b\u0012\u0004\u0012\u00020\f0\u000b0\u0014\"\b\u0012\u0004\u0012\u00020\f0\u000bH\u0002¢\u0006\u0002\u0010\u0015J@\u0010\u0016\u001a\n\u0012\u0006\b\u0001\u0012\u00020\f0\u00172\u0006\u0010\r\u001a\u00020\u000e2\u0016\u0010\u0018\u001a\u0012\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\u001a0\u0019j\u0002`\u001b2\u000e\u0010\u000f\u001a\n\u0012\u0006\b\u0001\u0012\u00020\f0\u0010H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000¨\u0006\u001c"}, mo31007d2 = {"Lcom/bamtech/sdk4/internal/account/DefaultGetAccountClient;", "Lcom/bamtech/sdk4/internal/account/GetAccountClient;", "configurationProvider", "Lcom/bamtech/sdk4/internal/configuration/ConfigurationProvider;", "converters", "Lcom/bamtech/sdk4/internal/networking/ConverterProvider;", "customConverter", "Lcom/bamtech/core/networking/converters/Converter;", "(Lcom/bamtech/sdk4/internal/configuration/ConfigurationProvider;Lcom/bamtech/sdk4/internal/networking/ConverterProvider;Lcom/bamtech/core/networking/converters/Converter;)V", "converter", "accountResponseHandler", "Lcom/bamtech/core/networking/handlers/ResponseHandler;", "Lcom/bamtech/sdk4/account/Account;", "transaction", "Lcom/bamtech/sdk4/internal/service/ServiceTransaction;", "type", "Ljava/lang/Class;", "accountResponseTransformer", "Lcom/bamtech/core/networking/handlers/DefaultResponseTransformer;", "responseHandlers", "", "(Lcom/bamtech/sdk4/internal/service/ServiceTransaction;[Lcom/bamtech/core/networking/handlers/ResponseHandler;)Lcom/bamtech/core/networking/handlers/DefaultResponseTransformer;", "getAccount", "Lio/reactivex/Single;", "tokenMap", "", "", "Lcom/bamtech/sdk4/internal/service/TokenMap;", "extension-account"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* compiled from: GetAccountClient.kt */
public final class DefaultGetAccountClient implements GetAccountClient {
    private final ConfigurationProvider configurationProvider;
    /* access modifiers changed from: private */
    public final Converter converter;

    public DefaultGetAccountClient(ConfigurationProvider configurationProvider2, ConverterProvider converterProvider, Converter converter2) {
        this.configurationProvider = configurationProvider2;
        if (converter2 == null) {
            converter2 = converterProvider.getIdentity();
        }
        this.converter = converter2;
    }

    /* access modifiers changed from: private */
    public final ResponseHandler<Account> accountResponseHandler(ServiceTransaction serviceTransaction, Converter converter2, Class<? extends Account> cls) {
        return new DefaultGetAccountClient$accountResponseHandler$1(converter2, cls, serviceTransaction);
    }

    /* access modifiers changed from: private */
    public final DefaultResponseTransformer<Account> accountResponseTransformer(ServiceTransaction serviceTransaction, ResponseHandler<? extends Account>... responseHandlerArr) {
        return new DefaultResponseTransformer<>(new DefaultGetAccountClient$accountResponseTransformer$1(responseHandlerArr, serviceTransaction), new DefaultGetAccountClient$accountResponseTransformer$2(serviceTransaction));
    }

    public Single<? extends Account> getAccount(ServiceTransaction serviceTransaction, Map<String, String> map, Class<? extends Account> cls) {
        Single<? extends Account> a = this.configurationProvider.getServiceLink(serviceTransaction, DefaultGetAccountClient$getAccount$1.INSTANCE).mo30208a((Function<? super T, ? extends SingleSource<? extends R>>) new DefaultGetAccountClient$getAccount$2<Object,Object>(this, map, serviceTransaction, cls));
        C12880j.m40222a((Object) a, "configurationProvider.ge…CCOUNT)\n                }");
        return a;
    }
}
