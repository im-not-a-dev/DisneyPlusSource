package com.google.android.exoplayer2.upstream;

import android.net.Uri;
import java.io.IOException;
import java.util.List;
import java.util.Map;

public interface DataSource {

    /* renamed from: com.google.android.exoplayer2.upstream.DataSource$a */
    public interface C9435a {
        /* renamed from: a */
        DataSource mo24448a();
    }

    /* renamed from: a */
    Map<String, List<String>> mo9243a();

    void addTransferListener(TransferListener transferListener);

    void close() throws IOException;

    Uri getUri();

    long open(DataSpec dataSpec) throws IOException;

    int read(byte[] bArr, int i, int i2) throws IOException;
}
