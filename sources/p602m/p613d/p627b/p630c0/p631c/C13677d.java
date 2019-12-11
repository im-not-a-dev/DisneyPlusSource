package p602m.p613d.p627b.p630c0.p631c;

import java.util.Vector;
import p602m.p613d.p683g.C14079a;

/* renamed from: m.d.b.c0.c.d */
/* compiled from: Tables1kGCMExponentiator */
public class C13677d implements C13674a {

    /* renamed from: a */
    private Vector f30429a;

    /* renamed from: a */
    public void mo34922a(byte[] bArr) {
        int[] a = C13676c.m42031a(bArr);
        Vector vector = this.f30429a;
        if (vector == null || !C14079a.m44448a(a, (int[]) vector.elementAt(0))) {
            this.f30429a = new Vector(8);
            this.f30429a.addElement(a);
        }
    }

    /* renamed from: a */
    public void mo34921a(long j, byte[] bArr) {
        int[] b = C13676c.m42034b();
        int i = 0;
        while (j > 0) {
            if ((1 & j) != 0) {
                m42037a(i);
                C13676c.m42028a(b, (int[]) this.f30429a.elementAt(i));
            }
            i++;
            j >>>= 1;
        }
        C13676c.m42027a(b, bArr);
    }

    /* renamed from: a */
    private void m42037a(int i) {
        int size = this.f30429a.size();
        if (size <= i) {
            int[] iArr = (int[]) this.f30429a.elementAt(size - 1);
            do {
                iArr = C14079a.m44453a(iArr);
                C13676c.m42028a(iArr, iArr);
                this.f30429a.addElement(iArr);
                size++;
            } while (size <= i);
        }
    }
}
