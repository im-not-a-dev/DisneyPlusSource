package com.bamtech.sdk4.internal.token;

import com.bamtech.core.networking.C1681c;
import com.bamtech.core.networking.C1691e;
import com.bamtech.core.networking.Link;
import com.bamtech.core.networking.Request;
import com.bamtech.core.networking.handlers.DefaultResponseTransformer;
import com.bamtech.core.networking.handlers.ResponseHandler;
import com.bamtech.core.networking.handlers.ResponseTransformer;
import com.bamtech.sdk4.internal.configuration.Configuration;
import com.bamtech.sdk4.internal.configuration.ConfigurationKt;
import com.bamtech.sdk4.internal.configuration.TokenServiceConfigurationKt;
import com.bamtech.sdk4.internal.service.ServiceTransaction;
import com.bamtech.sdk4.internal.telemetry.dust.Dust$Events;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.C14262x;
import okhttp3.Call;
import okhttp3.FormBody;
import okhttp3.OkHttpClient;
import p520io.reactivex.Single;
import p520io.reactivex.SingleSource;
import p520io.reactivex.disposables.Disposable;
import p520io.reactivex.functions.C11945a;
import p520io.reactivex.functions.Consumer;
import p520io.reactivex.functions.Function;
import p520io.reactivex.p525e0.C11934b;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u0010\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, mo31007d2 = {"<anonymous>", "Lio/reactivex/Single;", "Lcom/bamtech/sdk4/internal/token/TokenExchangeResponse;", "kotlin.jvm.PlatformType", "body", "Lokhttp3/FormBody;", "apply"}, mo31008k = 3, mo31009mv = {1, 1, 15})
/* compiled from: TokenClient.kt */
final class DefaultTokenClient$exchange$2<T, R> implements Function<T, SingleSource<? extends R>> {
    final /* synthetic */ Map $tokenMap;
    final /* synthetic */ ServiceTransaction $transaction;
    final /* synthetic */ DefaultTokenClient this$0;

    DefaultTokenClient$exchange$2(DefaultTokenClient defaultTokenClient, ServiceTransaction serviceTransaction, Map map) {
        this.this$0 = defaultTokenClient;
        this.$transaction = serviceTransaction;
        this.$tokenMap = map;
    }

    public final Single<TokenExchangeResponse> apply(final FormBody formBody) {
        return this.this$0.configurationProvider.getServiceLink(this.$transaction, C20911.INSTANCE).mo30208a((Function<? super T, ? extends SingleSource<? extends R>>) new Function<T, SingleSource<? extends R>>(this) {
            final /* synthetic */ DefaultTokenClient$exchange$2 this$0;

            {
                this.this$0 = r1;
            }

            public final Single<TokenExchangeResponse> apply(Pair<Link, Configuration> pair) {
                Link link = (Link) pair.mo31013a();
                Configuration configuration = (Configuration) pair.mo31014b();
                Link updateTemplates$default = Link.updateTemplates$default(link, this.this$0.$tokenMap, null, 2, null);
                OkHttpClient client = this.this$0.$transaction.getClient();
                DefaultTokenClient$exchange$2 defaultTokenClient$exchange$2 = this.this$0;
                ServiceTransaction serviceTransaction = defaultTokenClient$exchange$2.$transaction;
                DefaultTokenClient$exchange$2 defaultTokenClient$exchange$22 = this.this$0;
                DefaultResponseTransformer defaultResponseTransformer = new DefaultResponseTransformer(new C2089x793fbcd3(new ResponseHandler[]{new C2087xd2d1bd44(defaultTokenClient$exchange$2.this$0.converters.getSnake()), defaultTokenClient$exchange$22.this$0.errorResponseHandler(defaultTokenClient$exchange$22.$transaction)}, serviceTransaction), new C2090x793fbcd4(serviceTransaction));
                FormBody formBody = formBody;
                Intrinsics.checkReturnedValueIsNotNull((Object) formBody, "body");
                Request a = C1691e.m7797a(updateTemplates$default, client, (ResponseTransformer<? extends OUT>) defaultResponseTransformer, (C14262x) formBody, ConfigurationKt.toDustConfigSettings(configuration));
                ServiceTransaction serviceTransaction2 = this.this$0.$transaction;
                String token_exchange = TokenServiceConfigurationKt.getTOKEN_EXCHANGE(Dust$Events.INSTANCE);
                Call a2 = C1691e.m7799a(a);
                Single b = C1681c.m7780a(a, a2).mo30223c((C11945a) new DefaultTokenClient$exchange$2$2$$special$$inlined$toSingle$1(a2)).mo30220b(C11934b.m38500b());
                Intrinsics.checkReturnedValueIsNotNull((Object) b, "call(this, call)\n       …scribeOn(Schedulers.io())");
                Single<TokenExchangeResponse> g = b.mo30222c((Consumer<? super Disposable>) new DefaultTokenClient$exchange$2$2$$special$$inlined$toSingle$2<Object>(serviceTransaction2, token_exchange)).mo30218b((Consumer<? super Throwable>) new DefaultTokenClient$exchange$2$2$$special$$inlined$toSingle$3<Object>(a, serviceTransaction2, token_exchange)).mo30233g(new DefaultTokenClient$exchange$2$2$$special$$inlined$toSingle$4(serviceTransaction2, token_exchange));
                Intrinsics.checkReturnedValueIsNotNull((Object) g, "this.asSingle()\n        …        it.body\n        }");
                return g;
            }
        });
    }
}
