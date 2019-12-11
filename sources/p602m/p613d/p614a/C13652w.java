package p602m.p613d.p614a;

import java.io.IOException;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;
import p602m.p613d.p683g.C14079a.C14080a;
import p602m.p613d.p683g.C14085f;

/* renamed from: m.d.a.w */
/* compiled from: ASN1Set */
public abstract class C13652w extends C13643t implements C14085f<C13501f> {

    /* renamed from: U */
    private boolean f30362U;

    /* renamed from: c */
    private Vector f30363c;

    protected C13652w() {
        this.f30363c = new Vector();
        this.f30362U = false;
    }

    /* renamed from: a */
    public static C13652w m41932a(C13479a0 a0Var, boolean z) {
        if (z) {
            if (a0Var.mo34773k()) {
                return (C13652w) a0Var.mo34771i();
            }
            throw new IllegalArgumentException("object implicit - explicit expected.");
        } else if (a0Var.mo34773k()) {
            if (a0Var instanceof C13585m0) {
                return new C13527k0((C13501f) a0Var.mo34771i());
            }
            return new C13642s1((C13501f) a0Var.mo34771i());
        } else if (a0Var.mo34771i() instanceof C13652w) {
            return (C13652w) a0Var.mo34771i();
        } else {
            if (a0Var.mo34771i() instanceof C13646u) {
                C13646u uVar = (C13646u) a0Var.mo34771i();
                if (a0Var instanceof C13585m0) {
                    return new C13527k0(uVar.mo34874k());
                }
                return new C13642s1(uVar.mo34874k());
            }
            StringBuilder sb = new StringBuilder();
            sb.append("unknown object in getInstance: ");
            sb.append(a0Var.getClass().getName());
            throw new IllegalArgumentException(sb.toString());
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
        if (this.f30362U) {
            C13516h1 h1Var = new C13516h1();
            h1Var.f30363c = this.f30363c;
            return h1Var;
        }
        Vector vector = new Vector();
        for (int i = 0; i != this.f30363c.size(); i++) {
            vector.addElement(this.f30363c.elementAt(i));
        }
        C13516h1 h1Var2 = new C13516h1();
        h1Var2.f30363c = vector;
        h1Var2.mo34884k();
        return h1Var2;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: h */
    public C13643t mo34770h() {
        C13642s1 s1Var = new C13642s1();
        s1Var.f30363c = this.f30363c;
        return s1Var;
    }

    public int hashCode() {
        Enumeration i = mo34881i();
        int j = mo34883j();
        while (i.hasMoreElements()) {
            j = (j * 17) ^ m41931a(i).hashCode();
        }
        return j;
    }

    /* renamed from: i */
    public Enumeration mo34881i() {
        return this.f30363c.elements();
    }

    public Iterator<C13501f> iterator() {
        return new C14080a(mo34885l());
    }

    /* renamed from: j */
    public int mo34883j() {
        return this.f30363c.size();
    }

    /* access modifiers changed from: protected */
    /*  JADX ERROR: JadxOverflowException in pass: LoopRegionVisitor
        jadx.core.utils.exceptions.JadxOverflowException: LoopRegionVisitor.assignOnlyInLoop endless recursion
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
        	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
        	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:29)
        	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$1(DepthTraversal.java:14)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
        	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
        	at jadx.core.ProcessClass.process(ProcessClass.java:30)
        	at jadx.core.ProcessClass.lambda$processDependencies$0(ProcessClass.java:49)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
        	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:49)
        	at jadx.core.ProcessClass.process(ProcessClass.java:35)
        	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:311)
        	at jadx.api.JavaClass.decompile(JavaClass.java:62)
        	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:217)
        */
    /* renamed from: k */
    public void mo34884k() {
        /*
            r9 = this;
            boolean r0 = r9.f30362U
            if (r0 != 0) goto L_0x005d
            r0 = 1
            r9.f30362U = r0
            java.util.Vector r1 = r9.f30363c
            int r1 = r1.size()
            if (r1 <= r0) goto L_0x005d
            java.util.Vector r1 = r9.f30363c
            int r1 = r1.size()
            int r1 = r1 - r0
            r2 = r1
            r1 = 1
        L_0x0018:
            if (r1 == 0) goto L_0x005d
            java.util.Vector r1 = r9.f30363c
            r3 = 0
            java.lang.Object r1 = r1.elementAt(r3)
            m.d.a.f r1 = (p602m.p613d.p614a.C13501f) r1
            byte[] r1 = r9.m41934a(r1)
            r5 = r1
            r1 = 0
            r4 = 0
        L_0x002a:
            if (r3 == r2) goto L_0x005a
            java.util.Vector r6 = r9.f30363c
            int r7 = r3 + 1
            java.lang.Object r6 = r6.elementAt(r7)
            m.d.a.f r6 = (p602m.p613d.p614a.C13501f) r6
            byte[] r6 = r9.m41934a(r6)
            boolean r8 = r9.m41933a(r5, r6)
            if (r8 == 0) goto L_0x0042
            r5 = r6
            goto L_0x0058
        L_0x0042:
            java.util.Vector r1 = r9.f30363c
            java.lang.Object r1 = r1.elementAt(r3)
            java.util.Vector r4 = r9.f30363c
            java.lang.Object r6 = r4.elementAt(r7)
            r4.setElementAt(r6, r3)
            java.util.Vector r4 = r9.f30363c
            r4.setElementAt(r1, r7)
            r1 = r3
            r4 = 1
        L_0x0058:
            r3 = r7
            goto L_0x002a
        L_0x005a:
            r2 = r1
            r1 = r4
            goto L_0x0018
        L_0x005d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p602m.p613d.p614a.C13652w.mo34884k():void");
    }

    /* renamed from: l */
    public C13501f[] mo34885l() {
        C13501f[] fVarArr = new C13501f[mo34883j()];
        for (int i = 0; i != mo34883j(); i++) {
            fVarArr[i] = mo34880a(i);
        }
        return fVarArr;
    }

    public String toString() {
        return this.f30363c.toString();
    }

    protected C13652w(C13501f fVar) {
        this.f30363c = new Vector();
        this.f30362U = false;
        this.f30363c.addElement(fVar);
    }

    protected C13652w(C13508g gVar, boolean z) {
        this.f30363c = new Vector();
        this.f30362U = false;
        for (int i = 0; i != gVar.mo34794a(); i++) {
            this.f30363c.addElement(gVar.mo34795a(i));
        }
        if (z) {
            mo34884k();
        }
    }

    protected C13652w(C13501f[] fVarArr, boolean z) {
        this.f30363c = new Vector();
        this.f30362U = false;
        for (int i = 0; i != fVarArr.length; i++) {
            this.f30363c.addElement(fVarArr[i]);
        }
        if (z) {
            mo34884k();
        }
    }

    /* renamed from: a */
    public C13501f mo34880a(int i) {
        return (C13501f) this.f30363c.elementAt(i);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public boolean mo34763a(C13643t tVar) {
        if (!(tVar instanceof C13652w)) {
            return false;
        }
        C13652w wVar = (C13652w) tVar;
        if (mo34883j() != wVar.mo34883j()) {
            return false;
        }
        Enumeration i = mo34881i();
        Enumeration i2 = wVar.mo34881i();
        while (i.hasMoreElements()) {
            C13501f a = m41931a(i);
            C13501f a2 = m41931a(i2);
            C13643t a3 = a.mo34785a();
            C13643t a4 = a2.mo34785a();
            if (a3 != a4 && !a3.equals(a4)) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: a */
    private C13501f m41931a(Enumeration enumeration) {
        C13501f fVar = (C13501f) enumeration.nextElement();
        return fVar == null ? C13662z0.f30378c : fVar;
    }

    /* renamed from: a */
    private boolean m41933a(byte[] bArr, byte[] bArr2) {
        int min = Math.min(bArr.length, bArr2.length);
        boolean z = false;
        for (int i = 0; i != min; i++) {
            if (bArr[i] != bArr2[i]) {
                if ((bArr[i] & 255) < (bArr2[i] & 255)) {
                    z = true;
                }
                return z;
            }
        }
        if (min == bArr.length) {
            z = true;
        }
        return z;
    }

    /* renamed from: a */
    private byte[] m41934a(C13501f fVar) {
        try {
            return fVar.mo34785a().mo34827a("DER");
        } catch (IOException unused) {
            throw new IllegalArgumentException("cannot encode object added to SET");
        }
    }
}
