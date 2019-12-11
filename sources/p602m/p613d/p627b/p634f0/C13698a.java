package p602m.p613d.p627b.p634f0;

import java.io.IOException;
import java.math.BigInteger;
import p602m.p613d.p614a.C13501f;
import p602m.p613d.p614a.C13503f1;
import p602m.p613d.p614a.C13508g;
import p602m.p613d.p614a.C13565l;
import p602m.p613d.p614a.C13643t;
import p602m.p613d.p614a.C13646u;
import p602m.p613d.p627b.C13697f;
import p602m.p613d.p627b.C13704h;
import p602m.p613d.p627b.C13708l;
import p602m.p613d.p627b.C13718v;
import p602m.p613d.p627b.p632d0.C13681b;
import p602m.p613d.p627b.p632d0.C13694o;

/* renamed from: m.d.b.f0.a */
/* compiled from: DSADigestSigner */
public class C13698a implements C13718v {

    /* renamed from: a */
    private final C13708l f30458a;

    /* renamed from: b */
    private final C13704h f30459b;

    /* renamed from: c */
    private boolean f30460c;

    public C13698a(C13704h hVar, C13708l lVar) {
        this.f30458a = lVar;
        this.f30459b = hVar;
    }

    /* renamed from: a */
    public void mo34953a(boolean z, C13697f fVar) {
        C13681b bVar;
        this.f30460c = z;
        if (fVar instanceof C13694o) {
            bVar = (C13681b) ((C13694o) fVar).mo34949a();
        } else {
            bVar = (C13681b) fVar;
        }
        if (z && !bVar.mo34929a()) {
            throw new IllegalArgumentException("Signing Requires Private Key.");
        } else if (z || !bVar.mo34929a()) {
            mo34957b();
            this.f30459b.mo34966a(z, fVar);
        } else {
            throw new IllegalArgumentException("Verification Requires Public Key.");
        }
    }

    /* renamed from: b */
    public void mo34957b() {
        this.f30458a.reset();
    }

    /* renamed from: b */
    private BigInteger[] m42077b(byte[] bArr) throws IOException {
        C13646u uVar = (C13646u) C13643t.m41897a(bArr);
        return new BigInteger[]{((C13565l) uVar.mo34870a(0)).mo34814i(), ((C13565l) uVar.mo34870a(1)).mo34814i()};
    }

    /* renamed from: a */
    public void mo34954a(byte[] bArr, int i, int i2) {
        this.f30458a.mo34972a(bArr, i, i2);
    }

    /* renamed from: a */
    public byte[] mo34956a() {
        if (this.f30460c) {
            byte[] bArr = new byte[this.f30458a.mo34973b()];
            this.f30458a.mo34970a(bArr, 0);
            BigInteger[] a = this.f30459b.mo34968a(bArr);
            try {
                return m42076a(a[0], a[1]);
            } catch (IOException unused) {
                throw new IllegalStateException("unable to encode signature");
            }
        } else {
            throw new IllegalStateException("DSADigestSigner not initialised for signature generation.");
        }
    }

    /* renamed from: a */
    public boolean mo34955a(byte[] bArr) {
        if (!this.f30460c) {
            byte[] bArr2 = new byte[this.f30458a.mo34973b()];
            this.f30458a.mo34970a(bArr2, 0);
            try {
                BigInteger[] b = m42077b(bArr);
                return this.f30459b.mo34967a(bArr2, b[0], b[1]);
            } catch (IOException unused) {
                return false;
            }
        } else {
            throw new IllegalStateException("DSADigestSigner not initialised for verification");
        }
    }

    /* renamed from: a */
    private byte[] m42076a(BigInteger bigInteger, BigInteger bigInteger2) throws IOException {
        C13508g gVar = new C13508g();
        gVar.mo34796a((C13501f) new C13565l(bigInteger));
        gVar.mo34796a((C13501f) new C13565l(bigInteger2));
        return new C13503f1(gVar).mo34827a("DER");
    }
}
