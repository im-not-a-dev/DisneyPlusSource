package p602m.p613d.p662f.p664b.p670e;

import java.io.IOException;
import p602m.p613d.p627b.p632d0.C13681b;
import p602m.p613d.p683g.C14079a;
import p602m.p613d.p683g.C14087h;

/* renamed from: m.d.f.b.e.v */
/* compiled from: XMSSPrivateKeyParameters */
public final class C14028v extends C13681b implements C14034x {

    /* renamed from: U */
    private final C14027u f31031U;

    /* renamed from: V */
    private final byte[] f31032V;

    /* renamed from: W */
    private final byte[] f31033W;

    /* renamed from: X */
    private final byte[] f31034X;

    /* renamed from: Y */
    private final byte[] f31035Y;

    /* renamed from: Z */
    private final C13996a f31036Z;

    /* renamed from: m.d.f.b.e.v$b */
    /* compiled from: XMSSPrivateKeyParameters */
    public static class C14030b {
        /* access modifiers changed from: private */

        /* renamed from: a */
        public final C14027u f31037a;
        /* access modifiers changed from: private */

        /* renamed from: b */
        public int f31038b = 0;
        /* access modifiers changed from: private */

        /* renamed from: c */
        public byte[] f31039c = null;
        /* access modifiers changed from: private */

        /* renamed from: d */
        public byte[] f31040d = null;
        /* access modifiers changed from: private */

        /* renamed from: e */
        public byte[] f31041e = null;
        /* access modifiers changed from: private */

        /* renamed from: f */
        public byte[] f31042f = null;
        /* access modifiers changed from: private */

        /* renamed from: g */
        public C13996a f31043g = null;
        /* access modifiers changed from: private */

        /* renamed from: h */
        public byte[] f31044h = null;
        /* access modifiers changed from: private */

        /* renamed from: i */
        public C14027u f31045i = null;

        public C14030b(C14027u uVar) {
            this.f31037a = uVar;
        }

        /* renamed from: a */
        public C14030b mo35465a(int i) {
            this.f31038b = i;
            return this;
        }

        /* renamed from: b */
        public C14030b mo35469b(byte[] bArr) {
            this.f31042f = C14035y.m44322a(bArr);
            return this;
        }

        /* renamed from: c */
        public C14030b mo35470c(byte[] bArr) {
            this.f31040d = C14035y.m44322a(bArr);
            return this;
        }

        /* renamed from: d */
        public C14030b mo35471d(byte[] bArr) {
            this.f31039c = C14035y.m44322a(bArr);
            return this;
        }

        /* renamed from: a */
        public C14030b mo35467a(byte[] bArr) {
            this.f31041e = C14035y.m44322a(bArr);
            return this;
        }

        /* renamed from: a */
        public C14030b mo35466a(C13996a aVar) {
            this.f31043g = aVar;
            return this;
        }

        /* renamed from: a */
        public C14028v mo35468a() {
            return new C14028v(this);
        }
    }

    /* renamed from: b */
    public C14027u mo35463b() {
        return this.f31031U;
    }

    /* renamed from: c */
    public byte[] mo35464c() {
        int b = this.f31031U.mo35458b();
        byte[] bArr = new byte[(b + 4 + b + b + b)];
        C14087h.m44470a(this.f31036Z.mo35371a(), bArr, 0);
        C14035y.m44318a(bArr, this.f31032V, 4);
        int i = 4 + b;
        C14035y.m44318a(bArr, this.f31033W, i);
        int i2 = i + b;
        C14035y.m44318a(bArr, this.f31034X, i2);
        C14035y.m44318a(bArr, this.f31035Y, i2 + b);
        try {
            return C14079a.m44461b(bArr, C14035y.m44321a((Object) this.f31036Z));
        } catch (IOException e) {
            StringBuilder sb = new StringBuilder();
            sb.append("error serializing bds state: ");
            sb.append(e.getMessage());
            throw new RuntimeException(sb.toString());
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x0075  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0079  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private C14028v(p602m.p613d.p662f.p664b.p670e.C14028v.C14030b r8) {
        /*
            r7 = this;
            r0 = 1
            r7.<init>(r0)
            m.d.f.b.e.u r1 = r8.f31037a
            r7.f31031U = r1
            m.d.f.b.e.u r1 = r7.f31031U
            if (r1 == 0) goto L_0x0136
            int r1 = r1.mo35458b()
            byte[] r2 = r8.f31044h
            if (r2 == 0) goto L_0x0091
            m.d.f.b.e.u r0 = r8.f31045i
            if (r0 == 0) goto L_0x0089
            m.d.f.b.e.u r0 = r7.f31031U
            int r0 = r0.mo35459c()
            r3 = 0
            int r3 = p602m.p613d.p683g.C14087h.m44469a(r2, r3)
            long r4 = (long) r3
            boolean r0 = p602m.p613d.p662f.p664b.p670e.C14035y.m44319a(r0, r4)
            if (r0 == 0) goto L_0x0081
            r0 = 4
            byte[] r4 = p602m.p613d.p662f.p664b.p670e.C14035y.m44327b(r2, r0, r1)
            r7.f31032V = r4
            int r0 = r0 + r1
            byte[] r4 = p602m.p613d.p662f.p664b.p670e.C14035y.m44327b(r2, r0, r1)
            r7.f31033W = r4
            int r0 = r0 + r1
            byte[] r4 = p602m.p613d.p662f.p664b.p670e.C14035y.m44327b(r2, r0, r1)
            r7.f31034X = r4
            int r0 = r0 + r1
            byte[] r4 = p602m.p613d.p662f.p664b.p670e.C14035y.m44327b(r2, r0, r1)
            r7.f31035Y = r4
            int r0 = r0 + r1
            int r1 = r2.length
            int r1 = r1 - r0
            byte[] r0 = p602m.p613d.p662f.p664b.p670e.C14035y.m44327b(r2, r0, r1)
            r1 = 0
            java.lang.Object r0 = p602m.p613d.p662f.p664b.p670e.C14035y.m44325b(r0)     // Catch:{ IOException -> 0x0060, ClassNotFoundException -> 0x005b }
            m.d.f.b.e.a r0 = (p602m.p613d.p662f.p664b.p670e.C13996a) r0     // Catch:{ IOException -> 0x0060, ClassNotFoundException -> 0x005b }
            goto L_0x0065
        L_0x005b:
            r0 = move-exception
            r0.printStackTrace()
            goto L_0x0064
        L_0x0060:
            r0 = move-exception
            r0.printStackTrace()
        L_0x0064:
            r0 = r1
        L_0x0065:
            m.d.f.b.e.u r8 = r8.f31045i
            r0.mo35373a(r8)
            r0.mo35374b()
            int r8 = r0.mo35371a()
            if (r8 != r3) goto L_0x0079
            r7.f31036Z = r0
            goto L_0x0135
        L_0x0079:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "serialized BDS has wrong index"
            r8.<init>(r0)
            throw r8
        L_0x0081:
            java.lang.IllegalArgumentException r8 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "index out of bounds"
            r8.<init>(r0)
            throw r8
        L_0x0089:
            java.lang.NullPointerException r8 = new java.lang.NullPointerException
            java.lang.String r0 = "xmss == null"
            r8.<init>(r0)
            throw r8
        L_0x0091:
            byte[] r4 = r8.f31039c
            if (r4 == 0) goto L_0x00a5
            int r2 = r4.length
            if (r2 != r1) goto L_0x009d
            r7.f31032V = r4
            goto L_0x00a9
        L_0x009d:
            java.lang.IllegalArgumentException r8 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "size of secretKeySeed needs to be equal size of digest"
            r8.<init>(r0)
            throw r8
        L_0x00a5:
            byte[] r2 = new byte[r1]
            r7.f31032V = r2
        L_0x00a9:
            byte[] r2 = r8.f31040d
            if (r2 == 0) goto L_0x00bd
            int r3 = r2.length
            if (r3 != r1) goto L_0x00b5
            r7.f31033W = r2
            goto L_0x00c1
        L_0x00b5:
            java.lang.IllegalArgumentException r8 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "size of secretKeyPRF needs to be equal size of digest"
            r8.<init>(r0)
            throw r8
        L_0x00bd:
            byte[] r2 = new byte[r1]
            r7.f31033W = r2
        L_0x00c1:
            byte[] r3 = r8.f31041e
            if (r3 == 0) goto L_0x00d5
            int r2 = r3.length
            if (r2 != r1) goto L_0x00cd
            r7.f31034X = r3
            goto L_0x00d9
        L_0x00cd:
            java.lang.IllegalArgumentException r8 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "size of publicSeed needs to be equal size of digest"
            r8.<init>(r0)
            throw r8
        L_0x00d5:
            byte[] r2 = new byte[r1]
            r7.f31034X = r2
        L_0x00d9:
            byte[] r2 = r8.f31042f
            if (r2 == 0) goto L_0x00ed
            int r5 = r2.length
            if (r5 != r1) goto L_0x00e5
            r7.f31035Y = r2
            goto L_0x00f1
        L_0x00e5:
            java.lang.IllegalArgumentException r8 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "size of root needs to be equal size of digest"
            r8.<init>(r0)
            throw r8
        L_0x00ed:
            byte[] r1 = new byte[r1]
            r7.f31035Y = r1
        L_0x00f1:
            m.d.f.b.e.a r1 = r8.f31043g
            if (r1 == 0) goto L_0x00fa
            r7.f31036Z = r1
            goto L_0x0135
        L_0x00fa:
            int r1 = r8.f31038b
            m.d.f.b.e.u r2 = r7.f31031U
            int r2 = r2.mo35459c()
            int r0 = r0 << r2
            int r0 = r0 + -2
            if (r1 >= r0) goto L_0x0128
            if (r3 == 0) goto L_0x0128
            if (r4 == 0) goto L_0x0128
            m.d.f.b.e.a r0 = new m.d.f.b.e.a
            m.d.f.b.e.u r2 = r7.f31031U
            m.d.f.b.e.i$b r1 = new m.d.f.b.e.i$b
            r1.<init>()
            m.d.f.b.e.n r1 = r1.mo35409b()
            r5 = r1
            m.d.f.b.e.i r5 = (p602m.p613d.p662f.p664b.p670e.C14008i) r5
            int r6 = r8.f31038b
            r1 = r0
            r1.<init>(r2, r3, r4, r5, r6)
            r7.f31036Z = r0
            goto L_0x0135
        L_0x0128:
            m.d.f.b.e.a r0 = new m.d.f.b.e.a
            m.d.f.b.e.u r1 = r7.f31031U
            int r8 = r8.f31038b
            r0.<init>(r1, r8)
            r7.f31036Z = r0
        L_0x0135:
            return
        L_0x0136:
            java.lang.NullPointerException r8 = new java.lang.NullPointerException
            java.lang.String r0 = "params == null"
            r8.<init>(r0)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: p602m.p613d.p662f.p664b.p670e.C14028v.<init>(m.d.f.b.e.v$b):void");
    }
}
