package p602m.p613d.p614a;

import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: m.d.a.w1 */
/* compiled from: IndefiniteLengthInputStream */
class C13654w1 extends C13663z1 {

    /* renamed from: V */
    private int f30365V;

    /* renamed from: W */
    private int f30366W;

    /* renamed from: X */
    private boolean f30367X = false;

    /* renamed from: Y */
    private boolean f30368Y = true;

    C13654w1(InputStream inputStream, int i) throws IOException {
        super(inputStream, i);
        this.f30365V = inputStream.read();
        this.f30366W = inputStream.read();
        if (this.f30366W >= 0) {
            m41949b();
            return;
        }
        throw new EOFException();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public void mo34889b(boolean z) {
        this.f30368Y = z;
        m41949b();
    }

    public int read(byte[] bArr, int i, int i2) throws IOException {
        if (this.f30368Y || i2 < 3) {
            return super.read(bArr, i, i2);
        }
        if (this.f30367X) {
            return -1;
        }
        int read = this.f30380c.read(bArr, i + 2, i2 - 2);
        if (read >= 0) {
            bArr[i] = (byte) this.f30365V;
            bArr[i + 1] = (byte) this.f30366W;
            this.f30365V = this.f30380c.read();
            this.f30366W = this.f30380c.read();
            if (this.f30366W >= 0) {
                return read + 2;
            }
            throw new EOFException();
        }
        throw new EOFException();
    }

    /* renamed from: b */
    private boolean m41949b() {
        if (!this.f30367X && this.f30368Y && this.f30365V == 0 && this.f30366W == 0) {
            this.f30367X = true;
            mo34900a(true);
        }
        return this.f30367X;
    }

    public int read() throws IOException {
        if (m41949b()) {
            return -1;
        }
        int read = this.f30380c.read();
        if (read >= 0) {
            int i = this.f30365V;
            this.f30365V = this.f30366W;
            this.f30366W = read;
            return i;
        }
        throw new EOFException();
    }
}
