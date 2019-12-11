package com.bamtech.sdk4.internal.content;

import com.bamtech.core.networking.C1681c;
import com.bamtech.core.networking.C1691e;
import com.bamtech.core.networking.Request;
import com.bamtech.core.networking.handlers.DefaultResponseTransformer;
import com.bamtech.core.networking.handlers.ResponseHandler;
import com.bamtech.sdk4.content.GraphQlResponseConverter;
import com.bamtech.sdk4.content.custom.GraphQlRequest;
import com.bamtech.sdk4.internal.configuration.ContentServiceConfiguration;
import com.bamtech.sdk4.internal.configuration.ContentServiceConfigurationKt;
import com.bamtech.sdk4.internal.configuration.TelemetryServiceConfiguration;
import com.bamtech.sdk4.internal.configuration.TelemetryServiceConfigurationKt;
import com.bamtech.sdk4.internal.service.ServiceTransaction;
import com.bamtech.sdk4.internal.telemetry.dust.Dust$Events;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.C12880j;
import okhttp3.Call;
import p520io.reactivex.Single;
import p520io.reactivex.SingleSource;
import p520io.reactivex.disposables.Disposable;
import p520io.reactivex.functions.C11945a;
import p520io.reactivex.functions.Consumer;
import p520io.reactivex.functions.Function;
import p520io.reactivex.p525e0.C11934b;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\u001c\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u001a\u0010\u0003\u001a\u0016\u0012\u0004\u0012\u00020\u0005\u0012\f\u0012\n \u0007*\u0004\u0018\u00010\u00060\u00060\u0004H\n¢\u0006\u0002\b\b"}, mo31007d2 = {"<anonymous>", "Lio/reactivex/Single;", "", "<name for destructuring parameter 0>", "Lkotlin/Pair;", "Lcom/bamtech/sdk4/internal/configuration/ContentServiceConfiguration;", "Lcom/bamtech/sdk4/internal/configuration/TelemetryServiceConfiguration;", "kotlin.jvm.PlatformType", "apply"}, mo31008k = 3, mo31009mv = {1, 1, 15})
/* compiled from: ContentClient.kt */
final class DefaultContentClient$query$3<T, R> implements Function<T, SingleSource<? extends R>> {
    final /* synthetic */ Map $customHeaders;
    final /* synthetic */ List $optionalHeaders;
    final /* synthetic */ GraphQlRequest $request;
    final /* synthetic */ Map $templateMap;
    final /* synthetic */ ServiceTransaction $transaction;
    final /* synthetic */ DefaultContentClient this$0;

    DefaultContentClient$query$3(DefaultContentClient defaultContentClient, GraphQlRequest graphQlRequest, ServiceTransaction serviceTransaction, Map map, List list, Map map2) {
        this.this$0 = defaultContentClient;
        this.$request = graphQlRequest;
        this.$transaction = serviceTransaction;
        this.$templateMap = map;
        this.$optionalHeaders = list;
        this.$customHeaders = map2;
    }

    public final Single<String> apply(Pair<ContentServiceConfiguration, TelemetryServiceConfiguration> pair) {
        ContentServiceConfiguration contentServiceConfiguration = (ContentServiceConfiguration) pair.mo31013a();
        TelemetryServiceConfiguration telemetryServiceConfiguration = (TelemetryServiceConfiguration) pair.mo31014b();
        DefaultContentClient defaultContentClient = this.this$0;
        GraphQlRequest graphQlRequest = this.$request;
        ServiceTransaction serviceTransaction = this.$transaction;
        Map map = this.$templateMap;
        GraphQlResponseConverter converter = defaultContentClient.converterProvider.getConverter();
        ServiceTransaction serviceTransaction2 = this.$transaction;
        DefaultResponseTransformer defaultResponseTransformer = new DefaultResponseTransformer(new C1843x6e358089(new ResponseHandler[]{new DefaultContentClient$query$3$$special$$inlined$responseHandler$1(this.this$0.converterProvider.getString())}, serviceTransaction2), new C1844x6e35808a(serviceTransaction2));
        List list = this.$optionalHeaders;
        Map map2 = this.$customHeaders;
        C12880j.m40222a((Object) telemetryServiceConfiguration, "telemetryConfig");
        Request createRequest$extension_content = defaultContentClient.createRequest$extension_content(graphQlRequest, serviceTransaction, contentServiceConfiguration, map, converter, defaultResponseTransformer, list, map2, TelemetryServiceConfigurationKt.toDustConfigSettings(telemetryServiceConfiguration));
        ServiceTransaction serviceTransaction3 = this.$transaction;
        String content_query = ContentServiceConfigurationKt.getCONTENT_QUERY(Dust$Events.INSTANCE);
        Call a = C1691e.m7799a(createRequest$extension_content);
        Single b = C1681c.m7780a(createRequest$extension_content, a).mo30223c((C11945a) new DefaultContentClient$query$3$$special$$inlined$toSingle$1(a)).mo30220b(C11934b.m38500b());
        C12880j.m40222a((Object) b, "call(this, call)\n       …scribeOn(Schedulers.io())");
        Single<String> g = b.mo30222c((Consumer<? super Disposable>) new DefaultContentClient$query$3$$special$$inlined$toSingle$2<Object>(serviceTransaction3, content_query)).mo30218b((Consumer<? super Throwable>) new DefaultContentClient$query$3$$special$$inlined$toSingle$3<Object>(createRequest$extension_content, serviceTransaction3, content_query)).mo30233g(new DefaultContentClient$query$3$$special$$inlined$toSingle$4(serviceTransaction3, content_query));
        C12880j.m40222a((Object) g, "this.asSingle()\n        …        it.body\n        }");
        return g;
    }
}
