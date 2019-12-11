package p602m.p613d.p662f.p664b.p670e;

import java.io.IOException;
import p602m.p613d.p627b.p632d0.C13681b;
import p602m.p613d.p683g.C14079a;

/* renamed from: m.d.f.b.e.p */
/* compiled from: XMSSMTPrivateKeyParameters */
public final class C14018p extends C13681b implements C14034x {

    /* renamed from: U */
    private final C14017o f31003U;

    /* renamed from: V */
    private final long f31004V;

    /* renamed from: W */
    private final byte[] f31005W;

    /* renamed from: X */
    private final byte[] f31006X;

    /* renamed from: Y */
    private final byte[] f31007Y;

    /* renamed from: Z */
    private final byte[] f31008Z;

    /* renamed from: a0 */
    private final C13997b f31009a0;

    /* renamed from: m.d.f.b.e.p$b */
    /* compiled from: XMSSMTPrivateKeyParameters */
    public static class C14020b {
        /* access modifiers changed from: private */

        /* renamed from: a */
        public final C14017o f31010a;
        /* access modifiers changed from: private */

        /* renamed from: b */
        public long f31011b = 0;
        /* access modifiers changed from: private */

        /* renamed from: c */
        public byte[] f31012c = null;
        /* access modifiers changed from: private */

        /* renamed from: d */
        public byte[] f31013d = null;
        /* access modifiers changed from: private */

        /* renamed from: e */
        public byte[] f31014e = null;
        /* access modifiers changed from: private */

        /* renamed from: f */
        public byte[] f31015f = null;
        /* access modifiers changed from: private */

        /* renamed from: g */
        public C13997b f31016g = null;
        /* access modifiers changed from: private */

        /* renamed from: h */
        public byte[] f31017h = null;
        /* access modifiers changed from: private */

        /* renamed from: i */
        public C14027u f31018i = null;

        public C14020b(C14017o oVar) {
            this.f31010a = oVar;
        }

        /* renamed from: a */
        public C14020b mo35440a(long j) {
            this.f31011b = j;
            return this;
        }

        /* renamed from: b */
        public C14020b mo35444b(byte[] bArr) {
            this.f31015f = C14035y.m44322a(bArr);
            return this;
        }

        /* renamed from: c */
        public C14020b mo35445c(byte[] bArr) {
            this.f31013d = C14035y.m44322a(bArr);
            return this;
        }

        /* renamed from: d */
        public C14020b mo35446d(byte[] bArr) {
            this.f31012c = C14035y.m44322a(bArr);
            return this;
        }

        /* renamed from: a */
        public C14020b mo35442a(byte[] bArr) {
            this.f31014e = C14035y.m44322a(bArr);
            return this;
        }

        /* renamed from: a */
        public C14020b mo35441a(C13997b bVar) {
            this.f31016g = bVar;
            return this;
        }

        /* renamed from: a */
        public C14018p mo35443a() {
            return new C14018p(this);
        }
    }

    /* renamed from: b */
    public C14017o mo35438b() {
        return this.f31003U;
    }

    /* renamed from: c */
    public byte[] mo35439c() {
        int b = this.f31003U.mo35432b();
        int c = (this.f31003U.mo35433c() + 7) / 8;
        byte[] bArr = new byte[(c + b + b + b + b)];
        C14035y.m44318a(bArr, C14035y.m44328c(this.f31004V, c), 0);
        int i = c + 0;
        C14035y.m44318a(bArr, this.f31005W, i);
        int i2 = i + b;
        C14035y.m44318a(bArr, this.f31006X, i2);
        int i3 = i2 + b;
        C14035y.m44318a(bArr, this.f31007Y, i3);
        C14035y.m44318a(bArr, this.f31008Z, i3 + b);
        try {
            return C14079a.m44461b(bArr, C14035y.m44321a((Object) this.f31009a0));
        } catch (IOException e) {
            e.printStackTrace();
            throw new RuntimeException("error serializing bds state");
        }
    }

    private C14018p(C14020b bVar) {
        C13997b bVar2;
        super(true);
        this.f31003U = bVar.f31010a;
        C14017o oVar = this.f31003U;
        if (oVar != null) {
            int b = oVar.mo35432b();
            byte[] b2 = bVar.f31017h;
            if (b2 == null) {
                this.f31004V = bVar.f31011b;
                byte[] e = bVar.f31012c;
                if (e == null) {
                    this.f31005W = new byte[b];
                } else if (e.length == b) {
                    this.f31005W = e;
                } else {
                    throw new IllegalArgumentException("size of secretKeySeed needs to be equal size of digest");
                }
                byte[] f = bVar.f31013d;
                if (f == null) {
                    this.f31006X = new byte[b];
                } else if (f.length == b) {
                    this.f31006X = f;
                } else {
                    throw new IllegalArgumentException("size of secretKeyPRF needs to be equal size of digest");
                }
                byte[] g = bVar.f31014e;
                if (g == null) {
                    this.f31007Y = new byte[b];
                } else if (g.length == b) {
                    this.f31007Y = g;
                } else {
                    throw new IllegalArgumentException("size of publicSeed needs to be equal size of digest");
                }
                byte[] h = bVar.f31015f;
                if (h == null) {
                    this.f31008Z = new byte[b];
                } else if (h.length == b) {
                    this.f31008Z = h;
                } else {
                    throw new IllegalArgumentException("size of root needs to be equal size of digest");
                }
                C13997b i = bVar.f31016g;
                if (i != null) {
                    this.f31009a0 = i;
                    return;
                }
                if (!C14035y.m44319a(this.f31003U.mo35433c(), bVar.f31011b) || g == null || e == null) {
                    this.f31009a0 = new C13997b();
                    return;
                }
                C13997b bVar3 = new C13997b(this.f31003U, bVar.f31011b, g, e);
                this.f31009a0 = bVar3;
                return;
            } else if (bVar.f31018i != null) {
                int c = this.f31003U.mo35433c();
                int i2 = (c + 7) / 8;
                this.f31004V = C14035y.m44317a(b2, 0, i2);
                if (C14035y.m44319a(c, this.f31004V)) {
                    int i3 = i2 + 0;
                    this.f31005W = C14035y.m44327b(b2, i3, b);
                    int i4 = i3 + b;
                    this.f31006X = C14035y.m44327b(b2, i4, b);
                    int i5 = i4 + b;
                    this.f31007Y = C14035y.m44327b(b2, i5, b);
                    int i6 = i5 + b;
                    this.f31008Z = C14035y.m44327b(b2, i6, b);
                    int i7 = i6 + b;
                    try {
                        bVar2 = (C13997b) C14035y.m44325b(C14035y.m44327b(b2, i7, b2.length - i7));
                    } catch (IOException e2) {
                        e2.printStackTrace();
                    } catch (ClassNotFoundException e3) {
                        e3.printStackTrace();
                    }
                    bVar2.mo35378a(bVar.f31018i);
                    this.f31009a0 = bVar2;
                }
                throw new IllegalArgumentException("index out of bounds");
            } else {
                throw new NullPointerException("xmss == null");
            }
        } else {
            throw new NullPointerException("params == null");
        }
        bVar2 = null;
        bVar2.mo35378a(bVar.f31018i);
        this.f31009a0 = bVar2;
    }
}
