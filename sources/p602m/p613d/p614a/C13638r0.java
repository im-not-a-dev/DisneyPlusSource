package p602m.p613d.p614a;

import java.io.IOException;
import p602m.p613d.p683g.C14079a;

/* renamed from: m.d.a.r0 */
/* compiled from: DERBMPString */
public class C13638r0 extends C13643t implements C13661z {

    /* renamed from: c */
    private final char[] f30345c;

    C13638r0(char[] cArr) {
        this.f30345c = cArr;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public boolean mo34763a(C13643t tVar) {
        if (!(tVar instanceof C13638r0)) {
            return false;
        }
        return C14079a.m44447a(this.f30345c, ((C13638r0) tVar).f30345c);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: e */
    public int mo34764e() {
        return C13485b2.m41537a(this.f30345c.length * 2) + 1 + (this.f30345c.length * 2);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: f */
    public boolean mo34765f() {
        return false;
    }

    public int hashCode() {
        return C14079a.m44441a(this.f30345c);
    }

    /* renamed from: i */
    public String mo34867i() {
        return new String(this.f30345c);
    }

    public String toString() {
        return mo34867i();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo34762a(C13636r rVar) throws IOException {
        rVar.mo34859a(30);
        rVar.mo34866b(this.f30345c.length * 2);
        int i = 0;
        while (true) {
            char[] cArr = this.f30345c;
            if (i != cArr.length) {
                char c = cArr[i];
                rVar.mo34859a((int) (byte) (c >> 8));
                rVar.mo34859a((int) (byte) c);
                i++;
            } else {
                return;
            }
        }
    }
}
