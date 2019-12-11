package com.bamtech.sdk4.internal.media;

import com.bamtech.shadow.dagger.p048a.C2111c;
import com.bamtech.shadow.dagger.p048a.C2113e;

public final class PlaybackSessionModule_StreamSamplerFactory implements C2111c<StreamSampler> {
    public static StreamSampler proxyStreamSampler(PlaybackSessionModule playbackSessionModule, DefaultStreamSampler defaultStreamSampler) {
        StreamSampler streamSampler = playbackSessionModule.streamSampler(defaultStreamSampler);
        C2113e.m8178a(streamSampler, "Cannot return null from a non-@Nullable @Provides method");
        return streamSampler;
    }
}
