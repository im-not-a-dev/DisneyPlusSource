package com.bamtech.sdk4.internal.media;

import com.bamtech.core.networking.C1681c;
import com.bamtech.core.networking.C1691e;
import com.bamtech.core.networking.Link;
import com.bamtech.core.networking.Request;
import com.bamtech.core.networking.handlers.DefaultResponseTransformer;
import com.bamtech.core.networking.handlers.ResponseHandler;
import com.bamtech.sdk4.internal.configuration.Configuration;
import com.bamtech.sdk4.internal.configuration.ConfigurationKt;
import com.bamtech.sdk4.internal.service.ResponseHandlersKt;
import com.bamtech.sdk4.internal.service.ServiceTransaction;
import com.bamtech.sdk4.internal.telemetry.dust.Dust$Events;
import com.bamtech.sdk4.internal.telemetry.dust.DustConfigSettings;
import com.bamtech.sdk4.media.drm.SilkDrmProviderKt;
import com.bamtech.sdk4.service.NetworkException;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.Call;
import okhttp3.OkHttpClient;
import okhttp3.Response;
import p520io.reactivex.Single;
import p520io.reactivex.SingleSource;
import p520io.reactivex.disposables.Disposable;
import p520io.reactivex.functions.C11945a;
import p520io.reactivex.functions.Consumer;
import p520io.reactivex.functions.Function;
import p520io.reactivex.p525e0.C11934b;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\u001c\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\n¢\u0006\u0002\b\u0007¨\u0006\b"}, mo31007d2 = {"<anonymous>", "Lio/reactivex/Single;", "", "<name for destructuring parameter 0>", "Lkotlin/Pair;", "Lcom/bamtech/core/networking/Link;", "Lcom/bamtech/sdk4/internal/configuration/Configuration;", "apply", "com/bamtech/sdk4/internal/media/DefaultOnlineMediaClient$getMediaKey$1$2"}, mo31008k = 3, mo31009mv = {1, 1, 15})
/* compiled from: DefaultOnlineMediaClient.kt */
final class DefaultOnlineMediaClient$getMediaKey$$inlined$with$lambda$1<T, R> implements Function<T, SingleSource<? extends R>> {
    final /* synthetic */ Map $tokenMap$inlined;
    final /* synthetic */ ServiceTransaction $transaction$inlined;
    final /* synthetic */ String $url$inlined;
    final /* synthetic */ DefaultOnlineMediaClient this$0;

    DefaultOnlineMediaClient$getMediaKey$$inlined$with$lambda$1(DefaultOnlineMediaClient defaultOnlineMediaClient, ServiceTransaction serviceTransaction, Map map, String str) {
        this.this$0 = defaultOnlineMediaClient;
        this.$transaction$inlined = serviceTransaction;
        this.$tokenMap$inlined = map;
        this.$url$inlined = str;
    }

    public final Single<byte[]> apply(Pair<Link, Configuration> pair) {
        Link link = (Link) pair.mo31013a();
        Configuration configuration = (Configuration) pair.mo31014b();
        Link updateTemplates = link.updateTemplates(this.$tokenMap$inlined, this.$url$inlined);
        OkHttpClient client = this.$transaction$inlined.getClient();
        final ServiceTransaction serviceTransaction = this.$transaction$inlined;
        final ResponseHandler[] responseHandlerArr = {this.this$0.responseHandler()};
        final Request a = C1691e.m7798a(updateTemplates, client, new DefaultResponseTransformer(new Function1<Response, com.bamtech.core.networking.Response<? extends byte[]>>() {
            public final com.bamtech.core.networking.Response<byte[]> invoke(Response response) {
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
                invoke((Throwable) obj, (okhttp3.Request) obj2);
                throw null;
            }

            public final Void invoke(Throwable th, okhttp3.Request request) {
                NetworkException networkException = new NetworkException(serviceTransaction.getId(), null, th, 2, null);
                throw networkException;
            }
        }), null, ConfigurationKt.toDustConfigSettings(configuration), 4, null);
        final ServiceTransaction serviceTransaction2 = this.$transaction$inlined;
        final String dust_drm_silk_key = SilkDrmProviderKt.getDUST_DRM_SILK_KEY(Dust$Events.INSTANCE);
        final Call a2 = C1691e.m7799a(a);
        Single b = C1681c.m7780a(a, a2).mo30223c((C11945a) new C11945a() {
            public final void run() {
                a2.cancel();
            }
        }).mo30220b(C11934b.m38500b());
        Intrinsics.checkReturnedValueIsNotNull((Object) b, "call(this, call)\n       …scribeOn(Schedulers.io())");
        Single<byte[]> g = b.mo30222c((Consumer<? super Disposable>) new Consumer<Disposable>() {
            public final void accept(Disposable disposable) {
                C1169c.m6003a(serviceTransaction2, dust_drm_silk_key);
            }
        }).mo30218b((Consumer<? super Throwable>) new Consumer<Throwable>() {
            public final void accept(Throwable th) {
                ServiceTransaction serviceTransaction = serviceTransaction2;
                String str = dust_drm_silk_key;
                Intrinsics.checkReturnedValueIsNotNull((Object) th, "it");
                C1169c.m6004a(serviceTransaction, str, th, (DustConfigSettings) a.mo7480c());
            }
        }).mo30233g(new Function<T, R>() {
            /* JADX WARNING: type inference failed for: r4v1, types: [byte[], java.lang.Object] */
            /* JADX WARNING: Multi-variable type inference failed. Error: jadx.core.utils.exceptions.JadxRuntimeException: No candidate types for var: r4v1, types: [byte[], java.lang.Object]
              assigns: [java.lang.Object]
              uses: [byte[]]
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
            public final byte[] apply(com.bamtech.core.networking.Response<? extends byte[]> r4) {
                /*
                    r3 = this;
                    com.bamtech.sdk4.internal.service.ServiceTransaction r0 = r0
                    java.lang.String r1 = r1
                    okhttp3.Response r2 = r4.mo7485b()
                    p000.C1169c.m6005a(r0, r1, r2)
                    java.lang.Object r4 = r4.mo7484a()
                    return r4
                */
                throw new UnsupportedOperationException("Method not decompiled: com.bamtech.sdk4.internal.media.DefaultOnlineMediaClient$getMediaKey$$inlined$with$lambda$1.C19066.apply(com.bamtech.core.networking.Response):java.lang.Object");
            }
        });
        Intrinsics.checkReturnedValueIsNotNull((Object) g, "this.asSingle()\n        …        it.body\n        }");
        return g;
    }
}
