package com.google.android.exoplayer2.offline;

import java.io.IOException;

public interface Downloader {

    /* renamed from: com.google.android.exoplayer2.offline.Downloader$a */
    public interface C8805a {
        void onProgress(long j, long j2, float f);
    }

    /* renamed from: a */
    void mo23019a(C8805a aVar) throws InterruptedException, IOException;

    void cancel();
}
