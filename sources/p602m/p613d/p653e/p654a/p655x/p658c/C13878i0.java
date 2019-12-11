package p602m.p613d.p653e.p654a.p655x.p658c;

import java.math.BigInteger;
import p602m.p613d.p653e.p654a.C13806d;
import p602m.p613d.p653e.p654a.C13806d.C13808b;
import p602m.p613d.p653e.p654a.C13812e;
import p602m.p613d.p653e.p654a.C13816g;
import p602m.p613d.p683g.p684k.C14097f;

/* renamed from: m.d.e.a.x.c.i0 */
/* compiled from: SecP256R1Curve */
public class C13878i0 extends C13808b {

    /* renamed from: j */
    public static final BigInteger f30756j = new BigInteger(1, C14097f.m44507a("FFFFFFFF00000001000000000000000000000000FFFFFFFFFFFFFFFFFFFFFFFF"));

    /* renamed from: i */
    protected C13890l0 f30757i = new C13890l0(this, null, null);

    public C13878i0() {
        super(f30756j);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public C13806d mo35060a() {
        return new C13878i0();
    }

    /* renamed from: a */
    public boolean mo35074a(int i) {
        return i == 2;
    }

    /* renamed from: j */
    public int mo35090j() {
        return f30756j.bitLength();
    }

    /* renamed from: k */
    public C13816g mo35091k() {
        return this.f30757i;
    }

    /* renamed from: a */
    public C13812e mo35061a(BigInteger bigInteger) {
        return new C13886k0(bigInteger);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public C13816g mo35065a(C13812e eVar, C13812e eVar2, boolean z) {
        return new C13890l0(this, eVar, eVar2, z);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public C13816g mo35066a(C13812e eVar, C13812e eVar2, C13812e[] eVarArr, boolean z) {
        C13890l0 l0Var = new C13890l0(this, eVar, eVar2, eVarArr, z);
        return l0Var;
    }
}
