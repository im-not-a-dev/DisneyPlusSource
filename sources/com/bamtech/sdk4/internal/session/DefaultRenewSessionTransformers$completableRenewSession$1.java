package com.bamtech.sdk4.internal.session;

import com.bamtech.sdk4.internal.service.ServiceTransaction;
import kotlin.Metadata;
import p520io.reactivex.Completable;
import p520io.reactivex.CompletableSource;
import p520io.reactivex.CompletableTransformer;
import p520io.reactivex.functions.Function;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0003"}, mo31007d2 = {"<anonymous>", "Lio/reactivex/Completable;", "upstream", "apply"}, mo31008k = 3, mo31009mv = {1, 1, 15})
/* compiled from: DefaultRenewSessionTransformers.kt */
final class DefaultRenewSessionTransformers$completableRenewSession$1 implements CompletableTransformer {
    final /* synthetic */ ServiceTransaction $transaction;
    final /* synthetic */ DefaultRenewSessionTransformers this$0;

    DefaultRenewSessionTransformers$completableRenewSession$1(DefaultRenewSessionTransformers defaultRenewSessionTransformers, ServiceTransaction serviceTransaction) {
        this.this$0 = defaultRenewSessionTransformers;
        this.$transaction = serviceTransaction;
    }

    public final Completable apply(final Completable completable) {
        return completable.mo30037a((Function<? super Throwable, ? extends CompletableSource>) new Function<Throwable, CompletableSource>(this) {
            final /* synthetic */ DefaultRenewSessionTransformers$completableRenewSession$1 this$0;

            {
                this.this$0 = r1;
            }

            public final Completable apply(Throwable th) {
                DefaultRenewSessionTransformers$completableRenewSession$1 defaultRenewSessionTransformers$completableRenewSession$1 = this.this$0;
                return defaultRenewSessionTransformers$completableRenewSession$1.this$0.handleRenew(defaultRenewSessionTransformers$completableRenewSession$1.$transaction, th).mo30034a((CompletableSource) completable);
            }
        });
    }
}
