package com.google.android.exoplayer2.upstream;

import java.io.IOException;

/* renamed from: com.google.android.exoplayer2.upstream.k */
/* compiled from: DataSink */
public interface C9504k {

    /* renamed from: com.google.android.exoplayer2.upstream.k$a */
    /* compiled from: DataSink */
    public interface C9505a {
        /* renamed from: a */
        C9504k mo24492a();
    }

    void close() throws IOException;

    void open(DataSpec dataSpec) throws IOException;

    void write(byte[] bArr, int i, int i2) throws IOException;
}
