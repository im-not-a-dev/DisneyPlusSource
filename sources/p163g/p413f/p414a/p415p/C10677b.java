package p163g.p413f.p414a.p415p;

import com.bamtech.sdk4.internal.configuration.ContentServiceClientExtras;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;

/* renamed from: g.f.a.p.b */
/* compiled from: StrictLineReader */
class C10677b implements Closeable {
    /* access modifiers changed from: private */

    /* renamed from: U */
    public final Charset f25235U;

    /* renamed from: V */
    private byte[] f25236V;

    /* renamed from: W */
    private int f25237W;

    /* renamed from: X */
    private int f25238X;

    /* renamed from: c */
    private final InputStream f25239c;

    /* renamed from: g.f.a.p.b$a */
    /* compiled from: StrictLineReader */
    class C10678a extends ByteArrayOutputStream {
        C10678a(int i) {
            super(i);
        }

        public String toString() {
            int i = this.count;
            try {
                return new String(this.buf, 0, (i <= 0 || this.buf[i + -1] != 13) ? this.count : i - 1, C10677b.this.f25235U.name());
            } catch (UnsupportedEncodingException e) {
                throw new AssertionError(e);
            }
        }
    }

    public C10677b(InputStream inputStream, Charset charset) {
        this(inputStream, ContentServiceClientExtras.URL_SIZE_LIMIT, charset);
    }

    /* renamed from: c */
    private void m33554c() throws IOException {
        InputStream inputStream = this.f25239c;
        byte[] bArr = this.f25236V;
        int read = inputStream.read(bArr, 0, bArr.length);
        if (read != -1) {
            this.f25237W = 0;
            this.f25238X = read;
            return;
        }
        throw new EOFException();
    }

    /* renamed from: b */
    public String mo27599b() throws IOException {
        int i;
        int i2;
        synchronized (this.f25239c) {
            if (this.f25236V != null) {
                if (this.f25237W >= this.f25238X) {
                    m33554c();
                }
                for (int i3 = this.f25237W; i3 != this.f25238X; i3++) {
                    if (this.f25236V[i3] == 10) {
                        if (i3 != this.f25237W) {
                            i2 = i3 - 1;
                            if (this.f25236V[i2] == 13) {
                                String str = new String(this.f25236V, this.f25237W, i2 - this.f25237W, this.f25235U.name());
                                this.f25237W = i3 + 1;
                                return str;
                            }
                        }
                        i2 = i3;
                        String str2 = new String(this.f25236V, this.f25237W, i2 - this.f25237W, this.f25235U.name());
                        this.f25237W = i3 + 1;
                        return str2;
                    }
                }
                C10678a aVar = new C10678a((this.f25238X - this.f25237W) + 80);
                loop1:
                while (true) {
                    aVar.write(this.f25236V, this.f25237W, this.f25238X - this.f25237W);
                    this.f25238X = -1;
                    m33554c();
                    i = this.f25237W;
                    while (true) {
                        if (i != this.f25238X) {
                            if (this.f25236V[i] == 10) {
                                break loop1;
                            }
                            i++;
                        }
                    }
                }
                if (i != this.f25237W) {
                    aVar.write(this.f25236V, this.f25237W, i - this.f25237W);
                }
                this.f25237W = i + 1;
                String aVar2 = aVar.toString();
                return aVar2;
            }
            throw new IOException("LineReader is closed");
        }
    }

    public void close() throws IOException {
        synchronized (this.f25239c) {
            if (this.f25236V != null) {
                this.f25236V = null;
                this.f25239c.close();
            }
        }
    }

    public C10677b(InputStream inputStream, int i, Charset charset) {
        if (inputStream == null || charset == null) {
            throw new NullPointerException();
        } else if (i < 0) {
            throw new IllegalArgumentException("capacity <= 0");
        } else if (charset.equals(C10679c.f25241a)) {
            this.f25239c = inputStream;
            this.f25235U = charset;
            this.f25236V = new byte[i];
        } else {
            throw new IllegalArgumentException("Unsupported encoding");
        }
    }

    /* renamed from: a */
    public boolean mo27598a() {
        return this.f25238X == -1;
    }
}
