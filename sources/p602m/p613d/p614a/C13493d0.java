package p602m.p613d.p614a;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

/* renamed from: m.d.a.d0 */
/* compiled from: BERApplicationSpecific */
public class C13493d0 extends C13478a {
    public C13493d0(int i, C13508g gVar) {
        super(true, i, m41571a(gVar));
    }

    /* renamed from: a */
    private static byte[] m41571a(C13508g gVar) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        int i = 0;
        while (i != gVar.mo34794a()) {
            try {
                byteArrayOutputStream.write(((C13589n) gVar.mo34795a(i)).mo34827a("BER"));
                i++;
            } catch (IOException e) {
                StringBuilder sb = new StringBuilder();
                sb.append("malformed object: ");
                sb.append(e);
                throw new C13640s(sb.toString(), e);
            }
        }
        return byteArrayOutputStream.toByteArray();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo34762a(C13636r rVar) throws IOException {
        rVar.mo34860a(this.f30013c ? 96 : 64, this.f30011U);
        rVar.mo34859a(128);
        rVar.mo34864a(this.f30012V);
        rVar.mo34859a(0);
        rVar.mo34859a(0);
    }
}
