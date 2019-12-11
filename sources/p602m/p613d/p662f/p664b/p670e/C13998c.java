package p602m.p613d.p662f.p664b.p670e;

import java.io.Serializable;
import java.util.Stack;

/* renamed from: m.d.f.b.e.c */
/* compiled from: BDSTreeHash */
class C13998c implements Serializable {

    /* renamed from: U */
    private final int f30949U;

    /* renamed from: V */
    private int f30950V;

    /* renamed from: W */
    private int f30951W;

    /* renamed from: X */
    private boolean f30952X = false;

    /* renamed from: Y */
    private boolean f30953Y = false;

    /* renamed from: c */
    private C14024r f30954c;

    C13998c(int i) {
        this.f30949U = i;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo35380a(int i) {
        this.f30954c = null;
        this.f30950V = this.f30949U;
        this.f30951W = i;
        this.f30952X = true;
        this.f30953Y = false;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public int mo35383b() {
        return this.f30951W;
    }

    /* renamed from: c */
    public C14024r mo35384c() {
        return this.f30954c.clone();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public boolean mo35385d() {
        return this.f30953Y;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: e */
    public boolean mo35386e() {
        return this.f30952X;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo35381a(Stack<C14024r> stack, C14011j jVar, byte[] bArr, byte[] bArr2, C14008i iVar) {
        if (iVar == null) {
            throw new NullPointerException("otsHashAddress == null");
        } else if (this.f30953Y || !this.f30952X) {
            throw new IllegalStateException("finished or not initialized");
        } else {
            C14010b bVar = (C14010b) ((C14010b) new C14010b().mo35430b(iVar.mo35426b())).mo35429a(iVar.mo35427c());
            bVar.mo35412e(this.f30951W);
            bVar.mo35410c(iVar.mo35406e());
            bVar.mo35411d(iVar.mo35407f());
            C14008i iVar2 = (C14008i) ((C14010b) bVar.mo35428a(iVar.mo35425a())).mo35409b();
            C14007b bVar2 = (C14007b) ((C14007b) new C14007b().mo35430b(iVar2.mo35426b())).mo35429a(iVar2.mo35427c());
            bVar2.mo35403c(this.f30951W);
            C14005h hVar = (C14005h) bVar2.mo35402b();
            C14003b bVar3 = (C14003b) ((C14003b) new C14003b().mo35430b(iVar2.mo35426b())).mo35429a(iVar2.mo35427c());
            bVar3.mo35395d(this.f30951W);
            C14001f fVar = (C14001f) bVar3.mo35393b();
            jVar.mo35415a(jVar.mo35416a(bArr2, iVar2), bArr);
            C14024r a = C14025s.m44275a(jVar, jVar.mo35414a(iVar2), hVar);
            while (!stack.isEmpty() && ((C14024r) stack.peek()).mo35454a() == a.mo35454a() && ((C14024r) stack.peek()).mo35454a() != this.f30949U) {
                C14003b bVar4 = (C14003b) ((C14003b) new C14003b().mo35430b(fVar.mo35426b())).mo35429a(fVar.mo35427c());
                bVar4.mo35394c(fVar.mo35390e());
                bVar4.mo35395d((fVar.mo35391f() - 1) / 2);
                C14001f fVar2 = (C14001f) ((C14003b) bVar4.mo35428a(fVar.mo35425a())).mo35393b();
                C14024r a2 = C14025s.m44276a(jVar, (C14024r) stack.pop(), a, fVar2);
                C14024r rVar = new C14024r(a2.mo35454a() + 1, a2.mo35455b());
                C14003b bVar5 = (C14003b) ((C14003b) new C14003b().mo35430b(fVar2.mo35426b())).mo35429a(fVar2.mo35427c());
                bVar5.mo35394c(fVar2.mo35390e() + 1);
                bVar5.mo35395d(fVar2.mo35391f());
                fVar = (C14001f) ((C14003b) bVar5.mo35428a(fVar2.mo35425a())).mo35393b();
                a = rVar;
            }
            C14024r rVar2 = this.f30954c;
            if (rVar2 == null) {
                this.f30954c = a;
            } else if (rVar2.mo35454a() == a.mo35454a()) {
                C14003b bVar6 = (C14003b) ((C14003b) new C14003b().mo35430b(fVar.mo35426b())).mo35429a(fVar.mo35427c());
                bVar6.mo35394c(fVar.mo35390e());
                bVar6.mo35395d((fVar.mo35391f() - 1) / 2);
                C14001f fVar3 = (C14001f) ((C14003b) bVar6.mo35428a(fVar.mo35425a())).mo35393b();
                a = new C14024r(this.f30954c.mo35454a() + 1, C14025s.m44276a(jVar, this.f30954c, a, fVar3).mo35455b());
                this.f30954c = a;
                C14003b bVar7 = (C14003b) ((C14003b) new C14003b().mo35430b(fVar3.mo35426b())).mo35429a(fVar3.mo35427c());
                bVar7.mo35394c(fVar3.mo35390e() + 1);
                bVar7.mo35395d(fVar3.mo35391f());
                C14001f fVar4 = (C14001f) ((C14003b) bVar7.mo35428a(fVar3.mo35425a())).mo35393b();
            } else {
                stack.push(a);
            }
            if (this.f30954c.mo35454a() == this.f30949U) {
                this.f30953Y = true;
                return;
            }
            this.f30950V = a.mo35454a();
            this.f30951W++;
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public int mo35379a() {
        if (!this.f30952X || this.f30953Y) {
            return Integer.MAX_VALUE;
        }
        return this.f30950V;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo35382a(C14024r rVar) {
        this.f30954c = rVar;
        this.f30950V = rVar.mo35454a();
        if (this.f30950V == this.f30949U) {
            this.f30953Y = true;
        }
    }
}
