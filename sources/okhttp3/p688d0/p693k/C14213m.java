package okhttp3.p688d0.p693k;

import java.util.Arrays;

/* renamed from: okhttp3.d0.k.m */
/* compiled from: Settings */
public final class C14213m {

    /* renamed from: a */
    private int f31696a;

    /* renamed from: b */
    private final int[] f31697b = new int[10];

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo36115a() {
        this.f31696a = 0;
        Arrays.fill(this.f31697b, 0);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public int mo36117b() {
        if ((this.f31696a & 2) != 0) {
            return this.f31697b[1];
        }
        return -1;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public int mo36120c(int i) {
        return (this.f31696a & 32) != 0 ? this.f31697b[5] : i;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public boolean mo36122d(int i) {
        return ((1 << i) & this.f31696a) != 0;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public int mo36118b(int i) {
        return (this.f31696a & 16) != 0 ? this.f31697b[4] : i;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public int mo36119c() {
        if ((this.f31696a & 128) != 0) {
            return this.f31697b[7];
        }
        return 65535;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public int mo36121d() {
        return Integer.bitCount(this.f31696a);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public C14213m mo36114a(int i, int i2) {
        if (i >= 0) {
            int[] iArr = this.f31697b;
            if (i < iArr.length) {
                this.f31696a = (1 << i) | this.f31696a;
                iArr[i] = i2;
            }
        }
        return this;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public int mo36113a(int i) {
        return this.f31697b[i];
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo36116a(C14213m mVar) {
        for (int i = 0; i < 10; i++) {
            if (mVar.mo36122d(i)) {
                mo36114a(i, mVar.mo36113a(i));
            }
        }
    }
}
