package okhttp3.p688d0.p693k;

import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import okhttp3.p688d0.C14126e;
import okio.Buffer;
import okio.BufferedSource;
import okio.ByteString;
import okio.C14302x;
import okio.C14303y;

/* renamed from: okhttp3.d0.k.h */
/* compiled from: Http2Reader */
final class C14201h implements Closeable {

    /* renamed from: X */
    static final Logger f31645X = Logger.getLogger(C14184e.class.getName());

    /* renamed from: U */
    private final C14202a f31646U = new C14202a(this.f31649c);

    /* renamed from: V */
    private final boolean f31647V;

    /* renamed from: W */
    final C14182a f31648W = new C14182a(4096, this.f31646U);

    /* renamed from: c */
    private final BufferedSource f31649c;

    /* renamed from: okhttp3.d0.k.h$a */
    /* compiled from: Http2Reader */
    static final class C14202a implements C14302x {

        /* renamed from: U */
        int f31650U;

        /* renamed from: V */
        byte f31651V;

        /* renamed from: W */
        int f31652W;

        /* renamed from: X */
        int f31653X;

        /* renamed from: Y */
        short f31654Y;

        /* renamed from: c */
        private final BufferedSource f31655c;

        C14202a(BufferedSource bufferedSource) {
            this.f31655c = bufferedSource;
        }

        /* renamed from: X */
        public C14303y mo35898X() {
            return this.f31655c.mo35898X();
        }

        /* renamed from: a */
        public long mo35899a(Buffer buffer, long j) throws IOException {
            while (true) {
                int i = this.f31653X;
                if (i == 0) {
                    this.f31655c.skip((long) this.f31654Y);
                    this.f31654Y = 0;
                    if ((this.f31651V & 4) != 0) {
                        return -1;
                    }
                    m45204a();
                } else {
                    long a = this.f31655c.mo35899a(buffer, Math.min(j, (long) i));
                    if (a == -1) {
                        return -1;
                    }
                    this.f31653X = (int) (((long) this.f31653X) - a);
                    return a;
                }
            }
        }

        public void close() throws IOException {
        }

        /* renamed from: a */
        private void m45204a() throws IOException {
            int i = this.f31652W;
            int a = C14201h.m45190a(this.f31655c);
            this.f31653X = a;
            this.f31650U = a;
            byte readByte = (byte) (this.f31655c.readByte() & 255);
            this.f31651V = (byte) (this.f31655c.readByte() & 255);
            if (C14201h.f31645X.isLoggable(Level.FINE)) {
                C14201h.f31645X.fine(C14184e.m45120a(true, this.f31652W, this.f31650U, readByte, this.f31651V));
            }
            this.f31652W = this.f31655c.readInt() & Integer.MAX_VALUE;
            if (readByte != 9) {
                C14184e.m45121b("%s != TYPE_CONTINUATION", Byte.valueOf(readByte));
                throw null;
            } else if (this.f31652W != i) {
                C14184e.m45121b("TYPE_CONTINUATION streamId changed", new Object[0]);
                throw null;
            }
        }
    }

    /* renamed from: okhttp3.d0.k.h$b */
    /* compiled from: Http2Reader */
    interface C14203b {
        /* renamed from: a */
        void mo36058a();

        /* renamed from: a */
        void mo36059a(int i, int i2, int i3, boolean z);

        /* renamed from: a */
        void mo36060a(int i, int i2, List<C14180c> list) throws IOException;

        /* renamed from: a */
        void mo36061a(int i, long j);

        /* renamed from: a */
        void mo36062a(int i, C14179b bVar);

        /* renamed from: a */
        void mo36063a(int i, C14179b bVar, ByteString byteString);

        /* renamed from: a */
        void mo36064a(boolean z, int i, int i2);

        /* renamed from: a */
        void mo36065a(boolean z, int i, int i2, List<C14180c> list);

        /* renamed from: a */
        void mo36066a(boolean z, int i, BufferedSource bufferedSource, int i2) throws IOException;

        /* renamed from: a */
        void mo36067a(boolean z, C14213m mVar);
    }

    C14201h(BufferedSource bufferedSource, boolean z) {
        this.f31649c = bufferedSource;
        this.f31647V = z;
    }

    /* renamed from: b */
    private void m45194b(C14203b bVar, int i, byte b, int i2) throws IOException {
        if (i < 8) {
            C14184e.m45121b("TYPE_GOAWAY length < 8: %s", Integer.valueOf(i));
            throw null;
        } else if (i2 == 0) {
            int readInt = this.f31649c.readInt();
            int readInt2 = this.f31649c.readInt();
            int i3 = i - 8;
            C14179b a = C14179b.m45090a(readInt2);
            if (a != null) {
                ByteString byteString = ByteString.f31851W;
                if (i3 > 0) {
                    byteString = this.f31649c.mo36319c((long) i3);
                }
                bVar.mo36063a(readInt, a, byteString);
                return;
            }
            C14184e.m45121b("TYPE_GOAWAY unexpected error code: %d", Integer.valueOf(readInt2));
            throw null;
        } else {
            C14184e.m45121b("TYPE_GOAWAY streamId != 0", new Object[0]);
            throw null;
        }
    }

    /* renamed from: c */
    private void m45195c(C14203b bVar, int i, byte b, int i2) throws IOException {
        short s = 0;
        if (i2 != 0) {
            boolean z = (b & 1) != 0;
            if ((b & 8) != 0) {
                s = (short) (this.f31649c.readByte() & 255);
            }
            if ((b & 32) != 0) {
                m45192a(bVar, i2);
                i -= 5;
            }
            bVar.mo36065a(z, i2, -1, m45191a(m45189a(i, b, s), s, b, i2));
            return;
        }
        C14184e.m45121b("PROTOCOL_ERROR: TYPE_HEADERS streamId == 0", new Object[0]);
        throw null;
    }

    /* renamed from: d */
    private void m45196d(C14203b bVar, int i, byte b, int i2) throws IOException {
        boolean z = false;
        if (i != 8) {
            C14184e.m45121b("TYPE_PING length != 8: %s", Integer.valueOf(i));
            throw null;
        } else if (i2 == 0) {
            int readInt = this.f31649c.readInt();
            int readInt2 = this.f31649c.readInt();
            if ((b & 1) != 0) {
                z = true;
            }
            bVar.mo36064a(z, readInt, readInt2);
        } else {
            C14184e.m45121b("TYPE_PING streamId != 0", new Object[0]);
            throw null;
        }
    }

    /* renamed from: e */
    private void m45197e(C14203b bVar, int i, byte b, int i2) throws IOException {
        if (i != 5) {
            C14184e.m45121b("TYPE_PRIORITY length: %d != 5", Integer.valueOf(i));
            throw null;
        } else if (i2 != 0) {
            m45192a(bVar, i2);
        } else {
            C14184e.m45121b("TYPE_PRIORITY streamId == 0", new Object[0]);
            throw null;
        }
    }

    /* renamed from: f */
    private void m45198f(C14203b bVar, int i, byte b, int i2) throws IOException {
        short s = 0;
        if (i2 != 0) {
            if ((b & 8) != 0) {
                s = (short) (this.f31649c.readByte() & 255);
            }
            bVar.mo36060a(i2, this.f31649c.readInt() & Integer.MAX_VALUE, m45191a(m45189a(i - 4, b, s), s, b, i2));
            return;
        }
        C14184e.m45121b("PROTOCOL_ERROR: TYPE_PUSH_PROMISE streamId == 0", new Object[0]);
        throw null;
    }

    /* renamed from: g */
    private void m45199g(C14203b bVar, int i, byte b, int i2) throws IOException {
        if (i != 4) {
            C14184e.m45121b("TYPE_RST_STREAM length: %d != 4", Integer.valueOf(i));
            throw null;
        } else if (i2 != 0) {
            int readInt = this.f31649c.readInt();
            C14179b a = C14179b.m45090a(readInt);
            if (a != null) {
                bVar.mo36062a(i2, a);
                return;
            }
            C14184e.m45121b("TYPE_RST_STREAM unexpected error code: %d", Integer.valueOf(readInt));
            throw null;
        } else {
            C14184e.m45121b("TYPE_RST_STREAM streamId == 0", new Object[0]);
            throw null;
        }
    }

    /* renamed from: h */
    private void m45200h(C14203b bVar, int i, byte b, int i2) throws IOException {
        if (i2 != 0) {
            C14184e.m45121b("TYPE_SETTINGS streamId != 0", new Object[0]);
            throw null;
        } else if ((b & 1) != 0) {
            if (i == 0) {
                bVar.mo36058a();
                return;
            }
            C14184e.m45121b("FRAME_SIZE_ERROR ack frame should be empty!", new Object[0]);
            throw null;
        } else if (i % 6 == 0) {
            C14213m mVar = new C14213m();
            for (int i3 = 0; i3 < i; i3 += 6) {
                short readShort = this.f31649c.readShort() & 65535;
                int readInt = this.f31649c.readInt();
                switch (readShort) {
                    case 2:
                        if (!(readInt == 0 || readInt == 1)) {
                            C14184e.m45121b("PROTOCOL_ERROR SETTINGS_ENABLE_PUSH != 0 or 1", new Object[0]);
                            throw null;
                        }
                    case 3:
                        readShort = 4;
                        break;
                    case 4:
                        readShort = 7;
                        if (readInt >= 0) {
                            break;
                        } else {
                            C14184e.m45121b("PROTOCOL_ERROR SETTINGS_INITIAL_WINDOW_SIZE > 2^31 - 1", new Object[0]);
                            throw null;
                        }
                    case 5:
                        if (readInt >= 16384 && readInt <= 16777215) {
                            break;
                        } else {
                            C14184e.m45121b("PROTOCOL_ERROR SETTINGS_MAX_FRAME_SIZE: %s", Integer.valueOf(readInt));
                            throw null;
                        }
                        break;
                }
                mVar.mo36114a(readShort, readInt);
            }
            bVar.mo36067a(false, mVar);
        } else {
            C14184e.m45121b("TYPE_SETTINGS length %% 6 != 0: %s", Integer.valueOf(i));
            throw null;
        }
    }

    /* renamed from: i */
    private void m45201i(C14203b bVar, int i, byte b, int i2) throws IOException {
        if (i == 4) {
            long readInt = ((long) this.f31649c.readInt()) & 2147483647L;
            if (readInt != 0) {
                bVar.mo36061a(i2, readInt);
                return;
            }
            C14184e.m45121b("windowSizeIncrement was 0", Long.valueOf(readInt));
            throw null;
        }
        C14184e.m45121b("TYPE_WINDOW_UPDATE length !=4: %s", Integer.valueOf(i));
        throw null;
    }

    /* renamed from: a */
    public void mo36068a(C14203b bVar) throws IOException {
        if (!this.f31647V) {
            ByteString c = this.f31649c.mo36319c((long) C14184e.f31571a.size());
            if (f31645X.isLoggable(Level.FINE)) {
                f31645X.fine(C14126e.m44817a("<< CONNECTION %s", c.mo36386f()));
            }
            if (!C14184e.f31571a.equals(c)) {
                C14184e.m45121b("Expected a connection header but was %s", c.mo36394m());
                throw null;
            }
        } else if (!mo36069a(true, bVar)) {
            C14184e.m45121b("Required SETTINGS preface not received", new Object[0]);
            throw null;
        }
    }

    public void close() throws IOException {
        this.f31649c.close();
    }

    /* renamed from: a */
    public boolean mo36069a(boolean z, C14203b bVar) throws IOException {
        try {
            this.f31649c.mo36330f(9);
            int a = m45190a(this.f31649c);
            if (a < 0 || a > 16384) {
                C14184e.m45121b("FRAME_SIZE_ERROR: %s", Integer.valueOf(a));
                throw null;
            }
            byte readByte = (byte) (this.f31649c.readByte() & 255);
            if (!z || readByte == 4) {
                byte readByte2 = (byte) (this.f31649c.readByte() & 255);
                int readInt = this.f31649c.readInt() & Integer.MAX_VALUE;
                if (f31645X.isLoggable(Level.FINE)) {
                    f31645X.fine(C14184e.m45120a(true, readInt, a, readByte, readByte2));
                }
                switch (readByte) {
                    case 0:
                        m45193a(bVar, a, readByte2, readInt);
                        break;
                    case 1:
                        m45195c(bVar, a, readByte2, readInt);
                        break;
                    case 2:
                        m45197e(bVar, a, readByte2, readInt);
                        break;
                    case 3:
                        m45199g(bVar, a, readByte2, readInt);
                        break;
                    case 4:
                        m45200h(bVar, a, readByte2, readInt);
                        break;
                    case 5:
                        m45198f(bVar, a, readByte2, readInt);
                        break;
                    case 6:
                        m45196d(bVar, a, readByte2, readInt);
                        break;
                    case 7:
                        m45194b(bVar, a, readByte2, readInt);
                        break;
                    case 8:
                        m45201i(bVar, a, readByte2, readInt);
                        break;
                    default:
                        this.f31649c.skip((long) a);
                        break;
                }
                return true;
            }
            C14184e.m45121b("Expected a SETTINGS frame but was %s", Byte.valueOf(readByte));
            throw null;
        } catch (EOFException unused) {
            return false;
        }
    }

    /* renamed from: a */
    private List<C14180c> m45191a(int i, short s, byte b, int i2) throws IOException {
        C14202a aVar = this.f31646U;
        aVar.f31653X = i;
        aVar.f31650U = i;
        aVar.f31654Y = s;
        aVar.f31651V = b;
        aVar.f31652W = i2;
        this.f31648W.mo36026c();
        return this.f31648W.mo36024a();
    }

    /* renamed from: a */
    private void m45193a(C14203b bVar, int i, byte b, int i2) throws IOException {
        short s = 0;
        if (i2 != 0) {
            boolean z = true;
            boolean z2 = (b & 1) != 0;
            if ((b & 32) == 0) {
                z = false;
            }
            if (!z) {
                if ((b & 8) != 0) {
                    s = (short) (this.f31649c.readByte() & 255);
                }
                bVar.mo36066a(z2, i2, this.f31649c, m45189a(i, b, s));
                this.f31649c.skip((long) s);
                return;
            }
            C14184e.m45121b("PROTOCOL_ERROR: FLAG_COMPRESSED without SETTINGS_COMPRESS_DATA", new Object[0]);
            throw null;
        }
        C14184e.m45121b("PROTOCOL_ERROR: TYPE_DATA streamId == 0", new Object[0]);
        throw null;
    }

    /* renamed from: a */
    private void m45192a(C14203b bVar, int i) throws IOException {
        int readInt = this.f31649c.readInt();
        bVar.mo36059a(i, readInt & Integer.MAX_VALUE, (this.f31649c.readByte() & 255) + 1, (Integer.MIN_VALUE & readInt) != 0);
    }

    /* renamed from: a */
    static int m45190a(BufferedSource bufferedSource) throws IOException {
        return (bufferedSource.readByte() & 255) | ((bufferedSource.readByte() & 255) << 16) | ((bufferedSource.readByte() & 255) << 8);
    }

    /* renamed from: a */
    static int m45189a(int i, byte b, short s) throws IOException {
        if ((b & 8) != 0) {
            i--;
        }
        if (s <= i) {
            return (short) (i - s);
        }
        C14184e.m45121b("PROTOCOL_ERROR padding %s > remaining length %s", Short.valueOf(s), Integer.valueOf(i));
        throw null;
    }
}
