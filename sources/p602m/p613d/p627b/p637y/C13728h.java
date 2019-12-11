package p602m.p613d.p627b.p637y;

import p602m.p613d.p683g.C14087h;

/* renamed from: m.d.b.y.h */
/* compiled from: SHA384Digest */
public class C13728h extends C13724d {
    /* renamed from: a */
    public int mo34970a(byte[] bArr, int i) {
        mo34990c();
        C14087h.m44471a(this.f30488e, bArr, i);
        C14087h.m44471a(this.f30489f, bArr, i + 8);
        C14087h.m44471a(this.f30490g, bArr, i + 16);
        C14087h.m44471a(this.f30491h, bArr, i + 24);
        C14087h.m44471a(this.f30492i, bArr, i + 32);
        C14087h.m44471a(this.f30493j, bArr, i + 40);
        reset();
        return 48;
    }

    /* renamed from: a */
    public String mo34971a() {
        return "SHA-384";
    }

    /* renamed from: b */
    public int mo34973b() {
        return 48;
    }

    public void reset() {
        super.reset();
        this.f30488e = -3766243637369397544L;
        this.f30489f = 7105036623409894663L;
        this.f30490g = -7973340178411365097L;
        this.f30491h = 1526699215303891257L;
        this.f30492i = 7436329637833083697L;
        this.f30493j = -8163818279084223215L;
        this.f30494k = -2662702644619276377L;
        this.f30495l = 5167115440072839076L;
    }
}
