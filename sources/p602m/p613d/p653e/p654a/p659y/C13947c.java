package p602m.p613d.p653e.p654a.p659y;

import java.math.BigInteger;
import p602m.p613d.p653e.p654a.C13805c;
import p602m.p613d.p653e.p654a.C13806d;
import p602m.p613d.p653e.p654a.C13821h;
import p602m.p613d.p653e.p654a.C13828o;

/* renamed from: m.d.e.a.y.c */
/* compiled from: GLVTypeBEndomorphism */
public class C13947c implements C13946b {

    /* renamed from: a */
    protected final C13948d f30825a;

    /* renamed from: b */
    protected final C13821h f30826b;

    public C13947c(C13806d dVar, C13948d dVar2) {
        this.f30825a = dVar2;
        this.f30826b = new C13828o(dVar.mo35061a(dVar2.mo35275a()));
    }

    /* renamed from: a */
    public BigInteger[] mo35273a(BigInteger bigInteger) {
        int b = this.f30825a.mo35276b();
        BigInteger a = mo35274a(bigInteger, this.f30825a.mo35277c(), b);
        BigInteger a2 = mo35274a(bigInteger, this.f30825a.mo35278d(), b);
        C13948d dVar = this.f30825a;
        return new BigInteger[]{bigInteger.subtract(a.multiply(dVar.mo35279e()).add(a2.multiply(dVar.mo35281g()))), a.multiply(dVar.mo35280f()).add(a2.multiply(dVar.mo35282h())).negate()};
    }

    /* renamed from: b */
    public boolean mo35272b() {
        return true;
    }

    /* renamed from: a */
    public C13821h mo35271a() {
        return this.f30826b;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public BigInteger mo35274a(BigInteger bigInteger, BigInteger bigInteger2, int i) {
        boolean z = bigInteger2.signum() < 0;
        BigInteger multiply = bigInteger.multiply(bigInteger2.abs());
        boolean testBit = multiply.testBit(i - 1);
        BigInteger shiftRight = multiply.shiftRight(i);
        if (testBit) {
            shiftRight = shiftRight.add(C13805c.f30634b);
        }
        return z ? shiftRight.negate() : shiftRight;
    }
}
