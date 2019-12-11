package p163g.p413f.p414a.p424w;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: g.f.a.w.h */
/* compiled from: MarkEnforcingInputStream */
public class C10772h extends FilterInputStream {

    /* renamed from: c */
    private int f25484c = Integer.MIN_VALUE;

    public C10772h(InputStream inputStream) {
        super(inputStream);
    }

    /* renamed from: a */
    private long m34009a(long j) {
        int i = this.f25484c;
        if (i == 0) {
            return -1;
        }
        if (i != Integer.MIN_VALUE && j > ((long) i)) {
            j = (long) i;
        }
        return j;
    }

    /* renamed from: i */
    private void m34010i(long j) {
        int i = this.f25484c;
        if (i != Integer.MIN_VALUE && j != -1) {
            this.f25484c = (int) (((long) i) - j);
        }
    }

    public int available() throws IOException {
        int i = this.f25484c;
        if (i == Integer.MIN_VALUE) {
            return super.available();
        }
        return Math.min(i, super.available());
    }

    public synchronized void mark(int i) {
        super.mark(i);
        this.f25484c = i;
    }

    public int read() throws IOException {
        if (m34009a(1) == -1) {
            return -1;
        }
        int read = super.read();
        m34010i(1);
        return read;
    }

    public synchronized void reset() throws IOException {
        super.reset();
        this.f25484c = Integer.MIN_VALUE;
    }

    public long skip(long j) throws IOException {
        long a = m34009a(j);
        if (a == -1) {
            return 0;
        }
        long skip = super.skip(a);
        m34010i(skip);
        return skip;
    }

    public int read(byte[] bArr, int i, int i2) throws IOException {
        int a = (int) m34009a((long) i2);
        if (a == -1) {
            return -1;
        }
        int read = super.read(bArr, i, a);
        m34010i((long) read);
        return read;
    }
}
