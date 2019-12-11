package p602m.p613d.p662f.p664b.p670e;

/* renamed from: m.d.f.b.e.s */
/* compiled from: XMSSNodeUtil */
class C14025s {
    /* renamed from: a */
    static C14024r m44275a(C14011j jVar, C14014m mVar, C14005h hVar) {
        double d;
        if (mVar == null) {
            throw new NullPointerException("publicKey == null");
        } else if (hVar != null) {
            int c = jVar.mo35417b().mo35422c();
            byte[][] a = mVar.mo35424a();
            C14024r[] rVarArr = new C14024r[a.length];
            for (int i = 0; i < a.length; i++) {
                rVarArr[i] = new C14024r(0, a[i]);
            }
            C14007b bVar = (C14007b) ((C14007b) new C14007b().mo35430b(hVar.mo35426b())).mo35429a(hVar.mo35427c());
            bVar.mo35403c(hVar.mo35399e());
            bVar.mo35404d(0);
            bVar.mo35405e(hVar.mo35401g());
            C14015n b = ((C14007b) bVar.mo35428a(hVar.mo35425a())).mo35402b();
            while (true) {
                C14005h hVar2 = (C14005h) b;
                if (c <= 1) {
                    return rVarArr[0];
                }
                C14005h hVar3 = hVar2;
                int i2 = 0;
                while (true) {
                    d = (double) (c / 2);
                    if (i2 >= ((int) Math.floor(d))) {
                        break;
                    }
                    C14007b bVar2 = (C14007b) ((C14007b) new C14007b().mo35430b(hVar3.mo35426b())).mo35429a(hVar3.mo35427c());
                    bVar2.mo35403c(hVar3.mo35399e());
                    bVar2.mo35404d(hVar3.mo35400f());
                    bVar2.mo35405e(i2);
                    hVar3 = (C14005h) ((C14007b) bVar2.mo35428a(hVar3.mo35425a())).mo35402b();
                    int i3 = i2 * 2;
                    rVarArr[i2] = m44276a(jVar, rVarArr[i3], rVarArr[i3 + 1], hVar3);
                    i2++;
                }
                if (c % 2 == 1) {
                    rVarArr[(int) Math.floor(d)] = rVarArr[c - 1];
                }
                c = (int) Math.ceil(((double) c) / 2.0d);
                C14007b bVar3 = (C14007b) ((C14007b) new C14007b().mo35430b(hVar3.mo35426b())).mo35429a(hVar3.mo35427c());
                bVar3.mo35403c(hVar3.mo35399e());
                bVar3.mo35404d(hVar3.mo35400f() + 1);
                bVar3.mo35405e(hVar3.mo35401g());
                b = ((C14007b) bVar3.mo35428a(hVar3.mo35425a())).mo35402b();
            }
        } else {
            throw new NullPointerException("address == null");
        }
    }

    /* renamed from: a */
    static C14024r m44276a(C14011j jVar, C14024r rVar, C14024r rVar2, C14015n nVar) {
        if (rVar == null) {
            throw new NullPointerException("left == null");
        } else if (rVar2 == null) {
            throw new NullPointerException("right == null");
        } else if (rVar.mo35454a() != rVar2.mo35454a()) {
            throw new IllegalStateException("height of both nodes must be equal");
        } else if (nVar != null) {
            byte[] c = jVar.mo35418c();
            if (nVar instanceof C14005h) {
                C14005h hVar = (C14005h) nVar;
                C14007b bVar = (C14007b) ((C14007b) new C14007b().mo35430b(hVar.mo35426b())).mo35429a(hVar.mo35427c());
                bVar.mo35403c(hVar.mo35399e());
                bVar.mo35404d(hVar.mo35400f());
                bVar.mo35405e(hVar.mo35401g());
                nVar = (C14005h) ((C14007b) bVar.mo35428a(0)).mo35402b();
            } else if (nVar instanceof C14001f) {
                C14001f fVar = (C14001f) nVar;
                C14003b bVar2 = (C14003b) ((C14003b) new C14003b().mo35430b(fVar.mo35426b())).mo35429a(fVar.mo35427c());
                bVar2.mo35394c(fVar.mo35390e());
                bVar2.mo35395d(fVar.mo35391f());
                nVar = (C14001f) ((C14003b) bVar2.mo35428a(0)).mo35393b();
            }
            byte[] c2 = jVar.mo35413a().mo35398c(c, nVar.mo35389d());
            if (nVar instanceof C14005h) {
                C14005h hVar2 = (C14005h) nVar;
                C14007b bVar3 = (C14007b) ((C14007b) new C14007b().mo35430b(hVar2.mo35426b())).mo35429a(hVar2.mo35427c());
                bVar3.mo35403c(hVar2.mo35399e());
                bVar3.mo35404d(hVar2.mo35400f());
                bVar3.mo35405e(hVar2.mo35401g());
                nVar = (C14005h) ((C14007b) bVar3.mo35428a(1)).mo35402b();
            } else if (nVar instanceof C14001f) {
                C14001f fVar2 = (C14001f) nVar;
                C14003b bVar4 = (C14003b) ((C14003b) new C14003b().mo35430b(fVar2.mo35426b())).mo35429a(fVar2.mo35427c());
                bVar4.mo35394c(fVar2.mo35390e());
                bVar4.mo35395d(fVar2.mo35391f());
                nVar = (C14001f) ((C14003b) bVar4.mo35428a(1)).mo35393b();
            }
            byte[] c3 = jVar.mo35413a().mo35398c(c, nVar.mo35389d());
            if (nVar instanceof C14005h) {
                C14005h hVar3 = (C14005h) nVar;
                C14007b bVar5 = (C14007b) ((C14007b) new C14007b().mo35430b(hVar3.mo35426b())).mo35429a(hVar3.mo35427c());
                bVar5.mo35403c(hVar3.mo35399e());
                bVar5.mo35404d(hVar3.mo35400f());
                bVar5.mo35405e(hVar3.mo35401g());
                nVar = (C14005h) ((C14007b) bVar5.mo35428a(2)).mo35402b();
            } else if (nVar instanceof C14001f) {
                C14001f fVar3 = (C14001f) nVar;
                C14003b bVar6 = (C14003b) ((C14003b) new C14003b().mo35430b(fVar3.mo35426b())).mo35429a(fVar3.mo35427c());
                bVar6.mo35394c(fVar3.mo35390e());
                bVar6.mo35395d(fVar3.mo35391f());
                nVar = (C14001f) ((C14003b) bVar6.mo35428a(2)).mo35393b();
            }
            byte[] c4 = jVar.mo35413a().mo35398c(c, nVar.mo35389d());
            int b = jVar.mo35417b().mo35421b();
            byte[] bArr = new byte[(b * 2)];
            for (int i = 0; i < b; i++) {
                bArr[i] = (byte) (rVar.mo35455b()[i] ^ c3[i]);
            }
            for (int i2 = 0; i2 < b; i2++) {
                bArr[i2 + b] = (byte) (rVar2.mo35455b()[i2] ^ c4[i2]);
            }
            return new C14024r(rVar.mo35454a(), jVar.mo35413a().mo35397b(c2, bArr));
        } else {
            throw new NullPointerException("address == null");
        }
    }
}
