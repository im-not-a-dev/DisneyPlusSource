package p602m.p613d.p662f.p664b.p670e;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Stack;
import java.util.TreeMap;

/* renamed from: m.d.f.b.e.a */
/* compiled from: BDS */
public final class C13996a implements Serializable {

    /* renamed from: U */
    private final int f30937U;

    /* renamed from: V */
    private final List<C13998c> f30938V;

    /* renamed from: W */
    private int f30939W;

    /* renamed from: X */
    private C14024r f30940X;

    /* renamed from: Y */
    private List<C14024r> f30941Y;

    /* renamed from: Z */
    private Map<Integer, LinkedList<C14024r>> f30942Z;

    /* renamed from: a0 */
    private Stack<C14024r> f30943a0;

    /* renamed from: b0 */
    private Map<Integer, C14024r> f30944b0;

    /* renamed from: c */
    private transient C14011j f30945c;

    /* renamed from: c0 */
    private int f30946c0;

    /* renamed from: d0 */
    private boolean f30947d0;

    C13996a(C14027u uVar, int i) {
        this(uVar.mo35461e(), uVar.mo35459c(), uVar.mo35460d());
        this.f30946c0 = i;
        this.f30947d0 = true;
    }

    /* renamed from: b */
    private void m44145b(byte[] bArr, byte[] bArr2, C14008i iVar) {
        if (iVar != null) {
            C14005h hVar = (C14005h) ((C14007b) ((C14007b) new C14007b().mo35430b(iVar.mo35426b())).mo35429a(iVar.mo35427c())).mo35402b();
            C14001f fVar = (C14001f) ((C14003b) ((C14003b) new C14003b().mo35430b(iVar.mo35426b())).mo35429a(iVar.mo35427c())).mo35393b();
            for (int i = 0; i < (1 << this.f30937U); i++) {
                C14010b bVar = (C14010b) ((C14010b) new C14010b().mo35430b(iVar.mo35426b())).mo35429a(iVar.mo35427c());
                bVar.mo35412e(i);
                bVar.mo35410c(iVar.mo35406e());
                bVar.mo35411d(iVar.mo35407f());
                iVar = (C14008i) ((C14010b) bVar.mo35428a(iVar.mo35425a())).mo35409b();
                C14011j jVar = this.f30945c;
                jVar.mo35415a(jVar.mo35416a(bArr2, iVar), bArr);
                C14014m a = this.f30945c.mo35414a(iVar);
                C14007b bVar2 = (C14007b) ((C14007b) new C14007b().mo35430b(hVar.mo35426b())).mo35429a(hVar.mo35427c());
                bVar2.mo35403c(i);
                bVar2.mo35404d(hVar.mo35400f());
                bVar2.mo35405e(hVar.mo35401g());
                hVar = (C14005h) ((C14007b) bVar2.mo35428a(hVar.mo35425a())).mo35402b();
                C14024r a2 = C14025s.m44275a(this.f30945c, a, hVar);
                C14003b bVar3 = (C14003b) ((C14003b) new C14003b().mo35430b(fVar.mo35426b())).mo35429a(fVar.mo35427c());
                bVar3.mo35395d(i);
                fVar = (C14001f) ((C14003b) bVar3.mo35428a(fVar.mo35425a())).mo35393b();
                while (!this.f30943a0.isEmpty() && ((C14024r) this.f30943a0.peek()).mo35454a() == a2.mo35454a()) {
                    int floor = (int) Math.floor((double) (i / (1 << a2.mo35454a())));
                    if (floor == 1) {
                        this.f30941Y.add(a2.clone());
                    }
                    if (floor == 3 && a2.mo35454a() < this.f30937U - this.f30939W) {
                        ((C13998c) this.f30938V.get(a2.mo35454a())).mo35382a(a2.clone());
                    }
                    if (floor >= 3 && (floor & 1) == 1 && a2.mo35454a() >= this.f30937U - this.f30939W && a2.mo35454a() <= this.f30937U - 2) {
                        if (this.f30942Z.get(Integer.valueOf(a2.mo35454a())) == null) {
                            LinkedList linkedList = new LinkedList();
                            linkedList.add(a2.clone());
                            this.f30942Z.put(Integer.valueOf(a2.mo35454a()), linkedList);
                        } else {
                            ((LinkedList) this.f30942Z.get(Integer.valueOf(a2.mo35454a()))).add(a2.clone());
                        }
                    }
                    C14003b bVar4 = (C14003b) ((C14003b) new C14003b().mo35430b(fVar.mo35426b())).mo35429a(fVar.mo35427c());
                    bVar4.mo35394c(fVar.mo35390e());
                    bVar4.mo35395d((fVar.mo35391f() - 1) / 2);
                    C14001f fVar2 = (C14001f) ((C14003b) bVar4.mo35428a(fVar.mo35425a())).mo35393b();
                    C14024r a3 = C14025s.m44276a(this.f30945c, (C14024r) this.f30943a0.pop(), a2, fVar2);
                    C14024r rVar = new C14024r(a3.mo35454a() + 1, a3.mo35455b());
                    C14003b bVar5 = (C14003b) ((C14003b) new C14003b().mo35430b(fVar2.mo35426b())).mo35429a(fVar2.mo35427c());
                    bVar5.mo35394c(fVar2.mo35390e() + 1);
                    bVar5.mo35395d(fVar2.mo35391f());
                    fVar = (C14001f) ((C14003b) bVar5.mo35428a(fVar2.mo35425a())).mo35393b();
                    a2 = rVar;
                }
                this.f30943a0.push(a2);
            }
            this.f30940X = (C14024r) this.f30943a0.pop();
            return;
        }
        throw new NullPointerException("otsHashAddress == null");
    }

    /* renamed from: c */
    private void m44147c(byte[] bArr, byte[] bArr2, C14008i iVar) {
        if (iVar == null) {
            throw new NullPointerException("otsHashAddress == null");
        } else if (this.f30947d0) {
            throw new IllegalStateException("index already used");
        } else if (this.f30946c0 <= (1 << this.f30937U) - 2) {
            C14005h hVar = (C14005h) ((C14007b) ((C14007b) new C14007b().mo35430b(iVar.mo35426b())).mo35429a(iVar.mo35427c())).mo35402b();
            C14001f fVar = (C14001f) ((C14003b) ((C14003b) new C14003b().mo35430b(iVar.mo35426b())).mo35429a(iVar.mo35427c())).mo35393b();
            int a = C14035y.m44314a(this.f30946c0, this.f30937U);
            if (((this.f30946c0 >> (a + 1)) & 1) == 0 && a < this.f30937U - 1) {
                this.f30944b0.put(Integer.valueOf(a), ((C14024r) this.f30941Y.get(a)).clone());
            }
            if (a == 0) {
                C14010b bVar = (C14010b) ((C14010b) new C14010b().mo35430b(iVar.mo35426b())).mo35429a(iVar.mo35427c());
                bVar.mo35412e(this.f30946c0);
                bVar.mo35410c(iVar.mo35406e());
                bVar.mo35411d(iVar.mo35407f());
                iVar = (C14008i) ((C14010b) bVar.mo35428a(iVar.mo35425a())).mo35409b();
                C14011j jVar = this.f30945c;
                jVar.mo35415a(jVar.mo35416a(bArr2, iVar), bArr);
                C14014m a2 = this.f30945c.mo35414a(iVar);
                C14007b bVar2 = (C14007b) ((C14007b) new C14007b().mo35430b(hVar.mo35426b())).mo35429a(hVar.mo35427c());
                bVar2.mo35403c(this.f30946c0);
                bVar2.mo35404d(hVar.mo35400f());
                bVar2.mo35405e(hVar.mo35401g());
                this.f30941Y.set(0, C14025s.m44275a(this.f30945c, a2, (C14005h) ((C14007b) bVar2.mo35428a(hVar.mo35425a())).mo35402b()));
            } else {
                C14003b bVar3 = (C14003b) ((C14003b) new C14003b().mo35430b(fVar.mo35426b())).mo35429a(fVar.mo35427c());
                int i = a - 1;
                bVar3.mo35394c(i);
                bVar3.mo35395d(this.f30946c0 >> a);
                C14024r a3 = C14025s.m44276a(this.f30945c, (C14024r) this.f30941Y.get(i), (C14024r) this.f30944b0.get(Integer.valueOf(i)), (C14001f) ((C14003b) bVar3.mo35428a(fVar.mo35425a())).mo35393b());
                this.f30941Y.set(a, new C14024r(a3.mo35454a() + 1, a3.mo35455b()));
                this.f30944b0.remove(Integer.valueOf(i));
                for (int i2 = 0; i2 < a; i2++) {
                    if (i2 < this.f30937U - this.f30939W) {
                        this.f30941Y.set(i2, ((C13998c) this.f30938V.get(i2)).mo35384c());
                    } else {
                        this.f30941Y.set(i2, ((LinkedList) this.f30942Z.get(Integer.valueOf(i2))).removeFirst());
                    }
                }
                int min = Math.min(a, this.f30937U - this.f30939W);
                for (int i3 = 0; i3 < min; i3++) {
                    int i4 = this.f30946c0 + 1 + ((1 << i3) * 3);
                    if (i4 < (1 << this.f30937U)) {
                        ((C13998c) this.f30938V.get(i3)).mo35380a(i4);
                    }
                }
            }
            for (int i5 = 0; i5 < ((this.f30937U - this.f30939W) >> 1); i5++) {
                C13998c c = m44146c();
                if (c != null) {
                    c.mo35381a(this.f30943a0, this.f30945c, bArr, bArr2, iVar);
                }
            }
            this.f30946c0++;
        } else {
            throw new IllegalStateException("index out of bounds");
        }
    }

    /* renamed from: a */
    public C13996a mo35372a(byte[] bArr, byte[] bArr2, C14008i iVar) {
        return new C13996a(this, bArr, bArr2, iVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo35373a(C14027u uVar) {
        if (this.f30937U == uVar.mo35459c()) {
            this.f30945c = uVar.mo35461e();
            return;
        }
        throw new IllegalStateException("wrong height");
    }

    C13996a(C14027u uVar, byte[] bArr, byte[] bArr2, C14008i iVar) {
        this(uVar.mo35461e(), uVar.mo35459c(), uVar.mo35460d());
        m44145b(bArr, bArr2, iVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public int mo35371a() {
        return this.f30946c0;
    }

    C13996a(C14027u uVar, byte[] bArr, byte[] bArr2, C14008i iVar, int i) {
        this(uVar.mo35461e(), uVar.mo35459c(), uVar.mo35460d());
        m44145b(bArr, bArr2, iVar);
        while (this.f30946c0 < i) {
            m44147c(bArr, bArr2, iVar);
            this.f30947d0 = false;
        }
    }

    private C13996a(C14011j jVar, int i, int i2) {
        this.f30945c = jVar;
        this.f30937U = i;
        this.f30939W = i2;
        if (i2 <= i && i2 >= 2) {
            int i3 = i - i2;
            if (i3 % 2 == 0) {
                this.f30941Y = new ArrayList();
                this.f30942Z = new TreeMap();
                this.f30943a0 = new Stack<>();
                this.f30938V = new ArrayList();
                for (int i4 = 0; i4 < i3; i4++) {
                    this.f30938V.add(new C13998c(i4));
                }
                this.f30944b0 = new TreeMap();
                this.f30946c0 = 0;
                this.f30947d0 = false;
                return;
            }
        }
        throw new IllegalArgumentException("illegal value for BDS parameter k");
    }

    private C13996a(C13996a aVar, byte[] bArr, byte[] bArr2, C14008i iVar) {
        this.f30945c = aVar.f30945c;
        this.f30937U = aVar.f30937U;
        this.f30939W = aVar.f30939W;
        this.f30940X = aVar.f30940X;
        this.f30941Y = new ArrayList(aVar.f30941Y);
        this.f30942Z = aVar.f30942Z;
        this.f30943a0 = (Stack) aVar.f30943a0.clone();
        this.f30938V = aVar.f30938V;
        this.f30944b0 = new TreeMap(aVar.f30944b0);
        this.f30946c0 = aVar.f30946c0;
        m44147c(bArr, bArr2, iVar);
        aVar.f30947d0 = true;
    }

    /* renamed from: c */
    private C13998c m44146c() {
        C13998c cVar = null;
        for (C13998c cVar2 : this.f30938V) {
            if (!cVar2.mo35385d() && cVar2.mo35386e()) {
                if (cVar == null || cVar2.mo35379a() < cVar.mo35379a() || (cVar2.mo35379a() == cVar.mo35379a() && cVar2.mo35383b() < cVar.mo35383b())) {
                    cVar = cVar2;
                }
            }
        }
        return cVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo35374b() {
        if (this.f30941Y == null) {
            throw new IllegalStateException("authenticationPath == null");
        } else if (this.f30942Z == null) {
            throw new IllegalStateException("retain == null");
        } else if (this.f30943a0 == null) {
            throw new IllegalStateException("stack == null");
        } else if (this.f30938V == null) {
            throw new IllegalStateException("treeHashInstances == null");
        } else if (this.f30944b0 == null) {
            throw new IllegalStateException("keep == null");
        } else if (!C14035y.m44319a(this.f30937U, (long) this.f30946c0)) {
            throw new IllegalStateException("index in BDS state out of bounds");
        }
    }
}
