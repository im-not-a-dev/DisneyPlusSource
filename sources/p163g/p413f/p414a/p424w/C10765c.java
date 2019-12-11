package p163g.p413f.p414a.p424w;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: g.f.a.w.c */
/* compiled from: ContentLengthInputStream */
public final class C10765c extends FilterInputStream {

    /* renamed from: U */
    private int f25472U;

    /* renamed from: c */
    private final long f25473c;

    private C10765c(InputStream inputStream, long j) {
        super(inputStream);
        this.f25473c = j;
    }

    /* renamed from: a */
    public static InputStream m33990a(InputStream inputStream, long j) {
        return new C10765c(inputStream, j);
    }

    /* renamed from: b */
    private int m33991b(int i) throws IOException {
        if (i >= 0) {
            this.f25472U += i;
        } else if (this.f25473c - ((long) this.f25472U) > 0) {
            StringBuilder sb = new StringBuilder();
            sb.append("Failed to read all expected data, expected: ");
            sb.append(this.f25473c);
            sb.append(", but read: ");
            sb.append(this.f25472U);
            throw new IOException(sb.toString());
        }
        return i;
    }

    public synchronized int available() throws IOException {
        return (int) Math.max(this.f25473c - ((long) this.f25472U), (long) this.in.available());
    }

    public synchronized int read() throws IOException {
        int read;
        read = super.read();
        m33991b(read >= 0 ? 1 : -1);
        return read;
    }

    public int read(byte[] bArr) throws IOException {
        return read(bArr, 0, bArr.length);
    }

    public synchronized int read(byte[] bArr, int i, int i2) throws IOException {
        int read;
        read = super.read(bArr, i, i2);
        m33991b(read);
        return read;
    }
}
