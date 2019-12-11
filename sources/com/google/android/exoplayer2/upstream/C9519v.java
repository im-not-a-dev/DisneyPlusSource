package com.google.android.exoplayer2.upstream;

import android.net.Uri;
import com.google.android.exoplayer2.upstream.DataSource.DataSource;
import java.io.IOException;
import java.util.List;
import java.util.Map;

/* renamed from: com.google.android.exoplayer2.upstream.v */
/* compiled from: DummyDataSource */
public final class C9519v implements DataSource {

    /* renamed from: a */
    public static final DataSource f22219a = C9454c.f21974a;

    static {
        new C9519v();
    }

    private C9519v() {
    }

    /* renamed from: b */
    public static /* synthetic */ C9519v m29266b() {
        return new C9519v();
    }

    /* renamed from: a */
    public /* synthetic */ Map<String, List<String>> mo9243a() {
        return C9506l.m29212a(this);
    }

    public void addTransferListener(TransferListener transferListener) {
    }

    public void close() throws IOException {
    }

    public Uri getUri() {
        return null;
    }

    public long open(DataSpec dataSpec) throws IOException {
        throw new IOException("Dummy source");
    }

    public int read(byte[] bArr, int i, int i2) throws IOException {
        throw new UnsupportedOperationException();
    }
}
