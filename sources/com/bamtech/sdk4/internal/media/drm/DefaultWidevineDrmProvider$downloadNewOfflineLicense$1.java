package com.bamtech.sdk4.internal.media.drm;

import com.bamtech.core.networking.C1681c;
import com.bamtech.core.networking.C1691e;
import com.bamtech.core.networking.Link;
import com.bamtech.core.networking.Request;
import com.bamtech.core.networking.handlers.DefaultResponseTransformer;
import com.bamtech.core.networking.handlers.ResponseHandler;
import com.bamtech.core.networking.handlers.ResponseTransformer;
import com.bamtech.sdk4.internal.configuration.TelemetryServiceConfiguration;
import com.bamtech.sdk4.internal.configuration.TelemetryServiceConfigurationKt;
import com.bamtech.sdk4.internal.service.ServiceTransaction;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.C14258u;
import okhttp3.C14262x;
import okhttp3.Call;
import okhttp3.OkHttpClient;
import p520io.reactivex.Single;
import p520io.reactivex.SingleSource;
import p520io.reactivex.disposables.Disposable;
import p520io.reactivex.functions.C11945a;
import p520io.reactivex.functions.Consumer;
import p520io.reactivex.functions.Function;
import p520io.reactivex.p525e0.C11934b;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\u001a\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\n¢\u0006\u0002\b\u0007"}, mo31007d2 = {"<anonymous>", "Lio/reactivex/Single;", "", "<name for destructuring parameter 0>", "Lkotlin/Pair;", "Lcom/bamtech/core/networking/Link;", "Lcom/bamtech/sdk4/internal/configuration/TelemetryServiceConfiguration;", "apply"}, mo31008k = 3, mo31009mv = {1, 1, 15})
/* compiled from: DefaultWidevineDrmProvider.kt */
final class DefaultWidevineDrmProvider$downloadNewOfflineLicense$1<T, R> implements Function<T, SingleSource<? extends R>> {
    final /* synthetic */ String $dust;
    final /* synthetic */ byte[] $requestData;
    final /* synthetic */ ServiceTransaction $transaction;
    final /* synthetic */ DefaultWidevineDrmProvider this$0;

    DefaultWidevineDrmProvider$downloadNewOfflineLicense$1(DefaultWidevineDrmProvider defaultWidevineDrmProvider, ServiceTransaction serviceTransaction, byte[] bArr, String str) {
        this.this$0 = defaultWidevineDrmProvider;
        this.$transaction = serviceTransaction;
        this.$requestData = bArr;
        this.$dust = str;
    }

    public final Single<byte[]> apply(Pair<Link, TelemetryServiceConfiguration> pair) {
        Link link = (Link) pair.mo31013a();
        TelemetryServiceConfiguration telemetryServiceConfiguration = (TelemetryServiceConfiguration) pair.mo31014b();
        OkHttpClient client = this.$transaction.getClient();
        ServiceTransaction serviceTransaction = this.$transaction;
        DefaultResponseTransformer defaultResponseTransformer = new DefaultResponseTransformer(new C1954xe72e00c4(new ResponseHandler[]{new C1952x2919a1b5(this.this$0.converters.getByte())}, serviceTransaction), new C1955xe72e00c5(serviceTransaction));
        C14262x a = C14262x.m45502a(C14258u.m45482b("application/octet-stream"), this.$requestData);
        Intrinsics.checkReturnedValueIsNotNull((Object) a, "RequestBody.create(\n    …                        )");
        Request a2 = C1691e.m7797a(link, client, (ResponseTransformer<? extends OUT>) defaultResponseTransformer, a, TelemetryServiceConfigurationKt.toDustConfigSettings(telemetryServiceConfiguration));
        ServiceTransaction serviceTransaction2 = this.$transaction;
        String str = this.$dust;
        Call a3 = C1691e.m7799a(a2);
        Single b = C1681c.m7780a(a2, a3).mo30223c((C11945a) new C1956xed04f7b1(a3)).mo30220b(C11934b.m38500b());
        Intrinsics.checkReturnedValueIsNotNull((Object) b, "call(this, call)\n       …scribeOn(Schedulers.io())");
        Single<byte[]> g = b.mo30222c((Consumer<? super Disposable>) new C1957xed04f7b2<Object>(serviceTransaction2, str)).mo30218b((Consumer<? super Throwable>) new C1958xed04f7b3<Object>(a2, serviceTransaction2, str)).mo30233g(new C1959xed04f7b4(serviceTransaction2, str));
        Intrinsics.checkReturnedValueIsNotNull((Object) g, "this.asSingle()\n        …        it.body\n        }");
        return g;
    }
}
