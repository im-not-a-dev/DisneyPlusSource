package com.bamtech.sdk4.internal.session;

import com.bamtech.sdk4.internal.service.ServiceTransaction;
import kotlin.Metadata;
import p520io.reactivex.Single;
import p520io.reactivex.SingleSource;
import p520io.reactivex.SingleTransformer;
import p520io.reactivex.functions.Function;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0000\u001a\u0010\u0012\f\u0012\n \u0003*\u0004\u0018\u0001H\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u0014\u0010\u0004\u001a\u0010\u0012\f\u0012\n \u0003*\u0004\u0018\u0001H\u0002H\u00020\u0001H\n¢\u0006\u0002\b\u0005"}, mo31007d2 = {"<anonymous>", "Lio/reactivex/Single;", "T", "kotlin.jvm.PlatformType", "upstream", "apply"}, mo31008k = 3, mo31009mv = {1, 1, 15})
/* compiled from: DefaultRenewSessionTransformers.kt */
final class DefaultRenewSessionTransformers$singleRenewSession$1<Upstream, Downstream> implements SingleTransformer<T, T> {
    final /* synthetic */ ServiceTransaction $transaction;
    final /* synthetic */ DefaultRenewSessionTransformers this$0;

    DefaultRenewSessionTransformers$singleRenewSession$1(DefaultRenewSessionTransformers defaultRenewSessionTransformers, ServiceTransaction serviceTransaction) {
        this.this$0 = defaultRenewSessionTransformers;
        this.$transaction = serviceTransaction;
    }

    public final Single<T> apply(final Single<T> single) {
        return single.mo30235h(new Function<Throwable, SingleSource<? extends T>>(this) {
            final /* synthetic */ DefaultRenewSessionTransformers$singleRenewSession$1 this$0;

            {
                this.this$0 = r1;
            }

            public final Single<T> apply(Throwable th) {
                DefaultRenewSessionTransformers$singleRenewSession$1 defaultRenewSessionTransformers$singleRenewSession$1 = this.this$0;
                return defaultRenewSessionTransformers$singleRenewSession$1.this$0.handleRenew(defaultRenewSessionTransformers$singleRenewSession$1.$transaction, th).mo30044a((SingleSource<T>) single);
            }
        });
    }
}
