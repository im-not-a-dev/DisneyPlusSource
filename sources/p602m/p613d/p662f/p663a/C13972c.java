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
import p602m.p613d.p662f.p681d.p682a.C14068a;
import p602m.p613d.p662f.p681d.p682a.C14069b;
import p602m.p613d.p662f.p681d.p682a.C14075h;
import p602m.p613d.p662f.p681d.p682a.C14076i;

/* renamed from: m.d.f.a.c */
/* compiled from: McEliecePrivateKey */
public class C13972c extends C13589n {

    /* renamed from: U */
    private int f30851U;

    /* renamed from: V */
    private byte[] f30852V;

    /* renamed from: W */
    private byte[] f30853W;

    /* renamed from: X */
    private byte[] f30854X;

    /* renamed from: Y */
    private byte[] f30855Y;

    /* renamed from: Z */
    private byte[] f30856Z;

    /* renamed from: c */
    private int f30857c;

    public C13972c(int i, int i2, C14069b bVar, C14076i iVar, C14075h hVar, C14075h hVar2, C14068a aVar) {
        this.f30857c = i;
        this.f30851U = i2;
        this.f30852V = bVar.mo35627b();
        this.f30853W = iVar.mo35644b();
        this.f30854X = aVar.mo35618c();
        this.f30855Y = hVar.mo35635a();
        this.f30856Z = hVar2.mo35635a();
    }

    /* renamed from: a */
    public static C13972c m44050a(Object obj) {
        if (obj instanceof C13972c) {
            return (C13972c) obj;
        }
        if (obj != null) {
            return new C13972c(C13646u.m41915a(obj));
        }
        return null;
    }

    /* renamed from: e */
    public C14069b mo35304e() {
        return new C14069b(this.f30852V);
    }

    /* renamed from: f */
    public C14076i mo35305f() {
        return new C14076i(mo35304e(), this.f30853W);
    }

    /* renamed from: g */
    public int mo35306g() {
        return this.f30851U;
    }

    /* renamed from: h */
    public int mo35307h() {
        return this.f30857c;
    }

    /* renamed from: i */
    public C14075h mo35308i() {
        return new C14075h(this.f30855Y);
    }

    /* renamed from: j */
    public C14075h mo35309j() {
        return new C14075h(this.f30856Z);
    }

    /* renamed from: k */
    public C14068a mo35310k() {
        return new C14068a(this.f30854X);
    }

    /* renamed from: a */
    public C13643t mo34785a() {
        C13508g gVar = new C13508g();
        gVar.mo34796a((C13501f) new C13565l((long) this.f30857c));
        gVar.mo34796a((C13501f) new C13565l((long) this.f30851U));
        gVar.mo34796a((C13501f) new C13484b1(this.f30852V));
        gVar.mo34796a((C13501f) new C13484b1(this.f30853W));
        gVar.mo34796a((C13501f) new C13484b1(this.f30855Y));
        gVar.mo34796a((C13501f) new C13484b1(this.f30856Z));
        gVar.mo34796a((C13501f) new C13484b1(this.f30854X));
        return new C13503f1(gVar);
    }

    private C13972c(C13646u uVar) {
        this.f30857c = ((C13565l) uVar.mo34870a(0)).mo34814i().intValue();
        this.f30851U = ((C13565l) uVar.mo34870a(1)).mo34814i().intValue();
        this.f30852V = ((C13630p) uVar.mo34870a(2)).mo34797i();
        this.f30853W = ((C13630p) uVar.mo34870a(3)).mo34797i();
        this.f30855Y = ((C13630p) uVar.mo34870a(4)).mo34797i();
        this.f30856Z = ((C13630p) uVar.mo34870a(5)).mo34797i();
        this.f30854X = ((C13630p) uVar.mo34870a(6)).mo34797i();
    }
}
