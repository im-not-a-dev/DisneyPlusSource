package com.google.android.exoplayer2.upstream;

import com.google.android.exoplayer2.util.Assertions;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: com.google.android.exoplayer2.upstream.n */
/* compiled from: DataSourceInputStream */
public final class C9508n extends InputStream {

    /* renamed from: U */
    private final DataSpec f22140U;

    /* renamed from: V */
    private final byte[] f22141V;

    /* renamed from: W */
    private boolean f22142W = false;

    /* renamed from: X */
    private boolean f22143X = false;

    /* renamed from: Y */
    private long f22144Y;

    /* renamed from: c */
    private final DataSource f22145c;

    public C9508n(DataSource dataSource, DataSpec dataSpec) {
        this.f22145c = dataSource;
        this.f22140U = dataSpec;
        this.f22141V = new byte[1];
    }

    /* renamed from: b */
    private void m29213b() throws IOException {
        if (!this.f22142W) {
            this.f22145c.open(this.f22140U);
            this.f22142W = true;
        }
    }

    /* renamed from: a */
    public void mo24570a() throws IOException {
        m29213b();
    }

    public void close() throws IOException {
        if (!this.f22143X) {
            this.f22145c.close();
            this.f22143X = true;
        }
    }

    public int read() throws IOException {
        if (read(this.f22141V) == -1) {
            return -1;
        }
        return this.f22141V[0] & 255;
    }

    public int read(byte[] bArr) throws IOException {
        return read(bArr, 0, bArr.length);
    }

    public int read(byte[] bArr, int i, int i2) throws IOException {
        Assertions.checkState(!this.f22143X);
        m29213b();
        int read = this.f22145c.read(bArr, i, i2);
        if (read == -1) {
            return -1;
        }
        this.f22144Y += (long) read;
        return read;
    }
}
