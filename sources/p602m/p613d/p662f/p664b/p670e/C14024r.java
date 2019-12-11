package p602m.p613d.p662f.p664b.p670e;

import java.io.Serializable;

/* renamed from: m.d.f.b.e.r */
/* compiled from: XMSSNode */
public final class C14024r implements Serializable {

    /* renamed from: U */
    private final byte[] f31026U;

    /* renamed from: c */
    private final int f31027c;

    protected C14024r(int i, byte[] bArr) {
        this.f31027c = i;
        this.f31026U = bArr;
    }

    /* renamed from: a */
    public int mo35454a() {
        return this.f31027c;
    }

    /* renamed from: b */
    public byte[] mo35455b() {
        return C14035y.m44322a(this.f31026U);
    }

    /* access modifiers changed from: protected */
    public C14024r clone() {
        return new C14024r(mo35454a(), mo35455b());
    }
}
