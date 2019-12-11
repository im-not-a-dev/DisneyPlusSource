package com.bamtech.sdk4.internal.subscription;

import com.bamtech.core.networking.converters.Converter;
import com.bamtech.core.networking.handlers.ResponseHandler;
import com.bamtech.sdk4.internal.configuration.ConfigurationProvider;
import com.bamtech.sdk4.internal.service.ServiceTransaction;
import com.bamtech.sdk4.subscription.LinkSubscriptionSuccess;
import com.bamtech.sdk4.subscription.Subscription;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.C12880j;
import p520io.reactivex.Completable;
import p520io.reactivex.CompletableSource;
import p520io.reactivex.Single;
import p520io.reactivex.SingleSource;
import p520io.reactivex.functions.Function;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J4\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r0\f2\u0006\u0010\u000f\u001a\u00020\u00102\u0016\u0010\u0011\u001a\u0012\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00130\u0012j\u0002`\u0014H\u0016J(\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u000f\u001a\u00020\u00102\u0016\u0010\u0011\u001a\u0012\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00130\u0012j\u0002`\u0014H\u0016J\u0016\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00190\u00182\u0006\u0010\u000f\u001a\u00020\u0010H\u0002R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u001a"}, mo31007d2 = {"Lcom/bamtech/sdk4/internal/subscription/DefaultSubscriptionClient;", "Lcom/bamtech/sdk4/internal/subscription/SubscriptionClient;", "configurationProvider", "Lcom/bamtech/sdk4/internal/configuration/ConfigurationProvider;", "converter", "Lcom/bamtech/core/networking/converters/Converter;", "(Lcom/bamtech/sdk4/internal/configuration/ConfigurationProvider;Lcom/bamtech/core/networking/converters/Converter;)V", "getConfigurationProvider", "()Lcom/bamtech/sdk4/internal/configuration/ConfigurationProvider;", "getConverter", "()Lcom/bamtech/core/networking/converters/Converter;", "getSubscriptions", "Lio/reactivex/Single;", "", "Lcom/bamtech/sdk4/subscription/Subscription;", "transaction", "Lcom/bamtech/sdk4/internal/service/ServiceTransaction;", "map", "", "", "Lcom/bamtech/sdk4/internal/service/TokenMap;", "linkSubscriptionsFromDevice", "Lio/reactivex/Completable;", "linkSubscriptionsResponseHandler", "Lcom/bamtech/core/networking/handlers/ResponseHandler;", "Lcom/bamtech/sdk4/subscription/LinkSubscriptionSuccess;", "extension-iap"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* compiled from: SubscriptionClient.kt */
public final class DefaultSubscriptionClient implements SubscriptionClient {
    private final ConfigurationProvider configurationProvider;
    private final Converter converter;

    public DefaultSubscriptionClient(ConfigurationProvider configurationProvider2, Converter converter2) {
        this.configurationProvider = configurationProvider2;
        this.converter = converter2;
    }

    /* access modifiers changed from: private */
    public final ResponseHandler<LinkSubscriptionSuccess> linkSubscriptionsResponseHandler(ServiceTransaction serviceTransaction) {
        return new DefaultSubscriptionClient$linkSubscriptionsResponseHandler$1(this, serviceTransaction);
    }

    public final Converter getConverter() {
        return this.converter;
    }

    public Single<List<Subscription>> getSubscriptions(ServiceTransaction serviceTransaction, Map<String, String> map) {
        Single<List<Subscription>> a = this.configurationProvider.getServiceLink(serviceTransaction, DefaultSubscriptionClient$getSubscriptions$1.INSTANCE).mo30208a((Function<? super T, ? extends SingleSource<? extends R>>) new DefaultSubscriptionClient$getSubscriptions$2<Object,Object>(this, map, serviceTransaction));
        C12880j.m40222a((Object) a, "configurationProvider.ge…      }\n                }");
        return a;
    }

    public Completable linkSubscriptionsFromDevice(ServiceTransaction serviceTransaction, Map<String, String> map) {
        Completable b = this.configurationProvider.getServiceLink(serviceTransaction, DefaultSubscriptionClient$linkSubscriptionsFromDevice$1.INSTANCE).mo30217b((Function<? super T, ? extends CompletableSource>) new DefaultSubscriptionClient$linkSubscriptionsFromDevice$2<Object,Object>(this, map, serviceTransaction));
        C12880j.m40222a((Object) b, "configurationProvider.ge…ement()\n                }");
        return b;
    }
}
