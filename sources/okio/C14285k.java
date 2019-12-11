package okio;

import java.io.EOFException;
import java.io.IOException;
import java.util.zip.DataFormatException;
import java.util.zip.Inflater;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: okio.k */
/* compiled from: InflaterSource.kt */
public final class C14285k implements C14302x {

    /* renamed from: U */
    private boolean f31876U;

    /* renamed from: V */
    private final BufferedSource f31877V;

    /* renamed from: W */
    private final Inflater f31878W;

    /* renamed from: c */
    private int f31879c;

    public C14285k(BufferedSource bufferedSource, Inflater inflater) {
        this.f31877V = bufferedSource;
        this.f31878W = inflater;
    }

    /* renamed from: b */
    private final void m45710b() {
        int i = this.f31879c;
        if (i != 0) {
            int remaining = i - this.f31878W.getRemaining();
            this.f31879c -= remaining;
            this.f31877V.skip((long) remaining);
        }
    }

    /* renamed from: X */
    public C14303y mo35898X() {
        return this.f31877V.mo35898X();
    }

    /* renamed from: a */
    public long mo35899a(Buffer buffer, long j) throws IOException {
        C14295s b;
        int i = (j > 0 ? 1 : (j == 0 ? 0 : -1));
        if (!(i >= 0)) {
            StringBuilder sb = new StringBuilder();
            sb.append("byteCount < 0: ");
            sb.append(j);
            throw new IllegalArgumentException(sb.toString().toString());
        } else if (!(!this.f31876U)) {
            throw new IllegalStateException("closed".toString());
        } else if (i == 0) {
            return 0;
        } else {
            while (true) {
                boolean a = mo36423a();
                try {
                    b = buffer.mo36313b(1);
                    int inflate = this.f31878W.inflate(b.f31900a, b.f31902c, (int) Math.min(j, (long) (8192 - b.f31902c)));
                    if (inflate > 0) {
                        b.f31902c += inflate;
                        long j2 = (long) inflate;
                        buffer.mo36344k(buffer.mo36335h() + j2);
                        return j2;
                    } else if (this.f31878W.finished()) {
                        break;
                    } else if (this.f31878W.needsDictionary()) {
                        break;
                    } else if (a) {
                        throw new EOFException("source exhausted prematurely");
                    }
                } catch (DataFormatException e) {
                    throw new IOException(e);
                }
            }
            m45710b();
            if (b.f31901b == b.f31902c) {
                buffer.f31848c = b.mo36462b();
                C14297t.m45789a(b);
            }
            return -1;
        }
    }

    public void close() throws IOException {
        if (!this.f31876U) {
            this.f31878W.end();
            this.f31876U = true;
            this.f31877V.close();
        }
    }

    /* renamed from: a */
    public final boolean mo36423a() throws IOException {
        if (!this.f31878W.needsInput()) {
            return false;
        }
        m45710b();
        if (!(this.f31878W.getRemaining() == 0)) {
            throw new IllegalStateException("?".toString());
        } else if (this.f31877V.mo36309a0()) {
            return true;
        } else {
            C14295s sVar = this.f31877V.mo36288Z().f31848c;
            if (sVar != null) {
                int i = sVar.f31902c;
                int i2 = sVar.f31901b;
                this.f31879c = i - i2;
                this.f31878W.setInput(sVar.f31900a, i2, this.f31879c);
                return false;
            }
            Intrinsics.throwNpe();
            throw null;
        }
    }
}
