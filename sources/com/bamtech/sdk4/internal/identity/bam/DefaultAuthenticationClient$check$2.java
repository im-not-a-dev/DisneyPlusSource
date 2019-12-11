package com.bamtech.sdk4.internal.identity.bam;

import com.bamtech.core.networking.C1681c;
import com.bamtech.core.networking.C1691e;
import com.bamtech.core.networking.Link;
import com.bamtech.core.networking.Request;
import com.bamtech.core.networking.handlers.DefaultResponseTransformer;
import com.bamtech.core.networking.handlers.ResponseHandler;
import com.bamtech.core.networking.handlers.ResponseTransformer;
import com.bamtech.sdk4.internal.configuration.BamIdentityServiceConfigurationKt;
import com.bamtech.sdk4.internal.configuration.Configuration;
import com.bamtech.sdk4.internal.configuration.ConfigurationKt;
import com.bamtech.sdk4.internal.service.ServiceTransaction;
import com.bamtech.sdk4.internal.telemetry.dust.Dust$Events;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.C12880j;
import okhttp3.Call;
import okhttp3.OkHttpClient;
import p520io.reactivex.Single;
import p520io.reactivex.SingleSource;
import p520io.reactivex.disposables.Disposable;
import p520io.reactivex.functions.C11945a;
import p520io.reactivex.functions.Consumer;
import p520io.reactivex.functions.Function;
import p520io.reactivex.p525e0.C11934b;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\u001a\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\n¢\u0006\u0002\b\u0007"}, mo31007d2 = {"<anonymous>", "Lio/reactivex/Single;", "Lcom/bamtech/sdk4/internal/identity/bam/AuthenticationFlowResponse;", "<name for destructuring parameter 0>", "Lkotlin/Pair;", "Lcom/bamtech/core/networking/Link;", "Lcom/bamtech/sdk4/internal/configuration/Configuration;", "apply"}, mo31008k = 3, mo31009mv = {1, 1, 15})
/* compiled from: AuthenticationClient.kt */
final class DefaultAuthenticationClient$check$2<T, R> implements Function<T, SingleSource<? extends R>> {
    final /* synthetic */ CheckRequest $request;
    final /* synthetic */ Map $tokenMap;
    final /* synthetic */ ServiceTransaction $transaction;
    final /* synthetic */ DefaultAuthenticationClient this$0;

    DefaultAuthenticationClient$check$2(DefaultAuthenticationClient defaultAuthenticationClient, Map map, ServiceTransaction serviceTransaction, CheckRequest checkRequest) {
        this.this$0 = defaultAuthenticationClient;
        this.$tokenMap = map;
        this.$transaction = serviceTransaction;
        this.$request = checkRequest;
    }

    public final Single<AuthenticationFlowResponse> apply(Pair<Link, Configuration> pair) {
        Link link = (Link) pair.mo31013a();
        Configuration configuration = (Configuration) pair.mo31014b();
        Link updateTemplates$default = Link.updateTemplates$default(link, this.$tokenMap, null, 2, null);
        OkHttpClient client = this.$transaction.getClient();
        ServiceTransaction serviceTransaction = this.$transaction;
        Request a = C1691e.m7796a(updateTemplates$default, client, (ResponseTransformer<? extends OUT>) new DefaultResponseTransformer<Object>(new C1866x172b66e9(new ResponseHandler[]{new C1864x8e21e25a(this.this$0.flowConverter)}, serviceTransaction), new C1867x172b66ea(serviceTransaction)), this.this$0.converters.getIdentity().serialize(this.$request), ConfigurationKt.toDustConfigSettings(configuration));
        ServiceTransaction serviceTransaction2 = this.$transaction;
        String bam_get_identity_check = BamIdentityServiceConfigurationKt.getBAM_GET_IDENTITY_CHECK(Dust$Events.INSTANCE);
        Call a2 = C1691e.m7799a(a);
        Single b = C1681c.m7780a(a, a2).mo30223c((C11945a) new DefaultAuthenticationClient$check$2$$special$$inlined$toSingle$1(a2)).mo30220b(C11934b.m38500b());
        C12880j.m40222a((Object) b, "call(this, call)\n       …scribeOn(Schedulers.io())");
        Single<AuthenticationFlowResponse> g = b.mo30222c((Consumer<? super Disposable>) new DefaultAuthenticationClient$check$2$$special$$inlined$toSingle$2<Object>(serviceTransaction2, bam_get_identity_check)).mo30218b((Consumer<? super Throwable>) new DefaultAuthenticationClient$check$2$$special$$inlined$toSingle$3<Object>(a, serviceTransaction2, bam_get_identity_check)).mo30233g(new DefaultAuthenticationClient$check$2$$special$$inlined$toSingle$4(serviceTransaction2, bam_get_identity_check));
        C12880j.m40222a((Object) g, "this.asSingle()\n        …        it.body\n        }");
        return g;
    }
}
