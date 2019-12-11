package com.google.android.exoplayer2.upstream;

import android.net.Uri;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.C9575z;
import java.io.IOException;
import java.util.List;
import java.util.Map;

/* renamed from: com.google.android.exoplayer2.upstream.d0 */
/* compiled from: PriorityDataSource */
public final class C9488d0 implements DataSource {

    /* renamed from: a */
    private final DataSource f22088a;

    /* renamed from: b */
    private final C9575z f22089b;

    /* renamed from: c */
    private final int f22090c;

    public C9488d0(DataSource dataSource, C9575z zVar, int i) {
        Assertions.checkNotNull(dataSource);
        this.f22088a = dataSource;
        Assertions.checkNotNull(zVar);
        this.f22089b = zVar;
        this.f22090c = i;
    }

    /* renamed from: a */
    public Map<String, List<String>> mo9243a() {
        return this.f22088a.mo9243a();
    }

    public void addTransferListener(TransferListener transferListener) {
        this.f22088a.addTransferListener(transferListener);
    }

    public void close() throws IOException {
        this.f22088a.close();
    }

    public Uri getUri() {
        return this.f22088a.getUri();
    }

    public long open(DataSpec dataSpec) throws IOException {
        this.f22089b.mo24727c(this.f22090c);
        return this.f22088a.open(dataSpec);
    }

    public int read(byte[] bArr, int i, int i2) throws IOException {
        this.f22089b.mo24727c(this.f22090c);
        return this.f22088a.read(bArr, i, i2);
    }
}
