package p602m.p613d.p614a.p626n2;

import java.math.BigInteger;
import p602m.p613d.p614a.C13501f;
import p602m.p613d.p614a.C13503f1;
import p602m.p613d.p614a.C13508g;
import p602m.p613d.p614a.C13565l;
import p602m.p613d.p614a.C13589n;
import p602m.p613d.p614a.C13630p;
import p602m.p613d.p614a.C13643t;
import p602m.p613d.p614a.C13646u;
import p602m.p613d.p653e.p654a.C13804b;
import p602m.p613d.p653e.p654a.C13806d;
import p602m.p613d.p653e.p654a.C13816g;
import p602m.p613d.p653e.p660b.C13955g;

/* renamed from: m.d.a.n2.e */
/* compiled from: X9ECParameters */
public class C13619e extends C13589n implements C13625k {

    /* renamed from: Z */
    private static final BigInteger f30277Z = BigInteger.valueOf(1);

    /* renamed from: U */
    private C13806d f30278U;

    /* renamed from: V */
    private C13621g f30279V;

    /* renamed from: W */
    private BigInteger f30280W;

    /* renamed from: X */
    private BigInteger f30281X;

    /* renamed from: Y */
    private byte[] f30282Y;

    /* renamed from: c */
    private C13623i f30283c;

    private C13619e(C13646u uVar) {
        if (!(uVar.mo34870a(0) instanceof C13565l) || !((C13565l) uVar.mo34870a(0)).mo34814i().equals(f30277Z)) {
            throw new IllegalArgumentException("bad version in X9ECParameters");
        }
        C13618d dVar = new C13618d(C13623i.m41830a(uVar.mo34870a(1)), C13646u.m41915a((Object) uVar.mo34870a(2)));
        this.f30278U = dVar.mo34833e();
        C13501f a = uVar.mo34870a(3);
        if (a instanceof C13621g) {
            this.f30279V = (C13621g) a;
        } else {
            this.f30279V = new C13621g(this.f30278U, (C13630p) a);
        }
        this.f30280W = ((C13565l) uVar.mo34870a(4)).mo34814i();
        this.f30282Y = dVar.mo34834f();
        if (uVar.mo34873j() == 6) {
            this.f30281X = ((C13565l) uVar.mo34870a(5)).mo34814i();
        }
    }

    /* renamed from: a */
    public static C13619e m41817a(Object obj) {
        if (obj instanceof C13619e) {
            return (C13619e) obj;
        }
        if (obj != null) {
            return new C13619e(C13646u.m41915a(obj));
        }
        return null;
    }

    /* renamed from: e */
    public C13806d mo34835e() {
        return this.f30278U;
    }

    /* renamed from: f */
    public C13816g mo34836f() {
        return this.f30279V.mo34841e();
    }

    /* renamed from: g */
    public BigInteger mo34837g() {
        return this.f30281X;
    }

    /* renamed from: h */
    public BigInteger mo34838h() {
        return this.f30280W;
    }

    /* renamed from: i */
    public byte[] mo34839i() {
        return this.f30282Y;
    }

    /* renamed from: a */
    public C13643t mo34785a() {
        C13508g gVar = new C13508g();
        gVar.mo34796a((C13501f) new C13565l(f30277Z));
        gVar.mo34796a((C13501f) this.f30283c);
        gVar.mo34796a((C13501f) new C13618d(this.f30278U, this.f30282Y));
        gVar.mo34796a((C13501f) this.f30279V);
        gVar.mo34796a((C13501f) new C13565l(this.f30280W));
        BigInteger bigInteger = this.f30281X;
        if (bigInteger != null) {
            gVar.mo34796a((C13501f) new C13565l(bigInteger));
        }
        return new C13503f1(gVar);
    }

    public C13619e(C13806d dVar, C13621g gVar, BigInteger bigInteger, BigInteger bigInteger2) {
        this(dVar, gVar, bigInteger, bigInteger2, (byte[]) null);
    }

    public C13619e(C13806d dVar, C13816g gVar, BigInteger bigInteger, BigInteger bigInteger2, byte[] bArr) {
        this(dVar, new C13621g(gVar), bigInteger, bigInteger2, bArr);
    }

    public C13619e(C13806d dVar, C13621g gVar, BigInteger bigInteger, BigInteger bigInteger2, byte[] bArr) {
        this.f30278U = dVar;
        this.f30279V = gVar;
        this.f30280W = bigInteger;
        this.f30281X = bigInteger2;
        this.f30282Y = bArr;
        if (C13804b.m42353b(dVar)) {
            this.f30283c = new C13623i(dVar.mo35089i().mo35284c());
        } else if (C13804b.m42350a(dVar)) {
            int[] a = ((C13955g) dVar.mo35089i()).mo35289a().mo35285a();
            if (a.length == 3) {
                this.f30283c = new C13623i(a[2], a[1]);
            } else if (a.length == 5) {
                this.f30283c = new C13623i(a[4], a[1], a[2], a[3]);
            } else {
                throw new IllegalArgumentException("Only trinomial and pentomial curves are supported");
            }
        } else {
            throw new IllegalArgumentException("'curve' is of an unsupported type");
        }
    }
}
