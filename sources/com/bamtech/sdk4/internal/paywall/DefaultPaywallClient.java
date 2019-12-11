package com.bamtech.sdk4.internal.paywall;

import com.bamtech.sdk4.internal.configuration.ConfigurationProvider;
import com.bamtech.sdk4.internal.networking.ConverterProvider;
import com.bamtech.sdk4.internal.service.ServiceTransaction;
import com.bamtech.sdk4.paywall.Paywall;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.C12880j;
import p520io.reactivex.Single;
import p520io.reactivex.SingleSource;
import p520io.reactivex.functions.Function;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J.\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\n\u001a\u00020\u000b2\u0016\u0010\f\u001a\u0012\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000e0\rj\u0002`\u000fH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0010"}, mo31007d2 = {"Lcom/bamtech/sdk4/internal/paywall/DefaultPaywallClient;", "Lcom/bamtech/sdk4/internal/paywall/PaywallClient;", "configurationProvider", "Lcom/bamtech/sdk4/internal/configuration/ConfigurationProvider;", "converter", "Lcom/bamtech/sdk4/internal/networking/ConverterProvider;", "(Lcom/bamtech/sdk4/internal/configuration/ConfigurationProvider;Lcom/bamtech/sdk4/internal/networking/ConverterProvider;)V", "getPaywall", "Lio/reactivex/Single;", "Lcom/bamtech/sdk4/paywall/Paywall;", "transaction", "Lcom/bamtech/sdk4/internal/service/ServiceTransaction;", "tokenMap", "", "", "Lcom/bamtech/sdk4/internal/service/TokenMap;", "plugin-paywall"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* compiled from: PaywallClient.kt */
public final class DefaultPaywallClient implements PaywallClient {
    private final ConfigurationProvider configurationProvider;
    /* access modifiers changed from: private */
    public final ConverterProvider converter;

    public DefaultPaywallClient(ConfigurationProvider configurationProvider2, ConverterProvider converterProvider) {
        this.configurationProvider = configurationProvider2;
        this.converter = converterProvider;
    }

    public Single<Paywall> getPaywall(ServiceTransaction serviceTransaction, Map<String, String> map) {
        Single<Paywall> a = this.configurationProvider.getServiceLink(serviceTransaction, DefaultPaywallClient$getPaywall$1.INSTANCE).mo30208a((Function<? super T, ? extends SingleSource<? extends R>>) new DefaultPaywallClient$getPaywall$2<Object,Object>(this, map, serviceTransaction));
        C12880j.m40222a((Object) a, "configurationProvider.ge…AM_PAYWALL)\n            }");
        return a;
    }
}
