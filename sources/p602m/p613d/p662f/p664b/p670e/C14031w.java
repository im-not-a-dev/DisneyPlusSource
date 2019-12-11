package p602m.p613d.p662f.p664b.p670e;

import p602m.p613d.p627b.p632d0.C13681b;

/* renamed from: m.d.f.b.e.w */
/* compiled from: XMSSPublicKeyParameters */
public final class C14031w extends C13681b implements C14034x {

    /* renamed from: U */
    private final C14027u f31046U;

    /* renamed from: V */
    private final byte[] f31047V;

    /* renamed from: W */
    private final byte[] f31048W;

    /* renamed from: m.d.f.b.e.w$b */
    /* compiled from: XMSSPublicKeyParameters */
    public static class C14033b {
        /* access modifiers changed from: private */

        /* renamed from: a */
        public final C14027u f31049a;
        /* access modifiers changed from: private */

        /* renamed from: b */
        public byte[] f31050b = null;
        /* access modifiers changed from: private */

        /* renamed from: c */
        public byte[] f31051c = null;
        /* access modifiers changed from: private */

        /* renamed from: d */
        public byte[] f31052d = null;

        public C14033b(C14027u uVar) {
            this.f31049a = uVar;
        }

        /* renamed from: a */
        public C14033b mo35476a(byte[] bArr) {
            this.f31051c = C14035y.m44322a(bArr);
            return this;
        }

        /* renamed from: b */
        public C14033b mo35478b(byte[] bArr) {
            this.f31050b = C14035y.m44322a(bArr);
            return this;
        }

        /* renamed from: a */
        public C14031w mo35477a() {
            return new C14031w(this);
        }
    }

    /* renamed from: b */
    public C14027u mo35472b() {
        return this.f31046U;
    }

    /* renamed from: c */
    public byte[] mo35473c() {
        return C14035y.m44322a(this.f31048W);
    }

    /* renamed from: d */
    public byte[] mo35474d() {
        return C14035y.m44322a(this.f31047V);
    }

    /* renamed from: e */
    public byte[] mo35475e() {
        int b = this.f31046U.mo35458b();
        byte[] bArr = new byte[(b + b)];
        C14035y.m44318a(bArr, this.f31047V, 0);
        C14035y.m44318a(bArr, this.f31048W, b + 0);
        return bArr;
    }

    private C14031w(C14033b bVar) {
        super(false);
        this.f31046U = bVar.f31049a;
        C14027u uVar = this.f31046U;
        if (uVar != null) {
            int b = uVar.mo35458b();
            byte[] b2 = bVar.f31052d;
            if (b2 != null) {
                if (b2.length == b + b) {
                    this.f31047V = C14035y.m44327b(b2, 0, b);
                    this.f31048W = C14035y.m44327b(b2, b + 0, b);
                    return;
                }
                throw new IllegalArgumentException("public key has wrong size");
            }
            byte[] c = bVar.f31050b;
            if (c == null) {
                this.f31047V = new byte[b];
            } else if (c.length == b) {
                this.f31047V = c;
            } else {
                throw new IllegalArgumentException("length of root must be equal to length of digest");
            }
            byte[] d = bVar.f31051c;
            if (d == null) {
                this.f31048W = new byte[b];
            } else if (d.length == b) {
                this.f31048W = d;
            } else {
                throw new IllegalArgumentException("length of publicSeed must be equal to length of digest");
            }
        } else {
            throw new NullPointerException("params == null");
        }
    }
}
