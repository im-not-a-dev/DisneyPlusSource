package com.bamtech.sdk4.internal.media;

import kotlin.C13145v;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12881k;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, mo31007d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "invoke", "(Ljava/lang/Long;)V"}, mo31008k = 3, mo31009mv = {1, 1, 15})
/* compiled from: DefaultStreamSampler.kt */
final class DefaultStreamSampler$scheduleNext$3 extends C12881k implements Function1<Long, C13145v> {
    final /* synthetic */ DefaultStreamSampler this$0;

    DefaultStreamSampler$scheduleNext$3(DefaultStreamSampler defaultStreamSampler) {
        this.this$0 = defaultStreamSampler;
        super(1);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((Long) obj);
        return C13145v.f29587a;
    }

    public final void invoke(Long l) {
        DefaultStreamSampler.recordStreamSample$default(this.this$0, false, 1, null);
    }
}
