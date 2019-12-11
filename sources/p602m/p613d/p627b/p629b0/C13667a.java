package p602m.p613d.p627b.p629b0;

import p602m.p613d.p627b.C13705i;
import p602m.p613d.p627b.C13707k;
import p602m.p613d.p627b.C13708l;
import p602m.p613d.p627b.C13709m;
import p602m.p613d.p627b.C13716t;
import p602m.p613d.p627b.p632d0.C13690k;
import p602m.p613d.p627b.p632d0.C13691l;
import p602m.p613d.p683g.C14087h;

/* renamed from: m.d.b.b0.a */
/* compiled from: BaseKDFBytesGenerator */
public class C13667a implements C13709m {

    /* renamed from: a */
    private int f30396a;

    /* renamed from: b */
    private C13708l f30397b;

    /* renamed from: c */
    private byte[] f30398c;

    /* renamed from: d */
    private byte[] f30399d;

    protected C13667a(int i, C13708l lVar) {
        this.f30396a = i;
        this.f30397b = lVar;
    }

    /* renamed from: a */
    public void mo34909a(C13707k kVar) {
        if (kVar instanceof C13691l) {
            C13691l lVar = (C13691l) kVar;
            this.f30398c = lVar.mo34945b();
            this.f30399d = lVar.mo34944a();
        } else if (kVar instanceof C13690k) {
            this.f30398c = ((C13690k) kVar).mo34943a();
            this.f30399d = null;
        } else {
            throw new IllegalArgumentException("KDF parameters required for generator");
        }
    }

    /* renamed from: a */
    public int mo34908a(byte[] bArr, int i, int i2) throws C13705i, IllegalArgumentException {
        if (bArr.length - i2 >= i) {
            long j = (long) i2;
            int b = this.f30397b.mo34973b();
            if (j <= 8589934591L) {
                long j2 = (long) b;
                int i3 = (int) (((j + j2) - 1) / j2);
                byte[] bArr2 = new byte[this.f30397b.mo34973b()];
                byte[] bArr3 = new byte[4];
                C14087h.m44470a(this.f30396a, bArr3, 0);
                int i4 = this.f30396a & -256;
                int i5 = i;
                for (int i6 = 0; i6 < i3; i6++) {
                    C13708l lVar = this.f30397b;
                    byte[] bArr4 = this.f30398c;
                    lVar.mo34972a(bArr4, 0, bArr4.length);
                    this.f30397b.mo34972a(bArr3, 0, bArr3.length);
                    byte[] bArr5 = this.f30399d;
                    if (bArr5 != null) {
                        this.f30397b.mo34972a(bArr5, 0, bArr5.length);
                    }
                    this.f30397b.mo34970a(bArr2, 0);
                    if (i2 > b) {
                        System.arraycopy(bArr2, 0, bArr, i5, b);
                        i5 += b;
                        i2 -= b;
                    } else {
                        System.arraycopy(bArr2, 0, bArr, i5, i2);
                    }
                    byte b2 = (byte) (bArr3[3] + 1);
                    bArr3[3] = b2;
                    if (b2 == 0) {
                        i4 += 256;
                        C14087h.m44470a(i4, bArr3, 0);
                    }
                }
                this.f30397b.reset();
                return (int) j;
            }
            throw new IllegalArgumentException("Output length too large");
        }
        throw new C13716t("output buffer too small");
    }
}
