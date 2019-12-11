package com.google.android.exoplayer2.upstream;

import java.io.IOException;

/* renamed from: com.google.android.exoplayer2.upstream.z */
/* compiled from: LoadErrorHandlingPolicy */
public interface C9524z {
    long getBlacklistDurationMsFor(int i, long j, IOException iOException, int i2);

    int getMinimumLoadableRetryCount(int i);

    long getRetryDelayMsFor(int i, long j, IOException iOException, int i2);
}
