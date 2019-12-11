package p602m.p613d.p662f.p681d.p682a;

/* renamed from: m.d.f.d.a.h */
/* compiled from: Permutation */
public class C14075h {

    /* renamed from: a */
    private int[] f31097a;

    public C14075h(byte[] bArr) {
        String str = "invalid encoding";
        if (bArr.length > 4) {
            int a = C14073f.m44405a(bArr, 0);
            int a2 = C14072e.m44403a(a - 1);
            if (bArr.length == (a * a2) + 4) {
                this.f31097a = new int[a];
                for (int i = 0; i < a; i++) {
                    this.f31097a[i] = C14073f.m44406a(bArr, (i * a2) + 4, a2);
                }
                if (!m44412a(this.f31097a)) {
                    throw new IllegalArgumentException(str);
                }
                return;
            }
            throw new IllegalArgumentException(str);
        }
        throw new IllegalArgumentException(str);
    }

    /* renamed from: a */
    public byte[] mo35635a() {
        int length = this.f31097a.length;
        int a = C14072e.m44403a(length - 1);
        byte[] bArr = new byte[((length * a) + 4)];
        C14073f.m44407a(length, bArr, 0);
        for (int i = 0; i < length; i++) {
            C14073f.m44408a(this.f31097a[i], bArr, (i * a) + 4, a);
        }
        return bArr;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C14075h)) {
            return false;
        }
        return C14071d.m44401a(this.f31097a, ((C14075h) obj).f31097a);
    }

    public int hashCode() {
        return this.f31097a.hashCode();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        sb.append(this.f31097a[0]);
        String sb2 = sb.toString();
        for (int i = 1; i < this.f31097a.length; i++) {
            StringBuilder sb3 = new StringBuilder();
            sb3.append(sb2);
            sb3.append(", ");
            sb3.append(this.f31097a[i]);
            sb2 = sb3.toString();
        }
        StringBuilder sb4 = new StringBuilder();
        sb4.append(sb2);
        sb4.append("]");
        return sb4.toString();
    }

    /* renamed from: a */
    private boolean m44412a(int[] iArr) {
        int length = iArr.length;
        boolean[] zArr = new boolean[length];
        for (int i = 0; i < length; i++) {
            if (iArr[i] < 0 || iArr[i] >= length || zArr[iArr[i]]) {
                return false;
            }
            zArr[iArr[i]] = true;
        }
        return true;
    }
}
