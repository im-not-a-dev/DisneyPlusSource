package p602m.p613d.p649d.p652c;

import java.math.BigInteger;
import java.security.spec.AlgorithmParameterSpec;
import p602m.p613d.p653e.p654a.C13806d;
import p602m.p613d.p653e.p654a.C13816g;

/* renamed from: m.d.d.c.e */
/* compiled from: ECParameterSpec */
public class C13799e implements AlgorithmParameterSpec {

    /* renamed from: a */
    private C13806d f30620a;

    /* renamed from: b */
    private byte[] f30621b;

    /* renamed from: c */
    private C13816g f30622c;

    /* renamed from: d */
    private BigInteger f30623d;

    /* renamed from: e */
    private BigInteger f30624e;

    public C13799e(C13806d dVar, C13816g gVar, BigInteger bigInteger, BigInteger bigInteger2, byte[] bArr) {
        this.f30620a = dVar;
        this.f30622c = gVar.mo35161r();
        this.f30623d = bigInteger;
        this.f30624e = bigInteger2;
        this.f30621b = bArr;
    }

    /* renamed from: a */
    public C13806d mo35043a() {
        return this.f30620a;
    }

    /* renamed from: b */
    public C13816g mo35044b() {
        return this.f30622c;
    }

    /* renamed from: c */
    public BigInteger mo35045c() {
        return this.f30624e;
    }

    /* renamed from: d */
    public BigInteger mo35046d() {
        return this.f30623d;
    }

    /* renamed from: e */
    public byte[] mo35047e() {
        return this.f30621b;
    }

    public boolean equals(Object obj) {
        boolean z = false;
        if (!(obj instanceof C13799e)) {
            return false;
        }
        C13799e eVar = (C13799e) obj;
        if (mo35043a().mo35075a(eVar.mo35043a()) && mo35044b().mo35140b(eVar.mo35044b())) {
            z = true;
        }
        return z;
    }

    public int hashCode() {
        return mo35043a().hashCode() ^ mo35044b().hashCode();
    }
}
