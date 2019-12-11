package p602m.p613d.p662f.p671c.p673b.p675b;

import java.io.IOException;
import p602m.p613d.p614a.C13484b1;
import p602m.p613d.p614a.C13630p;
import p602m.p613d.p614a.p621i2.C13521a;
import p602m.p613d.p614a.p625m2.C13587a;
import p602m.p613d.p662f.p663a.C13974e;
import p602m.p613d.p662f.p664b.p666b.C13990a;
import p602m.p613d.p662f.p671c.p672a.C14037b;
import p602m.p613d.p683g.C14079a;
import p602m.p613d.p683g.C14087h;

/* renamed from: m.d.f.c.b.b.a */
/* compiled from: BCNHPrivateKey */
public class C14049a implements C14037b {

    /* renamed from: c */
    private final C13990a f31057c;

    public C14049a(C13521a aVar) throws IOException {
        this.f31057c = new C13990a(m44354a(C13630p.m41856a((Object) aVar.mo34803f()).mo34797i()));
    }

    /* renamed from: a */
    private static short[] m44354a(byte[] bArr) {
        short[] sArr = new short[(bArr.length / 2)];
        for (int i = 0; i != sArr.length; i++) {
            sArr[i] = C14087h.m44481e(bArr, i * 2);
        }
        return sArr;
    }

    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof C14049a)) {
            return false;
        }
        return C14079a.m44449a(this.f31057c.mo35358b(), ((C14049a) obj).f31057c.mo35358b());
    }

    public final String getAlgorithm() {
        return "NH";
    }

    public byte[] getEncoded() {
        try {
            C13587a aVar = new C13587a(C13974e.f30866f);
            short[] b = this.f31057c.mo35358b();
            byte[] bArr = new byte[(b.length * 2)];
            for (int i = 0; i != b.length; i++) {
                C14087h.m44472a(b[i], bArr, i * 2);
            }
            return new C13521a(aVar, new C13484b1(bArr)).mo34828d();
        } catch (IOException unused) {
            return null;
        }
    }

    public String getFormat() {
        return "PKCS#8";
    }

    public int hashCode() {
        return C14079a.m44460b(this.f31057c.mo35358b());
    }
}
