package p602m.p613d.p653e.p654a;

import java.math.BigInteger;
import java.util.Hashtable;
import java.util.Random;
import p602m.p613d.p653e.p654a.C13812e.C13813a;
import p602m.p613d.p653e.p654a.C13812e.C13814b;
import p602m.p613d.p653e.p654a.C13816g.C13819c;
import p602m.p613d.p653e.p654a.C13816g.C13820d;
import p602m.p613d.p653e.p654a.p659y.C13945a;
import p602m.p613d.p653e.p654a.p659y.C13946b;
import p602m.p613d.p653e.p660b.C13950b;
import p602m.p613d.p653e.p660b.C13951c;
import p602m.p613d.p683g.C14081b;
import p602m.p613d.p683g.C14084e;
import p602m.p613d.p683g.p684k.C14097f;

/* renamed from: m.d.e.a.d */
/* compiled from: ECCurve */
public abstract class C13806d {

    /* renamed from: a */
    protected C13950b f30639a;

    /* renamed from: b */
    protected C13812e f30640b = mo35061a(BigInteger.valueOf(1));

    /* renamed from: c */
    protected C13812e f30641c = mo35061a(new BigInteger(1, C14097f.m44507a("0066647EDE6C332C7F8C0923BB58213B333B20E9CE4281FE115F7D8F90AD")));

    /* renamed from: d */
    protected BigInteger f30642d = new BigInteger(1, C14097f.m44507a("01000000000000000000000000000013E974E72F8A6922031D2603CFE0D7"));

    /* renamed from: e */
    protected BigInteger f30643e = BigInteger.valueOf(2);

    /* renamed from: f */
    protected int f30644f = 6;

    /* renamed from: g */
    protected C13945a f30645g = null;

    /* renamed from: h */
    protected C13815f f30646h = null;

    /* renamed from: m.d.e.a.d$a */
    /* compiled from: ECCurve */
    public static abstract class C13807a extends C13806d {

        /* renamed from: i */
        private BigInteger[] f30647i = null;

        protected C13807a(int i, int i2, int i3, int i4) {
            super(m42388a(i, i2, i3, i4));
        }

        /* renamed from: a */
        private static C13950b m42388a(int i, int i2, int i3, int i4) {
            if (i2 == 0) {
                throw new IllegalArgumentException("k1 must be > 0");
            } else if (i3 == 0) {
                if (i4 == 0) {
                    return C13951c.m43811a(new int[]{0, i2, i});
                }
                throw new IllegalArgumentException("k3 must be 0 if k2 == 0");
            } else if (i3 <= i2) {
                throw new IllegalArgumentException("k2 must be > k1");
            } else if (i4 > i3) {
                return C13951c.m43811a(new int[]{0, i2, i3, i4, i});
            } else {
                throw new IllegalArgumentException("k3 must be > k2");
            }
        }

        /* renamed from: b */
        public boolean mo35080b(BigInteger bigInteger) {
            return bigInteger != null && bigInteger.signum() >= 0 && bigInteger.bitLength() <= mo35090j();
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: n */
        public synchronized BigInteger[] mo35094n() {
            if (this.f30647i == null) {
                this.f30647i = C13830q.m42618a(this);
            }
            return this.f30647i;
        }

        /* renamed from: o */
        public boolean mo35095o() {
            return this.f30642d != null && this.f30643e != null && this.f30641c.mo35111f() && (this.f30640b.mo35112g() || this.f30640b.mo35111f());
        }

        /* renamed from: a */
        public C13816g mo35064a(BigInteger bigInteger, BigInteger bigInteger2, boolean z) {
            C13812e a = mo35061a(bigInteger);
            C13812e a2 = mo35061a(bigInteger2);
            int g = mo35086g();
            if (g == 5 || g == 6) {
                if (!a.mo35112g()) {
                    a2 = a2.mo35104b(a).mo35100a(a);
                } else if (!a2.mo35115j().equals(mo35083e())) {
                    throw new IllegalArgumentException();
                }
            }
            return mo35065a(a, a2, z);
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public C13816g mo35062a(int i, BigInteger bigInteger) {
            C13812e eVar;
            C13812e a = mo35061a(bigInteger);
            if (a.mo35112g()) {
                eVar = mo35083e().mo35114i();
            } else {
                C13812e a2 = m42387a(a.mo35115j().mo35110e().mo35106c(mo35083e()).mo35100a(mo35082d()).mo35100a(a));
                if (a2 != null) {
                    if (a2.mo35116k() != (i == 1)) {
                        a2 = a2.mo35098a();
                    }
                    int g = mo35086g();
                    eVar = (g == 5 || g == 6) ? a2.mo35100a(a) : a2.mo35106c(a);
                } else {
                    eVar = null;
                }
            }
            if (eVar != null) {
                return mo35065a(a, eVar, true);
            }
            throw new IllegalArgumentException("Invalid point compression");
        }

        /* renamed from: a */
        private C13812e m42387a(C13812e eVar) {
            C13812e eVar2;
            if (eVar.mo35112g()) {
                return eVar;
            }
            C13812e a = mo35061a(C13805c.f30633a);
            int j = mo35090j();
            Random random = new Random();
            do {
                C13812e a2 = mo35061a(new BigInteger(j, random));
                C13812e eVar3 = eVar;
                eVar2 = a;
                for (int i = 1; i < j; i++) {
                    C13812e j2 = eVar3.mo35115j();
                    eVar2 = eVar2.mo35115j().mo35100a(j2.mo35106c(a2));
                    eVar3 = j2.mo35100a(eVar);
                }
                if (!eVar3.mo35112g()) {
                    return null;
                }
            } while (eVar2.mo35115j().mo35100a(eVar2).mo35112g());
            return eVar2;
        }
    }

    /* renamed from: m.d.e.a.d$b */
    /* compiled from: ECCurve */
    public static abstract class C13808b extends C13806d {
        protected C13808b(BigInteger bigInteger) {
            super(C13951c.m43810a(bigInteger));
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public C13816g mo35062a(int i, BigInteger bigInteger) {
            C13812e a = mo35061a(bigInteger);
            C13812e i2 = a.mo35115j().mo35100a(this.f30640b).mo35106c(a).mo35100a(this.f30641c).mo35114i();
            if (i2 != null) {
                if (i2.mo35116k() != (i == 1)) {
                    i2 = i2.mo35113h();
                }
                return mo35065a(a, i2, true);
            }
            throw new IllegalArgumentException("Invalid point compression");
        }

        /* renamed from: b */
        public boolean mo35080b(BigInteger bigInteger) {
            return bigInteger != null && bigInteger.signum() >= 0 && bigInteger.compareTo(mo35089i().mo35284c()) < 0;
        }
    }

    /* renamed from: m.d.e.a.d$c */
    /* compiled from: ECCurve */
    public class C13809c {

        /* renamed from: a */
        protected int f30648a;

        /* renamed from: b */
        protected C13945a f30649b;

        /* renamed from: c */
        protected C13815f f30650c;

        C13809c(int i, C13945a aVar, C13815f fVar) {
            this.f30648a = i;
            this.f30649b = aVar;
            this.f30650c = fVar;
        }

        /* renamed from: a */
        public C13809c mo35096a(C13945a aVar) {
            this.f30649b = aVar;
            return this;
        }

        /* renamed from: a */
        public C13806d mo35097a() {
            if (C13806d.this.mo35074a(this.f30648a)) {
                C13806d a = C13806d.this.mo35060a();
                if (a != C13806d.this) {
                    synchronized (a) {
                        a.f30644f = this.f30648a;
                        a.f30645g = this.f30649b;
                        a.f30646h = this.f30650c;
                    }
                    return a;
                }
                throw new IllegalStateException("implementation returned current curve");
            }
            throw new IllegalStateException("unsupported coordinate system");
        }
    }

    /* renamed from: m.d.e.a.d$d */
    /* compiled from: ECCurve */
    public static class C13810d extends C13807a {

        /* renamed from: j */
        private int f30652j;

        /* renamed from: k */
        private int f30653k;

        /* renamed from: l */
        private int f30654l;

        /* renamed from: m */
        private int f30655m;

        /* renamed from: n */
        private C13819c f30656n;

        public C13810d(int i, int i2, BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3, BigInteger bigInteger4) {
            this(i, i2, 0, 0, bigInteger, bigInteger2, bigInteger3, bigInteger4);
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public C13806d mo35060a() {
            C13810d dVar = new C13810d(this.f30652j, this.f30653k, this.f30654l, this.f30655m, this.f30640b, this.f30641c, this.f30642d, this.f30643e);
            return dVar;
        }

        /* renamed from: a */
        public boolean mo35074a(int i) {
            return i == 0 || i == 1 || i == 6;
        }

        /* access modifiers changed from: protected */
        /* renamed from: c */
        public C13815f mo35081c() {
            if (mo35095o()) {
                return new C13834u();
            }
            return C13806d.super.mo35081c();
        }

        /* renamed from: j */
        public int mo35090j() {
            return this.f30652j;
        }

        /* renamed from: k */
        public C13816g mo35091k() {
            return this.f30656n;
        }

        public C13810d(int i, int i2, int i3, int i4, BigInteger bigInteger, BigInteger bigInteger2) {
            this(i, i2, i3, i4, bigInteger, bigInteger2, (BigInteger) null, (BigInteger) null);
        }

        /* renamed from: a */
        public C13812e mo35061a(BigInteger bigInteger) {
            C13813a aVar = new C13813a(this.f30652j, this.f30653k, this.f30654l, this.f30655m, bigInteger);
            return aVar;
        }

        public C13810d(int i, int i2, int i3, int i4, BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3, BigInteger bigInteger4) {
            super(i, i2, i3, i4);
            this.f30652j = i;
            this.f30653k = i2;
            this.f30654l = i3;
            this.f30655m = i4;
            this.f30642d = bigInteger3;
            this.f30643e = bigInteger4;
            this.f30656n = new C13819c(this, null, null);
            this.f30640b = mo35061a(bigInteger);
            this.f30641c = mo35061a(bigInteger2);
            this.f30644f = 6;
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public C13816g mo35065a(C13812e eVar, C13812e eVar2, boolean z) {
            return new C13819c(this, eVar, eVar2, z);
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public C13816g mo35066a(C13812e eVar, C13812e eVar2, C13812e[] eVarArr, boolean z) {
            C13819c cVar = new C13819c(this, eVar, eVar2, eVarArr, z);
            return cVar;
        }

        protected C13810d(int i, int i2, int i3, int i4, C13812e eVar, C13812e eVar2, BigInteger bigInteger, BigInteger bigInteger2) {
            super(i, i2, i3, i4);
            this.f30652j = i;
            this.f30653k = i2;
            this.f30654l = i3;
            this.f30655m = i4;
            this.f30642d = bigInteger;
            this.f30643e = bigInteger2;
            this.f30656n = new C13819c(this, null, null);
            this.f30640b = eVar;
            this.f30641c = eVar2;
            this.f30644f = 6;
        }
    }

    /* renamed from: m.d.e.a.d$e */
    /* compiled from: ECCurve */
    public static class C13811e extends C13808b {

        /* renamed from: i */
        BigInteger f30657i;

        /* renamed from: j */
        BigInteger f30658j;

        /* renamed from: k */
        C13820d f30659k;

        public C13811e(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3) {
            this(bigInteger, bigInteger2, bigInteger3, null, null);
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public C13806d mo35060a() {
            C13811e eVar = new C13811e(this.f30657i, this.f30658j, this.f30640b, this.f30641c, this.f30642d, this.f30643e);
            return eVar;
        }

        /* renamed from: a */
        public boolean mo35074a(int i) {
            return i == 0 || i == 1 || i == 2 || i == 4;
        }

        /* renamed from: b */
        public C13816g mo35079b(C13816g gVar) {
            if (this != gVar.mo35148f() && mo35086g() == 2 && !gVar.mo35157n()) {
                int g = gVar.mo35148f().mo35086g();
                if (g == 2 || g == 3 || g == 4) {
                    C13820d dVar = new C13820d(this, mo35061a(gVar.f30669b.mo35117l()), mo35061a(gVar.f30670c.mo35117l()), new C13812e[]{mo35061a(gVar.f30671d[0].mo35117l())}, gVar.f30672e);
                    return dVar;
                }
            }
            return C13806d.super.mo35079b(gVar);
        }

        /* renamed from: j */
        public int mo35090j() {
            return this.f30657i.bitLength();
        }

        /* renamed from: k */
        public C13816g mo35091k() {
            return this.f30659k;
        }

        public C13811e(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3, BigInteger bigInteger4, BigInteger bigInteger5) {
            super(bigInteger);
            this.f30657i = bigInteger;
            this.f30658j = C13814b.m42455e(bigInteger);
            this.f30659k = new C13820d(this, null, null);
            this.f30640b = mo35061a(bigInteger2);
            this.f30641c = mo35061a(bigInteger3);
            this.f30642d = bigInteger4;
            this.f30643e = bigInteger5;
            this.f30644f = 4;
        }

        /* renamed from: a */
        public C13812e mo35061a(BigInteger bigInteger) {
            return new C13814b(this.f30657i, this.f30658j, bigInteger);
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public C13816g mo35065a(C13812e eVar, C13812e eVar2, boolean z) {
            return new C13820d(this, eVar, eVar2, z);
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public C13816g mo35066a(C13812e eVar, C13812e eVar2, C13812e[] eVarArr, boolean z) {
            C13820d dVar = new C13820d(this, eVar, eVar2, eVarArr, z);
            return dVar;
        }

        protected C13811e(BigInteger bigInteger, BigInteger bigInteger2, C13812e eVar, C13812e eVar2, BigInteger bigInteger3, BigInteger bigInteger4) {
            super(bigInteger);
            this.f30657i = bigInteger;
            this.f30658j = bigInteger2;
            this.f30659k = new C13820d(this, null, null);
            this.f30640b = eVar;
            this.f30641c = eVar2;
            this.f30642d = bigInteger3;
            this.f30643e = bigInteger4;
            this.f30644f = 4;
        }
    }

    protected C13806d(C13950b bVar) {
        this.f30639a = bVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract C13806d mo35060a();

    /* renamed from: a */
    public abstract C13812e mo35061a(BigInteger bigInteger);

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract C13816g mo35062a(int i, BigInteger bigInteger);

    /* renamed from: a */
    public C13816g mo35063a(BigInteger bigInteger, BigInteger bigInteger2) {
        return mo35064a(bigInteger, bigInteger2, false);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract C13816g mo35065a(C13812e eVar, C13812e eVar2, boolean z);

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract C13816g mo35066a(C13812e eVar, C13812e eVar2, C13812e[] eVarArr, boolean z);

    /* renamed from: a */
    public boolean mo35074a(int i) {
        return i == 0;
    }

    /* renamed from: b */
    public synchronized C13809c mo35076b() {
        return new C13809c(this.f30644f, this.f30645g, this.f30646h);
    }

    /* renamed from: b */
    public abstract boolean mo35080b(BigInteger bigInteger);

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public C13815f mo35081c() {
        C13945a aVar = this.f30645g;
        if (aVar instanceof C13946b) {
            return new C13825l(this, (C13946b) aVar);
        }
        return new C13831r();
    }

    /* renamed from: d */
    public C13812e mo35082d() {
        return this.f30640b;
    }

    /* renamed from: e */
    public C13812e mo35083e() {
        return this.f30641c;
    }

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof C13806d) && mo35075a((C13806d) obj));
    }

    /* renamed from: f */
    public BigInteger mo35085f() {
        return this.f30643e;
    }

    /* renamed from: g */
    public int mo35086g() {
        return this.f30644f;
    }

    /* renamed from: h */
    public C13945a mo35087h() {
        return this.f30645g;
    }

    public int hashCode() {
        return (mo35089i().hashCode() ^ C14084e.m44467a(mo35082d().mo35117l().hashCode(), 8)) ^ C14084e.m44467a(mo35083e().mo35117l().hashCode(), 16);
    }

    /* renamed from: i */
    public C13950b mo35089i() {
        return this.f30639a;
    }

    /* renamed from: j */
    public abstract int mo35090j();

    /* renamed from: k */
    public abstract C13816g mo35091k();

    /* renamed from: l */
    public synchronized C13815f mo35092l() {
        if (this.f30646h == null) {
            this.f30646h = mo35081c();
        }
        return this.f30646h;
    }

    /* renamed from: m */
    public BigInteger mo35093m() {
        return this.f30642d;
    }

    /* renamed from: a */
    public C13816g mo35064a(BigInteger bigInteger, BigInteger bigInteger2, boolean z) {
        return mo35065a(mo35061a(bigInteger), mo35061a(bigInteger2), z);
    }

    /* renamed from: b */
    public C13816g mo35077b(BigInteger bigInteger, BigInteger bigInteger2) {
        C13816g a = mo35063a(bigInteger, bigInteger2);
        if (a.mo35159p()) {
            return a;
        }
        throw new IllegalArgumentException("Invalid point coordinates");
    }

    /* renamed from: a */
    public C13827n mo35068a(C13816g gVar, String str) {
        C13827n nVar;
        mo35069a(gVar);
        synchronized (gVar) {
            Hashtable hashtable = gVar.f30673f;
            if (hashtable == null) {
                nVar = null;
            } else {
                nVar = (C13827n) hashtable.get(str);
            }
        }
        return nVar;
    }

    /* renamed from: b */
    public C13816g mo35078b(BigInteger bigInteger, BigInteger bigInteger2, boolean z) {
        C13816g a = mo35064a(bigInteger, bigInteger2, z);
        if (a.mo35159p()) {
            return a;
        }
        throw new IllegalArgumentException("Invalid point coordinates");
    }

    /* renamed from: a */
    public void mo35070a(C13816g gVar, String str, C13827n nVar) {
        mo35069a(gVar);
        synchronized (gVar) {
            Hashtable hashtable = gVar.f30673f;
            if (hashtable == null) {
                hashtable = new Hashtable(4);
                gVar.f30673f = hashtable;
            }
            hashtable.put(str, nVar);
        }
    }

    /* renamed from: b */
    public C13816g mo35079b(C13816g gVar) {
        if (this == gVar.mo35148f()) {
            return gVar;
        }
        if (gVar.mo35157n()) {
            return mo35091k();
        }
        C13816g r = gVar.mo35161r();
        return mo35078b(r.mo35155l().mo35117l(), r.mo35156m().mo35117l(), r.f30672e);
    }

    /* renamed from: a */
    public void mo35071a(C13816g[] gVarArr) {
        mo35073a(gVarArr, 0, gVarArr.length, (C13812e) null);
    }

    /* renamed from: a */
    public void mo35073a(C13816g[] gVarArr, int i, int i2, C13812e eVar) {
        mo35072a(gVarArr, i, i2);
        int g = mo35086g();
        if (g != 0 && g != 5) {
            C13812e[] eVarArr = new C13812e[i2];
            int[] iArr = new int[i2];
            int i3 = 0;
            for (int i4 = 0; i4 < i2; i4++) {
                int i5 = i + i4;
                C13816g gVar = gVarArr[i5];
                if (gVar != null && (eVar != null || !gVar.mo35158o())) {
                    eVarArr[i3] = gVar.mo35130a(0);
                    int i6 = i3 + 1;
                    iArr[i3] = i5;
                    i3 = i6;
                }
            }
            if (i3 != 0) {
                C13804b.m42349a(eVarArr, 0, i3, eVar);
                for (int i7 = 0; i7 < i3; i7++) {
                    int i8 = iArr[i7];
                    gVarArr[i8] = gVarArr[i8].mo35132a(eVarArr[i7]);
                }
            }
        } else if (eVar != null) {
            throw new IllegalArgumentException("'iso' not valid for affine coordinates");
        }
    }

    /* renamed from: a */
    public C13816g mo35067a(byte[] bArr) {
        C13816g gVar;
        int j = (mo35090j() + 7) / 8;
        boolean z = false;
        byte b = bArr[0];
        if (b != 0) {
            if (b == 2 || b == 3) {
                if (bArr.length == j + 1) {
                    gVar = mo35062a((int) b & 1, C14081b.m44464a(bArr, 1, j));
                    if (!gVar.mo35162s()) {
                        throw new IllegalArgumentException("Invalid point");
                    }
                } else {
                    throw new IllegalArgumentException("Incorrect length for compressed encoding");
                }
            } else if (b != 4) {
                if (b != 6 && b != 7) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Invalid point encoding 0x");
                    sb.append(Integer.toString(b, 16));
                    throw new IllegalArgumentException(sb.toString());
                } else if (bArr.length == (j * 2) + 1) {
                    BigInteger a = C14081b.m44464a(bArr, 1, j);
                    BigInteger a2 = C14081b.m44464a(bArr, j + 1, j);
                    boolean testBit = a2.testBit(0);
                    if (b == 7) {
                        z = true;
                    }
                    if (testBit == z) {
                        gVar = mo35077b(a, a2);
                    } else {
                        throw new IllegalArgumentException("Inconsistent Y coordinate in hybrid encoding");
                    }
                } else {
                    throw new IllegalArgumentException("Incorrect length for hybrid encoding");
                }
            } else if (bArr.length == (j * 2) + 1) {
                gVar = mo35077b(C14081b.m44464a(bArr, 1, j), C14081b.m44464a(bArr, j + 1, j));
            } else {
                throw new IllegalArgumentException("Incorrect length for uncompressed encoding");
            }
        } else if (bArr.length == 1) {
            gVar = mo35091k();
        } else {
            throw new IllegalArgumentException("Incorrect length for infinity encoding");
        }
        if (b == 0 || !gVar.mo35157n()) {
            return gVar;
        }
        throw new IllegalArgumentException("Invalid infinity encoding");
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo35069a(C13816g gVar) {
        if (gVar == null || this != gVar.mo35148f()) {
            throw new IllegalArgumentException("'point' must be non-null and on this curve");
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo35072a(C13816g[] gVarArr, int i, int i2) {
        if (gVarArr == null) {
            throw new IllegalArgumentException("'points' cannot be null");
        } else if (i < 0 || i2 < 0 || i > gVarArr.length - i2) {
            throw new IllegalArgumentException("invalid range specified for 'points'");
        } else {
            int i3 = 0;
            while (i3 < i2) {
                C13816g gVar = gVarArr[i + i3];
                if (gVar == null || this == gVar.mo35148f()) {
                    i3++;
                } else {
                    throw new IllegalArgumentException("'points' entries must be null or on this curve");
                }
            }
        }
    }

    /* renamed from: a */
    public boolean mo35075a(C13806d dVar) {
        return this == dVar || (dVar != null && mo35089i().equals(dVar.mo35089i()) && mo35082d().mo35117l().equals(dVar.mo35082d().mo35117l()) && mo35083e().mo35117l().equals(dVar.mo35083e().mo35117l()));
    }
}
