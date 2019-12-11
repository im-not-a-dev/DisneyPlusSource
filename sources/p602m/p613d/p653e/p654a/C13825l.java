package p602m.p613d.p653e.p654a;

import java.math.BigInteger;
import p602m.p613d.p653e.p654a.p659y.C13946b;

/* renamed from: m.d.e.a.l */
/* compiled from: GLVMultiplier */
public class C13825l extends C13803a {

    /* renamed from: a */
    protected final C13806d f30677a;

    /* renamed from: b */
    protected final C13946b f30678b;

    public C13825l(C13806d dVar, C13946b bVar) {
        if (dVar == null || dVar.mo35093m() == null) {
            throw new IllegalArgumentException("Need curve with known group order");
        }
        this.f30677a = dVar;
        this.f30678b = bVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public C13816g mo35059b(C13816g gVar, BigInteger bigInteger) {
        if (this.f30677a.mo35075a(gVar.mo35148f())) {
            BigInteger[] a = this.f30678b.mo35273a(bigInteger.mod(gVar.mo35148f().mo35093m()));
            BigInteger bigInteger2 = a[0];
            BigInteger bigInteger3 = a[1];
            C13821h a2 = this.f30678b.mo35271a();
            if (this.f30678b.mo35272b()) {
                return C13804b.m42343a(gVar, bigInteger2, a2, bigInteger3);
            }
            return C13804b.m42342a(gVar, bigInteger2, a2.mo35175a(gVar), bigInteger3);
        }
        throw new IllegalStateException();
    }
}
