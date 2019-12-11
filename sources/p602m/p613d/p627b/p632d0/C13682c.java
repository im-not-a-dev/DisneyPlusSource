package p602m.p613d.p627b.p632d0;

import java.math.BigInteger;
import p602m.p613d.p653e.p654a.C13805c;
import p602m.p613d.p653e.p654a.C13806d;
import p602m.p613d.p653e.p654a.C13816g;
import p602m.p613d.p683g.C14079a;

/* renamed from: m.d.b.d0.c */
/* compiled from: ECDomainParameters */
public class C13682c implements C13805c {

    /* renamed from: g */
    private C13806d f30437g;

    /* renamed from: h */
    private byte[] f30438h;

    /* renamed from: i */
    private C13816g f30439i;

    /* renamed from: j */
    private BigInteger f30440j;

    /* renamed from: k */
    private BigInteger f30441k;

    public C13682c(C13806d dVar, C13816g gVar, BigInteger bigInteger) {
        this(dVar, gVar, bigInteger, C13805c.f30634b, null);
    }

    /* renamed from: a */
    public C13806d mo34930a() {
        return this.f30437g;
    }

    /* renamed from: b */
    public C13816g mo34931b() {
        return this.f30439i;
    }

    /* renamed from: c */
    public BigInteger mo34932c() {
        return this.f30441k;
    }

    /* renamed from: d */
    public BigInteger mo34933d() {
        return this.f30440j;
    }

    /* renamed from: e */
    public byte[] mo34934e() {
        return C14079a.m44450a(this.f30438h);
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C13682c)) {
            return false;
        }
        C13682c cVar = (C13682c) obj;
        if (!this.f30437g.mo35075a(cVar.f30437g) || !this.f30439i.mo35140b(cVar.f30439i) || !this.f30440j.equals(cVar.f30440j) || !this.f30441k.equals(cVar.f30441k)) {
            z = false;
        }
        return z;
    }

    public int hashCode() {
        return (((((this.f30437g.hashCode() * 37) ^ this.f30439i.hashCode()) * 37) ^ this.f30440j.hashCode()) * 37) ^ this.f30441k.hashCode();
    }

    public C13682c(C13806d dVar, C13816g gVar, BigInteger bigInteger, BigInteger bigInteger2) {
        this(dVar, gVar, bigInteger, bigInteger2, null);
    }

    public C13682c(C13806d dVar, C13816g gVar, BigInteger bigInteger, BigInteger bigInteger2, byte[] bArr) {
        this.f30437g = dVar;
        this.f30439i = gVar.mo35161r();
        this.f30440j = bigInteger;
        this.f30441k = bigInteger2;
        this.f30438h = bArr;
    }
}
