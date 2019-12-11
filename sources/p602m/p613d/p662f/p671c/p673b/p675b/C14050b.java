package p602m.p613d.p662f.p671c.p673b.p675b;

import java.io.IOException;
import p602m.p613d.p614a.p625m2.C13587a;
import p602m.p613d.p614a.p625m2.C13588b;
import p602m.p613d.p662f.p663a.C13974e;
import p602m.p613d.p662f.p664b.p666b.C13991b;
import p602m.p613d.p662f.p671c.p672a.C14038c;
import p602m.p613d.p683g.C14079a;

/* renamed from: m.d.f.c.b.b.b */
/* compiled from: BCNHPublicKey */
public class C14050b implements C14038c {

    /* renamed from: c */
    private final C13991b f31058c;

    public C14050b(C13588b bVar) {
        this.f31058c = new C13991b(bVar.mo34825f().mo34779i());
    }

    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof C14050b)) {
            return false;
        }
        return C14079a.m44446a(this.f31058c.mo35359b(), ((C14050b) obj).f31058c.mo35359b());
    }

    public final String getAlgorithm() {
        return "NH";
    }

    public byte[] getEncoded() {
        try {
            return new C13588b(new C13587a(C13974e.f30866f), this.f31058c.mo35359b()).mo34828d();
        } catch (IOException unused) {
            return null;
        }
    }

    public String getFormat() {
        return "X.509";
    }

    public int hashCode() {
        return C14079a.m44457b(this.f31058c.mo35359b());
    }
}
