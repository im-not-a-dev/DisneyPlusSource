package okio;

import java.io.IOException;
import java.io.InputStream;

/* renamed from: okio.l */
/* compiled from: Okio.kt */
final class C14286l implements C14302x {

    /* renamed from: U */
    private final C14303y f31880U;

    /* renamed from: c */
    private final InputStream f31881c;

    public C14286l(InputStream inputStream, C14303y yVar) {
        this.f31881c = inputStream;
        this.f31880U = yVar;
    }

    /* renamed from: X */
    public C14303y mo35898X() {
        return this.f31880U;
    }

    /* renamed from: a */
    public long mo35899a(Buffer buffer, long j) {
        int i = (j > 0 ? 1 : (j == 0 ? 0 : -1));
        if (i == 0) {
            return 0;
        }
        if (i >= 0) {
            try {
                this.f31880U.mo36421e();
                C14295s b = buffer.mo36313b(1);
                int read = this.f31881c.read(b.f31900a, b.f31902c, (int) Math.min(j, (long) (8192 - b.f31902c)));
                if (read == -1) {
                    return -1;
                }
                b.f31902c += read;
                long j2 = (long) read;
                buffer.mo36344k(buffer.mo36335h() + j2);
                return j2;
            } catch (AssertionError e) {
                if (C14287m.m45725a(e)) {
                    throw new IOException(e);
                }
                throw e;
            }
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append("byteCount < 0: ");
            sb.append(j);
            throw new IllegalArgumentException(sb.toString().toString());
        }
    }

    public void close() {
        this.f31881c.close();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("source(");
        sb.append(this.f31881c);
        sb.append(')');
        return sb.toString();
    }
}
