package com.google.android.exoplayer2.upstream;

import com.google.android.exoplayer2.C8723g0;
import com.google.android.exoplayer2.upstream.C9442a0.C9450h;
import com.google.android.exoplayer2.upstream.HttpDataSource.C9439d;
import java.io.FileNotFoundException;
import java.io.IOException;

/* renamed from: com.google.android.exoplayer2.upstream.u */
/* compiled from: DefaultLoadErrorHandlingPolicy */
public class C9518u implements C9524z {
    private final int minimumLoadableRetryCount;

    public C9518u() {
        this(-1);
    }

    public long getBlacklistDurationMsFor(int i, long j, IOException iOException, int i2) {
        if (!(iOException instanceof C9439d)) {
            return -9223372036854775807L;
        }
        int i3 = ((C9439d) iOException).f21948U;
        if (i3 == 404 || i3 == 410) {
            return 60000;
        }
        return -9223372036854775807L;
    }

    public int getMinimumLoadableRetryCount(int i) {
        int i2 = this.minimumLoadableRetryCount;
        if (i2 != -1) {
            return i2;
        }
        return i == 7 ? 6 : 3;
    }

    public long getRetryDelayMsFor(int i, long j, IOException iOException, int i2) {
        if ((iOException instanceof C8723g0) || (iOException instanceof FileNotFoundException) || (iOException instanceof C9450h)) {
            return -9223372036854775807L;
        }
        return (long) Math.min((i2 - 1) * 1000, 5000);
    }

    public C9518u(int i) {
        this.minimumLoadableRetryCount = i;
    }
}
