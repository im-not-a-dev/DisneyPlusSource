package com.bamtech.sdk4.internal.configuration;

import com.bamtech.core.networking.C1681c;
import com.bamtech.core.networking.C1691e;
import com.bamtech.core.networking.Link;
import com.bamtech.core.networking.Request;
import com.bamtech.core.networking.handlers.DefaultResponseTransformer;
import com.bamtech.core.networking.handlers.ResponseHandler;
import com.bamtech.sdk4.internal.networking.ConverterProvider;
import com.bamtech.sdk4.internal.service.ServiceTransaction;
import com.bamtech.sdk4.internal.telemetry.dust.Dust$Events;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.Call;
import p520io.reactivex.Single;
import p520io.reactivex.disposables.Disposable;
import p520io.reactivex.functions.C11945a;
import p520io.reactivex.functions.Consumer;
import p520io.reactivex.p525e0.C11934b;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u001e\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0016J\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00070\r2\u0006\u0010\b\u001a\u00020\tR\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, mo31007d2 = {"Lcom/bamtech/sdk4/internal/configuration/DefaultConfigurationClient;", "Lcom/bamtech/sdk4/internal/configuration/ConfigurationClient;", "converters", "Lcom/bamtech/sdk4/internal/networking/ConverterProvider;", "(Lcom/bamtech/sdk4/internal/networking/ConverterProvider;)V", "getConfiguration", "Lio/reactivex/Single;", "Lcom/bamtech/sdk4/internal/configuration/Configuration;", "transaction", "Lcom/bamtech/sdk4/internal/service/ServiceTransaction;", "link", "Lcom/bamtech/core/networking/Link;", "notFoundResponseHandler", "Lcom/bamtech/core/networking/handlers/ResponseHandler;", "sdk-configuration"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* compiled from: ConfigurationClient.kt */
public final class DefaultConfigurationClient implements ConfigurationClient {
    private final ConverterProvider converters;

    public DefaultConfigurationClient(ConverterProvider converterProvider) {
        this.converters = converterProvider;
    }

    public Single<Configuration> getConfiguration(ServiceTransaction serviceTransaction, Link link) {
        Request a = C1691e.m7798a(link, serviceTransaction.getClient(), new DefaultResponseTransformer(new C1833x538d0fc8(new ResponseHandler[]{notFoundResponseHandler(serviceTransaction), new C1831xce40d2b9(this.converters.getIdentity())}, serviceTransaction), new C1834x538d0fc9(serviceTransaction)), null, null, 12, null);
        String configuration_get = ConfigurationClientKt.getCONFIGURATION_GET(Dust$Events.INSTANCE);
        Call a2 = C1691e.m7799a(a);
        Single b = C1681c.m7780a(a, a2).mo30223c((C11945a) new DefaultConfigurationClient$getConfiguration$$inlined$toSingle$1(a2)).mo30220b(C11934b.m38500b());
        Intrinsics.checkReturnedValueIsNotNull((Object) b, "call(this, call)\n       …scribeOn(Schedulers.io())");
        Single<Configuration> g = b.mo30222c((Consumer<? super Disposable>) new DefaultConfigurationClient$getConfiguration$$inlined$toSingle$2<Object>(serviceTransaction, configuration_get)).mo30218b((Consumer<? super Throwable>) new DefaultConfigurationClient$getConfiguration$$inlined$toSingle$3<Object>(a, serviceTransaction, configuration_get)).mo30233g(new DefaultConfigurationClient$getConfiguration$$inlined$toSingle$4(serviceTransaction, configuration_get));
        Intrinsics.checkReturnedValueIsNotNull((Object) g, "this.asSingle()\n        …        it.body\n        }");
        return g;
    }

    public final ResponseHandler<Configuration> notFoundResponseHandler(ServiceTransaction serviceTransaction) {
        return new DefaultConfigurationClient$notFoundResponseHandler$1(serviceTransaction);
    }
}
