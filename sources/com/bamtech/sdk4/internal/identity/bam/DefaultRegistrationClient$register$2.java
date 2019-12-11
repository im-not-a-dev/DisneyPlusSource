package com.bamtech.sdk4.internal.identity.bam;

import com.bamtech.core.networking.C1691e;
import com.bamtech.core.networking.Link;
import com.bamtech.core.networking.handlers.DefaultResponseTransformer;
import com.bamtech.core.networking.handlers.ResponseHandler;
import com.bamtech.core.networking.handlers.ResponseTransformer;
import com.bamtech.sdk4.internal.configuration.BamIdentityServiceConfigurationKt;
import com.bamtech.sdk4.internal.configuration.Configuration;
import com.bamtech.sdk4.internal.configuration.ConfigurationKt;
import com.bamtech.sdk4.internal.service.ResponseHandlersKt;
import com.bamtech.sdk4.internal.service.ServiceTransaction;
import com.bamtech.sdk4.internal.telemetry.dust.Dust$Events;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import okhttp3.OkHttpClient;
import p520io.reactivex.Completable;
import p520io.reactivex.CompletableSource;
import p520io.reactivex.functions.Function;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\n¢\u0006\u0002\b\u0007"}, mo31007d2 = {"<anonymous>", "Lio/reactivex/Completable;", "T", "<name for destructuring parameter 0>", "Lkotlin/Pair;", "Lcom/bamtech/core/networking/Link;", "Lcom/bamtech/sdk4/internal/configuration/Configuration;", "apply"}, mo31008k = 3, mo31009mv = {1, 1, 15})
/* compiled from: RegistrationClient.kt */
final class DefaultRegistrationClient$register$2<T, R> implements Function<Pair<? extends Link, ? extends Configuration>, CompletableSource> {
    final /* synthetic */ RegistrationRequest $request;
    final /* synthetic */ Map $tokenMap;
    final /* synthetic */ ServiceTransaction $transaction;
    final /* synthetic */ DefaultRegistrationClient this$0;

    DefaultRegistrationClient$register$2(DefaultRegistrationClient defaultRegistrationClient, Map map, ServiceTransaction serviceTransaction, RegistrationRequest registrationRequest) {
        this.this$0 = defaultRegistrationClient;
        this.$tokenMap = map;
        this.$transaction = serviceTransaction;
        this.$request = registrationRequest;
    }

    public final Completable apply(Pair<Link, Configuration> pair) {
        Link link = (Link) pair.mo31013a();
        Configuration configuration = (Configuration) pair.mo31014b();
        Link updateTemplates$default = Link.updateTemplates$default(link, this.$tokenMap, null, 2, null);
        OkHttpClient client = this.$transaction.getClient();
        ServiceTransaction serviceTransaction = this.$transaction;
        return C1169c.m6002a(C1691e.m7796a(updateTemplates$default, client, (ResponseTransformer<? extends OUT>) new DefaultResponseTransformer<Object>(new C1887xaadf0c63(new ResponseHandler[]{ResponseHandlersKt.noOpResponseHandler(serviceTransaction)}, serviceTransaction), new C1888xaadf0c64(serviceTransaction)), this.this$0.converters.getIdentity().serialize(this.$request), ConfigurationKt.toDustConfigSettings(configuration)), this.$transaction, BamIdentityServiceConfigurationKt.getBAM_IDENTITY_CREATE(Dust$Events.INSTANCE));
    }
}
