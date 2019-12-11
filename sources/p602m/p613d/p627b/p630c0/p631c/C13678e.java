package p602m.p613d.p627b.p630c0.p631c;

import java.lang.reflect.Array;
import p602m.p613d.p683g.C14079a;
import p602m.p613d.p683g.C14087h;

/* renamed from: m.d.b.c0.c.e */
/* compiled from: Tables8kGCMMultiplier */
public class C13678e implements C13675b {

    /* renamed from: a */
    private byte[] f30430a;

    /* renamed from: b */
    private int[][][] f30431b;

    /* renamed from: a */
    public void mo34923a(byte[] bArr) {
        if (this.f30431b == null) {
            this.f30431b = (int[][][]) Array.newInstance(int.class, new int[]{32, 16, 4});
        } else if (C14079a.m44446a(this.f30430a, bArr)) {
            return;
        }
        this.f30430a = C14079a.m44450a(bArr);
        C13676c.m42026a(bArr, this.f30431b[1][8]);
        for (int i = 4; i >= 1; i >>= 1) {
            int[][][] iArr = this.f30431b;
            C13676c.m42033b(iArr[1][i + i], iArr[1][i]);
        }
        int[][][] iArr2 = this.f30431b;
        int i2 = 0;
        C13676c.m42033b(iArr2[1][1], iArr2[0][8]);
        for (int i3 = 4; i3 >= 1; i3 >>= 1) {
            int[][][] iArr3 = this.f30431b;
            C13676c.m42033b(iArr3[0][i3 + i3], iArr3[0][i3]);
        }
        while (true) {
            for (int i4 = 2; i4 < 16; i4 += i4) {
                for (int i5 = 1; i5 < i4; i5++) {
                    int[][][] iArr4 = this.f30431b;
                    C13676c.m42029a(iArr4[i2][i4], iArr4[i2][i5], iArr4[i2][i4 + i5]);
                }
            }
            i2++;
            if (i2 != 32) {
                if (i2 > 1) {
                    for (int i6 = 8; i6 > 0; i6 >>= 1) {
                        int[][][] iArr5 = this.f30431b;
                        C13676c.m42035c(iArr5[i2 - 2][i6], iArr5[i2][i6]);
                    }
                }
            } else {
                return;
            }
        }
    }

    /* renamed from: b */
    public void mo34924b(byte[] bArr) {
        int[] iArr = new int[4];
        for (int i = 15; i >= 0; i--) {
            int[][][] iArr2 = this.f30431b;
            int i2 = i + i;
            int[] iArr3 = iArr2[i2][bArr[i] & 15];
            iArr[0] = iArr[0] ^ iArr3[0];
            iArr[1] = iArr[1] ^ iArr3[1];
            iArr[2] = iArr[2] ^ iArr3[2];
            iArr[3] = iArr3[3] ^ iArr[3];
            int[] iArr4 = iArr2[i2 + 1][(bArr[i] & 240) >>> 4];
            iArr[0] = iArr[0] ^ iArr4[0];
            iArr[1] = iArr[1] ^ iArr4[1];
            iArr[2] = iArr[2] ^ iArr4[2];
            iArr[3] = iArr[3] ^ iArr4[3];
        }
        C14087h.m44474a(iArr, bArr, 0);
    }
}
