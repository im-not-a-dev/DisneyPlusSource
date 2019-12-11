package p602m.p613d.p662f.p664b.p670e;

/* renamed from: m.d.f.b.e.m */
/* compiled from: WOTSPlusPublicKeyParameters */
final class C14014m {

    /* renamed from: a */
    private final byte[][] f30991a;

    protected C14014m(C14013l lVar, byte[][] bArr) {
        if (lVar == null) {
            throw new NullPointerException("params == null");
        } else if (bArr == null) {
            throw new NullPointerException("publicKey == null");
        } else if (C14035y.m44326b(bArr)) {
            throw new NullPointerException("publicKey byte array == null");
        } else if (bArr.length == lVar.mo35422c()) {
            int i = 0;
            while (i < bArr.length) {
                if (bArr[i].length == lVar.mo35421b()) {
                    i++;
                } else {
                    throw new IllegalArgumentException("wrong publicKey format");
                }
            }
            this.f30991a = C14035y.m44323a(bArr);
        } else {
            throw new IllegalArgumentException("wrong publicKey size");
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public byte[][] mo35424a() {
        return C14035y.m44323a(this.f30991a);
    }
}
