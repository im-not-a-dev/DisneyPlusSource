package okio;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;

/* renamed from: okio.q */
/* compiled from: RealBufferedSink.kt */
public final class C14292q implements C14280f {

    /* renamed from: U */
    public boolean f31893U;

    /* renamed from: V */
    public final C14300v f31894V;

    /* renamed from: c */
    public final Buffer f31895c = new Buffer();

    public C14292q(C14300v vVar) {
        this.f31894V = vVar;
    }

    /* renamed from: X */
    public C14303y mo36019X() {
        return this.f31894V.mo36019X();
    }

    /* renamed from: a */
    public C14280f mo36301a(String str) {
        if (!this.f31893U) {
            this.f31895c.m45552a(str);
            return mo36341i0();
        }
        throw new IllegalStateException("closed".toString());
    }

    /* renamed from: b */
    public void mo35927b(Buffer buffer, long j) {
        if (!this.f31893U) {
            this.f31895c.mo35927b(buffer, j);
            mo36341i0();
            return;
        }
        throw new IllegalStateException("closed".toString());
    }

    public void close() {
        if (!this.f31893U) {
            Throwable th = null;
            try {
                if (this.f31895c.mo36335h() > 0) {
                    this.f31894V.mo35927b(this.f31895c, this.f31895c.mo36335h());
                }
            } catch (Throwable th2) {
                th = th2;
            }
            try {
                this.f31894V.close();
            } catch (Throwable th3) {
                if (th == null) {
                    th = th3;
                }
            }
            this.f31893U = true;
            if (th != null) {
                throw th;
            }
        }
    }

    public void flush() {
        if (!this.f31893U) {
            if (this.f31895c.mo36335h() > 0) {
                C14300v vVar = this.f31894V;
                Buffer buffer = this.f31895c;
                vVar.mo35927b(buffer, buffer.mo36335h());
            }
            this.f31894V.flush();
            return;
        }
        throw new IllegalStateException("closed".toString());
    }

    /* renamed from: g */
    public C14280f mo36333g(long j) {
        if (!this.f31893U) {
            this.f31895c.m45581g(j);
            return mo36341i0();
        }
        throw new IllegalStateException("closed".toString());
    }

    /* renamed from: h */
    public C14280f mo36336h(long j) {
        if (!this.f31893U) {
            this.f31895c.m45585h(j);
            mo36341i0();
            return this;
        }
        throw new IllegalStateException("closed".toString());
    }

    /* renamed from: h0 */
    public Buffer mo36337h0() {
        return this.f31895c;
    }

    /* renamed from: i0 */
    public C14280f mo36341i0() {
        if (!this.f31893U) {
            long b = this.f31895c.mo36310b();
            if (b > 0) {
                this.f31894V.mo35927b(this.f31895c, b);
            }
            return this;
        }
        throw new IllegalStateException("closed".toString());
    }

    public boolean isOpen() {
        return !this.f31893U;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("buffer(");
        sb.append(this.f31894V);
        sb.append(')');
        return sb.toString();
    }

    public C14280f write(byte[] bArr) {
        if (!this.f31893U) {
            this.f31895c.write(bArr);
            mo36341i0();
            return this;
        }
        throw new IllegalStateException("closed".toString());
    }

    public C14280f writeByte(int i) {
        if (!this.f31893U) {
            this.f31895c.writeByte(i);
            mo36341i0();
            return this;
        }
        throw new IllegalStateException("closed".toString());
    }

    public C14280f writeInt(int i) {
        if (!this.f31893U) {
            this.f31895c.writeInt(i);
            return mo36341i0();
        }
        throw new IllegalStateException("closed".toString());
    }

    public C14280f writeShort(int i) {
        if (!this.f31893U) {
            this.f31895c.writeShort(i);
            mo36341i0();
            return this;
        }
        throw new IllegalStateException("closed".toString());
    }

    /* renamed from: a */
    public C14280f mo36302a(String str, int i, int i2) {
        if (!this.f31893U) {
            this.f31895c.m45553a(str, i, i2);
            mo36341i0();
            return this;
        }
        throw new IllegalStateException("closed".toString());
    }

    public C14280f write(byte[] bArr, int i, int i2) {
        if (!this.f31893U) {
            this.f31895c.write(bArr, i, i2);
            mo36341i0();
            return this;
        }
        throw new IllegalStateException("closed".toString());
    }

    /* renamed from: a */
    public C14280f mo36304a(String str, Charset charset) {
        if (!this.f31893U) {
            this.f31895c.m45554a(str, charset);
            mo36341i0();
            return this;
        }
        throw new IllegalStateException("closed".toString());
    }

    public int write(ByteBuffer byteBuffer) {
        if (!this.f31893U) {
            int write = this.f31895c.write(byteBuffer);
            mo36341i0();
            return write;
        }
        throw new IllegalStateException("closed".toString());
    }
}
