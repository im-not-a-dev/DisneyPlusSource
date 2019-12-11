package p163g.p449j.p450a.p451a.p457d.p464g;

import java.io.IOException;
import java.nio.BufferOverflowException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.logging.Level;
import java.util.logging.Logger;

/* renamed from: g.j.a.a.d.g.l3 */
public abstract class C11197l3 extends C11299s2 {

    /* renamed from: b */
    private static final Logger f26331b = Logger.getLogger(C11197l3.class.getName());
    /* access modifiers changed from: private */

    /* renamed from: c */
    public static final boolean f26332c = C11058c7.m34858a();

    /* renamed from: a */
    C11243o3 f26333a = this;

    /* renamed from: g.j.a.a.d.g.l3$a */
    static class C11198a extends C11197l3 {

        /* renamed from: d */
        private final byte[] f26334d;

        /* renamed from: e */
        private final int f26335e;

        /* renamed from: f */
        private final int f26336f;

        /* renamed from: g */
        private int f26337g;

        C11198a(byte[] bArr, int i, int i2) {
            super();
            if (bArr != null) {
                int i3 = i + i2;
                if ((i | i2 | (bArr.length - i3)) >= 0) {
                    this.f26334d = bArr;
                    this.f26335e = i;
                    this.f26337g = i;
                    this.f26336f = i3;
                    return;
                }
                throw new IllegalArgumentException(String.format("Array range is invalid. Buffer.length=%d, offset=%d, length=%d", new Object[]{Integer.valueOf(bArr.length), Integer.valueOf(i), Integer.valueOf(i2)}));
            }
            throw new NullPointerException("buffer");
        }

        /* renamed from: a */
        public void mo28657a() {
        }

        /* renamed from: a */
        public final void mo28664a(int i, int i2) throws IOException {
            mo28675b((i << 3) | i2);
        }

        /* renamed from: b */
        public final void mo28676b(int i, int i2) throws IOException {
            mo28664a(i, 0);
            mo28661a(i2);
        }

        /* renamed from: c */
        public final void mo28684c(int i, int i2) throws IOException {
            mo28664a(i, 0);
            mo28675b(i2);
        }

        /* renamed from: d */
        public final void mo28687d(int i) throws IOException {
            try {
                byte[] bArr = this.f26334d;
                int i2 = this.f26337g;
                this.f26337g = i2 + 1;
                bArr[i2] = (byte) i;
                byte[] bArr2 = this.f26334d;
                int i3 = this.f26337g;
                this.f26337g = i3 + 1;
                bArr2[i3] = (byte) (i >> 8);
                byte[] bArr3 = this.f26334d;
                int i4 = this.f26337g;
                this.f26337g = i4 + 1;
                bArr3[i4] = (byte) (i >> 16);
                byte[] bArr4 = this.f26334d;
                int i5 = this.f26337g;
                this.f26337g = i5 + 1;
                bArr4[i5] = (byte) (i >>> 24);
            } catch (IndexOutOfBoundsException e) {
                throw new C11199b(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.f26337g), Integer.valueOf(this.f26336f), Integer.valueOf(1)}), e);
            }
        }

        /* renamed from: e */
        public final void mo28689e(int i, int i2) throws IOException {
            mo28664a(i, 5);
            mo28687d(i2);
        }

        /* renamed from: a */
        public final void mo28665a(int i, long j) throws IOException {
            mo28664a(i, 0);
            mo28671a(j);
        }

        /* renamed from: b */
        public final void mo28691b(C11342v2 v2Var) throws IOException {
            mo28675b(v2Var.size());
            v2Var.mo28512a((C11299s2) this);
        }

        /* renamed from: c */
        public final void mo28685c(int i, long j) throws IOException {
            mo28664a(i, 1);
            mo28686c(j);
        }

        /* renamed from: e */
        public final int mo28694e() {
            return this.f26337g - this.f26335e;
        }

        /* renamed from: a */
        public final void mo28670a(int i, boolean z) throws IOException {
            mo28664a(i, 0);
            mo28658a(z ? (byte) 1 : 0);
        }

        /* renamed from: b */
        public final void mo28678b(int i, C11259p5 p5Var) throws IOException {
            mo28664a(1, 3);
            mo28684c(2, i);
            mo28666a(3, p5Var);
            mo28664a(1, 4);
        }

        /* renamed from: c */
        public final void mo28693c(C11259p5 p5Var) throws IOException {
            mo28675b(p5Var.mo28427b());
            p5Var.mo28426a(this);
        }

        /* renamed from: a */
        public final void mo28669a(int i, String str) throws IOException {
            mo28664a(i, 2);
            mo28692b(str);
        }

        /* renamed from: c */
        public final void mo28686c(long j) throws IOException {
            try {
                byte[] bArr = this.f26334d;
                int i = this.f26337g;
                this.f26337g = i + 1;
                bArr[i] = (byte) ((int) j);
                byte[] bArr2 = this.f26334d;
                int i2 = this.f26337g;
                this.f26337g = i2 + 1;
                bArr2[i2] = (byte) ((int) (j >> 8));
                byte[] bArr3 = this.f26334d;
                int i3 = this.f26337g;
                this.f26337g = i3 + 1;
                bArr3[i3] = (byte) ((int) (j >> 16));
                byte[] bArr4 = this.f26334d;
                int i4 = this.f26337g;
                this.f26337g = i4 + 1;
                bArr4[i4] = (byte) ((int) (j >> 24));
                byte[] bArr5 = this.f26334d;
                int i5 = this.f26337g;
                this.f26337g = i5 + 1;
                bArr5[i5] = (byte) ((int) (j >> 32));
                byte[] bArr6 = this.f26334d;
                int i6 = this.f26337g;
                this.f26337g = i6 + 1;
                bArr6[i6] = (byte) ((int) (j >> 40));
                byte[] bArr7 = this.f26334d;
                int i7 = this.f26337g;
                this.f26337g = i7 + 1;
                bArr7[i7] = (byte) ((int) (j >> 48));
                byte[] bArr8 = this.f26334d;
                int i8 = this.f26337g;
                this.f26337g = i8 + 1;
                bArr8[i8] = (byte) ((int) (j >> 56));
            } catch (IndexOutOfBoundsException e) {
                throw new C11199b(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.f26337g), Integer.valueOf(this.f26336f), Integer.valueOf(1)}), e);
            }
        }

        /* renamed from: a */
        public final void mo28668a(int i, C11342v2 v2Var) throws IOException {
            mo28664a(i, 2);
            mo28691b(v2Var);
        }

        /* renamed from: b */
        public final void mo28679b(int i, C11342v2 v2Var) throws IOException {
            mo28664a(1, 3);
            mo28684c(2, i);
            mo28668a(3, v2Var);
            mo28664a(1, 4);
        }

        /* renamed from: a */
        public final void mo28666a(int i, C11259p5 p5Var) throws IOException {
            mo28664a(i, 2);
            mo28693c(p5Var);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final void mo28667a(int i, C11259p5 p5Var, C11077d6 d6Var) throws IOException {
            mo28664a(i, 2);
            C11196l2 l2Var = (C11196l2) p5Var;
            int g = l2Var.mo28431g();
            if (g == -1) {
                g = d6Var.mo28402b(l2Var);
                l2Var.mo28425a(g);
            }
            mo28675b(g);
            d6Var.mo28398a(p5Var, (C11333u7) this.f26333a);
        }

        /* renamed from: b */
        public final void mo28675b(int i) throws IOException {
            if (!C11197l3.f26332c || C11242o2.m35820a() || mo28674b() < 5) {
                while ((i & -128) != 0) {
                    byte[] bArr = this.f26334d;
                    int i2 = this.f26337g;
                    this.f26337g = i2 + 1;
                    bArr[i2] = (byte) ((i & 127) | 128);
                    i >>>= 7;
                }
                try {
                    byte[] bArr2 = this.f26334d;
                    int i3 = this.f26337g;
                    this.f26337g = i3 + 1;
                    bArr2[i3] = (byte) i;
                } catch (IndexOutOfBoundsException e) {
                    throw new C11199b(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.f26337g), Integer.valueOf(this.f26336f), Integer.valueOf(1)}), e);
                }
            } else if ((i & -128) == 0) {
                byte[] bArr3 = this.f26334d;
                int i4 = this.f26337g;
                this.f26337g = i4 + 1;
                C11058c7.m34856a(bArr3, (long) i4, (byte) i);
            } else {
                byte[] bArr4 = this.f26334d;
                int i5 = this.f26337g;
                this.f26337g = i5 + 1;
                C11058c7.m34856a(bArr4, (long) i5, (byte) (i | 128));
                int i6 = i >>> 7;
                if ((i6 & -128) == 0) {
                    byte[] bArr5 = this.f26334d;
                    int i7 = this.f26337g;
                    this.f26337g = i7 + 1;
                    C11058c7.m34856a(bArr5, (long) i7, (byte) i6);
                    return;
                }
                byte[] bArr6 = this.f26334d;
                int i8 = this.f26337g;
                this.f26337g = i8 + 1;
                C11058c7.m34856a(bArr6, (long) i8, (byte) (i6 | 128));
                int i9 = i6 >>> 7;
                if ((i9 & -128) == 0) {
                    byte[] bArr7 = this.f26334d;
                    int i10 = this.f26337g;
                    this.f26337g = i10 + 1;
                    C11058c7.m34856a(bArr7, (long) i10, (byte) i9);
                    return;
                }
                byte[] bArr8 = this.f26334d;
                int i11 = this.f26337g;
                this.f26337g = i11 + 1;
                C11058c7.m34856a(bArr8, (long) i11, (byte) (i9 | 128));
                int i12 = i9 >>> 7;
                if ((i12 & -128) == 0) {
                    byte[] bArr9 = this.f26334d;
                    int i13 = this.f26337g;
                    this.f26337g = i13 + 1;
                    C11058c7.m34856a(bArr9, (long) i13, (byte) i12);
                    return;
                }
                byte[] bArr10 = this.f26334d;
                int i14 = this.f26337g;
                this.f26337g = i14 + 1;
                C11058c7.m34856a(bArr10, (long) i14, (byte) (i12 | 128));
                int i15 = i12 >>> 7;
                byte[] bArr11 = this.f26334d;
                int i16 = this.f26337g;
                this.f26337g = i16 + 1;
                C11058c7.m34856a(bArr11, (long) i16, (byte) i15);
            }
        }

        /* renamed from: a */
        public final void mo28658a(byte b) throws IOException {
            try {
                byte[] bArr = this.f26334d;
                int i = this.f26337g;
                this.f26337g = i + 1;
                bArr[i] = b;
            } catch (IndexOutOfBoundsException e) {
                throw new C11199b(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.f26337g), Integer.valueOf(this.f26336f), Integer.valueOf(1)}), e);
            }
        }

        /* renamed from: a */
        public final void mo28661a(int i) throws IOException {
            if (i >= 0) {
                mo28675b(i);
            } else {
                mo28671a((long) i);
            }
        }

        /* renamed from: a */
        public final void mo28671a(long j) throws IOException {
            if (!C11197l3.f26332c || mo28674b() < 10) {
                while ((j & -128) != 0) {
                    byte[] bArr = this.f26334d;
                    int i = this.f26337g;
                    this.f26337g = i + 1;
                    bArr[i] = (byte) ((((int) j) & 127) | 128);
                    j >>>= 7;
                }
                try {
                    byte[] bArr2 = this.f26334d;
                    int i2 = this.f26337g;
                    this.f26337g = i2 + 1;
                    bArr2[i2] = (byte) ((int) j);
                } catch (IndexOutOfBoundsException e) {
                    throw new C11199b(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.f26337g), Integer.valueOf(this.f26336f), Integer.valueOf(1)}), e);
                }
            } else {
                while ((j & -128) != 0) {
                    byte[] bArr3 = this.f26334d;
                    int i3 = this.f26337g;
                    this.f26337g = i3 + 1;
                    C11058c7.m34856a(bArr3, (long) i3, (byte) ((((int) j) & 127) | 128));
                    j >>>= 7;
                }
                byte[] bArr4 = this.f26334d;
                int i4 = this.f26337g;
                this.f26337g = i4 + 1;
                C11058c7.m34856a(bArr4, (long) i4, (byte) ((int) j));
            }
        }

        /* renamed from: b */
        public final void mo28681b(byte[] bArr, int i, int i2) throws IOException {
            try {
                System.arraycopy(bArr, i, this.f26334d, this.f26337g, i2);
                this.f26337g += i2;
            } catch (IndexOutOfBoundsException e) {
                throw new C11199b(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.f26337g), Integer.valueOf(this.f26336f), Integer.valueOf(i2)}), e);
            }
        }

        /* renamed from: a */
        public final void mo28690a(byte[] bArr, int i, int i2) throws IOException {
            mo28681b(bArr, i, i2);
        }

        /* renamed from: b */
        public final void mo28692b(String str) throws IOException {
            int i = this.f26337g;
            try {
                int g = C11197l3.m35574g(str.length() * 3);
                int g2 = C11197l3.m35574g(str.length());
                if (g2 == g) {
                    this.f26337g = i + g2;
                    int a = C11114f7.m35219a(str, this.f26334d, this.f26337g, mo28674b());
                    this.f26337g = i;
                    mo28675b((a - i) - g2);
                    this.f26337g = a;
                    return;
                }
                mo28675b(C11114f7.m35218a((CharSequence) str));
                this.f26337g = C11114f7.m35219a(str, this.f26334d, this.f26337g, mo28674b());
            } catch (C11170j7 e) {
                this.f26337g = i;
                mo28672a(str, e);
            } catch (IndexOutOfBoundsException e2) {
                throw new C11199b((Throwable) e2);
            }
        }

        /* renamed from: b */
        public final int mo28674b() {
            return this.f26336f - this.f26337g;
        }
    }

    /* renamed from: g.j.a.a.d.g.l3$b */
    public static class C11199b extends IOException {
        C11199b(String str) {
            String valueOf = String.valueOf(str);
            String str2 = "CodedOutputStream was writing to a flat byte array and ran out of space.: ";
            super(valueOf.length() != 0 ? str2.concat(valueOf) : new String(str2));
        }

        C11199b(Throwable th) {
            super("CodedOutputStream was writing to a flat byte array and ran out of space.", th);
        }

        C11199b(String str, Throwable th) {
            String valueOf = String.valueOf(str);
            String str2 = "CodedOutputStream was writing to a flat byte array and ran out of space.: ";
            super(valueOf.length() != 0 ? str2.concat(valueOf) : new String(str2), th);
        }
    }

    /* renamed from: g.j.a.a.d.g.l3$c */
    static final class C11200c extends C11198a {

        /* renamed from: h */
        private final ByteBuffer f26338h;

        /* renamed from: i */
        private int f26339i;

        C11200c(ByteBuffer byteBuffer) {
            super(byteBuffer.array(), byteBuffer.arrayOffset() + byteBuffer.position(), byteBuffer.remaining());
            this.f26338h = byteBuffer;
            this.f26339i = byteBuffer.position();
        }

        /* renamed from: a */
        public final void mo28657a() {
            this.f26338h.position(this.f26339i + mo28694e());
        }
    }

    /* renamed from: g.j.a.a.d.g.l3$d */
    static final class C11201d extends C11197l3 {

        /* renamed from: d */
        private final ByteBuffer f26340d;

        /* renamed from: e */
        private final ByteBuffer f26341e;

        /* renamed from: f */
        private final long f26342f;

        /* renamed from: g */
        private final long f26343g;

        /* renamed from: h */
        private final long f26344h;

        /* renamed from: i */
        private final long f26345i = (this.f26344h - 10);

        /* renamed from: j */
        private long f26346j = this.f26343g;

        C11201d(ByteBuffer byteBuffer) {
            super();
            this.f26340d = byteBuffer;
            this.f26341e = byteBuffer.duplicate().order(ByteOrder.LITTLE_ENDIAN);
            this.f26342f = C11058c7.m34845a(byteBuffer);
            this.f26343g = this.f26342f + ((long) byteBuffer.position());
            this.f26344h = this.f26342f + ((long) byteBuffer.limit());
        }

        /* renamed from: i */
        private final void m35652i(long j) {
            this.f26341e.position((int) (j - this.f26342f));
        }

        /* renamed from: a */
        public final void mo28664a(int i, int i2) throws IOException {
            mo28675b((i << 3) | i2);
        }

        /* renamed from: b */
        public final void mo28676b(int i, int i2) throws IOException {
            mo28664a(i, 0);
            mo28661a(i2);
        }

        /* renamed from: c */
        public final void mo28684c(int i, int i2) throws IOException {
            mo28664a(i, 0);
            mo28675b(i2);
        }

        /* renamed from: d */
        public final void mo28687d(int i) throws IOException {
            this.f26341e.putInt((int) (this.f26346j - this.f26342f), i);
            this.f26346j += 4;
        }

        /* renamed from: e */
        public final void mo28689e(int i, int i2) throws IOException {
            mo28664a(i, 5);
            mo28687d(i2);
        }

        /* renamed from: a */
        public final void mo28665a(int i, long j) throws IOException {
            mo28664a(i, 0);
            mo28671a(j);
        }

        /* renamed from: b */
        public final void mo28678b(int i, C11259p5 p5Var) throws IOException {
            mo28664a(1, 3);
            mo28684c(2, i);
            mo28666a(3, p5Var);
            mo28664a(1, 4);
        }

        /* renamed from: c */
        public final void mo28685c(int i, long j) throws IOException {
            mo28664a(i, 1);
            mo28686c(j);
        }

        /* renamed from: a */
        public final void mo28670a(int i, boolean z) throws IOException {
            mo28664a(i, 0);
            mo28658a(z ? (byte) 1 : 0);
        }

        /* renamed from: c */
        public final void mo28698c(C11259p5 p5Var) throws IOException {
            mo28675b(p5Var.mo28427b());
            p5Var.mo28426a(this);
        }

        /* renamed from: a */
        public final void mo28669a(int i, String str) throws IOException {
            mo28664a(i, 2);
            mo28697b(str);
        }

        /* renamed from: b */
        public final void mo28679b(int i, C11342v2 v2Var) throws IOException {
            mo28664a(1, 3);
            mo28684c(2, i);
            mo28668a(3, v2Var);
            mo28664a(1, 4);
        }

        /* renamed from: c */
        public final void mo28686c(long j) throws IOException {
            this.f26341e.putLong((int) (this.f26346j - this.f26342f), j);
            this.f26346j += 8;
        }

        /* renamed from: a */
        public final void mo28668a(int i, C11342v2 v2Var) throws IOException {
            mo28664a(i, 2);
            mo28696b(v2Var);
        }

        /* renamed from: a */
        public final void mo28666a(int i, C11259p5 p5Var) throws IOException {
            mo28664a(i, 2);
            mo28698c(p5Var);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public final void mo28695b(C11259p5 p5Var, C11077d6 d6Var) throws IOException {
            C11196l2 l2Var = (C11196l2) p5Var;
            int g = l2Var.mo28431g();
            if (g == -1) {
                g = d6Var.mo28402b(l2Var);
                l2Var.mo28425a(g);
            }
            mo28675b(g);
            d6Var.mo28398a(p5Var, (C11333u7) this.f26333a);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final void mo28667a(int i, C11259p5 p5Var, C11077d6 d6Var) throws IOException {
            mo28664a(i, 2);
            mo28695b(p5Var, d6Var);
        }

        /* renamed from: a */
        public final void mo28658a(byte b) throws IOException {
            long j = this.f26346j;
            if (j < this.f26344h) {
                this.f26346j = 1 + j;
                C11058c7.m34848a(j, b);
                return;
            }
            throw new C11199b(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Long.valueOf(j), Long.valueOf(this.f26344h), Integer.valueOf(1)}));
        }

        /* renamed from: b */
        public final void mo28696b(C11342v2 v2Var) throws IOException {
            mo28675b(v2Var.size());
            v2Var.mo28512a((C11299s2) this);
        }

        /* renamed from: a */
        public final void mo28661a(int i) throws IOException {
            if (i >= 0) {
                mo28675b(i);
            } else {
                mo28671a((long) i);
            }
        }

        /* renamed from: b */
        public final void mo28675b(int i) throws IOException {
            if (this.f26346j <= this.f26345i) {
                while ((i & -128) != 0) {
                    long j = this.f26346j;
                    this.f26346j = j + 1;
                    C11058c7.m34848a(j, (byte) ((i & 127) | 128));
                    i >>>= 7;
                }
                long j2 = this.f26346j;
                this.f26346j = 1 + j2;
                C11058c7.m34848a(j2, (byte) i);
                return;
            }
            while (true) {
                long j3 = this.f26346j;
                if (j3 >= this.f26344h) {
                    throw new C11199b(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Long.valueOf(j3), Long.valueOf(this.f26344h), Integer.valueOf(1)}));
                } else if ((i & -128) == 0) {
                    this.f26346j = 1 + j3;
                    C11058c7.m34848a(j3, (byte) i);
                    return;
                } else {
                    this.f26346j = j3 + 1;
                    C11058c7.m34848a(j3, (byte) ((i & 127) | 128));
                    i >>>= 7;
                }
            }
        }

        /* renamed from: a */
        public final void mo28671a(long j) throws IOException {
            if (this.f26346j <= this.f26345i) {
                while ((j & -128) != 0) {
                    long j2 = this.f26346j;
                    this.f26346j = j2 + 1;
                    C11058c7.m34848a(j2, (byte) ((((int) j) & 127) | 128));
                    j >>>= 7;
                }
                long j3 = this.f26346j;
                this.f26346j = 1 + j3;
                C11058c7.m34848a(j3, (byte) ((int) j));
                return;
            }
            while (true) {
                long j4 = this.f26346j;
                if (j4 >= this.f26344h) {
                    throw new C11199b(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Long.valueOf(j4), Long.valueOf(this.f26344h), Integer.valueOf(1)}));
                } else if ((j & -128) == 0) {
                    this.f26346j = 1 + j4;
                    C11058c7.m34848a(j4, (byte) ((int) j));
                    return;
                } else {
                    this.f26346j = j4 + 1;
                    C11058c7.m34848a(j4, (byte) ((((int) j) & 127) | 128));
                    j >>>= 7;
                }
            }
        }

        /* renamed from: b */
        public final void mo28681b(byte[] bArr, int i, int i2) throws IOException {
            if (bArr != null && i >= 0 && i2 >= 0 && bArr.length - i2 >= i) {
                long j = (long) i2;
                long j2 = this.f26344h - j;
                long j3 = this.f26346j;
                if (j2 >= j3) {
                    C11058c7.m34857a(bArr, (long) i, j3, j);
                    this.f26346j += j;
                    return;
                }
            }
            if (bArr == null) {
                throw new NullPointerException("value");
            }
            throw new C11199b(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Long.valueOf(this.f26346j), Long.valueOf(this.f26344h), Integer.valueOf(i2)}));
        }

        /* renamed from: a */
        public final void mo28690a(byte[] bArr, int i, int i2) throws IOException {
            mo28681b(bArr, i, i2);
        }

        /* renamed from: a */
        public final void mo28657a() {
            this.f26340d.position((int) (this.f26346j - this.f26342f));
        }

        /* renamed from: b */
        public final void mo28697b(String str) throws IOException {
            long j = this.f26346j;
            try {
                int g = C11197l3.m35574g(str.length() * 3);
                int g2 = C11197l3.m35574g(str.length());
                if (g2 == g) {
                    int i = ((int) (this.f26346j - this.f26342f)) + g2;
                    this.f26341e.position(i);
                    C11114f7.m35220a((CharSequence) str, this.f26341e);
                    int position = this.f26341e.position() - i;
                    mo28675b(position);
                    this.f26346j += (long) position;
                    return;
                }
                int a = C11114f7.m35218a((CharSequence) str);
                mo28675b(a);
                m35652i(this.f26346j);
                C11114f7.m35220a((CharSequence) str, this.f26341e);
                this.f26346j += (long) a;
            } catch (C11170j7 e) {
                this.f26346j = j;
                m35652i(this.f26346j);
                mo28672a(str, e);
            } catch (IllegalArgumentException e2) {
                throw new C11199b((Throwable) e2);
            } catch (IndexOutOfBoundsException e3) {
                throw new C11199b((Throwable) e3);
            }
        }

        /* renamed from: b */
        public final int mo28674b() {
            return (int) (this.f26344h - this.f26346j);
        }
    }

    /* renamed from: g.j.a.a.d.g.l3$e */
    static final class C11202e extends C11197l3 {

        /* renamed from: d */
        private final ByteBuffer f26347d;

        /* renamed from: e */
        private final ByteBuffer f26348e;

        C11202e(ByteBuffer byteBuffer) {
            super();
            this.f26347d = byteBuffer;
            this.f26348e = byteBuffer.duplicate().order(ByteOrder.LITTLE_ENDIAN);
            byteBuffer.position();
        }

        /* renamed from: a */
        public final void mo28664a(int i, int i2) throws IOException {
            mo28675b((i << 3) | i2);
        }

        /* renamed from: b */
        public final void mo28676b(int i, int i2) throws IOException {
            mo28664a(i, 0);
            mo28661a(i2);
        }

        /* renamed from: c */
        public final void mo28684c(int i, int i2) throws IOException {
            mo28664a(i, 0);
            mo28675b(i2);
        }

        /* renamed from: d */
        public final void mo28687d(int i) throws IOException {
            try {
                this.f26348e.putInt(i);
            } catch (BufferOverflowException e) {
                throw new C11199b((Throwable) e);
            }
        }

        /* renamed from: e */
        public final void mo28689e(int i, int i2) throws IOException {
            mo28664a(i, 5);
            mo28687d(i2);
        }

        /* renamed from: a */
        public final void mo28665a(int i, long j) throws IOException {
            mo28664a(i, 0);
            mo28671a(j);
        }

        /* renamed from: b */
        public final void mo28678b(int i, C11259p5 p5Var) throws IOException {
            mo28664a(1, 3);
            mo28684c(2, i);
            mo28666a(3, p5Var);
            mo28664a(1, 4);
        }

        /* renamed from: c */
        public final void mo28685c(int i, long j) throws IOException {
            mo28664a(i, 1);
            mo28686c(j);
        }

        /* renamed from: a */
        public final void mo28670a(int i, boolean z) throws IOException {
            mo28664a(i, 0);
            mo28658a(z ? (byte) 1 : 0);
        }

        /* renamed from: c */
        public final void mo28702c(C11259p5 p5Var) throws IOException {
            mo28675b(p5Var.mo28427b());
            p5Var.mo28426a(this);
        }

        /* renamed from: a */
        public final void mo28669a(int i, String str) throws IOException {
            mo28664a(i, 2);
            mo28701b(str);
        }

        /* renamed from: b */
        public final void mo28679b(int i, C11342v2 v2Var) throws IOException {
            mo28664a(1, 3);
            mo28684c(2, i);
            mo28668a(3, v2Var);
            mo28664a(1, 4);
        }

        /* renamed from: c */
        public final void mo28686c(long j) throws IOException {
            try {
                this.f26348e.putLong(j);
            } catch (BufferOverflowException e) {
                throw new C11199b((Throwable) e);
            }
        }

        /* renamed from: a */
        public final void mo28668a(int i, C11342v2 v2Var) throws IOException {
            mo28664a(i, 2);
            mo28700b(v2Var);
        }

        /* renamed from: c */
        private final void m35680c(String str) throws IOException {
            try {
                C11114f7.m35220a((CharSequence) str, this.f26348e);
            } catch (IndexOutOfBoundsException e) {
                throw new C11199b((Throwable) e);
            }
        }

        /* renamed from: a */
        public final void mo28666a(int i, C11259p5 p5Var) throws IOException {
            mo28664a(i, 2);
            mo28702c(p5Var);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public final void mo28699b(C11259p5 p5Var, C11077d6 d6Var) throws IOException {
            C11196l2 l2Var = (C11196l2) p5Var;
            int g = l2Var.mo28431g();
            if (g == -1) {
                g = d6Var.mo28402b(l2Var);
                l2Var.mo28425a(g);
            }
            mo28675b(g);
            d6Var.mo28398a(p5Var, (C11333u7) this.f26333a);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final void mo28667a(int i, C11259p5 p5Var, C11077d6 d6Var) throws IOException {
            mo28664a(i, 2);
            mo28699b(p5Var, d6Var);
        }

        /* renamed from: a */
        public final void mo28658a(byte b) throws IOException {
            try {
                this.f26348e.put(b);
            } catch (BufferOverflowException e) {
                throw new C11199b((Throwable) e);
            }
        }

        /* renamed from: a */
        public final void mo28661a(int i) throws IOException {
            if (i >= 0) {
                mo28675b(i);
            } else {
                mo28671a((long) i);
            }
        }

        /* renamed from: b */
        public final void mo28700b(C11342v2 v2Var) throws IOException {
            mo28675b(v2Var.size());
            v2Var.mo28512a((C11299s2) this);
        }

        /* renamed from: a */
        public final void mo28671a(long j) throws IOException {
            while ((-128 & j) != 0) {
                this.f26348e.put((byte) ((((int) j) & 127) | 128));
                j >>>= 7;
            }
            try {
                this.f26348e.put((byte) ((int) j));
            } catch (BufferOverflowException e) {
                throw new C11199b((Throwable) e);
            }
        }

        /* renamed from: b */
        public final void mo28675b(int i) throws IOException {
            while ((i & -128) != 0) {
                this.f26348e.put((byte) ((i & 127) | 128));
                i >>>= 7;
            }
            try {
                this.f26348e.put((byte) i);
            } catch (BufferOverflowException e) {
                throw new C11199b((Throwable) e);
            }
        }

        /* renamed from: a */
        public final void mo28690a(byte[] bArr, int i, int i2) throws IOException {
            mo28681b(bArr, i, i2);
        }

        /* renamed from: a */
        public final void mo28657a() {
            this.f26347d.position(this.f26348e.position());
        }

        /* renamed from: b */
        public final void mo28681b(byte[] bArr, int i, int i2) throws IOException {
            try {
                this.f26348e.put(bArr, i, i2);
            } catch (IndexOutOfBoundsException e) {
                throw new C11199b((Throwable) e);
            } catch (BufferOverflowException e2) {
                throw new C11199b((Throwable) e2);
            }
        }

        /* renamed from: b */
        public final void mo28701b(String str) throws IOException {
            int position = this.f26348e.position();
            try {
                int g = C11197l3.m35574g(str.length() * 3);
                int g2 = C11197l3.m35574g(str.length());
                if (g2 == g) {
                    int position2 = this.f26348e.position() + g2;
                    this.f26348e.position(position2);
                    m35680c(str);
                    int position3 = this.f26348e.position();
                    this.f26348e.position(position);
                    mo28675b(position3 - position2);
                    this.f26348e.position(position3);
                    return;
                }
                mo28675b(C11114f7.m35218a((CharSequence) str));
                m35680c(str);
            } catch (C11170j7 e) {
                this.f26348e.position(position);
                mo28672a(str, e);
            } catch (IllegalArgumentException e2) {
                throw new C11199b((Throwable) e2);
            }
        }

        /* renamed from: b */
        public final int mo28674b() {
            return this.f26348e.remaining();
        }
    }

    private C11197l3() {
    }

    /* renamed from: a */
    public static C11197l3 m35547a(byte[] bArr) {
        return new C11198a(bArr, 0, bArr.length);
    }

    /* renamed from: b */
    public static int m35548b(double d) {
        return 8;
    }

    /* renamed from: b */
    public static int m35549b(float f) {
        return 4;
    }

    /* renamed from: b */
    public static int m35557b(boolean z) {
        return 1;
    }

    /* renamed from: e */
    public static int m35568e(int i, long j) {
        return m35567e(i) + m35569e(j);
    }

    /* renamed from: e */
    public static int m35569e(long j) {
        int i;
        if ((-128 & j) == 0) {
            return 1;
        }
        if (j < 0) {
            return 10;
        }
        if ((-34359738368L & j) != 0) {
            i = 6;
            j >>>= 28;
        } else {
            i = 2;
        }
        if ((-2097152 & j) != 0) {
            i += 2;
            j >>>= 14;
        }
        if ((j & -16384) != 0) {
            i++;
        }
        return i;
    }

    /* renamed from: f */
    public static int m35571f(int i, int i2) {
        return m35567e(i) + m35570f(i2);
    }

    /* renamed from: g */
    public static int m35574g(int i) {
        if ((i & -128) == 0) {
            return 1;
        }
        if ((i & -16384) == 0) {
            return 2;
        }
        if ((-2097152 & i) == 0) {
            return 3;
        }
        return (i & -268435456) == 0 ? 4 : 5;
    }

    /* renamed from: g */
    public static int m35575g(int i, int i2) {
        return m35567e(i) + m35574g(i2);
    }

    /* renamed from: g */
    public static int m35577g(long j) {
        return 8;
    }

    /* renamed from: h */
    public static int m35579h(int i, int i2) {
        return m35567e(i) + m35574g(m35589l(i2));
    }

    /* renamed from: h */
    public static int m35581h(long j) {
        return 8;
    }

    /* renamed from: i */
    public static int m35582i(int i) {
        return 4;
    }

    /* renamed from: i */
    public static int m35583i(int i, int i2) {
        return m35567e(i) + 4;
    }

    /* renamed from: i */
    private static long m35584i(long j) {
        return (j >> 63) ^ (j << 1);
    }

    /* renamed from: j */
    public static int m35585j(int i) {
        return 4;
    }

    /* renamed from: j */
    public static int m35586j(int i, int i2) {
        return m35567e(i) + 4;
    }

    /* renamed from: k */
    public static int m35588k(int i, int i2) {
        return m35567e(i) + m35570f(i2);
    }

    /* renamed from: l */
    private static int m35589l(int i) {
        return (i >> 31) ^ (i << 1);
    }

    @Deprecated
    /* renamed from: m */
    public static int m35590m(int i) {
        return m35574g(i);
    }

    /* renamed from: a */
    public abstract void mo28657a() throws IOException;

    /* renamed from: a */
    public abstract void mo28658a(byte b) throws IOException;

    /* renamed from: a */
    public abstract void mo28661a(int i) throws IOException;

    /* renamed from: a */
    public abstract void mo28664a(int i, int i2) throws IOException;

    /* renamed from: a */
    public abstract void mo28665a(int i, long j) throws IOException;

    /* renamed from: a */
    public abstract void mo28666a(int i, C11259p5 p5Var) throws IOException;

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public abstract void mo28667a(int i, C11259p5 p5Var, C11077d6 d6Var) throws IOException;

    /* renamed from: a */
    public abstract void mo28668a(int i, C11342v2 v2Var) throws IOException;

    /* renamed from: a */
    public abstract void mo28669a(int i, String str) throws IOException;

    /* renamed from: a */
    public abstract void mo28670a(int i, boolean z) throws IOException;

    /* renamed from: a */
    public abstract void mo28671a(long j) throws IOException;

    /* renamed from: b */
    public abstract int mo28674b();

    /* renamed from: b */
    public abstract void mo28675b(int i) throws IOException;

    /* renamed from: b */
    public abstract void mo28676b(int i, int i2) throws IOException;

    /* renamed from: b */
    public final void mo28677b(int i, long j) throws IOException {
        mo28665a(i, m35584i(j));
    }

    /* renamed from: b */
    public abstract void mo28678b(int i, C11259p5 p5Var) throws IOException;

    /* renamed from: b */
    public abstract void mo28679b(int i, C11342v2 v2Var) throws IOException;

    /* renamed from: b */
    public abstract void mo28681b(byte[] bArr, int i, int i2) throws IOException;

    /* renamed from: c */
    public final void mo28683c(int i) throws IOException {
        mo28675b(m35589l(i));
    }

    /* renamed from: c */
    public abstract void mo28684c(int i, int i2) throws IOException;

    /* renamed from: c */
    public abstract void mo28685c(int i, long j) throws IOException;

    /* renamed from: c */
    public abstract void mo28686c(long j) throws IOException;

    /* renamed from: d */
    public abstract void mo28687d(int i) throws IOException;

    /* renamed from: d */
    public final void mo28688d(int i, int i2) throws IOException {
        mo28684c(i, m35589l(i2));
    }

    /* renamed from: e */
    public abstract void mo28689e(int i, int i2) throws IOException;

    /* renamed from: c */
    public static int m35561c(int i, C11342v2 v2Var) {
        int e = m35567e(i);
        int size = v2Var.size();
        return e + m35574g(size) + size;
    }

    /* renamed from: d */
    public static int m35562d(int i, long j) {
        return m35567e(i) + m35569e(j);
    }

    /* renamed from: e */
    public static int m35567e(int i) {
        return m35574g(i << 3);
    }

    /* renamed from: f */
    public static int m35572f(int i, long j) {
        return m35567e(i) + m35569e(m35584i(j));
    }

    /* renamed from: g */
    public static int m35576g(int i, long j) {
        return m35567e(i) + 8;
    }

    /* renamed from: b */
    public final void mo28680b(long j) throws IOException {
        mo28671a(m35584i(j));
    }

    /* renamed from: a */
    public static C11197l3 m35546a(ByteBuffer byteBuffer) {
        if (byteBuffer.hasArray()) {
            return new C11200c(byteBuffer);
        }
        if (!byteBuffer.isDirect() || byteBuffer.isReadOnly()) {
            throw new IllegalArgumentException("ByteBuffer is read-only");
        } else if (C11058c7.m34863b()) {
            return new C11201d(byteBuffer);
        } else {
            return new C11202e(byteBuffer);
        }
    }

    /* renamed from: b */
    public static int m35551b(int i, float f) {
        return m35567e(i) + 4;
    }

    /* renamed from: h */
    public static int m35580h(int i, long j) {
        return m35567e(i) + 8;
    }

    /* renamed from: k */
    public static int m35587k(int i) {
        return m35570f(i);
    }

    /* renamed from: b */
    public static int m35550b(int i, double d) {
        return m35567e(i) + 8;
    }

    /* renamed from: d */
    public static int m35563d(int i, C11259p5 p5Var) {
        return (m35567e(1) << 1) + m35575g(2, i) + m35559c(3, p5Var);
    }

    /* renamed from: f */
    public static int m35570f(int i) {
        if (i >= 0) {
            return m35574g(i);
        }
        return 10;
    }

    /* renamed from: h */
    public static int m35578h(int i) {
        return m35574g(m35589l(i));
    }

    /* renamed from: b */
    public static int m35555b(int i, boolean z) {
        return m35567e(i) + 1;
    }

    /* renamed from: c */
    public static int m35559c(int i, C11259p5 p5Var) {
        return m35567e(i) + m35541a(p5Var);
    }

    /* renamed from: f */
    public static int m35573f(long j) {
        return m35569e(m35584i(j));
    }

    /* renamed from: b */
    public static int m35554b(int i, String str) {
        return m35567e(i) + m35545a(str);
    }

    /* renamed from: c */
    public final void mo28682c() {
        if (mo28674b() != 0) {
            throw new IllegalStateException("Did not write as much data as expected.");
        }
    }

    /* renamed from: b */
    static int m35552b(int i, C11259p5 p5Var, C11077d6 d6Var) {
        return m35567e(i) + m35542a(p5Var, d6Var);
    }

    /* renamed from: d */
    public static int m35564d(int i, C11342v2 v2Var) {
        return (m35567e(1) << 1) + m35575g(2, i) + m35561c(3, v2Var);
    }

    /* renamed from: b */
    public static int m35553b(int i, C11330u4 u4Var) {
        return (m35567e(1) << 1) + m35575g(2, i) + m35540a(3, u4Var);
    }

    @Deprecated
    /* renamed from: c */
    static int m35560c(int i, C11259p5 p5Var, C11077d6 d6Var) {
        int e = m35567e(i) << 1;
        C11196l2 l2Var = (C11196l2) p5Var;
        int g = l2Var.mo28431g();
        if (g == -1) {
            g = d6Var.mo28402b(l2Var);
            l2Var.mo28425a(g);
        }
        return e + g;
    }

    /* renamed from: d */
    public static int m35565d(long j) {
        return m35569e(j);
    }

    /* renamed from: a */
    public final void mo28663a(int i, float f) throws IOException {
        mo28689e(i, Float.floatToRawIntBits(f));
    }

    /* renamed from: b */
    public static int m35558b(byte[] bArr) {
        int length = bArr.length;
        return m35574g(length) + length;
    }

    /* renamed from: a */
    public final void mo28662a(int i, double d) throws IOException {
        mo28685c(i, Double.doubleToRawLongBits(d));
    }

    /* renamed from: a */
    public final void mo28660a(float f) throws IOException {
        mo28687d(Float.floatToRawIntBits(f));
    }

    @Deprecated
    /* renamed from: b */
    public static int m35556b(C11259p5 p5Var) {
        return p5Var.mo28427b();
    }

    /* renamed from: a */
    public final void mo28659a(double d) throws IOException {
        mo28686c(Double.doubleToRawLongBits(d));
    }

    /* renamed from: a */
    public final void mo28673a(boolean z) throws IOException {
        mo28658a(z ? (byte) 1 : 0);
    }

    /* renamed from: a */
    public static int m35540a(int i, C11330u4 u4Var) {
        int e = m35567e(i);
        int b = u4Var.mo29048b();
        return e + m35574g(b) + b;
    }

    /* renamed from: a */
    public static int m35545a(String str) {
        int i;
        try {
            i = C11114f7.m35218a((CharSequence) str);
        } catch (C11170j7 unused) {
            i = str.getBytes(C11111f4.f26198a).length;
        }
        return m35574g(i) + i;
    }

    /* renamed from: a */
    public static int m35543a(C11330u4 u4Var) {
        int b = u4Var.mo29048b();
        return m35574g(b) + b;
    }

    /* renamed from: a */
    public static int m35544a(C11342v2 v2Var) {
        int size = v2Var.size();
        return m35574g(size) + size;
    }

    /* renamed from: a */
    public static int m35541a(C11259p5 p5Var) {
        int b = p5Var.mo28427b();
        return m35574g(b) + b;
    }

    /* renamed from: a */
    static int m35542a(C11259p5 p5Var, C11077d6 d6Var) {
        C11196l2 l2Var = (C11196l2) p5Var;
        int g = l2Var.mo28431g();
        if (g == -1) {
            g = d6Var.mo28402b(l2Var);
            l2Var.mo28425a(g);
        }
        return m35574g(g) + g;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo28672a(String str, C11170j7 j7Var) throws IOException {
        f26331b.logp(Level.WARNING, "com.google.protobuf.CodedOutputStream", "inefficientWriteStringNoTag", "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", j7Var);
        byte[] bytes = str.getBytes(C11111f4.f26198a);
        try {
            mo28675b(bytes.length);
            mo28690a(bytes, 0, bytes.length);
        } catch (IndexOutOfBoundsException e) {
            throw new C11199b((Throwable) e);
        } catch (C11199b e2) {
            throw e2;
        }
    }
}
