package com.bamtech.sdk4.internal.media.drm;

import com.bamtech.core.networking.Link;
import com.bamtech.sdk4.internal.configuration.Services;
import com.bamtech.sdk4.internal.service.ServiceTransaction;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import p520io.reactivex.Single;
import p520io.reactivex.SingleSource;
import p520io.reactivex.functions.Function;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\u001e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0017\u0010\u0003\u001a\u0013\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004¢\u0006\u0002\b\u0007H\n¢\u0006\u0002\b\b"}, mo31007d2 = {"<anonymous>", "Lio/reactivex/Single;", "", "it", "Lkotlin/Function1;", "Lcom/bamtech/sdk4/internal/configuration/Services;", "Lcom/bamtech/core/networking/Link;", "Lkotlin/ExtensionFunctionType;", "apply"}, mo31008k = 3, mo31009mv = {1, 1, 15})
/* compiled from: DefaultWidevineDrmProvider.kt */
final class DefaultWidevineDrmProvider$releaseWidevineOfflineLicense$2<T, R> implements Function<T, SingleSource<? extends R>> {
    final /* synthetic */ byte[] $requestData;
    final /* synthetic */ ServiceTransaction $transaction;
    final /* synthetic */ DefaultWidevineDrmProvider this$0;

    DefaultWidevineDrmProvider$releaseWidevineOfflineLicense$2(DefaultWidevineDrmProvider defaultWidevineDrmProvider, ServiceTransaction serviceTransaction, byte[] bArr) {
        this.this$0 = defaultWidevineDrmProvider;
        this.$transaction = serviceTransaction;
        this.$requestData = bArr;
    }

    public final Single<byte[]> apply(Function1<? super Services, Link> function1) {
        return this.this$0.releaseWidevineOfflineLicenseInternal(this.$transaction, this.$requestData, function1);
    }
}
