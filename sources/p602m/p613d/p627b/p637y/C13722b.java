package p602m.p613d.p627b.p637y;

import p602m.p613d.p627b.C13711o;
import p602m.p613d.p683g.C14086g;

/* renamed from: m.d.b.y.b */
/* compiled from: GeneralDigest */
public abstract class C13722b implements C13711o, C14086g {

    /* renamed from: a */
    private final byte[] f30472a = new byte[4];

    /* renamed from: b */
    private int f30473b = 0;

    /* renamed from: c */
    private long f30474c;

    protected C13722b() {
    }

    /* renamed from: a */
    public void mo34979a(byte b) {
        byte[] bArr = this.f30472a;
        int i = this.f30473b;
        this.f30473b = i + 1;
        bArr[i] = b;
        if (this.f30473b == bArr.length) {
            mo34981b(bArr, 0);
            this.f30473b = 0;
        }
        this.f30474c++;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo34980a(long j);

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract void mo34981b(byte[] bArr, int i);

    /* renamed from: c */
    public void mo34982c() {
        long j = this.f30474c << 3;
        mo34979a(Byte.MIN_VALUE);
        while (this.f30473b != 0) {
            mo34979a(0);
        }
        mo34980a(j);
        mo34983d();
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public abstract void mo34983d();

    public void reset() {
        this.f30474c = 0;
        this.f30473b = 0;
        int i = 0;
        while (true) {
            byte[] bArr = this.f30472a;
            if (i < bArr.length) {
                bArr[i] = 0;
                i++;
            } else {
                return;
            }
        }
    }

    /* renamed from: a */
    public void mo34972a(byte[] bArr, int i, int i2) {
        int i3 = 0;
        int max = Math.max(0, i2);
        if (this.f30473b != 0) {
            int i4 = 0;
            while (true) {
                if (i4 >= max) {
                    i3 = i4;
                    break;
                }
                byte[] bArr2 = this.f30472a;
                int i5 = this.f30473b;
                this.f30473b = i5 + 1;
                int i6 = i4 + 1;
                bArr2[i5] = bArr[i4 + i];
                if (this.f30473b == 4) {
                    mo34981b(bArr2, 0);
                    this.f30473b = 0;
                    i3 = i6;
                    break;
                }
                i4 = i6;
            }
        }
        int i7 = ((max - i3) & -4) + i3;
        while (i3 < i7) {
            mo34981b(bArr, i + i3);
            i3 += 4;
        }
        while (i3 < max) {
            byte[] bArr3 = this.f30472a;
            int i8 = this.f30473b;
            this.f30473b = i8 + 1;
            int i9 = i3 + 1;
            bArr3[i8] = bArr[i3 + i];
            i3 = i9;
        }
        this.f30474c += (long) max;
    }
}
