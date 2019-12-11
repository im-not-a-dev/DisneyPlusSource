package com.bamtech.sdk4.internal.media.adengine;

import com.bamtech.sdk4.internal.configuration.ConfigurationProvider;
import com.bamtech.sdk4.internal.service.ServiceTransaction;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p520io.reactivex.Completable;
import p520io.reactivex.CompletableSource;
import p520io.reactivex.functions.Function;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J<\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0016\u0010\u000b\u001a\u0012\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\r0\fj\u0002`\u000e2\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\r0\fH\u0016R\u0014\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0010"}, mo31007d2 = {"Lcom/bamtech/sdk4/internal/media/adengine/DefaultAdEngineClient;", "Lcom/bamtech/sdk4/internal/media/adengine/AdEngineClient;", "configurationProvider", "Lcom/bamtech/sdk4/internal/configuration/ConfigurationProvider;", "(Lcom/bamtech/sdk4/internal/configuration/ConfigurationProvider;)V", "getConfigurationProvider$sdk_core_api_release", "()Lcom/bamtech/sdk4/internal/configuration/ConfigurationProvider;", "updateCookies", "Lio/reactivex/Completable;", "transaction", "Lcom/bamtech/sdk4/internal/service/ServiceTransaction;", "tokenMap", "", "", "Lcom/bamtech/sdk4/internal/service/TokenMap;", "payload", "sdk-core-api_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* compiled from: AdEngineClient.kt */
public final class DefaultAdEngineClient implements AdEngineClient {
    private final ConfigurationProvider configurationProvider;

    public DefaultAdEngineClient(ConfigurationProvider configurationProvider2) {
        this.configurationProvider = configurationProvider2;
    }

    public Completable updateCookies(ServiceTransaction serviceTransaction, Map<String, String> map, Map<String, String> map2) {
        Completable b = this.configurationProvider.getServiceLink(serviceTransaction, DefaultAdEngineClient$updateCookies$1.INSTANCE).mo30217b((Function<? super T, ? extends CompletableSource>) new DefaultAdEngineClient$updateCookies$2<Object,Object>(map2, map, serviceTransaction));
        Intrinsics.checkReturnedValueIsNotNull((Object) b, "configurationProvider.ge…_TOKEN)\n                }");
        return b;
    }
}
