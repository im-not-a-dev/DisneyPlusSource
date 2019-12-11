package com.bamtechmedia.dominguez.legal;

import com.bamtechmedia.dominguez.core.utils.p223t0.C5879c;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Request.C14113a;
import p163g.p500m.p501a.C11725h;
import p520io.reactivex.Single;
import p520io.reactivex.SingleSource;
import p520io.reactivex.functions.Function;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u0010\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, mo31007d2 = {"<anonymous>", "Lio/reactivex/Single;", "Lcom/bamtechmedia/dominguez/legal/SiteConfigResponse;", "kotlin.jvm.PlatformType", "countryCode", "", "apply"}, mo31008k = 3, mo31009mv = {1, 1, 15})
/* compiled from: DefaultLegalApi.kt */
final class DefaultLegalApi$siteConfigOnce$1<T, R> implements Function<T, SingleSource<? extends R>> {
    final /* synthetic */ DefaultLegalApi this$0;

    DefaultLegalApi$siteConfigOnce$1(DefaultLegalApi defaultLegalApi) {
        this.this$0 = defaultLegalApi;
    }

    public final Single<SiteConfigResponse> apply(String str) {
        C14113a aVar = new C14113a();
        aVar.mo35843a(this.this$0.buildSiteConfigUrl(str));
        aVar.mo35840a(DefaultLegalApi.ACCEPT_HEADER, DefaultLegalApi.MIME_TYPE_JSON);
        aVar.mo35847b();
        Request a = aVar.mo35846a();
        Intrinsics.checkReturnedValueIsNotNull((Object) a, "Request.Builder()\n      …                 .build()");
        OkHttpClient access$getOkHttpClient$p = this.this$0.okHttpClient;
        C11725h access$getSiteConfigAdapter$p = this.this$0.siteConfigAdapter;
        Intrinsics.checkReturnedValueIsNotNull((Object) access$getSiteConfigAdapter$p, "siteConfigAdapter");
        Single<SiteConfigResponse> g = C5879c.m18933a(a, access$getOkHttpClient$p).mo30233g(new C6111xadd93bca(access$getSiteConfigAdapter$p));
        Intrinsics.checkReturnedValueIsNotNull((Object) g, "createSingle(client).map…)?.toObject<T>(adapter) }");
        return g;
    }
}
