package okhttp3.p688d0.p693k;

import java.io.Closeable;
import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import net.danlew.android.joda.DateUtils;
import okhttp3.p688d0.C14126e;
import okio.Buffer;
import okio.C14280f;

/* renamed from: okhttp3.d0.k.j */
/* compiled from: Http2Writer */
final class C14208j implements Closeable {

    /* renamed from: Z */
    private static final Logger f31681Z = Logger.getLogger(C14184e.class.getName());

    /* renamed from: U */
    private final boolean f31682U;

    /* renamed from: V */
    private final Buffer f31683V = new Buffer();

    /* renamed from: W */
    private int f31684W = DateUtils.FORMAT_ABBREV_TIME;

    /* renamed from: X */
    private boolean f31685X;

    /* renamed from: Y */
    final C14183b f31686Y = new C14183b(this.f31683V);

    /* renamed from: c */
    private final C14280f f31687c;

    C14208j(C14280f fVar, boolean z) {
        this.f31687c = fVar;
        this.f31682U = z;
    }

    /* renamed from: c */
    private void m45247c(int i, long j) throws IOException {
        while (j > 0) {
            int min = (int) Math.min((long) this.f31684W, j);
            long j2 = (long) min;
            j -= j2;
            mo36093a(i, min, 9, j == 0 ? (byte) 4 : 0);
            this.f31687c.mo35927b(this.f31683V, j2);
        }
    }

    /* renamed from: a */
    public synchronized void mo36091a() throws IOException {
        if (this.f31685X) {
            throw new IOException("closed");
        } else if (this.f31682U) {
            if (f31681Z.isLoggable(Level.FINE)) {
                f31681Z.fine(C14126e.m44817a(">> CONNECTION %s", C14184e.f31571a.mo36386f()));
            }
            this.f31687c.write(C14184e.f31571a.mo36393l());
            this.f31687c.flush();
        }
    }

    /* renamed from: b */
    public int mo36101b() {
        return this.f31684W;
    }

    public synchronized void close() throws IOException {
        this.f31685X = true;
        this.f31687c.close();
    }

    public synchronized void flush() throws IOException {
        if (!this.f31685X) {
            this.f31687c.flush();
        } else {
            throw new IOException("closed");
        }
    }

    /* renamed from: b */
    public synchronized void mo36103b(C14213m mVar) throws IOException {
        if (!this.f31685X) {
            int i = 0;
            mo36093a(0, mVar.mo36121d() * 6, 4, 0);
            while (i < 10) {
                if (mVar.mo36122d(i)) {
                    int i2 = i == 4 ? 3 : i == 7 ? 4 : i;
                    this.f31687c.writeShort(i2);
                    this.f31687c.writeInt(mVar.mo36113a(i));
                }
                i++;
            }
            this.f31687c.flush();
        } else {
            throw new IOException("closed");
        }
    }

    /* renamed from: a */
    public synchronized void mo36097a(C14213m mVar) throws IOException {
        if (!this.f31685X) {
            this.f31684W = mVar.mo36120c(this.f31684W);
            if (mVar.mo36117b() != -1) {
                this.f31686Y.mo36027a(mVar.mo36117b());
            }
            mo36093a(0, 0, 4, 1);
            this.f31687c.flush();
        } else {
            throw new IOException("closed");
        }
    }

    /* renamed from: b */
    public synchronized void mo36102b(int i, long j) throws IOException {
        if (this.f31685X) {
            throw new IOException("closed");
        } else if (j == 0 || j > 2147483647L) {
            C14184e.m45118a("windowSizeIncrement == 0 || windowSizeIncrement > 0x7fffffffL: %s", Long.valueOf(j));
            throw null;
        } else {
            mo36093a(i, 4, 8, 0);
            this.f31687c.writeInt((int) j);
            this.f31687c.flush();
        }
    }

    /* renamed from: a */
    public synchronized void mo36094a(int i, int i2, List<C14180c> list) throws IOException {
        if (!this.f31685X) {
            this.f31686Y.mo36029a(list);
            long h = this.f31683V.mo36335h();
            int min = (int) Math.min((long) (this.f31684W - 4), h);
            long j = (long) min;
            int i3 = (h > j ? 1 : (h == j ? 0 : -1));
            mo36093a(i, min + 4, 5, i3 == 0 ? (byte) 4 : 0);
            this.f31687c.writeInt(i2 & Integer.MAX_VALUE);
            this.f31687c.mo35927b(this.f31683V, j);
            if (i3 > 0) {
                m45247c(i, h - j);
            }
        } else {
            throw new IOException("closed");
        }
    }

    /* renamed from: a */
    public synchronized void mo36095a(int i, C14179b bVar) throws IOException {
        if (this.f31685X) {
            throw new IOException("closed");
        } else if (bVar.f31542c != -1) {
            mo36093a(i, 4, 3, 0);
            this.f31687c.writeInt(bVar.f31542c);
            this.f31687c.flush();
        } else {
            throw new IllegalArgumentException();
        }
    }

    /* renamed from: a */
    public synchronized void mo36100a(boolean z, int i, Buffer buffer, int i2) throws IOException {
        if (!this.f31685X) {
            byte b = 0;
            if (z) {
                b = (byte) 1;
            }
            mo36092a(i, b, buffer, i2);
        } else {
            throw new IOException("closed");
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo36092a(int i, byte b, Buffer buffer, int i2) throws IOException {
        mo36093a(i, i2, 0, b);
        if (i2 > 0) {
            this.f31687c.mo35927b(buffer, (long) i2);
        }
    }

    /* renamed from: a */
    public synchronized void mo36098a(boolean z, int i, int i2) throws IOException {
        if (!this.f31685X) {
            mo36093a(0, 8, 6, z ? (byte) 1 : 0);
            this.f31687c.writeInt(i);
            this.f31687c.writeInt(i2);
            this.f31687c.flush();
        } else {
            throw new IOException("closed");
        }
    }

    /* renamed from: a */
    public synchronized void mo36096a(int i, C14179b bVar, byte[] bArr) throws IOException {
        if (this.f31685X) {
            throw new IOException("closed");
        } else if (bVar.f31542c != -1) {
            mo36093a(0, bArr.length + 8, 7, 0);
            this.f31687c.writeInt(i);
            this.f31687c.writeInt(bVar.f31542c);
            if (bArr.length > 0) {
                this.f31687c.write(bArr);
            }
            this.f31687c.flush();
        } else {
            C14184e.m45118a("errorCode.httpCode == -1", new Object[0]);
            throw null;
        }
    }

    /* renamed from: a */
    public void mo36093a(int i, int i2, byte b, byte b2) throws IOException {
        if (f31681Z.isLoggable(Level.FINE)) {
            f31681Z.fine(C14184e.m45120a(false, i, i2, b, b2));
        }
        int i3 = this.f31684W;
        if (i2 > i3) {
            C14184e.m45118a("FRAME_SIZE_ERROR length > %d: %d", Integer.valueOf(i3), Integer.valueOf(i2));
            throw null;
        } else if ((Integer.MIN_VALUE & i) == 0) {
            m45246a(this.f31687c, i2);
            this.f31687c.writeByte(b & 255);
            this.f31687c.writeByte(b2 & 255);
            this.f31687c.writeInt(i & Integer.MAX_VALUE);
        } else {
            C14184e.m45118a("reserved bit set: %s", Integer.valueOf(i));
            throw null;
        }
    }

    /* renamed from: a */
    private static void m45246a(C14280f fVar, int i) throws IOException {
        fVar.writeByte((i >>> 16) & 255);
        fVar.writeByte((i >>> 8) & 255);
        fVar.writeByte(i & 255);
    }

    /* renamed from: a */
    public synchronized void mo36099a(boolean z, int i, List<C14180c> list) throws IOException {
        if (!this.f31685X) {
            this.f31686Y.mo36029a(list);
            long h = this.f31683V.mo36335h();
            int min = (int) Math.min((long) this.f31684W, h);
            long j = (long) min;
            int i2 = (h > j ? 1 : (h == j ? 0 : -1));
            byte b = i2 == 0 ? (byte) 4 : 0;
            if (z) {
                b = (byte) (b | 1);
            }
            mo36093a(i, min, 1, b);
            this.f31687c.mo35927b(this.f31683V, j);
            if (i2 > 0) {
                m45247c(i, h - j);
            }
        } else {
            throw new IOException("closed");
        }
    }
}
