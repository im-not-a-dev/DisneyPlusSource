package p161f.p162a;

import com.bamtech.sdk4.internal.configuration.ContentServiceClientExtras;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;

/* renamed from: f.a.h0 */
class C4460h0 implements Closeable {
    /* access modifiers changed from: private */

    /* renamed from: U */
    public final Charset f11072U;

    /* renamed from: V */
    private byte[] f11073V;

    /* renamed from: W */
    private int f11074W;

    /* renamed from: X */
    private int f11075X;

    /* renamed from: c */
    private final InputStream f11076c;

    /* renamed from: f.a.h0$a */
    class C4461a extends ByteArrayOutputStream {
        C4461a(int i) {
            super(i);
        }

        public String toString() {
            int i = this.count;
            try {
                return new String(this.buf, 0, (i <= 0 || this.buf[i + -1] != 13) ? this.count : i - 1, C4460h0.this.f11072U.name());
            } catch (UnsupportedEncodingException e) {
                throw new AssertionError(e);
            }
        }
    }

    public C4460h0(InputStream inputStream, Charset charset) {
        this(inputStream, ContentServiceClientExtras.URL_SIZE_LIMIT, charset);
    }

    /* renamed from: c */
    private void m15407c() {
        InputStream inputStream = this.f11076c;
        byte[] bArr = this.f11073V;
        int read = inputStream.read(bArr, 0, bArr.length);
        if (read != -1) {
            this.f11074W = 0;
            this.f11075X = read;
            return;
        }
        throw new EOFException();
    }

    /* renamed from: b */
    public boolean mo15567b() {
        return this.f11075X == -1;
    }

    public void close() {
        synchronized (this.f11076c) {
            if (this.f11073V != null) {
                this.f11073V = null;
                this.f11076c.close();
            }
        }
    }

    public C4460h0(InputStream inputStream, int i, Charset charset) {
        if (inputStream == null || charset == null) {
            throw new NullPointerException();
        } else if (i < 0) {
            throw new IllegalArgumentException("capacity <= 0");
        } else if (charset.equals(C4469i0.f11099a)) {
            this.f11076c = inputStream;
            this.f11072U = charset;
            this.f11073V = new byte[i];
        } else {
            throw new IllegalArgumentException("Unsupported encoding");
        }
    }

    /* renamed from: a */
    public String mo15566a() {
        int i;
        int i2;
        synchronized (this.f11076c) {
            if (this.f11073V != null) {
                if (this.f11074W >= this.f11075X) {
                    m15407c();
                }
                for (int i3 = this.f11074W; i3 != this.f11075X; i3++) {
                    if (this.f11073V[i3] == 10) {
                        if (i3 != this.f11074W) {
                            i2 = i3 - 1;
                            if (this.f11073V[i2] == 13) {
                                String str = new String(this.f11073V, this.f11074W, i2 - this.f11074W, this.f11072U.name());
                                this.f11074W = i3 + 1;
                                return str;
                            }
                        }
                        i2 = i3;
                        String str2 = new String(this.f11073V, this.f11074W, i2 - this.f11074W, this.f11072U.name());
                        this.f11074W = i3 + 1;
                        return str2;
                    }
                }
                C4461a aVar = new C4461a((this.f11075X - this.f11074W) + 80);
                loop1:
                while (true) {
                    aVar.write(this.f11073V, this.f11074W, this.f11075X - this.f11074W);
                    this.f11075X = -1;
                    m15407c();
                    i = this.f11074W;
                    while (true) {
                        if (i != this.f11075X) {
                            if (this.f11073V[i] == 10) {
                                break loop1;
                            }
                            i++;
                        }
                    }
                }
                if (i != this.f11074W) {
                    aVar.write(this.f11073V, this.f11074W, i - this.f11074W);
                }
                this.f11074W = i + 1;
                String aVar2 = aVar.toString();
                return aVar2;
            }
            throw new IOException("LineReader is closed");
        }
    }
}
