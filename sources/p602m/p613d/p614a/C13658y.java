package p602m.p613d.p614a;

import java.io.IOException;
import java.io.InputStream;

/* renamed from: m.d.a.y */
/* compiled from: ASN1StreamParser */
public class C13658y {

    /* renamed from: a */
    private final InputStream f30372a;

    /* renamed from: b */
    private final int f30373b;

    /* renamed from: c */
    private final byte[][] f30374c;

    public C13658y(InputStream inputStream) {
        this(inputStream, C13485b2.m41538a(inputStream));
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public C13501f mo34895a(int i) throws IOException {
        if (i == 4) {
            return new C13515h0(this);
        }
        if (i == 8) {
            return new C13647u0(this);
        }
        if (i == 16) {
            return new C13523j0(this);
        }
        if (i == 17) {
            return new C13566l0(this);
        }
        StringBuilder sb = new StringBuilder();
        sb.append("unknown BER object encountered: 0x");
        sb.append(Integer.toHexString(i));
        throw new C13518i(sb.toString());
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public C13508g mo34897b() throws IOException {
        C13508g gVar = new C13508g();
        while (true) {
            C13501f a = mo34894a();
            if (a == null) {
                return gVar;
            }
            if (a instanceof C13651v1) {
                gVar.mo34796a((C13501f) ((C13651v1) a).mo34768b());
            } else {
                gVar.mo34796a((C13501f) a.mo34785a());
            }
        }
    }

    public C13658y(InputStream inputStream, int i) {
        this.f30372a = inputStream;
        this.f30373b = i;
        this.f30374c = new byte[11][];
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public C13643t mo34896a(boolean z, int i) throws IOException {
        C13528k1 k1Var;
        C13585m0 m0Var;
        if (!z) {
            return new C13528k1(false, i, new C13484b1(((C13648u1) this.f30372a).mo34877b()));
        }
        C13508g b = mo34897b();
        if (this.f30372a instanceof C13654w1) {
            if (b.mo34794a() == 1) {
                m0Var = new C13585m0(true, i, b.mo34795a(0));
            } else {
                m0Var = new C13585m0(false, i, C13502f0.m41586a(b));
            }
            return m0Var;
        }
        if (b.mo34794a() == 1) {
            k1Var = new C13528k1(true, i, b.mo34795a(0));
        } else {
            k1Var = new C13528k1(false, i, C13650v0.m41928a(b));
        }
        return k1Var;
    }

    /* renamed from: a */
    public C13501f mo34894a() throws IOException {
        int read = this.f30372a.read();
        if (read == -1) {
            return null;
        }
        boolean z = false;
        m41956a(false);
        int b = C13526k.m41653b(this.f30372a, read);
        if ((read & 32) != 0) {
            z = true;
        }
        int a = C13526k.m41650a(this.f30372a, this.f30373b);
        if (a >= 0) {
            C13648u1 u1Var = new C13648u1(this.f30372a, a);
            if ((read & 64) != 0) {
                return new C13634q0(z, b, u1Var.mo34877b());
            }
            if ((read & 128) != 0) {
                return new C13590n0(z, b, new C13658y(u1Var));
            }
            if (z) {
                if (b == 4) {
                    return new C13515h0(new C13658y(u1Var));
                }
                if (b == 8) {
                    return new C13647u0(new C13658y(u1Var));
                }
                if (b == 16) {
                    return new C13511g1(new C13658y(u1Var));
                }
                if (b == 17) {
                    return new C13520i1(new C13658y(u1Var));
                }
                StringBuilder sb = new StringBuilder();
                sb.append("unknown tag ");
                sb.append(b);
                sb.append(" encountered");
                throw new IOException(sb.toString());
            } else if (b == 4) {
                return new C13488c1(u1Var);
            } else {
                try {
                    return C13526k.m41651a(b, u1Var, this.f30374c);
                } catch (IllegalArgumentException e) {
                    throw new C13518i("corrupted stream detected", e);
                }
            }
        } else if (z) {
            C13658y yVar = new C13658y(new C13654w1(this.f30372a, this.f30373b), this.f30373b);
            if ((read & 64) != 0) {
                return new C13497e0(b, yVar);
            }
            if ((read & 128) != 0) {
                return new C13590n0(true, b, yVar);
            }
            return yVar.mo34895a(b);
        } else {
            throw new IOException("indefinite-length primitive encoding encountered");
        }
    }

    /* renamed from: a */
    private void m41956a(boolean z) {
        InputStream inputStream = this.f30372a;
        if (inputStream instanceof C13654w1) {
            ((C13654w1) inputStream).mo34889b(z);
        }
    }
}
