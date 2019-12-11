package p602m.p613d.p653e.p654a.p655x.p658c;

import java.math.BigInteger;
import p602m.p613d.p653e.p654a.C13806d;
import p602m.p613d.p653e.p654a.C13806d.C13808b;
import p602m.p613d.p653e.p654a.C13812e;
import p602m.p613d.p653e.p654a.C13816g;

/* renamed from: m.d.e.a.x.c.e */
/* compiled from: SecP160K1Curve */
public class C13861e extends C13808b {

    /* renamed from: j */
    public static final BigInteger f30734j = C13885k.f30762j;

    /* renamed from: i */
    protected C13865f f30735i = new C13865f(this, null, null);

    public C13861e() {
        super(f30734j);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public C13806d mo35060a() {
        return new C13861e();
    }

    /* renamed from: a */
    public boolean mo35074a(int i) {
        return i == 2;
    }

    /* renamed from: j */
    public int mo35090j() {
        return f30734j.bitLength();
    }

    /* renamed from: k */
    public C13816g mo35091k() {
        return this.f30735i;
    }

    /* renamed from: a */
    public C13812e mo35061a(BigInteger bigInteger) {
        return new C13893m(bigInteger);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public C13816g mo35065a(C13812e eVar, C13812e eVar2, boolean z) {
        return new C13865f(this, eVar, eVar2, z);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public C13816g mo35066a(C13812e eVar, C13812e eVar2, C13812e[] eVarArr, boolean z) {
        C13865f fVar = new C13865f(this, eVar, eVar2, eVarArr, z);
        return fVar;
    }
}
