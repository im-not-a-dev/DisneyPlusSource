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
import com.bamtech.sdk4.subscription.Subscription;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.Call;
import okhttp3.OkHttpClient;
import p520io.reactivex.Single;
import p520io.reactivex.SingleSource;
import p520io.reactivex.disposables.Disposable;
import p520io.reactivex.functions.C11945a;
import p520io.reactivex.functions.Consumer;
import p520io.reactivex.functions.Function;
import p520io.reactivex.p525e0.C11934b;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000 \n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0003 \u0004*\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00020\u00020\u00012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006H\n¢\u0006\u0002\b\t"}, mo31007d2 = {"<anonymous>", "Lio/reactivex/Single;", "", "Lcom/bamtech/sdk4/subscription/Subscription;", "kotlin.jvm.PlatformType", "<name for destructuring parameter 0>", "Lkotlin/Pair;", "Lcom/bamtech/core/networking/Link;", "Lcom/bamtech/sdk4/internal/configuration/Configuration;", "apply"}, mo31008k = 3, mo31009mv = {1, 1, 15})
/* compiled from: SubscriptionClient.kt */
final class DefaultSubscriptionClient$getSubscriptions$2<T, R> implements Function<T, SingleSource<? extends R>> {
    final /* synthetic */ Map $map;
    final /* synthetic */ ServiceTransaction $transaction;
    final /* synthetic */ DefaultSubscriptionClient this$0;

    DefaultSubscriptionClient$getSubscriptions$2(DefaultSubscriptionClient defaultSubscriptionClient, Map map, ServiceTransaction serviceTransaction) {
        this.this$0 = defaultSubscriptionClient;
        this.$map = map;
        this.$transaction = serviceTransaction;
    }

    public final Single<List<Subscription>> apply(Pair<Link, Configuration> pair) {
        Link link = (Link) pair.mo31013a();
        Configuration configuration = (Configuration) pair.mo31014b();
        Link updateTemplates$default = Link.updateTemplates$default(link, this.$map, null, 2, null);
        OkHttpClient client = this.$transaction.getClient();
        ServiceTransaction serviceTransaction = this.$transaction;
        Request a = C1691e.m7798a(updateTemplates$default, client, new DefaultResponseTransformer(new C2050xbb877ddc(new ResponseHandler[]{new C2048x2d2d6acd(this.this$0.getConverter())}, serviceTransaction), new C2051xbb877ddd(serviceTransaction)), null, ConfigurationKt.toDustConfigSettings(configuration), 4, null);
        ServiceTransaction serviceTransaction2 = this.$transaction;
        String subscriptions_get = SubscriptionServiceConfigurationKt.getSUBSCRIPTIONS_GET(Dust$Events.INSTANCE);
        Call a2 = C1691e.m7799a(a);
        Single b = C1681c.m7780a(a, a2).mo30223c((C11945a) new C2052xb6b6b999(a2)).mo30220b(C11934b.m38500b());
        Intrinsics.checkReturnedValueIsNotNull((Object) b, "call(this, call)\n       …scribeOn(Schedulers.io())");
        Single g = b.mo30222c((Consumer<? super Disposable>) new C2053xb6b6b99a<Object>(serviceTransaction2, subscriptions_get)).mo30218b((Consumer<? super Throwable>) new C2054xb6b6b99b<Object>(a, serviceTransaction2, subscriptions_get)).mo30233g(new C2055xb6b6b99c(serviceTransaction2, subscriptions_get));
        Intrinsics.checkReturnedValueIsNotNull((Object) g, "this.asSingle()\n        …        it.body\n        }");
        return g.mo30233g(C20621.INSTANCE);
    }
}
