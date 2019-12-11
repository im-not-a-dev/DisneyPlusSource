package p602m.p613d.p627b.p630c0;

import p602m.p613d.p627b.C13679d;
import p602m.p613d.p627b.C13697f;
import p602m.p613d.p627b.C13705i;
import p602m.p613d.p627b.C13712p;
import p602m.p613d.p627b.C13716t;
import p602m.p613d.p627b.p630c0.p631c.C13674a;
import p602m.p613d.p627b.p630c0.p631c.C13675b;
import p602m.p613d.p627b.p630c0.p631c.C13676c;
import p602m.p613d.p627b.p630c0.p631c.C13677d;
import p602m.p613d.p627b.p630c0.p631c.C13678e;
import p602m.p613d.p627b.p632d0.C13680a;
import p602m.p613d.p627b.p632d0.C13692m;
import p602m.p613d.p627b.p632d0.C13693n;
import p602m.p613d.p683g.C14079a;
import p602m.p613d.p683g.C14087h;

/* renamed from: m.d.b.c0.b */
/* compiled from: GCMBlockCipher */
public class C13673b implements C13672a {

    /* renamed from: a */
    private C13679d f30404a;

    /* renamed from: b */
    private C13675b f30405b;

    /* renamed from: c */
    private C13674a f30406c;

    /* renamed from: d */
    private boolean f30407d;

    /* renamed from: e */
    private boolean f30408e;

    /* renamed from: f */
    private int f30409f;

    /* renamed from: g */
    private byte[] f30410g;

    /* renamed from: h */
    private byte[] f30411h;

    /* renamed from: i */
    private byte[] f30412i;

    /* renamed from: j */
    private byte[] f30413j;

    /* renamed from: k */
    private byte[] f30414k;

    /* renamed from: l */
    private byte[] f30415l;

    /* renamed from: m */
    private byte[] f30416m;

    /* renamed from: n */
    private byte[] f30417n;

    /* renamed from: o */
    private byte[] f30418o;

    /* renamed from: p */
    private byte[] f30419p;

    /* renamed from: q */
    private byte[] f30420q;

    /* renamed from: r */
    private int f30421r;

    /* renamed from: s */
    private int f30422s;

    /* renamed from: t */
    private long f30423t;

    /* renamed from: u */
    private byte[] f30424u;

    /* renamed from: v */
    private int f30425v;

    /* renamed from: w */
    private long f30426w;

    /* renamed from: x */
    private long f30427x;

    public C13673b(C13679d dVar) {
        this(dVar, null);
    }

    /* renamed from: b */
    private void m42009b(byte[] bArr, int i) {
        if (bArr.length >= i + 16) {
            if (this.f30423t == 0) {
                m42013c();
            }
            m42007a(this.f30415l, bArr, i);
            if (this.f30407d) {
                this.f30422s = 0;
                return;
            }
            byte[] bArr2 = this.f30415l;
            System.arraycopy(bArr2, 16, bArr2, 0, this.f30409f);
            this.f30422s = this.f30409f;
            return;
        }
        throw new C13716t("Output buffer too short");
    }

    /* renamed from: c */
    private void m42013c() {
        if (this.f30426w > 0) {
            System.arraycopy(this.f30418o, 0, this.f30419p, 0, 16);
            this.f30427x = this.f30426w;
        }
        int i = this.f30425v;
        if (i > 0) {
            m42008a(this.f30419p, this.f30424u, 0, i);
            this.f30427x += (long) this.f30425v;
        }
        if (this.f30427x > 0) {
            System.arraycopy(this.f30419p, 0, this.f30417n, 0, 16);
        }
    }

    /* renamed from: a */
    public void mo34919a(boolean z, C13697f fVar) throws IllegalArgumentException {
        C13692m mVar;
        byte[] bArr;
        int i;
        this.f30407d = z;
        this.f30416m = null;
        this.f30408e = true;
        if (fVar instanceof C13680a) {
            C13680a aVar = (C13680a) fVar;
            bArr = aVar.mo34928d();
            this.f30412i = aVar.mo34925a();
            int c = aVar.mo34927c();
            if (c < 32 || c > 128 || c % 8 != 0) {
                StringBuilder sb = new StringBuilder();
                sb.append("Invalid value for MAC size: ");
                sb.append(c);
                throw new IllegalArgumentException(sb.toString());
            }
            this.f30409f = c / 8;
            mVar = aVar.mo34926b();
        } else if (fVar instanceof C13693n) {
            C13693n nVar = (C13693n) fVar;
            bArr = nVar.mo34947a();
            this.f30412i = null;
            this.f30409f = 16;
            mVar = (C13692m) nVar.mo34948b();
        } else {
            throw new IllegalArgumentException("invalid parameters passed to GCM");
        }
        if (z) {
            i = 16;
        } else {
            i = this.f30409f + 16;
        }
        this.f30415l = new byte[i];
        if (bArr == null || bArr.length < 1) {
            throw new IllegalArgumentException("IV must be at least 1 byte");
        }
        if (z) {
            byte[] bArr2 = this.f30411h;
            if (bArr2 != null && C14079a.m44446a(bArr2, bArr)) {
                String str = "cannot reuse nonce for GCM encryption";
                if (mVar != null) {
                    byte[] bArr3 = this.f30410g;
                    if (bArr3 != null && C14079a.m44446a(bArr3, mVar.mo34946a())) {
                        throw new IllegalArgumentException(str);
                    }
                } else {
                    throw new IllegalArgumentException(str);
                }
            }
        }
        this.f30411h = bArr;
        if (mVar != null) {
            this.f30410g = mVar.mo34946a();
        }
        if (mVar != null) {
            this.f30404a.mo34905a(true, mVar);
            this.f30413j = new byte[16];
            C13679d dVar = this.f30404a;
            byte[] bArr4 = this.f30413j;
            dVar.mo34904a(bArr4, 0, bArr4, 0);
            this.f30405b.mo34923a(this.f30413j);
            this.f30406c = null;
        } else if (this.f30413j == null) {
            throw new IllegalArgumentException("Key must be specified in initial init");
        }
        this.f30414k = new byte[16];
        byte[] bArr5 = this.f30411h;
        if (bArr5.length == 12) {
            System.arraycopy(bArr5, 0, this.f30414k, 0, bArr5.length);
            this.f30414k[15] = 1;
        } else {
            m42011b(this.f30414k, bArr5, bArr5.length);
            byte[] bArr6 = new byte[16];
            C14087h.m44471a(((long) this.f30411h.length) * 8, bArr6, 8);
            m42006a(this.f30414k, bArr6);
        }
        this.f30417n = new byte[16];
        this.f30418o = new byte[16];
        this.f30419p = new byte[16];
        this.f30424u = new byte[16];
        this.f30425v = 0;
        this.f30426w = 0;
        this.f30427x = 0;
        this.f30420q = C14079a.m44450a(this.f30414k);
        this.f30421r = -2;
        this.f30422s = 0;
        this.f30423t = 0;
        byte[] bArr7 = this.f30412i;
        if (bArr7 != null) {
            mo34920a(bArr7, 0, bArr7.length);
        }
    }

    public C13673b(C13679d dVar, C13675b bVar) {
        if (dVar.mo34903a() == 16) {
            if (bVar == null) {
                bVar = new C13678e();
            }
            this.f30404a = dVar;
            this.f30405b = bVar;
            return;
        }
        throw new IllegalArgumentException("cipher required with a block size of 16.");
    }

    /* renamed from: b */
    private void m42010b(byte[] bArr, int i, int i2, byte[] bArr2, int i3) {
        byte[] b = m42012b();
        C13676c.m42025a(b, bArr, i, i2);
        System.arraycopy(b, 0, bArr2, i3, i2);
        byte[] bArr3 = this.f30417n;
        if (this.f30407d) {
            bArr = b;
        }
        m42008a(bArr3, bArr, 0, i2);
        this.f30423t += (long) i2;
    }

    /* renamed from: b */
    private void m42011b(byte[] bArr, byte[] bArr2, int i) {
        for (int i2 = 0; i2 < i; i2 += 16) {
            m42008a(bArr, bArr2, i2, Math.min(i - i2, 16));
        }
    }

    /* renamed from: b */
    private byte[] m42012b() {
        int i = this.f30421r;
        if (i != 0) {
            this.f30421r = i - 1;
            byte[] bArr = this.f30420q;
            int i2 = (bArr[15] & 255) + 1;
            bArr[15] = (byte) i2;
            int i3 = (i2 >>> 8) + (bArr[14] & 255);
            bArr[14] = (byte) i3;
            int i4 = (i3 >>> 8) + (bArr[13] & 255);
            bArr[13] = (byte) i4;
            bArr[12] = (byte) ((i4 >>> 8) + (bArr[12] & 255));
            byte[] bArr2 = new byte[16];
            this.f30404a.mo34904a(bArr, 0, bArr2, 0);
            return bArr2;
        }
        throw new IllegalStateException("Attempt to process too many blocks");
    }

    /* renamed from: a */
    public int mo34916a(int i) {
        int i2 = i + this.f30422s;
        if (this.f30407d) {
            return i2 + this.f30409f;
        }
        int i3 = this.f30409f;
        return i2 < i3 ? 0 : i2 - i3;
    }

    /* renamed from: a */
    public void mo34920a(byte[] bArr, int i, int i2) {
        m42004a();
        for (int i3 = 0; i3 < i2; i3++) {
            byte[] bArr2 = this.f30424u;
            int i4 = this.f30425v;
            bArr2[i4] = bArr[i + i3];
            int i5 = i4 + 1;
            this.f30425v = i5;
            if (i5 == 16) {
                m42006a(this.f30418o, bArr2);
                this.f30425v = 0;
                this.f30426w += 16;
            }
        }
    }

    /* renamed from: a */
    public int mo34918a(byte[] bArr, int i, int i2, byte[] bArr2, int i3) throws C13705i {
        m42004a();
        if (bArr.length >= i + i2) {
            int i4 = 0;
            for (int i5 = 0; i5 < i2; i5++) {
                byte[] bArr3 = this.f30415l;
                int i6 = this.f30422s;
                bArr3[i6] = bArr[i + i5];
                int i7 = i6 + 1;
                this.f30422s = i7;
                if (i7 == bArr3.length) {
                    m42009b(bArr2, i3 + i4);
                    i4 += 16;
                }
            }
            return i4;
        }
        throw new C13705i("Input buffer too short");
    }

    /* renamed from: a */
    public int mo34917a(byte[] bArr, int i) throws IllegalStateException, C13712p {
        m42004a();
        if (this.f30423t == 0) {
            m42013c();
        }
        int i2 = this.f30422s;
        String str = "Output buffer too short";
        if (!this.f30407d) {
            int i3 = this.f30409f;
            if (i2 >= i3) {
                i2 -= i3;
                if (bArr.length < i + i2) {
                    throw new C13716t(str);
                }
            } else {
                throw new C13712p("data too short");
            }
        } else if (bArr.length < i + i2 + this.f30409f) {
            throw new C13716t(str);
        }
        if (i2 > 0) {
            m42010b(this.f30415l, 0, i2, bArr, i);
        }
        long j = this.f30426w;
        int i4 = this.f30425v;
        this.f30426w = j + ((long) i4);
        if (this.f30426w > this.f30427x) {
            if (i4 > 0) {
                m42008a(this.f30418o, this.f30424u, 0, i4);
            }
            if (this.f30427x > 0) {
                C13676c.m42032b(this.f30418o, this.f30419p);
            }
            long j2 = ((this.f30423t * 8) + 127) >>> 7;
            byte[] bArr2 = new byte[16];
            if (this.f30406c == null) {
                this.f30406c = new C13677d();
                this.f30406c.mo34922a(this.f30413j);
            }
            this.f30406c.mo34921a(j2, bArr2);
            C13676c.m42024a(this.f30418o, bArr2);
            C13676c.m42032b(this.f30417n, this.f30418o);
        }
        byte[] bArr3 = new byte[16];
        C14087h.m44471a(this.f30426w * 8, bArr3, 0);
        C14087h.m44471a(this.f30423t * 8, bArr3, 8);
        m42006a(this.f30417n, bArr3);
        byte[] bArr4 = new byte[16];
        this.f30404a.mo34904a(this.f30414k, 0, bArr4, 0);
        C13676c.m42032b(bArr4, this.f30417n);
        int i5 = this.f30409f;
        this.f30416m = new byte[i5];
        System.arraycopy(bArr4, 0, this.f30416m, 0, i5);
        if (this.f30407d) {
            System.arraycopy(this.f30416m, 0, bArr, i + this.f30422s, this.f30409f);
            i2 += this.f30409f;
        } else {
            int i6 = this.f30409f;
            byte[] bArr5 = new byte[i6];
            System.arraycopy(this.f30415l, i2, bArr5, 0, i6);
            if (!C14079a.m44462c(this.f30416m, bArr5)) {
                throw new C13712p("mac check in GCM failed");
            }
        }
        m42005a(false);
        return i2;
    }

    /* renamed from: a */
    private void m42005a(boolean z) {
        this.f30404a.reset();
        this.f30417n = new byte[16];
        this.f30418o = new byte[16];
        this.f30419p = new byte[16];
        this.f30424u = new byte[16];
        this.f30425v = 0;
        this.f30426w = 0;
        this.f30427x = 0;
        this.f30420q = C14079a.m44450a(this.f30414k);
        this.f30421r = -2;
        this.f30422s = 0;
        this.f30423t = 0;
        byte[] bArr = this.f30415l;
        if (bArr != null) {
            C14079a.m44445a(bArr, 0);
        }
        if (z) {
            this.f30416m = null;
        }
        if (this.f30407d) {
            this.f30408e = false;
            return;
        }
        byte[] bArr2 = this.f30412i;
        if (bArr2 != null) {
            mo34920a(bArr2, 0, bArr2.length);
        }
    }

    /* renamed from: a */
    private void m42007a(byte[] bArr, byte[] bArr2, int i) {
        byte[] b = m42012b();
        C13676c.m42032b(b, bArr);
        System.arraycopy(b, 0, bArr2, i, 16);
        byte[] bArr3 = this.f30417n;
        if (this.f30407d) {
            bArr = b;
        }
        m42006a(bArr3, bArr);
        this.f30423t += 16;
    }

    /* renamed from: a */
    private void m42006a(byte[] bArr, byte[] bArr2) {
        C13676c.m42032b(bArr, bArr2);
        this.f30405b.mo34924b(bArr);
    }

    /* renamed from: a */
    private void m42008a(byte[] bArr, byte[] bArr2, int i, int i2) {
        C13676c.m42025a(bArr, bArr2, i, i2);
        this.f30405b.mo34924b(bArr);
    }

    /* renamed from: a */
    private void m42004a() {
        if (this.f30408e) {
            return;
        }
        if (this.f30407d) {
            throw new IllegalStateException("GCM cipher cannot be reused for encryption");
        }
        throw new IllegalStateException("GCM cipher needs to be initialised");
    }
}
