package com.bamtech.sdk4.internal.media;

import com.bamtech.sdk4.internal.configuration.MediaExtras;
import com.bamtech.sdk4.internal.configuration.Services;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12881k;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003"}, mo31007d2 = {"<anonymous>", "Lcom/bamtech/sdk4/internal/configuration/MediaExtras;", "Lcom/bamtech/sdk4/internal/configuration/Services;", "invoke"}, mo31008k = 3, mo31009mv = {1, 1, 15})
/* compiled from: DefaultStreamSampler.kt */
final class DefaultStreamSampler$recordStreamSample$1$1 extends C12881k implements Function1<Services, MediaExtras> {
    public static final DefaultStreamSampler$recordStreamSample$1$1 INSTANCE = new DefaultStreamSampler$recordStreamSample$1$1();

    DefaultStreamSampler$recordStreamSample$1$1() {
        super(1);
    }

    public final MediaExtras invoke(Services services) {
        return services.getMedia().getExtras();
    }
}
