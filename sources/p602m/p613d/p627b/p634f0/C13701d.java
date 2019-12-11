package p602m.p613d.p627b.p634f0;

import java.math.BigInteger;
import java.security.SecureRandom;

/* renamed from: m.d.b.f0.d */
/* compiled from: RandomDSAKCalculator */
public class C13701d implements C13699b {

    /* renamed from: c */
    private static final BigInteger f30464c = BigInteger.valueOf(0);

    /* renamed from: a */
    private BigInteger f30465a;

    /* renamed from: b */
    private SecureRandom f30466b;

    /* renamed from: a */
    public void mo34960a(BigInteger bigInteger, SecureRandom secureRandom) {
        this.f30465a = bigInteger;
        this.f30466b = secureRandom;
    }

    /* renamed from: b */
    public boolean mo34961b() {
        return false;
    }

    /* renamed from: a */
    public void mo34959a(BigInteger bigInteger, BigInteger bigInteger2, byte[] bArr) {
        throw new IllegalStateException("Operation not supported");
    }

    /* renamed from: a */
    public BigInteger mo34958a() {
        int bitLength = this.f30465a.bitLength();
        while (true) {
            BigInteger bigInteger = new BigInteger(bitLength, this.f30466b);
            if (!bigInteger.equals(f30464c) && bigInteger.compareTo(this.f30465a) < 0) {
                return bigInteger;
            }
        }
    }
}
