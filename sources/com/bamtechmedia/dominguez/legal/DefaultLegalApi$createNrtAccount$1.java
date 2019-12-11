package com.bamtechmedia.dominguez.legal;

import com.bamtechmedia.dominguez.core.utils.p223t0.C5879c;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C12880j;
import okhttp3.Request;
import okhttp3.Request.C14113a;
import p163g.p500m.p501a.C11725h;
import p520io.reactivex.Completable;
import p520io.reactivex.CompletableSource;
import p520io.reactivex.functions.Function;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, mo31007d2 = {"<anonymous>", "Lio/reactivex/Completable;", "countryCode", "", "apply"}, mo31008k = 3, mo31009mv = {1, 1, 15})
/* compiled from: DefaultLegalApi.kt */
final class DefaultLegalApi$createNrtAccount$1<T, R> implements Function<String, CompletableSource> {
    final /* synthetic */ C11725h $adapter;
    final /* synthetic */ String $emailAddress;
    final /* synthetic */ List $legalAcceptance;
    final /* synthetic */ List $marketingInput;
    final /* synthetic */ DefaultLegalApi this$0;

    DefaultLegalApi$createNrtAccount$1(DefaultLegalApi defaultLegalApi, String str, List list, List list2, C11725h hVar) {
        this.this$0 = defaultLegalApi;
        this.$emailAddress = str;
        this.$marketingInput = list;
        this.$legalAcceptance = list2;
        this.$adapter = hVar;
    }

    public final Completable apply(String str) {
        CreateNrtAccountInput createNrtAccountInput = new CreateNrtAccountInput(new NrtProfile(this.$emailAddress, str), this.$marketingInput, this.$legalAcceptance);
        C14113a aVar = new C14113a();
        aVar.mo35843a(this.this$0.buildNrtUrl(str));
        aVar.mo35840a("Cache-Control", "no-cache");
        String str2 = DefaultLegalApi.MIME_TYPE_JSON;
        aVar.mo35840a(DefaultLegalApi.ACCEPT_HEADER, str2);
        C12880j.m40222a((Object) aVar, "Request.Builder()\n      …T_HEADER, MIME_TYPE_JSON)");
        String json = this.$adapter.toJson(createNrtAccountInput);
        C12880j.m40222a((Object) json, "adapter.toJson(createNrtInput)");
        C5879c.m18934a(aVar, json, str2);
        Request a = aVar.mo35846a();
        C12880j.m40222a((Object) a, "Request.Builder()\n      …                 .build()");
        return C5879c.m18933a(a, this.this$0.okHttpClient).mo30217b((Function<? super T, ? extends CompletableSource>) C61121.INSTANCE);
    }
}
