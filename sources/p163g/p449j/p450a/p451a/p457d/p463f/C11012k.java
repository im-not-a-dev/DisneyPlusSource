package p163g.p449j.p450a.p451a.p457d.p463f;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: g.j.a.a.d.f.k */
/* compiled from: com.google.firebase:firebase-messaging@@19.0.1 */
final class C11012k extends FilterInputStream {

    /* renamed from: U */
    private long f26033U = -1;

    /* renamed from: c */
    private long f26034c;

    C11012k(InputStream inputStream, long j) {
        super(inputStream);
        C11008g.m34723a(inputStream);
        this.f26034c = 1048576;
    }

    public final int available() throws IOException {
        return (int) Math.min((long) this.in.available(), this.f26034c);
    }

    public final synchronized void mark(int i) {
        this.in.mark(i);
        this.f26033U = this.f26034c;
    }

    public final int read() throws IOException {
        if (this.f26034c == 0) {
            return -1;
        }
        int read = this.in.read();
        if (read != -1) {
            this.f26034c--;
        }
        return read;
    }

    public final synchronized void reset() throws IOException {
        if (!this.in.markSupported()) {
            throw new IOException("Mark not supported");
        } else if (this.f26033U != -1) {
            this.in.reset();
            this.f26034c = this.f26033U;
        } else {
            throw new IOException("Mark not set");
        }
    }

    public final long skip(long j) throws IOException {
        long skip = this.in.skip(Math.min(j, this.f26034c));
        this.f26034c -= skip;
        return skip;
    }

    public final int read(byte[] bArr, int i, int i2) throws IOException {
        long j = this.f26034c;
        if (j == 0) {
            return -1;
        }
        int read = this.in.read(bArr, i, (int) Math.min((long) i2, j));
        if (read != -1) {
            this.f26034c -= (long) read;
        }
        return read;
    }
}
