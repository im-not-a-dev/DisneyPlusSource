package p602m.p613d.p627b.p637y;

import p602m.p613d.p627b.C13719w;

/* renamed from: m.d.b.y.k */
/* compiled from: SHAKEDigest */
public class C13731k extends C13723c implements C13719w {
    public C13731k(int i) {
        m42205a(i);
        super(i);
    }

    /* renamed from: a */
    private static int m42205a(int i) {
        if (i == 128 || i == 256) {
            return i;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("'bitLength' ");
        sb.append(i);
        sb.append(" not supported for SHAKE");
        throw new IllegalArgumentException(sb.toString());
    }

    /* renamed from: b */
    public int mo34978b(byte[] bArr, int i, int i2) {
        mo34992d(bArr, i, i2);
        reset();
        return i2;
    }

    /* renamed from: d */
    public int mo34992d(byte[] bArr, int i, int i2) {
        if (!this.f30482f) {
            mo34984a(15, 4);
        }
        mo34985a(bArr, i, ((long) i2) * 8);
        return i2;
    }

    /* renamed from: a */
    public String mo34971a() {
        StringBuilder sb = new StringBuilder();
        sb.append("SHAKE");
        sb.append(this.f30481e);
        return sb.toString();
    }

    /* renamed from: a */
    public int mo34970a(byte[] bArr, int i) {
        int b = mo34973b();
        mo34978b(bArr, i, b);
        return b;
    }
}
