package com.bamtech.sdk4.internal.media.drm;

import com.bamtech.core.networking.C1681c;
import com.bamtech.core.networking.C1691e;
import com.bamtech.core.networking.Link;
import com.bamtech.core.networking.QueryParams.Builder;
import com.bamtech.core.networking.Request;
import com.bamtech.core.networking.handlers.DefaultResponseTransformer;
import com.bamtech.core.networking.handlers.ResponseHandler;
import com.bamtech.sdk4.internal.QOSTransformerKt$qosTransformer$1;
import com.bamtech.sdk4.internal.QOSTransformerKt$qosTransformer$2;
import com.bamtech.sdk4.internal.configuration.DrmServiceConfigurationKt;
import com.bamtech.sdk4.internal.configuration.TelemetryServiceConfiguration;
import com.bamtech.sdk4.internal.configuration.TelemetryServiceConfigurationKt;
import com.bamtech.sdk4.internal.service.ServiceTransaction;
import com.bamtech.sdk4.internal.telemetry.dust.Dust$Events;
import kotlin.C13145v;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.p588j0.C12801c;
import okhttp3.Call;
import okhttp3.OkHttpClient;
import p520io.reactivex.Single;
import p520io.reactivex.SingleSource;
import p520io.reactivex.disposables.Disposable;
import p520io.reactivex.functions.C11945a;
import p520io.reactivex.functions.Consumer;
import p520io.reactivex.functions.Function;
import p520io.reactivex.p525e0.C11934b;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\u001c\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u0010\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u00020\u00012\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005H\n¢\u0006\u0002\b\b"}, mo31007d2 = {"<anonymous>", "Lio/reactivex/Single;", "", "kotlin.jvm.PlatformType", "<name for destructuring parameter 0>", "Lkotlin/Pair;", "Lcom/bamtech/core/networking/Link;", "Lcom/bamtech/sdk4/internal/configuration/TelemetryServiceConfiguration;", "apply"}, mo31008k = 3, mo31009mv = {1, 1, 15})
/* compiled from: DefaultWidevineDrmProvider.kt */
final class DefaultWidevineDrmProvider$getWidevineCertificate$1<T, R> implements Function<T, SingleSource<? extends R>> {
    final /* synthetic */ boolean $isOffline;
    final /* synthetic */ String $playbackSessionId;
    final /* synthetic */ byte[] $requestData;
    final /* synthetic */ ServiceTransaction $transaction;
    final /* synthetic */ DefaultWidevineDrmProvider this$0;

    DefaultWidevineDrmProvider$getWidevineCertificate$1(DefaultWidevineDrmProvider defaultWidevineDrmProvider, String str, ServiceTransaction serviceTransaction, boolean z, byte[] bArr) {
        this.this$0 = defaultWidevineDrmProvider;
        this.$playbackSessionId = str;
        this.$transaction = serviceTransaction;
        this.$isOffline = z;
        this.$requestData = bArr;
    }

    public final Single<byte[]> apply(Pair<Link, TelemetryServiceConfiguration> pair) {
        Link link = (Link) pair.mo31013a();
        TelemetryServiceConfiguration telemetryServiceConfiguration = (TelemetryServiceConfiguration) pair.mo31014b();
        C1982x5d11c626 defaultWidevineDrmProvider$getWidevineCertificate$1$qosCallback$1 = new C1982x5d11c626(this);
        Link a = link.toLinkBuilder().mo7435b((Function1<? super Builder, C13145v>) new Function1<Builder, C13145v>(this) {
            final /* synthetic */ DefaultWidevineDrmProvider$getWidevineCertificate$1 this$0;

            {
                this.this$0 = r1;
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((Builder) obj);
                return C13145v.f29587a;
            }

            public final void invoke(Builder builder) {
                builder.mo7477a("signedRequest", new String(this.this$0.$requestData, C12801c.f29474a));
            }
        }).mo7432a();
        OkHttpClient client = this.$transaction.getClient();
        ServiceTransaction serviceTransaction = this.$transaction;
        Request a2 = C1691e.m7798a(a, client, new DefaultResponseTransformer(new QOSTransformerKt$qosTransformer$1(new ResponseHandler[]{new C1960xe808d647(this.this$0.converters.getByte())}, serviceTransaction, defaultWidevineDrmProvider$getWidevineCertificate$1$qosCallback$1), new QOSTransformerKt$qosTransformer$2(serviceTransaction, defaultWidevineDrmProvider$getWidevineCertificate$1$qosCallback$1)), null, TelemetryServiceConfigurationKt.toDustConfigSettings(telemetryServiceConfiguration), 4, null);
        ServiceTransaction serviceTransaction2 = this.$transaction;
        String widevine_get_certificate = DrmServiceConfigurationKt.getWIDEVINE_GET_CERTIFICATE(Dust$Events.INSTANCE);
        Call a3 = C1691e.m7799a(a2);
        Single b = C1681c.m7780a(a2, a3).mo30223c((C11945a) new C1962xe193e35f(a3)).mo30220b(C11934b.m38500b());
        Intrinsics.checkReturnedValueIsNotNull((Object) b, "call(this, call)\n       …scribeOn(Schedulers.io())");
        Single g = b.mo30222c((Consumer<? super Disposable>) new C1963xe193e360<Object>(serviceTransaction2, widevine_get_certificate)).mo30218b((Consumer<? super Throwable>) new C1964xe193e361<Object>(a2, serviceTransaction2, widevine_get_certificate)).mo30233g(new C1965xe193e362(serviceTransaction2, widevine_get_certificate));
        Intrinsics.checkReturnedValueIsNotNull((Object) g, "this.asSingle()\n        …        it.body\n        }");
        return g.mo30237i(C19812.INSTANCE);
    }
}
