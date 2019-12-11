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

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0012\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003H\n¢\u0006\u0002\b\u0006"}, mo31007d2 = {"<anonymous>", "Lio/reactivex/Completable;", "<name for destructuring parameter 0>", "Lkotlin/Pair;", "Lcom/bamtech/core/networking/Link;", "Lcom/bamtech/sdk4/internal/configuration/Configuration;", "apply"}, mo31008k = 3, mo31009mv = {1, 1, 15})
/* compiled from: AuthenticationClient.kt */
final class DefaultAuthenticationClient$requestOneTimePasscode$2<T, R> implements Function<Pair<? extends Link, ? extends Configuration>, CompletableSource> {
    final /* synthetic */ OneTimePasscodeRequest $request;
    final /* synthetic */ Map $tokenMap;
    final /* synthetic */ ServiceTransaction $transaction;
    final /* synthetic */ DefaultAuthenticationClient this$0;

    DefaultAuthenticationClient$requestOneTimePasscode$2(DefaultAuthenticationClient defaultAuthenticationClient, Map map, ServiceTransaction serviceTransaction, OneTimePasscodeRequest oneTimePasscodeRequest) {
        this.this$0 = defaultAuthenticationClient;
        this.$tokenMap = map;
        this.$transaction = serviceTransaction;
        this.$request = oneTimePasscodeRequest;
    }

    public final Completable apply(Pair<Link, Configuration> pair) {
        Link link = (Link) pair.mo31013a();
        Configuration configuration = (Configuration) pair.mo31014b();
        Link updateTemplates$default = Link.updateTemplates$default(link, this.$tokenMap, null, 2, null);
        OkHttpClient client = this.$transaction.getClient();
        ServiceTransaction serviceTransaction = this.$transaction;
        return C1169c.m6002a(C1691e.m7796a(updateTemplates$default, client, (ResponseTransformer<? extends OUT>) new DefaultResponseTransformer<Object>(new C1877xa0fc74c3(new ResponseHandler[]{ResponseHandlersKt.noOpResponseHandler(serviceTransaction)}, serviceTransaction), new C1878xa0fc74c4(serviceTransaction)), this.this$0.converters.getIdentity().serialize(this.$request), ConfigurationKt.toDustConfigSettings(configuration)), this.$transaction, BamIdentityServiceConfigurationKt.getBAM_REQUEST_ONE_TIME_PASSCODE(Dust$Events.INSTANCE));
    }
}
