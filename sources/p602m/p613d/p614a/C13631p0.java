package p602m.p613d.p614a;

import java.io.IOException;
import java.io.InputStream;

/* renamed from: m.d.a.p0 */
/* compiled from: ConstructedOctetStream */
class C13631p0 extends InputStream {

    /* renamed from: U */
    private boolean f30340U = true;

    /* renamed from: V */
    private InputStream f30341V;

    /* renamed from: c */
    private final C13658y f30342c;

    C13631p0(C13658y yVar) {
        this.f30342c = yVar;
    }

    public int read(byte[] bArr, int i, int i2) throws IOException {
        int i3 = 0;
        if (this.f30341V == null) {
            if (!this.f30340U) {
                return -1;
            }
            C13633q qVar = (C13633q) this.f30342c.mo34894a();
            if (qVar == null) {
                return -1;
            }
            this.f30340U = false;
            this.f30341V = qVar.mo34786c();
        }
        while (true) {
            int read = this.f30341V.read(bArr, i + i3, i2 - i3);
            if (read >= 0) {
                i3 += read;
                if (i3 == i2) {
                    return i3;
                }
            } else {
                C13633q qVar2 = (C13633q) this.f30342c.mo34894a();
                if (qVar2 == null) {
                    this.f30341V = null;
                    if (i3 < 1) {
                        i3 = -1;
                    }
                    return i3;
                }
                this.f30341V = qVar2.mo34786c();
            }
        }
    }

    public int read() throws IOException {
        if (this.f30341V == null) {
            if (!this.f30340U) {
                return -1;
            }
            C13633q qVar = (C13633q) this.f30342c.mo34894a();
            if (qVar == null) {
                return -1;
            }
            this.f30340U = false;
            this.f30341V = qVar.mo34786c();
        }
        while (true) {
            int read = this.f30341V.read();
            if (read >= 0) {
                return read;
            }
            C13633q qVar2 = (C13633q) this.f30342c.mo34894a();
            if (qVar2 == null) {
                this.f30341V = null;
                return -1;
            }
            this.f30341V = qVar2.mo34786c();
        }
    }
}
