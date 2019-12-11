package com.bamtech.sdk4.media.drm;

import com.bamtech.sdk4.internal.media.SilkDrmClient;
import com.bamtech.sdk4.internal.service.ServiceTransaction;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.C12880j;
import p520io.reactivex.Single;
import p520io.reactivex.SingleSource;
import p520io.reactivex.functions.Function;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\u001a\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0016\u0010\u0003\u001a\u0012\u0012\u0004\u0012\u00020\u0005\u0012\b\u0012\u00060\u0005j\u0002`\u00060\u0004H\n¢\u0006\u0002\b\u0007"}, mo31007d2 = {"<anonymous>", "Lio/reactivex/Single;", "", "tokenMap", "", "", "Lcom/bamtech/sdk4/core/types/JWT;", "apply"}, mo31008k = 3, mo31009mv = {1, 1, 15})
/* compiled from: DefaultSilkDrmProvider.kt */
final class DefaultSilkDrmProvider$getKey$2<T, R> implements Function<T, SingleSource<? extends R>> {
    final /* synthetic */ ServiceTransaction $transaction;
    final /* synthetic */ String $uri;
    final /* synthetic */ DefaultSilkDrmProvider this$0;

    DefaultSilkDrmProvider$getKey$2(DefaultSilkDrmProvider defaultSilkDrmProvider, ServiceTransaction serviceTransaction, String str) {
        this.this$0 = defaultSilkDrmProvider;
        this.$transaction = serviceTransaction;
        this.$uri = str;
    }

    public final Single<byte[]> apply(Map<String, String> map) {
        SilkDrmClient access$getClient$p = this.this$0.client;
        ServiceTransaction serviceTransaction = this.$transaction;
        C12880j.m40222a((Object) serviceTransaction, "transaction");
        return access$getClient$p.getMediaKey(serviceTransaction, map, this.$uri);
    }
}
