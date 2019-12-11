package com.bamtech.sdk4.internal.media.adengine;

import com.bamtech.core.networking.C1691e;
import com.bamtech.core.networking.Link;
import com.bamtech.core.networking.QueryParams.Builder;
import com.bamtech.core.networking.handlers.DefaultResponseTransformer;
import com.bamtech.core.networking.handlers.ResponseHandler;
import com.bamtech.sdk4.internal.configuration.AdEngineServiceConfigurationKt;
import com.bamtech.sdk4.internal.configuration.Configuration;
import com.bamtech.sdk4.internal.configuration.ConfigurationKt;
import com.bamtech.sdk4.internal.service.ResponseHandlersKt;
import com.bamtech.sdk4.internal.service.ServiceTransaction;
import com.bamtech.sdk4.internal.telemetry.dust.Dust$Events;
import java.util.Map;
import kotlin.C13145v;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import okhttp3.OkHttpClient;
import p520io.reactivex.Completable;
import p520io.reactivex.CompletableSource;
import p520io.reactivex.functions.Function;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0012\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003H\n¢\u0006\u0002\b\u0006"}, mo31007d2 = {"<anonymous>", "Lio/reactivex/Completable;", "<name for destructuring parameter 0>", "Lkotlin/Pair;", "Lcom/bamtech/core/networking/Link;", "Lcom/bamtech/sdk4/internal/configuration/Configuration;", "apply"}, mo31008k = 3, mo31009mv = {1, 1, 15})
/* compiled from: AdEngineClient.kt */
final class DefaultAdEngineClient$updateCookies$2<T, R> implements Function<Pair<? extends Link, ? extends Configuration>, CompletableSource> {
    final /* synthetic */ Map $payload;
    final /* synthetic */ Map $tokenMap;
    final /* synthetic */ ServiceTransaction $transaction;

    DefaultAdEngineClient$updateCookies$2(Map map, Map map2, ServiceTransaction serviceTransaction) {
        this.$payload = map;
        this.$tokenMap = map2;
        this.$transaction = serviceTransaction;
    }

    public final Completable apply(Pair<Link, Configuration> pair) {
        Link link = (Link) pair.mo31013a();
        Configuration configuration = (Configuration) pair.mo31014b();
        Link updateTemplates$default = Link.updateTemplates$default(link.toLinkBuilder().mo7435b((Function1<? super Builder, C13145v>) new Function1<Builder, C13145v>(this) {
            final /* synthetic */ DefaultAdEngineClient$updateCookies$2 this$0;

            {
                this.this$0 = r1;
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((Builder) obj);
                return C13145v.f29587a;
            }

            public final void invoke(Builder builder) {
                builder.mo7475a(this.this$0.$payload);
            }
        }).mo7432a(), this.$tokenMap, null, 2, null);
        OkHttpClient client = this.$transaction.getClient();
        ServiceTransaction serviceTransaction = this.$transaction;
        return C1169c.m6002a(C1691e.m7798a(updateTemplates$default, client, new DefaultResponseTransformer(new C1931x1a2297b4(new ResponseHandler[]{ResponseHandlersKt.noOpResponseHandler(serviceTransaction)}, serviceTransaction), new C1932x1a2297b5(serviceTransaction)), null, ConfigurationKt.toDustConfigSettings(configuration), 4, null), this.$transaction, AdEngineServiceConfigurationKt.getAD_ENGINE_SET_TOKEN(Dust$Events.INSTANCE));
    }
}
