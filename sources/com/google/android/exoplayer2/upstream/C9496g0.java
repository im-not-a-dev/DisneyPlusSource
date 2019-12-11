package com.google.android.exoplayer2.upstream;

import android.net.Uri;
import com.google.android.exoplayer2.p393v0.Assertions;
import java.io.IOException;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* renamed from: com.google.android.exoplayer2.upstream.g0 */
/* compiled from: StatsDataSource */
public final class C9496g0 implements DataSource {

    /* renamed from: a */
    private final DataSource f22107a;

    /* renamed from: b */
    private long f22108b;

    /* renamed from: c */
    private Uri f22109c = Uri.EMPTY;

    /* renamed from: d */
    private Map<String, List<String>> f22110d = Collections.emptyMap();

    public C9496g0(DataSource dataSource) {
        Assertions.checkNotNull(dataSource);
        this.f22107a = dataSource;
    }

    /* renamed from: a */
    public Map<String, List<String>> mo9243a() {
        return this.f22107a.mo9243a();
    }

    public void addTransferListener(TransferListener transferListener) {
        this.f22107a.addTransferListener(transferListener);
    }

    /* renamed from: b */
    public long mo24562b() {
        return this.f22108b;
    }

    /* renamed from: c */
    public Uri mo24563c() {
        return this.f22109c;
    }

    public void close() throws IOException {
        this.f22107a.close();
    }

    /* renamed from: d */
    public Map<String, List<String>> mo24564d() {
        return this.f22110d;
    }

    /* renamed from: e */
    public void mo24565e() {
        this.f22108b = 0;
    }

    public Uri getUri() {
        return this.f22107a.getUri();
    }

    public long open(DataSpec dataSpec) throws IOException {
        this.f22109c = dataSpec.f21938a;
        this.f22110d = Collections.emptyMap();
        long open = this.f22107a.open(dataSpec);
        Uri uri = getUri();
        Assertions.checkNotNull(uri);
        this.f22109c = uri;
        this.f22110d = mo9243a();
        return open;
    }

    public int read(byte[] bArr, int i, int i2) throws IOException {
        int read = this.f22107a.read(bArr, i, i2);
        if (read != -1) {
            this.f22108b += (long) read;
        }
        return read;
    }
}
