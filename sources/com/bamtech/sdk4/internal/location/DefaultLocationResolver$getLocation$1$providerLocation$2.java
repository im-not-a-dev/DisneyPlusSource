package com.bamtech.sdk4.internal.location;

import kotlin.Metadata;
import p520io.reactivex.Single;
import p520io.reactivex.SingleSource;
import p520io.reactivex.functions.Function;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0000\u0010\u0000\u001a\u0010\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, mo31007d2 = {"<anonymous>", "Lio/reactivex/Single;", "", "kotlin.jvm.PlatformType", "error", "", "apply"}, mo31008k = 3, mo31009mv = {1, 1, 15})
/* compiled from: LocationResolver.kt */
final class DefaultLocationResolver$getLocation$1$providerLocation$2<T, R> implements Function<Throwable, SingleSource> {
    final /* synthetic */ DefaultLocationResolver$getLocation$1 this$0;

    DefaultLocationResolver$getLocation$1$providerLocation$2(DefaultLocationResolver$getLocation$1 defaultLocationResolver$getLocation$1) {
        this.this$0 = defaultLocationResolver$getLocation$1;
    }

    public final Single apply(Throwable th) {
        return Single.m38395a((Throwable) DefaultLocationResolver.Companion.generateBadRequestException(this.this$0.$transaction.getId(), th));
    }
}
