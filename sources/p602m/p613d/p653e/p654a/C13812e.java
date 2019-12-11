package p602m.p613d.p653e.p654a;

import java.math.BigInteger;
import java.util.Random;
import p602m.p613d.p653e.p661c.C13958b;
import p602m.p613d.p653e.p661c.C13969m;
import p602m.p613d.p683g.C14079a;
import p602m.p613d.p683g.C14081b;

/* renamed from: m.d.e.a.e */
/* compiled from: ECFieldElement */
public abstract class C13812e implements C13805c {

    /* renamed from: m.d.e.a.e$a */
    /* compiled from: ECFieldElement */
    public static class C13813a extends C13812e {

        /* renamed from: g */
        private int f30660g;

        /* renamed from: h */
        private int f30661h;

        /* renamed from: i */
        private int[] f30662i;

        /* renamed from: j */
        private C13826m f30663j;

        public C13813a(int i, int i2, int i3, int i4, BigInteger bigInteger) {
            if (bigInteger == null || bigInteger.signum() < 0 || bigInteger.bitLength() > i) {
                throw new IllegalArgumentException("x value invalid in F2m field element");
            }
            if (i3 == 0 && i4 == 0) {
                this.f30660g = 2;
                this.f30662i = new int[]{i2};
            } else if (i3 >= i4) {
                throw new IllegalArgumentException("k2 must be smaller than k3");
            } else if (i3 > 0) {
                this.f30660g = 3;
                this.f30662i = new int[]{i2, i3, i4};
            } else {
                throw new IllegalArgumentException("k2 must be larger than 0");
            }
            this.f30661h = i;
            this.f30663j = new C13826m(bigInteger);
        }

        /* renamed from: a */
        public C13812e mo35100a(C13812e eVar) {
            C13826m mVar = (C13826m) this.f30663j.clone();
            mVar.mo35188a(((C13813a) eVar).f30663j, 0);
            return new C13813a(this.f30661h, this.f30662i, mVar);
        }

        /* renamed from: b */
        public int mo35103b() {
            return this.f30663j.mo35189b();
        }

        /* renamed from: c */
        public C13812e mo35106c(C13812e eVar) {
            int i = this.f30661h;
            int[] iArr = this.f30662i;
            return new C13813a(i, iArr, this.f30663j.mo35187a(((C13813a) eVar).f30663j, i, iArr));
        }

        /* renamed from: d */
        public int mo35108d() {
            return this.f30661h;
        }

        /* renamed from: e */
        public C13812e mo35110e() {
            int i = this.f30661h;
            int[] iArr = this.f30662i;
            return new C13813a(i, iArr, this.f30663j.mo35186a(i, iArr));
        }

        public boolean equals(Object obj) {
            boolean z = true;
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof C13813a)) {
                return false;
            }
            C13813a aVar = (C13813a) obj;
            if (this.f30661h != aVar.f30661h || this.f30660g != aVar.f30660g || !C14079a.m44448a(this.f30662i, aVar.f30662i) || !this.f30663j.equals(aVar.f30663j)) {
                z = false;
            }
            return z;
        }

        /* renamed from: f */
        public boolean mo35111f() {
            return this.f30663j.mo35196d();
        }

        /* renamed from: g */
        public boolean mo35112g() {
            return this.f30663j.mo35197e();
        }

        /* renamed from: h */
        public C13812e mo35113h() {
            return this;
        }

        public int hashCode() {
            return (this.f30663j.hashCode() ^ this.f30661h) ^ C14079a.m44458b(this.f30662i);
        }

        /* renamed from: i */
        public C13812e mo35114i() {
            return (this.f30663j.mo35197e() || this.f30663j.mo35196d()) ? this : mo35099a(this.f30661h - 1);
        }

        /* renamed from: j */
        public C13812e mo35115j() {
            int i = this.f30661h;
            int[] iArr = this.f30662i;
            return new C13813a(i, iArr, this.f30663j.mo35190b(i, iArr));
        }

        /* renamed from: k */
        public boolean mo35116k() {
            return this.f30663j.mo35199f();
        }

        /* renamed from: l */
        public BigInteger mo35117l() {
            return this.f30663j.mo35200g();
        }

        /* renamed from: b */
        public static void m42434b(C13812e eVar, C13812e eVar2) {
            if (!(eVar instanceof C13813a) || !(eVar2 instanceof C13813a)) {
                throw new IllegalArgumentException("Field elements are not both instances of ECFieldElement.F2m");
            }
            C13813a aVar = (C13813a) eVar;
            C13813a aVar2 = (C13813a) eVar2;
            if (aVar.f30660g != aVar2.f30660g) {
                throw new IllegalArgumentException("One of the F2m field elements has incorrect representation");
            } else if (aVar.f30661h != aVar2.f30661h || !C14079a.m44448a(aVar.f30662i, aVar2.f30662i)) {
                throw new IllegalArgumentException("Field elements are not elements of the same field F2m");
            }
        }

        /* renamed from: d */
        public C13812e mo35109d(C13812e eVar) {
            return mo35100a(eVar);
        }

        /* renamed from: a */
        public C13812e mo35098a() {
            return new C13813a(this.f30661h, this.f30662i, this.f30663j.mo35184a());
        }

        /* renamed from: a */
        public C13812e mo35102a(C13812e eVar, C13812e eVar2, C13812e eVar3) {
            return mo35105b(eVar, eVar2, eVar3);
        }

        /* renamed from: a */
        public C13812e mo35101a(C13812e eVar, C13812e eVar2) {
            C13826m mVar = this.f30663j;
            C13826m mVar2 = ((C13813a) eVar).f30663j;
            C13826m mVar3 = ((C13813a) eVar2).f30663j;
            C13826m d = mVar.mo35195d(this.f30661h, this.f30662i);
            C13826m b = mVar2.mo35191b(mVar3, this.f30661h, this.f30662i);
            if (d == mVar) {
                d = (C13826m) d.clone();
            }
            d.mo35188a(b, 0);
            d.mo35193c(this.f30661h, this.f30662i);
            return new C13813a(this.f30661h, this.f30662i, d);
        }

        /* renamed from: b */
        public C13812e mo35105b(C13812e eVar, C13812e eVar2, C13812e eVar3) {
            C13826m mVar = this.f30663j;
            C13826m mVar2 = ((C13813a) eVar).f30663j;
            C13826m mVar3 = ((C13813a) eVar2).f30663j;
            C13826m mVar4 = ((C13813a) eVar3).f30663j;
            C13826m b = mVar.mo35191b(mVar2, this.f30661h, this.f30662i);
            C13826m b2 = mVar3.mo35191b(mVar4, this.f30661h, this.f30662i);
            if (b == mVar || b == mVar2) {
                b = (C13826m) b.clone();
            }
            b.mo35188a(b2, 0);
            b.mo35193c(this.f30661h, this.f30662i);
            return new C13813a(this.f30661h, this.f30662i, b);
        }

        private C13813a(int i, int[] iArr, C13826m mVar) {
            this.f30661h = i;
            this.f30660g = iArr.length == 1 ? 2 : 3;
            this.f30662i = iArr;
            this.f30663j = mVar;
        }

        /* renamed from: a */
        public C13812e mo35099a(int i) {
            if (i < 1) {
                return this;
            }
            int i2 = this.f30661h;
            int[] iArr = this.f30662i;
            return new C13813a(i2, iArr, this.f30663j.mo35185a(i, i2, iArr));
        }

        /* renamed from: b */
        public C13812e mo35104b(C13812e eVar) {
            return mo35106c(eVar.mo35110e());
        }
    }

    /* renamed from: m.d.e.a.e$b */
    /* compiled from: ECFieldElement */
    public static class C13814b extends C13812e {

        /* renamed from: g */
        BigInteger f30664g;

        /* renamed from: h */
        BigInteger f30665h;

        /* renamed from: i */
        BigInteger f30666i;

        public C13814b(BigInteger bigInteger, BigInteger bigInteger2) {
            this(bigInteger, m42455e(bigInteger), bigInteger2);
        }

        /* renamed from: e */
        static BigInteger m42455e(BigInteger bigInteger) {
            int bitLength = bigInteger.bitLength();
            if (bitLength < 96 || bigInteger.shiftRight(bitLength - 64).longValue() != -1) {
                return null;
            }
            return C13805c.f30634b.shiftLeft(bitLength).subtract(bigInteger);
        }

        /* renamed from: a */
        public C13812e mo35100a(C13812e eVar) {
            return new C13814b(this.f30664g, this.f30665h, mo35122a(this.f30666i, eVar.mo35117l()));
        }

        /* renamed from: b */
        public C13812e mo35105b(C13812e eVar, C13812e eVar2, C13812e eVar3) {
            BigInteger bigInteger = this.f30666i;
            BigInteger l = eVar.mo35117l();
            BigInteger l2 = eVar2.mo35117l();
            BigInteger l3 = eVar3.mo35117l();
            return new C13814b(this.f30664g, this.f30665h, mo35127d(bigInteger.multiply(l).add(l2.multiply(l3))));
        }

        /* renamed from: c */
        public C13812e mo35106c(C13812e eVar) {
            return new C13814b(this.f30664g, this.f30665h, mo35124b(this.f30666i, eVar.mo35117l()));
        }

        /* renamed from: d */
        public int mo35108d() {
            return this.f30664g.bitLength();
        }

        public boolean equals(Object obj) {
            boolean z = true;
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof C13814b)) {
                return false;
            }
            C13814b bVar = (C13814b) obj;
            if (!this.f30664g.equals(bVar.f30664g) || !this.f30666i.equals(bVar.f30666i)) {
                z = false;
            }
            return z;
        }

        /* renamed from: h */
        public C13812e mo35113h() {
            if (this.f30666i.signum() == 0) {
                return this;
            }
            BigInteger bigInteger = this.f30664g;
            return new C13814b(bigInteger, this.f30665h, bigInteger.subtract(this.f30666i));
        }

        public int hashCode() {
            return this.f30664g.hashCode() ^ this.f30666i.hashCode();
        }

        /* renamed from: i */
        public C13812e mo35114i() {
            if (mo35112g() || mo35111f()) {
                return this;
            }
            if (!this.f30664g.testBit(0)) {
                throw new RuntimeException("not done yet");
            } else if (this.f30664g.testBit(1)) {
                BigInteger add = this.f30664g.shiftRight(2).add(C13805c.f30634b);
                BigInteger bigInteger = this.f30664g;
                return m42456e((C13812e) new C13814b(bigInteger, this.f30665h, this.f30666i.modPow(add, bigInteger)));
            } else if (this.f30664g.testBit(2)) {
                BigInteger modPow = this.f30666i.modPow(this.f30664g.shiftRight(3), this.f30664g);
                BigInteger b = mo35124b(modPow, this.f30666i);
                if (mo35124b(b, modPow).equals(C13805c.f30634b)) {
                    return m42456e((C13812e) new C13814b(this.f30664g, this.f30665h, b));
                }
                return m42456e((C13812e) new C13814b(this.f30664g, this.f30665h, mo35124b(b, C13805c.f30635c.modPow(this.f30664g.shiftRight(2), this.f30664g))));
            } else {
                BigInteger shiftRight = this.f30664g.shiftRight(1);
                if (!this.f30666i.modPow(shiftRight, this.f30664g).equals(C13805c.f30634b)) {
                    return null;
                }
                BigInteger bigInteger2 = this.f30666i;
                BigInteger a = mo35121a(mo35121a(bigInteger2));
                BigInteger add2 = shiftRight.add(C13805c.f30634b);
                BigInteger subtract = this.f30664g.subtract(C13805c.f30634b);
                Random random = new Random();
                while (true) {
                    BigInteger bigInteger3 = new BigInteger(this.f30664g.bitLength(), random);
                    if (bigInteger3.compareTo(this.f30664g) < 0 && mo35127d(bigInteger3.multiply(bigInteger3).subtract(a)).modPow(shiftRight, this.f30664g).equals(subtract)) {
                        BigInteger[] a2 = m42454a(bigInteger3, bigInteger2, add2);
                        BigInteger bigInteger4 = a2[0];
                        BigInteger bigInteger5 = a2[1];
                        if (mo35124b(bigInteger5, bigInteger5).equals(a)) {
                            return new C13814b(this.f30664g, this.f30665h, mo35123b(bigInteger5));
                        }
                        if (!bigInteger4.equals(C13805c.f30634b) && !bigInteger4.equals(subtract)) {
                            return null;
                        }
                    }
                }
            }
        }

        /* renamed from: j */
        public C13812e mo35115j() {
            BigInteger bigInteger = this.f30664g;
            BigInteger bigInteger2 = this.f30665h;
            BigInteger bigInteger3 = this.f30666i;
            return new C13814b(bigInteger, bigInteger2, mo35124b(bigInteger3, bigInteger3));
        }

        /* renamed from: l */
        public BigInteger mo35117l() {
            return this.f30666i;
        }

        C13814b(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3) {
            if (bigInteger3 == null || bigInteger3.signum() < 0 || bigInteger3.compareTo(bigInteger) >= 0) {
                throw new IllegalArgumentException("x value invalid in Fp field element");
            }
            this.f30664g = bigInteger;
            this.f30665h = bigInteger2;
            this.f30666i = bigInteger3;
        }

        /* renamed from: a */
        public C13812e mo35098a() {
            BigInteger add = this.f30666i.add(C13805c.f30634b);
            if (add.compareTo(this.f30664g) == 0) {
                add = C13805c.f30633a;
            }
            return new C13814b(this.f30664g, this.f30665h, add);
        }

        /* access modifiers changed from: protected */
        /* renamed from: c */
        public BigInteger mo35125c(BigInteger bigInteger) {
            int d = mo35108d();
            int i = (d + 31) >> 5;
            int[] a = C13969m.m44012a(d, this.f30664g);
            int[] a2 = C13969m.m44012a(d, bigInteger);
            int[] a3 = C13969m.m44011a(i);
            C13958b.m43830a(a, a2, a3);
            return C13969m.m44034f(i, a3);
        }

        /* renamed from: d */
        public C13812e mo35109d(C13812e eVar) {
            return new C13814b(this.f30664g, this.f30665h, mo35126c(this.f30666i, eVar.mo35117l()));
        }

        /* access modifiers changed from: protected */
        /* renamed from: d */
        public BigInteger mo35127d(BigInteger bigInteger) {
            if (this.f30665h == null) {
                return bigInteger.mod(this.f30664g);
            }
            boolean z = bigInteger.signum() < 0;
            if (z) {
                bigInteger = bigInteger.abs();
            }
            int bitLength = this.f30664g.bitLength();
            boolean equals = this.f30665h.equals(C13805c.f30634b);
            while (bigInteger.bitLength() > bitLength + 1) {
                BigInteger shiftRight = bigInteger.shiftRight(bitLength);
                BigInteger subtract = bigInteger.subtract(shiftRight.shiftLeft(bitLength));
                if (!equals) {
                    shiftRight = shiftRight.multiply(this.f30665h);
                }
                bigInteger = shiftRight.add(subtract);
            }
            while (bigInteger.compareTo(this.f30664g) >= 0) {
                bigInteger = bigInteger.subtract(this.f30664g);
            }
            if (!z || bigInteger.signum() == 0) {
                return bigInteger;
            }
            return this.f30664g.subtract(bigInteger);
        }

        /* renamed from: b */
        public C13812e mo35104b(C13812e eVar) {
            return new C13814b(this.f30664g, this.f30665h, mo35124b(this.f30666i, mo35125c(eVar.mo35117l())));
        }

        /* renamed from: e */
        public C13812e mo35110e() {
            return new C13814b(this.f30664g, this.f30665h, mo35125c(this.f30666i));
        }

        /* renamed from: e */
        private C13812e m42456e(C13812e eVar) {
            if (eVar.mo35115j().equals(this)) {
                return eVar;
            }
            return null;
        }

        /* renamed from: a */
        public C13812e mo35102a(C13812e eVar, C13812e eVar2, C13812e eVar3) {
            BigInteger bigInteger = this.f30666i;
            BigInteger l = eVar.mo35117l();
            BigInteger l2 = eVar2.mo35117l();
            BigInteger l3 = eVar3.mo35117l();
            return new C13814b(this.f30664g, this.f30665h, mo35127d(bigInteger.multiply(l).subtract(l2.multiply(l3))));
        }

        /* access modifiers changed from: protected */
        /* renamed from: b */
        public BigInteger mo35123b(BigInteger bigInteger) {
            if (bigInteger.testBit(0)) {
                bigInteger = this.f30664g.subtract(bigInteger);
            }
            return bigInteger.shiftRight(1);
        }

        /* access modifiers changed from: protected */
        /* renamed from: c */
        public BigInteger mo35126c(BigInteger bigInteger, BigInteger bigInteger2) {
            BigInteger subtract = bigInteger.subtract(bigInteger2);
            return subtract.signum() < 0 ? subtract.add(this.f30664g) : subtract;
        }

        /* access modifiers changed from: protected */
        /* renamed from: b */
        public BigInteger mo35124b(BigInteger bigInteger, BigInteger bigInteger2) {
            return mo35127d(bigInteger.multiply(bigInteger2));
        }

        /* renamed from: a */
        public C13812e mo35101a(C13812e eVar, C13812e eVar2) {
            BigInteger bigInteger = this.f30666i;
            BigInteger l = eVar.mo35117l();
            BigInteger l2 = eVar2.mo35117l();
            return new C13814b(this.f30664g, this.f30665h, mo35127d(bigInteger.multiply(bigInteger).add(l.multiply(l2))));
        }

        /* renamed from: a */
        private BigInteger[] m42454a(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3) {
            int bitLength = bigInteger3.bitLength();
            int lowestSetBit = bigInteger3.getLowestSetBit();
            BigInteger bigInteger4 = C13805c.f30634b;
            BigInteger bigInteger5 = C13805c.f30635c;
            BigInteger bigInteger6 = C13805c.f30634b;
            BigInteger bigInteger7 = bigInteger;
            BigInteger bigInteger8 = bigInteger5;
            BigInteger bigInteger9 = bigInteger4;
            BigInteger bigInteger10 = bigInteger6;
            for (int i = bitLength - 1; i >= lowestSetBit + 1; i--) {
                bigInteger6 = mo35124b(bigInteger6, bigInteger10);
                if (bigInteger3.testBit(i)) {
                    bigInteger10 = mo35124b(bigInteger6, bigInteger2);
                    bigInteger9 = mo35124b(bigInteger9, bigInteger7);
                    bigInteger8 = mo35127d(bigInteger7.multiply(bigInteger8).subtract(bigInteger.multiply(bigInteger6)));
                    bigInteger7 = mo35127d(bigInteger7.multiply(bigInteger7).subtract(bigInteger10.shiftLeft(1)));
                } else {
                    BigInteger d = mo35127d(bigInteger9.multiply(bigInteger8).subtract(bigInteger6));
                    BigInteger d2 = mo35127d(bigInteger7.multiply(bigInteger8).subtract(bigInteger.multiply(bigInteger6)));
                    bigInteger8 = mo35127d(bigInteger8.multiply(bigInteger8).subtract(bigInteger6.shiftLeft(1)));
                    bigInteger7 = d2;
                    bigInteger9 = d;
                    bigInteger10 = bigInteger6;
                }
            }
            BigInteger b = mo35124b(bigInteger6, bigInteger10);
            BigInteger b2 = mo35124b(b, bigInteger2);
            BigInteger d3 = mo35127d(bigInteger9.multiply(bigInteger8).subtract(b));
            BigInteger d4 = mo35127d(bigInteger7.multiply(bigInteger8).subtract(bigInteger.multiply(b)));
            BigInteger b3 = mo35124b(b, b2);
            BigInteger bigInteger11 = d4;
            for (int i2 = 1; i2 <= lowestSetBit; i2++) {
                d3 = mo35124b(d3, bigInteger11);
                bigInteger11 = mo35127d(bigInteger11.multiply(bigInteger11).subtract(b3.shiftLeft(1)));
                b3 = mo35124b(b3, b3);
            }
            return new BigInteger[]{d3, bigInteger11};
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public BigInteger mo35122a(BigInteger bigInteger, BigInteger bigInteger2) {
            BigInteger add = bigInteger.add(bigInteger2);
            return add.compareTo(this.f30664g) >= 0 ? add.subtract(this.f30664g) : add;
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public BigInteger mo35121a(BigInteger bigInteger) {
            BigInteger shiftLeft = bigInteger.shiftLeft(1);
            return shiftLeft.compareTo(this.f30664g) >= 0 ? shiftLeft.subtract(this.f30664g) : shiftLeft;
        }
    }

    /* renamed from: a */
    public abstract C13812e mo35098a();

    /* renamed from: a */
    public abstract C13812e mo35100a(C13812e eVar);

    /* renamed from: a */
    public C13812e mo35102a(C13812e eVar, C13812e eVar2, C13812e eVar3) {
        return mo35106c(eVar).mo35109d(eVar2.mo35106c(eVar3));
    }

    /* renamed from: b */
    public int mo35103b() {
        return mo35117l().bitLength();
    }

    /* renamed from: b */
    public abstract C13812e mo35104b(C13812e eVar);

    /* renamed from: c */
    public abstract C13812e mo35106c(C13812e eVar);

    /* renamed from: c */
    public byte[] mo35107c() {
        return C14081b.m44465a((mo35108d() + 7) / 8, mo35117l());
    }

    /* renamed from: d */
    public abstract int mo35108d();

    /* renamed from: d */
    public abstract C13812e mo35109d(C13812e eVar);

    /* renamed from: e */
    public abstract C13812e mo35110e();

    /* renamed from: f */
    public boolean mo35111f() {
        return mo35103b() == 1;
    }

    /* renamed from: g */
    public boolean mo35112g() {
        return mo35117l().signum() == 0;
    }

    /* renamed from: h */
    public abstract C13812e mo35113h();

    /* renamed from: i */
    public abstract C13812e mo35114i();

    /* renamed from: j */
    public abstract C13812e mo35115j();

    /* renamed from: k */
    public boolean mo35116k() {
        return mo35117l().testBit(0);
    }

    /* renamed from: l */
    public abstract BigInteger mo35117l();

    public String toString() {
        return mo35117l().toString(16);
    }

    /* renamed from: a */
    public C13812e mo35101a(C13812e eVar, C13812e eVar2) {
        return mo35115j().mo35100a(eVar.mo35106c(eVar2));
    }

    /* renamed from: b */
    public C13812e mo35105b(C13812e eVar, C13812e eVar2, C13812e eVar3) {
        return mo35106c(eVar).mo35100a(eVar2.mo35106c(eVar3));
    }

    /* renamed from: a */
    public C13812e mo35099a(int i) {
        C13812e eVar = this;
        for (int i2 = 0; i2 < i; i2++) {
            eVar = eVar.mo35115j();
        }
        return eVar;
    }
}
