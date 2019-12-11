package p602m.p613d.p614a;

import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import p602m.p613d.p683g.p685l.C14099a;

/* renamed from: m.d.a.u1 */
/* compiled from: DefiniteLengthInputStream */
class C13648u1 extends C13663z1 {

    /* renamed from: X */
    private static final byte[] f30357X = new byte[0];

    /* renamed from: V */
    private final int f30358V;

    /* renamed from: W */
    private int f30359W;

    C13648u1(InputStream inputStream, int i) {
        super(inputStream, i);
        if (i >= 0) {
            this.f30358V = i;
            this.f30359W = i;
            if (i == 0) {
                mo34900a(true);
                return;
            }
            return;
        }
        throw new IllegalArgumentException("negative lengths not allowed");
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public int mo34876a() {
        return this.f30359W;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public byte[] mo34877b() throws IOException {
        int i = this.f30359W;
        if (i == 0) {
            return f30357X;
        }
        byte[] bArr = new byte[i];
        int a = i - C14099a.m44517a(this.f30380c, bArr);
        this.f30359W = a;
        if (a == 0) {
            mo34900a(true);
            return bArr;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("DEF length ");
        sb.append(this.f30358V);
        sb.append(" object truncated by ");
        sb.append(this.f30359W);
        throw new EOFException(sb.toString());
    }

    public int read() throws IOException {
        if (this.f30359W == 0) {
            return -1;
        }
        int read = this.f30380c.read();
        if (read >= 0) {
            int i = this.f30359W - 1;
            this.f30359W = i;
            if (i == 0) {
                mo34900a(true);
            }
            return read;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("DEF length ");
        sb.append(this.f30358V);
        sb.append(" object truncated by ");
        sb.append(this.f30359W);
        throw new EOFException(sb.toString());
    }

    public int read(byte[] bArr, int i, int i2) throws IOException {
        int i3 = this.f30359W;
        if (i3 == 0) {
            return -1;
        }
        int read = this.f30380c.read(bArr, i, Math.min(i2, i3));
        if (read >= 0) {
            int i4 = this.f30359W - read;
            this.f30359W = i4;
            if (i4 == 0) {
                mo34900a(true);
            }
            return read;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("DEF length ");
        sb.append(this.f30358V);
        sb.append(" object truncated by ");
        sb.append(this.f30359W);
        throw new EOFException(sb.toString());
    }
}
