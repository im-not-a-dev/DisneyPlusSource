package p602m.p613d.p653e.p660b;

import p602m.p613d.p683g.C14079a;

/* renamed from: m.d.e.b.d */
/* compiled from: GF2Polynomial */
class C13952d implements C13954f {

    /* renamed from: a */
    protected final int[] f30837a;

    C13952d(int[] iArr) {
        this.f30837a = C14079a.m44453a(iArr);
    }

    /* renamed from: a */
    public int[] mo35285a() {
        return C14079a.m44453a(this.f30837a);
    }

    /* renamed from: b */
    public int mo35286b() {
        int[] iArr = this.f30837a;
        return iArr[iArr.length - 1];
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C13952d)) {
            return false;
        }
        return C14079a.m44448a(this.f30837a, ((C13952d) obj).f30837a);
    }

    public int hashCode() {
        return C14079a.m44458b(this.f30837a);
    }
}
