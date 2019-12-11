package com.bamtech.sdk4.internal.media.adengine;

import com.bamtech.sdk4.internal.configuration.AdEngineServiceConfiguration;
import com.bamtech.sdk4.internal.service.ServiceTransaction;
import kotlin.C12907r;
import kotlin.Metadata;
import p520io.reactivex.Completable;
import p520io.reactivex.CompletableSource;
import p520io.reactivex.functions.Function;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, mo31007d2 = {"<anonymous>", "Lio/reactivex/Completable;", "configuration", "Lcom/bamtech/sdk4/internal/configuration/AdEngineServiceConfiguration;", "apply"}, mo31008k = 3, mo31009mv = {1, 1, 15})
/* compiled from: AdEngineManager.kt */
final class DefaultAdEngineManager$updateCookies$2<T, R> implements Function<AdEngineServiceConfiguration, CompletableSource> {
    final /* synthetic */ AdEngineTrackingData $adEngineTrackingData;
    final /* synthetic */ ServiceTransaction $transaction;
    final /* synthetic */ DefaultAdEngineManager this$0;

    DefaultAdEngineManager$updateCookies$2(DefaultAdEngineManager defaultAdEngineManager, ServiceTransaction serviceTransaction, AdEngineTrackingData adEngineTrackingData) {
        this.this$0 = defaultAdEngineManager;
        this.$transaction = serviceTransaction;
        this.$adEngineTrackingData = adEngineTrackingData;
    }

    public final Completable apply(AdEngineServiceConfiguration adEngineServiceConfiguration) {
        if (adEngineServiceConfiguration.getDisabled()) {
            return Completable.m38169h();
        }
        return this.this$0.constructAdEnginePayload(this.$transaction, this.$adEngineTrackingData).mo30217b((Function<? super T, ? extends CompletableSource>) new Function<AdEnginePayload, CompletableSource>(this) {
            final /* synthetic */ DefaultAdEngineManager$updateCookies$2 this$0;

            {
                this.this$0 = r1;
            }

            public final Completable apply(final AdEnginePayload adEnginePayload) {
                return this.this$0.this$0.tokenProvider.getAccessToken(this.this$0.$transaction).mo30217b((Function<? super T, ? extends CompletableSource>) new Function<String, CompletableSource>(this) {
                    final /* synthetic */ C19341 this$0;

                    {
                        this.this$0 = r1;
                    }

                    public final Completable apply(String str) {
                        return this.this$0.this$0.this$0.adEngineClient.updateCookies(this.this$0.this$0.$transaction, C13170i0.m40332a(C12907r.m40244a("{accessToken}", str)), adEnginePayload.asMap());
                    }
                });
            }
        });
    }
}
