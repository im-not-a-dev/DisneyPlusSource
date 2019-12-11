package p602m.p613d.p653e.p654a.p655x.p658c;

import java.math.BigInteger;
import p602m.p613d.p653e.p654a.C13806d;
import p602m.p613d.p653e.p654a.C13806d.C13808b;
import p602m.p613d.p653e.p654a.C13812e;
import p602m.p613d.p653e.p654a.C13816g;
import p602m.p613d.p683g.p684k.C14097f;

/* renamed from: m.d.e.a.x.c.s */
/* compiled from: SecP192R1Curve */
public class C13917s extends C13808b {

    /* renamed from: j */
    public static final BigInteger f30797j = new BigInteger(1, C14097f.m44507a("FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFEFFFFFFFFFFFFFFFF"));

    /* renamed from: i */
    protected C13929v f30798i = new C13929v(this, null, null);

    public C13917s() {
        super(f30797j);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public C13806d mo35060a() {
        return new C13917s();
    }

    /* renamed from: a */
    public boolean mo35074a(int i) {
        return i == 2;
    }

    /* renamed from: j */
    public int mo35090j() {
        return f30797j.bitLength();
    }

    /* renamed from: k */
    public C13816g mo35091k() {
        return this.f30798i;
    }

    /* renamed from: a */
    public C13812e mo35061a(BigInteger bigInteger) {
        return new C13925u(bigInteger);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public C13816g mo35065a(C13812e eVar, C13812e eVar2, boolean z) {
        return new C13929v(this, eVar, eVar2, z);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public C13816g mo35066a(C13812e eVar, C13812e eVar2, C13812e[] eVarArr, boolean z) {
        C13929v vVar = new C13929v(this, eVar, eVar2, eVarArr, z);
        return vVar;
    }
}
