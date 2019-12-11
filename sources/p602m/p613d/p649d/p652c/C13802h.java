package p602m.p613d.p649d.p652c;

import java.security.spec.AlgorithmParameterSpec;
import p602m.p613d.p683g.C14079a;

/* renamed from: m.d.d.c.h */
/* compiled from: IESParameterSpec */
public class C13802h implements AlgorithmParameterSpec {

    /* renamed from: a */
    private byte[] f30627a;

    /* renamed from: b */
    private byte[] f30628b;

    /* renamed from: c */
    private int f30629c;

    /* renamed from: d */
    private int f30630d;

    /* renamed from: e */
    private byte[] f30631e;

    /* renamed from: f */
    private boolean f30632f;

    public C13802h(byte[] bArr, byte[] bArr2, int i, int i2, byte[] bArr3) {
        this(bArr, bArr2, i, i2, bArr3, false);
    }

    /* renamed from: a */
    public int mo35052a() {
        return this.f30630d;
    }

    /* renamed from: b */
    public byte[] mo35053b() {
        return C14079a.m44450a(this.f30627a);
    }

    /* renamed from: c */
    public byte[] mo35054c() {
        return C14079a.m44450a(this.f30628b);
    }

    /* renamed from: d */
    public int mo35055d() {
        return this.f30629c;
    }

    /* renamed from: e */
    public byte[] mo35056e() {
        return C14079a.m44450a(this.f30631e);
    }

    /* renamed from: f */
    public boolean mo35057f() {
        return this.f30632f;
    }

    public C13802h(byte[] bArr, byte[] bArr2, int i, int i2, byte[] bArr3, boolean z) {
        if (bArr != null) {
            this.f30627a = new byte[bArr.length];
            System.arraycopy(bArr, 0, this.f30627a, 0, bArr.length);
        } else {
            this.f30627a = null;
        }
        if (bArr2 != null) {
            this.f30628b = new byte[bArr2.length];
            System.arraycopy(bArr2, 0, this.f30628b, 0, bArr2.length);
        } else {
            this.f30628b = null;
        }
        this.f30629c = i;
        this.f30630d = i2;
        this.f30631e = C14079a.m44450a(bArr3);
        this.f30632f = z;
    }
}
