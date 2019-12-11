package com.bamtech.sdk4.internal.configuration;

import com.bamtech.core.annotations.android.DontObfuscate;
import kotlin.Metadata;

@DontObfuscate
@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0007\b\u0010¢\u0006\u0002\u0010\u0002B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, mo31007d2 = {"Lcom/bamtech/sdk4/internal/configuration/PlaybackSessionConfiguration;", "", "()V", "streamSampleInterval", "", "(J)V", "getStreamSampleInterval", "()J", "sdk-configuration"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* compiled from: MediaServiceConfiguration.kt */
public final class PlaybackSessionConfiguration {
    private final long streamSampleInterval;

    public PlaybackSessionConfiguration(long j) {
        this.streamSampleInterval = j;
    }

    public final long getStreamSampleInterval() {
        return this.streamSampleInterval;
    }

    public PlaybackSessionConfiguration() {
        this(30);
    }
}
