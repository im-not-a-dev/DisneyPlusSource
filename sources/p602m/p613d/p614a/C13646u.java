package p602m.p613d.p614a;

import java.io.IOException;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;
import p602m.p613d.p683g.C14079a.C14080a;
import p602m.p613d.p683g.C14085f;

/* renamed from: m.d.a.u */
/* compiled from: ASN1Sequence */
public abstract class C13646u extends C13643t implements C14085f<C13501f> {

    /* renamed from: c */
    protected Vector f30355c = new Vector();

    protected C13646u() {
    }

    /* renamed from: a */
    public static C13646u m41915a(Object obj) {
        if (obj == null || (obj instanceof C13646u)) {
            return (C13646u) obj;
        }
        if (obj instanceof C13649v) {
            return m41915a((Object) ((C13649v) obj).mo34785a());
        }
        if (obj instanceof byte[]) {
            try {
                return m41915a((Object) C13643t.m41897a((byte[]) obj));
            } catch (IOException e) {
                StringBuilder sb = new StringBuilder();
                sb.append("failed to construct sequence from byte[]: ");
                sb.append(e.getMessage());
                throw new IllegalArgumentException(sb.toString());
            }
        } else {
            if (obj instanceof C13501f) {
                C13643t a = ((C13501f) obj).mo34785a();
                if (a instanceof C13646u) {
                    return (C13646u) a;
                }
            }
            StringBuilder sb2 = new StringBuilder();
            sb2.append("unknown object in getInstance: ");
            sb2.append(obj.getClass().getName());
            throw new IllegalArgumentException(sb2.toString());
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: f */
    public boolean mo34765f() {
        return true;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: g */
    public C13643t mo34769g() {
        C13503f1 f1Var = new C13503f1();
        f1Var.f30355c = this.f30355c;
        return f1Var;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: h */
    public C13643t mo34770h() {
        C13639r1 r1Var = new C13639r1();
        r1Var.f30355c = this.f30355c;
        return r1Var;
    }

    public int hashCode() {
        Enumeration i = mo34871i();
        int j = mo34873j();
        while (i.hasMoreElements()) {
            j = (j * 17) ^ m41914a(i).hashCode();
        }
        return j;
    }

    /* renamed from: i */
    public Enumeration mo34871i() {
        return this.f30355c.elements();
    }

    public Iterator<C13501f> iterator() {
        return new C14080a(mo34874k());
    }

    /* renamed from: j */
    public int mo34873j() {
        return this.f30355c.size();
    }

    /* renamed from: k */
    public C13501f[] mo34874k() {
        C13501f[] fVarArr = new C13501f[mo34873j()];
        for (int i = 0; i != mo34873j(); i++) {
            fVarArr[i] = mo34870a(i);
        }
        return fVarArr;
    }

    public String toString() {
        return this.f30355c.toString();
    }

    protected C13646u(C13508g gVar) {
        for (int i = 0; i != gVar.mo34794a(); i++) {
            this.f30355c.addElement(gVar.mo34795a(i));
        }
    }

    /* renamed from: a */
    public C13501f mo34870a(int i) {
        return (C13501f) this.f30355c.elementAt(i);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public boolean mo34763a(C13643t tVar) {
        if (!(tVar instanceof C13646u)) {
            return false;
        }
        C13646u uVar = (C13646u) tVar;
        if (mo34873j() != uVar.mo34873j()) {
            return false;
        }
        Enumeration i = mo34871i();
        Enumeration i2 = uVar.mo34871i();
        while (i.hasMoreElements()) {
            C13501f a = m41914a(i);
            C13501f a2 = m41914a(i2);
            C13643t a3 = a.mo34785a();
            C13643t a4 = a2.mo34785a();
            if (a3 != a4 && !a3.equals(a4)) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: a */
    private C13501f m41914a(Enumeration enumeration) {
        return (C13501f) enumeration.nextElement();
    }
}
