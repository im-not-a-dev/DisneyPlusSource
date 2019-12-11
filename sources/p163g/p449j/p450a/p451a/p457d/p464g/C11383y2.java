package p163g.p449j.p450a.p451a.p457d.p464g;

/* renamed from: g.j.a.a.d.g.y2 */
final class C11383y2 extends C11110f3 {

    /* renamed from: X */
    private final int f26650X;

    /* renamed from: Y */
    private final int f26651Y;

    C11383y2(byte[] bArr, int i, int i2) {
        super(bArr);
        C11342v2.m36530b(i, i + i2, bArr.length);
        this.f26650X = i;
        this.f26651Y = i2;
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public final int mo28515e() {
        return this.f26650X;
    }

    /* renamed from: f */
    public final byte mo28517f(int i) {
        int size = size();
        if (((size - (i + 1)) | i) >= 0) {
            return this.f26197W[this.f26650X + i];
        }
        if (i < 0) {
            StringBuilder sb = new StringBuilder(22);
            sb.append("Index < 0: ");
            sb.append(i);
            throw new ArrayIndexOutOfBoundsException(sb.toString());
        }
        StringBuilder sb2 = new StringBuilder(40);
        sb2.append("Index > length: ");
        sb2.append(i);
        sb2.append(", ");
        sb2.append(size);
        throw new ArrayIndexOutOfBoundsException(sb2.toString());
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: g */
    public final byte mo28518g(int i) {
        return this.f26197W[this.f26650X + i];
    }

    public final int size() {
        return this.f26651Y;
    }
}
