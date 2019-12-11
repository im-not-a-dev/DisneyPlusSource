package p602m.p613d.p662f.p663a;

import p602m.p613d.p614a.C13484b1;
import p602m.p613d.p614a.C13501f;
import p602m.p613d.p614a.C13503f1;
import p602m.p613d.p614a.C13508g;
import p602m.p613d.p614a.C13565l;
import p602m.p613d.p614a.C13589n;
import p602m.p613d.p614a.C13626o;
import p602m.p613d.p614a.C13630p;
import p602m.p613d.p614a.C13643t;
import p602m.p613d.p614a.C13646u;
import p602m.p613d.p662f.p664b.p667c.p668b.C13993a;

/* renamed from: m.d.f.a.g */
/* compiled from: RainbowPublicKey */
public class C13976g extends C13589n {

    /* renamed from: U */
    private C13626o f30877U;

    /* renamed from: V */
    private C13565l f30878V;

    /* renamed from: W */
    private byte[][] f30879W;

    /* renamed from: X */
    private byte[][] f30880X;

    /* renamed from: Y */
    private byte[] f30881Y;

    /* renamed from: c */
    private C13565l f30882c;

    private C13976g(C13646u uVar) {
        if (uVar.mo34870a(0) instanceof C13565l) {
            this.f30882c = C13565l.m41715a((Object) uVar.mo34870a(0));
        } else {
            this.f30877U = C13626o.m41837a((Object) uVar.mo34870a(0));
        }
        this.f30878V = C13565l.m41715a((Object) uVar.mo34870a(1));
        C13646u a = C13646u.m41915a((Object) uVar.mo34870a(2));
        this.f30879W = new byte[a.mo34873j()][];
        for (int i = 0; i < a.mo34873j(); i++) {
            this.f30879W[i] = C13630p.m41856a((Object) a.mo34870a(i)).mo34797i();
        }
        C13646u uVar2 = (C13646u) uVar.mo34870a(3);
        this.f30880X = new byte[uVar2.mo34873j()][];
        for (int i2 = 0; i2 < uVar2.mo34873j(); i2++) {
            this.f30880X[i2] = C13630p.m41856a((Object) uVar2.mo34870a(i2)).mo34797i();
        }
        this.f30881Y = C13630p.m41856a((Object) ((C13646u) uVar.mo34870a(4)).mo34870a(0)).mo34797i();
    }

    /* renamed from: a */
    public static C13976g m44072a(Object obj) {
        if (obj instanceof C13976g) {
            return (C13976g) obj;
        }
        if (obj != null) {
            return new C13976g(C13646u.m41915a(obj));
        }
        return null;
    }

    /* renamed from: e */
    public short[][] mo35320e() {
        return C13993a.m44139a(this.f30879W);
    }

    /* renamed from: f */
    public short[] mo35321f() {
        return C13993a.m44137a(this.f30881Y);
    }

    /* renamed from: g */
    public short[][] mo35322g() {
        return C13993a.m44139a(this.f30880X);
    }

    /* renamed from: h */
    public int mo35323h() {
        return this.f30878V.mo34814i().intValue();
    }

    /* renamed from: a */
    public C13643t mo34785a() {
        C13508g gVar = new C13508g();
        C13565l lVar = this.f30882c;
        if (lVar != null) {
            gVar.mo34796a((C13501f) lVar);
        } else {
            gVar.mo34796a((C13501f) this.f30877U);
        }
        gVar.mo34796a((C13501f) this.f30878V);
        C13508g gVar2 = new C13508g();
        int i = 0;
        int i2 = 0;
        while (true) {
            byte[][] bArr = this.f30879W;
            if (i2 >= bArr.length) {
                break;
            }
            gVar2.mo34796a((C13501f) new C13484b1(bArr[i2]));
            i2++;
        }
        gVar.mo34796a((C13501f) new C13503f1(gVar2));
        C13508g gVar3 = new C13508g();
        while (true) {
            byte[][] bArr2 = this.f30880X;
            if (i < bArr2.length) {
                gVar3.mo34796a((C13501f) new C13484b1(bArr2[i]));
                i++;
            } else {
                gVar.mo34796a((C13501f) new C13503f1(gVar3));
                C13508g gVar4 = new C13508g();
                gVar4.mo34796a((C13501f) new C13484b1(this.f30881Y));
                gVar.mo34796a((C13501f) new C13503f1(gVar4));
                return new C13503f1(gVar);
            }
        }
    }

    public C13976g(int i, short[][] sArr, short[][] sArr2, short[] sArr3) {
        this.f30882c = new C13565l(0);
        this.f30878V = new C13565l((long) i);
        this.f30879W = C13993a.m44138a(sArr);
        this.f30880X = C13993a.m44138a(sArr2);
        this.f30881Y = C13993a.m44136a(sArr3);
    }
}
