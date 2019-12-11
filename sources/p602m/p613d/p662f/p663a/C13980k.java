package p602m.p613d.p662f.p663a;

import p602m.p613d.p614a.C13484b1;
import p602m.p613d.p614a.C13501f;
import p602m.p613d.p614a.C13503f1;
import p602m.p613d.p614a.C13508g;
import p602m.p613d.p614a.C13528k1;
import p602m.p613d.p614a.C13565l;
import p602m.p613d.p614a.C13589n;
import p602m.p613d.p614a.C13643t;
import p602m.p613d.p683g.C14079a;

/* renamed from: m.d.f.a.k */
/* compiled from: XMSSMTPrivateKey */
public class C13980k extends C13589n {

    /* renamed from: U */
    private final byte[] f30892U;

    /* renamed from: V */
    private final byte[] f30893V;

    /* renamed from: W */
    private final byte[] f30894W;

    /* renamed from: X */
    private final byte[] f30895X;

    /* renamed from: Y */
    private final byte[] f30896Y;

    /* renamed from: c */
    private final int f30897c;

    public C13980k(int i, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, byte[] bArr5) {
        this.f30897c = i;
        this.f30892U = C14079a.m44450a(bArr);
        this.f30893V = C14079a.m44450a(bArr2);
        this.f30894W = C14079a.m44450a(bArr3);
        this.f30895X = C14079a.m44450a(bArr4);
        this.f30896Y = C14079a.m44450a(bArr5);
    }

    /* renamed from: a */
    public C13643t mo34785a() {
        C13508g gVar = new C13508g();
        gVar.mo34796a((C13501f) new C13565l(0));
        C13508g gVar2 = new C13508g();
        gVar2.mo34796a((C13501f) new C13565l((long) this.f30897c));
        gVar2.mo34796a((C13501f) new C13484b1(this.f30892U));
        gVar2.mo34796a((C13501f) new C13484b1(this.f30893V));
        gVar2.mo34796a((C13501f) new C13484b1(this.f30894W));
        gVar2.mo34796a((C13501f) new C13484b1(this.f30895X));
        gVar.mo34796a((C13501f) new C13503f1(gVar2));
        gVar.mo34796a((C13501f) new C13528k1(true, 0, new C13484b1(this.f30896Y)));
        return new C13503f1(gVar);
    }
}
