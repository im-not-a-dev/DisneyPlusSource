package p602m.p613d.p662f.p663a;

import p602m.p613d.p614a.C13484b1;
import p602m.p613d.p614a.C13501f;
import p602m.p613d.p614a.C13503f1;
import p602m.p613d.p614a.C13508g;
import p602m.p613d.p614a.C13565l;
import p602m.p613d.p614a.C13589n;
import p602m.p613d.p614a.C13630p;
import p602m.p613d.p614a.C13643t;
import p602m.p613d.p614a.C13646u;
import p602m.p613d.p614a.p625m2.C13587a;
import p602m.p613d.p662f.p681d.p682a.C14069b;
import p602m.p613d.p662f.p681d.p682a.C14075h;
import p602m.p613d.p662f.p681d.p682a.C14076i;

/* renamed from: m.d.f.a.a */
/* compiled from: McElieceCCA2PrivateKey */
public class C13970a extends C13589n {

    /* renamed from: U */
    private int f30841U;

    /* renamed from: V */
    private byte[] f30842V;

    /* renamed from: W */
    private byte[] f30843W;

    /* renamed from: X */
    private byte[] f30844X;

    /* renamed from: Y */
    private C13587a f30845Y;

    /* renamed from: c */
    private int f30846c;

    public C13970a(int i, int i2, C14069b bVar, C14076i iVar, C14075h hVar, C13587a aVar) {
        this.f30846c = i;
        this.f30841U = i2;
        this.f30842V = bVar.mo35627b();
        this.f30843W = iVar.mo35644b();
        this.f30844X = hVar.mo35635a();
        this.f30845Y = aVar;
    }

    /* renamed from: a */
    public C13643t mo34785a() {
        C13508g gVar = new C13508g();
        gVar.mo34796a((C13501f) new C13565l((long) this.f30846c));
        gVar.mo34796a((C13501f) new C13565l((long) this.f30841U));
        gVar.mo34796a((C13501f) new C13484b1(this.f30842V));
        gVar.mo34796a((C13501f) new C13484b1(this.f30843W));
        gVar.mo34796a((C13501f) new C13484b1(this.f30844X));
        gVar.mo34796a((C13501f) this.f30845Y);
        return new C13503f1(gVar);
    }

    /* renamed from: e */
    public C13587a mo35294e() {
        return this.f30845Y;
    }

    /* renamed from: f */
    public C14069b mo35295f() {
        return new C14069b(this.f30842V);
    }

    /* renamed from: g */
    public C14076i mo35296g() {
        return new C14076i(mo35295f(), this.f30843W);
    }

    /* renamed from: h */
    public int mo35297h() {
        return this.f30841U;
    }

    /* renamed from: i */
    public int mo35298i() {
        return this.f30846c;
    }

    /* renamed from: j */
    public C14075h mo35299j() {
        return new C14075h(this.f30844X);
    }

    private C13970a(C13646u uVar) {
        this.f30846c = ((C13565l) uVar.mo34870a(0)).mo34814i().intValue();
        this.f30841U = ((C13565l) uVar.mo34870a(1)).mo34814i().intValue();
        this.f30842V = ((C13630p) uVar.mo34870a(2)).mo34797i();
        this.f30843W = ((C13630p) uVar.mo34870a(3)).mo34797i();
        this.f30844X = ((C13630p) uVar.mo34870a(4)).mo34797i();
        this.f30845Y = C13587a.m41760a(uVar.mo34870a(5));
    }

    /* renamed from: a */
    public static C13970a m44036a(Object obj) {
        if (obj instanceof C13970a) {
            return (C13970a) obj;
        }
        if (obj != null) {
            return new C13970a(C13646u.m41915a(obj));
        }
        return null;
    }
}
