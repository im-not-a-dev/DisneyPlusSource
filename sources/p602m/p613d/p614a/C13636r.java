package p602m.p613d.p614a;

import java.io.IOException;
import java.io.OutputStream;

/* renamed from: m.d.a.r */
/* compiled from: ASN1OutputStream */
public class C13636r {

    /* renamed from: a */
    private OutputStream f30343a;

    /* renamed from: m.d.a.r$a */
    /* compiled from: ASN1OutputStream */
    private class C13637a extends C13636r {

        /* renamed from: b */
        private boolean f30344b = true;

        public C13637a(C13636r rVar, OutputStream outputStream) {
            super(outputStream);
        }

        /* renamed from: a */
        public void mo34859a(int i) throws IOException {
            if (this.f30344b) {
                this.f30344b = false;
            } else {
                C13636r.super.mo34859a(i);
            }
        }
    }

    public C13636r(OutputStream outputStream) {
        this.f30343a = outputStream;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo34859a(int i) throws IOException {
        this.f30343a.write(i);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public void mo34866b(int i) throws IOException {
        if (i > 127) {
            int i2 = i;
            int i3 = 1;
            while (true) {
                i2 >>>= 8;
                if (i2 == 0) {
                    break;
                }
                i3++;
            }
            mo34859a((int) (byte) (i3 | 128));
            for (int i4 = (i3 - 1) * 8; i4 >= 0; i4 -= 8) {
                mo34859a((int) (byte) (i >> i4));
            }
            return;
        }
        mo34859a((int) (byte) i);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo34864a(byte[] bArr) throws IOException {
        this.f30343a.write(bArr);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo34865a(byte[] bArr, int i, int i2) throws IOException {
        this.f30343a.write(bArr, i, i2);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo34862a(int i, byte[] bArr) throws IOException {
        mo34859a(i);
        mo34866b(bArr.length);
        mo34864a(bArr);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public C13636r mo34791b() {
        return new C13635q1(this.f30343a);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo34860a(int i, int i2) throws IOException {
        if (i2 < 31) {
            mo34859a(i | i2);
            return;
        }
        mo34859a(i | 31);
        if (i2 < 128) {
            mo34859a(i2);
            return;
        }
        byte[] bArr = new byte[5];
        int length = bArr.length - 1;
        bArr[length] = (byte) (i2 & 127);
        do {
            i2 >>= 7;
            length--;
            bArr[length] = (byte) ((i2 & 127) | 128);
        } while (i2 > 127);
        mo34865a(bArr, length, bArr.length - length);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo34861a(int i, int i2, byte[] bArr) throws IOException {
        mo34860a(i, i2);
        mo34866b(bArr.length);
        mo34864a(bArr);
    }

    /* renamed from: a */
    public void mo34790a(C13501f fVar) throws IOException {
        if (fVar != null) {
            fVar.mo34785a().mo34762a(this);
            return;
        }
        throw new IOException("null object detected");
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo34863a(C13643t tVar) throws IOException {
        if (tVar != null) {
            tVar.mo34762a((C13636r) new C13637a(this, this.f30343a));
            return;
        }
        throw new IOException("null object detected");
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public C13636r mo34789a() {
        return new C13494d1(this.f30343a);
    }
}
