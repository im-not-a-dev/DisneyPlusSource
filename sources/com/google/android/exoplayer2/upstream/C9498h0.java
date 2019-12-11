package com.google.android.exoplayer2.upstream;

import android.net.Uri;
import com.google.android.exoplayer2.util.Assertions;
import java.io.IOException;
import java.util.List;
import java.util.Map;

/* renamed from: com.google.android.exoplayer2.upstream.h0 */
/* compiled from: TeeDataSource */
public final class C9498h0 implements DataSource {

    /* renamed from: a */
    private final DataSource f22115a;

    /* renamed from: b */
    private final C9504k f22116b;

    /* renamed from: c */
    private boolean f22117c;

    /* renamed from: d */
    private long f22118d;

    public C9498h0(DataSource dataSource, C9504k kVar) {
        Assertions.checkNotNull(dataSource);
        this.f22115a = dataSource;
        Assertions.checkNotNull(kVar);
        this.f22116b = kVar;
    }

    /* renamed from: a */
    public Map<String, List<String>> mo9243a() {
        return this.f22115a.mo9243a();
    }

    public void addTransferListener(TransferListener transferListener) {
        this.f22115a.addTransferListener(transferListener);
    }

    public void close() throws IOException {
        try {
            this.f22115a.close();
        } finally {
            if (this.f22117c) {
                this.f22117c = false;
                this.f22116b.close();
            }
        }
    }

    public Uri getUri() {
        return this.f22115a.getUri();
    }

    public long open(DataSpec dataSpec) throws IOException {
        this.f22118d = this.f22115a.open(dataSpec);
        long j = this.f22118d;
        if (j == 0) {
            return 0;
        }
        if (dataSpec.f21943f == -1 && j != -1) {
            dataSpec = dataSpec.mo24450a(0, j);
        }
        this.f22117c = true;
        this.f22116b.open(dataSpec);
        return this.f22118d;
    }

    public int read(byte[] bArr, int i, int i2) throws IOException {
        if (this.f22118d == 0) {
            return -1;
        }
        int read = this.f22115a.read(bArr, i, i2);
        if (read > 0) {
            this.f22116b.write(bArr, i, read);
            long j = this.f22118d;
            if (j != -1) {
                this.f22118d = j - ((long) read);
            }
        }
        return read;
    }
}
