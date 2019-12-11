package com.bamtech.sdk4.internal.media;

import com.bamtech.sdk4.internal.configuration.MediaExtras;
import kotlin.C13145v;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12881k;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004¨\u0006\u0005"}, mo31007d2 = {"<anonymous>", "", "extras", "Lcom/bamtech/sdk4/internal/configuration/MediaExtras;", "invoke", "com/bamtech/sdk4/internal/media/DefaultStreamSampler$recordStreamSample$1$2"}, mo31008k = 3, mo31009mv = {1, 1, 15})
/* compiled from: DefaultStreamSampler.kt */
final class DefaultStreamSampler$recordStreamSample$$inlined$let$lambda$1 extends C12881k implements Function1<MediaExtras, C13145v> {
    final /* synthetic */ DefaultStreamSampler this$0;

    DefaultStreamSampler$recordStreamSample$$inlined$let$lambda$1(DefaultStreamSampler defaultStreamSampler, boolean z) {
        this.this$0 = defaultStreamSampler;
        super(1);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((MediaExtras) obj);
        return C13145v.f29587a;
    }

    public final void invoke(MediaExtras mediaExtras) {
        this.this$0.scheduleNext(mediaExtras.getPlaybackSession().getStreamSampleInterval());
    }
}
