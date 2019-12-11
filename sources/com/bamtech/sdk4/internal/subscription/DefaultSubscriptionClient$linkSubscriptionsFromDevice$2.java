package com.bamtech.sdk4.internal.subscription;

import com.bamtech.core.networking.C1681c;
import com.bamtech.core.networking.C1691e;
import com.bamtech.core.networking.Link;
import com.bamtech.core.networking.Request;
import com.bamtech.core.networking.handlers.DefaultResponseTransformer;
import com.bamtech.core.networking.handlers.ResponseHandler;
import com.bamtech.sdk4.internal.configuration.Configuration;
import com.bamtech.sdk4.internal.configuration.ConfigurationKt;
import com.bamtech.sdk4.internal.configuration.SubscriptionServiceConfigurationKt;
import com.bamtech.sdk4.internal.service.ServiceTransaction;
import com.bamtech.sdk4.internal.telemetry.dust.Dust$Events;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.Call;
import okhttp3.OkHttpClient;
import p520io.reactivex.Completable;
import p520io.reactivex.CompletableSource;
import p520io.reactivex.Single;
import p520io.reactivex.disposables.Disposable;
import p520io.reactivex.functions.C11945a;
import p520io.reactivex.functions.Consumer;
import p520io.reactivex.functions.Function;
import p520io.reactivex.p525e0.C11934b;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u00012\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\n¢\u0006\u0002\b\u0007"}, mo31007d2 = {"<anonymous>", "Lio/reactivex/Completable;", "kotlin.jvm.PlatformType", "<name for destructuring parameter 0>", "Lkotlin/Pair;", "Lcom/bamtech/core/networking/Link;", "Lcom/bamtech/sdk4/internal/configuration/Configuration;", "apply"}, mo31008k = 3, mo31009mv = {1, 1, 15})
/* compiled from: SubscriptionClient.kt */
final class DefaultSubscriptionClient$linkSubscriptionsFromDevice$2<T, R> implements Function<Pair<? extends Link, ? extends Configuration>, CompletableSource> {
    final /* synthetic */ Map $map;
    final /* synthetic */ ServiceTransaction $transaction;
    final /* synthetic */ DefaultSubscriptionClient this$0;

    DefaultSubscriptionClient$linkSubscriptionsFromDevice$2(DefaultSubscriptionClient defaultSubscriptionClient, Map map, ServiceTransaction serviceTransaction) {
        this.this$0 = defaultSubscriptionClient;
        this.$map = map;
        this.$transaction = serviceTransaction;
    }

    public final Completable apply(Pair<Link, Configuration> pair) {
        Link link = (Link) pair.mo31013a();
        Configuration configuration = (Configuration) pair.mo31014b();
        Link updateTemplates$default = Link.updateTemplates$default(link, this.$map, null, 2, null);
        OkHttpClient client = this.$transaction.getClient();
        ServiceTransaction serviceTransaction = this.$transaction;
        Request a = C1691e.m7798a(updateTemplates$default, client, new DefaultResponseTransformer(new C2056x73f9922(new ResponseHandler[]{this.this$0.linkSubscriptionsResponseHandler(serviceTransaction)}, serviceTransaction), new C2057x73f9923(serviceTransaction)), null, ConfigurationKt.toDustConfigSettings(configuration), 4, null);
        ServiceTransaction serviceTransaction2 = this.$transaction;
        String subscriptions_link = SubscriptionServiceConfigurationKt.getSUBSCRIPTIONS_LINK(Dust$Events.INSTANCE);
        Call a2 = C1691e.m7799a(a);
        Single b = C1681c.m7780a(a, a2).mo30223c((C11945a) new C2058xa63eee13(a2)).mo30220b(C11934b.m38500b());
        Intrinsics.checkReturnedValueIsNotNull((Object) b, "call(this, call)\n       …scribeOn(Schedulers.io())");
        Single g = b.mo30222c((Consumer<? super Disposable>) new C2059xa63eee14<Object>(serviceTransaction2, subscriptions_link)).mo30218b((Consumer<? super Throwable>) new C2060xa63eee15<Object>(a, serviceTransaction2, subscriptions_link)).mo30233g(new C2061xa63eee16(serviceTransaction2, subscriptions_link));
        Intrinsics.checkReturnedValueIsNotNull((Object) g, "this.asSingle()\n        …        it.body\n        }");
        return g.mo30228e();
    }
}
