package p602m.p613d.p653e.p654a;

import java.math.BigInteger;

/* renamed from: m.d.e.a.p */
/* compiled from: SimpleBigDecimal */
class C13829p {

    /* renamed from: a */
    private final BigInteger f30683a;

    /* renamed from: b */
    private final int f30684b;

    public C13829p(BigInteger bigInteger, int i) {
        if (i >= 0) {
            this.f30683a = bigInteger;
            this.f30684b = i;
            return;
        }
        throw new IllegalArgumentException("scale may not be negative");
    }

    /* renamed from: c */
    private void m42598c(C13829p pVar) {
        if (this.f30684b != pVar.f30684b) {
            throw new IllegalArgumentException("Only SimpleBigDecimal of same scale allowed in arithmetic operations");
        }
    }

    /* renamed from: a */
    public C13829p mo35205a(int i) {
        if (i >= 0) {
            int i2 = this.f30684b;
            if (i == i2) {
                return this;
            }
            return new C13829p(this.f30683a.shiftLeft(i - i2), i);
        }
        throw new IllegalArgumentException("scale may not be negative");
    }

    /* renamed from: b */
    public C13829p mo35209b(C13829p pVar) {
        return mo35206a(pVar.mo35210c());
    }

    /* renamed from: d */
    public BigInteger mo35211d() {
        return mo35206a(new C13829p(C13805c.f30634b, 1).mo35205a(this.f30684b)).mo35204a();
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C13829p)) {
            return false;
        }
        C13829p pVar = (C13829p) obj;
        if (!this.f30683a.equals(pVar.f30683a) || this.f30684b != pVar.f30684b) {
            z = false;
        }
        return z;
    }

    public int hashCode() {
        return this.f30683a.hashCode() ^ this.f30684b;
    }

    public String toString() {
        if (this.f30684b == 0) {
            return this.f30683a.toString();
        }
        BigInteger a = mo35204a();
        BigInteger subtract = this.f30683a.subtract(a.shiftLeft(this.f30684b));
        if (this.f30683a.signum() == -1) {
            subtract = C13805c.f30634b.shiftLeft(this.f30684b).subtract(subtract);
        }
        if (a.signum() == -1 && !subtract.equals(C13805c.f30633a)) {
            a = a.add(C13805c.f30634b);
        }
        String bigInteger = a.toString();
        char[] cArr = new char[this.f30684b];
        String bigInteger2 = subtract.toString(2);
        int length = bigInteger2.length();
        int i = this.f30684b - length;
        for (int i2 = 0; i2 < i; i2++) {
            cArr[i2] = '0';
        }
        for (int i3 = 0; i3 < length; i3++) {
            cArr[i + i3] = bigInteger2.charAt(i3);
        }
        String str = new String(cArr);
        StringBuffer stringBuffer = new StringBuffer(bigInteger);
        stringBuffer.append(".");
        stringBuffer.append(str);
        return stringBuffer.toString();
    }

    /* renamed from: b */
    public C13829p mo35208b(BigInteger bigInteger) {
        return new C13829p(this.f30683a.subtract(bigInteger.shiftLeft(this.f30684b)), this.f30684b);
    }

    /* renamed from: b */
    public int mo35207b() {
        return this.f30684b;
    }

    /* renamed from: c */
    public C13829p mo35210c() {
        return new C13829p(this.f30683a.negate(), this.f30684b);
    }

    /* renamed from: a */
    public C13829p mo35206a(C13829p pVar) {
        m42598c(pVar);
        return new C13829p(this.f30683a.add(pVar.f30683a), this.f30684b);
    }

    /* renamed from: a */
    public int mo35203a(BigInteger bigInteger) {
        return this.f30683a.compareTo(bigInteger.shiftLeft(this.f30684b));
    }

    /* renamed from: a */
    public BigInteger mo35204a() {
        return this.f30683a.shiftRight(this.f30684b);
    }
}
