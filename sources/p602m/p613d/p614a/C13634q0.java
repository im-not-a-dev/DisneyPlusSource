package p602m.p613d.p614a;

import java.io.IOException;
import p602m.p613d.p683g.p684k.C14097f;

/* renamed from: m.d.a.q0 */
/* compiled from: DERApplicationSpecific */
public class C13634q0 extends C13478a {
    C13634q0(boolean z, int i, byte[] bArr) {
        super(z, i, bArr);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo34762a(C13636r rVar) throws IOException {
        rVar.mo34861a(this.f30013c ? 96 : 64, this.f30011U, this.f30012V);
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("[");
        if (mo34765f()) {
            stringBuffer.append("CONSTRUCTED ");
        }
        stringBuffer.append("APPLICATION ");
        stringBuffer.append(Integer.toString(mo34767i()));
        stringBuffer.append("]");
        if (this.f30012V != null) {
            stringBuffer.append(" #");
            stringBuffer.append(C14097f.m44510b(this.f30012V));
        } else {
            stringBuffer.append(" #null");
        }
        stringBuffer.append(" ");
        return stringBuffer.toString();
    }
}
