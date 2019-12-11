package p602m.p613d.p662f.p663a;

import java.math.BigInteger;
import p602m.p613d.p614a.C13479a0;
import p602m.p613d.p614a.C13484b1;
import p602m.p613d.p614a.C13501f;
import p602m.p613d.p614a.C13503f1;
import p602m.p613d.p614a.C13508g;
import p602m.p613d.p614a.C13528k1;
import p602m.p613d.p614a.C13565l;
import p602m.p613d.p614a.C13589n;
import p602m.p613d.p614a.C13630p;
import p602m.p613d.p614a.C13643t;
import p602m.p613d.p614a.C13646u;
import p602m.p613d.p683g.C14079a;

/* renamed from: m.d.f.a.l */
/* compiled from: XMSSPrivateKey */
public class C13981l extends C13589n {

    /* renamed from: U */
    private final byte[] f30898U;

    /* renamed from: V */
    private final byte[] f30899V;

    /* renamed from: W */
    private final byte[] f30900W;

    /* renamed from: X */
    private final byte[] f30901X;

    /* renamed from: Y */
    private final byte[] f30902Y;

    /* renamed from: c */
    private final int f30903c;

    public C13981l(int i, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, byte[] bArr5) {
        this.f30903c = i;
        this.f30898U = C14079a.m44450a(bArr);
        this.f30899V = C14079a.m44450a(bArr2);
        this.f30900W = C14079a.m44450a(bArr3);
        this.f30901X = C14079a.m44450a(bArr4);
        this.f30902Y = C14079a.m44450a(bArr5);
    }

    /* renamed from: a */
    public static C13981l m44091a(Object obj) {
        if (obj instanceof C13981l) {
            return (C13981l) obj;
        }
        if (obj != null) {
            return new C13981l(C13646u.m41915a(obj));
        }
        return null;
    }

    /* renamed from: e */
    public byte[] mo35330e() {
        return C14079a.m44450a(this.f30902Y);
    }

    /* renamed from: f */
    public int mo35331f() {
        return this.f30903c;
    }

    /* renamed from: g */
    public byte[] mo35332g() {
        return C14079a.m44450a(this.f30900W);
    }

    /* renamed from: h */
    public byte[] mo35333h() {
        return C14079a.m44450a(this.f30901X);
    }

    /* renamed from: i */
    public byte[] mo35334i() {
        return C14079a.m44450a(this.f30899V);
    }

    /* renamed from: j */
    public byte[] mo35335j() {
        return C14079a.m44450a(this.f30898U);
    }

    /* renamed from: a */
    public C13643t mo34785a() {
        C13508g gVar = new C13508g();
        gVar.mo34796a((C13501f) new C13565l(0));
        C13508g gVar2 = new C13508g();
        gVar2.mo34796a((C13501f) new C13565l((long) this.f30903c));
        gVar2.mo34796a((C13501f) new C13484b1(this.f30898U));
        gVar2.mo34796a((C13501f) new C13484b1(this.f30899V));
        gVar2.mo34796a((C13501f) new C13484b1(this.f30900W));
        gVar2.mo34796a((C13501f) new C13484b1(this.f30901X));
        gVar.mo34796a((C13501f) new C13503f1(gVar2));
        gVar.mo34796a((C13501f) new C13528k1(true, 0, new C13484b1(this.f30902Y)));
        return new C13503f1(gVar);
    }

    private C13981l(C13646u uVar) {
        if (!C13565l.m41715a((Object) uVar.mo34870a(0)).mo34814i().equals(BigInteger.valueOf(0))) {
            throw new IllegalArgumentException("unknown version of sequence");
        } else if (uVar.mo34873j() == 2 || uVar.mo34873j() == 3) {
            C13646u a = C13646u.m41915a((Object) uVar.mo34870a(1));
            this.f30903c = C13565l.m41715a((Object) a.mo34870a(0)).mo34814i().intValue();
            this.f30898U = C14079a.m44450a(C13630p.m41856a((Object) a.mo34870a(1)).mo34797i());
            this.f30899V = C14079a.m44450a(C13630p.m41856a((Object) a.mo34870a(2)).mo34797i());
            this.f30900W = C14079a.m44450a(C13630p.m41856a((Object) a.mo34870a(3)).mo34797i());
            this.f30901X = C14079a.m44450a(C13630p.m41856a((Object) a.mo34870a(4)).mo34797i());
            if (uVar.mo34873j() == 3) {
                this.f30902Y = C14079a.m44450a(C13630p.m41857a(C13479a0.m41519a((Object) uVar.mo34870a(2)), true).mo34797i());
            } else {
                this.f30902Y = null;
            }
        } else {
            throw new IllegalArgumentException("key sequence wrong size");
        }
    }
}
