package p602m.p613d.p662f.p671c.p673b.p676c;

import java.security.PrivateKey;
import java.util.Arrays;
import p602m.p613d.p662f.p664b.p667c.C13992a;
import p602m.p613d.p662f.p664b.p667c.p668b.C13993a;
import p602m.p613d.p662f.p671c.p680c.C14066a;
import p602m.p613d.p683g.C14079a;

/* renamed from: m.d.f.c.b.c.a */
/* compiled from: BCRainbowPrivateKey */
public class C14052a implements PrivateKey {

    /* renamed from: U */
    private short[] f31059U;

    /* renamed from: V */
    private short[][] f31060V;

    /* renamed from: W */
    private short[] f31061W;

    /* renamed from: X */
    private C13992a[] f31062X;

    /* renamed from: Y */
    private int[] f31063Y;

    /* renamed from: c */
    private short[][] f31064c;

    public C14052a(short[][] sArr, short[] sArr2, short[][] sArr3, short[] sArr4, int[] iArr, C13992a[] aVarArr) {
        this.f31064c = sArr;
        this.f31059U = sArr2;
        this.f31060V = sArr3;
        this.f31061W = sArr4;
        this.f31063Y = iArr;
        this.f31062X = aVarArr;
    }

    /* renamed from: a */
    public short[] mo35542a() {
        return this.f31059U;
    }

    /* renamed from: b */
    public short[] mo35543b() {
        return this.f31061W;
    }

    /* renamed from: c */
    public short[][] mo35544c() {
        return this.f31064c;
    }

    /* renamed from: d */
    public short[][] mo35545d() {
        return this.f31060V;
    }

    /* renamed from: e */
    public C13992a[] mo35546e() {
        return this.f31062X;
    }

    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof C14052a)) {
            return false;
        }
        C14052a aVar = (C14052a) obj;
        boolean z = ((((C13993a.m44133a(this.f31064c, aVar.mo35544c())) && C13993a.m44133a(this.f31060V, aVar.mo35545d())) && C13993a.m44132a(this.f31059U, aVar.mo35542a())) && C13993a.m44132a(this.f31061W, aVar.mo35543b())) && Arrays.equals(this.f31063Y, aVar.mo35548f());
        if (this.f31062X.length != aVar.mo35546e().length) {
            return false;
        }
        for (int length = this.f31062X.length - 1; length >= 0; length--) {
            z &= this.f31062X[length].equals(aVar.mo35546e()[length]);
        }
        return z;
    }

    /* renamed from: f */
    public int[] mo35548f() {
        return this.f31063Y;
    }

    public final String getAlgorithm() {
        return "Rainbow";
    }

    /* JADX WARNING: No exception handlers in catch block: Catch:{  } */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public byte[] getEncoded() {
        /*
            r8 = this;
            m.d.f.a.f r7 = new m.d.f.a.f
            short[][] r1 = r8.f31064c
            short[] r2 = r8.f31059U
            short[][] r3 = r8.f31060V
            short[] r4 = r8.f31061W
            int[] r5 = r8.f31063Y
            m.d.f.b.c.a[] r6 = r8.f31062X
            r0 = r7
            r0.<init>(r1, r2, r3, r4, r5, r6)
            r0 = 0
            m.d.a.m2.a r1 = new m.d.a.m2.a     // Catch:{ IOException -> 0x0025 }
            m.d.a.o r2 = p602m.p613d.p662f.p663a.C13974e.f30861a     // Catch:{ IOException -> 0x0025 }
            m.d.a.z0 r3 = p602m.p613d.p614a.C13662z0.f30378c     // Catch:{ IOException -> 0x0025 }
            r1.<init>(r2, r3)     // Catch:{ IOException -> 0x0025 }
            m.d.a.i2.a r2 = new m.d.a.i2.a     // Catch:{ IOException -> 0x0025 }
            r2.<init>(r1, r7)     // Catch:{ IOException -> 0x0025 }
            byte[] r0 = r2.mo34828d()     // Catch:{  }
        L_0x0025:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p602m.p613d.p662f.p671c.p673b.p676c.C14052a.getEncoded():byte[]");
    }

    public String getFormat() {
        return "PKCS#8";
    }

    public int hashCode() {
        int length = (((((((((this.f31062X.length * 37) + C14079a.m44443a(this.f31064c)) * 37) + C14079a.m44460b(this.f31059U)) * 37) + C14079a.m44443a(this.f31060V)) * 37) + C14079a.m44460b(this.f31061W)) * 37) + C14079a.m44458b(this.f31063Y);
        for (int length2 = this.f31062X.length - 1; length2 >= 0; length2--) {
            length = (length * 37) + this.f31062X[length2].hashCode();
        }
        return length;
    }

    public C14052a(C14066a aVar) {
        this(aVar.mo35610c(), aVar.mo35608a(), aVar.mo35611d(), aVar.mo35609b(), aVar.mo35613f(), aVar.mo35612e());
    }
}
