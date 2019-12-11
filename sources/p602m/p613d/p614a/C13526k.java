package p602m.p613d.p614a;

import java.io.ByteArrayInputStream;
import java.io.EOFException;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import p602m.p613d.p683g.p685l.C14099a;

/* renamed from: m.d.a.k */
/* compiled from: ASN1InputStream */
public class C13526k extends FilterInputStream implements C13628o0 {

    /* renamed from: U */
    private final boolean f30121U;

    /* renamed from: V */
    private final byte[][] f30122V;

    /* renamed from: c */
    private final int f30123c;

    public C13526k(InputStream inputStream) {
        this(inputStream, C13485b2.m41538a(inputStream));
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public C13643t mo34808a(int i, int i2, int i3) throws IOException {
        boolean z = (i & 32) != 0;
        C13648u1 u1Var = new C13648u1(this, i3);
        if ((i & 64) != 0) {
            return new C13634q0(z, i2, u1Var.mo34877b());
        }
        if ((i & 128) != 0) {
            return new C13658y(u1Var).mo34896a(z, i2);
        }
        if (!z) {
            return m41651a(i2, u1Var, this.f30122V);
        }
        if (i2 == 4) {
            C13508g a = mo34807a(u1Var);
            C13630p[] pVarArr = new C13630p[a.mo34794a()];
            for (int i4 = 0; i4 != pVarArr.length; i4++) {
                pVarArr[i4] = (C13630p) a.mo34795a(i4);
            }
            return new C13509g0(pVarArr);
        } else if (i2 == 8) {
            return new C13644t0(mo34807a(u1Var));
        } else {
            if (i2 != 16) {
                if (i2 == 17) {
                    return C13650v0.m41929b(mo34807a(u1Var));
                }
                StringBuilder sb = new StringBuilder();
                sb.append("unknown tag ");
                sb.append(i2);
                sb.append(" encountered");
                throw new IOException(sb.toString());
            } else if (this.f30121U) {
                return new C13660y1(u1Var.mo34877b());
            } else {
                return C13650v0.m41928a(mo34807a(u1Var));
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public int mo34809b() {
        return this.f30123c;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public int mo34810c() throws IOException {
        return m41650a((InputStream) this, this.f30123c);
    }

    /* renamed from: d */
    public C13643t mo34811d() throws IOException {
        int read = read();
        if (read > 0) {
            int b = m41653b(this, read);
            boolean z = (read & 32) != 0;
            int c = mo34810c();
            if (c >= 0) {
                try {
                    return mo34808a(read, b, c);
                } catch (IllegalArgumentException e) {
                    throw new C13518i("corrupted stream detected", e);
                }
            } else if (z) {
                C13658y yVar = new C13658y(new C13654w1(this, this.f30123c), this.f30123c);
                if ((read & 64) != 0) {
                    return new C13497e0(b, yVar).mo34768b();
                }
                if ((read & 128) != 0) {
                    return new C13590n0(true, b, yVar).mo34768b();
                }
                if (b == 4) {
                    return new C13515h0(yVar).mo34768b();
                }
                if (b == 8) {
                    return new C13647u0(yVar).mo34768b();
                }
                if (b == 16) {
                    return new C13523j0(yVar).mo34768b();
                }
                if (b == 17) {
                    return new C13566l0(yVar).mo34768b();
                }
                throw new IOException("unknown BER object encountered");
            } else {
                throw new IOException("indefinite-length primitive encoding encountered");
            }
        } else if (read != 0) {
            return null;
        } else {
            throw new IOException("unexpected end-of-contents marker");
        }
    }

    public C13526k(byte[] bArr) {
        this((InputStream) new ByteArrayInputStream(bArr), bArr.length);
    }

    /* renamed from: b */
    static int m41653b(InputStream inputStream, int i) throws IOException {
        int i2 = i & 31;
        if (i2 != 31) {
            return i2;
        }
        int i3 = 0;
        int read = inputStream.read();
        if ((read & 127) != 0) {
            while (read >= 0 && (read & 128) != 0) {
                i3 = (i3 | (read & 127)) << 7;
                read = inputStream.read();
            }
            if (read >= 0) {
                return i3 | (read & 127);
            }
            throw new EOFException("EOF found inside tag value.");
        }
        throw new IOException("corrupted stream - invalid high tag number found");
    }

    public C13526k(byte[] bArr, boolean z) {
        this(new ByteArrayInputStream(bArr), bArr.length, z);
    }

    public C13526k(InputStream inputStream, int i) {
        this(inputStream, i, false);
    }

    public C13526k(InputStream inputStream, int i, boolean z) {
        super(inputStream);
        this.f30123c = i;
        this.f30121U = z;
        this.f30122V = new byte[11][];
    }

    /* renamed from: b */
    private static char[] m41654b(C13648u1 u1Var) throws IOException {
        int a = u1Var.mo34876a() / 2;
        char[] cArr = new char[a];
        int i = 0;
        while (i < a) {
            int read = u1Var.read();
            if (read < 0) {
                break;
            }
            int read2 = u1Var.read();
            if (read2 < 0) {
                break;
            }
            int i2 = i + 1;
            cArr[i] = (char) ((read << 8) | (read2 & 255));
            i = i2;
        }
        return cArr;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public C13508g mo34806a() throws IOException {
        C13508g gVar = new C13508g();
        while (true) {
            C13643t d = mo34811d();
            if (d == null) {
                return gVar;
            }
            gVar.mo34796a((C13501f) d);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public C13508g mo34807a(C13648u1 u1Var) throws IOException {
        return new C13526k((InputStream) u1Var).mo34806a();
    }

    /* renamed from: a */
    static int m41650a(InputStream inputStream, int i) throws IOException {
        int read = inputStream.read();
        if (read < 0) {
            throw new EOFException("EOF found when length expected");
        } else if (read == 128) {
            return -1;
        } else {
            if (read > 127) {
                int i2 = read & 127;
                if (i2 <= 4) {
                    int i3 = 0;
                    int i4 = 0;
                    while (i3 < i2) {
                        int read2 = inputStream.read();
                        if (read2 >= 0) {
                            i4 = (i4 << 8) + read2;
                            i3++;
                        } else {
                            throw new EOFException("EOF found reading length");
                        }
                    }
                    if (i4 < 0) {
                        throw new IOException("corrupted stream - negative length found");
                    } else if (i4 < i) {
                        read = i4;
                    } else {
                        throw new IOException("corrupted stream - out of bounds length found");
                    }
                } else {
                    StringBuilder sb = new StringBuilder();
                    sb.append("DER length more than 4 bytes: ");
                    sb.append(i2);
                    throw new IOException(sb.toString());
                }
            }
            return read;
        }
    }

    /* renamed from: a */
    private static byte[] m41652a(C13648u1 u1Var, byte[][] bArr) throws IOException {
        int a = u1Var.mo34876a();
        if (u1Var.mo34876a() >= bArr.length) {
            return u1Var.mo34877b();
        }
        byte[] bArr2 = bArr[a];
        if (bArr2 == null) {
            bArr2 = new byte[a];
            bArr[a] = bArr2;
        }
        C14099a.m44517a((InputStream) u1Var, bArr2);
        return bArr2;
    }

    /* renamed from: a */
    static C13643t m41651a(int i, C13648u1 u1Var, byte[][] bArr) throws IOException {
        if (i == 10) {
            return C13514h.m41620b(m41652a(u1Var, bArr));
        }
        if (i == 12) {
            return new C13567l1(u1Var.mo34877b());
        }
        if (i == 30) {
            return new C13638r0(m41654b(u1Var));
        }
        switch (i) {
            case 1:
                return C13492d.m41566b(m41652a(u1Var, bArr));
            case 2:
                return new C13565l(u1Var.mo34877b(), false);
            case 3:
                return C13486c.m41540a(u1Var.mo34876a(), (InputStream) u1Var);
            case 4:
                return new C13484b1(u1Var.mo34877b());
            case 5:
                return C13662z0.f30378c;
            case 6:
                return C13626o.m41842b(m41652a(u1Var, bArr));
            default:
                switch (i) {
                    case 18:
                        return new C13480a1(u1Var.mo34877b());
                    case 19:
                        return new C13498e1(u1Var.mo34877b());
                    case 20:
                        return new C13524j1(u1Var.mo34877b());
                    case 21:
                        return new C13591n1(u1Var.mo34877b());
                    case 22:
                        return new C13659y0(u1Var.mo34877b());
                    case 23:
                        return new C13487c0(u1Var.mo34877b());
                    case 24:
                        return new C13522j(u1Var.mo34877b());
                    case 25:
                        return new C13656x0(u1Var.mo34877b());
                    case 26:
                        return new C13629o1(u1Var.mo34877b());
                    case 27:
                        return new C13653w0(u1Var.mo34877b());
                    case 28:
                        return new C13586m1(u1Var.mo34877b());
                    default:
                        StringBuilder sb = new StringBuilder();
                        sb.append("unknown tag ");
                        sb.append(i);
                        sb.append(" encountered");
                        throw new IOException(sb.toString());
                }
        }
    }
}
