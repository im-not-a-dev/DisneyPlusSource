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
import com.bamtech.sdk4.service.NetworkException;
import java.util.Map;
import kotlin.C13145v;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import p520io.reactivex.Completable;
import p520io.reactivex.CompletableSource;
import p520io.reactivex.functions.Function;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0012\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003H\n¢\u0006\u0002\b\u0006¨\u0006\u0007"}, mo31007d2 = {"<anonymous>", "Lio/reactivex/Completable;", "<name for destructuring parameter 0>", "Lkotlin/Pair;", "Lcom/bamtech/core/networking/Link;", "Lcom/bamtech/sdk4/internal/configuration/Configuration;", "apply", "com/bamtech/sdk4/internal/identity/bam/DefaultPasswordClient$changePassword$1$2"}, mo31008k = 3, mo31009mv = {1, 1, 15})
/* compiled from: PasswordClient.kt */
final class DefaultPasswordClient$changePassword$$inlined$with$lambda$1<T, R> implements Function<Pair<? extends Link, ? extends Configuration>, CompletableSource> {
    final /* synthetic */ ChangePasswordRequest $request$inlined;
    final /* synthetic */ Map $tokenMap$inlined;
    final /* synthetic */ ServiceTransaction $transaction$inlined;
    final /* synthetic */ DefaultPasswordClient this$0;

    DefaultPasswordClient$changePassword$$inlined$with$lambda$1(DefaultPasswordClient defaultPasswordClient, ServiceTransaction serviceTransaction, Map map, ChangePasswordRequest changePasswordRequest) {
        this.this$0 = defaultPasswordClient;
        this.$transaction$inlined = serviceTransaction;
        this.$tokenMap$inlined = map;
        this.$request$inlined = changePasswordRequest;
    }

    public final Completable apply(Pair<Link, Configuration> pair) {
        Link link = (Link) pair.mo31013a();
        Configuration configuration = (Configuration) pair.mo31014b();
        Link updateTemplates$default = Link.updateTemplates$default(link, this.$tokenMap$inlined, null, 2, null);
        OkHttpClient client = this.$transaction$inlined.getClient();
        final ServiceTransaction serviceTransaction = this.$transaction$inlined;
        final ResponseHandler[] responseHandlerArr = {ResponseHandlersKt.noOpResponseHandler(serviceTransaction)};
        return C1169c.m6002a(C1691e.m7796a(updateTemplates$default, client, (ResponseTransformer<? extends OUT>) new DefaultResponseTransformer<Object>(new Function1<Response, com.bamtech.core.networking.Response<? extends C13145v>>() {
            public final com.bamtech.core.networking.Response<C13145v> invoke(Response response) {
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
        }), this.this$0.converters.getIdentity().serialize(this.$request$inlined), ConfigurationKt.toDustConfigSettings(configuration)), this.$transaction$inlined, BamIdentityServiceConfigurationKt.getBAM_IDENTITY_CHANGE_PASSWORD(Dust$Events.INSTANCE));
    }
}
