package p602m.p613d.p662f.p664b.p670e;

import p602m.p613d.p627b.p632d0.C13681b;

/* renamed from: m.d.f.b.e.q */
/* compiled from: XMSSMTPublicKeyParameters */
public final class C14021q extends C13681b implements C14034x {

    /* renamed from: U */
    private final C14017o f31019U;

    /* renamed from: V */
    private final byte[] f31020V;

    /* renamed from: W */
    private final byte[] f31021W;

    /* renamed from: m.d.f.b.e.q$b */
    /* compiled from: XMSSMTPublicKeyParameters */
    public static class C14023b {
        /* access modifiers changed from: private */

        /* renamed from: a */
        public final C14017o f31022a;
        /* access modifiers changed from: private */

        /* renamed from: b */
        public byte[] f31023b = null;
        /* access modifiers changed from: private */

        /* renamed from: c */
        public byte[] f31024c = null;
        /* access modifiers changed from: private */

        /* renamed from: d */
        public byte[] f31025d = null;

        public C14023b(C14017o oVar) {
            this.f31022a = oVar;
        }

        /* renamed from: a */
        public C14023b mo35451a(byte[] bArr) {
            this.f31024c = C14035y.m44322a(bArr);
            return this;
        }

        /* renamed from: b */
        public C14023b mo35453b(byte[] bArr) {
            this.f31023b = C14035y.m44322a(bArr);
            return this;
        }

        /* renamed from: a */
        public C14021q mo35452a() {
            return new C14021q(this);
        }
    }

    /* renamed from: b */
    public C14017o mo35447b() {
        return this.f31019U;
    }

    /* renamed from: c */
    public byte[] mo35448c() {
        return C14035y.m44322a(this.f31021W);
    }

    /* renamed from: d */
    public byte[] mo35449d() {
        return C14035y.m44322a(this.f31020V);
    }

    /* renamed from: e */
    public byte[] mo35450e() {
        int b = this.f31019U.mo35432b();
        byte[] bArr = new byte[(b + b)];
        C14035y.m44318a(bArr, this.f31020V, 0);
        C14035y.m44318a(bArr, this.f31021W, b + 0);
        return bArr;
    }

    private C14021q(C14023b bVar) {
        super(false);
        this.f31019U = bVar.f31022a;
        C14017o oVar = this.f31019U;
        if (oVar != null) {
            int b = oVar.mo35432b();
            byte[] b2 = bVar.f31025d;
            if (b2 != null) {
                if (b2.length == b + b) {
                    this.f31020V = C14035y.m44327b(b2, 0, b);
                    this.f31021W = C14035y.m44327b(b2, b + 0, b);
                    return;
                }
                throw new IllegalArgumentException("public key has wrong size");
            }
            byte[] c = bVar.f31023b;
            if (c == null) {
                this.f31020V = new byte[b];
            } else if (c.length == b) {
                this.f31020V = c;
            } else {
                throw new IllegalArgumentException("length of root must be equal to length of digest");
            }
            byte[] d = bVar.f31024c;
            if (d == null) {
                this.f31021W = new byte[b];
            } else if (d.length == b) {
                this.f31021W = d;
            } else {
                throw new IllegalArgumentException("length of publicSeed must be equal to length of digest");
            }
        } else {
            throw new NullPointerException("params == null");
        }
    }
}
