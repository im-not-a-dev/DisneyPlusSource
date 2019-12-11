package com.bamtech.sdk4.internal.location;

import com.bamtech.core.logging.LogDispatcher.DefaultImpls;
import com.bamtech.sdk4.internal.configuration.LocationConfiguration;
import com.bamtech.sdk4.internal.service.ServiceTransaction;
import com.bamtech.sdk4.location.GeoLocation;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p520io.reactivex.Single;
import p520io.reactivex.SingleSource;
import p520io.reactivex.disposables.Disposable;
import p520io.reactivex.functions.Consumer;
import p520io.reactivex.functions.Function;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u0010\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, mo31007d2 = {"<anonymous>", "Lio/reactivex/Single;", "Lcom/bamtech/sdk4/location/GeoLocation;", "kotlin.jvm.PlatformType", "configuration", "Lcom/bamtech/sdk4/internal/configuration/LocationConfiguration;", "apply"}, mo31008k = 3, mo31009mv = {1, 1, 15})
/* compiled from: LocationResolver.kt */
final class DefaultLocationResolver$getLocation$1<T, R> implements Function<T, SingleSource<? extends R>> {
    final /* synthetic */ ServiceTransaction $transaction;
    final /* synthetic */ DefaultLocationResolver this$0;

    DefaultLocationResolver$getLocation$1(DefaultLocationResolver defaultLocationResolver, ServiceTransaction serviceTransaction) {
        this.this$0 = defaultLocationResolver;
        this.$transaction = serviceTransaction;
    }

    public final Single<GeoLocation> apply(LocationConfiguration locationConfiguration) {
        long timeout = locationConfiguration.getTimeout();
        Single h = this.this$0.geoProvider.getLocation(timeout).mo30227d((Consumer<? super T>) new DefaultLocationResolver$getLocation$1$providerLocation$1<Object>(this)).mo30235h(new DefaultLocationResolver$getLocation$1$providerLocation$2(this));
        Intrinsics.checkReturnedValueIsNotNull((Object) h, "geoProvider.getLocation(…                        }");
        Single g = Single.m38387a(timeout, TimeUnit.SECONDS).mo30233g(new DefaultLocationResolver$getLocation$1$timeoutLocation$1(this));
        Intrinsics.checkReturnedValueIsNotNull((Object) g, "Single.timer(timeout, Ti…                        }");
        return Single.m38393a((Iterable<? extends SingleSource<? extends T>>) C13185o.m40512a((Object[]) new Single[]{h, g})).mo30222c((Consumer<? super Disposable>) new Consumer<Disposable>(this) {
            final /* synthetic */ DefaultLocationResolver$getLocation$1 this$0;

            {
                this.this$0 = r1;
            }

            public final void accept(Disposable disposable) {
                DefaultLocationResolver$getLocation$1 defaultLocationResolver$getLocation$1 = this.this$0;
                DefaultImpls.d$default(defaultLocationResolver$getLocation$1.$transaction, defaultLocationResolver$getLocation$1.this$0, "LocationRequested", false, 4, null);
            }
        }).mo30218b((Consumer<? super Throwable>) new Consumer<Throwable>(this) {
            final /* synthetic */ DefaultLocationResolver$getLocation$1 this$0;

            {
                this.this$0 = r1;
            }

            public final void accept(Throwable th) {
                DefaultLocationResolver$getLocation$1 defaultLocationResolver$getLocation$1 = this.this$0;
                DefaultImpls.log$default(defaultLocationResolver$getLocation$1.$transaction, defaultLocationResolver$getLocation$1.this$0, "LocationRequestFailed", th.getMessage(), null, false, 24, null);
            }
        });
    }
}
