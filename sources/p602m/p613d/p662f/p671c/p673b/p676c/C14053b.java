package p602m.p613d.p662f.p671c.p673b.p676c;

import java.security.PublicKey;
import p602m.p613d.p614a.C13662z0;
import p602m.p613d.p614a.p625m2.C13587a;
import p602m.p613d.p662f.p663a.C13974e;
import p602m.p613d.p662f.p663a.C13976g;
import p602m.p613d.p662f.p664b.p667c.p668b.C13993a;
import p602m.p613d.p662f.p671c.p673b.p678e.C14058a;
import p602m.p613d.p662f.p671c.p680c.C14067b;
import p602m.p613d.p683g.C14079a;

/* renamed from: m.d.f.c.b.c.b */
/* compiled from: BCRainbowPublicKey */
public class C14053b implements PublicKey {

    /* renamed from: U */
    private short[][] f31065U;

    /* renamed from: V */
    private short[] f31066V;

    /* renamed from: W */
    private int f31067W;

    /* renamed from: c */
    private short[][] f31068c;

    public C14053b(int i, short[][] sArr, short[][] sArr2, short[] sArr3) {
        this.f31067W = i;
        this.f31068c = sArr;
        this.f31065U = sArr2;
        this.f31066V = sArr3;
    }

    /* renamed from: a */
    public short[][] mo35553a() {
        return this.f31068c;
    }

    /* renamed from: b */
    public short[] mo35554b() {
        return C14079a.m44456a(this.f31066V);
    }

    /* renamed from: c */
    public short[][] mo35555c() {
        short[][] sArr = new short[this.f31065U.length][];
        int i = 0;
        while (true) {
            short[][] sArr2 = this.f31065U;
            if (i == sArr2.length) {
                return sArr;
            }
            sArr[i] = C14079a.m44456a(sArr2[i]);
            i++;
        }
    }

    /* renamed from: d */
    public int mo35556d() {
        return this.f31067W;
    }

    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof C14053b)) {
            return false;
        }
        C14053b bVar = (C14053b) obj;
        if (this.f31067W != bVar.mo35556d() || !C13993a.m44133a(this.f31068c, bVar.mo35553a()) || !C13993a.m44133a(this.f31065U, bVar.mo35555c()) || !C13993a.m44132a(this.f31066V, bVar.mo35554b())) {
            return false;
        }
        return true;
    }

    public final String getAlgorithm() {
        return "Rainbow";
    }

    public byte[] getEncoded() {
        return C14058a.m44371a(new C13587a(C13974e.f30861a, C13662z0.f30378c), new C13976g(this.f31067W, this.f31068c, this.f31065U, this.f31066V));
    }

    public String getFormat() {
        return "X.509";
    }

    public int hashCode() {
        return (((((this.f31067W * 37) + C14079a.m44443a(this.f31068c)) * 37) + C14079a.m44443a(this.f31065U)) * 37) + C14079a.m44460b(this.f31066V);
    }

    public C14053b(C14067b bVar) {
        this(bVar.mo35617d(), bVar.mo35614a(), bVar.mo35616c(), bVar.mo35615b());
    }
}
