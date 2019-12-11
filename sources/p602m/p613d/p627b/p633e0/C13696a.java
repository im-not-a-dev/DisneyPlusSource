package p602m.p613d.p627b.p633e0;

import java.io.IOException;
import java.io.InputStream;
import p602m.p613d.p627b.C13715s;
import p602m.p613d.p627b.p632d0.C13681b;
import p602m.p613d.p627b.p632d0.C13682c;
import p602m.p613d.p627b.p632d0.C13687h;
import p602m.p613d.p683g.p685l.C14099a;

/* renamed from: m.d.b.e0.a */
/* compiled from: ECIESPublicKeyParser */
public class C13696a implements C13715s {

    /* renamed from: a */
    private C13682c f30457a;

    public C13696a(C13682c cVar) {
        this.f30457a = cVar;
    }

    /* renamed from: a */
    public C13681b mo34952a(InputStream inputStream) throws IOException {
        byte[] bArr;
        int read = inputStream.read();
        if (read != 0) {
            if (read == 2 || read == 3) {
                bArr = new byte[(((this.f30457a.mo34930a().mo35090j() + 7) / 8) + 1)];
            } else if (read == 4 || read == 6 || read == 7) {
                bArr = new byte[((((this.f30457a.mo34930a().mo35090j() + 7) / 8) * 2) + 1)];
            } else {
                StringBuilder sb = new StringBuilder();
                sb.append("Sender's public key has invalid point encoding 0x");
                sb.append(Integer.toString(read, 16));
                throw new IOException(sb.toString());
            }
            bArr[0] = (byte) read;
            C14099a.m44518a(inputStream, bArr, 1, bArr.length - 1);
            return new C13687h(this.f30457a.mo34930a().mo35067a(bArr), this.f30457a);
        }
        throw new IOException("Sender's public key invalid.");
    }
}
