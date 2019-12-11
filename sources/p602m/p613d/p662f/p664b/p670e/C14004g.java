package p602m.p613d.p662f.p664b.p670e;

import p602m.p613d.p627b.C13708l;
import p602m.p613d.p627b.C13719w;

/* renamed from: m.d.f.b.e.g */
/* compiled from: KeyedHashFunctions */
final class C14004g {

    /* renamed from: a */
    private final C13708l f30964a;

    /* renamed from: b */
    private final int f30965b;

    protected C14004g(C13708l lVar, int i) {
        if (lVar != null) {
            this.f30964a = lVar;
            this.f30965b = i;
            return;
        }
        throw new NullPointerException("digest == null");
    }

    /* renamed from: a */
    private byte[] m44179a(int i, byte[] bArr, byte[] bArr2) {
        byte[] c = C14035y.m44328c((long) i, this.f30965b);
        this.f30964a.mo34972a(c, 0, c.length);
        this.f30964a.mo34972a(bArr, 0, bArr.length);
        this.f30964a.mo34972a(bArr2, 0, bArr2.length);
        int i2 = this.f30965b;
        byte[] bArr3 = new byte[i2];
        C13708l lVar = this.f30964a;
        if (lVar instanceof C13719w) {
            ((C13719w) lVar).mo34978b(bArr3, 0, i2);
        } else {
            lVar.mo34970a(bArr3, 0);
        }
        return bArr3;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public byte[] mo35397b(byte[] bArr, byte[] bArr2) {
        int length = bArr.length;
        int i = this.f30965b;
        if (length != i) {
            throw new IllegalArgumentException("wrong key length");
        } else if (bArr2.length == i * 2) {
            return m44179a(1, bArr, bArr2);
        } else {
            throw new IllegalArgumentException("wrong in length");
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public byte[] mo35398c(byte[] bArr, byte[] bArr2) {
        if (bArr.length != this.f30965b) {
            throw new IllegalArgumentException("wrong key length");
        } else if (bArr2.length == 32) {
            return m44179a(3, bArr, bArr2);
        } else {
            throw new IllegalArgumentException("wrong address length");
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public byte[] mo35396a(byte[] bArr, byte[] bArr2) {
        int length = bArr.length;
        int i = this.f30965b;
        if (length != i) {
            throw new IllegalArgumentException("wrong key length");
        } else if (bArr2.length == i) {
            return m44179a(0, bArr, bArr2);
        } else {
            throw new IllegalArgumentException("wrong in length");
        }
    }
}
