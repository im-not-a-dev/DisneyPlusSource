package p602m.p613d.p614a.p626n2;

import java.math.BigInteger;
import p602m.p613d.p614a.C13484b1;
import p602m.p613d.p614a.C13589n;
import p602m.p613d.p614a.C13630p;
import p602m.p613d.p614a.C13643t;
import p602m.p613d.p653e.p654a.C13812e;
import p602m.p613d.p653e.p654a.C13812e.C13813a;
import p602m.p613d.p653e.p654a.C13812e.C13814b;

/* renamed from: m.d.a.n2.h */
/* compiled from: X9FieldElement */
public class C13622h extends C13589n {

    /* renamed from: U */
    private static C13624j f30288U = new C13624j();

    /* renamed from: c */
    protected C13812e f30289c;

    public C13622h(C13812e eVar) {
        this.f30289c = eVar;
    }

    /* renamed from: a */
    public C13643t mo34785a() {
        return new C13484b1(f30288U.mo34847a(this.f30289c.mo35117l(), f30288U.mo34846a(this.f30289c)));
    }

    /* renamed from: e */
    public C13812e mo34842e() {
        return this.f30289c;
    }

    public C13622h(BigInteger bigInteger, C13630p pVar) {
        this(new C13814b(bigInteger, new BigInteger(1, pVar.mo34797i())));
    }

    public C13622h(int i, int i2, int i3, int i4, C13630p pVar) {
        C13813a aVar = new C13813a(i, i2, i3, i4, new BigInteger(1, pVar.mo34797i()));
        this(aVar);
    }
}
