package com.google.android.exoplayer2.upstream;

import android.os.Handler;

public interface BandwidthMeter {

    /* renamed from: com.google.android.exoplayer2.upstream.BandwidthMeter$a */
    public interface C9434a {
        /* renamed from: b */
        void mo22698b(int i, long j, long j2);
    }

    /* renamed from: a */
    TransferListener mo24444a();

    /* renamed from: a */
    void mo24445a(Handler handler, C9434a aVar);

    /* renamed from: a */
    void mo24446a(C9434a aVar);

    /* renamed from: b */
    long mo24447b();
}
