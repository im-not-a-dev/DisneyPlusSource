package com.bamtech.sdk4.internal.identity.bam;

import com.bamtech.core.networking.converters.Converter;
import com.bamtech.sdk4.identity.IdentityToken;
import com.bamtech.sdk4.internal.configuration.ConfigurationProvider;
import com.bamtech.sdk4.internal.core.Storage;
import com.bamtech.sdk4.internal.service.ServiceTransaction;
import kotlin.Metadata;
import kotlin.jvm.internal.C12880j;
import p520io.reactivex.Single;
import p520io.reactivex.SingleSource;
import p520io.reactivex.functions.Function;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001B!\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u0016\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\f\u001a\u00020\rH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, mo31007d2 = {"Lcom/bamtech/sdk4/internal/identity/bam/DefaultCommonIdentityTokenManager;", "Lcom/bamtech/sdk4/internal/identity/bam/CommonIdentityTokenManager;", "configurationProvider", "Lcom/bamtech/sdk4/internal/configuration/ConfigurationProvider;", "storage", "Lcom/bamtech/sdk4/internal/core/Storage;", "flowConverter", "Lcom/bamtech/core/networking/converters/Converter;", "(Lcom/bamtech/sdk4/internal/configuration/ConfigurationProvider;Lcom/bamtech/sdk4/internal/core/Storage;Lcom/bamtech/core/networking/converters/Converter;)V", "getIdentityToken", "Lio/reactivex/Single;", "Lcom/bamtech/sdk4/identity/IdentityToken;", "transaction", "Lcom/bamtech/sdk4/internal/service/ServiceTransaction;", "plugin-identity-bam"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* compiled from: CommonIdentityTokenManager.kt */
public final class DefaultCommonIdentityTokenManager implements CommonIdentityTokenManager {
    private final ConfigurationProvider configurationProvider;
    /* access modifiers changed from: private */
    public final Converter flowConverter;
    /* access modifiers changed from: private */
    public final Storage storage;

    public DefaultCommonIdentityTokenManager(ConfigurationProvider configurationProvider2, Storage storage2, Converter converter) {
        this.configurationProvider = configurationProvider2;
        this.storage = storage2;
        this.flowConverter = converter;
    }

    public Single<IdentityToken> getIdentityToken(ServiceTransaction serviceTransaction) {
        Single<IdentityToken> a = this.configurationProvider.getServiceConfigurationExtras(serviceTransaction, DefaultCommonIdentityTokenManager$getIdentityToken$1.INSTANCE).mo30208a((Function<? super T, ? extends SingleSource<? extends R>>) new DefaultCommonIdentityTokenManager$getIdentityToken$2<Object,Object>(this, serviceTransaction));
        C12880j.m40222a((Object) a, "configurationProvider.ge…      }\n                }");
        return a;
    }
}
