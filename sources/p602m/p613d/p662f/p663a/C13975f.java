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
import p602m.p613d.p662f.p664b.p667c.C13992a;
import p602m.p613d.p662f.p664b.p667c.p668b.C13993a;

/* renamed from: m.d.f.a.f */
/* compiled from: RainbowPrivateKey */
public class C13975f extends C13589n {

    /* renamed from: U */
    private C13626o f30869U;

    /* renamed from: V */
    private byte[][] f30870V;

    /* renamed from: W */
    private byte[] f30871W;

    /* renamed from: X */
    private byte[][] f30872X;

    /* renamed from: Y */
    private byte[] f30873Y;

    /* renamed from: Z */
    private byte[] f30874Z;

    /* renamed from: a0 */
    private C13992a[] f30875a0;

    /* renamed from: c */
    private C13565l f30876c;

    private C13975f(C13646u uVar) {
        C13646u uVar2 = uVar;
        int i = 0;
        if (uVar2.mo34870a(0) instanceof C13565l) {
            this.f30876c = C13565l.m41715a((Object) uVar2.mo34870a(0));
        } else {
            this.f30869U = C13626o.m41837a((Object) uVar2.mo34870a(0));
        }
        C13646u uVar3 = (C13646u) uVar2.mo34870a(1);
        this.f30870V = new byte[uVar3.mo34873j()][];
        for (int i2 = 0; i2 < uVar3.mo34873j(); i2++) {
            this.f30870V[i2] = ((C13630p) uVar3.mo34870a(i2)).mo34797i();
        }
        this.f30871W = ((C13630p) ((C13646u) uVar2.mo34870a(2)).mo34870a(0)).mo34797i();
        C13646u uVar4 = (C13646u) uVar2.mo34870a(3);
        this.f30872X = new byte[uVar4.mo34873j()][];
        for (int i3 = 0; i3 < uVar4.mo34873j(); i3++) {
            this.f30872X[i3] = ((C13630p) uVar4.mo34870a(i3)).mo34797i();
        }
        this.f30873Y = ((C13630p) ((C13646u) uVar2.mo34870a(4)).mo34870a(0)).mo34797i();
        this.f30874Z = ((C13630p) ((C13646u) uVar2.mo34870a(5)).mo34870a(0)).mo34797i();
        C13646u uVar5 = (C13646u) uVar2.mo34870a(6);
        byte[][][][] bArr = new byte[uVar5.mo34873j()][][][];
        byte[][][][] bArr2 = new byte[uVar5.mo34873j()][][][];
        byte[][][] bArr3 = new byte[uVar5.mo34873j()][][];
        byte[][] bArr4 = new byte[uVar5.mo34873j()][];
        int i4 = 0;
        while (i4 < uVar5.mo34873j()) {
            C13646u uVar6 = (C13646u) uVar5.mo34870a(i4);
            C13646u uVar7 = (C13646u) uVar6.mo34870a(i);
            bArr[i4] = new byte[uVar7.mo34873j()][][];
            for (int i5 = 0; i5 < uVar7.mo34873j(); i5++) {
                C13646u uVar8 = (C13646u) uVar7.mo34870a(i5);
                bArr[i4][i5] = new byte[uVar8.mo34873j()][];
                for (int i6 = 0; i6 < uVar8.mo34873j(); i6++) {
                    bArr[i4][i5][i6] = ((C13630p) uVar8.mo34870a(i6)).mo34797i();
                }
            }
            C13646u uVar9 = (C13646u) uVar6.mo34870a(1);
            bArr2[i4] = new byte[uVar9.mo34873j()][][];
            for (int i7 = 0; i7 < uVar9.mo34873j(); i7++) {
                C13646u uVar10 = (C13646u) uVar9.mo34870a(i7);
                bArr2[i4][i7] = new byte[uVar10.mo34873j()][];
                for (int i8 = 0; i8 < uVar10.mo34873j(); i8++) {
                    bArr2[i4][i7][i8] = ((C13630p) uVar10.mo34870a(i8)).mo34797i();
                }
            }
            C13646u uVar11 = (C13646u) uVar6.mo34870a(2);
            bArr3[i4] = new byte[uVar11.mo34873j()][];
            for (int i9 = 0; i9 < uVar11.mo34873j(); i9++) {
                bArr3[i4][i9] = ((C13630p) uVar11.mo34870a(i9)).mo34797i();
            }
            bArr4[i4] = ((C13630p) uVar6.mo34870a(3)).mo34797i();
            i4++;
            i = 0;
        }
        int length = this.f30874Z.length - 1;
        this.f30875a0 = new C13992a[length];
        int i10 = 0;
        while (i10 < length) {
            byte[] bArr5 = this.f30874Z;
            int i11 = i10 + 1;
            C13992a aVar = new C13992a(bArr5[i10], bArr5[i11], C13993a.m44141a(bArr[i10]), C13993a.m44141a(bArr2[i10]), C13993a.m44139a(bArr3[i10]), C13993a.m44137a(bArr4[i10]));
            this.f30875a0[i10] = aVar;
            i10 = i11;
        }
    }

    /* renamed from: a */
    public static C13975f m44064a(Object obj) {
        if (obj instanceof C13975f) {
            return (C13975f) obj;
        }
        if (obj != null) {
            return new C13975f(C13646u.m41915a(obj));
        }
        return null;
    }

    /* renamed from: e */
    public short[] mo35314e() {
        return C13993a.m44137a(this.f30871W);
    }

    /* renamed from: f */
    public short[] mo35315f() {
        return C13993a.m44137a(this.f30873Y);
    }

    /* renamed from: g */
    public short[][] mo35316g() {
        return C13993a.m44139a(this.f30870V);
    }

    /* renamed from: h */
    public short[][] mo35317h() {
        return C13993a.m44139a(this.f30872X);
    }

    /* renamed from: i */
    public C13992a[] mo35318i() {
        return this.f30875a0;
    }

    /* renamed from: j */
    public int[] mo35319j() {
        return C13993a.m44142b(this.f30874Z);
    }

    /* renamed from: a */
    public C13643t mo34785a() {
        C13508g gVar = new C13508g();
        C13565l lVar = this.f30876c;
        if (lVar != null) {
            gVar.mo34796a((C13501f) lVar);
        } else {
            gVar.mo34796a((C13501f) this.f30869U);
        }
        C13508g gVar2 = new C13508g();
        int i = 0;
        while (true) {
            byte[][] bArr = this.f30870V;
            if (i >= bArr.length) {
                break;
            }
            gVar2.mo34796a((C13501f) new C13484b1(bArr[i]));
            i++;
        }
        gVar.mo34796a((C13501f) new C13503f1(gVar2));
        C13508g gVar3 = new C13508g();
        gVar3.mo34796a((C13501f) new C13484b1(this.f30871W));
        gVar.mo34796a((C13501f) new C13503f1(gVar3));
        C13508g gVar4 = new C13508g();
        int i2 = 0;
        while (true) {
            byte[][] bArr2 = this.f30872X;
            if (i2 >= bArr2.length) {
                break;
            }
            gVar4.mo34796a((C13501f) new C13484b1(bArr2[i2]));
            i2++;
        }
        gVar.mo34796a((C13501f) new C13503f1(gVar4));
        C13508g gVar5 = new C13508g();
        gVar5.mo34796a((C13501f) new C13484b1(this.f30873Y));
        gVar.mo34796a((C13501f) new C13503f1(gVar5));
        C13508g gVar6 = new C13508g();
        gVar6.mo34796a((C13501f) new C13484b1(this.f30874Z));
        gVar.mo34796a((C13501f) new C13503f1(gVar6));
        C13508g gVar7 = new C13508g();
        for (int i3 = 0; i3 < this.f30875a0.length; i3++) {
            C13508g gVar8 = new C13508g();
            byte[][][] a = C13993a.m44140a(this.f30875a0[i3].mo35360a());
            C13508g gVar9 = new C13508g();
            for (int i4 = 0; i4 < a.length; i4++) {
                C13508g gVar10 = new C13508g();
                for (byte[] b1Var : a[i4]) {
                    gVar10.mo34796a((C13501f) new C13484b1(b1Var));
                }
                gVar9.mo34796a((C13501f) new C13503f1(gVar10));
            }
            gVar8.mo34796a((C13501f) new C13503f1(gVar9));
            byte[][][] a2 = C13993a.m44140a(this.f30875a0[i3].mo35361b());
            C13508g gVar11 = new C13508g();
            for (int i5 = 0; i5 < a2.length; i5++) {
                C13508g gVar12 = new C13508g();
                for (byte[] b1Var2 : a2[i5]) {
                    gVar12.mo34796a((C13501f) new C13484b1(b1Var2));
                }
                gVar11.mo34796a((C13501f) new C13503f1(gVar12));
            }
            gVar8.mo34796a((C13501f) new C13503f1(gVar11));
            byte[][] a3 = C13993a.m44138a(this.f30875a0[i3].mo35363d());
            C13508g gVar13 = new C13508g();
            for (byte[] b1Var3 : a3) {
                gVar13.mo34796a((C13501f) new C13484b1(b1Var3));
            }
            gVar8.mo34796a((C13501f) new C13503f1(gVar13));
            gVar8.mo34796a((C13501f) new C13484b1(C13993a.m44136a(this.f30875a0[i3].mo35362c())));
            gVar7.mo34796a((C13501f) new C13503f1(gVar8));
        }
        gVar.mo34796a((C13501f) new C13503f1(gVar7));
        return new C13503f1(gVar);
    }

    public C13975f(short[][] sArr, short[] sArr2, short[][] sArr3, short[] sArr4, int[] iArr, C13992a[] aVarArr) {
        this.f30876c = new C13565l(1);
        this.f30870V = C13993a.m44138a(sArr);
        this.f30871W = C13993a.m44136a(sArr2);
        this.f30872X = C13993a.m44138a(sArr3);
        this.f30873Y = C13993a.m44136a(sArr4);
        this.f30874Z = C13993a.m44135a(iArr);
        this.f30875a0 = aVarArr;
    }
}
