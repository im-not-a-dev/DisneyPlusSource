package com.bamtech.sdk4.internal.media;

import com.bamtech.core.logging.LogDispatcher.DefaultImpls;
import com.bamtech.sdk4.internal.configuration.MediaServiceConfiguration;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import p520io.reactivex.Observable;
import p520io.reactivex.ObservableSource;
import p520io.reactivex.functions.Function;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a&\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002 \u0003*\u0012\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002\u0018\u00010\u00010\u00012\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, mo31007d2 = {"<anonymous>", "Lio/reactivex/Observable;", "", "kotlin.jvm.PlatformType", "it", "Lcom/bamtech/sdk4/internal/configuration/MediaServiceConfiguration;", "apply"}, mo31008k = 3, mo31009mv = {1, 1, 15})
/* compiled from: DefaultStreamSampler.kt */
final class DefaultStreamSampler$scheduleNext$2<T, R> implements Function<T, ObservableSource<? extends R>> {
    final /* synthetic */ long $delay;
    final /* synthetic */ DefaultStreamSampler this$0;

    DefaultStreamSampler$scheduleNext$2(DefaultStreamSampler defaultStreamSampler, long j) {
        this.this$0 = defaultStreamSampler;
        this.$delay = j;
    }

    public final Observable<Long> apply(MediaServiceConfiguration mediaServiceConfiguration) {
        DefaultImpls.d$default(DefaultStreamSampler.serviceTransaction$default(this.this$0, false, 1, null), this.this$0, "StreamSampleDispatchScheduled", false, 4, null);
        return Observable.m38310c(this.$delay, TimeUnit.SECONDS);
    }
}
