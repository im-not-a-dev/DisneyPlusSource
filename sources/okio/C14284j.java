package okio;

import java.io.EOFException;
import java.io.IOException;
import java.util.Arrays;
import java.util.zip.CRC32;
import java.util.zip.Inflater;
import kotlin.jvm.internal.C12880j;

/* renamed from: okio.j */
/* compiled from: GzipSource.kt */
public final class C14284j implements C14302x {

    /* renamed from: U */
    private final C14293r f31871U;

    /* renamed from: V */
    private final Inflater f31872V = new Inflater(true);

    /* renamed from: W */
    private final C14285k f31873W = new C14285k(this.f31871U, this.f31872V);

    /* renamed from: X */
    private final CRC32 f31874X = new CRC32();

    /* renamed from: c */
    private byte f31875c;

    public C14284j(C14302x xVar) {
        this.f31871U = new C14293r(xVar);
    }

    /* renamed from: b */
    private final void m45707b() throws IOException {
        m45705a("CRC", this.f31871U.mo36443a(), (int) this.f31874X.getValue());
        m45705a("ISIZE", this.f31871U.mo36443a(), (int) this.f31872V.getBytesWritten());
    }

    /* renamed from: X */
    public C14303y mo35898X() {
        return this.f31871U.mo35898X();
    }

    /* renamed from: a */
    public long mo35899a(Buffer buffer, long j) throws IOException {
        int i = (j > 0 ? 1 : (j == 0 ? 0 : -1));
        if (!(i >= 0)) {
            StringBuilder sb = new StringBuilder();
            sb.append("byteCount < 0: ");
            sb.append(j);
            throw new IllegalArgumentException(sb.toString().toString());
        } else if (i == 0) {
            return 0;
        } else {
            if (this.f31875c == 0) {
                m45704a();
                this.f31875c = 1;
            }
            if (this.f31875c == 1) {
                long h = buffer.mo36335h();
                long a = this.f31873W.mo35899a(buffer, j);
                if (a != -1) {
                    m45706a(buffer, h, a);
                    return a;
                }
                this.f31875c = 2;
            }
            if (this.f31875c == 2) {
                m45707b();
                this.f31875c = 3;
                if (!this.f31871U.mo36309a0()) {
                    throw new IOException("gzip finished without exhausting source");
                }
            }
            return -1;
        }
    }

    public void close() throws IOException {
        this.f31873W.close();
    }

    /* renamed from: a */
    private final void m45704a() throws IOException {
        this.f31871U.mo36330f(10);
        byte a = this.f31871U.f31898c.mo36289a(3);
        boolean z = true;
        boolean z2 = ((a >> 1) & 1) == 1;
        if (z2) {
            m45706a(this.f31871U.f31898c, 0, 10);
        }
        m45705a("ID1ID2", 8075, (int) this.f31871U.readShort());
        this.f31871U.skip(8);
        if (((a >> 2) & 1) == 1) {
            this.f31871U.mo36330f(2);
            if (z2) {
                m45706a(this.f31871U.f31898c, 0, 2);
            }
            long f = (long) this.f31871U.f31898c.mo36329f();
            this.f31871U.mo36330f(f);
            if (z2) {
                m45706a(this.f31871U.f31898c, 0, f);
            }
            this.f31871U.skip(f);
        }
        if (((a >> 3) & 1) == 1) {
            long a2 = this.f31871U.mo36444a(0);
            if (a2 != -1) {
                if (z2) {
                    m45706a(this.f31871U.f31898c, 0, a2 + 1);
                }
                this.f31871U.skip(a2 + 1);
            } else {
                throw new EOFException();
            }
        }
        if (((a >> 4) & 1) != 1) {
            z = false;
        }
        if (z) {
            long a3 = this.f31871U.mo36444a(0);
            if (a3 != -1) {
                if (z2) {
                    m45706a(this.f31871U.f31898c, 0, a3 + 1);
                }
                this.f31871U.skip(a3 + 1);
            } else {
                throw new EOFException();
            }
        }
        if (z2) {
            m45705a("FHCRC", (int) this.f31871U.mo36449b(), (int) (short) ((int) this.f31874X.getValue()));
            this.f31874X.reset();
        }
    }

    /* renamed from: a */
    private final void m45706a(Buffer buffer, long j, long j2) {
        C14295s sVar = buffer.f31848c;
        if (sVar != null) {
            do {
                int i = sVar.f31902c;
                int i2 = sVar.f31901b;
                if (j >= ((long) (i - i2))) {
                    j -= (long) (i - i2);
                    sVar = sVar.f31905f;
                } else {
                    while (j2 > 0) {
                        int i3 = (int) (((long) sVar.f31901b) + j);
                        int min = (int) Math.min((long) (sVar.f31902c - i3), j2);
                        this.f31874X.update(sVar.f31900a, i3, min);
                        j2 -= (long) min;
                        sVar = sVar.f31905f;
                        if (sVar != null) {
                            j = 0;
                        } else {
                            C12880j.m40220a();
                            throw null;
                        }
                    }
                    return;
                }
            } while (sVar != null);
            C12880j.m40220a();
            throw null;
        }
        C12880j.m40220a();
        throw null;
    }

    /* renamed from: a */
    private final void m45705a(String str, int i, int i2) {
        if (i2 != i) {
            Object[] objArr = {str, Integer.valueOf(i2), Integer.valueOf(i)};
            String format = String.format("%s: actual 0x%08x != expected 0x%08x", Arrays.copyOf(objArr, objArr.length));
            C12880j.m40222a((Object) format, "java.lang.String.format(this, *args)");
            throw new IOException(format);
        }
    }
}
