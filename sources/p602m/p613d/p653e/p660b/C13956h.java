package p602m.p613d.p653e.p660b;

import java.math.BigInteger;

/* renamed from: m.d.e.b.h */
/* compiled from: PrimeField */
class C13956h implements C13950b {

    /* renamed from: a */
    protected final BigInteger f30840a;

    C13956h(BigInteger bigInteger) {
        this.f30840a = bigInteger;
    }

    /* renamed from: b */
    public int mo35283b() {
        return 1;
    }

    /* renamed from: c */
    public BigInteger mo35284c() {
        return this.f30840a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C13956h)) {
            return false;
        }
        return this.f30840a.equals(((C13956h) obj).f30840a);
    }

    public int hashCode() {
        return this.f30840a.hashCode();
    }
}
