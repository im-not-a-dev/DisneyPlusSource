package com.bamtech.sdk4.internal.content;

import com.bamtech.core.networking.C1691e;
import com.bamtech.core.networking.Headers;
import com.bamtech.core.networking.Link;
import com.bamtech.core.networking.Link.Builder;
import com.bamtech.core.networking.Request;
import com.bamtech.core.networking.handlers.ResponseHandler;
import com.bamtech.core.networking.handlers.ResponseTransformer;
import com.bamtech.sdk4.content.GraphQlConverterProvider;
import com.bamtech.sdk4.content.GraphQlResponse;
import com.bamtech.sdk4.content.GraphQlResponseConverter;
import com.bamtech.sdk4.content.custom.GraphQlRequest;
import com.bamtech.sdk4.internal.configuration.ConfigurationProvider;
import com.bamtech.sdk4.internal.configuration.ContentServiceConfiguration;
import com.bamtech.sdk4.internal.service.ServiceTransaction;
import com.bamtech.sdk4.internal.telemetry.dust.DustConfigSettings;
import java.lang.reflect.Type;
import java.util.List;
import java.util.Map;
import kotlin.C12907r;
import kotlin.TypeCastException;
import kotlin.C13145v;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import p520io.reactivex.Single;
import p520io.reactivex.SingleSource;
import p520io.reactivex.functions.Function;
import p520io.reactivex.p524d0.C11920c;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u001e\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0002J2\u0010\u000e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00100\u000f0\b\"\u0004\b\u0000\u0010\u00102\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u0012H\u0002J4\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00142\u000e\b\u0002\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00180\u00172\u0014\b\u0002\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\u001b0\u001aJT\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001d2\u0006\u0010\n\u001a\u00020\u000b2\u0012\u0010\u001e\u001a\u000e\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\u001b0\u001a2\u0006\u0010\u001f\u001a\u00020 2\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00180\u00172\u0012\u0010!\u001a\u000e\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\u001b0\u001aH\u0016Jh\u0010\"\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H#0\u000f0\u001d\"\u0004\b\u0000\u0010#2\u0006\u0010\n\u001a\u00020\u000b2\u0012\u0010\u001e\u001a\u000e\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\u001b0\u001a2\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010\u0011\u001a\u00020\u00122\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00180\u00172\u0012\u0010!\u001a\u000e\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\u001b0\u001aH\u0016J\u0001\u0010$\u001a\u000e\u0012\u0004\u0012\u0002H\u0010\u0012\u0004\u0012\u00020&0%\"\u0004\b\u0000\u0010\u0010*\u00020 2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010'\u001a\u00020(2\u0012\u0010\u001e\u001a\u000e\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\u001b0\u001a2\u0006\u0010\f\u001a\u00020\r2\f\u0010)\u001a\b\u0012\u0004\u0012\u0002H\u00100*2\u000e\b\u0002\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00180\u00172\u0014\b\u0002\u0010!\u001a\u000e\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\u001b0\u001a2\u0006\u0010+\u001a\u00020&H\u0000¢\u0006\u0002\b,R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000¨\u0006-"}, mo31007d2 = {"Lcom/bamtech/sdk4/internal/content/DefaultContentClient;", "Lcom/bamtech/sdk4/internal/content/ContentClient;", "configurationProvider", "Lcom/bamtech/sdk4/internal/configuration/ConfigurationProvider;", "converterProvider", "Lcom/bamtech/sdk4/content/GraphQlConverterProvider;", "(Lcom/bamtech/sdk4/internal/configuration/ConfigurationProvider;Lcom/bamtech/sdk4/content/GraphQlConverterProvider;)V", "graphQlErrorHandler", "Lcom/bamtech/core/networking/handlers/ResponseHandler;", "", "transaction", "Lcom/bamtech/sdk4/internal/service/ServiceTransaction;", "converter", "Lcom/bamtech/sdk4/content/GraphQlResponseConverter;", "graphQlHandler", "Lcom/bamtech/sdk4/content/GraphQlResponse;", "OUT", "type", "Ljava/lang/reflect/Type;", "handleSearchOverrides", "Lcom/bamtech/core/networking/Link;", "link", "optionalHeaders", "", "Lcom/bamtech/sdk4/internal/content/OptionalHeaderTemplate;", "headers", "", "", "query", "Lio/reactivex/Single;", "templateMap", "request", "Lcom/bamtech/sdk4/content/custom/GraphQlRequest;", "customHeaders", "typedQuery", "T", "createRequest", "Lcom/bamtech/core/networking/Request;", "Lcom/bamtech/sdk4/internal/telemetry/dust/DustConfigSettings;", "configuration", "Lcom/bamtech/sdk4/internal/configuration/ContentServiceConfiguration;", "transformer", "Lcom/bamtech/core/networking/handlers/ResponseTransformer;", "config", "createRequest$extension_content", "extension-content"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* compiled from: ContentClient.kt */
public final class DefaultContentClient implements ContentClient {
    private final ConfigurationProvider configurationProvider;
    /* access modifiers changed from: private */
    public final GraphQlConverterProvider converterProvider;

    public DefaultContentClient(ConfigurationProvider configurationProvider2, GraphQlConverterProvider graphQlConverterProvider) {
        this.configurationProvider = configurationProvider2;
        this.converterProvider = graphQlConverterProvider;
    }

    private final ResponseHandler graphQlErrorHandler(ServiceTransaction serviceTransaction, GraphQlResponseConverter graphQlResponseConverter) {
        return new DefaultContentClient$graphQlErrorHandler$1(graphQlResponseConverter, serviceTransaction);
    }

    private final <OUT> ResponseHandler<GraphQlResponse<OUT>> graphQlHandler(ServiceTransaction serviceTransaction, GraphQlResponseConverter graphQlResponseConverter, Type type) {
        return new DefaultContentClient$graphQlHandler$1(graphQlResponseConverter, type, serviceTransaction);
    }

    public final <OUT> Request<OUT, DustConfigSettings> createRequest$extension_content(GraphQlRequest graphQlRequest, ServiceTransaction serviceTransaction, ContentServiceConfiguration contentServiceConfiguration, Map<String, String> map, GraphQlResponseConverter graphQlResponseConverter, ResponseTransformer<? extends OUT> responseTransformer, List<OptionalHeaderTemplate> list, Map<String, String> map2, DustConfigSettings dustConfigSettings) {
        Pair pair;
        Link handleSearchOverrides = handleSearchOverrides(Link.updateTemplates$default(contentServiceConfiguration.getLink(graphQlRequest.getContext()), map, null, 2, null), list, map2);
        Link createQueryUrl = graphQlRequest.createQueryUrl(handleSearchOverrides, GraphQlRequest.Companion.getGET(), graphQlResponseConverter, contentServiceConfiguration.getExtras());
        Link createQueryUrl2 = graphQlRequest.createQueryUrl(handleSearchOverrides, GraphQlRequest.Companion.getPOST(), graphQlResponseConverter, contentServiceConfiguration.getExtras());
        String method = handleSearchOverrides.getMethod();
        if (method != null) {
            String upperCase = method.toUpperCase();
            Intrinsics.checkReturnedValueIsNotNull((Object) upperCase, "(this as java.lang.String).toUpperCase()");
            if (createQueryUrl.getHref().length() > contentServiceConfiguration.getClient().getExtras().getUrlSizeLimit() || !Intrinsics.areEqual((Object) upperCase, (Object) GraphQlRequest.Companion.getGET())) {
                pair = C12907r.m40244a(createQueryUrl2, graphQlRequest.createPostContent(graphQlResponseConverter));
            } else {
                pair = C12907r.m40244a(createQueryUrl, null);
            }
            return C1691e.m7796a((Link) pair.mo31013a(), serviceTransaction.getClient(), responseTransformer, (String) pair.mo31014b(), dustConfigSettings);
        }
        throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
    }

    public final Link handleSearchOverrides(Link link, List<OptionalHeaderTemplate> list, Map<String, String> map) {
        Builder linkBuilder = link.toLinkBuilder();
        for (OptionalHeaderTemplate optionalHeaderTemplate : list) {
            String str = (String) link.getOptionalHeaders().get(optionalHeaderTemplate.getName());
            if (str != null) {
                linkBuilder.mo7431a((Function1<? super Headers.Builder, C13145v>) new C1841xc318d05d<Object,C13145v>(str, optionalHeaderTemplate, link, linkBuilder));
            }
        }
        return linkBuilder.mo7431a((Function1<? super Headers.Builder, C13145v>) new DefaultContentClient$handleSearchOverrides$2<Object,C13145v>(map)).mo7432a();
    }

    public Single<String> query(ServiceTransaction serviceTransaction, Map<String, String> map, GraphQlRequest graphQlRequest, List<OptionalHeaderTemplate> list, Map<String, String> map2) {
        Single a = C11920c.m38475a(this.configurationProvider.getServiceConfiguration(serviceTransaction, DefaultContentClient$query$1.INSTANCE), this.configurationProvider.getServiceConfiguration(serviceTransaction, DefaultContentClient$query$2.INSTANCE));
        DefaultContentClient$query$3 defaultContentClient$query$3 = new DefaultContentClient$query$3(this, graphQlRequest, serviceTransaction, map, list, map2);
        Single<String> a2 = a.mo30208a((Function<? super T, ? extends SingleSource<? extends R>>) defaultContentClient$query$3);
        Intrinsics.checkReturnedValueIsNotNull((Object) a2, "configurationProvider.ge…_QUERY)\n                }");
        return a2;
    }

    public <T> Single<GraphQlResponse<T>> typedQuery(ServiceTransaction serviceTransaction, Map<String, String> map, GraphQlRequest graphQlRequest, Type type, List<OptionalHeaderTemplate> list, Map<String, String> map2) {
        ServiceTransaction serviceTransaction2 = serviceTransaction;
        GraphQlResponseConverter converter = this.converterProvider.getConverter();
        Type type2 = type;
        ResponseHandler graphQlHandler = graphQlHandler(serviceTransaction, converter, type2);
        ResponseHandler graphQlErrorHandler = graphQlErrorHandler(serviceTransaction, converter);
        Single a = C11920c.m38475a(this.configurationProvider.getServiceConfiguration(serviceTransaction, DefaultContentClient$typedQuery$1$1.INSTANCE), this.configurationProvider.getServiceConfiguration(serviceTransaction, DefaultContentClient$typedQuery$1$2.INSTANCE));
        DefaultContentClient$typedQuery$$inlined$with$lambda$1 defaultContentClient$typedQuery$$inlined$with$lambda$1 = new DefaultContentClient$typedQuery$$inlined$with$lambda$1(converter, graphQlHandler, graphQlErrorHandler, this, serviceTransaction2, type2, graphQlRequest, map, list, map2);
        Single<GraphQlResponse<T>> a2 = a.mo30208a((Function<? super T, ? extends SingleSource<? extends R>>) defaultContentClient$typedQuery$$inlined$with$lambda$1);
        Intrinsics.checkReturnedValueIsNotNull((Object) a2, "configurationProvider.ge…ED)\n                    }");
        return a2;
    }
}
