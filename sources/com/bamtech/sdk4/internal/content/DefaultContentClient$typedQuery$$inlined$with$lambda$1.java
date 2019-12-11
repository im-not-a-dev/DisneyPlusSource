package com.bamtech.sdk4.internal.content;

import com.bamtech.core.networking.C1681c;
import com.bamtech.core.networking.C1691e;
import com.bamtech.core.networking.handlers.DefaultResponseTransformer;
import com.bamtech.core.networking.handlers.ResponseHandler;
import com.bamtech.sdk4.content.GraphQlResponse;
import com.bamtech.sdk4.content.GraphQlResponseConverter;
import com.bamtech.sdk4.content.custom.GraphQlRequest;
import com.bamtech.sdk4.internal.configuration.ContentServiceConfiguration;
import com.bamtech.sdk4.internal.configuration.ContentServiceConfigurationKt;
import com.bamtech.sdk4.internal.configuration.TelemetryServiceConfiguration;
import com.bamtech.sdk4.internal.configuration.TelemetryServiceConfigurationKt;
import com.bamtech.sdk4.internal.service.ResponseHandlersKt;
import com.bamtech.sdk4.internal.service.ServiceTransaction;
import com.bamtech.sdk4.internal.telemetry.dust.Dust$Events;
import com.bamtech.sdk4.internal.telemetry.dust.DustConfigSettings;
import com.bamtech.sdk4.service.NetworkException;
import java.lang.reflect.Type;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.C12880j;
import okhttp3.Call;
import okhttp3.Request;
import okhttp3.Response;
import p520io.reactivex.Single;
import p520io.reactivex.SingleSource;
import p520io.reactivex.disposables.Disposable;
import p520io.reactivex.functions.C11945a;
import p520io.reactivex.functions.Consumer;
import p520io.reactivex.functions.Function;
import p520io.reactivex.p525e0.C11934b;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000&\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00030\u00020\u0001\"\u0004\b\u0000\u0010\u00032\u001a\u0010\u0004\u001a\u0016\u0012\u0004\u0012\u00020\u0006\u0012\f\u0012\n \b*\u0004\u0018\u00010\u00070\u00070\u0005H\n¢\u0006\u0002\b\t¨\u0006\n"}, mo31007d2 = {"<anonymous>", "Lio/reactivex/Single;", "Lcom/bamtech/sdk4/content/GraphQlResponse;", "T", "<name for destructuring parameter 0>", "Lkotlin/Pair;", "Lcom/bamtech/sdk4/internal/configuration/ContentServiceConfiguration;", "Lcom/bamtech/sdk4/internal/configuration/TelemetryServiceConfiguration;", "kotlin.jvm.PlatformType", "apply", "com/bamtech/sdk4/internal/content/DefaultContentClient$typedQuery$1$3"}, mo31008k = 3, mo31009mv = {1, 1, 15})
/* compiled from: ContentClient.kt */
final class DefaultContentClient$typedQuery$$inlined$with$lambda$1<T, R> implements Function<T, SingleSource<? extends R>> {
    final /* synthetic */ GraphQlResponseConverter $converter;
    final /* synthetic */ Map $customHeaders$inlined;
    final /* synthetic */ ResponseHandler $exceptionHandler;
    final /* synthetic */ ResponseHandler $graphQlHandler;
    final /* synthetic */ List $optionalHeaders$inlined;
    final /* synthetic */ GraphQlRequest $request$inlined;
    final /* synthetic */ Map $templateMap$inlined;
    final /* synthetic */ ServiceTransaction $transaction$inlined;
    final /* synthetic */ DefaultContentClient this$0;

    DefaultContentClient$typedQuery$$inlined$with$lambda$1(GraphQlResponseConverter graphQlResponseConverter, ResponseHandler responseHandler, ResponseHandler responseHandler2, DefaultContentClient defaultContentClient, ServiceTransaction serviceTransaction, Type type, GraphQlRequest graphQlRequest, Map map, List list, Map map2) {
        this.$converter = graphQlResponseConverter;
        this.$graphQlHandler = responseHandler;
        this.$exceptionHandler = responseHandler2;
        this.this$0 = defaultContentClient;
        this.$transaction$inlined = serviceTransaction;
        this.$request$inlined = graphQlRequest;
        this.$templateMap$inlined = map;
        this.$optionalHeaders$inlined = list;
        this.$customHeaders$inlined = map2;
    }

    public final Single<GraphQlResponse<T>> apply(Pair<ContentServiceConfiguration, TelemetryServiceConfiguration> pair) {
        ContentServiceConfiguration contentServiceConfiguration = (ContentServiceConfiguration) pair.mo31013a();
        TelemetryServiceConfiguration telemetryServiceConfiguration = (TelemetryServiceConfiguration) pair.mo31014b();
        DefaultContentClient defaultContentClient = this.this$0;
        GraphQlRequest graphQlRequest = this.$request$inlined;
        final ServiceTransaction serviceTransaction = this.$transaction$inlined;
        Map map = this.$templateMap$inlined;
        GraphQlResponseConverter graphQlResponseConverter = this.$converter;
        final ResponseHandler[] responseHandlerArr = {this.$graphQlHandler, this.$exceptionHandler};
        DefaultResponseTransformer defaultResponseTransformer = new DefaultResponseTransformer(new Function1<Response, com.bamtech.core.networking.Response<? extends GraphQlResponse<? extends T>>>() {
            public final com.bamtech.core.networking.Response<GraphQlResponse<? extends T>> invoke(Response response) {
                ResponseHandler responseHandler;
                ResponseHandler[] responseHandlerArr = responseHandlerArr;
                int length = responseHandlerArr.length;
                int i = 0;
                while (true) {
                    if (i >= length) {
                        responseHandler = null;
                        break;
                    }
                    responseHandler = responseHandlerArr[i];
                    if (responseHandler.canHandle(response)) {
                        break;
                    }
                    i++;
                }
                if (responseHandler != null) {
                    return new com.bamtech.core.networking.Response<>(response, responseHandler.handle(response));
                }
                Throwable th = (Throwable) ResponseHandlersKt.exceptionHandler(serviceTransaction).handle(response);
                th.addSuppressed(new DustServerPlayloadException(C1169c.m6001a(response)));
                throw th;
            }
        }, new Function2() {
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                invoke((Throwable) obj, (Request) obj2);
                throw null;
            }

            public final Void invoke(Throwable th, Request request) {
                NetworkException networkException = new NetworkException(serviceTransaction.getId(), null, th, 2, null);
                throw networkException;
            }
        });
        List list = this.$optionalHeaders$inlined;
        Map map2 = this.$customHeaders$inlined;
        C12880j.m40222a((Object) telemetryServiceConfiguration, "telemetryConfig");
        final com.bamtech.core.networking.Request createRequest$extension_content = defaultContentClient.createRequest$extension_content(graphQlRequest, serviceTransaction, contentServiceConfiguration, map, graphQlResponseConverter, defaultResponseTransformer, list, map2, TelemetryServiceConfigurationKt.toDustConfigSettings(telemetryServiceConfiguration));
        final ServiceTransaction serviceTransaction2 = this.$transaction$inlined;
        final String content_query_typed = ContentServiceConfigurationKt.getCONTENT_QUERY_TYPED(Dust$Events.INSTANCE);
        final Call a = C1691e.m7799a(createRequest$extension_content);
        Single b = C1681c.m7780a(createRequest$extension_content, a).mo30223c((C11945a) new C11945a() {
            public final void run() {
                a.cancel();
            }
        }).mo30220b(C11934b.m38500b());
        C12880j.m40222a((Object) b, "call(this, call)\n       …scribeOn(Schedulers.io())");
        Single<GraphQlResponse<T>> g = b.mo30222c((Consumer<? super Disposable>) new Consumer<Disposable>() {
            public final void accept(Disposable disposable) {
                C1169c.m6003a(serviceTransaction2, content_query_typed);
            }
        }).mo30218b((Consumer<? super Throwable>) new Consumer<Throwable>() {
            public final void accept(Throwable th) {
                ServiceTransaction serviceTransaction = serviceTransaction2;
                String str = content_query_typed;
                C12880j.m40222a((Object) th, "it");
                C1169c.m6004a(serviceTransaction, str, th, (DustConfigSettings) createRequest$extension_content.mo7480c());
            }
        }).mo30233g(new Function<T, R>() {
            /* JADX WARNING: type inference failed for: r4v1, types: [java.lang.Object, com.bamtech.sdk4.content.GraphQlResponse<? extends T>] */
            /* JADX WARNING: Multi-variable type inference failed. Error: jadx.core.utils.exceptions.JadxRuntimeException: No candidate types for var: r4v1, types: [java.lang.Object, com.bamtech.sdk4.content.GraphQlResponse<? extends T>]
              assigns: [java.lang.Object]
              uses: [com.bamtech.sdk4.content.GraphQlResponse<? extends T>]
              mth insns count: 6
            	at jadx.core.dex.visitors.typeinference.TypeSearch.fillTypeCandidates(TypeSearch.java:237)
            	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
            	at jadx.core.dex.visitors.typeinference.TypeSearch.run(TypeSearch.java:53)
            	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runMultiVariableSearch(TypeInferenceVisitor.java:99)
            	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:92)
            	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:27)
            	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$1(DepthTraversal.java:14)
            	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
            	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
            	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$0(DepthTraversal.java:13)
            	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
            	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:13)
            	at jadx.core.ProcessClass.process(ProcessClass.java:30)
            	at jadx.core.ProcessClass.lambda$processDependencies$0(ProcessClass.java:49)
            	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
            	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:49)
            	at jadx.core.ProcessClass.process(ProcessClass.java:35)
            	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:311)
            	at jadx.api.JavaClass.decompile(JavaClass.java:62)
            	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:217)
             */
            /* JADX WARNING: Unknown variable types count: 1 */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final com.bamtech.sdk4.content.GraphQlResponse<? extends T> apply(com.bamtech.core.networking.Response<? extends com.bamtech.sdk4.content.GraphQlResponse<? extends T>> r4) {
                /*
                    r3 = this;
                    com.bamtech.sdk4.internal.service.ServiceTransaction r0 = r0
                    java.lang.String r1 = r1
                    okhttp3.Response r2 = r4.mo7485b()
                    p000.C1169c.m6005a(r0, r1, r2)
                    java.lang.Object r4 = r4.mo7484a()
                    return r4
                */
                throw new UnsupportedOperationException("Method not decompiled: com.bamtech.sdk4.internal.content.DefaultContentClient$typedQuery$$inlined$with$lambda$1.C18506.apply(com.bamtech.core.networking.Response):java.lang.Object");
            }
        });
        C12880j.m40222a((Object) g, "this.asSingle()\n        …        it.body\n        }");
        return g;
    }
}
