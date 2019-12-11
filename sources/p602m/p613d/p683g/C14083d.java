package p602m.p613d.p683g;

import p602m.p613d.p627b.p637y.C13730j;

/* renamed from: m.d.g.d */
/* compiled from: Fingerprint */
public class C14083d {

    /* renamed from: b */
    private static char[] f31107b = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    /* renamed from: a */
    private final byte[] f31108a;

    public C14083d(byte[] bArr) {
        this.f31108a = m44466a(bArr);
    }

    /* renamed from: a */
    public static byte[] m44466a(byte[] bArr) {
        C13730j jVar = new C13730j(160);
        jVar.mo34972a(bArr, 0, bArr.length);
        byte[] bArr2 = new byte[jVar.mo34973b()];
        jVar.mo34970a(bArr2, 0);
        return bArr2;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C14083d) {
            return C14079a.m44446a(((C14083d) obj).f31108a, this.f31108a);
        }
        return false;
    }

    public int hashCode() {
        return C14079a.m44457b(this.f31108a);
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        for (int i = 0; i != this.f31108a.length; i++) {
            if (i > 0) {
                stringBuffer.append(":");
            }
            stringBuffer.append(f31107b[(this.f31108a[i] >>> 4) & 15]);
            stringBuffer.append(f31107b[this.f31108a[i] & 15]);
        }
        return stringBuffer.toString();
    }
}
