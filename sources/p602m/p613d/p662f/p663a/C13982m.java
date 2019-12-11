package p602m.p613d.p662f.p663a;

import java.math.BigInteger;
import p602m.p613d.p614a.C13484b1;
import p602m.p613d.p614a.C13501f;
import p602m.p613d.p614a.C13503f1;
import p602m.p613d.p614a.C13508g;
import p602m.p613d.p614a.C13565l;
import p602m.p613d.p614a.C13589n;
import p602m.p613d.p614a.C13630p;
import p602m.p613d.p614a.C13643t;
import p602m.p613d.p614a.C13646u;
import p602m.p613d.p683g.C14079a;

/* renamed from: m.d.f.a.m */
/* compiled from: XMSSPublicKey */
public class C13982m extends C13589n {

    /* renamed from: U */
    private final byte[] f30904U;

    /* renamed from: c */
    private final byte[] f30905c;

    public C13982m(byte[] bArr, byte[] bArr2) {
        this.f30905c = C14079a.m44450a(bArr);
        this.f30904U = C14079a.m44450a(bArr2);
    }

    /* renamed from: a */
    public static C13982m m44099a(Object obj) {
        if (obj instanceof C13982m) {
            return (C13982m) obj;
        }
        if (obj != null) {
            return new C13982m(C13646u.m41915a(obj));
        }
        return null;
    }

    /* renamed from: e */
    public byte[] mo35336e() {
        return C14079a.m44450a(this.f30905c);
    }

    /* renamed from: f */
    public byte[] mo35337f() {
        return C14079a.m44450a(this.f30904U);
    }

    private C13982m(C13646u uVar) {
        if (C13565l.m41715a((Object) uVar.mo34870a(0)).mo34814i().equals(BigInteger.valueOf(0))) {
            this.f30905c = C14079a.m44450a(C13630p.m41856a((Object) uVar.mo34870a(1)).mo34797i());
            this.f30904U = C14079a.m44450a(C13630p.m41856a((Object) uVar.mo34870a(2)).mo34797i());
            return;
        }
        throw new IllegalArgumentException("unknown version of sequence");
    }

    /* renamed from: a */
    public C13643t mo34785a() {
        C13508g gVar = new C13508g();
        gVar.mo34796a((C13501f) new C13565l(0));
        gVar.mo34796a((C13501f) new C13484b1(this.f30905c));
        gVar.mo34796a((C13501f) new C13484b1(this.f30904U));
        return new C13503f1(gVar);
    }
}
