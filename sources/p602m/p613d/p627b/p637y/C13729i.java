package p602m.p613d.p627b.p637y;

import p602m.p613d.p683g.C14087h;

/* renamed from: m.d.b.y.i */
/* compiled from: SHA512Digest */
public class C13729i extends C13724d {
    /* renamed from: a */
    public int mo34970a(byte[] bArr, int i) {
        mo34990c();
        C14087h.m44471a(this.f30488e, bArr, i);
        C14087h.m44471a(this.f30489f, bArr, i + 8);
        C14087h.m44471a(this.f30490g, bArr, i + 16);
        C14087h.m44471a(this.f30491h, bArr, i + 24);
        C14087h.m44471a(this.f30492i, bArr, i + 32);
        C14087h.m44471a(this.f30493j, bArr, i + 40);
        C14087h.m44471a(this.f30494k, bArr, i + 48);
        C14087h.m44471a(this.f30495l, bArr, i + 56);
        reset();
        return 64;
    }

    /* renamed from: a */
    public String mo34971a() {
        return "SHA-512";
    }

    /* renamed from: b */
    public int mo34973b() {
        return 64;
    }

    public void reset() {
        super.reset();
        this.f30488e = 7640891576956012808L;
        this.f30489f = -4942790177534073029L;
        this.f30490g = 4354685564936845355L;
        this.f30491h = -6534734903238641935L;
        this.f30492i = 5840696475078001361L;
        this.f30493j = -7276294671716946913L;
        this.f30494k = 2270897969802886507L;
        this.f30495l = 6620516959819538809L;
    }
}
