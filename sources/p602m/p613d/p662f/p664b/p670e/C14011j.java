package p602m.p613d.p662f.p664b.p670e;

/* renamed from: m.d.f.b.e.j */
/* compiled from: WOTSPlus */
final class C14011j {

    /* renamed from: a */
    private final C14013l f30978a;

    /* renamed from: b */
    private final C14004g f30979b;

    /* renamed from: c */
    private byte[] f30980c;

    /* renamed from: d */
    private byte[] f30981d;

    protected C14011j(C14013l lVar) {
        if (lVar != null) {
            this.f30978a = lVar;
            int b = lVar.mo35421b();
            this.f30979b = new C14004g(lVar.mo35420a(), b);
            this.f30980c = new byte[b];
            this.f30981d = new byte[b];
            return;
        }
        throw new NullPointerException("params == null");
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo35415a(byte[] bArr, byte[] bArr2) {
        if (bArr == null) {
            throw new NullPointerException("secretKeySeed == null");
        } else if (bArr.length != this.f30978a.mo35421b()) {
            throw new IllegalArgumentException("size of secretKeySeed needs to be equal to size of digest");
        } else if (bArr2 == null) {
            throw new NullPointerException("publicSeed == null");
        } else if (bArr2.length == this.f30978a.mo35421b()) {
            this.f30980c = bArr;
            this.f30981d = bArr2;
        } else {
            throw new IllegalArgumentException("size of publicSeed needs to be equal to size of digest");
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public C14013l mo35417b() {
        return this.f30978a;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public byte[] mo35418c() {
        return C14035y.m44322a(this.f30981d);
    }

    /* renamed from: a */
    private byte[] m44210a(byte[] bArr, int i, int i2, C14008i iVar) {
        int b = this.f30978a.mo35421b();
        if (bArr == null) {
            throw new NullPointerException("startHash == null");
        } else if (bArr.length != b) {
            StringBuilder sb = new StringBuilder();
            sb.append("startHash needs to be ");
            sb.append(b);
            sb.append("bytes");
            throw new IllegalArgumentException(sb.toString());
        } else if (iVar == null) {
            throw new NullPointerException("otsHashAddress == null");
        } else if (iVar.mo35389d() != null) {
            int i3 = i + i2;
            if (i3 > this.f30978a.mo35423d() - 1) {
                throw new IllegalArgumentException("max chain length must not be greater than w");
            } else if (i2 == 0) {
                return bArr;
            } else {
                byte[] a = m44210a(bArr, i, i2 - 1, iVar);
                C14010b bVar = (C14010b) ((C14010b) new C14010b().mo35430b(iVar.mo35426b())).mo35429a(iVar.mo35427c());
                bVar.mo35412e(iVar.mo35408g());
                bVar.mo35410c(iVar.mo35406e());
                bVar.mo35411d(i3 - 1);
                C14008i iVar2 = (C14008i) ((C14010b) bVar.mo35428a(0)).mo35409b();
                byte[] c = this.f30979b.mo35398c(this.f30981d, iVar2.mo35389d());
                C14010b bVar2 = (C14010b) ((C14010b) new C14010b().mo35430b(iVar2.mo35426b())).mo35429a(iVar2.mo35427c());
                bVar2.mo35412e(iVar2.mo35408g());
                bVar2.mo35410c(iVar2.mo35406e());
                bVar2.mo35411d(iVar2.mo35407f());
                byte[] c2 = this.f30979b.mo35398c(this.f30981d, ((C14008i) ((C14010b) bVar2.mo35428a(1)).mo35409b()).mo35389d());
                byte[] bArr2 = new byte[b];
                for (int i4 = 0; i4 < b; i4++) {
                    bArr2[i4] = (byte) (a[i4] ^ c2[i4]);
                }
                return this.f30979b.mo35396a(c, bArr2);
            }
        } else {
            throw new NullPointerException("otsHashAddress byte array == null");
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public byte[] mo35416a(byte[] bArr, C14008i iVar) {
        C14010b bVar = (C14010b) ((C14010b) new C14010b().mo35430b(iVar.mo35426b())).mo35429a(iVar.mo35427c());
        bVar.mo35412e(iVar.mo35408g());
        return this.f30979b.mo35398c(bArr, ((C14008i) bVar.mo35409b()).mo35389d());
    }

    /* renamed from: a */
    private byte[] m44209a(int i) {
        if (i >= 0 && i < this.f30978a.mo35422c()) {
            return this.f30979b.mo35398c(this.f30980c, C14035y.m44328c((long) i, 32));
        }
        throw new IllegalArgumentException("index out of bounds");
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public C14004g mo35413a() {
        return this.f30979b;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public C14014m mo35414a(C14008i iVar) {
        if (iVar != null) {
            byte[][] bArr = new byte[this.f30978a.mo35422c()][];
            C14008i iVar2 = iVar;
            for (int i = 0; i < this.f30978a.mo35422c(); i++) {
                C14010b bVar = (C14010b) ((C14010b) new C14010b().mo35430b(iVar2.mo35426b())).mo35429a(iVar2.mo35427c());
                bVar.mo35412e(iVar2.mo35408g());
                bVar.mo35410c(i);
                bVar.mo35411d(iVar2.mo35407f());
                iVar2 = (C14008i) ((C14010b) bVar.mo35428a(iVar2.mo35425a())).mo35409b();
                bArr[i] = m44210a(m44209a(i), 0, this.f30978a.mo35423d() - 1, iVar2);
            }
            return new C14014m(this.f30978a, bArr);
        }
        throw new NullPointerException("otsHashAddress == null");
    }
}
