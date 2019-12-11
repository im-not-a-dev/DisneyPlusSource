package p602m.p613d.p627b.p634f0;

import java.math.BigInteger;
import java.security.SecureRandom;
import p602m.p613d.p627b.C13697f;
import p602m.p613d.p627b.C13704h;
import p602m.p613d.p627b.p632d0.C13682c;
import p602m.p613d.p627b.p632d0.C13684e;
import p602m.p613d.p627b.p632d0.C13686g;
import p602m.p613d.p627b.p632d0.C13687h;
import p602m.p613d.p627b.p632d0.C13694o;
import p602m.p613d.p653e.p654a.C13804b;
import p602m.p613d.p653e.p654a.C13805c;
import p602m.p613d.p653e.p654a.C13806d;
import p602m.p613d.p653e.p654a.C13812e;
import p602m.p613d.p653e.p654a.C13815f;
import p602m.p613d.p653e.p654a.C13816g;
import p602m.p613d.p653e.p654a.C13822i;

/* renamed from: m.d.b.f0.c */
/* compiled from: ECDSASigner */
public class C13700c implements C13805c, C13704h {

    /* renamed from: g */
    private final C13699b f30461g = new C13701d();

    /* renamed from: h */
    private C13684e f30462h;

    /* renamed from: i */
    private SecureRandom f30463i;

    /* renamed from: a */
    public void mo34966a(boolean z, C13697f fVar) {
        SecureRandom secureRandom;
        if (!z) {
            this.f30462h = (C13687h) fVar;
        } else if (fVar instanceof C13694o) {
            C13694o oVar = (C13694o) fVar;
            this.f30462h = (C13686g) oVar.mo34949a();
            secureRandom = oVar.mo34950b();
            this.f30463i = mo34963a(!z && !this.f30461g.mo34961b(), secureRandom);
        } else {
            this.f30462h = (C13686g) fVar;
        }
        secureRandom = null;
        this.f30463i = mo34963a(!z && !this.f30461g.mo34961b(), secureRandom);
    }

    /* renamed from: a */
    public BigInteger[] mo34968a(byte[] bArr) {
        C13682c b = this.f30462h.mo34938b();
        BigInteger d = b.mo34933d();
        BigInteger a = mo34962a(d, bArr);
        BigInteger c = ((C13686g) this.f30462h).mo34939c();
        if (!this.f30461g.mo34961b()) {
            this.f30461g.mo34960a(d, this.f30463i);
            C13815f a2 = mo34965a();
            while (true) {
                BigInteger a3 = this.f30461g.mo34958a();
                BigInteger mod = a2.mo35058a(b.mo34931b(), a3).mo35161r().mo35141c().mo35117l().mod(d);
                if (!mod.equals(C13805c.f30633a)) {
                    BigInteger mod2 = a3.modInverse(d).multiply(a.add(c.multiply(mod))).mod(d);
                    if (!mod2.equals(C13805c.f30633a)) {
                        return new BigInteger[]{mod, mod2};
                    }
                }
            }
        } else {
            this.f30461g.mo34959a(d, c, bArr);
            throw null;
        }
    }

    /* renamed from: a */
    public boolean mo34967a(byte[] bArr, BigInteger bigInteger, BigInteger bigInteger2) {
        C13682c b = this.f30462h.mo34938b();
        BigInteger d = b.mo34933d();
        BigInteger a = mo34962a(d, bArr);
        if (bigInteger.compareTo(C13805c.f30634b) < 0 || bigInteger.compareTo(d) >= 0 || bigInteger2.compareTo(C13805c.f30634b) < 0 || bigInteger2.compareTo(d) >= 0) {
            return false;
        }
        BigInteger modInverse = bigInteger2.modInverse(d);
        C13816g b2 = C13804b.m42352b(b.mo34931b(), a.multiply(modInverse).mod(d), ((C13687h) this.f30462h).mo34940c(), bigInteger.multiply(modInverse).mod(d));
        if (b2.mo35157n()) {
            return false;
        }
        C13806d f = b2.mo35148f();
        if (f != null) {
            BigInteger f2 = f.mo35085f();
            if (f2 != null && f2.compareTo(C13805c.f30638f) <= 0) {
                C13812e a2 = mo34964a(f.mo35086g(), b2);
                if (a2 != null && !a2.mo35112g()) {
                    C13812e l = b2.mo35155l();
                    while (f.mo35080b(bigInteger)) {
                        if (f.mo35061a(bigInteger).mo35106c(a2).equals(l)) {
                            return true;
                        }
                        bigInteger = bigInteger.add(d);
                    }
                    return false;
                }
            }
        }
        return b2.mo35161r().mo35141c().mo35117l().mod(d).equals(bigInteger);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public BigInteger mo34962a(BigInteger bigInteger, byte[] bArr) {
        int bitLength = bigInteger.bitLength();
        int length = bArr.length * 8;
        BigInteger bigInteger2 = new BigInteger(1, bArr);
        return bitLength < length ? bigInteger2.shiftRight(length - bitLength) : bigInteger2;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public C13815f mo34965a() {
        return new C13822i();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public C13812e mo34964a(int i, C13816g gVar) {
        if (i != 1) {
            if (i == 2 || i == 3 || i == 4) {
                return gVar.mo35130a(0).mo35115j();
            }
            if (!(i == 6 || i == 7)) {
                return null;
            }
        }
        return gVar.mo35130a(0);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public SecureRandom mo34963a(boolean z, SecureRandom secureRandom) {
        if (!z) {
            return null;
        }
        return secureRandom != null ? secureRandom : new SecureRandom();
    }
}
