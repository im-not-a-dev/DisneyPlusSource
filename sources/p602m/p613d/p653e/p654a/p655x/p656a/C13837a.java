package p602m.p613d.p653e.p654a.p655x.p656a;

import java.math.BigInteger;
import p602m.p613d.p653e.p654a.C13806d;
import p602m.p613d.p653e.p654a.C13806d.C13808b;
import p602m.p613d.p653e.p654a.C13812e;
import p602m.p613d.p653e.p654a.C13816g;
import p602m.p613d.p653e.p661c.C13963g;

/* renamed from: m.d.e.a.x.a.a */
/* compiled from: Curve25519 */
public class C13837a extends C13808b {

    /* renamed from: j */
    public static final BigInteger f30702j = C13963g.m43956c(C13838b.f30704a);

    /* renamed from: i */
    protected C13840d f30703i = new C13840d(this, null, null);

    public C13837a() {
        super(f30702j);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public C13806d mo35060a() {
        return new C13837a();
    }

    /* renamed from: a */
    public boolean mo35074a(int i) {
        return i == 4;
    }

    /* renamed from: j */
    public int mo35090j() {
        return f30702j.bitLength();
    }

    /* renamed from: k */
    public C13816g mo35091k() {
        return this.f30703i;
    }

    /* renamed from: a */
    public C13812e mo35061a(BigInteger bigInteger) {
        return new C13839c(bigInteger);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public C13816g mo35065a(C13812e eVar, C13812e eVar2, boolean z) {
        return new C13840d(this, eVar, eVar2, z);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public C13816g mo35066a(C13812e eVar, C13812e eVar2, C13812e[] eVarArr, boolean z) {
        C13840d dVar = new C13840d(this, eVar, eVar2, eVarArr, z);
        return dVar;
    }
}
