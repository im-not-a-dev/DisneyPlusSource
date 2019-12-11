package p602m.p613d.p627b.p632d0;

import p602m.p613d.p627b.C13697f;

/* renamed from: m.d.b.d0.n */
/* compiled from: ParametersWithIV */
public class C13693n implements C13697f {

    /* renamed from: U */
    private C13697f f30452U;

    /* renamed from: c */
    private byte[] f30453c;

    public C13693n(C13697f fVar, byte[] bArr) {
        this(fVar, bArr, 0, bArr.length);
    }

    /* renamed from: a */
    public byte[] mo34947a() {
        return this.f30453c;
    }

    /* renamed from: b */
    public C13697f mo34948b() {
        return this.f30452U;
    }

    public C13693n(C13697f fVar, byte[] bArr, int i, int i2) {
        this.f30453c = new byte[i2];
        this.f30452U = fVar;
        System.arraycopy(bArr, i, this.f30453c, 0, i2);
    }
}
